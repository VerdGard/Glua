package p158t6;

import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p047f5.C1175f;
import p134q6.C1806b;
import p158t6.AbstractC1947b;
import p158t6.AbstractC1949d;
import p158t6.AbstractC1953h;

/* renamed from: t6.f */
/* loaded from: classes.dex */
public final class C1951f {

    /* renamed from: d */
    public static final String[] f8784d = {",", ">", "+", "~", " "};

    /* renamed from: e */
    public static final String[] f8785e = {"=", "!=", "^=", "$=", "*=", "~="};

    /* renamed from: f */
    public static final Pattern f8786f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: g */
    public static final Pattern f8787g = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a */
    public final C1175f f8788a;

    /* renamed from: b */
    public final String f8789b;

    /* renamed from: c */
    public final ArrayList f8790c = new ArrayList();

    public C1951f(String str) {
        this.f8789b = str;
        this.f8788a = new C1175f(str);
    }

    /* renamed from: h */
    public static AbstractC1949d m4551h(String str) {
        try {
            return new C1951f(str).m4558g();
        } catch (IllegalArgumentException e7) {
            throw new C1952g(e7.getMessage(), new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4552a(char r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158t6.C1951f.m4552a(char):void");
    }

    /* renamed from: b */
    public final int m4553b() {
        C1175f c1175f = this.f8788a;
        String m3375g = c1175f.m3375g(")");
        c1175f.m3380l(")");
        String trim = m3375g.trim();
        String[] strArr = C1806b.f8192a;
        boolean z6 = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    z6 = true;
                    break;
                }
                if (!Character.isDigit(trim.codePointAt(i7))) {
                    break;
                }
                i7++;
            }
        }
        if (z6) {
            return Integer.parseInt(trim);
        }
        throw new IllegalArgumentException("Index must be numeric");
    }

    /* renamed from: c */
    public final void m4554c(boolean z6) {
        String str = z6 ? ":containsOwn" : ":contains";
        C1175f c1175f = this.f8788a;
        c1175f.m3373e(str);
        String m3368q = C1175f.m3368q(c1175f.m3370b('(', ')'));
        C0143v.m422T(m3368q, ":contains(text) query must not be empty");
        this.f8790c.add(z6 ? new AbstractC1949d.m(m3368q) : new AbstractC1949d.n(m3368q));
    }

