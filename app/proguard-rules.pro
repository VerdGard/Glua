-keepattributes SourceFile,LineNumberTable

# 本项目自己的类
-keep class com.so.revelation.glua.core.** { *; }

# JNI 方法
-keepclasseswithmembers class * {
    native <methods>;
}
-keep class com.so.revelation.glua.core.log.NativeLogSink { *; }

# LuaJ：反射与 JSR-223
#
# luaj-jse 的 org.luaj.vm2.script.* 实现了 javax.script.ScriptEngine，
# 这是 Java SE 专有的包，Android 上没有。
# 我们只用 LuaJ 的核心执行能力（Globals/LuaValue/Varargs），
# 不用 JSR-223 接口，因此直接把整个 script 包与 service 描述排除。
-dontwarn javax.script.**
-dontwarn org.luaj.vm2.script.**

# LuaJ 内部通过反射访问
-keep class org.luaj.vm2.** { *; }
-keepclassmembers class org.luaj.vm2.** {
    public *;
    protected *;
}

# Lua 标准库的 function 名字通过字符串查找
-keepclassmembers class org.luaj.vm2.lib.** {
    public *;
}
