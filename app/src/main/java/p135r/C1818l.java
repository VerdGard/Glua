package p135r;

import java.util.ArrayList;
import p120p.C1686g;
import p127q.C1713d;

/* renamed from: r.l */
/* loaded from: classes.dex */
public final class C1818l extends AbstractC1819m {

    /* renamed from: k */
    public final C1812f f8233k;

    /* renamed from: l */
    public C1807a f8234l;

    public C1818l(C1713d c1713d) {
        super(c1713d);
        C1812f c1812f = new C1812f(this);
        this.f8233k = c1812f;
        this.f8234l = null;
        this.f8242h.f8221e = 6;
        this.f8243i.f8221e = 7;
        c1812f.f8221e = 8;
        this.f8240f = 1;
    }

    @Override // p135r.AbstractC1819m, p135r.InterfaceC1810d
    /* renamed from: a */
    public final void mo4267a(InterfaceC1810d interfaceC1810d) {
        float f7;
        int i7;
        if (C1686g.m4108c(this.f8244j) == 3) {
            C1713d c1713d = this.f8236b;
            m4297l(c1713d.f7805z, c1713d.f7751B, 1);
            return;
        }
        C1813g c1813g = this.f8239e;
        if (c1813g.f8219c && !c1813g.f8226j && this.f8238d == 3) {
            C1713d c1713d2 = this.f8236b;
            int i8 = c1713d2.f7790k;
            if (i8 == 2) {
                C1713d c1713d3 = c1713d2.f7760K;
                if (c1713d3 != null) {
                    if (c1713d3.f7784e.f8239e.f8226j) {
                        f7 = r5.f8223g * c1713d2.f7797r;
                        i7 = (int) (f7 + 0.5f);
                    }
                }
            } else if (i8 == 3) {
                if (c1713d2.f7782d.f8239e.f8226j) {
                    int i9 = c1713d2.f7764O;
                    if (i9 != -1) {
                        if (i9 == 0) {
                            f7 = r5.f8223g * c1713d2.f7763N;
                            i7 = (int) (f7 + 0.5f);
                        } else if (i9 != 1) {
                            i7 = 0;
                        }
                    }
                    f7 = r5.f8223g / c1713d2.f7763N;
                    i7 = (int) (f7 + 0.5f);
                }
            }
            c1813g.mo4284d(i7);
        }
        C1812f c1812f = this.f8242h;
        if (c1812f.f8219c) {
            C1812f c1812f2 = this.f8243i;
            if (c1812f2.f8219c) {
                if (c1812f.f8226j && c1812f2.f8226j && c1813g.f8226j) {
                    return;
                }
                boolean z6 = c1813g.f8226j;
                ArrayList arrayList = c1812f.f8228l;
                ArrayList arrayList2 = c1812f2.f8228l;
                if (!z6 && this.f8238d == 3) {
                    C1713d c1713d4 = this.f8236b;
                    if (c1713d4.f7789j == 0 && !c1713d4.m4171r()) {
                        C1812f c1812f3 = (C1812f) arrayList.get(0);
                        C1812f c1812f4 = (C1812f) arrayList2.get(0);
                        int i10 = c1812f3.f8223g + c1812f.f8222f;
                        int i11 = c1812f4.f8223g + c1812f2.f8222f;
                        c1812f.mo4284d(i10);
                        c1812f2.mo4284d(i11);
                        c1813g.mo4284d(i11 - i10);
                        return;
                    }
                }
                if (!c1813g.f8226j && this.f8238d == 3 && this.f8235a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1812f c1812f5 = (C1812f) arrayList.get(0);
                    int i12 = (((C1812f) arrayList2.get(0)).f8223g + c1812f2.f8222f) - (c1812f5.f8223g + c1812f.f8222f);
                    int i13 = c1813g.f8229m;
                    if (i12 < i13) {
                        c1813g.mo4284d(i12);
                    } else {
                        c1813g.mo4284d(i13);
                    }
                }
                if (c1813g.f8226j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1812f c1812f6 = (C1812f) arrayList.get(0);
                    C1812f c1812f7 = (C1812f) arrayList2.get(0);
                    int i14 = c1812f6.f8223g;
                    int i15 = c1812f.f8222f + i14;
                    int i16 = c1812f7.f8223g;
                    int i17 = c1812f2.f8222f + i16;
                    float f8 = this.f8236b.f7771V;
                    if (c1812f6 == c1812f7) {
                        f8 = 0.5f;
                    } else {
                        i14 = i15;
                        i16 = i17;
                    }
                    c1812f.mo4284d((int) ((((i16 - i14) - c1813g.f8223g) * f8) + i14 + 0.5f));
                    c1812f2.mo4284d(c1812f.f8223g + c1813g.f8223g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02b2, code lost:
    
        m4295c(r7, r3, 1, r15.f8234l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028a, code lost:
    
        if (r0.f8238d == 3) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0303, code lost:
    
        r0.f8239e.f8227k.add(r2);
        r10.add(r15.f8236b.f7782d.f8239e);
        r2.f8217a = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b0, code lost:
    
        if (r15.f8236b.f7802w != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0301, code lost:
    
        if (r0.f8238d == 3) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0253, code lost:
    
        if (r15.f8236b.f7802w != false) goto L129;
     */
    @Override // p135r.AbstractC1819m
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4268d() {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p135r.C1818l.mo4268d():void");
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: e */
    public final void mo4269e() {
        C1812f c1812f = this.f8242h;
        if (c1812f.f8226j) {
            this.f8236b.f7766Q = c1812f.f8223g;
        }
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: f */
    public final void mo4270f() {
        this.f8237c = null;
        this.f8242h.m4283c();
        this.f8243i.m4283c();
        this.f8233k.m4283c();
        this.f8239e.m4283c();
        this.f8241g = false;
    }

    @Override // p135r.AbstractC1819m
    /* renamed from: k */
    public final boolean mo4272k() {
        return this.f8238d != 3 || this.f8236b.f7790k == 0;
    }

    /* renamed from: m */
    public final void m4291m() {
        this.f8241g = false;
        C1812f c1812f = this.f8242h;
        c1812f.m4283c();
        c1812f.f8226j = false;
        C1812f c1812f2 = this.f8243i;
        c1812f2.m4283c();
        c1812f2.f8226j = false;
        C1812f c1812f3 = this.f8233k;
        c1812f3.m4283c();
        c1812f3.f8226j = false;
        this.f8239e.f8226j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f8236b.f7774Y;
    }
}
