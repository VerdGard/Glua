package com.so.revelation.glua.core.lua.syntax

/** 补全项的类别，用于 UI 图标与排序权重。 */
enum class CompletionKind {
    KEYWORD,
    BUILTIN,
    GG_FUNCTION,
    GG_CONSTANT,
    LOCAL,
    FIELD,
}

/**
 * 一条补全建议。
 *
 * @param insertText 实际插入的文本（不含已输入的前缀）
 * @param detail     右侧灰色说明，例如函数签名
 * @param documentation 展开的详细文档，来自 [com.so.revelation.glua.core.lua.gg.GgFunction]
 * @param available  当前环境下是否可用（无 root 时内存类函数为 false）
 */
data class CompletionItem(
    val label: String,
    val insertText: String = label,
    val kind: CompletionKind,
    val detail: String = "",
    val documentation: String = "",
    val available: Boolean = true,
    val unavailableReason: String = "",
)
