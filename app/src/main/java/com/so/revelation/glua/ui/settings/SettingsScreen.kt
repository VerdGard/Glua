package com.so.revelation.glua.ui.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.clickable
import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.log.LogBus
import com.so.revelation.glua.core.log.LogLevel
import com.so.revelation.glua.core.log.NativeBridge

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(onBack: () -> Unit) {
    var mirrorToSystem by remember { mutableStateOf(GLog.mirrorToSystem) }
    var captureLevel by remember { mutableStateOf(LogBus.captureMinLevel) }
    var bufferSize by remember { mutableStateOf(LogBus.DEFAULT_CAPACITY.toFloat()) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("设置") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                },
            )
        },
    ) { padding ->
        Column(
            Modifier.fillMaxSize().padding(padding).verticalScroll(rememberScrollState()),
        ) {
            SectionTitle("日志")
            ListItem(
                headlineContent = { Text("同时输出到系统 Logcat") },
                supportingContent = {
                    Text(
                        "开启后可在 Android Studio 的 Logcat 里看到同样内容",
                        style = MaterialTheme.typography.labelSmall,
                    )
                },
                trailingContent = {
                    Switch(
                        checked = mirrorToSystem,
                        onCheckedChange = {
                            mirrorToSystem = it
                            GLog.mirrorToSystem = it
                        },
                    )
                },
            )
            ListItem(
                headlineContent = { Text("捕获级别") },
                supportingContent = {
                    Text(
                        "低于该级别的日志直接丢弃（当前 ${captureLevel.label}）",
                        style = MaterialTheme.typography.labelSmall,
                    )
                },
                trailingContent = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        LogLevel.entries.forEach { lv ->
                            Text(
                                lv.letter.toString(),
                                fontFamily = FontFamily.Monospace,
                                style = MaterialTheme.typography.bodySmall,
                                color = if (lv == captureLevel) MaterialTheme.colorScheme.primary
                                else MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier
                                    .padding(horizontal = 4.dp)
                                    .then(
                                        Modifier.clickableNoRipple {
                                            captureLevel = lv
                                            LogBus.captureMinLevel = lv
                                        }
                                    ),
                            )
                        }
                    }
                },
            )
            ListItem(
                headlineContent = { Text("缓冲区容量") },
                supportingContent = {
                    Column {
                        Text(
                            "${bufferSize.toInt()} 条",
                            style = MaterialTheme.typography.labelSmall,
                        )
                        Slider(
                            value = bufferSize,
                            onValueChange = { bufferSize = it },
                            onValueChangeFinished = { LogBus.resize(bufferSize.toInt()) },
                            valueRange = 1000f..50000f,
                        )
                    }
                },
            )

            HorizontalDivider()
            SectionTitle("原生")
            ListItem(
                headlineContent = { Text("原生库") },
                supportingContent = {
                    Text(
                        if (NativeBridge.isAvailable) "glua_core 已加载，崩溃捕获已启用"
                        else "未加载，使用纯 Kotlin 日志",
                        style = MaterialTheme.typography.labelSmall,
                    )
                },
            )

            HorizontalDivider()
            SectionTitle("关于")
            ListItem(
                headlineContent = { Text("Glua") },
                supportingContent = {
                    Text("Lua 脚本编辑器（Kotlin + Compose + C）", style = MaterialTheme.typography.labelSmall)
                },
            )
            Spacer(Modifier.width(1.dp))
        }
    }
}

@Composable
private fun SectionTitle(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.labelSmall,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 4.dp),
    )
}

private fun Modifier.clickableNoRipple(onClick: () -> Unit): Modifier =
    this.then(
        androidx.compose.foundation.clickable(
            interactionSource = androidx.compose.foundation.interaction.MutableInteractionSource(),
            indication = null,
            onClick = onClick,
        )
    )
