package p180w6;

import android.ext.C0090b;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import p047f5.C1175f;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC1992j;
import p165u6.AbstractC1997o;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1982b0;
import p165u6.C1987e;
import p165u6.C1988f;
import p165u6.C1989g;
import p165u6.C1991i;
import p165u6.C1993k;
import p165u6.C1996n;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2000r;
import p165u6.C2001s;
import p165u6.C2007y;
import p165u6.C2008z;

/* renamed from: w6.d */
/* loaded from: classes.dex */
public final class C2135d extends AbstractC2149r {

    /* renamed from: A2 */
    public static final C1998p f9626A2;

    /* renamed from: h2 */
    public static final boolean f9627h2;

    /* renamed from: i2 */
    public static final C1998p f9628i2;

    /* renamed from: j2 */
    public static final C1998p f9629j2;

    /* renamed from: k2 */
    public static final C1998p f9630k2;

    /* renamed from: l2 */
    public static final C1998p f9631l2;

    /* renamed from: m2 */
    public static final C1998p f9632m2;

    /* renamed from: n2 */
    public static final C1998p f9633n2;

    /* renamed from: o2 */
    public static final C1998p f9634o2;

    /* renamed from: p2 */
    public static final C1998p f9635p2;

    /* renamed from: q2 */
    public static final C1998p f9636q2;

    /* renamed from: r2 */
    public static final C1998p f9637r2;

    /* renamed from: s2 */
    public static final C1998p f9638s2;

    /* renamed from: t2 */
    public static final C1998p f9639t2;

    /* renamed from: u2 */
    public static final C1998p f9640u2;

    /* renamed from: v2 */
    public static final C1998p f9641v2;

    /* renamed from: w2 */
    public static final C1998p f9642w2;

    /* renamed from: x2 */
    public static final C1998p f9643x2;

    /* renamed from: y2 */
    public static final C1998p f9644y2;

    /* renamed from: z2 */
    public static final C1998p f9645z2;

    /* renamed from: g2 */
    public C1981b f9646g2;

    /* renamed from: w6.d$a */
    public static class a {

        /* renamed from: a */
        public AbstractC1992j f9647a;

        /* renamed from: b */
        public int f9648b;

        /* renamed from: c */
        public AbstractC1984c0 f9649c;

        /* renamed from: d */
        public AbstractC2003u[] f9650d;

        /* renamed from: e */
        public a f9651e;

        /* renamed from: a */
        public final int m5186a() {
            int[] iArr;
            int i7;
            AbstractC1992j abstractC1992j = this.f9647a;
            abstractC1992j.getClass();
            if ((abstractC1992j instanceof C1989g) && (iArr = this.f9647a.mo4694i0().f9008e2.f9146d) != null && (i7 = this.f9648b) >= 0 && i7 < iArr.length) {
                return iArr[i7];
            }
            return -1;
        }

        /* renamed from: b */
        public final AbstractC1984c0 m5187b(int i7) {
            AbstractC2003u abstractC2003u;
            AbstractC1992j abstractC1992j = this.f9647a;
            abstractC1992j.getClass();
            AbstractC2003u m4892a = !(abstractC1992j instanceof C1989g) ? null : this.f9647a.mo4694i0().f9008e2.m4892a(i7, this.f9648b);
            if (i7 >= 1) {
                AbstractC2003u[] abstractC2003uArr = this.f9650d;
                if (i7 <= abstractC2003uArr.length && (abstractC2003u = abstractC2003uArr[i7 - 1]) != null) {
                    if (m4892a == null) {
                        m4892a = AbstractC2003u.f9130m;
                    }
                    return AbstractC2003u.m4867y2(m4892a, abstractC2003u);
                }
            }
            return AbstractC2003u.f9130m;
        }

        /* renamed from: c */
        public final void m5188c(int i7, AbstractC1984c0 abstractC1984c0, int i8) {
            PrintStream printStream;
            String str;
            this.f9648b = i7;
            this.f9649c = abstractC1984c0;
            if (C2135d.f9627h2) {
                C1989g mo4694i0 = this.f9647a.mo4694i0();
                AbstractC2003u[] abstractC2003uArr = this.f9650d;
                PrintStream printStream2 = C2007y.f9140c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                C2007y.f9140c = new PrintStream(byteArrayOutputStream);
                C2007y.m4891h(mo4694i0.f9008e2, i7);
                C2007y.f9140c.flush();
                C2007y.f9140c.close();
                C2007y.f9140c = printStream2;
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                int length = byteArrayOutputStream2.length();
                if (length <= 50) {
                    C2007y.f9140c.print(byteArrayOutputStream2);
                    int i9 = 50 - length;
                    while (true) {
                        i9--;
                        if (i9 < 0) {
                            break;
                        } else {
                            C2007y.f9140c.print(' ');
                        }
                    }
                } else {
                    C2007y.f9140c.print(byteArrayOutputStream2.substring(0, 50));
                }
                C2007y.f9140c.print('[');
                int i10 = 0;
                while (i10 < abstractC2003uArr.length) {
                    AbstractC2003u abstractC2003u = abstractC2003uArr[i10];
                    if (abstractC2003u == null) {
                        C2007y.f9140c.print("null");
                    } else {
                        if (abstractC2003u.mo4675t2() != 4) {
                            printStream = C2007y.f9140c;
                            str = abstractC2003u.mo4645M();
                        } else {
                            C1998p mo4753s0 = abstractC2003u.mo4753s0();
                            printStream = C2007y.f9140c;
                            if (mo4753s0.f9041e2 < 48) {
                                str = mo4753s0.mo4645M();
                            } else {
                                str = String.valueOf(mo4753s0.m4823K2(0, 32).mo4645M()) + "...+" + (mo4753s0.f9041e2 - 32) + 'b';
                            }
                        }
                        printStream.print(str);
                    }
                    i10++;
                    if (i10 == i8) {
                        C2007y.f9140c.print(']');
                    }
                    C2007y.f9140c.print(" | ");
                }
                C2007y.f9140c.print(abstractC1984c0);
                C2007y.f9140c.println();
            }
        }

