package com.so.revelation.glua.ui.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import com.so.revelation.glua.core.lua.gg.GgApiCatalog
import com.so.revelation.glua.core.lua.gg.GgConstants
import com.so.revelation.glua.core.lua.syntax.LuaLexer
import com.so.revelation.glua.core.lua.syntax.LuaTokenKind

/**
 * 把 Lua 词法结果映射成 Compose 的富文本。
 *
 * 实现为 [VisualTransformation]：不改变文本内容，只添加样式，
 * 因此光标位置、选区、撤销栈都不受影响。
 */
class LuaHighlightTransformation(private val colors: LuaHighlightColors) : VisualTransformation {

    private val ggFunctions: Set<String> by lazy { GgApiCatalog.functions.map { it.name }.toSet() }
    private val ggConstants: Set<String> by lazy { GgConstants.NUMERIC.keys }

    override fun filter(text: AnnotatedString): TransformedText {
        val raw = text.text
        val tokens = LuaLexer.tokenize(raw, ggFunctions, ggConstants)

        val styled = buildAnnotatedString {
            append(raw)
            for (t in tokens) {
                val color = colors.of(t.kind) ?: continue
                addStyle(SpanStyle(color = color), t.start, t.end)
            }
        }
        return TransformedText(styled, OffsetMapping.Identity)
    }

    override fun equals(other: Any?): Boolean =
        other is LuaHighlightTransformation && other.colors == colors

    override fun hashCode(): Int = colors.hashCode()
}

/** 语法着色配色。由主题注入，核心层不依赖具体颜色。 */
data class LuaHighlightColors(
    val keyword: Color,
    val builtin: Color,
    val functionName: Color,
    val ggFunction: Color,
    val ggConstant: Color,
    val string: Color,
    val number: Color,
    val comment: Color,
    val operator: Color,
) {
    fun of(kind: LuaTokenKind): Color? = when (kind) {
        LuaTokenKind.KEYWORD -> keyword
        LuaTokenKind.BUILTIN -> builtin
        LuaTokenKind.FUNCTION_NAME -> functionName
        LuaTokenKind.GG_FUNCTION -> ggFunction
        LuaTokenKind.GG_CONSTANT -> ggConstant
        LuaTokenKind.STRING -> string
        LuaTokenKind.NUMBER -> number
        LuaTokenKind.COMMENT -> comment
        LuaTokenKind.OPERATOR -> operator
        else -> null
    }
}
