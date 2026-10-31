package com.so.revelation.glua.core.log

import android.util.Log
import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.io.PrintStream

/**
 * 把日志通道统一切到 [LogBus]，实现"应用内查看自身所有日志"。
 *
 * 覆盖的三条通道（按可靠性排序）：
 *
 * 1. **stdout / stderr** —— 直接替换 `System.out` / `System.err`。
 *    能捕获 `printStackTrace()`、Lua `print`、第三方库的打印。这条最可靠。
 *
 * 2. **app 自身日志** —— 统一调用 [GLog]，它同时转发给 LogBus 与平台 Log。
 *    这样平台 Logcat 与应用内面板都能看到，且不依赖任何 Hook。
 *
 * 3. **未捕获异常** —— [installUncaughtHandler]，串联原有 handler。
 *
 * 不打 `android.util.Log` 的主意：ART 上 `println_native` 是 native 方法，
 * Java 层无法替换其方法体；用反射或 JVMTI 强行替换在非 debuggable 包上
 * 会失败，且属于未公开行为。与其提供一个可能失效的 Hook，
 * 不如在代码规范层面要求所有日志走 [GLog]。
 */
object LogcatInterceptor {

    private var installed = false

    /**
     * 安装拦截。可重复调用，只有第一次生效。
     * @return true 表示本次（或之前）已成功安装
     */
    fun install(): Boolean {
        if (installed) return true
        installed = true
        redirectStandardStreams()
        return true
    }

    // ------------------------------------------------ stdout / stderr

    private fun redirectStandardStreams() {
        System.setOut(PrintStream(LogcatOutputStream(LogLevel.INFO, LogSource.STDOUT), true, "UTF-8"))
        System.setErr(PrintStream(LogcatOutputStream(LogLevel.ERROR, LogSource.STDERR), true, "UTF-8"))
    }

    /**
     * 按行切分写入 LogBus 的输出流。
     * 保留半行缓冲，避免 `print` 不带换行时日志被拆碎。
     */
    private class LogcatOutputStream(
        private val level: LogLevel,
        private val source: LogSource,
    ) : OutputStream() {

        private val lineBuffer = ByteArrayOutputStream(256)

        override fun write(b: Int) {
            if (b == '\n'.code) flushLine() else synchronized(lineBuffer) { lineBuffer.write(b) }
        }

        override fun write(b: ByteArray, off: Int, len: Int) {
            for (i in off until off + len) write(b[i].toInt())
        }

        override fun flush() = flushLine()

        private fun flushLine() {
            val text = synchronized(lineBuffer) {
                if (lineBuffer.size() == 0) return
                val s = lineBuffer.toString(Charsets.UTF_8.name())
                lineBuffer.reset()
                s
            }
            LogBus.log(level, source.label, text, source)
        }
    }

    // ------------------------------------------------ 未捕获异常

    /**
     * 安装全局未捕获异常记录。会串联已有 handler，不吞掉系统默认行为。
     */
    fun installUncaughtHandler() {
        val previous = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, error ->
            runCatching {
                LogBus.log(
                    level = LogLevel.ASSERT,
                    tag = "FATAL/${thread.name}",
                    message = error.toString(),
                    source = LogSource.CRASH,
                    throwable = error,
                )
                Thread.sleep(300)
            }
            previous?.uncaughtException(thread, error)
        }
    }
}
