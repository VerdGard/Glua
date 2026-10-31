package com.so.revelation.glua.ui.editor

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

/**
 * 渲染 `gg.alert` / `gg.choice` / `gg.multiChoice` / `gg.prompt` 的对话框。
 *
 * 用户操作后调用 [ComposeGgUiHost.respond] 唤醒等待中的脚本线程。
 * 这个 Composable 要放在编辑器页面里，且必须始终挂载——
 * 否则脚本调用 gg.alert 后会一直阻塞到超时。
 */
@Composable
fun GgDialogHost(host: ComposeGgUiHost) {
    val request by host.pendingDialog.collectAsStateWithLifecycle()
    val dialog = request ?: return

    when (dialog) {
        is ComposeGgUiHost.DialogRequest.Alert -> AlertDialog(
            onDismissRequest = { host.respond(0) },
            title = { Text("提示") },
            text = {
                Text(
                    dialog.text,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.verticalScroll(rememberScrollState()),
                )
            },
            confirmButton = {
                TextButton(onClick = { host.respond(1) }) { Text(dialog.positive.ifEmpty { "确定" }) }
            },
            dismissButton = when {
                dialog.negative != null || dialog.neutral != null -> {
                    {
                        Row {
                            dialog.neutral?.let {
                                TextButton(onClick = { host.respond(3) }) { Text(it) }
                            }
                            dialog.negative?.let {
                                TextButton(onClick = { host.respond(2) }) { Text(it) }
                            }
                        }
                    }
                }
                else -> null
            },
        )

        is ComposeGgUiHost.DialogRequest.Choice -> {
            var selected by remember(dialog) {
                mutableStateOf(dialog.selected ?: dialog.items.firstOrNull() ?: "")
            }
            AlertDialog(
                onDismissRequest = { host.respond(null) },
                title = { dialog.message?.let { Text(it) } },
                text = {
                    Column(Modifier.verticalScroll(rememberScrollState())) {
                        dialog.items.forEach { item ->
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .toggleable(
                                        value = selected == item,
                                        onValueChange = { selected = item },
                                    )
                                    .padding(vertical = 10.dp),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                androidx.compose.material3.RadioButton(
                                    selected = selected == item,
                                    onClick = { selected = item },
                                )
                                Spacer(Modifier.width(8.dp))
                                Text(item, fontFamily = FontFamily.Monospace, style = MaterialTheme.typography.bodyMedium)
                            }
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = { host.respond(selected) }) { Text("确定") }
                },
                dismissButton = {
                    TextButton(onClick = { host.respond(null) }) { Text("取消") }
                },
            )
        }

        is ComposeGgUiHost.DialogRequest.MultiChoice -> {
            val checked = remember(dialog) { mutableStateListOf<String>().apply { addAll(dialog.selection) } }
            AlertDialog(
                onDismissRequest = { host.respond(null) },
                title = { dialog.message?.let { Text(it) } },
                text = {
                    Column(Modifier.heightIn(max = 400.dp).verticalScroll(rememberScrollState())) {
                        dialog.items.forEach { item ->
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .toggleable(
                                        value = item in checked,
                                        onValueChange = {
                                            if (item in checked) checked.remove(item) else checked.add(item)
                                        },
                                    )
                                    .padding(vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Checkbox(
                                    checked = item in checked,
                                    onCheckedChange = {
                                        if (item in checked) checked.remove(item) else checked.add(item)
                                    },
                                )
                                Spacer(Modifier.width(8.dp))
                                Text(item, fontFamily = FontFamily.Monospace, style = MaterialTheme.typography.bodyMedium)
                            }
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = { host.respond(checked.toList()) }) { Text("确定") }
                },
                dismissButton = {
                    TextButton(onClick = { host.respond(null) }) { Text("取消") }
                },
            )
        }

        is ComposeGgUiHost.DialogRequest.Prompt -> {
            val values = remember(dialog) {
                mutableStateListOf<String>().apply {
                    dialog.defaults.forEach { add(it) }
                    while (size < dialog.prompts.size) add("")
                }
            }
            AlertDialog(
                onDismissRequest = { host.respond(null) },
                title = { Text("输入") },
                text = {
                    Column(Modifier.heightIn(max = 400.dp).verticalScroll(rememberScrollState())) {
                        dialog.prompts.forEachIndexed { i, prompt ->
                            OutlinedTextField(
                                value = values.getOrElse(i) { "" },
                                onValueChange = { if (i < values.size) values[i] = it },
                                label = { Text(prompt) },
                                singleLine = true,
                                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                            )
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = { host.respond(values.toList()) }) { Text("确定") }
                },
                dismissButton = {
                    TextButton(onClick = { host.respond(null) }) { Text("取消") }
                },
            )
        }
    }
}