    /* renamed from: d */
    public final void m4555d(boolean z6, boolean z7) {
        C1175f c1175f = this.f8788a;
        String m3375g = c1175f.m3375g(")");
        c1175f.m3380l(")");
        String m420R = C0143v.m420R(m3375g);
        Matcher matcher = f8786f.matcher(m420R);
        Matcher matcher2 = f8787g.matcher(m420R);
        int i7 = 2;
        if (!"odd".equals(m420R)) {
            if ("even".equals(m420R)) {
                r4 = 0;
            } else if (matcher.matches()) {
                i7 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                r4 = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst("^\\+", "")) : 0;
            } else {
                if (!matcher2.matches()) {
                    throw new C1952g("Could not parse nth-index '%s': unexpected format", m420R);
                }
                r4 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i7 = 0;
            }
        }
        this.f8790c.add(z7 ? z6 ? new AbstractC1949d.b0(i7, r4) : new AbstractC1949d.c0(i7, r4) : z6 ? new AbstractC1949d.a0(i7, r4) : new AbstractC1949d.z(i7, r4));
    }

    /* renamed from: e */
    public final void m4556e() {
        Object j0Var;
        Object g0Var;
        Object hVar;
        C1175f c1175f = this.f8788a;
        boolean m3380l = c1175f.m3380l("#");
        ArrayList arrayList = this.f8790c;
        if (m3380l) {
            String m3374f = c1175f.m3374f();
            C0143v.m421S(m3374f);
            arrayList.add(new AbstractC1949d.p(m3374f));
            return;
        }
        if (c1175f.m3380l(".")) {
            String m3374f2 = c1175f.m3374f();
            C0143v.m421S(m3374f2);
            arrayList.add(new AbstractC1949d.k(m3374f2.trim()));
            return;
        }
        if (c1175f.m3383o() || c1175f.m3381m("*|")) {
            int i7 = c1175f.f5759b;
            while (!c1175f.m3378j() && (c1175f.m3383o() || c1175f.m3382n("*|", "|", "_", "-"))) {
                c1175f.f5759b++;
            }
            String substring = ((String) c1175f.f5760c).substring(i7, c1175f.f5759b);
            C0143v.m421S(substring);
            if (substring.startsWith("*|")) {
                j0Var = new AbstractC1947b.b(new AbstractC1949d.j0(C0143v.m420R(substring)), new AbstractC1949d.k0(C0143v.m420R(substring.replace("*|", ":"))));
            } else {
                if (substring.contains("|")) {
                    substring = substring.replace("|", ":");
                }
                j0Var = new AbstractC1949d.j0(substring.trim());
            }
            arrayList.add(j0Var);
            return;
        }
        boolean m3381m = c1175f.m3381m("[");
        String str = this.f8789b;
        if (m3381m) {
            C1175f c1175f2 = new C1175f(c1175f.m3370b('[', ']'));
            String[] strArr = f8785e;
            int i8 = c1175f2.f5759b;
            while (!c1175f2.m3378j() && !c1175f2.m3382n(strArr)) {
                c1175f2.f5759b++;
            }
            String substring2 = ((String) c1175f2.f5760c).substring(i8, c1175f2.f5759b);
            C0143v.m421S(substring2);
            c1175f2.m3376h();
            if (c1175f2.m3378j()) {
                arrayList.add(substring2.startsWith("^") ? new AbstractC1949d.d(substring2.substring(1)) : new AbstractC1949d.b(substring2));
                return;
            }
            if (c1175f2.m3380l("=")) {
                hVar = new AbstractC1949d.e(substring2, c1175f2.m3384p());
            } else if (c1175f2.m3380l("!=")) {
                hVar = new AbstractC1949d.i(substring2, c1175f2.m3384p());
            } else if (c1175f2.m3380l("^=")) {
                hVar = new AbstractC1949d.j(substring2, c1175f2.m3384p());
            } else if (c1175f2.m3380l("$=")) {
                hVar = new AbstractC1949d.g(substring2, c1175f2.m3384p());
            } else if (c1175f2.m3380l("*=")) {
                hVar = new AbstractC1949d.f(substring2, c1175f2.m3384p());
            } else {
                if (!c1175f2.m3380l("~=")) {
                    throw new C1952g("Could not parse attribute query '%s': unexpected token at '%s'", str, c1175f2.m3384p());
                }
                hVar = new AbstractC1949d.h(substring2, Pattern.compile(c1175f2.m3384p()));
            }
            arrayList.add(hVar);
            return;
        }
        if (c1175f.m3380l("*")) {
            arrayList.add(new AbstractC1949d.a());
            return;
        }
        if (c1175f.m3380l(":lt(")) {
            arrayList.add(new AbstractC1949d.t(m4553b()));
            return;
        }
        if (c1175f.m3380l(":gt(")) {
            arrayList.add(new AbstractC1949d.s(m4553b()));
            return;
        }
        if (c1175f.m3380l(":eq(")) {
            arrayList.add(new AbstractC1949d.q(m4553b()));
            return;
        }
        if (c1175f.m3381m(":has(")) {
            c1175f.m3373e(":has");
            String m3370b = c1175f.m3370b('(', ')');
            C0143v.m422T(m3370b, ":has(el) subselect must not be empty");
            arrayList.add(new AbstractC1953h.a(m4551h(m3370b)));
            return;
        }
        if (c1175f.m3381m(":contains(")) {
            m4554c(false);
            return;
        }
        if (c1175f.m3381m(":containsOwn(")) {
            m4554c(true);
            return;
        }
        if (c1175f.m3381m(":containsData(")) {
            c1175f.m3373e(":containsData");
            String m3368q = C1175f.m3368q(c1175f.m3370b('(', ')'));
            C0143v.m422T(m3368q, ":containsData(text) query must not be empty");
            arrayList.add(new AbstractC1949d.l(m3368q));
            return;
        }
        if (c1175f.m3381m(":matches(")) {
            m4557f(false);
            return;
        }
        if (c1175f.m3381m(":matchesOwn(")) {
            m4557f(true);
            return;
        }
        if (c1175f.m3381m(":not(")) {
            c1175f.m3373e(":not");
            String m3370b2 = c1175f.m3370b('(', ')');
            C0143v.m422T(m3370b2, ":not(selector) subselect must not be empty");
            arrayList.add(new AbstractC1953h.d(m4551h(m3370b2)));
            return;
        }
        if (c1175f.m3380l(":nth-child(")) {
            m4555d(false, false);
            return;
        }
        if (c1175f.m3380l(":nth-last-child(")) {
            m4555d(true, false);
            return;
        }
        if (c1175f.m3380l(":nth-of-type(")) {
            m4555d(false, true);
            return;
        }
        if (c1175f.m3380l(":nth-last-of-type(")) {
            m4555d(true, true);
            return;
        }
        if (c1175f.m3380l(":first-child")) {
            g0Var = new AbstractC1949d.v();
        } else if (c1175f.m3380l(":last-child")) {
            g0Var = new AbstractC1949d.x();
        } else if (c1175f.m3380l(":first-of-type")) {
            g0Var = new AbstractC1949d.w();
        } else if (c1175f.m3380l(":last-of-type")) {
            g0Var = new AbstractC1949d.y();
        } else if (c1175f.m3380l(":only-child")) {
            g0Var = new AbstractC1949d.d0();
        } else if (c1175f.m3380l(":only-of-type")) {
            g0Var = new AbstractC1949d.e0();
        } else if (c1175f.m3380l(":empty")) {
            g0Var = new AbstractC1949d.u();
        } else if (c1175f.m3380l(":root")) {
            g0Var = new AbstractC1949d.f0();
        } else {
            if (!c1175f.m3380l(":matchText")) {
                throw new C1952g("Could not parse query '%s': unexpected token at '%s'", str, c1175f.m3384p());
            }
            g0Var = new AbstractC1949d.g0();
        }
        arrayList.add(g0Var);
    }

    /* renamed from: f */
    public final void m4557f(boolean z6) {
        String str = z6 ? ":matchesOwn" : ":matches";
        C1175f c1175f = this.f8788a;
        c1175f.m3373e(str);
        String m3370b = c1175f.m3370b('(', ')');
        C0143v.m422T(m3370b, ":matches(regex) query must not be empty");
        this.f8790c.add(z6 ? new AbstractC1949d.i0(Pattern.compile(m3370b)) : new AbstractC1949d.h0(Pattern.compile(m3370b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:5:0x0036). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:4:0x002d). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p158t6.AbstractC1949d m4558g() {
        /*
            r6 = this;
            f5.f r0 = r6.f8788a
            r0.m3376h()
            java.lang.String[] r1 = p158t6.C1951f.f8784d
            boolean r2 = r0.m3382n(r1)
            java.util.ArrayList r3 = r6.f8790c
            if (r2 == 0) goto L19
            t6.h$g r2 = new t6.h$g
            r2.<init>()
            r3.add(r2)
            r2 = r6
            goto L2d
        L19:
            r2 = r6
        L1a:
            r2.m4556e()
        L1d:
            boolean r4 = r0.m3378j()
            if (r4 != 0) goto L3a
            boolean r4 = r0.m3376h()
            boolean r5 = r0.m3382n(r1)
            if (r5 == 0) goto L32
        L2d:
            char r4 = r0.m3372d()
            goto L36
        L32:
            if (r4 == 0) goto L1a
            r4 = 32
        L36:
            r2.m4552a(r4)
            goto L1d
        L3a:
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L49
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            t6.d r0 = (p158t6.AbstractC1949d) r0
            return r0
        L49:
            t6.b$a r0 = new t6.b$a
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p158t6.C1951f.m4558g():t6.d");
    }
}
