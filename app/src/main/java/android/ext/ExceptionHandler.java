package android.ext;

import java.lang.Thread;

/* loaded from: classes.dex */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final int BREVENT = 2;
    public static final int FIELDS = 2;
    public static final String LAST_EXCEPTION = "last_exception";
    public static final String LAST_EXCEPTION_TRACE = "last_exception_trace";
    private static final String NATIVE_CRASH_LOG = "client_crash.log";
    public static final int NEOSAFE = 5;
    public static final int PREVENT_RUNNING = 1;
    public static final int SECURITY = 3;
    private static final String STORE_EXCEPTION_DELIMITER = "@#%~~%#@";
    private static final String STORE_EXCEPTION_FILENAME = "store_ex.txt";
    public static final int WHETSTONE = 4;
    public static final int XPRIVACY = 0;
    private static volatile Throwable last = null;
    private static volatile boolean restart = false;
    private final Thread.UncaughtExceptionHandler previousHandler;
    private final String type;

    public static class ThreadEx extends Thread {
        public ThreadEx(Runnable runnable, String str) {
            super(runnable, str);
            ExceptionHandler.install(this);
        }
    }

    private ExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, String str) {
        this.previousHandler = uncaughtExceptionHandler;
        this.type = str;
    }

    public static String[] getApps() {
        return new String[]{"XPrivacy", "biz.bokhorst.xprivacy", "Prevent Running", "me.piebridge.forcestopgb", "Brevent", "me.piebridge.brevent", "Security", "com.chaozhuo.permission.controller", "Whetstone", "com.miui.whetstone", "NeoSafe", "cn.nubia.security2"};
    }

    public static void install() {
        install(Thread.currentThread());
    }

    public static void install(Thread thread) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == null || !(defaultUncaughtExceptionHandler instanceof ExceptionHandler)) {
            Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(defaultUncaughtExceptionHandler, "default"));
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler == null || !(uncaughtExceptionHandler instanceof ExceptionHandler)) {
            if (uncaughtExceptionHandler == null) {
                uncaughtExceptionHandler = thread.getThreadGroup();
            }
            thread.setUncaughtExceptionHandler(new ExceptionHandler(uncaughtExceptionHandler, "thread:" + thread.getName()));
        }
    }

    private static void showLastException(String str, String str2, Runnable runnable) {
        String[] apps = getApps();
        for (int i7 = 0; i7 < apps.length; i7 += 2) {
            if (str.contains(": " + apps[i7])) {
                return;
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (last != th) {
            last = th;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
