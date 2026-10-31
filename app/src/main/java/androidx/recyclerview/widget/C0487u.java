package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.u */
/* loaded from: classes.dex */
public final class C0487u extends AbstractC0465a0 {

    /* renamed from: c */
    public C0484r f2493c;

    /* renamed from: d */
    public C0483q f2494d;

    /* renamed from: c */
    public static int m1802c(View view, AbstractC0485s abstractC0485s) {
        return ((abstractC0485s.mo1788c(view) / 2) + abstractC0485s.mo1790e(view)) - ((abstractC0485s.mo1797l() / 2) + abstractC0485s.mo1796k());
    }

    @Override // androidx.recyclerview.widget.AbstractC0465a0
    /* renamed from: a */
    public final int[] mo1738a(RecyclerView.AbstractC0444m abstractC0444m, View view) {
        int[] iArr = new int[2];
        if (abstractC0444m.mo1493e()) {
            iArr[0] = m1802c(view, m1803d(abstractC0444m));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0444m.mo1496f()) {
            iArr[1] = m1802c(view, m1804e(abstractC0444m));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: d */
    public final AbstractC0485s m1803d(RecyclerView.AbstractC0444m abstractC0444m) {
        C0483q c0483q = this.f2494d;
        if (c0483q == null || c0483q.f2489a != abstractC0444m) {
            this.f2494d = new C0483q(abstractC0444m);
        }
        return this.f2494d;
    }

    /* renamed from: e */
    public final AbstractC0485s m1804e(RecyclerView.AbstractC0444m abstractC0444m) {
        C0484r c0484r = this.f2493c;
        if (c0484r == null || c0484r.f2489a != abstractC0444m) {
            this.f2493c = new C0484r(abstractC0444m);
        }
        return this.f2493c;
    }
}
