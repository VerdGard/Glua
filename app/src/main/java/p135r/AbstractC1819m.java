package p135r;

import p127q.C1712c;
import p127q.C1713d;

/* renamed from: r.m */
/* loaded from: classes.dex */
public abstract class AbstractC1819m implements InterfaceC1810d {

    /* renamed from: a */
    public int f8235a;

    /* renamed from: b */
    public C1713d f8236b;

    /* renamed from: c */
    public C1817k f8237c;

    /* renamed from: d */
    public int f8238d;

    /* renamed from: e */
    public final C1813g f8239e = new C1813g(this);

    /* renamed from: f */
    public int f8240f = 0;

    /* renamed from: g */
    public boolean f8241g = false;

    /* renamed from: h */
    public final C1812f f8242h = new C1812f(this);

    /* renamed from: i */
    public final C1812f f8243i = new C1812f(this);

    /* renamed from: j */
    public int f8244j = 1;

    public AbstractC1819m(C1713d c1713d) {
        this.f8236b = c1713d;
    }

    /* renamed from: b */
    public static void m4292b(C1812f c1812f, C1812f c1812f2, int i7) {
        c1812f.f8228l.add(c1812f2);
        c1812f.f8222f = i7;
        c1812f2.f8227k.add(c1812f);
    }

    /* renamed from: h */
    public static C1812f m4293h(C1712c c1712c) {
        AbstractC1819m abstractC1819m;
        AbstractC1819m abstractC1819m2;
        C1712c c1712c2 = c1712c.f7737d;
        if (c1712c2 == null) {
            return null;
        }
        int ordinal = c1712c2.f7736c.ordinal();
        C1713d c1713d = c1712c2.f7735b;
        if (ordinal == 1) {
            abstractC1819m = c1713d.f7782d;
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    abstractC1819m2 = c1713d.f7782d;
                } else {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return c1713d.f7784e.f8233k;
                    }
                    abstractC1819m2 = c1713d.f7784e;
                }
                return abstractC1819m2.f8243i;
            }
            abstractC1819m = c1713d.f7784e;
        }
        return abstractC1819m.f8242h;
    }

    /* renamed from: i */
    public static C1812f m4294i(C1712c c1712c, int i7) {
        C1712c c1712c2 = c1712c.f7737d;
        if (c1712c2 == null) {
            return null;
        }
        C1713d c1713d = c1712c2.f7735b;
        AbstractC1819m abstractC1819m = i7 == 0 ? c1713d.f7782d : c1713d.f7784e;
        int ordinal = c1712c2.f7736c.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return abstractC1819m.f8242h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return abstractC1819m.f8243i;
        }
        return null;
    }

    @Override // p135r.InterfaceC1810d
    /* renamed from: a */
    public void mo4267a(InterfaceC1810d interfaceC1810d) {
    }

    /* renamed from: c */
    public final void m4295c(C1812f c1812f, C1812f c1812f2, int i7, C1813g c1813g) {
        c1812f.f8228l.add(c1812f2);
        c1812f.f8228l.add(this.f8239e);
        c1812f.f8224h = i7;
        c1812f.f8225i = c1813g;
        c1812f2.f8227k.add(c1812f);
        c1813g.f8227k.add(c1812f);
    }

    /* renamed from: d */
    public abstract void mo4268d();

    /* renamed from: e */
    public abstract void mo4269e();

    /* renamed from: f */
    public abstract void mo4270f();

    /* renamed from: g */
    public final int m4296g(int i7, int i8) {
        int max;
        if (i8 == 0) {
            C1713d c1713d = this.f8236b;
            int i9 = c1713d.f7793n;
            max = Math.max(c1713d.f7792m, i7);
            if (i9 > 0) {
                max = Math.min(i9, i7);
            }
            if (max == i7) {
                return i7;
            }
        } else {
            C1713d c1713d2 = this.f8236b;
            int i10 = c1713d2.f7796q;
            max = Math.max(c1713d2.f7795p, i7);
            if (i10 > 0) {
                max = Math.min(i10, i7);
            }
            if (max == i7) {
                return i7;
            }
        }
        return max;
    }

    /* renamed from: j */
    public long mo4271j() {
        if (this.f8239e.f8226j) {
            return r0.f8223g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo4272k();

    /* renamed from: l */
    public final void m4297l(C1712c c1712c, C1712c c1712c2, int i7) {
        int i8;
        int m4296g;
        C1812f m4293h = m4293h(c1712c);
        C1812f m4293h2 = m4293h(c1712c2);
        if (m4293h.f8226j && m4293h2.f8226j) {
            int m4149c = c1712c.m4149c() + m4293h.f8223g;
            int m4149c2 = m4293h2.f8223g - c1712c2.m4149c();
            int i9 = m4149c2 - m4149c;
            C1813g c1813g = this.f8239e;
            if (!c1813g.f8226j && this.f8238d == 3) {
                int i10 = this.f8235a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        m4296g = Math.min(m4296g(c1813g.f8229m, i7), i9);
                    } else if (i10 == 2) {
                        C1713d c1713d = this.f8236b;
                        C1713d c1713d2 = c1713d.f7760K;
                        if (c1713d2 != null) {
                            if ((i7 == 0 ? c1713d2.f7782d : c1713d2.f7784e).f8239e.f8226j) {
                                i8 = (int) ((r6.f8223g * (i7 == 0 ? c1713d.f7794o : c1713d.f7797r)) + 0.5f);
                            }
                        }
                    } else if (i10 == 3) {
                        C1713d c1713d3 = this.f8236b;
                        AbstractC1819m abstractC1819m = c1713d3.f7782d;
                        int i11 = abstractC1819m.f8238d;
                        AbstractC1819m abstractC1819m2 = c1713d3.f7784e;
                        if (i11 != 3 || abstractC1819m.f8235a != 3 || abstractC1819m2.f8238d != 3 || abstractC1819m2.f8235a != 3) {
                            if (i7 == 0) {
                                abstractC1819m = abstractC1819m2;
                            }
                            if (abstractC1819m.f8239e.f8226j) {
                                float f7 = c1713d3.f7763N;
                                m4296g = i7 == 1 ? (int) ((r6.f8223g / f7) + 0.5f) : (int) ((f7 * r6.f8223g) + 0.5f);
                            }
                        }
                    }
                    c1813g.mo4284d(m4296g);
                } else {
                    i8 = i9;
                }
                m4296g = m4296g(i8, i7);
                c1813g.mo4284d(m4296g);
            }
            if (c1813g.f8226j) {
                int i12 = c1813g.f8223g;
                C1812f c1812f = this.f8243i;
                C1812f c1812f2 = this.f8242h;
                if (i12 == i9) {
                    c1812f2.mo4284d(m4149c);
                    c1812f.mo4284d(m4149c2);
                    return;
                }
                C1713d c1713d4 = this.f8236b;
                float f8 = i7 == 0 ? c1713d4.f7770U : c1713d4.f7771V;
                if (m4293h == m4293h2) {
                    m4149c = m4293h.f8223g;
                    m4149c2 = m4293h2.f8223g;
                    f8 = 0.5f;
                }
                c1812f2.mo4284d((int) ((((m4149c2 - m4149c) - i12) * f8) + m4149c + 0.5f));
                c1812f.mo4284d(c1812f2.f8223g + c1813g.f8223g);
            }
        }
    }
}
