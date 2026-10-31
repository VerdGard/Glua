package com.so.revelation.glua.core.lua.gg.memory

import com.so.revelation.glua.core.log.GLog
import java.io.BufferedInputStream
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.util.zip.CRC32

/**
 * GameGuardian Java 层与 daemon 进程之间的二进制协议。
 *
 * 移植自开源 GameGuardian 96 版的 [InOut]，做 Kotlin 化与去 UI 依赖。
 * 这是与 daemon 通信的唯一通道：Java 侧把请求编码成字节流写入 daemon 的
 * stdin，再从 stdout 读回响应。
 *
 * ## 帧格式
 *
 * 下行（daemon -> Java）：
 * ```
 * 0x02 | length(4, LE) | payload | 0x03
 * ```
 * payload 的前两个字节是 `cmd` 与 `seq`，其后是参数。
 *
 * 上行（Java -> daemon）：
 * ```
 * cmd(1) | seq(1) | args... | crc32(4)
 * ```
 *
 * ## int 混淆
 *
 * [writeInt] 会对值按位异或 [byteOrderMask]（默认 0x0F）。
 * 这不是加密，只是防止明文协议被轻易嗅探——daemon 侧做同样的异或还原。
 * [writeLong] / [writeLongLong] 不混淆。
 *
 * ## FIFO 模式
 *
 * [fifo] 为 false 时（默认），流会经过 [EncodeOutputStream]/[DecodeInputStream]
 * 做十六进制封装；为 true 时直接用原始字节流。具体用哪种取决于
 * daemon 的启动参数，由 [GgDaemon] 在连接建立时设置。
 */
class GgProtocol {

    companion object {
        private const val TAG = "GgProtocol"

        /** 单帧上限 10 MB。 */
        const val BUFFER_LEN = 10 * 1024 * 1024

        private const val CURRENT_INC = 1024
        private const val MAX_SIZE_WAIT = 40
        const val QE_ALIGN = 4

        /** 帧起始/结束标记。 */
        private const val FRAME_START = 0x02.toByte()
        private const val FRAME_END = 0x03.toByte()

        /** int 混淆掩码。 */
        @Volatile
        var byteOrderMask: Int = 15

        /** 是否使用原始字节流（不做 hex 封装）。 */
        @Volatile
        var fifo: Boolean = false

        /** 指针宽度。 */
        @Volatile
        var longSize: Int = 4

        /** 目标进程是否 64 位。 */
        @Volatile
        var x64: Boolean = false

        private val HEX = "0123456789ABCDEF".toCharArray()

        fun bytesToHex(data: ByteArray, start: Int, length: Int): String {
            val sb = StringBuilder(length * 2)
            var i = start
            val end = minOf(start + length, data.size)
            while (i < end) {
                val b = data[i].toInt() and 0xFF
                sb.append(HEX[b ushr 4]).append(HEX[b and 0x0F])
                i++
            }
            return sb.toString()
        }

        fun dump(data: ByteArray, start: Int, length: Int): String {
            if (data.size - 1 < start) {
                GLog.w(TAG, "dump 越界: size=${data.size} start=$start len=$length")
                return ""
            }
            val len = if (data.size < start + length) data.size - start else length
            val sb = StringBuilder()
            var index = 0
            while (index < len) {
                val count = minOf(len - index, 32)
                sb.append(bytesToHex(data, start + index, count))
                sb.append("'")
                sb.append(String(data, start + index, count, Charsets.ISO_8859_1))
                sb.append("'\n")
                index += count
            }
            return sb.toString()
        }
    }

    // ---------------------------------------------------------- 状态

    private val readData = ByteArray(4)
    private val readBuffer: ByteBuffer = ByteBuffer.wrap(readData).order(ByteOrder.LITTLE_ENDIAN)

    private val writeData = ByteArray(8)
    private val writeBuffer: ByteBuffer = ByteBuffer.wrap(writeData).order(ByteOrder.LITTLE_ENDIAN)

    private var current = ByteArray(CURRENT_INC)
    private var currentUsed = 0
    private var truncate = false

    @Volatile
    private var started = false

    private var input: InputStream? = null
    private var output: OutputStream? = null

    private val waitQueue = ArrayList<ByteArray>()
    private var crc: CRC32? = null

    // ---------------------------------------------------------- 连接

    /** 绑定 daemon 进程的 stdin/stdout。 */
    fun setStreams(inputStream: InputStream, out: OutputStream) {
        var ins: InputStream = BufferedInputStream(inputStream, 65536)
        var outs: OutputStream = out
        if (!fifo) {
            outs = EncodeOutputStream(out)
            ins = DecodeInputStream(ins)
        }
        input = ins
        output = outs
    }

    fun isStarted(): Boolean = started
    fun setStarted(value: Boolean) { started = value }

    fun clear() {
        synchronized(waitQueue) { waitQueue.clear() }
        currentUsed = 0
        truncate = true
    }

    // ---------------------------------------------------------- 读

    /**
     * 读取一个完整帧。
     * @return payload（不含帧头帧尾）；协议错误返回 null
     */
    @Throws(IOException::class)
    fun readPacket(): ByteArray? {
        var skip: ByteArray? = null
        var skipped = 0

        // 同步到帧起始标记
        while (true) {
            val b = readByte()
            if (b == FRAME_START) break
            if (skip == null && (b == 0x0A.toByte() || b == 0x3B.toByte())) continue
            if (skip == null) skip = ByteArray(4096)
            if (skipped < skip.size) skip[skipped] = b
            skipped++
            if (skipped >= skip.size || skipped % 10 == 0) {
                GLog.d(TAG, "daemon 输入异常: $b\n" + dump(skip, 0, skipped))
            }
        }
        if (skip != null) {
            GLog.d(TAG, "daemon 输入异常（共 $skipped 字节）\n" + dump(skip, 0, skipped))
        }

        val len = readInt()
        if (len > BUFFER_LEN || len < 2) {
            GLog.w(TAG, "帧长度非法: $len")
            return null
        }

        val buffer = ByteArray(len)
        var read = 0
        while (read < len) {
            val actual = input?.read(buffer, read, len - read) ?: -1
            if (actual <= 0) {
                if (read == 0) read = -1
                break
            } else {
                read += actual
            }
        }

        if (len == 0 || buffer[len - 1] != FRAME_END) {
            GLog.w(TAG, "帧结束标记错误: ${if (len > 0) buffer[len - 1] else "empty"}")
            return null
        }
        return buffer
    }

