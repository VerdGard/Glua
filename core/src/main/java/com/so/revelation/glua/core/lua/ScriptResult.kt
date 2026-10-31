package com.so.revelation.glua.core.lua

/** 脚本执行结果。 */
sealed interface ScriptResult {

    data class Success(val output: List<String>, val elapsedMs: Long) : ScriptResult

    data class CompileError(val message: String, val detail: String?) : ScriptResult

    data class RuntimeError(
        val message: String,
        val detail: String?,
        val output: List<String>,
        val elapsedMs: Long,
    ) : ScriptResult

    data object Cancelled : ScriptResult
}