        /* renamed from: d */
        public final AbstractC2003u m5189d(int i7, AbstractC2003u abstractC2003u) {
            AbstractC1992j abstractC1992j = this.f9647a;
            abstractC1992j.getClass();
            C1998p m4892a = !(abstractC1992j instanceof C1989g) ? null : this.f9647a.mo4694i0().f9008e2.m4892a(i7, this.f9648b);
            if (i7 >= 1) {
                AbstractC2003u[] abstractC2003uArr = this.f9650d;
                if (i7 <= abstractC2003uArr.length) {
                    int i8 = i7 - 1;
                    if (abstractC2003uArr[i8] != null) {
                        abstractC2003uArr[i8] = abstractC2003u;
                        return m4892a == null ? AbstractC2003u.f9130m : m4892a;
                    }
                }
            }
            return AbstractC2003u.f9130m;
        }
    }

    /* renamed from: w6.d$b */
    public static class b {

        /* renamed from: c */
        public static final a[] f9652c = new a[0];

        /* renamed from: a */
        public a[] f9653a = f9652c;

        /* renamed from: b */
        public int f9654b = 0;

        /* renamed from: c */
        public static AbstractC2003u m5190c(StringBuffer stringBuffer, C1999q c1999q, AbstractC1992j abstractC1992j, int i7) {
            String mo4645M;
            AbstractC2003u m5190c;
            if (c1999q == null) {
                return null;
            }
            C1999q.d dVar = c1999q.new d(c1999q);
            while (dVar.m4845b()) {
                if ((dVar.f9058a == null ? dVar.f9059b + 1 : 0) == 0) {
                    AbstractC2003u m4844a = dVar.m4844a();
                    if (m4844a instanceof C1998p) {
                        AbstractC2003u m4846c = dVar.m4846c();
                        if (m4846c == abstractC1992j) {
                            if (i7 != 2) {
                                return m4844a;
                            }
                            stringBuffer.append("function '");
                            mo4645M = m4844a.mo4645M();
                        } else if (i7 > 1 && m4846c.mo4839g1() && (m5190c = m5190c(stringBuffer, m4846c.mo4795t0(), abstractC1992j, i7 - 1)) != null) {
                            String mo4645M2 = m4844a.mo4645M();
                            stringBuffer.append("function '");
                            if (!mo4645M2.equals("_G")) {
                                stringBuffer.append(mo4645M2);
                                stringBuffer.append('.');
                            }
                            mo4645M = m5190c.mo4645M();
                        }
                        stringBuffer.append(mo4645M);
                        stringBuffer.append('\'');
                        return AbstractC2003u.f9130m;
                    }
                    continue;
                }
            }
            return null;
        }

        /* renamed from: f */
        public static void m5191f(StringBuffer stringBuffer, C1981b c1981b, c cVar) {
            char c7;
            if (m5190c(stringBuffer, c1981b, cVar.f9666l.f9647a, 2) != null) {
                return;
            }
            if (cVar.f9656b.length() > 0) {
                stringBuffer.append(cVar.f9656b);
                stringBuffer.append(" '");
                stringBuffer.append(cVar.f9655a);
                c7 = '\'';
            } else if (cVar.f9657c.charAt(0) == 'm') {
                stringBuffer.append("main chunk");
                return;
            } else if (cVar.f9657c.charAt(0) != 'J') {
                stringBuffer.append("function <");
                stringBuffer.append(cVar.f9665k);
                stringBuffer.append(':');
                stringBuffer.append(cVar.f9660f);
                c7 = '>';
            } else {
                c7 = '?';
            }
            stringBuffer.append(c7);
        }

        /* renamed from: a */
        public final synchronized c m5192a(String str, AbstractC1992j abstractC1992j, a aVar) {
            c cVar;
            int i7;
            a aVar2;
            C1999q.d m5178M2;
            String str2;
            cVar = new c();
            int length = str.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = str.charAt(i8);
                if (charAt == 'S') {
                    cVar.m5197a(abstractC1992j);
                } else if (charAt == 'l') {
                    if (aVar != null) {
                        AbstractC1992j abstractC1992j2 = aVar.f9647a;
                        abstractC1992j2.getClass();
                        if (abstractC1992j2 instanceof C1989g) {
                            i7 = aVar.m5186a();
                            cVar.f9659e = i7;
                        }
                    }
                    i7 = -1;
                    cVar.f9659e = i7;
                } else if (charAt == 'n') {
                    abstractC1992j.getClass();
                    if (!(abstractC1992j instanceof C1989g) || (str2 = abstractC1992j.mo4694i0().f9008e2.f9155m) == null) {
                        if (aVar != null && (aVar2 = aVar.f9651e) != null) {
                            AbstractC1992j abstractC1992j3 = aVar2.f9647a;
                            abstractC1992j3.getClass();
                            if ((abstractC1992j3 instanceof C1989g) && (m5178M2 = C2135d.m5178M2(aVar.f9651e)) != null) {
                                cVar.f9655a = m5178M2.f9667a;
                                cVar.f9656b = m5178M2.f9668b;
                            }
                        }
                        if (cVar.f9656b == null) {
                            cVar.f9656b = "";
                            cVar.f9655a = null;
                        }
                    } else {
                        cVar.f9655a = str2;
                        cVar.f9656b = "final";
                    }
                } else if (charAt != 't' && charAt == 'u') {
                    boolean z6 = true;
                    if (abstractC1992j == null || !(abstractC1992j instanceof C1989g)) {
                        cVar.f9662h = (short) 0;
                        cVar.f9664j = true;
                        cVar.f9663i = (short) 0;
                    } else {
                        C2008z c2008z = abstractC1992j.mo4694i0().f9008e2;
                        cVar.f9662h = (short) c2008z.f9148f.length;
                        cVar.f9663i = (short) c2008z.f9152j;
                        if (c2008z.f9153k == 0) {
                            z6 = false;
                        }
                        cVar.f9664j = z6;
                    }
                }
            }
            return cVar;
        }

