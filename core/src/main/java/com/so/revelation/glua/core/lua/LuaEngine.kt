package com.so.revelation.glua.core.lua

import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.log.LogBus
import com.so.revelation.glua.core.log.LogLevel
import com.so.revelation.glua.core.log.LogSource
import com.so.revelation.glua.core.lua.gg.GgApiCatalog
import com.so.revelation.glua.core.lua.gg.GgEnvironment
import com.so.revelation.glua.core.lua.gg.GgRuntime
import com.so.revelation.glua.core.lua.vm.LuaRuntime
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.withContext
import org.luaj.vm2.LuaError
import java.io.File
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.coroutineContext

/**
 * Lua 脚本执行引擎，基于 LuaJ 3.0.1（Lua 5.3 语义）。
 *
 * 线程模型：脚本一律在 [Dispatchers.IO] 上执行，绝不占用主线程。
 *
 * 执行流程：
 * 1. 创建 [LuaRuntime]（新 Globals，避免脚本间全局变量污染）
 * 2. 注入 gg.* 与 print 重定向
 * 3. `globals.load(source, chunkName)` 编译
 * 4. `chunk.call()` 执行
 * 5. 捕获 [LuaError] 归类为编译期/运行期错误
 *
 * 取消：通过 [cancel] 置位中断标志。LuaJ 不支持指令级中断，
 * 因此长期运行的脚本只能等到下一次 `gg.sleep` 或语句边界才响应。
 */
