package com.so.revelation.glua.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.so.revelation.glua.ui.editor.LuaHighlightColors

/** 深色方案：接近 One Dark / Dracula 的对比度。 */
private val DarkHighlight = LuaHighlightColors(
    keyword = Color(0xFFC778DD),
    builtin = Color(0xFF61AFEF),
    functionName = Color(0xFF61AFEF),
    ggFunction = Color(0xFF98C379),
    ggConstant = Color(0xFFE5C07B),
    string = Color(0xFF98C379),
    number = Color(0xFFD19A66),
    comment = Color(0xFF5C6370),
    operator = Color(0xFF56B6C2),
)

/** 浅色方案。 */
private val LightHighlight = LuaHighlightColors(
    keyword = Color(0xFFA626A4),
    builtin = Color(0xFF4078F2),
    functionName = Color(0xFF4078F2),
    ggFunction = Color(0xFF50A14F),
    ggConstant = Color(0xFFC18401),
    string = Color(0xFF50A14F),
    number = Color(0xFF986801),
    comment = Color(0xFFA0A1A7),
    operator = Color(0xFF0184BC),
)

@Composable
fun rememberLuaHighlightColors(dark: Boolean): LuaHighlightColors =
    remember(dark) { if (dark) DarkHighlight else LightHighlight }
