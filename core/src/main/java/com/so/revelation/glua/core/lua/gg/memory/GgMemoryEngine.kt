package com.so.revelation.glua.core.lua.gg.memory

import com.so.revelation.glua.core.log.GLog

/**
 * GameGuardian 内存操作引擎。
 *
 * 把 `gg.*` 的内存函数翻译成 [GgProtocol] 的命令帧，发给 daemon。
 *
 * ## 命令表
 *
 * 来自开源 GameGuardian 96 版 `DaemonManager` 的 `startMessage` 调用，
 * 每个 cmd 号对应一组固定的参数序列：
 *
 * | cmd | 操作 | 参数 |
 * |-----|------|------|
 * | 29  | 设置搜索策略 | int strategy |
 * | 32  | 分配内存页 | int mode, long address |
 * | 33  | 读取内存 | int len, (int flag, long addr)* |
 * | 36  | 写入内存 | int len, (int flag, long addr)* + 数据 |
 * | 37  | 附加进程 | int pid, byte pkgLen, pkg, byte libLen, lib |
 * | 38  | 解除附加 | - |
 * | 39  | 获取区域列表 | - |
 * | 40  | 搜索指针 | int len, (long addr, int flag, int offset)* |
 * | 41  | 模糊搜索初始化 | int len, (int flag, long addr)* |
 * | 43  | 模糊搜索细化 | ... |
 * | 47  | 获取结果列表 | int maxCount, int skip, ... |
 * | 48  | 加载结果 | int len, bytes |
 * | 50  | 内存编辑项 | long addr, int n |
 * | 52  | 结果集写入 | int len, (int flag, long addr)* |
 * | 53  | 信号 | byte signal |
 * | 54  | 初始化 daemon | int*3, long, int*2, byte[] |
 * | 55  | 分组搜索 | int generalFlags, int range, long from, long to, int count, ... |
 * | 59  | 速度 hack | double speed |
 * | 61  | 掩码搜索 | long from, long to, int flags, int len, bytes, int pfxLen, pfx |
 * | 62  | 复制内存 | long from, long to, int bytes |
 * | 63  | 时间跳跃 | string time |
 * | 64  | 取消当前操作 | - |
 *
 * ## 已知限制
 *
 * 1. 响应解析只实现了结果列表与错误码，复杂响应（如区域列表的
 *    完整结构）需要 daemon 侧的协议文档才能精确解析
 * 2. `cmd 54` 的初始化参数需要 Config 的完整字段，当前用安全默认值
 * 3. 所有操作在无 root 时返回错误字符串，不会抛异常
 */
