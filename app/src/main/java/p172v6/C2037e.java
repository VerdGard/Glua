package p172v6;

import android.ext.C0089a;
import android.ext.C0091c;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import p165u6.AbstractC2003u;
import p165u6.C1982b0;
import p165u6.C1985d;
import p165u6.C1990h;
import p165u6.C1991i;
import p165u6.C1993k;
import p165u6.C1996n;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2008z;
import p172v6.C2035c;
import p172v6.C2038f;
import p180w6.C2140i;
import p183x1.C2175b;

/* renamed from: v6.e */
/* loaded from: classes.dex */
public final class C2037e extends C2033a {

    /* renamed from: q */
    public static final String[] f9245q = {"(for control)", "(for generator)", "(for index)", "(for limit)", "(for state)", "(for step)"};

    /* renamed from: r */
    public static final Hashtable f9246r = new Hashtable();

    /* renamed from: s */
    public static final String[] f9247s;

    /* renamed from: t */
    public static final Hashtable f9248t;

    /* renamed from: u */
    public static final int[] f9249u;

    /* renamed from: v */
    public static final e[] f9250v;

    /* renamed from: b */
    public int f9251b;

    /* renamed from: c */
    public int f9252c;

    /* renamed from: d */
    public int f9253d;

    /* renamed from: e */
    public int f9254e;

    /* renamed from: f */
    public int f9255f;

    /* renamed from: i */
    public C2035c f9258i;

    /* renamed from: j */
    public C2038f.a f9259j;

    /* renamed from: k */
    public InputStream f9260k;

    /* renamed from: m */
    public int f9262m;

    /* renamed from: o */
    public C1998p f9264o;

    /* renamed from: p */
    public C1998p f9265p;

    /* renamed from: g */
    public final g f9256g = new g();

    /* renamed from: h */
    public final g f9257h = new g();

    /* renamed from: n */
    public final b f9263n = new b();

    /* renamed from: l */
    public char[] f9261l = new char[32];

    /* renamed from: v6.e$a */
    public static class a {

        /* renamed from: a */
        public final i f9266a = new i();

        /* renamed from: b */
        public i f9267b;

        /* renamed from: c */
        public int f9268c;

        /* renamed from: d */
        public int f9269d;

        /* renamed from: e */
        public int f9270e;
    }

    /* renamed from: v6.e$b */
    public static class b {

        /* renamed from: a */
        public h[] f9271a;

        /* renamed from: c */
        public d[] f9273c;

        /* renamed from: e */
        public d[] f9275e;

        /* renamed from: b */
        public int f9272b = 0;

        /* renamed from: d */
        public int f9274d = 0;

        /* renamed from: f */
        public int f9276f = 0;
    }

    /* renamed from: v6.e$c */
    public static class c {

        /* renamed from: a */
        public c f9277a;

        /* renamed from: b */
        public final i f9278b = new i();
    }

    /* renamed from: v6.e$d */
    public static class d {

        /* renamed from: a */
        public final C1998p f9279a;

        /* renamed from: b */
        public final int f9280b;

        /* renamed from: c */
        public final int f9281c;

        /* renamed from: d */
        public short f9282d;

        public d(C1998p c1998p, int i7, int i8, short s7) {
            this.f9279a = c1998p;
            this.f9280b = i7;
            this.f9281c = i8;
            this.f9282d = s7;
        }
    }

    /* renamed from: v6.e$e */
    public static class e {

        /* renamed from: a */
        public final byte f9283a;

        /* renamed from: b */
        public final byte f9284b;

        public e(int i7, int i8) {
            this.f9283a = (byte) i7;
            this.f9284b = (byte) i8;
        }
    }

    /* renamed from: v6.e$f */
    public static class f {

        /* renamed from: a */
        public AbstractC2003u f9285a;

        /* renamed from: b */
        public C1998p f9286b;
    }

    /* renamed from: v6.e$g */
    public static class g {

        /* renamed from: a */
        public int f9287a;

        /* renamed from: b */
        public final f f9288b = new f();
    }

    /* renamed from: v6.e$h */
    public static class h {

        /* renamed from: a */
        public final short f9289a;

        public h(int i7) {
            this.f9289a = (short) i7;
        }
    }

    /* renamed from: v6.e$i */
    public static class i {

        /* renamed from: a */
        public int f9290a;

        /* renamed from: b */
        public final a f9291b = new a();

        /* renamed from: c */
        public final C2036d f9292c = new C2036d();

        /* renamed from: d */
        public final C2036d f9293d = new C2036d();

        /* renamed from: v6.e$i$a */
        public static class a {

            /* renamed from: a */
            public short f9294a;

            /* renamed from: b */
            public short f9295b;

            /* renamed from: c */
            public short f9296c;

            /* renamed from: d */
            public AbstractC2003u f9297d;

            /* renamed from: e */
            public int f9298e;

            /* renamed from: a */
            public final AbstractC2003u m5052a() {
                AbstractC2003u abstractC2003u = this.f9297d;
                return abstractC2003u == null ? C1993k.m4765C2(this.f9298e) : abstractC2003u;
            }
        }

        /* renamed from: a */
        public final boolean m5048a() {
            return this.f9292c.f9244a != this.f9293d.f9244a;
        }

        /* renamed from: b */
        public final void m5049b(int i7, int i8) {
            this.f9293d.f9244a = -1;
            this.f9292c.f9244a = -1;
            this.f9290a = i7;
            this.f9291b.f9298e = i8;
        }

        /* renamed from: c */
        public final boolean m5050c() {
            return this.f9290a == 5 && this.f9292c.f9244a == -1 && this.f9293d.f9244a == -1;
        }

        public final Object clone() {
            i iVar = new i();
            iVar.m5051d(this);
            return iVar;
        }

        /* renamed from: d */
        public final void m5051d(i iVar) {
            this.f9293d.f9244a = iVar.f9293d.f9244a;
            this.f9290a = iVar.f9290a;
            this.f9292c.f9244a = iVar.f9292c.f9244a;
            a aVar = iVar.f9291b;
            AbstractC2003u abstractC2003u = aVar.f9297d;
            a aVar2 = this.f9291b;
            aVar2.f9297d = abstractC2003u;
            aVar2.f9294a = aVar.f9294a;
            aVar2.f9295b = aVar.f9295b;
            aVar2.f9296c = aVar.f9296c;
            aVar2.f9298e = aVar.f9298e;
        }
    }

    static {
        int i7 = 0;
        while (true) {
            String[] strArr = f9245q;
            if (i7 >= strArr.length) {
                break;
            }
            f9246r.put(strArr[i7], Boolean.TRUE);
            i7++;
        }
        f9247s = new String[]{"and", "break", "case", "catch", "continue", "default", "defer", "do", "else", "elseif", "end", "false", "finally", "for", "function", "goto", "if", "import", "in", "lambda", "local", "module", "nil", "not", "or", "repeat", "return", "switch", "then", "true", "try", "until", "when", "while", "..", "...", "==", ">=", "<=", "~=", "//", "<<", ">>", "::", "<eos>", "<number>", "<name>", "<string>", "<eof>"};
        f9248t = new Hashtable();
        for (int i8 = 0; i8 < 34; i8++) {
            String str = f9247s[i8];
            C1996n c1996n = AbstractC2003u.f9130m;
            f9248t.put(C1998p.m4815M2(str), new Integer(i8 + 257));
        }
        f9249u = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 4, 4, 4, 4, 4, 4, 4, 21, 21, 21, 21, 21, 21, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 5, 4, 21, 21, 21, 21, 21, 21, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        f9250v = new e[]{new e(10, 10), new e(10, 10), new e(11, 11), new e(11, 11), new e(14, 13), new e(11, 11), new e(11, 11), new e(6, 6), new e(4, 4), new e(5, 5), new e(7, 7), new e(7, 7), new e(9, 8), new e(3, 3), new e(3, 3), new e(3, 3), new e(3, 3), new e(3, 3), new e(3, 3), new e(2, 2), new e(1, 1), new e(1, 1)};
    }

    public C2037e(C2038f.a aVar, InputStream inputStream) {
        this.f9260k = inputStream;
        this.f9259j = aVar;
    }

    /* renamed from: K */
    public static int m4986K(int i7) {
        return i7 <= 57 ? i7 - 48 : i7 <= 70 ? (i7 + 10) - 65 : (i7 + 10) - 97;
    }

    /* renamed from: M */
    public static boolean m4987M(int i7) {
        return i7 >= 48 && i7 <= 57;
    }

    /* renamed from: N */
    public static boolean m4988N(int i7) {
        return (f9249u[i7 + 1] & 16) != 0;
    }

    /* renamed from: S */
    public static int m4989S(int i7) {
        int i8 = 0;
        while (i7 >= 16) {
            i7 = (i7 + 1) >> 1;
            i8++;
        }
        if (i7 < 8) {
            return i7;
        }
        return (i7 - 8) | ((i8 + 1) << 3);
    }

    /* renamed from: j */
    public static final String m4990j(String str) {
        return C0091c.m228f("'", str, "'");
    }

    /* renamed from: A */
    public final boolean m4991A() {
        int i7 = this.f9253d;
        return i7 == 10 || i7 == 13;
    }

    /* renamed from: B */
    public final void m4992B() {
        C2038f.a aVar = this.f9259j;
        int i7 = aVar.f9300a + 1;
        aVar.f9300a = i7;
        if (i7 <= 200) {
            return;
        }
        m5002O(0, "chunk has too many syntax levels");
        throw null;
    }

    /* renamed from: C */
    public final void m4993C(int i7) {
        C2038f.a aVar = this.f9259j;
        String str = m4990j(m5036q0(i7)) + " expected";
        aVar.getClass();
        m5030n0(str);
        throw null;
    }

    /* renamed from: D */
    public final int m4994D(i iVar) {
        m5026l0(0, iVar);
        int i7 = 1;
        while (m5034p0(44)) {
            this.f9258i.m4985z(iVar);
            m5026l0(0, iVar);
            i7++;
        }
        return i7;
    }

    /* renamed from: E */
    public final void m4995E(i iVar) {
        C2035c c2035c = this.f9258i;
        i iVar2 = new i();
        c2035c.getClass();
        if (iVar.f9290a != 10 || iVar.m5048a()) {
            c2035c.m4984y(iVar);
        }
        m5008V();
        m5045x(m5024k0(), iVar2);
        c2035c.m4948M(iVar, iVar2);
    }

    /* renamed from: F */
    public final void m4996F(d dVar) {
        b bVar = this.f9263n;
        d[] dVarArr = bVar.f9273c;
        int i7 = this.f9258i.f9227f.f9240c;
        while (i7 < bVar.f9274d) {
            C1998p c1998p = dVarArr[i7].f9279a;
            C1998p c1998p2 = dVar.f9279a;
            c1998p.getClass();
            if (c1998p2.mo4825O1(c1998p)) {
                m5043v(i7, dVar);
            } else {
                i7++;
            }
        }
    }

