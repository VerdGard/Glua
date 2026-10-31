package p165u6;

import android.ext.C0090b;
import p120p.C1686g;
import p165u6.AbstractC1984c0;

/* renamed from: u6.u */
/* loaded from: classes.dex */
public abstract class AbstractC2003u extends AbstractC1984c0 {

    /* renamed from: A1 */
    public static final C1998p f9099A1;

    /* renamed from: B1 */
    public static final C1998p f9100B1;

    /* renamed from: C1 */
    public static final C1998p f9101C1;

    /* renamed from: D1 */
    public static final C1998p f9102D1;

    /* renamed from: E1 */
    public static final C1998p f9103E1;

    /* renamed from: F1 */
    public static final C1998p f9104F1;

    /* renamed from: G1 */
    public static final C1998p f9105G1;

    /* renamed from: H1 */
    public static final C1998p f9106H1;

    /* renamed from: I1 */
    public static final C1998p f9107I1;

    /* renamed from: J1 */
    public static final C1998p f9108J1;

    /* renamed from: K1 */
    public static final C1998p f9109K1;

    /* renamed from: L1 */
    public static final C1998p f9110L1;

    /* renamed from: M1 */
    public static final C1998p f9111M1;

    /* renamed from: N1 */
    public static final C1998p f9112N1;

    /* renamed from: O1 */
    public static final C1998p f9113O1;

    /* renamed from: P1 */
    public static final C1998p f9114P1;

    /* renamed from: Q1 */
    public static final C1998p f9115Q1;

    /* renamed from: R1 */
    public static final C1998p f9116R1;

    /* renamed from: S1 */
    public static final int f9117S1;

    /* renamed from: T1 */
    public static final AbstractC2003u[] f9118T1;

    /* renamed from: U1 */
    public static final C1998p f9119U1;

    /* renamed from: V1 */
    public static final C1998p f9120V1;

    /* renamed from: W1 */
    public static final C1998p f9121W1;

    /* renamed from: X1 */
    public static final C1998p f9123X1;

    /* renamed from: Y1 */
    public static final C1998p f9125Y1;

    /* renamed from: Z1 */
    public static final C1998p f9127Z1;

    /* renamed from: a2 */
    public static final C1998p f9128a2;

    /* renamed from: b2 */
    public static final C1998p f9129b2;

    /* renamed from: x1 */
    public static final AbstractC2003u[] f9133x1;

    /* renamed from: y1 */
    public static final C1998p f9134y1;

    /* renamed from: z1 */
    public static final C1998p f9135z1;

    /* renamed from: e */
    public AbstractC2003u f9136e;

    /* renamed from: m */
    public static final C1996n f9130m = C1996n.f9035c2;

    /* renamed from: s */
    public static final C1988f f9131s = C1988f.f9003d2;

    /* renamed from: X */
    public static final C1988f f9122X = C1988f.f9004e2;

    /* renamed from: Y */
    public static final a f9124Y = a.f9137e2;

    /* renamed from: Z */
    public static final C1993k f9126Z = C1993k.m4765C2(0);

    /* renamed from: w1 */
    public static final C1993k f9132w1 = C1993k.m4765C2(1);

    /* renamed from: u6.u$a */
    public static final class a extends C1996n {

        /* renamed from: e2 */
        public static final a f9137e2 = new a();

        @Override // p165u6.AbstractC1984c0
        /* renamed from: D */
        public final void mo4639D(AbstractC2003u[] abstractC2003uArr, int i7, int i8) {
            while (i8 > 0) {
                abstractC2003uArr[i7] = AbstractC2003u.f9130m;
                i8--;
                i7++;
            }
        }

        @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: I */
        public final int mo4621I() {
            return 0;
        }

        @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: L */
        public final AbstractC1984c0 mo4622L(int i7) {
            if (i7 > 0) {
                return this;
            }
            AbstractC2003u.m4863R(1, "start must be > 0");
            throw null;
        }

        @Override // p165u6.C1996n, p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: M */
        public final String mo4645M() {
            return "none";
        }

        @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: t */
        public final AbstractC2003u mo4623t(int i7) {
            return AbstractC2003u.f9130m;
        }

        @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: u */
        public final AbstractC2003u mo4624u() {
            return AbstractC2003u.f9130m;
        }
    }

