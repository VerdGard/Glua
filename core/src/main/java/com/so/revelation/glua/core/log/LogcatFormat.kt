package com.so.revelation.glua.core.log

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/** Logcat 的文本格式化工具。 */
object LogcatFormat {

    private val timeFormat = ThreadLocal.withInitial {
        SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US)
    }

    fun timestamp(millis: Long): String = timeFormat.get()!!.format(Date(millis))

    /** 导出为文件时使用的完整格式，包含来源信息。 */
    fun exportLine(entry: LogEntry): String = buildString {
        append(entry.formatLine())
        append("  [")
        append(entry.source.label)
        append(']')
    }
}
