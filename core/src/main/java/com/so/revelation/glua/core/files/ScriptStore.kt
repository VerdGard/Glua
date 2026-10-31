package com.so.revelation.glua.core.files

import com.so.revelation.glua.core.log.GLog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File

data class ScriptFile(
    val file: File,
    val name: String,
    val sizeBytes: Long,
    val lastModified: Long,
) {
    val sizeLabel: String
        get() = when {
            sizeBytes < 1024 -> "$sizeBytes B"
            sizeBytes < 1024 * 1024 -> "%.1f KB".format(sizeBytes / 1024.0)
            else -> "%.1f MB".format(sizeBytes / 1024.0 / 1024.0)
        }
}

/**
 * 脚本仓库：列举、读写、新建、重命名、删除。
 * 全部操作在 IO 调度器上执行，并通过 GLog 记录以便在应用内日志面板排查。
 */
class ScriptStore(private val root: File) {

    private companion object {
        const val TAG = "ScriptStore"
        const val LUA_SUFFIX = ".lua"
    }

    init {
        GLog.i(TAG, "脚本目录: ${root.absolutePath}")
    }

    suspend fun ensureRoot(): Boolean = withContext(Dispatchers.IO) {
        if (root.exists()) {
            if (root.isDirectory) true else {
                GLog.e(TAG, "根路径存在但不是目录: ${root.absolutePath}")
                false
            }
        } else {
            val ok = root.mkdirs()
            GLog.i(TAG, if (ok) "已创建脚本目录" else "创建脚本目录失败")
            ok
        }
    }

    suspend fun list(): List<ScriptFile> = withContext(Dispatchers.IO) {
        if (!root.isDirectory) {
            GLog.w(TAG, "目录不存在，返回空列表")
            return@withContext emptyList()
        }
        val files = root.listFiles()
            ?.filter { it.isFile && it.name.endsWith(LUA_SUFFIX, ignoreCase = true) }
            ?.map { ScriptFile(it, it.name, it.length(), it.lastModified()) }
            ?.sortedBy { it.name.lowercase() }
            ?: emptyList()
        GLog.d(TAG, "列出 ${files.size} 个脚本")
        files
    }

    suspend fun read(file: File): String? = withContext(Dispatchers.IO) {
        runCatching { file.readText() }
            .onSuccess { GLog.d(TAG, "读取 ${file.name}，${it.length} 字符") }
            .onFailure { GLog.e(TAG, "读取 ${file.name} 失败", it) }
            .getOrNull()
    }

    suspend fun write(file: File, content: String): Boolean = withContext(Dispatchers.IO) {
        runCatching { file.writeText(content) }
            .onSuccess { GLog.i(TAG, "保存 ${file.name}，${content.length} 字符") }
            .onFailure { GLog.e(TAG, "保存 ${file.name} 失败", it) }
            .isSuccess
    }

    suspend fun create(baseName: String, content: String = ""): File? = withContext(Dispatchers.IO) {
        val safe = baseName.trim().ifEmpty { "untitled" }.sanitize()
        val withSuffix = if (safe.endsWith(LUA_SUFFIX)) safe else safe + LUA_SUFFIX
        val target = uniqueFile(withSuffix)
        runCatching {
            target.parentFile?.mkdirs()
            target.writeText(content)
            GLog.i(TAG, "新建脚本 ${target.name}")
            target
        }.onFailure { GLog.e(TAG, "新建脚本失败", it) }.getOrNull()
    }

    suspend fun rename(file: File, newName: String): File? = withContext(Dispatchers.IO) {
        val safe = newName.trim().sanitize()
        if (safe.isEmpty()) {
            GLog.w(TAG, "重命名失败：名称为空")
            return@withContext null
        }
        val withSuffix = if (safe.endsWith(LUA_SUFFIX)) safe else safe + LUA_SUFFIX
        val target = File(file.parentFile, withSuffix)
        if (target.exists()) {
            GLog.w(TAG, "重命名失败：目标已存在 ${target.name}")
            return@withContext null
        }
        runCatching { require(file.renameTo(target)) { "renameTo 返回 false" }; target }
            .onSuccess { GLog.i(TAG, "重命名 ${file.name} -> ${target.name}") }
            .onFailure { GLog.e(TAG, "重命名失败", it) }
            .getOrNull()
    }

    suspend fun delete(file: File): Boolean = withContext(Dispatchers.IO) {
        runCatching { require(file.delete()) { "delete 返回 false" } }
            .onSuccess { GLog.i(TAG, "删除 ${file.name}") }
            .onFailure { GLog.e(TAG, "删除 ${file.name} 失败", it) }
            .isSuccess
    }

    private fun uniqueFile(name: String): File {
        var candidate = File(root, name)
        if (!candidate.exists()) return candidate
        val base = name.removeSuffix(LUA_SUFFIX)
        var index = 1
        while (index <= 999) {
            candidate = File(root, "$base($index)$LUA_SUFFIX")
            if (!candidate.exists()) return candidate
            index++
        }
        return File(root, "$base(${System.currentTimeMillis()})$LUA_SUFFIX")
    }

    private fun String.sanitize(): String =
        this.replace(Regex("""[\\/:*?"<>|]"""), "_").take(100)
}
