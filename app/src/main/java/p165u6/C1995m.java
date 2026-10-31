package p165u6;

import android.ext.Tools;

/* renamed from: u6.m */
/* loaded from: classes.dex */
public final class C1995m extends AbstractC1997o {

    /* renamed from: e2 */
    public static final C1995m f9029e2 = new C1995m(Long.MAX_VALUE);

    /* renamed from: f2 */
    public static final C1995m f9030f2 = new C1995m(Long.MIN_VALUE);

    /* renamed from: g2 */
    public static final C1995m[] f9031g2 = new C1995m[Tools.Semaphore.f161S9];

    /* renamed from: h2 */
    public static final C1998p[] f9032h2 = new C1998p[Tools.Semaphore.f161S9];

    /* renamed from: i2 */
    public static final String[] f9033i2 = new String[Tools.Semaphore.f161S9];

    /* renamed from: d2 */
    public final long f9034d2;

    public C1995m(long j7) {
        this.f9034d2 = j7;
    }

    /* renamed from: E2 */
    public static AbstractC2003u m4797E2(long j7, long j8) {
        C1993k c1993k = AbstractC2003u.f9126Z;
        if (j8 >= 0) {
            return j8 > 63 ? c1993k : m4798F2(j7 << ((int) j8));
        }
        long j9 = -j8;
        return j9 < 0 ? m4797E2(j7, -j9) : j9 > 63 ? c1993k : m4798F2(j7 >>> ((int) j9));
    }

