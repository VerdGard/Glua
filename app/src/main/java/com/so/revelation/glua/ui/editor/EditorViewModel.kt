package com.so.revelation.glua.ui.editor

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.so.revelation.glua.core.files.ScriptStore
import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.lua.LuaEngine
import com.so.revelation.glua.core.lua.ScriptResult
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.io.File

data class EditorUiState(
    val file: File? = null,
    val text: String = "",
    val dirty: Boolean = false,
    val running: Boolean = false,
    val output: List<String> = emptyList(),
    val error: String? = null,
    val lastElapsedMs: Long = 0,
)

class EditorViewModel(
    private val store: ScriptStore,
    private val engine: LuaEngine,
) : ViewModel() {

    private companion object {
        const val TAG = "EditorViewModel"
        /** 输出面板最多保留的行数，防止死循环 print 撑爆内存。 */
        const val MAX_OUTPUT_LINES = 2000
    }

    private val _state = MutableStateFlow(EditorUiState())
    val state: StateFlow<EditorUiState> = _state.asStateFlow()

    private var runJob: Job? = null

    fun open(file: File) {
        viewModelScope.launch {
            val content = store.read(file)
            if (content == null) {
                _state.update { it.copy(error = "读取失败: ${file.name}") }
                return@launch
            }
            _state.update {
                it.copy(file = file, text = content, dirty = false, output = emptyList(), error = null)
            }
            GLog.i(TAG, "已打开 ${file.name}")
        }
    }

    fun updateText(newText: String) {
        _state.update { it.copy(text = newText, dirty = true) }
    }

    fun save() {
        val s = _state.value
        val file = s.file ?: run {
            _state.update { it.copy(error = "没有打开的脚本") }
            return
        }
        viewModelScope.launch {
            val ok = store.write(file, s.text)
            _state.update {
                it.copy(dirty = !ok, error = if (ok) null else "保存失败")
            }
        }
    }

    fun saveAs(name: String) {
        viewModelScope.launch {
            val created = store.create(name, _state.value.text)
            if (created == null) {
                _state.update { it.copy(error = "新建失败: $name") }
                return@launch
            }
            _state.update { it.copy(file = created, dirty = false, error = null) }
        }
    }

    /**
     * 运行当前脚本。
     *
     * 输出通过回调实时追加，因此死循环脚本也能看到已产生的日志。
     * 已在运行时重复点击会被忽略。
     */
    fun run() {
        if (_state.value.running) {
            GLog.w(TAG, "脚本正在运行，忽略重复请求")
            return
        }
        val snapshot = _state.value
        _state.update {
            it.copy(running = true, output = emptyList(), error = null, lastElapsedMs = 0)
        }

        runJob = viewModelScope.launch {
            val name = snapshot.file?.name ?: "untitled.lua"
            val result = engine.execute(
                source = snapshot.text,
                chunkName = name,
                scriptDir = snapshot.file?.parentFile,
                onOutput = { line ->
                    // 实时追加，限制总行数
                    _state.update { cur ->
                        if (cur.output.size >= MAX_OUTPUT_LINES) cur
                        else cur.copy(output = cur.output + line)
                    }
                },
            )

            _state.update { cur ->
                when (result) {
                    is ScriptResult.Success -> cur.copy(
                        running = false,
                        lastElapsedMs = result.elapsedMs,
                    )
                    is ScriptResult.CompileError -> cur.copy(
                        running = false,
                        error = "编译错误: ${result.message}",
                    )
                    is ScriptResult.RuntimeError -> cur.copy(
                        running = false,
                        error = "运行错误: ${result.message}",
                        lastElapsedMs = result.elapsedMs,
                    )
                    ScriptResult.Cancelled -> cur.copy(
                        running = false,
                        error = "已中止",
                    )
                }
            }
        }
    }

    /** 中止正在运行的脚本。 */
    fun stop() {
        if (!_state.value.running) return
        GLog.i(TAG, "用户请求中止脚本")
        engine.cancel()
        runJob?.cancel()
        _state.update { it.copy(running = false, error = "已中止") }
    }

    fun clearError() = _state.update { it.copy(error = null) }
    fun clearOutput() = _state.update { it.copy(output = emptyList()) }
}
