package com.so.revelation.glua.core.mcp

import com.so.revelation.glua.core.log.GLog

/**
 * 极简 JSON 值模型。
 *
 * 不用 gson/kotlinx-serialization 的原因：MCP 的 JSON 结构很浅，
 * 而 :core 要保持零第三方依赖（LuaJ 是唯一例外）。
 * 解析器只需支持 MCP 用到的子集：对象、数组、字符串、数字、布尔、null。
 */
sealed interface JsonValue {
    data class Obj(val fields: Map<String, JsonValue>) : JsonValue
    data class Arr(val items: List<JsonValue>) : JsonValue
    data class Str(val value: String) : JsonValue
    data class Num(val value: Double) : JsonValue
    data class Bool(val value: Boolean) : JsonValue
    data object Null : JsonValue

    companion object {
        fun of(value: Any?): JsonValue = when (value) {
            null -> Null
            is JsonValue -> value
            is Boolean -> Bool(value)
            is Int -> Num(value.toDouble())
            is Long -> Num(value.toDouble())
            is Double -> Num(value)
            is Float -> Num(value.toDouble())
            is String -> Str(value)
            is List<*> -> Arr(value.map { of(it) })
            is Map<*, *> -> Obj(value.entries.associate { it.key.toString() to of(it.value) })
            else -> Str(value.toString())
        }

        fun obj(vararg pairs: Pair<String, Any?>): Obj =
            Obj(pairs.associate { it.first to of(it.second) })

        fun arr(items: List<Any?>): Arr = Arr(items.map { of(it) })
    }
}

/**
 * JSON 序列化与解析。
 *
 * 序列化会转义所有必须转义的字符，包括控制字符与 Unicode 分隔符。
 * 解析器是递归下降，对畸形输入抛 [JsonParseException]。
 */
object Json {

    class JsonParseException(message: String) : Exception(message)

    // ---------------------------------------------------------- 序列化

    fun stringify(v: JsonValue): String = buildString { write(v, this) }

    private fun write(v: JsonValue, sb: StringBuilder) {
        when (v) {
            is JsonValue.Obj -> {
                sb.append('{')
                var first = true
                for ((k, value) in v.fields) {
                    if (!first) sb.append(',')
                    first = false
                    writeString(k, sb)
                    sb.append(':')
                    write(value, sb)
                }
                sb.append('}')
            }
            is JsonValue.Arr -> {
                sb.append('[')
                v.items.forEachIndexed { i, item ->
                    if (i > 0) sb.append(',')
                    write(item, sb)
                }
                sb.append(']')
            }
            is JsonValue.Str -> writeString(v.value, sb)
            is JsonValue.Num -> sb.append(formatNumber(v.value))
            is JsonValue.Bool -> sb.append(if (v.value) "true" else "false")
            JsonValue.Null -> sb.append("null")
        }
    }

    private fun writeString(s: String, sb: StringBuilder) {
        sb.append('"')
        for (c in s) {
            when (c) {
                '"' -> sb.append("\\\"")
                '\\' -> sb.append("\\\\")
                '\n' -> sb.append("\\n")
                '\r' -> sb.append("\\r")
                '\t' -> sb.append("\\t")
                '\b' -> sb.append("\\b")
                '\u000C' -> sb.append("\\f")
                else -> if (c < ' ' || c == '\u2028' || c == '\u2029') {
                    sb.append("\\u").append("%04x".format(c.code))
                } else {
                    sb.append(c)
                }
            }
        }
        sb.append('"')
    }

    /** 整数不输出小数点，避免 Lua 数字往返时变成 4.0。 */
    private fun formatNumber(d: Double): String {
        if (d.isNaN() || d.isInfinite()) return "null"
        return if (d == d.toLong().toDouble()) d.toLong().toString() else d.toString()
    }

    // ---------------------------------------------------------- 解析

    fun parse(text: String): JsonValue {
        val p = Parser(text)
        p.skipWhitespace()
        val v = p.parseValue()
        p.skipWhitespace()
        if (!p.atEnd()) throw JsonParseException("尾部有多余字符，位置 ${p.pos}")
        return v
    }

    private class Parser(val src: String) {
        var pos = 0

        fun atEnd() = pos >= src.length

        fun skipWhitespace() {
            while (pos < src.length && src[pos].isWhitespace()) pos++
        }

        fun parseValue(): JsonValue {
            if (atEnd()) throw JsonParseException("输入意外结束")
            return when (val c = src[pos]) {
                '{' -> parseObject()
                '[' -> parseArray()
                '"' -> JsonValue.Str(parseString())
                't' -> { expect("true"); JsonValue.Bool(true) }
                'f' -> { expect("false"); JsonValue.Bool(false) }
                'n' -> { expect("null"); JsonValue.Null }
                else -> {
                    if (c == '-' || c in '0'..'9') parseNumber()
                    else throw JsonParseException("位置 $pos 出现意外字符 '$c'")
                }
            }
        }

