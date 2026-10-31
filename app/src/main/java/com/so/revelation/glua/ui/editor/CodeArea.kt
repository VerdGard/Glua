package com.so.revelation.glua.ui.editor

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.so.revelation.glua.core.lua.syntax.CompletionEngine
import com.so.revelation.glua.core.lua.syntax.CompletionItem
import com.so.revelation.glua.core.lua.syntax.CompletionKind
import com.so.revelation.glua.ui.theme.LevelError
import com.so.revelation.glua.ui.theme.LevelWarn
import com.so.revelation.glua.ui.theme.rememberLuaHighlightColors
import androidx.compose.foundation.isSystemInDarkTheme

/**
 * 带语法高亮与代码补全的编辑区。
 *
 * 结构：行号栏 + 文本区 + 补全浮层。
 *
 * 补全策略：每次文本或光标变化时重新计算前缀与候选，
 * 只在前缀长度 >= 1 或处于 `gg.` 之后时展示弹窗。
 */
@Composable
fun CodeArea(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    showLineNumbers: Boolean = true,
) {
    val dark = isSystemInDarkTheme()
    val highlight = rememberLuaHighlightColors(dark)
    val transformation = remember(highlight) { LuaHighlightTransformation(highlight) }

    var suggestions by remember { mutableStateOf<List<CompletionItem>>(emptyList()) }
    var focused by remember { mutableStateOf(false) }
    val listState = rememberLazyListState()

    val lineCount by remember {
        derivedStateOf { value.text.count { it == '\n' } + 1 }
    }

    // 文本或光标变化 -> 重新计算补全
    LaunchedEffect(value.text, value.selection.start, focused) {
        if (!focused) {
            suggestions = emptyList()
            return@LaunchedEffect
        }
        val cursor = value.selection.start
        val computed = CompletionEngine.complete(value.text, cursor)
        // 单个字符的前缀不弹窗，避免干扰正常输入
        val prefixLen = run {
            var i = cursor
            while (i > 0 && (value.text[i - 1].isLetterOrDigit() || value.text[i - 1] == '_')) i--
            cursor - i
        }
        val afterGgDot = value.text.take(cursor).endsWith("gg.") ||
            Regex("""\bgg\.\w*$""").containsMatchIn(value.text.take(cursor))
        suggestions = if (prefixLen >= 2 || afterGgDot) computed else emptyList()
    }

    LaunchedEffect(suggestions) {
        if (suggestions.isNotEmpty()) listState.scrollToItem(0)
    }

    Column(modifier) {
        Box(Modifier.weight(1f)) {
            Row(Modifier.fillMaxSize()) {
                if (showLineNumbers) {
                    LineNumberGutter(lineCount)
                }
                BasicTextField(
                    value = value,
                    onValueChange = onValueChange,
                    textStyle = MaterialTheme.typography.bodySmall.copy(
                        fontFamily = FontFamily.Monospace,
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = 13.sp,
                        lineHeight = 19.sp,
                    ),
                    visualTransformation = transformation,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .padding(horizontal = 8.dp, vertical = 8.dp)
                        .onFocusChanged { focused = it.isFocused },
                )
            }

            if (suggestions.isNotEmpty()) {
                // 补全浮层固定在编辑区底部，避免跟随光标带来的定位复杂度
                CompletionPopup(
                    items = suggestions,
                    listState = listState,
                    onPick = { item ->
                        applyCompletion(value, item)?.let(onValueChange)
                        suggestions = emptyList()
                    },
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = if (showLineNumbers) 44.dp else 8.dp, bottom = 8.dp),
                )
            }
        }
    }
}

/** 行号栏。宽度随行数自适应。 */
@Composable
private fun LineNumberGutter(lineCount: Int) {
    val width = when {
        lineCount < 100 -> 30.dp
        lineCount < 1000 -> 38.dp
        lineCount < 10000 -> 46.dp
        else -> 54.dp
    }
    val scroll = rememberScrollState()

    Column(
        Modifier
            .width(width)
            .fillMaxHeight()
            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f))
            .verticalScroll(scroll)
            .padding(vertical = 8.dp),
        horizontalAlignment = Alignment.End,
    ) {
        for (n in 1..lineCount) {
            Text(
                n.toString(),
                style = MaterialTheme.typography.bodySmall,
                fontFamily = FontFamily.Monospace,
                fontSize = 11.sp,
                lineHeight = 19.sp,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                modifier = Modifier.padding(end = 6.dp),
            )
        }
    }
}

