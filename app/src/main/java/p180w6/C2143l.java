package p180w6;

import java.io.IOException;
import java.io.InputStream;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1981b;
import p165u6.C1998p;
import p165u6.C1999q;
import p180w6.C2135d;
import p188x6.C2203d;

/* renamed from: w6.l */
/* loaded from: classes.dex */
public final class C2143l extends AbstractC2149r {

    /* renamed from: k2 */
    public static final String f9715k2;

    /* renamed from: l2 */
    public static final C1998p f9716l2;

    /* renamed from: m2 */
    public static final C1998p f9717m2;

    /* renamed from: n2 */
    public static final C1998p f9718n2;

    /* renamed from: o2 */
    public static final C1998p f9719o2;

    /* renamed from: p2 */
    public static final C1998p f9720p2;

    /* renamed from: q2 */
    public static final C1998p f9721q2;

    /* renamed from: r2 */
    public static final C1998p f9722r2;

    /* renamed from: s2 */
    public static final C1998p f9723s2;

    /* renamed from: t2 */
    public static final C1998p f9724t2;

    /* renamed from: u2 */
    public static final C1998p f9725u2;

    /* renamed from: v2 */
    public static final C1998p f9726v2;

    /* renamed from: w2 */
    public static final C1998p f9727w2;

    /* renamed from: x2 */
    public static final String f9728x2;

    /* renamed from: g2 */
    public C1981b f9729g2;

    /* renamed from: h2 */
    public C1999q f9730h2;

    /* renamed from: i2 */
    public g f9731i2;

    /* renamed from: j2 */
    public e f9732j2;

