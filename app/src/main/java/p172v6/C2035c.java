package p172v6;

import android.ext.Tools;
import java.io.Serializable;
import java.util.Hashtable;
import p165u6.AbstractC2003u;
import p165u6.C1982b0;
import p165u6.C1985d;
import p165u6.C1987e;
import p165u6.C1990h;
import p165u6.C1993k;
import p165u6.C1998p;
import p165u6.C2008z;
import p172v6.C2037e;
import p172v6.C2038f;
import p183x1.C2175b;

/* renamed from: v6.c */
/* loaded from: classes.dex */
public final class C2035c extends C2033a {

    /* renamed from: b */
    public C2008z f9223b;

    /* renamed from: c */
    public Hashtable f9224c;

    /* renamed from: d */
    public C2035c f9225d;

    /* renamed from: e */
    public C2037e f9226e;

    /* renamed from: f */
    public a f9227f;

    /* renamed from: g */
    public int f9228g;

    /* renamed from: h */
    public int f9229h;

    /* renamed from: i */
    public C2036d f9230i;

    /* renamed from: j */
    public int f9231j;

    /* renamed from: k */
    public int f9232k;

    /* renamed from: l */
    public int f9233l;

    /* renamed from: m */
    public short f9234m;

    /* renamed from: n */
    public short f9235n;

    /* renamed from: o */
    public short f9236o;

    /* renamed from: p */
    public short f9237p;

    /* renamed from: v6.c$a */
    public static class a {

        /* renamed from: a */
        public a f9238a;

        /* renamed from: b */
        public short f9239b;

        /* renamed from: c */
        public short f9240c;

        /* renamed from: d */
        public short f9241d;

        /* renamed from: e */
        public boolean f9242e;

        /* renamed from: f */
        public boolean f9243f;
    }

    /* renamed from: g0 */
    public static int m4935g0(C2035c c2035c, C1998p c1998p, C2037e.i iVar, int i7) {
        if (c2035c == null) {
            return 0;
        }
        int i8 = -1;
        int i9 = c2035c.f9235n - 1;
        while (true) {
            if (i9 < 0) {
                i9 = -1;
                break;
            }
            C1998p c1998p2 = c2035c.m4945J(i9).f8986a;
            c1998p.getClass();
            if (c1998p2.mo4825O1(c1998p)) {
                break;
            }
            i9--;
        }
        if (i9 >= 0) {
            iVar.m5049b(7, i9);
            if (i7 == 0) {
                a aVar = c2035c.f9227f;
                while (aVar.f9241d > i9) {
                    aVar = aVar.f9238a;
                }
                aVar.f9242e = true;
            }
            return 7;
        }
        C1982b0[] c1982b0Arr = c2035c.f9223b.f9148f;
        int i10 = 0;
        while (true) {
            if (i10 >= c2035c.f9236o) {
                break;
            }
            C1998p c1998p3 = c1982b0Arr[i10].f8961a;
            c1998p3.getClass();
            if (c1998p.mo4825O1(c1998p3)) {
                i8 = i10;
                break;
            }
            i10++;
        }
        if (i8 < 0) {
            if (m4935g0(c2035c.f9225d, c1998p, iVar, 0) == 0) {
                iVar.m5049b(8, 255);
                iVar.f9291b.f9298e = c2035c.m4969j(c1998p);
                return 0;
            }
            i8 = c2035c.m4955T(c1998p, iVar);
        }
        iVar.m5049b(10, i8);
        return 10;
    }

    /* renamed from: A */
    public final void m4936A(int i7, C2037e.i iVar) {
        boolean z6;
        int m4973n;
        int m4973n2;
        boolean z7;
        m4980u(i7, iVar);
        int i8 = iVar.f9290a;
        C2037e.i.a aVar = iVar.f9291b;
        C2036d c2036d = iVar.f9292c;
        if (i8 == 12) {
            m4979t(c2036d, aVar.f9298e);
        }
        boolean m5048a = iVar.m5048a();
        C2036d c2036d2 = iVar.f9293d;
        if (m5048a) {
            int i9 = c2036d.f9244a;
            while (true) {
                if (i9 == -1) {
                    z6 = false;
                    break;
                } else {
                    if (((m4944I(i9).m5318a() >> 0) & 63) != 28) {
                        z6 = true;
                        break;
                    }
                    i9 = m4943H(i9);
                }
            }
            if (!z6) {
                int i10 = c2036d2.f9244a;
                while (true) {
                    if (i10 == -1) {
                        z7 = false;
                        break;
                    } else {
                        if (((m4944I(i10).m5318a() >> 0) & 63) != 28) {
                            z7 = true;
                            break;
                        }
                        i10 = m4943H(i10);
                    }
                }
                if (!z7) {
                    m4973n2 = -1;
                    m4973n = -1;
                    int i11 = this.f9228g;
                    this.f9229h = i11;
                    m4960Y(c2036d2.f9244a, i11, i7, m4973n);
                    m4960Y(c2036d.f9244a, i11, i7, m4973n2);
                }
            }
            int m4951P = iVar.f9290a == 12 ? -1 : m4951P();
            this.f9229h = this.f9228g;
            m4973n = m4973n(3, i7, 0, 1);
            this.f9229h = this.f9228g;
            m4973n2 = m4973n(3, i7, 1, 0);
            m4962a0(m4951P);
            int i112 = this.f9228g;
            this.f9229h = i112;
            m4960Y(c2036d2.f9244a, i112, i7, m4973n);
            m4960Y(c2036d.f9244a, i112, i7, m4973n2);
        }
        c2036d.f9244a = -1;
        c2036d2.f9244a = -1;
        aVar.f9298e = i7;
        iVar.f9290a = 6;
    }

