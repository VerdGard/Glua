package p036e2;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: e2.y */
/* loaded from: classes.dex */
public final class C1124y {

    /* renamed from: a */
    public static boolean f5606a;

    /* renamed from: a */
    public static boolean m3298a(Context context) {
        String m2982p = C0968b4.m2982p(context);
        return !TextUtils.isEmpty(m2982p) && m2982p.contains("helios");
    }

    /* renamed from: b */
    public static boolean m3299b(Context context, String str) {
        if (context != null) {
            return true;
        }
        C1023j3.f5170m.m382g(5, "[WARNING] " + str + ", context is null, invalid");
        return false;
    }

    /* renamed from: c */
    public static boolean m3300c(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        boolean z6 = false;
        for (int i7 = 2; i7 < stackTrace.length; i7++) {
            StackTraceElement stackTraceElement = stackTrace[i7];
            if (stackTraceElement.getMethodName().equals(str)) {
                try {
                    for (Class<?> cls = Class.forName(stackTraceElement.getClassName()); cls.getSuperclass() != null && cls.getSuperclass() != Activity.class; cls = cls.getSuperclass()) {
                    }
                    z6 = true;
                } catch (Exception unused) {
                }
            }
        }
        return z6;
    }

    /* renamed from: d */
    public static synchronized void m3301d(Activity activity) {
        synchronized (C1124y.class) {
            if (m3299b(activity, "onPause(...)")) {
                if (!m3300c("onPause")) {
                    C1023j3.f5170m.m382g(6, "[WARNING] onPause must be called in Activity.onPause");
                } else {
                    if (m3298a(activity)) {
                        return;
                    }
                    C0991f.m3015d().m3019f(activity, false);
                }
            }
        }
    }
}
