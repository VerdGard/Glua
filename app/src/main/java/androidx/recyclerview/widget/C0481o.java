package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public class C0481o extends RecyclerView.AbstractC0454w {

    /* renamed from: k */
    public PointF f2482k;

    /* renamed from: l */
    public final DisplayMetrics f2483l;

    /* renamed from: n */
    public float f2485n;

    /* renamed from: i */
    public final LinearInterpolator f2480i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f2481j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f2484m = false;

    /* renamed from: o */
    public int f2486o = 0;

    /* renamed from: p */
    public int f2487p = 0;

    public C0481o(Context context) {
        this.f2483l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: e */
    public static int m1782e(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == -1) {
            return i9 - i7;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                return i10 - i8;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i12 = i9 - i7;
        if (i12 > 0) {
            return i12;
        }
        int i13 = i10 - i8;
        if (i13 < 0) {
            return i13;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0454w
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1675c(android.view.View r7, androidx.recyclerview.widget.RecyclerView.AbstractC0454w.a r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f2482k
            r1 = -1
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = 1
            goto L16
        L13:
            r0 = -1
            goto L16
        L15:
            r0 = 0
        L16:
            int r0 = r6.mo1783f(r7, r0)
            android.graphics.PointF r5 = r6.f2482k
            if (r5 == 0) goto L29
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L29
        L25:
            if (r4 <= 0) goto L2a
            r1 = 1
            goto L2a
        L29:
            r1 = 0
        L2a:
            int r7 = r6.mo1784g(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.mo1786i(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r2 = r6.f2481j
            r8.f2257a = r0
            r8.f2258b = r7
            r8.f2259c = r1
            r8.f2261e = r2
            r8.f2262f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0481o.mo1675c(android.view.View, androidx.recyclerview.widget.RecyclerView$w$a):void");
    }

    /* renamed from: f */
    public int mo1783f(View view, int i7) {
        RecyclerView.AbstractC0444m abstractC0444m = this.f2251c;
        if (abstractC0444m == null || !abstractC0444m.mo1493e()) {
            return 0;
        }
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        return m1782e((view.getLeft() - ((RecyclerView.C0445n) view.getLayoutParams()).f2230b.left) - ((ViewGroup.MarginLayoutParams) c0445n).leftMargin, view.getRight() + ((RecyclerView.C0445n) view.getLayoutParams()).f2230b.right + ((ViewGroup.MarginLayoutParams) c0445n).rightMargin, abstractC0444m.m1620G(), abstractC0444m.f2221n - abstractC0444m.m1621H(), i7);
    }

    /* renamed from: g */
    public int mo1784g(View view, int i7) {
        RecyclerView.AbstractC0444m abstractC0444m = this.f2251c;
        if (abstractC0444m == null || !abstractC0444m.mo1496f()) {
            return 0;
        }
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        return m1782e(RecyclerView.AbstractC0444m.m1608C(view) - ((ViewGroup.MarginLayoutParams) c0445n).topMargin, RecyclerView.AbstractC0444m.m1615z(view) + ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin, abstractC0444m.m1622I(), abstractC0444m.f2222o - abstractC0444m.m1619F(), i7);
    }

    /* renamed from: h */
    public float mo1785h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: i */
    public int mo1786i(int i7) {
        float abs = Math.abs(i7);
        if (!this.f2484m) {
            this.f2485n = mo1785h(this.f2483l);
            this.f2484m = true;
        }
        return (int) Math.ceil(abs * this.f2485n);
    }
}
