package p127q;

import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p120p.C1683d;
import p120p.C1687h;
import p135r.AbstractC1819m;
import p135r.C1808b;
import p135r.C1809c;
import p135r.C1811e;
import p135r.C1813g;
import p135r.C1816j;
import p135r.C1818l;

/* renamed from: q.e */
/* loaded from: classes.dex */
public final class C1714e extends C1720k {

    /* renamed from: k0 */
    public int f7811k0;

    /* renamed from: l0 */
    public int f7812l0;

    /* renamed from: f0 */
    public final C1808b f7806f0 = new C1808b(this);

    /* renamed from: g0 */
    public final C1811e f7807g0 = new C1811e(this);

    /* renamed from: h0 */
    public C1808b.b f7808h0 = null;

    /* renamed from: i0 */
    public boolean f7809i0 = false;

    /* renamed from: j0 */
    public final C1683d f7810j0 = new C1683d();

    /* renamed from: m0 */
    public int f7813m0 = 0;

    /* renamed from: n0 */
    public int f7814n0 = 0;

    /* renamed from: o0 */
    public C1711b[] f7815o0 = new C1711b[4];

    /* renamed from: p0 */
    public C1711b[] f7816p0 = new C1711b[4];

    /* renamed from: q0 */
    public int f7817q0 = 263;

    /* renamed from: r0 */
    public boolean f7818r0 = false;

