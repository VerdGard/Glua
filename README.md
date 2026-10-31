# Glua

一个面向 Android 的 Lua 脚本编辑器，使用 **Kotlin + Jetpack Compose + C（NDK）** 构建。

设计目标是让脚本编写与调试在手机上闭环：编辑、运行、看输出、查日志，不用连电脑。

## 项目定位

本仓库的 `main` 分支是**全新重构**的实现，不是反编译产物的修补。

早期版本来自对一个旧 APK 的逆向还原，那份代码存放在
[`legacy`](../../tree/legacy) 分支，仅作参考，不再维护。

## 文档

| 文档 | 内容 |
|---|---|
| [docs/LUA.md](docs/LUA.md) | Lua 5.3 语言指南：语法、标准库、Glua 环境差异、常见陷阱 |
| [docs/GG_API.md](docs/GG_API.md) | GameGuardian API 完整参考：68 个函数 + 66 个常量，含中文说明与示例 |
| [docs/MCP.md](docs/MCP.md) | MCP 服务器：协议、14 个工具、接入配置、故障排查 |
| [SKILL.md](SKILL.md) | 给 AI 助手的项目指南：结构、约定、工作流、已知限制 |

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
│   ├── LuaEngine              执行入口（IO 线程、中止、错误分类、静态审计）
│   ├── ScriptResult           Success / CompileError / RuntimeError / Cancelled
│   ├── vm/
│   │   ├── LuaRuntime         LuaJ-backed 运行时，注入 gg.* 与 print
│   │   └── LuaValueConverter  Kotlin <-> LuaValue 双向转换
│   ├── gg/                    gg.* API（全部 68 函数 + 66 常量）
│   └── syntax/                词法分析器、补全引擎
└── files/
    └── ScriptStore            脚本文件读写（协程 + 日志）

:app                           Compose UI
├── ui/home                    脚本列表
├── ui/editor                  编辑器 + 运行 + 输出面板
├── ui/logcat                  应用内 Logcat 面板
├── ui/settings                设置（含 MCP 开关）
├── ui/theme                   Material3 主题
└── mcp/                       MCP 服务接线
    ├── AppMcpBridge           把 ScriptStore/LuaEngine 注入 MCP
    └── McpServerManager       启停与状态

core/mcp/                       MCP 协议实现（纯 Kotlin，无 Android 依赖）
├── JsonRpc                    JSON 解析与序列化（手写，零依赖）
├── McpTool                    工具定义与 JSON Schema 构造
├── McpRegistry                14 个工具的注册与执行
├── McpProtocol                JSON-RPC 方法分发
└── McpHttpServer              HTTP + SSE 传输

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

## gg.* API

`gg.*` 是 GameGuardian 的 Lua API，本项目**完整实现了全部 68 个函数与 66 个常量**。

数据来源有两处，互相印证：

- 随原 APK 分发的 `assets/AGG_LUA_API_ZN.json`（官方签名的中文说明、参数、返回值、示例）
- `droidxrx/gameguardian-lua` 的 EmmyLua 定义（函数签名交叉校验）

两者函数集合完全一致，因此 `GgApiCatalog` 自动生成后不会再漏项。

### 实现分层

| 类别 | 函数 | 无 root 时的行为 |
|---|---|---|
| 提示与交互 | `alert` `choice` `multiChoice` `prompt` `toast` `copyText` | 正常（Compose 对话框） |
| 编码与文本 | `bytes` `numberFromLocale` `numberToLocale` `getLocale` | 正常 |
| 文件与变量 | `getFile` `getLine` `saveVariable` `require` `sleep` | 正常 |
| HTTP | `makeRequest` | 正常 |
| 列表 | `addListItems` `removeListItems` `clearList` `getListItems` `saveList` | 正常 |
| 内存搜索 | `searchNumber` `searchAddress` `searchFuzzy` `searchPointer` `refine*` `getValues` `setValues` `editAll` `copyMemory` `dumpMemory` `allocatePage` `disasm` `getRanges*` `setRanges` `gotoAddress` 等 26 个 | 返回错误字符串 |
| 进程控制 | `processPause` `processResume` `processToggle` `processKill` | 返回错误字符串 |
| 宿主 UI | `showUiButton` `hideUiButton` `setVisible` `getActiveTab` 等 | 返回错误字符串 |

