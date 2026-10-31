package com.so.revelation.glua.core.log

/**
 * 一条日志记录。
 *
 * 设计参照 Logcat 的一行输出格式：`时间 PID TID 级别/TAG: 消息`。
 * [source] 用来区分日志来源（Android Log、标准输出、Lua 运行时、未捕获异常），
 * 这样在 UI 上可以和 Logcat 一样按来源二次筛选。
 */
data class LogEntry(
    val id: Long,
    val timestamp: Long,
    val level: LogLevel,
    val tag: String,
    val message: String,
    val pid: Int,
    val tid: Long,
    val source: LogSource,
    val throwable: String? = null,
) {
    /** Logcat 风格的单行文本。 */
    fun formatLine(): String = buildString {
        append(LogcatFormat.timestamp(timestamp))
        append(' ')
        append(pid.toString().padStart(5))
        append(' ')
        append(tid.toString().padStart(5))
        append(' ')
        append(level.letter)
        append('/')
        append(tag)
        append(": ")
        append(message)
        if (throwable != null) {
            append('\n')
            append(throwable)
        }
    }
}

/** 日志来源。UI 上可多选过滤。 */
enum class LogSource(val label: String) {
    ANDROID_LOG("android.util.Log"),
    STDOUT("stdout"),
    STDERR("stderr"),
    LUA("Lua 运行时"),
    CRASH("未捕获异常"),
    APP("应用"),
}
