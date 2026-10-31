package com.baidu.mobstat;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class NativeCrashHandler {

    /* renamed from: a */
    public static final boolean f3688a;

    static {
        try {
            System.loadLibrary("crash_analysis");
            f3688a = true;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m2262a(Context context) {
        if (context != null && f3688a) {
            File cacheDir = context.getCacheDir();
            if (cacheDir.exists() && cacheDir.isDirectory()) {
                try {
                    nativeInit(cacheDir.getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static native void nativeInit(String str);
}