### 无 root 的关键设计

**任何 `gg.*` 函数都不会抛异常。** GameGuardian 的约定是"返回 true 或错误字符串"，
脚本普遍写成 `local ok = gg.searchNumber(...)` 而不加 `pcall`。
如果实现里抛异常，整个脚本会中断——这比"功能不可用"严重得多。

因此所有函数遵守：

1. 环境不满足要求时，返回 `"错误: gg.searchNumber 需要读写目标进程内存，当前设备未 root"`
2. 实现内部异常被 `try/catch` 兜住，同样转成错误字符串
3. 未知函数名返回 `"错误: 未知的 gg 函数 'xxx'"`

这样脚本能在无 root 设备上完整跑完，只是内存类操作返回失败。

### 环境探测

`GgEnvironment` 在首次使用时检测：

- `su` 二进制：`/system/bin/su`、`/system/xbin/su`、`/data/local/xbin/su` 等 9 个路径
- Root 管理器：Magisk、KernelSU、APatch 的特征目录
- `PATH` 中是否存在 `su`

结果按类别映射到函数的可用性（`GgRequirements`）。

### 静态审计

`LuaEngine` 执行前会扫描脚本里的 `gg.*` 引用：

- 调用了不存在的函数 → 报错
- 调用了当前环境不可用的函数 → 告警（脚本仍执行）
- `GgRuntime` 实现集合与 `GgApiCatalog` 不一致 → 启动时 `LuaVmBridge.audit` 报错

## 语法高亮与代码提示

### 高亮

`LuaLexer` 是手写的 Lua 5.3 词法分析器，单次线性扫描，不构建 AST：

- 关键字、内置函数、库名
- `gg.xxx` 整体识别，函数与常量分别着色
- 长括号字符串 `[[ ]]` / `[==[ ]==]`、转义字符串、`--` 与 `--[[ ]]` 注释
- 十六进制与科学计数法数字

`LuaHighlightTransformation` 实现为 Compose `VisualTransformation`，
只添加样式不改文本，因此光标、选区、撤销栈都不受影响。

### 代码提示

`CompletionEngine` 三种场景：

1. `gg.` 之后 → 列出全部 68 个函数 + 66 个常量，带签名、中文说明、示例
2. `string.` / `table.` / `math.` / `os.` / `io.` → 对应库函数
3. 普通标识符 → 本文档的 `local` 变量、函数参数、循环变量、关键字、内置函数

无 root 环境下，内存类函数在补全列表中标注"需 root"并以警示色显示，但仍可选。

## Lua 执行

脚本由 **LuaJ 3.0.1**（纯 Java 的 Lua 5.3 实现）真正执行，不是模拟。

```
LuaEngine.execute()
  -> LuaRuntime (新建 Globals，避免脚本间污染)
  -> 注入 gg.* 与 print 重定向
  -> globals.load(source, chunkName)
  -> chunk.call()
```

已验证的能力：

| 场景 | 结果 |
|---|---|
| 基础语法（循环、函数、table、字符串） | 通过 |
| `gg.*` 常量读取（`gg.TYPE_DWORD` 等） | 通过 |
| `gg.*` 函数调用与返回值转换 | 通过 |
| Lua table <-> Kotlin List/Map 往返 | 通过 |
| 无 root 时内存函数返回错误字符串 | 通过（脚本继续执行） |
| 语法错误 -> `CompileError` | 通过 |
| 运行期错误 -> `RuntimeError` | 通过（含堆栈） |
| `print` 输出 -> 日志面板 + 输出面板 | 通过 |