        /* renamed from: b */
        public final synchronized int m5193b() {
            int i7;
            i7 = this.f9654b;
            return i7 > 0 ? this.f9653a[i7 - 1].m5186a() : -1;
        }

        /* renamed from: d */
        public final synchronized a m5194d(int i7) {
            if (i7 >= 1) {
                int i8 = this.f9654b;
                if (i7 <= i8) {
                    return this.f9653a[i8 - i7];
                }
            }
            return null;
        }

        /* renamed from: e */
        public final synchronized a m5195e() {
            a[] aVarArr;
            int i7;
            int i8 = this.f9654b;
            a[] aVarArr2 = this.f9653a;
            if (i8 >= aVarArr2.length) {
                int max = Math.max(4, (aVarArr2.length * 3) / 2);
                a[] aVarArr3 = new a[max];
                a[] aVarArr4 = this.f9653a;
                System.arraycopy(aVarArr4, 0, aVarArr3, 0, aVarArr4.length);
                for (int length = this.f9653a.length; length < max; length++) {
                    aVarArr3[length] = new a();
                }
                this.f9653a = aVarArr3;
                for (int i9 = 1; i9 < max; i9++) {
                    aVarArr3[i9].f9651e = aVarArr3[i9 - 1];
                }
            }
            aVarArr = this.f9653a;
            i7 = this.f9654b;
            this.f9654b = i7 + 1;
            return aVarArr[i7];
        }

