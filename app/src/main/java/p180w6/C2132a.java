package p180w6;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC1992j;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1988f;
import p165u6.C1990h;
import p165u6.C1991i;
import p165u6.C1993k;
import p165u6.C1996n;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2000r;
import p180w6.C2135d;

/* renamed from: w6.a */
/* loaded from: classes.dex */
public final class C2132a extends AbstractC2149r implements InterfaceC2144m {

    /* renamed from: g2 */
    public C1981b f9604g2;

    /* renamed from: w6.a$a */
    public static class a extends InputStream {

        /* renamed from: c */
        public final AbstractC2003u f9605c;

        /* renamed from: e */
        public byte[] f9606e;

        /* renamed from: m */
        public int f9607m;

        /* renamed from: s */
        public int f9608s = 0;

        public a(AbstractC1992j abstractC1992j) {
            this.f9605c = abstractC1992j;
        }

        @Override // java.io.InputStream
        public final int read() {
            int i7 = this.f9608s;
            if (i7 < 0) {
                return -1;
            }
            if (i7 == 0) {
                AbstractC2003u mo4690d0 = this.f9605c.mo4690d0();
                if (mo4690d0.mo4804d1()) {
                    this.f9608s = -1;
                    return -1;
                }
                C1998p mo4735i2 = mo4690d0.mo4735i2();
                this.f9606e = mo4735i2.f9039c2;
                this.f9607m = mo4735i2.f9040d2;
                int i8 = mo4735i2.f9041e2;
                this.f9608s = i8;
                if (i8 <= 0) {
                    return -1;
                }
            }
            this.f9608s--;
            byte[] bArr = this.f9606e;
            int i9 = this.f9607m;
            this.f9607m = i9 + 1;
            return bArr[i9] & 255;
        }
    }

