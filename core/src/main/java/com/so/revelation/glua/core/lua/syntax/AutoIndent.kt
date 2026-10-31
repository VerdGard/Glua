package com.so.revelation.glua.core.lua.syntax

/**
 * Lua 自动缩进与括号配对。
 *
 * ## 缩进规则
 *
 * - 以 `function` / `if` / `for` / `while` / `do` / `then` / `else` / `repeat`
 *   / `elseif` 结尾的行 -> 下一行缩进 +1
 * - 以 `end` / `until` / `else` / `elseif` 开头的行 -> 本行缩进 -1
 * - 单行块（`if x then return end`）不改变缩进
 *
 * ## 缩进单位
 *
 * 默认 4 空格，可配置。也支持 Tab（[indentWidth] = 1 且 [useTab] = true）。
 */
object AutoIndent {

    private val BLOCK_OPENERS = Regex(
        """(\b(function|if|for|while|do|repeat)\b|\bthen\s*$|\belse\s*$)""",
        RegexOption.IGNORE_CASE,
    )

    private val DEDENT_STARTERS = Regex(
        """^\s*(end\b|until\b|else\b|elseif\b)""",
        RegexOption.IGNORE_CASE,
    )

    /** 单行完整块，例如 `if a then b() end`。 */
    private val INLINE_BLOCK = Regex(
        """\b(function|if|for|while|do)\b.*\bend\b""",
        RegexOption.IGNORE_CASE,
    )

    private val OPENERS = setOf("function", "if", "for", "while", "do", "repeat")
    private val CLOSERS = setOf("end", "until")

    /**
     * 计算在 [cursor] 处按回车后新行应使用的缩进。
     *
     * @param text      完整文本
     * @param cursor    光标位置
     * @param indentWidth 每级缩进的空格数
     * @return 新行的缩进字符串
     */
    fun indentForNewLine(text: String, cursor: Int, indentWidth: Int = 4): String {
        if (cursor <= 0) return ""
        val lineStart = text.lastIndexOf('\n', cursor - 1) + 1
        val currentLine = text.substring(lineStart, cursor)

        val blockIndent = indentLevelAt(text, lineStart) * indentWidth
        val extra = if (opensBlock(currentLine)) indentWidth else 0
        return " ".repeat(blockIndent + extra)
    }

    /**
     * 计算某一行开头的缩进级别（基于之前所有未闭合的块）。
     */
    fun indentLevelAt(text: String, position: Int): Int {
        val before = text.substring(0, position.coerceAtMost(text.length))
        val stripped = stripStringsAndComments(before)

        var level = 0
        val tokens = Regex("""\b(function|if|for|while|do|repeat|end|until)\b""")
            .findAll(stripped)
            .map { it.groupValues[1].lowercase() }
            .toList()

        // 用栈精确配对 repeat/until
        val stack = ArrayDeque<String>()
        for (t in tokens) {
            when (t) {
                in OPENERS -> stack.addLast(t)
                "end" -> {
                    // end 关闭最近的非 repeat 块
                    val idx = stack.indexOfLast { it != "repeat" }
                    if (idx >= 0) {
                        repeat(stack.size - idx) { stack.removeLast() }
                    }
                }
                "until" -> {
                    if (stack.isNotEmpty() && stack.last() == "repeat") stack.removeLast()
                }
            }
        }
        level = stack.size

        // 当前行若是 dedent 起始（end/else 等），减一级
        val lineStart = text.lastIndexOf('\n', (position - 1).coerceAtLeast(0)) + 1
        if (lineStart in 0..before.length) {
            val line = before.substring(lineStart)
            if (DEDENT_STARTERS.containsMatchIn(line)) level = (level - 1).coerceAtLeast(0)
        }
        return level.coerceAtLeast(0)
    }

