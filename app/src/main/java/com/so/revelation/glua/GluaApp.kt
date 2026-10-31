package com.so.revelation.glua

import android.app.Application
import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.log.LogBus
import com.so.revelation.glua.core.log.LogcatInterceptor
import com.so.revelation.glua.core.log.NativeBridge

/**
 * 应用入口。
 *
 * 初始化顺序有讲究：
 * 1. 先装 stdout/stderr 重定向 —— 后续任何打印都能进 LogBus
 * 2. 再装未捕获异常 —— 尽早捕获启动期崩溃
 * 3. 最后加载原生库 —— 它会注册 JNI 日志回调和信号处理器，
 *    即使加载失败也不影响前面的纯 Kotlin 日志
 */
class GluaApp : Application() {

    /**
     * 应用级单例：脚本仓库、Lua 引擎、MCP 服务。
     *
     * 放在 Application 而不是 Composable 里，是因为 MCP 服务需要在
     * Activity 重建、屏幕旋转等情况下继续运行。
     */
    lateinit var scriptStore: com.so.revelation.glua.core.files.ScriptStore
        private set

    lateinit var luaEngine: com.so.revelation.glua.core.lua.LuaEngine
        private set

    lateinit var ggRuntime: com.so.revelation.glua.core.lua.gg.GgRuntime
        private set

    lateinit var mcpManager: com.so.revelation.glua.mcp.McpServerManager
        private set

    /**
     * gg 的 UI 宿主。由 MainActivity 在首帧后注入，
     * 因为对话框需要 Composable 环境。
     */
    @Volatile
    private var ggUiHost: com.so.revelation.glua.ui.editor.ComposeGgUiHost? = null

    fun attachGgUiHost(host: com.so.revelation.glua.ui.editor.ComposeGgUiHost) {
        ggUiHost = host
    }

    fun currentGgUiHost(): com.so.revelation.glua.ui.editor.ComposeGgUiHost? = ggUiHost

    override fun onCreate() {
        super.onCreate()

        LogcatInterceptor.install()
        LogcatInterceptor.installUncaughtHandler()

        LogBus.i(TAG, "==== Glua 启动 ====")
        LogBus.i(TAG, "PID=${LogBus.pid}, BuildConfig.DEBUG=${BuildConfig.DEBUG}")

        // 日志持久化：写入 files/logs/glua.log
        logPersistence = com.so.revelation.glua.core.log.LogPersistence(
            java.io.File(filesDir, "logs/glua.log")
        )
        logPersistence?.start()
        logPersistence?.let { LogBus.attachPersistence(it) }
        LogBus.i(TAG, "日志持久化: ${logPersistence?.let { "已启用" } ?: "未启用"}")

        val native = NativeBridge.install()
        LogBus.i(TAG, "原生日志通道: ${if (native) "已启用" else "不可用"}")

        // 核心组件
        scriptStore = com.so.revelation.glua.core.files.ScriptStore(
            java.io.File(filesDir, "scripts")
        )
        // 内存引擎：daemon 从 res/raw/chunk* 提取后启动
        val daemon = com.so.revelation.glua.core.lua.gg.memory.GgDaemon(
            filesDir = filesDir,
            rawProvider = { name ->
                val id = resources.getIdentifier(name, "raw", packageName)
                if (id == 0) null else resources.openRawResource(id)
            },
        )
        daemonRef = daemon
        val memoryEngine = com.so.revelation.glua.core.lua.gg.memory.GgMemoryEngine(daemon)

        // 尝试启动 daemon（无 root 时会安静失败）
        val env = com.so.revelation.glua.core.lua.gg.GgEnvironment.snapshot()
        if (env.rooted) {
            val result = daemon.start(
                rooted = true,
                sdk = android.os.Build.VERSION.SDK_INT,
                abis = android.os.Build.SUPPORTED_ABIS,
            )
            when (result) {
                is com.so.revelation.glua.core.lua.gg.memory.GgDaemon.StartResult.Success ->
                    LogBus.i(TAG, "内存 daemon 已启动: ${result.libId.desc} pid=${result.pid}")
                is com.so.revelation.glua.core.lua.gg.memory.GgDaemon.StartResult.NoRoot ->
                    LogBus.w(TAG, "无 root，内存功能不可用")
                com.so.revelation.glua.core.lua.gg.memory.GgDaemon.StartResult.UnsupportedAbi ->
                    LogBus.w(TAG, "找不到适配当前 ABI 的 daemon 二进制")
                is com.so.revelation.glua.core.lua.gg.memory.GgDaemon.StartResult.Failed ->
                    LogBus.w(TAG, "daemon 启动失败: ${result.reason}")
            }
        } else {
            LogBus.i(TAG, "设备未 root，跳过 daemon 启动")
        }

        ggRuntime = com.so.revelation.glua.core.lua.gg.GgRuntime(
            filesDir = filesDir,
            cacheDir = cacheDir,
            externalDir = getExternalFilesDir(null),
            memoryEngine = memoryEngine,
        )
        luaEngine = com.so.revelation.glua.core.lua.LuaEngine(ggRuntime)

        // MCP 服务（默认不自动启动，由用户在设置页开启）
        val bridge = com.so.revelation.glua.mcp.AppMcpBridge(scriptStore, luaEngine)
        mcpManager = com.so.revelation.glua.mcp.McpServerManager(bridge)
        LogBus.i(TAG, "MCP 就绪，${mcpManager.toolNames.size} 个工具，默认未启动")

        if (BuildConfig.DEBUG) {
            GLog.mirrorToSystem = true
            NativeBridge.logFromNative(
                com.so.revelation.glua.core.log.LogLevel.INFO,
                TAG,
                "原生侧日志通道连通性测试",
            )
        }
    }

    override fun onTerminate() {
        mcpManager.stop()
        daemonRef?.stop()
        logPersistence?.stop()
        super.onTerminate()
    }

    private var logPersistence: com.so.revelation.glua.core.log.LogPersistence? = null

    private var daemonRef: com.so.revelation.glua.core.lua.gg.memory.GgDaemon? = null

    private companion object {
        const val TAG = "GluaApp"
    }
}
