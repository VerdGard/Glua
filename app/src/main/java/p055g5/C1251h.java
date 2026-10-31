package p055g5;

import android.widget.OverScroller;

/* renamed from: g5.h */
/* loaded from: classes.dex */
public final class C1251h {

    /* renamed from: a */
    public final C1245b f6180a;

    /* renamed from: b */
    public final OverScroller f6181b;

    public C1251h(C1245b c1245b) {
        this.f6181b = new OverScroller(c1245b.getContext());
        this.f6180a = c1245b;
    }

    /* renamed from: a */
    public final float m3548a() {
        return this.f6181b.getCurrVelocity();
    }

    /* renamed from: b */
    public final int m3549b() {
        return this.f6181b.getCurrX();
    }

    /* renamed from: c */
    public final int m3550c() {
        return this.f6181b.getCurrY();
    }

    /* renamed from: d */
    public final void m3551d() {
        OverScroller overScroller = this.f6181b;
        int currX = overScroller.getCurrX();
        C1245b c1245b = this.f6180a;
        c1245b.setScrollX(currX);
        c1245b.setScrollY(overScroller.getCurrY());
    }

    /* renamed from: e */
    public final void m3552e(int i7, int i8, int i9, int i10) {
        this.f6181b.startScroll(i7, i8, i9, i10, 0);
        m3551d();
    }
}
