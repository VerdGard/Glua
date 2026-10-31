package com.so.revelation.glua.core.log

/**
 * 原生侧调用入口。C 代码通过 JNI 调 [onNativeLog]，
 * 这里把日志并入 [LogBus]，与 Java/Kotlin 日志混在一起展示。
 *
 * 注意：方法名与签名被 C 侧硬编码（`onNativeLog(ILjava/lang/String;Ljava/lang/String;)V`），
 * 改名需同步修改 `glua_jni.c`。
 */
internal class NativeLogSink {

    fun onNativeLog(level: Int, tag: String, message: String) {
        LogBus.log(
            level = LogLevel.fromPriority(level),
            tag = tag,
            message = message,
            source = LogSource.APP,
        )
    }
}
