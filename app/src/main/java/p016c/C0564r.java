package p016c;

import android.view.View;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: c.r */
/* loaded from: classes.dex */
public final class C0564r extends C0017d {

    /* renamed from: w */
    public final /* synthetic */ LayoutInflaterFactory2C0560n f2899w;

    public C0564r(LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n) {
        this.f2899w = layoutInflaterFactory2C0560n;
    }

    @Override // p034e0.InterfaceC0925i0
    /* renamed from: a */
    public final void mo651a() {
        LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = this.f2899w;
        layoutInflaterFactory2C0560n.f2818K1.setAlpha(1.0f);
        layoutInflaterFactory2C0560n.f2821N1.m2706d(null);
        layoutInflaterFactory2C0560n.f2821N1 = null;
    }

    @Override // p002a1.C0017d, p034e0.InterfaceC0925i0
    /* renamed from: f */
    public final void mo108f() {
        LayoutInflaterFactory2C0560n layoutInflaterFactory2C0560n = this.f2899w;
        layoutInflaterFactory2C0560n.f2818K1.setVisibility(0);
        if (layoutInflaterFactory2C0560n.f2818K1.getParent() instanceof View) {
            View view = (View) layoutInflaterFactory2C0560n.f2818K1.getParent();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.h.m2867c(view);
        }
    }
}
