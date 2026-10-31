package p188x6;

import java.lang.reflect.Array;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1993k;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2001s;
import p180w6.AbstractC2141j;

/* renamed from: x6.c */
/* loaded from: classes.dex */
public final class C2202c extends C2001s {

    /* renamed from: e2 */
    public static final C1998p f9988e2 = C1998p.m4815M2("length");

    /* renamed from: f2 */
    public static final C1998p f9989f2 = C1998p.m4815M2("class");

    /* renamed from: g2 */
    public static final C1999q f9990g2;

    /* renamed from: x6.c$a */
    public static final class a extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return C1993k.m4765C2(Array.getLength(((C2001s) abstractC2003u).f9091c2));
        }
    }

    static {
        C1999q c1999q = new C1999q();
        f9990g2 = c1999q;
        c1999q.mo4787V1(AbstractC2003u.f9110L1, new a());
    }

    public C2202c(Object obj) {
        super(obj);
        this.f9092d2 = f9990g2;
    }

    @Override // p165u6.C2001s, p165u6.AbstractC2003u
    /* renamed from: L0 */
    public final AbstractC2003u mo4777L0(AbstractC2003u abstractC2003u) {
        if (abstractC2003u.equals(f9988e2)) {
            return C1993k.m4765C2(Array.getLength(this.f9091c2));
        }
        if (abstractC2003u.equals(f9989f2)) {
            return C2200a.m5337a(this.f9091c2.getClass());
        }
        if (!abstractC2003u.mo4724Z0()) {
            return super.mo4777L0(abstractC2003u);
        }
        int mo4747o2 = abstractC2003u.mo4747o2() - 1;
        return (mo4747o2 < 0 || mo4747o2 >= Array.getLength(this.f9091c2)) ? AbstractC2003u.f9130m : C2200a.m5337a(Array.get(this.f9091c2, abstractC2003u.mo4747o2() - 1));
    }

    @Override // p165u6.C2001s, p165u6.AbstractC2003u
    /* renamed from: Y1 */
    public final void mo4790Y1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        if (!abstractC2003u.mo4724Z0()) {
            super.mo4790Y1(abstractC2003u, abstractC2003u2);
            return;
        }
        int mo4747o2 = abstractC2003u.mo4747o2() - 1;
        if (mo4747o2 >= 0 && mo4747o2 < Array.getLength(this.f9091c2)) {
            Object obj = this.f9091c2;
            Array.set(obj, mo4747o2, C2201b.m5339a(obj.getClass().getComponentType(), abstractC2003u2));
        } else {
            if (this.f9092d2 == null) {
                AbstractC2003u.m4861I0("array index out of bounds");
                throw null;
            }
            if (m4882q1(AbstractC2003u.f9099A1).mo4804d1()) {
                AbstractC2003u.m4864a2(this, abstractC2003u, abstractC2003u2);
            }
        }
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: x1 */
    public final AbstractC1984c0 mo4796x1(AbstractC2003u abstractC2003u) {
        int length = Array.getLength(this.f9091c2);
        int mo4747o2 = abstractC2003u.mo4804d1() ? 0 : abstractC2003u.mo4747o2() + 1;
        return mo4747o2 >= length ? AbstractC2003u.f9130m : AbstractC2003u.m4868z2(new AbstractC2003u[]{C2200a.m5337a(Integer.valueOf(mo4747o2)), C2200a.m5337a(Array.get(this.f9091c2, mo4747o2))});
    }
}
