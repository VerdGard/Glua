package p180w6;

import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1991i;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2000r;
import p165u6.C2006x;

/* renamed from: w6.c */
/* loaded from: classes.dex */
public final class C2134c extends AbstractC2149r {

    /* renamed from: g2 */
    public C1981b f9620g2;

    /* renamed from: w6.c$a */
    public final class a extends AbstractC2150s {
        public a() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            AbstractC1984c0 abstractC1984c02;
            C2000r c2000r = C2134c.this.f9620g2.f8948o2;
            if (c2000r != null) {
                C2000r.a aVar = c2000r.f9072c2;
                if (!(aVar.f9085m == null)) {
                    synchronized (aVar) {
                        try {
                            try {
                                aVar.f9080X = abstractC1984c0;
                                aVar.f9079D1 = 1;
                                aVar.notify();
                                do {
                                    aVar.wait(5000L);
                                    if (aVar.f9084e.get() == null) {
                                        aVar.f9079D1 = 4;
                                        throw new C2006x();
                                    }
                                } while (aVar.f9079D1 == 1);
                                abstractC1984c02 = aVar.f9086s;
                            } catch (InterruptedException unused) {
                                aVar.f9079D1 = 4;
                                throw new C2006x();
                            }
                        } finally {
                            AbstractC2003u.a aVar2 = AbstractC2003u.f9124Y;
                            aVar.f9086s = aVar2;
                            aVar.f9080X = aVar2;
                        }
                    }
                    return abstractC1984c02;
                }
            }
            throw new C1991i("cannot yield main thread");
        }
    }

    /* renamed from: w6.c$b */
    public final class b extends AbstractC2139h {
        public b() {
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return new C2000r(C2134c.this.f9620g2, abstractC2003u.mo4764k0());
        }
    }

    /* renamed from: w6.c$c */
    public static final class c extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return abstractC1984c0.m4637B().m4847C2(abstractC1984c0.mo4622L(2));
        }
    }

    /* renamed from: w6.c$d */
    public final class d extends AbstractC2150s {
        public d() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2000r c2000r = C2134c.this.f9620g2.f8948o2;
            return AbstractC2003u.m4867y2(c2000r, c2000r.f9072c2.f9085m == null ? AbstractC2003u.f9131s : AbstractC2003u.f9122X);
        }
    }

    /* renamed from: w6.c$e */
    public static final class e extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return C1998p.m4815M2(C2000r.f9071i2[abstractC2003u.mo4848u0().f9072c2.f9079D1]);
        }
    }

    /* renamed from: w6.c$f */
    public final class f extends AbstractC2139h {
        public f() {
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return new g(new C2000r(C2134c.this.f9620g2, abstractC2003u.mo4764k0()));
        }
    }

    /* renamed from: w6.c$g */
    public static final class g extends AbstractC2150s {

        /* renamed from: g2 */
        public final C2000r f9625g2;

        public g(C2000r c2000r) {
            this.f9625g2 = c2000r;
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            AbstractC1984c0 m4847C2 = this.f9625g2.m4847C2(abstractC1984c0);
            if (m4847C2.mo4624u().mo4682m2()) {
                return m4847C2.mo4622L(2);
            }
            throw new C1991i(m4847C2.mo4623t(2).mo4645M());
        }
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        this.f9620g2 = abstractC2003u2.mo4629l0();
        C1999q c1999q = new C1999q();
        c1999q.mo4790Y1(C1998p.m4815M2("create"), new b());
        c1999q.mo4790Y1(C1998p.m4815M2("resume"), new c());
        c1999q.mo4790Y1(C1998p.m4815M2("running"), new d());
        c1999q.mo4790Y1(C1998p.m4815M2("status"), new e());
        c1999q.mo4790Y1(C1998p.m4815M2("yield"), new a());
        c1999q.mo4790Y1(C1998p.m4815M2("wrap"), new f());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("coroutine"), c1999q);
        if (!abstractC2003u2.mo4777L0(C1998p.m4815M2("package")).mo4804d1()) {
            AbstractC2003u mo4777L0 = abstractC2003u2.mo4777L0(C1998p.m4815M2("package"));
            mo4777L0.getClass();
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
            mo4777L02.getClass();
            mo4777L02.mo4790Y1(C1998p.m4815M2("coroutine"), c1999q);
        }
        return c1999q;
    }
}
