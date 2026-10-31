package p180w6;

import java.util.Random;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC1997o;
import p165u6.AbstractC2003u;
import p165u6.C1990h;
import p165u6.C1993k;
import p188x6.C2209j;

/* renamed from: w6.i */
/* loaded from: classes.dex */
public class C2140i extends AbstractC2149r {

    /* renamed from: g2 */
    public static C2140i f9702g2;

    /* renamed from: w6.i$a */
    public static abstract class a extends AbstractC2149r {
        /* renamed from: I2 */
        public abstract double mo5236I2(double d7, double d8);

        @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            return C1990h.m4698E2(mo5236I2(abstractC2003u.mo4736j0(), abstractC2003u2.mo4736j0()));
        }
    }

    /* renamed from: w6.i$b */
    public static abstract class b extends AbstractC2141j {
        /* renamed from: I2 */
        public abstract double mo5237I2(double d7);

        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return C1990h.m4698E2(mo5237I2(abstractC2003u.mo4736j0()));
        }
    }

    /* renamed from: w6.i$c */
    public static final class c extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.abs(d7);
        }
    }

    /* renamed from: w6.i$d */
    public static final class d extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.ceil(d7);
        }
    }

    /* renamed from: w6.i$e */
    public static final class e extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.cos(d7);
        }
    }

    /* renamed from: w6.i$f */
    public static final class f extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.toDegrees(d7);
        }
    }

    /* renamed from: w6.i$g */
    public static final class g extends b {

        /* renamed from: g2 */
        public final C2140i f9703g2;

        public g(C2140i c2140i) {
            this.f9703g2 = c2140i;
        }

        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            ((C2209j) this.f9703g2).getClass();
            return Math.pow(2.718281828459045d, d7);
        }
    }

    /* renamed from: w6.i$h */
    public static final class h extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.floor(d7);
        }
    }

    /* renamed from: w6.i$i */
    public static final class i extends AbstractC2149r {
        @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            return (abstractC2003u.mo4729c1() && abstractC2003u2.mo4729c1()) ? C1993k.m4766D2(abstractC2003u.mo4748p2() % abstractC2003u2.mo4748p2()) : C1990h.m4698E2(abstractC2003u.mo4736j0() % abstractC2003u2.mo4736j0());
        }
    }

    /* renamed from: w6.i$j */
    public static class j extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            double m4647v = abstractC1984c0.m4647v(1);
            if (m4647v == 0.0d) {
                C1993k c1993k = AbstractC2003u.f9126Z;
                return AbstractC2003u.m4867y2(c1993k, c1993k);
            }
            return AbstractC2003u.m4867y2(C1990h.m4698E2(((4503599627370495L & r0) + 4503599627370496L) * (Double.doubleToLongBits(m4647v) >= 0 ? 1.1102230246251565E-16d : -1.1102230246251565E-16d)), C1990h.m4698E2((((int) (r0 >> 52)) & 2047) - 1022));
        }
    }

    /* renamed from: w6.i$k */
    public static final class k extends a {
        @Override // p180w6.C2140i.a
        /* renamed from: I2 */
        public final double mo5236I2(double d7, double d8) {
            return Double.longBitsToDouble((((long) d8) + 1023) << 52) * d7;
        }
    }

    /* renamed from: w6.i$l */
    public static class l extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            AbstractC2003u m4638C = abstractC1984c0.m4638C(1);
            int mo4621I = abstractC1984c0.mo4621I();
            for (int i7 = 2; i7 <= mo4621I; i7++) {
                AbstractC2003u m4638C2 = abstractC1984c0.m4638C(i7);
                if (m4638C.mo4739l1(m4638C2)) {
                    m4638C = m4638C2;
                }
            }
            return m4638C;
        }
    }

    /* renamed from: w6.i$m */
    public static class m extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            AbstractC2003u m4638C = abstractC1984c0.m4638C(1);
            int mo4621I = abstractC1984c0.mo4621I();
            for (int i7 = 2; i7 <= mo4621I; i7++) {
                AbstractC2003u m4638C2 = abstractC1984c0.m4638C(i7);
                if (m4638C2.mo4739l1(m4638C)) {
                    m4638C = m4638C2;
                }
            }
            return m4638C;
        }
    }

    /* renamed from: w6.i$n */
    public static class n extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            AbstractC2003u mo4624u = abstractC1984c0.mo4624u();
            if (mo4624u.mo4729c1()) {
                return AbstractC2003u.m4867y2(mo4624u, C1990h.m4698E2(0.0d));
            }
            double mo4736j0 = mo4624u.mo4736j0();
            double floor = mo4736j0 > 0.0d ? Math.floor(mo4736j0) : Math.ceil(mo4736j0);
            return AbstractC2003u.m4867y2(C1990h.m4698E2(floor), C1990h.m4698E2(mo4736j0 != floor ? mo4736j0 - floor : 0.0d));
        }
    }

    /* renamed from: w6.i$o */
    public static final class o extends a {
        @Override // p180w6.C2140i.a
        /* renamed from: I2 */
        public final double mo5236I2(double d7, double d8) {
            return C2140i.m5235J2(d7, d8);
        }
    }

    /* renamed from: w6.i$p */
    public static final class p extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.toRadians(d7);
        }
    }

    /* renamed from: w6.i$q */
    public static class q extends AbstractC2139h {

        /* renamed from: g2 */
        public Random f9704g2 = new Random();

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: d0 */
        public final AbstractC2003u mo4690d0() {
            return C1990h.m4698E2(this.f9704g2.nextDouble());
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            int mo4740m0 = abstractC2003u.mo4740m0();
            if (mo4740m0 >= 1) {
                return C1993k.m4765C2(this.f9704g2.nextInt(mo4740m0) + 1);
            }
            AbstractC2003u.m4863R(1, "interval is empty");
            throw null;
        }

        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            int mo4740m0 = abstractC2003u.mo4740m0();
            int mo4740m02 = abstractC2003u2.mo4740m0();
            if (mo4740m02 >= mo4740m0) {
                return C1993k.m4765C2(this.f9704g2.nextInt((mo4740m02 + 1) - mo4740m0) + mo4740m0);
            }
            AbstractC2003u.m4863R(2, "interval is empty");
            throw null;
        }
    }

    /* renamed from: w6.i$r */
    public static class r extends AbstractC2141j {

        /* renamed from: g2 */
        public final q f9705g2;

        public r(q qVar) {
            this.f9705g2 = qVar;
        }

        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            this.f9705g2.f9704g2 = new Random(abstractC2003u.mo4745o0());
            return AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.i$s */
    public static final class s extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.sin(d7);
        }
    }

    /* renamed from: w6.i$t */
    public static final class t extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.sqrt(d7);
        }
    }

    /* renamed from: w6.i$u */
    public static final class u extends b {
        @Override // p180w6.C2140i.b
        /* renamed from: I2 */
        public final double mo5237I2(double d7) {
            return Math.tan(d7);
        }
    }

    public C2140i() {
        f9702g2 = this;
    }

    /* renamed from: I2 */
    public static AbstractC1997o m5234I2(double d7, double d8) {
        return C1990h.m4698E2(f9702g2 != null ? Math.pow(d7, d8) : m5235J2(d7, d8));
    }

    /* renamed from: J2 */
    public static double m5235J2(double d7, double d8) {
        double d9 = 1.0d;
        if (d8 < 0.0d) {
            return 1.0d / m5235J2(d7, -d8);
        }
        int i7 = (int) d8;
        double d10 = d7;
        while (i7 > 0) {
            if ((i7 & 1) != 0) {
                d9 *= d10;
            }
            i7 >>= 1;
            d10 *= d10;
        }
        double d11 = d8 - i7;
        if (d11 > 0.0d) {
            for (int i8 = (int) (d11 * 65536.0d); (65535 & i8) != 0; i8 <<= 1) {
                d7 = Math.sqrt(d7);
                if ((32768 & i8) != 0) {
                    d9 *= d7;
                }
            }
        }
        return d9;
    }
}
