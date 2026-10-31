#include "glua_crash.h"
#include "glua_log.h"

#include <signal.h>
#include <string.h>
#include <unistd.h>
#include <ucontext.h>
#include <stdint.h>

// 崩溃处理路径必须避免 malloc / printf，
// 因此所有缓冲都在静态区预分配。
#define CRASH_TEXT_MAX 512

static struct sigaction g_old_actions[8];
static int g_hooked_signals[] = { SIGSEGV, SIGABRT, SIGILL, SIGFPE, SIGBUS };
static volatile sig_atomic_t g_in_handler = 0;

static const char *signal_name(int sig) {
    switch (sig) {
        case SIGSEGV: return "SIGSEGV";
        case SIGABRT: return "SIGABRT";
        case SIGILL:  return "SIGILL";
        case SIGFPE:  return "SIGFPE";
        case SIGBUS:  return "SIGBUS";
        default:      return "UNKNOWN";
    }
}

/* async-signal-safe 的整数转十六进制 */
static void u64_to_hex(uint64_t v, char *out) {
    static const char *digits = "0123456789abcdef";
    out[0] = '0'; out[1] = 'x';
    for (int i = 0; i < 16; i++) {
        out[2 + i] = digits[(v >> ((15 - i) * 4)) & 0xF];
    }
    out[18] = '\0';
}

static void crash_handler(int sig, siginfo_t *info, void *ctx) {
    // 处理过程中再次崩溃则直接走默认逻辑，避免死循环
    if (g_in_handler) {
        signal(sig, SIG_DFL);
        raise(sig);
        return;
    }
    g_in_handler = 1;

    char addr[24];
    uint64_t fault = (uint64_t) (uintptr_t) (info ? info->si_addr : NULL);
    u64_to_hex(fault, addr);

    // 用 write 直接输出到 stderr，绕过日志系统可能的加锁问题
    const char *name = signal_name(sig);
    write(STDERR_FILENO, "FATAL SIGNAL ", 13);
    write(STDERR_FILENO, name, strlen(name));
    write(STDERR_FILENO, " addr=", 6);
    write(STDERR_FILENO, addr, strlen(addr));
    write(STDERR_FILENO, "\n", 1);

    // 通过日志通道上报（本级只用 __android_log_write，不加锁）
    glua_log_write(GLUA_LOG_ASSERT, "glua-native-crash",
                   "signal %s (%d) at %s", name, sig, addr);

    (void) ctx;

    // 恢复默认处理并重新触发，让系统照常生成 tombstone
    g_in_handler = 0;
    signal(sig, SIG_DFL);
    raise(sig);
}

void glua_crash_install(void) {
    struct sigaction sa;
    memset(&sa, 0, sizeof(sa));
    sa.sa_sigaction = crash_handler;
    sa.sa_flags = SA_SIGINFO | SA_ONSTACK;
    sigemptyset(&sa.sa_mask);

    for (size_t i = 0; i < sizeof(g_hooked_signals) / sizeof(g_hooked_signals[0]); i++) {
        sigaction(g_hooked_signals[i], &sa, &g_old_actions[i]);
    }
}

void glua_crash_uninstall(void) {
    for (size_t i = 0; i < sizeof(g_hooked_signals) / sizeof(g_hooked_signals[0]); i++) {
        sigaction(g_hooked_signals[i], &g_old_actions[i], NULL);
    }
}
