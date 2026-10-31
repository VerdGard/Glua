package p142r6;

import androidx.activity.C0143v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p036e2.C1109v5;
import p126p6.AbstractC1707a;
import p134q6.C1806b;
import p142r6.AbstractC1856m;
import p142r6.C1850g;
import p150s6.C1911g;
import p158t6.AbstractC1949d;
import p158t6.C1946a;
import p158t6.C1948c;
import p158t6.C1951f;
import p158t6.InterfaceC1950e;

/* renamed from: r6.i */
/* loaded from: classes.dex */
public class C1852i extends AbstractC1856m {

    /* renamed from: w1 */
    public static final List<AbstractC1856m> f8336w1 = Collections.emptyList();

    /* renamed from: X */
    public List<AbstractC1856m> f8337X;

    /* renamed from: Y */
    public C1845b f8338Y;

    /* renamed from: Z */
    public String f8339Z;

    /* renamed from: m */
    public final C1911g f8340m;

    /* renamed from: s */
    public WeakReference<List<C1852i>> f8341s;

    /* renamed from: r6.i$a */
    public class a implements InterfaceC1950e {

        /* renamed from: a */
        public final /* synthetic */ StringBuilder f8342a;

        public a(StringBuilder sb) {
            this.f8342a = sb;
        }

        @Override // p158t6.InterfaceC1950e
        /* renamed from: a */
        public final void mo4375a(AbstractC1856m abstractC1856m, int i7) {
            boolean z6 = abstractC1856m instanceof C1859p;
            StringBuilder sb = this.f8342a;
            if (z6) {
                C1852i.m4356w(sb, (C1859p) abstractC1856m);
                return;
            }
            if (abstractC1856m instanceof C1852i) {
                C1852i c1852i = (C1852i) abstractC1856m;
                if (sb.length() > 0) {
                    C1911g c1911g = c1852i.f8340m;
                    if ((c1911g.f8552c || c1911g.f8550a.equals("br")) && !C1859p.m4391x(sb)) {
                        sb.append(' ');
                    }
                }
            }
        }

        @Override // p158t6.InterfaceC1950e
        /* renamed from: b */
        public final void mo4376b(AbstractC1856m abstractC1856m, int i7) {
            if ((abstractC1856m instanceof C1852i) && ((C1852i) abstractC1856m).f8340m.f8552c && (abstractC1856m.m4388o() instanceof C1859p)) {
                StringBuilder sb = this.f8342a;
                if (C1859p.m4391x(sb)) {
                    return;
                }
                sb.append(' ');
            }
        }
    }

    /* renamed from: r6.i$b */
    public static final class b extends AbstractC1707a<AbstractC1856m> {

        /* renamed from: c */
        public final C1852i f8343c;

        public b(C1852i c1852i, int i7) {
            super(i7);
            this.f8343c = c1852i;
        }

        @Override // p126p6.AbstractC1707a
        /* renamed from: a */
        public final void mo4132a() {
            this.f8343c.f8341s = null;
        }
    }

    static {
        Pattern.compile("\\s+");
    }

    public C1852i() {
        throw null;
    }

    public C1852i(C1911g c1911g, String str, C1845b c1845b) {
        C0143v.m423U(c1911g);
        C0143v.m423U(str);
        this.f8337X = f8336w1;
        this.f8339Z = str;
        this.f8338Y = c1845b;
        this.f8340m = c1911g;
    }

    /* renamed from: w */
    public static void m4356w(StringBuilder sb, C1859p c1859p) {
        boolean z6;
        String m4384v = c1859p.m4384v();
        AbstractC1856m abstractC1856m = c1859p.f8357c;
        if (abstractC1856m instanceof C1852i) {
            C1852i c1852i = (C1852i) abstractC1856m;
            int i7 = 0;
            while (!c1852i.f8340m.f8557h) {
                c1852i = (C1852i) c1852i.f8357c;
                i7++;
                if (i7 < 6 && c1852i != null) {
                }
            }
            z6 = true;
            if (!z6 || (c1859p instanceof C1847d)) {
                sb.append(m4384v);
            }
            boolean m4391x = C1859p.m4391x(sb);
            String[] strArr = C1806b.f8192a;
            int length = m4384v.length();
            int i8 = 0;
            boolean z7 = false;
            boolean z8 = false;
            while (i8 < length) {
                int codePointAt = m4384v.codePointAt(i8);
                if (!(codePointAt == 32 || codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13 || codePointAt == 160)) {
                    if (!(Character.getType(codePointAt) == 16 && (codePointAt == 8203 || codePointAt == 8204 || codePointAt == 8205 || codePointAt == 173))) {
                        sb.appendCodePoint(codePointAt);
                        z7 = true;
                        z8 = false;
                    }
                } else if ((!m4391x || z7) && !z8) {
                    sb.append(' ');
                    z8 = true;
                }
                i8 += Character.charCount(codePointAt);
            }
            return;
        }
        z6 = false;
        if (z6) {
        }
        sb.append(m4384v);
    }

