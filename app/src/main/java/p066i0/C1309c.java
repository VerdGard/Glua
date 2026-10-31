package p066i0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: i0.c */
/* loaded from: classes.dex */
public final class C1309c {

    /* renamed from: i0.c$a */
    public static class a {
        /* renamed from: a */
        public static void m3635a(EdgeEffect edgeEffect, float f7, float f8) {
            edgeEffect.onPull(f7, f8);
        }
    }

    /* renamed from: i0.c$b */
    public static class b {
        /* renamed from: a */
        public static EdgeEffect m3636a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m3637b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m3638c(EdgeEffect edgeEffect, float f7, float f8) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f7, f8);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f7, f8);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static float m3633a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m3637b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m3634b(EdgeEffect edgeEffect, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m3638c(edgeEffect, f7, f8);
        }
        a.m3635a(edgeEffect, f7, f8);
        return f7;
    }
}
