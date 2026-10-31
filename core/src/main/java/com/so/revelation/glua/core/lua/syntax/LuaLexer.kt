package com.so.revelation.glua.core.lua.syntax

/**
 * Lua 5.3 词法分析器，只做语法高亮所需的最小工作。
 *
 * 不构建 AST、不做语义检查，只按顺序切出 token。
 * 目标是单次线性扫描，能处理 10 万字符的脚本而不卡顿。
 */
object LuaLexer {

    private val KEYWORDS = setOf(
        "and", "break", "do", "else", "elseif", "end", "false", "for",
        "function", "goto", "if", "in", "local", "nil", "not", "or",
        "repeat", "return", "then", "true", "until", "while",
    )

    private val BUILTINS = setOf(
        "assert", "collectgarbage", "dofile", "error", "getmetatable",
        "ipairs", "load", "loadfile", "next", "pairs", "pcall", "print",
        "rawequal", "rawget", "rawlen", "rawset", "require", "select",
        "setmetatable", "tonumber", "tostring", "type", "xpcall",
        "_G", "_VERSION",
    )

    /** 标准库函数，形式为 `lib.func`。 */
    private val LIBRARIES = setOf(
        "string", "table", "math", "io", "os", "coroutine", "debug", "utf8",
    )

    private val OPERATORS = setOf(
        "+", "-", "*", "/", "//", "%", "^", "#", "&", "~", "|", "<<", ">>",
        "==", "~=", "<=", ">=", "<", ">", "=", "..", "...",
    )

    fun tokenize(source: String, ggFunctions: Set<String>, ggConstants: Set<String>): List<LuaToken> {
        val out = ArrayList<LuaToken>(source.length / 4 + 16)
        var i = 0
        val n = source.length

        while (i < n) {
            val c = source[i]

            // ---- 注释
            if (c == '-' && i + 1 < n && source[i + 1] == '-') {
                val end = scanComment(source, i)
                out += LuaToken(i, end, LuaTokenKind.COMMENT, source.substring(i, end))
                i = end
                continue
            }

            // ---- 长括号字符串 [[ ]] 或 [=[ ]=]
            if (c == '[') {
                val level = longBracketLevel(source, i)
                if (level >= 0) {
                    val end = scanLongBracket(source, i, level)
                    out += LuaToken(i, end, LuaTokenKind.STRING, source.substring(i, end))
                    i = end
                    continue
                }
            }

            // ---- 普通字符串
            if (c == '"' || c == '\'') {
                val end = scanQuoted(source, i, c)
                out += LuaToken(i, end, LuaTokenKind.STRING, source.substring(i, end))
                i = end
                continue
            }

            // ---- 数字
            if (c.isDigit() || (c == '.' && i + 1 < n && source[i + 1].isDigit())) {
                val end = scanNumber(source, i)
                out += LuaToken(i, end, LuaTokenKind.NUMBER, source.substring(i, end))
                i = end
                continue
            }

            // ---- 标识符 / 关键字
            if (c.isLetter() || c == '_') {
                val end = scanIdentifier(source, i)
                val word = source.substring(i, end)

                // gg.xxx 特殊处理：整体识别，便于着色与提示
                if (word == "gg" && end < n && source[end] == '.') {
                    val memberEnd = if (end + 1 < n && (source[end + 1].isLetter() || source[end + 1] == '_'))
                        scanIdentifier(source, end + 1) else end + 1
                    val member = source.substring(end + 1, memberEnd)
                    // gg 本身
                    out += LuaToken(i, end, LuaTokenKind.BUILTIN, "gg")
                    // 点
                    out += LuaToken(end, end + 1, LuaTokenKind.PUNCTUATION, ".")
                    // 成员
                    val kind = when {
                        member in ggFunctions -> LuaTokenKind.GG_FUNCTION
                        member in ggConstants -> LuaTokenKind.GG_CONSTANT
                        else -> LuaTokenKind.IDENTIFIER
                    }
                    out += LuaToken(end + 1, memberEnd, kind, member)
                    i = memberEnd
                    continue
                }

                val kind = when {
                    word in KEYWORDS -> LuaTokenKind.KEYWORD
                    word in BUILTINS -> LuaTokenKind.BUILTIN
                    // 库名 + 点是函数调用，这里先标库名
                    word in LIBRARIES -> LuaTokenKind.BUILTIN
                    isCalledAfter(source, end) -> LuaTokenKind.FUNCTION_NAME
                    else -> LuaTokenKind.IDENTIFIER
                }
                out += LuaToken(i, end, kind, word)
                i = end
                continue
            }

            // ---- 运算符
            val op = matchOperator(source, i)
            if (op != null) {
                out += LuaToken(i, i + op.length, LuaTokenKind.OPERATOR, op)
                i += op.length
                continue
            }

            // ---- 标点
            if (c in "(){}[];:,.") {
                out += LuaToken(i, i + 1, LuaTokenKind.PUNCTUATION, c.toString())
                i++
                continue
            }

            // ---- 空白与其它
            val end = i + 1
            out += LuaToken(i, end, LuaTokenKind.PLAIN, source.substring(i, end))
            i = end
        }
        return out
    }

