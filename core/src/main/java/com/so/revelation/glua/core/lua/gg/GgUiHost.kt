package com.so.revelation.glua.core.lua.gg

/**
 * gg.* 里涉及界面交互的函数的宿主回调。
 *
 * 独立运行时由 Compose 层实现；不提供实现时使用 [Noop]，
 * 此时所有 UI 函数返回错误字符串而不是崩溃。
 */
interface GgUiHost {

    fun alert(text: String, positive: String, negative: String?, neutral: String?): Any
    fun choice(items: List<Any?>, selected: String?, message: String?): Any
    fun multiChoice(items: List<Any?>, selection: List<Any?>, message: String?): Any
    fun prompt(prompts: List<Any?>, defaults: List<Any?>, types: List<Any?>): Any
    fun toast(text: String, fast: Boolean)

    fun copyText(text: String)
    fun currentScriptPath(): String?
    fun currentLine(): Int
    fun isPanelVisible(): Boolean
    fun isPackageInstalled(pkg: String): Boolean

    /** 无宿主时的默认实现：一律返回错误字符串，保证脚本不中断。 */
    object Noop : GgUiHost {
        override fun alert(text: String, positive: String, negative: String?, neutral: String?) =
            "错误: alert 需要界面宿主"
        override fun choice(items: List<Any?>, selected: String?, message: String?) =
            "错误: choice 需要界面宿主"
        override fun multiChoice(items: List<Any?>, selection: List<Any?>, message: String?) =
            "错误: multiChoice 需要界面宿主"
        override fun prompt(prompts: List<Any?>, defaults: List<Any?>, types: List<Any?>) =
            "错误: prompt 需要界面宿主"
        override fun toast(text: String, fast: Boolean) = Unit
        override fun copyText(text: String) = Unit
        override fun currentScriptPath(): String? = null
        override fun currentLine(): Int = -1
        override fun isPanelVisible(): Boolean = false
        override fun isPackageInstalled(pkg: String): Boolean = false
    }
}