    /* renamed from: w6.a$a0 */
    public static final class a0 extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return C1998p.m4815M2(abstractC2003u.mo4676u2());
        }
    }

    /* renamed from: w6.a$b */
    public static final class b extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            if (abstractC1984c0.mo4624u().mo4682m2()) {
                return abstractC1984c0;
            }
            AbstractC2003u.m4861I0(abstractC1984c0.mo4621I() > 1 ? abstractC1984c0.m4644K(2, "assertion failed!") : "assertion failed!");
            throw null;
        }
    }

    /* renamed from: w6.a$b0 */
    public final class b0 extends AbstractC2150s {
        public b0() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2135d c2135d;
            C2135d c2135d2;
            C2135d c2135d3;
            C2135d c2135d4;
            C2135d c2135d5;
            C1988f c1988f = AbstractC2003u.f9122X;
            C2132a c2132a = C2132a.this;
            C2000r c2000r = c2132a.f9604g2.f8948o2;
            AbstractC2003u abstractC2003u = c2000r.f9075f2;
            c2000r.f9075f2 = abstractC1984c0.m4638C(2);
            try {
                C1981b c1981b = c2132a.f9604g2;
                if (c1981b != null && (c2135d5 = c1981b.f8950q2) != null) {
                    c2135d5.m5183Q2(this);
                }
                try {
                    try {
                        try {
                            AbstractC1984c0 m4867y2 = AbstractC2003u.m4867y2(AbstractC2003u.f9131s, abstractC1984c0.mo4624u().mo4689W0(abstractC1984c0.mo4622L(3)));
                            C1981b c1981b2 = c2132a.f9604g2;
                            if (c1981b2 != null && (c2135d4 = c1981b2.f8950q2) != null) {
                                c2135d4.m5185S2();
                            }
                            return m4867y2;
                        } catch (Exception e7) {
                            String message = e7.getMessage();
                            if (message == null) {
                                message = e7.toString();
                            }
                            AbstractC1984c0 m4867y22 = AbstractC2003u.m4867y2(c1988f, C1998p.m4815M2(message));
                            C1981b c1981b3 = c2132a.f9604g2;
                            if (c1981b3 != null && (c2135d2 = c1981b3.f8950q2) != null) {
                                c2135d2.m5185S2();
                            }
                            return m4867y22;
                        }
                    } catch (C1991i e8) {
                        AbstractC2003u abstractC2003u2 = e8.f9016Y;
                        if (abstractC2003u2 == null) {
                            String message2 = e8.getMessage();
                            abstractC2003u2 = message2 != null ? C1998p.m4815M2(message2) : null;
                        }
                        if (abstractC2003u2 == null) {
                            abstractC2003u2 = AbstractC2003u.f9130m;
                        }
                        AbstractC1984c0 m4867y23 = AbstractC2003u.m4867y2(c1988f, abstractC2003u2);
                        C1981b c1981b4 = c2132a.f9604g2;
                        if (c1981b4 != null && (c2135d = c1981b4.f8950q2) != null) {
                            c2135d.m5185S2();
                        }
                        return m4867y23;
                    }
                } catch (Throwable th) {
                    C1981b c1981b5 = c2132a.f9604g2;
                    if (c1981b5 != null && (c2135d3 = c1981b5.f8950q2) != null) {
                        c2135d3.m5185S2();
                    }
                    throw th;
                }
            } finally {
                c2000r.f9075f2 = abstractC2003u;
            }
        }
    }

    /* renamed from: w6.a$c */
    public static final class c extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            String m4644K = abstractC1984c0.m4644K(1, "collect");
            if ("collect".equals(m4644K)) {
                System.gc();
                return AbstractC2003u.f9126Z;
            }
            if ("count".equals(m4644K)) {
                Runtime runtime = Runtime.getRuntime();
                long freeMemory = runtime.totalMemory() - runtime.freeMemory();
                return AbstractC2003u.m4867y2(C1990h.m4698E2(freeMemory / 1024.0d), C1993k.m4766D2(freeMemory % 1024));
            }
            if ("step".equals(m4644K)) {
                System.gc();
                return AbstractC2003u.f9131s;
            }
            AbstractC2003u.m4863R(1, "invalid option '" + m4644K + "'");
            throw null;
        }
    }

    /* renamed from: w6.a$d */
    public final class d extends AbstractC2150s {
        public d() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            AbstractC1984c0 m5171I2;
            if (!(abstractC1984c0.m4642H() || abstractC1984c0.m4641G(1))) {
                AbstractC2003u.m4863R(1, "filename must be string or nil");
                throw null;
            }
            String m4646N = abstractC1984c0.m4642H() ? abstractC1984c0.m4646N(1) : null;
            C2132a c2132a = C2132a.this;
            if (m4646N == null) {
                c2132a.f9604g2.getClass();
                m5171I2 = c2132a.m5172J2(null, "=stdin", "bt", c2132a.f9604g2);
            } else {
                m5171I2 = c2132a.m5171I2(abstractC1984c0.m4649x(1), "bt", c2132a.f9604g2);
            }
            if (m5171I2.m4641G(1)) {
                throw new C1991i(m5171I2.m4646N(2));
            }
            return m5171I2.mo4624u().m4876V0();
        }
    }

    /* renamed from: w6.a$e */
    public static final class e extends AbstractC2149r {
        @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            if (abstractC2003u.mo4804d1()) {
                throw new C1991i(AbstractC2003u.f9130m);
            }
            if (!abstractC2003u.mo4809f1() || abstractC2003u2.mo4699C1(1) == 0) {
                throw new C1991i(abstractC2003u);
            }
            throw new C1991i(abstractC2003u2.mo4699C1(1), abstractC2003u.mo4645M());
        }
    }

    /* renamed from: w6.a$f */
    public final class f extends AbstractC2141j {
        public f() {
        }

        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            C2135d.a m5194d = C2132a.this.f9604g2.f8948o2.f9073d2.m5194d(abstractC2003u.mo4740m0());
            if (m5194d != null) {
                return m5194d.m5187b(m5194d.f9647a.mo4694i0().f9008e2.f9152j + 1).mo4623t(2);
            }
            AbstractC2003u.m4863R(0, "function or level");
            throw null;
        }
    }

    /* renamed from: w6.a$g */
    public static final class g extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: d0 */
        public final AbstractC2003u mo4690d0() {
            AbstractC2003u.m4863R(1, "value expected");
            throw null;
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            AbstractC2003u mo4681M0 = abstractC2003u.mo4681M0();
            return mo4681M0 != null ? mo4681M0.mo4782R1(AbstractC2003u.f9102D1).mo4803H1(mo4681M0) : AbstractC2003u.f9130m;
        }
    }

    /* renamed from: w6.a$h */
    public static final class h extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return abstractC1984c0.m4636A(1).mo4779M2(abstractC1984c0.mo4623t(2));
        }
    }

    /* renamed from: w6.a$i */
    public static final class i extends AbstractC2150s {

        /* renamed from: g2 */
        public final h f9612g2 = new h();

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return AbstractC2003u.m4866x2(this.f9612g2, abstractC1984c0.m4636A(1), AbstractC2003u.f9126Z);
        }
    }

    /* renamed from: w6.a$j */
    public final class j extends AbstractC2150s {
        public j() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            InputStream aVar;
            AbstractC2003u mo4624u = abstractC1984c0.mo4624u();
            if (!mo4624u.mo4809f1() && !mo4624u.mo4763Y0()) {
                throw new C1991i("bad argument #1 to 'load' (string or function expected, got " + mo4624u.mo4676u2() + ")");
            }
            String m4644K = abstractC1984c0.m4644K(2, mo4624u.mo4809f1() ? mo4624u.mo4645M() : "=(load)");
            String m4644K2 = abstractC1984c0.m4644K(3, "bt");
            C2132a c2132a = C2132a.this;
            AbstractC2003u abstractC2003u = c2132a.f9604g2;
            if (4 <= abstractC1984c0.mo4621I()) {
                abstractC2003u = abstractC1984c0.mo4623t(4);
            }
            if (mo4624u.mo4809f1()) {
                C1998p mo4735i2 = mo4624u.mo4735i2();
                mo4735i2.getClass();
                aVar = new ByteArrayInputStream(mo4735i2.f9039c2, mo4735i2.f9040d2, mo4735i2.f9041e2);
            } else {
                aVar = new a(mo4624u.mo4764k0());
            }
            return c2132a.m5172J2(aVar, m4644K, m4644K2, abstractC2003u);
        }
    }

    /* renamed from: w6.a$k */
    public final class k extends AbstractC2150s {
        public k() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            if (!(abstractC1984c0.m4642H() || abstractC1984c0.m4641G(1))) {
                AbstractC2003u.m4863R(1, "filename must be string or nil");
                throw null;
            }
            String m4646N = abstractC1984c0.m4642H() ? abstractC1984c0.m4646N(1) : null;
            String m4644K = abstractC1984c0.m4644K(2, "bt");
            C2132a c2132a = C2132a.this;
            AbstractC2003u abstractC2003u = c2132a.f9604g2;
            if (3 <= abstractC1984c0.mo4621I()) {
                abstractC2003u = abstractC1984c0.mo4623t(3);
            }
            if (m4646N != null) {
                return c2132a.m5171I2(m4646N, m4644K, abstractC2003u);
            }
            c2132a.f9604g2.getClass();
            return c2132a.m5172J2(null, "=stdin", m4644K, abstractC2003u);
        }
    }

    /* renamed from: w6.a$l */
    public final class l extends AbstractC2150s {
        public l() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1998p m4651z = abstractC1984c0.m4651z(1);
            m4651z.getClass();
            String m4644K = abstractC1984c0.m4644K(2, m4651z.mo4645M());
            String m4644K2 = abstractC1984c0.m4644K(3, "bt");
            C2132a c2132a = C2132a.this;
            AbstractC2003u abstractC2003u = c2132a.f9604g2;
            if (4 <= abstractC1984c0.mo4621I()) {
                abstractC2003u = abstractC1984c0.mo4623t(4);
            }
            return c2132a.m5172J2(new ByteArrayInputStream(m4651z.f9039c2, m4651z.f9040d2, m4651z.f9041e2), m4644K, m4644K2, abstractC2003u);
        }
    }

    /* renamed from: w6.a$m */
    public static final class m extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return abstractC1984c0.m4636A(1).mo4796x1(abstractC1984c0.mo4623t(2));
        }
    }

    /* renamed from: w6.a$n */
    public static final class n extends AbstractC2150s {

        /* renamed from: g2 */
        public final m f9616g2;

        public n(m mVar) {
            this.f9616g2 = mVar;
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return AbstractC2003u.m4866x2(this.f9616g2, abstractC1984c0.m4636A(1), AbstractC2003u.f9130m);
        }
    }

    /* renamed from: w6.a$o */
    public final class o extends AbstractC2150s {
        public o() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2135d c2135d;
            C2135d c2135d2;
            C2135d c2135d3;
            C2135d c2135d4;
            C2135d c2135d5;
            C1988f c1988f = AbstractC2003u.f9122X;
            AbstractC2003u m4638C = abstractC1984c0.m4638C(1);
            C2132a c2132a = C2132a.this;
            C1981b c1981b = c2132a.f9604g2;
            if (c1981b != null && (c2135d5 = c1981b.f8950q2) != null) {
                c2135d5.m5183Q2(this);
            }
            try {
                try {
                    try {
                        AbstractC1984c0 m4867y2 = AbstractC2003u.m4867y2(AbstractC2003u.f9131s, m4638C.mo4689W0(abstractC1984c0.mo4622L(2)));
                        C1981b c1981b2 = c2132a.f9604g2;
                        if (c1981b2 != null && (c2135d4 = c1981b2.f8950q2) != null) {
                            c2135d4.m5185S2();
                        }
                        return m4867y2;
                    } catch (Exception e7) {
                        String message = e7.getMessage();
                        if (message == null) {
                            message = e7.toString();
                        }
                        AbstractC1984c0 m4867y22 = AbstractC2003u.m4867y2(c1988f, C1998p.m4815M2(message));
                        C1981b c1981b3 = c2132a.f9604g2;
                        if (c1981b3 != null && (c2135d2 = c1981b3.f8950q2) != null) {
                            c2135d2.m5185S2();
                        }
                        return m4867y22;
                    }
                } catch (C1991i e8) {
                    AbstractC2003u abstractC2003u = e8.f9016Y;
                    if (abstractC2003u == null) {
                        String message2 = e8.getMessage();
                        abstractC2003u = message2 != null ? C1998p.m4815M2(message2) : null;
                    }
                    if (abstractC2003u == null) {
                        abstractC2003u = AbstractC2003u.f9130m;
                    }
                    AbstractC1984c0 m4867y23 = AbstractC2003u.m4867y2(c1988f, abstractC2003u);
                    C1981b c1981b4 = c2132a.f9604g2;
                    if (c1981b4 != null && (c2135d = c1981b4.f8950q2) != null) {
                        c2135d.m5185S2();
                    }
                    return m4867y23;
                }
            } catch (Throwable th) {
                C1981b c1981b5 = c2132a.f9604g2;
                if (c1981b5 != null && (c2135d3 = c1981b5.f8950q2) != null) {
                    c2135d3.m5185S2();
                }
                throw th;
            }
        }
    }

    /* renamed from: w6.a$p */
    public final class p extends AbstractC2150s {
        public p() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2132a c2132a = C2132a.this;
            C1981b c1981b = c2132a.f9604g2;
            c1981b.getClass();
            AbstractC2003u mo4777L0 = c1981b.mo4777L0(C1998p.m4815M2("tostring"));
            int mo4621I = abstractC1984c0.mo4621I();
            for (int i7 = 1; i7 <= mo4621I; i7++) {
                if (i7 > 1) {
                    c2132a.f9604g2.f8945l2.print('\t');
                }
                c2132a.f9604g2.f8945l2.print(mo4777L0.mo4691f0(abstractC1984c0.mo4623t(i7)).mo4735i2().mo4645M());
            }
            c2132a.f9604g2.f8945l2.print('\n');
            return AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.a$q */
    public static final class q extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: d0 */
        public final AbstractC2003u mo4690d0() {
            AbstractC2003u.m4863R(1, "value expected");
            throw null;
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            AbstractC2003u.m4863R(2, "value expected");
            throw null;
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            return abstractC2003u.mo4674Q1(abstractC2003u2) ? AbstractC2003u.f9131s : AbstractC2003u.f9122X;
        }
    }

    /* renamed from: w6.a$r */
    public static final class r extends C2147p {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            AbstractC2003u.m4863R(2, "value expected");
            throw null;
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            return abstractC2003u.mo4795t0().mo4782R1(abstractC2003u2);
        }
    }

    /* renamed from: w6.a$s */
    public static final class s extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return C1993k.m4765C2(abstractC2003u.mo4784S1());
        }
    }

    /* renamed from: w6.a$t */
    public static final class t extends C2147p {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            AbstractC2003u.m4863R(2, "value expected");
            throw null;
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            AbstractC2003u.m4863R(3, "value expected");
            throw null;
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: h0 */
        public final AbstractC2003u mo4693h0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
            C1999q mo4795t0 = abstractC2003u.mo4795t0();
            if (abstractC2003u2.mo4734i1()) {
                mo4795t0.mo4787V1(abstractC2003u2, abstractC2003u3);
                return mo4795t0;
            }
            AbstractC2003u.m4863R(2, "table index is nil");
            throw null;
        }
    }

    /* renamed from: w6.a$u */
    public static final class u extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            int mo4621I = abstractC1984c0.mo4621I() - 1;
            if (abstractC1984c0.mo4624u().equals(C1998p.m4815M2("#"))) {
                return C1993k.m4765C2(mo4621I);
            }
            int m4648w = abstractC1984c0.m4648w(1);
            if (m4648w != 0 && m4648w >= (-mo4621I)) {
                return abstractC1984c0.mo4622L(m4648w < 0 ? mo4621I + m4648w + 2 : m4648w + 1);
            }
            AbstractC2003u.m4863R(1, "index out of range");
            throw null;
        }
    }

    /* renamed from: w6.a$v */
    public final class v extends AbstractC2149r {
        public v() {
        }

        @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            C1999q mo4795t0 = abstractC2003u2.mo4795t0();
            C2135d.a m5194d = C2132a.this.f9604g2.f8948o2.f9073d2.m5194d(abstractC2003u.mo4740m0());
            if (m5194d != null) {
                m5194d.m5189d(m5194d.f9647a.mo4694i0().f9008e2.f9152j + 1, mo4795t0);
                return AbstractC2003u.f9124Y;
            }
            AbstractC2003u.m4863R(0, "function or level");
            throw null;
        }
    }

    /* renamed from: w6.a$w */
    public static final class w extends C2147p {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            AbstractC2003u.m4863R(2, "nil or table expected");
            throw null;
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            AbstractC2003u mo4681M0 = abstractC2003u.mo4795t0().mo4681M0();
            if (mo4681M0 == null || mo4681M0.mo4782R1(AbstractC2003u.f9102D1).mo4804d1()) {
                return abstractC2003u.mo4792Z1(abstractC2003u2.mo4804d1() ? null : abstractC2003u2.mo4795t0());
            }
            AbstractC2003u.m4861I0("cannot change a protected metatable");
            throw null;
        }
    }

    /* renamed from: w6.a$x */
    public static final class x extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return C1993k.m4766D2(abstractC2003u.mo4748p2());
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            if (abstractC2003u2.mo4804d1()) {
                return C1993k.m4766D2(abstractC2003u.mo4748p2());
            }
            int mo4740m0 = abstractC2003u2.mo4740m0();
            if (mo4740m0 >= 2 && mo4740m0 <= 36) {
                return mo4691f0(abstractC2003u.mo4753s0().m4824L2(mo4740m0));
            }
            AbstractC2003u.m4863R(2, "base out of range");
            throw null;
        }
    }

    /* renamed from: w6.a$y */
    public static final class y extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4750q2();
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            if (abstractC2003u2.mo4804d1()) {
                return abstractC2003u.mo4750q2();
            }
            int mo4740m0 = abstractC2003u2.mo4740m0();
            if (mo4740m0 >= 2 && mo4740m0 <= 36) {
                return abstractC2003u.mo4753s0().m4824L2(mo4740m0);
            }
            AbstractC2003u.m4863R(2, "base out of range");
            throw null;
        }
    }

    /* renamed from: w6.a$z */
    public static final class z extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            AbstractC2003u m4882q1 = abstractC2003u.m4882q1(AbstractC2003u.f9114P1);
            if (!m4882q1.mo4804d1()) {
                return m4882q1.mo4691f0(abstractC2003u);
            }
            AbstractC2003u mo4752r2 = abstractC2003u.mo4752r2();
            return !mo4752r2.mo4804d1() ? mo4752r2 : C1998p.m4815M2(abstractC2003u.mo4645M());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [w6.m, w6.r] */
    /* renamed from: I2 */
    public final AbstractC1984c0 m5171I2(String str, String str2, AbstractC2003u abstractC2003u) {
        InputStream mo5145s = this.f9604g2.f8947n2.mo5145s(str);
        if (mo5145s == null) {
            return AbstractC2003u.m4867y2(AbstractC2003u.f9130m, C1998p.m4815M2("cannot open " + str + ": No such file or directory"));
        }
        try {
            return m5172J2(mo5145s, "@" + str, str2, abstractC2003u);
        } finally {
            try {
                mo5145s.close();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    /* renamed from: J2 */
    public final AbstractC1984c0 m5172J2(InputStream inputStream, String str, String str2, AbstractC2003u abstractC2003u) {
        C1996n c1996n = AbstractC2003u.f9130m;
        try {
            if (inputStream != null) {
                return this.f9604g2.m4626a3(inputStream, str, str2, abstractC2003u);
            }
            return AbstractC2003u.m4867y2(c1996n, C1998p.m4815M2("not found: " + str));
        } catch (Exception e7) {
            return AbstractC2003u.m4867y2(c1996n, C1998p.m4815M2(e7.getMessage()));
        }
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        C1981b mo4629l0 = abstractC2003u2.mo4629l0();
        this.f9604g2 = mo4629l0;
        mo4629l0.f8947n2 = this;
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("_G"), abstractC2003u2);
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("_VERSION"), C1998p.m4815M2("Luaj-jse 3.0.1"));
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("assert"), new b());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("collectgarbage"), new c());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("dofile"), new d());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("error"), new e());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("getmetatable"), new g());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("load"), new j());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("loadstring"), new l());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("loadfile"), new k());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("pcall"), new o());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("print"), new p());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("rawequal"), new q());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("rawget"), new r());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("rawlen"), new s());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("rawset"), new t());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("select"), new u());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("setmetatable"), new w());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("tonumber"), new y());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("tointeger"), new x());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("tostring"), new z());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("type"), new a0());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("xpcall"), new b0());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("setfenv"), new v());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("getfenv"), new f());
        m mVar = new m();
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("next"), mVar);
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("pairs"), new n(mVar));
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("ipairs"), new i());
        return abstractC2003u2;
    }

    @Override // p180w6.InterfaceC2144m
    /* renamed from: s */
    public final InputStream mo5145s(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return C2132a.class.getResourceAsStream(str);
    }
}
