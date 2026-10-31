package com.so.revelation.glua.core.log

/**
 * 日志过滤条件，对应 Logcat 的过滤栏。
 *
 * @param minLevel  最低级别（包含）
 * @param tagQuery  TAG 子串匹配，忽略大小写，空串表示不限制
 * @param textQuery 消息体子串匹配，忽略大小写，空串表示不限制
 * @param sources   允许的来源集合，空集合表示不限制
 * @param regex     是否把 [textQuery] 当作正则
 */
data class LogFilter(
    val minLevel: LogLevel = LogLevel.VERBOSE,
    val tagQuery: String = "",
    val textQuery: String = "",
    val sources: Set<LogSource> = emptySet(),
    val regex: Boolean = false,
) {
    val isActive: Boolean
        get() = minLevel != LogLevel.VERBOSE ||
            tagQuery.isNotEmpty() ||
            textQuery.isNotEmpty() ||
            sources.isNotEmpty() ||
            regex

    fun matches(entry: LogEntry): Boolean {
        if (entry.level.priority < minLevel.priority) return false
        if (sources.isNotEmpty() && entry.source !in sources) return false
        if (tagQuery.isNotEmpty() && !entry.tag.contains(tagQuery, ignoreCase = true)) return false
        if (textQuery.isNotEmpty()) {
            return if (regex) {
                runCatching {
                    Regex(textQuery, RegexOption.IGNORE_CASE).containsMatchIn(entry.message)
                }.getOrDefault(false)
            } else {
                entry.message.contains(textQuery, ignoreCase = true)
            }
        }
        return true
    }
}
