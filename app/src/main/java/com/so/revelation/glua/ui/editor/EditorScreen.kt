package com.so.revelation.glua.ui.editor

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Save
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.compose.material3.AlertDialog
import com.so.revelation.glua.ui.theme.LevelError

/**
 * 脚本编辑器。
 *
 * 当前使用 Compose 的 BasicTextField 作为文本编辑区：
 * 具备编辑、滚动、等宽字体展示，但**没有**语法高亮、行号、自动缩进。
 * 后续接入 sora-editor（AndroidView 包裹）或自研 Compose 高亮层时，
 * 只需替换 [CodeArea]，其余布局保持不变。
 */
@Composable
fun EditorScreen(
    viewModel: EditorViewModel,
    onBack: () -> Unit,
    onOpenLogcat: () -> Unit,
) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    var showSaveAs by remember { mutableStateOf(false) }

    Column(Modifier.fillMaxSize()) {
        Surface(color = MaterialTheme.colorScheme.surface) {
            Row(
                Modifier.fillMaxWidth().padding(horizontal = 4.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = onBack) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                }
                Column(Modifier.weight(1f)) {
                    Text(
                        state.file?.name ?: "未命名",
                        style = MaterialTheme.typography.titleMedium,
                    )
                    if (state.dirty) {
                        Text(
                            "未保存",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                }
                IconButton(onClick = viewModel::save) {
                    Icon(Icons.Default.Save, contentDescription = "保存")
                }
                IconButton(onClick = { showSaveAs = true }) {
                    Text("…", style = MaterialTheme.typography.titleMedium)
                }
                if (state.running) {
                    CircularProgressIndicator(Modifier.width(22.dp).height(22.dp), strokeWidth = 2.dp)
                    Spacer(Modifier.width(6.dp))
                } else {
                    IconButton(onClick = viewModel::run) {
                        Icon(Icons.Default.PlayArrow, contentDescription = "运行")
                    }
                }
            }
        }

        HorizontalDivider()

        CodeArea(
            text = state.text,
            onTextChange = viewModel::updateText,
            modifier = Modifier.weight(1f),
        )

        state.error?.let { err ->
            Surface(color = MaterialTheme.colorScheme.surfaceVariant) {
                Row(
                    Modifier.fillMaxWidth().padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        err,
                        style = MaterialTheme.typography.bodySmall,
                        color = LevelError,
                        modifier = Modifier.weight(1f),
                    )
                    TextButton(onClick = viewModel::clearError) { Text("关闭") }
                }
            }
        }

        if (state.output.isNotEmpty()) {
            HorizontalDivider()
            OutputPanel(state.output, onClear = viewModel::clearOutput, onOpenLogcat = onOpenLogcat)
        }
    }

    if (showSaveAs) {
        var name by remember { mutableStateOf("") }
        AlertDialog(
            onDismissRequest = { showSaveAs = false },
            confirmButton = {
                TextButton(onClick = { viewModel.saveAs(name); showSaveAs = false }) { Text("创建") }
            },
            dismissButton = { TextButton(onClick = { showSaveAs = false }) { Text("取消") } },
            title = { Text("另存为") },
            text = {
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("文件名") },
                    singleLine = true,
                )
            },
        )
    }
}

@Composable
private fun CodeArea(
    text: String,
    onTextChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Surface(modifier = modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        BasicTextField(
            value = text,
            onValueChange = onTextChange,
            textStyle = MaterialTheme.typography.bodySmall.copy(
                fontFamily = FontFamily.Monospace,
                color = MaterialTheme.colorScheme.onBackground,
            ),
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
        )
    }
}

@Composable
private fun OutputPanel(
    output: List<String>,
    onClear: () -> Unit,
    onOpenLogcat: () -> Unit,
) {
    Surface(color = MaterialTheme.colorScheme.surface, modifier = Modifier.height(180.dp)) {
        Column(Modifier.fillMaxSize()) {
            Row(
                Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 2.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                Text("输出", style = MaterialTheme.typography.labelSmall)
                Spacer(Modifier.weight(1f))
                TextButton(onClick = onOpenLogcat) { Text("日志", style = MaterialTheme.typography.labelSmall) }
                TextButton(onClick = onClear) { Text("清空", style = MaterialTheme.typography.labelSmall) }
            }
            HorizontalDivider()
            Column(
                Modifier.fillMaxSize().verticalScroll(rememberScrollState()).padding(8.dp),
            ) {
                output.forEach { line ->
                    Text(
                        line,
                        style = MaterialTheme.typography.bodySmall,
                        fontFamily = FontFamily.Monospace,
                    )
                }
            }
        }
    }
}
