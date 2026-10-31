package com.so.revelation.glua.core.mcp

import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.log.LogBus
import com.so.revelation.glua.core.log.LogFilter
import com.so.revelation.glua.core.log.LogLevel
import com.so.revelation.glua.core.log.LogcatFormat
import com.so.revelation.glua.core.lua.gg.GgApiCatalog
import com.so.revelation.glua.core.lua.gg.GgConstants
import com.so.revelation.glua.core.lua.gg.GgEnvironment
import com.so.revelation.glua.core.lua.syntax.CompletionEngine
import com.so.revelation.glua.core.lua.syntax.LuaLexer
import com.so.revelation.glua.core.lua.syntax.LuaTokenKind
import java.io.File

/**
 * MCP 服务的工具注册表与执行引擎。
 *
 * 设计原则：工具层只做参数校验与结果格式化，业务逻辑全部委托给已有模块
 * （[LuaEngine]、[ScriptStore]、[LogBus]、[GgApiCatalog]），
 * 这样 MCP 与 App UI 走同一条代码路径，行为一致。
 *
 * 线程安全：工具可能被并发调用，各执行体自身需保证线程安全。
 * [ScriptStore] 用协程 + IO 调度器，[LogBus] 内部加锁，因此是安全的。
 */
class McpRegistry(
    private val deps: McpDependencies,
) {

    private companion object {
        const val TAG = "McpRegistry"
    }

    /** 依赖注入：把 App 侧的具体实现传进来，core 不反向依赖 app。 */
    interface McpDependencies {
        /** 脚本根目录。 */
        fun scriptsDir(): File

        /** 列出脚本文件。 */
        fun listScripts(): List<File>

        /** 读取文件内容。 */
        fun readScript(file: File): String?

        /** 写入文件内容，返回是否成功。 */
        fun writeScript(file: File, content: String): Boolean

        /** 创建新脚本。 */
        fun createScript(name: String, content: String): File?

        /** 删除脚本。 */
        fun deleteScript(file: File): Boolean

        /** 运行脚本，返回结构与日志。 */
        suspend fun runScript(
            source: String,
            name: String,
            onOutput: (String) -> Unit,
        ): RunOutcome

        /** 中止正在运行的脚本。 */
        fun cancelRun()

        /** 当前是否正在运行。 */
        fun isRunning(): Boolean
    }

    /** 运行结果，供 MCP 序列化。 */
    data class RunOutcome(
        val status: String,
        val output: List<String>,
        val error: String?,
        val elapsedMs: Long,
    )

    val tools: List<McpTool> = listOf(
        scriptListTool(),
        scriptReadTool(),
        scriptWriteTool(),
        scriptCreateTool(),
        scriptDeleteTool(),
        scriptRunTool(),
        scriptCancelTool(),
        luaCheckTool(),
        luaCompleteTool(),
        ggApiListTool(),
        ggApiGetTool(),
        logQueryTool(),
        logClearTool(),
        envInfoTool(),
    )

    private val byName: Map<String, McpTool> = tools.associateBy { it.name }

    fun find(name: String): McpTool? = byName[name]

    /** 执行一次工具调用。异常统一转成 isError 结果，不抛给协议层。 */
    fun call(name: String, params: JsonValue.Obj): McpToolResult {
        val tool = byName[name] ?: return McpToolResult.error("未知工具: $name")
        return try {
            tool.handler(params)
        } catch (e: IllegalArgumentException) {
            GLog.w(TAG, "工具 $name 参数错误: ${e.message}")
            McpToolResult.error("参数错误: ${e.message}")
        } catch (t: Throwable) {
            GLog.e(TAG, "工具 $name 执行失败", t)
            McpToolResult.error("执行失败: ${t.message ?: t::class.java.simpleName}")
        }
    }

    // ================================================================ 脚本文件

    private fun scriptListTool() = McpTool(
        name = "script_list",
        description = "列出脚本目录下的所有 .lua 文件，返回文件名、大小与修改时间。",
        inputSchema = Schema.obj(emptyMap()),
    ) {
        val files = deps.listScripts()
        if (files.isEmpty()) {
            McpToolResult.ok("脚本目录为空。目录: ${deps.scriptsDir().absolutePath}")
        } else {
            val sb = StringBuilder("脚本目录: ${deps.scriptsDir().absolutePath}\n共 ${files.size} 个文件\n\n")
            files.forEach { f ->
                sb.append("- ${f.name}  (${f.length()} 字节)\n")
            }
            McpToolResult.ok(sb.toString())
        }
    }

    private fun scriptReadTool() = McpTool(
        name = "script_read",
        description = "读取指定脚本的完整内容。参数 name 为文件名（含或不含 .lua 后缀均可）。",
        inputSchema = Schema.obj(
            mapOf("name" to Schema.string("脚本文件名，例如 main.lua 或 main")),
            required = listOf("name"),
        ),
    ) { params ->
        val name = Args.strRequired(params, "name")
        val file = resolveScript(name)
            ?: return@McpTool McpToolResult.error("文件不存在: $name")
        val content = deps.readScript(file)
            ?: return@McpTool McpToolResult.error("读取失败: ${file.name}")
        McpToolResult.ok(content)
    }

    private fun scriptWriteTool() = McpTool(
        name = "script_write",
        description = "覆盖写入脚本内容。文件不存在时会创建。适用于修改已有脚本。",
        inputSchema = Schema.obj(
            mapOf(
                "name" to Schema.string("脚本文件名"),
                "content" to Schema.string("完整的 Lua 源码"),
            ),
            required = listOf("name", "content"),
        ),
    ) { params ->
        val name = Args.strRequired(params, "name")
        val content = Args.strRequired(params, "content")
        val file = resolveScript(name) ?: targetScript(name)

        // 写入前做语法预检，把问题直接反馈给 LLM
        val syntaxIssue = quickSyntaxCheck(content)
        val ok = deps.writeScript(file, content)
        if (!ok) {
            McpToolResult.error("写入失败: ${file.name}")
        } else {
            val sb = StringBuilder("已写入 ${file.name}（${content.length} 字符）")
            if (syntaxIssue != null) sb.append("\n\n注意，语法预检发现问题:\n$syntaxIssue")
            McpToolResult.ok(sb.toString())
        }
    }

    private fun scriptCreateTool() = McpTool(
        name = "script_create",
        description = "新建一个脚本文件。同名文件已存在时会自动追加序号，不会覆盖。",
        inputSchema = Schema.obj(
            mapOf(
                "name" to Schema.string("文件名，会自动补 .lua 后缀"),
                "content" to Schema.string("初始内容，可省略", default = ""),
            ),
            required = listOf("name"),
        ),
    ) { params ->
        val name = Args.strRequired(params, "name")
        val content = Args.str(params, "content", "") ?: ""
        val created = deps.createScript(name, content)
            ?: return@McpTool McpToolResult.error("创建失败: $name")
        McpToolResult.ok("已创建 ${created.name}\n路径: ${created.absolutePath}")
    }

    private fun scriptDeleteTool() = McpTool(
        name = "script_delete",
        description = "删除指定脚本文件。此操作不可撤销。",
        inputSchema = Schema.obj(
            mapOf("name" to Schema.string("要删除的脚本文件名")),
            required = listOf("name"),
        ),
    ) { params ->
        val name = Args.strRequired(params, "name")
        val file = resolveScript(name)
            ?: return@McpTool McpToolResult.error("文件不存在: $name")
        if (deps.deleteScript(file)) {
            McpToolResult.ok("已删除 ${file.name}")
        } else {
            McpToolResult.error("删除失败: ${file.name}")
        }
    }

    // ================================================================ 运行

    private fun scriptRunTool() = McpTool(
        name = "script_run",
        description = "运行 Lua 脚本并返回输出。可以按文件名运行，也可以直接传 source " +
            "运行一段内联代码（此时忽略 name）。脚本在后台线程执行，有超时保护。",
        inputSchema = Schema.obj(
            mapOf(
                "name" to Schema.string("要运行的脚本文件名，与 source 二选一"),
                "source" to Schema.string("内联 Lua 源码，与 name 二选一"),
                "timeoutMs" to Schema.integer("超时毫秒，默认 30000，最大 120000", default = 30000, minimum = 1000),
            ),
        ),
    ) { params ->
        if (deps.isRunning()) {
            return@McpTool McpToolResult.error("已有脚本在运行，请先 script_cancel 或等待完成")
        }

        val sourceOpt = Args.str(params, "source")
        val nameOpt = Args.str(params, "name")

        val (source, chunkName) = when {
            sourceOpt != null -> sourceOpt to "=inline"
            nameOpt != null -> {
                val file = resolveScript(nameOpt)
                    ?: return@McpTool McpToolResult.error("文件不存在: $nameOpt")
                val content = deps.readScript(file)
                    ?: return@McpTool McpToolResult.error("读取失败: ${file.name}")
                content to file.name
            }
            else -> return@McpTool McpToolResult.error("必须提供 name 或 source")
        }

        // 同步阻塞等待结果。MCP 协议是请求-响应模型，必须返回最终结果。
        val outcome = kotlinx.coroutines.runBlocking {
            val d = kotlinx.coroutines.withTimeoutOrNull(
                Args.int(params, "timeoutMs", 30000).toLong().coerceIn(1000L, 120000L)
            ) {
                val outputs = mutableListOf<String>()
                val r = deps.runScript(source, chunkName) { outputs += it }
                r.copy(output = outputs)
            }
            d
        }

        if (outcome == null) {
            deps.cancelRun()
            McpToolResult.error("执行超时，已请求中止")
        } else {
            buildRunResult(outcome, chunkName)
        }
    }

    private fun buildRunResult(outcome: RunOutcome, chunkName: String): McpToolResult {
        val sb = StringBuilder()
        sb.append("脚本: $chunkName\n")
        sb.append("状态: ${outcome.status}\n")
        if (outcome.elapsedMs > 0) sb.append("耗时: ${outcome.elapsedMs} ms\n")

        if (outcome.output.isNotEmpty()) {
            sb.append("\n--- 输出 (${outcome.output.size} 行) ---\n")
            outcome.output.forEach { sb.append(it).append('\n') }
        } else {
            sb.append("\n(无输出)\n")
        }

        outcome.error?.let {
            sb.append("\n--- 错误 ---\n").append(it).append('\n')
        }

        return if (outcome.error != null || outcome.status == "error") {
            McpToolResult(sb.toString(), true)
        } else {
            McpToolResult.ok(sb.toString())
        }
    }

    private fun scriptCancelTool() = McpTool(
        name = "script_cancel",
        description = "请求中止正在运行的脚本。LuaJ 不支持指令级中断，" +
            "死循环脚本需要等到语句边界才响应。",
        inputSchema = Schema.obj(emptyMap()),
    ) {
        if (!deps.isRunning()) {
            McpToolResult.ok("当前没有正在运行的脚本")
        } else {
            deps.cancelRun()
            McpToolResult.ok("已发出中止请求")
        }
    }

    // ================================================================ 分析

    private fun luaCheckTool() = McpTool(
        name = "lua_check",
        description = "检查 Lua 代码的语法问题，不执行。返回词法分析结果、括号平衡、" +
            "未知的 gg.* 引用等静态问题。修改代码后建议先调用此工具。",
        inputSchema = Schema.obj(
            mapOf(
                "source" to Schema.string("要检查的 Lua 源码"),
                "name" to Schema.string("脚本名，仅用于结果标注"),
            ),
            required = listOf("source"),
        ),
    ) { params ->
        val source = Args.strRequired(params, "source")
        val name = Args.str(params, "name", "<inline>") ?: "<inline>"

        val sb = StringBuilder("检查: $name\n")

        // 1) 词法分析统计
        val ggFuncs = GgApiCatalog.functions.map { it.name }.toSet()
        val tokens = LuaLexer.tokenize(source, ggFuncs, GgConstants.NUMERIC.keys)
        val byKind = tokens.groupingBy { it.kind }.eachCount()
        sb.append("词法: ${tokens.size} tokens — ")
        sb.append(
            byKind.entries.filter { it.key != LuaTokenKind.PLAIN }
                .joinToString(", ") { "${it.key}=${it.value}" }
        )
        sb.append('\n')

        // 2) 结构检查
        val issues = mutableListOf<String>()
        quickSyntaxCheck(source)?.let { issues += it }
        auditGgRefs(source)?.let { issues += it }

        if (issues.isEmpty()) {
            sb.append("静态检查: 通过")
        } else {
            sb.append("静态检查: 发现 ${issues.size} 个问题\n")
            issues.forEach { sb.append("  - ").append(it).append('\n') }
        }
        McpToolResult.ok(sb.toString().trimEnd())
    }

    private fun luaCompleteTool() = McpTool(
        name = "lua_complete",
        description = "在指定光标位置获取代码补全建议。用于补全 gg.* 函数名、常量、库函数与局部变量。",
        inputSchema = Schema.obj(
            mapOf(
                "source" to Schema.string("完整源码"),
                "cursor" to Schema.integer("光标字符偏移量；省略则用源码末尾"),
            ),
            required = listOf("source"),
        ),
    ) { params ->
        val source = Args.strRequired(params, "source")
        val cursor = Args.int(params, "cursor", source.length).coerceIn(0, source.length)
        val items = CompletionEngine.complete(source, cursor)

        if (items.isEmpty()) {
            McpToolResult.ok("该位置没有补全建议")
        } else {
            val sb = StringBuilder("补全建议 (${items.size}):\n")
            items.take(50).forEach { item ->
                sb.append("- ${item.label}")
                if (item.detail.isNotEmpty()) sb.append("  — ${item.detail}")
                if (!item.available) sb.append("  [不可用: ${item.unavailableReason}]")
                sb.append('\n')
            }
            if (items.size > 50) sb.append("... 还有 ${items.size - 50} 项\n")
            McpToolResult.ok(sb.toString())
        }
    }

    // ================================================================ gg API

    private fun ggApiListTool() = McpTool(
        name = "gg_api_list",
        description = "列出 GameGuardian Lua API 的全部函数与常量。" +
            "可只列出当前环境可用的，或按关键字过滤。",
        inputSchema = Schema.obj(
            mapOf(
                "keyword" to Schema.string("按名称过滤，不区分大小写"),
                "availableOnly" to Schema.bool("只列当前环境可用的函数", default = false),
                "includeConstants" to Schema.bool("是否包含常量", default = false),
            ),
        ),
    ) { params ->
        val keyword = Args.str(params, "keyword", "") ?: ""
        val availableOnly = Args.bool(params, "availableOnly", false)
        val includeConstants = Args.bool(params, "includeConstants", false)

        val funcs = GgApiCatalog.functions
            .filter { keyword.isEmpty() || it.name.contains(keyword, ignoreCase = true) }
            .filter { !availableOnly || GgEnvironment.availabilityOf(it.name).available }

        val sb = StringBuilder()
        sb.append("gg.* 函数 ${funcs.size} 个")
        if (availableOnly) sb.append("（仅当前环境可用）")
        sb.append("\n\n")

        funcs.forEach { fn ->
            val avail = GgEnvironment.availabilityOf(fn.name)
            sb.append("gg.${fn.name}(")
            sb.append(fn.params.joinToString(", ") { it.display() })
            sb.append(") -> ${fn.returns}")
            if (!avail.available) sb.append("  [需 root]")
            sb.append('\n')
        }

        if (includeConstants) {
            val consts = GgConstants.NUMERIC.entries
                .filter { keyword.isEmpty() || it.key.contains(keyword, ignoreCase = true) }
            sb.append("\n常量 ${consts.size} 个:\n")
            consts.forEach { (k, v) -> sb.append("  gg.$k = $v\n") }
        }

        McpToolResult.ok(sb.toString())
    }

    private fun ggApiGetTool() = McpTool(
        name = "gg_api_get",
        description = "获取单个 gg.* 函数的完整文档：签名、参数说明、返回值、示例代码。",
        inputSchema = Schema.obj(
            mapOf("name" to Schema.string("函数名，不含 gg. 前缀，例如 searchNumber")),
            required = listOf("name"),
        ),
    ) { params ->
        val name = Args.strRequired(params, "name").removePrefix("gg.")
        val fn = GgApiCatalog.findFunction(name)
            ?: return@McpTool McpToolResult.error("未知函数: gg.$name")

        val avail = GgEnvironment.availabilityOf(name)
        val sb = StringBuilder()
        sb.append("gg.${fn.name}\n")
        sb.append("签名: ${fn.returns} ${fn.signature}\n")
        sb.append("可用性: ")
        if (avail.available) sb.append("可用\n") else sb.append("不可用 — ${avail.reason}\n")

        if (fn.description.isNotEmpty()) sb.append("\n说明:\n${fn.description}\n")
        if (fn.paramDescription.isNotEmpty()) sb.append("\n参数:\n${fn.paramDescription}\n")
        if (fn.returnDescription.isNotEmpty()) sb.append("\n返回值:\n${fn.returnDescription}\n")
        if (fn.example.isNotEmpty()) sb.append("\n示例:\n```lua\n${fn.example}\n```\n")

        McpToolResult.ok(sb.toString())
    }

    // ================================================================ 日志

    private fun logQueryTool() = McpTool(
        name = "log_query",
        description = "查询应用日志（类似 logcat）。可按级别、TAG、关键字过滤，用于诊断脚本问题。",
        inputSchema = Schema.obj(
            mapOf(
                "minLevel" to Schema.string(
                    "最低级别: V/D/I/W/E/A",
                    enum = listOf("V", "D", "I", "W", "E", "A"),
                    default = "V",
                ),
                "tag" to Schema.string("TAG 子串，不区分大小写"),
                "text" to Schema.string("消息体子串"),
                "limit" to Schema.integer("最多返回条数，默认 100", default = 100, minimum = 1),
            ),
        ),
    ) { params ->
        val levelChar = Args.str(params, "minLevel", "V") ?: "V"
        val tag = Args.str(params, "tag", "") ?: ""
        val text = Args.str(params, "text", "") ?: ""
        val limit = Args.int(params, "limit", 100).coerceIn(1, 2000)

        val filter = LogFilter(
            minLevel = LogLevel.fromLetter(levelChar.firstOrNull() ?: 'V'),
            tagQuery = tag,
            textQuery = text,
        )
        val entries = LogBus.snapshot(filter)
        if (entries.isEmpty()) {
            return@McpTool McpToolResult.ok("没有符合条件日志")
        }
        val tail = entries.takeLast(limit)
        val sb = StringBuilder("共 ${entries.size} 条，显示最近 ${tail.size} 条\n\n")
        tail.forEach { sb.append(LogcatFormat.exportLine(it)).append('\n') }
        McpToolResult.ok(sb.toString())
    }

    private fun logClearTool() = McpTool(
        name = "log_clear",
        description = "清空日志缓冲区。执行新脚本前清空可以更容易看清本次输出。",
        inputSchema = Schema.obj(emptyMap()),
    ) {
        val before = LogBus.size()
        LogBus.clear()
        McpToolResult.ok("已清空 $before 条日志")
    }

    // ================================================================ 环境

    private fun envInfoTool() = McpTool(
        name = "env_info",
        description = "获取运行环境信息：root 状态、内存类 API 是否可用、脚本目录、日志缓冲用量。",
        inputSchema = Schema.obj(emptyMap()),
    ) {
        val snap = GgEnvironment.snapshot()
        val sb = StringBuilder()
        sb.append("root: ${if (snap.rooted) "有" else "无"}")
        snap.rootMethod?.let { sb.append("（$it）") }
        sb.append('\n')
        sb.append("内存类 gg API: ${if (snap.rooted) "可用" else "不可用"}\n")
        sb.append("悬浮窗权限: ${if (snap.overlayGranted) "已授予" else "未授予"}\n")
        sb.append("脚本目录: ${deps.scriptsDir().absolutePath}\n")
        sb.append("日志缓冲: ${LogBus.size()} / ${LogBus.DEFAULT_CAPACITY}\n")
        sb.append("gg API: ${GgApiCatalog.functions.size} 函数 / ${GgConstants.NUMERIC.size} 常量\n")
        sb.append("正在运行: ${deps.isRunning()}\n")
        McpToolResult.ok(sb.toString())
    }

    // ================================================================ 辅助

    /** 在脚本目录里查找文件，自动补 .lua 后缀。 */
    private fun resolveScript(name: String): File? {
        val dir = deps.scriptsDir()
        val candidates = listOf(name, "$name.lua").map { File(dir, it) }
        return candidates.firstOrNull { it.exists() && it.isFile }
    }

    /** 目标文件（不要求存在）。 */
    private fun targetScript(name: String): File {
        val dir = deps.scriptsDir()
        dir.mkdirs()
        val fileName = if (name.endsWith(".lua", ignoreCase = true)) name else "$name.lua"
        return File(dir, fileName)
    }

    /** 粗略的语法检查：块关键字平衡。 */
    private fun quickSyntaxCheck(source: String): String? {
        val stripped = stripForAudit(source)
        val open = Regex("""\b(function|if|for|while|do)\b""").findAll(stripped).count()
        val close = Regex("""\bend\b""").findAll(stripped).count()
        return if (open > close) {
            "块开始关键字 $open 个，end 只有 $close 个，可能缺少 end"
        } else null
    }

    /** 检查 gg.* 引用是否存在。 */
    private fun auditGgRefs(source: String): String? {
        val known = GgApiCatalog.functions.map { it.name }.toSet()
        val consts = GgConstants.NUMERIC.keys
        val unknown = Regex("""\bgg\.(\w+)""").findAll(stripForAudit(source))
            .map { it.groupValues[1] }
            .filter { it !in known && it !in consts &&
                it !in setOf("VERSION", "VERSION_INT", "BUILD", "PACKAGE", "ANDROID_SDK_INT") }
            .distinct()
            .toList()
        return if (unknown.isEmpty()) null
        else "未知的 gg 引用: ${unknown.joinToString { "gg.$it" }}"
    }

    private fun stripForAudit(s: String): String =
        s.replace(Regex("""--\[\[.*?]]""", RegexOption.DOT_MATCHES_ALL), " ")
            .replace(Regex("""--[^\n]*"""), " ")
            .replace(Regex("""\[\[.*?]]""", RegexOption.DOT_MATCHES_ALL), " ")
            .replace(Regex("\"([^\"\\\\]|\\\\.)*\""), " ")
            .replace(Regex("'([^'\\\\]|\\\\.)*'"), " ")
}