/**
 * 补全弹窗。
 *
 * 展示 label + 详情，不可用项（无 root 环境下的内存函数）以警示色标注，
 * 但依然可选——用户可能只是想补全名字再自行处理。
 */
@Composable
private fun CompletionPopup(
    items: List<CompletionItem>,
    listState: androidx.compose.foundation.lazy.LazyListState,
    onPick: (CompletionItem) -> Unit,
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier
            .fillMaxWidth(0.92f)
            .heightIn(max = 220.dp),
        shape = RoundedCornerShape(8.dp),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 6.dp,
        shadowElevation = 8.dp,
    ) {
        LazyColumn(state = listState) {
            items(items, key = { it.kind.name + it.label }) { item ->
                Row(
                    Modifier
                        .fillMaxWidth()
                        .clickable { onPick(item) }
                        .padding(horizontal = 10.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    KindBadge(item)
                    Spacer(Modifier.width(8.dp))
                    Column(Modifier.weight(1f)) {
                        Text(
                            item.label,
                            style = MaterialTheme.typography.bodyMedium,
                            fontFamily = FontFamily.Monospace,
                            color = if (item.available) MaterialTheme.colorScheme.onSurface else LevelWarn,
                            maxLines = 1,
                        )
                        if (item.detail.isNotEmpty()) {
                            Text(
                                item.detail,
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    if (!item.available) {
                        Text(
                            "需 root",
                            style = MaterialTheme.typography.labelSmall,
                            color = LevelWarn,
                        )
                    }
                }
                HorizontalDivider(thickness = 0.5.dp, color = MaterialTheme.colorScheme.outline.copy(alpha = 0.2f))
            }
        }
    }
}

@Composable
private fun KindBadge(item: CompletionItem) {
    val (label, color) = when (item.kind) {
        CompletionKind.KEYWORD -> "K" to MaterialTheme.colorScheme.primary
        CompletionKind.BUILTIN -> "F" to MaterialTheme.colorScheme.secondary
        CompletionKind.GG_FUNCTION -> "gg" to Color(0xFF98C379)
        CompletionKind.GG_CONSTANT -> "c" to Color(0xFFE5C07B)
        CompletionKind.LOCAL -> "L" to MaterialTheme.colorScheme.onSurfaceVariant
        CompletionKind.FIELD -> "f" to MaterialTheme.colorScheme.onSurfaceVariant
    }
    Surface(
        shape = RoundedCornerShape(3.dp),
        color = color.copy(alpha = 0.18f),
    ) {
        Box(Modifier.width(22.dp).padding(vertical = 2.dp), contentAlignment = Alignment.Center) {
            Text(
                label,
                style = MaterialTheme.typography.labelSmall,
                fontSize = 9.sp,
                color = color,
                fontFamily = FontFamily.Monospace,
            )
        }
    }
}

/**
 * 把选中的补全项插入文本。
 *
 * 替换当前光标所在单词。`gg.` 后的候选只插入成员名，不加 `gg.` 前缀。
 */
private fun applyCompletion(value: TextFieldValue, item: CompletionItem): TextFieldValue? {
    val text = value.text
    val cursor = value.selection.start
    var start = cursor
    while (start > 0 && (text[start - 1].isLetterOrDigit() || text[start - 1] == '_')) start--

    val before = text.substring(0, cursor)
    val inGgContext = Regex("""\bgg\.\w*$""").containsMatchIn(before)
    val inLibContext = Regex("""\b(string|table|math|os|io)\.\w*$""").containsMatchIn(before)

    val insert = when {
        item.kind == CompletionKind.GG_FUNCTION && inGgContext -> item.label + "()"
        inGgContext || inLibContext -> item.insertText.ifEmpty { item.label }
        else -> item.insertText.ifEmpty { item.label }
    }

    val newText = text.substring(0, start) + insert + text.substring(cursor)
    val newCursor = start + insert.length
    return value.copy(text = newText, selection = TextRange(newCursor))
}
