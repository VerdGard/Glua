package p165u6;

import p180w6.C2140i;

/* renamed from: u6.t */
/* loaded from: classes.dex */
public final class C2002t extends AbstractC2003u {

    /* renamed from: c2 */
    public final char[] f9093c2;

    /* renamed from: d2 */
    public final int f9094d2 = 0;

    /* renamed from: e2 */
    public final int f9095e2;

    /* renamed from: f2 */
    public int f9096f2;

    /* renamed from: g2 */
    public boolean f9097g2;

    /* renamed from: h2 */
    public String f9098h2;

    public C2002t(char[] cArr, int i7) {
        this.f9093c2 = cArr;
        this.f9095e2 = i7;
    }

    /* renamed from: F2 */
    public static C1998p m4854F2(char[] cArr, int i7, int i8) {
        char[] cArr2 = new char[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            cArr2[i9] = cArr[i9 + i7];
        }
        int i10 = i8;
        int i11 = i10;
        while (true) {
            i10--;
            if (i10 < 0) {
                byte[] bArr = new byte[i11];
                C1998p.m4812D2(cArr2, i8, bArr, 0);
                return C1998p.m4817O2(bArr, 0, i11);
            }
            char c7 = cArr2[i10];
            if (c7 >= 128) {
                i11 += c7 >= 2048 ? 2 : 1;
            }
        }
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: A0 */
    public final AbstractC2003u mo4805A0(AbstractC2003u abstractC2003u) {
        abstractC2003u.getClass();
        return m4869D0(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: B0 */
    public final AbstractC2003u mo4806B0(AbstractC1997o abstractC1997o) {
        return abstractC1997o.mo4735i2().m4869D0(this);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: C1 */
    public final int mo4699C1(int i7) {
        return mo4740m0();
    }

    /* renamed from: C2 */
    public final double m4855C2() {
        double m4857E2 = m4857E2();
        if (Double.isNaN(m4857E2)) {
            throw new C1991i("attempt to perform arithmetic on string");
        }
        return m4857E2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: D1 */
    public final String mo4700D1(String str) {
        return mo4645M();
    }

    /* renamed from: D2 */
    public final double m4856D2(int i7, int i8, int i9) {
        char[] cArr = this.f9093c2;
        boolean z6 = cArr[i8] == '-';
        if (z6) {
            i8++;
        }
        long j7 = 0;
        while (i8 < i9) {
            char c7 = cArr[i8];
            char c8 = '0';
            if (i7 > 10 && (c7 < '0' || c7 > '9')) {
                c8 = (c7 < 'A' || c7 > 'Z') ? 'W' : '7';
            }
            int i10 = c7 - c8;
            if (i10 < 0 || i10 >= i7) {
                return Double.NaN;
            }
            j7 = (j7 * i7) + i10;
            if (j7 < 0) {
                return Double.NaN;
            }
            i8++;
        }
        return z6 ? -j7 : j7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: E0 */
    public final AbstractC2003u mo4701E0(AbstractC2003u abstractC2003u) {
        double m4857E2 = m4857E2();
        return Double.isNaN(m4857E2) ? m4872T(AbstractC2003u.f9105G1, abstractC2003u) : abstractC2003u.mo4703F0(m4857E2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: E1 */
    public final C1998p mo4702E1() {
        return m4854F2(this.f9093c2, this.f9094d2, this.f9095e2);
    }

    /* renamed from: E2 */
    public final double m4857E2() {
        char[] cArr;
        int i7;
        char c7;
        int i8 = this.f9095e2;
        int i9 = this.f9094d2;
        int i10 = i8 + i9;
        while (true) {
            cArr = this.f9093c2;
            if (i9 >= i10 || cArr[i9] != ' ') {
                break;
            }
            i9++;
        }
        while (i9 < i10 && cArr[i10 - 1] == ' ') {
            i10--;
        }
        double d7 = Double.NaN;
        if (i9 >= i10) {
            return Double.NaN;
        }
        if (cArr[i9] == '0' && (i7 = i9 + 1) < i10 && ((c7 = cArr[i7]) == 'x' || c7 == 'X')) {
            return m4856D2(16, i9 + 2, i10);
        }
        double m4856D2 = m4856D2(10, i9, i10);
        if (!Double.isNaN(m4856D2)) {
            return m4856D2;
        }
        int i11 = i9 + 64;
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = i9;
        while (true) {
            if (i12 >= i10) {
                char[] cArr2 = new char[i10 - i9];
                for (int i13 = i9; i13 < i10; i13++) {
                    cArr2[i13 - i9] = cArr[i13];
                }
                try {
                    d7 = Double.parseDouble(new String(cArr2));
                } catch (Exception unused) {
                }
            } else {
                char c8 = cArr[i12];
                if (c8 != '+' && c8 != 'E' && c8 != 'e' && c8 != '-' && c8 != '.') {
                    switch (c8) {
                    }
                }
                i12++;
            }
        }
        return d7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: F0 */
    public final AbstractC2003u mo4703F0(double d7) {
        return C1990h.m4696C2(d7, m4855C2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: G0 */
    public final boolean mo4704G0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4674Q1(this);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: I1 */
    public final AbstractC2003u mo4705I1(AbstractC2003u abstractC2003u) {
        double m4857E2 = m4857E2();
        return Double.isNaN(m4857E2) ? m4872T(AbstractC2003u.f9107I1, abstractC2003u) : abstractC2003u.mo4706J1(m4857E2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: J1 */
    public final AbstractC2003u mo4706J1(double d7) {
        return C2140i.m5234I2(d7, m4855C2());
    }

    @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        if (this.f9098h2 == null) {
            this.f9098h2 = new String(this.f9093c2, this.f9094d2, this.f9095e2);
        }
        return this.f9098h2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M0 */
    public final AbstractC2003u mo4681M0() {
        return null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: O */
    public final AbstractC2003u mo4710O(double d7) {
        return C1990h.m4698E2(m4855C2() + d7);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: O0 */
    public final boolean mo4711O0(double d7) {
        m4883v2("attempt to compare string with number");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q */
    public final AbstractC2003u mo4713Q(AbstractC2003u abstractC2003u) {
        double m4857E2 = m4857E2();
        return Double.isNaN(m4857E2) ? m4872T(AbstractC2003u.f9103E1, abstractC2003u) : abstractC2003u.mo4710O(m4857E2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q0 */
    public final boolean mo4714Q0(double d7) {
        m4883v2("attempt to compare string with number");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q1 */
    public final boolean mo4674Q1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4674Q1(this);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: S0 */
    public final boolean mo4716S0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4809f1() ? abstractC2003u.mo4826g2(this) <= 0 : super.mo4716S0(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: S1 */
    public final int mo4784S1() {
        return this.f9095e2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Z0 */
    public final boolean mo4724Z0() {
        double m4857E2 = m4857E2();
        return !Double.isNaN(m4857E2) && ((double) ((int) m4857E2)) == m4857E2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: c1 */
    public final boolean mo4729c1() {
        double m4857E2 = m4857E2();
        return !Double.isNaN(m4857E2) && ((double) ((long) m4857E2)) == m4857E2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: e1 */
    public final boolean mo4808e1() {
        return !Double.isNaN(m4857E2());
    }

    @Override // p165u6.AbstractC2003u
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2002t)) {
            return false;
        }
        C2002t c2002t = (C2002t) obj;
        if (this != c2002t) {
            int i7 = c2002t.f9095e2;
            int i8 = this.f9095e2;
            if (i7 != i8) {
                return false;
            }
            int i9 = this.f9094d2;
            char[] cArr = this.f9093c2;
            int i10 = c2002t.f9094d2;
            char[] cArr2 = c2002t.f9093c2;
            if (cArr2 != cArr || i10 != i9) {
                if (c2002t.hashCode() != hashCode()) {
                    return false;
                }
                for (int i11 = 0; i11 < i8; i11++) {
                    if (cArr2[i10 + i11] != cArr[i9 + i11]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: f1 */
    public final boolean mo4809f1() {
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: g2 */
    public final int mo4826g2(AbstractC2003u abstractC2003u) {
        return -abstractC2003u.mo4826g2(this);
    }

    public final int hashCode() {
        if (this.f9097g2) {
            return this.f9096f2;
        }
        int i7 = this.f9095e2;
        int i8 = (i7 >> 5) + 1;
        int i9 = i7;
        while (i7 >= i8) {
            i9 ^= ((i9 << 5) + (i9 >> 2)) + (this.f9093c2[(this.f9094d2 + i7) - 1] & 255);
            i7 -= i8;
        }
        this.f9096f2 = i9;
        this.f9097g2 = true;
        return i9;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: i2 */
    public final C1998p mo4735i2() {
        return m4854F2(this.f9093c2, this.f9094d2, this.f9095e2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j0 */
    public final double mo4736j0() {
        double m4857E2 = m4857E2();
        if (!Double.isNaN(m4857E2)) {
            return m4857E2;
        }
        m4871S("number");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j1 */
    public final AbstractC2003u mo4793j1() {
        return C1993k.m4765C2(this.f9095e2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j2 */
    public final AbstractC2003u mo4737j2(AbstractC2003u abstractC2003u) {
        double m4857E2 = m4857E2();
        return Double.isNaN(m4857E2) ? m4872T(AbstractC2003u.f9104F1, abstractC2003u) : abstractC2003u.mo4738k2(m4857E2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: k1 */
    public final int mo4794k1() {
        return this.f9095e2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: k2 */
    public final AbstractC2003u mo4738k2(double d7) {
        return C1990h.m4698E2(d7 - m4855C2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: l1 */
    public final boolean mo4739l1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4809f1() ? abstractC2003u.mo4826g2(this) > 0 : super.mo4739l1(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: m0 */
    public final int mo4740m0() {
        return (int) mo4736j0();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: m1 */
    public final boolean mo4741m1(double d7) {
        m4883v2("attempt to compare string with number");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n0 */
    public final String mo4742n0() {
        return mo4645M();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n2 */
    public final double mo4744n2() {
        double m4857E2 = m4857E2();
        if (Double.isNaN(m4857E2)) {
            return 0.0d;
        }
        return m4857E2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o0 */
    public final long mo4745o0() {
        return (long) mo4736j0();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o1 */
    public final boolean mo4746o1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4809f1() ? abstractC2003u.mo4826g2(this) >= 0 : super.mo4746o1(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o2 */
    public final int mo4747o2() {
        return (int) mo4744n2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: p2 */
    public final long mo4748p2() {
        return (long) mo4744n2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: q0 */
    public final AbstractC1997o mo4749q0() {
        return C1990h.m4698E2(mo4736j0());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: q2 */
    public final AbstractC2003u mo4750q2() {
        double m4857E2 = m4857E2();
        return Double.isNaN(m4857E2) ? AbstractC2003u.f9130m : C1990h.m4698E2(m4857E2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r0 */
    public final AbstractC1997o mo4810r0(String str) {
        double m4857E2 = m4857E2();
        if (!Double.isNaN(m4857E2)) {
            return C1990h.m4698E2(m4857E2);
        }
        AbstractC2003u.m4861I0(str);
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r1 */
    public final AbstractC2003u mo4751r1(AbstractC2003u abstractC2003u) {
        double m4857E2 = m4857E2();
        return Double.isNaN(m4857E2) ? m4872T(AbstractC2003u.f9108J1, abstractC2003u) : abstractC2003u.mo4754s1(m4857E2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r2 */
    public final AbstractC2003u mo4752r2() {
        return m4854F2(this.f9093c2, this.f9094d2, this.f9095e2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: s0 */
    public final C1998p mo4753s0() {
        return m4854F2(this.f9093c2, this.f9094d2, this.f9095e2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: s1 */
    public final AbstractC2003u mo4754s1(double d7) {
        return C1990h.m4697D2(d7, m4855C2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t1 */
    public final AbstractC2003u mo4755t1(double d7) {
        return C1990h.m4698E2(m4855C2() * d7);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t2 */
    public final int mo4675t2() {
        return 4;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u2 */
    public final String mo4676u2() {
        return "string";
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: v1 */
    public final AbstractC2003u mo4757v1(AbstractC2003u abstractC2003u) {
        double m4857E2 = m4857E2();
        return Double.isNaN(m4857E2) ? m4872T(AbstractC2003u.f9106H1, abstractC2003u) : abstractC2003u.mo4755t1(m4857E2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: w1 */
    public final AbstractC2003u mo4758w1() {
        double m4857E2 = m4857E2();
        return Double.isNaN(m4857E2) ? super.mo4758w1() : C1990h.m4698E2(-m4857E2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: z0 */
    public final C1979a mo4811z0(C1979a c1979a) {
        AbstractC2003u abstractC2003u = c1979a.f8941d;
        if (abstractC2003u == null) {
            abstractC2003u = c1979a.m4619f();
        }
        AbstractC2003u mo4805A0 = mo4805A0(abstractC2003u);
        c1979a.f8938a = C1979a.f8937e;
        c1979a.f8939b = 0;
        c1979a.f8940c = 0;
        c1979a.f8941d = mo4805A0;
        return c1979a;
    }
}
