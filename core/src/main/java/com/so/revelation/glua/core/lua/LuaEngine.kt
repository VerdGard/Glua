package com.so.revelation.glua.core.lua

import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.log.LogBus
import com.so.revelation.glua.core.log.LogLevel
import com.so.revelation.glua.core.log.LogSource
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.withContext
import kotlin.coroutines.coroutineContext

/**
 * Lua 脚本执行引擎。
 *
 * 当前是**占位实现**：真正接入反编译得到的 Lua 5.3 VM 需要把原 p165u6/p180w6
 * 那批 Java 类迁入本模块并解混淆，工作量较大且需逐类修正编译错误。
 *
 * 这一层先把接口、线程模型、错误分类、日志上报定下来，
 * 后续只替换 [executeBlocking] 的内部实现，UI 层无需改动。
 */
class LuaEngine {

    private companion object {
        const val TAG = "LuaEngine"
    }

    suspend fun execute(source: String, chunkName: String = "=script"): ScriptResult =
        withContext(Dispatchers.IO) {
            GLog.i(TAG, "开始执行 $chunkName，${source.length} 字符")
            val startedAt = System.nanoTime()
            val output = mutableListOf<String>()

            val result = try {
                coroutineContext.ensureActive()
                executeBlocking(source, chunkName, output)
            } catch (ce: CancellationException) {
                GLog.w(TAG, "脚本被取消: $chunkName")
                ScriptResult.Cancelled
            } catch (t: Throwable) {
                GLog.e(TAG, "脚本执行异常: $chunkName", t)
                ScriptResult.RuntimeError(
                    message = t.message ?: t::class.java.simpleName,
                    detail = StackTraceHelper.format(t),
                    output = output.toList(),
                    elapsedMs = (System.nanoTime() - startedAt) / 1_000_000,
                )
            }

            val elapsed = (System.nanoTime() - startedAt) / 1_000_000
            GLog.i(TAG, "$chunkName 结束，耗时 ${elapsed}ms，输出 ${output.size} 行")

            when (result) {
                is ScriptResult.Success -> result.copy(elapsedMs = elapsed)
                is ScriptResult.RuntimeError -> result.copy(elapsedMs = elapsed)
                else -> result
            }
        }

    /**
     * 同步执行。VM 接入后在这里调用 Lua 的 load + call。
     * 目前回显源码并明确提示引擎未接入，不假装执行成功。
     */
    private fun executeBlocking(
        source: String,
        chunkName: String,
        output: MutableList<String>,
    ): ScriptResult {
        val syntaxError = SyntaxCheck.findObviousError(source)
        if (syntaxError != null) {
            return ScriptResult.CompileError(syntaxError.first, syntaxError.second)
        }

        val notice = "[LuaEngine] Lua 5.3 VM 尚未接入，以下为源码回显（$chunkName）"
        output += notice
        LogBus.log(LogLevel.WARN, TAG, notice, LogSource.LUA)
        source.lineSequence().forEach { line ->
            output += line
            LogBus.log(LogLevel.INFO, chunkName, line, LogSource.LUA)
        }
        return ScriptResult.Success(output.toList(), 0)
    }

    private object SyntaxCheck {
        fun findObviousError(source: String): Pair<String, String?>? {
            val cleaned = stripStringsAndComments(source)
            val openCount = Regex("""\b(function|if|for|while|do)\b""").findAll(cleaned).count()
            val closeCount = Regex("""\bend\b""").findAll(cleaned).count()
            if (openCount > closeCount) {
                return "语法错误：缺少 end" to "块开始关键字 $openCount 个，end 只有 $closeCount 个"
            }
            return null
        }

        private fun stripStringsAndComments(s: String): String =
            s.replace(Regex("""--\[\[.*?]]""", RegexOption.DOT_MATCHES_ALL), " ")
                .replace(Regex("""--[^\n]*"""), " ")
                .replace(Regex("""\[\[.*?]]""", RegexOption.DOT_MATCHES_ALL), " ")
                .replace(Regex("\"([^\"\\\\]|\\\\.)*\""), " ")
                .replace(Regex("'([^'\\\\]|\\\\.)*'"), " ")
    }

    private object StackTraceHelper {
        fun format(t: Throwable): String =
            LogBus.stackTraceOf(t).lineSequence().take(12).joinToString("\n")
    }
}
