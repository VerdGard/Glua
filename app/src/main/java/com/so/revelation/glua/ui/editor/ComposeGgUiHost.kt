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
 * ## 同步等待
 *
 * Lua 脚本在 IO 线程同步执行，而对话框在主线程异步展示。
 * 为了让 `gg.alert` 的返回值真实反映用户点击，这里用 [CountDownLatch]：
 * 脚本线程调用时阻塞等待，Compose 在用户点击后写入结果并计数归零。
 *
 * **重要**：调用方必须在非主线程执行脚本，否则会 ANR。
 * [LuaEngine] 已经保证在 `Dispatchers.IO` 上执行。
 *
 * 超时保护：默认 5 分钟，超时后按"取消"处理并记录日志。
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

    /** 等待用户响应的同步原语。 */
    private class Waiter {
        val latch = java.util.concurrent.CountDownLatch(1)
        @Volatile var result: Any? = null
    }

    @Volatile
    private var currentWaiter: Waiter? = null

    /** 对话框等待超时（毫秒）。 */
    private var dialogTimeoutMs: Long = 5 * 60 * 1000L

    /**
     * 阻塞等待用户响应。
     * @return 用户选择的结果；超时返回 null
     */
    private fun awaitResponse(waiter: Waiter): Any? {
        val ok = waiter.latch.await(dialogTimeoutMs, java.util.concurrent.TimeUnit.MILLISECONDS)
        if (!ok) {
            GLog.w(TAG, "对话框等待超时（${dialogTimeoutMs}ms）")
            _pendingDialog.value = null
        }
        return waiter.result
    }

    /** 用户做出选择后调用，唤醒等待的脚本线程。 */
    fun respond(result: Any?) {
        val w = currentWaiter ?: return
        w.result = result
        _pendingDialog.value = null
        w.latch.countDown()
    }

    private val _toast = MutableStateFlow<String?>(null)
    val toast: StateFlow<String?> = _toast.asStateFlow()

    private val _panelVisible = MutableStateFlow(true)

    /** 用户取消对话框。 */
    fun dismissDialog() {
        respond(null)
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
        val waiter = Waiter()
        currentWaiter = waiter
        _pendingDialog.value = DialogRequest.Alert(text, positive, negative, neutral)
        // GG 语义：返回点击的按钮序号（1/2/3），取消返回 nil（这里用 0 表示）
        return awaitResponse(waiter) ?: 0
    }

    override fun choice(items: List<Any?>, selected: String?, message: String?): Any {
        val strings = items.map { it?.toString() ?: "" }
        GLog.i(TAG, "gg.choice: ${strings.size} 项")
        if (strings.isEmpty()) return ""
        val waiter = Waiter()
        currentWaiter = waiter
        _pendingDialog.value = DialogRequest.Choice(strings, selected, message)
        // 返回选中项文本；取消返回 nil（用空串代替，GG 侧是 nil）
        return awaitResponse(waiter) ?: ""
    }

    override fun multiChoice(
        items: List<Any?>,
        selection: List<Any?>,
        message: String?,
    ): Any {
        val strings = items.map { it?.toString() ?: "" }
        val preselect = selection.mapNotNull { it?.toString() }
        GLog.i(TAG, "gg.multiChoice: ${strings.size} 项，预选 ${preselect.size}")
        if (strings.isEmpty()) return emptyList<String>()
        val waiter = Waiter()
        currentWaiter = waiter
        _pendingDialog.value = DialogRequest.MultiChoice(strings, preselect, message)
        @Suppress("UNCHECKED_CAST")
        return awaitResponse(waiter) as? List<String> ?: preselect
    }

    override fun prompt(
        prompts: List<Any?>,
        defaults: List<Any?>,
        types: List<Any?>,
    ): Any {
        val texts = prompts.map { it?.toString() ?: "" }
        val defs = defaults.map { it?.toString() ?: "" }
        GLog.i(TAG, "gg.prompt: ${texts.size} 个输入项")
        if (texts.isEmpty()) return defs
        val waiter = Waiter()
        currentWaiter = waiter
        _pendingDialog.value = DialogRequest.Prompt(texts, defs)
        @Suppress("UNCHECKED_CAST")
        return awaitResponse(waiter) as? List<String> ?: defs
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
