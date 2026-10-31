package com.so.revelation.glua.core.lua.gg

import com.so.revelation.glua.core.log.GLog
import java.io.File

/**
 * 运行环境能力探测。
 *
 * 目标是让同一份脚本在**有 root** 和**无 root** 的设备上都能跑起来：
 * - 有 root：内存/进程类函数可用
 * - 无 root：这些函数返回错误字符串，脚本继续往下执行，不抛异常
 *
 * 探测结果在进程生命周期内缓存，[refresh] 可重新检测。
 */
object GgEnvironment {

    private const val TAG = "GgEnvironment"

    /** 常见 root 痕迹路径。 */
    private val ROOT_PATHS = listOf(
        "/system/bin/su", "/system/xbin/su", "/sbin/su",
        "/system/su", "/system/bin/failsafe/su",
        "/data/local/su", "/data/local/bin/su", "/data/local/xbin/su",
        "/su/bin/su", "/magisk/.core/bin/su",
    )

    /** Magisk / KernelSU / APatch 等常见特征。 */
    private val ROOT_MARKERS = listOf(
        "/sbin/.magisk", "/data/adb/magisk", "/data/adb/modules",
        "/data/adb/ksu", "/data/adb/ap",
    )

    @Volatile
    private var cached: Snapshot? = null

    /**
     * 环境快照。
     */
    data class Snapshot(
        val rooted: Boolean,
        val rootMethod: String?,
        val canReadProcMaps: Boolean,
        val overlayGranted: Boolean,
    ) {
        val summary: String
            get() = buildString {
                append(if (rooted) "有 root" else "无 root")
                rootMethod?.let { append("（").append(it).append("）") }
                if (!rooted) append("，内存类函数将返回错误")
            }
    }

    fun snapshot(): Snapshot = cached ?: detect().also {
        cached = it
        GLog.i(TAG, "环境探测: ${it.summary}")
    }

    fun refresh(): Snapshot {
        cached = null
        return snapshot()
    }

    /**
     * 判断某个 gg 函数在当前环境下是否可用。
     *
     * 注意：即使不可用，也**不阻止脚本执行**。
     * 调用方拿到 [GgAvailability.available] == false 时应返回错误字符串，
     * 让 Lua 侧能 `local ok, err = gg.searchNumber(...)` 处理。
     */
    fun availabilityOf(functionName: String): GgAvailability {
        val snap = snapshot()
        val req = GgRequirements.of(functionName)
        return when (req) {
            GgRequirement.NONE -> GgAvailability.OK

            GgRequirement.MEMORY_ACCESS ->
                if (snap.rooted) GgAvailability.OK
                else GgAvailability.no(
                    "gg.$functionName 需要读写目标进程内存，当前设备未 root"
                )

            GgRequirement.PROCESS_CONTROL ->
                if (snap.rooted) GgAvailability.OK
                else GgAvailability.no(
                    "gg.$functionName 需要控制目标进程，当前设备未 root"
                )

            GgRequirement.OVERLAY ->
                if (snap.overlayGranted) GgAvailability.OK
                else GgAvailability.no(
                    "gg.$functionName 需要悬浮窗权限，当前未授予"
                )

            GgRequirement.HOST_UI -> GgAvailability.no(
                "gg.$functionName 需要 GameGuardian 宿主环境，独立运行时不可用"
            )
        }
    }

    // ------------------------------------------------------------ 探测

    private fun detect(): Snapshot {
        val method = detectRootMethod()
        return Snapshot(
            rooted = method != null,
            rootMethod = method,
            canReadProcMaps = runCatching {
                File("/proc/self/maps").canRead()
            }.getOrDefault(false),
            overlayGranted = OverlayProbe.granted,
        )
    }

    private fun detectRootMethod(): String? {
        // 1) su 二进制
        for (p in ROOT_PATHS) {
            if (runCatching { File(p).exists() }.getOrDefault(false)) {
                return "su: $p"
            }
        }
        // 2) 管理器特征目录
        for (p in ROOT_MARKERS) {
            if (runCatching { File(p).exists() }.getOrDefault(false)) {
                return when {
                    p.contains("magisk") -> "Magisk"
                    p.contains("ksu") -> "KernelSU"
                    p.contains("ap") -> "APatch"
                    else -> p
                }
            }
        }
        // 3) 尝试执行 su（部分系统有 su 但无文件）
        val ok = runCatching {
            val p = Runtime.getRuntime().exec(arrayOf("which", "su"))
            p.waitFor() == 0 && p.inputStream.bufferedReader().readText().isNotBlank()
        }.getOrDefault(false)
        if (ok) return "PATH 中的 su"
        return null
    }

    /** 由 UI 层在拿到悬浮窗权限后回填。 */
    object OverlayProbe {
        @Volatile
        var granted: Boolean = false
    }
}
