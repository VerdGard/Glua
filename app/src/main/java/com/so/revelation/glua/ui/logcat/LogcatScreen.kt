package com.so.revelation.glua.ui.logcat

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FilterChip
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.so.revelation.glua.core.log.LogEntry
import com.so.revelation.glua.core.log.LogLevel
import com.so.revelation.glua.core.log.LogSource
import com.so.revelation.glua.core.log.LogcatFormat
import com.so.revelation.glua.ui.theme.LevelAssert
import com.so.revelation.glua.ui.theme.LevelDebug
import com.so.revelation.glua.ui.theme.LevelError
import com.so.revelation.glua.ui.theme.LevelInfo
import com.so.revelation.glua.ui.theme.LevelVerbose
import com.so.revelation.glua.ui.theme.LevelWarn
import java.io.File

/**
 * 应用内 Logcat 面板。
 *
 * 结构自上而下：
 * 1. 顶部操作条：返回、级别选择、暂停、自动滚动、清空、导出
 * 2. 过滤区：TAG 搜索、全文搜索、正则开关、来源多选
 * 3. 日志列表：等宽字体、按级别着色、点击查看详情
 */
@Composable
fun LogcatScreen(
    onBack: () -> Unit,
    exportDir: File,
    viewModel: LogcatViewModel = viewModel(),
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val listState = rememberLazyListState()

    // 自动滚动到最新一条
    LaunchedEffect(state.entries.size, state.autoScroll) {
        if (state.autoScroll && state.entries.isNotEmpty() && !state.paused) {
            listState.animateScrollToItem(state.entries.lastIndex)
        }
    }

    Column(Modifier.fillMaxSize()) {
        LogcatTopBar(
            level = state.filter.minLevel,
            paused = state.paused,
            autoScroll = state.autoScroll,
            count = state.entries.size,
            total = state.totalCount,
            onBack = onBack,
            onLevelChange = viewModel::setLevel,
            onTogglePause = viewModel::togglePause,
            onToggleAutoScroll = viewModel::toggleAutoScroll,
            onClear = viewModel::clear,
            onExport = { viewModel.export(exportDir) },
        )

        LogcatFilterBar(
            tagQuery = state.filter.tagQuery,
            textQuery = state.filter.textQuery,
            regex = state.filter.regex,
            selectedSources = state.filter.sources,
            sourceCounts = state.sourceCounts,
            onTagQuery = viewModel::setTagQuery,
            onTextQuery = viewModel::setTextQuery,
            onRegex = viewModel::setRegex,
            onToggleSource = viewModel::toggleSource,
            onClearFilters = viewModel::clearFilters,
        )

        HorizontalDivider()

        Box(Modifier.weight(1f)) {
            if (state.entries.isEmpty()) {
                EmptyHint(state.filter.isActive)
            } else {
                LazyColumn(state = listState, modifier = Modifier.fillMaxSize()) {
                    items(state.entries, key = { it.id }) { entry ->
                        LogRow(entry) { viewModel.select(entry) }
                    }
                }
            }
            if (state.paused) {
                PausedBanner(Modifier.align(Alignment.TopCenter))
            }
        }
    }

    state.selectedEntry?.let { entry ->
        LogDetailDialog(entry) { viewModel.select(null) }
    }

    state.exportedPath?.let { path ->
        ExportedDialog(path, onDismiss = viewModel::dismissExportedHint)
    }
}

