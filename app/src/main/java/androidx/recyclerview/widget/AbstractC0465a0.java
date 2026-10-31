package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC0465a0 extends RecyclerView.AbstractC0446o {

    /* renamed from: a */
    public RecyclerView f2348a;

    /* renamed from: b */
    public final a f2349b = new a();

    /* renamed from: androidx.recyclerview.widget.a0$a */
    public class a extends RecyclerView.AbstractC0448q {

        /* renamed from: a */
        public boolean f2350a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0448q
        /* renamed from: a */
        public final void mo1657a(RecyclerView recyclerView, int i7) {
            if (i7 == 0 && this.f2350a) {
                this.f2350a = false;
                AbstractC0465a0.this.m1739b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0448q
        /* renamed from: b */
        public final void mo1658b(RecyclerView recyclerView, int i7, int i8) {
            if (i7 == 0 && i8 == 0) {
                return;
            }
            this.f2350a = true;
        }
    }

    /* renamed from: a */
    public abstract int[] mo1738a(RecyclerView.AbstractC0444m abstractC0444m, View view);

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1739b() {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r11.f2348a
            if (r0 != 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            r1 = r11
            androidx.recyclerview.widget.u r1 = (androidx.recyclerview.widget.C0487u) r1
            boolean r2 = r0.mo1496f()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L1c
            androidx.recyclerview.widget.s r1 = r1.m1804e(r0)
            goto L26
        L1c:
            boolean r2 = r0.mo1493e()
            if (r2 == 0) goto L59
            androidx.recyclerview.widget.s r1 = r1.m1803d(r0)
        L26:
            int r2 = r0.m1643w()
            if (r2 != 0) goto L2d
            goto L59
        L2d:
            int r5 = r1.mo1796k()
            int r6 = r1.mo1797l()
            int r6 = r6 / 2
            int r6 = r6 + r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
        L3c:
            if (r7 >= r2) goto L59
            android.view.View r8 = r0.m1641v(r7)
            int r9 = r1.mo1790e(r8)
            int r10 = r1.mo1788c(r8)
            int r10 = r10 / 2
            int r10 = r10 + r9
            int r10 = r10 - r6
            int r9 = java.lang.Math.abs(r10)
            if (r9 >= r5) goto L56
            r3 = r8
            r5 = r9
        L56:
            int r7 = r7 + 1
            goto L3c
        L59:
            if (r3 != 0) goto L5c
            return
        L5c:
            int[] r0 = r11.mo1738a(r0, r3)
            r1 = r0[r4]
            r2 = 1
            if (r1 != 0) goto L69
            r3 = r0[r2]
            if (r3 == 0) goto L70
        L69:
            androidx.recyclerview.widget.RecyclerView r3 = r11.f2348a
            r0 = r0[r2]
            r3.m1543a0(r1, r0, r4)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.AbstractC0465a0.m1739b():void");
    }
}