`print` 被重定向到 `LogBus` 与输出面板；`os.exit` 被拦截为 `ScriptExit` 异常，
不会真的退出进程；`dofile`/`loadfile` 支持相对脚本目录的路径。

中止：`LuaEngine.cancel()` 置位中断标志。LuaJ 不支持指令级中断，
死循环脚本需要等到语句边界才响应，这是已知限制。

## MCP 服务器

App 内置 MCP 服务器，AI 客户端可远程读写脚本、运行代码、查日志、查阅 gg API。

**双传输协议**

- **Streamable HTTP**：`POST /mcp`，一问一答（MCP 2024-11-05 标准）
- **HTTP + SSE**：`GET /sse` 建立事件流，`POST /message` 提交请求

**14 个工具**

| 组 | 工具 |
|---|---|
| 脚本文件 | `script_list` `script_read` `script_write` `script_create` `script_delete` |
| 运行 | `script_run` `script_cancel` |
| 分析 | `lua_check` `lua_complete` |
| gg API | `gg_api_list` `gg_api_get` |
| 日志环境 | `log_query` `log_clear` `env_info` |

默认监听 `127.0.0.1:8787`，在设置页开启。完整文档见 **[docs/MCP.md](docs/MCP.md)**。

实现细节：

- JSON 解析器手写，`:core` 保持零第三方依赖（LuaJ 是唯一例外）
- HTTP 服务手写 200 行，不引入 Ktor/NanoHTTPD，避免版本冲突
- MCP 与 UI 共享同一 `ScriptStore` / `LuaEngine`，行为一致
- `script_run` 支持超时（默认 30s），超时自动请求中止

## gg.* 内存引擎

APK 内的 36 个 ELF（`res/raw/chunk*`）是 daemon 二进制。内存读写走这条链路：

```
gg.searchNumber(...)
  -> GgRuntime.memoryOp()
  -> GgMemoryEngine.searchMask()
  -> GgProtocol (二进制帧：0x02|len|payload|0x03，CRC32 校验)
  -> daemon 进程 (root + ptrace)
  -> /proc/<pid>/mem
```

### 协议层

`GgProtocol` 移植自开源 GameGuardian 96 版 `InOut`，Kotlin 化并去掉 UI 依赖：

- 帧格式：`0x02 | length(4, LE) | payload | 0x03`
- int 按 `byteOrderMask`（默认 0x0F）异或混淆
- CRC32 校验（跳过 cmd/seq 两字节）
- 非 fifo 模式自动做 hex 封装

### 命令表

从 `DaemonManager` 的 `startMessage` 调用提取，共 24 个 cmd：

| cmd | 操作 | 参数 |
|---|---|---|
| 29 | 搜索策略 | int strategy |
| 32 | 分配内存页 | int mode, long address |
| 33 | 读内存 | int len, (int flag, long addr)* |
| 36 | 写内存 | int len, (int flag, long addr)*, data |
| 37 | 附加进程 | int pid, byte pkgLen, pkg, byte libLen, lib |
| 38 | 解除附加 | - |
| 39 | 区域列表 | - |
| 40 | 指针搜索 | int maxOffset, long from, long to |
| 41 | 模糊初始化 | int type, long from, long to |
| 43 | 模糊细化 | int type, int sign, int len, bytes |
| 47 | 结果列表 | int maxCount, int skip |
| 48 | 加载结果 | int len, bytes |
| 50 | 编辑项 | long addr, int n |
| 52 | 结果集写入 | int len, (int flag, long addr)* |
| 53 | 信号 | byte signal |
| 54 | 初始化 | Config 字段序列 |
| 55 | 分组搜索 | int generalFlags, int range, long from, long to, int count, ... |
| 59 | 速度 hack | double speed |
| 61 | 掩码搜索 | long from, long to, int flags, int len, bytes |
| 62 | 复制内存 | long from, long to, int bytes |
| 63 | 时间跳跃 | string time |
| 64 | 取消 | - |