        fun parseObject(): JsonValue.Obj {
            pos++ // {
            val fields = LinkedHashMap<String, JsonValue>()
            skipWhitespace()
            if (!atEnd() && src[pos] == '}') { pos++; return JsonValue.Obj(fields) }
            while (true) {
                skipWhitespace()
                val key = parseString()
                skipWhitespace()
                if (atEnd() || src[pos] != ':') throw JsonParseException("位置 $pos 期望 ':'")
                pos++
                skipWhitespace()
                fields[key] = parseValue()
                skipWhitespace()
                if (atEnd()) throw JsonParseException("对象未闭合")
                when (src[pos]) {
                    ',' -> pos++
                    '}' -> { pos++; return JsonValue.Obj(fields) }
                    else -> throw JsonParseException("位置 $pos 期望 ',' 或 '}'")
                }
            }
        }

        fun parseArray(): JsonValue.Arr {
            pos++ // [
            val items = ArrayList<JsonValue>()
            skipWhitespace()
            if (!atEnd() && src[pos] == ']') { pos++; return JsonValue.Arr(items) }
            while (true) {
                skipWhitespace()
                items.add(parseValue())
                skipWhitespace()
                if (atEnd()) throw JsonParseException("数组未闭合")
                when (src[pos]) {
                    ',' -> pos++
                    ']' -> { pos++; return JsonValue.Arr(items) }
                    else -> throw JsonParseException("位置 $pos 期望 ',' 或 ']'")
                }
            }
        }

        fun parseString(): String {
            if (atEnd() || src[pos] != '"') throw JsonParseException("位置 $pos 期望字符串")
            pos++
            val sb = StringBuilder()
            while (true) {
                if (atEnd()) throw JsonParseException("字符串未闭合")
                when (val c = src[pos]) {
                    '"' -> { pos++; return sb.toString() }
                    '\\' -> {
                        pos++
                        if (atEnd()) throw JsonParseException("转义未完成")
                        when (val e = src[pos]) {
                            '"' -> sb.append('"')
                            '\\' -> sb.append('\\')
                            '/' -> sb.append('/')
                            'b' -> sb.append('\b')
                            'f' -> sb.append('\u000C')
                            'n' -> sb.append('\n')
                            'r' -> sb.append('\r')
                            't' -> sb.append('\t')
                            'u' -> {
                                if (pos + 4 >= src.length) throw JsonParseException("\\u 转义不完整")
                                val hex = src.substring(pos + 1, pos + 5)
                                sb.append(hex.toInt(16).toChar())
                                pos += 4
                            }
                            else -> throw JsonParseException("未知转义 \\$e")
                        }
                        pos++
                    }
                    else -> { sb.append(c); pos++ }
                }
            }
        }

        fun parseNumber(): JsonValue.Num {
            val start = pos
            if (!atEnd() && src[pos] == '-') pos++
            while (!atEnd() && (src[pos].isDigit() || src[pos] in ".eE+-")) pos++
            val text = src.substring(start, pos)
            val d = text.toDoubleOrNull() ?: throw JsonParseException("非法数字 '$text'")
            return JsonValue.Num(d)
        }

        fun expect(word: String) {
            if (pos + word.length > src.length || src.substring(pos, pos + word.length) != word) {
                throw JsonParseException("位置 $pos 期望 '$word'")
            }
            pos += word.length
        }
    }
}

/** JSON-RPC 2.0 错误码。 */
object RpcError {
    const val PARSE_ERROR = -32700
    const val INVALID_REQUEST = -32600
    const val METHOD_NOT_FOUND = -32601
    const val INVALID_PARAMS = -32602
    const val INTERNAL_ERROR = -32603
}

/** 构造 JSON-RPC 2.0 响应。 */
object JsonRpc {

    private const val TAG = "JsonRpc"

    fun success(id: JsonValue, result: JsonValue): JsonValue = JsonValue.obj(
        "jsonrpc" to "2.0",
        "id" to id,
        "result" to result,
    )

    fun error(id: JsonValue, code: Int, message: String, data: JsonValue? = null): JsonValue {
        val err = LinkedHashMap<String, JsonValue>()
        err["code"] = JsonValue.Num(code.toDouble())
        err["message"] = JsonValue.Str(message)
        if (data != null) err["data"] = data
        return JsonValue.obj(
            "jsonrpc" to "2.0",
            "id" to id,
            "error" to JsonValue.Obj(err),
        )
    }

    fun notification(method: String, params: JsonValue = JsonValue.Obj(emptyMap())): JsonValue =
        JsonValue.obj("jsonrpc" to "2.0", "method" to method, "params" to params)

    /** 安全解析，失败返回 null 并记日志。 */
    fun tryParse(text: String): JsonValue? = try {
        Json.parse(text)
    } catch (e: Json.JsonParseException) {
        GLog.w(TAG, "JSON 解析失败: ${e.message}")
        null
    }
}
