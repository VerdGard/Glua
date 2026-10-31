package com.so.revelation.glua.core.mcp

import com.so.revelation.glua.core.log.GLog
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.InputStream
import java.io.OutputStream
import java.net.InetSocketAddress
import java.net.ServerSocket
import java.net.Socket
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

/**
 * 极简 HTTP 服务器，为 MCP 提供两种传输：
 *
 * 1. **Streamable HTTP**（推荐）：`POST /mcp`，请求体是 JSON-RPC，
 *    响应体直接是 JSON-RPC 结果。这是 MCP 2024-11-05 的标准方式。
 * 2. **HTTP + SSE**（兼容旧客户端）：`GET /sse` 建立事件流，
 *    服务端通过该流下发 endpoint 事件与消息；`POST /message` 提交请求。
 *
 * 另有 `GET /health` 返回服务状态与工具列表，方便用浏览器确认服务活着。
 *
 * 为什么不用 Ktor/NanoHTTPD：:core 要能在纯 JVM 与 Android 上跑，
 * 引入 Web 框架会带来大量依赖。MCP 只需要极少 HTTP 功能，
 * 手写 200 行足够，且不引入版本冲突风险。
 */
class McpHttpServer(
    private val protocol: McpProtocol,
    private val registry: McpRegistry,
    private val port: Int = DEFAULT_PORT,
    private val host: String = "127.0.0.1",
) {

    companion object {
        const val TAG = "McpHttpServer"
        const val DEFAULT_PORT = 8787

        /** 单次请求体上限，防止恶意大包。 */
        private const val MAX_BODY = 4 * 1024 * 1024

        /** 单次读取超时。 */
        private const val READ_TIMEOUT_MS = 30_000
    }

    private var serverSocket: ServerSocket? = null
    private val running = AtomicBoolean(false)
    private val threadPool = Executors.newFixedThreadPool(4) { r ->
        Thread(r, "mcp-http-${counter.incrementAndGet()}").apply { isDaemon = true }
    }
    private val counter = AtomicInteger(0)

    /** SSE 客户端连接，key 为 sessionId。 */
    private val sseClients = java.util.concurrent.ConcurrentHashMap<String, SseConnection>()

    /** 记录请求计数，/health 里展示。 */
    private val requestCount = AtomicInteger(0)

    val isRunning: Boolean get() = running.get()
    val actualPort: Int get() = serverSocket?.localPort ?: port

    // ---------------------------------------------------------- 生命周期

    fun start(): Boolean {
        if (running.get()) {
            GLog.w(TAG, "服务已在运行")
            return true
        }
        return try {
            val ss = ServerSocket()
            ss.reuseAddress = true
            ss.bind(InetSocketAddress(host, port))
            serverSocket = ss
            running.set(true)

            thread(name = "mcp-accept", isDaemon = true) {
                GLog.i(TAG, "MCP 服务启动: http://$host:${ss.localPort}")
                while (running.get()) {
                    try {
                        val client = ss.accept()
                        threadPool.execute { handleClient(client) }
                    } catch (e: Exception) {
                        if (running.get()) GLog.w(TAG, "accept 异常: ${e.message}")
                    }
                }
            }
            true
        } catch (e: Exception) {
            GLog.e(TAG, "启动失败: ${e.message}", e)
            running.set(false)
            false
        }
    }

    fun stop() {
        if (!running.getAndSet(false)) return
        sseClients.values.forEach { it.close() }
        sseClients.clear()
        runCatching { serverSocket?.close() }
        serverSocket = null
        GLog.i(TAG, "MCP 服务已停止")
    }

    // ---------------------------------------------------------- 请求处理

    private fun handleClient(socket: Socket) {
        socket.soTimeout = READ_TIMEOUT_MS
        try {
            val input = BufferedInputStream(socket.getInputStream())
            val output = BufferedOutputStream(socket.getOutputStream())

            val request = readRequest(input) ?: run {
                writeResponse(output, 400, "text/plain", "Bad Request".toByteArray())
                return
            }
            requestCount.incrementAndGet()

            when {
                request.method == "GET" && request.path == "/sse" -> handleSse(socket, output)
                request.method == "POST" && request.path == "/message" -> handleSseMessage(request, output)
                request.method == "POST" && (request.path == "/mcp" || request.path == "/") ->
                    handleMcpPost(request, output)
                request.method == "GET" && request.path == "/health" -> handleHealth(output)
                request.method == "OPTIONS" -> handleCors(output)
                else -> writeResponse(output, 404, "text/plain", "Not Found".toByteArray())
            }
            output.flush()
        } catch (e: Exception) {
            GLog.w(TAG, "处理请求异常: ${e.message}")
        } finally {
            runCatching { socket.close() }
        }
    }

    /** Streamable HTTP：一问一答。 */
    private fun handleMcpPost(request: HttpRequest, output: OutputStream) {
        val text = String(request.body, Charsets.UTF_8)
        val json = JsonRpc.tryParse(text)

        if (json == null) {
            val err = JsonRpc.error(JsonValue.Null, RpcError.PARSE_ERROR, "JSON 解析失败")
            writeResponse(
                output, 200, "application/json",
                Json.stringify(err).toByteArray(Charsets.UTF_8),
            )
            return
        }

        // 可能是批量请求
        if (json is JsonValue.Arr) {
            val responses = json.items.mapNotNull { protocol.handle(it) }
            val body = if (responses.isEmpty()) "" else
                Json.stringify(JsonValue.Arr(responses))
            if (body.isEmpty()) {
                writeResponse(output, 202, "application/json", ByteArray(0))
            } else {
                writeResponse(output, 200, "application/json", body.toByteArray(Charsets.UTF_8))
            }
            return
        }

        val response = protocol.handle(json)
        if (response == null) {
            // 通知，无响应体
            writeResponse(output, 202, "application/json", ByteArray(0))
        } else {
            writeResponse(
                output, 200, "application/json",
                Json.stringify(response).toByteArray(Charsets.UTF_8),
            )
        }
    }

    /**
     * SSE 模式：GET /sse 建立长连接，服务端先下发 endpoint 事件，
     * 之后客户端 POST /message?sessionId=xxx 提交请求，
     * 服务端把响应通过 SSE 流推回。
     */
    private fun handleSse(socket: Socket, output: OutputStream) {
        val sessionId = java.util.UUID.randomUUID().toString()
        val conn = SseConnection(socket, output)
        sseClients[sessionId] = conn

        GLog.i(TAG, "SSE 客户端连接: $sessionId")

        // 告知客户端往哪里 POST
        conn.sendEvent("endpoint", "/message?sessionId=$sessionId")

        // 保持连接，直到客户端断开或服务停止
        try {
            while (running.get() && !conn.closed) {
                Thread.sleep(500)
                // 心跳，防止中间代理断开
                conn.sendComment("ping")
            }
        } catch (_: InterruptedException) {
        } finally {
            sseClients.remove(sessionId)
            conn.close()
            GLog.i(TAG, "SSE 客户端断开: $sessionId")
        }
    }

    private fun handleSseMessage(request: HttpRequest, output: OutputStream) {
        val sessionId = request.query["sessionId"]
        val conn = sessionId?.let { sseClients[it] }
        if (conn == null) {
            writeResponse(output, 404, "text/plain", "SSE 会话不存在".toByteArray())
            return
        }

        val text = String(request.body, Charsets.UTF_8)
        val json = JsonRpc.tryParse(text)
        if (json == null) {
            writeResponse(output, 400, "text/plain", "JSON 解析失败".toByteArray())
            return
        }

        // 通过 SSE 流回传响应
        val response = protocol.handle(json)
        if (response != null) {
            conn.sendEvent("message", Json.stringify(response))
        }

        writeResponse(output, 202, "text/plain", ByteArray(0))
    }

    private fun handleHealth(output: OutputStream) {
        val info = JsonValue.obj(
            "status" to "ok",
            "server" to "glua-mcp",
            "protocol" to "2024-11-05",
            "tools" to registry.tools.size,
            "requests" to requestCount.get(),
            "sseClients" to sseClients.size,
            "transports" to JsonValue.arr(listOf("streamable-http", "sse")),
            "toolNames" to JsonValue.arr(registry.tools.map { it.name }),
        )
        writeResponse(
            output, 200, "application/json",
            Json.stringify(info).toByteArray(Charsets.UTF_8),
        )
    }

    private fun handleCors(output: OutputStream) {
        val headers = buildString {
            append("HTTP/1.1 204 No Content\r\n")
            append("Access-Control-Allow-Origin: *\r\n")
            append("Access-Control-Allow-Methods: GET, POST, OPTIONS\r\n")
            append("Access-Control-Allow-Headers: Content-Type\r\n")
            append("Access-Control-Max-Age: 86400\r\n")
            append("Content-Length: 0\r\n")
            append("\r\n")
        }
        output.write(headers.toByteArray(Charsets.UTF_8))
        output.flush()
    }

    // ---------------------------------------------------------- HTTP 解析

    data class HttpRequest(
        val method: String,
        val path: String,
        val query: Map<String, String>,
        val headers: Map<String, String>,
        val body: ByteArray,
    )

    private fun readRequest(input: InputStream): HttpRequest? {
        val requestLine = readLine(input) ?: return null
        val parts = requestLine.split(' ')
        if (parts.size < 2) return null

        val method = parts[0]
        val fullPath = parts[1]
        val path = fullPath.substringBefore('?')
        val query = fullPath.substringAfter('?', "")
            .split('&')
            .filter { it.contains('=') }
            .associate {
                val k = it.substringBefore('=')
                val v = it.substringAfter('=')
                java.net.URLDecoder.decode(k, "UTF-8") to java.net.URLDecoder.decode(v, "UTF-8")
            }

        val headers = LinkedHashMap<String, String>()
        while (true) {
            val line = readLine(input) ?: break
            if (line.isEmpty()) break
            val idx = line.indexOf(':')
            if (idx > 0) {
                headers[line.substring(0, idx).trim().lowercase()] = line.substring(idx + 1).trim()
            }
        }

        val contentLength = headers["content-length"]?.toIntOrNull() ?: 0
        if (contentLength > MAX_BODY) {
            GLog.w(TAG, "请求体过大: $contentLength")
            return null
        }
        val body = ByteArray(contentLength)
        var read = 0
        while (read < contentLength) {
            val n = input.read(body, read, contentLength - read)
            if (n <= 0) break
            read += n
        }

        return HttpRequest(method, path, query, headers, body)
    }

    private fun readLine(input: InputStream): String? {
        val sb = StringBuilder()
        var prev = -1
        while (true) {
            val c = input.read()
            if (c < 0) return if (sb.isEmpty()) null else sb.toString()
            if (c == '\n'.code) {
                if (prev == '\r'.code) sb.setLength(sb.length - 1)
                return sb.toString()
            }
            sb.append(c.toChar())
            prev = c
        }
    }

    private fun writeResponse(
        output: OutputStream,
        code: Int,
        contentType: String,
        body: ByteArray,
    ) {
        val reason = when (code) {
            200 -> "OK"
            202 -> "Accepted"
            204 -> "No Content"
            400 -> "Bad Request"
            404 -> "Not Found"
            500 -> "Internal Server Error"
            else -> "Unknown"
        }
        val header = buildString {
            append("HTTP/1.1 $code $reason\r\n")
            append("Content-Type: $contentType; charset=utf-8\r\n")
            append("Content-Length: ${body.size}\r\n")
            append("Access-Control-Allow-Origin: *\r\n")
            append("Cache-Control: no-store\r\n")
            append("\r\n")
        }
        output.write(header.toByteArray(Charsets.UTF_8))
        if (body.isNotEmpty()) output.write(body)
        output.flush()
    }

    // ---------------------------------------------------------- SSE

    /** 一条 SSE 长连接。 */
    private class SseConnection(
        private val socket: Socket,
        private val output: OutputStream,
    ) {
        @Volatile
        var closed = false
            private set

        init {
            // SSE 响应头
            val headers = buildString {
                append("HTTP/1.1 200 OK\r\n")
                append("Content-Type: text/event-stream; charset=utf-8\r\n")
                append("Cache-Control: no-cache\r\n")
                append("Connection: keep-alive\r\n")
                append("Access-Control-Allow-Origin: *\r\n")
                append("\r\n")
            }
            output.write(headers.toByteArray(Charsets.UTF_8))
            output.flush()
        }

        @Synchronized
        fun sendEvent(event: String, data: String) {
            if (closed) return
            try {
                val payload = "event: $event\ndata: $data\n\n"
                output.write(payload.toByteArray(Charsets.UTF_8))
                output.flush()
            } catch (e: Exception) {
                closed = true
            }
        }

        @Synchronized
        fun sendComment(text: String) {
            if (closed) return
            try {
                output.write(": $text\n\n".toByteArray(Charsets.UTF_8))
                output.flush()
            } catch (e: Exception) {
                closed = true
            }
        }

        fun close() {
            closed = true
            runCatching { output.close() }
            runCatching { socket.close() }
        }
    }
}
