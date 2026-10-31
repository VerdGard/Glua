package p150s6;

import androidx.activity.C0143v;
import java.io.Reader;
import java.util.ArrayList;
import p134q6.C1806b;
import p140r4.C1834b;
import p142r6.C1845b;
import p142r6.C1847d;
import p142r6.C1848e;
import p142r6.C1849f;
import p142r6.C1852i;
import p142r6.C1854k;
import p142r6.C1859p;
import p150s6.AbstractC1912h;

/* renamed from: s6.b */
/* loaded from: classes.dex */
public final class C1906b extends AbstractC1915k {

    /* renamed from: k */
    public EnumC1907c f8479k;

    /* renamed from: l */
    public EnumC1907c f8480l;

    /* renamed from: m */
    public boolean f8481m;

    /* renamed from: n */
    public C1852i f8482n;

    /* renamed from: o */
    public C1854k f8483o;

    /* renamed from: p */
    public ArrayList<C1852i> f8484p;

    /* renamed from: q */
    public ArrayList f8485q;

    /* renamed from: r */
    public AbstractC1912h.f f8486r;

    /* renamed from: s */
    public boolean f8487s;

    /* renamed from: t */
    public boolean f8488t;

    /* renamed from: u */
    public final String[] f8489u = {null};

    /* renamed from: v */
    public static final String[] f8474v = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* renamed from: w */
    public static final String[] f8475w = {"ol", "ul"};

    /* renamed from: x */
    public static final String[] f8476x = {"button"};

    /* renamed from: y */
    public static final String[] f8477y = {"html", "table"};

    /* renamed from: z */
    public static final String[] f8478z = {"optgroup", "option"};

    /* renamed from: A */
    public static final String[] f8472A = {"dd", "dt", "li", "optgroup", "option", "p", "rp", "rt"};

    /* renamed from: B */
    public static final String[] f8473B = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    /* renamed from: A */
    public final void m4450A() {
        this.f8674e.remove(this.f8674e.size() - 1);
    }

    /* renamed from: B */
    public final void m4451B(String str) {
        for (int size = this.f8674e.size() - 1; size >= 0; size--) {
            C1852i c1852i = this.f8674e.get(size);
            this.f8674e.remove(size);
            if (c1852i.f8340m.f8551b.equals(str)) {
                return;
            }
        }
    }

    /* renamed from: C */
    public final boolean m4452C(AbstractC1912h abstractC1912h, EnumC1907c enumC1907c) {
        this.f8676g = abstractC1912h;
        return enumC1907c.mo4482c(abstractC1912h, this);
    }