    /* renamed from: s0 */
    public boolean f7819s0 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0375 A[EDGE_INSN: B:234:0x0375->B:235:0x0375 BREAK  A[LOOP:1: B:28:0x0079->B:101:0x0368], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0320  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    @Override // p127q.C1720k
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4180B() {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p127q.C1714e.mo4180B():void");
    }

    /* renamed from: C */
    public final void m4181C(C1713d c1713d, int i7) {
        if (i7 == 0) {
            int i8 = this.f7813m0 + 1;
            C1711b[] c1711bArr = this.f7816p0;
            if (i8 >= c1711bArr.length) {
                this.f7816p0 = (C1711b[]) Arrays.copyOf(c1711bArr, c1711bArr.length * 2);
            }
            C1711b[] c1711bArr2 = this.f7816p0;
            int i9 = this.f7813m0;
            c1711bArr2[i9] = new C1711b(c1713d, 0, this.f7809i0);
            this.f7813m0 = i9 + 1;
            return;
        }
        if (i7 == 1) {
            int i10 = this.f7814n0 + 1;
            C1711b[] c1711bArr3 = this.f7815o0;
            if (i10 >= c1711bArr3.length) {
                this.f7815o0 = (C1711b[]) Arrays.copyOf(c1711bArr3, c1711bArr3.length * 2);
            }
            C1711b[] c1711bArr4 = this.f7815o0;
            int i11 = this.f7814n0;
            c1711bArr4[i11] = new C1711b(c1713d, 1, this.f7809i0);
            this.f7814n0 = i11 + 1;
        }
    }

    /* renamed from: D */
    public final void m4182D(C1683d c1683d) {
        mo4145b(c1683d);
        int size = this.f7881e0.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C1713d c1713d = this.f7881e0.get(i7);
            boolean[] zArr = c1713d.f7758I;
            zArr[0] = false;
            zArr[1] = false;
            if (c1713d instanceof C1710a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i8 = 0; i8 < size; i8++) {
                C1713d c1713d2 = this.f7881e0.get(i8);
                if (c1713d2 instanceof C1710a) {
                    C1710a c1710a = (C1710a) c1713d2;
                    for (int i9 = 0; i9 < c1710a.f7869f0; i9++) {
                        C1713d c1713d3 = c1710a.f7868e0[i9];
                        int i10 = c1710a.f7714g0;
                        if (i10 == 0 || i10 == 1) {
                            c1713d3.f7758I[0] = true;
                        } else if (i10 == 2 || i10 == 3) {
                            c1713d3.f7758I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            C1713d c1713d4 = this.f7881e0.get(i11);
            c1713d4.getClass();
            if ((c1713d4 instanceof C1719j) || (c1713d4 instanceof C1716g)) {
                c1713d4.mo4145b(c1683d);
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            C1713d c1713d5 = this.f7881e0.get(i12);
            if (c1713d5 instanceof C1714e) {
                int[] iArr = c1713d5.f7759J;
                int i13 = iArr[0];
                int i14 = iArr[1];
                if (i13 == 2) {
                    c1713d5.m4176w(1);
                }
                if (i14 == 2) {
                    c1713d5.m4177x(1);
                }
                c1713d5.mo4145b(c1683d);
                if (i13 == 2) {
                    c1713d5.m4176w(i13);
                }
                if (i14 == 2) {
                    c1713d5.m4177x(i14);
                }
            } else {
                c1713d5.f7787h = -1;
                c1713d5.f7788i = -1;
                int[] iArr2 = this.f7759J;
                int i15 = iArr2[0];
                int[] iArr3 = c1713d5.f7759J;
                if (i15 != 2 && iArr3[0] == 4) {
                    C1712c c1712c = c1713d5.f7804y;
                    int i16 = c1712c.f7738e;
                    int m4165l = m4165l();
                    C1712c c1712c2 = c1713d5.f7750A;
                    int i17 = m4165l - c1712c2.f7738e;
                    c1712c.f7740g = c1683d.m4097k(c1712c);
                    c1712c2.f7740g = c1683d.m4097k(c1712c2);
                    c1683d.m4090d(c1712c.f7740g, i16);
                    c1683d.m4090d(c1712c2.f7740g, i17);
                    c1713d5.f7787h = 2;
                    c1713d5.f7765P = i16;
                    int i18 = i17 - i16;
                    c1713d5.f7761L = i18;
                    int i19 = c1713d5.f7768S;
                    if (i18 < i19) {
                        c1713d5.f7761L = i19;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C1712c c1712c3 = c1713d5.f7805z;
                    int i20 = c1712c3.f7738e;
                    int m4163j = m4163j();
                    C1712c c1712c4 = c1713d5.f7751B;
                    int i21 = m4163j - c1712c4.f7738e;
                    c1712c3.f7740g = c1683d.m4097k(c1712c3);
                    c1712c4.f7740g = c1683d.m4097k(c1712c4);
                    c1683d.m4090d(c1712c3.f7740g, i20);
                    c1683d.m4090d(c1712c4.f7740g, i21);
                    if (c1713d5.f7767R > 0 || c1713d5.f7773X == 8) {
                        C1712c c1712c5 = c1713d5.f7752C;
                        C1687h m4097k = c1683d.m4097k(c1712c5);
                        c1712c5.f7740g = m4097k;
                        c1683d.m4090d(m4097k, c1713d5.f7767R + i20);
                    }
                    c1713d5.f7788i = 2;
                    c1713d5.f7766Q = i20;
                    int i22 = i21 - i20;
                    c1713d5.f7762M = i22;
                    int i23 = c1713d5.f7769T;
                    if (i22 < i23) {
                        c1713d5.f7762M = i23;
                    }
                }
                if (!((c1713d5 instanceof C1719j) || (c1713d5 instanceof C1716g))) {
                    c1713d5.mo4145b(c1683d);
                }
            }
        }
        if (this.f7813m0 > 0) {
            C0143v.m450m(this, c1683d, 0);
        }
        if (this.f7814n0 > 0) {
            C0143v.m450m(this, c1683d, 1);
        }
    }

    /* renamed from: E */
    public final boolean m4183E(int i7, boolean z6) {
        boolean z7;
        boolean z8;
        C1813g c1813g;
        int m4163j;
        boolean z9 = z6 & true;
        C1811e c1811e = this.f7807g0;
        C1714e c1714e = c1811e.f8209a;
        int m4162i = c1714e.m4162i(0);
        int m4162i2 = c1714e.m4162i(1);
        int m4166m = c1714e.m4166m();
        int m4167n = c1714e.m4167n();
        ArrayList<AbstractC1819m> arrayList = c1811e.f8213e;
        C1816j c1816j = c1714e.f7782d;
        C1818l c1818l = c1714e.f7784e;
        if (z9 && (m4162i == 2 || m4162i2 == 2)) {
            Iterator<AbstractC1819m> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1819m next = it.next();
                if (next.f8240f == i7 && !next.mo4272k()) {
                    z9 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z9 && m4162i == 2) {
                    c1714e.m4176w(1);
                    c1714e.m4178y(c1811e.m4278d(c1714e, 0));
                    c1813g = c1816j.f8239e;
                    m4163j = c1714e.m4165l();
                    c1813g.mo4284d(m4163j);
                }
            } else if (z9 && m4162i2 == 2) {
                c1714e.m4177x(1);
                c1714e.m4175v(c1811e.m4278d(c1714e, 1));
                c1813g = c1818l.f8239e;
                m4163j = c1714e.m4163j();
                c1813g.mo4284d(m4163j);
            }
        }
        int[] iArr = c1714e.f7759J;
        if (i7 == 0) {
            int i8 = iArr[0];
            if (i8 == 1 || i8 == 4) {
                int m4165l = c1714e.m4165l() + m4166m;
                c1816j.f8243i.mo4284d(m4165l);
                c1816j.f8239e.mo4284d(m4165l - m4166m);
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            int i9 = iArr[1];
            if (i9 == 1 || i9 == 4) {
                int m4163j2 = c1714e.m4163j() + m4167n;
                c1818l.f8243i.mo4284d(m4163j2);
                c1818l.f8239e.mo4284d(m4163j2 - m4167n);
                z7 = true;
            }
            z7 = false;
        }
        c1811e.m4281g();
        Iterator<AbstractC1819m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1819m next2 = it2.next();
            if (next2.f8240f == i7 && (next2.f8236b != c1714e || next2.f8241g)) {
                next2.mo4269e();
            }
        }
        Iterator<AbstractC1819m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC1819m next3 = it3.next();
            if (next3.f8240f == i7 && (z7 || next3.f8236b != c1714e)) {
                if (!next3.f8242h.f8226j || !next3.f8243i.f8226j || (!(next3 instanceof C1809c) && !next3.f8239e.f8226j)) {
                    z8 = false;
                    break;
                }
            }
        }
        z8 = true;
        c1714e.m4176w(m4162i);
        c1714e.m4177x(m4162i2);
        return z8;
    }

    @Override // p127q.C1720k, p127q.C1713d
    /* renamed from: s */
    public final void mo4172s() {
        this.f7810j0.m4103r();
        this.f7811k0 = 0;
        this.f7812l0 = 0;
        super.mo4172s();
    }

    @Override // p127q.C1713d
    /* renamed from: z */
    public final void mo4179z(boolean z6, boolean z7) {
        super.mo4179z(z6, z7);
        int size = this.f7881e0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f7881e0.get(i7).mo4179z(z6, z7);
        }
    }
}