    /* renamed from: F2 */
    public static C1995m m4798F2(long j7) {
        C1995m c1995m;
        if (j7 > 255 || j7 < -256) {
            if (j7 == Long.MAX_VALUE) {
                c1995m = f9029e2;
            } else {
                if (j7 != Long.MIN_VALUE) {
                    return new C1995m(j7);
                }
                c1995m = f9030f2;
            }
            return c1995m;
        }
        int i7 = (int) (256 + j7);
        C1995m[] c1995mArr = f9031g2;
        C1995m c1995m2 = c1995mArr[i7];
        if (c1995m2 != null) {
            return c1995m2;
        }
        C1995m c1995m3 = new C1995m(j7);
        c1995mArr[i7] = c1995m3;
        return c1995m3;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: C1 */
    public final int mo4699C1(int i7) {
        return (int) this.f9034d2;
    }

    /* renamed from: C2 */
    public final C1998p m4799C2() {
        long j7 = this.f9034d2;
        if (j7 > 255 || j7 < -256) {
            return C1998p.m4815M2(m4800D2());
        }
        C1998p[] c1998pArr = f9032h2;
        C1998p c1998p = c1998pArr[(int) (j7 + 256)];
        if (c1998p != null) {
            return c1998p;
        }
        C1998p m4815M2 = C1998p.m4815M2(m4800D2());
        c1998pArr[(int) (j7 + 256)] = m4815M2;
        return m4815M2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: D1 */
    public final String mo4700D1(String str) {
        return m4800D2();
    }

    /* renamed from: D2 */
    public final String m4800D2() {
        long j7 = this.f9034d2;
        if (j7 > 255 || j7 < -256) {
            return Long.toString(j7);
        }
        String[] strArr = f9033i2;
        String str = strArr[(int) (j7 + 256)];
        if (str != null) {
            return str;
        }
        String l7 = Long.toString(j7);
        strArr[(int) (256 + j7)] = l7;
        return l7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: E0 */
    public final AbstractC2003u mo4701E0(AbstractC2003u abstractC2003u) {
        if (!abstractC2003u.mo4808e1()) {
            return super.mo4701E0(abstractC2003u);
        }
        boolean z6 = abstractC2003u instanceof C1995m;
        long j7 = this.f9034d2;
        return (!z6 || abstractC2003u.mo4748p2() == 0) ? C1990h.m4696C2(j7, abstractC2003u.mo4744n2()) : m4798F2(j7 / abstractC2003u.mo4748p2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: E1 */
    public final C1998p mo4702E1() {
        return m4799C2();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0021 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023 A[ORIG_RETURN, RETURN] */
    @Override // p165u6.AbstractC2003u
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo4704G0(p165u6.AbstractC2003u r6) {
        /*
            r5 = this;
            boolean r0 = r6.mo4808e1()
            if (r0 != 0) goto L9
            if (r5 != r6) goto L21
            goto L23
        L9:
            boolean r0 = r6 instanceof p165u6.C1995m
            long r1 = r5.f9034d2
            if (r0 == 0) goto L18
            long r3 = r6.mo4748p2()
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L23
            goto L21
        L18:
            double r0 = (double) r1
            double r2 = r6.mo4744n2()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L23
        L21:
            r6 = 0
            goto L24
        L23:
            r6 = 1
        L24:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p165u6.C1995m.mo4704G0(u6.u):boolean");
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: I1 */
    public final AbstractC2003u mo4705I1(AbstractC2003u abstractC2003u) {
        return !abstractC2003u.mo4808e1() ? super.mo4705I1(abstractC2003u) : C1990h.m4698E2(Math.pow(this.f9034d2, abstractC2003u.mo4744n2()));
    }

    @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        return m4800D2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q */
    public final AbstractC2003u mo4713Q(AbstractC2003u abstractC2003u) {
        if (!abstractC2003u.mo4808e1()) {
            return super.mo4713Q(abstractC2003u);
        }
        boolean z6 = abstractC2003u instanceof C1995m;
        long j7 = this.f9034d2;
        if (z6) {
            return m4798F2(abstractC2003u.mo4748p2() + j7);
        }
        return C1990h.m4698E2(abstractC2003u.mo4744n2() + j7);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q1 */
    public final boolean mo4674Q1(AbstractC2003u abstractC2003u) {
        if (abstractC2003u.mo4808e1()) {
            boolean z6 = abstractC2003u instanceof C1995m;
            long j7 = this.f9034d2;
            if (!z6 ? j7 == abstractC2003u.mo4744n2() : j7 == abstractC2003u.mo4748p2()) {
                return true;
            }
        }
        return false;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: S0 */
    public final boolean mo4716S0(AbstractC2003u abstractC2003u) {
        if (!(abstractC2003u instanceof AbstractC1997o)) {
            return super.mo4716S0(abstractC2003u);
        }
        abstractC2003u.getClass();
        boolean z6 = abstractC2003u instanceof C1995m;
        long j7 = this.f9034d2;
        return !z6 ? ((double) j7) < abstractC2003u.mo4744n2() : j7 < abstractC2003u.mo4748p2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: U0 */
    public final AbstractC2003u mo4718U0(AbstractC2003u abstractC2003u) {
        if (!abstractC2003u.mo4808e1()) {
            return super.mo4718U0(abstractC2003u);
        }
        boolean mo4729c1 = abstractC2003u.mo4729c1();
        long j7 = this.f9034d2;
        if (!mo4729c1) {
            double d7 = j7;
            double mo4744n2 = abstractC2003u.mo4744n2();
            if (mo4744n2 == 0.0d) {
                return d7 > 0.0d ? C1990h.f9012f2 : d7 == 0.0d ? C1990h.f9011e2 : C1990h.f9013g2;
            }
            C1990h c1990h = C1990h.f9011e2;
            return C1990h.m4698E2(Math.floor(d7 / mo4744n2));
        }
        long mo4748p2 = abstractC2003u.mo4748p2();
        if (mo4748p2 != 0) {
            long j8 = j7 / mo4748p2;
            if ((j7 ^ mo4748p2) < 0 && mo4748p2 * j8 != j7) {
                j8--;
            }
            return m4798F2(j8);
        }
        throw new C1991i("attempt to divide by zero (as '" + j7 + " // " + mo4748p2 + "')");
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: W */
    public final AbstractC2003u mo4720W(AbstractC2003u abstractC2003u) {
        abstractC2003u.getClass();
        return !(abstractC2003u instanceof C1995m) ? super.mo4720W(abstractC2003u) : m4798F2(this.f9034d2 & abstractC2003u.mo4748p2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: X */
    public final AbstractC2003u mo4721X() {
        return m4798F2(~this.f9034d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Z */
    public final AbstractC2003u mo4723Z(AbstractC2003u abstractC2003u) {
        abstractC2003u.getClass();
        return !(abstractC2003u instanceof C1995m) ? super.mo4723Z(abstractC2003u) : m4798F2(this.f9034d2 | abstractC2003u.mo4748p2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Z0 */
    public final boolean mo4724Z0() {
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: a1 */
    public final boolean mo4801a1() {
        long j7 = this.f9034d2;
        return ((long) ((int) j7)) == j7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: b1 */
    public final boolean mo4726b1() {
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: c0 */
    public final AbstractC2003u mo4728c0(AbstractC2003u abstractC2003u) {
        abstractC2003u.getClass();
        return !(abstractC2003u instanceof C1995m) ? super.mo4728c0(abstractC2003u) : m4798F2(this.f9034d2 ^ abstractC2003u.mo4748p2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: c1 */
    public final boolean mo4729c1() {
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: c2 */
    public final AbstractC2003u mo4730c2(AbstractC2003u abstractC2003u) {
        abstractC2003u.getClass();
        return !(abstractC2003u instanceof C1995m) ? super.mo4730c2(abstractC2003u) : m4797E2(this.f9034d2, abstractC2003u.mo4748p2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: e2 */
    public final AbstractC2003u mo4732e2(AbstractC2003u abstractC2003u) {
        abstractC2003u.getClass();
        if (!(abstractC2003u instanceof C1995m)) {
            return super.mo4732e2(abstractC2003u);
        }
        long mo4748p2 = abstractC2003u.mo4748p2();
        long j7 = this.f9034d2;
        return mo4748p2 < 0 ? m4797E2(j7, -mo4748p2) : mo4748p2 > 63 ? AbstractC2003u.f9126Z : m4798F2(j7 >>> ((int) mo4748p2));
    }

    @Override // p165u6.AbstractC2003u
    public final boolean equals(Object obj) {
        return (obj instanceof C1995m) && ((C1995m) obj).f9034d2 == this.f9034d2;
    }

    public final int hashCode() {
        long j7 = this.f9034d2;
        return (int) (j7 ^ (j7 >>> 32));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: i2 */
    public final C1998p mo4735i2() {
        return m4799C2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j0 */
    public final double mo4736j0() {
        return this.f9034d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j2 */
    public final AbstractC2003u mo4737j2(AbstractC2003u abstractC2003u) {
        if (!abstractC2003u.mo4808e1()) {
            return super.mo4737j2(abstractC2003u);
        }
        boolean z6 = abstractC2003u instanceof C1995m;
        long j7 = this.f9034d2;
        return z6 ? m4798F2(j7 - abstractC2003u.mo4748p2()) : C1990h.m4698E2(j7 - abstractC2003u.mo4744n2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: l1 */
    public final boolean mo4739l1(AbstractC2003u abstractC2003u) {
        if (!(abstractC2003u instanceof AbstractC1997o)) {
            return super.mo4739l1(abstractC2003u);
        }
        abstractC2003u.getClass();
        boolean z6 = abstractC2003u instanceof C1995m;
        long j7 = this.f9034d2;
        return !z6 ? ((double) j7) >= abstractC2003u.mo4744n2() : j7 >= abstractC2003u.mo4748p2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: m0 */
    public final int mo4740m0() {
        return (int) this.f9034d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n0 */
    public final String mo4742n0() {
        return String.valueOf(this.f9034d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n2 */
    public final double mo4744n2() {
        return this.f9034d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o0 */
    public final long mo4745o0() {
        return this.f9034d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o1 */
    public final boolean mo4746o1(AbstractC2003u abstractC2003u) {
        if (!(abstractC2003u instanceof AbstractC1997o)) {
            return super.mo4746o1(abstractC2003u);
        }
        abstractC2003u.getClass();
        boolean z6 = abstractC2003u instanceof C1995m;
        long j7 = this.f9034d2;
        return !z6 ? ((double) j7) > abstractC2003u.mo4744n2() : j7 > abstractC2003u.mo4748p2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o2 */
    public final int mo4747o2() {
        return (int) this.f9034d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: p2 */
    public final long mo4748p2() {
        return this.f9034d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r1 */
    public final AbstractC2003u mo4751r1(AbstractC2003u abstractC2003u) {
        if (!abstractC2003u.mo4808e1()) {
            return super.mo4751r1(abstractC2003u);
        }
        boolean mo4729c1 = abstractC2003u.mo4729c1();
        long j7 = this.f9034d2;
        if (!mo4729c1) {
            return C1990h.m4697D2(j7, abstractC2003u.mo4744n2());
        }
        long mo4748p2 = abstractC2003u.mo4748p2();
        if (mo4748p2 != 0) {
            long j8 = j7 % mo4748p2;
            if (j8 != 0) {
                if ((mo4748p2 < 0) ^ (j8 < 0)) {
                    j8 += mo4748p2;
                }
            }
            return m4798F2(j8);
        }
        throw new C1991i("attempt to perform 'n%0' (as '" + j7 + " % " + mo4748p2 + "')");
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r2 */
    public final AbstractC2003u mo4752r2() {
        return m4799C2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: s0 */
    public final C1998p mo4753s0() {
        return C1998p.m4815M2(String.valueOf(this.f9034d2));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: v1 */
    public final AbstractC2003u mo4757v1(AbstractC2003u abstractC2003u) {
        if (!abstractC2003u.mo4808e1()) {
            return super.mo4757v1(abstractC2003u);
        }
        boolean z6 = abstractC2003u instanceof C1995m;
        long j7 = this.f9034d2;
        if (z6) {
            return m4798F2(abstractC2003u.mo4748p2() * j7);
        }
        return C1990h.m4698E2(abstractC2003u.mo4744n2() * j7);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: w1 */
    public final AbstractC2003u mo4758w1() {
        return m4798F2(-this.f9034d2);
    }
}
