package p165u6;

/* renamed from: u6.a0 */
/* loaded from: classes.dex */
public final class C1980a0 extends AbstractC1984c0 {

    /* renamed from: e */
    public AbstractC2003u f8942e;

    /* renamed from: m */
    public AbstractC1984c0 f8943m;

    /* renamed from: s */
    public AbstractC1984c0 f8944s;

    public C1980a0(AbstractC2003u abstractC2003u, AbstractC1984c0 abstractC1984c0) {
        this.f8942e = abstractC2003u;
        this.f8943m = abstractC1984c0;
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: F */
    public final AbstractC1984c0 mo4620F() {
        AbstractC1984c0 abstractC1984c0;
        while (true) {
            AbstractC1984c0 abstractC1984c02 = this.f8944s;
            if (abstractC1984c02 != null) {
                return abstractC1984c02;
            }
            AbstractC1984c0 mo4695z1 = this.f8942e.mo4695z1(this.f8943m);
            mo4695z1.getClass();
            if (mo4695z1 instanceof C1980a0) {
                C1980a0 c1980a0 = (C1980a0) mo4695z1;
                this.f8942e = c1980a0.f8942e;
                abstractC1984c0 = c1980a0.f8943m;
            } else {
                this.f8944s = mo4695z1;
                abstractC1984c0 = null;
                this.f8942e = null;
            }
            this.f8943m = abstractC1984c0;
        }
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: I */
    public final int mo4621I() {
        if (this.f8944s == null) {
            mo4620F();
        }
        return this.f8944s.mo4621I();
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: L */
    public final AbstractC1984c0 mo4622L(int i7) {
        if (this.f8944s == null) {
            mo4620F();
        }
        return this.f8944s.mo4622L(i7);
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: t */
    public final AbstractC2003u mo4623t(int i7) {
        if (this.f8944s == null) {
            mo4620F();
        }
        return this.f8944s.mo4623t(i7);
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: u */
    public final AbstractC2003u mo4624u() {
        if (this.f8944s == null) {
            mo4620F();
        }
        return this.f8944s.mo4624u();
    }
}
