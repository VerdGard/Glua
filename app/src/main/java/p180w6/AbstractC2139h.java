package p180w6;

import p165u6.AbstractC1984c0;
import p165u6.AbstractC1992j;
import p165u6.AbstractC2003u;
import p165u6.C1991i;
import p165u6.C1999q;

/* renamed from: w6.h */
/* loaded from: classes.dex */
public abstract class AbstractC2139h extends AbstractC1992j {

    /* renamed from: e2 */
    public int f9700e2;

    /* renamed from: f2 */
    public String f9701f2;

    /* renamed from: G2 */
    public static void m5232G2(C1999q c1999q, Class cls, String[] strArr, int i7) {
        try {
            int length = strArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                AbstractC2139h abstractC2139h = (AbstractC2139h) cls.newInstance();
                abstractC2139h.f9700e2 = i7 + i8;
                String str = strArr[i8];
                abstractC2139h.f9701f2 = str;
                c1999q.m4878X1(str, abstractC2139h);
            }
        } catch (Exception e7) {
            throw new C1991i("bind failed: " + e7);
        }
    }

    /* renamed from: H2 */
    public AbstractC2003u mo5233H2(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3, AbstractC2003u abstractC2003u4) {
        return mo4693h0(abstractC2003u, abstractC2003u2, abstractC2003u3);
    }

    @Override // p165u6.AbstractC1992j, p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public String mo4645M() {
        if (this.f9701f2 == null) {
            return super.mo4645M();
        }
        return "function: " + this.f9701f2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: W0 */
    public AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        int mo4621I = abstractC1984c0.mo4621I();
        return mo4621I != 0 ? mo4621I != 1 ? mo4621I != 2 ? mo4621I != 3 ? mo5233H2(abstractC1984c0.mo4624u(), abstractC1984c0.mo4623t(2), abstractC1984c0.mo4623t(3), abstractC1984c0.mo4623t(4)) : mo4693h0(abstractC1984c0.mo4624u(), abstractC1984c0.mo4623t(2), abstractC1984c0.mo4623t(3)) : mo4692g0(abstractC1984c0.mo4624u(), abstractC1984c0.mo4623t(2)) : mo4691f0(abstractC1984c0.mo4624u()) : mo4690d0();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: d0 */
    public AbstractC2003u mo4690d0() {
        AbstractC2003u.m4863R(1, "value expected");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: f0 */
    public AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
        return mo4690d0();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: g0 */
    public AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        return mo4691f0(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: h0 */
    public AbstractC2003u mo4693h0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
        return mo4692g0(abstractC2003u, abstractC2003u2);
    }
}
