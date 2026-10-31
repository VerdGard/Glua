package com.so.revelation.glua.core.lua.gg

/** 一个参数的定义。 */
data class GgParam(
    val name: String,
    val type: String,
    val default: String = "",
) {
    /** 是否可选（有默认值）。 */
    val optional: Boolean get() = default.isNotEmpty()

    /** 用于提示的展示文本，例如 `text: string`。 */
    fun display(): String =
        if (optional) "$name: $type = $default" else "$name: $type"
}

/**
 * 一个 gg.* 函数的完整元数据。
 *
 * [signature] 是官方签名原文，例如
 * `mixed searchNumber ( string text, int type = gg.TYPE_AUTO, ... )`。
 * 提示 UI 直接展示它，避免重新拼装时丢失信息。
 */
data class GgFunction(
    val name: String,
    val returns: String,
    val signature: String,
    val params: List<GgParam> = emptyList(),
    val description: String = "",
    val returnDescription: String = "",
    val paramDescription: String = "",
    val example: String = "",
) {
    /** 短签名，用于补全列表右侧。 */
    fun shortSignature(): String = "$name(${params.joinToString(", ") { it.name }})"

    /** 悬停文档。参数说明里已含 ▪ 分隔符，这里做轻度整理。 */
    fun documentText(): String = buildString {
        append(returns)
        append(' ')
        append(signature)
        if (description.isNotEmpty()) {
            append("\n\n")
            append(description)
        }
        if (returnDescription.isNotEmpty()) {
            append("\n\n")
            append(returnDescription)
        }
        if (paramDescription.isNotEmpty()) {
            append("\n\n")
            append(paramDescription)
        }
        if (example.isNotEmpty()) {
            append("\n\n示例:\n")
            append(example)
        }
    }.trim()
}
