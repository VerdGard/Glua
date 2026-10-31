package com.so.revelation.glua.mcp

import com.so.revelation.glua.core.files.ScriptStore
import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.lua.LuaEngine
import com.so.revelation.glua.core.lua.ScriptResult
import com.so.revelation.glua.core.mcp.McpRegistry
import kotlinx.coroutines.runBlocking
import java.io.File

/**
 * 把 App 的具体实现注入 [McpRegistry]。
 *
 * MCP 与 UI 共享同一个 [ScriptStore] 与 [LuaEngine] 实例，
 * 因此通过 MCP 修改的文件会立刻反映到 App，反之亦然。
 */
class AppMcpBridge(
    private val store: ScriptStore,
    private val engine: LuaEngine,
) : McpRegistry.McpDependencies {

    private companion object {
        const val TAG = "AppMcpBridge"
    }

    private val runLock = Any()

    @Volatile
    private var running = false

    override fun scriptsDir(): File = store.rootPath()

    override fun listScripts(): List<File> = runBlocking {
        store.list().map { it.file }
    }

    override fun readScript(file: File): String? = runBlocking {
        store.read(file)
    }

    override fun writeScript(file: File, content: String): Boolean = runBlocking {
        store.write(file, content)
    }

    override fun createScript(name: String, content: String): File? = runBlocking {
        store.create(name, content)
    }

    override fun deleteScript(file: File): Boolean = runBlocking {
        store.delete(file)
    }

    /**
     * 执行脚本。MCP 是请求-响应模型，必须在工具调用返回前拿到结果，
     * 因此这里阻塞等待。调用发生在 HTTP 工作线程上，不影响主线程。
     */
    override suspend fun runScript(
        source: String,
        name: String,
        onOutput: (String) -> Unit,
    ): McpRegistry.RunOutcome {
        synchronized(runLock) { running = true }
        try {
            GLog.i(TAG, "MCP 运行脚本: $name (${source.length} 字符)")
            val result = engine.execute(
                source = source,
                chunkName = name,
                scriptDir = scriptsDir(),
                onOutput = onOutput,
            )
            return when (result) {
                is ScriptResult.Success -> McpRegistry.RunOutcome(
                    status = "ok",
                    output = result.output,
                    error = null,
                    elapsedMs = result.elapsedMs,
                )
                is ScriptResult.CompileError -> McpRegistry.RunOutcome(
                    status = "error",
                    output = emptyList(),
                    error = "编译错误: ${result.message}\n${result.detail.orEmpty()}".trim(),
                    elapsedMs = 0,
                )
                is ScriptResult.RuntimeError -> McpRegistry.RunOutcome(
                    status = "error",
                    output = result.output,
                    error = "运行错误: ${result.message}\n${result.detail.orEmpty()}".trim(),
                    elapsedMs = result.elapsedMs,
                )
                ScriptResult.Cancelled -> McpRegistry.RunOutcome(
                    status = "cancelled",
                    output = emptyList(),
                    error = "脚本已中止",
                    elapsedMs = 0,
                )
            }
        } finally {
            synchronized(runLock) { running = false }
        }
    }

    override fun cancelRun() {
        engine.cancel()
    }

    override fun isRunning(): Boolean = running
}