    /* renamed from: B */
    public final void m4937B(int i7, int i8) {
        int[] iArr = this.f9223b.f9144b;
        int i9 = i8 - (i7 + 1);
        C2033a.m4928g(i8 != -1);
        if (Math.abs(i9) <= 131071) {
            iArr[i7] = (iArr[i7] & 16383) | (((i9 + 131071) << 14) & (-16384));
        } else {
            this.f9226e.m5030n0("control structure too long");
            throw null;
        }
    }

    /* renamed from: C */
    public final void m4938C(int i7) {
        this.f9223b.f9146d[this.f9228g - 1] = i7;
    }

    /* renamed from: D */
    public final void m4939D(C2037e.i iVar) {
        if (iVar.f9290a == 6) {
            m4940E(iVar.f9291b.f9298e);
        }
    }

    /* renamed from: E */
    public final void m4940E(int i7) {
        if (C1987e.m4679c(i7) || i7 < this.f9235n) {
            return;
        }
        short s7 = (short) (this.f9237p - 1);
        this.f9237p = s7;
        C2033a.m4928g(i7 == s7);
    }

    /* renamed from: F */
    public final int m4941F(C2037e.i iVar) {
        return this.f9223b.f9144b[iVar.f9291b.f9298e];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.io.Serializable] */
    /* renamed from: G */
    public final C2175b m4942G(C2037e.i iVar) {
        return new C2175b((Serializable) this.f9223b.f9144b, iVar.f9291b.f9298e);
    }

    /* renamed from: H */
    public final int m4943H(int i7) {
        int m4678b = C1987e.m4678b(this.f9223b.f9144b[i7]);
        if (m4678b == -1) {
            return -1;
        }
        return i7 + 1 + m4678b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.io.Serializable] */
    /* renamed from: I */
    public final C2175b m4944I(int i7) {
        ?? r12 = this.f9223b.f9144b;
        C2175b c2175b = new C2175b((Serializable) r12, i7);
        if (i7 >= 1) {
            return (C1987e.f9002a[(r12[i7 + (-1)] >> 0) & 63] & Tools.Semaphore.f159S7) != 0 ? new C2175b((Serializable) r12, i7 - 1) : c2175b;
        }
        return c2175b;
    }

    /* renamed from: J */
    public final C1985d m4945J(int i7) {
        short s7 = this.f9226e.f9263n.f9271a[this.f9233l + i7].f9289a;
        C2033a.m4928g(s7 < this.f9234m);
        return this.f9223b.f9147e[s7];
    }

    /* renamed from: K */
    public final void m4946K(C2037e.i iVar) {
        m4981v(iVar);
        int i7 = iVar.f9290a;
        m4979t(iVar.f9292c, (i7 == 1 || i7 == 3) ? -1 : i7 != 12 ? m4952Q(1, iVar) : iVar.f9291b.f9298e);
        C2036d c2036d = iVar.f9293d;
        m4962a0(c2036d.f9244a);
        c2036d.f9244a = -1;
    }

    /* renamed from: L */
    public final void m4947L(C2037e.i iVar) {
        int i7;
        m4981v(iVar);
        int i8 = iVar.f9290a;
        if (i8 != 2) {
            if (i8 == 12) {
                m4950O(iVar);
                i7 = iVar.f9291b.f9298e;
            } else if (i8 != 4 && i8 != 5) {
                i7 = m4952Q(0, iVar);
            }
            m4979t(iVar.f9293d, i7);
            C2036d c2036d = iVar.f9292c;
            m4962a0(c2036d.f9244a);
            c2036d.f9244a = -1;
        }
        i7 = -1;
        m4979t(iVar.f9293d, i7);
        C2036d c2036d2 = iVar.f9292c;
        m4962a0(c2036d2.f9244a);
        c2036d2.f9244a = -1;
    }

    /* renamed from: M */
    public final void m4948M(C2037e.i iVar, C2037e.i iVar2) {
        C2037e.i.a aVar = iVar.f9291b;
        aVar.f9295b = (short) aVar.f9298e;
        aVar.f9294a = (short) m4983x(iVar2);
        int i7 = iVar.f9290a;
        boolean z6 = true;
        if (i7 != 10) {
            if (!(i7 == 6 || i7 == 7)) {
                z6 = false;
            }
        }
        C2033a.m4928g(z6);
        iVar.f9291b.f9296c = (short) (iVar.f9290a == 10 ? 10 : 7);
        iVar.f9290a = 11;
    }

