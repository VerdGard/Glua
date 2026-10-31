package com.so.revelation.glua.core.log

/**
 * 原生日志与崩溃捕获的 Kotlin 侧门面。
 *
 * 对应的 C 实现在 `core/src/main/cpp/`：
 * - `glua_log.c`   原生日志写入与回调
 * - `glua_crash.c` 信号捕获（SIGSEGV/SIGABRT/SIGILL/SIGFPE/SIGBUS）
 * - `glua_jni.c`   JNI 绑定
 */
object NativeBridge {

    private const val TAG = "NativeBridge"

    @Volatile
    private var loaded = false

    @Volatile
    private var installed = false

    /** 原生库是否加载成功。失败时整个模块降级为纯 Kotlin 日志。 */
    val isAvailable: Boolean get() = loaded

    private val sink = NativeLogSink()

    fun load(): Boolean {
        if (loaded) return true
        loaded = runCatching {
            System.loadLibrary("glua_core")
            true
        }.getOrElse { t ->
            GLog.w(TAG, "原生库加载失败，降级为纯 Kotlin 日志", t)
            false
        }
        return loaded
    }

    /**
     * 安装原生日志回调和崩溃捕获。
     * 需在 [load] 成功后调用；重复调用无副作用。
     */
    fun install(): Boolean {
        if (installed) return true
        if (!load()) return false
        installed = runCatching {
            nativeInstall(sink)
            true
        }.getOrElse { t ->
            GLog.e(TAG, "原生日志安装失败", t)
            false
        }
        if (installed) GLog.i(TAG, "原生日志与崩溃捕获已启用")
        return installed
    }

    fun uninstall() {
        if (!installed) return
        runCatching { nativeUninstall() }
        installed = false
    }

    /** 从原生侧主动写一条日志，用于验证链路连通。 */
    fun logFromNative(level: LogLevel, tag: String, message: String) {
        if (!loaded) return
        runCatching { nativeLog(level.priority, tag, message) }
    }

    /** 故意触发 SIGSEGV，验证崩溃捕获。仅 debug 包调用。 */
    fun triggerNativeCrash() {
        if (!loaded) return
        nativeTriggerCrash()
    }

    // ------------------------------------------------------------ native

    private external fun nativeInstall(sink: NativeLogSink)
    private external fun nativeUninstall()
    private external fun nativeLog(level: Int, tag: String, message: String)
    private external fun nativeTriggerCrash()
}
