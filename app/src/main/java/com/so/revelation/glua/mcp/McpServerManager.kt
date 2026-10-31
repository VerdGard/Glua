package com.so.revelation.glua.mcp

import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.mcp.McpHttpServer
import com.so.revelation.glua.core.mcp.McpProtocol
import com.so.revelation.glua.core.mcp.McpRegistry
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * MCP 服务生命周期管理。
 *
 * 单例，供设置页与 Application 共用。状态通过 [state] 暴露给 Compose。
 *
 * 端口默认 8787。绑定 127.0.0.1 时只能本机访问；
 * 如需局域网内其他设备连接，改为 "0.0.0.0"（注意安全风险）。
 */
class McpServerManager(private val bridge: AppMcpBridge) {

    private companion object {
        const val TAG = "McpServerManager"
    }

    data class State(
        val running: Boolean = false,
        val port: Int = McpHttpServer.DEFAULT_PORT,
        val host: String = "127.0.0.1",
        val toolCount: Int = 0,
        val error: String? = null,
    ) {
        val url: String get() = "http://$host:$port/mcp"
        val sseUrl: String get() = "http://$host:$port/sse"
        val healthUrl: String get() = "http://$host:$port/health"
    }

    private val registry = McpRegistry(bridge)
    private val protocol = McpProtocol(registry)

    private var server: McpHttpServer? = null

    private val _state = MutableStateFlow(
        State(toolCount = registry.tools.size)
    )
    val state: StateFlow<State> = _state.asStateFlow()

    /** 工具名列表，设置页用来展示。 */
    val toolNames: List<String> get() = registry.tools.map { it.name }

    fun start(port: Int = McpHttpServer.DEFAULT_PORT, host: String = "127.0.0.1"): Boolean {
        if (_state.value.running) {
            GLog.w(TAG, "MCP 服务已在运行")
            return true
        }
        val srv = McpHttpServer(protocol, registry, port = port, host = host)
        val ok = srv.start()
        return if (ok) {
            server = srv
            _state.value = State(
                running = true,
                port = srv.actualPort,
                host = host,
                toolCount = registry.tools.size,
            )
            GLog.i(TAG, "MCP 已启动 ${_state.value.url}")
            true
        } else {
            _state.value = State(
                running = false,
                port = port,
                host = host,
                toolCount = registry.tools.size,
                error = "启动失败，端口 $port 可能已被占用",
            )
            false
        }
    }

    fun stop() {
        server?.stop()
        server = null
        _state.value = _state.value.copy(running = false, error = null)
        GLog.i(TAG, "MCP 已停止")
    }

    fun toggle(port: Int = McpHttpServer.DEFAULT_PORT) {
        if (_state.value.running) stop() else start(port, _state.value.host)
    }
}
