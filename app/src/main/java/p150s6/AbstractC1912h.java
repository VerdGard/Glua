package p150s6;

import android.ext.C0090b;
import androidx.activity.C0143v;
import p142r6.C1845b;

/* renamed from: s6.h */
/* loaded from: classes.dex */
public abstract class AbstractC1912h {

    /* renamed from: a */
    public int f8560a;

    /* renamed from: s6.h$a */
    public static final class a extends b {
        public a(String str) {
            this.f8561b = str;
        }

        @Override // p150s6.AbstractC1912h.b
        public final String toString() {
            return C0090b.m220f(new StringBuilder("<![CDATA["), this.f8561b, "]]>");
        }
    }

    /* renamed from: s6.h$b */
    public static class b extends AbstractC1912h {

        /* renamed from: b */
        public String f8561b;

        public b() {
            this.f8560a = 5;
        }

        @Override // p150s6.AbstractC1912h
        /* renamed from: f */
        public final AbstractC1912h mo4498f() {
            this.f8561b = null;
            return this;
        }

        public String toString() {
            return this.f8561b;
        }
    }

    /* renamed from: s6.h$c */
    public static final class c extends AbstractC1912h {

        /* renamed from: b */
        public final StringBuilder f8562b = new StringBuilder();

        /* renamed from: c */
        public boolean f8563c = false;

        public c() {
            this.f8560a = 4;
        }

        @Override // p150s6.AbstractC1912h
        /* renamed from: f */
        public final AbstractC1912h mo4498f() {
            AbstractC1912h.m4492g(this.f8562b);
            this.f8563c = false;
            return this;
        }

        public final String toString() {
            return "<!--" + this.f8562b.toString() + "-->";
        }
    }

    /* renamed from: s6.h$d */
    public static final class d extends AbstractC1912h {

        /* renamed from: b */
        public final StringBuilder f8564b = new StringBuilder();

        /* renamed from: c */
        public String f8565c = null;

        /* renamed from: d */
        public final StringBuilder f8566d = new StringBuilder();

        /* renamed from: e */
        public final StringBuilder f8567e = new StringBuilder();

        /* renamed from: f */
        public boolean f8568f = false;

        public d() {
            this.f8560a = 1;
        }

        @Override // p150s6.AbstractC1912h
        /* renamed from: f */
        public final AbstractC1912h mo4498f() {
            AbstractC1912h.m4492g(this.f8564b);
            this.f8565c = null;
            AbstractC1912h.m4492g(this.f8566d);
            AbstractC1912h.m4492g(this.f8567e);
            this.f8568f = false;
            return this;
        }
    }

    /* renamed from: s6.h$e */
    public static final class e extends AbstractC1912h {
        public e() {
            this.f8560a = 6;
        }

        @Override // p150s6.AbstractC1912h
        /* renamed from: f */
        public final AbstractC1912h mo4498f() {
            return this;
        }
    }

    /* renamed from: s6.h$f */
    public static final class f extends h {
        public f() {
            this.f8560a = 3;
        }

        public final String toString() {
            return "</" + m4505m() + ">";
        }
    }

    /* renamed from: s6.h$g */
    public static final class g extends h {
        public g() {
            this.f8577j = new C1845b();
            this.f8560a = 2;
        }

        @Override // p150s6.AbstractC1912h.h, p150s6.AbstractC1912h
        /* renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC1912h mo4498f() {
            mo4498f();
            return this;
        }

        @Override // p150s6.AbstractC1912h.h
        /* renamed from: p */
        public final h mo4498f() {
            super.mo4498f();
            this.f8577j = new C1845b();
            return this;
        }

