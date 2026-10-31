package com.so.revelation.glua.core.lua.gg

import com.so.revelation.glua.core.log.GLog
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.concurrent.atomic.AtomicLong

/**
 * `gg.*` 函数的实际实现。
 *
 * 分工原则：
 * - **不依赖内存/root 的函数**（提示框、编码、文件、列表、变量保存）→ 真正实现
 * - **依赖目标进程内存的函数**（搜索、读写、冻结、指针）→ 在无 root 时
 *   返回错误字符串，有 root 时返回"尚未接入内存引擎"
 * - **依赖 GG 宿主 UI 的函数**（tab、悬浮按钮）→ 返回错误字符串
 *
 * 关键约束：**任何函数都不抛异常**。GameGuardian 的 API 约定是
 * "返回 true 或带错误的字符串"，脚本通常写 `local ok = gg.foo()` 而不做 pcall。
 * 抛异常会让整个脚本中断，因此这里一律返回字符串。
 */
class GgRuntime(
    private val filesDir: File,
    private val cacheDir: File,
    private val externalDir: File?,
    /** 由 UI 层注入的交互回调。独立运行时可全为空实现。 */
    private val ui: GgUiHost = GgUiHost.Noop,
    /**
     * 内存引擎。接入后 gg.* 的内存函数才真正可用。
     * 为 null 时（无 root 或未初始化）这些函数返回错误字符串。
     */
    private val memoryEngine: com.so.revelation.glua.core.lua.gg.memory.GgMemoryEngine? = null,
) {

    private companion object {
        const val TAG = "GgRuntime"
        val VERSION = "96.0"
        const val VERSION_INT = 96
        const val BUILD = 15993
    }

    // ------------------------------------------------------------ 状态

    /** 搜索结果的模拟存储。真实实现需接入内存引擎。 */
    private val savedList = mutableListOf<Map<String, Any?>>()

    /** 变量保存目录。 */
    private val varDir: File by lazy {
        File(filesDir, "gg_vars").also { it.mkdirs() }
    }

    /** 当前速度倍率（unrandomizer/setSpeed 用）。 */
    private var speed = 1.0

    /** 未随机化的基准值。 */
    private var unrandomSeed: Long = 0

    private val requestCount = AtomicLong(0)

    /**
     * 已注册的函数名 -> 实现。
     *
     * 用 lazy 而非直接初始化：lambda 内部会访问 [savedList]、[varDir]、[speed] 等实例成员，
     * 直接初始化会在构造期捕获尚未就绪的字段。
     */
    private val impls: Map<String, (List<Any?>) -> Any?> by lazy {
        buildMap {
        // ---------------- 对话框与提示（纯 UI，无 root 可用）
        put("alert") { a -> ui.alert(str(a, 0), str(a, 1), strOrNull(a, 2), strOrNull(a, 3)) }
        put("choice") { a -> ui.choice(list(a, 0), strOrNull(a, 1), strOrNull(a, 2)) }
        put("multiChoice") { a -> ui.multiChoice(list(a, 0), list(a, 1), strOrNull(a, 2)) }
        put("prompt") { a -> ui.prompt(list(a, 0), list(a, 1), list(a, 2)) }
        put("toast") { a -> ui.toast(str(a, 0), bool(a, 1)); true }

        // ---------------- 文本与编码（纯本地）
        put("bytes") { a -> Encode.bytes(str(a, 0), str(a, 1, "UTF-8")) }
        put("copyText") { a -> ui.copyText(str(a, 0)); true }
        put("numberFromLocale") { a -> Locale2.fromLocale(str(a, 0)) }
        put("numberToLocale") { a -> Locale2.toLocale(str(a, 0)) }
        put("getLocale") { a -> Locale.getDefault().toString() }

        // ---------------- 文件（纯本地）
        put("getFile") { _ -> ui.currentScriptPath() ?: "" }
        put("getLine") { _ -> ui.currentLine() }
        put("saveVariable") { a -> SaveVar.save(a[0], str(a, 1), varDir) }
        put("require") { a -> Version.require(strOrNull(a, 0), int(a, 1)) }
        put("sleep") { a -> sleepImpl(int(a, 0)) }

        // ---------------- 结果集（内存引擎未接入时返回空/错误）
        put("clearResults") { _ -> clearResultsImpl() }
        put("getResultsCount") { _ -> 0L }
        put("getResults") { _ -> emptyList<Any?>() }
        put("getSelectedResults") { _ -> emptyList<Any?>() }
        put("loadResults") { _ -> notSupported("loadResults", "结果集导入") }
        put("removeResults") { _ -> notSupported("removeResults", "结果集删除") }

        // ---------------- 内存搜索（需要 root + 内存引擎）
        put("searchNumber") { a -> memoryOp("searchNumber", a) }
        put("searchAddress") { a -> memoryOp("searchAddress", a) }
        put("searchFuzzy") { a -> memoryOp("searchFuzzy", a) }
        put("searchPointer") { a -> memoryOp("searchPointer", a) }
        put("refineNumber") { a -> memoryOp("refineNumber", a) }
        put("refineAddress") { a -> memoryOp("refineAddress", a) }
        put("startFuzzy") { a -> memoryOp("startFuzzy", a) }
        put("getValues") { a -> memoryOp("getValues", a) }
        put("getValuesRange") { a -> memoryOp("getValuesRange", a) }
        put("setValues") { a -> memoryOp("setValues", a) }
        put("editAll") { a -> memoryOp("editAll", a) }
        put("copyMemory") { a -> memoryOp("copyMemory", a) }
        put("dumpMemory") { a -> memoryOp("dumpMemory", a) }
        put("allocatePage") { a -> memoryOp("allocatePage", a) }
        put("disasm") { a -> memoryOp("disasm", a) }
        put("getRanges") { a -> memoryOp("getRanges", a) }
        put("getRangesList") { a -> memoryOp("getRangesList", a) }
        put("setRanges") { a -> memoryOp("setRanges", a) }
        put("gotoAddress") { a -> memoryOp("gotoAddress", a) }
        put("getTargetInfo") { a -> memoryOp("getTargetInfo", a) }
        put("getTargetPackage") { a -> memoryOp("getTargetPackage", a) }
        put("getSpeed") { _ -> speed }
        put("setSpeed") { a -> setSpeedImpl(double(a, 0)) }
        put("unrandomizer") { a -> unrandomizerImpl(a) }
        put("timeJump") { a -> memoryOp("timeJump", a) }
        put("getSelectedElements") { _ -> emptyList<Any?>() }

        // ---------------- 进程控制（需要 root）
        put("processPause") { _ -> processOp("processPause") }
        put("processResume") { _ -> processOp("processResume") }
        put("processToggle") { _ -> processOp("processToggle") }
        put("processKill") { _ -> processOp("processKill") }
        put("isProcessPaused") { _ -> false }

        // ---------------- 宿主 UI（独立运行不可用）
        put("showUiButton") { _ -> hostOp("showUiButton") }
        put("hideUiButton") { _ -> hostOp("hideUiButton") }
        put("isClickedUiButton") { _ -> false }
        put("setVisible") { a -> hostOp("setVisible") }
        put("isVisible") { _ -> ui.isPanelVisible() }
        put("getActiveTab") { _ -> -1 }
        put("skipRestoreState") { _ -> true }

        // ---------------- 列表（本地存储，可真正工作）
        put("addListItems") { a -> addListItemsImpl(a) }
        put("removeListItems") { a -> removeListItemsImpl(a) }
        put("clearList") { _ -> savedList.clear(); true }
        put("getListItems") { _ -> savedList.toList() }
        put("getSelectedListItems") { _ -> emptyList<Any?>() }
        put("saveList") { a -> saveListImpl(str(a, 0), int(a, 1)) }
        put("loadList") { a -> loadListImpl(str(a, 0), int(a, 1)) }

        // ---------------- 网络与包信息
        put("makeRequest") { a -> Http.request(str(a, 0), map(a, 1), strOrNull(a, 2)) }
        put("isPackageInstalled") { a -> ui.isPackageInstalled(str(a, 0)) }
    } }

    // ------------------------------------------------------------ 入口

    /**
     * 调用一个 gg 函数。
     *
     * @return Lua 侧期望的返回值：成功多为 true 或数据，失败为错误字符串
     */
    fun call(name: String, args: List<Any?>): Any? {
        val fn = impls[name]
            ?: return "错误: 未知的 gg 函数 '$name'"

        // 环境门控：不可用的函数直接返回错误，绝不抛异常
        val avail = GgEnvironment.availabilityOf(name)
        if (!avail.available) {
            GLog.w(TAG, "gg.$name 不可用: ${avail.reason}")
            return "错误: ${avail.reason}"
        }

        return try {
            fn(args)
        } catch (t: Throwable) {
            // 兜底：任何实现异常都转成错误字符串，保证脚本继续跑
            GLog.e(TAG, "gg.$name 执行异常", t)
            "错误: gg.$name 执行失败 - ${t.message ?: t::class.java.simpleName}"
        }
    }

    /** 全部已知函数名，用于自检与提示。 */
    fun allFunctionNames(): Set<String> = impls.keys

    /** 常量表，供 Lua 环境注入。 */
    fun constants(): Map<String, Any> = GgConstants.ALL

    // ------------------------------------------------------------ 具体实现

    private fun clearResultsImpl(): Any {
        savedList.clear()
        return true
    }

    /**
     * 内存类函数的统一分发。
     *
     * 走到这里说明 [GgEnvironment] 判定可用（即有 root）。
     * 如果引擎已接入则执行真实操作，否则明确告知未接入。
     */
    private fun memoryOp(name: String, args: List<Any?> = emptyList()): Any {
        val engine = memoryEngine
            ?: return "错误: gg.$name 已通过 root 检测，但内存引擎尚未连接"

        if (!engine.isReady) {
            return "错误: gg.$name 需要 daemon 连接，当前未建立"
        }

        return try {
            when (name) {
                "searchNumber", "searchAddress" -> {
                    val text = str(args, 0).ifEmpty { return "错误: $name 需要搜索内容" }
                    val type = int(args, 1, 127)
                    val bytes = text.toByteArray(Charsets.UTF_8)
                    engine.searchMask(
                        memoryFrom = longOrNull(args, 3) ?: 0L,
                        memoryTo = longOrNull(args, 4) ?: -1L,
                        flags = type,
                        mask = bytes,
                        prefix = ByteArray(0),
                    ).fold({ true }, { "错误: $name 失败 - ${it.message}" })
                }

                "searchFuzzy", "startFuzzy" -> {
                    val type = int(args, 0, 127)
                    engine.fuzzyInit(
                        type = type,
                        memoryFrom = longOrNull(args, 1) ?: 0L,
                        memoryTo = longOrNull(args, 2) ?: -1L,
                    ).fold({ true }, { "错误: $name 失败 - ${it.message}" })
                }

                "refineNumber", "refineAddress" -> {
                    val diff = str(args, 0).ifEmpty { "0" }
                    val type = int(args, 1, 127)
                    val sign = int(args, 2, 536870912)
                    engine.fuzzyRefine(diff, sign, type)
                        .fold({ true }, { "错误: $name 失败 - ${it.message}" })
                }

                "getResults" -> {
                    val max = int(args, 0, 100)
                    val skip = int(args, 1, 0)
                    engine.getResults(max, skip).fold(
                        { list -> list.map { mapOf("address" to it.address, "value" to it.value, "flags" to it.flags) } },
                        { "错误: getResults 失败 - ${it.message}" },
                    )
                }

                "getResultsCount" -> engine.getResultsCount()
                    .fold({ it }, { "错误: 获取数量失败 - ${it.message}" })

                "clearResults" -> engine.cancel()
                    .fold({ true }, { "错误: clearResults 失败 - ${it.message}" })

                "getValues" -> {
                    val addrs = extractAddresses(args[0])
                    if (addrs.first.isEmpty()) "错误: getValues 需要包含 address 的 table"
                    else engine.readMemory(addrs.first, addrs.second).fold(
                        { m -> m.map { (a, v) -> mapOf("address" to a, "value" to v) } },
                        { "错误: getValues 失败 - ${it.message}" },
                    )
                }

                "setValues", "editAll" -> {
                    val entries = extractEntries(args[0])
                    if (entries.isEmpty()) "错误: $name 需要包含 address 与 value 的 table"
                    else engine.writeMemory(entries).fold(
                        { true }, { "错误: $name 失败 - ${it.message}" },
                    )
                }

                "copyMemory" -> engine.copyMemory(
                    longOrNull(args, 0) ?: 0L,
                    longOrNull(args, 1) ?: 0L,
                    int(args, 2, 0),
                ).fold({ true }, { "错误: copyMemory 失败 - ${it.message}" })

                "allocatePage" -> engine.allocatePage(
                    int(args, 0, 6),
                    longOrNull(args, 1) ?: 0L,
                ).fold({ true }, { "错误: allocatePage 失败 - ${it.message}" })

                "setSpeed" -> engine.setSpeed(double(args, 0, 1.0))
                    .fold({ true }, { "错误: setSpeed 失败 - ${it.message}" })

                "timeJump" -> engine.timeJump(str(args, 0))
                    .fold({ true }, { "错误: timeJump 失败 - ${it.message}" })

                "getRanges", "getRangesList" -> engine.getRegions().fold(
                    { raw -> "已获取区域数据 ${raw.size} 字节（结构解析待协议文档）" },
                    { "错误: getRanges 失败 - ${it.message}" },
                )

                "getTargetPackage" -> ui.currentScriptPath() ?: ""

                // 其余内存类函数：命令已定义但需要 daemon 侧文档才能精确组装参数
                else -> "错误: gg.$name 的命令已定义（cmd 表见 GgMemoryEngine），" +
                    "但参数组装需要 daemon 协议文档，暂未开放"
            }
        } catch (t: Throwable) {
            GLog.e(TAG, "gg.$name 内存操作异常", t)
            "错误: gg.$name 执行失败 - ${t.message ?: t::class.java.simpleName}"
        }
    }

    /** 从 Lua table 提取地址数组与类型数组。 */
    private fun extractAddresses(v: Any?): Pair<LongArray, IntArray> {
        val list = v as? List<*> ?: return LongArray(0) to IntArray(0)
        val addrs = ArrayList<Long>()
        val flags = ArrayList<Int>()
        for (item in list) {
            @Suppress("UNCHECKED_CAST")
            val m = item as? Map<String, Any?> ?: continue
            val a = (m["address"] as? Number)?.toLong() ?: continue
            addrs.add(a)
            flags.add((m["flags"] as? Number)?.toInt() ?: 4)
        }
        return addrs.toLongArray() to flags.toIntArray()
    }

    /** 从 Lua table 提取写入项。 */
    private fun extractEntries(v: Any?): List<com.so.revelation.glua.core.lua.gg.memory.GgMemoryEngine.MemoryEntry> {
        val list = v as? List<*> ?: return emptyList()
        return list.mapNotNull { item ->
            @Suppress("UNCHECKED_CAST")
            val m = item as? Map<String, Any?> ?: return@mapNotNull null
            val a = (m["address"] as? Number)?.toLong() ?: return@mapNotNull null
            val val0 = (m["value"] as? Number)?.toLong() ?: return@mapNotNull null
            val f = (m["flags"] as? Number)?.toInt() ?: 4
            com.so.revelation.glua.core.lua.gg.memory.GgMemoryEngine.MemoryEntry(a, val0, f)
        }
    }

    private fun processOp(name: String): Any =
        "错误: gg.$name 需要附加到目标进程，当前未接入进程控制引擎"

    private fun hostOp(name: String): Any =
        "错误: gg.$name 需要 GameGuardian 宿主环境"

    private fun notSupported(name: String, what: String): Any =
        "错误: gg.$name（$what）尚未实现"

    /**
     * gg.sleep：暂停当前线程指定毫秒。
     *
     * 这是少数在无 root 下也应正常工作的函数——脚本常用来做节流。
     * 上限 60 秒，防止脚本误传超大值把线程永久挂住。
     */
    private fun sleepImpl(ms: Int): Any {
        if (ms <= 0) return true
        val capped = ms.coerceAtMost(60_000)
        if (capped != ms) GLog.w(TAG, "sleep 参数 $ms 超过上限，按 $capped ms 处理")
        return runCatching {
            Thread.sleep(capped.toLong())
            true
        }.getOrElse { "错误: sleep 被中断 - ${it.message}" }
    }

    private fun setSpeedImpl(v: Double): Any {
        if (v <= 0) return "错误: 速度倍率必须大于 0"
        speed = v
        GLog.i(TAG, "速度倍率设为 $v")
        return v
    }

    private fun unrandomizerImpl(a: List<Any?>): Any {
        val qword = longOrNull(a, 0)
        if (qword != null) unrandomSeed = qword
        GLog.d(TAG, "unrandomizer: seed=$unrandomSeed")
        return true
    }

    @Suppress("UNCHECKED_CAST")
    private fun addListItemsImpl(a: List<Any?>): Any {
        val items = a.getOrNull(0) as? List<*>
            ?: return "错误: addListItems 需要 table 参数"
        for (it in items) {
            @Suppress("UNCHECKED_CAST")
            (it as? Map<String, Any?>)?.let { savedList.add(it) }
        }
        return true
    }

    @Suppress("UNCHECKED_CAST")
    private fun removeListItemsImpl(a: List<Any?>): Any {
        val items = a.getOrNull(0) as? List<*>
            ?: return "错误: removeListItems 需要 table 参数"
        val toRemove = items.mapNotNull { (it as? Map<String, Any?>)?.get("address") }
        savedList.removeAll { it["address"] in toRemove }
        return true
    }

    private fun saveListImpl(path: String, flags: Int): Any {
        if (path.isBlank()) return "错误: saveList 需要文件路径"
        val target = File(path).let { if (it.isAbsolute) it else File(filesDir, path) }
        return runCatching {
            target.parentFile?.mkdirs()
            target.writeText(Serializer.toLua(savedList))
            GLog.i(TAG, "列表已保存 ${target.absolutePath}，${savedList.size} 项")
            true
        }.getOrElse { "错误: 保存失败 - ${it.message}" }
    }

    private fun loadListImpl(path: String, flags: Int): Any {
        if (path.isBlank()) return "错误: loadList 需要文件路径"
        val target = File(path).let { if (it.isAbsolute) it else File(filesDir, path) }
        if (!target.exists()) return "错误: 文件不存在 $path"
        return runCatching {
            // 简化处理：只统计行数，完整解析需要 Lua 运行器
            val count = target.readLines().count { it.isNotBlank() }
            GLog.i(TAG, "列表文件 ${target.name} 含 $count 行，解析待接入")
            "错误: loadList 需要 Lua 运行时解析，当前未接入"
        }.getOrElse { "错误: 读取失败 - ${it.message}" }
    }

    // ------------------------------------------------------------ 参数提取

    private fun str(a: List<Any?>, i: Int, def: String = ""): String =
        (a.getOrNull(i) as? String) ?: def

    private fun strOrNull(a: List<Any?>, i: Int): String? = a.getOrNull(i) as? String

    private fun int(a: List<Any?>, i: Int, def: Int = 0): Int =
        (a.getOrNull(i) as? Number)?.toInt() ?: def

    private fun longOrNull(a: List<Any?>, i: Int): Long? =
        (a.getOrNull(i) as? Number)?.toLong()

    private fun double(a: List<Any?>, i: Int, def: Double = 0.0): Double =
        (a.getOrNull(i) as? Number)?.toDouble() ?: def

    private fun bool(a: List<Any?>, i: Int, def: Boolean = false): Boolean =
        (a.getOrNull(i) as? Boolean) ?: def

    @Suppress("UNCHECKED_CAST")
    private fun list(a: List<Any?>, i: Int): List<Any?> =
        (a.getOrNull(i) as? List<Any?>) ?: emptyList()

    @Suppress("UNCHECKED_CAST")
    private fun map(a: List<Any?>, i: Int): Map<String, Any?> =
        (a.getOrNull(i) as? Map<String, Any?>) ?: emptyMap()

    // ------------------------------------------------------------ 内嵌工具

    private object Encode {
        fun bytes(text: String, encoding: String): String = runCatching {
            text.toByteArray(charset(encoding)).joinToString("") { b ->
                "%02X".format(b.toInt() and 0xFF)
            }
        }.getOrElse { "错误: 不支持的编码 $encoding" }
    }

    private object Locale2 {
        /** 把本地化数字（如 1,234.56 或 1.234,56）转成标准格式。 */
        fun fromLocale(num: String): String {
            val cleaned = num.trim().replace("\u00A0", "").replace(" ", "")
            val lastComma = cleaned.lastIndexOf(',')
            val lastDot = cleaned.lastIndexOf('.')
            return when {
                lastComma > lastDot -> cleaned.replace(".", "").replace(',', '.')
                else -> cleaned.replace(",", "")
            }
        }

        fun toLocale(num: String): String {
            val symbol = java.text.DecimalFormatSymbols.getInstance().decimalSeparator
            return num.replace('.', symbol)
        }
    }

    private object Version {
        fun require(version: String?, build: Int): Any {
            if (version == null && build == 0) return true
            val curBuild = BUILD
            if (build > curBuild) {
                return "错误: 脚本要求 build >= $build，当前 $curBuild"
            }
            return true
        }
    }

    private object SaveVar {
        fun save(variable: Any?, filename: String, dir: File): Any {
            val safe = filename.replace(Regex("[\\\\/:*?\"<>|]"), "_")
            val target = File(dir, if (safe.endsWith(".lua")) safe else "$safe.lua")
            return runCatching {
                target.writeText(Serializer.toLua(variable))
                true
            }.getOrElse { "错误: 保存变量失败 - ${it.message}" }
        }
    }

    private object Serializer {

        /** 把字符串包成 Lua 的双引号字面量，转义反斜杠与引号。 */
        private fun quote(v: String): String {
            val escaped = v
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
            return "\"" + escaped + "\""
        }

        /** 把 Kotlin 结构转成可被 Lua 读回的 table 字面量。 */
        fun toLua(v: Any?, indent: Int = 0): String = when (v) {
            null -> "nil"
            is Boolean, is Number -> v.toString()
            is String -> quote(v)
            is Map<*, *> -> {
                val pad = "  ".repeat(indent + 1)
                val body = v.entries.joinToString(",\n") { (k, value) ->
                    "$pad[${toLua(k)}] = ${toLua(value, indent + 1)}"
                }
                "{\n$body\n${"  ".repeat(indent)}}"
            }
            is List<*> -> {
                val pad = "  ".repeat(indent + 1)
                val body = v.joinToString(",\n") { "$pad${toLua(it, indent + 1)}" }
                "{\n$body\n${"  ".repeat(indent)}}"
            }
            else -> quote(v.toString())
        }
    }

    private object Http {
        fun request(url: String, headers: Map<String, Any?>, data: String?): Any {
            if (url.isBlank()) return "错误: makeRequest 需要 URL"
            return runCatching {
                val conn = java.net.URL(url).openConnection() as java.net.HttpURLConnection
                conn.requestMethod = if (data == null) "GET" else "POST"
                conn.connectTimeout = 15000
                conn.readTimeout = 15000
                headers.forEach { (k, v) -> conn.setRequestProperty(k, v?.toString() ?: "") }
                if (data != null) {
                    conn.doOutput = true
                    conn.outputStream.use { it.write(data.toByteArray()) }
                }
                val code = conn.responseCode
                val body = (if (code in 200..299) conn.inputStream else conn.errorStream)
                    ?.bufferedReader()?.readText().orEmpty()
                GLog.i(TAG, "HTTP $code $url (${body.length} 字符)")
                if (code in 200..299) body else "错误: HTTP $code"
            }.getOrElse { "错误: 请求失败 - ${it.message}" }
        }
    }
}
