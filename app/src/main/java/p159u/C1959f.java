package p159u;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: u.f */
/* loaded from: classes.dex */
public final class C1959f {
    /* renamed from: a */
    public static <T> T m4566a(Context context, Class<T> cls) {
        Object systemService;
        systemService = context.getSystemService(cls);
        return (T) systemService;
    }

    /* renamed from: b */
    public static int m4567b(AppOpsManager appOpsManager, String str, String str2) {
        int noteProxyOp;
        noteProxyOp = appOpsManager.noteProxyOp(str, str2);
        return noteProxyOp;
    }

    /* renamed from: c */
    public static int m4568c(AppOpsManager appOpsManager, String str, String str2) {
        int noteProxyOpNoThrow;
        noteProxyOpNoThrow = appOpsManager.noteProxyOpNoThrow(str, str2);
        return noteProxyOpNoThrow;
    }

    /* renamed from: d */
    public static String m4569d(String str) {
        String permissionToOp;
        permissionToOp = AppOpsManager.permissionToOp(str);
        return permissionToOp;
    }
}