    /* renamed from: N */
    public final void m4949N(int i7, C2037e.i iVar) {
        if (i7 == 19) {
            m4947L(iVar);
            return;
        }
        if (i7 == 20) {
            m4946K(iVar);
            return;
        }
        switch (i7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                if (iVar.m5050c()) {
                    return;
                }
                break;
            case 12:
                m4985z(iVar);
                return;
        }
        m4983x(iVar);
    }

    /* renamed from: O */
    public final void m4950O(C2037e.i iVar) {
        C2175b m4944I = m4944I(iVar.f9291b.f9298e);
        C2033a.m4928g((!((C1987e.f9002a[(m4944I.m5318a() >> 0) & 63] & Tools.Semaphore.f159S7) != 0) || ((m4944I.m5318a() >> 0) & 63) == 28 || ((m4944I.m5318a() >> 0) & 63) == 27) ? false : true);
        C2033a.m4925d(m4944I, ((m4944I.m5318a() >> 6) & 255) == 0 ? 1 : 0);
    }

    /* renamed from: P */
    public final int m4951P() {
        C2036d c2036d = this.f9230i;
        int i7 = c2036d.f9244a;
        c2036d.f9244a = -1;
        int m4975p = m4975p(23, 0);
        if (i7 == -1) {
            return m4975p;
        }
        if (m4975p != -1) {
            int i8 = m4975p;
            while (true) {
                int m4943H = m4943H(i8);
                if (m4943H == -1) {
                    break;
                }
                i8 = m4943H;
            }
            m4937B(i8, i7);
            i7 = m4975p;
        }
        return i7;
    }

    /* renamed from: Q */
    public final int m4952Q(int i7, C2037e.i iVar) {
        if (iVar.f9290a == 13) {
            int m4941F = m4941F(iVar);
            if (((m4941F >> 0) & 63) == 20) {
                this.f9228g--;
                m4973n(27, (m4941F >> 23) & 511, 0, i7 != 0 ? 0 : 1);
                return m4951P();
            }
        }
        if (iVar.f9290a != 6) {
            m4964c0(1);
            m4980u(this.f9237p - 1, iVar);
        }
        m4939D(iVar);
        m4973n(28, 255, iVar.f9291b.f9298e, i7);
        return m4951P();
    }

    /* renamed from: R */
    public final void m4953R(C2037e.a aVar) {
        if (aVar.f9270e == 0) {
            return;
        }
        C2037e.i iVar = aVar.f9266a;
        int i7 = iVar.f9290a;
        if (i7 == 14 || i7 == 15) {
            m4967f0(-1, iVar);
            m4965d0(aVar.f9267b.f9291b.f9298e, aVar.f9269d, -1);
            aVar.f9269d--;
        } else {
            if (i7 != 0) {
                m4985z(iVar);
            }
            m4965d0(aVar.f9267b.f9291b.f9298e, aVar.f9269d, aVar.f9270e);
        }
    }

    /* renamed from: S */
    public final void m4954S() {
        short s7;
        StringBuilder sb;
        a aVar = this.f9227f;
        if (aVar.f9238a != null && aVar.f9242e) {
            int m4951P = m4951P();
            m4958W(m4951P, aVar.f9241d);
            m4962a0(m4951P);
        }
        if (aVar.f9243f) {
            C2037e c2037e = this.f9226e;
            c2037e.getClass();
            C1998p m4815M2 = C1998p.m4815M2("break");
            C2037e.b bVar = c2037e.f9263n;
            C2037e.d[] m4929h = C2033a.m4929h(bVar.f9275e, bVar.f9276f + 1);
            bVar.f9275e = m4929h;
            int i7 = bVar.f9276f;
            bVar.f9276f = i7 + 1;
            C2035c c2035c = c2037e.f9258i;
            C2037e.d dVar = new C2037e.d(m4815M2, c2035c.f9228g, 0, c2035c.f9235n);
            m4929h[i7] = dVar;
            c2037e.m4996F(dVar);
        }
        this.f9227f = aVar.f9238a;
        short s8 = aVar.f9241d;
        this.f9226e.f9263n.f9272b -= this.f9235n - s8;
        while (true) {
            s7 = this.f9235n;
            if (s7 <= s8) {
                break;
            }
            short s9 = (short) (s7 - 1);
            this.f9235n = s9;
            C1985d m4945J = m4945J(s9);
            m4945J.f8988c = this.f9228g;
            m4945J.f8990e = this.f9226e.f9251b;
        }
        C2033a.m4928g(aVar.f9241d == s7);
        this.f9237p = this.f9235n;
        C2037e c2037e2 = this.f9226e;
        C2037e.b bVar2 = c2037e2.f9263n;
        bVar2.f9276f = aVar.f9239b;
        if (aVar.f9238a != null) {
            int i8 = aVar.f9240c;
            C2037e.d[] dVarArr = bVar2.f9273c;
            while (i8 < this.f9226e.f9263n.f9274d) {
                C2037e.d dVar2 = dVarArr[i8];
                int i9 = dVar2.f9282d;
                int i10 = aVar.f9241d;
                if (i9 > i10) {
                    if (aVar.f9242e) {
                        m4958W(dVar2.f9280b, i10);
                    }
                    dVar2.f9282d = aVar.f9241d;
                }
                if (!this.f9226e.m4997G(i8)) {
                    i8++;
                }
            }
            return;
        }
        short s10 = aVar.f9240c;
        if (s10 < bVar2.f9274d) {
            C2037e.d dVar3 = bVar2.f9273c[s10];
            C2038f.a aVar2 = c2037e2.f9259j;
            boolean containsKey = C2037e.f9246r.containsKey(dVar3.f9279a.mo4645M());
            int i11 = dVar3.f9281c;
            C1998p c1998p = dVar3.f9279a;
            if (containsKey) {
                sb = new StringBuilder("<");
                sb.append(c1998p);
                sb.append("> at line ");
                sb.append(i11);
                sb.append(" not inside a loop");
            } else {
                sb = new StringBuilder("no visible label '");
                sb.append(c1998p);
                sb.append("' for <goto> at line ");
                sb.append(i11);
            }
            String sb2 = sb.toString();
            aVar2.getClass();
            c2037e2.f9256g.f9287a = 0;
            c2037e2.m5030n0(sb2);
            throw null;
        }
    }

