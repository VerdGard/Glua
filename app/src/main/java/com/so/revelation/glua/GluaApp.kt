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

    override fun onCreate() {
        super.onCreate()

        LogcatInterceptor.install()
        LogcatInterceptor.installUncaughtHandler()

        LogBus.i(TAG, "==== Glua 启动 ====")
        LogBus.i(TAG, "PID=${LogBus.pid}, BuildConfig.DEBUG=${BuildConfig.DEBUG}")

        val native = NativeBridge.install()
        LogBus.i(TAG, "原生日志通道: ${if (native) "已启用" else "不可用"}")

        if (BuildConfig.DEBUG) {
            GLog.mirrorToSystem = true
            NativeBridge.logFromNative(
                com.so.revelation.glua.core.log.LogLevel.INFO,
                TAG,
                "原生侧日志通道连通性测试",
            )
        }
    }

    private companion object {
        const val TAG = "GluaApp"
    }
}
