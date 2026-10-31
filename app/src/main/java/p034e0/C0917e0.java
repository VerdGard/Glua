package p034e0;

import android.view.View;
import android.view.ViewParent;

/* renamed from: e0.e0 */
/* loaded from: classes.dex */
public final class C0917e0 {
    /* renamed from: a */
    public static boolean m2686a(ViewParent viewParent, View view, float f7, float f8, boolean z6) {
        return viewParent.onNestedFling(view, f7, f8, z6);
    }

    /* renamed from: b */
    public static boolean m2687b(ViewParent viewParent, View view, float f7, float f8) {
        return viewParent.onNestedPreFling(view, f7, f8);
    }

    /* renamed from: c */
    public static void m2688c(ViewParent viewParent, View view, int i7, int i8, int[] iArr) {
        viewParent.onNestedPreScroll(view, i7, i8, iArr);
    }

    /* renamed from: d */
    public static void m2689d(ViewParent viewParent, View view, int i7, int i8, int i9, int i10) {
        viewParent.onNestedScroll(view, i7, i8, i9, i10);
    }

    /* renamed from: e */
    public static void m2690e(ViewParent viewParent, View view, View view2, int i7) {
        viewParent.onNestedScrollAccepted(view, view2, i7);
    }

    /* renamed from: f */
    public static boolean m2691f(ViewParent viewParent, View view, View view2, int i7) {
        return viewParent.onStartNestedScroll(view, view2, i7);
    }

    /* renamed from: g */
    public static void m2692g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
