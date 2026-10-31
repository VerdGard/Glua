package p114o1;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p034e0.C0920g;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: o1.e */
/* loaded from: classes.dex */
public final class C1664e {
    /* renamed from: a */
    public static int m4020a(View view, boolean z6) {
        if (view == null) {
            return 0;
        }
        if (m4026g(view)) {
            if (!z6) {
                return view.getLeft();
            }
            int left = view.getLeft();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            return C0946x.e.m2848e(view) + left;
        }
        if (!z6) {
            return view.getRight();
        }
        int right = view.getRight();
        WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
        return right - C0946x.e.m2848e(view);
    }

    /* renamed from: b */
    public static int m4021b(View view) {
        if (view == null) {
            return 0;
        }
        return C0920g.m2696b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    /* renamed from: c */
    public static int m4022c(View view) {
        if (view == null) {
            return 0;
        }
        return C0920g.m2697c((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    /* renamed from: d */
    public static int m4023d(View view, boolean z6) {
        if (view == null) {
            return 0;
        }
        if (m4026g(view)) {
            if (!z6) {
                return view.getRight();
            }
            int right = view.getRight();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            return right - C0946x.e.m2849f(view);
        }
        if (!z6) {
            return view.getLeft();
        }
        int left = view.getLeft();
        WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
        return C0946x.e.m2849f(view) + left;
    }

    /* renamed from: e */
    public static int m4024e(View view) {
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    /* renamed from: f */
    public static int m4025f(View view) {
        int m2696b;
        int m4024e = m4024e(view);
        if (view == null) {
            m2696b = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            m2696b = C0920g.m2696b(marginLayoutParams) + C0920g.m2697c(marginLayoutParams);
        }
        return m2696b + m4024e;
    }

    /* renamed from: g */
    public static boolean m4026g(View view) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return C0946x.e.m2847d(view) == 1;
    }
}
