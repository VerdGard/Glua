package p165u6;

import android.ext.Tools;
import p180w6.C2140i;

/* renamed from: u6.k */
/* loaded from: classes.dex */
public final class C1993k extends AbstractC1997o {

    /* renamed from: e2 */
    public static final C1993k[] f9023e2 = new C1993k[Tools.Semaphore.f161S9];

    /* renamed from: d2 */
    public final long f9024d2;

    static {
        for (int i7 = 0; i7 < 512; i7++) {
            f9023e2[i7] = new C1993k(i7 - 256);
        }
    }

    public C1993k(long j7) {
        this.f9024d2 = j7;
    }

    /* renamed from: C2 */
    public static C1993k m4765C2(int i7) {
        return (i7 > 255 || i7 < -256) ? new C1993k(i7) : f9023e2[i7 + Tools.Semaphore.f160S8];
    }

    /* renamed from: D2 */
    public static AbstractC1997o m4766D2(long j7) {
        return (j7 < Long.MAX_VALUE || j7 > Long.MIN_VALUE) ? (j7 > 255 || j7 < -256) ? new C1993k(j7) : f9023e2[(int) (j7 + 256)] : m4766D2(j7);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: C1 */
    public final int mo4699C1(int i7) {
        return (int) this.f9024d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: D1 */
    public final String mo4700D1(String str) {
        return Long.toString(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: E0 */
    public final AbstractC2003u mo4701E0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4703F0(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: E1 */
    public final C1998p mo4702E1() {
        return C1998p.m4815M2(Long.toString(this.f9024d2));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: F0 */
    public final AbstractC2003u mo4703F0(double d7) {
        return C1990h.m4696C2(d7, this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: G0 */
    public final boolean mo4704G0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4709N1(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: I1 */
    public final AbstractC2003u mo4705I1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4707K1(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: J1 */
    public final AbstractC2003u mo4706J1(double d7) {
        return C2140i.m5234I2(d7, this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: K1 */
    public final AbstractC2003u mo4707K1(long j7) {
        return C2140i.m5234I2(j7, this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        return Long.toString(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M1 */
    public final boolean mo4708M1(double d7) {
        return ((double) this.f9024d2) == d7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: N1 */
    public final boolean mo4709N1(long j7) {
        return this.f9024d2 == j7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: O */
    public final AbstractC2003u mo4710O(double d7) {
        return C1990h.m4698E2(d7 + this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: O0 */
    public final boolean mo4711O0(double d7) {
        return ((double) this.f9024d2) > d7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: P */
    public final AbstractC2003u mo4767P(long j7) {
        return m4766D2(j7 + this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: P0 */
    public final boolean mo4712P0(long j7) {
        return this.f9024d2 > j7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q */
    public final AbstractC2003u mo4713Q(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4767P(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q0 */
    public final boolean mo4714Q0(double d7) {
        return ((double) this.f9024d2) >= d7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q1 */
    public final boolean mo4674Q1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4709N1(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: R0 */
    public final boolean mo4715R0(long j7) {
        return this.f9024d2 >= j7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: S0 */
    public final boolean mo4716S0(AbstractC2003u abstractC2003u) {
        return abstractC2003u instanceof AbstractC1997o ? abstractC2003u.mo4743n1(this.f9024d2) : super.mo4716S0(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: T0 */
    public final AbstractC2003u mo4717T0(long j7) {
        return m4766D2(j7 / this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: U0 */
    public final AbstractC2003u mo4718U0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4717T0(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: V */
    public final AbstractC2003u mo4719V(long j7) {
        return m4766D2(j7 & this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: W */
    public final AbstractC2003u mo4720W(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4719V(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: X */
    public final AbstractC2003u mo4721X() {
        return m4766D2(~this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Y */
    public final AbstractC2003u mo4722Y(long j7) {
        return m4766D2(j7 | this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Z */
    public final AbstractC2003u mo4723Z(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4722Y(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: b0 */
    public final AbstractC2003u mo4725b0(long j7) {
        return m4766D2(j7 ^ this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: b2 */
    public final AbstractC2003u mo4727b2(long j7) {
        return m4766D2(j7 << ((int) this.f9024d2));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: c0 */
    public final AbstractC2003u mo4728c0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4725b0(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: c2 */
    public final AbstractC2003u mo4730c2(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4727b2(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: d2 */
    public final AbstractC2003u mo4731d2(long j7) {
        return m4766D2(j7 >> ((int) this.f9024d2));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: e2 */
    public final AbstractC2003u mo4732e2(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4731d2(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    public final boolean equals(Object obj) {
        return (obj instanceof C1993k) && ((C1993k) obj).f9024d2 == this.f9024d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: f2 */
    public final int mo4733f2(C1998p c1998p) {
        m4883v2("attempt to compare number with string");
        throw null;
    }

    public final int hashCode() {
        return Long.valueOf(this.f9024d2).hashCode();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: i2 */
    public final C1998p mo4735i2() {
        return C1998p.m4815M2(Long.toString(this.f9024d2));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j0 */
    public final double mo4736j0() {
        return this.f9024d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j2 */
    public final AbstractC2003u mo4737j2(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4768l2(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: k2 */
    public final AbstractC2003u mo4738k2(double d7) {
        return C1990h.m4698E2(d7 - this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: l1 */
    public final boolean mo4739l1(AbstractC2003u abstractC2003u) {
        return abstractC2003u instanceof AbstractC1997o ? abstractC2003u.mo4712P0(this.f9024d2) : super.mo4739l1(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: l2 */
    public final AbstractC2003u mo4768l2(long j7) {
        return m4766D2(j7 - this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: m0 */
    public final int mo4740m0() {
        return (int) this.f9024d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: m1 */
    public final boolean mo4741m1(double d7) {
        return ((double) this.f9024d2) <= d7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n0 */
    public final String mo4742n0() {
        return String.valueOf(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n1 */
    public final boolean mo4743n1(long j7) {
        return this.f9024d2 <= j7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n2 */
    public final double mo4744n2() {
        return this.f9024d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o0 */
    public final long mo4745o0() {
        return this.f9024d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o1 */
    public final boolean mo4746o1(AbstractC2003u abstractC2003u) {
        return abstractC2003u instanceof AbstractC1997o ? abstractC2003u.mo4715R0(this.f9024d2) : super.mo4746o1(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o2 */
    public final int mo4747o2() {
        return (int) this.f9024d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: p2 */
    public final long mo4748p2() {
        return this.f9024d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r1 */
    public final AbstractC2003u mo4751r1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4754s1(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r2 */
    public final AbstractC2003u mo4752r2() {
        return C1998p.m4815M2(Long.toString(this.f9024d2));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: s0 */
    public final C1998p mo4753s0() {
        return C1998p.m4815M2(String.valueOf(this.f9024d2));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: s1 */
    public final AbstractC2003u mo4754s1(double d7) {
        return C1990h.m4697D2(d7, this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t1 */
    public final AbstractC2003u mo4755t1(double d7) {
        return C1990h.m4698E2(d7 * this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u1 */
    public final AbstractC2003u mo4756u1(long j7) {
        return m4766D2(j7 * this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: v1 */
    public final AbstractC2003u mo4757v1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4756u1(this.f9024d2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: w1 */
    public final AbstractC2003u mo4758w1() {
        return m4766D2(-this.f9024d2);
    }
}
