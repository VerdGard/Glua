package p165u6;

/* renamed from: u6.o */
/* loaded from: classes.dex */
public abstract class AbstractC1997o extends AbstractC2003u {

    /* renamed from: c2 */
    public static C1999q f9037c2;

    @Override // p165u6.AbstractC2003u
    /* renamed from: A0 */
    public final AbstractC2003u mo4805A0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4806B0(this);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: B0 */
    public final AbstractC2003u mo4806B0(AbstractC1997o abstractC1997o) {
        return mo4735i2().mo4807C0(abstractC1997o.mo4735i2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: C0 */
    public final AbstractC2003u mo4807C0(C1998p c1998p) {
        return mo4735i2().mo4807C0(c1998p);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M0 */
    public final AbstractC2003u mo4681M0() {
        return f9037c2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: e1 */
    public boolean mo4808e1() {
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: f1 */
    public boolean mo4809f1() {
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: q0 */
    public AbstractC1997o mo4749q0() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: q2 */
    public AbstractC2003u mo4750q2() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r0 */
    public final AbstractC1997o mo4810r0(String str) {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t2 */
    public final int mo4675t2() {
        return 3;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u2 */
    public final String mo4676u2() {
        return "number";
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: z0 */
    public final C1979a mo4811z0(C1979a c1979a) {
        AbstractC2003u abstractC2003u = c1979a.f8941d;
        if (abstractC2003u == null || abstractC2003u.mo4809f1()) {
            c1979a.m4618e(mo4735i2());
        } else {
            AbstractC2003u mo4806B0 = c1979a.f8941d.mo4806B0(this);
            c1979a.f8938a = C1979a.f8937e;
            c1979a.f8939b = 0;
            c1979a.f8940c = 0;
            c1979a.f8941d = mo4806B0;
        }
        return c1979a;
    }
}
