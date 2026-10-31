package p104m6;

import p036e2.C1101u4;

/* renamed from: m6.n */
/* loaded from: classes.dex */
public final class C1595n extends C1564c1 {

    /* renamed from: x1 */
    public static C1595n f7369x1;

    /* renamed from: w1 */
    public AbstractC1598o f7370w1;

    public C1595n(AbstractC1598o abstractC1598o) {
        super(abstractC1598o);
        this.f7370w1 = abstractC1598o;
    }

    @Override // p104m6.C1564c1
    /* renamed from: a */
    public final void mo3954a() {
        this.f7342c = f7369x1;
        f7369x1 = this;
    }

    @Override // p104m6.C1564c1
    /* renamed from: b */
    public final int mo3955b() {
        return this.f7370w1.f7385X;
    }

    @Override // p104m6.C1564c1
    /* renamed from: c */
    public final void mo3956c(AbstractC1630z0 abstractC1630z0) {
        super.mo3956c(abstractC1630z0);
        if (abstractC1630z0 instanceof AbstractC1598o) {
            this.f7370w1 = (AbstractC1598o) abstractC1630z0;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("Assigning ");
        stringBuffer.append(abstractC1630z0);
        stringBuffer.append(" to branch handle which is not a branch instruction");
        throw new C1101u4(stringBuffer.toString());
    }

    @Override // p104m6.C1564c1
    /* renamed from: d */
    public final void mo3957d(int i7) {
        this.f7370w1.f7385X = i7;
        this.f7345s = i7;
    }

    @Override // p104m6.C1564c1
    /* renamed from: f */
    public final int mo3959f(int i7, int i8) {
        int mo3974h = this.f7370w1.mo3974h(i7, i8);
        this.f7345s = this.f7370w1.f7385X;
        return mo3974h;
    }
}
