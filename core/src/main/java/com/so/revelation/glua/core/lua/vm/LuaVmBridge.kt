package com.so.revelation.glua.core.lua.vm

import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.lua.gg.GgRuntime

/**
 * Lua 虚拟机与 `gg.*` 表的桥接契约。
 *
 * 目前没有真实的 Lua VM（见 README 的待办），因此这里定义接口，
 * 待 VM 接入后实现：
 *
 * ```kotlin
 * class RealLuaVmBridge(private val globals: LuaTable) : LuaVmBridge {
 *     override fun bindFun(name: String) {
 *         globals.set("gg", LuaTable().also { t ->
 *             t.set("searchNumber", object : VarArgFunction() {
 *                 override fun invoke(args: Varargs): Varargs {
 *                     val list = (0 until args.narg()).map { args.arg(it + 1).toJava() }
 *                     return valueOf(runtime.call("searchNumber", list))
 *                 }
 *             })
 *         })
 *     }
 * }
 * ```
 *
 * 现在的 [NoopBridge] 只做一件事：检查 [GgRuntime] 是否注册了全部
 * 已知函数名，缺一个就在启动日志里报出来。这能防止"文档里有、实现里没有"
 * 的静默不一致。
 */
interface LuaVmBridge {

    /** 把 gg.xxx 绑定到 Lua 全局表。 */
    fun bindGgTable(namespaceName: String = "gg")

    /** 把 gg 常量注入到同一个表里。 */
    fun bindConstants(namespaceName: String = "gg")

    /** 绑定一个自定义全局函数。 */
    fun bindFunction(name: String, fn: (List<Any?>) -> Any?)

    companion object {
        /**
         * 自检：对比 [GgRuntime] 实现集合与 API 目录声明的函数集合。
         * @return 缺失的函数名（应为空）
         */
        fun audit(runtime: GgRuntime, documented: Set<String>): List<String> {
            val implemented = runtime.allFunctionNames()
            val missing = documented - implemented
            val extra = implemented - documented

            if (missing.isNotEmpty()) {
                GLog.e("LuaVmBridge", "未实现的 gg 函数 ${missing.size} 个: ${missing.sorted()}")
            }
            if (extra.isNotEmpty()) {
                GLog.w("LuaVmBridge", "目录中未声明的 gg 函数 ${extra.size} 个: ${extra.sorted()}")
            }
            if (missing.isEmpty() && extra.isEmpty()) {
                GLog.i("LuaVmBridge", "gg API 自检通过：${implemented.size} 个函数全部对齐")
            }
            return missing.sorted()
        }
    }
}