    /* renamed from: D */
    public final void m4453D(C1852i c1852i) {
        int size = this.f8484p.size() - 1;
        int i7 = 0;
        while (true) {
            if (size >= 0) {
                C1852i c1852i2 = this.f8484p.get(size);
                if (c1852i2 == null) {
                    break;
                }
                if (c1852i.f8340m.f8551b.equals(c1852i2.f8340m.f8551b) && c1852i.mo4365e().equals(c1852i2.mo4365e())) {
                    i7++;
                }
                if (i7 == 3) {
                    this.f8484p.remove(size);
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.f8484p.add(c1852i);
    }

    /* renamed from: E */
    public final void m4454E() {
        C1852i c1852i;
        boolean z6;
        C1906b c1906b;
        boolean z7;
        if (this.f8484p.size() > 0) {
            c1852i = this.f8484p.get(r0.size() - 1);
        } else {
            c1852i = null;
        }
        if (c1852i == null) {
            return;
        }
        ArrayList<C1852i> arrayList = this.f8674e;
        boolean z8 = true;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                z6 = false;
                break;
            } else {
                if (arrayList.get(size) == c1852i) {
                    z6 = true;
                    break;
                }
                size--;
            }
        }
        if (z6) {
            return;
        }
        int size2 = this.f8484p.size() - 1;
        int i7 = size2;
        while (i7 != 0) {
            i7--;
            c1852i = this.f8484p.get(i7);
            if (c1852i != null) {
                ArrayList<C1852i> arrayList2 = this.f8674e;
                int size3 = arrayList2.size() - 1;
                while (true) {
                    if (size3 < 0) {
                        z7 = false;
                        break;
                    } else {
                        if (arrayList2.get(size3) == c1852i) {
                            z7 = true;
                            break;
                        }
                        size3--;
                    }
                }
                if (z7) {
                }
            }
            c1906b = this;
            z8 = false;
            break;
        }
        c1906b = this;
        while (true) {
            if (!z8) {
                i7++;
                c1852i = c1906b.f8484p.get(i7);
            }
            C0143v.m423U(c1852i);
            C1852i c1852i2 = new C1852i(C1911g.m4491a(c1852i.f8340m.f8551b, c1906b.f8677h), c1906b.f8675f, null);
            c1906b.m4479z(c1852i2);
            c1906b.f8674e.add(c1852i2);
            c1852i2.mo4365e().m4335a(c1852i.mo4365e());
            c1906b.f8484p.set(i7, c1852i2);
            if (i7 == size2) {
                return;
            }
            c1906b = c1906b;
            z8 = false;
        }
    }

    /* renamed from: F */
    public final void m4455F(C1852i c1852i) {
        int size = this.f8484p.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (this.f8484p.get(size) != c1852i);
        this.f8484p.remove(size);
    }

    /* renamed from: G */
    public final void m4456G(C1852i c1852i) {
        for (int size = this.f8674e.size() - 1; size >= 0; size--) {
            if (this.f8674e.get(size) == c1852i) {
                this.f8674e.remove(size);
                return;
            }
        }
    }

    /* renamed from: H */
    public final void m4457H() {
        EnumC1907c enumC1907c;
        boolean z6 = false;
        for (int size = this.f8674e.size() - 1; size >= 0; size--) {
            C1852i c1852i = this.f8674e.get(size);
            if (size == 0) {
                c1852i = null;
                z6 = true;
            }
            String str = c1852i.f8340m.f8551b;
            if ("select".equals(str)) {
                enumC1907c = EnumC1907c.f8494E1;
            } else if ("td".equals(str) || ("th".equals(str) && !z6)) {
                enumC1907c = EnumC1907c.f8493D1;
            } else if ("tr".equals(str)) {
                enumC1907c = EnumC1907c.f8492C1;
            } else if ("tbody".equals(str) || "thead".equals(str) || "tfoot".equals(str)) {
                enumC1907c = EnumC1907c.f8491B1;
            } else if ("caption".equals(str)) {
                enumC1907c = EnumC1907c.f8513z1;
            } else if ("colgroup".equals(str)) {
                enumC1907c = EnumC1907c.f8490A1;
            } else if ("table".equals(str)) {
                enumC1907c = EnumC1907c.f8511x1;
            } else {
                if (!"head".equals(str) && !"body".equals(str)) {
                    if ("frameset".equals(str)) {
                        enumC1907c = EnumC1907c.f8497H1;
                    } else if ("html".equals(str)) {
                        enumC1907c = EnumC1907c.f8508m;
                    } else if (!z6) {
                    }
                }
                enumC1907c = EnumC1907c.f8505Z;
            }
            this.f8479k = enumC1907c;
            return;
        }
    }

    @Override // p150s6.AbstractC1915k
    /* renamed from: b */
    public final C1909e mo4458b() {
        return C1909e.f8536c;
    }

    @Override // p150s6.AbstractC1915k
    /* renamed from: c */
    public final void mo4459c(Reader reader, String str, C1910f c1910f) {
        super.mo4459c(reader, str, c1910f);
        this.f8479k = EnumC1907c.f8506c;
        this.f8480l = null;
        this.f8481m = false;
        this.f8482n = null;
        this.f8483o = null;
        this.f8484p = new ArrayList<>();
        this.f8485q = new ArrayList();
        this.f8486r = new AbstractC1912h.f();
        this.f8487s = true;
        this.f8488t = false;
    }

    @Override // p150s6.AbstractC1915k
    /* renamed from: e */
    public final boolean mo4460e(AbstractC1912h abstractC1912h) {
        this.f8676g = abstractC1912h;
        return this.f8479k.mo4482c(abstractC1912h, this);
    }

    /* renamed from: h */
    public final C1852i m4461h(C1852i c1852i) {
        for (int size = this.f8674e.size() - 1; size >= 0; size--) {
            if (this.f8674e.get(size) == c1852i) {
                return this.f8674e.get(size - 1);
            }
        }
        return null;
    }

    /* renamed from: i */
    public final void m4462i() {
        while (!this.f8484p.isEmpty()) {
            int size = this.f8484p.size();
            if ((size > 0 ? this.f8484p.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* renamed from: j */
    public final void m4463j(String... strArr) {
        int size = this.f8674e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C1852i c1852i = this.f8674e.get(size);
            if (C1806b.m4258b(strArr, c1852i.f8340m.f8551b) || c1852i.f8340m.f8551b.equals("html")) {
                return;
            } else {
                this.f8674e.remove(size);
            }
        }
    }

    /* renamed from: k */
    public final void m4464k(EnumC1907c enumC1907c) {
        if (this.f8670a.f8541b.m4489a()) {
            C1908d c1908d = this.f8670a.f8541b;
            C1905a c1905a = this.f8671b;
            c1908d.add(new C1834b(c1905a.f8469f + c1905a.f8468e, "Unexpected token [%s] when in state [%s]", new Object[]{this.f8676g.getClass().getSimpleName(), enumC1907c}));
        }
    }

    /* renamed from: l */
    public final void m4465l(String str) {
        while (str != null && !m4527a().f8340m.f8551b.equals(str)) {
            if (!C1806b.m4259c(f8472A, m4527a().f8340m.f8551b)) {
                return;
            } else {
                m4450A();
            }
        }
    }

    /* renamed from: m */
    public final C1852i m4466m(String str) {
        for (int size = this.f8484p.size() - 1; size >= 0; size--) {
            C1852i c1852i = this.f8484p.get(size);
            if (c1852i == null) {
                return null;
            }
            if (c1852i.f8340m.f8551b.equals(str)) {
                return c1852i;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final C1852i m4467n(String str) {
        C1852i c1852i;
        int size = this.f8674e.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            c1852i = this.f8674e.get(size);
        } while (!c1852i.f8340m.f8551b.equals(str));
        return c1852i;
    }

    /* renamed from: o */
    public final boolean m4468o(String str) {
        return m4469p(f8476x, str);
    }

    /* renamed from: p */
    public final boolean m4469p(String[] strArr, String str) {
        String[] strArr2 = f8474v;
        String[] strArr3 = this.f8489u;
        strArr3[0] = str;
        return m4471r(strArr3, strArr2, strArr);
    }

    /* renamed from: q */
    public final boolean m4470q(String str) {
        for (int size = this.f8674e.size() - 1; size >= 0; size--) {
            String str2 = this.f8674e.get(size).f8340m.f8551b;
            if (str2.equals(str)) {
                return true;
            }
            if (!C1806b.m4259c(f8478z, str2)) {
                return false;
            }
        }
        throw new IllegalArgumentException("Should not be reachable");
    }

    /* renamed from: r */
    public final boolean m4471r(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f8674e.size() - 1;
        int i7 = size > 100 ? size - 100 : 0;
        while (size >= i7) {
            String str = this.f8674e.get(size).f8340m.f8551b;
            if (C1806b.m4259c(strArr, str)) {
                return true;
            }
            if (C1806b.m4259c(strArr2, str)) {
                return false;
            }
            if (strArr3 != null && C1806b.m4259c(strArr3, str)) {
                return false;
            }
            size--;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m4472s(String str) {
        String[] strArr = f8477y;
        String[] strArr2 = this.f8489u;
        strArr2[0] = str;
        return m4471r(strArr2, strArr, null);
    }

    /* renamed from: t */
    public final C1852i m4473t(AbstractC1912h.g gVar) {
        if (gVar.f8576i) {
            C1852i m4476w = m4476w(gVar);
            this.f8674e.add(m4476w);
            C1913i c1913i = this.f8672c;
            c1913i.f8582c = EnumC1914j.f8638c;
            AbstractC1912h.f fVar = this.f8486r;
            fVar.mo4498f();
            fVar.m4506n(m4476w.f8340m.f8550a);
            c1913i.m4515h(fVar);
            return m4476w;
        }
        C1911g m4491a = C1911g.m4491a(gVar.m4505m(), this.f8677h);
        String str = this.f8675f;
        C1909e c1909e = this.f8677h;
        C1845b c1845b = gVar.f8577j;
        if (!c1909e.f8539b) {
            for (int i7 = 0; i7 < c1845b.f8321c; i7++) {
                String[] strArr = c1845b.f8322e;
                strArr[i7] = C0143v.m418P(strArr[i7]);
            }
        }
        C1852i c1852i = new C1852i(m4491a, str, c1845b);
        m4479z(c1852i);
        this.f8674e.add(c1852i);
        return c1852i;
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.f8676g + ", state=" + this.f8479k + ", currentElement=" + m4527a() + '}';
    }

    /* renamed from: u */
    public final void m4474u(AbstractC1912h.b bVar) {
        C1852i m4527a = m4527a();
        String str = m4527a.f8340m.f8550a;
        String str2 = bVar.f8561b;
        m4527a.m4372v(bVar instanceof AbstractC1912h.a ? new C1847d(str2) : (str.equals("script") || str.equals("style")) ? new C1849f(str2) : new C1859p(str2));
    }

    /* renamed from: v */
    public final void m4475v(AbstractC1912h.c cVar) {
        m4479z(new C1848e(cVar.f8562b.toString()));
    }

    /* renamed from: w */
    public final C1852i m4476w(AbstractC1912h.g gVar) {
        C1911g m4491a = C1911g.m4491a(gVar.m4505m(), this.f8677h);
        C1852i c1852i = new C1852i(m4491a, this.f8675f, gVar.f8577j);
        m4479z(c1852i);
        if (gVar.f8576i) {
            if (!C1911g.f8543k.containsKey(m4491a.f8550a)) {
                m4491a.f8556g = true;
            } else if (!m4491a.f8555f) {
                C1913i c1913i = this.f8672c;
                C1908d c1908d = c1913i.f8581b;
                if (c1908d.m4489a()) {
                    C1905a c1905a = c1913i.f8580a;
                    c1908d.add(new C1834b(c1905a.f8469f + c1905a.f8468e, "Tag cannot be self closing; not a void tag"));
                }
            }
        }
        return c1852i;
    }

    /* renamed from: x */
    public final void m4477x(AbstractC1912h.g gVar, boolean z6) {
        C1854k c1854k = new C1854k(C1911g.m4491a(gVar.m4505m(), this.f8677h), this.f8675f, gVar.f8577j);
        this.f8483o = c1854k;
        m4479z(c1854k);
        if (z6) {
            this.f8674e.add(c1854k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4478y(p142r6.AbstractC1856m r6) {
        /*
            r5 = this;
            java.lang.String r0 = "table"
            r6.i r0 = r5.m4467n(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            r6.m r3 = r0.f8357c
            r6.i r3 = (p142r6.C1852i) r3
            if (r3 == 0) goto L12
            r4 = 1
            goto L20
        L12:
            r6.i r3 = r5.m4461h(r0)
            goto L1f
        L17:
            java.util.ArrayList<r6.i> r3 = r5.f8674e
            java.lang.Object r3 = r3.get(r2)
            r6.i r3 = (p142r6.C1852i) r3
        L1f:
            r4 = 0
        L20:
            if (r4 == 0) goto L36
            androidx.activity.C0143v.m423U(r0)
            r6.m r3 = r0.f8357c
            androidx.activity.C0143v.m423U(r3)
            r6.m r3 = r0.f8357c
            int r0 = r0.f8358e
            r6.m[] r1 = new p142r6.AbstractC1856m[r1]
            r1[r2] = r6
            r3.m4387b(r0, r1)
            goto L39
        L36:
            r3.m4372v(r6)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p150s6.C1906b.m4478y(r6.m):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4479z(p142r6.AbstractC1856m r2) {
        /*
            r1 = this;
            java.util.ArrayList<r6.i> r0 = r1.f8674e
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            r6.g r0 = r1.f8673d
            goto L17
        Lb:
            boolean r0 = r1.f8488t
            if (r0 == 0) goto L13
            r1.m4478y(r2)
            goto L1a
        L13:
            r6.i r0 = r1.m4527a()
        L17:
            r0.m4372v(r2)
        L1a:
            boolean r0 = r2 instanceof p142r6.C1852i
            if (r0 == 0) goto L2f
            r6.i r2 = (p142r6.C1852i) r2
            s6.g r0 = r2.f8340m
            boolean r0 = r0.f8558i
            if (r0 == 0) goto L2f
            r6.k r0 = r1.f8483o
            if (r0 == 0) goto L2f
            t6.c r0 = r0.f8354x1
            r0.add(r2)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p150s6.C1906b.m4479z(r6.m):void");
    }
}
