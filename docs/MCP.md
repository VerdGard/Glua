# Glua MCP 服务器

Glua 内置一个 MCP（Model Context Protocol）服务器，让 AI 客户端能够
读写脚本、运行代码、查询日志、查阅 GameGuardian API 文档。

## 快速开始

### 1. 启动服务

打开 Glua → 设置 → **MCP 服务器** → 打开「启用 MCP 服务」。

默认监听 `127.0.0.1:8787`。端口可自定义。

### 2. 健康检查

```bash
curl http://127.0.0.1:8787/health
```

返回：

```json
{
  "status": "ok",
  "server": "glua-mcp",
  "protocol": "2024-11-05",
  "tools": 14,
  "transports": ["streamable-http", "sse"],
  "toolNames": ["script_list", "script_read", "..."]
}
```

### 3. 接入客户端

**Claude Desktop / Cline / Continue（Streamable HTTP）**

```json
{
  "mcpServers": {
    "glua": {
      "type": "http",
      "url": "http://127.0.0.1:8787/mcp"
    }
  }
}
```

**SSE 模式（旧版客户端）**

```json
{
  "mcpServers": {
    "glua": {
      "type": "sse",
      "url": "http://127.0.0.1:8787/sse"
    }
  }
}
```

## 传输协议

服务端同时支持两种传输，客户端按需选择。

### Streamable HTTP（推荐）

| 方法 | 路径 | 说明 |
|---|---|---|
| POST | `/mcp` | 请求体为 JSON-RPC，响应体直接是结果 |
| GET | `/health` | 健康检查与工具列表 |

支持批量请求（JSON 数组）。通知（无 `id`）返回 `202` 空响应。

```bash
curl -X POST http://127.0.0.1:8787/mcp \
  -H 'Content-Type: application/json' \
  -d '{"jsonrpc":"2.0","id":1,"method":"tools/list"}'
```

### HTTP + SSE

| 方法 | 路径 | 说明 |
|---|---|---|
| GET | `/sse` | 建立事件流，服务端先下发 `endpoint` 事件 |
| POST | `/message?sessionId=...` | 提交请求，响应经 SSE 流推回 |

流程：

```
客户端 GET /sse
  ← event: endpoint
  ← data: /message?sessionId=abc-123

客户端 POST /message?sessionId=abc-123  {json-rpc}
  → 202 Accepted
  ← event: message
  ← data: {json-rpc 响应}
```

服务端每 500ms 发送 `: ping` 注释保活。

## 工具清单

共 14 个工具，分四组。

### 脚本文件

| 工具 | 说明 | 参数 |
|---|---|---|
| `script_list` | 列出所有 .lua 文件 | 无 |
| `script_read` | 读取脚本内容 | `name` |
| `script_write` | 覆盖写入（不存在则创建） | `name`, `content` |
| `script_create` | 新建脚本，同名自动加序号 | `name`, `content?` |
| `script_delete` | 删除脚本 | `name` |

`name` 可以带或不带 `.lua` 后缀。

### 运行

| 工具 | 说明 | 参数 |
|---|---|---|
| `script_run` | 执行脚本或内联代码 | `name?`, `source?`, `timeoutMs?` |
| `script_cancel` | 中止运行中的脚本 | 无 |

`script_run` 的 `name` 与 `source` 二选一。返回格式化文本：

```
脚本: main.lua
状态: ok
耗时: 12 ms

--- 输出 (3 行) ---
hello
sum = 5050
done
```

失败时 `isError: true`，并附错误详情。

**超时**：默认 30 秒，可设 1~120 秒。超时后自动请求中止。

**中止的局限**：LuaJ 不支持指令级中断。`while true do end` 这类脚本只能在
语句边界响应，可能仍然跑满超时。含 `gg.sleep` 的脚本响应及时。

### 分析

| 工具 | 说明 | 参数 |
|---|---|---|
| `lua_check` | 语法检查，不执行 | `source`, `name?` |
| `lua_complete` | 光标处补全建议 | `source`, `cursor?` |

`lua_check` 返回词法统计、块关键字平衡、未知 `gg.*` 引用。
**修改代码后建议先调用它**，比运行后看错误更快。

### GameGuardian API

| 工具 | 说明 | 参数 |
|---|---|---|
| `gg_api_list` | 列出全部函数与常量 | `keyword?`, `availableOnly?`, `includeConstants?` |
| `gg_api_get` | 单个函数的完整文档 | `name` |

`gg_api_get` 返回官方签名的中文说明、参数描述、返回值说明与示例代码。
数据源是原 APK 内的 `AGG_LUA_API_ZN.json`，与 GameGuardian 官方文档一致。

**无 root 环境**下，`availableOnly=true` 可以只看能用的函数。

### 日志与环境

| 工具 | 说明 | 参数 |
|---|---|---|
| `log_query` | 查询日志（类 logcat） | `minLevel?`, `tag?`, `text?`, `limit?` |
| `log_clear` | 清空日志缓冲 | 无 |
| `env_info` | 运行环境信息 | 无 |

`log_query` 的 `minLevel` 取 `V`/`D`/`I`/`W`/`E`/`A`。
`env_info` 返回 root 状态、内存 API 可用性、脚本目录、缓冲用量。

## 典型用法

### 写一个脚本并运行

```
1. script_create  { "name": "hello" }
2. script_write   { "name": "hello", "content": "print('hi')" }
3. lua_check      { "source": "print('hi')" }
4. script_run     { "name": "hello" }
```

### 诊断运行失败

```
1. script_run  { "name": "fail" }        → isError, 有错误信息
2. log_query   { "minLevel": "E", "limit": 20 }
3. gg_api_get  { "name": "searchNumber" } → 确认函数是否存在、是否需 root
```

### 查 GameGuardian API 用法

```
1. gg_api_list { "keyword": "search" }
2. gg_api_get  { "name": "searchNumber" }
```

## 无 root 环境

`gg.*` 中依赖内存读写的 26 个函数在无 root 时：

- **不抛异常**，返回错误字符串，例如
  `"错误: gg.searchNumber 需要读写目标进程内存，当前设备未 root"`
- 脚本继续执行，不会中断
- `script_run` 仍返回 `status: ok`（脚本本身没出错）

这是 GameGuardian 的 API 约定：`local ok = gg.searchNumber(...)`，
调用方用返回值判断而非 pcall。MCP 层保持一致。

## 协议细节

- 版本：`2024-11-05`
- JSON-RPC：`2.0`
- 支持方法：`initialize`、`notifications/initialized`、`ping`、
  `tools/list`、`tools/call`、`resources/list`、`prompts/list`
- 无状态：不保存会话，`initialize` 返回固定内容

## 安全

- 默认只绑定 `127.0.0.1`，仅本机可访问
- 如需局域网访问，在设置页把 host 改为 `0.0.0.0`，
  但**这会允许同网段任何设备读写你的脚本并执行代码**
- 服务无鉴权。不要在不可信网络上开启
- 请求体上限 4 MB

## 故障排查

| 现象 | 原因 | 处理 |
|---|---|---|
| 端口被占用 | 其他进程占用 8787 | 换端口 |
| 连接被拒绝 | 服务未启动 | 设置页打开开关 |
| `tools/call` 返回 `未知工具` | 工具名拼错 | `tools/list` 查看 |
| `script_run` 超时 | 死循环 | `script_cancel` 后改代码 |
| 运行返回 `需要 root` | 内存函数 | 正常降级，非 bug |