    /* renamed from: G */
    public final boolean m4997G(int i7) {
        C2035c.a aVar = this.f9258i.f9227f;
        b bVar = this.f9263n;
        d dVar = bVar.f9273c[i7];
        for (int i8 = aVar.f9239b; i8 < bVar.f9276f; i8++) {
            d dVar2 = bVar.f9275e[i8];
            C1998p c1998p = dVar2.f9279a;
            C1998p c1998p2 = dVar.f9279a;
            c1998p.getClass();
            if (c1998p2.mo4825O1(c1998p)) {
                short s7 = dVar.f9282d;
                short s8 = dVar2.f9282d;
                if (s7 > s8 && (aVar.f9242e || bVar.f9276f > aVar.f9239b)) {
                    this.f9258i.m4958W(dVar.f9280b, s8);
                }
                m5043v(i7, dVar2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m4998H(int i7, int i8, int i9, boolean z6, boolean z7) {
        int i10;
        C2035c.a aVar = new C2035c.a();
        C2035c c2035c = this.f9258i;
        m5027m(3);
        if (z7) {
            m5041t(41);
            z7 = m5034p0(123);
        }
        if (!z7) {
            m5034p0(264);
        }
        int m4975p = z6 ? c2035c.m4975p(33, i7) : c2035c.m4951P();
        c2035c.m4982w(aVar, false);
        m5027m(i9);
        c2035c.m4964c0(i9);
        m5031o();
        m5047z();
        c2035c.m4954S();
        c2035c.m4962a0(m4975p);
        if (z6) {
            i10 = 32;
        } else {
            c2035c.m4973n(34, i7, 0, i9);
            c2035c.m4938C(i8);
            i7 += 2;
            i10 = 35;
        }
        c2035c.m4959X(c2035c.m4975p(i10, i7), m4975p + 1);
        c2035c.m4938C(i8);
        return z7;
    }

    /* renamed from: I */
    public final void m4999I(int i7, i iVar) {
        C2035c c2035c = this.f9258i;
        i iVar2 = new i();
        g gVar = this.f9256g;
        int i8 = gVar.f9287a;
        int i9 = -1;
        if (i8 == 40) {
            m5008V();
            if (gVar.f9287a == 41) {
                iVar2.f9290a = 0;
            } else {
                m4994D(iVar2);
                c2035c.m4967f0(-1, iVar2);
            }
            m5037r(41, 40, i7);
        } else if (i8 == 123) {
            m5046y(iVar2);
        } else {
            if (i8 != 304) {
                m5030n0("function arguments expected");
                throw null;
            }
            m5045x(gVar.f9288b.f9286b, iVar2);
            m5008V();
        }
        C2033a.m4928g(iVar.f9290a == 6);
        int i10 = iVar.f9291b.f9298e;
        int i11 = iVar2.f9290a;
        if (!(i11 == 14 || i11 == 15)) {
            if (i11 != 0) {
                c2035c.m4985z(iVar2);
            }
            i9 = c2035c.f9237p - (i10 + 1);
        }
        iVar.m5049b(14, c2035c.m4973n(29, i10, i9 + 1, 2));
        c2035c.m4938C(i7);
        c2035c.f9237p = (short) (i10 + 1);
    }

    /* renamed from: J */
    public final void m5000J(int i7) {
        String str;
        C1998p m4815M2;
        int i8 = this.f9254e;
        if (m5034p0(272)) {
            m4815M2 = m5024k0();
        } else {
            if (m5034p0(261)) {
                str = "continue";
            } else {
                m5008V();
                str = "break";
            }
            m4815M2 = C1998p.m4815M2(str);
        }
        b bVar = this.f9263n;
        d[] m4929h = C2033a.m4929h(bVar.f9273c, bVar.f9274d + 1);
        bVar.f9273c = m4929h;
        int i9 = bVar.f9274d;
        bVar.f9274d = i9 + 1;
        m4929h[i9] = new d(m4815M2, i7, i8, this.f9258i.f9235n);
        m4997G(i9);
    }

    /* renamed from: L */
    public final void m5001L() {
        int i7 = this.f9253d;
        C2033a.m4928g(m4991A());
        m5009W();
        if (m4991A() && this.f9253d != i7) {
            m5009W();
        }
        int i8 = this.f9254e + 1;
        this.f9254e = i8;
        if (i8 < 2147483645) {
            return;
        }
        m5030n0("chunk has too many lines");
        throw null;
    }

    /* renamed from: O */
    public final void m5002O(int i7, String str) {
        String concat;
        String str2;
        String m210h;
        String str3;
        String mo4645M;
        String mo4645M2 = this.f9264o.mo4645M();
        if (mo4645M2.startsWith("=")) {
            m210h = mo4645M2.substring(1);
        } else {
            if (mo4645M2.startsWith("@")) {
                concat = mo4645M2.substring(1);
                str2 = "";
            } else {
                concat = "[string \"".concat(mo4645M2);
                str2 = "\"]";
            }
            if (str2.length() + concat.length() > 80) {
                concat = concat.substring(0, (80 - str2.length()) - 3) + "...";
            }
            m210h = C0089a.m210h(concat, str2);
        }
        if (i7 != 0) {
            C2038f.a aVar = this.f9259j;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9254e);
            sb.append(": syntax error: ");
            sb.append(str);
            sb.append(" near ");
            switch (i7) {
                case 302:
                case 303:
                case 304:
                    char[] cArr = this.f9261l;
                    int i8 = this.f9262m;
                    byte[] bArr = new byte[i8];
                    for (int i9 = 0; i9 < i8; i9++) {
                        bArr[i9] = (byte) cArr[i9 + 0];
                    }
                    mo4645M = C1998p.m4817O2(bArr, 0, i8).mo4645M();
                    break;
                default:
                    mo4645M = m5036q0(i7);
                    break;
            }
            sb.append(mo4645M);
            str3 = sb.toString();
            aVar.getClass();
        } else {
            C2038f.a aVar2 = this.f9259j;
            String str4 = m210h + ":" + this.f9254e + ": " + str;
            aVar2.getClass();
            str3 = str4;
        }
        throw new C1991i(str3);
    }

    /* renamed from: P */
    public final void m5003P(a aVar) {
        m5026l0(0, aVar.f9266a);
        this.f9258i.m4970k(aVar.f9269d, 2147483645);
        aVar.f9269d++;
        aVar.f9270e++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x019a, code lost:
    
        m5017e0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019d, code lost:
    
        r12 = r16.f9253d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x019f, code lost:
    
        if (r12 == r3) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01a3, code lost:
    
        if (r12 == r5) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a5, code lost:
    
        if (r12 == 10) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01a7, code lost:
    
        if (r12 == r7) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01ab, code lost:
    
        if (r12 == 92) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ae, code lost:
    
        m5009W();
        r12 = r16.f9253d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01b3, code lost:
    
        if (r12 == r5) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01b5, code lost:
    
        if (r12 == 10) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01b7, code lost:
    
        if (r12 == r7) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01bb, code lost:
    
        if (r12 == 102) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01bf, code lost:
    
        if (r12 == 110) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01c3, code lost:
    
        if (r12 == 114) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01c8, code lost:
    
        if (r12 == 120) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01cc, code lost:
    
        if (r12 == 122) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01d0, code lost:
    
        if (r12 == 97) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01d4, code lost:
    
        if (r12 == 98) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01d6, code lost:
    
        switch(r12) {
            case 116: goto L184;
            case 117: goto L166;
            case 118: goto L165;
            default: goto L162;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01dd, code lost:
    
        if (m4987M(r12) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x023a, code lost:
    
        r5 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x023c, code lost:
    
        r5 = (r5 * 10) + (r16.f9253d - 48);
        m5009W();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0247, code lost:
    
        if (r7 >= 3) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x024f, code lost:
    
        if (m4987M(r16.f9253d) != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0253, code lost:
    
        if (r5 > 255) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0255, code lost:
    
        m5016d0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x02cd, code lost:
    
        r5 = -1;
        r7 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x025a, code lost:
    
        m5002O(304, "escape sequence too large");
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x025f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01df, code lost:
    
        r5 = -1;
        r7 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01e3, code lost:
    
        r5 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02c0, code lost:
    
        m5016d0(r5);
        m5009W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01e7, code lost:
    
        m5009W();
        r12 = 0;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01ec, code lost:
    
        r12 = (r12 << 4) + m4986K(r16.f9253d);
        m5009W();
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01f8, code lost:
    
        if (r15 >= 4) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0200, code lost:
    
        if (m4988N(r16.f9253d) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0208, code lost:
    
        if (r12 >= 128) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x020a, code lost:
    
        r5 = (char) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0231, code lost:
    
        m5016d0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x020e, code lost:
    
        if (r12 > 2047) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0210, code lost:
    
        r5 = ((char) (r12 >> 6)) | 192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0229, code lost:
    
        m5016d0(r5);
        r5 = ((char) (r12 | android.ext.Tools.Semaphore.f159S7)) & 191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0219, code lost:
    
        if (r12 > 65535) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x021b, code lost:
    
        m5016d0(((char) (r12 >> 12)) | 224);
        r5 = ((char) (128 | (r12 >> 6))) & 191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0236, code lost:
    
        r5 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0260, code lost:
    
        r5 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0263, code lost:
    
        r5 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0265, code lost:
    
        m5009W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x026e, code lost:
    
        if ((r9[r16.f9253d + 1] & 8) == 0) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0270, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0273, code lost:
    
        if (r5 == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0279, code lost:
    
        if (m4991A() == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x027b, code lost:
    
        m5001L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0272, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x027f, code lost:
    
        m5009W();
        r7 = r16.f9253d;
        m5009W();
        r12 = r16.f9253d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x028d, code lost:
    
        if (m4988N(r7) == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0293, code lost:
    
        if (m4988N(r12) == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0295, code lost:
    
        r5 = (m4986K(r7) << 4) + m4986K(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02a1, code lost:
    
        m5002O(304, "hexadecimal digit expected 'x" + ((char) r7) + ((char) r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02b7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02b8, code lost:
    
        r5 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02bb, code lost:
    
        r5 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02be, code lost:
    
        r5 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x02c7, code lost:
    
        m5016d0(10);
        m5001L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x02d2, code lost:
    
        m5002O(304, "unfinished string");
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x02d5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02d6, code lost:
    
        m5002O(301, "unfinished string");
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x02d9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x02da, code lost:
    
        m5017e0();
        r3 = r16.f9261l;
        r4 = r16.f9262m - 2;
        r5 = r16.f9259j;
        r6 = p165u6.C1998p.f9038h2;
        r6 = new byte[r4];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x02ea, code lost:
    
        if (r7 >= r4) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x02ec, code lost:
    
        r8 = r7 + 1;
        r6[r7] = (byte) r3[r8];
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x02f5, code lost:
    
        r2 = p165u6.C1998p.m4817O2(r6, 0, r4);
        r3 = r5.f9301b;
        r4 = (p165u6.C1998p) r3.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0301, code lost:
    
        if (r4 == null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0303, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0308, code lost:
    
        r17.f9286b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x030a, code lost:
    
        return 304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0305, code lost:
    
        r3.put(r2, r2);
     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m5004Q(p172v6.C2037e.f r17) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p172v6.C2037e.m5004Q(v6.e$f):int");
    }

    /* renamed from: R */
    public final void m5005R() {
        g gVar = this.f9257h;
        C2033a.m4928g(gVar.f9287a == 301);
        gVar.f9287a = m5004Q(gVar.f9288b);
    }

    /* renamed from: T */
    public final void m5006T(C1998p c1998p) {
        C2035c c2035c = this.f9258i;
        C2008z c2008z = c2035c.f9223b;
        C1985d[] c1985dArr = c2008z.f9147e;
        if (c1985dArr == null || c2035c.f9234m + 1 > c1985dArr.length) {
            int i7 = (c2035c.f9234m * 2) + 1;
            C1985d[] c1985dArr2 = new C1985d[i7];
            if (c1985dArr != null) {
                System.arraycopy(c1985dArr, 0, c1985dArr2, 0, Math.min(c1985dArr.length, i7));
            }
            c2008z.f9147e = c1985dArr2;
        }
        C1985d c1985d = new C1985d(c1998p, 0, 0);
        C1985d[] c1985dArr3 = c2008z.f9147e;
        short s7 = c2035c.f9234m;
        c1985dArr3[s7] = c1985d;
        c2035c.f9234m = (short) (s7 + 1);
        C2035c c2035c2 = this.f9258i;
        b bVar = this.f9263n;
        c2035c2.m4970k(bVar.f9272b + 1, 200);
        h[] hVarArr = bVar.f9271a;
        if (hVarArr == null || bVar.f9272b + 1 > hVarArr.length) {
            int max = Math.max(1, bVar.f9272b * 2);
            h[] hVarArr2 = new h[max];
            if (hVarArr != null) {
                System.arraycopy(hVarArr, 0, hVarArr2, 0, Math.min(hVarArr.length, max));
            }
            bVar.f9271a = hVarArr2;
        }
        h[] hVarArr3 = bVar.f9271a;
        int i8 = bVar.f9272b;
        bVar.f9272b = i8 + 1;
        hVarArr3[i8] = new h(s7);
    }

    /* renamed from: U */
    public final void m5007U(String str) {
        C2038f.a aVar = this.f9259j;
        aVar.getClass();
        C1998p m4815M2 = C1998p.m4815M2(str);
        Hashtable hashtable = aVar.f9301b;
        C1998p c1998p = (C1998p) hashtable.get(m4815M2);
        if (c1998p != null) {
            m4815M2 = c1998p;
        } else {
            hashtable.put(m4815M2, m4815M2);
        }
        m5006T(m4815M2);
    }

    /* renamed from: V */
    public final void m5008V() {
        this.f9255f = this.f9254e;
        this.f9251b = this.f9252c;
        g gVar = this.f9257h;
        int i7 = gVar.f9287a;
        g gVar2 = this.f9256g;
        if (i7 == 301) {
            gVar2.f9287a = m5004Q(gVar2.f9288b);
            return;
        }
        gVar2.getClass();
        gVar2.f9287a = gVar.f9287a;
        f fVar = gVar.f9288b;
        AbstractC2003u abstractC2003u = fVar.f9285a;
        f fVar2 = gVar2.f9288b;
        fVar2.f9285a = abstractC2003u;
        fVar2.f9286b = fVar.f9286b;
        gVar.f9287a = 301;
    }

    /* renamed from: W */
    public final void m5009W() {
        try {
            this.f9253d = this.f9260k.read();
            this.f9252c++;
        } catch (IOException e7) {
            e7.printStackTrace();
            this.f9253d = -1;
        }
    }

    /* renamed from: X */
    public final void m5010X(C2035c c2035c, C2035c.a aVar) {
        c2035c.f9225d = this.f9258i;
        c2035c.f9226e = this;
        this.f9258i = c2035c;
        c2035c.f9228g = 0;
        c2035c.f9229h = -1;
        c2035c.f9230i = new C2036d(0);
        c2035c.f9237p = (short) 0;
        c2035c.f9231j = 0;
        c2035c.f9232k = 0;
        c2035c.f9236o = (short) 0;
        c2035c.f9234m = (short) 0;
        c2035c.f9235n = (short) 0;
        c2035c.f9233l = this.f9263n.f9272b;
        c2035c.f9227f = null;
        C2008z c2008z = c2035c.f9223b;
        c2008z.f9149g = this.f9264o;
        c2008z.f9154l = 2;
        c2035c.m4982w(aVar, false);
    }

    /* renamed from: Y */
    public final void m5011Y() {
        C2035c c2035c = this.f9258i;
        C2008z c2008z = c2035c.f9223b;
        int i7 = 0;
        c2008z.f9153k = 0;
        g gVar = this.f9256g;
        if (gVar.f9287a != 41) {
            do {
                int i8 = gVar.f9287a;
                if (i8 == 292) {
                    m5008V();
                    c2008z.f9153k = 1;
                } else {
                    if (i8 != 303) {
                        m5030n0("<name> or " + m4990j("...") + " expected");
                        throw null;
                    }
                    m5006T(m5024k0());
                    i7++;
                }
                if (c2008z.f9153k != 0) {
                    break;
                }
            } while (m5034p0(44));
        }
        m5027m(i7);
        short s7 = c2035c.f9235n;
        c2008z.f9152j = s7;
        c2035c.m4964c0(s7);
    }

    /* renamed from: Z */
    public final void m5012Z(int i7, f fVar) {
        m5017e0();
        if (m4991A()) {
            m5001L();
        }
        boolean z6 = false;
        while (!z6) {
            int i8 = this.f9253d;
            if (i8 == -1) {
                m5002O(301, fVar != null ? "unfinished long string" : "unfinished long comment");
                throw null;
            }
            if (i8 == 10 || i8 == 13) {
                m5016d0(10);
                m5001L();
                if (fVar == null) {
                    this.f9262m = 0;
                }
            } else if (i8 != 91) {
                if (i8 != 93) {
                    m5017e0();
                } else if (m5019g0() == i7) {
                    m5017e0();
                    z6 = true;
                }
            } else if (m5019g0() == i7) {
                m5017e0();
                if (i7 == 0) {
                    m5002O(91, "nesting of [[...]] is deprecated");
                    throw null;
                }
            } else {
                continue;
            }
        }
        if (fVar != null) {
            char[] cArr = this.f9261l;
            int i9 = i7 + 2;
            int i10 = this.f9262m - (i9 * 2);
            C2038f.a aVar = this.f9259j;
            C1999q c1999q = C1998p.f9038h2;
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) cArr[i11 + i9];
            }
            C1998p m4817O2 = C1998p.m4817O2(bArr, 0, i10);
            Hashtable hashtable = aVar.f9301b;
            C1998p c1998p = (C1998p) hashtable.get(m4817O2);
            if (c1998p != null) {
                m4817O2 = c1998p;
            } else {
                hashtable.put(m4817O2, m4817O2);
            }
            fVar.f9286b = m4817O2;
        }
    }

    /* renamed from: a0 */
    public final void m5013a0(f fVar) {
        AbstractC2003u abstractC2003u;
        boolean z6;
        double d7;
        char c7;
        double d8;
        int i7;
        char c8;
        int i8 = this.f9253d;
        C2033a.m4928g(m4987M(i8));
        m5017e0();
        String str = (i8 == 48 && m5039s("Xx")) ? "Pp" : "Ee";
        while (true) {
            if (m5039s(str)) {
                m5039s("+-");
            }
            if (!m4988N(this.f9253d) && this.f9253d != 46) {
                break;
            } else {
                m5017e0();
            }
        }
        int i9 = 0;
        m5016d0(0);
        String str2 = new String(this.f9261l, 0, this.f9262m);
        if (str2.indexOf(110) >= 0 || str2.indexOf(78) >= 0) {
            abstractC2003u = AbstractC2003u.f9126Z;
        } else if (str2.indexOf(120) >= 0 || str2.indexOf(88) >= 0) {
            char[] charArray = str2.toCharArray();
            int i10 = 0;
            while (true) {
                z6 = true;
                if (i10 >= charArray.length) {
                    break;
                }
                if (!((f9249u[charArray[i10] + 1] & 8) != 0)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 >= charArray.length || charArray[i10] != '-') {
                d7 = 1.0d;
            } else {
                i10++;
                d7 = -1.0d;
            }
            if (i10 + 2 < charArray.length) {
                int i11 = i10 + 1;
                if (charArray[i10] == '0' && ((c7 = charArray[i11]) == 'x' || c7 == 'X')) {
                    int i12 = i11 + 1;
                    double d9 = 0.0d;
                    while (true) {
                        d8 = 16.0d;
                        if (i12 >= charArray.length || !m4988N(charArray[i12])) {
                            break;
                        }
                        d9 = (d9 * 16.0d) + m4986K(charArray[i12]);
                        i12++;
                    }
                    if (i12 >= charArray.length || charArray[i12] != '.') {
                        i7 = 0;
                    } else {
                        i12++;
                        i7 = 0;
                        while (i12 < charArray.length && m4988N(charArray[i12])) {
                            d9 = (d9 * d8) + m4986K(charArray[i12]);
                            i7 -= 4;
                            i12++;
                            d8 = 16.0d;
                        }
                    }
                    if (i12 < charArray.length && ((c8 = charArray[i12]) == 'p' || c8 == 'P')) {
                        int i13 = i12 + 1;
                        if (i13 >= charArray.length || charArray[i13] != '-') {
                            z6 = false;
                        } else {
                            i13++;
                        }
                        while (i13 < charArray.length && m4987M(charArray[i13])) {
                            i9 = ((i9 * 10) + charArray[i13]) - 48;
                            i13++;
                        }
                        if (z6) {
                            i9 = -i9;
                        }
                        i7 += i9;
                    }
                    double d10 = i7;
                    abstractC2003u = C1990h.m4698E2(d7 * d9 * (C2140i.f9702g2 != null ? Math.pow(2.0d, d10) : C2140i.m5235J2(2.0d, d10)));
                }
            }
            abstractC2003u = AbstractC2003u.f9126Z;
        } else {
            double parseDouble = Double.parseDouble(str2.trim());
            C1996n c1996n = AbstractC2003u.f9130m;
            abstractC2003u = C1990h.m4698E2(parseDouble);
        }
        fVar.f9285a = abstractC2003u;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5014b0(p172v6.C2037e.a r11) {
        /*
            r10 = this;
            v6.c r0 = r10.f9258i
            short r1 = r0.f9237p
            v6.e$i r2 = new v6.e$i
            r2.<init>()
            v6.e$i r3 = new v6.e$i
            r3.<init>()
            v6.e$g r4 = r10.f9256g
            int r5 = r4.f9287a
            r6 = 271(0x10f, float:3.8E-43)
            r7 = 2147483645(0x7ffffffd, float:NaN)
            r8 = 1
            r9 = 0
            if (r5 != r6) goto L2c
            int r4 = r11.f9268c
            r0.m4970k(r4, r7)
            r10.m5008V()
            u6.p r4 = r10.m5024k0()
            r10.m5045x(r4, r2)
            r4 = 1
            goto L7a
        L2c:
            r6 = 304(0x130, float:4.26E-43)
            if (r5 != r6) goto L4b
            int r5 = r11.f9268c
            r0.m4970k(r5, r7)
            int r5 = r4.f9287a
            if (r5 != r6) goto L46
            v6.e$f r4 = r4.f9288b
            u6.p r4 = r4.f9286b
            r10.m5008V()
            r10.m5045x(r4, r2)
            r4 = 0
            r5 = 1
            goto L7b
        L46:
            r10.m4993C(r6)
            r11 = 0
            throw r11
        L4b:
            r4 = 303(0x12f, float:4.25E-43)
            if (r5 != r4) goto L5c
            int r4 = r11.f9268c
            r0.m4970k(r4, r7)
            u6.p r4 = r10.m5024k0()
            r10.m5045x(r4, r2)
            goto L79
        L5c:
            r10.m5008V()
            r10.m5026l0(r9, r2)
            v6.c r4 = r10.f9258i
            r4.getClass()
            boolean r5 = r2.m5048a()
            if (r5 == 0) goto L71
            r4.m4984y(r2)
            goto L74
        L71:
            r4.m4981v(r2)
        L74:
            r4 = 93
            r10.m5041t(r4)
        L79:
            r4 = 0
        L7a:
            r5 = 0
        L7b:
            int r6 = r11.f9268c
            int r6 = r6 + r8
            r11.f9268c = r6
            if (r4 != 0) goto L91
            if (r5 == 0) goto L8c
            r5 = 58
            boolean r5 = r10.m5034p0(r5)
            if (r5 != 0) goto L91
        L8c:
            r5 = 61
            r10.m5041t(r5)
        L91:
            int r2 = r0.m4983x(r2)
            if (r4 == 0) goto L9d
            int r4 = r10.f9254e
            r10.m5035q(r3, r9, r4)
            goto La0
        L9d:
            r10.m5026l0(r9, r3)
        La0:
            v6.e$i r11 = r11.f9267b
            v6.e$i$a r11 = r11.f9291b
            int r11 = r11.f9298e
            int r3 = r0.m4983x(r3)
            r4 = 10
            r0.m4973n(r4, r11, r2, r3)
            short r11 = (short) r1
            r0.f9237p = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172v6.C2037e.m5014b0(v6.e$a):void");
    }

    /* renamed from: c0 */
    public final void m5015c0() {
        int i7;
        int i8;
        C2035c c2035c = this.f9258i;
        i iVar = new i();
        if (m5033p(true) || this.f9256g.f9287a == 59) {
            i7 = 0;
            i8 = 0;
        } else {
            i8 = m4994D(iVar);
            int i9 = iVar.f9290a;
            if (i9 == 14 || i9 == 15) {
                c2035c.m4967f0(-1, iVar);
                if (iVar.f9290a == 14 && i8 == 1) {
                    C2175b m4942G = c2035c.m4942G(iVar);
                    ((int[]) m4942G.f9887b)[m4942G.f9886a] = (m4942G.m5318a() & (-64)) | 30;
                    C2033a.m4928g(((c2035c.m4941F(iVar) >> 6) & 255) == c2035c.f9235n);
                }
                i7 = c2035c.f9235n;
                i8 = -1;
            } else if (i8 == 1) {
                i7 = c2035c.m4984y(iVar);
            } else {
                c2035c.m4985z(iVar);
                i7 = c2035c.f9235n;
                C2033a.m4928g(i8 == c2035c.f9237p - i7);
            }
        }
        c2035c.m4973n(31, i7, i8 + 1, 0);
        m5034p0(59);
    }

    /* renamed from: d0 */
    public final void m5016d0(int i7) {
        char[] cArr = this.f9261l;
        if (cArr == null || this.f9262m + 1 > cArr.length) {
            int i8 = (this.f9262m * 2) + 1;
            char[] cArr2 = new char[i8];
            if (cArr != null) {
                System.arraycopy(cArr, 0, cArr2, 0, Math.min(cArr.length, i8));
            }
            this.f9261l = cArr2;
        }
        char[] cArr3 = this.f9261l;
        int i9 = this.f9262m;
        this.f9262m = i9 + 1;
        cArr3[i9] = (char) i7;
    }

    /* renamed from: e0 */
    public final void m5017e0() {
        m5016d0(this.f9253d);
        m5009W();
    }

    /* renamed from: f0 */
    public final void m5018f0(i iVar) {
        C1998p m5024k0 = m5024k0();
        C2035c c2035c = this.f9258i;
        boolean z6 = true;
        if (C2035c.m4935g0(c2035c, m5024k0, iVar, 1) == 0) {
            i iVar2 = new i();
            C2035c.m4935g0(c2035c, this.f9265p, iVar, 1);
            int i7 = iVar.f9290a;
            if (i7 != 7 && i7 != 10) {
                z6 = false;
            }
            C2033a.m4928g(z6);
            m5045x(m5024k0, iVar2);
            c2035c.m4948M(iVar, iVar2);
        }
    }

    /* renamed from: g0 */
    public final int m5019g0() {
        int i7;
        int i8 = this.f9253d;
        int i9 = 0;
        C2033a.m4928g(i8 == 91 || i8 == 93);
        m5017e0();
        while (true) {
            i7 = this.f9253d;
            if (i7 != 61) {
                break;
            }
            m5017e0();
            i9++;
        }
        return i7 == i8 ? i9 : (-i9) - 1;
    }

    /* renamed from: h0 */
    public final void m5020h0() {
        while (true) {
            int i7 = this.f9256g.f9287a;
            if (i7 != 59 && i7 != 300) {
                return;
            } else {
                m5021i0();
            }
        }
    }

    /* renamed from: i0 */
    public final void m5021i0() {
        short s7;
        short s8;
        boolean m4998H;
        C2035c c2035c;
        int m4951P;
        int lastIndexOf;
        int i7 = this.f9254e;
        m4992B();
        g gVar = this.f9256g;
        int i8 = gVar.f9287a;
        if (i8 != 59) {
            boolean z6 = true;
            if (i8 == 258 || i8 == 261) {
                m5000J(this.f9258i.m4951P());
                if (!m5033p(true)) {
                    m5030n0("unreachable statement");
                    throw null;
                }
            } else {
                if (i8 == 287) {
                    int i9 = this.f9254e;
                    m5008V();
                    i iVar = new i();
                    C2035c c2035c2 = this.f9258i;
                    short s9 = c2035c2.f9237p;
                    m5007U("(try)");
                    m5027m(1);
                    boolean m5038r0 = m5038r0(287, this.f9254e, iVar);
                    c2035c2.m4945J(c2035c2.f9235n - 1).f8987b = c2035c2.f9228g;
                    if (m5034p0(260)) {
                        short s10 = c2035c2.f9237p;
                        m5007U("(catch)");
                        m5027m(1);
                        boolean m5038r02 = m5038r0(260, this.f9254e, iVar);
                        c2035c2.m4945J(c2035c2.f9235n - 1).f8987b = c2035c2.f9228g;
                        s8 = s10;
                        m5038r0 = m5038r02;
                    } else {
                        s8 = 0;
                    }
                    if (m5034p0(269)) {
                        r10 = c2035c2.f9237p;
                        m5007U("(finally)");
                        m5027m(1);
                        m5038r0 = m5038r0(269, this.f9254e, iVar);
                        c2035c2.m4945J(c2035c2.f9235n - 1).f8987b = c2035c2.f9228g;
                    }
                    if (!m5038r0) {
                        m5037r(267, 287, i9);
                    }
                    c2035c2.m4973n(53, s9, s8, r10);
                } else if (i8 != 300) {
                    int i10 = 40;
                    int i11 = 41;
                    if (i8 == 263) {
                        m5008V();
                        C2035c c2035c3 = this.f9258i;
                        i iVar2 = new i();
                        m5007U("(defer)");
                        m5027m(1);
                        int i12 = this.f9254e;
                        C2035c c2035c4 = new C2035c();
                        C2035c.a aVar = new C2035c.a();
                        C2008z m5023k = m5023k();
                        c2035c4.f9223b = m5023k;
                        m5023k.f9150h = i12;
                        m5010X(c2035c4, aVar);
                        c2035c4.f9223b.f9155m = "defer";
                        if (m5034p0(40)) {
                            m5011Y();
                            m5041t(41);
                        }
                        m5021i0();
                        c2035c4.f9223b.getClass();
                        c2035c4.f9223b.f9151i = this.f9254e;
                        m5044w(iVar2);
                        m5042u();
                        c2035c3.m4973n(51, c2035c3.f9235n - 1, 0, 0);
                        c2035c3.m4945J(c2035c3.f9235n - 1).f8987b = c2035c3.f9228g;
                    } else if (i8 == 264) {
                        m5008V();
                        m5031o();
                        m5037r(267, 264, i7);
                    } else if (i8 == 277) {
                        m5008V();
                        if (m5034p0(271)) {
                            i iVar3 = new i();
                            C2035c c2035c5 = this.f9258i;
                            m5006T(m5024k0());
                            m5027m(1);
                            m5035q(iVar3, false, this.f9254e);
                            c2035c5.m4945J(c2035c5.f9235n - 1).f8987b = c2035c5.f9228g;
                        } else {
                            i iVar4 = new i();
                            boolean z7 = m5034p0(61) || m5034p0(58);
                            int i13 = 0;
                            do {
                                m5006T(m5024k0());
                                i13++;
                            } while (m5034p0(44));
                            if (z7) {
                                C1985d[] c1985dArr = this.f9258i.f9223b.f9147e;
                                i iVar5 = new i();
                                C2035c c2035c6 = this.f9258i;
                                short s11 = c2035c6.f9234m;
                                int i14 = s11 - i13;
                                C2035c.m4935g0(c2035c6, c1985dArr[i14].f8986a, iVar5, 1);
                                for (int i15 = i14 + 1; i15 < s11; i15++) {
                                    C1998p c1998p = c1985dArr[i15].f8986a;
                                    this.f9258i.m4985z(iVar5);
                                    C2035c.m4935g0(this.f9258i, c1998p, iVar5, 1);
                                }
                                m5025l(i13, i13, iVar5);
                                m5027m(i13);
                            } else {
                                if (i13 == 1) {
                                    if (gVar.f9287a == 40) {
                                        i iVar6 = new i();
                                        m5027m(1);
                                        m5035q(iVar6, false, this.f9254e);
                                        C2035c c2035c7 = this.f9258i;
                                        c2035c7.m4945J(c2035c7.f9235n - 1).f8987b = this.f9258i.f9228g;
                                    }
                                }
                                if (m5034p0(61)) {
                                    r10 = m4994D(iVar4);
                                } else {
                                    iVar4.f9290a = 0;
                                }
                                m5025l(i13, r10, iVar4);
                                m5027m(i13);
                            }
                        }
                    } else if (i8 == 278) {
                        m5008V();
                        C2035c c2035c8 = this.f9258i;
                        boolean m5034p0 = m5034p0(40);
                        if (gVar.f9287a != 304) {
                            m4993C(304);
                            throw null;
                        }
                        C1998p c1998p2 = gVar.f9288b.f9286b;
                        m5008V();
                        m5006T(this.f9265p);
                        m5027m(1);
                        c2035c8.m4974o(55, c2035c8.f9235n - 1, c2035c8.m4969j(c1998p2));
                        c2035c8.m4964c0(1);
                        if (m5034p0) {
                            m5041t(41);
                        }
                    } else if (i8 != 289) {
                        int i16 = 123;
                        if (i8 != 290) {
                            switch (i8) {
                                case 270:
                                    C2035c c2035c9 = this.f9258i;
                                    c2035c9.m4982w(new C2035c.a(), true);
                                    m5008V();
                                    boolean m5034p02 = m5034p0(40);
                                    C1998p m5024k0 = m5024k0();
                                    int i17 = gVar.f9287a;
                                    if (i17 == 44 || i17 != 61) {
                                        C2035c c2035c10 = this.f9258i;
                                        i iVar7 = new i();
                                        short s12 = c2035c10.f9237p;
                                        m5007U("(for generator)");
                                        m5007U("(for state)");
                                        m5007U("(for control)");
                                        m5006T(m5024k0);
                                        int i18 = 4;
                                        while (m5034p0(44)) {
                                            m5006T(m5024k0());
                                            i18++;
                                        }
                                        boolean m5034p03 = m5034p0(58);
                                        m5034p0(275);
                                        int i19 = this.f9254e;
                                        m5025l(3, m4994D(iVar7), iVar7);
                                        int i20 = c2035c10.f9237p + 3;
                                        C2008z c2008z = c2035c10.f9223b;
                                        if (i20 > c2008z.f9154l) {
                                            if (i20 >= 250) {
                                                c2035c10.f9226e.m5030n0("function or expression too complex");
                                                throw null;
                                            }
                                            c2008z.f9154l = i20;
                                        }
                                        if (m5034p03) {
                                            int i21 = i18 - 3;
                                            C2035c.a aVar2 = new C2035c.a();
                                            C2035c c2035c11 = this.f9258i;
                                            m5027m(3);
                                            if (m5034p02) {
                                                m5041t(41);
                                                m5034p02 = m5034p0(123);
                                            }
                                            if (!m5034p02) {
                                                m5034p0(264);
                                            }
                                            int m4951P2 = c2035c11.m4951P();
                                            c2035c11.m4982w(aVar2, false);
                                            m5027m(i21);
                                            c2035c11.m4964c0(i21);
                                            m5031o();
                                            m5047z();
                                            c2035c11.m4954S();
                                            c2035c11.m4962a0(m4951P2);
                                            c2035c11.m4973n(52, s12, 0, i21);
                                            c2035c11.m4938C(i19);
                                            c2035c11.m4959X(c2035c11.m4975p(35, s12 + 2), m4951P2 + 1);
                                            c2035c11.m4938C(i19);
                                            m4998H = m5034p02;
                                        } else {
                                            m4998H = m4998H(s12, i19, i18 - 3, false, m5034p02);
                                        }
                                    } else {
                                        C2035c c2035c12 = this.f9258i;
                                        short s13 = c2035c12.f9237p;
                                        m5007U("(for index)");
                                        m5007U("(for limit)");
                                        m5007U("(for step)");
                                        m5006T(m5024k0);
                                        m5041t(61);
                                        i iVar8 = new i();
                                        m5026l0(0, iVar8);
                                        this.f9258i.m4985z(iVar8);
                                        m5041t(44);
                                        i iVar9 = new i();
                                        m5026l0(0, iVar9);
                                        this.f9258i.m4985z(iVar9);
                                        if (m5034p0(44)) {
                                            i iVar10 = new i();
                                            m5026l0(0, iVar10);
                                            this.f9258i.m4985z(iVar10);
                                        } else {
                                            c2035c12.m4974o(1, c2035c12.f9237p, c2035c12.m4957V(C1993k.m4765C2(1)));
                                            c2035c12.m4964c0(1);
                                        }
                                        m4998H = m4998H(s13, i7, 1, true, m5034p02);
                                    }
                                    m5037r(m4998H ? 125 : 267, 270, i7);
                                    c2035c9.m4954S();
                                    break;
                                case 271:
                                    i iVar11 = new i();
                                    i iVar12 = new i();
                                    m5008V();
                                    m5018f0(iVar11);
                                    while (true) {
                                        int i22 = gVar.f9287a;
                                        if (i22 != 46) {
                                            if (i22 == 58) {
                                                m4995E(iVar11);
                                            } else {
                                                z6 = false;
                                            }
                                            m5035q(iVar12, z6, i7);
                                            this.f9258i.m4968h0(iVar11, iVar12);
                                            this.f9258i.m4938C(i7);
                                            break;
                                        } else {
                                            m4995E(iVar11);
                                        }
                                    }
                                case 272:
                                    m5000J(this.f9258i.m4951P());
                                    break;
                                case 273:
                                    int i23 = -1;
                                    while (true) {
                                        i iVar13 = new i();
                                        C2035c.a aVar3 = new C2035c.a();
                                        int i24 = gVar.f9287a;
                                        int i25 = this.f9254e;
                                        m5008V();
                                        boolean m5034p04 = m5034p0(i10);
                                        m5026l0(0, iVar13);
                                        if (m5034p04) {
                                            m5041t(i11);
                                            m5034p04 = m5034p0(i16);
                                        }
                                        if (!m5034p04) {
                                            m5034p0(285);
                                        }
                                        int i26 = gVar.f9287a;
                                        if (i26 == 272 || i26 == 258 || i26 == 261) {
                                            this.f9258i.m4946K(iVar13);
                                            this.f9258i.m4982w(aVar3, false);
                                            m5000J(iVar13.f9292c.f9244a);
                                            m5020h0();
                                            if (!m5033p(false)) {
                                                m5030n0("unreachable statement");
                                                throw null;
                                            }
                                            this.f9258i.m4954S();
                                        } else {
                                            this.f9258i.m4947L(iVar13);
                                            this.f9258i.m4982w(aVar3, false);
                                            int i27 = iVar13.f9293d.f9244a;
                                            m5022j0();
                                            this.f9258i.m4954S();
                                            if (m5034p04) {
                                                m5037r(125, i24, i25);
                                            }
                                            int i28 = gVar.f9287a;
                                            if ((i28 == 265 || i28 == 266) && (m4951P = (c2035c = this.f9258i).m4951P()) != -1) {
                                                if (i23 == -1) {
                                                    i23 = m4951P;
                                                } else {
                                                    int i29 = i23;
                                                    while (true) {
                                                        int m4943H = c2035c.m4943H(i29);
                                                        if (m4943H != -1) {
                                                            i29 = m4943H;
                                                        } else {
                                                            c2035c.m4937B(i29, m4951P);
                                                        }
                                                    }
                                                }
                                            }
                                            this.f9258i.m4962a0(i27);
                                        }
                                        if (gVar.f9287a != 266) {
                                            if (m5034p0(265)) {
                                                m5034p04 = m5034p0(123);
                                                m5031o();
                                                if (m5034p04) {
                                                    m5037r(125, 273, i7);
                                                }
                                            }
                                            if (!m5034p04) {
                                                m5037r(267, 273, i7);
                                            }
                                            this.f9258i.m4962a0(i23);
                                            break;
                                        } else {
                                            i16 = 123;
                                            i10 = 40;
                                            i11 = 41;
                                        }
                                    }
                                    break;
                                case 274:
                                    m5008V();
                                    C2035c c2035c13 = this.f9258i;
                                    boolean m5034p05 = m5034p0(40);
                                    do {
                                        String mo4645M = gVar.f9287a == 303 ? m5024k0().mo4645M() : null;
                                        if (gVar.f9287a != 304) {
                                            m4993C(304);
                                            throw null;
                                        }
                                        C1998p c1998p3 = gVar.f9288b.f9286b;
                                        m5008V();
                                        if (mo4645M == null && (lastIndexOf = (mo4645M = c1998p3.mo4645M()).lastIndexOf(".")) > 0) {
                                            mo4645M = mo4645M.substring(lastIndexOf + 1);
                                        }
                                        m5007U(mo4645M);
                                        m5027m(1);
                                        c2035c13.m4974o(54, c2035c13.f9235n - 1, c2035c13.m4969j(c1998p3));
                                        c2035c13.m4964c0(1);
                                    } while (m5034p0(44));
                                    if (m5034p05) {
                                        m5041t(41);
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i8) {
                                        case 282:
                                            C2035c c2035c14 = this.f9258i;
                                            boolean m5034p06 = m5034p0(123);
                                            int i30 = c2035c14.f9228g;
                                            c2035c14.f9229h = i30;
                                            C2035c.a aVar4 = new C2035c.a();
                                            C2035c.a aVar5 = new C2035c.a();
                                            c2035c14.m4982w(aVar4, true);
                                            c2035c14.m4982w(aVar5, false);
                                            m5008V();
                                            m5022j0();
                                            m5047z();
                                            if (m5034p06) {
                                                m5037r(125, 282, i7);
                                            }
                                            m5037r(288, 282, i7);
                                            i iVar14 = new i();
                                            m5026l0(0, iVar14);
                                            if (iVar14.f9290a == 1) {
                                                iVar14.f9290a = 3;
                                            }
                                            this.f9258i.m4947L(iVar14);
                                            int i31 = iVar14.f9293d.f9244a;
                                            if (aVar5.f9242e) {
                                                c2035c14.m4958W(i31, aVar5.f9241d);
                                            }
                                            c2035c14.m4954S();
                                            c2035c14.m4959X(i31, i30);
                                            c2035c14.m4954S();
                                            break;
                                        case 283:
                                            m5008V();
                                            m5015c0();
                                            break;
                                        case 284:
                                            C2036d c2036d = new C2036d(0);
                                            i iVar15 = new i();
                                            m5008V();
                                            boolean m5034p07 = m5034p0(40);
                                            m5026l0(0, iVar15);
                                            if (m5034p07) {
                                                m5041t(41);
                                                m5034p07 = m5034p0(123);
                                            }
                                            if (!m5034p07) {
                                                m5034p0(264);
                                            }
                                            while (gVar.f9287a == 259) {
                                                i iVar16 = new i();
                                                iVar16.m5051d(iVar15);
                                                m5032o0(c2036d, iVar16);
                                            }
                                            if (m5034p0(262)) {
                                                m5031o();
                                            }
                                            m5037r(m5034p07 ? 125 : 267, 284, i7);
                                            this.f9258i.m4962a0(c2036d.f9244a);
                                            break;
                                        default:
                                            C2035c c2035c15 = this.f9258i;
                                            c cVar = new c();
                                            i iVar17 = cVar.f9278b;
                                            m5028m0(iVar17);
                                            int i32 = gVar.f9287a;
                                            if (i32 != 61 && i32 != 44) {
                                                int i33 = iVar17.f9290a;
                                                if ((i33 == 14 ? 1 : 0) == 0) {
                                                    m5030n0("syntax error");
                                                    throw null;
                                                }
                                                if (i33 == 14) {
                                                    C2033a.m4927f(c2035c15.m4942G(iVar17), 1);
                                                    break;
                                                }
                                            } else {
                                                cVar.f9277a = null;
                                                m5029n(cVar, 1);
                                                break;
                                            }
                                            break;
                                    }
                            }
                        } else {
                            C2035c c2035c16 = this.f9258i;
                            C2035c.a aVar6 = new C2035c.a();
                            m5008V();
                            boolean m5034p08 = m5034p0(40);
                            int i34 = c2035c16.f9228g;
                            c2035c16.f9229h = i34;
                            i iVar18 = new i();
                            m5026l0(0, iVar18);
                            if (iVar18.f9290a == 1) {
                                iVar18.f9290a = 3;
                            }
                            this.f9258i.m4947L(iVar18);
                            int i35 = iVar18.f9293d.f9244a;
                            c2035c16.m4982w(aVar6, true);
                            if (m5034p08) {
                                m5041t(41);
                                m5034p08 = m5034p0(123);
                            }
                            if (!m5034p08) {
                                m5034p0(264);
                            }
                            m5031o();
                            m5047z();
                            c2035c16.m4959X(c2035c16.m4951P(), i34);
                            m5037r(m5034p08 ? 125 : 267, 290, i7);
                            c2035c16.m4954S();
                            c2035c16.m4962a0(i35);
                        }
                    } else {
                        m5040s0();
                    }
                } else {
                    m5008V();
                    C1998p m5024k02 = m5024k0();
                    C2035c c2035c17 = this.f9258i;
                    b bVar = this.f9263n;
                    d[] dVarArr = bVar.f9275e;
                    int i36 = bVar.f9276f;
                    for (int i37 = c2035c17.f9227f.f9239b; i37 < i36; i37++) {
                        C1998p c1998p4 = dVarArr[i37].f9279a;
                        m5024k02.getClass();
                        if (c1998p4.mo4825O1(m5024k02)) {
                            C2038f.a aVar7 = c2035c17.f9226e.f9259j;
                            String str = "label '" + m5024k02 + " already defined on line " + dVarArr[i37].f9281c;
                            aVar7.getClass();
                            C2037e c2037e = c2035c17.f9226e;
                            c2037e.f9256g.f9287a = 0;
                            c2037e.m5030n0(str);
                            throw null;
                        }
                    }
                    m5041t(300);
                    d[] m4929h = C2033a.m4929h(bVar.f9275e, bVar.f9276f + 1);
                    bVar.f9275e = m4929h;
                    int i38 = bVar.f9276f;
                    bVar.f9276f = i38 + 1;
                    C2035c c2035c18 = this.f9258i;
                    int i39 = c2035c18.f9228g;
                    c2035c18.f9229h = i39;
                    m4929h[i38] = new d(m5024k02, i39, i7, c2035c18.f9235n);
                    m5020h0();
                    if (m5033p(false)) {
                        bVar.f9275e[i38].f9282d = this.f9258i.f9227f.f9241d;
                    }
                    m4996F(bVar.f9275e[i38]);
                }
            }
        } else {
            m5008V();
        }
        C2035c c2035c19 = this.f9258i;
        int i40 = c2035c19.f9223b.f9154l;
        short s14 = c2035c19.f9237p;
        if (i40 < s14 || s14 < (s7 = c2035c19.f9235n)) {
            m5030n0("statement");
            throw null;
        }
        c2035c19.f9237p = s7;
        C2038f.a aVar8 = this.f9259j;
        aVar8.f9300a--;
    }

    /* renamed from: j0 */
    public final void m5022j0() {
        while (!m5033p(true)) {
            int i7 = this.f9256g.f9287a;
            m5021i0();
            if (i7 == 283) {
                return;
            }
        }
    }

    /* renamed from: k */
    public final C2008z m5023k() {
        C2035c c2035c = this.f9258i;
        C2008z c2008z = c2035c.f9223b;
        C2008z[] c2008zArr = c2008z.f9145c;
        if (c2008zArr == null || c2035c.f9232k >= c2008zArr.length) {
            int max = Math.max(1, c2035c.f9232k * 2);
            C2008z[] c2008zArr2 = new C2008z[max];
            if (c2008zArr != null) {
                System.arraycopy(c2008zArr, 0, c2008zArr2, 0, Math.min(c2008zArr.length, max));
            }
            c2008z.f9145c = c2008zArr2;
        }
        C2008z[] c2008zArr3 = c2008z.f9145c;
        C2035c c2035c2 = this.f9258i;
        int i7 = c2035c2.f9232k;
        c2035c2.f9232k = i7 + 1;
        C2008z c2008z2 = new C2008z();
        c2008zArr3[i7] = c2008z2;
        return c2008z2;
    }

    /* renamed from: k0 */
    public final C1998p m5024k0() {
        g gVar = this.f9256g;
        if (gVar.f9287a != 303) {
            m4993C(303);
            throw null;
        }
        C1998p c1998p = gVar.f9288b.f9286b;
        m5008V();
        return c1998p;
    }

    /* renamed from: l */
    public final void m5025l(int i7, int i8, i iVar) {
        C2035c c2035c = this.f9258i;
        int i9 = i7 - i8;
        int i10 = iVar.f9290a;
        if (i10 == 14 || i10 == 15) {
            int i11 = i9 + 1;
            int i12 = i11 >= 0 ? i11 : 0;
            c2035c.m4967f0(i12, iVar);
            if (i12 > 1) {
                c2035c.m4964c0(i12 - 1);
                return;
            }
            return;
        }
        if (i10 != 0) {
            c2035c.m4985z(iVar);
        }
        if (i9 > 0) {
            short s7 = c2035c.f9237p;
            c2035c.m4964c0(i9);
            c2035c.m4956U(s7, i9);
        }
    }

    /* renamed from: l0 */
    public final int m5026l0(int i7, i iVar) {
        int i8;
        int i9;
        int i10;
        i.a aVar;
        AbstractC2003u mo4758w1;
        int i11;
        m4992B();
        g gVar = this.f9256g;
        int i12 = gVar.f9287a;
        char c7 = i12 != 35 ? i12 != 45 ? i12 != 126 ? i12 != 280 ? (char) 3 : (char) 1 : (char) 4 : (char) 0 : (char) 2;
        if (c7 == 3) {
            f fVar = gVar.f9288b;
            switch (i12) {
                case 91:
                    C2035c c2035c = this.f9258i;
                    int i13 = this.f9254e;
                    int m4974o = c2035c.m4974o(48, 0, 0);
                    a aVar2 = new a();
                    aVar2.f9270e = 0;
                    aVar2.f9268c = 0;
                    aVar2.f9269d = 0;
                    aVar2.f9267b = iVar;
                    iVar.m5049b(13, m4974o);
                    i iVar2 = aVar2.f9266a;
                    iVar2.m5049b(0, 0);
                    c2035c.m4985z(iVar);
                    m5041t(91);
                    while (true) {
                        C2033a.m4928g(iVar2.f9290a == 0 || aVar2.f9270e > 0);
                        if (gVar.f9287a != 93) {
                            c2035c.m4971l(aVar2);
                            m5003P(aVar2);
                            if (m5034p0(44) || m5034p0(59)) {
                            }
                        }
                    }
                    m5037r(93, 91, i13);
                    c2035c.m4953R(aVar2);
                    int[] iArr = c2035c.f9223b.f9144b;
                    iArr[m4974o] = ((m4989S(aVar2.f9269d) << 23) & (-8388608)) | (iArr[m4974o] & 8388607);
                    break;
                case 123:
                    m5046y(iVar);
                    break;
                case 268:
                    i8 = 3;
                    iVar.m5049b(i8, 0);
                    m5008V();
                    break;
                case 271:
                    m5008V();
                    m5035q(iVar, false, this.f9254e);
                    break;
                case 276:
                    m5008V();
                    int i14 = this.f9254e;
                    C2035c c2035c2 = new C2035c();
                    C2035c.a aVar3 = new C2035c.a();
                    C2008z m5023k = m5023k();
                    c2035c2.f9223b = m5023k;
                    m5023k.f9150h = i14;
                    m5010X(c2035c2, aVar3);
                    boolean m5034p0 = m5034p0(40);
                    m5011Y();
                    if (m5034p0) {
                        m5041t(41);
                    }
                    m5006T(this.f9265p);
                    i iVar3 = new i();
                    C2035c.m4935g0(this.f9258i, this.f9265p, iVar3, 1);
                    m5025l(1, 1, iVar3);
                    m5027m(1);
                    m5041t(58);
                    m5015c0();
                    c2035c2.f9223b.getClass();
                    c2035c2.f9223b.f9151i = this.f9254e;
                    m5044w(iVar);
                    m5042u();
                    break;
                case 279:
                    iVar.m5049b(1, 0);
                    m5008V();
                    break;
                case 286:
                    i8 = 2;
                    iVar.m5049b(i8, 0);
                    m5008V();
                    break;
                case 289:
                    iVar.m5049b(14, m5040s0());
                    break;
                case 292:
                    C2035c c2035c3 = this.f9258i;
                    boolean z6 = c2035c3.f9223b.f9153k != 0;
                    String str = "cannot use " + m4990j("...") + " outside a vararg function";
                    if (!z6) {
                        m5030n0(str);
                        throw null;
                    }
                    iVar.m5049b(15, c2035c3.m4973n(38, 0, 1, 0));
                    m5008V();
                    break;
                case 302:
                    iVar.m5049b(5, 0);
                    iVar.f9291b.f9297d = fVar.f9285a;
                    m5008V();
                    break;
                case 304:
                    m5045x(fVar.f9286b, iVar);
                    m5008V();
                    break;
                default:
                    m5028m0(iVar);
                    break;
            }
        } else {
            int i15 = this.f9254e;
            m5008V();
            m5026l0(8, iVar);
            C2035c c2035c4 = this.f9258i;
            c2035c4.getClass();
            i iVar4 = new i();
            iVar4.m5049b(5, 0);
            if (c7 != 0) {
                if (c7 != 1) {
                    if (c7 == 2) {
                        c2035c4.m4984y(iVar);
                        i10 = 21;
                    } else if (c7 != 4) {
                        C2033a.m4928g(false);
                    } else if (iVar.m5050c()) {
                        aVar = iVar.f9291b;
                        mo4758w1 = aVar.m5052a().mo4721X();
                        aVar.f9297d = mo4758w1;
                    } else {
                        c2035c4.m4984y(iVar);
                        i10 = 42;
                    }
                    c2035c4.m4976q(i10, i15, iVar, iVar4);
                } else {
                    c2035c4.m4981v(iVar);
                    int i16 = iVar.f9290a;
                    if (i16 != 12) {
                        if (i16 != 13) {
                            switch (i16) {
                                case 1:
                                case 3:
                                    i11 = 2;
                                    iVar.f9290a = i11;
                                    break;
                                case 2:
                                case 4:
                                case 5:
                                    i11 = 3;
                                    iVar.f9290a = i11;
                                    break;
                                case 6:
                                    break;
                                default:
                                    C2033a.m4928g(false);
                                    break;
                            }
                        }
                        if (i16 != 6) {
                            c2035c4.m4964c0(1);
                            c2035c4.m4980u(c2035c4.f9237p - 1, iVar);
                        }
                        c2035c4.m4939D(iVar);
                        i.a aVar4 = iVar.f9291b;
                        aVar4.f9298e = c2035c4.m4973n(20, 0, aVar4.f9298e, 0);
                        iVar.f9290a = 13;
                    } else {
                        c2035c4.m4950O(iVar);
                    }
                    C2036d c2036d = iVar.f9293d;
                    int i17 = c2036d.f9244a;
                    C2036d c2036d2 = iVar.f9292c;
                    c2036d.f9244a = c2036d2.f9244a;
                    c2036d2.f9244a = i17;
                    int i18 = c2036d.f9244a;
                    while (true) {
                        if (i18 != -1) {
                            c2035c4.m4961Z(i18, 255);
                            i18 = c2035c4.m4943H(i18);
                        } else {
                            int i19 = c2036d2.f9244a;
                            for (int i20 = -1; i19 != i20; i20 = -1) {
                                c2035c4.m4961Z(i19, 255);
                                i19 = c2035c4.m4943H(i19);
                            }
                        }
                    }
                }
            } else if (iVar.m5050c()) {
                aVar = iVar.f9291b;
                mo4758w1 = aVar.m5052a().mo4758w1();
                aVar.f9297d = mo4758w1;
            } else {
                c2035c4.m4984y(iVar);
                i10 = 19;
                c2035c4.m4976q(i10, i15, iVar, iVar4);
            }
        }
        int i21 = gVar.f9287a;
        if (i21 == 37) {
            i9 = 3;
        } else if (i21 == 38) {
            i9 = 7;
        } else if (i21 == 42) {
            i9 = 2;
        } else if (i21 == 43) {
            i9 = 0;
        } else if (i21 == 45) {
            i9 = 1;
        } else if (i21 == 47) {
            i9 = 5;
        } else if (i21 == 60) {
            i9 = 14;
        } else if (i21 == 62) {
            i9 = 17;
        } else if (i21 == 94) {
            i9 = 4;
        } else if (i21 == 124) {
            i9 = 8;
        } else if (i21 == 126) {
            i9 = 9;
        } else if (i21 == 257) {
            i9 = 19;
        } else if (i21 == 281) {
            i9 = 20;
        } else if (i21 != 291) {
            switch (i21) {
                case 293:
                    i9 = 13;
                    break;
                case 294:
                    i9 = 18;
                    break;
                case 295:
                    i9 = 15;
                    break;
                case 296:
                    i9 = 16;
                    break;
                case 297:
                    i9 = 6;
                    break;
                case 298:
                    i9 = 10;
                    break;
                case 299:
                    i9 = 11;
                    break;
                default:
                    i9 = 21;
                    break;
            }
        } else {
            i9 = 12;
        }
        while (i9 != 21) {
            e[] eVarArr = f9250v;
            if (eVarArr[i9].f9283a <= i7) {
                C2038f.a aVar5 = this.f9259j;
                aVar5.f9300a--;
                return i9;
            }
            i iVar5 = new i();
            int i22 = this.f9254e;
            m5008V();
            this.f9258i.m4949N(i9, iVar);
            int m5026l0 = m5026l0(eVarArr[i9].f9284b, iVar5);
            this.f9258i.m4963b0(i9, i22, iVar, iVar5);
            i9 = m5026l0;
        }
        C2038f.a aVar52 = this.f9259j;
        aVar52.f9300a--;
        return i9;
    }

    /* renamed from: m */
    public final void m5027m(int i7) {
        C2035c c2035c = this.f9258i;
        c2035c.f9235n = (short) (c2035c.f9235n + i7);
        while (i7 > 0) {
            C1985d m4945J = c2035c.m4945J(c2035c.f9235n - i7);
            m4945J.f8987b = c2035c.f9228g;
            m4945J.f8989d = this.f9252c;
            i7--;
        }
    }

    /* renamed from: m0 */
    public final void m5028m0(i iVar) {
        int i7 = this.f9254e;
        g gVar = this.f9256g;
        int i8 = gVar.f9287a;
        if (i8 == 40) {
            m5008V();
            m5026l0(0, iVar);
            m5037r(41, 40, i7);
            this.f9258i.m4981v(iVar);
        } else {
            if (i8 != 303) {
                m5030n0("unexpected symbol " + gVar.f9287a);
                throw null;
            }
            m5018f0(iVar);
        }
        while (true) {
            int i9 = gVar.f9287a;
            if (i9 != 40) {
                if (i9 == 46) {
                    m4995E(iVar);
                } else if (i9 == 58) {
                    i iVar2 = new i();
                    m5008V();
                    m5045x(m5024k0(), iVar2);
                    C2035c c2035c = this.f9258i;
                    c2035c.m4984y(iVar);
                    c2035c.m4939D(iVar);
                    short s7 = c2035c.f9237p;
                    c2035c.m4964c0(2);
                    i.a aVar = iVar.f9291b;
                    c2035c.m4973n(12, s7, aVar.f9298e, c2035c.m4983x(iVar2));
                    c2035c.m4939D(iVar2);
                    aVar.f9298e = s7;
                    iVar.f9290a = 6;
                    m4999I(i7, iVar);
                } else if (i9 == 91) {
                    i iVar3 = new i();
                    C2035c c2035c2 = this.f9258i;
                    c2035c2.getClass();
                    if (iVar.f9290a != 10 || iVar.m5048a()) {
                        c2035c2.m4984y(iVar);
                    }
                    m5008V();
                    m5026l0(0, iVar3);
                    C2035c c2035c3 = this.f9258i;
                    c2035c3.getClass();
                    if (iVar3.m5048a()) {
                        c2035c3.m4984y(iVar3);
                    } else {
                        c2035c3.m4981v(iVar3);
                    }
                    m5041t(93);
                    this.f9258i.m4948M(iVar, iVar3);
                } else if (i9 != 123 && i9 != 304) {
                    return;
                }
            }
            this.f9258i.m4985z(iVar);
            m4999I(i7, iVar);
        }
    }

    /* renamed from: n */
    public final void m5029n(c cVar, int i7) {
        int i8;
        i.a aVar;
        c cVar2 = cVar;
        i iVar = new i();
        i iVar2 = cVar2.f9278b;
        int i9 = iVar2.f9290a;
        int i10 = 11;
        if (!(7 <= i9 && i9 <= 11)) {
            m5030n0("syntax error");
            throw null;
        }
        if (m5034p0(44)) {
            c cVar3 = new c();
            cVar3.f9277a = cVar2;
            i iVar3 = cVar3.f9278b;
            m5028m0(iVar3);
            if (iVar3.f9290a != 11) {
                C2035c c2035c = this.f9258i;
                short s7 = c2035c.f9237p;
                boolean z6 = false;
                while (true) {
                    aVar = iVar3.f9291b;
                    if (cVar2 == null) {
                        break;
                    }
                    i iVar4 = cVar2.f9278b;
                    if (iVar4.f9290a == i10) {
                        i.a aVar2 = iVar4.f9291b;
                        short s8 = aVar2.f9296c;
                        int i11 = iVar3.f9290a;
                        if (s8 == i11 && aVar2.f9295b == aVar.f9298e) {
                            aVar2.f9296c = (short) 7;
                            aVar2.f9295b = s7;
                            z6 = true;
                        }
                        if (i11 == 7 && aVar2.f9294a == aVar.f9298e) {
                            aVar2.f9294a = s7;
                            z6 = true;
                        }
                    }
                    cVar2 = cVar2.f9277a;
                    i10 = 11;
                }
                if (z6) {
                    c2035c.m4973n(iVar3.f9290a == 7 ? 0 : 5, s7, aVar.f9298e, 0);
                    i8 = 1;
                    c2035c.m4964c0(1);
                    m5029n(cVar3, i7 + i8);
                }
            }
            i8 = 1;
            m5029n(cVar3, i7 + i8);
        } else {
            m5041t(61);
            int m4994D = m4994D(iVar);
            if (m4994D == i7) {
                this.f9258i.m4966e0(iVar);
                this.f9258i.m4968h0(iVar2, iVar);
            } else {
                m5025l(i7, m4994D, iVar);
                if (m4994D > i7) {
                    C2035c c2035c2 = this.f9258i;
                    c2035c2.f9237p = (short) (c2035c2.f9237p - (m4994D - i7));
                }
            }
        }
        iVar.m5049b(6, this.f9258i.f9237p - 1);
        this.f9258i.m4968h0(iVar2, iVar);
    }

    /* renamed from: n0 */
    public final void m5030n0(String str) {
        m5002O(this.f9256g.f9287a, str);
        throw null;
    }

    /* renamed from: o */
    public final void m5031o() {
        C2035c c2035c = this.f9258i;
        c2035c.m4982w(new C2035c.a(), false);
        m5022j0();
        c2035c.m4954S();
    }

    /* renamed from: o0 */
    public final void m5032o0(C2036d c2036d, i iVar) {
        i iVar2 = new i();
        C2035c.a aVar = new C2035c.a();
        m5008V();
        i iVar3 = new i();
        iVar3.m5051d(iVar);
        m4992B();
        this.f9258i.m4949N(13, iVar);
        m5026l0(0, iVar2);
        this.f9258i.m4963b0(13, this.f9254e, iVar, iVar2);
        while (m5034p0(44)) {
            i iVar4 = new i();
            iVar4.m5051d(iVar3);
            this.f9258i.m4949N(13, iVar4);
            m5026l0(0, iVar2);
            this.f9258i.m4963b0(13, this.f9254e, iVar4, iVar2);
            this.f9258i.m4949N(20, iVar);
            this.f9258i.m4963b0(20, this.f9254e, iVar, iVar4);
        }
        C2038f.a aVar2 = this.f9259j;
        aVar2.f9300a--;
        m5034p0(285);
        g gVar = this.f9256g;
        int i7 = gVar.f9287a;
        if (i7 == 272 || i7 == 258 || i7 == 261) {
            this.f9258i.m4946K(iVar);
            this.f9258i.m4982w(aVar, false);
            m5000J(iVar.f9292c.f9244a);
            m5020h0();
            if (m5033p(false)) {
                this.f9258i.m4954S();
                return;
            } else {
                m5030n0("unreachable statement");
                throw null;
            }
        }
        this.f9258i.m4947L(iVar);
        this.f9258i.m4982w(aVar, false);
        int i8 = iVar.f9293d.f9244a;
        m5022j0();
        this.f9258i.m4954S();
        int i9 = gVar.f9287a;
        if (i9 == 259 || i9 == 262) {
            C2035c c2035c = this.f9258i;
            c2035c.m4979t(c2036d, c2035c.m4951P());
        }
        this.f9258i.m4962a0(i8);
    }

    /* renamed from: p */
    public final boolean m5033p(boolean z6) {
        int i7 = this.f9256g.f9287a;
        if (i7 == 125 || i7 == 262 || i7 == 269) {
            return true;
        }
        if (i7 == 288) {
            return z6;
        }
        if (i7 == 301 || i7 == 259 || i7 == 260) {
            return true;
        }
        switch (i7) {
            case 265:
            case 266:
            case 267:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: p0 */
    public final boolean m5034p0(int i7) {
        if (this.f9256g.f9287a != i7) {
            return false;
        }
        m5008V();
        return true;
    }

    /* renamed from: q */
    public final void m5035q(i iVar, boolean z6, int i7) {
        C2035c c2035c = new C2035c();
        C2035c.a aVar = new C2035c.a();
        C2008z m5023k = m5023k();
        c2035c.f9223b = m5023k;
        m5023k.f9150h = i7;
        m5010X(c2035c, aVar);
        m5041t(40);
        if (z6) {
            m5007U("self");
            m5027m(1);
        }
        m5011Y();
        m5041t(41);
        boolean m5034p0 = m5034p0(123);
        m5006T(this.f9265p);
        i iVar2 = new i();
        C2035c.m4935g0(this.f9258i, this.f9265p, iVar2, 1);
        m5025l(1, 1, iVar2);
        m5027m(1);
        m5022j0();
        c2035c.f9223b.getClass();
        c2035c.f9223b.f9151i = this.f9254e;
        m5044w(iVar);
        m5042u();
        m5037r(m5034p0 ? 125 : 267, 271, i7);
    }

    /* renamed from: q0 */
    public final String m5036q0(int i7) {
        C2038f.a aVar;
        String valueOf;
        if (i7 >= 257) {
            return f9247s[i7 - 257];
        }
        if (i7 < 32) {
            aVar = this.f9259j;
            valueOf = "char(" + i7 + ")";
        } else {
            aVar = this.f9259j;
            valueOf = String.valueOf((char) i7);
        }
        aVar.getClass();
        return valueOf;
    }

    /* renamed from: r */
    public final void m5037r(int i7, int i8, int i9) {
        if (m5034p0(i7)) {
            return;
        }
        if (i9 == this.f9254e) {
            m4993C(i7);
            throw null;
        }
        C2038f.a aVar = this.f9259j;
        String str = m4990j(m5036q0(i7)) + " expected (to close " + m4990j(m5036q0(i8)) + " at line " + i9 + ")";
        aVar.getClass();
        m5030n0(str);
        throw null;
    }

    /* renamed from: r0 */
    public final boolean m5038r0(int i7, int i8, i iVar) {
        C2035c c2035c = new C2035c();
        C2035c.a aVar = new C2035c.a();
        C2008z m5023k = m5023k();
        c2035c.f9223b = m5023k;
        m5023k.f9150h = i8;
        m5010X(c2035c, aVar);
        if (i7 == 260 && m5034p0(40)) {
            m5011Y();
            m5041t(41);
        }
        boolean m5034p0 = m5034p0(123);
        m5022j0();
        c2035c.f9223b.getClass();
        c2035c.f9223b.f9151i = this.f9254e;
        m5044w(iVar);
        m5042u();
        if (m5034p0) {
            m5037r(125, i7, i8);
        }
        return m5034p0;
    }

    /* renamed from: s */
    public final boolean m5039s(String str) {
        if (str.indexOf(this.f9253d) < 0) {
            return false;
        }
        m5017e0();
        return true;
    }

    /* renamed from: s0 */
    public final int m5040s0() {
        m5008V();
        C2035c c2035c = this.f9258i;
        i iVar = new i();
        m5007U("(when)");
        m5027m(1);
        int i7 = this.f9254e;
        C2035c c2035c2 = new C2035c();
        C2035c.a aVar = new C2035c.a();
        C2008z m5023k = m5023k();
        c2035c2.f9223b = m5023k;
        m5023k.f9150h = i7;
        m5010X(c2035c2, aVar);
        c2035c2.f9223b.f9155m = "when";
        boolean m5034p0 = m5034p0(40);
        i iVar2 = new i();
        m5026l0(0, iVar2);
        if (m5034p0) {
            m5041t(41);
            m5034p0 = m5034p0(123);
        }
        C2036d c2036d = new C2036d(0);
        while (this.f9256g.f9287a == 259) {
            i iVar3 = new i();
            iVar3.m5051d(iVar2);
            m5032o0(c2036d, iVar3);
        }
        if (m5034p0(262)) {
            m5031o();
        }
        this.f9258i.m4962a0(c2036d.f9244a);
        c2035c2.f9223b.getClass();
        c2035c2.f9223b.f9151i = this.f9254e;
        m5044w(iVar);
        m5042u();
        m5037r(m5034p0 ? 125 : 267, 289, i7);
        c2035c.m4945J(c2035c.f9235n - 1).f8987b = c2035c.f9228g;
        return c2035c.m4973n(29, c2035c.f9235n - 1, 0, 2);
    }

    /* renamed from: t */
    public final void m5041t(int i7) {
        if (this.f9256g.f9287a == i7) {
            m5008V();
        } else {
            m4993C(i7);
            throw null;
        }
    }

    /* renamed from: u */
    public final void m5042u() {
        C2035c c2035c = this.f9258i;
        C2008z c2008z = c2035c.f9223b;
        c2035c.m4973n(31, 0, 1, 0);
        c2035c.m4954S();
        c2008z.f9144b = C2033a.m4930i(c2035c.f9228g, c2008z.f9144b);
        c2008z.f9146d = C2033a.m4930i(c2035c.f9228g, c2008z.f9146d);
        AbstractC2003u[] abstractC2003uArr = c2008z.f9143a;
        int i7 = c2035c.f9231j;
        AbstractC2003u[] abstractC2003uArr2 = new AbstractC2003u[i7];
        if (abstractC2003uArr != null) {
            System.arraycopy(abstractC2003uArr, 0, abstractC2003uArr2, 0, Math.min(abstractC2003uArr.length, i7));
        }
        c2008z.f9143a = abstractC2003uArr2;
        C2008z[] c2008zArr = c2008z.f9145c;
        int i8 = c2035c.f9232k;
        C2008z[] c2008zArr2 = new C2008z[i8];
        if (c2008zArr != null) {
            System.arraycopy(c2008zArr, 0, c2008zArr2, 0, Math.min(c2008zArr.length, i8));
        }
        c2008z.f9145c = c2008zArr2;
        C1985d[] c1985dArr = c2008z.f9147e;
        int i9 = c2035c.f9234m;
        C1985d[] c1985dArr2 = new C1985d[i9];
        if (c1985dArr != null) {
            System.arraycopy(c1985dArr, 0, c1985dArr2, 0, Math.min(c1985dArr.length, i9));
        }
        c2008z.f9147e = c1985dArr2;
        C1982b0[] c1982b0Arr = c2008z.f9148f;
        int i10 = c2035c.f9236o;
        C1982b0[] c1982b0Arr2 = new C1982b0[i10];
        if (c1982b0Arr != null) {
            System.arraycopy(c1982b0Arr, 0, c1982b0Arr2, 0, Math.min(c1982b0Arr.length, i10));
        }
        c2008z.f9148f = c1982b0Arr2;
        C2033a.m4928g(c2035c.f9227f == null);
        this.f9258i = c2035c.f9225d;
    }

    /* renamed from: v */
    public final void m5043v(int i7, d dVar) {
        C2035c c2035c = this.f9258i;
        b bVar = this.f9263n;
        d[] dVarArr = bVar.f9273c;
        d dVar2 = dVarArr[i7];
        C1998p c1998p = dVar2.f9279a;
        C1998p c1998p2 = dVar.f9279a;
        c1998p.getClass();
        C2033a.m4928g(c1998p2.mo4825O1(c1998p));
        short s7 = dVar2.f9282d;
        if (s7 >= dVar.f9282d) {
            c2035c.m4959X(dVar2.f9280b, dVar.f9280b);
            System.arraycopy(dVarArr, i7 + 1, dVarArr, i7, (bVar.f9274d - i7) - 1);
            int i8 = bVar.f9274d - 1;
            bVar.f9274d = i8;
            dVarArr[i8] = null;
            return;
        }
        C1998p c1998p3 = c2035c.m4945J(s7).f8986a;
        C2038f.a aVar = this.f9259j;
        String str = "<goto " + dVar2.f9279a + "> at line " + dVar2.f9281c + " jumps into the scope of local '" + c1998p3.mo4645M() + "'";
        aVar.getClass();
        this.f9256g.f9287a = 0;
        m5030n0(str);
        throw null;
    }

    /* renamed from: w */
    public final void m5044w(i iVar) {
        C2035c c2035c = this.f9258i.f9225d;
        iVar.m5049b(13, c2035c.m4974o(37, 0, c2035c.f9232k - 1));
        c2035c.m4985z(iVar);
    }

    /* renamed from: x */
    public final void m5045x(C1998p c1998p, i iVar) {
        iVar.m5049b(4, this.f9258i.m4969j(c1998p));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r6 != 58) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r10.f9287a != 61) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        if (r10.f9287a != 303) goto L21;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.io.Serializable] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5046y(p172v6.C2037e.i r12) {
        /*
            r11 = this;
            v6.c r0 = r11.f9258i
            int r1 = r11.f9254e
            r2 = 11
            r3 = 0
            int r2 = r0.m4973n(r2, r3, r3, r3)
            v6.e$a r4 = new v6.e$a
            r4.<init>()
            r4.f9270e = r3
            r4.f9268c = r3
            r4.f9269d = r3
            r4.f9267b = r12
            r5 = 13
            r12.m5049b(r5, r2)
            v6.e$i r5 = r4.f9266a
            r5.m5049b(r3, r3)
            r0.m4985z(r12)
            r12 = 123(0x7b, float:1.72E-43)
            r11.m5041t(r12)
        L2a:
            int r6 = r5.f9290a
            if (r6 == 0) goto L35
            int r6 = r4.f9270e
            if (r6 <= 0) goto L33
            goto L35
        L33:
            r6 = 0
            goto L36
        L35:
            r6 = 1
        L36:
            p172v6.C2033a.m4928g(r6)
            v6.e$g r6 = r11.f9256g
            int r7 = r6.f9287a
            r8 = 125(0x7d, float:1.75E-43)
            if (r7 != r8) goto L42
            goto L8e
        L42:
            r0.m4971l(r4)
            int r6 = r6.f9287a
            r7 = 91
            if (r6 == r7) goto L7b
            r7 = 271(0x10f, float:3.8E-43)
            r9 = 303(0x12f, float:4.25E-43)
            v6.e$g r10 = r11.f9257h
            if (r6 == r7) goto L73
            r7 = 61
            if (r6 == r9) goto L6b
            r9 = 304(0x130, float:4.26E-43)
            if (r6 == r9) goto L5f
        L5b:
            r11.m5003P(r4)
            goto L7e
        L5f:
            r11.m5005R()
            int r6 = r10.f9287a
            if (r6 == r7) goto L7b
            r7 = 58
            if (r6 == r7) goto L7b
            goto L5b
        L6b:
            r11.m5005R()
            int r6 = r10.f9287a
            if (r6 == r7) goto L7b
            goto L5b
        L73:
            r11.m5005R()
            int r6 = r10.f9287a
            if (r6 == r9) goto L7b
            goto L5b
        L7b:
            r11.m5014b0(r4)
        L7e:
            r6 = 44
            boolean r6 = r11.m5034p0(r6)
            if (r6 != 0) goto L2a
            r6 = 59
            boolean r6 = r11.m5034p0(r6)
            if (r6 != 0) goto L2a
        L8e:
            r11.m5037r(r8, r12, r1)
            r0.m4953R(r4)
            x1.b r12 = new x1.b
            u6.z r0 = r0.f9223b
            int[] r0 = r0.f9144b
            r12.<init>(r0, r2)
            int r0 = r4.f9269d
            int r0 = m4989S(r0)
            p172v6.C2033a.m4926e(r12, r0)
            int r0 = r4.f9268c
            int r0 = m4989S(r0)
            p172v6.C2033a.m4927f(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172v6.C2037e.m5046y(v6.e$i):void");
    }

    /* renamed from: z */
    public final void m5047z() {
        C1998p m4815M2 = C1998p.m4815M2("continue");
        b bVar = this.f9263n;
        d[] m4929h = C2033a.m4929h(bVar.f9275e, bVar.f9276f + 1);
        bVar.f9275e = m4929h;
        int i7 = bVar.f9276f;
        bVar.f9276f = i7 + 1;
        C2035c c2035c = this.f9258i;
        d dVar = new d(m4815M2, c2035c.f9228g, 0, c2035c.f9235n);
        m4929h[i7] = dVar;
        m4996F(dVar);
    }
}
