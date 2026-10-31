package com.so.revelation.glua.core.lua.gg.memory

import com.so.revelation.glua.core.log.GLog
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream

/**
 * GameGuardian daemon 进程管理。
 *
 * ## 背景
 *
 * 内存读写必须由独立进程完成，原因有三：
 * 1. 需要 root 权限访问 `/proc/<pid>/mem`
 * 2. 需要 ptrace 附加到目标进程
 * 3. 崩溃隔离 —— daemon 挂了不影响 App
 *
 * 因此 APK 把 daemon 二进制以 `res/raw/chunk*` 形式分发（每个文件是 ELF），
 * 首次使用时提取到私有目录、`chmod 755`、然后 `exec` 起来，
 * 通过 stdin/stdout 用 [GgProtocol] 通信。
 *
 * ## 架构选择
 *
 * `chunk` 后的字符标识架构与用途，见 [LibId]。
 * 运行时按设备 ABI 挑选：优先 64 位 PIE。
 *
 * ## 无 root 时的行为
 *
 * [start] 会检测 root。没有 root 时返回 [StartResult.NoRoot]，
 * 上层据此让 `gg.*` 函数返回错误字符串，而不是让脚本崩溃。
 */
class GgDaemon(
    private val filesDir: File,
    /** 从 APK 读取 raw 资源。参数是 chunk 名（如 "5"、"a"）。 */
    private val rawProvider: (String) -> InputStream?,
) {

    companion object {
        private const val TAG = "GgDaemon"

        /** daemon 二进制在私有目录的名字前缀。 */
        private const val LIB_PREFIX = "lib"
        private const val LIB_SUFFIX = ".so"

        /**
         * daemon 库标识符。
         *
         * 命名对应原版 GameGuardian 的 `DaemonLoader` 常量表：
         * - 数字 = PIE 模式（Android 5.0+）
         * - 字母 = 非 PIE / stub / patch
         */
        enum class LibId(val id: Char, val desc: String, val is64: Boolean) {
            X86_64_PIE('2', "x86_64 PIE", true),
            X86_PIE('1', "x86 PIE", false),
            ARM64_PIE('5', "arm64 PIE", true),
            ARM_V7A_PIE('8', "armv7a PIE", false),
            ARM_PIE('b', "arm PIE", false),
            X86_64('q', "x86_64", true),
            X86('0', "x86", false),
            ARM_V7A('7', "armv7a", false),
            ARM('a', "arm", false),
        }

        /** 按 SDK 与 ABI 排序的候选列表。 */
        fun candidatesFor(sdk: Int, abis: Array<String>): List<LibId> {
            val is64 = abis.any { it.contains("64") }
            val isX86 = abis.any { it.startsWith("x86") }
            return when {
                sdk < 16 -> listOf(LibId.X86, LibId.ARM_V7A, LibId.ARM)
                sdk < 21 -> listOf(LibId.X86_PIE, LibId.X86, LibId.ARM_V7A_PIE, LibId.ARM_V7A)
                isX86 && is64 -> listOf(LibId.X86_64_PIE, LibId.X86_PIE, LibId.X86)
                isX86 -> listOf(LibId.X86_PIE, LibId.X86)
                is64 -> listOf(LibId.ARM64_PIE, LibId.ARM_V7A_PIE, LibId.ARM_PIE)
                else -> listOf(LibId.ARM_V7A_PIE, LibId.ARM_PIE, LibId.ARM_V7A, LibId.ARM)
            }
        }
    }

    /** 启动结果。 */
    sealed interface StartResult {
        /** 成功，daemon 已就绪。 */
        data class Success(val libId: LibId, val path: String, val pid: Int) : StartResult

        /** 设备未 root，无法运行 daemon。 */
        data class NoRoot(val reason: String) : StartResult

        /** 找不到适配当前 ABI 的二进制。 */
        data object UnsupportedAbi : StartResult

        /** 提取或启动失败。 */
        data class Failed(val reason: String, val cause: Throwable? = null) : StartResult
    }

    private var process: Process? = null
    private var protocol: GgProtocol? = null
    private var libId: LibId? = null

    val isRunning: Boolean get() = process?.isAlive == true
    val currentProtocol: GgProtocol? get() = protocol

    /** daemon 工作目录（私有，需可执行）。 */
    fun daemonDir(): File = File(filesDir, "gg").also { it.mkdirs() }

    /**
     * 启动 daemon。
     *
     * @param rooted 由外部探测传入（[com.so.revelation.glua.core.lua.gg.GgEnvironment]）
     * @param sdk    Build.VERSION.SDK_INT
     * @param abis   Build.SUPPORTED_ABIS
     */
    fun start(rooted: Boolean, sdk: Int, abis: Array<String>): StartResult {
        if (!rooted) {
            return StartResult.NoRoot("设备未 root，无法启动内存读写 daemon")
        }
        if (isRunning) {
            val id = libId ?: return StartResult.Failed("状态不一致：进程在但库标识缺失")
            return StartResult.Success(id, daemonPath(id), processId(process))
        }

        val dir = daemonDir()
        for (candidate in candidatesFor(sdk, abis)) {
            val file = File(dir, libName(candidate))
            if (!file.exists()) {
                if (!extract(candidate, file)) continue
            }
            if (!makeExecutable(file)) {
                GLog.w(TAG, "无法赋予执行权限: ${file.absolutePath}")
                continue
            }
            val result = launch(candidate, file)
            if (result is StartResult.Success) return result
            GLog.w(TAG, "${candidate.desc} 启动失败，尝试下一个")
        }
        return StartResult.UnsupportedAbi
    }

    /** 停止 daemon。 */
    fun stop() {
        runCatching {
            protocol?.clear()
            process?.destroy()
        }
        process = null
        protocol = null
        libId = null
        GLog.i(TAG, "daemon 已停止")
    }

    // ---------------------------------------------------------- 内部

    private fun libName(id: LibId): String = "$LIB_PREFIX${id.id}$LIB_SUFFIX"

    private fun daemonPath(id: LibId): String = File(daemonDir(), libName(id)).absolutePath

    /** 从 res/raw 提取 ELF 到私有目录。 */
    private fun extract(id: LibId, target: File): Boolean {
        val name = "chunk${id.id}"
        val stream = rawProvider(name) ?: run {
            GLog.w(TAG, "资源不存在: $name")
            return false
        }
        return runCatching {
            target.parentFile?.mkdirs()
            stream.use { ins ->
                FileOutputStream(target).use { out ->
                    ins.copyTo(out, 65536)
                }
            }
            GLog.i(TAG, "已提取 $name -> ${target.name} (${target.length()} 字节)")
            target.length() > 0
        }.getOrElse {
            GLog.e(TAG, "提取 $name 失败", it)
            false
        }
    }

    /** chmod 755。 */
    private fun makeExecutable(file: File): Boolean {
        if (file.canExecute()) return true
        file.setExecutable(true, false)
        if (file.canExecute()) return true
        // 部分系统 setExecutable 无效，回退到 chmod 命令
        return runCatching {
            val p = Runtime.getRuntime().exec(arrayOf("chmod", "755", file.absolutePath))
            p.waitFor() == 0 && file.canExecute()
        }.getOrDefault(false)
    }

    /** 启动进程并建立协议通道。 */
    private fun launch(id: LibId, file: File): StartResult {
        return runCatching {
            val pb = ProcessBuilder(file.absolutePath)
            pb.directory(daemonDir())
            pb.redirectErrorStream(false)
            val proc = pb.start()
            process = proc
            libId = id

            val proto = GgProtocol()
            proto.setStreams(proc.inputStream, proc.outputStream)
            proto.setStarted(true)
            protocol = proto

            // 等待 daemon 就绪：短读一次，超时则视为失败
            if (!waitReady(proc)) {
                proc.destroy()
                process = null
                protocol = null
                return StartResult.Failed("daemon 启动后无响应")
            }

            val pid = processId(proc)
            GLog.i(TAG, "daemon 已启动: ${id.desc} pid=$pid")
            StartResult.Success(id, file.absolutePath, pid)
        }.getOrElse { t ->
            GLog.e(TAG, "启动 ${id.desc} 失败", t)
            StartResult.Failed(t.message ?: t::class.java.simpleName, t)
        }
    }

    /**
     * 获取进程 PID。
     *
     * `Process.pid()` 是 Java 9+ API，Android 上不可用（minSdk 24 只有
     * `Process` 的旧接口）。这里用反射读内部字段 `pid`：
     * - Android 的 `java.lang.ProcessImpl` 有 `int pid`
     * - 某些 ROM 用 `int pid_` 或方法 `getPid()`
     *
     * 全部失败时返回 -1，不影响功能（PID 只用于日志展示）。
     */
    private fun processId(proc: Process?): Int {
        if (proc == null) return -1

        // 1) 方法 getPid()（部分实现提供）
        runCatching {
            val m = proc.javaClass.getMethod("getPid")
            m.isAccessible = true
            (m.invoke(proc) as? Number)?.toInt()
        }.getOrNull()?.let { return it }

        // 2) 字段 pid / pid_
        for (fieldName in listOf("pid", "pid_")) {
            val value = runCatching {
                val f = proc.javaClass.getDeclaredField(fieldName)
                f.isAccessible = true
                f.getInt(proc)
            }.getOrNull()
            if (value != null && value > 0) return value
        }

        // 3) 兜底：从 toString 解析，形如 "Process[pid=1234, exitValue=...]"
        return runCatching {
            Regex("""pid=(\d+)""").find(proc.toString())
                ?.groupValues?.get(1)?.toIntOrNull() ?: -1
        }.getOrDefault(-1)
    }

    /**
     * 等待 daemon 就绪。
     *
     * daemon 启动后不会主动发消息，因此用"进程存活 + 短暂等待"判断，
     * 而不是等特定应答——避免在没有协议文档的情况下猜测握手包。
     */
    private fun waitReady(proc: Process): Boolean {
        val deadline = System.currentTimeMillis() + 3000
        while (System.currentTimeMillis() < deadline) {
            if (!proc.isAlive) return false
            Thread.sleep(100)
            // 存活超过 500ms 认为启动成功
            if (System.currentTimeMillis() > deadline - 2500) return true
        }
        return proc.isAlive
    }
}
