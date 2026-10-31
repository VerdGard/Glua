package com.so.revelation.glua.ui.editor

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.so.revelation.glua.core.files.ScriptStore
import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.lua.LuaEngine
import com.so.revelation.glua.core.lua.ScriptResult
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
)

class EditorViewModel(
    private val store: ScriptStore,
    private val engine: LuaEngine,
) : ViewModel() {

    private companion object { const val TAG = "EditorViewModel" }

    private val _state = MutableStateFlow(EditorUiState())
    val state: StateFlow<EditorUiState> = _state.asStateFlow()

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
                it.copy(
                    dirty = !ok,
                    error = if (ok) null else "保存失败",
                )
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

    fun run() {
        val s = _state.value
        if (s.running) return
        _state.update { it.copy(running = true, output = emptyList(), error = null) }
        viewModelScope.launch {
            val name = s.file?.name ?: "untitled.lua"
            val result = engine.execute(s.text, name)
            _state.update { cur ->
                when (result) {
                    is ScriptResult.Success ->
                        cur.copy(running = false, output = result.output)
                    is ScriptResult.CompileError ->
                        cur.copy(running = false, error = result.message, output = listOfNotNull(result.detail))
                    is ScriptResult.RuntimeError ->
                        cur.copy(running = false, error = result.message, output = result.output)
                    ScriptResult.Cancelled ->
                        cur.copy(running = false, error = "已取消")
                }
            }
        }
    }

    fun clearError() = _state.update { it.copy(error = null) }
    fun clearOutput() = _state.update { it.copy(output = emptyList()) }
}