    /* renamed from: T */
    public final int m4955T(C1998p c1998p, C2037e.i iVar) {
        m4970k(this.f9236o + 1, 255);
        C2008z c2008z = this.f9223b;
        C1982b0[] c1982b0Arr = c2008z.f9148f;
        if (c1982b0Arr == null || this.f9236o + 1 > c1982b0Arr.length) {
            short s7 = this.f9236o;
            int i7 = s7 > 0 ? s7 * 2 : 1;
            C1982b0[] c1982b0Arr2 = new C1982b0[i7];
            if (c1982b0Arr != null) {
                System.arraycopy(c1982b0Arr, 0, c1982b0Arr2, 0, Math.min(c1982b0Arr.length, i7));
            }
            c2008z.f9148f = c1982b0Arr2;
        }
        this.f9223b.f9148f[this.f9236o] = new C1982b0(iVar.f9291b.f9298e, c1998p, iVar.f9290a == 7);
        short s8 = this.f9236o;
        this.f9236o = (short) (s8 + 1);
        return s8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int[], java.io.Serializable] */
    /* renamed from: U */
    public final void m4956U(int i7, int i8) {
        int i9 = (i7 + i8) - 1;
        int i10 = this.f9228g;
        if (i10 > this.f9229h && i10 > 0) {
            ?? r22 = this.f9223b.f9144b;
            char c7 = r22[i10 - 1];
            if (((c7 >> 0) & 63) == 4) {
                int i11 = (c7 >> 6) & 255;
                int i12 = ((c7 >> 23) & 511) + i11;
                if ((i11 <= i7 && i7 <= i12 + 1) || (i7 <= i11 && i11 <= i9 + 1)) {
                    if (i11 < i7) {
                        i7 = i11;
                    }
                    if (i12 > i9) {
                        i9 = i12;
                    }
                    C2175b c2175b = new C2175b((Serializable) r22, i10 - 1);
                    C2033a.m4925d(c2175b, i7);
                    C2033a.m4926e(c2175b, i9 - i7);
                    return;
                }
            }
        }
        m4973n(4, i7, i8 - 1, 0);
    }

    /* renamed from: V */
    public final int m4957V(AbstractC2003u abstractC2003u) {
        if (abstractC2003u instanceof C1990h) {
            double mo4744n2 = abstractC2003u.mo4744n2();
            long j7 = (long) mo4744n2;
            if (mo4744n2 == j7) {
                abstractC2003u = C1993k.m4766D2(j7);
            }
        }
        return m4969j(abstractC2003u);
    }

    /* renamed from: W */
    public final void m4958W(int i7, int i8) {
        int i9 = i8 + 1;
        while (i7 != -1) {
            int m4943H = m4943H(i7);
            int i10 = this.f9223b.f9144b[i7];
            C2033a.m4928g(((i10 >> 0) & 63) == 23 && (((i10 >> 6) & 255) == 0 || ((i10 >> 6) & 255) >= i9));
            int[] iArr = this.f9223b.f9144b;
            iArr[i7] = (iArr[i7] & (-16321)) | ((i9 << 6) & 16320);
            i7 = m4943H;
        }
    }

    /* renamed from: X */
    public final void m4959X(int i7, int i8) {
        int i9 = this.f9228g;
        if (i8 == i9) {
            m4962a0(i7);
        } else {
            C2033a.m4928g(i8 < i9);
            m4960Y(i7, i8, 255, i8);
        }
    }

    /* renamed from: Y */
    public final void m4960Y(int i7, int i8, int i9, int i10) {
        while (i7 != -1) {
            int m4943H = m4943H(i7);
            if (m4961Z(i7, i9)) {
                m4937B(i7, i8);
            } else {
                m4937B(i7, i10);
            }
            i7 = m4943H;
        }
    }

    /* renamed from: Z */
    public final boolean m4961Z(int i7, int i8) {
        C2175b m4944I = m4944I(i7);
        if (((m4944I.m5318a() >> 0) & 63) != 28) {
            return false;
        }
        if (i8 != 255 && i8 != ((m4944I.m5318a() >> 23) & 511)) {
            C2033a.m4925d(m4944I, i8);
            return true;
        }
        ((int[]) m4944I.f9887b)[m4944I.f9886a] = ((((m4944I.m5318a() >> 23) & 511) << 6) & 16320) | 27 | 0 | ((((m4944I.m5318a() >> 14) & 511) << 14) & 8372224);
        return true;
    }

