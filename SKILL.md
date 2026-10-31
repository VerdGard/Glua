---
name: glua
description: Android 上的 Lua 脚本 IDE，内置 MCP 服务器。用于编写、运行、调试 Lua 脚本，支持 GameGuardian API（gg.*）。当用户需要写 Lua 脚本、调用 gg.* 内存函数、或通过 AI 客户端远程操作手机上的脚本编辑器时使用。
---

# Glua 开发指南

Android 平台的 Lua 脚本编辑器，Kotlin + Compose + C 实现。

## 我在什么场景下应该用这个 skill

- 用户要写 / 改 / 跑 **Lua 脚本**
- 用户提到 **GameGuardian**、**gg.Mod**、**内存修改**、**游戏脚本**
- 用户要在 **Android 上编辑代码**
- 用户想让 AI **直接操作手机上的脚本文件**（通过 MCP）

## 项目结构

```
Glua/
├── app/                       Compose UI
│   ├── GluaApp.kt             Application，持有全部单例
│   ├── MainActivity.kt        导航宿主
│   ├── ui/home/               脚本列表
│   ├── ui/editor/             编辑器（高亮、补全、自动缩进）
│   ├── ui/logcat/             应用内日志面板
│   ├── ui/settings/           设置（含 MCP 开关）
│   └── mcp/                   MCP 服务接线
├── core/                      纯逻辑，无 Android UI 依赖
│   ├── log/                   日志系统（LogBus、LogPersistence）
│   ├── lua/
│   │   ├── LuaEngine.kt       执行入口
│   │   ├── vm/                LuaJ 运行时封装
│   │   ├── gg/                gg.* API（68 函数 + 66 常量）
│   │   │   └── memory/        daemon 协议 + 内存引擎
│   │   └── syntax/            词法分析、补全、自动缩进
│   ├── files/                 ScriptStore
│   └── mcp/                   MCP 协议实现
└── docs/                      LUA.md / GG_API.md / MCP.md
```

## 关键概念

### 1. Lua 执行

用 **LuaJ 3.0.1**（纯 Java 的 Lua 5.3）。每次执行新建 `Globals`，脚本间不污染。

```kotlin
val result = luaEngine.execute(source, chunkName, scriptDir) { line ->
    // 实时输出
}
when (result) {
    is ScriptResult.Success -> ...
    is ScriptResult.CompileError -> ...
    is ScriptResult.RuntimeError -> ...
    ScriptResult.Cancelled -> ...
}
```

### 2. gg.* 的错误约定

**这是最容易踩的坑**。`gg.*` 函数失败时**返回错误字符串，不抛异常**：

```lua
-- 正确
local r = gg.searchNumber("100", gg.TYPE_DWORD)
if type(r) == "string" then
    print("失败:", r)
end

-- 错误（错误是返回值，pcall 捕获不到）
local ok, r = pcall(gg.searchNumber, ...)
```

写代码或生成脚本时必须遵守。原因：GameGuardian 的原始 API 就是这么设计的，
脚本普遍不加 pcall，抛异常会让整个脚本中断。

### 3. root 依赖

| 分类 | 无 root 时 |
|---|---|
| alert/choice/prompt/toast/copyText | 正常 |
| bytes/numberFromLocale/getLocale | 正常 |
| getFile/getLine/require/sleep | 正常 |
| saveVariable/saveList/loadList/makeRequest | 正常 |
| addListItems/clearList/getListItems | 正常 |
| **内存搜索/读写/区域/进程/速度** | **返回错误字符串** |

`GgEnvironment` 检测 root（su 路径、Magisk/KernelSU/APatch 特征）。
`GgDaemon` 在检测到 root 时启动 daemon（从 `res/raw/chunk*` 提取 ELF）。

### 4. 内存引擎协议

```
gg.searchNumber()
  -> GgRuntime.memoryOp()
  -> GgMemoryEngine         组装命令帧
  -> GgProtocol             0x02|len|payload|0x03, CRC32, int 异或 0x0F
  -> daemon 进程             root + ptrace
  -> /proc/<pid>/mem
```

24 个命令号见 `GgMemoryEngine` 顶部的文档注释。

## 通过 MCP 操作

Glua 内置 MCP 服务器，AI 客户端可远程读写脚本、运行代码。

**启动**：App → 设置 → MCP 服务器 → 开启。默认 `127.0.0.1:8787`。

**客户端配置**（Streamable HTTP）：

```json
{
  "mcpServers": {
    "glua": { "type": "http", "url": "http://127.0.0.1:8787/mcp" }
  }
}
```

**14 个工具**：

| 工具 | 用途 |
|---|---|
| `script_list` | 列出脚本 |
| `script_read` | 读脚本 |
| `script_write` | 覆盖写入 |
| `script_create` | 新建 |
| `script_delete` | 删除 |
| `script_run` | 运行（支持内联 source） |
| `script_cancel` | 中止 |
| `lua_check` | 语法检查（不执行） |
| `lua_complete` | 补全建议 |
| `gg_api_list` | 列出 gg API |
| `gg_api_get` | 单函数文档 |
| `log_query` | 查日志 |
| `log_clear` | 清空日志 |
| `env_info` | 环境信息 |

