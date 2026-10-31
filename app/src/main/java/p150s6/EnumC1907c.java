package p150s6;

import java.util.ArrayList;
import java.util.Iterator;
import p120p.C1686g;
import p134q6.C1806b;
import p142r6.AbstractC1856m;
import p142r6.C1850g;
import p142r6.C1851h;
import p142r6.C1852i;
import p150s6.AbstractC1912h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s6.c */
/* loaded from: classes.dex */
public abstract class EnumC1907c {

    /* renamed from: A1 */
    public static final c f8490A1;

    /* renamed from: B1 */
    public static final d f8491B1;

    /* renamed from: C1 */
    public static final e f8492C1;

    /* renamed from: D1 */
    public static final f f8493D1;

    /* renamed from: E1 */
    public static final g f8494E1;

    /* renamed from: F1 */
    public static final h f8495F1;

    /* renamed from: G1 */
    public static final i f8496G1;

    /* renamed from: H1 */
    public static final j f8497H1;

    /* renamed from: I1 */
    public static final l f8498I1;

    /* renamed from: J1 */
    public static final m f8499J1;

    /* renamed from: K1 */
    public static final n f8500K1;

    /* renamed from: L1 */
    public static final String f8501L1;

    /* renamed from: M1 */
    public static final /* synthetic */ EnumC1907c[] f8502M1;

    /* renamed from: X */
    public static final s f8503X;

    /* renamed from: Y */
    public static final t f8504Y;

    /* renamed from: Z */
    public static final u f8505Z;

    /* renamed from: c */
    public static final k f8506c;

    /* renamed from: e */
    public static final p f8507e;

    /* renamed from: m */
    public static final q f8508m;

    /* renamed from: s */
    public static final r f8509s;

    /* renamed from: w1 */
    public static final v f8510w1;

    /* renamed from: x1 */
    public static final w f8511x1;

    /* renamed from: y1 */
    public static final a f8512y1;

    /* renamed from: z1 */
    public static final b f8513z1;