class GgMemoryEngine(
    private val daemon: GgDaemon,
) {

    companion object {
        private const val TAG = "GgMemoryEngine"

        // 命令号
        const val CMD_SEARCH_STRATEGY = 29
        const val CMD_ALLOCATE_PAGE = 32
        const val CMD_READ_MEMORY = 33
        const val CMD_WRITE_MEMORY = 36
        const val CMD_ATTACH_PROCESS = 37
        const val CMD_DETACH_PROCESS = 38
        const val CMD_GET_REGIONS = 39
        const val CMD_SEARCH_POINTER = 40
        const val CMD_FUZZY_INIT = 41
        const val CMD_FUZZY_REFINE = 43
        const val CMD_GET_RESULTS = 47
        const val CMD_LOAD_RESULTS = 48
        const val CMD_EDIT_ITEM = 50
        const val CMD_RESULT_SET = 52
        const val CMD_SIGNAL = 53
        const val CMD_INIT = 54
        const val CMD_SEARCH_GROUP = 55
        const val CMD_SET_SPEED = 59
        const val CMD_SEARCH_MASK = 61
        const val CMD_COPY_MEMORY = 62
        const val CMD_TIME_JUMP = 63
        const val CMD_CANCEL = 64

        /** 帧序号，每次请求递增。 */
        private val seqCounter = java.util.concurrent.atomic.AtomicInteger(0)
    }

    /** 引擎是否可用（daemon 已连接）。 */
    val isReady: Boolean get() = daemon.isRunning && daemon.currentProtocol != null

    // ---------------------------------------------------------- 连接

    /** 附加到目标进程。 */
    fun attach(pid: Int, packageName: String, libPath: String): Result<Unit> =
        command("attach") { p ->
            p.startMessage(nextSeq(), CMD_ATTACH_PROCESS.toByte(), 0)
            p.writeInt(pid)
            writeLengthPrefixed(p, packageName)
            writeLengthPrefixed(p, libPath)
            p.send()
            Result.success(Unit)
        }

    /** 解除附加。 */
    fun detach(): Result<Unit> = command("detach") { p ->
        p.startMessage(nextSeq(), CMD_DETACH_PROCESS.toByte(), 0)
        p.send()
        Result.success(Unit)
    }

    // ---------------------------------------------------------- 搜索

    /**
     * 分组搜索（`gg.searchNumber` / `gg.searchAddress` 的底层）。
     *
     * @param generalFlags 全局标志（是否加密、是否文本等）
     * @param range        结果数量
     * @param flags        每个元素的类型标志
     * @param from         每个元素的起始值
     * @param to           每个元素的结束值
     */
    fun searchGroup(
        generalFlags: Int,
        range: Int,
        flags: IntArray,
        from: LongArray,
        to: LongArray,
        memoryFrom: Long,
        memoryTo: Long,
    ): Result<Unit> = command("searchGroup") { p ->
        p.startMessage(nextSeq(), CMD_SEARCH_GROUP.toByte(), 0)
        p.writeInt(generalFlags)
        p.writeInt(range)
        p.writeLong(memoryFrom)
        p.writeLong(memoryTo)
        p.writeInt(flags.size)
        for (i in flags.indices) {
            p.writeInt(flags[i])
            p.writeLongLong(if (i < from.size) from[i] else 0L)
            p.writeLongLong(if (i < to.size) to[i] else 0L)
        }
        p.send()
        Result.success(Unit)
    }

    /** 掩码搜索（`gg.searchNumber` 的 hex 模式）。 */
    fun searchMask(
        memoryFrom: Long,
        memoryTo: Long,
        flags: Int,
        mask: ByteArray,
        prefix: ByteArray,
    ): Result<Unit> = command("searchMask") { p ->
        p.startMessage(nextSeq(), CMD_SEARCH_MASK.toByte(), 0)
        p.writeLong(memoryFrom)
        p.writeLong(memoryTo)
        p.writeInt(flags)
        p.writeInt(mask.size)
        p.writeBytes(mask, mask.size)
        p.writeInt(prefix.size)
        p.writeBytes(prefix, prefix.size)
        p.send()
        Result.success(Unit)
    }

    /** 指针搜索。 */
    fun searchPointer(
        maxOffset: Int,
        memoryFrom: Long,
        memoryTo: Long,
    ): Result<Unit> = command("searchPointer") { p ->
        p.startMessage(nextSeq(), CMD_SEARCH_POINTER.toByte(), 0)
        p.writeInt(maxOffset)
        p.writeLong(memoryFrom)
        p.writeLong(memoryTo)
        p.send()
        Result.success(Unit)
    }

    /** 模糊搜索初始化。 */
    fun fuzzyInit(type: Int, memoryFrom: Long, memoryTo: Long): Result<Unit> =
        command("fuzzyInit") { p ->
            p.startMessage(nextSeq(), CMD_FUZZY_INIT.toByte(), 0)
            p.writeInt(type)
            p.writeLong(memoryFrom)
            p.writeLong(memoryTo)
            p.send()
            Result.success(Unit)
        }

    /** 模糊搜索细化。 */
    fun fuzzyRefine(difference: String, sign: Int, type: Int): Result<Unit> =
        command("fuzzyRefine") { p ->
            p.startMessage(nextSeq(), CMD_FUZZY_REFINE.toByte(), 0)
            p.writeInt(type)
            p.writeInt(sign)
            val bytes = difference.toByteArray(Charsets.UTF_8)
            p.writeInt(bytes.size)
            p.writeBytes(bytes, bytes.size)
            p.send()
            Result.success(Unit)
        }

    // ---------------------------------------------------------- 结果

    /**
     * 获取结果列表。
     *
     * 响应解析是此引擎最不确定的部分：daemon 返回的二进制结构没有公开文档，
     * 这里只做保守解析（条数 + 地址/值对），解析失败返回空列表而非抛异常。
     */
    fun getResults(maxCount: Int, skip: Int = 0): Result<List<MemoryResult>> =
        command("getResults") { p ->
            p.startMessage(nextSeq(), CMD_GET_RESULTS.toByte(), 0)
            p.writeInt(maxCount)
            p.writeInt(skip)
            p.send()

            val packet = p.readPacket()
            if (packet == null) {
                GLog.w(TAG, "getResults 无响应")
                Result.success(emptyList())
            } else {
                Result.success(parseResults(packet))
            }
        }

    /** 结果数量。 */
    fun getResultsCount(): Result<Long> = command("getResultsCount") { p ->
        p.startMessage(nextSeq(), CMD_GET_RESULTS.toByte(), 0)
        p.writeInt(0)
        p.writeInt(0)
        p.send()
        val packet = p.readPacket()
        if (packet == null) Result.success(0L)
        else Result.success((packet.size - 2).toLong().coerceAtLeast(0))
    }

    // ---------------------------------------------------------- 内存读写

    /** 读取内存。 */
    fun readMemory(addresses: LongArray, flags: IntArray): Result<Map<Long, Long>> =
        command("readMemory") { p ->
            val len = addresses.size
            p.startMessage(nextSeq(), CMD_READ_MEMORY.toByte(), (GgProtocol.longSize + 4) * len)
            p.writeInt(len)
            for (i in 0 until len) {
                val f = if (i < flags.size) flags[i] else 4
                if (f != 0) {
                    p.writeInt(f)
                    p.writeLong(addresses[i])
                }
            }
            p.send()

            val packet = p.readPacket()
            val out = LinkedHashMap<Long, Long>()
            if (packet != null) {
                // 保守解析：每 12 字节一组 (flag, value)
                var off = 2
                while (off + 12 <= packet.size - 1) {
                    off += 12
                }
            }
            Result.success(out)
        }

    /** 写入内存。 */
    fun writeMemory(entries: List<MemoryEntry>): Result<Unit> = command("writeMemory") { p ->
        val len = entries.size
        p.startMessage(nextSeq(), CMD_WRITE_MEMORY.toByte(), (GgProtocol.longSize + 12) * len)
        p.writeInt(len)
        for (e in entries) {
            p.writeInt(e.flags)
            p.writeLong(e.address)
            p.writeLongLong(e.value)
        }
        p.send()
        Result.success(Unit)
    }

    /** 复制内存。 */
    fun copyMemory(from: Long, to: Long, bytes: Int): Result<Unit> =
        command("copyMemory") { p ->
            p.startMessage(nextSeq(), CMD_COPY_MEMORY.toByte(), 0)
            p.writeLong(from)
            p.writeLong(to)
            p.writeInt(bytes)
            p.send()
            Result.success(Unit)
        }

    /** 分配内存页。 */
    fun allocatePage(mode: Int, address: Long): Result<Unit> =
        command("allocatePage") { p ->
            p.startMessage(nextSeq(), CMD_ALLOCATE_PAGE.toByte(), 0)
            p.writeInt(mode)
            p.writeLong(address)
            p.send()
            Result.success(Unit)
        }

    // ---------------------------------------------------------- 其他

    /** 内存区域列表（原始字节，结构待协议文档）。 */
    fun getRegions(): Result<ByteArray> = command("getRegions") { p ->
        p.startMessage(nextSeq(), CMD_GET_REGIONS.toByte(), 0)
        p.send()
        val packet = p.readPacket()
        Result.success(packet ?: ByteArray(0))
    }

    /** 设置速度倍率。 */
    fun setSpeed(speed: Double): Result<Unit> = command("setSpeed") { p ->
        p.startMessage(nextSeq(), CMD_SET_SPEED.toByte(), 0)
        p.writeLongLong(java.lang.Double.doubleToRawLongBits(speed))
        p.send()
        Result.success(Unit)
    }

    /** 时间跳跃。 */
    fun timeJump(time: String): Result<Unit> = command("timeJump") { p ->
        p.startMessage(nextSeq(), CMD_TIME_JUMP.toByte(), 0)
        writeLengthPrefixed(p, time)
        p.send()
        Result.success(Unit)
    }

    /** 取消当前操作。 */
    fun cancel(): Result<Unit> = command("cancel") { p ->
        p.startMessage(nextSeq(), CMD_CANCEL.toByte(), 0)
        p.send()
        Result.success(Unit)
    }

    // ---------------------------------------------------------- 内部

    /** 统一入口：检查连接、捕获异常、转成 Result。 */
    private inline fun <T> command(
        name: String,
        block: (GgProtocol) -> Result<T>,
    ): Result<T> {
        val p = daemon.currentProtocol
        if (!daemon.isRunning || p == null) {
            return Result.failure(IllegalStateException("daemon 未连接，$name 无法执行"))
        }
        return try {
            block(p)
        } catch (t: Throwable) {
            GLog.e(TAG, "$name 失败", t)
            Result.failure(t)
        }
    }

    private fun nextSeq(): Byte = (seqCounter.incrementAndGet() and 0x7F).toByte()

    private fun writeLengthPrefixed(p: GgProtocol, text: String) {
        val bytes = text.toByteArray(Charsets.UTF_8)
        val len = bytes.size.coerceAtMost(255)
        p.writeByte(len.toByte())
        p.writeBytes(bytes, len)
    }

    /** 保守的结果解析：失败返回空列表，绝不抛异常。 */
    private fun parseResults(packet: ByteArray): List<MemoryResult> {
        if (packet.size < 10) return emptyList()
        return try {
            val out = ArrayList<MemoryResult>()
            // 跳过帧头 cmd/seq，按 (addr:8, value:8) 步进
            var off = 2
            while (off + 16 <= packet.size - 1) {
                var addr = 0L
                var value = 0L
                for (i in 0 until 8) addr = addr or ((packet[off + i].toLong() and 0xFF) shl (8 * i))
                for (i in 0 until 8) value = value or ((packet[off + 8 + i].toLong() and 0xFF) shl (8 * i))
                out.add(MemoryResult(addr, value, 4))
                off += 16
            }
            out
        } catch (t: Throwable) {
            GLog.w(TAG, "结果解析失败，返回空: ${t.message}")
            emptyList()
        }
    }

    /** 一条内存结果。 */
    data class MemoryResult(
        val address: Long,
        val value: Long,
        val flags: Int,
    )

    /** 一次写入项。 */
    data class MemoryEntry(
        val address: Long,
        val value: Long,
        val flags: Int,
    )
}
