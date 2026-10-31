package com.so.revelation.glua.core.log

import android.util.Log
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import java.io.PrintWriter
import java.io.StringWriter
import java.util.concurrent.atomic.AtomicLong

/**
 * 应用内日志总线，是整个日志系统的唯一入口。
 *
 * 职责：
 * 1. 接收来自各处的日志（[Log.*]、[stdout]、[stderr]、Lua、崩溃）
 * 2. 写入环形缓冲，供 UI 全量/过滤读取
 * 3. 通过 [stream] 把新日志实时推给订阅者
 *
 * 参照 Logcat 的语义：每条日志有级别、TAG、PID、TID。
 * PID/TID 取进程自身，因为这里是"查看自身日志"，不是跨进程抓取。
 */
object LogBus {

    /** 环形缓冲容量。Android Studio 的 Logcat 默认也是这个量级。 */
    const val DEFAULT_CAPACITY = 8000

    private val lock = Any()
    private val idGenerator = AtomicLong(0)
    private var buffer = RingBuffer<LogEntry>(DEFAULT_CAPACITY)

    private val _stream = MutableSharedFlow<LogEntry>(
        replay = 0,
        extraBufferCapacity = 256,
    )
    val stream: SharedFlow<LogEntry> = _stream.asSharedFlow()

    private val _version = MutableStateFlow(0L)

    /** 缓冲区版本号。每次写入/清空都递增，UI 可据此触发重读快照。 */
    val version: StateFlow<Long> = _version.asStateFlow()

    /** 全局最低捕获级别。低于此级别的日志直接丢弃，减少开销。 */
    @Volatile
    var captureMinLevel: LogLevel = LogLevel.VERBOSE

    val pid: Int = android.os.Process.myPid()

    // ---------------------------------------------------------------- 写入

    fun log(
        level: LogLevel,
        tag: String,
        message: String,
        source: LogSource = LogSource.APP,
        throwable: Throwable? = null,
    ) {
        if (level.priority < captureMinLevel.priority) return
        val entry = LogEntry(
            id = idGenerator.incrementAndGet(),
            timestamp = System.currentTimeMillis(),
            level = level,
            tag = tag,
            message = message,
            pid = pid,
            tid = Thread.currentThread().id,
            source = source,
            throwable = throwable?.let { stackTraceOf(it) },
        )
        synchronized(lock) { buffer.add(entry) }
        _stream.tryEmit(entry)
        _version.value = idGenerator.get()
    }

    fun v(tag: String, message: String) = log(LogLevel.VERBOSE, tag, message)
    fun d(tag: String, message: String) = log(LogLevel.DEBUG, tag, message)
    fun i(tag: String, message: String) = log(LogLevel.INFO, tag, message)
    fun w(tag: String, message: String, tr: Throwable? = null) = log(LogLevel.WARN, tag, message, throwable = tr)
    fun e(tag: String, message: String, tr: Throwable? = null) = log(LogLevel.ERROR, tag, message, throwable = tr)

    // ---------------------------------------------------------------- 读取

    /** 全量快照（按时间正序）。 */
    fun snapshot(): List<LogEntry> = synchronized(lock) { buffer.snapshot() }

    /** 按过滤条件返回快照。 */
    fun snapshot(filter: LogFilter): List<LogEntry> {
        val all = snapshot()
        return if (!filter.isActive) all else all.filter(filter::matches)
    }

    /** 当前缓冲区内的日志条数。 */
    fun size(): Int = synchronized(lock) { buffer.snapshot().size }

    /** 各来源的条数统计，用于 UI 上的来源筛选徽标。 */
    fun countBySource(): Map<LogSource, Int> {
        val out = HashMap<LogSource, Int>()
        for (e in snapshot()) out[e.source] = (out[e.source] ?: 0) + 1
        return out
    }

    /** 某个 TAG 的出现次数，用于 TAG 筛选项。 */
    fun tags(): List<Pair<String, Int>> {
        val counts = HashMap<String, Int>()
        for (e in snapshot()) counts[e.tag] = (counts[e.tag] ?: 0) + 1
        return counts.entries.sortedByDescending { it.value }.map { it.key to it.value }
    }

    // ---------------------------------------------------------------- 维护

    fun clear() {
        synchronized(lock) { buffer.clear() }
        _version.value = idGenerator.incrementAndGet()
    }

    /** 调整缓冲容量。已有日志会被丢弃，因为容量变化需要重建结构。 */
    fun resize(capacity: Int) {
        synchronized(lock) {
            val keep = buffer.snapshot().takeLast(capacity)
            buffer = RingBuffer(capacity)
            keep.forEach { buffer.add(it) }
        }
        _version.value = idGenerator.incrementAndGet()
    }

    /** 导出为 Logcat 风格的纯文本。 */
    fun export(filter: LogFilter = LogFilter()): String =
        snapshot(filter).joinToString("\n") { LogcatFormat.exportLine(it) }

    internal fun stackTraceOf(t: Throwable): String {
        val sw = StringWriter()
        PrintWriter(sw).use { t.printStackTrace(it) }
        return sw.toString()
    }
}