class LuaEngine(
    /** gg.* 运行时。为 null 时脚本里的 gg.* 调用会得到 nil。 */
    private val gg: GgRuntime? = null,
) {

    private companion object {
        const val TAG = "LuaEngine"
    }

    private val cancelFlag = AtomicBoolean(false)

    /** 已注册的 gg 函数名，用于执行前静态审计。 */
    private val knownGgFunctions: Set<String> by lazy {
        GgApiCatalog.functions.map { it.name }.toSet()
    }

    private val knownGgConstants: Set<String> by lazy {
        com.so.revelation.glua.core.lua.gg.GgConstants.NUMERIC.keys
    }

    /** 请求中止当前正在执行的脚本。 */
    fun cancel() {
        cancelFlag.set(true)
        GLog.w(TAG, "已请求中止脚本")
    }

    /**
     * 执行一段 Lua 源码。
     *
     * @param source    源码文本
     * @param chunkName 名称，出现在错误信息里；`=name` 前缀表示用户命名
     * @param scriptDir 脚本目录，用于 dofile 的相对路径解析
     * @param onOutput  脚本输出回调（print 的结果），逐行调用
     */
    suspend fun execute(
        source: String,
        chunkName: String = "=script",
        scriptDir: File? = null,
        onOutput: (String) -> Unit = {},
    ): ScriptResult = withContext(Dispatchers.IO) {
        cancelFlag.set(false)
        GLog.i(TAG, "开始执行 $chunkName，${source.length} 字符")
        val startedAt = System.nanoTime()
        val output = mutableListOf<String>()

        // 静态审计：只告警，不阻止执行
        auditGgCalls(source).forEach { issue ->
            val level = if (issue.startsWith("[错误]")) LogLevel.ERROR else LogLevel.WARN
            LogBus.log(level, chunkName, issue, LogSource.LUA)
        }

        val collector: (String) -> Unit = { line ->
            output += line
            onOutput(line)
        }

        val runtime = try {
            if (gg != null) {
                LuaRuntime(gg, scriptDir, collector)
            } else {
                // 没有 gg 运行时也要能跑纯 Lua
                LuaRuntime(
                    gg = com.so.revelation.glua.core.lua.gg.GgRuntime(
                        filesDir = File(System.getProperty("java.io.tmpdir") ?: "/tmp"),
                        cacheDir = File(System.getProperty("java.io.tmpdir") ?: "/tmp"),
                        externalDir = null,
                    ),
                    scriptDir = scriptDir,
                    onOutput = collector,
                )
            }
        } catch (t: Throwable) {
            GLog.e(TAG, "创建 Lua 运行时失败", t)
            return@withContext ScriptResult.RuntimeError(
                message = "无法创建 Lua 运行时: ${t.message}",
                detail = LogBus.stackTraceOf(t).lineSequence().take(8).joinToString("\n"),
                output = emptyList(),
                elapsedMs = (System.nanoTime() - startedAt) / 1_000_000,
            )
        }

        val result: ScriptResult = try {
            coroutineContext.ensureActive()
            if (cancelFlag.get()) {
                ScriptResult.Cancelled
            } else {
                val chunk = runtime.globals.load(source, chunkName)
                chunk.call()
                ScriptResult.Success(output.toList(), 0)
            }
        } catch (exit: LuaRuntime.ScriptExit) {
            GLog.i(TAG, "脚本调用 os.exit(${exit.code})")
            ScriptResult.Success(output.toList(), 0)
        } catch (ce: CancellationException) {
            GLog.w(TAG, "脚本被协程取消: $chunkName")
            ScriptResult.Cancelled
        } catch (le: LuaError) {
            classifyLuaError(le, chunkName, output, startedAt)
        } catch (t: Throwable) {
            GLog.e(TAG, "脚本执行异常: $chunkName", t)
            ScriptResult.RuntimeError(
                message = t.message ?: t::class.java.simpleName,
                detail = LogBus.stackTraceOf(t).lineSequence().take(10).joinToString("\n"),
                output = output.toList(),
                elapsedMs = (System.nanoTime() - startedAt) / 1_000_000,
            )
        }

        val elapsed = (System.nanoTime() - startedAt) / 1_000_000
        when (result) {
            is ScriptResult.Success -> {
                GLog.i(TAG, "$chunkName 执行成功，耗时 ${elapsed}ms，输出 ${output.size} 行")
                result.copy(elapsedMs = elapsed)
            }
            is ScriptResult.RuntimeError -> {
                GLog.e(TAG, "$chunkName 运行错误: ${result.message}")
                result.copy(elapsedMs = elapsed)
            }
            is ScriptResult.CompileError -> {
                GLog.e(TAG, "$chunkName 编译错误: ${result.message}")
                result
            }
            ScriptResult.Cancelled -> {
                GLog.w(TAG, "$chunkName 已取消")
                ScriptResult.Cancelled
            }
        }
    }

    /**
     * 区分编译期与运行期错误。
     *
     * LuaJ 的编译错误信息里带 `chunkname:line:` 前缀且通常是
     * "syntax error" / "unexpected symbol" 之类；
     * 运行期错误则来自 call() 阶段。这里用错误信息特征判断。
     */
    private fun classifyLuaError(
        le: LuaError,
        chunkName: String,
        output: List<String>,
        startedAt: Long,
    ): ScriptResult {
        val msg = le.message ?: "未知 Lua 错误"
        val detail = buildString {
            append(msg)
            var cause: Throwable? = le.cause
            var depth = 0
            while (cause != null && depth < 3) {
                append("\n  caused by: ")
                append(cause.message)
                cause = cause.cause
                depth++
            }
        }

        val isCompile = msg.contains("syntax error", ignoreCase = true) ||
            msg.contains("unexpected symbol", ignoreCase = true) ||
            msg.contains("unfinished", ignoreCase = true) ||
            msg.contains("malformed", ignoreCase = true) ||
            msg.contains("expected", ignoreCase = true)

        return if (isCompile) {
            ScriptResult.CompileError(msg, detail)
        } else {
            ScriptResult.RuntimeError(
                message = msg,
                detail = detail,
                output = output,
                elapsedMs = (System.nanoTime() - startedAt) / 1_000_000,
            )
        }
    }

    /**
     * 扫描脚本中的 `gg.xxx` 引用，报告不存在或当前环境不可用的项。
     * 只告警，不阻止执行——gg 的约定是函数返回错误字符串而非抛异常。
     */
    private fun auditGgCalls(source: String): List<String> {
        val out = mutableListOf<String>()
        val stripped = stripForAudit(source)

        Regex("""\bgg\.(\w+)""").findAll(stripped).forEach { m ->
            val name = m.groupValues[1]
            when {
                name in knownGgFunctions -> {
                    val avail = GgEnvironment.availabilityOf(name)
                    if (!avail.available) {
                        out += "[警告] gg.$name 在当前环境不可用：${avail.reason}"
                    }
                }
                name in knownGgConstants -> Unit
                name in setOf("VERSION", "VERSION_INT", "BUILD", "PACKAGE", "ANDROID_SDK_INT") -> Unit
                else -> out += "[错误] gg.$name 不存在（既不是函数也不是常量）"
            }
        }
        return out.distinct()
    }

    /** 去掉字符串与注释，避免把注释里的 gg.xxx 当成真实调用。 */
    private fun stripForAudit(s: String): String =
        s.replace(Regex("""--\[\[.*?]]""", RegexOption.DOT_MATCHES_ALL), " ")
            .replace(Regex("""--[^\n]*"""), " ")
            .replace(Regex("""\[\[.*?]]""", RegexOption.DOT_MATCHES_ALL), " ")
            .replace(Regex("\"([^\"\\\\]|\\\\.)*\""), " ")
            .replace(Regex("'([^'\\\\]|\\\\.)*'"), " ")
}
