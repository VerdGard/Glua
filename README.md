# Glua

一个面向 Android 的 Lua 脚本编辑器，使用 **Kotlin + Jetpack Compose + C（NDK）** 构建。

设计目标是让脚本编写与调试在手机上闭环：编辑、运行、看输出、查日志，不用连电脑。

## 项目定位

本仓库的 `main` 分支是**全新重构**的实现，不是反编译产物的修补。

早期版本来自对一个旧 APK 的逆向还原，那份代码存放在
[`legacy`](../../tree/legacy) 分支，仅作参考，不再维护。

## 架构

```
:core                          纯逻辑模块，无 UI 依赖
├── log/                       日志系统（本次重构的核心）
│   ├── LogBus                 日志总线，环形缓冲 + 实时流
│   ├── LogEntry               日志记录（级别/TAG/PID/TID/来源）
│   ├── LogFilter              Logcat 风格过滤（级别/TAG/全文/正则/来源）
│   ├── RingBuffer             定长环形缓冲，避免无限增长
│   ├── GLog                   应用统一日志入口
│   ├── LogcatInterceptor      stdout/stderr 重定向 + 未捕获异常
│   ├── NativeBridge           原生日志与崩溃捕获的 Kotlin 门面
│   └── LogExporter            导出为 logcat 兼容格式
├── lua/                       Lua 引擎
│   ├── LuaEngine              执行入口（IO 线程、协程取消、错误分类）
│   └── ScriptResult           Success / CompileError / RuntimeError / Cancelled
└── files/
    └── ScriptStore            脚本文件读写（协程 + 日志）

:app                           Compose UI
├── ui/home                    脚本列表
├── ui/editor                  编辑器 + 运行 + 输出面板
├── ui/logcat                  应用内 Logcat 面板
├── ui/settings                设置
└── ui/theme                   Material3 主题

app/src/main/cpp + core/src/main/cpp
├── glua_log.c                 原生日志写入与 JNI 回调
├── glua_crash.c               信号捕获（SIGSEGV/SIGABRT/SIGILL/SIGFPE/SIGBUS）
└── glua_jni.c                 JNI 绑定
```

## 日志系统

参照 Android Logcat 的交互设计，应用可以查看**自身**的全部日志。

### 捕获范围

| 来源 | 方式 |
|---|---|
| 应用代码 | 统一调用 `GLog`，同时写入 `LogBus` 与系统 Logcat |
| `System.out` / `System.err` | `LogcatInterceptor` 按行重定向，捕获 `printStackTrace()` 等 |
| 未捕获异常 | `Thread.setDefaultUncaughtExceptionHandler`，串联原 handler |
| 原生代码 | C 层 `glua_log_write` 经 JNI 回调 `NativeLogSink` |
| 原生崩溃 | `glua_crash.c` 捕获信号后上报，再恢复默认处理让系统生成 tombstone |

**不拦截 `android.util.Log`**：ART 上 `println_native` 是 native 方法，Java 层无法替换
方法体，反射或 JVMTI 方案在非 debuggable 包上会失败。因此约定项目内所有日志走 `GLog`。

### 面板功能

- 级别阈值过滤（V/D/I/W/E/A）
- TAG 子串搜索、消息全文搜索、正则模式
- 按来源多选（android log / stdout / stderr / Lua / 崩溃 / 应用）
- 暂停 / 恢复、自动滚动、清空
- 点击单条查看完整信息与堆栈
- 一键导出为 `logcat_yyyyMMdd_HHmmss.log`，格式与 `adb logcat -d` 兼容
- 缓冲区容量可调（1000 ~ 50000 条，默认 8000）

## 构建

需要 JDK 17、Android SDK 35、NDK 27、CMake 3.22。

```bash
gradle :app:assembleDebug
```

或使用 GitHub Actions：push 到 `main` 自动构建，APK 与构建日志在 Artifact 中。

## 当前进度

已完成（基础架构）：

- [x] 日志核心：`LogBus` / `LogFilter` / `RingBuffer` / `LogEntry`
- [x] 日志捕获：stdout/stderr 重定向、未捕获异常
- [x] C 层：原生日志通道、信号崩溃捕获、JNI 绑定
- [x] 应用内 Logcat 面板（Compose）
- [x] 文件层：`ScriptStore`
- [x] UI 骨架：首页 / 编辑器 / 日志 / 设置 + 导航
- [x] 主题、图标、Manifest

待完成：

- [ ] **接入真正的 Lua 5.3 虚拟机**。当前 `LuaEngine` 是占位实现，
      只做语法粗检与源码回显，不会真正执行脚本。
- [ ] 编辑器语法高亮、行号、自动缩进（当前用 `BasicTextField`）
- [ ] 日志持久化到 SQLite（当前仅内存）
- [ ] 随包分发 Lua 标准库脚本

## 许可

仅用于学习与研究。