    private fun readByte(): Byte {
        while (true) {
            val d = input?.read() ?: -1
            if (d != -1) return d.toByte()
            // daemon 已关闭
            if (input == null) throw IOException("输入流未设置")
        }
    }

    private fun readInt(): Int {
        var read = 0
        while (read < 4) {
            val actual = input?.read(readData, read, 4 - read) ?: -1
            if (actual <= 0) {
                if (read == 0) return -1
            } else {
                read += actual
            }
        }
        return readBuffer.getInt(0)
    }

    // ---------------------------------------------------------- 写

    private fun checkSize(size: Int, trunc: Boolean) {
        if (truncate || size > current.size) {
            current = ByteArray(size + CURRENT_INC)
            currentUsed = 0
        }
    }

    fun truncate() {
        currentUsed = 0
        truncate = true
    }

    fun writeBytes(buffer: ByteArray, size: Int) {
        checkSize(currentUsed + size, truncate)
        System.arraycopy(buffer, 0, current, currentUsed, size)
        currentUsed += size
    }

    fun writeByte(value: Byte) {
        checkSize(currentUsed + 1, truncate)
        current[currentUsed] = value
        currentUsed++
    }

    /** 开始一条新消息：清空缓冲，写入 cmd 与 seq。 */
    fun startMessage(seq: Byte, cmd: Byte, capacity: Int) {
        checkSize(capacity + 2, truncate)
        truncate = false
        current[0] = cmd
        current[1] = seq
        currentUsed = 2
    }

    /** 写 int，按 [byteOrderMask] 异或混淆。 */
    fun writeInt(value: Int) {
        writeBuffer.putInt(0, byteOrderMask xor value)
        writeBytes(writeData, 4)
    }

    fun writeLong(value: Long) {
        // 32 位：拆成高低两个 int，低在前
        writeInt((value and 0xFFFFFFFFL).toInt())
        writeInt((value ushr 32).toInt())
    }

    fun writeLongLong(value: Long) {
        writeBuffer.putLong(0, value)
        writeBytes(writeData, 8)
    }

    /** 发送当前缓冲。 */
    @Throws(IOException::class)
    @Synchronized
    fun send() {
        if (!started) {
            synchronized(waitQueue) { waitQueue.add(current.copyOf(currentUsed)) }
            return
        }
        val out = output ?: throw IOException("输出流未设置")
        val crcValue = crc()
        writeLongLong(crcValue)
        out.write(current, 0, currentUsed)
        out.flush()
        currentUsed = 0
    }

    /** 冲刷排队中的消息。 */
    @Throws(IOException::class)
    fun sendWait() {
        synchronized(waitQueue) {
            if (waitQueue.isEmpty()) return
            val out = output ?: return
            for (data in waitQueue) {
                out.write(data)
            }
            waitQueue.clear()
            out.flush()
        }
    }

    /** 计算当前缓冲（跳过 cmd/seq）的 CRC32。 */
    fun crc(): Long {
        var c = crc
        if (c == null) {
            c = CRC32()
            crc = c
        } else {
            c.reset()
        }
        if (currentUsed > 2) {
            c.update(current, 2, currentUsed - 2)
        }
        return c.value
    }

    // ---------------------------------------------------------- hex 封装流

    /**
     * 把二进制解码成 daemon 期望的 hex 形式。
     *
     * daemon 在非 fifo 模式下用 ASCII hex 传输，且用 `0x02..0x03` 之外的特殊
     * 字符做转义。这里实现 [InOut.DecodeInputStream] 的等价逻辑。
     */
    private class DecodeInputStream(private val base: InputStream) : InputStream() {

        override fun read(): Int {
            val hi = base.read()
            if (hi < 0) return -1
            val lo = base.read()
            if (lo < 0) return -1
            return (hexVal(hi) shl 4) or hexVal(lo)
        }

        override fun read(buffer: ByteArray, offset: Int, size: Int): Int {
            var count = 0
            while (count < size) {
                val b = read()
                if (b < 0) break
                buffer[offset + count] = b.toByte()
                count++
            }
            return if (count == 0) -1 else count
        }

        private fun hexVal(c: Int): Int = when (c) {
            in '0'.code..'9'.code -> c - '0'.code
            in 'a'.code..'f'.code -> c - 'a'.code + 10
            in 'A'.code..'F'.code -> c - 'A'.code + 10
            else -> 0
        }
    }

    /**
     * 把二进制编码成 hex 形式写出。
     * 每字节输出两个 hex 字符（大写）。
     */
    private class EncodeOutputStream(private val base: OutputStream) : OutputStream() {

        override fun write(b: Int) {
            base.write(HEX[(b ushr 4) and 0x0F].code)
            base.write(HEX[b and 0x0F].code)
        }

        override fun write(b: ByteArray) = write(b, 0, b.size)

        override fun write(b: ByteArray, off: Int, len: Int) {
            for (i in off until off + len) write(b[i].toInt())
        }

        override fun flush() = base.flush()
        override fun close() = base.close()
    }
}
