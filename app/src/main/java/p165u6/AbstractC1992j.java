package p165u6;

/* renamed from: u6.j */
/* loaded from: classes.dex */
public abstract class AbstractC1992j extends AbstractC2003u {

    /* renamed from: d2 */
    public static C1999q f9021d2;

    /* renamed from: c2 */
    public AbstractC2003u f9022c2;

    public AbstractC1992j() {
        this.f9022c2 = AbstractC2003u.f9130m;
    }

    public AbstractC1992j(AbstractC2003u abstractC2003u) {
        this.f9022c2 = abstractC2003u;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: B1 */
    public final AbstractC1992j mo4759B1() {
        return this;
    }

    /* renamed from: C2 */
    public final String m4760C2() {
        String name = getClass().getName();
        int max = Math.max(name.lastIndexOf(46), name.lastIndexOf(36)) + 1;
        if (name.charAt(max) == '_') {
            max++;
        }
        return name.substring(max);
    }

    /* renamed from: D2 */
    public final AbstractC2003u m4761D2() {
        return this.f9022c2;
    }

    /* renamed from: E2 */
    public String mo4686E2() {
        return m4760C2();
    }

    /* renamed from: F2 */
    public final void m4762F2(AbstractC2003u abstractC2003u) {
        if (abstractC2003u == null) {
            abstractC2003u = AbstractC2003u.f9130m;
        }
        this.f9022c2 = abstractC2003u;
    }

    @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public String mo4645M() {
        return "function: " + m4760C2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M0 */
    public AbstractC2003u mo4681M0() {
        return f9021d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Y0 */
    public final boolean mo4763Y0() {
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: i2 */
    public final C1998p mo4735i2() {
        return C1998p.m4815M2(mo4645M());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: k0 */
    public final AbstractC1992j mo4764k0() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t2 */
    public final int mo4675t2() {
        return 6;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u2 */
    public final String mo4676u2() {
        return "function";
    }
}
