package com.so.revelation.glua.core.lua.vm

import org.luaj.vm2.LuaTable
import org.luaj.vm2.LuaValue

/**
 * Kotlin 数据类型与 LuaJ 值之间的双向转换。
 *
 * gg.* 的实现用 Kotlin 的 List/Map/String/Number，
 * Lua 侧看到的是 table/string/number，因此每次跨界都要转换。
 *
 * 转换规则：
 * - `null`         <-> `nil`
 * - `Boolean`      <-> `boolean`
 * - `Number`       <-> `number`（整数保持 number 类型，避免精度丢失）
 * - `String`       <-> `string`
 * - `List<*>`      <-> `table`（数组，key 从 1 起）
 * - `Map<*, *>`    <-> `table`（哈希部分）
 * - 其它           -> `tostring()` 后转 string
 */
object LuaValueConverter {

    /** Lua 值 -> Kotlin。 */
    fun toKotlin(v: LuaValue?): Any? {
        if (v == null || v.isnil()) return null
        return when {
            v.isboolean() -> v.toboolean()
            v.isint() -> v.toint()
            v.isnumber() -> v.todouble()
            v.isstring() -> v.tojstring()
            v.istable() -> tableToKotlin(v.checktable())
            v.isfunction() -> v   // 函数原样返回，由 KFunction 包装
            else -> v.tojstring()
        }
    }

    private fun tableToKotlin(t: LuaTable): Any {
        // 判断是数组还是字典：连续整数 key 且长度为 size 时视为数组
        val len = t.length()
        val map = LinkedHashMap<Any?, Any?>()
        var isArray = true

        var k: LuaValue = LuaValue.NIL
        var count = 0
        while (true) {
            val n = t.next(k)
            if (n.arg1().isnil()) break
            val key = n.arg1()
            val value = n.arg(2)
            map[toKotlin(key)] = toKotlin(value)
            count++
            k = key
        }
        // 数组判定：key 全为 1..len 的整数
        if (len > 0 && count == len) {
            for (i in 1..len) {
                if (!map.containsKey(i)) { isArray = false; break }
            }
        } else {
            isArray = false
        }

        return if (isArray) {
            (1..len).map { map[it] }
        } else {
            map
        }
    }

    /** Kotlin -> Lua 值。 */
    fun toLua(v: Any?): LuaValue = when (v) {
        null -> LuaValue.NIL
        is LuaValue -> v
        is Boolean -> LuaValue.valueOf(v)
        is Int -> LuaValue.valueOf(v)
        is Long -> LuaValue.valueOf(v.toDouble())
        is Short -> LuaValue.valueOf(v.toInt())
        is Byte -> LuaValue.valueOf(v.toInt())
        is Float -> LuaValue.valueOf(v.toDouble())
        is Double -> LuaValue.valueOf(v)
        is String -> LuaValue.valueOf(v)
        is CharSequence -> LuaValue.valueOf(v.toString())
        is List<*> -> {
            val t = LuaTable()
            v.forEachIndexed { index, item -> t.set(index + 1, toLua(item)) }
            t
        }
        is Array<*> -> {
            val t = LuaTable()
            v.forEachIndexed { index, item -> t.set(index + 1, toLua(item)) }
            t
        }
        is Map<*, *> -> {
            val t = LuaTable()
            v.forEach { (k, value) -> t.set(toLua(k), toLua(value)) }
            t
        }
        else -> LuaValue.valueOf(v.toString())
    }
}
