package com.so.revelation.glua.core.log

/**
 * 日志级别，语义与 Android Logcat 一致。
 *
 * 顺序即严重程度，[priority] 越大越严重，用于过滤时做 ">= level" 的阈值比较。
 */
enum class LogLevel(val priority: Int, val letter: Char, val label: String) {
    VERBOSE(2, 'V', "Verbose"),
    DEBUG(3, 'D', "Debug"),
    INFO(4, 'I', "Info"),
    WARN(5, 'W', "Warn"),
    ERROR(6, 'E', "Error"),
    ASSERT(7, 'A', "Assert");

    companion object {
        fun fromPriority(priority: Int): LogLevel =
            entries.firstOrNull { it.priority == priority } ?: VERBOSE

        fun fromLetter(letter: Char): LogLevel =
            entries.firstOrNull { it.letter.equals(letter, ignoreCase = true) } ?: VERBOSE
    }
}
