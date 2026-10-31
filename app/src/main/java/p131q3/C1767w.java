package p131q3;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: q3.w */
/* loaded from: classes.dex */
public final class C1767w {

    /* renamed from: q3.w$a */
    public interface a {
    }

    /* renamed from: q3.w$b */
    public static class b {

        /* renamed from: a */
        public final int f8126a;

        /* renamed from: b */
        public final int f8127b;

        /* renamed from: c */
        public final int f8128c;

        public b(int i7, int i8, int i9, int i10) {
            this.f8126a = i7;
            this.f8127b = i9;
            this.f8128c = i10;
        }
    }

    /* renamed from: a */
    public static float m4238a(int i7, Context context) {
        return TypedValue.applyDimension(1, i7, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static boolean m4239b(View view) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return C0946x.e.m2847d(view) == 1;
    }

    /* renamed from: c */
    public static PorterDuff.Mode m4240c(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
