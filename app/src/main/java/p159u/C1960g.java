package p159u;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: u.g */
/* loaded from: classes.dex */
public final class C1960g {
    /* renamed from: a */
    public static int m4570a(AppOpsManager appOpsManager, String str, int i7, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i7, str2);
    }

    /* renamed from: b */
    public static String m4571b(Context context) {
        String opPackageName;
        opPackageName = context.getOpPackageName();
        return opPackageName;
    }

    /* renamed from: c */
    public static AppOpsManager m4572c(Context context) {
        Object systemService;
        systemService = context.getSystemService((Class<Object>) AppOpsManager.class);
        return (AppOpsManager) systemService;
    }
}