### 无 root 时的行为

`GgEnvironment` 检测到无 root 时 `GgDaemon.start()` 返回 `NoRoot`，
`GgMemoryEngine` 不建立连接，所有内存函数返回错误字符串。脚本继续执行。

## 日志持久化

用追加文件而非 SQLite。原因：

1. `:core` 是纯 JVM 模块，`android.database.sqlite` 不可用
2. Room / SQLDelight 会带来大量依赖
3. 日志是只追加、顺序读取的场景，顺序文件足够

文件格式（全部小端）：

```
MAGIC(8 "GLLOG") | 记录*
记录 := level(1) | tagLen(2) | tag | msgLen(4) | msg | ts(8) | pid(4) | tid(8) | src(1) | thrLen(4) | thr
```

- 写入在单线程执行器上批量提交（500ms 或 200 条），不阻塞调用方
- 单文件上限 8 MB，超限截断保留后半
- 损坏记录会被跳过，不影响整体读取
- API：`LogBus.attachPersistence()` / `readPersisted()` / `clearPersisted()`

## 自动缩进与括号配对

`AutoIndent`（`core/lua/syntax`）：

- 块缩进：`function`/`if`/`for`/`while`/`do`/`then`/`else`/`repeat` 开新级
- 去缩进：`end`/`until`/`else`/`elseif` 开头减一级
- 单行块（`if x then return end`）不影响缩进
- `repeat`/`until` 用栈精确配对
- 括号自动补全：`(` `[` `{` `"` `'`
- 成对删除：光标在 `()` 中间时退格同时删两个
- `reindent()` 可整体重排文档

`CodeArea` 通过比较新旧 `TextFieldValue` 推断用户操作并应用上述规则。

## 对话框同步等待

`gg.alert` / `gg.choice` / `gg.multiChoice` / `gg.prompt` 现在真正等待用户响应：

```
Lua 脚本 (IO 线程)          Compose (主线程)
      |                          |
      |-- 创建 Waiter ---------->|
      |-- pendingDialog = req -->| 渲染对话框
      |-- latch.await() 阻塞      | 用户点击
      |<-- respond(result) ------|
      |-- 返回给 Lua              |
```

- 用 `CountDownLatch` 桥接，超时 5 分钟
- **必须在非主线程执行脚本**，`LuaEngine` 已保证在 `Dispatchers.IO`
- 用户取消返回 `nil`（Kotlin 侧用 `0` / 空串 / `null` 表示）

## 当前进度

已完成（基础架构）：

- [x] 日志核心：`LogBus` / `LogFilter` / `RingBuffer` / `LogEntry`
- [x] 日志捕获：stdout/stderr 重定向、未捕获异常
- [x] C 层：原生日志通道、信号崩溃捕获、JNI 绑定
- [x] 应用内 Logcat 面板（Compose）
- [x] 文件层：`ScriptStore`
- [x] UI 骨架：首页 / 编辑器 / 日志 / 设置 + 导航
- [x] 主题、图标、Manifest
- [x] gg.* 全部 68 个函数 + 66 个常量（含无 root 降级）
- [x] Lua 词法分析器 + 语法高亮
- [x] 补全引擎（gg API / 库函数 / 局部变量）
- [x] 行号栏、补全弹窗、高亮配色
- [x] MCP 服务器（HTTP + SSE，14 个工具）
- [x] MCP 文档（docs/MCP.md）

待完成：

- [x] **Lua 执行引擎**（LuaJ 3.0.1，纯 Java，无原生依赖）
- [x] **`gg.*` 内存引擎**：daemon 协议层 + 22 个内存函数接线
- [x] **自动缩进与括号配对**
- [x] **日志持久化**（追加文件格式，非 SQLite，见下）
- [x] **对话框同步等待**（CountDownLatch 桥接 Lua 线程与 Compose）

## 许可

仅用于学习与研究。
