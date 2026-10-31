package p188x6;

import p165u6.AbstractC2003u;
import p165u6.C1990h;
import p165u6.C1998p;
import p165u6.C1999q;
import p180w6.C2140i;

/* renamed from: x6.j */
/* loaded from: classes.dex */
public final class C2209j extends C2140i {

    /* renamed from: x6.j$a */
    public static final class a extends C2140i.b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.acos(d7);
        }
    }

    /* renamed from: x6.j$b */
    public static final class b extends C2140i.b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.asin(d7);
        }
    }

    /* renamed from: x6.j$c */
    public static final class c extends C2140i.a {
        @Override // p180w6.C2140i.a
        /* renamed from: I2 */
        public final double mo5236I2(double d7, double d8) {
            return Math.atan2(d7, d8);
        }
    }

    /* renamed from: x6.j$d */
    public static final class d extends C2140i.b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.atan(d7);
        }
    }

    /* renamed from: x6.j$e */
    public static final class e extends C2140i.b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.cosh(d7);
        }
    }

    /* renamed from: x6.j$f */
    public static final class f extends C2140i.b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.exp(d7);
        }
    }

    /* renamed from: x6.j$g */
    public static final class g extends C2140i.b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.log(d7);
        }
    }

    /* renamed from: x6.j$h */
    public static final class h extends C2140i.a {
        @Override // p180w6.C2140i.a
        /* renamed from: I2 */
        public final double mo5236I2(double d7, double d8) {
            return Math.pow(d7, d8);
        }
    }

    /* renamed from: x6.j$i */
    public static final class i extends C2140i.b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.sinh(d7);
        }
    }

    /* renamed from: x6.j$j */
    public static final class j extends C2140i.b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.tanh(d7);
        }
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        AbstractC2003u c1999q = new C1999q(0, 30);
        c1999q.mo4790Y1(C1998p.m4815M2("abs"), new C2140i.c());
        c1999q.mo4790Y1(C1998p.m4815M2("ceil"), new C2140i.d());
        c1999q.mo4790Y1(C1998p.m4815M2("cos"), new C2140i.e());
        c1999q.mo4790Y1(C1998p.m4815M2("deg"), new C2140i.f());
        c1999q.mo4790Y1(C1998p.m4815M2("exp"), new C2140i.g(this));
        c1999q.mo4790Y1(C1998p.m4815M2("floor"), new C2140i.h());
        c1999q.mo4790Y1(C1998p.m4815M2("fmod"), new C2140i.i());
        c1999q.mo4790Y1(C1998p.m4815M2("frexp"), new C2140i.j());
        c1999q.mo4790Y1(C1998p.m4815M2("huge"), C1990h.f9012f2);
        c1999q.mo4790Y1(C1998p.m4815M2("ldexp"), new C2140i.k());
        c1999q.mo4790Y1(C1998p.m4815M2("max"), new C2140i.l());
        c1999q.mo4790Y1(C1998p.m4815M2("min"), new C2140i.m());
        c1999q.mo4790Y1(C1998p.m4815M2("modf"), new C2140i.n());
        c1999q.mo4790Y1(C1998p.m4815M2("pi"), C1990h.m4698E2(3.141592653589793d));
        c1999q.mo4790Y1(C1998p.m4815M2("pow"), new C2140i.o());
        C2140i.q qVar = new C2140i.q();
        c1999q.mo4790Y1(C1998p.m4815M2("random"), qVar);
        c1999q.mo4790Y1(C1998p.m4815M2("randomseed"), new C2140i.r(qVar));
        c1999q.mo4790Y1(C1998p.m4815M2("rad"), new C2140i.p());
        c1999q.mo4790Y1(C1998p.m4815M2("sin"), new C2140i.s());
        c1999q.mo4790Y1(C1998p.m4815M2("sqrt"), new C2140i.t());
        c1999q.mo4790Y1(C1998p.m4815M2("tan"), new C2140i.u());
        abstractC2003u2.getClass();
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("math"), c1999q);
        if (!abstractC2003u2.mo4777L0(C1998p.m4815M2("package")).mo4804d1()) {
            AbstractC2003u mo4777L0 = abstractC2003u2.mo4777L0(C1998p.m4815M2("package"));
            mo4777L0.getClass();
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
            mo4777L02.getClass();
            mo4777L02.mo4790Y1(C1998p.m4815M2("math"), c1999q);
        }
        AbstractC2003u mo4777L03 = abstractC2003u2.mo4777L0(C1998p.m4815M2("math"));
        AbstractC2003u aVar = new a();
        mo4777L03.getClass();
        mo4777L03.mo4790Y1(C1998p.m4815M2("acos"), aVar);
        mo4777L03.mo4790Y1(C1998p.m4815M2("asin"), new b());
        mo4777L03.mo4790Y1(C1998p.m4815M2("atan"), new d());
        mo4777L03.mo4790Y1(C1998p.m4815M2("atan2"), new c());
        mo4777L03.mo4790Y1(C1998p.m4815M2("cosh"), new e());
        mo4777L03.mo4790Y1(C1998p.m4815M2("exp"), new f());
        mo4777L03.mo4790Y1(C1998p.m4815M2("log"), new g());
        mo4777L03.mo4790Y1(C1998p.m4815M2("pow"), new h());
        mo4777L03.mo4790Y1(C1998p.m4815M2("sinh"), new i());
        mo4777L03.mo4790Y1(C1998p.m4815M2("tanh"), new j());
        return mo4777L03;
    }
}