@Composable
private fun LogcatTopBar(
    level: LogLevel,
    paused: Boolean,
    autoScroll: Boolean,
    count: Int,
    total: Int,
    onBack: () -> Unit,
    onLevelChange: (LogLevel) -> Unit,
    onTogglePause: () -> Unit,
    onToggleAutoScroll: () -> Unit,
    onClear: () -> Unit,
    onExport: () -> Unit,
) {
    Surface(color = MaterialTheme.colorScheme.surface) {
        Column {
            Row(
                Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = onBack) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                }
                Text(
                    "日志",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(start = 4.dp),
                )
                Spacer(Modifier.width(8.dp))
                Text(
                    "$count / $total",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
                Spacer(Modifier.weight(1f))

                LevelMenu(current = level, onChange = onLevelChange)

                IconButton(onClick = onTogglePause) {
                    Icon(
                        if (paused) Icons.Default.PlayArrow else Icons.Default.Pause,
                        contentDescription = if (paused) "继续" else "暂停",
                    )
                }
                IconButton(onClick = onToggleAutoScroll) {
                    Text(
                        "⇩",
                        fontSize = 18.sp,
                        fontWeight = if (autoScroll) FontWeight.Bold else FontWeight.Normal,
                        color = if (autoScroll) MaterialTheme.colorScheme.primary
                        else MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
                IconButton(onClick = onClear) {
                    Icon(Icons.Default.Clear, contentDescription = "清空")
                }
                IconButton(onClick = onExport) {
                    Icon(Icons.Default.Download, contentDescription = "导出")
                }
            }
        }
    }
}

@Composable
private fun LevelMenu(current: LogLevel, onChange: (LogLevel) -> Unit) {
    var expanded by remember { mutableStateOf(false) }
    Box {
        TextButton(onClick = { expanded = true }) {
            Text(
                current.letter.toString(),
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                color = levelColor(current),
            )
            Text(
                " ≥ ${current.label}",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            LogLevel.entries.forEach { lv ->
                DropdownMenuItem(
                    text = {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                lv.letter.toString(),
                                fontFamily = FontFamily.Monospace,
                                fontWeight = FontWeight.Bold,
                                color = levelColor(lv),
                            )
                            Spacer(Modifier.width(10.dp))
                            Text(lv.label)
                        }
                    },
                    onClick = { onChange(lv); expanded = false },
                )
            }
        }
    }
}

@Composable
private fun LogcatFilterBar(
    tagQuery: String,
    textQuery: String,
    regex: Boolean,
    selectedSources: Set<LogSource>,
    sourceCounts: Map<LogSource, Int>,
    onTagQuery: (String) -> Unit,
    onTextQuery: (String) -> Unit,
    onRegex: (Boolean) -> Unit,
    onToggleSource: (LogSource) -> Unit,
    onClearFilters: () -> Unit,
) {
    Column(Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 6.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            SearchField(
                value = tagQuery,
                placeholder = "TAG",
                modifier = Modifier.weight(0.38f),
                onValueChange = onTagQuery,
            )
            Spacer(Modifier.width(6.dp))
            SearchField(
                value = textQuery,
                placeholder = if (regex) "正则" else "包含文本",
                modifier = Modifier.weight(0.62f),
                onValueChange = onTextQuery,
            )
            Spacer(Modifier.width(6.dp))
            FilterChip(
                selected = regex,
                onClick = { onRegex(!regex) },
                label = { Text(".*", fontFamily = FontFamily.Monospace) },
            )
        }

        Spacer(Modifier.height(6.dp))

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            LogSource.entries.forEach { src ->
                val count = sourceCounts[src] ?: 0
                if (count == 0) return@forEach
                FilterChip(
                    selected = src in selectedSources,
                    onClick = { onToggleSource(src) },
                    label = { Text("${src.label} $count", style = MaterialTheme.typography.labelSmall) },
                )
            }
            Spacer(Modifier.weight(1f))
            if (tagQuery.isNotEmpty() || textQuery.isNotEmpty() || selectedSources.isNotEmpty()) {
                TextButton(onClick = onClearFilters) { Text("重置", style = MaterialTheme.typography.labelSmall) }
            }
        }
    }
}

