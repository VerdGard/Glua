package com.so.revelation.glua.core.lua.syntax

/** 语法着色类别。颜色由 UI 层主题映射，核心层不依赖 Android 图形。 */
enum class LuaTokenKind {
    KEYWORD,
    BUILTIN,
    FUNCTION_NAME,
    GG_FUNCTION,
    GG_CONSTANT,
    STRING,
    NUMBER,
    COMMENT,
    OPERATOR,
    PUNCTUATION,
    IDENTIFIER,
    PLAIN,
}

/**
 * 一段带类别的文本。
 *
 * @param start 在原文本中的起始下标（含）
 * @param end   结束下标（不含）
 */
data class LuaToken(
    val start: Int,
    val end: Int,
    val kind: LuaTokenKind,
    val text: String,
) {
    init {
        require(end >= start) { "end($end) 必须 >= start($start)" }
    }
}
