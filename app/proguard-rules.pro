# 该类名已由原版 R8 混淆，且存在大量跨类静态引用与反射调用，
# 关闭二次 shrink/obfuscate 以避免破坏运行时链接。
-keep class ** { *; }
-dontwarn **
-dontoptimize
-dontobfuscate
-dontshrink
-ignorewarnings