    /* renamed from: a0 */
    public final void m4962a0(int i7) {
        this.f9229h = this.f9228g;
        m4979t(this.f9230i, i7);
    }

    /* renamed from: b0 */
    public final void m4963b0(int i7, int i8, C2037e.i iVar, C2037e.i iVar2) {
        int i9;
        int i10;
        C2036d c2036d;
        switch (i7) {
            case 0:
                m4976q(13, i8, iVar, iVar2);
                break;
            case 1:
                i9 = 14;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 2:
                i9 = 15;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 3:
                i9 = 17;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 4:
                i9 = 18;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 5:
                i9 = 16;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 6:
                i9 = 39;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 7:
                i9 = 40;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 8:
                i9 = 41;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 9:
                i9 = 42;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 10:
                i9 = 43;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 11:
                i9 = 44;
                m4976q(i9, i8, iVar, iVar2);
                break;
            case 12:
                if (iVar2.m5048a()) {
                    m4984y(iVar2);
                } else {
                    m4981v(iVar2);
                }
                if (iVar2.f9290a != 13 || ((m4941F(iVar2) >> 0) & 63) != 22) {
                    m4985z(iVar2);
                    m4976q(22, i8, iVar, iVar2);
                    break;
                } else {
                    C2033a.m4928g(iVar.f9291b.f9298e == ((m4941F(iVar2) >> 23) & 511) - 1);
                    m4939D(iVar);
                    C2175b m4942G = m4942G(iVar2);
                    C2037e.i.a aVar = iVar.f9291b;
                    C2033a.m4926e(m4942G, aVar.f9298e);
                    iVar.f9290a = 13;
                    aVar.f9298e = iVar2.f9291b.f9298e;
                    break;
                }
                break;
            case 13:
                m4977r(24, 1, iVar, iVar2);
                break;
            case 14:
                m4977r(25, 1, iVar, iVar2);
                break;
            case 15:
                m4977r(26, 1, iVar, iVar2);
                break;
            case 16:
                m4977r(24, 0, iVar, iVar2);
                break;
            case 17:
                m4977r(25, 0, iVar, iVar2);
                break;
            case 18:
                m4977r(26, 0, iVar, iVar2);
                break;
            case 19:
                C2033a.m4928g(iVar.f9292c.f9244a == -1);
                m4981v(iVar2);
                i10 = iVar.f9293d.f9244a;
                c2036d = iVar2.f9293d;
                m4979t(c2036d, i10);
                iVar.m5051d(iVar2);
                break;
            case 20:
                C2033a.m4928g(iVar.f9293d.f9244a == -1);
                m4981v(iVar2);
                i10 = iVar.f9292c.f9244a;
                c2036d = iVar2.f9292c;
                m4979t(c2036d, i10);
                iVar.m5051d(iVar2);
                break;
            default:
                C2033a.m4928g(false);
                break;
        }
    }

    /* renamed from: c0 */
    public final void m4964c0(int i7) {
        short s7 = this.f9237p;
        int i8 = s7 + i7;
        C2008z c2008z = this.f9223b;
        if (i8 > c2008z.f9154l) {
            if (i8 >= 250) {
                this.f9226e.m5030n0("function or expression too complex");
                throw null;
            }
            c2008z.f9154l = i8;
        }
        this.f9237p = (short) (s7 + i7);
    }

    /* renamed from: d0 */
    public final void m4965d0(int i7, int i8, int i9) {
        int i10 = ((i8 - 1) / 50) + 1;
        int i11 = i9 == -1 ? 0 : i9;
        C2033a.m4928g(i9 != 0);
        if (i10 <= 511) {
            m4973n(36, i7, i11, i10);
        } else {
            m4973n(36, i7, i11, 0);
            m4972m(i10, this.f9226e.f9255f);
        }
        this.f9237p = (short) (i7 + 1);
    }

    /* renamed from: e0 */
    public final void m4966e0(C2037e.i iVar) {
        int i7 = iVar.f9290a;
        if (i7 == 14) {
            iVar.f9290a = 6;
            iVar.f9291b.f9298e = (m4941F(iVar) >> 6) & 255;
        } else if (i7 == 15) {
            C2033a.m4926e(m4942G(iVar), 2);
            iVar.f9290a = 13;
        }
    }

    /* renamed from: f0 */
    public final void m4967f0(int i7, C2037e.i iVar) {
        int i8 = iVar.f9290a;
        if (i8 == 14) {
            C2033a.m4927f(m4942G(iVar), i7 + 1);
        } else if (i8 == 15) {
            C2033a.m4926e(m4942G(iVar), i7 + 1);
            C2033a.m4925d(m4942G(iVar), this.f9237p);
            m4964c0(1);
        }
    }

