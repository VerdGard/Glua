package p135r;

import java.util.ArrayList;
import java.util.Iterator;
import p127q.C1710a;
import p127q.C1713d;

/* renamed from: r.i */
/* loaded from: classes.dex */
public final class C1815i extends AbstractC1819m {
    public C1815i(C1713d c1713d) {
        super(c1713d);
    }

    @Override // p135r.AbstractC1819m, p135r.InterfaceC1810d
    /* renamed from: a */
    public final void mo4267a(InterfaceC1810d interfaceC1810d) {
        C1710a c1710a = (C1710a) this.f8236b;
        int i7 = c1710a.f7714g0;
        C1812f c1812f = this.f8242h;
        Iterator it = c1812f.f8228l.iterator();
        int i8 = 0;
        int i9 = -1;
        while (it.hasNext()) {
            int i10 = ((C1812f) it.next()).f8223g;
            if (i9 == -1 || i10 < i9) {
                i9 = i10;
            }
            if (i8 < i10) {
                i8 = i10;
            }
        }
        if (i7 == 0 || i7 == 2) {
            c1812f.mo4284d(i9 + c1710a.f7716i0);
        } else {
            c1812f.mo4284d(i8 + c1710a.f7716i0);
        }
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: d */
    public final void mo4268d() {
        AbstractC1819m abstractC1819m;
        C1713d c1713d = this.f8236b;
        if (c1713d instanceof C1710a) {
            C1812f c1812f = this.f8242h;
            c1812f.f8218b = true;
            C1710a c1710a = (C1710a) c1713d;
            int i7 = c1710a.f7714g0;
            boolean z6 = c1710a.f7715h0;
            ArrayList arrayList = c1812f.f8228l;
            int i8 = 0;
            if (i7 == 0) {
                c1812f.f8221e = 4;
                while (i8 < c1710a.f7869f0) {
                    C1713d c1713d2 = c1710a.f7868e0[i8];
                    if (z6 || c1713d2.f7773X != 8) {
                        C1812f c1812f2 = c1713d2.f7782d.f8242h;
                        c1812f2.f8227k.add(c1812f);
                        arrayList.add(c1812f2);
                    }
                    i8++;
                }
            } else {
                if (i7 != 1) {
                    if (i7 == 2) {
                        c1812f.f8221e = 6;
                        while (i8 < c1710a.f7869f0) {
                            C1713d c1713d3 = c1710a.f7868e0[i8];
                            if (z6 || c1713d3.f7773X != 8) {
                                C1812f c1812f3 = c1713d3.f7784e.f8242h;
                                c1812f3.f8227k.add(c1812f);
                                arrayList.add(c1812f3);
                            }
                            i8++;
                        }
                    } else {
                        if (i7 != 3) {
                            return;
                        }
                        c1812f.f8221e = 7;
                        while (i8 < c1710a.f7869f0) {
                            C1713d c1713d4 = c1710a.f7868e0[i8];
                            if (z6 || c1713d4.f7773X != 8) {
                                C1812f c1812f4 = c1713d4.f7784e.f8243i;
                                c1812f4.f8227k.add(c1812f);
                                arrayList.add(c1812f4);
                            }
                            i8++;
                        }
                    }
                    m4286m(this.f8236b.f7784e.f8242h);
                    abstractC1819m = this.f8236b.f7784e;
                    m4286m(abstractC1819m.f8243i);
                }
                c1812f.f8221e = 5;
                while (i8 < c1710a.f7869f0) {
                    C1713d c1713d5 = c1710a.f7868e0[i8];
                    if (z6 || c1713d5.f7773X != 8) {
                        C1812f c1812f5 = c1713d5.f7782d.f8243i;
                        c1812f5.f8227k.add(c1812f);
                        arrayList.add(c1812f5);
                    }
                    i8++;
                }
            }
            m4286m(this.f8236b.f7782d.f8242h);
            abstractC1819m = this.f8236b.f7782d;
            m4286m(abstractC1819m.f8243i);
        }
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: e */
    public final void mo4269e() {
        C1713d c1713d = this.f8236b;
        if (c1713d instanceof C1710a) {
            int i7 = ((C1710a) c1713d).f7714g0;
            C1812f c1812f = this.f8242h;
            if (i7 == 0 || i7 == 1) {
                c1713d.f7765P = c1812f.f8223g;
            } else {
                c1713d.f7766Q = c1812f.f8223g;
            }
        }
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: f */
    public final void mo4270f() {
        this.f8237c = null;
        this.f8242h.m4283c();
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: k */
    public final boolean mo4272k() {
        return false;
    }

    /* renamed from: m */
    public final void m4286m(C1812f c1812f) {
        C1812f c1812f2 = this.f8242h;
        c1812f2.f8227k.add(c1812f);
        c1812f.f8228l.add(c1812f2);
    }
}
