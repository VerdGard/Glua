package p010b1;

import java.util.ArrayList;
import java.util.List;
import p018c1.AbstractC0580a;
import p018c1.C0582c;
import p051g1.C1207p;
import p059h1.AbstractC1284b;

/* renamed from: b1.r */
/* loaded from: classes.dex */
public final class C0529r implements InterfaceC0513b, AbstractC0580a.a {

    /* renamed from: a */
    public final ArrayList f2659a = new ArrayList();

    /* renamed from: b */
    public final int f2660b;

    /* renamed from: c */
    public final C0582c f2661c;

    /* renamed from: d */
    public final C0582c f2662d;

    /* renamed from: e */
    public final C0582c f2663e;

    public C0529r(AbstractC1284b abstractC1284b, C1207p c1207p) {
        c1207p.getClass();
        this.f2660b = c1207p.f5918a;
        AbstractC0580a<Float, Float> mo1994a = c1207p.f5919b.mo1994a();
        this.f2661c = (C0582c) mo1994a;
        AbstractC0580a<Float, Float> mo1994a2 = c1207p.f5920c.mo1994a();
        this.f2662d = (C0582c) mo1994a2;
        AbstractC0580a<Float, Float> mo1994a3 = c1207p.f5921d.mo1994a();
        this.f2663e = (C0582c) mo1994a3;
        abstractC1284b.m3597d(mo1994a);
        abstractC1284b.m3597d(mo1994a2);
        abstractC1284b.m3597d(mo1994a3);
        mo1994a.m2026a(this);
        mo1994a2.m2026a(this);
        mo1994a3.m2026a(this);
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2659a;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((AbstractC0580a.a) arrayList.get(i7)).mo1826a();
            i7++;
        }
    }

    /* renamed from: b */
    public final void m1838b(AbstractC0580a.a aVar) {
        this.f2659a.add(aVar);
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
    }
}
