package p034e0;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;
import p026d0.C0874b;

/* renamed from: e0.d */
/* loaded from: classes.dex */
public final class C0914d {

    /* renamed from: a */
    public final DisplayCutout f4792a;

    /* renamed from: e0.d$a */
    public static class a {
        /* renamed from: a */
        public static DisplayCutout m2674a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        public static List<Rect> m2675b(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            boundingRects = displayCutout.getBoundingRects();
            return boundingRects;
        }

        /* renamed from: c */
        public static int m2676c(DisplayCutout displayCutout) {
            int safeInsetBottom;
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            return safeInsetBottom;
        }

        /* renamed from: d */
        public static int m2677d(DisplayCutout displayCutout) {
            int safeInsetLeft;
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            return safeInsetLeft;
        }

        /* renamed from: e */
        public static int m2678e(DisplayCutout displayCutout) {
            int safeInsetRight;
            safeInsetRight = displayCutout.getSafeInsetRight();
            return safeInsetRight;
        }

        /* renamed from: f */
        public static int m2679f(DisplayCutout displayCutout) {
            int safeInsetTop;
            safeInsetTop = displayCutout.getSafeInsetTop();
            return safeInsetTop;
        }
    }

    public C0914d(DisplayCutout displayCutout) {
        this.f4792a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0914d.class != obj.getClass()) {
            return false;
        }
        return C0874b.m2562a(this.f4792a, ((C0914d) obj).f4792a);
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f4792a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4792a + "}";
    }
}
