package com.so.revelation.glua.core.log

import java.io.File
import java.io.RandomAccessFile
import java.nio.ByteBuffer
import java.nio.channels.FileChannel
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong

/**
 * 日志持久化。
 *
 * 不用 SQLite 而用自描述的追加文件，原因：
 * 1. `:core` 是纯 JVM 模块，`android.database.sqlite` 不可用
 * 2. 引入 Room 或 SQLDelight 会带来大量依赖与构建复杂度
 * 3. 日志是只追加、按时间顺序读取的场景，顺序文件足够
 *
 * ## 文件格式
 *
 * ```
 * MAGIC(8) | 记录*
 * 记录 := level(1) | tagLen(2) | tag | msgLen(4) | msg | ts(8) | pid(4) | tid(8) | src(1)
 * ```
 * 全部小端。写入用 [FileChannel] 追加，读取从头扫描。
 *
 * ## 性能
 *
 * 写操作在单线程执行器上批量提交（默认每 500ms 或每 200 条刷一次），
 * 不阻塞调用方。崩溃时最多丢失最后一批。
 */
class LogPersistence(
    private val file: File,
    /** 单文件上限，超过后截断到一半（保留最新的一半）。 */
    private val maxBytes: Long = 8L * 1024 * 1024,
) {

    private companion object {
        const val TAG = "LogPersistence"
        val MAGIC = byteArrayOf(0x47, 0x4C, 0x4C, 0x4F, 0x47, 0x01, 0x00, 0x00) // "GLLOG"
        const val FLUSH_INTERVAL_MS = 500L
        const val FLUSH_BATCH = 200
    }

    private val enabled = AtomicBoolean(false)
    private val pending = java.util.concurrent.ConcurrentLinkedQueue<LogEntry>()
    private val written = AtomicLong(0)
    private val executor = Executors.newSingleThreadExecutor { r ->
        Thread(r, "log-persist").apply { isDaemon = true }
    }

    @Volatile
    private var channel: FileChannel? = null

    /** 已落盘的条数。 */
    val persistedCount: Long get() = written.get()

    fun start() {
        if (enabled.getAndSet(true)) return
        runCatching {
            file.parentFile?.mkdirs()
            val raf = RandomAccessFile(file, "rw")
            channel = raf.channel
            if (file.length() == 0L) {
                raf.write(MAGIC)
            }
            GLog.i(TAG, "日志持久化已启用: ${file.absolutePath} (${file.length()} 字节)")
        }.onFailure {
            GLog.e(TAG, "无法打开日志文件", it)
            enabled.set(false)
            return
        }

        executor.execute {
            while (enabled.get()) {
                try {
                    Thread.sleep(FLUSH_INTERVAL_MS)
                    flushPending()
                } catch (_: InterruptedException) {
                    break
                } catch (t: Throwable) {
                    GLog.w(TAG, "刷盘异常: ${t.message}")
                }
            }
        }
    }

    fun stop() {
        if (!enabled.getAndSet(false)) return
        flushPending()
        runCatching { channel?.close() }
        channel = null
        executor.shutdown()
        executor.awaitTermination(2, TimeUnit.SECONDS)
        GLog.i(TAG, "日志持久化已停止，共写入 ${written.get()} 条")
    }

    /** 记录一条。非阻塞。 */
    fun record(entry: LogEntry) {
        if (!enabled.get()) return
        pending.add(entry)
        if (pending.size >= FLUSH_BATCH) {
            executor.execute { flushPending() }
        }
    }

    /** 读取全部日志。损坏的记录会被跳过。 */
    fun readAll(limit: Int = 5000): List<LogEntry> {
        val f = file
        if (!f.exists() || f.length() <= MAGIC.size) return emptyList()
        return runCatching {
            val out = ArrayList<LogEntry>()
            val buf = ByteBuffer.wrap(f.readBytes())
            buf.position(MAGIC.size)
            while (buf.remaining() > 27) {
                val start = buf.position()
                val entry = runCatching { readOne(buf) }.getOrNull()
                if (entry == null) {
                    buf.position(start + 1) // 跳过损坏字节继续
                } else {
                    out.add(entry)
                }
            }
            if (out.size > limit) out.takeLast(limit) else out
        }.getOrElse {
            GLog.w(TAG, "读取日志失败: ${it.message}")
            emptyList()
        }
    }

    fun clear() {
        pending.clear()
        runCatching {
            val ch = channel ?: return@runCatching
            ch.truncate(0)
            ch.position(0)
            ch.write(ByteBuffer.wrap(MAGIC))
            written.set(0)
            GLog.i(TAG, "日志文件已清空")
        }
    }

    // ---------------------------------------------------------- 内部

    private fun flushPending() {
        val ch = channel ?: return
        if (pending.isEmpty()) return

        val batch = ArrayList<LogEntry>()
        while (true) {
            val e = pending.poll() ?: break
            batch.add(e)
            if (batch.size >= FLUSH_BATCH * 2) break
        }
        if (batch.isEmpty()) return

        runCatching {
            // 超限则截断保留后半
            if (ch.size() > maxBytes) {
                truncateHalf(ch)
            }
            for (e in batch) {
                val bytes = encode(e)
                val bb = ByteBuffer.wrap(bytes)
                while (bb.hasRemaining()) ch.write(bb)
            }
            ch.force(false)
            written.addAndGet(batch.size.toLong())
        }.onFailure {
            GLog.w(TAG, "写入日志失败: ${it.message}")
        }
    }

    /** 截断文件到一半大小，保留较新的记录。 */
    private fun truncateHalf(ch: FileChannel) {
        val size = ch.size()
        val half = size / 2
        // 找到 half 之后的第一条记录边界
        val tail = ByteArray((size - half).toInt())
        ch.position(half)
        ch.read(ByteBuffer.wrap(tail))

        var offset = 0
        val buf = ByteBuffer.wrap(tail)
        while (buf.remaining() > 27) {
            val p = buf.position()
            if (runCatching { readOne(buf) }.isSuccess) { offset = p; break }
            buf.position(p + 1)
        }

        val keep = tail.copyOfRange(offset, tail.size)
        ch.truncate(0)
        ch.position(0)
        ch.write(ByteBuffer.wrap(MAGIC))
        ch.write(ByteBuffer.wrap(keep))
        ch.force(false)
        GLog.i(TAG, "日志文件超限，已截断保留 ${keep.size} 字节")
    }

    private fun encode(e: LogEntry): ByteArray {
        val tag = e.tag.toByteArray(Charsets.UTF_8)
        val msg = e.message.toByteArray(Charsets.UTF_8)
        val throwable = e.throwable?.toByteArray(Charsets.UTF_8)
        val size = 1 + 2 + tag.size + 4 + msg.size + 8 + 4 + 8 + 1 + 4 + (throwable?.size ?: 0)
        val buf = ByteBuffer.allocate(size).order(java.nio.ByteOrder.LITTLE_ENDIAN)
        buf.put(e.level.priority.toByte())
        buf.putShort(tag.size.coerceAtMost(65535).toShort())
        buf.put(tag)
        buf.putInt(msg.size)
        buf.put(msg)
        buf.putLong(e.timestamp)
        buf.putInt(e.pid)
        buf.putLong(e.tid)
        buf.put(e.source.ordinal.toByte())
        if (throwable != null) {
            buf.putInt(throwable.size)
            buf.put(throwable)
        } else {
            buf.putInt(0)
        }
        return buf.array()
    }

    private fun readOne(buf: ByteBuffer): LogEntry {
        buf.order(java.nio.ByteOrder.LITTLE_ENDIAN)
        val level = LogLevel.fromPriority(buf.get().toInt() and 0xFF)
        val tagLen = buf.short.toInt() and 0xFFFF
        if (tagLen > 512 || buf.remaining() < tagLen) throw IllegalStateException("tag 长度异常")
        val tagBytes = ByteArray(tagLen).also { buf.get(it) }
        val msgLen = buf.int
        if (msgLen < 0 || msgLen > 1_000_000 || buf.remaining() < msgLen) throw IllegalStateException("msg 长度异常")
        val msgBytes = ByteArray(msgLen).also { buf.get(it) }
        val ts = buf.long
        val pid = buf.int
        val tid = buf.long
        val srcOrd = buf.get().toInt() and 0xFF
        val thrLen = buf.int
        val throwable = if (thrLen in 1..1_000_000 && buf.remaining() >= thrLen) {
            ByteArray(thrLen).also { buf.get(it) }.toString(Charsets.UTF_8)
        } else null

        return LogEntry(
            id = ts,
            timestamp = ts,
            level = level,
            tag = tagBytes.toString(Charsets.UTF_8),
            message = msgBytes.toString(Charsets.UTF_8),
            pid = pid,
            tid = tid,
            source = LogSource.entries.getOrElse(srcOrd) { LogSource.APP },
            throwable = throwable,
        )
    }
}
