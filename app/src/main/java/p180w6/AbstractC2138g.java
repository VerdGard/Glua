package p180w6;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1988f;
import p165u6.C1991i;
import p165u6.C1993k;
import p165u6.C1996n;
import p165u6.C1998p;
import p165u6.C1999q;
import p188x6.C2208i;

/* renamed from: w6.g */
/* loaded from: classes.dex */
public abstract class AbstractC2138g extends AbstractC2149r {

    /* renamed from: l2 */
    public static final C1998p f9683l2 = C1998p.m4815M2("stdin");

    /* renamed from: m2 */
    public static final C1998p f9684m2 = C1998p.m4815M2("stdout");

    /* renamed from: n2 */
    public static final C1998p f9685n2 = C1998p.m4815M2("stderr");

    /* renamed from: o2 */
    public static final C1998p f9686o2 = C1998p.m4815M2("file");

    /* renamed from: p2 */
    public static final C1998p f9687p2 = C1998p.m4815M2("closed file");

    /* renamed from: q2 */
    public static final String[] f9688q2 = {"close", "flush", "input", "lines", "open", "output", "popen", "read", "tmpfile", "type", "write"};

    /* renamed from: r2 */
    public static final String[] f9689r2 = {"close", "flush", "lines", "read", "seek", "setvbuf", "write"};

    /* renamed from: g2 */
    public a f9690g2 = null;

    /* renamed from: h2 */
    public a f9691h2 = null;

    /* renamed from: i2 */
    public a f9692i2 = null;

    /* renamed from: j2 */
    public C1999q f9693j2;

    /* renamed from: k2 */
    public C1981b f9694k2;

    /* renamed from: w6.g$a */
    public abstract class a extends AbstractC2003u {
        public a() {
        }

        /* renamed from: C2 */
        public abstract void mo5221C2();

        /* renamed from: D2 */
        public abstract void mo5222D2();

        /* renamed from: E2 */
        public abstract boolean mo5223E2();

        /* renamed from: F2 */
        public abstract boolean mo5224F2();

        /* renamed from: G2 */
        public abstract int mo5225G2();

        /* renamed from: H2 */
        public abstract int mo5226H2();

        /* renamed from: I2 */
        public abstract int mo5227I2(byte[] bArr, int i7);

        /* renamed from: J2 */
        public abstract int mo5228J2();

        /* renamed from: K2 */
        public abstract int mo5229K2(int i7, String str);

        @Override // p165u6.AbstractC2003u
        /* renamed from: L0 */
        public final AbstractC2003u mo4777L0(AbstractC2003u abstractC2003u) {
            return AbstractC2138g.this.f9693j2.mo4777L0(abstractC2003u);
        }

        /* renamed from: L2 */
        public abstract void mo5230L2(String str);

        @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        /* renamed from: M */
        public String mo4645M() {
            return "file: " + Integer.toHexString(hashCode());
        }

        /* renamed from: M2 */
        public abstract void mo5231M2(C1998p c1998p);

