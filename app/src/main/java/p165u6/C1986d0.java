package p165u6;

import java.lang.ref.WeakReference;
import p165u6.C1999q;

/* renamed from: u6.d0 */
/* loaded from: classes.dex */
public final class C1986d0 implements InterfaceC2004v {

    /* renamed from: c */
    public final boolean f8991c;

    /* renamed from: e */
    public final boolean f8992e;

    /* renamed from: m */
    public final AbstractC2003u f8993m;

    /* renamed from: u6.d0$a */
    public static class a extends c {

        /* renamed from: s */
        public final int f8994s;

        public a(a aVar, C1999q.h hVar) {
            super(aVar.f8996c, aVar.f8997e, hVar);
            this.f8994s = aVar.f8994s;
        }

        public a(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            super(C1986d0.m4653b(abstractC2003u), C1986d0.m4653b(abstractC2003u2), null);
            this.f8994s = abstractC2003u.hashCode();
        }

        @Override // p165u6.C1999q.h
        /* renamed from: b */
        public final int mo4660b(int i7) {
            C1998p c1998p = C1999q.f9045h2;
            return (Integer.MAX_VALUE & this.f8994s) % i7;
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: c */
        public final c mo4661c(C1999q.h hVar) {
            return new a(this, hVar);
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: g */
        public final C1999q.h mo4662g(AbstractC2003u abstractC2003u) {
            this.f8997e = C1986d0.m4653b(abstractC2003u);
            return this;
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: i */
        public final AbstractC2003u mo4663i() {
            return C1986d0.m4652a(this.f8996c);
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: n */
        public final AbstractC2003u mo4664n() {
            return C1986d0.m4652a(this.f8997e);
        }
    }

    /* renamed from: u6.d0$b */
    public static class b extends c {

        /* renamed from: s */
        public final int f8995s;

        public b(b bVar, C1999q.h hVar) {
            super(bVar.f8996c, bVar.f8997e, hVar);
            this.f8995s = bVar.f8995s;
        }

        public b(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            super(C1986d0.m4653b(abstractC2003u), abstractC2003u2, null);
            this.f8995s = abstractC2003u.hashCode();
        }

        @Override // p165u6.C1999q.h
        /* renamed from: b */
        public final int mo4660b(int i7) {
            C1998p c1998p = C1999q.f9045h2;
            return (Integer.MAX_VALUE & this.f8995s) % i7;
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: c */
        public final c mo4661c(C1999q.h hVar) {
            return new b(this, hVar);
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: g */
        public final C1999q.h mo4662g(AbstractC2003u abstractC2003u) {
            this.f8997e = abstractC2003u;
            return this;
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: i */
        public final AbstractC2003u mo4663i() {
            return C1986d0.m4652a(this.f8996c);
        }
    }

    /* renamed from: u6.d0$c */
    public static abstract class c implements C1999q.h {

        /* renamed from: c */
        public Object f8996c;

        /* renamed from: e */
        public Object f8997e;

        /* renamed from: m */
        public C1999q.h f8998m;

        public c(Object obj, Object obj2, C1999q.h hVar) {
            this.f8996c = obj;
            this.f8997e = obj2;
            this.f8998m = hVar;
        }

        /* renamed from: c */
        public abstract c mo4661c(C1999q.h hVar);

        @Override // p165u6.C1999q.h
        /* renamed from: d */
        public final C1999q.h mo4665d(C1999q.h hVar) {
            C1999q.h hVar2 = this.f8998m;
            if (hVar2 != null) {
                hVar = hVar2.mo4665d(hVar);
            }
            this.f8998m = hVar;
            return (mo4663i() == null || mo4664n() == null) ? this.f8998m : this;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: e */
        public final C1999q.h mo4666e(C1999q.h hVar) {
            return (mo4663i() == null || mo4664n() == null) ? hVar : (hVar == null && this.f8998m == null) ? this : mo4661c(hVar);
        }

        @Override // p165u6.C1999q.h
        /* renamed from: f */
        public final C1999q.h mo4667f(C1999q.i iVar, AbstractC2003u abstractC2003u) {
            AbstractC2003u mo4663i = mo4663i();
            if (mo4663i != null && iVar.mo4672o(mo4663i) != null) {
                return mo4662g(abstractC2003u);
            }
            if (mo4663i == null) {
                return this.f8998m.mo4667f(iVar, abstractC2003u);
            }
            this.f8998m = this.f8998m.mo4667f(iVar, abstractC2003u);
            return this;
        }

        @Override // p165u6.C1999q.h
        public final C1999q.i first() {
            AbstractC2003u mo4663i = mo4663i();
            AbstractC2003u mo4664n = mo4664n();
            if (mo4663i != null && mo4664n != null) {
                return new C1999q.f(mo4663i, mo4664n);
            }
            this.f8996c = null;
            this.f8997e = null;
            return null;
        }

        /* renamed from: g */
        public abstract C1999q.h mo4662g(AbstractC2003u abstractC2003u);

        @Override // p165u6.C1999q.h
        /* renamed from: h */
        public final C1999q.h mo4668h(C1999q.i iVar) {
            AbstractC2003u mo4663i = mo4663i();
            if (mo4663i == null) {
                return this.f8998m.mo4668h(iVar);
            }
            if (iVar.mo4670l(mo4663i)) {
                this.f8997e = null;
                return this;
            }
            this.f8998m = this.f8998m.mo4668h(iVar);
            return this;
        }

        /* renamed from: i */
        public AbstractC2003u mo4663i() {
            return (AbstractC2003u) this.f8996c;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: k */
        public final C1999q.h mo4669k() {
            return this.f8998m;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: l */
        public final boolean mo4670l(AbstractC2003u abstractC2003u) {
            C1999q.i first = first();
            return first != null && abstractC2003u.mo4674Q1(((C1999q.f) first).f9065e);
        }

        @Override // p165u6.C1999q.h
        /* renamed from: m */
        public final int mo4671m(int i7) {
            return 0;
        }

        /* renamed from: n */
        public AbstractC2003u mo4664n() {
            return (AbstractC2003u) this.f8997e;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: o */
        public final C1999q.i mo4672o(AbstractC2003u abstractC2003u) {
            C1999q.i first = first();
            if (first != null) {
                return ((C1999q.b) first).mo4672o(abstractC2003u);
            }
            return null;
        }
    }

    /* renamed from: u6.d0$d */
    public static final class d extends e {

        /* renamed from: d2 */
        public final WeakReference f8999d2;

        /* renamed from: e2 */
        public final AbstractC2003u f9000e2;

        public d(AbstractC2003u abstractC2003u) {
            super(abstractC2003u);
            this.f8999d2 = new WeakReference(abstractC2003u.mo4851s2());
            this.f9000e2 = abstractC2003u.mo4681M0();
        }

        @Override // p165u6.C1986d0.e, p165u6.AbstractC2003u
        /* renamed from: h2 */
        public final AbstractC2003u mo4673h2() {
            Object obj = this.f9001c2.get();
            if (obj != null) {
                return (AbstractC2003u) obj;
            }
            Object obj2 = this.f8999d2.get();
            if (obj2 == null) {
                return null;
            }
            C2001s c2001s = new C2001s(obj2, this.f9000e2);
            this.f9001c2 = new WeakReference(c2001s);
            return c2001s;
        }
    }

    /* renamed from: u6.d0$e */
    public static class e extends AbstractC2003u {

        /* renamed from: c2 */
        public WeakReference f9001c2;

        public e(AbstractC2003u abstractC2003u) {
            this.f9001c2 = new WeakReference(abstractC2003u);
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: Q1 */
        public final boolean mo4674Q1(AbstractC2003u abstractC2003u) {
            Object obj = this.f9001c2.get();
            return obj != null && abstractC2003u.mo4674Q1((AbstractC2003u) obj);
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: h2 */
        public AbstractC2003u mo4673h2() {
            return (AbstractC2003u) this.f9001c2.get();
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: t2 */
        public final int mo4675t2() {
            throw new C1991i("illegal operation 'type' for weak value");
        }

        @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
        public final String toString() {
            return "weak<" + this.f9001c2.get() + ">";
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: u2 */
        public final String mo4676u2() {
            throw new C1991i("illegal operation 'typename' for weak value");
        }
    }

    /* renamed from: u6.d0$f */
    public static class f extends c {
        public f(f fVar, C1999q.h hVar) {
            super(fVar.f8996c, fVar.f8997e, hVar);
        }

        public f(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            super(abstractC2003u, C1986d0.m4653b(abstractC2003u2), null);
        }

        @Override // p165u6.C1999q.h
        /* renamed from: b */
        public final int mo4660b(int i7) {
            return C1999q.m4828J2(i7, (AbstractC2003u) this.f8996c);
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: c */
        public final c mo4661c(C1999q.h hVar) {
            return new f(this, hVar);
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: g */
        public final C1999q.h mo4662g(AbstractC2003u abstractC2003u) {
            this.f8997e = C1986d0.m4653b(abstractC2003u);
            return this;
        }

        @Override // p165u6.C1986d0.c
        /* renamed from: n */
        public final AbstractC2003u mo4664n() {
            return C1986d0.m4652a(this.f8997e);
        }
    }

    public C1986d0(boolean z6, boolean z7, AbstractC2003u abstractC2003u) {
        this.f8991c = z6;
        this.f8992e = z7;
        this.f8993m = abstractC2003u;
    }

    /* renamed from: a */
    public static AbstractC2003u m4652a(Object obj) {
        if (obj instanceof WeakReference) {
            obj = ((WeakReference) obj).get();
        }
        return obj instanceof e ? ((e) obj).mo4673h2() : (AbstractC2003u) obj;
    }

    /* renamed from: b */
    public static AbstractC2003u m4653b(AbstractC2003u abstractC2003u) {
        int mo4675t2 = abstractC2003u.mo4675t2();
        if (mo4675t2 != 5 && mo4675t2 != 6) {
            if (mo4675t2 == 7) {
                return new d(abstractC2003u);
            }
            if (mo4675t2 != 8) {
                return abstractC2003u;
            }
        }
        return new e(abstractC2003u);
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: c */
    public final AbstractC2003u mo4654c() {
        return this.f8993m;
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: g */
    public final boolean mo4655g() {
        return this.f8991c;
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: i */
    public final AbstractC2003u mo4656i(AbstractC2003u[] abstractC2003uArr, int i7) {
        AbstractC2003u abstractC2003u = abstractC2003uArr[i7];
        if (abstractC2003u != null && (abstractC2003u = m4652a(abstractC2003u)) == null) {
            abstractC2003uArr[i7] = null;
        }
        return abstractC2003u;
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: n */
    public final C1999q.h mo4657n(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        AbstractC2003u mo4673h2 = abstractC2003u2.mo4673h2();
        if (mo4673h2 == null) {
            return null;
        }
        boolean z6 = this.f8991c;
        boolean z7 = this.f8992e;
        return (!z6 || abstractC2003u.mo4808e1() || abstractC2003u.mo4809f1() || (abstractC2003u instanceof C1988f)) ? (!z7 || mo4673h2.mo4808e1() || mo4673h2.mo4809f1() || (mo4673h2 instanceof C1988f)) ? C1999q.m4827F2(abstractC2003u, mo4673h2) : new f(abstractC2003u, mo4673h2) : (!z7 || mo4673h2.mo4808e1() || mo4673h2.mo4809f1() || (mo4673h2 instanceof C1988f)) ? new b(abstractC2003u, mo4673h2) : new a(abstractC2003u, mo4673h2);
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: p */
    public final AbstractC2003u mo4658p(AbstractC2003u abstractC2003u) {
        return this.f8992e ? m4653b(abstractC2003u) : abstractC2003u;
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: r */
    public final boolean mo4659r() {
        return this.f8992e;
    }
}
