package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.appcompat.widget.p1 */
/* loaded from: classes.dex */
public final class C0257p1 {

    /* renamed from: a */
    public static final Method f1047a;

    /* renamed from: b */
    public static final boolean f1048b;

    static {
        f1048b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1047a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static boolean m872a(View view) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return C0946x.e.m2847d(view) == 1;
    }
}