完整说明见 [docs/MCP.md](docs/MCP.md)。

## 工作流程

### 写一个新脚本

```
1. script_create  { "name": "my_script" }
2. script_write   { "name": "my_script", "content": "..." }
3. lua_check      { "source": "..." }        先做静态检查
4. script_run     { "name": "my_script" }    运行
```

### 调试失败

```
1. script_run  { "name": "x" }               → isError，有错误信息
2. log_query   { "minLevel": "E", "limit": 20 }
3. gg_api_get  { "name": "searchNumber" }    确认函数签名与 root 要求
```

改完再 `lua_check` → `script_run`，循环。

### 查 gg API

```
1. gg_api_list { "keyword": "search" }       模糊找
2. gg_api_get  { "name": "searchNumber" }    看完整文档与示例
```

## 代码约定

写这个项目的代码时：

### 日志

一律用 `GLog`，不要直接 `android.util.Log`：

```kotlin
GLog.i(TAG, "消息")
GLog.e(TAG, "失败", throwable)
```

原因：`GLog` 同时写 `LogBus`（应用内面板）和系统 logcat。
直接调 `android.util.Log` 的日志不会出现在应用内面板。

### 错误处理

`core` 模块的函数返回 `Result` 或错误字符串，**不抛异常到 UI 层**：

```kotlin
// gg.* 实现
override fun call(name: String, args: List<Any?>): Any? {
    return try {
        fn(args)
    } catch (t: Throwable) {
        "错误: gg.$name 执行失败 - ${t.message}"   // 转成字符串
    }
}
```

### 线程

- 脚本执行：`Dispatchers.IO`
- 文件操作：`Dispatchers.IO`
- UI 状态：`MutableStateFlow` + `collectAsStateWithLifecycle`
- MCP：每个 HTTP 请求一个线程池任务

### 对话框同步

`gg.alert` 等需要阻塞等待用户响应。用 `CountDownLatch` 桥接：

```kotlin
val waiter = Waiter()
_pendingDialog.value = DialogRequest.Alert(...)
return awaitResponse(waiter)   // 阻塞直到 respond() 被调用
```

**必须在非主线程**，否则 ANR。

## 关键文件速查

| 想改什么 | 看哪个文件 |
|---|---|
| Lua 执行逻辑 | `core/lua/LuaEngine.kt` |
| gg 函数实现 | `core/lua/gg/GgRuntime.kt` |
| gg API 元数据 | `core/lua/gg/GgApiCatalog.kt` |
| 内存协议 | `core/lua/gg/memory/GgProtocol.kt` |
| 命令组装 | `core/lua/gg/memory/GgMemoryEngine.kt` |
| daemon 启动 | `core/lua/gg/memory/GgDaemon.kt` |
| 语法高亮 | `core/lua/syntax/LuaLexer.kt` |
| 代码补全 | `core/lua/syntax/CompletionEngine.kt` |
| 自动缩进 | `core/lua/syntax/AutoIndent.kt` |
| 日志总线 | `core/log/LogBus.kt` |
| 日志持久化 | `core/log/LogPersistence.kt` |
| MCP 工具 | `core/mcp/McpRegistry.kt` |
| MCP 协议 | `core/mcp/McpProtocol.kt` |
| MCP 传输 | `core/mcp/McpHttpServer.kt` |
| 编辑器 UI | `app/ui/editor/CodeArea.kt` |
| 日志面板 | `app/ui/logcat/LogcatScreen.kt` |

## 已知限制

写代码或回答用户时要诚实说明这些：

1. **daemon 响应解析是猜测**。命令号与参数从 GG 源码提取，
   但响应二进制结构无文档。`getResults`/`readMemory` 的解析可能与实际不符。
2. **daemon 无握手**。`GgDaemon.waitReady()` 只判断进程存活，未验证协议连通。
3. **中止不彻底**。LuaJ 不支持指令级中断，死循环脚本要等语句边界。
4. **无 root 时内存功能完全不可用**。这不是 bug，是设计。

## 参考文档

| 文档 | 内容 |
|---|---|
| [docs/LUA.md](docs/LUA.md) | Lua 5.3 语法、标准库、常见陷阱 |
| [docs/GG_API.md](docs/GG_API.md) | 68 个 gg 函数 + 66 个常量的完整文档 |
| [docs/MCP.md](docs/MCP.md) | MCP 协议、工具清单、接入方式 |
| [README.md](README.md) | 架构总览 |

## 构建

需要 JDK 17、Android SDK 35、NDK 27、CMake 3.22。

```bash
gradle :app:assembleDebug
```

CI 配置在 `.github/workflows/build.yml`，push 到 `main` 自动构建。
