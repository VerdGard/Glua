package com.so.revelation.glua.ui.logcat

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.log.LogBus
import com.so.revelation.glua.core.log.LogEntry
import com.so.revelation.glua.core.log.LogExporter
import com.so.revelation.glua.core.log.LogFilter
import com.so.revelation.glua.core.log.LogLevel
import com.so.revelation.glua.core.log.LogSource
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.io.File

/** 日志面板的 UI 状态。 */
data class LogcatUiState(
    val entries: List<LogEntry> = emptyList(),
    val filter: LogFilter = LogFilter(),
    val paused: Boolean = false,
    val autoScroll: Boolean = true,
    val selectedEntry: LogEntry? = null,
    val exportedPath: String? = null,
    val tagSuggestions: List<Pair<String, Int>> = emptyList(),
    val sourceCounts: Map<LogSource, Int> = emptyMap(),
    val totalCount: Int = 0,
)

/**
 * 日志面板 ViewModel。
 *
 * 数据流：
 * - LogBus.stream 推送新条目 -> 若未暂停则增量追加
 * - 过滤条件变化 -> 从 LogBus 重新取全量快照后过滤
 *
 * 暂停时停止接收新条目但仍保留已展示内容，恢复时重新同步，
 * 行为与 Android Studio Logcat 的 Pause 一致。
 */
class LogcatViewModel : ViewModel() {

    private companion object {
        const val TAG = "LogcatViewModel"
        const val MAX_RENDER = 3000
    }

    private val _state = MutableStateFlow(LogcatUiState())
    val state: StateFlow<LogcatUiState> = _state.asStateFlow()

    private var collectJob: Job? = null

    init {
        GLog.i(TAG, "日志面板已打开")
        reload()
        startCollecting()
    }

    private fun startCollecting() {
        collectJob?.cancel()
        collectJob = viewModelScope.launch {
            LogBus.stream.collect { entry ->
                val s = _state.value
                if (s.paused) return@collect
                if (!s.filter.matches(entry)) return@collect
                _state.update { cur ->
                    val next = (cur.entries + entry).takeLast(MAX_RENDER)
                    cur.copy(entries = next, totalCount = cur.totalCount + 1)
                }
            }
        }
    }

    /** 从 LogBus 重新读取全量快照并按当前条件过滤。 */
    fun reload() {
        val s = _state.value
        val snapshot = LogBus.snapshot(s.filter).takeLast(MAX_RENDER)
        _state.update {
            it.copy(
                entries = snapshot,
                tagSuggestions = LogBus.tags().take(30),
                sourceCounts = LogBus.countBySource(),
                totalCount = LogBus.size(),
            )
        }
    }

    fun setLevel(level: LogLevel) {
        _state.update { it.copy(filter = it.filter.copy(minLevel = level)) }
        reload()
    }

    fun setTagQuery(q: String) {
        _state.update { it.copy(filter = it.filter.copy(tagQuery = q)) }
        reload()
    }

    fun setTextQuery(q: String) {
        _state.update { it.copy(filter = it.filter.copy(textQuery = q)) }
        reload()
    }

    fun setRegex(enabled: Boolean) {
        _state.update { it.copy(filter = it.filter.copy(regex = enabled)) }
        reload()
    }

    fun toggleSource(source: LogSource) {
        _state.update {
            val cur = it.filter.sources
            val next = if (source in cur) cur - source else cur + source
            it.copy(filter = it.filter.copy(sources = next))
        }
        reload()
    }

    fun clearFilters() {
        _state.update { it.copy(filter = LogFilter()) }
        reload()
    }

    fun togglePause() {
        val nowPaused = !_state.value.paused
        _state.update { it.copy(paused = nowPaused) }
        GLog.d(TAG, if (nowPaused) "日志已暂停" else "日志已恢复")
        if (!nowPaused) reload()
    }

    fun toggleAutoScroll() {
        _state.update { it.copy(autoScroll = !it.autoScroll) }
    }

    fun clear() {
        LogBus.clear()
        GLog.i(TAG, "已清空日志缓冲")
        _state.update { it.copy(entries = emptyList(), totalCount = 0) }
        reload()
    }

    fun select(entry: LogEntry?) {
        _state.update { it.copy(selectedEntry = entry) }
    }

    fun export(dir: File) {
        viewModelScope.launch {
            runCatching { LogExporter.exportToFile(dir, _state.value.filter) }
                .onSuccess { file ->
                    GLog.i(TAG, "日志已导出: ${file.absolutePath}")
                    _state.update { it.copy(exportedPath = file.absolutePath) }
                }
                .onFailure { GLog.e(TAG, "日志导出失败", it) }
        }
    }

    fun dismissExportedHint() {
        _state.update { it.copy(exportedPath = null) }
    }

    fun resizeBuffer(capacity: Int) {
        LogBus.resize(capacity)
        GLog.i(TAG, "日志缓冲容量调整为 $capacity")
        reload()
    }

    override fun onCleared() {
        collectJob?.cancel()
        GLog.i(TAG, "日志面板已关闭")
        super.onCleared()
    }
}