    static {
        C1993k.m4765C2(-1);
        f9133x1 = new AbstractC2003u[0];
        f9134y1 = C1998p.m4815M2("_ENV");
        f9135z1 = C1998p.m4815M2("__index");
        f9099A1 = C1998p.m4815M2("__newindex");
        f9100B1 = C1998p.m4815M2("__call");
        f9101C1 = C1998p.m4815M2("__mode");
        f9102D1 = C1998p.m4815M2("__metatable");
        f9103E1 = C1998p.m4815M2("__add");
        f9104F1 = C1998p.m4815M2("__sub");
        f9105G1 = C1998p.m4815M2("__div");
        f9106H1 = C1998p.m4815M2("__mul");
        f9107I1 = C1998p.m4815M2("__pow");
        f9108J1 = C1998p.m4815M2("__mod");
        f9109K1 = C1998p.m4815M2("__unm");
        f9110L1 = C1998p.m4815M2("__len");
        f9111M1 = C1998p.m4815M2("__eq");
        f9112N1 = C1998p.m4815M2("__lt");
        f9113O1 = C1998p.m4815M2("__le");
        f9114P1 = C1998p.m4815M2("__tostring");
        f9115Q1 = C1998p.m4815M2("__concat");
        f9116R1 = C1998p.m4815M2("");
        f9117S1 = 250;
        f9118T1 = new AbstractC2003u[250];
        for (int i7 = 0; i7 < f9117S1; i7++) {
            f9118T1[i7] = f9130m;
        }
        byte[] bytes = "__name".getBytes();
        f9119U1 = new C1998p(bytes, 0, bytes.length);
        f9120V1 = C1998p.m4815M2("__idiv");
        f9121W1 = C1998p.m4815M2("__band");
        f9123X1 = C1998p.m4815M2("__bor");
        f9125Y1 = C1998p.m4815M2("__bxor");
        f9127Z1 = C1998p.m4815M2("__shl");
        f9128a2 = C1998p.m4815M2("__shr");
        f9129b2 = C1998p.m4815M2("__bnot");
    }

    /* renamed from: A2 */
    public static AbstractC1984c0 m4858A2(AbstractC2003u[] abstractC2003uArr, int i7, int i8) {
        a aVar = f9124Y;
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? new AbstractC1984c0.a(abstractC2003uArr, i7, i8, aVar) : new AbstractC1984c0.c(abstractC2003uArr[i7 + 0], abstractC2003uArr[i7 + 1]) : abstractC2003uArr[i7] : aVar;
    }

    /* renamed from: B2 */
    public static AbstractC1984c0 m4859B2(AbstractC2003u[] abstractC2003uArr, int i7, int i8, AbstractC1984c0 abstractC1984c0) {
        if (i8 == 0) {
            return abstractC1984c0;
        }
        if (i8 == 1) {
            return abstractC1984c0.mo4621I() > 0 ? new AbstractC1984c0.c(abstractC2003uArr[i7], abstractC1984c0) : abstractC2003uArr[i7];
        }
        if (i8 == 2 && abstractC1984c0.mo4621I() <= 0) {
            return new AbstractC1984c0.c(abstractC2003uArr[i7], abstractC2003uArr[i7 + 1]);
        }
        return new AbstractC1984c0.a(abstractC2003uArr, i7, i8, abstractC1984c0);
    }