        public final void finalize() {
            if (mo5223E2()) {
                return;
            }
            try {
                mo5221C2();
            } catch (IOException unused) {
            }
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: t2 */
        public final int mo4675t2() {
            return 7;
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: u2 */
        public final String mo4676u2() {
            return "userdata";
        }
    }

    /* renamed from: w6.g$b */
    public static final class C2208i.b extends AbstractC2150s {

        /* renamed from: g2 */
        public final a f9696g2;

        /* renamed from: h2 */
        public AbstractC2138g f9697h2;

        /* renamed from: i2 */
        public final boolean f9698i2;

        /* renamed from: j2 */
        public final AbstractC1984c0 f9699j2;

        public b() {
        }

        public b(a aVar, AbstractC2138g abstractC2138g, boolean z6, AbstractC1984c0 abstractC1984c0) {
            this.f9696g2 = aVar;
            this.f9701f2 = "lnext";
            this.f9700e2 = 19;
            this.f9697h2 = abstractC2138g;
            this.f9698i2 = z6;
            this.f9699j2 = abstractC1984c0.m4640E();
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1996n c1996n = AbstractC2003u.f9130m;
            try {
                int i7 = this.f9700e2;
                boolean z6 = true;
                C1988f c1988f = AbstractC2003u.f9131s;
                switch (i7) {
                    case 0:
                        AbstractC2138g abstractC2138g = this.f9697h2;
                        AbstractC2003u mo4624u = abstractC1984c0.mo4624u();
                        abstractC2138g.getClass();
                        a m5218W2 = mo4624u.mo4804d1() ? abstractC2138g.m5218W2() : AbstractC2138g.m5207N2(mo4624u);
                        AbstractC2138g.m5208O2(m5218W2);
                        if (m5218W2.mo5224F2()) {
                            return AbstractC2003u.m4867y2(c1996n, C1998p.m4815M2("cannot close standard file"));
                        }
                        m5218W2.mo5221C2();
                        return c1988f;
                    case 1:
                        AbstractC2138g abstractC2138g2 = this.f9697h2;
                        AbstractC2138g.m5208O2(abstractC2138g2.m5218W2());
                        abstractC2138g2.f9691h2.mo5222D2();
                        return c1988f;
                    case 2:
                        AbstractC2138g abstractC2138g3 = this.f9697h2;
                        AbstractC2003u mo4624u2 = abstractC1984c0.mo4624u();
                        abstractC2138g3.getClass();
                        a m5215S2 = mo4624u2.mo4804d1() ? abstractC2138g3.m5215S2() : mo4624u2.mo4809f1() ? abstractC2138g3.m5216T2(mo4624u2.mo4742n0(), 3, "r") : AbstractC2138g.m5207N2(mo4624u2);
                        abstractC2138g3.f9690g2 = m5215S2;
                        return m5215S2;
                    case 3:
                        AbstractC2138g abstractC2138g4 = this.f9697h2;
                        abstractC2138g4.getClass();
                        String m4644K = abstractC1984c0.m4644K(1, null);
                        a m5215S22 = m4644K == null ? abstractC2138g4.m5215S2() : abstractC2138g4.m5216T2(m4644K, 3, "r");
                        AbstractC2138g.m5208O2(m5215S22);
                        if (m4644K == null) {
                            z6 = false;
                        }
                        return abstractC2138g4.m5217V2(m5215S22, z6, abstractC1984c0.mo4622L(2));
                    case 4:
                        return this.f9697h2.m5219X2(abstractC1984c0.m4649x(1), 3, abstractC1984c0.m4644K(2, "r"));
                    case 5:
                        AbstractC2138g abstractC2138g5 = this.f9697h2;
                        AbstractC2003u mo4624u3 = abstractC1984c0.mo4624u();
                        abstractC2138g5.getClass();
                        a m5218W22 = mo4624u3.mo4804d1() ? abstractC2138g5.m5218W2() : mo4624u3.mo4809f1() ? abstractC2138g5.m5216T2(mo4624u3.mo4742n0(), 3, "w") : AbstractC2138g.m5207N2(mo4624u3);
                        abstractC2138g5.f9691h2 = m5218W22;
                        return m5218W22;
                    case 6:
                        return this.f9697h2.m5214L2(abstractC1984c0.m4649x(1), abstractC1984c0.m4644K(2, "r"));
                    case 7:
                        AbstractC2138g abstractC2138g6 = this.f9697h2;
                        AbstractC2138g.m5208O2(abstractC2138g6.m5215S2());
                        return AbstractC2138g.m5212U2(abstractC2138g6.f9690g2, abstractC1984c0);
                    case 8:
                        AbstractC2138g abstractC2138g7 = this.f9697h2;
                        abstractC2138g7.getClass();
                        File createTempFile = File.createTempFile(".luaj", "bin");
                        createTempFile.deleteOnExit();
                        return new C2208i.a((C2208i) abstractC2138g7, new RandomAccessFile(createTempFile, "rw"), null, null);
                    case 9:
                        AbstractC2138g abstractC2138g8 = this.f9697h2;
                        AbstractC2003u mo4624u4 = abstractC1984c0.mo4624u();
                        abstractC2138g8.getClass();
                        a aVar = mo4624u4 instanceof a ? (a) mo4624u4 : null;
                        return aVar != null ? aVar.mo5223E2() ? AbstractC2138g.f9687p2 : AbstractC2138g.f9686o2 : c1996n;
                    case 10:
                        AbstractC2138g abstractC2138g9 = this.f9697h2;
                        AbstractC2138g.m5208O2(abstractC2138g9.m5218W2());
                        a aVar2 = abstractC2138g9.f9691h2;
                        int mo4621I = abstractC1984c0.mo4621I();
                        for (int i8 = 1; i8 <= mo4621I; i8++) {
                            aVar2.mo5231M2(abstractC1984c0.m4651z(i8));
                        }
                        return aVar2;
                    case 11:
                        AbstractC2138g abstractC2138g10 = this.f9697h2;
                        AbstractC2003u mo4624u5 = abstractC1984c0.mo4624u();
                        abstractC2138g10.getClass();
                        a m5207N2 = AbstractC2138g.m5207N2(mo4624u5);
                        if (m5207N2.mo5224F2()) {
                            return AbstractC2003u.m4867y2(c1996n, C1998p.m4815M2("cannot close standard file"));
                        }
                        m5207N2.mo5221C2();
                        return c1988f;
                    case 12:
                        AbstractC2138g abstractC2138g11 = this.f9697h2;
                        AbstractC2003u mo4624u6 = abstractC1984c0.mo4624u();
                        abstractC2138g11.getClass();
                        AbstractC2138g.m5207N2(mo4624u6).mo5222D2();
                        return c1988f;
                    case 13:
                        AbstractC2138g abstractC2138g12 = this.f9697h2;
                        abstractC2138g12.getClass();
                        return abstractC2138g12.m5217V2(AbstractC2138g.m5207N2(abstractC1984c0.mo4624u()), false, abstractC1984c0.mo4622L(2));
                    case 14:
                        AbstractC2138g abstractC2138g13 = this.f9697h2;
                        AbstractC2003u mo4624u7 = abstractC1984c0.mo4624u();
                        AbstractC1984c0 mo4622L = abstractC1984c0.mo4622L(2);
                        abstractC2138g13.getClass();
                        return AbstractC2138g.m5212U2(AbstractC2138g.m5207N2(mo4624u7), mo4622L);
                    case 15:
                        AbstractC2138g abstractC2138g14 = this.f9697h2;
                        AbstractC2003u mo4624u8 = abstractC1984c0.mo4624u();
                        String m4644K2 = abstractC1984c0.m4644K(2, "cur");
                        int m4643J = abstractC1984c0.m4643J(3, 0);
                        abstractC2138g14.getClass();
                        return AbstractC2138g.m5204I2(mo4624u8, m4644K2, m4643J);
                    case 16:
                        AbstractC2138g abstractC2138g15 = this.f9697h2;
                        AbstractC2003u mo4624u9 = abstractC1984c0.mo4624u();
                        String m4649x = abstractC1984c0.m4649x(2);
                        int m4643J2 = abstractC1984c0.m4643J(3, 8192);
                        abstractC2138g15.getClass();
                        return AbstractC2138g.m5205J2(mo4624u9, m4649x, m4643J2);
                    case 17:
                        AbstractC2138g abstractC2138g16 = this.f9697h2;
                        AbstractC2003u mo4624u10 = abstractC1984c0.mo4624u();
                        AbstractC1984c0 mo4622L2 = abstractC1984c0.mo4622L(2);
                        abstractC2138g16.getClass();
                        a m5207N22 = AbstractC2138g.m5207N2(mo4624u10);
                        int mo4621I2 = mo4622L2.mo4621I();
                        for (int i9 = 1; i9 <= mo4621I2; i9++) {
                            m5207N22.mo5231M2(mo4622L2.m4651z(i9));
                        }
                        return m5207N22;
                    case 18:
                        return this.f9697h2.m5213K2(abstractC1984c0.mo4623t(2));
                    case 19:
                        AbstractC2138g abstractC2138g17 = this.f9697h2;
                        a aVar3 = this.f9696g2;
                        boolean z7 = this.f9698i2;
                        AbstractC1984c0 abstractC1984c02 = this.f9699j2;
                        abstractC2138g17.getClass();
                        return AbstractC2138g.m5206M2(aVar3, z7, abstractC1984c02);
                    default:
                        return AbstractC2003u.f9124Y;
                }
            } catch (IOException e7) {
                if (this.f9700e2 == 19) {
                    String message = e7.getMessage();
                    if (message == null) {
                        message = e7.toString();
                    }
                    AbstractC2003u.m4861I0(message);
                    throw null;
                }
                C1998p c1998p = AbstractC2138g.f9683l2;
                String message2 = e7.getMessage();
                StringBuilder sb = new StringBuilder("io error: ");
                if (message2 == null) {
                    message2 = e7.toString();
                }
                sb.append(message2);
                return AbstractC2003u.m4867y2(c1996n, C1998p.m4815M2(sb.toString()));
            }
        }
    }

    /* renamed from: I2 */
    public static C1993k m5204I2(AbstractC2003u abstractC2003u, String str, int i7) {
        if ("set".equals(str) || "end".equals(str) || "cur".equals(str)) {
            return C1993k.m4765C2(m5207N2(abstractC2003u).mo5229K2(i7, str));
        }
        AbstractC2003u.m4863R(1, "invalid value: '" + str + "'; must be one of 'set', 'cur' or 'end'");
        throw null;
    }

    /* renamed from: J2 */
    public static C1988f m5205J2(AbstractC2003u abstractC2003u, String str, int i7) {
        if ("no".equals(str) || "full".equals(str) || "line".equals(str)) {
            m5207N2(abstractC2003u).mo5230L2(str);
            return AbstractC2003u.f9131s;
        }
        AbstractC2003u.m4863R(1, "invalid value: '" + str + "'; must be one of 'no', 'full' or 'line'");
        throw null;
    }

    /* renamed from: M2 */
    public static AbstractC1984c0 m5206M2(a aVar, boolean z6, AbstractC1984c0 abstractC1984c0) {
        a aVar2 = aVar instanceof a ? aVar : null;
        boolean z7 = true;
        if (aVar2 == null) {
            AbstractC2003u.m4863R(1, "not a file: " + aVar);
            throw null;
        }
        if (aVar2.mo5223E2()) {
            AbstractC2003u.m4861I0("file is already closed");
            throw null;
        }
        AbstractC1984c0 m5212U2 = m5212U2(aVar2, abstractC1984c0);
        if (z6 && m5212U2.m4641G(1)) {
            try {
                if (aVar2.mo5225G2() >= 0) {
                    z7 = false;
                }
            } catch (EOFException unused) {
            }
            if (z7) {
                aVar2.mo5221C2();
            }
        }
        return m5212U2;
    }

    /* renamed from: N2 */
    public static a m5207N2(AbstractC2003u abstractC2003u) {
        a aVar = abstractC2003u instanceof a ? (a) abstractC2003u : null;
        if (aVar != null) {
            m5208O2(aVar);
            return aVar;
        }
        AbstractC2003u.m4863R(1, "file");
        throw null;
    }

    /* renamed from: O2 */
    public static void m5208O2(a aVar) {
        if (aVar.mo5223E2()) {
            AbstractC2003u.m4861I0("attempt to use a closed file");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r3.mo5225G2() < 0) goto L7;
     */
    /* renamed from: P2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p165u6.AbstractC2003u m5209P2(p180w6.AbstractC2138g.a r3, int r4) {
        /*
            u6.n r0 = p165u6.AbstractC2003u.f9130m
            r1 = 0
            if (r4 != 0) goto L15
            r3.getClass()
            int r3 = r3.mo5225G2()     // Catch: java.io.EOFException -> Le
            if (r3 >= 0) goto Lf
        Le:
            r1 = 1
        Lf:
            if (r1 == 0) goto L12
            goto L14
        L12:
            u6.p r0 = p165u6.AbstractC2003u.f9116R1
        L14:
            return r0
        L15:
            byte[] r2 = new byte[r4]
            int r3 = r3.mo5227I2(r2, r4)
            if (r3 >= 0) goto L1e
            return r0
        L1e:
            u6.p r3 = p165u6.C1998p.m4817O2(r2, r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p180w6.AbstractC2138g.m5209P2(w6.g$a, int):u6.u");
    }

    /* renamed from: Q2 */
    public static void m5210Q2(a aVar, String str, ByteArrayOutputStream byteArrayOutputStream) {
        while (true) {
            int mo5225G2 = aVar.mo5225G2();
            if (str.indexOf(mo5225G2) < 0) {
                return;
            }
            aVar.mo5226H2();
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.write(mo5225G2);
            }
        }
    }

    /* renamed from: R2 */
    public static AbstractC2003u m5211R2(a aVar, boolean z6, boolean z7) {
        int i7;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (!z6) {
                while (true) {
                    i7 = aVar.mo5226H2();
                    if (i7 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(i7);
                }
            } else {
                while (true) {
                    i7 = aVar.mo5226H2();
                    if (i7 < 0) {
                        break;
                    }
                    if (i7 != 10) {
                        if (i7 == 13 && !z7) {
                        }
                        byteArrayOutputStream.write(i7);
                    } else if (z7) {
                        byteArrayOutputStream.write(i7);
                    }
                }
            }
        } catch (EOFException unused) {
            i7 = -1;
        }
        if (i7 < 0 && byteArrayOutputStream.size() == 0) {
            return AbstractC2003u.f9130m;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return C1998p.m4817O2(byteArray, 0, byteArray.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r4 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        return p165u6.AbstractC2003u.m4858A2(r3, 0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return r5;
     */
    /* renamed from: U2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p165u6.AbstractC1984c0 m5212U2(p180w6.AbstractC2138g.a r12, p165u6.AbstractC1984c0 r13) {
        /*
            int r0 = r13.mo4621I()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Ld
            u6.u r12 = m5211R2(r12, r2, r1)
            return r12
        Ld:
            u6.u[] r3 = new p165u6.AbstractC2003u[r0]
            r4 = 0
        L10:
            u6.n r5 = p165u6.AbstractC2003u.f9130m
            if (r4 >= r0) goto Lb7
            int r6 = r4 + 1
            u6.u r7 = r13.mo4623t(r6)
            int r8 = r7.mo4675t2()
            r9 = 3
            if (r8 == r9) goto La2
            r9 = 4
            r10 = 0
            if (r8 != r9) goto L9c
            u6.p r7 = r7.mo4753s0()
            int r8 = r7.f9041e2
            r9 = 2
            if (r8 < r9) goto L9c
            byte[] r8 = r7.f9039c2
            int r7 = r7.f9040d2
            r9 = r8[r7]
            r11 = 42
            if (r9 != r11) goto L9c
            int r7 = r7 + 1
            r7 = r8[r7]
            r8 = 76
            if (r7 == r8) goto L97
            r8 = 97
            if (r7 == r8) goto L82
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L7d
            r8 = 110(0x6e, float:1.54E-43)
            if (r7 != r8) goto L9c
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r7.<init>()
            java.lang.String r8 = " \t\r\n"
            m5210Q2(r12, r8, r10)
            java.lang.String r8 = "-+"
            m5210Q2(r12, r8, r7)
            java.lang.String r8 = "0123456789"
            m5210Q2(r12, r8, r7)
            java.lang.String r9 = "."
            m5210Q2(r12, r9, r7)
            m5210Q2(r12, r8, r7)
            java.lang.String r7 = r7.toString()
            int r8 = r7.length()
            if (r8 <= 0) goto L7b
            double r7 = java.lang.Double.parseDouble(r7)
            u6.o r7 = p165u6.C1990h.m4698E2(r7)
            goto Laa
        L7b:
            r7 = r5
            goto Laa
        L7d:
            u6.u r7 = m5211R2(r12, r2, r1)
            goto Laa
        L82:
            int r7 = r12.mo5228J2()
            if (r7 < 0) goto L92
            if (r7 != 0) goto L8d
            u6.p r7 = p165u6.AbstractC2003u.f9116R1
            goto Laa
        L8d:
            u6.u r7 = m5209P2(r12, r7)
            goto Laa
        L92:
            u6.u r7 = m5211R2(r12, r1, r1)
            goto Laa
        L97:
            u6.u r7 = m5211R2(r12, r2, r2)
            goto Laa
        L9c:
            java.lang.String r12 = "(invalid format)"
            p165u6.AbstractC2003u.m4863R(r6, r12)
            throw r10
        La2:
            int r7 = r7.mo4747o2()
            u6.u r7 = m5209P2(r12, r7)
        Laa:
            r3[r4] = r7
            boolean r4 = r7.mo4804d1()
            if (r4 == 0) goto Lb4
            r4 = r6
            goto Lb7
        Lb4:
            r4 = r6
            goto L10
        Lb7:
            if (r4 != 0) goto Lba
            goto Lbe
        Lba:
            u6.c0 r5 = p165u6.AbstractC2003u.m4858A2(r3, r1, r4)
        Lbe:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p180w6.AbstractC2138g.m5212U2(w6.g$a, u6.c0):u6.c0");
    }

    /* renamed from: K2 */
    public final AbstractC2003u m5213K2(AbstractC2003u abstractC2003u) {
        if (abstractC2003u.equals(f9684m2)) {
            return m5218W2();
        }
        if (abstractC2003u.equals(f9683l2)) {
            return m5215S2();
        }
        if (!abstractC2003u.equals(f9685n2)) {
            return AbstractC2003u.f9130m;
        }
        a aVar = this.f9692i2;
        if (aVar != null) {
            return aVar;
        }
        a m5216T2 = m5216T2("-", 2, "w");
        this.f9692i2 = m5216T2;
        return m5216T2;
    }

    /* renamed from: L2 */
    public final C2208i.a m5214L2(String str, String str2) {
        if ("r".equals(str2) || "w".equals(str2) || "rw".equals(str2)) {
            C2208i c2208i = (C2208i) this;
            Process exec = Runtime.getRuntime().exec(str);
            return "rw".equals(str2) ? new C2208i.a(c2208i, null, exec.getInputStream(), exec.getOutputStream()) : "w".equals(str2) ? new C2208i.a(c2208i, null, null, exec.getOutputStream()) : new C2208i.a(c2208i, null, exec.getInputStream(), null);
        }
        AbstractC2003u.m4863R(2, "invalid value: '" + str2 + "'; must be one of 'r' or 'w'");
        throw null;
    }

    /* renamed from: S2 */
    public final a m5215S2() {
        a aVar = this.f9690g2;
        if (aVar != null) {
            return aVar;
        }
        a m5216T2 = m5216T2("-", 0, "r");
        this.f9690g2 = m5216T2;
        return m5216T2;
    }

    /* renamed from: T2 */
    public final a m5216T2(String str, int i7, String str2) {
        try {
            return m5219X2(str, i7, str2);
        } catch (Exception e7) {
            AbstractC2003u.m4861I0("io error: " + e7.getMessage());
            throw null;
        }
    }

    /* renamed from: V2 */
    public final C2208i.b m5217V2(a aVar, boolean z6, AbstractC1984c0 abstractC1984c0) {
        try {
            return new b(aVar, this, z6, abstractC1984c0);
        } catch (Exception e7) {
            throw new C1991i("lines: " + e7);
        }
    }

    /* renamed from: W2 */
    public final a m5218W2() {
        a aVar = this.f9691h2;
        if (aVar != null) {
            return aVar;
        }
        a m5216T2 = m5216T2("-", 1, "w");
        this.f9691h2 = m5216T2;
        return m5216T2;
    }

    /* renamed from: X2 */
    public final a m5219X2(String str, int i7, String str2) {
        int length = str2.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str2.charAt(i8);
            if ((i8 != 0 || "rwa".indexOf(charAt) < 0) && (!(i8 == 1 && charAt == '+') && (i8 < 1 || charAt != 'b'))) {
                length = -1;
                break;
            }
        }
        if (length <= 0) {
            AbstractC2003u.m4863R(2, "invalid mode: '" + str2 + "'");
            throw null;
        }
        if (i7 == 0) {
            return ((C2208i) this).new b();
        }
        if (i7 == 1) {
            return ((C2208i) this).new c(1);
        }
        if (i7 == 2) {
            return ((C2208i) this).new c(2);
        }
        boolean startsWith = str2.startsWith("r");
        boolean startsWith2 = str2.startsWith("a");
        str2.indexOf(43);
        str2.endsWith("b");
        C2208i c2208i = (C2208i) this;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, startsWith ? "r" : "rw");
        if (startsWith2) {
            randomAccessFile.seek(randomAccessFile.length());
        } else if (!startsWith) {
            randomAccessFile.setLength(0L);
        }
        return new C2208i.a(c2208i, randomAccessFile, null, null);
    }

    /* renamed from: Y2 */
    public final void m5220Y2(C1999q c1999q) {
        for (AbstractC2003u abstractC2003u : c1999q.mo4781O2()) {
            ((C2208i.b) c1999q.mo4777L0(abstractC2003u)).f9697h2 = this;
        }
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        this.f9694k2 = abstractC2003u2.mo4629l0();
        C1999q c1999q = new C1999q();
        AbstractC2139h.m5232G2(c1999q, C2208i.b.class, f9688q2, 0);
        C1999q c1999q2 = new C1999q();
        this.f9693j2 = c1999q2;
        AbstractC2139h.m5232G2(c1999q2, C2208i.b.class, f9689r2, 11);
        C1999q c1999q3 = new C1999q();
        AbstractC2139h.m5232G2(c1999q3, C2208i.b.class, new String[]{"__index"}, 18);
        c1999q.mo4792Z1(c1999q3);
        m5220Y2(c1999q);
        m5220Y2(this.f9693j2);
        m5220Y2(c1999q3);
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("io"), c1999q);
        if (!abstractC2003u2.mo4777L0(C1998p.m4815M2("package")).mo4804d1()) {
            AbstractC2003u mo4777L0 = abstractC2003u2.mo4777L0(C1998p.m4815M2("package"));
            mo4777L0.getClass();
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
            mo4777L02.getClass();
            mo4777L02.mo4790Y1(C1998p.m4815M2("io"), c1999q);
        }
        return c1999q;
    }
}
