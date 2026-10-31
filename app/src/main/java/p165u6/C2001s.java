package p165u6;

/* renamed from: u6.s */
/* loaded from: classes.dex */
public class C2001s extends AbstractC2003u {

    /* renamed from: c2 */
    public Object f9091c2;

    /* renamed from: d2 */
    public AbstractC2003u f9092d2;

    public C2001s(Object obj) {
        this.f9091c2 = obj;
    }

    public C2001s(Object obj, AbstractC2003u abstractC2003u) {
        this.f9091c2 = obj;
        this.f9092d2 = abstractC2003u;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: G0 */
    public final boolean mo4704G0(AbstractC2003u abstractC2003u) {
        AbstractC2003u mo4681M0;
        if (abstractC2003u.mo4849P1(this)) {
            return true;
        }
        return this.f9092d2 != null && abstractC2003u.mo4850h1() && (mo4681M0 = abstractC2003u.mo4681M0()) != null && AbstractC2003u.m4860H0(this, this.f9092d2, abstractC2003u, mo4681M0);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: G1 */
    public final Object mo4802G1(Class cls) {
        if (cls.isAssignableFrom(this.f9091c2.getClass())) {
            return this.f9091c2;
        }
        m4883v2(cls.getName());
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: L0 */
    public AbstractC2003u mo4777L0(AbstractC2003u abstractC2003u) {
        return this.f9092d2 != null ? AbstractC2003u.m4862N0(this, abstractC2003u) : AbstractC2003u.f9130m;
    }

    @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        return String.valueOf(this.f9091c2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M0 */
    public final AbstractC2003u mo4681M0() {
        return this.f9092d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: P1 */
    public final boolean mo4849P1(C2001s c2001s) {
        return this == c2001s || (this.f9092d2 == c2001s.f9092d2 && this.f9091c2.equals(c2001s.f9091c2));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q1 */
    public final boolean mo4674Q1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4849P1(this);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Y1 */
    public void mo4790Y1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        if (this.f9092d2 != null) {
            AbstractC2003u.m4864a2(this, abstractC2003u, abstractC2003u2);
            return;
        }
        AbstractC2003u.m4861I0("cannot set " + abstractC2003u + " for userdata");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Z1 */
    public final AbstractC2003u mo4792Z1(AbstractC2003u abstractC2003u) {
        this.f9092d2 = abstractC2003u;
        return this;
    }

    @Override // p165u6.AbstractC2003u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2001s) {
            return this.f9091c2.equals(((C2001s) obj).f9091c2);
        }
        return false;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: h1 */
    public final boolean mo4850h1() {
        return true;
    }

    public final int hashCode() {
        return this.f9091c2.hashCode();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: s2 */
    public final Object mo4851s2() {
        return this.f9091c2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t2 */
    public final int mo4675t2() {
        return 7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u2 */
    public final String mo4676u2() {
        return "userdata";
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: v0 */
    public final Object mo4852v0() {
        return this.f9091c2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: w0 */
    public final Object mo4853w0() {
        if (Class.class.isAssignableFrom(this.f9091c2.getClass())) {
            return this.f9091c2;
        }
        m4883v2(Class.class.getName());
        throw null;
    }
}