    // ------------------------------------------------------------ 扫描辅助

    private fun scanComment(s: String, start: Int): Int {
        var i = start + 2
        val level = longBracketLevel(s, i)
        if (level >= 0) return scanLongBracket(s, i, level)
        while (i < s.length && s[i] != '\n') i++
        return i
    }

    /** 判断从 [at] 起是否是 `[==[` 形式，返回等号个数；不是则 -1。 */
    private fun longBracketLevel(s: String, at: Int): Int {
        if (at >= s.length || s[at] != '[') return -1
        var i = at + 1
        var level = 0
        while (i < s.length && s[i] == '=') { level++; i++ }
        return if (i < s.length && s[i] == '[') level else -1
    }

    private fun scanLongBracket(s: String, start: Int, level: Int): Int {
        var i = start + 1 + level
        if (i >= s.length || s[i] != '[') return start + 1
        i++
        val closer = "]" + "=".repeat(level) + "]"
        val idx = s.indexOf(closer, i)
        return if (idx < 0) s.length else idx + closer.length
    }

    private fun scanQuoted(s: String, start: Int, quote: Char): Int {
        var i = start + 1
        while (i < s.length) {
            when (s[i]) {
                '\\' -> i += 2
                quote -> return i + 1
                '\n' -> return i   // 未闭合，止于行尾，避免整篇被当成字符串
                else -> i++
            }
        }
        return s.length
    }

    private fun scanNumber(s: String, start: Int): Int {
        var i = start
        // 十六进制
        if (s[i] == '0' && i + 1 < s.length && (s[i + 1] == 'x' || s[i + 1] == 'X')) {
            i += 2
            while (i < s.length && (s[i].isLetterOrDigit() || s[i] == '.')) i++
            return i
        }
        var seenDot = false
        var seenExp = false
        while (i < s.length) {
            val c = s[i]
            when {
                c.isDigit() -> i++
                c == '.' && !seenDot && !seenExp -> { seenDot = true; i++ }
                (c == 'e' || c == 'E') && !seenExp -> {
                    seenExp = true; i++
                    if (i < s.length && (s[i] == '+' || s[i] == '-')) i++
                }
                c == '_' -> i++
                else -> return i
            }
        }
        return i
    }

    private fun scanIdentifier(s: String, start: Int): Int {
        var i = start
        while (i < s.length && (s[i].isLetterOrDigit() || s[i] == '_')) i++
        return i
    }

    /** 标识符后面紧跟 `(` 或 `{` 或 `"` 视为函数调用。 */
    private fun isCalledAfter(s: String, end: Int): Boolean {
        var i = end
        while (i < s.length && s[i].isWhitespace()) i++
        return i < s.length && (s[i] == '(' || s[i] == '{' || s[i] == '"' || s[i] == '\'')
    }

    private fun matchOperator(s: String, i: Int): String? {
        if (i + 3 <= s.length && s.startsWith("...", i)) return "..."
        if (i + 2 <= s.length) {
            val two = s.substring(i, i + 2)
            if (two in OPERATORS) return two
        }
        val one = s[i].toString()
        return if (one in OPERATORS) one else null
    }
}
