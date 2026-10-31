package p034e0;

import android.view.ViewGroup;

/* renamed from: e0.g */
/* loaded from: classes.dex */
public final class C0920g {
    /* renamed from: a */
    public static int m2695a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    /* renamed from: b */
    public static int m2696b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    /* renamed from: c */
    public static int m2697c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    /* renamed from: d */
    public static boolean m2698d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    /* renamed from: e */
    public static void m2699e(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        marginLayoutParams.resolveLayoutDirection(i7);
    }

    /* renamed from: f */
    public static void m2700f(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        marginLayoutParams.setLayoutDirection(i7);
    }

    /* renamed from: g */
    public static void m2701g(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        marginLayoutParams.setMarginEnd(i7);
    }

    /* renamed from: h */
    public static void m2702h(ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        marginLayoutParams.setMarginStart(i7);
    }
}
