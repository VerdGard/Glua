package p012b3;

import android.view.View;
import p034e0.C0946x;

/* renamed from: b3.g */
/* loaded from: classes.dex */
public final class C0537g {

    /* renamed from: a */
    public final View f2689a;

    /* renamed from: b */
    public int f2690b;

    /* renamed from: c */
    public int f2691c;

    /* renamed from: d */
    public int f2692d;

    public C0537g(View view) {
        this.f2689a = view;
    }

    /* renamed from: a */
    public final void m1851a() {
        int i7 = this.f2692d;
        View view = this.f2689a;
        C0946x.m2811l(view, i7 - (view.getTop() - this.f2690b));
        C0946x.m2810k(view, 0 - (view.getLeft() - this.f2691c));
    }
}
