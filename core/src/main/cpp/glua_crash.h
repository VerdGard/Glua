#ifndef GLUA_CRASH_H
#define GLUA_CRASH_H

#ifdef __cplusplus
extern "C" {
#endif

/**
 * 安装原生崩溃信号处理器，捕获 SIGSEGV / SIGABRT / SIGILL / SIGFPE / SIGBUS。
 *
 * 崩溃信息通过 glua_log_set_sink 安装的通道上报，随后**恢复默认处理并重新抛出**，
 * 保证系统仍能生成 tombstone，不掩盖真实崩溃。
 *
 * 注意：信号处理器里只能调用 async-signal-safe 函数。
 * 这里仅用 write() 与预分配的缓冲区，不 malloc、不 printf。
 */
void glua_crash_install(void);

/** 卸载，恢复默认信号处理。 */
void glua_crash_uninstall(void);

#ifdef __cplusplus
}
#endif

#endif