    /* renamed from: H0 */
    public static final boolean m4860H0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3, AbstractC2003u abstractC2003u4) {
        C1998p c1998p = f9111M1;
        AbstractC2003u mo4782R1 = abstractC2003u2.mo4782R1(c1998p);
        if (mo4782R1.mo4804d1() || mo4782R1 != abstractC2003u4.mo4782R1(c1998p)) {
            return false;
        }
        return mo4782R1.mo4692g0(abstractC2003u, abstractC2003u3).mo4682m2();
    }

    /* renamed from: I0 */
    public static void m4861I0(String str) {
        throw new C1991i(str);
    }

    /* renamed from: N0 */
    public static AbstractC2003u m4862N0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        AbstractC2003u m4882q1;
        AbstractC2003u mo4782R1;
        int i7 = 0;
        while (true) {
            boolean mo4839g1 = abstractC2003u.mo4839g1();
            C1998p c1998p = f9135z1;
            if (mo4839g1) {
                mo4782R1 = abstractC2003u.mo4782R1(abstractC2003u2);
                if (!mo4782R1.mo4804d1()) {
                    break;
                }
                AbstractC2003u m4882q12 = abstractC2003u.m4882q1(c1998p);
                if (m4882q12.mo4804d1()) {
                    break;
                }
                m4882q1 = m4882q12;
            } else {
                m4882q1 = abstractC2003u.m4882q1(c1998p);
                if (m4882q1.mo4804d1()) {
                    m4861I0("attempt to index (a " + abstractC2003u.mo4676u2() + " value)");
                    throw null;
                }
            }
            if (m4882q1.mo4763Y0()) {
                return m4882q1.mo4692g0(abstractC2003u, abstractC2003u2);
            }
            i7++;
            if (i7 >= 100) {
                m4861I0("loop in gettable");
                throw null;
            }
            abstractC2003u = m4882q1;
        }
        return mo4782R1;
    }

    /* renamed from: R */
    public static void m4863R(int i7, String str) {
        throw new C1991i("bad argument #" + i7 + ": " + str);
    }

    /* renamed from: a2 */
    public static void m4864a2(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
        AbstractC2003u m4882q1;
        int i7 = 0;
        while (true) {
            boolean mo4839g1 = abstractC2003u.mo4839g1();
            C1998p c1998p = f9099A1;
            if (!mo4839g1) {
                m4882q1 = abstractC2003u.m4882q1(c1998p);
                if (m4882q1.mo4804d1()) {
                    abstractC2003u.m4883v2("index");
                    throw null;
                }
            } else {
                if (!abstractC2003u.mo4782R1(abstractC2003u2).mo4804d1()) {
                    break;
                }
                m4882q1 = abstractC2003u.m4882q1(c1998p);
                if (m4882q1.mo4804d1()) {
                    break;
                }
            }
            if (m4882q1.mo4763Y0()) {
                m4882q1.mo4693h0(abstractC2003u, abstractC2003u2, abstractC2003u3);
                return;
            }
            i7++;
            if (i7 >= 100) {
                m4861I0("loop in settable");
                throw null;
            }
            abstractC2003u = m4882q1;
        }
        abstractC2003u.mo4787V1(abstractC2003u2, abstractC2003u3);
    }

    /* renamed from: p1 */
    public static InterfaceC2004v m4865p1(AbstractC2003u abstractC2003u) {
        if (abstractC2003u == null || !abstractC2003u.mo4839g1()) {
            if (abstractC2003u != null) {
                return new C2005w(abstractC2003u);
            }
            return null;
        }
        AbstractC2003u mo4782R1 = abstractC2003u.mo4782R1(f9101C1);
        if (mo4782R1.mo4809f1()) {
            String mo4645M = mo4782R1.mo4645M();
            boolean z6 = mo4645M.indexOf(107) >= 0;
            boolean z7 = mo4645M.indexOf(118) >= 0;
            if (z6 || z7) {
                return new C1986d0(z6, z7, abstractC2003u);
            }
        }
        return (C1999q) abstractC2003u;
    }

    /* renamed from: x2 */
    public static AbstractC1984c0 m4866x2(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC1984c0 abstractC1984c0) {
        return abstractC1984c0.mo4621I() != 0 ? new AbstractC1984c0.a(new AbstractC2003u[]{abstractC2003u, abstractC2003u2}, 0, 2, abstractC1984c0) : new AbstractC1984c0.c(abstractC2003u, abstractC2003u2);
    }

    /* renamed from: y2 */
    public static AbstractC1984c0 m4867y2(AbstractC2003u abstractC2003u, AbstractC1984c0 abstractC1984c0) {
        return abstractC1984c0.mo4621I() != 0 ? new AbstractC1984c0.c(abstractC2003u, abstractC1984c0) : abstractC2003u;
    }

    /* renamed from: z2 */
    public static AbstractC1984c0 m4868z2(AbstractC2003u[] abstractC2003uArr) {
        int length = abstractC2003uArr.length;
        a aVar = f9124Y;
        return length != 0 ? length != 1 ? length != 2 ? new AbstractC1984c0.b(abstractC2003uArr, aVar) : new AbstractC1984c0.c(abstractC2003uArr[0], abstractC2003uArr[1]) : abstractC2003uArr[0] : aVar;
    }

    /* renamed from: A0 */
    public AbstractC2003u mo4805A0(AbstractC2003u abstractC2003u) {
        return m4869D0(abstractC2003u);
    }

    /* renamed from: A1 */
    public boolean mo4680A1(boolean z6) {
        m4871S("boolean");
        throw null;
    }

    /* renamed from: B0 */
    public AbstractC2003u mo4806B0(AbstractC1997o abstractC1997o) {
        return abstractC1997o.m4869D0(this);
    }

    /* renamed from: B1 */
    public AbstractC1992j mo4759B1() {
        m4871S("function");
        throw null;
    }

    /* renamed from: C0 */
    public AbstractC2003u mo4807C0(C1998p c1998p) {
        return c1998p.m4869D0(this);
    }

    /* renamed from: C1 */
    public int mo4699C1(int i7) {
        m4871S("int");
        throw null;
    }

    /* renamed from: D0 */
    public final AbstractC2003u m4869D0(AbstractC2003u abstractC2003u) {
        C1998p c1998p = f9115Q1;
        AbstractC2003u m4882q1 = m4882q1(c1998p);
        if (m4882q1.mo4804d1()) {
            m4882q1 = abstractC2003u.m4882q1(c1998p);
            if (m4882q1.mo4804d1()) {
                m4861I0("attempt to concatenate " + mo4676u2() + " and " + abstractC2003u.mo4676u2());
                throw null;
            }
        }
        return m4882q1.mo4692g0(this, abstractC2003u);
    }

    /* renamed from: D1 */
    public String mo4700D1(String str) {
        m4871S("String");
        throw null;
    }

    /* renamed from: E0 */
    public AbstractC2003u mo4701E0(AbstractC2003u abstractC2003u) {
        return m4872T(f9105G1, abstractC2003u);
    }

    /* renamed from: E1 */
    public C1998p mo4702E1() {
        m4871S("string");
        throw null;
    }

    /* renamed from: F0 */
    public AbstractC2003u mo4703F0(double d7) {
        return m4874U(f9105G1, d7);
    }

    /* renamed from: F1 */
    public C1999q mo4773F1() {
        m4871S("table");
        throw null;
    }

    /* renamed from: G0 */
    public boolean mo4704G0(AbstractC2003u abstractC2003u) {
        return this == abstractC2003u;
    }

    /* renamed from: G1 */
    public Object mo4802G1(Class cls) {
        m4871S(cls.getName());
        throw null;
    }

    /* renamed from: H1 */
    public AbstractC2003u mo4803H1(AbstractC2003u abstractC2003u) {
        return this;
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: I */
    public int mo4621I() {
        return 1;
    }

    /* renamed from: I1 */
    public AbstractC2003u mo4705I1(AbstractC2003u abstractC2003u) {
        return m4872T(f9107I1, abstractC2003u);
    }

    /* renamed from: J0 */
    public AbstractC2003u mo4776J0(int i7) {
        return mo4777L0(C1993k.m4765C2(i7));
    }

    /* renamed from: J1 */
    public AbstractC2003u mo4706J1(double d7) {
        return m4874U(f9107I1, d7);
    }

    /* renamed from: K0 */
    public final AbstractC2003u m4870K0(String str) {
        return mo4777L0(C1998p.m4815M2(str));
    }

    /* renamed from: K1 */
    public AbstractC2003u mo4707K1(long j7) {
        return mo4706J1(j7);
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: L */
    public AbstractC1984c0 mo4622L(int i7) {
        if (i7 == 1) {
            return this;
        }
        if (i7 > 1) {
            return f9124Y;
        }
        m4863R(1, "start must be > 0");
        throw null;
    }

    /* renamed from: L0 */
    public AbstractC2003u mo4777L0(AbstractC2003u abstractC2003u) {
        return m4862N0(this, abstractC2003u);
    }

    /* renamed from: L1 */
    public void mo4778L1(int i7) {
        m4883v2("table");
        throw null;
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: M */
    public String mo4645M() {
        return mo4676u2() + ": " + Integer.toHexString(hashCode());
    }

    /* renamed from: M0 */
    public AbstractC2003u mo4681M0() {
        return null;
    }

    /* renamed from: M1 */
    public boolean mo4708M1(double d7) {
        return false;
    }

    /* renamed from: N1 */
    public boolean mo4709N1(long j7) {
        return false;
    }

    /* renamed from: O */
    public AbstractC2003u mo4710O(double d7) {
        return m4874U(f9103E1, d7);
    }

    /* renamed from: O0 */
    public boolean mo4711O0(double d7) {
        m4885x0();
        throw null;
    }

    /* renamed from: O1 */
    public boolean mo4825O1(C1998p c1998p) {
        return false;
    }

    /* renamed from: P */
    public AbstractC2003u mo4767P(long j7) {
        return mo4710O(j7);
    }

    /* renamed from: P0 */
    public boolean mo4712P0(long j7) {
        m4885x0();
        throw null;
    }

    /* renamed from: P1 */
    public boolean mo4849P1(C2001s c2001s) {
        return false;
    }

    /* renamed from: Q */
    public AbstractC2003u mo4713Q(AbstractC2003u abstractC2003u) {
        return m4872T(f9103E1, abstractC2003u);
    }

    /* renamed from: Q0 */
    public boolean mo4714Q0(double d7) {
        m4885x0();
        throw null;
    }

    /* renamed from: Q1 */
    public boolean mo4674Q1(AbstractC2003u abstractC2003u) {
        return this == abstractC2003u;
    }

    /* renamed from: R0 */
    public boolean mo4715R0(long j7) {
        m4885x0();
        throw null;
    }

    /* renamed from: R1 */
    public AbstractC2003u mo4782R1(AbstractC2003u abstractC2003u) {
        m4884w2("rawget");
        throw null;
    }

    /* renamed from: S */
    public final void m4871S(String str) {
        StringBuilder m222h = C0090b.m222h("bad argument: ", str, " expected, got ");
        m222h.append(mo4676u2());
        throw new C1991i(m222h.toString());
    }

    /* renamed from: S0 */
    public boolean mo4716S0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.m4886y0(f9112N1, this).mo4682m2();
    }

    /* renamed from: S1 */
    public int mo4784S1() {
        m4883v2("table or string");
        throw null;
    }

    /* renamed from: T */
    public final AbstractC2003u m4872T(C1998p c1998p, AbstractC2003u abstractC2003u) {
        AbstractC2003u m4882q1 = m4882q1(c1998p);
        if (m4882q1.mo4804d1()) {
            m4882q1 = abstractC2003u.m4882q1(c1998p);
            if (m4882q1.mo4804d1()) {
                m4861I0("attempt to perform arithmetic " + c1998p + " on " + mo4676u2() + " and " + abstractC2003u.mo4676u2());
                throw null;
            }
        }
        return m4882q1.mo4692g0(this, abstractC2003u);
    }

    /* renamed from: T0 */
    public AbstractC2003u mo4717T0(long j7) {
        return m4874U(f9120V1, j7);
    }

    /* renamed from: T1 */
    public final void m4873T1(String str, int i7) {
        mo4787V1(C1998p.m4815M2(str), C1993k.m4765C2(i7));
    }

    /* renamed from: U */
    public final AbstractC2003u m4874U(C1998p c1998p, double d7) {
        AbstractC2003u m4882q1 = m4882q1(c1998p);
        if (!m4882q1.mo4804d1()) {
            return m4882q1.mo4692g0(C1990h.m4698E2(d7), this);
        }
        m4861I0("attempt to perform arithmetic " + c1998p + " on number and " + mo4676u2());
        throw null;
    }

    /* renamed from: U0 */
    public AbstractC2003u mo4718U0(AbstractC2003u abstractC2003u) {
        return m4872T(f9120V1, abstractC2003u);
    }

    /* renamed from: U1 */
    public final void m4875U1(String str, String str2) {
        mo4787V1(C1998p.m4815M2(str), C1998p.m4815M2(str2));
    }

    /* renamed from: V */
    public AbstractC2003u mo4719V(long j7) {
        return m4874U(f9121W1, j7);
    }

    /* renamed from: V0 */
    public final AbstractC1984c0 m4876V0() {
        return mo4689W0(f9124Y);
    }

    /* renamed from: V1 */
    public void mo4787V1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        m4884w2("rawset");
        throw null;
    }

    /* renamed from: W */
    public AbstractC2003u mo4720W(AbstractC2003u abstractC2003u) {
        return m4872T(f9121W1, abstractC2003u);
    }

    /* renamed from: W0 */
    public AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        return m4881p0("attempt to call ", f9100B1).mo4689W0(m4867y2(this, abstractC1984c0));
    }

    /* renamed from: W1 */
    public void mo4788W1(int i7, AbstractC2003u abstractC2003u) {
        mo4790Y1(C1993k.m4765C2(i7), abstractC2003u);
    }

    /* renamed from: X */
    public AbstractC2003u mo4721X() {
        return m4881p0("attempt to perform arithmetic on ", f9129b2).mo4691f0(this);
    }

    /* renamed from: X0 */
    public AbstractC1984c0 mo4877X0(AbstractC2003u[] abstractC2003uArr) {
        return mo4689W0(m4868z2(abstractC2003uArr));
    }

    /* renamed from: X1 */
    public final void m4878X1(String str, AbstractC2003u abstractC2003u) {
        mo4790Y1(C1998p.m4815M2(str), abstractC2003u);
    }

    /* renamed from: Y */
    public AbstractC2003u mo4722Y(long j7) {
        return m4874U(f9123X1, j7);
    }

    /* renamed from: Y0 */
    public boolean mo4763Y0() {
        return false;
    }

    /* renamed from: Y1 */
    public void mo4790Y1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        m4864a2(this, abstractC2003u, abstractC2003u2);
    }

    /* renamed from: Z */
    public AbstractC2003u mo4723Z(AbstractC2003u abstractC2003u) {
        return m4872T(f9123X1, abstractC2003u);
    }

    /* renamed from: Z0 */
    public boolean mo4724Z0() {
        return this instanceof C1993k;
    }

    /* renamed from: Z1 */
    public AbstractC2003u mo4792Z1(AbstractC2003u abstractC2003u) {
        m4871S("table");
        throw null;
    }

    /* renamed from: a0 */
    public final C1979a m4879a0() {
        return new C1979a(this);
    }

    /* renamed from: a1 */
    public boolean mo4801a1() {
        return false;
    }

    /* renamed from: b0 */
    public AbstractC2003u mo4725b0(long j7) {
        return m4874U(f9125Y1, j7);
    }

    /* renamed from: b1 */
    public boolean mo4726b1() {
        return this instanceof C1993k;
    }

    /* renamed from: b2 */
    public AbstractC2003u mo4727b2(long j7) {
        return m4874U(f9127Z1, j7);
    }

    /* renamed from: c0 */
    public AbstractC2003u mo4728c0(AbstractC2003u abstractC2003u) {
        return m4872T(f9125Y1, abstractC2003u);
    }

    /* renamed from: c1 */
    public boolean mo4729c1() {
        return this instanceof C1993k;
    }

    /* renamed from: c2 */
    public AbstractC2003u mo4730c2(AbstractC2003u abstractC2003u) {
        return m4872T(f9127Z1, abstractC2003u);
    }

    /* renamed from: d0 */
    public AbstractC2003u mo4690d0() {
        return m4881p0("attempt to call ", f9100B1).mo4691f0(this);
    }

    /* renamed from: d1 */
    public boolean mo4804d1() {
        return false;
    }

    /* renamed from: d2 */
    public AbstractC2003u mo4731d2(long j7) {
        return m4874U(f9128a2, j7);
    }

    /* renamed from: e0 */
    public final AbstractC2003u m4880e0(String str) {
        return mo4691f0(C1998p.m4815M2(str));
    }

    /* renamed from: e1 */
    public boolean mo4808e1() {
        return false;
    }

    /* renamed from: e2 */
    public AbstractC2003u mo4732e2(AbstractC2003u abstractC2003u) {
        return m4872T(f9128a2, abstractC2003u);
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* renamed from: f0 */
    public AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
        return m4881p0("attempt to call ", f9100B1).mo4692g0(this, abstractC2003u);
    }

    /* renamed from: f1 */
    public boolean mo4809f1() {
        return this instanceof C1998p;
    }

    /* renamed from: f2 */
    public int mo4733f2(C1998p c1998p) {
        m4861I0("attempt to compare " + mo4676u2());
        throw null;
    }

    /* renamed from: g0 */
    public AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        return m4881p0("attempt to call ", f9100B1).mo4693h0(this, abstractC2003u, abstractC2003u2);
    }

    /* renamed from: g1 */
    public boolean mo4839g1() {
        return false;
    }

    /* renamed from: g2 */
    public int mo4826g2(AbstractC2003u abstractC2003u) {
        m4861I0("attempt to compare " + mo4676u2());
        throw null;
    }

    /* renamed from: h0 */
    public AbstractC2003u mo4693h0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
        return m4881p0("attempt to call ", f9100B1).mo4877X0(new AbstractC2003u[]{this, abstractC2003u, abstractC2003u2, abstractC2003u3}).mo4624u();
    }

    /* renamed from: h1 */
    public boolean mo4850h1() {
        return false;
    }

    /* renamed from: h2 */
    public AbstractC2003u mo4673h2() {
        return this;
    }

    /* renamed from: i0 */
    public C1989g mo4694i0() {
        m4871S("closure");
        throw null;
    }

    /* renamed from: i1 */
    public boolean mo4734i1() {
        return true;
    }

    /* renamed from: i2 */
    public C1998p mo4735i2() {
        m4883v2("strValue");
        throw null;
    }

    /* renamed from: j0 */
    public double mo4736j0() {
        m4871S("double");
        throw null;
    }

    /* renamed from: j1 */
    public AbstractC2003u mo4793j1() {
        return m4881p0("attempt to get length of ", f9110L1).mo4691f0(this);
    }

    /* renamed from: j2 */
    public AbstractC2003u mo4737j2(AbstractC2003u abstractC2003u) {
        return m4872T(f9104F1, abstractC2003u);
    }

    /* renamed from: k0 */
    public AbstractC1992j mo4764k0() {
        m4871S("function");
        throw null;
    }

    /* renamed from: k1 */
    public int mo4794k1() {
        return mo4793j1().mo4747o2();
    }

    /* renamed from: k2 */
    public AbstractC2003u mo4738k2(double d7) {
        return m4874U(f9104F1, d7);
    }

    /* renamed from: l0 */
    public C1981b mo4629l0() {
        m4871S("globals");
        throw null;
    }

    /* renamed from: l1 */
    public boolean mo4739l1(AbstractC2003u abstractC2003u) {
        return m4886y0(f9112N1, abstractC2003u).mo4682m2();
    }

    /* renamed from: l2 */
    public AbstractC2003u mo4768l2(long j7) {
        return mo4738k2(j7);
    }

    /* renamed from: m0 */
    public int mo4740m0() {
        m4871S("int");
        throw null;
    }

    /* renamed from: m1 */
    public boolean mo4741m1(double d7) {
        m4885x0();
        throw null;
    }

    /* renamed from: m2 */
    public boolean mo4682m2() {
        return true;
    }

    /* renamed from: n0 */
    public String mo4742n0() {
        m4871S("string");
        throw null;
    }

    /* renamed from: n1 */
    public boolean mo4743n1(long j7) {
        m4885x0();
        throw null;
    }

    /* renamed from: n2 */
    public double mo4744n2() {
        return 0.0d;
    }

    /* renamed from: o0 */
    public long mo4745o0() {
        m4871S("long");
        throw null;
    }

    /* renamed from: o1 */
    public boolean mo4746o1(AbstractC2003u abstractC2003u) {
        return m4886y0(f9113O1, abstractC2003u).mo4682m2();
    }

    /* renamed from: o2 */
    public int mo4747o2() {
        return 0;
    }

    /* renamed from: p0 */
    public final AbstractC2003u m4881p0(String str, C1998p c1998p) {
        AbstractC2003u m4882q1 = m4882q1(c1998p);
        if (!m4882q1.mo4804d1()) {
            return m4882q1;
        }
        StringBuilder m4107b = C1686g.m4107b(str);
        m4107b.append(mo4676u2());
        throw new C1991i(m4107b.toString());
    }

    /* renamed from: p2 */
    public long mo4748p2() {
        return 0L;
    }

    /* renamed from: q0 */
    public AbstractC1997o mo4749q0() {
        m4871S("number");
        throw null;
    }

    /* renamed from: q1 */
    public final AbstractC2003u m4882q1(C1998p c1998p) {
        AbstractC2003u mo4681M0 = mo4681M0();
        return mo4681M0 == null ? f9130m : mo4681M0.mo4782R1(c1998p);
    }

    /* renamed from: q2 */
    public AbstractC2003u mo4750q2() {
        return f9130m;
    }

    /* renamed from: r0 */
    public AbstractC1997o mo4810r0(String str) {
        throw new C1991i(str);
    }

    /* renamed from: r1 */
    public AbstractC2003u mo4751r1(AbstractC2003u abstractC2003u) {
        return m4872T(f9108J1, abstractC2003u);
    }

    /* renamed from: r2 */
    public AbstractC2003u mo4752r2() {
        return f9130m;
    }

    /* renamed from: s0 */
    public C1998p mo4753s0() {
        m4871S("string");
        throw null;
    }

    /* renamed from: s1 */
    public AbstractC2003u mo4754s1(double d7) {
        return m4874U(f9108J1, d7);
    }

    /* renamed from: s2 */
    public Object mo4851s2() {
        return null;
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: t */
    public AbstractC2003u mo4623t(int i7) {
        return i7 == 1 ? this : f9130m;
    }

    /* renamed from: t0 */
    public C1999q mo4795t0() {
        m4871S("table");
        throw null;
    }

    /* renamed from: t1 */
    public AbstractC2003u mo4755t1(double d7) {
        return m4874U(f9106H1, d7);
    }

    /* renamed from: t2 */
    public abstract int mo4675t2();

    @Override // p165u6.AbstractC1984c0
    public String toString() {
        return mo4645M();
    }

    @Override // p165u6.AbstractC1984c0
    /* renamed from: u */
    public AbstractC2003u mo4624u() {
        return this;
    }

    /* renamed from: u0 */
    public C2000r mo4848u0() {
        m4871S("thread");
        throw null;
    }

    /* renamed from: u1 */
    public AbstractC2003u mo4756u1(long j7) {
        return m4874U(f9106H1, j7);
    }

    /* renamed from: u2 */
    public abstract String mo4676u2();

    /* renamed from: v0 */
    public Object mo4852v0() {
        m4871S("userdata");
        throw null;
    }

    /* renamed from: v1 */
    public AbstractC2003u mo4757v1(AbstractC2003u abstractC2003u) {
        return m4872T(f9106H1, abstractC2003u);
    }

    /* renamed from: v2 */
    public final void m4883v2(String str) {
        throw new C1991i(str + " expected, got " + mo4676u2());
    }

    /* renamed from: w0 */
    public Object mo4853w0() {
        m4871S("userdata");
        throw null;
    }

    /* renamed from: w1 */
    public AbstractC2003u mo4758w1() {
        return m4881p0("attempt to perform arithmetic on ", f9109K1).mo4691f0(this);
    }

    /* renamed from: w2 */
    public final void m4884w2(String str) {
        StringBuilder m222h = C0090b.m222h("'", str, "' not implemented for ");
        m222h.append(mo4676u2());
        throw new C1991i(m222h.toString());
    }

    /* renamed from: x0 */
    public final void m4885x0() {
        throw new C1991i("attempt to compare " + mo4676u2() + " with number");
    }

    /* renamed from: x1 */
    public AbstractC1984c0 mo4796x1(AbstractC2003u abstractC2003u) {
        m4883v2("table");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r1.mo4804d1() == false) goto L13;
     */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p165u6.AbstractC2003u m4886y0(p165u6.C1998p r4, p165u6.AbstractC2003u r5) {
        /*
            r3 = this;
            u6.u r0 = r3.m4882q1(r4)
            boolean r1 = r0.mo4804d1()
            if (r1 == 0) goto L6b
            u6.u r0 = r5.m4882q1(r4)
            boolean r1 = r0.mo4804d1()
            if (r1 != 0) goto L15
            goto L6b
        L15:
            u6.p r0 = p165u6.AbstractC2003u.f9113O1
            r0.getClass()
            boolean r0 = r4.mo4825O1(r0)
            if (r0 == 0) goto L3f
            u6.p r0 = p165u6.AbstractC2003u.f9112N1
            u6.u r1 = r3.m4882q1(r0)
            boolean r2 = r1.mo4804d1()
            if (r2 == 0) goto L36
            u6.u r1 = r5.m4882q1(r0)
            boolean r0 = r1.mo4804d1()
            if (r0 != 0) goto L3f
        L36:
            u6.u r4 = r1.mo4692g0(r5, r3)
            u6.f r4 = r4.mo4683y1()
            return r4
        L3f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "attempt to compare "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " on "
            r0.append(r4)
            java.lang.String r4 = r3.mo4676u2()
            r0.append(r4)
            java.lang.String r4 = " and "
            r0.append(r4)
            java.lang.String r4 = r5.mo4676u2()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            u6.i r5 = new u6.i
            r5.<init>(r4)
            throw r5
        L6b:
            u6.u r4 = r0.mo4692g0(r3, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p165u6.AbstractC2003u.m4886y0(u6.p, u6.u):u6.u");
    }

    /* renamed from: y1 */
    public C1988f mo4683y1() {
        return f9122X;
    }

    /* renamed from: z0 */
    public C1979a mo4811z0(C1979a c1979a) {
        AbstractC2003u abstractC2003u = c1979a.f8941d;
        if (abstractC2003u == null) {
            abstractC2003u = c1979a.m4619f();
        }
        AbstractC2003u mo4805A0 = mo4805A0(abstractC2003u);
        c1979a.f8938a = C1979a.f8937e;
        c1979a.f8939b = 0;
        c1979a.f8940c = 0;
        c1979a.f8941d = mo4805A0;
        return c1979a;
    }

    /* renamed from: z1 */
    public AbstractC1984c0 mo4695z1(AbstractC1984c0 abstractC1984c0) {
        return mo4689W0(abstractC1984c0);
    }
}