    /* renamed from: s6.c$a */
    public enum a extends EnumC1907c {
        public a() {
            super("InTableText", 9);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (C1686g.m4108c(abstractC1912h.f8560a) == 4) {
                AbstractC1912h.b bVar = (AbstractC1912h.b) abstractC1912h;
                if (bVar.f8561b.equals(EnumC1907c.f8501L1)) {
                    c1906b.m4464k(this);
                    return false;
                }
                c1906b.f8485q.add(bVar.f8561b);
                return true;
            }
            if (c1906b.f8485q.size() > 0) {
                Iterator it = c1906b.f8485q.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (C1806b.m4260d(str)) {
                        AbstractC1912h.b bVar2 = new AbstractC1912h.b();
                        bVar2.f8561b = str;
                        c1906b.m4474u(bVar2);
                    } else {
                        c1906b.m4464k(this);
                        boolean m4258b = C1806b.m4258b(new String[]{"table", "tbody", "tfoot", "thead", "tr"}, c1906b.m4527a().f8340m.f8551b);
                        EnumC1907c enumC1907c = EnumC1907c.f8505Z;
                        if (m4258b) {
                            c1906b.f8488t = true;
                            AbstractC1912h.b bVar3 = new AbstractC1912h.b();
                            bVar3.f8561b = str;
                            c1906b.m4452C(bVar3, enumC1907c);
                            c1906b.f8488t = false;
                        } else {
                            AbstractC1912h.b bVar4 = new AbstractC1912h.b();
                            bVar4.f8561b = str;
                            c1906b.m4452C(bVar4, enumC1907c);
                        }
                    }
                }
                c1906b.f8485q = new ArrayList();
            }
            c1906b.f8479k = c1906b.f8480l;
            return c1906b.mo4460e(abstractC1912h);
        }
    }

    /* renamed from: s6.c$b */
    public enum b extends EnumC1907c {
        public b() {
            super("InCaption", 10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (p134q6.C1806b.m4258b(new java.lang.String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"}, ((p150s6.AbstractC1912h.g) r13).f8570c) == false) goto L18;
         */
        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean mo4482c(p150s6.AbstractC1912h r13, p150s6.C1906b r14) {
            /*
                r12 = this;
                boolean r0 = r13.m4496d()
                r1 = 0
                java.lang.String r2 = "caption"
                if (r0 == 0) goto L3c
                r0 = r13
                s6.h$f r0 = (p150s6.AbstractC1912h.f) r0
                java.lang.String r3 = r0.f8570c
                boolean r3 = r3.equals(r2)
                if (r3 == 0) goto L3c
                java.lang.String r13 = r0.f8570c
                boolean r13 = r14.m4472s(r13)
                if (r13 != 0) goto L20
                r14.m4464k(r12)
                return r1
            L20:
                r6.i r13 = r14.m4527a()
                s6.g r13 = r13.f8340m
                java.lang.String r13 = r13.f8551b
                boolean r13 = r13.equals(r2)
                if (r13 != 0) goto L31
                r14.m4464k(r12)
            L31:
                r14.m4451B(r2)
                r14.m4462i()
                s6.c$w r13 = p150s6.EnumC1907c.f8511x1
                r14.f8479k = r13
                goto L84
            L3c:
                boolean r0 = r13.m4497e()
                if (r0 == 0) goto L63
                r0 = r13
                s6.h$g r0 = (p150s6.AbstractC1912h.g) r0
                java.lang.String r0 = r0.f8570c
                java.lang.String r3 = "caption"
                java.lang.String r4 = "col"
                java.lang.String r5 = "colgroup"
                java.lang.String r6 = "tbody"
                java.lang.String r7 = "td"
                java.lang.String r8 = "tfoot"
                java.lang.String r9 = "th"
                java.lang.String r10 = "thead"
                java.lang.String r11 = "tr"
                java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11}
                boolean r0 = p134q6.C1806b.m4258b(r3, r0)
                if (r0 != 0) goto L76
            L63:
                boolean r0 = r13.m4496d()
                if (r0 == 0) goto L86
                r0 = r13
                s6.h$f r0 = (p150s6.AbstractC1912h.f) r0
                java.lang.String r0 = r0.f8570c
                java.lang.String r3 = "table"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L86
            L76:
                r14.m4464k(r12)
                boolean r0 = r14.m4529f(r2)
                if (r0 == 0) goto L84
                boolean r13 = r14.mo4460e(r13)
                return r13
            L84:
                r13 = 1
                return r13
            L86:
                boolean r0 = r13.m4496d()
                if (r0 == 0) goto Lb3
                r0 = r13
                s6.h$f r0 = (p150s6.AbstractC1912h.f) r0
                java.lang.String r0 = r0.f8570c
                java.lang.String r2 = "body"
                java.lang.String r3 = "col"
                java.lang.String r4 = "colgroup"
                java.lang.String r5 = "html"
                java.lang.String r6 = "tbody"
                java.lang.String r7 = "td"
                java.lang.String r8 = "tfoot"
                java.lang.String r9 = "th"
                java.lang.String r10 = "thead"
                java.lang.String r11 = "tr"
                java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
                boolean r0 = p134q6.C1806b.m4258b(r2, r0)
                if (r0 == 0) goto Lb3
                r14.m4464k(r12)
                return r1
            Lb3:
                s6.c$u r0 = p150s6.EnumC1907c.f8505Z
                boolean r13 = r14.m4452C(r13, r0)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p150s6.EnumC1907c.b.mo4482c(s6.h, s6.b):boolean");
        }
    }

    /* renamed from: s6.c$c */
    public enum c extends EnumC1907c {
        public c() {
            super("InColumnGroup", 11);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (EnumC1907c.m4480a(abstractC1912h)) {
                c1906b.m4474u((AbstractC1912h.b) abstractC1912h);
                return true;
            }
            int m4108c = C1686g.m4108c(abstractC1912h.f8560a);
            if (m4108c == 0) {
                c1906b.m4464k(this);
            } else if (m4108c == 1) {
                AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
                String str = gVar.f8570c;
                str.getClass();
                if (!str.equals("col")) {
                    return !str.equals("html") ? m4483d(abstractC1912h, c1906b) : c1906b.m4452C(abstractC1912h, EnumC1907c.f8505Z);
                }
                c1906b.m4476w(gVar);
            } else if (m4108c != 2) {
                if (m4108c != 3) {
                    if (m4108c != 5) {
                        return m4483d(abstractC1912h, c1906b);
                    }
                    if (c1906b.m4527a().f8340m.f8551b.equals("html")) {
                        return true;
                    }
                    return m4483d(abstractC1912h, c1906b);
                }
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
            } else {
                if (!((AbstractC1912h.f) abstractC1912h).f8570c.equals("colgroup")) {
                    return m4483d(abstractC1912h, c1906b);
                }
                if (c1906b.m4527a().f8340m.f8551b.equals("html")) {
                    c1906b.m4464k(this);
                    return false;
                }
                c1906b.m4450A();
                c1906b.f8479k = EnumC1907c.f8511x1;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean m4483d(AbstractC1912h abstractC1912h, AbstractC1915k abstractC1915k) {
            if (abstractC1915k.m4529f("colgroup")) {
                return abstractC1915k.mo4460e(abstractC1912h);
            }
            return true;
        }
    }

    /* renamed from: s6.c$d */
    public enum d extends EnumC1907c {
        public d() {
            super("InTableBody", 12);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            int m4108c = C1686g.m4108c(abstractC1912h.f8560a);
            EnumC1907c enumC1907c = EnumC1907c.f8511x1;
            if (m4108c == 1) {
                AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
                String str = gVar.f8570c;
                if (str.equals("template")) {
                    c1906b.m4473t(gVar);
                } else {
                    if (!str.equals("tr")) {
                        if (!C1806b.m4258b(new String[]{"th", "td"}, str)) {
                            return C1806b.m4258b(new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"}, str) ? m4484d(abstractC1912h, c1906b) : c1906b.m4452C(abstractC1912h, enumC1907c);
                        }
                        c1906b.m4464k(this);
                        c1906b.m4530g("tr");
                        return c1906b.mo4460e(gVar);
                    }
                    c1906b.m4463j("tbody", "tfoot", "thead", "template");
                    c1906b.m4473t(gVar);
                    c1906b.f8479k = EnumC1907c.f8492C1;
                }
            } else {
                if (m4108c != 2) {
                    return c1906b.m4452C(abstractC1912h, enumC1907c);
                }
                String str2 = ((AbstractC1912h.f) abstractC1912h).f8570c;
                if (!C1806b.m4258b(new String[]{"tbody", "tfoot", "thead"}, str2)) {
                    if (str2.equals("table")) {
                        return m4484d(abstractC1912h, c1906b);
                    }
                    if (!C1806b.m4258b(new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"}, str2)) {
                        return c1906b.m4452C(abstractC1912h, enumC1907c);
                    }
                    c1906b.m4464k(this);
                    return false;
                }
                if (!c1906b.m4472s(str2)) {
                    c1906b.m4464k(this);
                    return false;
                }
                c1906b.m4463j("tbody", "tfoot", "thead", "template");
                c1906b.m4450A();
                c1906b.f8479k = enumC1907c;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean m4484d(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (!c1906b.m4472s("tbody") && !c1906b.m4472s("thead") && !c1906b.m4469p(null, "tfoot")) {
                c1906b.m4464k(this);
                return false;
            }
            c1906b.m4463j("tbody", "tfoot", "thead", "template");
            c1906b.m4529f(c1906b.m4527a().f8340m.f8551b);
            return c1906b.mo4460e(abstractC1912h);
        }
    }

    /* renamed from: s6.c$e */
    public enum e extends EnumC1907c {
        public e() {
            super("InRow", 13);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            boolean m4497e = abstractC1912h.m4497e();
            w wVar = EnumC1907c.f8511x1;
            if (m4497e) {
                AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
                String str = gVar.f8570c;
                if (str.equals("template")) {
                    c1906b.m4473t(gVar);
                    return true;
                }
                if (C1806b.m4258b(new String[]{"th", "td"}, str)) {
                    c1906b.m4463j("tr", "template");
                    c1906b.m4473t(gVar);
                    c1906b.f8479k = EnumC1907c.f8493D1;
                    c1906b.f8484p.add(null);
                    return true;
                }
                if (!C1806b.m4258b(new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"}, str)) {
                    return c1906b.m4452C(abstractC1912h, wVar);
                }
                if (c1906b.m4529f("tr")) {
                    return c1906b.mo4460e(abstractC1912h);
                }
                return false;
            }
            if (!abstractC1912h.m4496d()) {
                return c1906b.m4452C(abstractC1912h, wVar);
            }
            String str2 = ((AbstractC1912h.f) abstractC1912h).f8570c;
            if (str2.equals("tr")) {
                if (!c1906b.m4472s(str2)) {
                    c1906b.m4464k(this);
                    return false;
                }
                c1906b.m4463j("tr", "template");
                c1906b.m4450A();
                c1906b.f8479k = EnumC1907c.f8491B1;
                return true;
            }
            if (str2.equals("table")) {
                if (c1906b.m4529f("tr")) {
                    return c1906b.mo4460e(abstractC1912h);
                }
                return false;
            }
            if (!C1806b.m4258b(new String[]{"tbody", "tfoot", "thead"}, str2)) {
                if (!C1806b.m4258b(new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"}, str2)) {
                    return c1906b.m4452C(abstractC1912h, wVar);
                }
                c1906b.m4464k(this);
                return false;
            }
            if (c1906b.m4472s(str2)) {
                c1906b.m4529f("tr");
                return c1906b.mo4460e(abstractC1912h);
            }
            c1906b.m4464k(this);
            return false;
        }
    }

    /* renamed from: s6.c$f */
    public enum f extends EnumC1907c {
        public f() {
            super("InCell", 14);
        }

        /* renamed from: d */
        public static void m4485d(C1906b c1906b) {
            c1906b.m4529f(c1906b.m4472s("td") ? "td" : "th");
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            boolean m4496d = abstractC1912h.m4496d();
            u uVar = EnumC1907c.f8505Z;
            if (!m4496d) {
                if (abstractC1912h.m4497e()) {
                    if (C1806b.m4259c(x.f8534u, ((AbstractC1912h.g) abstractC1912h).f8570c)) {
                        if (!c1906b.m4472s("td") && !c1906b.m4472s("th")) {
                            c1906b.m4464k(this);
                            return false;
                        }
                    }
                }
                return c1906b.m4452C(abstractC1912h, uVar);
            }
            String str = ((AbstractC1912h.f) abstractC1912h).f8570c;
            if (C1806b.m4259c(x.f8531r, str)) {
                boolean m4472s = c1906b.m4472s(str);
                e eVar = EnumC1907c.f8492C1;
                if (!m4472s) {
                    c1906b.m4464k(this);
                    c1906b.f8479k = eVar;
                    return false;
                }
                if (!c1906b.m4527a().f8340m.f8551b.equals(str)) {
                    c1906b.m4464k(this);
                }
                c1906b.m4451B(str);
                c1906b.m4462i();
                c1906b.f8479k = eVar;
                return true;
            }
            if (C1806b.m4259c(x.f8532s, str)) {
                c1906b.m4464k(this);
                return false;
            }
            if (!C1806b.m4259c(x.f8533t, str)) {
                return c1906b.m4452C(abstractC1912h, uVar);
            }
            if (!c1906b.m4472s(str)) {
                c1906b.m4464k(this);
                return false;
            }
            m4485d(c1906b);
            return c1906b.mo4460e(abstractC1912h);
        }
    }

    /* renamed from: s6.c$g */
    public enum g extends EnumC1907c {
        public g() {
            super("InSelect", 15);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        
            if (r11.m4527a().f8340m.f8551b.equals("html") == false) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ef, code lost:
        
            r11.m4464k(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
        
            if (r11.m4527a().f8340m.f8551b.equals("optgroup") != false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
        
            r11.m4450A();
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
        
            if (r11.m4527a().f8340m.f8551b.equals("option") != false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0117, code lost:
        
            if (r11.m4527a().f8340m.f8551b.equals("option") != false) goto L76;
         */
        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean mo4482c(p150s6.AbstractC1912h r10, p150s6.C1906b r11) {
            /*
                Method dump skipped, instructions count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p150s6.EnumC1907c.g.mo4482c(s6.h, s6.b):boolean");
        }
    }

    /* renamed from: s6.c$h */
    public enum h extends EnumC1907c {
        public h() {
            super("InSelectInTable", 16);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (abstractC1912h.m4497e()) {
                if (C1806b.m4258b(new String[]{"caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th"}, ((AbstractC1912h.g) abstractC1912h).f8570c)) {
                    c1906b.m4464k(this);
                    c1906b.m4529f("select");
                    return c1906b.mo4460e(abstractC1912h);
                }
            }
            if (abstractC1912h.m4496d()) {
                AbstractC1912h.f fVar = (AbstractC1912h.f) abstractC1912h;
                if (C1806b.m4258b(new String[]{"caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th"}, fVar.f8570c)) {
                    c1906b.m4464k(this);
                    if (!c1906b.m4472s(fVar.f8570c)) {
                        return false;
                    }
                    c1906b.m4529f("select");
                    return c1906b.mo4460e(abstractC1912h);
                }
            }
            return c1906b.m4452C(abstractC1912h, EnumC1907c.f8494E1);
        }
    }

    /* renamed from: s6.c$i */
    public enum i extends EnumC1907c {
        public i() {
            super("AfterBody", 17);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            boolean m4480a = EnumC1907c.m4480a(abstractC1912h);
            u uVar = EnumC1907c.f8505Z;
            if (m4480a) {
                return c1906b.m4452C(abstractC1912h, uVar);
            }
            if (abstractC1912h.m4493a()) {
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
                return true;
            }
            if (abstractC1912h.m4494b()) {
                c1906b.m4464k(this);
                return false;
            }
            if (abstractC1912h.m4497e() && ((AbstractC1912h.g) abstractC1912h).f8570c.equals("html")) {
                return c1906b.m4452C(abstractC1912h, uVar);
            }
            if (abstractC1912h.m4496d() && ((AbstractC1912h.f) abstractC1912h).f8570c.equals("html")) {
                c1906b.getClass();
                c1906b.f8479k = EnumC1907c.f8499J1;
                return true;
            }
            if (abstractC1912h.m4495c()) {
                return true;
            }
            c1906b.m4464k(this);
            c1906b.f8479k = uVar;
            return c1906b.mo4460e(abstractC1912h);
        }
    }

    /* renamed from: s6.c$j */
    public enum j extends EnumC1907c {
        public j() {
            super("InFrameset", 18);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            AbstractC1912h.g gVar;
            EnumC1907c enumC1907c;
            if (EnumC1907c.m4480a(abstractC1912h)) {
                c1906b.m4474u((AbstractC1912h.b) abstractC1912h);
            } else if (abstractC1912h.m4493a()) {
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
            } else {
                if (abstractC1912h.m4494b()) {
                    c1906b.m4464k(this);
                    return false;
                }
                if (abstractC1912h.m4497e()) {
                    gVar = (AbstractC1912h.g) abstractC1912h;
                    String str = gVar.f8570c;
                    str.getClass();
                    switch (str) {
                        case "frameset":
                            c1906b.m4473t(gVar);
                            break;
                        case "html":
                            enumC1907c = EnumC1907c.f8505Z;
                            break;
                        case "frame":
                            c1906b.m4476w(gVar);
                            break;
                        case "noframes":
                            enumC1907c = EnumC1907c.f8509s;
                            break;
                        default:
                            c1906b.m4464k(this);
                            break;
                    }
                    return false;
                }
                if (abstractC1912h.m4496d() && ((AbstractC1912h.f) abstractC1912h).f8570c.equals("frameset")) {
                    if (c1906b.m4527a().f8340m.f8551b.equals("html")) {
                        c1906b.m4464k(this);
                        return false;
                    }
                    c1906b.m4450A();
                    if (!c1906b.m4527a().f8340m.f8551b.equals("frameset")) {
                        c1906b.f8479k = EnumC1907c.f8498I1;
                    }
                } else {
                    if (!abstractC1912h.m4495c()) {
                        c1906b.m4464k(this);
                        return false;
                    }
                    if (!c1906b.m4527a().f8340m.f8551b.equals("html")) {
                        c1906b.m4464k(this);
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: s6.c$k */
    public enum k extends EnumC1907c {
        public k() {
            super("Initial", 0);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (EnumC1907c.m4480a(abstractC1912h)) {
                return true;
            }
            if (abstractC1912h.m4493a()) {
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
            } else {
                boolean m4494b = abstractC1912h.m4494b();
                p pVar = EnumC1907c.f8507e;
                if (!m4494b) {
                    c1906b.f8479k = pVar;
                    return c1906b.mo4460e(abstractC1912h);
                }
                AbstractC1912h.d dVar = (AbstractC1912h.d) abstractC1912h;
                C1851h c1851h = new C1851h(c1906b.f8677h.m4490a(dVar.f8564b.toString()), dVar.f8566d.toString(), dVar.f8567e.toString());
                String str = dVar.f8565c;
                if (str != null) {
                    c1851h.mo4382d("pubSysKey", str);
                }
                c1906b.f8673d.m4372v(c1851h);
                if (dVar.f8568f) {
                    c1906b.f8673d.f8328z1 = 2;
                }
                c1906b.f8479k = pVar;
            }
            return true;
        }
    }

    /* renamed from: s6.c$l */
    public enum l extends EnumC1907c {
        public l() {
            super("AfterFrameset", 19);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            EnumC1907c enumC1907c;
            if (EnumC1907c.m4480a(abstractC1912h)) {
                c1906b.m4474u((AbstractC1912h.b) abstractC1912h);
                return true;
            }
            if (abstractC1912h.m4493a()) {
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
                return true;
            }
            if (abstractC1912h.m4494b()) {
                c1906b.m4464k(this);
                return false;
            }
            if (abstractC1912h.m4497e() && ((AbstractC1912h.g) abstractC1912h).f8570c.equals("html")) {
                enumC1907c = EnumC1907c.f8505Z;
            } else {
                if (abstractC1912h.m4496d() && ((AbstractC1912h.f) abstractC1912h).f8570c.equals("html")) {
                    c1906b.f8479k = EnumC1907c.f8500K1;
                    return true;
                }
                if (!abstractC1912h.m4497e() || !((AbstractC1912h.g) abstractC1912h).f8570c.equals("noframes")) {
                    if (abstractC1912h.m4495c()) {
                        return true;
                    }
                    c1906b.m4464k(this);
                    return false;
                }
                enumC1907c = EnumC1907c.f8509s;
            }
            return c1906b.m4452C(abstractC1912h, enumC1907c);
        }
    }

    /* renamed from: s6.c$m */
    public enum m extends EnumC1907c {
        public m() {
            super("AfterAfterBody", 20);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (abstractC1912h.m4493a()) {
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
                return true;
            }
            boolean m4494b = abstractC1912h.m4494b();
            u uVar = EnumC1907c.f8505Z;
            if (m4494b || EnumC1907c.m4480a(abstractC1912h) || (abstractC1912h.m4497e() && ((AbstractC1912h.g) abstractC1912h).f8570c.equals("html"))) {
                return c1906b.m4452C(abstractC1912h, uVar);
            }
            if (abstractC1912h.m4495c()) {
                return true;
            }
            c1906b.m4464k(this);
            c1906b.f8479k = uVar;
            return c1906b.mo4460e(abstractC1912h);
        }
    }

    /* renamed from: s6.c$n */
    public enum n extends EnumC1907c {
        public n() {
            super("AfterAfterFrameset", 21);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (abstractC1912h.m4493a()) {
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
                return true;
            }
            if (abstractC1912h.m4494b() || EnumC1907c.m4480a(abstractC1912h) || (abstractC1912h.m4497e() && ((AbstractC1912h.g) abstractC1912h).f8570c.equals("html"))) {
                return c1906b.m4452C(abstractC1912h, EnumC1907c.f8505Z);
            }
            if (abstractC1912h.m4495c()) {
                return true;
            }
            if (abstractC1912h.m4497e() && ((AbstractC1912h.g) abstractC1912h).f8570c.equals("noframes")) {
                return c1906b.m4452C(abstractC1912h, EnumC1907c.f8509s);
            }
            c1906b.m4464k(this);
            return false;
        }
    }

    /* renamed from: s6.c$p */
    public enum p extends EnumC1907c {
        public p() {
            super("BeforeHtml", 1);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (abstractC1912h.m4494b()) {
                c1906b.m4464k(this);
                return false;
            }
            if (!abstractC1912h.m4493a()) {
                if (EnumC1907c.m4480a(abstractC1912h)) {
                    return true;
                }
                boolean m4497e = abstractC1912h.m4497e();
                q qVar = EnumC1907c.f8508m;
                if (m4497e) {
                    AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
                    if (gVar.f8570c.equals("html")) {
                        c1906b.m4473t(gVar);
                        c1906b.f8479k = qVar;
                    }
                }
                if (abstractC1912h.m4496d()) {
                    if (C1806b.m4258b(new String[]{"head", "body", "html", "br"}, ((AbstractC1912h.f) abstractC1912h).f8570c)) {
                        c1906b.getClass();
                        C1852i c1852i = new C1852i(C1911g.m4491a("html", c1906b.f8677h), c1906b.f8675f, null);
                        c1906b.m4479z(c1852i);
                        c1906b.f8674e.add(c1852i);
                        c1906b.f8479k = qVar;
                        return c1906b.mo4460e(abstractC1912h);
                    }
                }
                if (abstractC1912h.m4496d()) {
                    c1906b.m4464k(this);
                    return false;
                }
                c1906b.getClass();
                C1852i c1852i2 = new C1852i(C1911g.m4491a("html", c1906b.f8677h), c1906b.f8675f, null);
                c1906b.m4479z(c1852i2);
                c1906b.f8674e.add(c1852i2);
                c1906b.f8479k = qVar;
                return c1906b.mo4460e(abstractC1912h);
            }
            c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
            return true;
        }
    }

    /* renamed from: s6.c$q */
    public enum q extends EnumC1907c {
        public q() {
            super("BeforeHead", 2);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (EnumC1907c.m4480a(abstractC1912h)) {
                return true;
            }
            if (!abstractC1912h.m4493a()) {
                if (abstractC1912h.m4494b()) {
                    c1906b.m4464k(this);
                    return false;
                }
                if (abstractC1912h.m4497e() && ((AbstractC1912h.g) abstractC1912h).f8570c.equals("html")) {
                    return EnumC1907c.f8505Z.mo4482c(abstractC1912h, c1906b);
                }
                if (abstractC1912h.m4497e()) {
                    AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
                    if (gVar.f8570c.equals("head")) {
                        c1906b.f8482n = c1906b.m4473t(gVar);
                        c1906b.f8479k = EnumC1907c.f8509s;
                    }
                }
                if (abstractC1912h.m4496d()) {
                    if (C1806b.m4258b(new String[]{"head", "body", "html", "br"}, ((AbstractC1912h.f) abstractC1912h).f8570c)) {
                        c1906b.m4530g("head");
                        return c1906b.mo4460e(abstractC1912h);
                    }
                }
                if (abstractC1912h.m4496d()) {
                    c1906b.m4464k(this);
                    return false;
                }
                c1906b.m4530g("head");
                return c1906b.mo4460e(abstractC1912h);
            }
            c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
            return true;
        }
    }

    /* renamed from: s6.c$r */
    public enum r extends EnumC1907c {
        public r() {
            super("InHead", 3);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            EnumC1907c enumC1907c;
            if (EnumC1907c.m4480a(abstractC1912h)) {
                c1906b.m4474u((AbstractC1912h.b) abstractC1912h);
                return true;
            }
            int m4108c = C1686g.m4108c(abstractC1912h.f8560a);
            if (m4108c == 0) {
                c1906b.m4464k(this);
                return false;
            }
            if (m4108c == 1) {
                AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
                String str = gVar.f8570c;
                if (str.equals("html")) {
                    return EnumC1907c.f8505Z.mo4482c(abstractC1912h, c1906b);
                }
                if (C1806b.m4258b(new String[]{"base", "basefont", "bgsound", "command", "link"}, str)) {
                    C1852i m4476w = c1906b.m4476w(gVar);
                    if (str.equals("base") && m4476w.mo4383l("href") && !c1906b.f8481m) {
                        String mo4380a = m4476w.mo4380a("href");
                        if (mo4380a.length() != 0) {
                            c1906b.f8675f = mo4380a;
                            c1906b.f8481m = true;
                            C1850g c1850g = c1906b.f8673d;
                            c1850g.getClass();
                            AbstractC1856m abstractC1856m = c1850g;
                            int i7 = 0;
                            while (abstractC1856m != null) {
                                abstractC1856m.mo4369j(mo4380a);
                                if (abstractC1856m.mo4367g() > 0) {
                                    abstractC1856m = abstractC1856m.mo4370k().get(0);
                                    i7++;
                                } else {
                                    while (abstractC1856m.m4388o() == null && i7 > 0) {
                                        abstractC1856m = abstractC1856m.f8357c;
                                        i7--;
                                    }
                                    if (abstractC1856m == c1850g) {
                                        break;
                                    }
                                    abstractC1856m = abstractC1856m.m4388o();
                                }
                            }
                        }
                    }
                } else if (str.equals("meta")) {
                    c1906b.m4476w(gVar);
                } else {
                    boolean equals = str.equals("title");
                    v vVar = EnumC1907c.f8510w1;
                    if (equals) {
                        c1906b.f8672c.f8582c = EnumC1914j.f8650m;
                        c1906b.f8480l = c1906b.f8479k;
                        c1906b.f8479k = vVar;
                        c1906b.m4473t(gVar);
                    } else if (C1806b.m4258b(new String[]{"noframes", "style"}, str)) {
                        EnumC1907c.m4481b(gVar, c1906b);
                    } else if (str.equals("noscript")) {
                        c1906b.m4473t(gVar);
                        enumC1907c = EnumC1907c.f8503X;
                        c1906b.f8479k = enumC1907c;
                    } else {
                        if (!str.equals("script")) {
                            if (str.equals("head")) {
                                c1906b.m4464k(this);
                                return false;
                            }
                            c1906b.m4529f("head");
                            return c1906b.mo4460e(abstractC1912h);
                        }
                        c1906b.f8672c.f8582c = EnumC1914j.f8632Y;
                        c1906b.f8480l = c1906b.f8479k;
                        c1906b.f8479k = vVar;
                        c1906b.m4473t(gVar);
                    }
                }
            } else if (m4108c == 2) {
                String str2 = ((AbstractC1912h.f) abstractC1912h).f8570c;
                if (!str2.equals("head")) {
                    if (C1806b.m4258b(new String[]{"body", "html", "br"}, str2)) {
                        c1906b.m4529f("head");
                        return c1906b.mo4460e(abstractC1912h);
                    }
                    c1906b.m4464k(this);
                    return false;
                }
                c1906b.m4450A();
                enumC1907c = EnumC1907c.f8504Y;
                c1906b.f8479k = enumC1907c;
            } else {
                if (m4108c != 3) {
                    c1906b.m4529f("head");
                    return c1906b.mo4460e(abstractC1912h);
                }
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
            }
            return true;
        }
    }

    /* renamed from: s6.c$s */
    public enum s extends EnumC1907c {
        public s() {
            super("InHeadNoscript", 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if (p134q6.C1806b.m4258b(new java.lang.String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"}, ((p150s6.AbstractC1912h.g) r11).f8570c) != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        
            if (p134q6.C1806b.m4258b(new java.lang.String[]{"head", "noscript"}, ((p150s6.AbstractC1912h.g) r11).f8570c) == false) goto L36;
         */
        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean mo4482c(p150s6.AbstractC1912h r11, p150s6.C1906b r12) {
            /*
                r10 = this;
                boolean r0 = r11.m4494b()
                r1 = 1
                if (r0 == 0) goto Lb
                r12.m4464k(r10)
                goto L3f
            Lb:
                boolean r0 = r11.m4497e()
                if (r0 == 0) goto L25
                r0 = r11
                s6.h$g r0 = (p150s6.AbstractC1912h.g) r0
                java.lang.String r0 = r0.f8570c
                java.lang.String r2 = "html"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L25
                s6.c$u r0 = p150s6.EnumC1907c.f8505Z
                boolean r11 = r12.m4452C(r11, r0)
                return r11
            L25:
                boolean r0 = r11.m4496d()
                s6.c$r r2 = p150s6.EnumC1907c.f8509s
                java.lang.String r3 = "noscript"
                if (r0 == 0) goto L40
                r0 = r11
                s6.h$f r0 = (p150s6.AbstractC1912h.f) r0
                java.lang.String r0 = r0.f8570c
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L40
                r12.m4450A()
                r12.f8479k = r2
            L3f:
                return r1
            L40:
                boolean r0 = p150s6.EnumC1907c.m4480a(r11)
                if (r0 != 0) goto Lc7
                boolean r0 = r11.m4493a()
                if (r0 != 0) goto Lc7
                boolean r0 = r11.m4497e()
                if (r0 == 0) goto L6e
                r0 = r11
                s6.h$g r0 = (p150s6.AbstractC1912h.g) r0
                java.lang.String r0 = r0.f8570c
                java.lang.String r4 = "basefont"
                java.lang.String r5 = "bgsound"
                java.lang.String r6 = "link"
                java.lang.String r7 = "meta"
                java.lang.String r8 = "noframes"
                java.lang.String r9 = "style"
                java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
                boolean r0 = p134q6.C1806b.m4258b(r4, r0)
                if (r0 == 0) goto L6e
                goto Lc7
            L6e:
                boolean r0 = r11.m4496d()
                if (r0 == 0) goto L93
                r0 = r11
                s6.h$f r0 = (p150s6.AbstractC1912h.f) r0
                java.lang.String r0 = r0.f8570c
                java.lang.String r2 = "br"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L93
                r12.m4464k(r10)
                s6.h$b r0 = new s6.h$b
                r0.<init>()
                java.lang.String r11 = r11.toString()
                r0.f8561b = r11
                r12.m4474u(r0)
                return r1
            L93:
                boolean r0 = r11.m4497e()
                if (r0 == 0) goto Laa
                r0 = r11
                s6.h$g r0 = (p150s6.AbstractC1912h.g) r0
                java.lang.String r0 = r0.f8570c
                java.lang.String r2 = "head"
                java.lang.String[] r2 = new java.lang.String[]{r2, r3}
                boolean r0 = p134q6.C1806b.m4258b(r2, r0)
                if (r0 != 0) goto Lb0
            Laa:
                boolean r0 = r11.m4496d()
                if (r0 == 0) goto Lb5
            Lb0:
                r12.m4464k(r10)
                r11 = 0
                return r11
            Lb5:
                r12.m4464k(r10)
                s6.h$b r0 = new s6.h$b
                r0.<init>()
                java.lang.String r11 = r11.toString()
                r0.f8561b = r11
                r12.m4474u(r0)
                return r1
            Lc7:
                boolean r11 = r12.m4452C(r11, r2)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p150s6.EnumC1907c.s.mo4482c(s6.h, s6.b):boolean");
        }
    }

    /* renamed from: s6.c$t */
    public enum t extends EnumC1907c {
        public t() {
            super("AfterHead", 5);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (EnumC1907c.m4480a(abstractC1912h)) {
                c1906b.m4474u((AbstractC1912h.b) abstractC1912h);
                return true;
            }
            if (abstractC1912h.m4493a()) {
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
                return true;
            }
            if (abstractC1912h.m4494b()) {
                c1906b.m4464k(this);
                return true;
            }
            if (abstractC1912h.m4497e()) {
                AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
                String str = gVar.f8570c;
                boolean equals = str.equals("html");
                u uVar = EnumC1907c.f8505Z;
                if (equals) {
                    return c1906b.m4452C(abstractC1912h, uVar);
                }
                if (str.equals("body")) {
                    c1906b.m4473t(gVar);
                    c1906b.f8487s = false;
                    c1906b.f8479k = uVar;
                    return true;
                }
                if (str.equals("frameset")) {
                    c1906b.m4473t(gVar);
                    c1906b.f8479k = EnumC1907c.f8497H1;
                    return true;
                }
                if (C1806b.m4258b(new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title"}, str)) {
                    c1906b.m4464k(this);
                    C1852i c1852i = c1906b.f8482n;
                    c1906b.f8674e.add(c1852i);
                    c1906b.m4452C(abstractC1912h, EnumC1907c.f8509s);
                    c1906b.m4456G(c1852i);
                    return true;
                }
                if (str.equals("head")) {
                    c1906b.m4464k(this);
                    return false;
                }
            } else if (abstractC1912h.m4496d()) {
                if (!C1806b.m4258b(new String[]{"body", "html"}, ((AbstractC1912h.f) abstractC1912h).f8570c)) {
                    c1906b.m4464k(this);
                    return false;
                }
            }
            m4486d(abstractC1912h, c1906b);
            return true;
        }

        /* renamed from: d */
        public final boolean m4486d(AbstractC1912h abstractC1912h, C1906b c1906b) {
            c1906b.m4530g("body");
            c1906b.f8487s = true;
            return c1906b.mo4460e(abstractC1912h);
        }
    }

    /* renamed from: s6.c$u */
    public enum u extends EnumC1907c {
        public u() {
            super("InBody", 6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:156:0x0258, code lost:
        
            if (r22.m4527a().f8340m.f8551b.equals(r7) == false) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x025a, code lost:
        
            r22.m4464k(r20);
         */
        /* JADX WARN: Code restructure failed: missing block: B:158:0x025d, code lost:
        
            r22.m4451B(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:170:0x028f, code lost:
        
            if (r22.m4527a().f8340m.f8551b.equals(r7) == false) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:204:0x0310, code lost:
        
            if (r22.m4527a().f8340m.f8551b.equals(r7) == false) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:212:0x0335, code lost:
        
            if (r22.m4527a().f8340m.f8551b.equals(r7) == false) goto L133;
         */
        /* JADX WARN: Code restructure failed: missing block: B:267:0x042e, code lost:
        
            if (r22.m4468o("p") != false) goto L250;
         */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x0430, code lost:
        
            r22.m4529f("p");
         */
        /* JADX WARN: Code restructure failed: missing block: B:285:0x0488, code lost:
        
            if (r22.m4468o("p") != false) goto L250;
         */
        /* JADX WARN: Code restructure failed: missing block: B:400:0x0650, code lost:
        
            if (r22.m4468o("p") != false) goto L250;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01a0  */
        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean mo4482c(p150s6.AbstractC1912h r21, p150s6.C1906b r22) {
            /*
                Method dump skipped, instructions count: 2343
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p150s6.EnumC1907c.u.mo4482c(s6.h, s6.b):boolean");
        }

        /* renamed from: d */
        public final boolean m4487d(AbstractC1912h abstractC1912h, C1906b c1906b) {
            abstractC1912h.getClass();
            String str = ((AbstractC1912h.f) abstractC1912h).f8570c;
            ArrayList<C1852i> arrayList = c1906b.f8674e;
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C1852i c1852i = arrayList.get(size);
                if (c1852i.f8340m.f8551b.equals(str)) {
                    c1906b.m4465l(str);
                    if (!str.equals(c1906b.m4527a().f8340m.f8551b)) {
                        c1906b.m4464k(this);
                    }
                    c1906b.m4451B(str);
                } else {
                    if (C1806b.m4259c(C1906b.f8473B, c1852i.f8340m.f8551b)) {
                        c1906b.m4464k(this);
                        return false;
                    }
                    size--;
                }
            }
            return true;
        }
    }

    /* renamed from: s6.c$v */
    public enum v extends EnumC1907c {
        public v() {
            super("Text", 7);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            if (abstractC1912h.f8560a == 5) {
                c1906b.m4474u((AbstractC1912h.b) abstractC1912h);
            } else {
                if (abstractC1912h.m4495c()) {
                    c1906b.m4464k(this);
                    c1906b.m4450A();
                    c1906b.f8479k = c1906b.f8480l;
                    return c1906b.mo4460e(abstractC1912h);
                }
                if (abstractC1912h.m4496d()) {
                    c1906b.m4450A();
                    c1906b.f8479k = c1906b.f8480l;
                }
            }
            return true;
        }
    }

    /* renamed from: s6.c$w */
    public enum w extends EnumC1907c {
        public w() {
            super("InTable", 8);
        }

        @Override // p150s6.EnumC1907c
        /* renamed from: c */
        public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
            EnumC1907c enumC1907c;
            if (abstractC1912h.f8560a == 5) {
                c1906b.getClass();
                c1906b.f8485q = new ArrayList();
                c1906b.f8480l = c1906b.f8479k;
                c1906b.f8479k = EnumC1907c.f8512y1;
                return c1906b.mo4460e(abstractC1912h);
            }
            if (abstractC1912h.m4493a()) {
                c1906b.m4475v((AbstractC1912h.c) abstractC1912h);
                return true;
            }
            if (abstractC1912h.m4494b()) {
                c1906b.m4464k(this);
                return false;
            }
            if (!abstractC1912h.m4497e()) {
                if (!abstractC1912h.m4496d()) {
                    if (!abstractC1912h.m4495c()) {
                        return m4488d(abstractC1912h, c1906b);
                    }
                    if (c1906b.m4527a().f8340m.f8551b.equals("html")) {
                        c1906b.m4464k(this);
                    }
                    return true;
                }
                String str = ((AbstractC1912h.f) abstractC1912h).f8570c;
                if (!str.equals("table")) {
                    if (!C1806b.m4258b(new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"}, str)) {
                        return m4488d(abstractC1912h, c1906b);
                    }
                    c1906b.m4464k(this);
                    return false;
                }
                if (!c1906b.m4472s(str)) {
                    c1906b.m4464k(this);
                    return false;
                }
                c1906b.m4451B("table");
                c1906b.m4457H();
                return true;
            }
            AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
            String str2 = gVar.f8570c;
            if (str2.equals("caption")) {
                c1906b.m4463j("table");
                c1906b.f8484p.add(null);
                c1906b.m4473t(gVar);
                enumC1907c = EnumC1907c.f8513z1;
            } else if (str2.equals("colgroup")) {
                c1906b.m4463j("table");
                c1906b.m4473t(gVar);
                enumC1907c = EnumC1907c.f8490A1;
            } else {
                if (str2.equals("col")) {
                    c1906b.m4530g("colgroup");
                    return c1906b.mo4460e(abstractC1912h);
                }
                if (!C1806b.m4258b(new String[]{"tbody", "tfoot", "thead"}, str2)) {
                    if (C1806b.m4258b(new String[]{"td", "th", "tr"}, str2)) {
                        c1906b.m4530g("tbody");
                        return c1906b.mo4460e(abstractC1912h);
                    }
                    if (str2.equals("table")) {
                        c1906b.m4464k(this);
                        if (c1906b.m4529f("table")) {
                            return c1906b.mo4460e(abstractC1912h);
                        }
                    } else {
                        if (C1806b.m4258b(new String[]{"style", "script"}, str2)) {
                            return c1906b.m4452C(abstractC1912h, EnumC1907c.f8509s);
                        }
                        if (str2.equals("input")) {
                            if (!gVar.f8577j.m4338d("type").equalsIgnoreCase("hidden")) {
                                return m4488d(abstractC1912h, c1906b);
                            }
                            c1906b.m4476w(gVar);
                        } else {
                            if (!str2.equals("form")) {
                                return m4488d(abstractC1912h, c1906b);
                            }
                            c1906b.m4464k(this);
                            if (c1906b.f8483o != null) {
                                return false;
                            }
                            c1906b.m4477x(gVar, false);
                        }
                    }
                    return true;
                }
                c1906b.m4463j("table");
                c1906b.m4473t(gVar);
                enumC1907c = EnumC1907c.f8491B1;
            }
            c1906b.f8479k = enumC1907c;
            return true;
        }

        /* renamed from: d */
        public final boolean m4488d(AbstractC1912h abstractC1912h, C1906b c1906b) {
            c1906b.m4464k(this);
            boolean m4258b = C1806b.m4258b(new String[]{"table", "tbody", "tfoot", "thead", "tr"}, c1906b.m4527a().f8340m.f8551b);
            u uVar = EnumC1907c.f8505Z;
            if (!m4258b) {
                return c1906b.m4452C(abstractC1912h, uVar);
            }
            c1906b.f8488t = true;
            boolean m4452C = c1906b.m4452C(abstractC1912h, uVar);
            c1906b.f8488t = false;
            return m4452C;
        }
    }

    /* renamed from: s6.c$x */
    public static final class x {

        /* renamed from: a */
        public static final String[] f8514a = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};

        /* renamed from: b */
        public static final String[] f8515b = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};

        /* renamed from: c */
        public static final String[] f8516c = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* renamed from: d */
        public static final String[] f8517d = {"listing", "pre"};

        /* renamed from: e */
        public static final String[] f8518e = {"address", "div", "p"};

        /* renamed from: f */
        public static final String[] f8519f = {"dd", "dt"};

        /* renamed from: g */
        public static final String[] f8520g = {"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};

        /* renamed from: h */
        public static final String[] f8521h = {"applet", "marquee", "object"};

        /* renamed from: i */
        public static final String[] f8522i = {"area", "br", "embed", "img", "keygen", "wbr"};

        /* renamed from: j */
        public static final String[] f8523j = {"param", "source", "track"};

        /* renamed from: k */
        public static final String[] f8524k = {"action", "name", "prompt"};

        /* renamed from: l */
        public static final String[] f8525l = {"optgroup", "option"};

        /* renamed from: m */
        public static final String[] f8526m = {"rp", "rt"};

        /* renamed from: n */
        public static final String[] f8527n = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: o */
        public static final String[] f8528o = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};

        /* renamed from: p */
        public static final String[] f8529p = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};

        /* renamed from: q */
        public static final String[] f8530q = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: r */
        public static final String[] f8531r = {"td", "th"};

        /* renamed from: s */
        public static final String[] f8532s = {"body", "caption", "col", "colgroup", "html"};

        /* renamed from: t */
        public static final String[] f8533t = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: u */
        public static final String[] f8534u = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    }

    static {
        k kVar = new k();
        f8506c = kVar;
        p pVar = new p();
        f8507e = pVar;
        q qVar = new q();
        f8508m = qVar;
        r rVar = new r();
        f8509s = rVar;
        s sVar = new s();
        f8503X = sVar;
        t tVar = new t();
        f8504Y = tVar;
        u uVar = new u();
        f8505Z = uVar;
        v vVar = new v();
        f8510w1 = vVar;
        w wVar = new w();
        f8511x1 = wVar;
        a aVar = new a();
        f8512y1 = aVar;
        b bVar = new b();
        f8513z1 = bVar;
        c cVar = new c();
        f8490A1 = cVar;
        d dVar = new d();
        f8491B1 = dVar;
        e eVar = new e();
        f8492C1 = eVar;
        f fVar = new f();
        f8493D1 = fVar;
        g gVar = new g();
        f8494E1 = gVar;
        h hVar = new h();
        f8495F1 = hVar;
        i iVar = new i();
        f8496G1 = iVar;
        j jVar = new j();
        f8497H1 = jVar;
        l lVar = new l();
        f8498I1 = lVar;
        m mVar = new m();
        f8499J1 = mVar;
        n nVar = new n();
        f8500K1 = nVar;
        f8502M1 = new EnumC1907c[]{kVar, pVar, qVar, rVar, sVar, tVar, uVar, vVar, wVar, aVar, bVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, lVar, mVar, nVar, new EnumC1907c() { // from class: s6.c.o
            @Override // p150s6.EnumC1907c
            /* renamed from: c */
            public final boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b) {
                return true;
            }
        }};
        f8501L1 = String.valueOf((char) 0);
    }

    public EnumC1907c(String str, int i7) {
    }

    /* renamed from: a */
    public static boolean m4480a(AbstractC1912h abstractC1912h) {
        if (abstractC1912h.f8560a == 5) {
            return C1806b.m4260d(((AbstractC1912h.b) abstractC1912h).f8561b);
        }
        return false;
    }

    /* renamed from: b */
    public static void m4481b(AbstractC1912h.g gVar, C1906b c1906b) {
        c1906b.f8672c.f8582c = EnumC1914j.f8630X;
        c1906b.f8480l = c1906b.f8479k;
        c1906b.f8479k = f8510w1;
        c1906b.m4473t(gVar);
    }

    public static EnumC1907c valueOf(String str) {
        return (EnumC1907c) Enum.valueOf(EnumC1907c.class, str);
    }

    public static EnumC1907c[] values() {
        return (EnumC1907c[]) f8502M1.clone();
    }

    /* renamed from: c */
    public abstract boolean mo4482c(AbstractC1912h abstractC1912h, C1906b c1906b);
}
