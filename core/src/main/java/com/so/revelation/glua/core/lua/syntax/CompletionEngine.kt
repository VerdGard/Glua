package com.so.revelation.glua.core.lua.syntax

import com.so.revelation.glua.core.lua.gg.GgApiCatalog
import com.so.revelation.glua.core.lua.gg.GgConstants
import com.so.revelation.glua.core.lua.gg.GgEnvironment

/**
 * 补全引擎。
 *
 * 三种触发场景：
 * 1. `gg.` 之后  -> 列出全部 gg 函数与常量，附带签名与可用性
 * 2. `gg.se` 之后 -> 按前缀过滤
 * 3. 其它位置     -> 关键字、内置函数、本文档定义的局部变量
 *
 * 纯函数，无状态，可安全在线程池调用。
 */
object CompletionEngine {

    private val KEYWORDS = listOf(
        "and", "break", "do", "else", "elseif", "end", "false", "for",
        "function", "goto", "if", "in", "local", "nil", "not", "or",
        "repeat", "return", "then", "true", "until", "while",
    )

    private val BUILTINS = listOf(
        "assert", "collectgarbage", "dofile", "error", "getmetatable",
        "ipairs", "load", "loadfile", "next", "pairs", "pcall", "print",
        "rawequal", "rawget", "rawlen", "rawset", "require", "select",
        "setmetatable", "tonumber", "tostring", "type", "xpcall",
    )

    private val LIBRARY_FUNCS = mapOf(
        "string" to listOf("byte", "char", "dump", "find", "format", "gmatch", "gsub", "len", "lower", "match", "pack", "packsize", "rep", "reverse", "sub", "unpack", "upper"),
        "table" to listOf("concat", "insert", "move", "pack", "remove", "sort", "unpack"),
        "math" to listOf("abs", "ceil", "cos", "deg", "exp", "floor", "fmod", "huge", "log", "max", "maxinteger", "min", "mininteger", "modf", "pi", "rad", "random", "randomseed", "sin", "sqrt", "tan", "tointeger", "type", "ult"),
        "os" to listOf("clock", "date", "difftime", "execute", "exit", "getenv", "remove", "rename", "setlocale", "time", "tmpname"),
        "io" to listOf("close", "flush", "input", "lines", "open", "output", "popen", "read", "tmpfile", "type", "write"),
    )

    /**
     * 计算补全建议。
     *
     * @param text   完整文档
     * @param cursor 光标位置
     * @return 建议列表，按相关性排序；无建议时为空
     */
    fun complete(text: String, cursor: Int): List<CompletionItem> {
        if (cursor < 0 || cursor > text.length) return emptyList()

        val before = text.substring(0, cursor)
        val wordStart = findWordStart(before)
        val prefix = before.substring(wordStart)

        // 场景：gg.<partial>
        val ggMatch = Regex("""\bgg\.(\w*)$""").find(before)
        if (ggMatch != null) {
            val partial = ggMatch.groupValues[1]
            return ggCompletions(partial)
        }

        // 场景：lib.<partial>
        val libMatch = Regex("""\b(string|table|math|os|io)\.(\w*)$""").find(before)
        if (libMatch != null) {
            val lib = libMatch.groupValues[1]
            val partial = libMatch.groupValues[2]
            return (LIBRARY_FUNCS[lib] ?: emptyList())
                .filter { it.startsWith(partial) }
                .map {
                    CompletionItem(
                        label = "$lib.$it",
                        insertText = it,
                        kind = CompletionKind.FIELD,
                        detail = "$lib 库",
                    )
                }
        }

        // 场景：普通标识符
        if (prefix.isEmpty()) return emptyList()

        val items = ArrayList<CompletionItem>()

        // 本文档里定义的局部变量（优先级最高）
        localVariables(text).filter { it.startsWith(prefix) }.forEach {
            items += CompletionItem(it, kind = CompletionKind.LOCAL, detail = "局部变量")
        }

        KEYWORDS.filter { it.startsWith(prefix) }.forEach {
            items += CompletionItem(it, kind = CompletionKind.KEYWORD, detail = "关键字")
        }

        BUILTINS.filter { it.startsWith(prefix) }.forEach {
            items += CompletionItem(it, kind = CompletionKind.BUILTIN, detail = "内置函数")
        }

        // gg 本身
        if ("gg".startsWith(prefix)) {
            items += CompletionItem(
                label = "gg",
                kind = CompletionKind.GG_FUNCTION,
                detail = "GameGuardian API（${GgApiCatalog.functions.size} 个函数）",
            )
        }

        return items
    }

    /** gg. 之后的补全。 */
    private fun ggCompletions(partial: String): List<CompletionItem> {
        val out = ArrayList<CompletionItem>(GgApiCatalog.functions.size + 40)
        val snapshot = GgEnvironment.snapshot()

        GgApiCatalog.functions
            .filter { it.name.startsWith(partial, ignoreCase = true) }
            .forEach { fn ->
                val avail = GgEnvironment.availabilityOf(fn.name)
                out += CompletionItem(
                    label = fn.name,
                    insertText = fn.shortSignature(),
                    kind = CompletionKind.GG_FUNCTION,
                    detail = "${fn.returns} ${fn.shortSignature()}",
                    documentation = fn.documentText(),
                    available = avail.available,
                    unavailableReason = avail.reason,
                )
            }

        GgConstants.NUMERIC.keys
            .filter { it.startsWith(partial, ignoreCase = true) }
            .sorted()
            .forEach { c ->
                out += CompletionItem(
                    label = c,
                    kind = CompletionKind.GG_CONSTANT,
                    detail = "常量 ${GgConstants.NUMERIC[c]}",
                )
            }

        // 无 root 时把不可用项排到后面，但仍展示（用户需要知道它们存在）
        return out.sortedWith(
            compareBy({ !it.available }, { it.kind != CompletionKind.GG_FUNCTION }, { it.label })
        ).also {
            if (!snapshot.rooted) {
                // 排序已处理，这里不需要额外动作
            }
        }
    }

    /** 提取 `local x = ...` 与函数参数里定义的变量名。 */
    private fun localVariables(text: String): Set<String> {
        val names = LinkedHashSet<String>()
        Regex("""\blocal\s+function\s+(\w+)""").findAll(text).forEach { names += it.groupValues[1] }
        Regex("""\blocal\s+([\w\s,]+)\s*=""").findAll(text).forEach { m ->
            m.groupValues[1].split(',').map { it.trim() }.filter { it.isNotEmpty() }.forEach { names += it }
        }
        Regex("""\bfunction\s*[\w.:]*\s*\(([^)]*)\)""").findAll(text).forEach { m ->
            m.groupValues[1].split(',').map { it.trim() }.filter { it.isNotEmpty() }.forEach { names += it }
        }
        Regex("""\bfor\s+([\w\s,]+)\s+(?:=|in)\b""").findAll(text).forEach { m ->
            m.groupValues[1].split(',').map { it.trim() }.filter { it.isNotEmpty() }.forEach { names += it }
        }
        return names
    }

    private fun findWordStart(s: String): Int {
        var i = s.length
        while (i > 0 && (s[i - 1].isLetterOrDigit() || s[i - 1] == '_')) i--
        return i
    }
}
