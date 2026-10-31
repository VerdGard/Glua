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

    override fun onCreate() {
        super.onCreate()

        LogcatInterceptor.install()
        LogcatInterceptor.installUncaughtHandler()

        LogBus.i(TAG, "==== Glua 启动 ====")
        LogBus.i(TAG, "PID=${LogBus.pid}, BuildConfig.DEBUG=${BuildConfig.DEBUG}")

        val native = NativeBridge.install()
        LogBus.i(TAG, "原生日志通道: ${if (native) "已启用" else "不可用"}")

        // 核心组件
        scriptStore = com.so.revelation.glua.core.files.ScriptStore(
            java.io.File(filesDir, "scripts")
        )
        ggRuntime = com.so.revelation.glua.core.lua.gg.GgRuntime(
            filesDir = filesDir,
            cacheDir = cacheDir,
            externalDir = getExternalFilesDir(null),
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
        super.onTerminate()
    }

    private companion object {
        const val TAG = "GluaApp"
    }
}