    /* renamed from: h0 */
    public final void m4968h0(C2037e.i iVar, C2037e.i iVar2) {
        int m4984y;
        int i7;
        int i8 = iVar.f9290a;
        C2037e.i.a aVar = iVar.f9291b;
        switch (i8) {
            case 7:
                m4939D(iVar2);
                m4936A(aVar.f9298e, iVar2);
                break;
            case 8:
                m4984y = m4984y(iVar2);
                i7 = 47;
                m4974o(i7, m4984y, aVar.f9298e);
                m4939D(iVar2);
                break;
            case 9:
                m4984y = m4984y(iVar2);
                i7 = 50;
                m4974o(i7, m4984y, aVar.f9298e);
                m4939D(iVar2);
                break;
            case 10:
                m4973n(9, m4984y(iVar2), aVar.f9298e, 0);
                m4939D(iVar2);
                break;
            case 11:
                m4973n(aVar.f9296c == 7 ? 10 : 8, aVar.f9295b, aVar.f9294a, m4983x(iVar2));
                m4939D(iVar2);
                break;
            default:
                C2033a.m4928g(false);
                m4939D(iVar2);
                break;
        }
    }

    /* renamed from: j */
    public final int m4969j(AbstractC2003u abstractC2003u) {
        Hashtable hashtable = this.f9224c;
        if (hashtable == null) {
            this.f9224c = new Hashtable();
        } else if (hashtable.containsKey(abstractC2003u)) {
            return ((Integer) this.f9224c.get(abstractC2003u)).intValue();
        }
        int i7 = this.f9231j;
        this.f9224c.put(abstractC2003u, new Integer(i7));
        C2008z c2008z = this.f9223b;
        AbstractC2003u[] abstractC2003uArr = c2008z.f9143a;
        if (abstractC2003uArr == null || this.f9231j + 1 >= abstractC2003uArr.length) {
            int i8 = (this.f9231j * 2) + 1;
            AbstractC2003u[] abstractC2003uArr2 = new AbstractC2003u[i8];
            if (abstractC2003uArr != null) {
                System.arraycopy(abstractC2003uArr, 0, abstractC2003uArr2, 0, Math.min(abstractC2003uArr.length, i8));
            }
            c2008z.f9143a = abstractC2003uArr2;
        }
        AbstractC2003u[] abstractC2003uArr3 = c2008z.f9143a;
        int i9 = this.f9231j;
        this.f9231j = i9 + 1;
        abstractC2003uArr3[i9] = abstractC2003u;
        return i7;
    }

    /* renamed from: k */
    public final void m4970k(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        int i9 = this.f9223b.f9150h;
        throw null;
    }

    /* renamed from: l */
    public final void m4971l(C2037e.a aVar) {
        C2037e.i iVar = aVar.f9266a;
        if (iVar.f9290a == 0) {
            return;
        }
        m4985z(iVar);
        iVar.f9290a = 0;
        int i7 = aVar.f9270e;
        if (i7 == 50) {
            m4965d0(aVar.f9267b.f9291b.f9298e, aVar.f9269d, i7);
            aVar.f9270e = 0;
        }
    }

    /* renamed from: m */
    public final int m4972m(int i7, int i8) {
        C2008z c2008z = this.f9223b;
        int i9 = this.f9230i.f9244a;
        int i10 = this.f9228g;
        m4960Y(i9, i10, 255, i10);
        this.f9230i.f9244a = -1;
        int[] iArr = c2008z.f9144b;
        if (iArr == null || this.f9228g + 1 > iArr.length) {
            c2008z.f9144b = C2033a.m4930i((this.f9228g * 2) + 1, iArr);
        }
        int[] iArr2 = c2008z.f9144b;
        int i11 = this.f9228g;
        iArr2[i11] = i7;
        int[] iArr3 = c2008z.f9146d;
        if (iArr3 == null || i11 + 1 > iArr3.length) {
            c2008z.f9146d = C2033a.m4930i((i11 * 2) + 1, iArr3);
        }
        int[] iArr4 = c2008z.f9146d;
        int i12 = this.f9228g;
        iArr4[i12] = i8;
        this.f9228g = i12 + 1;
        return i12;
    }

    /* renamed from: n */
    public final int m4973n(int i7, int i8, int i9, int i10) {
        int[] iArr = C1987e.f9002a;
        boolean z6 = true;
        C2033a.m4928g((iArr[i7] & 3) == 0);
        C2033a.m4928g(((iArr[i7] >> 4) & 3) != 0 || i9 == 0);
        if (((iArr[i7] >> 2) & 3) == 0 && i10 != 0) {
            z6 = false;
        }
        C2033a.m4928g(z6);
        return m4972m(((i7 << 0) & 63) | ((i8 << 6) & 16320) | ((i9 << 23) & (-8388608)) | ((i10 << 14) & 8372224), this.f9226e.f9255f);
    }

    /* renamed from: o */
    public final int m4974o(int i7, int i8, int i9) {
        int[] iArr = C1987e.f9002a;
        int i10 = iArr[i7];
        C2033a.m4928g((i10 & 3) == 1 || (i10 & 3) == 2);
        C2033a.m4928g(((iArr[i7] >> 2) & 3) == 0);
        C2033a.m4928g(i9 >= 0 && i9 <= 262143);
        return m4972m(((i7 << 0) & 63) | ((i8 << 6) & 16320) | ((i9 << 14) & (-16384)), this.f9226e.f9255f);
    }

