package com.so.revelation.glua.core.lua.vm

import com.so.revelation.glua.core.log.GLog
import com.so.revelation.glua.core.log.LogBus
import com.so.revelation.glua.core.log.LogLevel
import com.so.revelation.glua.core.log.LogSource
import com.so.revelation.glua.core.lua.gg.GgRuntime
import org.luaj.vm2.Globals
import org.luaj.vm2.LuaTable
import org.luaj.vm2.LuaValue
import org.luaj.vm2.Varargs
import org.luaj.vm2.lib.OneArgFunction
import org.luaj.vm2.lib.VarArgFunction
import org.luaj.vm2.lib.ZeroArgFunction
import org.luaj.vm2.lib.jse.JsePlatform
import java.io.File

/**
 * 真实的 Lua 运行时，基于 LuaJ 3.0.1 的 Lua 5.3 实现。
 *
 * 职责：
 * 1. 创建 [Globals]
 * 2. 注入 `gg.*` 命名空间（全部 68 个函数 + 66 个常量）
 * 3. 重定向 `print` 到 [LogBus]，让脚本输出出现在应用内日志面板
 * 4. 提供 `dofile` / `loadfile` 的相对路径解析
 *
 * 每次执行创建一个新实例，避免脚本间的全局变量污染。
 */
class LuaRuntime(
    private val gg: GgRuntime,
    /** 脚本所在目录，用于解析 `dofile("x.lua")` 之类的相对路径。 */
    private val scriptDir: File?,
    /** 脚本输出回调。 */
    private val onOutput: (String) -> Unit,
) {

    private companion object {
        const val TAG = "LuaRuntime"
    }

    val globals: Globals = JsePlatform.standardGlobals()

    init {
        bindPrint()
        bindGg()
        bindFileHelpers()
        GLog.d(TAG, "LuaJ 运行时已创建，Lua 版本 ${globals.get("_VERSION").tojstring()}")
    }

    // ---------------------------------------------------------- print

    /**
     * 覆盖 print：同时写日志面板与脚本输出面板。
     * 保留 tab 分隔语义，与标准 print 一致。
     */
    private fun bindPrint() {
        globals.set("print", object : VarArgFunction() {
            override fun invoke(args: Varargs): Varargs {
                val sb = StringBuilder()
                for (i in 1..args.narg()) {
                    if (i > 1) sb.append('\t')
                    sb.append(args.arg(i).tojstring())
                }
                val line = sb.toString()
                onOutput(line)
                LogBus.log(LogLevel.INFO, "print", line, LogSource.LUA)
                return LuaValue.NONE
            }
        })
    }

    // ---------------------------------------------------------- gg.*

    private fun bindGg() {
        val ggTable = LuaTable()

        // 常量
        gg.constants().forEach { (name, value) ->
            ggTable.set(name, LuaValueConverter.toLua(value))
        }

        // 动态常量
        ggTable.set("VERSION", LuaValue.valueOf("96.0"))
        ggTable.set("VERSION_INT", LuaValue.valueOf(96))
        ggTable.set("BUILD", LuaValue.valueOf(15993))
        ggTable.set("PACKAGE", LuaValue.valueOf("com.so.revelation.glua"))
        ggTable.set("ANDROID_SDK_INT", LuaValue.valueOf(android.os.Build.VERSION.SDK_INT))

        // 函数
        for (name in gg.allFunctionNames()) {
            ggTable.set(name, object : VarArgFunction() {
                override fun invoke(args: Varargs): Varargs {
                    val list = (1..args.narg()).map { LuaValueConverter.toKotlin(args.arg(it)) }
                    val result = gg.call(name, list)
                    return asVarargs(result)
                }
            })
        }

        globals.set("gg", ggTable)
        GLog.i(TAG, "已注入 gg.* ：${gg.allFunctionNames().size} 个函数")
    }

    /**
     * 把 Kotlin 返回值转成 Lua 的多返回值。
     *
     * gg 的约定：成功返回 true 或数据，失败返回错误字符串。
     * 有些函数（如 gg.prompt）可能返回 table，统一用单值返回。
     */
    private fun asVarargs(v: Any?): Varargs = LuaValueConverter.toLua(v)

    // ---------------------------------------------------------- 文件

    /**
     * 让 dofile/loadfile 支持相对脚本目录的路径。
     * 同时把加载失败的错误转成 Lua 错误而非 Java 异常。
     */
    private fun bindFileHelpers() {
        globals.set("dofile", object : OneArgFunction() {
            override fun call(path: LuaValue): LuaValue {
                val resolved = resolve(path.tojstring())
                return try {
                    globals.loadfile(resolved).call()
                } catch (t: Throwable) {
                    throw org.luaj.vm2.LuaError("dofile 失败: $resolved - ${t.message}", t)
                }
            }
        })

        globals.set("loadfile", object : OneArgFunction() {
            override fun call(path: LuaValue): LuaValue {
                val resolved = resolve(path.tojstring())
                return try {
                    globals.loadfile(resolved)
                } catch (t: Throwable) {
                    LuaValue.NIL
                }
            }
        })

        // os.exit 直接抛异常中断脚本，避免 Java 进程真的退出
        globals.get("os").let { os ->
            if (os.istable()) {
                os.set("exit", object : OneArgFunction() {
                    override fun call(code: LuaValue): LuaValue {
                        throw ScriptExit(code.optint(0))
                    }
                })
            }
        }

        // os.time 用于脚本计时，标准库已有，这里补一个毫秒版本
        globals.set("glua_now_ms", object : ZeroArgFunction() {
            override fun call(): LuaValue = LuaValue.valueOf(System.currentTimeMillis().toDouble())
        })
    }

    private fun resolve(path: String): String {
        val f = File(path)
        if (f.isAbsolute) return path
        val dir = scriptDir ?: return path
        return File(dir, path).absolutePath
    }

    /** 脚本主动调用 os.exit 时使用的控制流异常。 */
    class ScriptExit(val code: Int) : RuntimeException("script exited with $code")
}
