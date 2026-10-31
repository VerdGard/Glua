package p142r6;

import androidx.activity.C0143v;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p036e2.C1109v5;
import p134q6.C1806b;
import p142r6.C1850g;
import p150s6.C1909e;
import p158t6.InterfaceC1950e;
import p160u0.C1966c;

/* renamed from: r6.m */
/* loaded from: classes.dex */
public abstract class AbstractC1856m implements Cloneable {

    /* renamed from: c */
    public AbstractC1856m f8357c;

    /* renamed from: e */
    public int f8358e;

    /* renamed from: r6.m$a */
    public static class a implements InterfaceC1950e {

        /* renamed from: a */
        public final Appendable f8359a;

        /* renamed from: b */
        public final C1850g.a f8360b;

        public a(StringBuilder sb, C1850g.a aVar) {
            this.f8359a = sb;
            this.f8360b = aVar;
            aVar.m4354b();
        }

        @Override // p158t6.InterfaceC1950e
        /* renamed from: a */
        public final void mo4375a(AbstractC1856m abstractC1856m, int i7) {
            try {
                abstractC1856m.mo4345r(this.f8359a, i7, this.f8360b);
            } catch (IOException e7) {
                throw new C1966c(e7);
            }
        }

        @Override // p158t6.InterfaceC1950e
        /* renamed from: b */
        public final void mo4376b(AbstractC1856m abstractC1856m, int i7) {
            if (abstractC1856m.mo4344p().equals("#text")) {
                return;
            }
            try {
                abstractC1856m.mo4346s(this.f8359a, i7, this.f8360b);
            } catch (IOException e7) {
                throw new C1966c(e7);
            }
        }
    }

