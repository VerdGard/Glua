package com.so.revelation.glua.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.so.revelation.glua.core.files.ScriptFile
import com.so.revelation.glua.core.files.ScriptStore
import com.so.revelation.glua.core.log.GLog
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.io.File

data class HomeUiState(
    val scripts: List<ScriptFile> = emptyList(),
    val loading: Boolean = true,
    val rootPath: String = "",
    val error: String? = null,
)

class HomeViewModel(private val store: ScriptStore) : ViewModel() {

    private companion object { const val TAG = "HomeViewModel" }

    private val _state = MutableStateFlow(HomeUiState())
    val state: StateFlow<HomeUiState> = _state.asStateFlow()

    init {
        refresh()
    }

    fun refresh() {
        viewModelScope.launch {
            _state.update { it.copy(loading = true, error = null) }
            val ensured = store.ensureRoot()
            val list = store.list()
            _state.update {
                it.copy(
                    scripts = list,
                    loading = false,
                    rootPath = list.firstOrNull()?.file?.parent ?: "",
                    error = if (ensured) null else "无法访问脚本目录",
                )
            }
            GLog.i(TAG, "刷新脚本列表，共 ${list.size} 个")
        }
    }

    fun create(name: String, onCreated: (File) -> Unit) {
        viewModelScope.launch {
            val f = store.create(name)
            if (f == null) {
                _state.update { it.copy(error = "新建失败: $name") }
                return@launch
            }
            refresh()
            onCreated(f)
        }
    }

    fun delete(file: File) {
        viewModelScope.launch {
            store.delete(file)
            refresh()
        }
    }

    fun clearError() = _state.update { it.copy(error = null) }
}
