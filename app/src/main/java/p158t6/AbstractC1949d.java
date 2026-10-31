package p158t6;

import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p142r6.AbstractC1856m;
import p142r6.C1844a;
import p142r6.C1845b;
import p142r6.C1846c;
import p142r6.C1848e;
import p142r6.C1850g;
import p142r6.C1851h;
import p142r6.C1852i;
import p142r6.C1858o;
import p142r6.C1859p;
import p142r6.C1860q;
import p150s6.C1911g;

/* renamed from: t6.d */
/* loaded from: classes.dex */
public abstract class AbstractC1949d {

    /* renamed from: t6.d$a */
    public static final class a extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return true;
        }

        public final String toString() {
            return "*";
        }
    }

    /* renamed from: t6.d$a0 */
    public static final class a0 extends o {
        public a0(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p158t6.AbstractC1949d.o
        /* renamed from: b */
        public final int mo4549b(C1852i c1852i) {
            return ((C1852i) c1852i.f8357c).m4374y().size() - c1852i.m4358B();
        }

        @Override // p158t6.AbstractC1949d.o
        /* renamed from: c */
        public final String mo4550c() {
            return "nth-last-child";
        }
    }

    /* renamed from: t6.d$b */
    public static final class b extends AbstractC1949d {

        /* renamed from: a */
        public final String f8766a;

        public b(String str) {
            this.f8766a = str;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return c1852i2.mo4383l(this.f8766a);
        }

        public final String toString() {
            return String.format("[%s]", this.f8766a);
        }
    }

    /* renamed from: t6.d$b0 */
    public static class b0 extends o {
        public b0(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p158t6.AbstractC1949d.o
        /* renamed from: b */
        public final int mo4549b(C1852i c1852i) {
            C1948c m4374y = ((C1852i) c1852i.f8357c).m4374y();
            int i7 = 0;
            for (int m4358B = c1852i.m4358B(); m4358B < m4374y.size(); m4358B++) {
                if (m4374y.get(m4358B).f8340m.equals(c1852i.f8340m)) {
                    i7++;
                }
            }
            return i7;
        }

        @Override // p158t6.AbstractC1949d.o
        /* renamed from: c */
        public final String mo4550c() {
            return "nth-last-of-type";
        }
    }

    /* renamed from: t6.d$c */
    public static abstract class c extends AbstractC1949d {

        /* renamed from: a */
        public final String f8767a;

        /* renamed from: b */
        public final String f8768b;

        public c(String str, String str2) {
            C0143v.m421S(str);
            C0143v.m421S(str2);
            this.f8767a = C0143v.m420R(str);
            if ((str2.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'"))) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            this.f8768b = C0143v.m420R(str2);
        }
    }

    /* renamed from: t6.d$c0 */
    public static class c0 extends o {
        public c0(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p158t6.AbstractC1949d.o
        /* renamed from: b */
        public final int mo4549b(C1852i c1852i) {
            Iterator<C1852i> it = ((C1852i) c1852i.f8357c).m4374y().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                C1852i next = it.next();
                if (next.f8340m.equals(c1852i.f8340m)) {
                    i7++;
                }
                if (next == c1852i) {
                    break;
                }
            }
            return i7;
        }

        @Override // p158t6.AbstractC1949d.o
        /* renamed from: c */
        public final String mo4550c() {
            return "nth-of-type";
        }
    }

    /* renamed from: t6.d$d */
    public static final class d extends AbstractC1949d {

        /* renamed from: a */
        public final String f8769a;

        public d(String str) {
            C0143v.m421S(str);
            this.f8769a = C0143v.m418P(str);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            C1845b mo4365e = c1852i2.mo4365e();
            mo4365e.getClass();
            ArrayList arrayList = new ArrayList(mo4365e.f8321c);
            for (int i7 = 0; i7 < mo4365e.f8321c; i7++) {
                String str = mo4365e.f8323m[i7];
                arrayList.add(str == null ? new C1846c(mo4365e.f8322e[i7]) : new C1844a(mo4365e.f8322e[i7], str, mo4365e));
            }
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (it.hasNext()) {
                if (C0143v.m418P(((C1844a) it.next()).f8317c).startsWith(this.f8769a)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format("[^%s]", this.f8769a);
        }
    }

    /* renamed from: t6.d$d0 */
    public static final class d0 extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            C1948c c1948c;
            AbstractC1856m abstractC1856m = c1852i2.f8357c;
            C1852i c1852i3 = (C1852i) abstractC1856m;
            if (c1852i3 == null || (c1852i3 instanceof C1850g)) {
                return false;
            }
            if (abstractC1856m == null) {
                c1948c = new C1948c(0);
            } else {
                List<C1852i> m4373x = ((C1852i) abstractC1856m).m4373x();
                C1948c c1948c2 = new C1948c(m4373x.size() - 1);
                for (C1852i c1852i4 : m4373x) {
                    if (c1852i4 != c1852i2) {
                        c1948c2.add(c1852i4);
                    }
                }
                c1948c = c1948c2;
            }
            return c1948c.size() == 0;
        }

        public final String toString() {
            return ":only-child";
        }
    }

    /* renamed from: t6.d$e */
    public static final class e extends c {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            String str = this.f8767a;
            if (c1852i2.mo4383l(str)) {
                if (this.f8768b.equalsIgnoreCase(c1852i2.mo4381c(str).trim())) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format("[%s=%s]", this.f8767a, this.f8768b);
        }
    }

    /* renamed from: t6.d$e0 */
    public static final class e0 extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            C1852i c1852i3 = (C1852i) c1852i2.f8357c;
            if (c1852i3 == null || (c1852i3 instanceof C1850g)) {
                return false;
            }
            Iterator<C1852i> it = c1852i3.m4374y().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (it.next().f8340m.equals(c1852i2.f8340m)) {
                    i7++;
                }
            }
            return i7 == 1;
        }

        public final String toString() {
            return ":only-of-type";
        }
    }

    /* renamed from: t6.d$f */
    public static final class f extends c {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            String str = this.f8767a;
            return c1852i2.mo4383l(str) && C0143v.m418P(c1852i2.mo4381c(str)).contains(this.f8768b);
        }

        public final String toString() {
            return String.format("[%s*=%s]", this.f8767a, this.f8768b);
        }
    }

    /* renamed from: t6.d$f0 */
    public static final class f0 extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            if (c1852i instanceof C1850g) {
                c1852i = c1852i.m4373x().get(0);
            }
            return c1852i2 == c1852i;
        }

        public final String toString() {
            return ":root";
        }
    }

    /* renamed from: t6.d$g */
    public static final class g extends c {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            String str = this.f8767a;
            return c1852i2.mo4383l(str) && C0143v.m418P(c1852i2.mo4381c(str)).endsWith(this.f8768b);
        }

        public final String toString() {
            return String.format("[%s$=%s]", this.f8767a, this.f8768b);
        }
    }

    /* renamed from: t6.d$g0 */
    public static final class g0 extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            if (c1852i2 instanceof C1858o) {
                return true;
            }
            c1852i2.getClass();
            ArrayList arrayList = new ArrayList();
            for (AbstractC1856m abstractC1856m : c1852i2.f8337X) {
                if (abstractC1856m instanceof C1859p) {
                    arrayList.add((C1859p) abstractC1856m);
                }
            }
            Iterator it = Collections.unmodifiableList(arrayList).iterator();
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                C1859p c1859p = (C1859p) it.next();
                String str = c1852i2.f8340m.f8550a;
                C0143v.m423U(str);
                HashMap hashMap = C1911g.f8543k;
                C1911g c1911g = (C1911g) hashMap.get(str);
                if (c1911g == null) {
                    String trim = str.trim();
                    C0143v.m421S(trim);
                    c1911g = (C1911g) hashMap.get(trim);
                    if (c1911g == null) {
                        c1911g = new C1911g(trim);
                        c1911g.f8552c = false;
                    }
                }
                C1858o c1858o = new C1858o(c1911g, c1852i2.f8339Z, c1852i2.mo4365e());
                c1859p.getClass();
                C0143v.m423U(c1859p.f8357c);
                AbstractC1856m abstractC1856m2 = c1859p.f8357c;
                abstractC1856m2.getClass();
                C0143v.m414L(c1859p.f8357c == abstractC1856m2);
                AbstractC1856m abstractC1856m3 = c1858o.f8357c;
                if (abstractC1856m3 != null) {
                    abstractC1856m3.mo4379u(c1858o);
                }
                int i7 = c1859p.f8358e;
                abstractC1856m2.mo4370k().set(i7, c1858o);
                c1858o.f8357c = abstractC1856m2;
                c1858o.f8358e = i7;
                c1859p.f8357c = null;
                c1858o.m4372v(c1859p);
            }
        }

        public final String toString() {
            return ":matchText";
        }
    }

    /* renamed from: t6.d$h */
    public static final class h extends AbstractC1949d {

        /* renamed from: a */
        public final String f8770a;

        /* renamed from: b */
        public final Pattern f8771b;

        public h(String str, Pattern pattern) {
            this.f8770a = C0143v.m420R(str);
            this.f8771b = pattern;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            String str = this.f8770a;
            return c1852i2.mo4383l(str) && this.f8771b.matcher(c1852i2.mo4381c(str)).find();
        }

        public final String toString() {
            return String.format("[%s~=%s]", this.f8770a, this.f8771b.toString());
        }
    }

    /* renamed from: t6.d$h0 */
    public static final class h0 extends AbstractC1949d {

        /* renamed from: a */
        public final Pattern f8772a;

        public h0(Pattern pattern) {
            this.f8772a = pattern;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return this.f8772a.matcher(c1852i2.m4364H()).find();
        }

        public final String toString() {
            return String.format(":matches(%s)", this.f8772a);
        }
    }

    /* renamed from: t6.d$i */
    public static final class i extends c {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return !this.f8768b.equalsIgnoreCase(c1852i2.mo4381c(this.f8767a));
        }

        public final String toString() {
            return String.format("[%s!=%s]", this.f8767a, this.f8768b);
        }
    }

    /* renamed from: t6.d$i0 */
    public static final class i0 extends AbstractC1949d {

        /* renamed from: a */
        public final Pattern f8773a;

        public i0(Pattern pattern) {
            this.f8773a = pattern;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return this.f8773a.matcher(c1852i2.m4361E()).find();
        }

        public final String toString() {
            return String.format(":matchesOwn(%s)", this.f8773a);
        }
    }

    /* renamed from: t6.d$j */
    public static final class j extends c {
        public j(String str, String str2) {
            super(str, str2);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            String str = this.f8767a;
            return c1852i2.mo4383l(str) && C0143v.m418P(c1852i2.mo4381c(str)).startsWith(this.f8768b);
        }

        public final String toString() {
            return String.format("[%s^=%s]", this.f8767a, this.f8768b);
        }
    }

    /* renamed from: t6.d$j0 */
    public static final class j0 extends AbstractC1949d {

        /* renamed from: a */
        public final String f8774a;

        public j0(String str) {
            this.f8774a = str;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return c1852i2.f8340m.f8550a.equalsIgnoreCase(this.f8774a);
        }

        public final String toString() {
            return String.format("%s", this.f8774a);
        }
    }

    /* renamed from: t6.d$k */
    public static final class k extends AbstractC1949d {

        /* renamed from: a */
        public final String f8775a;

        public k(String str) {
            this.f8775a = str;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            String m4339e = c1852i2.mo4365e().m4339e("class");
            int length = m4339e.length();
            String str = this.f8775a;
            int length2 = str.length();
            if (length == 0 || length < length2) {
                return false;
            }
            if (length == length2) {
                return str.equalsIgnoreCase(m4339e);
            }
            boolean z6 = false;
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (Character.isWhitespace(m4339e.charAt(i8))) {
                    if (!z6) {
                        continue;
                    } else {
                        if (i8 - i7 == length2 && m4339e.regionMatches(true, i7, str, 0, length2)) {
                            return true;
                        }
                        z6 = false;
                    }
                } else if (!z6) {
                    i7 = i8;
                    z6 = true;
                }
            }
            if (z6 && length - i7 == length2) {
                return m4339e.regionMatches(true, i7, str, 0, length2);
            }
            return false;
        }

        public final String toString() {
            return String.format(".%s", this.f8775a);
        }
    }

    /* renamed from: t6.d$k0 */
    public static final class k0 extends AbstractC1949d {

        /* renamed from: a */
        public final String f8776a;

        public k0(String str) {
            this.f8776a = str;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return c1852i2.f8340m.f8550a.endsWith(this.f8776a);
        }

        public final String toString() {
            return String.format("%s", this.f8776a);
        }
    }

    /* renamed from: t6.d$l */
    public static final class l extends AbstractC1949d {

        /* renamed from: a */
        public final String f8777a;

        public l(String str) {
            this.f8777a = C0143v.m418P(str);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return C0143v.m418P(c1852i2.m4357A()).contains(this.f8777a);
        }

        public final String toString() {
            return String.format(":containsData(%s)", this.f8777a);
        }
    }

    /* renamed from: t6.d$m */
    public static final class m extends AbstractC1949d {

        /* renamed from: a */
        public final String f8778a;

        public m(String str) {
            this.f8778a = C0143v.m418P(str);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return C0143v.m418P(c1852i2.m4361E()).contains(this.f8778a);
        }

        public final String toString() {
            return String.format(":containsOwn(%s)", this.f8778a);
        }
    }

    /* renamed from: t6.d$n */
    public static final class n extends AbstractC1949d {

        /* renamed from: a */
        public final String f8779a;

        public n(String str) {
            this.f8779a = C0143v.m418P(str);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return C0143v.m418P(c1852i2.m4364H()).contains(this.f8779a);
        }

        public final String toString() {
            return String.format(":contains(%s)", this.f8779a);
        }
    }

    /* renamed from: t6.d$o */
    public static abstract class o extends AbstractC1949d {

        /* renamed from: a */
        public final int f8780a;

        /* renamed from: b */
        public final int f8781b;

        public o(int i7, int i8) {
            this.f8780a = i7;
            this.f8781b = i8;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            C1852i c1852i3 = (C1852i) c1852i2.f8357c;
            if (c1852i3 == null || (c1852i3 instanceof C1850g)) {
                return false;
            }
            int mo4549b = mo4549b(c1852i2);
            int i7 = this.f8781b;
            int i8 = this.f8780a;
            if (i8 == 0) {
                return mo4549b == i7;
            }
            int i9 = mo4549b - i7;
            return i9 * i8 >= 0 && i9 % i8 == 0;
        }

        /* renamed from: b */
        public abstract int mo4549b(C1852i c1852i);

        /* renamed from: c */
        public abstract String mo4550c();

        public String toString() {
            int i7 = this.f8781b;
            int i8 = this.f8780a;
            return i8 == 0 ? String.format(":%s(%d)", mo4550c(), Integer.valueOf(i7)) : i7 == 0 ? String.format(":%s(%dn)", mo4550c(), Integer.valueOf(i8)) : String.format(":%s(%dn%+d)", mo4550c(), Integer.valueOf(i8), Integer.valueOf(i7));
        }
    }

    /* renamed from: t6.d$p */
    public static final class p extends AbstractC1949d {

        /* renamed from: a */
        public final String f8782a;

        public p(String str) {
            this.f8782a = str;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return this.f8782a.equals(c1852i2.mo4365e().m4339e("id"));
        }

        public final String toString() {
            return String.format("#%s", this.f8782a);
        }
    }

    /* renamed from: t6.d$q */
    public static final class q extends r {
        public q(int i7) {
            super(i7);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return c1852i2.m4358B() == this.f8783a;
        }

        public final String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f8783a));
        }
    }

    /* renamed from: t6.d$r */
    public static abstract class r extends AbstractC1949d {

        /* renamed from: a */
        public final int f8783a;

        public r(int i7) {
            this.f8783a = i7;
        }
    }

    /* renamed from: t6.d$s */
    public static final class s extends r {
        public s(int i7) {
            super(i7);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return c1852i2.m4358B() > this.f8783a;
        }

        public final String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f8783a));
        }
    }

    /* renamed from: t6.d$t */
    public static final class t extends r {
        public t(int i7) {
            super(i7);
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return c1852i != c1852i2 && c1852i2.m4358B() < this.f8783a;
        }

        public final String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f8783a));
        }
    }

    /* renamed from: t6.d$u */
    public static final class u extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            for (AbstractC1856m abstractC1856m : Collections.unmodifiableList(c1852i2.mo4370k())) {
                if (!(abstractC1856m instanceof C1848e) && !(abstractC1856m instanceof C1860q) && !(abstractC1856m instanceof C1851h)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return ":empty";
        }
    }

    /* renamed from: t6.d$v */
    public static final class v extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            C1852i c1852i3 = (C1852i) c1852i2.f8357c;
            return (c1852i3 == null || (c1852i3 instanceof C1850g) || c1852i2.m4358B() != 0) ? false : true;
        }

        public final String toString() {
            return ":first-child";
        }
    }

    /* renamed from: t6.d$w */
    public static final class w extends c0 {
        public w() {
            super(0, 1);
        }

        @Override // p158t6.AbstractC1949d.o
        public final String toString() {
            return ":first-of-type";
        }
    }

    /* renamed from: t6.d$x */
    public static final class x extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            C1852i c1852i3 = (C1852i) c1852i2.f8357c;
            return (c1852i3 == null || (c1852i3 instanceof C1850g) || c1852i2.m4358B() != c1852i3.m4374y().size() - 1) ? false : true;
        }

        public final String toString() {
            return ":last-child";
        }
    }

    /* renamed from: t6.d$y */
    public static final class y extends b0 {
        public y() {
            super(0, 1);
        }

        @Override // p158t6.AbstractC1949d.o
        public final String toString() {
            return ":last-of-type";
        }
    }

    /* renamed from: t6.d$z */
    public static final class z extends o {
        public z(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p158t6.AbstractC1949d.o
        /* renamed from: b */
        public final int mo4549b(C1852i c1852i) {
            return c1852i.m4358B() + 1;
        }

        @Override // p158t6.AbstractC1949d.o
        /* renamed from: c */
        public final String mo4550c() {
            return "nth-child";
        }
    }

    /* renamed from: a */
    public abstract boolean mo4546a(C1852i c1852i, C1852i c1852i2);
}