        /* renamed from: g */
        public final String m5196g(C1981b c1981b, int i7) {
            String stringBuffer;
            synchronized (this) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("stack traceback:");
                while (true) {
                    a m5194d = m5194d(i7);
                    if (m5194d == null) {
                        stringBuffer2.append("\n\t[Java]: in ?");
                        stringBuffer = stringBuffer2.toString();
                    } else {
                        c m5192a = m5192a("Slnt", m5194d.f9647a, m5194d);
                        m5192a.f9666l = m5194d;
                        stringBuffer2.append("\n\t");
                        stringBuffer2.append(':');
                        int i8 = m5192a.f9659e;
                        if (i8 > 0) {
                            stringBuffer2.append(i8);
                        }
                        stringBuffer2.append(" in ");
                        m5191f(stringBuffer2, c1981b, m5192a);
                        i7++;
                    }
                }
            }
            return stringBuffer;
        }
    }

    /* renamed from: w6.d$c */
    public static class c {

        /* renamed from: a */
        public String f9655a;

        /* renamed from: b */
        public String f9656b;

        /* renamed from: c */
        public String f9657c;

        /* renamed from: d */
        public String f9658d;

        /* renamed from: e */
        public int f9659e;

        /* renamed from: f */
        public int f9660f;

        /* renamed from: g */
        public int f9661g;

        /* renamed from: h */
        public short f9662h;

        /* renamed from: i */
        public short f9663i;

        /* renamed from: j */
        public boolean f9664j;

        /* renamed from: k */
        public String f9665k;

        /* renamed from: l */
        public a f9666l;

        /* renamed from: a */
        public final void m5197a(AbstractC1992j abstractC1992j) {
            String mo4686E2;
            abstractC1992j.getClass();
            if (abstractC1992j instanceof C1989g) {
                C2008z c2008z = abstractC1992j.mo4694i0().f9008e2;
                C1998p c1998p = c2008z.f9149g;
                this.f9658d = c1998p != null ? c1998p.mo4645M() : "=?";
                String str = c2008z.f9155m;
                if (str == null) {
                    str = "?";
                }
                this.f9655a = str;
                int i7 = c2008z.f9150h;
                this.f9660f = i7;
                this.f9661g = c2008z.f9151i;
                this.f9657c = i7 == 0 ? "main" : "Lua";
                mo4686E2 = c2008z.m4893b();
            } else {
                this.f9658d = "=[Java]";
                this.f9660f = -1;
                this.f9661g = -1;
                this.f9657c = "Java";
                mo4686E2 = abstractC1992j.mo4686E2();
            }
            this.f9665k = mo4686E2;
        }
    }

    /* renamed from: w6.d$d */
    public static class d {

        /* renamed from: a */
        public final String f9667a;

        /* renamed from: b */
        public final String f9668b;

        public d(String str, String str2) {
            this.f9667a = str;
            this.f9668b = str2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9668b);
            sb.append(" '");
            return C0090b.m220f(sb, this.f9667a, "'");
        }
    }

    /* renamed from: w6.d$e */
    public static final class e extends AbstractC2151t {
        @Override // p180w6.AbstractC2151t, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: d0 */
        public final AbstractC2003u mo4690d0() {
            return AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.d$f */
    public final class f extends AbstractC2150s {
        public f() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2000r.a aVar = (abstractC1984c0.mo4621I() > 0 ? abstractC1984c0.m4637B() : C2135d.this.f9646g2.f8948o2).f9072c2;
            AbstractC2003u abstractC2003u = aVar.f9082Z;
            if (abstractC2003u == null) {
                abstractC2003u = AbstractC2003u.f9130m;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.f9088x1 ? "c" : "");
            sb.append(aVar.f9087w1 ? "l" : "");
            sb.append(aVar.f9089y1 ? "r" : "");
            return AbstractC2003u.m4866x2(abstractC2003u, C1998p.m4815M2(sb.toString()), C1993k.m4765C2(aVar.f9090z1));
        }
    }

    /* renamed from: w6.d$g */
    public final class g extends AbstractC2150s {
        public g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x005d, code lost:
        
            r2 = r5[r2];
         */
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final p165u6.AbstractC1984c0 mo4689W0(p165u6.AbstractC1984c0 r8) {
            /*
                Method dump skipped, instructions count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p180w6.C2135d.g.mo4689W0(u6.c0):u6.c0");
        }
    }

    /* renamed from: w6.d$h */
    public final class h extends AbstractC2150s {
        public h() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2000r c2000r;
            int i7 = 1;
            AbstractC2003u mo4623t = abstractC1984c0.mo4623t(1);
            mo4623t.getClass();
            boolean z6 = mo4623t instanceof C2000r;
            C2135d c2135d = C2135d.this;
            if (z6) {
                c2000r = abstractC1984c0.m4637B();
                i7 = 2;
            } else {
                c2000r = c2135d.f9646g2.f8948o2;
            }
            int i8 = i7 + 1;
            int m4648w = abstractC1984c0.m4648w(i7);
            int m4648w2 = abstractC1984c0.m4648w(i8);
            c2135d.getClass();
            a m5194d = C2135d.m5176K2(c2000r).m5194d(m4648w);
            return m5194d != null ? m5194d.m5187b(m4648w2) : AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.d$i */
    public static final class i extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            AbstractC2003u mo4681M0 = abstractC2003u.mo4681M0();
            return mo4681M0 != null ? mo4681M0 : AbstractC2003u.f9130m;
        }
    }

    /* renamed from: w6.d$j */
    public final class j extends AbstractC2151t {
        public j() {
        }

        @Override // p180w6.AbstractC2151t, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: d0 */
        public final AbstractC2003u mo4690d0() {
            return C2135d.this.f9646g2.f8948o2.f9074e2;
        }
    }

    /* renamed from: w6.d$k */
    public static final class k extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1989g c1989g;
            C1998p m5177L2;
            AbstractC1992j mo4764k0 = abstractC1984c0.mo4623t(1).mo4764k0();
            int m4648w = abstractC1984c0.m4648w(2);
            if (!(mo4764k0 instanceof C1989g) || (m5177L2 = C2135d.m5177L2((c1989g = (C1989g) mo4764k0), m4648w)) == null) {
                return AbstractC2003u.f9130m;
            }
            C1175f c1175f = c1989g.f9009f2[m4648w - 1];
            return AbstractC2003u.m4867y2(m5177L2, ((AbstractC2003u[]) c1175f.f5760c)[c1175f.f5759b]);
        }
    }

    /* renamed from: w6.d$l */
    public static final class l extends AbstractC2139h {
        @Override // p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4850h1() ? abstractC2003u : AbstractC2003u.f9130m;
        }
    }

    /* renamed from: w6.d$m */
    public final class m extends AbstractC2150s {
        public m() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2000r c2000r;
            int i7;
            AbstractC2003u mo4623t = abstractC1984c0.mo4623t(1);
            mo4623t.getClass();
            if (mo4623t instanceof C2000r) {
                c2000r = abstractC1984c0.m4637B();
                i7 = 2;
            } else {
                c2000r = C2135d.this.f9646g2.f8948o2;
                i7 = 1;
            }
            int i8 = i7 + 1;
            AbstractC1992j mo4759B1 = abstractC1984c0.mo4623t(i7).mo4759B1();
            int i9 = i8 + 1;
            String m4644K = abstractC1984c0.m4644K(i8, "");
            int m4643J = abstractC1984c0.m4643J(i9, 0);
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            for (int i10 = 0; i10 < m4644K.length(); i10++) {
                char charAt = m4644K.charAt(i10);
                if (charAt == 'c') {
                    z6 = true;
                } else if (charAt == 'l') {
                    z7 = true;
                } else if (charAt == 'r') {
                    z8 = true;
                }
            }
            C2000r.a aVar = c2000r.f9072c2;
            aVar.f9082Z = mo4759B1;
            aVar.f9088x1 = z6;
            aVar.f9087w1 = z7;
            aVar.f9090z1 = m4643J;
            aVar.f9089y1 = z8;
            return AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.d$n */
    public final class n extends AbstractC2150s {
        public n() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2000r c2000r;
            int i7 = 1;
            AbstractC2003u mo4623t = abstractC1984c0.mo4623t(1);
            mo4623t.getClass();
            boolean z6 = mo4623t instanceof C2000r;
            C2135d c2135d = C2135d.this;
            if (z6) {
                c2000r = abstractC1984c0.m4637B();
                i7 = 2;
            } else {
                c2000r = c2135d.f9646g2.f8948o2;
            }
            int i8 = i7 + 1;
            int m4648w = abstractC1984c0.m4648w(i7);
            int i9 = i8 + 1;
            int m4648w2 = abstractC1984c0.m4648w(i8);
            AbstractC2003u mo4623t2 = abstractC1984c0.mo4623t(i9);
            c2135d.getClass();
            a m5194d = C2135d.m5176K2(c2000r).m5194d(m4648w);
            return m5194d != null ? m5194d.m5189d(m4648w2, mo4623t2) : AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.d$o */
    public static final class o extends AbstractC2149r {
        @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            C1999q mo4773F1 = abstractC2003u2.mo4773F1();
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 0) {
                C1996n.f9036d2 = mo4773F1;
            } else if (mo4675t2 == 1) {
                C1988f.f9005f2 = mo4773F1;
            } else if (mo4675t2 == 3) {
                AbstractC1997o.f9037c2 = mo4773F1;
            } else if (mo4675t2 == 4) {
                C1998p.f9038h2 = mo4773F1;
            } else if (mo4675t2 == 6) {
                AbstractC1992j.f9021d2 = mo4773F1;
            } else if (mo4675t2 != 8) {
                abstractC2003u.mo4792Z1(mo4773F1);
            } else {
                C2000r.f9069g2 = mo4773F1;
            }
            return abstractC2003u;
        }
    }

    /* renamed from: w6.d$p */
    public static final class p extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1989g c1989g;
            C1998p m5177L2;
            AbstractC1992j mo4764k0 = abstractC1984c0.mo4623t(1).mo4764k0();
            int m4648w = abstractC1984c0.m4648w(2);
            AbstractC2003u mo4623t = abstractC1984c0.mo4623t(3);
            if (!(mo4764k0 instanceof C1989g) || (m5177L2 = C2135d.m5177L2((c1989g = (C1989g) mo4764k0), m4648w)) == null) {
                return AbstractC2003u.f9130m;
            }
            C1175f c1175f = c1989g.f9009f2[m4648w - 1];
            ((AbstractC2003u[]) c1175f.f5760c)[c1175f.f5759b] = mo4623t;
            return m5177L2;
        }
    }

    /* renamed from: w6.d$q */
    public static final class q extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            abstractC1984c0.mo4623t(1).mo4852v0();
            AbstractC2003u m4638C = abstractC1984c0.m4638C(2);
            C2001s c2001s = (C2001s) abstractC1984c0.mo4624u();
            c2001s.f9091c2 = m4638C.mo4852v0();
            c2001s.f9092d2 = m4638C.mo4681M0();
            return AbstractC2003u.f9124Y;
        }
    }

    /* renamed from: w6.d$r */
    public final class r extends AbstractC2150s {
        public r() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C2000r c2000r;
            int i7;
            AbstractC2003u mo4623t = abstractC1984c0.mo4623t(1);
            mo4623t.getClass();
            boolean z6 = mo4623t instanceof C2000r;
            C2135d c2135d = C2135d.this;
            if (z6) {
                c2000r = abstractC1984c0.m4637B();
                i7 = 2;
            } else {
                c2000r = c2135d.f9646g2.f8948o2;
                i7 = 1;
            }
            int i8 = i7 + 1;
            String m4644K = abstractC1984c0.m4644K(i7, null);
            int m4643J = abstractC1984c0.m4643J(i8, 1);
            c2135d.getClass();
            String m5196g = C2135d.m5176K2(c2000r).m5196g(c2135d.f9646g2, m4643J);
            if (m4644K != null) {
                m5196g = m4644K + "\n" + m5196g;
            }
            return C1998p.m4815M2(m5196g);
        }
    }

    /* renamed from: w6.d$s */
    public static final class s extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1175f[] c1175fArr;
            AbstractC1992j mo4764k0 = abstractC1984c0.mo4623t(1).mo4764k0();
            int m4648w = abstractC1984c0.m4648w(2);
            return (!(mo4764k0 instanceof C1989g) || (c1175fArr = ((C1989g) mo4764k0).f9009f2) == null || m4648w <= 0 || m4648w > c1175fArr.length) ? AbstractC2003u.f9130m : C1993k.m4765C2(c1175fArr[m4648w - 1].hashCode());
        }
    }

    /* renamed from: w6.d$t */
    public static final class t extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1989g mo4694i0 = abstractC1984c0.mo4623t(1).mo4694i0();
            int m4648w = abstractC1984c0.m4648w(2);
            C1989g mo4694i02 = abstractC1984c0.mo4623t(3).mo4694i0();
            int m4648w2 = abstractC1984c0.m4648w(4);
            if (m4648w >= 1) {
                C1175f[] c1175fArr = mo4694i0.f9009f2;
                if (m4648w <= c1175fArr.length) {
                    if (m4648w2 >= 1) {
                        C1175f[] c1175fArr2 = mo4694i02.f9009f2;
                        if (m4648w2 <= c1175fArr2.length) {
                            c1175fArr[m4648w - 1] = c1175fArr2[m4648w2 - 1];
                            return AbstractC2003u.f9124Y;
                        }
                    }
                    m4871S("index out of range");
                    throw null;
                }
            }
            m4871S("index out of range");
            throw null;
        }
    }

    static {
        try {
            System.getProperty("CALLS");
        } catch (Exception unused) {
        }
        try {
            f9627h2 = System.getProperty("TRACE") != null;
        } catch (Exception unused2) {
        }
        f9628i2 = C1998p.m4815M2("Lua");
        f9629j2 = C1998p.m4815M2("?");
        f9630k2 = C1998p.m4815M2("call");
        f9631l2 = C1998p.m4815M2("line");
        f9632m2 = C1998p.m4815M2("count");
        f9633n2 = C1998p.m4815M2("return");
        f9634o2 = C1998p.m4815M2("func");
        f9635p2 = C1998p.m4815M2("istailcall");
        f9636q2 = C1998p.m4815M2("isvararg");
        f9637r2 = C1998p.m4815M2("nups");
        f9638s2 = C1998p.m4815M2("nparams");
        C1998p.m4815M2("name");
        f9639t2 = C1998p.m4815M2("namewhat");
        f9640u2 = C1998p.m4815M2("what");
        f9641v2 = C1998p.m4815M2("source");
        f9642w2 = C1998p.m4815M2("short_src");
        f9643x2 = C1998p.m4815M2("linedefined");
        f9644y2 = C1998p.m4815M2("lastlinedefined");
        f9645z2 = C1998p.m4815M2("currentline");
        f9626A2 = C1998p.m4815M2("activelines");
        C1998p.m4815M2("global");
    }

    /* renamed from: I2 */
    public static void m5175I2(C2000r.a aVar, C1998p c1998p, AbstractC2003u abstractC2003u) {
        AbstractC1992j abstractC1992j;
        if (aVar.f9076A1 || (abstractC1992j = aVar.f9082Z) == null) {
            return;
        }
        aVar.f9076A1 = true;
        try {
            try {
                abstractC1992j.mo4692g0(c1998p, abstractC2003u);
            } catch (C1991i e7) {
                throw e7;
            } catch (RuntimeException e8) {
                throw new C1991i(e8);
            }
        } finally {
            aVar.f9076A1 = false;
        }
    }

    /* renamed from: K2 */
    public static b m5176K2(C2000r c2000r) {
        if (c2000r.f9073d2 == null) {
            c2000r.f9073d2 = new b();
        }
        return c2000r.f9073d2;
    }

    /* renamed from: L2 */
    public static C1998p m5177L2(C1989g c1989g, int i7) {
        C1175f[] c1175fArr = c1989g.f9009f2;
        if (c1175fArr == null || i7 <= 0 || i7 > c1175fArr.length) {
            return null;
        }
        C1982b0[] c1982b0Arr = c1989g.f9008e2.f9148f;
        if (c1982b0Arr != null && i7 <= c1982b0Arr.length) {
            return c1982b0Arr[i7 - 1].f8961a;
        }
        return C1998p.m4815M2("." + i7);
    }

    /* renamed from: M2 */
    public static C1999q.d m5178M2(a aVar) {
        C1998p c1998p;
        AbstractC1992j abstractC1992j = aVar.f9647a;
        abstractC1992j.getClass();
        if (!(abstractC1992j instanceof C1989g)) {
            return new d(aVar.f9647a.m4760C2(), "Java");
        }
        C2008z c2008z = aVar.f9647a.mo4694i0().f9008e2;
        int i7 = aVar.f9648b;
        int i8 = c2008z.f9144b[i7];
        int i9 = (i8 >> 0) & 63;
        if (i9 != 6 && i9 != 7) {
            if (i9 != 8 && i9 != 10) {
                if (i9 != 34) {
                    if (i9 == 21) {
                        c1998p = AbstractC2003u.f9110L1;
                    } else {
                        if (i9 != 22) {
                            if (i9 != 29 && i9 != 30) {
                                if (i9 != 52) {
                                    if (i9 != 53) {
                                        switch (i9) {
                                            case 12:
                                                break;
                                            case 13:
                                                c1998p = AbstractC2003u.f9103E1;
                                                break;
                                            case 14:
                                                c1998p = AbstractC2003u.f9104F1;
                                                break;
                                            case 15:
                                                c1998p = AbstractC2003u.f9106H1;
                                                break;
                                            case 16:
                                                c1998p = AbstractC2003u.f9105G1;
                                                break;
                                            case 17:
                                                c1998p = AbstractC2003u.f9108J1;
                                                break;
                                            case 18:
                                                c1998p = AbstractC2003u.f9107I1;
                                                break;
                                            case 19:
                                                c1998p = AbstractC2003u.f9109K1;
                                                break;
                                            default:
                                                switch (i9) {
                                                    case 24:
                                                        c1998p = AbstractC2003u.f9111M1;
                                                        break;
                                                    case 25:
                                                        c1998p = AbstractC2003u.f9112N1;
                                                        break;
                                                    case 26:
                                                        c1998p = AbstractC2003u.f9113O1;
                                                        break;
                                                    default:
                                                        switch (i9) {
                                                            case 39:
                                                                c1998p = AbstractC2003u.f9120V1;
                                                                break;
                                                            case 40:
                                                                c1998p = AbstractC2003u.f9121W1;
                                                                break;
                                                            case 41:
                                                                c1998p = AbstractC2003u.f9123X1;
                                                                break;
                                                            case 42:
                                                                c1998p = AbstractC2003u.f9125Y1;
                                                                break;
                                                            case 43:
                                                                c1998p = AbstractC2003u.f9127Z1;
                                                                break;
                                                            case 44:
                                                                c1998p = AbstractC2003u.f9128a2;
                                                                break;
                                                            case 45:
                                                                c1998p = AbstractC2003u.f9129b2;
                                                                break;
                                                            default:
                                                                return null;
                                                        }
                                                }
                                        }
                                    }
                                }
                            }
                            return m5179N2(c2008z, i7, (i8 >> 6) & 255);
                        }
                        c1998p = AbstractC2003u.f9115Q1;
                    }
                }
                return new d("(for iterator)", "(for iterator)");
            }
            c1998p = AbstractC2003u.f9099A1;
            return new d(c1998p.mo4645M(), "metamethod");
        }
        c1998p = AbstractC2003u.f9135z1;
        return new d(c1998p.mo4645M(), "metamethod");
    }

    /* renamed from: N2 */
    public static C1999q.d m5179N2(C2008z c2008z, int i7, int i8) {
        String str;
        C1998p m4892a = c2008z.m4892a(i8 + 1, i7);
        if (m4892a != null) {
            return new d(m4892a.mo4645M(), "local");
        }
        int i9 = 0;
        int i10 = -1;
        while (i9 < i7) {
            int i11 = c2008z.f9144b[i9];
            int i12 = (i11 >> 0) & 63;
            int i13 = (i11 >> 6) & 255;
            if (i12 != 4) {
                if (i12 == 23) {
                    int m4678b = C1987e.m4678b(i11);
                    int i14 = i9 + 1 + m4678b;
                    if (i9 < i14 && i14 <= i7) {
                        i9 += m4678b;
                    }
                } else if (i12 != 27) {
                    if (i12 != 34) {
                        if (i12 != 36) {
                            if (i12 != 29 && i12 != 30) {
                                switch (i12) {
                                    case 51:
                                    case 53:
                                        break;
                                    case 52:
                                        break;
                                    default:
                                        if (!((C1987e.f9002a[i12] & 64) != 0)) {
                                            break;
                                        } else if (i8 != i13) {
                                            break;
                                        }
                                        break;
                                }
                                i10 = i9;
                            }
                            if (i8 < i13) {
                                continue;
                            }
                            i10 = i9;
                        } else if (((i11 >> 14) & 511) == 0) {
                            i9++;
                        }
                    }
                    if (i8 < i13 + 2) {
                    }
                    i10 = i9;
                } else {
                    if (i8 != i13) {
                    }
                    i10 = i9;
                }
                i9++;
            } else {
                int i15 = (i11 >> 23) & 511;
                if (i13 <= i8) {
                    if (i8 > i13 + i15) {
                    }
                    i10 = i9;
                }
                i9++;
            }
        }
        str = "?";
        if (i10 != -1) {
            int[] iArr = c2008z.f9144b;
            int i16 = iArr[i10];
            int i17 = (i16 >> 0) & 63;
            if (i17 == 0) {
                int i18 = (i16 >> 6) & 255;
                int i19 = (i16 >> 23) & 511;
                if (i19 < i18) {
                    return m5179N2(c2008z, i10, i19);
                }
            } else if (i17 == 1 || i17 == 2) {
                int m4677a = i17 == 1 ? C1987e.m4677a(i16) : (iArr[i10 + 1] >> 6) & 67108863;
                if (c2008z.f9143a[m4677a].mo4809f1()) {
                    return new d(c2008z.f9143a[m4677a].mo4735i2().mo4645M(), "constant");
                }
            } else {
                C1998p c1998p = f9629j2;
                if (i17 == 5) {
                    int i20 = (i16 >> 23) & 511;
                    C1982b0[] c1982b0Arr = c2008z.f9148f;
                    if (i20 < c1982b0Arr.length) {
                        c1998p = c1982b0Arr[i20].f8961a;
                    }
                    return new d(c1998p != null ? c1998p.mo4645M() : "?", "upvalue");
                }
                if (i17 == 6 || i17 == 7) {
                    int i21 = (i16 >> 14) & 511;
                    int i22 = (i16 >> 23) & 511;
                    if (i17 == 7) {
                        c1998p = c2008z.m4892a(i22 + 1, i10);
                    } else {
                        C1982b0[] c1982b0Arr2 = c2008z.f9148f;
                        if (i22 < c1982b0Arr2.length) {
                            c1998p = c1982b0Arr2[i22].f8961a;
                        }
                    }
                    return new d(m5180O2(c2008z, i10, i21), (c1998p == null || !AbstractC2003u.f9134y1.mo4825O1(c1998p)) ? "field" : "global");
                }
                if (i17 == 12) {
                    return new d(m5180O2(c2008z, i10, (i16 >> 14) & 511), "method");
                }
                if (i17 == 46) {
                    return new d(c2008z.f9143a[C1987e.m4677a(i16)].mo4645M(), "global");
                }
            }
        }
        if (C1987e.m4679c(i8)) {
            AbstractC2003u abstractC2003u = c2008z.f9143a[i8 & (-257)];
            if (abstractC2003u.mo4809f1()) {
                str = abstractC2003u.mo4645M();
            }
        }
        return new d(str, "");
    }

    /* renamed from: O2 */
    public static String m5180O2(C2008z c2008z, int i7, int i8) {
        if (C1987e.m4679c(i8)) {
            AbstractC2003u abstractC2003u = c2008z.f9143a[i8 & (-257)];
            return abstractC2003u.mo4809f1() ? abstractC2003u.mo4645M() : "?";
        }
        C1999q.d m5179N2 = m5179N2(c2008z, i7, i8);
        return (m5179N2 == null || !"constant".equals(m5179N2.f9668b)) ? "?" : m5179N2.f9667a;
    }

    /* renamed from: J2 */
    public final b m5181J2() {
        return m5176K2(this.f9646g2.f8948o2);
    }

    /* renamed from: P2 */
    public final void m5182P2(C1989g c1989g, AbstractC1984c0 abstractC1984c0, AbstractC2003u[] abstractC2003uArr) {
        C2000r.a aVar = this.f9646g2.f8948o2.f9072c2;
        if (aVar.f9076A1) {
            return;
        }
        b m5181J2 = m5181J2();
        synchronized (m5181J2) {
            a m5195e = m5181J2.m5195e();
            m5195e.f9647a = c1989g;
            m5195e.f9649c = abstractC1984c0;
            m5195e.f9650d = abstractC2003uArr;
        }
        if (aVar.f9088x1) {
            m5175I2(aVar, f9630k2, AbstractC2003u.f9130m);
        }
    }

    /* renamed from: Q2 */
    public final void m5183Q2(AbstractC1992j abstractC1992j) {
        C2000r.a aVar = this.f9646g2.f8948o2.f9072c2;
        if (aVar.f9076A1) {
            return;
        }
        b m5181J2 = m5181J2();
        synchronized (m5181J2) {
            m5181J2.m5195e().f9647a = abstractC1992j;
        }
        if (aVar.f9088x1) {
            m5175I2(aVar, f9630k2, AbstractC2003u.f9130m);
        }
    }

    /* renamed from: R2 */
    public final void m5184R2(int i7, AbstractC1984c0 abstractC1984c0, int i8) {
        int m5193b;
        C2000r.a aVar = this.f9646g2.f8948o2.f9072c2;
        if (aVar.f9076A1) {
            return;
        }
        b m5181J2 = m5181J2();
        synchronized (m5181J2) {
            int i9 = m5181J2.f9654b;
            if (i9 > 0) {
                m5181J2.f9653a[i9 - 1].m5188c(i7, abstractC1984c0, i8);
            }
        }
        if (aVar.f9082Z == null) {
            return;
        }
        int i10 = aVar.f9090z1;
        if (i10 > 0) {
            int i11 = aVar.f9078C1 + 1;
            aVar.f9078C1 = i11;
            if (i11 % i10 == 0) {
                m5175I2(aVar, f9632m2, AbstractC2003u.f9130m);
            }
        }
        if (!aVar.f9087w1 || (m5193b = m5181J2().m5193b()) == aVar.f9077B1) {
            return;
        }
        aVar.f9077B1 = m5193b;
        m5175I2(aVar, f9631l2, C1993k.m4765C2(m5193b));
    }

    /* renamed from: S2 */
    public final void m5185S2() {
        C2000r.a aVar = this.f9646g2.f8948o2.f9072c2;
        if (aVar.f9076A1) {
            return;
        }
        b m5181J2 = m5181J2();
        synchronized (m5181J2) {
            int i7 = m5181J2.f9654b;
            if (i7 > 0) {
                a[] aVarArr = m5181J2.f9653a;
                int i8 = i7 - 1;
                m5181J2.f9654b = i8;
                a aVar2 = aVarArr[i8];
                aVar2.f9647a = null;
                aVar2.f9650d = null;
            }
        }
        if (aVar.f9089y1) {
            m5175I2(aVar, f9633n2, AbstractC2003u.f9130m);
        }
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        C1981b mo4629l0 = abstractC2003u2.mo4629l0();
        this.f9646g2 = mo4629l0;
        mo4629l0.f8950q2 = this;
        C1999q c1999q = new C1999q();
        c1999q.mo4790Y1(C1998p.m4815M2("debug"), new e());
        c1999q.mo4790Y1(C1998p.m4815M2("gethook"), new f());
        c1999q.mo4790Y1(C1998p.m4815M2("getinfo"), new g());
        c1999q.mo4790Y1(C1998p.m4815M2("getlocal"), new h());
        c1999q.mo4790Y1(C1998p.m4815M2("getmetatable"), new i());
        c1999q.mo4790Y1(C1998p.m4815M2("getregistry"), new j());
        c1999q.mo4790Y1(C1998p.m4815M2("getupvalue"), new k());
        c1999q.mo4790Y1(C1998p.m4815M2("getuservalue"), new l());
        c1999q.mo4790Y1(C1998p.m4815M2("sethook"), new m());
        c1999q.mo4790Y1(C1998p.m4815M2("setlocal"), new n());
        c1999q.mo4790Y1(C1998p.m4815M2("setmetatable"), new o());
        c1999q.mo4790Y1(C1998p.m4815M2("setupvalue"), new p());
        c1999q.mo4790Y1(C1998p.m4815M2("setuservalue"), new q());
        c1999q.mo4790Y1(C1998p.m4815M2("traceback"), new r());
        c1999q.mo4790Y1(C1998p.m4815M2("upvalueid"), new s());
        c1999q.mo4790Y1(C1998p.m4815M2("upvaluejoin"), new t());
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("debug"), c1999q);
        if (!abstractC2003u2.mo4777L0(C1998p.m4815M2("package")).mo4804d1()) {
            AbstractC2003u mo4777L0 = abstractC2003u2.mo4777L0(C1998p.m4815M2("package"));
            mo4777L0.getClass();
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
            mo4777L02.getClass();
            mo4777L02.mo4790Y1(C1998p.m4815M2("debug"), c1999q);
        }
        return c1999q;
    }
}
