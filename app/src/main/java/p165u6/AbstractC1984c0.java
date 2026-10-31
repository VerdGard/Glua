package p165u6;

import p165u6.AbstractC2003u;
import p180w6.AbstractC2150s;

/* renamed from: u6.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC1984c0 {

    /* renamed from: c */
    public static final ThreadLocal<AbstractC2150s> f8977c = new ThreadLocal<>();

    /* renamed from: u6.c0$a */
    public static final class a extends AbstractC1984c0 {

        /* renamed from: X */
        public final AbstractC1984c0 f8978X;

        /* renamed from: e */
        public final int f8979e;

        /* renamed from: m */
        public final AbstractC2003u[] f8980m;

        /* renamed from: s */
        public final int f8981s;

        public a(AbstractC2003u[] abstractC2003uArr, int i7, int i8, AbstractC1984c0 abstractC1984c0) {
            this.f8980m = abstractC2003uArr;
            this.f8979e = i7;
            this.f8981s = i8;
            this.f8978X = abstractC1984c0;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: D */
        public final void mo4639D(AbstractC2003u[] abstractC2003uArr, int i7, int i8) {
            int min = Math.min(this.f8981s, i8);
            System.arraycopy(this.f8980m, this.f8979e, abstractC2003uArr, i7, min);
            this.f8978X.mo4639D(abstractC2003uArr, i7 + min, i8 - min);
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: I */
        public final int mo4621I() {
            return this.f8978X.mo4621I() + this.f8981s;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: L */
        public final AbstractC1984c0 mo4622L(int i7) {
            if (i7 <= 0) {
                AbstractC2003u.m4863R(1, "start must be > 0");
                throw null;
            }
            if (i7 == 1) {
                return this;
            }
            AbstractC1984c0 abstractC1984c0 = this.f8978X;
            int i8 = this.f8981s;
            if (i7 > i8) {
                return abstractC1984c0.mo4622L(i7 - i8);
            }
            return AbstractC2003u.m4859B2(this.f8980m, (this.f8979e + i7) - 1, i8 - (i7 - 1), abstractC1984c0);
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: t */
        public final AbstractC2003u mo4623t(int i7) {
            if (i7 < 1) {
                return AbstractC2003u.f9130m;
            }
            int i8 = this.f8981s;
            if (i7 > i8) {
                return this.f8978X.mo4623t(i7 - i8);
            }
            return this.f8980m[(this.f8979e + i7) - 1];
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: u */
        public final AbstractC2003u mo4624u() {
            return this.f8981s > 0 ? this.f8980m[this.f8979e] : this.f8978X.mo4624u();
        }
    }

    /* renamed from: u6.c0$b */
    public static final class b extends AbstractC1984c0 {

        /* renamed from: e */
        public final AbstractC2003u[] f8982e;

        /* renamed from: m */
        public final AbstractC1984c0 f8983m;

        public b(AbstractC2003u[] abstractC2003uArr, AbstractC2003u.a aVar) {
            this.f8982e = abstractC2003uArr;
            this.f8983m = aVar;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: D */
        public final void mo4639D(AbstractC2003u[] abstractC2003uArr, int i7, int i8) {
            AbstractC2003u[] abstractC2003uArr2 = this.f8982e;
            int min = Math.min(abstractC2003uArr2.length, i8);
            System.arraycopy(abstractC2003uArr2, 0, abstractC2003uArr, i7, min);
            this.f8983m.mo4639D(abstractC2003uArr, i7 + min, i8 - min);
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: I */
        public final int mo4621I() {
            return this.f8983m.mo4621I() + this.f8982e.length;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: L */
        public final AbstractC1984c0 mo4622L(int i7) {
            if (i7 <= 0) {
                AbstractC2003u.m4863R(1, "start must be > 0");
                throw null;
            }
            if (i7 == 1) {
                return this;
            }
            AbstractC2003u[] abstractC2003uArr = this.f8982e;
            int length = abstractC2003uArr.length;
            AbstractC1984c0 abstractC1984c0 = this.f8983m;
            if (i7 > length) {
                return abstractC1984c0.mo4622L(i7 - abstractC2003uArr.length);
            }
            int i8 = i7 - 1;
            return AbstractC2003u.m4859B2(abstractC2003uArr, i8, abstractC2003uArr.length - i8, abstractC1984c0);
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: t */
        public final AbstractC2003u mo4623t(int i7) {
            if (i7 < 1) {
                return AbstractC2003u.f9130m;
            }
            AbstractC2003u[] abstractC2003uArr = this.f8982e;
            if (i7 <= abstractC2003uArr.length) {
                return abstractC2003uArr[i7 - 1];
            }
            return this.f8983m.mo4623t(i7 - abstractC2003uArr.length);
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: u */
        public final AbstractC2003u mo4624u() {
            AbstractC2003u[] abstractC2003uArr = this.f8982e;
            return abstractC2003uArr.length > 0 ? abstractC2003uArr[0] : this.f8983m.mo4624u();
        }
    }

    /* renamed from: u6.c0$c */
    public static final class c extends AbstractC1984c0 {

        /* renamed from: e */
        public final AbstractC2003u f8984e;

        /* renamed from: m */
        public final AbstractC1984c0 f8985m;

        public c(AbstractC2003u abstractC2003u, AbstractC1984c0 abstractC1984c0) {
            this.f8984e = abstractC2003u;
            this.f8985m = abstractC1984c0;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: I */
        public final int mo4621I() {
            return this.f8985m.mo4621I() + 1;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: L */
        public final AbstractC1984c0 mo4622L(int i7) {
            if (i7 == 1) {
                return this;
            }
            AbstractC1984c0 abstractC1984c0 = this.f8985m;
            if (i7 == 2) {
                return abstractC1984c0;
            }
            if (i7 > 2) {
                return abstractC1984c0.mo4622L(i7 - 1);
            }
            AbstractC2003u.m4863R(1, "start must be > 0");
            throw null;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: t */
        public final AbstractC2003u mo4623t(int i7) {
            return i7 == 1 ? this.f8984e : this.f8985m.mo4623t(i7 - 1);
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: u */
        public final AbstractC2003u mo4624u() {
            return this.f8984e;
        }
    }

    /* renamed from: A */
    public final C1999q m4636A(int i7) {
        return mo4623t(i7).mo4795t0();
    }

    /* renamed from: B */
    public final C2000r m4637B() {
        return mo4623t(1).mo4848u0();
    }

    /* renamed from: C */
    public final AbstractC2003u m4638C(int i7) {
        if (i7 <= mo4621I()) {
            return mo4623t(i7);
        }
        AbstractC2003u.m4863R(i7, "value expected");
        throw null;
    }

    /* renamed from: D */
    public void mo4639D(AbstractC2003u[] abstractC2003uArr, int i7, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i7 + i9;
            i9++;
            abstractC2003uArr[i10] = mo4623t(i9);
        }
    }

    /* renamed from: E */
    public final AbstractC1984c0 m4640E() {
        int mo4621I = mo4621I();
        if (mo4621I == 0) {
            return AbstractC2003u.f9124Y;
        }
        if (mo4621I == 1) {
            return mo4624u();
        }
        if (mo4621I == 2) {
            return new c(mo4624u(), mo4623t(2));
        }
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[mo4621I];
        mo4639D(abstractC2003uArr, 0, mo4621I);
        return new b(abstractC2003uArr, AbstractC2003u.f9124Y);
    }

    /* renamed from: F */
    public AbstractC1984c0 mo4620F() {
        return this;
    }

    /* renamed from: G */
    public final boolean m4641G(int i7) {
        return mo4623t(i7).mo4804d1();
    }

    /* renamed from: H */
    public final boolean m4642H() {
        return mo4623t(1).mo4809f1();
    }

    /* renamed from: I */
    public abstract int mo4621I();

    /* renamed from: J */
    public final int m4643J(int i7, int i8) {
        return mo4623t(i7).mo4699C1(i8);
    }

    /* renamed from: K */
    public final String m4644K(int i7, String str) {
        return mo4623t(i7).mo4700D1(str);
    }

    /* renamed from: L */
    public abstract AbstractC1984c0 mo4622L(int i7);

    /* renamed from: M */
    public String mo4645M() {
        C1979a c1979a = new C1979a();
        c1979a.m4615b("(");
        int mo4621I = mo4621I();
        for (int i7 = 1; i7 <= mo4621I; i7++) {
            if (i7 > 1) {
                c1979a.m4615b(",");
            }
            c1979a.m4615b(mo4623t(i7).mo4645M());
        }
        c1979a.m4615b(")");
        AbstractC1984c0 abstractC1984c0 = c1979a.f8941d;
        if (abstractC1984c0 == null) {
            abstractC1984c0 = c1979a.m4619f();
        }
        return abstractC1984c0.mo4645M();
    }

    /* renamed from: N */
    public final String m4646N(int i7) {
        return mo4623t(i7).mo4645M();
    }

    /* renamed from: t */
    public abstract AbstractC2003u mo4623t(int i7);

    public String toString() {
        return mo4645M();
    }

    /* renamed from: u */
    public abstract AbstractC2003u mo4624u();

    /* renamed from: v */
    public final double m4647v(int i7) {
        return mo4623t(i7).mo4749q0().mo4744n2();
    }

    /* renamed from: w */
    public final int m4648w(int i7) {
        return mo4623t(i7).mo4749q0().mo4747o2();
    }

    /* renamed from: x */
    public final String m4649x(int i7) {
        return mo4623t(i7).mo4742n0();
    }

    /* renamed from: y */
    public final long m4650y(int i7) {
        return mo4623t(i7).mo4749q0().mo4748p2();
    }

    /* renamed from: z */
    public final C1998p m4651z(int i7) {
        return mo4623t(i7).mo4753s0();
    }
}
