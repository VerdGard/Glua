package com.so.revelation.glua.core.mcp

import com.so.revelation.glua.core.log.GLog

/**
 * MCP (Model Context Protocol) 协议处理器。
 *
 * 支持的 JSON-RPC 方法：
 * - `initialize`            握手，返回能力声明
 * - `notifications/initialized` 客户端确认（无响应）
 * - `tools/list`            列出全部工具
 * - `tools/call`            调用工具
 * - `ping`                  健康检查
 *
 * 版本：MCP 2024-11-05。这是目前 Claude Desktop / Cline / Continue 通用的版本。
 *
 * 无状态设计：不保存会话。`initialize` 的返回是固定的，
 * 因为本服务不依赖客户端能力协商。
 */
class McpProtocol(
    private val registry: McpRegistry,
    private val serverName: String = "glua",
    private val serverVersion: String = "1.0.0",
) {

    private companion object {
        const val TAG = "McpProtocol"
        const val PROTOCOL_VERSION = "2024-11-05"
    }

    /**
     * 处理一条 JSON-RPC 消息。
     *
     * @return 响应消息；如果是通知（无 id）则返回 null
     */
    fun handle(request: JsonValue): JsonValue? {
        val obj = request as? JsonValue.Obj
            ?: return JsonRpc.error(JsonValue.Null, RpcError.INVALID_REQUEST, "请求必须是 JSON 对象")

        val method = (obj.fields["method"] as? JsonValue.Str)?.value
            ?: return JsonRpc.error(
                obj.fields["id"] ?: JsonValue.Null,
                RpcError.INVALID_REQUEST,
                "缺少 method 字段",
            )

        val id = obj.fields["id"]
        val params = obj.fields["params"] as? JsonValue.Obj ?: JsonValue.Obj(emptyMap())

        // 通知没有 id，不需要响应
        val isNotification = id == null

        GLog.d(TAG, "收到 $method${if (isNotification) " (通知)" else ""}")

        val response = when (method) {
            "initialize" -> handleInitialize(id ?: JsonValue.Null)
            "notifications/initialized" -> null
            "notifications/cancelled" -> null
            "ping" -> if (id != null) JsonRpc.success(id, JsonValue.Obj(emptyMap())) else null
            "tools/list" -> handleToolsList(id ?: JsonValue.Null)
            "tools/call" -> handleToolsCall(id ?: JsonValue.Null, params)
            "resources/list" -> if (id != null) JsonRpc.success(id, JsonValue.obj("resources" to emptyList<Any>())) else null
            "prompts/list" -> if (id != null) JsonRpc.success(id, JsonValue.obj("prompts" to emptyList<Any>())) else null
            else -> if (id != null) {
                JsonRpc.error(id, RpcError.METHOD_NOT_FOUND, "不支持的方法: $method")
            } else null
        }

        return if (isNotification) null else response
    }

    // ---------------------------------------------------------- initialize

    private fun handleInitialize(id: JsonValue): JsonValue {
        val result = JsonValue.obj(
            "protocolVersion" to PROTOCOL_VERSION,
            "capabilities" to JsonValue.obj(
                "tools" to JsonValue.Obj(emptyMap()),
            ),
            "serverInfo" to JsonValue.obj(
                "name" to serverName,
                "version" to serverVersion,
            ),
            "instructions" to buildString {
                append("Glua 是 Android 上的 Lua 脚本编辑器。")
                append("你可以用 script_list / script_read 浏览脚本，")
                append("用 script_write / script_create 修改代码，")
                append("用 lua_check 做静态检查，用 script_run 执行并拿到输出，")
                append("用 log_query 查看运行日志，用 gg_api_get 查阅 GameGuardian API 文档。")
                append("\n\n注意：gg.* 的内存读写函数需要 root 权限。")
                append("无 root 时这些函数会返回错误字符串，脚本会继续执行而不是中断。")
                append("调用 gg_api_list 并设置 availableOnly=true 可以只看当前环境可用的函数。")
            },
        )
        GLog.i(TAG, "客户端完成 initialize 握手")
        return JsonRpc.success(id, result)
    }

    // ---------------------------------------------------------- tools

    private fun handleToolsList(id: JsonValue): JsonValue {
        val toolsJson = registry.tools.map { tool ->
            JsonValue.obj(
                "name" to tool.name,
                "description" to tool.description,
                "inputSchema" to tool.inputSchema,
            )
        }
        return JsonRpc.success(id, JsonValue.obj("tools" to JsonValue.Arr(toolsJson)))
    }

    private fun handleToolsCall(id: JsonValue, params: JsonValue.Obj): JsonValue {
        val name = (params.fields["name"] as? JsonValue.Str)?.value
            ?: return JsonRpc.error(id, RpcError.INVALID_PARAMS, "缺少工具名")

        val args = params.fields["arguments"] as? JsonValue.Obj ?: JsonValue.Obj(emptyMap())

        GLog.i(TAG, "调用工具 $name")
        val result = registry.call(name, args)

        return JsonRpc.success(
            id,
            JsonValue.Obj(
                mapOf(
                    "content" to result.toJson().let { (it as JsonValue.Obj).fields["content"]!! },
                    "isError" to JsonValue.Bool(result.isError),
                )
            ),
        )
    }
}
