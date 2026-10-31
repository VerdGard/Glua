package com.so.revelation.glua.ui.editor

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.pm.PackageManager
import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.lua.gg.GgUiHost
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * [GgUiHost] 的 Android 实现，供 `gg.alert` / `gg.toast` / `gg.prompt` 等函数使用。
 *
 * 对话框通过 [pendingDialog] 状态驱动 Compose 渲染，
 * 而不是在核心层直接持有 Activity 引用——避免内存泄漏，
 * 也让核心模块保持无 Android UI 依赖。
 *
 * 注意：Lua 脚本是同步执行的，而对话框是异步的。
 * 当前策略是"展示后立即返回"，返回值不代表用户的选择。
 * 真正实现阻塞等待需要 Lua 协程支持，属于 VM 接入后的工作。
 */
class ComposeGgUiHost(
    private val context: Context,
    private val scriptPathProvider: () -> String?,
    private val lineProvider: () -> Int,
) : GgUiHost {

    private companion object {
        const val TAG = "GgUiHost"
    }

    /** 待展示的对话框。null 表示无。 */
    sealed interface DialogRequest {
        data class Alert(
            val text: String,
            val positive: String,
            val negative: String?,
            val neutral: String?,
        ) : DialogRequest

        data class Choice(
            val items: List<String>,
            val selected: String?,
            val message: String?,
        ) : DialogRequest

        data class MultiChoice(
            val items: List<String>,
            val selection: List<String>,
            val message: String?,
        ) : DialogRequest

        data class Prompt(
            val prompts: List<String>,
            val defaults: List<String>,
        ) : DialogRequest
    }

    private val _pendingDialog = MutableStateFlow<DialogRequest?>(null)
    val pendingDialog: StateFlow<DialogRequest?> = _pendingDialog.asStateFlow()

    private val _toast = MutableStateFlow<String?>(null)
    val toast: StateFlow<String?> = _toast.asStateFlow()

    private val _panelVisible = MutableStateFlow(true)

    fun dismissDialog() {
        _pendingDialog.value = null
    }

    fun consumeToast() {
        _toast.value = null
    }

    fun setPanelVisible(visible: Boolean) {
        _panelVisible.value = visible
    }

    // ------------------------------------------------------------ GgUiHost

    override fun alert(text: String, positive: String, negative: String?, neutral: String?): Any {
        GLog.i(TAG, "gg.alert: $text")
        _pendingDialog.value = DialogRequest.Alert(text, positive, negative, neutral)
        // 返回值语义：GG 返回点击的按钮序号（1 起）。异步场景下无法得知，返回 1。
        return 1
    }

    override fun choice(items: List<Any?>, selected: String?, message: String?): Any {
        val strings = items.map { it?.toString() ?: "" }
        GLog.i(TAG, "gg.choice: ${strings.size} 项")
        _pendingDialog.value = DialogRequest.Choice(strings, selected, message)
        // 无法同步等待，返回第一项的文本，避免脚本拿到 nil 崩掉
        return strings.firstOrNull() ?: ""
    }

    override fun multiChoice(
        items: List<Any?>,
        selection: List<Any?>,
        message: String?,
    ): Any {
        val strings = items.map { it?.toString() ?: "" }
        val preselect = selection.mapNotNull { it?.toString() }
        GLog.i(TAG, "gg.multiChoice: ${strings.size} 项，预选 ${preselect.size}")
        _pendingDialog.value = DialogRequest.MultiChoice(strings, preselect, message)
        return preselect
    }

    override fun prompt(
        prompts: List<Any?>,
        defaults: List<Any?>,
        types: List<Any?>,
    ): Any {
        val texts = prompts.map { it?.toString() ?: "" }
        val defs = defaults.map { it?.toString() ?: "" }
        GLog.i(TAG, "gg.prompt: ${texts.size} 个输入项")
        _pendingDialog.value = DialogRequest.Prompt(texts, defs)
        return defs
    }

    override fun toast(text: String, fast: Boolean) {
        GLog.i(TAG, "gg.toast: $text")
        _toast.value = text
    }

    override fun copyText(text: String) {
        runCatching {
            val cm = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            cm.setPrimaryClip(ClipData.newPlainText("glua", text))
            GLog.d(TAG, "已复制 ${text.length} 字符到剪贴板")
        }.onFailure { GLog.w(TAG, "复制到剪贴板失败", it) }
    }

    override fun currentScriptPath(): String? = scriptPathProvider()

    override fun currentLine(): Int = lineProvider()

    override fun isPanelVisible(): Boolean = _panelVisible.value

    override fun isPackageInstalled(pkg: String): Boolean = runCatching {
        context.packageManager.getPackageInfo(pkg, 0)
        true
    }.getOrElse { false }
}
