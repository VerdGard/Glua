package com.so.revelation.glua.core.mcp

/**
 * 一个 MCP 工具的定义。
 *
 * @param name        工具名，MCP 客户端用它调用
 * @param description 给 LLM 看的说明，决定它是否会正确使用这个工具
 * @param inputSchema JSON Schema 描述参数
 * @param handler     执行体，返回结果文本或结构化数据
 */
class McpTool(
    val name: String,
    val description: String,
    val inputSchema: JsonValue,
    val handler: (JsonValue.Obj) -> McpToolResult,
)

/**
 * 工具执行结果。
 *
 * MCP 的 content 是「内容块数组」，这里只实现 text 类型，
 * 但预留了 [isError] 以便客户端区分成功与失败。
 */
data class McpToolResult(
    val text: String,
    val isError: Boolean = false,
) {
    fun toJson(): JsonValue = JsonValue.obj(
        "content" to JsonValue.arr(
            listOf(JsonValue.obj("type" to "text", "text" to text))
        ),
        "isError" to isError,
    )

    companion object {
        fun ok(text: String) = McpToolResult(text, false)
        fun error(text: String) = McpToolResult(text, true)
    }
}

/** JSON Schema 构造辅助，避免手写大量嵌套 object。 */
object Schema {

    fun obj(
        properties: Map<String, JsonValue>,
        required: List<String> = emptyList(),
        description: String? = null,
    ): JsonValue {
        val fields = LinkedHashMap<String, JsonValue>()
        if (description != null) fields["description"] = JsonValue.Str(description)
        fields["type"] = JsonValue.Str("object")
        fields["properties"] = JsonValue.Obj(properties)
        if (required.isNotEmpty()) {
            fields["required"] = JsonValue.Arr(required.map { JsonValue.Str(it) })
        }
        fields["additionalProperties"] = JsonValue.Bool(false)
        return JsonValue.Obj(fields)
    }

    fun string(description: String, enum: List<String>? = null, default: String? = null): JsonValue {
        val f = LinkedHashMap<String, JsonValue>()
        f["type"] = JsonValue.Str("string")
        f["description"] = JsonValue.Str(description)
        if (enum != null) f["enum"] = JsonValue.Arr(enum.map { JsonValue.Str(it) })
        if (default != null) f["default"] = JsonValue.Str(default)
        return JsonValue.Obj(f)
    }

    fun integer(description: String, default: Int? = null, minimum: Int? = null): JsonValue {
        val f = LinkedHashMap<String, JsonValue>()
        f["type"] = JsonValue.Str("integer")
        f["description"] = JsonValue.Str(description)
        if (default != null) f["default"] = JsonValue.Num(default.toDouble())
        if (minimum != null) f["minimum"] = JsonValue.Num(minimum.toDouble())
        return JsonValue.Obj(f)
    }

    fun bool(description: String, default: Boolean? = null): JsonValue {
        val f = LinkedHashMap<String, JsonValue>()
        f["type"] = JsonValue.Str("boolean")
        f["description"] = JsonValue.Str(description)
        if (default != null) f["default"] = JsonValue.Bool(default)
        return JsonValue.Obj(f)
    }

    /** 字符串数组。 */
    fun stringArray(description: String): JsonValue = JsonValue.Obj(
        mapOf(
            "type" to JsonValue.Str("array"),
            "description" to JsonValue.Str(description),
            "items" to JsonValue.Obj(mapOf("type" to JsonValue.Str("string"))),
        )
    )
}

/** 从工具参数对象里安全取值。 */
object Args {

    fun str(params: JsonValue.Obj, key: String, default: String? = null): String? {
        val v = params.fields[key]
        return when {
            v is JsonValue.Str -> v.value
            v is JsonValue.Num -> if (v.value == v.value.toLong().toDouble()) v.value.toLong().toString() else v.value.toString()
            v is JsonValue.Bool -> v.value.toString()
            else -> default
        }
    }

    fun strRequired(params: JsonValue.Obj, key: String): String =
        str(params, key) ?: throw IllegalArgumentException("缺少必填参数 '$key'")

    fun int(params: JsonValue.Obj, key: String, default: Int): Int {
        val v = params.fields[key] as? JsonValue.Num ?: return default
        return v.value.toInt()
    }

    fun bool(params: JsonValue.Obj, key: String, default: Boolean): Boolean {
        val v = params.fields[key] as? JsonValue.Bool ?: return default
        return v.value
    }

    fun strList(params: JsonValue.Obj, key: String): List<String> {
        val v = params.fields[key] as? JsonValue.Arr ?: return emptyList()
        return v.items.mapNotNull { (it as? JsonValue.Str)?.value }
    }
}
