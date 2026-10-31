package p135r;

import java.util.ArrayList;
import p127q.C1712c;
import p127q.C1713d;
import p127q.InterfaceC1717h;

/* renamed from: r.j */
/* loaded from: classes.dex */
public final class C1816j extends AbstractC1819m {

    /* renamed from: k */
    public static final int[] f8230k = new int[2];

    public C1816j(C1713d c1713d) {
        super(c1713d);
        this.f8242h.f8221e = 4;
        this.f8243i.f8221e = 5;
        this.f8240f = 0;
    }

    /* renamed from: m */
    public static void m4287m(int[] iArr, int i7, int i8, int i9, int i10, float f7, int i11) {
        int i12 = i8 - i7;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f7) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f7) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f7) + 0.5f);
        int i15 = (int) ((i12 / f7) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0229, code lost:
    
        if (r3 != 1) goto L126;
     */
    @Override // p135r.AbstractC1819m, p135r.InterfaceC1810d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4267a(p135r.InterfaceC1810d r24) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p135r.C1816j.mo4267a(r.d):void");
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: d */
    public final void mo4268d() {
        C1713d c1713d;
        C1713d c1713d2;
        C1713d c1713d3;
        C1712c c1712c;
        ArrayList arrayList;
        C1713d c1713d4;
        C1713d c1713d5 = this.f8236b;
        boolean z6 = c1713d5.f7776a;
        C1813g c1813g = this.f8239e;
        if (z6) {
            c1813g.mo4284d(c1713d5.m4165l());
        }
        boolean z7 = c1813g.f8226j;
        C1812f c1812f = this.f8243i;
        C1812f c1812f2 = this.f8242h;
        if (!z7) {
            C1713d c1713d6 = this.f8236b;
            int i7 = c1713d6.f7759J[0];
            this.f8238d = i7;
            if (i7 != 3) {
                if (i7 == 4 && (((c1713d4 = c1713d6.f7760K) != null && c1713d4.f7759J[0] == 1) || c1713d4.f7759J[0] == 4)) {
                    int m4165l = (c1713d4.m4165l() - this.f8236b.f7804y.m4149c()) - this.f8236b.f7750A.m4149c();
                    C1816j c1816j = c1713d4.f7782d;
                    AbstractC1819m.m4292b(c1812f2, c1816j.f8242h, this.f8236b.f7804y.m4149c());
                    AbstractC1819m.m4292b(c1812f, c1816j.f8243i, -this.f8236b.f7750A.m4149c());
                    c1813g.mo4284d(m4165l);
                    return;
                }
                if (i7 == 1) {
                    c1813g.mo4284d(c1713d6.m4165l());
                }
            }
        } else if (this.f8238d == 4 && (((c1713d2 = (c1713d = this.f8236b).f7760K) != null && c1713d2.f7759J[0] == 1) || c1713d2.f7759J[0] == 4)) {
            AbstractC1819m.m4292b(c1812f2, c1713d2.f7782d.f8242h, c1713d.f7804y.m4149c());
            AbstractC1819m.m4292b(c1812f, c1713d2.f7782d.f8243i, -this.f8236b.f7750A.m4149c());
            return;
        }
        if (c1813g.f8226j) {
            C1713d c1713d7 = this.f8236b;
            if (c1713d7.f7776a) {
                C1712c[] c1712cArr = c1713d7.f7756G;
                C1712c c1712c2 = c1712cArr[0];
                C1712c c1712c3 = c1712c2.f7737d;
                if (c1712c3 != null && c1712cArr[1].f7737d != null) {
                    if (c1713d7.m4170q()) {
                        c1812f2.f8222f = this.f8236b.f7756G[0].m4149c();
                        c1712c = this.f8236b.f7756G[1];
                        c1812f.f8222f = -c1712c.m4149c();
                        return;
                    }
                    C1812f m4293h = AbstractC1819m.m4293h(this.f8236b.f7756G[0]);
                    if (m4293h != null) {
                        AbstractC1819m.m4292b(c1812f2, m4293h, this.f8236b.f7756G[0].m4149c());
                    }
                    C1812f m4293h2 = AbstractC1819m.m4293h(this.f8236b.f7756G[1]);
                    if (m4293h2 != null) {
                        AbstractC1819m.m4292b(c1812f, m4293h2, -this.f8236b.f7756G[1].m4149c());
                    }
                    c1812f2.f8218b = true;
                    c1812f.f8218b = true;
                    return;
                }
                if (c1712c3 != null) {
                    C1812f m4293h3 = AbstractC1819m.m4293h(c1712c2);
                    if (m4293h3 == null) {
                        return;
                    } else {
                        AbstractC1819m.m4292b(c1812f2, m4293h3, this.f8236b.f7756G[0].m4149c());
                    }
                } else {
                    C1712c c1712c4 = c1712cArr[1];
                    if (c1712c4.f7737d != null) {
                        C1812f m4293h4 = AbstractC1819m.m4293h(c1712c4);
                        if (m4293h4 != null) {
                            AbstractC1819m.m4292b(c1812f, m4293h4, -this.f8236b.f7756G[1].m4149c());
                            AbstractC1819m.m4292b(c1812f2, c1812f, -c1813g.f8223g);
                            return;
                        }
                        return;
                    }
                    if ((c1713d7 instanceof InterfaceC1717h) || c1713d7.f7760K == null || c1713d7.mo4161h(C1712c.a.f7742Y).f7737d != null) {
                        return;
                    }
                    C1713d c1713d8 = this.f8236b;
                    AbstractC1819m.m4292b(c1812f2, c1713d8.f7760K.f7782d.f8242h, c1713d8.m4166m());
                }
                AbstractC1819m.m4292b(c1812f, c1812f2, c1813g.f8223g);
                return;
            }
        }
        if (this.f8238d == 3) {
            C1713d c1713d9 = this.f8236b;
            int i8 = c1713d9.f7789j;
            ArrayList arrayList2 = c1813g.f8227k;
            ArrayList arrayList3 = c1813g.f8228l;
            if (i8 == 2) {
                C1713d c1713d10 = c1713d9.f7760K;
                if (c1713d10 != null) {
                    C1813g c1813g2 = c1713d10.f7784e.f8239e;
                    arrayList3.add(c1813g2);
                    c1813g2.f8227k.add(c1813g);
                    c1813g.f8218b = true;
                    arrayList2.add(c1812f2);
                    arrayList2.add(c1812f);
                }
            } else if (i8 == 3) {
                int i9 = c1713d9.f7790k;
                C1818l c1818l = c1713d9.f7784e;
                if (i9 == 3) {
                    c1812f2.f8217a = this;
                    c1812f.f8217a = this;
                    c1818l.f8242h.f8217a = this;
                    c1818l.f8243i.f8217a = this;
                    c1813g.f8217a = this;
                    if (c1713d9.m4171r()) {
                        arrayList3.add(this.f8236b.f7784e.f8239e);
                        this.f8236b.f7784e.f8239e.f8227k.add(c1813g);
                        C1818l c1818l2 = this.f8236b.f7784e;
                        c1818l2.f8239e.f8217a = this;
                        arrayList3.add(c1818l2.f8242h);
                        arrayList3.add(this.f8236b.f7784e.f8243i);
                        this.f8236b.f7784e.f8242h.f8227k.add(c1813g);
                        arrayList = this.f8236b.f7784e.f8243i.f8227k;
                    } else if (this.f8236b.m4170q()) {
                        this.f8236b.f7784e.f8239e.f8228l.add(c1813g);
                        arrayList2.add(this.f8236b.f7784e.f8239e);
                    } else {
                        arrayList = this.f8236b.f7784e.f8239e.f8228l;
                    }
                } else {
                    C1813g c1813g3 = c1818l.f8239e;
                    arrayList3.add(c1813g3);
                    c1813g3.f8227k.add(c1813g);
                    this.f8236b.f7784e.f8242h.f8227k.add(c1813g);
                    this.f8236b.f7784e.f8243i.f8227k.add(c1813g);
                    c1813g.f8218b = true;
                    arrayList2.add(c1812f2);
                    arrayList2.add(c1812f);
                    c1812f2.f8228l.add(c1813g);
                    arrayList = c1812f.f8228l;
                }
                arrayList.add(c1813g);
            }
        }
        C1713d c1713d11 = this.f8236b;
        C1712c[] c1712cArr2 = c1713d11.f7756G;
        C1712c c1712c5 = c1712cArr2[0];
        C1712c c1712c6 = c1712c5.f7737d;
        if (c1712c6 != null && c1712cArr2[1].f7737d != null) {
            if (c1713d11.m4170q()) {
                c1812f2.f8222f = this.f8236b.f7756G[0].m4149c();
                c1712c = this.f8236b.f7756G[1];
                c1812f.f8222f = -c1712c.m4149c();
                return;
            } else {
                C1812f m4293h5 = AbstractC1819m.m4293h(this.f8236b.f7756G[0]);
                C1812f m4293h6 = AbstractC1819m.m4293h(this.f8236b.f7756G[1]);
                m4293h5.m4282b(this);
                m4293h6.m4282b(this);
                this.f8244j = 4;
                return;
            }
        }
        if (c1712c6 != null) {
            C1812f m4293h7 = AbstractC1819m.m4293h(c1712c5);
            if (m4293h7 == null) {
                return;
            } else {
                AbstractC1819m.m4292b(c1812f2, m4293h7, this.f8236b.f7756G[0].m4149c());
            }
        } else {
            C1712c c1712c7 = c1712cArr2[1];
            if (c1712c7.f7737d != null) {
                C1812f m4293h8 = AbstractC1819m.m4293h(c1712c7);
                if (m4293h8 != null) {
                    AbstractC1819m.m4292b(c1812f, m4293h8, -this.f8236b.f7756G[1].m4149c());
                    m4295c(c1812f2, c1812f, -1, c1813g);
                    return;
                }
                return;
            }
            if ((c1713d11 instanceof InterfaceC1717h) || (c1713d3 = c1713d11.f7760K) == null) {
                return;
            } else {
                AbstractC1819m.m4292b(c1812f2, c1713d3.f7782d.f8242h, c1713d11.m4166m());
            }
        }
        m4295c(c1812f, c1812f2, 1, c1813g);
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: e */
    public final void mo4269e() {
        C1812f c1812f = this.f8242h;
        if (c1812f.f8226j) {
            this.f8236b.f7765P = c1812f.f8223g;
        }
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: f */
    public final void mo4270f() {
        this.f8237c = null;
        this.f8242h.m4283c();
        this.f8243i.m4283c();
        this.f8239e.m4283c();
        this.f8241g = false;
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: k */
    public final boolean mo4272k() {
        return this.f8238d != 3 || this.f8236b.f7789j == 0;
    }

    /* renamed from: n */
    public final void m4288n() {
        this.f8241g = false;
        C1812f c1812f = this.f8242h;
        c1812f.m4283c();
        c1812f.f8226j = false;
        C1812f c1812f2 = this.f8243i;
        c1812f2.m4283c();
        c1812f2.f8226j = false;
        this.f8239e.f8226j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f8236b.f7774Y;
    }
}