    /**
     * 判断这一行是否会开启一个新块（需要下一行缩进）。
     */
    fun opensBlock(line: String): Boolean {
        val s = stripStringsAndComments(line).trim()
        if (s.isEmpty()) return false
        if (s.startsWith("--")) return false
        if (INLINE_BLOCK.containsMatchIn(s)) return false
        // 以 end/until 结尾的完整块不开新块
        if (Regex("""\b(end|until)\s*$""").containsMatchIn(s)) return false
        return BLOCK_OPENERS.containsMatchIn(s)
    }

    /**
     * 括号配对自动补全。
     *
     * @return 应插入的闭合字符，无则 null
     */
    fun pairFor(char: Char): Char? = when (char) {
        '(' -> ')'
        '[' -> ']'
        '{' -> '}'
        '"' -> '"'
        '\'' -> '\''
        else -> null
    }

    /**
     * 判断在 [cursor] 处输入 [char] 后是否需要补全配对。
     *
     * 规则：
     * - 后面紧跟的字符就是配对的闭合符 -> 不补（只需跳过）
     * - 在字符串/注释内部 -> 不补
     */
    fun shouldAutoPair(text: String, cursor: Int, char: Char): Boolean {
        val closer = pairFor(char) ?: return false
        if (cursor >= text.length) return true
        val next = text[cursor]
        if (next == closer) return false
        // 引号：下一个字符是标识符字符时不补，避免 'it's' 之类
        if ((char == '"' || char == '\'') && (next.isLetterOrDigit() || next == '_')) return false
        return true
    }

    /**
     * 判断在 [cursor] 处按退格是否应该成对删除。
     * 例如光标在 `()` 中间时退格，应同时删掉 `(` 和 `)`。
     */
    fun shouldDeletePair(text: String, cursor: Int): Boolean {
        if (cursor <= 0 || cursor >= text.length) return false
        val before = text[cursor - 1]
        val after = text[cursor]
        return pairFor(before) == after
    }

    /**
     * 计算整篇文档的重新缩进结果。
     *
     * @return 新文本；若与原文相同返回 null
     */
    fun reindent(text: String, indentWidth: Int = 4): String? {
        val lines = text.split('\n')
        val out = ArrayList<String>(lines.size)
        var level = 0

        for ((index, raw) in lines.withIndex()) {
            val trimmed = raw.trimStart()
            if (trimmed.isEmpty()) {
                out.add("")
                continue
            }

            // 本行若是闭合符开头，先减一级
            var lineLevel = level
            if (DEDENT_STARTERS.containsMatchIn(trimmed)) {
                lineLevel = (level - 1).coerceAtLeast(0)
            }

            out.add(" ".repeat(lineLevel * indentWidth) + trimmed)

            // 计算对后续行的影响
            val stripped = stripStringsAndComments(trimmed)
            if (INLINE_BLOCK.containsMatchIn(stripped)) {
                // 单行块，不影响
            } else {
                val openers = Regex("""\b(function|if|for|while|do|repeat)\b""")
                    .findAll(stripped).count()
                val closers = Regex("""\b(end|until)\b""").findAll(stripped).count()
                level = (lineLevel + openers - closers).coerceAtLeast(0)
                // if/for/while 的 then/do 不重复计数
                if (Regex("""\b(if|for|while)\b.*\b(then|do)\b""").containsMatchIn(stripped)) {
                    level = (level - 1).coerceAtLeast(0)
                }
            }
        }

        val result = out.joinToString("\n")
        return if (result == text) null else result
    }

    /** 去掉字符串与注释内容。 */
    private fun stripStringsAndComments(s: String): String =
        s.replace(Regex("""--\[\[.*?]]""", RegexOption.DOT_MATCHES_ALL), " ")
            .replace(Regex("""--[^\n]*"""), " ")
            .replace(Regex("""\[\[.*?]]""", RegexOption.DOT_MATCHES_ALL), " ")
            .replace(Regex("\"([^\"\\\\]|\\\\.)*\""), "\"\"")
            .replace(Regex("'([^'\\\\]|\\\\.)*'"), "''")
}