@Composable
private fun SearchField(
    value: String,
    placeholder: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit,
) {
    Surface(
        modifier = modifier.height(34.dp),
        shape = RoundedCornerShape(6.dp),
        color = MaterialTheme.colorScheme.surfaceVariant,
    ) {
        Row(Modifier.padding(horizontal = 8.dp), verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.Default.Search,
                contentDescription = null,
                modifier = Modifier.size(14.dp),
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            Spacer(Modifier.width(5.dp))
            Box(Modifier.weight(1f)) {
                if (value.isEmpty()) {
                    Text(
                        placeholder,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
                BasicTextField(
                    value = value,
                    onValueChange = onValueChange,
                    singleLine = true,
                    textStyle = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.onSurface,
                    ),
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}

/**
 * 单行日志。列宽固定，便于纵向扫读，与 Logcat 一致。
 */
@Composable
private fun LogRow(entry: LogEntry, onClick: () -> Unit) {
    Row(
        Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 2.dp),
    ) {
        Text(
            LogcatFormat.timestamp(entry.timestamp).substring(6),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            maxLines = 1,
        )
        Spacer(Modifier.width(6.dp))
        Text(
            entry.level.letter.toString(),
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Bold,
            color = levelColor(entry.level),
        )
        Spacer(Modifier.width(5.dp))
        Text(
            entry.tag,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.primary,
            maxLines = 1,
            modifier = Modifier.width(96.dp),
        )
        Spacer(Modifier.width(5.dp))
        Text(
            text = buildAnnotatedString {
                withStyle(SpanStyle(color = MaterialTheme.colorScheme.onSurface)) {
                    append(entry.message.lineSequence().first())
                }
                if (entry.throwable != null) {
                    withStyle(SpanStyle(color = LevelError)) { append("  [异常]") }
                }
            },
            style = MaterialTheme.typography.bodySmall,
            maxLines = 1,
        )
    }
}

@Composable
private fun EmptyHint(filtered: Boolean) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            if (filtered) "没有符合过滤条件的日志" else "暂无日志",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
    }
}

@Composable
private fun PausedBanner(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.padding(top = 8.dp),
        shape = RoundedCornerShape(20.dp),
        color = LevelWarn,
    ) {
        Text(
            "已暂停",
            modifier = Modifier.padding(horizontal = 14.dp, vertical = 5.dp),
            style = MaterialTheme.typography.labelSmall,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
private fun LogDetailDialog(entry: LogEntry, onDismiss: () -> Unit) {
    androidx.compose.material3.AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = { TextButton(onClick = onDismiss) { Text("关闭") } },
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    entry.level.letter.toString(),
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    color = levelColor(entry.level),
                )
                Spacer(Modifier.width(8.dp))
                Text(entry.tag, style = MaterialTheme.typography.titleMedium)
            }
        },
        text = {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                MetaRow("时间", LogcatFormat.timestamp(entry.timestamp))
                MetaRow("级别", entry.level.label)
                MetaRow("来源", entry.source.label)
                MetaRow("PID", entry.pid.toString())
                MetaRow("TID", entry.tid.toString())
                Spacer(Modifier.height(10.dp))
                Card(colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)) {
                    Text(
                        entry.message,
                        modifier = Modifier.padding(10.dp),
                        style = MaterialTheme.typography.bodySmall,
                        fontFamily = FontFamily.Monospace,
                    )
                }
                entry.throwable?.let {
                    Spacer(Modifier.height(10.dp))
                    Text("堆栈", style = MaterialTheme.typography.labelSmall)
                    Card(
                        Modifier.padding(top = 4.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                    ) {
                        Text(
                            it,
                            modifier = Modifier.padding(10.dp).verticalScroll(rememberScrollState()),
                            style = MaterialTheme.typography.bodySmall,
                            fontFamily = FontFamily.Monospace,
                            color = LevelError,
                        )
                    }
                }
            }
        },
    )
}

@Composable
private fun MetaRow(label: String, value: String) {
    Row(Modifier.padding(vertical = 1.dp)) {
        Text(
            label,
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.width(48.dp),
        )
        Text(value, style = MaterialTheme.typography.bodySmall)
    }
}

@Composable
private fun ExportedDialog(path: String, onDismiss: () -> Unit) {
    androidx.compose.material3.AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = { TextButton(onClick = onDismiss) { Text("好") } },
        title = { Text("已导出") },
        text = {
            Text(path, style = MaterialTheme.typography.bodySmall, fontFamily = FontFamily.Monospace)
        },
    )
}

internal fun levelColor(level: LogLevel): Color = when (level) {
    LogLevel.VERBOSE -> LevelVerbose
    LogLevel.DEBUG -> LevelDebug
    LogLevel.INFO -> LevelInfo
    LogLevel.WARN -> LevelWarn
    LogLevel.ERROR -> LevelError
    LogLevel.ASSERT -> LevelAssert
}
