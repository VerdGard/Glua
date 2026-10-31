package p180w6;

import android.ext.C0090b;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1991i;
import p165u6.C1993k;
import p165u6.C1998p;
import p165u6.C1999q;

/* renamed from: w6.o */
/* loaded from: classes.dex */
public final class C2146o extends AbstractC2149r {

    /* renamed from: w6.o$a */
    public static class a extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            abstractC2003u.mo4795t0().f9053g2 = true;
            return AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.o$b */
    public static class b extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            C1999q mo4795t0 = abstractC2003u.mo4795t0();
            mo4795t0.f9049c2 = AbstractC2003u.f9133x1;
            mo4795t0.f9050d2 = C1999q.f9048k2;
            return AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.o$c */
    public static class c extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            C1999q mo4795t0 = abstractC2003u.mo4795t0();
            mo4795t0.getClass();
            return new C1999q(mo4795t0);
        }
    }

    /* renamed from: w6.o$d */
    public static class d extends C2147p {
        @Override // p180w6.AbstractC2139h
        /* renamed from: H2 */
        public final AbstractC2003u mo5233H2(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3, AbstractC2003u abstractC2003u4) {
            return abstractC2003u.mo4795t0().mo4772E2(abstractC2003u2.mo4753s0(), abstractC2003u3.mo4740m0(), abstractC2003u4.mo4740m0());
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4795t0().mo4772E2(AbstractC2003u.f9116R1, 1, abstractC2003u.mo4794k1());
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            return abstractC2003u.mo4795t0().mo4772E2(abstractC2003u2.mo4753s0(), 1, abstractC2003u.mo4794k1());
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: h0 */
        public final AbstractC2003u mo4693h0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
            return abstractC2003u.mo4795t0().mo4772E2(abstractC2003u2.mo4753s0(), abstractC2003u3.mo4740m0(), abstractC2003u.mo4794k1());
        }
    }

    /* renamed from: w6.o$e */
    public static class e extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            boolean mo4704G0;
            C1999q m4636A = abstractC1984c0.m4636A(1);
            AbstractC2003u mo4623t = abstractC1984c0.mo4623t(2);
            AbstractC2003u mo4623t2 = abstractC1984c0.mo4623t(3);
            do {
                AbstractC1984c0 mo4796x1 = m4636A.mo4796x1(mo4623t2);
                if (mo4796x1.m4641G(1)) {
                    return AbstractC2003u.f9124Y;
                }
                mo4704G0 = mo4796x1.mo4623t(2).mo4704G0(mo4623t);
                mo4623t2 = mo4796x1.mo4624u();
            } while (!mo4704G0);
            return mo4623t2;
        }
    }

    /* renamed from: w6.o$f */
    public static class f extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            int mo4621I = abstractC1984c0.mo4621I();
            AbstractC2003u.a aVar = AbstractC2003u.f9124Y;
            if (mo4621I == 2) {
                C1999q m4636A = abstractC1984c0.m4636A(1);
                m4636A.mo4780N2(m4636A.mo4794k1() + 1, abstractC1984c0.mo4623t(2));
                return aVar;
            }
            if (mo4621I != 3) {
                throw new C1991i("wrong number of arguments to 'table.insert': " + abstractC1984c0.mo4621I() + " (must be 2 or 3)");
            }
            C1999q m4636A2 = abstractC1984c0.m4636A(1);
            int m4648w = abstractC1984c0.m4648w(2);
            int mo4794k1 = m4636A2.mo4794k1() + 1;
            if (m4648w >= 1 && m4648w <= mo4794k1) {
                m4636A2.mo4780N2(m4648w, abstractC1984c0.mo4623t(3));
                return aVar;
            }
            AbstractC2003u.m4863R(2, "position out of bounds: " + m4648w + " not between 1 and " + mo4794k1);
            throw null;
        }
    }

    /* renamed from: w6.o$g */
    public static class g extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1999q c1999q = new C1999q(abstractC1984c0);
            c1999q.mo4790Y1(C1998p.m4815M2("n"), C1993k.m4765C2(abstractC1984c0.mo4621I()));
            return c1999q;
        }
    }

    /* renamed from: w6.o$h */
    public static class h extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1999q m4636A = abstractC1984c0.m4636A(1);
            int mo4794k1 = m4636A.mo4794k1();
            int m4643J = abstractC1984c0.m4643J(2, mo4794k1);
            if (m4643J == mo4794k1 || (m4643J >= 1 && m4643J <= mo4794k1 + 1)) {
                return m4636A.mo4786U2(m4643J);
            }
            StringBuilder m221g = C0090b.m221g("position out of bounds: ", m4643J, " not between 1 and ");
            m221g.append(mo4794k1 + 1);
            AbstractC2003u.m4863R(2, m221g.toString());
            throw null;
        }
    }

    /* renamed from: w6.o$i */
    public static class i extends AbstractC2141j {
        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4795t0().mo4793j1().mo4767P(r4.mo4775I2());
        }
    }

    /* renamed from: w6.o$j */
    public static class j extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            abstractC1984c0.m4636A(1).mo4789W2(abstractC1984c0.m4641G(2) ? AbstractC2003u.f9130m : abstractC1984c0.mo4623t(2).mo4764k0());
            return AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.o$k */
    public static class k extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1999q m4636A = abstractC1984c0.m4636A(1);
            return m4636A.mo4791Y2(abstractC1984c0.m4643J(2, 1), abstractC1984c0.m4643J(3, abstractC1984c0.mo4623t(3).mo4804d1() ? m4636A.mo4794k1() : 0));
        }
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        C1999q c1999q = new C1999q();
        c1999q.mo4790Y1(C1998p.m4815M2("concat"), new d());
        c1999q.mo4790Y1(C1998p.m4815M2("insert"), new f());
        c1999q.mo4790Y1(C1998p.m4815M2("pack"), new g());
        c1999q.mo4790Y1(C1998p.m4815M2("remove"), new h());
        c1999q.mo4790Y1(C1998p.m4815M2("sort"), new j());
        c1999q.mo4790Y1(C1998p.m4815M2("clone"), new c());
        c1999q.mo4790Y1(C1998p.m4815M2("clear"), new b());
        c1999q.mo4790Y1(C1998p.m4815M2("size"), new i());
        c1999q.mo4790Y1(C1998p.m4815M2("find"), new e());
        c1999q.mo4790Y1(C1998p.m4815M2("const"), new a());
        c1999q.mo4790Y1(C1998p.m4815M2("unpack"), new k());
        abstractC2003u2.getClass();
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("table"), c1999q);
        if (!abstractC2003u2.mo4777L0(C1998p.m4815M2("package")).mo4804d1()) {
            AbstractC2003u mo4777L0 = abstractC2003u2.mo4777L0(C1998p.m4815M2("package"));
            mo4777L0.getClass();
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
            mo4777L02.getClass();
            mo4777L02.mo4790Y1(C1998p.m4815M2("table"), c1999q);
        }
        return AbstractC2003u.f9130m;
    }
}
