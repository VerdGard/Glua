#include <jni.h>
#include <pthread.h>
#include <stdlib.h>
#include <string.h>

#include "glua_log.h"
#include "glua_crash.h"

static JavaVM *g_vm = NULL;
static jobject g_sink_obj = NULL;
static jmethodID g_sink_method = NULL;
static pthread_mutex_t g_jni_lock = PTHREAD_MUTEX_INITIALIZER;

/**
 * 原生日志回调 -> JVM。
 * glua_log_vwrite 在持锁状态下调用本函数，这里不能再长期阻塞，
 * 因此只在真正需要时 attach 线程并立即 detach。
 */
static void jni_sink(int level, const char *tag, const char *message) {
    pthread_mutex_lock(&g_jni_lock);
    JavaVM *vm = g_vm;
    jobject sink = g_sink_obj;
    jmethodID mid = g_sink_method;
    pthread_mutex_unlock(&g_jni_lock);

    if (vm == NULL || sink == NULL || mid == NULL) return;

    JNIEnv *env = NULL;
    jint rc = (*vm)->GetEnv(vm, (void **) &env, JNI_VERSION_1_6);
    int attached = 0;
    if (rc == JNI_EDETACHED) {
        if ((*vm)->AttachCurrentThread(vm, &env, NULL) != JNI_OK) return;
        attached = 1;
    } else if (rc != JNI_OK) {
        return;
    }

    jstring jtag = (*env)->NewStringUTF(env, tag ? tag : "");
    jstring jmsg = (*env)->NewStringUTF(env, message ? message : "");
    if (jtag != NULL && jmsg != NULL) {
        (*env)->CallVoidMethod(env, sink, mid, (jint) level, jtag, jmsg);
        if ((*env)->ExceptionCheck(env)) {
            (*env)->ExceptionClear(env);
        }
    }
    if (jtag != NULL) (*env)->DeleteLocalRef(env, jtag);
    if (jmsg != NULL) (*env)->DeleteLocalRef(env, jmsg);

    if (attached) (*vm)->DetachCurrentThread(vm);
}

JNIEXPORT jint JNI_OnLoad(JavaVM *vm, void *reserved) {
    (void) reserved;
    g_vm = vm;
    return JNI_VERSION_1_6;
}

JNIEXPORT void JNICALL
Java_com_so_revelation_glua_core_log_NativeBridge_nativeInstall(
        JNIEnv *env, jclass clazz, jobject sink) {
    (void) clazz;

    pthread_mutex_lock(&g_jni_lock);
    if (g_sink_obj != NULL) {
        (*env)->DeleteGlobalRef(env, g_sink_obj);
        g_sink_obj = NULL;
        g_sink_method = NULL;
    }
    if (sink != NULL) {
        g_sink_obj = (*env)->NewGlobalRef(env, sink);
        jclass cls = (*env)->GetObjectClass(env, sink);
        g_sink_method = (*env)->GetMethodID(env, cls, "onNativeLog",
                                           "(ILjava/lang/String;Ljava/lang/String;)V");
        (*env)->DeleteLocalRef(env, cls);
    }
    pthread_mutex_unlock(&g_jni_lock);

    glua_log_set_sink(jni_sink);
    glua_crash_install();
}

JNIEXPORT void JNICALL
Java_com_so_revelation_glua_core_log_NativeBridge_nativeUninstall(
        JNIEnv *env, jclass clazz) {
    (void) clazz;
    glua_crash_uninstall();
    glua_log_set_sink(NULL);

    pthread_mutex_lock(&g_jni_lock);
    if (g_sink_obj != NULL) {
        (*env)->DeleteGlobalRef(env, g_sink_obj);
        g_sink_obj = NULL;
        g_sink_method = NULL;
    }
    pthread_mutex_unlock(&g_jni_lock);
}

JNIEXPORT void JNICALL
Java_com_so_revelation_glua_core_log_NativeBridge_nativeLog(
        JNIEnv *env, jclass clazz, jint level, jstring tag, jstring message) {
    (void) clazz;
    const char *ctag = (*env)->GetStringUTFChars(env, tag, NULL);
    const char *cmsg = (*env)->GetStringUTFChars(env, message, NULL);
    if (ctag != NULL && cmsg != NULL) {
        glua_log_write((glua_log_level) level, ctag, "%s", cmsg);
    }
    if (ctag != NULL) (*env)->ReleaseStringUTFChars(env, tag, ctag);
    if (cmsg != NULL) (*env)->ReleaseStringUTFChars(env, message, cmsg);
}

/** 故意触发段错误，用于验证崩溃捕获链路（仅 debug 使用）。 */
JNIEXPORT void JNICALL
Java_com_so_revelation_glua_core_log_NativeBridge_nativeTriggerCrash(
        JNIEnv *env, jclass clazz) {
    (void) env; (void) clazz;
    volatile int *p = (int *) 0x1;
    *p = 42;
}
