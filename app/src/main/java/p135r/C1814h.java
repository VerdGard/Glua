package p135r;

import p127q.C1713d;
import p127q.C1716g;

/* renamed from: r.h */
/* loaded from: classes.dex */
public final class C1814h extends AbstractC1819m {
    public C1814h(C1713d c1713d) {
        super(c1713d);
        c1713d.f7782d.mo4270f();
        c1713d.f7784e.mo4270f();
        this.f8240f = ((C1716g) c1713d).f7867i0;
    }

    @Override // p135r.AbstractC1819m, p135r.InterfaceC1810d
    /* renamed from: a */
    public final void mo4267a(InterfaceC1810d interfaceC1810d) {
        C1812f c1812f = this.f8242h;
        if (c1812f.f8219c && !c1812f.f8226j) {
            c1812f.mo4284d((int) ((((C1812f) c1812f.f8228l.get(0)).f8223g * ((C1716g) this.f8236b).f7863e0) + 0.5f));
        }
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: d */
    public final void mo4268d() {
        AbstractC1819m abstractC1819m;
        C1713d c1713d = this.f8236b;
        C1716g c1716g = (C1716g) c1713d;
        int i7 = c1716g.f7864f0;
        int i8 = c1716g.f7865g0;
        int i9 = c1716g.f7867i0;
        C1812f c1812f = this.f8242h;
        if (i9 == 1) {
            if (i7 != -1) {
                c1812f.f8228l.add(c1713d.f7760K.f7782d.f8242h);
                this.f8236b.f7760K.f7782d.f8242h.f8227k.add(c1812f);
                c1812f.f8222f = i7;
            } else if (i8 != -1) {
                c1812f.f8228l.add(c1713d.f7760K.f7782d.f8243i);
                this.f8236b.f7760K.f7782d.f8243i.f8227k.add(c1812f);
                c1812f.f8222f = -i8;
            } else {
                c1812f.f8218b = true;
                c1812f.f8228l.add(c1713d.f7760K.f7782d.f8243i);
                this.f8236b.f7760K.f7782d.f8243i.f8227k.add(c1812f);
            }
            m4285m(this.f8236b.f7782d.f8242h);
            abstractC1819m = this.f8236b.f7782d;
        } else {
            if (i7 != -1) {
                c1812f.f8228l.add(c1713d.f7760K.f7784e.f8242h);
                this.f8236b.f7760K.f7784e.f8242h.f8227k.add(c1812f);
                c1812f.f8222f = i7;
            } else if (i8 != -1) {
                c1812f.f8228l.add(c1713d.f7760K.f7784e.f8243i);
                this.f8236b.f7760K.f7784e.f8243i.f8227k.add(c1812f);
                c1812f.f8222f = -i8;
            } else {
                c1812f.f8218b = true;
                c1812f.f8228l.add(c1713d.f7760K.f7784e.f8243i);
                this.f8236b.f7760K.f7784e.f8243i.f8227k.add(c1812f);
            }
            m4285m(this.f8236b.f7784e.f8242h);
            abstractC1819m = this.f8236b.f7784e;
        }
        m4285m(abstractC1819m.f8243i);
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: e */
    public final void mo4269e() {
        C1713d c1713d = this.f8236b;
        int i7 = ((C1716g) c1713d).f7867i0;
        C1812f c1812f = this.f8242h;
        if (i7 == 1) {
            c1713d.f7765P = c1812f.f8223g;
        } else {
            c1713d.f7766Q = c1812f.f8223g;
        }
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: f */
    public final void mo4270f() {
        this.f8242h.m4283c();
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: k */
    public final boolean mo4272k() {
        return false;
    }

    /* renamed from: m */
    public final void m4285m(C1812f c1812f) {
        C1812f c1812f2 = this.f8242h;
        c1812f2.f8227k.add(c1812f);
        c1812f.f8228l.add(c1812f2);
    }
}
