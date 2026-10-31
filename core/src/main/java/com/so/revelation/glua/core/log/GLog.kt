package com.so.revelation.glua.core.log

import android.util.Log as AndroidLog

/**
 * 应用统一的日志入口。
 *
 * 每条日志同时写入两处：
 * - [LogBus]：应用内日志面板（可过滤、可搜索、可导出）
 * - `android.util.Log`：系统 Logcat，便于接 Android Studio / adb 调试
 *
 * 约定：项目内**不要**直接调用 `android.util.Log`，一律走这里。
 * 否则该条日志在应用内面板里会缺失。
 */
object GLog {

    /** 是否同时转发到系统 Logcat。debug 包默认开启，release 可关掉减少开销。 */
    @Volatile
    var mirrorToSystem: Boolean = true

    fun v(tag: String, message: String) = emit(LogLevel.VERBOSE, tag, message, null)
    fun d(tag: String, message: String) = emit(LogLevel.DEBUG, tag, message, null)
    fun i(tag: String, message: String) = emit(LogLevel.INFO, tag, message, null)
    fun w(tag: String, message: String, tr: Throwable? = null) = emit(LogLevel.WARN, tag, message, tr)
    fun e(tag: String, message: String, tr: Throwable? = null) = emit(LogLevel.ERROR, tag, message, tr)

    inline fun <T> trace(tag: String, block: () -> T): T {
        val start = System.nanoTime()
        try {
            return block()
        } finally {
            val ms = (System.nanoTime() - start) / 1_000_000.0
            d(tag, "耗时 %.2f ms".format(ms))
        }
    }

    private fun emit(level: LogLevel, tag: String, message: String, tr: Throwable?) {
        LogBus.log(level, tag, message, LogSource.APP, tr)
        if (!mirrorToSystem) return
        when (level) {
            LogLevel.VERBOSE -> AndroidLog.v(tag, message, tr)
            LogLevel.DEBUG -> AndroidLog.d(tag, message, tr)
            LogLevel.INFO -> AndroidLog.i(tag, message, tr)
            LogLevel.WARN -> AndroidLog.w(tag, message, tr)
            LogLevel.ERROR -> AndroidLog.e(tag, message, tr)
            LogLevel.ASSERT -> AndroidLog.wtf(tag, message, tr)
        }
    }
}