    /* renamed from: w6.l$a */
    public class a extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            String m5249J2 = C2143l.m5249J2(abstractC1984c0.m4649x(1));
            try {
                return C2203d.m5344C2(Class.forName(m5249J2));
            } catch (ClassNotFoundException unused) {
                return C1998p.m4815M2("\n\tno class '" + m5249J2 + "'");
            } catch (Exception e7) {
                return C1998p.m4815M2("\n\tjava load failed on '" + m5249J2 + "', " + e7);
            }
        }
    }

    /* renamed from: w6.l$b */
    public class b extends AbstractC2150s {
        public b() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            String m5249J2 = C2143l.m5249J2(abstractC1984c0.m4649x(1));
            try {
                AbstractC2003u abstractC2003u = (AbstractC2003u) Class.forName(m5249J2).newInstance();
                boolean mo4763Y0 = abstractC2003u.mo4763Y0();
                C2143l c2143l = C2143l.this;
                if (mo4763Y0) {
                    C1981b c1981b = c2143l.f9729g2;
                }
                return AbstractC2003u.m4867y2(abstractC2003u, c2143l.f9729g2);
            } catch (ClassNotFoundException unused) {
                return C1998p.m4815M2("\n\tno class '" + m5249J2 + "'");
            } catch (Exception e7) {
                return C1998p.m4815M2("\n\tjava load failed on '" + m5249J2 + "', " + e7);
            }
        }
    }

    /* renamed from: w6.l$c */
    public static class c extends AbstractC2150s {
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            abstractC1984c0.m4651z(1);
            return AbstractC2003u.m4866x2(AbstractC2003u.f9130m, C1998p.m4815M2("dynamic libraries not enabled"), C1998p.m4815M2("absent"));
        }
    }

    /* renamed from: w6.l$d */
    public class d extends AbstractC2150s {
        public d() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1998p m4651z = abstractC1984c0.m4651z(1);
            C2143l c2143l = C2143l.this;
            AbstractC2003u mo4777L0 = c2143l.f9730h2.mo4777L0(C2143l.f9724t2);
            if (!mo4777L0.mo4809f1()) {
                return C1998p.m4815M2("package.path is not a string");
            }
            AbstractC1984c0 mo4689W0 = c2143l.f9730h2.mo4777L0(C2143l.f9725u2).mo4689W0(AbstractC2003u.m4867y2(m4651z, mo4777L0));
            if (!mo4689W0.m4642H()) {
                return mo4689W0.mo4623t(2).mo4752r2();
            }
            C1998p mo4735i2 = mo4689W0.mo4624u().mo4735i2();
            return AbstractC2003u.m4867y2(c2143l.f9729g2.m4628c3(mo4735i2.mo4645M()), mo4735i2);
        }
    }

    /* renamed from: w6.l$e */
    public final class e extends AbstractC2150s {
        public e() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            int i7;
            int i8;
            C1998p m4823K2;
            int i9 = 1;
            C1998p m4651z = abstractC1984c0.m4651z(1);
            int mo4621I = abstractC1984c0.mo4621I();
            C2143l c2143l = C2143l.this;
            AbstractC2003u mo4777L0 = c2143l.f9730h2.mo4777L0(C2143l.f9721q2);
            AbstractC2003u mo4777L02 = c2143l.f9730h2.mo4777L0(C2143l.f9720p2);
            AbstractC2003u mo4777L03 = mo4777L0.mo4777L0(m4651z);
            if (!mo4777L03.mo4839g1()) {
                int i10 = -1;
                while (true) {
                    int i11 = i10 + i9;
                    C1998p c1998p = C2143l.f9719o2;
                    m4651z.getClass();
                    int i12 = c1998p.f9041e2;
                    int i13 = m4651z.f9041e2 - i12;
                    int i14 = i11;
                    while (true) {
                        if (i14 > i13) {
                            i14 = -1;
                            break;
                        }
                        if (C1998p.m4813E2(m4651z.f9039c2, m4651z.f9040d2 + i14, c1998p.f9040d2, c1998p.f9039c2, i12)) {
                            break;
                        }
                        i14++;
                    }
                    int i15 = m4651z.f9041e2;
                    if (i14 < 0) {
                        i14 = i15;
                    }
                    C1998p m4823K22 = m4651z.m4823K2(i11, i14);
                    AbstractC2003u mo4782R1 = mo4777L02.mo4782R1(m4823K22);
                    if (mo4782R1.mo4804d1()) {
                        mo4782R1 = new C1999q();
                        mo4777L02.mo4790Y1(m4823K22, mo4782R1);
                    } else if (!mo4782R1.mo4839g1()) {
                        mo4777L03 = null;
                        break;
                    }
                    mo4777L02 = mo4782R1;
                    if (i14 >= i15) {
                        mo4777L03 = mo4777L02;
                        break;
                    }
                    i10 = i14;
                    i9 = 1;
                }
                mo4777L0.mo4790Y1(m4651z, mo4777L03);
            }
            if (mo4777L03.mo4777L0(C2143l.f9717m2).mo4804d1()) {
                mo4777L03.mo4790Y1(C2143l.f9716l2, mo4777L03);
                m4651z.getClass();
                C1998p c1998p2 = C2143l.f9719o2;
                int i16 = c1998p2.f9041e2;
                int i17 = m4651z.f9041e2 - i16;
                while (true) {
                    if (i17 < 0) {
                        i8 = -1;
                        break;
                    }
                    if (C1998p.m4813E2(m4651z.f9039c2, m4651z.f9040d2 + i17, c1998p2.f9040d2, c1998p2.f9039c2, i16)) {
                        i8 = i17;
                        break;
                    }
                    i17--;
                }
                mo4777L03.mo4790Y1(C2143l.f9717m2, m4651z);
                if (i8 < 0) {
                    m4823K2 = AbstractC2003u.f9116R1;
                    i7 = 1;
                } else {
                    i7 = 1;
                    m4823K2 = m4651z.m4823K2(0, i8 + 1);
                }
                mo4777L03.mo4790Y1(C2143l.f9718n2, m4823K2);
            } else {
                i7 = 1;
            }
            C2135d.a m5194d = c2143l.f9729g2.f8948o2.f9073d2.m5194d(i7);
            if (m5194d == null) {
                AbstractC2003u.m4863R(0, "'module' not called from a Lua function");
                throw null;
            }
            m5194d.m5189d(m5194d.f9647a.mo4694i0().f9008e2.f9152j + i7, mo4777L03);
            for (int i18 = 2; i18 <= mo4621I; i18++) {
                abstractC1984c0.mo4623t(i18).mo4691f0(mo4777L03);
            }
            mo4777L03.mo4792Z1(mo4777L03);
            return mo4777L03;
        }
    }

    /* renamed from: w6.l$f */
    public class f extends AbstractC2150s {
        public f() {
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            C1998p m4651z = abstractC1984c0.m4651z(1);
            AbstractC2003u mo4777L0 = C2143l.this.f9730h2.mo4777L0(C2143l.f9723s2).mo4777L0(m4651z);
            if (!mo4777L0.mo4804d1()) {
                return mo4777L0;
            }
            return C1998p.m4815M2("\n\tno field package.preload['" + m4651z + "']");
        }
    }

    /* renamed from: w6.l$g */
    public final class g extends AbstractC2141j {
        public g() {
        }

        @Override // p180w6.AbstractC2141j, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            AbstractC1984c0 mo4689W0;
            C1998p mo4753s0 = abstractC2003u.mo4753s0();
            C2143l c2143l = C2143l.this;
            AbstractC2003u mo4777L0 = c2143l.f9730h2.mo4777L0(C2143l.f9721q2);
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(mo4753s0);
            if (mo4777L02.mo4682m2()) {
                if (mo4777L02 != C2143l.f9727w2) {
                    return mo4777L02;
                }
                AbstractC2003u.m4861I0("loop or previous error loading module '" + mo4753s0 + "'");
                throw null;
            }
            C1999q mo4795t0 = c2143l.f9730h2.mo4777L0(C2143l.f9726v2).mo4795t0();
            StringBuffer stringBuffer = new StringBuffer();
            int i7 = 1;
            while (true) {
                AbstractC2003u mo4776J0 = mo4795t0.mo4776J0(i7);
                if (mo4776J0.mo4804d1()) {
                    AbstractC2003u.m4861I0("module '" + mo4753s0 + "' not found: " + mo4753s0 + ((Object) stringBuffer));
                    throw null;
                }
                mo4689W0 = mo4776J0.mo4689W0(mo4753s0);
                if (!mo4689W0.mo4623t(1).mo4850h1() && !mo4689W0.mo4623t(1).mo4763Y0()) {
                    if (mo4689W0.m4642H()) {
                        stringBuffer.append(mo4689W0.m4646N(1));
                    }
                    i7++;
                }
            }
            C1998p c1998p = C2143l.f9727w2;
            mo4777L0.mo4790Y1(mo4753s0, c1998p);
            AbstractC2003u mo4624u = mo4689W0.mo4623t(1).mo4850h1() ? mo4689W0.mo4624u() : mo4689W0.mo4624u().mo4692g0(mo4753s0, mo4689W0.mo4623t(2));
            if (mo4624u.mo4804d1()) {
                mo4624u = mo4777L0.mo4777L0(mo4753s0);
                if (mo4624u == c1998p) {
                    mo4624u = AbstractC2003u.f9131s;
                }
                return mo4624u;
            }
            mo4777L0.mo4790Y1(mo4753s0, mo4624u);
            return mo4624u;
        }
    }

    /* renamed from: w6.l$h */
    public class h extends AbstractC2150s {
        public h() {
        }

        /* JADX WARN: Type inference failed for: r6v4, types: [w6.m, w6.r] */
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            String m4649x = abstractC1984c0.m4649x(1);
            String m4649x2 = abstractC1984c0.m4649x(2);
            String m4644K = abstractC1984c0.m4644K(3, ".");
            String m4644K2 = abstractC1984c0.m4644K(4, C2143l.f9728x2);
            int length = m4649x2.length();
            String replace = m4649x.replace(m4644K.charAt(0), m4644K2.charAt(0));
            int i7 = -1;
            StringBuffer stringBuffer = null;
            while (i7 < length) {
                int i8 = i7 + 1;
                int indexOf = m4649x2.indexOf(59, i8);
                if (indexOf < 0) {
                    indexOf = m4649x2.length();
                }
                String substring = m4649x2.substring(i8, indexOf);
                int indexOf2 = substring.indexOf(63);
                if (indexOf2 >= 0) {
                    substring = substring.substring(0, indexOf2) + replace + substring.substring(indexOf2 + 1);
                }
                InputStream mo5145s = C2143l.this.f9729g2.f8947n2.mo5145s(substring);
                if (mo5145s != null) {
                    try {
                        mo5145s.close();
                    } catch (IOException unused) {
                    }
                    return C1998p.m4815M2(substring);
                }
                if (stringBuffer == null) {
                    stringBuffer = new StringBuffer();
                }
                stringBuffer.append("\n\t" + substring);
                i7 = indexOf;
            }
            return AbstractC2003u.m4867y2(AbstractC2003u.f9130m, C1998p.m4815M2(stringBuffer.toString()));
        }
    }

    static {
        String str;
        try {
            str = System.getProperty("luaj.package.path");
        } catch (Exception e7) {
            System.out.println(e7.toString());
            str = null;
        }
        if (str == null) {
            str = "?.lua";
        }
        f9715k2 = str;
        f9716l2 = C1998p.m4815M2("_M");
        f9717m2 = C1998p.m4815M2("_NAME");
        f9718n2 = C1998p.m4815M2("_PACKAGE");
        f9719o2 = C1998p.m4815M2(".");
        f9720p2 = C1998p.m4815M2("modules");
        f9721q2 = C1998p.m4815M2("loaded");
        f9722r2 = C1998p.m4815M2("loadlib");
        f9723s2 = C1998p.m4815M2("preload");
        f9724t2 = C1998p.m4815M2("path");
        f9725u2 = C1998p.m4815M2("searchpath");
        f9726v2 = C1998p.m4815M2("searchers");
        f9727w2 = C1998p.m4815M2("\u0001");
        f9728x2 = System.getProperty("file.separator");
    }

    /* renamed from: I2 */
    public static final boolean m5248I2(char c7) {
        return (c7 >= 'a' && c7 <= 'z') || (c7 >= 'A' && c7 <= 'Z') || ((c7 >= '0' && c7 <= '9') || c7 == '$' || c7 == '.' || c7 == '_');
    }

    /* renamed from: J2 */
    public static final String m5249J2(String str) {
        int length = str.length();
        int i7 = str.endsWith(".lua") ? length - 4 : length;
        for (int i8 = 0; i8 < i7; i8++) {
            char charAt = str.charAt(i8);
            if (!m5248I2(charAt) || charAt == '/' || charAt == '\\') {
                StringBuffer stringBuffer = new StringBuffer(i7);
                for (int i9 = 0; i9 < i7; i9++) {
                    char charAt2 = str.charAt(i9);
                    if (!m5248I2(charAt2)) {
                        charAt2 = (charAt2 == '/' || charAt2 == '\\') ? '.' : '_';
                    }
                    stringBuffer.append(charAt2);
                }
                return stringBuffer.toString();
            }
        }
        return length == i7 ? str : str.substring(0, i7);
    }

    @Override // p180w6.AbstractC2139h, p165u6.AbstractC1992j, p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        return "package";
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        C1981b mo4629l0 = abstractC2003u2.mo4629l0();
        this.f9729g2 = mo4629l0;
        g gVar = new g();
        this.f9731i2 = gVar;
        mo4629l0.getClass();
        mo4629l0.mo4790Y1(C1998p.m4815M2("require"), gVar);
        C1981b c1981b = this.f9729g2;
        e eVar = new e();
        this.f9732j2 = eVar;
        c1981b.getClass();
        c1981b.mo4790Y1(C1998p.m4815M2("module"), eVar);
        C1999q c1999q = new C1999q();
        this.f9730h2 = c1999q;
        C1999q c1999q2 = new C1999q();
        C1998p c1998p = f9721q2;
        c1999q.mo4790Y1(c1998p, c1999q2);
        this.f9730h2.mo4790Y1(f9720p2, new C1999q());
        this.f9730h2.mo4790Y1(f9723s2, new C1999q());
        this.f9730h2.mo4790Y1(f9724t2, C1998p.m4815M2(f9715k2));
        this.f9730h2.mo4790Y1(f9722r2, new c());
        this.f9730h2.mo4790Y1(f9725u2, new h());
        C1999q c1999q3 = new C1999q();
        c1999q3.mo4788W1(1, new f());
        c1999q3.mo4788W1(2, new d());
        c1999q3.mo4788W1(3, new b());
        c1999q3.mo4788W1(4, new a());
        this.f9730h2.mo4790Y1(f9726v2, c1999q3);
        AbstractC2003u mo4777L0 = this.f9730h2.mo4777L0(c1998p);
        C1999q c1999q4 = this.f9730h2;
        mo4777L0.getClass();
        mo4777L0.mo4790Y1(C1998p.m4815M2("package"), c1999q4);
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("package"), this.f9730h2);
        this.f9729g2.f8949p2 = this;
        return abstractC2003u2;
    }
}