    /* renamed from: p */
    public final int m4975p(int i7, int i8) {
        return m4974o(i7, i8, 131070);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4976q(int r7, int r8, p172v6.C2037e.i r9, p172v6.C2037e.i r10) {
        /*
            r6 = this;
            boolean r0 = r9.m5050c()
            v6.e$i$a r1 = r9.f9291b
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L94
            boolean r0 = r10.m5050c()
            if (r0 != 0) goto L13
            goto L94
        L13:
            r0 = 16
            v6.e$i$a r4 = r10.f9291b
            if (r7 == r0) goto L1d
            r0 = 17
            if (r7 != r0) goto L2b
        L1d:
            u6.u r0 = r4.m5052a()
            u6.k r5 = p165u6.AbstractC2003u.f9126Z
            boolean r0 = r0.mo4704G0(r5)
            if (r0 == 0) goto L2b
            goto L94
        L2b:
            u6.u r0 = r1.m5052a()
            u6.u r4 = r4.m5052a()
            if (r7 == r2) goto L94
            switch(r7) {
                case 13: goto L5e;
                case 14: goto L59;
                case 15: goto L54;
                case 16: goto L4f;
                case 17: goto L4a;
                case 18: goto L45;
                case 19: goto L40;
                default: goto L38;
            }
        L38:
            switch(r7) {
                case 39: goto L81;
                case 40: goto L7c;
                case 41: goto L77;
                case 42: goto L72;
                case 43: goto L6d;
                case 44: goto L68;
                case 45: goto L63;
                default: goto L3b;
            }
        L3b:
            p172v6.C2033a.m4928g(r3)
            r0 = 0
            goto L85
        L40:
            u6.u r0 = r0.mo4758w1()
            goto L85
        L45:
            u6.u r0 = r0.mo4705I1(r4)
            goto L85
        L4a:
            u6.u r0 = r0.mo4751r1(r4)
            goto L85
        L4f:
            u6.u r0 = r0.mo4701E0(r4)
            goto L85
        L54:
            u6.u r0 = r0.mo4757v1(r4)
            goto L85
        L59:
            u6.u r0 = r0.mo4737j2(r4)
            goto L85
        L5e:
            u6.u r0 = r0.mo4713Q(r4)
            goto L85
        L63:
            u6.u r0 = r0.mo4721X()
            goto L85
        L68:
            u6.u r0 = r0.mo4732e2(r4)
            goto L85
        L6d:
            u6.u r0 = r0.mo4730c2(r4)
            goto L85
        L72:
            u6.u r0 = r0.mo4728c0(r4)
            goto L85
        L77:
            u6.u r0 = r0.mo4723Z(r4)
            goto L85
        L7c:
            u6.u r0 = r0.mo4720W(r4)
            goto L85
        L81:
            u6.u r0 = r0.mo4718U0(r4)
        L85:
            double r4 = r0.mo4744n2()
            boolean r4 = java.lang.Double.isNaN(r4)
            if (r4 == 0) goto L90
            goto L94
        L90:
            r1.f9297d = r0
            r0 = 1
            goto L95
        L94:
            r0 = 0
        L95:
            if (r0 == 0) goto L98
            return
        L98:
            r0 = 19
            if (r7 == r0) goto La7
            if (r7 == r2) goto La7
            r0 = 45
            if (r7 == r0) goto La7
            int r0 = r6.m4983x(r10)
            goto La8
        La7:
            r0 = 0
        La8:
            int r2 = r6.m4983x(r9)
            if (r2 <= r0) goto Lb5
            r6.m4939D(r9)
            r6.m4939D(r10)
            goto Lbb
        Lb5:
            r6.m4939D(r10)
            r6.m4939D(r9)
        Lbb:
            int r7 = r6.m4973n(r7, r3, r2, r0)
            r1.f9298e = r7
            r7 = 13
            r9.f9290a = r7
            r6.m4938C(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172v6.C2035c.m4976q(int, int, v6.e$i, v6.e$i):void");
    }

    /* renamed from: r */
    public final void m4977r(int i7, int i8, C2037e.i iVar, C2037e.i iVar2) {
        int m4983x = m4983x(iVar);
        int m4983x2 = m4983x(iVar2);
        m4939D(iVar2);
        m4939D(iVar);
        if (i8 == 0 && i7 != 24) {
            i8 = 1;
            m4983x2 = m4983x;
            m4983x = m4983x2;
        }
        m4973n(i7, i8, m4983x, m4983x2);
        iVar.f9291b.f9298e = m4951P();
        iVar.f9290a = 12;
    }

    /* renamed from: s */
    public final void m4978s(int i7, int i8) {
        if (i8 <= 262143) {
            m4974o(1, i7, i8);
            return;
        }
        m4974o(2, i7, 0);
        C2033a.m4928g(i8 <= 67108863);
        m4972m(((i8 << 6) & (-64)) | 58, this.f9226e.f9254e);
    }

    /* renamed from: t */
    public final void m4979t(C2036d c2036d, int i7) {
        if (i7 == -1) {
            return;
        }
        int i8 = c2036d.f9244a;
        if (i8 == -1) {
            c2036d.f9244a = i7;
            return;
        }
        while (true) {
            int m4943H = m4943H(i8);
            if (m4943H == -1) {
                m4937B(i8, i7);
                return;
            }
            i8 = m4943H;
        }
    }

    /* renamed from: u */
    public final void m4980u(int i7, C2037e.i iVar) {
        int i8;
        m4981v(iVar);
        int i9 = iVar.f9290a;
        C2037e.i.a aVar = iVar.f9291b;
        if (i9 != 13) {
            switch (i9) {
                case 1:
                    m4956U(i7, 1);
                    break;
                case 2:
                case 3:
                    m4973n(3, i7, i9 != 2 ? 0 : 1, 0);
                    break;
                case 4:
                    i8 = aVar.f9298e;
                    m4978s(i7, i8);
                    break;
                case 5:
                    i8 = m4957V(aVar.m5052a());
                    m4978s(i7, i8);
                    break;
                case 6:
                    int i10 = aVar.f9298e;
                    if (i7 != i10) {
                        m4973n(0, i7, i10, 0);
                        break;
                    }
                    break;
                default:
                    C2033a.m4928g(i9 == 0 || i9 == 12);
                    break;
            }
            return;
        }
        C2033a.m4925d(m4942G(iVar), i7);
        aVar.f9298e = i7;
        iVar.f9290a = 6;
    }

    /* renamed from: v */
    public final void m4981v(C2037e.i iVar) {
        int i7;
        int m4974o;
        int i8 = iVar.f9290a;
        int i9 = 6;
        C2037e.i.a aVar = iVar.f9291b;
        switch (i8) {
            case 7:
                iVar.f9290a = 6;
                break;
            case 8:
                i7 = 46;
                m4974o = m4974o(i7, 0, aVar.f9298e);
                aVar.f9298e = m4974o;
                iVar.f9290a = 13;
                break;
            case 9:
                i7 = 49;
                m4974o = m4974o(i7, 0, aVar.f9298e);
                aVar.f9298e = m4974o;
                iVar.f9290a = 13;
                break;
            case 10:
                m4974o = m4973n(5, 0, aVar.f9298e, 0);
                aVar.f9298e = m4974o;
                iVar.f9290a = 13;
                break;
            case 11:
                m4940E(aVar.f9294a);
                if (aVar.f9296c == 7) {
                    m4940E(aVar.f9295b);
                    i9 = 7;
                }
                m4974o = m4973n(i9, 0, aVar.f9295b, aVar.f9294a);
                aVar.f9298e = m4974o;
                iVar.f9290a = 13;
                break;
            case 14:
            case 15:
                m4966e0(iVar);
                break;
        }
    }

    /* renamed from: w */
    public final void m4982w(a aVar, boolean z6) {
        aVar.f9243f = z6;
        short s7 = this.f9235n;
        aVar.f9241d = s7;
        C2037e.b bVar = this.f9226e.f9263n;
        aVar.f9239b = (short) bVar.f9276f;
        aVar.f9240c = (short) bVar.f9274d;
        aVar.f9242e = false;
        aVar.f9238a = this.f9227f;
        this.f9227f = aVar;
        C2033a.m4928g(this.f9237p == s7);
    }

    /* renamed from: x */
    public final int m4983x(C2037e.i iVar) {
        int m4969j;
        if (iVar.m5048a()) {
            m4984y(iVar);
        } else {
            m4981v(iVar);
        }
        int i7 = iVar.f9290a;
        C2037e.i.a aVar = iVar.f9291b;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            if (i7 != 4) {
                if (i7 == 5) {
                    aVar.f9298e = m4957V(aVar.m5052a());
                    iVar.f9290a = 4;
                }
            }
            int i8 = aVar.f9298e;
            if (i8 <= 255) {
                return i8 | Tools.Semaphore.f160S8;
            }
        } else if (this.f9231j <= 255) {
            if (i7 == 1) {
                m4969j = m4969j(AbstractC2003u.f9130m);
            } else {
                m4969j = m4969j(i7 == 2 ? AbstractC2003u.f9131s : AbstractC2003u.f9122X);
            }
            aVar.f9298e = m4969j;
            iVar.f9290a = 4;
            return m4969j | Tools.Semaphore.f160S8;
        }
        return m4984y(iVar);
    }

    /* renamed from: y */
    public final int m4984y(C2037e.i iVar) {
        m4981v(iVar);
        int i7 = iVar.f9290a;
        C2037e.i.a aVar = iVar.f9291b;
        if (i7 == 6) {
            if (!iVar.m5048a()) {
                return aVar.f9298e;
            }
            int i8 = aVar.f9298e;
            if (i8 >= this.f9235n) {
                m4936A(i8, iVar);
                return aVar.f9298e;
            }
        }
        m4985z(iVar);
        return aVar.f9298e;
    }

    /* renamed from: z */
    public final void m4985z(C2037e.i iVar) {
        m4981v(iVar);
        m4939D(iVar);
        m4964c0(1);
        m4936A(this.f9237p - 1, iVar);
    }
}
