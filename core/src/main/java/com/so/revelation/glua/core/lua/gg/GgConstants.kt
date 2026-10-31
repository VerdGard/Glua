package com.so.revelation.glua.core.lua.gg

/**
 * gg.* 常量表。
 *
 * 数值来自原 GameGuardian 运行时的常量注册表（反编译自 `p180w6/C2083d0` 的
 * `mo4692g0` 方法，其中逐个调用了 `m5141M2(name, value)`）。
 * 这些值与官方文档一致，脚本里 `gg.TYPE_DWORD` 之类必须精确匹配。
 */
object GgConstants {

    /** 全部数值常量。 */
    val NUMERIC: Map<String, Int> = mapOf(
        "TYPE_AUTO" to 127,
        "TYPE_BYTE" to 1,
        "TYPE_WORD" to 2,
        "TYPE_DWORD" to 4,
        "TYPE_XOR" to 8,
        "TYPE_FLOAT" to 16,
        "TYPE_QWORD" to 32,
        "TYPE_DOUBLE" to 64,
        "SIGN_EQUAL" to 536870912,
        "SIGN_NOT_EQUAL" to 268435456,
        "SIGN_LESS_OR_EQUAL" to 134217728,
        "SIGN_GREATER_OR_EQUAL" to 67108864,
        "SIGN_FUZZY_EQUAL" to 536870912,
        "SIGN_FUZZY_NOT_EQUAL" to 268435456,
        "SIGN_FUZZY_LESS" to 134217728,
        "SIGN_FUZZY_GREATER" to 67108864,
        "REGION_JAVA_HEAP" to 2,
        "REGION_C_HEAP" to 1,
        "REGION_C_ALLOC" to 4,
        "REGION_C_DATA" to 8,
        "REGION_C_BSS" to 16,
        "REGION_PPSSPP" to 262144,
        "REGION_ANONYMOUS" to 32,
        "REGION_JAVA" to 65536,
        "REGION_STACK" to 64,
        "REGION_ASHMEM" to 524288,
        "REGION_VIDEO" to 1048576,
        "REGION_OTHER" to -2080896,
        "REGION_BAD" to 131072,
        "REGION_CODE_APP" to 16384,
        "REGION_CODE_SYS" to 32768,
        "LOAD_VALUES_FREEZE" to 3,
        "LOAD_VALUES" to 2,
        "LOAD_APPEND" to 8,
        "SAVE_AS_TEXT" to 1,
        "FREEZE_NORMAL" to 0,
        "FREEZE_MAY_INCREASE" to 1,
        "FREEZE_MAY_DECREASE" to 2,
        "FREEZE_IN_RANGE" to 3,
        "PROT_NONE" to 0,
        "PROT_READ" to 2,
        "PROT_WRITE" to 1,
        "PROT_EXEC" to 4,
        "POINTER_NO" to 4,
        "POINTER_READ_ONLY" to 8,
        "POINTER_WRITABLE" to 16,
        "POINTER_EXECUTABLE" to 2,
        "POINTER_EXECUTABLE_WRITABLE" to 1,
        "DUMP_SKIP_SYSTEM_LIBS" to 1,
        "TAB_SETTINGS" to 0,
        "TAB_SEARCH" to 1,
        "TAB_SAVED_LIST" to 2,
        "TAB_MEMORY_EDITOR" to 3,
        "ASM_ARM" to 4,
        "ASM_THUMB" to 5,
        "ASM_ARM64" to 6,
    )

    /** 字符串常量，运行时由宿主填充实际值。 */
    val STRINGS: Map<String, String> = mapOf(
        "VERSION" to "96.0",
        "PACKAGE" to "",
        "ANDROID_SDK_INT" to "",
    )

    /** 合并视图，注入 Lua 全局表时使用。 */
    val ALL: Map<String, Any> by lazy {
        buildMap {
            putAll(NUMERIC)
            putAll(STRINGS)
        }
    }
}