        public final String toString() {
            StringBuilder sb;
            String m4505m;
            C1845b c1845b = this.f8577j;
            if (c1845b == null || c1845b.f8321c <= 0) {
                sb = new StringBuilder("<");
                m4505m = m4505m();
            } else {
                sb = new StringBuilder("<");
                sb.append(m4505m());
                sb.append(" ");
                m4505m = this.f8577j.toString();
            }
            sb.append(m4505m);
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: s6.h$h */
    public static abstract class h extends AbstractC1912h {

        /* renamed from: b */
        public String f8569b;

        /* renamed from: c */
        public String f8570c;

        /* renamed from: d */
        public String f8571d;

        /* renamed from: f */
        public String f8573f;

        /* renamed from: j */
        public C1845b f8577j;

        /* renamed from: e */
        public final StringBuilder f8572e = new StringBuilder();

        /* renamed from: g */
        public boolean f8574g = false;

        /* renamed from: h */
        public boolean f8575h = false;

        /* renamed from: i */
        public boolean f8576i = false;

        /* renamed from: h */
        public final void m4500h(char c7) {
            String valueOf = String.valueOf(c7);
            String str = this.f8571d;
            if (str != null) {
                valueOf = str.concat(valueOf);
            }
            this.f8571d = valueOf;
        }

        /* renamed from: i */
        public final void m4501i(char c7) {
            this.f8575h = true;
            String str = this.f8573f;
            StringBuilder sb = this.f8572e;
            if (str != null) {
                sb.append(str);
                this.f8573f = null;
            }
            sb.append(c7);
        }

        /* renamed from: j */
        public final void m4502j(String str) {
            this.f8575h = true;
            String str2 = this.f8573f;
            StringBuilder sb = this.f8572e;
            if (str2 != null) {
                sb.append(str2);
                this.f8573f = null;
            }
            if (sb.length() == 0) {
                this.f8573f = str;
            } else {
                sb.append(str);
            }
        }

        /* renamed from: k */
        public final void m4503k(int[] iArr) {
            this.f8575h = true;
            String str = this.f8573f;
            StringBuilder sb = this.f8572e;
            if (str != null) {
                sb.append(str);
                this.f8573f = null;
            }
            for (int i7 : iArr) {
                sb.appendCodePoint(i7);
            }
        }

        /* renamed from: l */
        public final void m4504l(String str) {
            String str2 = this.f8569b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f8569b = str;
            this.f8570c = C0143v.m418P(str);
        }

        /* renamed from: m */
        public final String m4505m() {
            String str = this.f8569b;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Must be false");
            }
            return this.f8569b;
        }

        /* renamed from: n */
        public final void m4506n(String str) {
            this.f8569b = str;
            this.f8570c = C0143v.m418P(str);
        }

        /* renamed from: o */
        public final void m4507o() {
            if (this.f8577j == null) {
                this.f8577j = new C1845b();
            }
            String str = this.f8571d;
            StringBuilder sb = this.f8572e;
            if (str != null) {
                String trim = str.trim();
                this.f8571d = trim;
                if (trim.length() > 0) {
                    this.f8577j.m4343i(this.f8571d, this.f8575h ? sb.length() > 0 ? sb.toString() : this.f8573f : this.f8574g ? "" : null);
                }
            }
            this.f8571d = null;
            this.f8574g = false;
            this.f8575h = false;
            AbstractC1912h.m4492g(sb);
            this.f8573f = null;
        }

        @Override // p150s6.AbstractC1912h
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public h mo4498f() {
            this.f8569b = null;
            this.f8570c = null;
            this.f8571d = null;
            AbstractC1912h.m4492g(this.f8572e);
            this.f8573f = null;
            this.f8574g = false;
            this.f8575h = false;
            this.f8576i = false;
            this.f8577j = null;
            return this;
        }
    }

    /* renamed from: g */
    public static void m4492g(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* renamed from: a */
    public final boolean m4493a() {
        return this.f8560a == 4;
    }

    /* renamed from: b */
    public final boolean m4494b() {
        return this.f8560a == 1;
    }

    /* renamed from: c */
    public final boolean m4495c() {
        return this.f8560a == 6;
    }

    /* renamed from: d */
    public final boolean m4496d() {
        return this.f8560a == 3;
    }

    /* renamed from: e */
    public final boolean m4497e() {
        return this.f8560a == 2;
    }

    /* renamed from: f */
    public abstract AbstractC1912h mo4498f();
}
