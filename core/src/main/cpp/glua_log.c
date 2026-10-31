#include "glua_log.h"
#include <android/log.h>
#include <pthread.h>
#include <stdio.h>
#include <string.h>

#define GLUA_MAX_LINE 2048

static glua_log_sink g_sink = NULL;
static pthread_mutex_t g_sink_lock = PTHREAD_MUTEX_INITIALIZER;

void glua_log_set_sink(glua_log_sink sink) {
    pthread_mutex_lock(&g_sink_lock);
    g_sink = sink;
    pthread_mutex_unlock(&g_sink_lock);
}

void glua_log_vwrite(glua_log_level level, const char *tag, const char *fmt, va_list ap) {
    if (fmt == NULL) return;

    int prio;
    switch (level) {
        case GLUA_LOG_VERBOSE: prio = ANDROID_LOG_VERBOSE; break;
        case GLUA_LOG_DEBUG:   prio = ANDROID_LOG_DEBUG;   break;
        case GLUA_LOG_INFO:    prio = ANDROID_LOG_INFO;    break;
        case GLUA_LOG_WARN:    prio = ANDROID_LOG_WARN;    break;
        case GLUA_LOG_ERROR:   prio = ANDROID_LOG_ERROR;   break;
        case GLUA_LOG_ASSERT:  prio = ANDROID_LOG_FATAL;   break;
        default:               prio = ANDROID_LOG_DEFAULT; break;
    }

    char line[GLUA_MAX_LINE];
    va_list copy;
    va_copy(copy, ap);
    int n = vsnprintf(line, sizeof(line), fmt, copy);
    va_end(copy);
    if (n < 0) return;
    if ((size_t) n >= sizeof(line)) line[sizeof(line) - 1] = '\0';

    __android_log_write(prio, tag ? tag : "glua-native", line);

    pthread_mutex_lock(&g_sink_lock);
    glua_log_sink sink = g_sink;
    if (sink != NULL) {
        // 在锁内调用，防止 sink 被并发卸载
        sink((int) level, tag ? tag : "glua-native", line);
    }
    pthread_mutex_unlock(&g_sink_lock);
}

void glua_log_write(glua_log_level level, const char *tag, const char *fmt, ...) {
    va_list ap;
    va_start(ap, fmt);
    glua_log_vwrite(level, tag, fmt, ap);
    va_end(ap);
}
