package p018c1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import p018c1.AbstractC0580a;
import p083k1.C1447a;

/* renamed from: c1.k */
/* loaded from: classes.dex */
public final class C0590k extends AbstractC0580a<PointF, PointF> {

    /* renamed from: g */
    public final PointF f2971g;

    /* renamed from: h */
    public final AbstractC0580a<Float, Float> f2972h;

    /* renamed from: i */
    public final AbstractC0580a<Float, Float> f2973i;

    public C0590k(C0582c c0582c, C0582c c0582c2) {
        super(Collections.emptyList());
        this.f2971g = new PointF();
        this.f2972h = c0582c;
        this.f2973i = c0582c2;
        mo2033h(this.f2954d);
    }

    @Override // p018c1.AbstractC0580a
    /* renamed from: e */
    public final PointF mo2030e() {
        return this.f2971g;
    }

    @Override // p018c1.AbstractC0580a
    /* renamed from: f */
    public final PointF mo2031f(C1447a<PointF> c1447a, float f7) {
        return this.f2971g;
    }

    @Override // p018c1.AbstractC0580a
    /* renamed from: h */
    public final void mo2033h(float f7) {
        AbstractC0580a<Float, Float> abstractC0580a = this.f2972h;
        abstractC0580a.mo2033h(f7);
        AbstractC0580a<Float, Float> abstractC0580a2 = this.f2973i;
        abstractC0580a2.mo2033h(f7);
        this.f2971g.set(abstractC0580a.mo2030e().floatValue(), abstractC0580a2.mo2030e().floatValue());
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2951a;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((AbstractC0580a.a) arrayList.get(i7)).mo1826a();
            i7++;
        }
    }
}
