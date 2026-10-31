package p158t6;

import java.util.Iterator;
import p036e2.C1109v5;
import p142r6.C1852i;
import p158t6.AbstractC1949d;

/* renamed from: t6.h */
/* loaded from: classes.dex */
public abstract class AbstractC1953h extends AbstractC1949d {

    /* renamed from: a */
    public AbstractC1949d f8791a;

    /* renamed from: t6.h$a */
    public static class a extends AbstractC1953h {
        public a(AbstractC1949d abstractC1949d) {
            this.f8791a = abstractC1949d;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            c1852i2.getClass();
            AbstractC1949d.a aVar = new AbstractC1949d.a();
            C1948c c1948c = new C1948c();
            C1109v5.m3257u(new C1946a(c1852i2, c1948c, aVar), c1852i2);
            Iterator<C1852i> it = c1948c.iterator();
            while (it.hasNext()) {
                C1852i next = it.next();
                if (next != c1852i2 && this.f8791a.mo4546a(c1852i, next)) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            return String.format(":has(%s)", this.f8791a);
        }
    }

    /* renamed from: t6.h$b */
    public static class b extends AbstractC1953h {
        public b(AbstractC1949d abstractC1949d) {
            this.f8791a = abstractC1949d;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            C1852i c1852i3;
            return (c1852i == c1852i2 || (c1852i3 = (C1852i) c1852i2.f8357c) == null || !this.f8791a.mo4546a(c1852i, c1852i3)) ? false : true;
        }

        public final String toString() {
            return String.format(":ImmediateParent%s", this.f8791a);
        }
    }

    /* renamed from: t6.h$c */
    public static class c extends AbstractC1953h {
        public c(AbstractC1949d abstractC1949d) {
            this.f8791a = abstractC1949d;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            C1852i m4362F;
            return (c1852i == c1852i2 || (m4362F = c1852i2.m4362F()) == null || !this.f8791a.mo4546a(c1852i, m4362F)) ? false : true;
        }

        public final String toString() {
            return String.format(":prev%s", this.f8791a);
        }
    }

    /* renamed from: t6.h$d */
    public static class d extends AbstractC1953h {
        public d(AbstractC1949d abstractC1949d) {
            this.f8791a = abstractC1949d;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return !this.f8791a.mo4546a(c1852i, c1852i2);
        }

        public final String toString() {
            return String.format(":not%s", this.f8791a);
        }
    }

    /* renamed from: t6.h$e */
    public static class e extends AbstractC1953h {
        public e(AbstractC1949d abstractC1949d) {
            this.f8791a = abstractC1949d;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            if (c1852i == c1852i2) {
                return false;
            }
            do {
                c1852i2 = (C1852i) c1852i2.f8357c;
                if (this.f8791a.mo4546a(c1852i, c1852i2)) {
                    return true;
                }
            } while (c1852i2 != c1852i);
            return false;
        }

        public final String toString() {
            return String.format(":parent%s", this.f8791a);
        }
    }

    /* renamed from: t6.h$f */
    public static class f extends AbstractC1953h {
        public f(AbstractC1949d abstractC1949d) {
            this.f8791a = abstractC1949d;
        }

        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            if (c1852i == c1852i2) {
                return false;
            }
            do {
                c1852i2 = c1852i2.m4362F();
                if (c1852i2 == null) {
                    return false;
                }
            } while (!this.f8791a.mo4546a(c1852i, c1852i2));
            return true;
        }

        public final String toString() {
            return String.format(":prev*%s", this.f8791a);
        }
    }

    /* renamed from: t6.h$g */
    public static class g extends AbstractC1949d {
        @Override // p158t6.AbstractC1949d
        /* renamed from: a */
        public final boolean mo4546a(C1852i c1852i, C1852i c1852i2) {
            return c1852i == c1852i2;
        }
    }
}