    /* renamed from: n */
    public static void m4386n(Appendable appendable, int i7, C1850g.a aVar) {
        String valueOf;
        Appendable append = appendable.append('\n');
        int i8 = i7 * aVar.f8330Y;
        String[] strArr = C1806b.f8192a;
        if (i8 < 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        if (i8 < 21) {
            valueOf = C1806b.f8192a[i8];
        } else {
            char[] cArr = new char[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                cArr[i9] = ' ';
            }
            valueOf = String.valueOf(cArr);
        }
        append.append(valueOf);
    }

    /* renamed from: a */
    public String mo4380a(String str) {
        C0143v.m421S(str);
        String str2 = "";
        if (!mo4383l(str)) {
            return "";
        }
        String mo4366f = mo4366f();
        String mo4381c = mo4381c(str);
        String[] strArr = C1806b.f8192a;
        try {
            try {
                str2 = C1806b.m4264h(new URL(mo4366f), mo4381c).toExternalForm();
            } catch (MalformedURLException unused) {
                str2 = new URL(mo4381c).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
        }
        return str2;
    }

    /* renamed from: b */
    public final void m4387b(int i7, AbstractC1856m... abstractC1856mArr) {
        for (AbstractC1856m abstractC1856m : abstractC1856mArr) {
            if (abstractC1856m == null) {
                throw new IllegalArgumentException("Array must not contain any null objects");
            }
        }
        List<AbstractC1856m> mo4370k = mo4370k();
        for (AbstractC1856m abstractC1856m2 : abstractC1856mArr) {
            abstractC1856m2.getClass();
            AbstractC1856m abstractC1856m3 = abstractC1856m2.f8357c;
            if (abstractC1856m3 != null) {
                abstractC1856m3.mo4379u(abstractC1856m2);
            }
            abstractC1856m2.f8357c = this;
        }
        mo4370k.addAll(i7, Arrays.asList(abstractC1856mArr));
        List<AbstractC1856m> mo4370k2 = mo4370k();
        while (i7 < mo4370k2.size()) {
            mo4370k2.get(i7).f8358e = i7;
            i7++;
        }
    }

    /* renamed from: c */
    public String mo4381c(String str) {
        C0143v.m423U(str);
        if (!mo4371m()) {
            return "";
        }
        String m4339e = mo4365e().m4339e(str);
        return m4339e.length() > 0 ? m4339e : str.startsWith("abs:") ? mo4380a(str.substring(4)) : "";
    }

    /* renamed from: d */
    public void mo4382d(String str, String str2) {
        C1909e c1909e = C1857n.m4390a(this).f8542c;
        c1909e.getClass();
        String trim = str.trim();
        if (!c1909e.f8539b) {
            trim = C0143v.m418P(trim);
        }
        C1845b mo4365e = mo4365e();
        int m4342h = mo4365e.m4342h(trim);
        if (m4342h != -1) {
            mo4365e.f8323m[m4342h] = str2;
            if (mo4365e.f8322e[m4342h].equals(trim)) {
                return;
            }
            mo4365e.f8322e[m4342h] = trim;
            return;
        }
        mo4365e.m4336b(mo4365e.f8321c + 1);
        String[] strArr = mo4365e.f8322e;
        int i7 = mo4365e.f8321c;
        strArr[i7] = trim;
        mo4365e.f8323m[i7] = str2;
        mo4365e.f8321c = i7 + 1;
    }

    /* renamed from: e */
    public abstract C1845b mo4365e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* renamed from: f */
    public abstract String mo4366f();

    /* renamed from: g */
    public abstract int mo4367g();

    @Override // 
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public AbstractC1856m clone() {
        AbstractC1856m mo4368i = mo4368i(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(mo4368i);
        while (!linkedList.isEmpty()) {
            AbstractC1856m abstractC1856m = (AbstractC1856m) linkedList.remove();
            int mo4367g = abstractC1856m.mo4367g();
            for (int i7 = 0; i7 < mo4367g; i7++) {
                List<AbstractC1856m> mo4370k = abstractC1856m.mo4370k();
                AbstractC1856m mo4368i2 = mo4370k.get(i7).mo4368i(abstractC1856m);
                mo4370k.set(i7, mo4368i2);
                linkedList.add(mo4368i2);
            }
        }
        return mo4368i;
    }

    /* renamed from: i */
    public AbstractC1856m mo4368i(AbstractC1856m abstractC1856m) {
        try {
            AbstractC1856m abstractC1856m2 = (AbstractC1856m) super.clone();
            abstractC1856m2.f8357c = abstractC1856m;
            abstractC1856m2.f8358e = abstractC1856m == null ? 0 : this.f8358e;
            return abstractC1856m2;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* renamed from: j */
    public abstract void mo4369j(String str);

    /* renamed from: k */
    public abstract List<AbstractC1856m> mo4370k();

    /* renamed from: l */
    public boolean mo4383l(String str) {
        C0143v.m423U(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if ((mo4365e().m4342h(substring) != -1) && !mo4380a(substring).equals("")) {
                return true;
            }
        }
        return mo4365e().m4342h(str) != -1;
    }

    /* renamed from: m */
    public abstract boolean mo4371m();

    /* renamed from: o */
    public final AbstractC1856m m4388o() {
        AbstractC1856m abstractC1856m = this.f8357c;
        if (abstractC1856m == null) {
            return null;
        }
        List<AbstractC1856m> mo4370k = abstractC1856m.mo4370k();
        int i7 = this.f8358e + 1;
        if (mo4370k.size() > i7) {
            return mo4370k.get(i7);
        }
        return null;
    }

    /* renamed from: p */
    public abstract String mo4344p();

    /* renamed from: q */
    public String mo4351q() {
        StringBuilder m4257a = C1806b.m4257a();
        AbstractC1856m abstractC1856m = this;
        while (true) {
            AbstractC1856m abstractC1856m2 = abstractC1856m.f8357c;
            if (abstractC1856m2 == null) {
                break;
            }
            abstractC1856m = abstractC1856m2;
        }
        C1850g c1850g = abstractC1856m instanceof C1850g ? (C1850g) abstractC1856m : null;
        if (c1850g == null) {
            c1850g = new C1850g("");
        }
        C1109v5.m3257u(new a(m4257a, c1850g.f8326x1), this);
        return C1806b.m4263g(m4257a);
    }

    /* renamed from: r */
    public abstract void mo4345r(Appendable appendable, int i7, C1850g.a aVar);

    /* renamed from: s */
    public abstract void mo4346s(Appendable appendable, int i7, C1850g.a aVar);

    /* renamed from: t */
    public final void m4389t() {
        C0143v.m423U(this.f8357c);
        this.f8357c.mo4379u(this);
    }

    public String toString() {
        return mo4351q();
    }

    /* renamed from: u */
    public void mo4379u(AbstractC1856m abstractC1856m) {
        C0143v.m414L(abstractC1856m.f8357c == this);
        int i7 = abstractC1856m.f8358e;
        mo4370k().remove(i7);
        List<AbstractC1856m> mo4370k = mo4370k();
        while (i7 < mo4370k.size()) {
            mo4370k.get(i7).f8358e = i7;
            i7++;
        }
        abstractC1856m.f8357c = null;
    }
}
