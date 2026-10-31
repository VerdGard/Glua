#ifndef GLUA_LOG_H
#define GLUA_LOG_H

#include <stdarg.h>

#ifdef __cplusplus
extern "C" {
#endif

typedef enum {
    GLUA_LOG_VERBOSE = 2,
    GLUA_LOG_DEBUG   = 3,
    GLUA_LOG_INFO    = 4,
    GLUA_LOG_WARN    = 5,
    GLUA_LOG_ERROR   = 6,
    GLUA_LOG_ASSERT  = 7,
} glua_log_level;

/** 日志回调：把原生侧日志送回 Kotlin。 */
typedef void (*glua_log_sink)(int level, const char *tag, const char *message);

/**
 * 安装日志回调。传入 NULL 可卸载。
 * 回调会在任意线程被调用，Kotlin 侧需自行保证线程安全。
 */
void glua_log_set_sink(glua_log_sink sink);

/** 写一条日志。同时输出到 Android logcat 与 sink。 */
void glua_log_write(glua_log_level level, const char *tag, const char *fmt, ...);
void glua_log_vwrite(glua_log_level level, const char *tag, const char *fmt, va_list ap);

#ifdef __cplusplus
}
#endif

#endif
