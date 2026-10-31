package com.so.revelation.glua.core.lua.gg

/**
 * 一个 gg.* 函数对运行环境的要求。
 *
 * 设计目的：在**无 root** 的设备上，把做不到的函数标记为不可用，
 * 调用时返回错误字符串而不是崩溃，也绝不让解析/执行流程中断。
 */
enum class GgRequirement {
    /** 纯本地计算或文件操作，任何环境都能用。 */
    NONE,

    /** 需要读写目标进程内存（搜索、读取、修改、冻结、指针）。 */
    MEMORY_ACCESS,

    /** 需要附加并控制目标进程（暂停、恢复、结束、跳转）。 */
    PROCESS_CONTROL,

    /** 需要悬浮窗权限。 */
    OVERLAY,

    /** 需要与 GG 宿主交互（UI 按钮、tab、列表）。 */
    HOST_UI,
}

/**
 * 单个函数的运行时可用性判定结果。
 *
 * @param available 当前环境是否可用
 * @param reason    不可用的原因，可直接展示给用户
 */
data class GgAvailability(
    val available: Boolean,
    val reason: String = "",
) {
    companion object {
        val OK = GgAvailability(true)
        fun no(reason: String) = GgAvailability(false, reason)
    }
}

/**
 * 函数到环境要求的映射表。
 *
 * 这里的分类依据是函数语义，不是猜测：
 * - 搜索/读取/修改内存 -> [GgRequirement.MEMORY_ACCESS]
 * - 进程暂停/恢复/杀死 -> [GgRequirement.PROCESS_CONTROL]
 * - 悬浮按钮/可见性     -> [GgRequirement.OVERLAY]
 * - tab 与列表          -> [GgRequirement.HOST_UI]
 * - 对话框/提示/文件/编码 -> [GgRequirement.NONE]
 */
object GgRequirements {

    private val MEMORY = setOf(
        "searchNumber", "searchAddress", "searchFuzzy", "searchPointer",
        "refineNumber", "refineAddress",
        "startFuzzy", "getResults", "getResultsCount", "getValues", "getValuesRange",
        "setValues", "editAll", "clearResults", "removeResults", "loadResults",
        "getRanges", "getRangesList", "setRanges",
        "copyMemory", "dumpMemory", "allocatePage", "disasm",
        "gotoAddress", "getTargetInfo", "getTargetPackage",
        "getSpeed", "setSpeed", "unrandomizer", "timeJump",
        "getSelectedResults", "getSelectedElements",
    )

    private val PROCESS = setOf(
        "processPause", "processResume", "processToggle",
        "processKill", "isProcessPaused",
    )

    private val OVERLAY = setOf(
        "showUiButton", "hideUiButton", "isClickedUiButton",
        "setVisible", "isVisible",
    )

    private val HOST_UI = setOf(
        "getActiveTab", "addListItems", "removeListItems", "clearList",
        "getListItems", "getSelectedListItems",
        "saveList", "loadList",
    )

    fun of(functionName: String): GgRequirement = when (functionName) {
        in MEMORY -> GgRequirement.MEMORY_ACCESS
        in PROCESS -> GgRequirement.PROCESS_CONTROL
        in OVERLAY -> GgRequirement.OVERLAY
        in HOST_UI -> GgRequirement.HOST_UI
        else -> GgRequirement.NONE
    }
}
