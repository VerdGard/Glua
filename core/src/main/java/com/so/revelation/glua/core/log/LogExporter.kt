package com.so.revelation.glua.core.log

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * 日志导出。格式与 `adb logcat -d` 的输出兼容，
 * 用 `logcat.log` 命名，方便直接用文本工具或 Android Studio 打开分析。
 */
object LogExporter {

    private val fileStamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US)

    /**
     * 把过滤后的日志写入 [dir]，返回生成的文件。
     * 文件名形如 `logcat_20250101_120000.log`。
     */
    fun exportToFile(
        dir: File,
        filter: LogFilter = LogFilter(),
        includeHeader: Boolean = true,
    ): File {
        dir.mkdirs()
        val file = File(dir, "logcat_${fileStamp.format(Date())}.log")
        file.bufferedWriter().use { w ->
            if (includeHeader) {
                w.write(header(filter))
                w.write("\n")
            }
            w.write(LogBus.export(filter))
            w.write("\n")
        }
        return file
    }

    private fun header(filter: LogFilter): String = buildString {
        append("--------- beginning of glua logcat ---------\n")
        append("# 导出时间: ")
        append(LogcatFormat.timestamp(System.currentTimeMillis()))
        append('\n')
        append("# 进程 PID: ")
        append(LogBus.pid)
        append('\n')
        append("# 过滤条件: 级别>=%s".format(filter.minLevel.label))
        if (filter.tagQuery.isNotEmpty()) append(", TAG~%s".format(filter.tagQuery))
        if (filter.textQuery.isNotEmpty()) append(", 文本~%s".format(filter.textQuery))
        if (filter.sources.isNotEmpty()) append(", 来源=%s".format(filter.sources.joinToString { it.label }))
        append('\n')
        append("--------------------------------------------")
    }
}