    /* renamed from: A */
    public final String m4357A() {
        String m4384v;
        StringBuilder m4257a = C1806b.m4257a();
        for (AbstractC1856m abstractC1856m : this.f8337X) {
            if (abstractC1856m instanceof C1849f) {
                m4384v = ((C1849f) abstractC1856m).m4384v();
            } else if (abstractC1856m instanceof C1848e) {
                m4384v = ((C1848e) abstractC1856m).m4384v();
            } else if (abstractC1856m instanceof C1852i) {
                m4384v = ((C1852i) abstractC1856m).m4357A();
            } else if (abstractC1856m instanceof C1847d) {
                m4384v = ((C1847d) abstractC1856m).m4384v();
            }
            m4257a.append(m4384v);
        }
        return C1806b.m4263g(m4257a);
    }

    /* renamed from: B */
    public final int m4358B() {
        C1852i c1852i = (C1852i) this.f8357c;
        if (c1852i == null) {
            return 0;
        }
        List<C1852i> m4373x = c1852i.m4373x();
        int size = m4373x.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (m4373x.get(i7) == this) {
                return i7;
            }
        }
        return 0;
    }

    /* renamed from: C */
    public final C1948c m4359C(String str) {
        C0143v.m421S(str);
        AbstractC1949d.k kVar = new AbstractC1949d.k(str);
        C1948c c1948c = new C1948c();
        C1109v5.m3257u(new C1946a(this, c1948c, kVar), this);
        return c1948c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [r6.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, r6.m] */
    /* JADX WARN: Type inference failed for: r8v0, types: [r6.m] */
    /* renamed from: D */
    public final String m4360D() {
        C1850g c1850g;
        StringBuilder m4257a = C1806b.m4257a();
        int size = this.f8337X.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            AbstractC1856m abstractC1856m = this.f8337X.get(i7);
            abstractC1856m.getClass();
            C1850g c1850g2 = abstractC1856m;
            while (true) {
                ?? r8 = c1850g2.f8357c;
                if (r8 == 0) {
                    break;
                }
                c1850g2 = r8;
            }
            c1850g = c1850g2 instanceof C1850g ? c1850g2 : null;
            if (c1850g == null) {
                c1850g = new C1850g("");
            }
            C1109v5.m3257u(new AbstractC1856m.a(m4257a, c1850g.f8326x1), abstractC1856m);
            i7++;
        }
        String m4263g = C1806b.m4263g(m4257a);
        C1852i c1852i = this;
        while (true) {
            ?? r22 = c1852i.f8357c;
            if (r22 == 0) {
                break;
            }
            c1852i = r22;
        }
        c1850g = c1852i instanceof C1850g ? (C1850g) c1852i : null;
        if (c1850g == null) {
            c1850g = new C1850g("");
        }
        return c1850g.f8326x1.f8329X ? m4263g.trim() : m4263g;
    }

    /* renamed from: E */
    public final String m4361E() {
        StringBuilder m4257a = C1806b.m4257a();
        for (AbstractC1856m abstractC1856m : this.f8337X) {
            if (abstractC1856m instanceof C1859p) {
                m4356w(m4257a, (C1859p) abstractC1856m);
            } else if ((abstractC1856m instanceof C1852i) && ((C1852i) abstractC1856m).f8340m.f8550a.equals("br") && !C1859p.m4391x(m4257a)) {
                m4257a.append(" ");
            }
        }
        return C1806b.m4263g(m4257a).trim();
    }

    /* renamed from: F */
    public final C1852i m4362F() {
        AbstractC1856m abstractC1856m = this.f8357c;
        if (abstractC1856m == null) {
            return null;
        }
        List<C1852i> m4373x = ((C1852i) abstractC1856m).m4373x();
        int size = m4373x.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                break;
            }
            if (m4373x.get(i8) == this) {
                i7 = i8;
                break;
            }
            i8++;
        }
        Integer valueOf = Integer.valueOf(i7);
        C0143v.m423U(valueOf);
        if (valueOf.intValue() > 0) {
            return m4373x.get(valueOf.intValue() - 1);
        }
        return null;
    }

    /* renamed from: G */
    public final C1948c m4363G(String str) {
        C0143v.m421S(str);
        AbstractC1949d m4551h = C1951f.m4551h(str);
        C0143v.m423U(m4551h);
        C1948c c1948c = new C1948c();
        C1109v5.m3257u(new C1946a(this, c1948c, m4551h), this);
        return c1948c;
    }

    /* renamed from: H */
    public final String m4364H() {
        StringBuilder m4257a = C1806b.m4257a();
        C1109v5.m3257u(new a(m4257a), this);
        return C1806b.m4263g(m4257a).trim();
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: e */
    public final C1845b mo4365e() {
        if (!mo4371m()) {
            this.f8338Y = new C1845b();
        }
        return this.f8338Y;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: f */
    public final String mo4366f() {
        return this.f8339Z;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: g */
    public final int mo4367g() {
        return this.f8337X.size();
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: i */
    public final AbstractC1856m mo4368i(AbstractC1856m abstractC1856m) {
        C1852i c1852i = (C1852i) super.mo4368i(abstractC1856m);
        C1845b c1845b = this.f8338Y;
        c1852i.f8338Y = c1845b != null ? c1845b.clone() : null;
        c1852i.f8339Z = this.f8339Z;
        b bVar = new b(c1852i, this.f8337X.size());
        c1852i.f8337X = bVar;
        bVar.addAll(this.f8337X);
        return c1852i;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: j */
    public final void mo4369j(String str) {
        this.f8339Z = str;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: k */
    public final List<AbstractC1856m> mo4370k() {
        if (this.f8337X == f8336w1) {
            this.f8337X = new b(this, 4);
        }
        return this.f8337X;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: m */
    public final boolean mo4371m() {
        return this.f8338Y != null;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: p */
    public String mo4344p() {
        return this.f8340m.f8550a;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: r */
    public void mo4345r(Appendable appendable, int i7, C1850g.a aVar) {
        C1852i c1852i;
        boolean z6 = aVar.f8329X;
        C1911g c1911g = this.f8340m;
        if (z6 && ((c1911g.f8553d || ((c1852i = (C1852i) this.f8357c) != null && c1852i.f8340m.f8553d)) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0))) {
            AbstractC1856m.m4386n(appendable, i7, aVar);
        }
        appendable.append('<').append(c1911g.f8550a);
        C1845b c1845b = this.f8338Y;
        if (c1845b != null) {
            c1845b.m4340f(appendable, aVar);
        }
        if (this.f8337X.isEmpty()) {
            boolean z7 = c1911g.f8555f;
            if ((z7 || c1911g.f8556g) && (aVar.f8331Z != 1 || !z7)) {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: s */
    public void mo4346s(Appendable appendable, int i7, C1850g.a aVar) {
        boolean isEmpty = this.f8337X.isEmpty();
        C1911g c1911g = this.f8340m;
        if (isEmpty) {
            if (c1911g.f8555f || c1911g.f8556g) {
                return;
            }
        }
        if (aVar.f8329X && !this.f8337X.isEmpty() && c1911g.f8553d) {
            AbstractC1856m.m4386n(appendable, i7, aVar);
        }
        appendable.append("</").append(c1911g.f8550a).append('>');
    }

    /* renamed from: v */
    public final void m4372v(AbstractC1856m abstractC1856m) {
        C0143v.m423U(abstractC1856m);
        AbstractC1856m abstractC1856m2 = abstractC1856m.f8357c;
        if (abstractC1856m2 != null) {
            abstractC1856m2.mo4379u(abstractC1856m);
        }
        abstractC1856m.f8357c = this;
        mo4370k();
        this.f8337X.add(abstractC1856m);
        abstractC1856m.f8358e = this.f8337X.size() - 1;
    }

    /* renamed from: x */
    public final List<C1852i> m4373x() {
        List<C1852i> list;
        WeakReference<List<C1852i>> weakReference = this.f8341s;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f8337X.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1856m abstractC1856m = this.f8337X.get(i7);
            if (abstractC1856m instanceof C1852i) {
                arrayList.add((C1852i) abstractC1856m);
            }
        }
        this.f8341s = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* renamed from: y */
    public final C1948c m4374y() {
        return new C1948c(m4373x());
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C1852i clone() {
        return (C1852i) super.clone();
    }
}
