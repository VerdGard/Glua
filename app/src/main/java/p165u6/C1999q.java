package p165u6;

import android.ext.C0090b;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Vector;
import p165u6.AbstractC2003u;

/* renamed from: u6.q */
/* loaded from: classes.dex */
public class C1999q extends AbstractC2003u implements InterfaceC2004v {

    /* renamed from: h2 */
    public static final C1998p f9045h2 = C1998p.m4815M2("n");

    /* renamed from: i2 */
    public static volatile HashSet f9046i2 = null;

    /* renamed from: j2 */
    public static volatile int f9047j2 = 0;

    /* renamed from: k2 */
    public static final h[] f9048k2 = new h[0];

    /* renamed from: c2 */
    public AbstractC2003u[] f9049c2;

    /* renamed from: d2 */
    public h[] f9050d2;

    /* renamed from: e2 */
    public int f9051e2;

    /* renamed from: f2 */
    public InterfaceC2004v f9052f2;

    /* renamed from: g2 */
    public boolean f9053g2;

    /* renamed from: u6.q$a */
    public static class a implements h {

        /* renamed from: c */
        public final Object f9054c;

        /* renamed from: e */
        public h f9055e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.ref.WeakReference] */
        public a(AbstractC2003u abstractC2003u, h hVar) {
            C1998p c1998p = C1999q.f9045h2;
            int mo4675t2 = abstractC2003u.mo4675t2();
            boolean z6 = true;
            if (mo4675t2 == 1 || mo4675t2 == 3 || (mo4675t2 == 4 && abstractC2003u.mo4784S1() <= 32)) {
                z6 = false;
            }
            this.f9054c = z6 ? new WeakReference(abstractC2003u) : abstractC2003u;
            this.f9055e = hVar;
        }

        /* renamed from: a */
        public final AbstractC2003u m4840a() {
            Object obj = this.f9054c;
            if (obj instanceof WeakReference) {
                obj = ((WeakReference) obj).get();
            }
            return (AbstractC2003u) obj;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: b */
        public final int mo4660b(int i7) {
            return 0;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: d */
        public final h mo4665d(h hVar) {
            h hVar2 = this.f9055e;
            return hVar2 != null ? hVar2.mo4665d(hVar) : hVar;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: e */
        public final h mo4666e(h hVar) {
            return hVar;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: f */
        public final h mo4667f(i iVar, AbstractC2003u abstractC2003u) {
            h hVar = this.f9055e;
            h mo4667f = hVar != null ? hVar.mo4667f(iVar, abstractC2003u) : null;
            if (m4840a() == null) {
                return mo4667f;
            }
            this.f9055e = mo4667f;
            return this;
        }

        @Override // p165u6.C1999q.h
        public final i first() {
            return null;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: h */
        public final h mo4668h(i iVar) {
            if (m4840a() == null) {
                return this.f9055e;
            }
            this.f9055e = this.f9055e.mo4668h(iVar);
            return this;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: k */
        public final h mo4669k() {
            return this.f9055e;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: l */
        public final boolean mo4670l(AbstractC2003u abstractC2003u) {
            AbstractC2003u m4840a = m4840a();
            return m4840a != null && abstractC2003u.mo4674Q1(m4840a);
        }

        @Override // p165u6.C1999q.h
        /* renamed from: m */
        public final int mo4671m(int i7) {
            return -1;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: o */
        public final i mo4672o(AbstractC2003u abstractC2003u) {
            return null;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("<dead");
            AbstractC2003u m4840a = m4840a();
            if (m4840a != null) {
                stringBuffer.append(": ");
                stringBuffer.append(m4840a.toString());
            }
            stringBuffer.append('>');
            if (this.f9055e != null) {
                stringBuffer.append("; ");
                stringBuffer.append(this.f9055e.toString());
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: u6.q$b */
    public static abstract class b extends AbstractC1984c0 implements i {
        @Override // p165u6.AbstractC1984c0
        /* renamed from: I */
        public final int mo4621I() {
            return 2;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: L */
        public final AbstractC1984c0 mo4622L(int i7) {
            return i7 != 1 ? i7 != 2 ? AbstractC2003u.f9124Y : value() : this;
        }

        /* renamed from: O */
        public abstract b mo4841O(AbstractC2003u abstractC2003u);

        @Override // p165u6.C1999q.i
        /* renamed from: a */
        public abstract AbstractC2003u mo4842a();

        @Override // p165u6.C1999q.h
        /* renamed from: b */
        public abstract int mo4660b(int i7);

        @Override // p165u6.C1999q.h
        /* renamed from: d */
        public final h mo4665d(h hVar) {
            return new e(this, hVar);
        }

        @Override // p165u6.C1999q.h
        /* renamed from: e */
        public final h mo4666e(h hVar) {
            return hVar != null ? new e(this, hVar) : this;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: f */
        public final h mo4667f(i iVar, AbstractC2003u abstractC2003u) {
            return mo4841O(abstractC2003u);
        }

        @Override // p165u6.C1999q.h
        public final i first() {
            return this;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: h */
        public final h mo4668h(i iVar) {
            return new a(mo4842a(), null);
        }

        @Override // p165u6.C1999q.i
        /* renamed from: j */
        public AbstractC1984c0 mo4843j() {
            return AbstractC2003u.m4867y2(mo4842a(), value());
        }

        @Override // p165u6.C1999q.h
        /* renamed from: k */
        public final h mo4669k() {
            return null;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: l */
        public abstract boolean mo4670l(AbstractC2003u abstractC2003u);

        @Override // p165u6.C1999q.h
        /* renamed from: m */
        public int mo4671m(int i7) {
            return 0;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: o */
        public final i mo4672o(AbstractC2003u abstractC2003u) {
            if (mo4670l(abstractC2003u)) {
                return this;
            }
            return null;
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: t */
        public final AbstractC2003u mo4623t(int i7) {
            return i7 != 1 ? i7 != 2 ? AbstractC2003u.f9130m : value() : mo4842a();
        }

        @Override // p165u6.AbstractC1984c0
        /* renamed from: u */
        public final AbstractC2003u mo4624u() {
            return mo4842a();
        }

        @Override // p165u6.C1999q.i
        public abstract AbstractC2003u value();
    }

    /* renamed from: u6.q$c */
    public static class c extends b {

        /* renamed from: e */
        public final int f9056e;

        /* renamed from: m */
        public AbstractC2003u f9057m;

        public c(int i7, AbstractC2003u abstractC2003u) {
            this.f9056e = i7;
            this.f9057m = abstractC2003u;
        }

        @Override // p165u6.C1999q.b
        /* renamed from: O */
        public final b mo4841O(AbstractC2003u abstractC2003u) {
            this.f9057m = abstractC2003u;
            return this;
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.i
        /* renamed from: a */
        public final AbstractC2003u mo4842a() {
            return C1993k.m4765C2(this.f9056e);
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.h
        /* renamed from: b */
        public final int mo4660b(int i7) {
            C1993k[] c1993kArr = C1993k.f9023e2;
            return (Integer.MAX_VALUE & this.f9056e) % i7;
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.h
        /* renamed from: l */
        public final boolean mo4670l(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4709N1(this.f9056e);
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.h
        /* renamed from: m */
        public final int mo4671m(int i7) {
            int i8 = this.f9056e;
            if (i8 < 1 || i8 > i7) {
                return 0;
            }
            return i8;
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.i
        public final AbstractC2003u value() {
            return this.f9057m;
        }
    }

    /* renamed from: u6.q$d */
    public class d {

        /* renamed from: d */
        public final C1999q f9061d;

        /* renamed from: b */
        public int f9059b = -1;

        /* renamed from: c */
        public h f9060c = null;

        /* renamed from: a */
        public i f9058a = null;

        public d(C1999q c1999q) {
            this.f9061d = c1999q;
        }

        /* renamed from: a */
        public final AbstractC2003u m4844a() {
            i iVar = this.f9058a;
            return iVar != null ? iVar.mo4842a() : C1995m.m4798F2(this.f9059b + 1);
        }

        /* renamed from: b */
        public final boolean m4845b() {
            InterfaceC2004v interfaceC2004v;
            i first;
            h hVar = this.f9060c;
            while (hVar != null) {
                hVar = hVar.mo4669k();
                if (hVar != null && (first = hVar.first()) != null) {
                    this.f9060c = hVar;
                    this.f9058a = first;
                    return true;
                }
            }
            this.f9060c = null;
            this.f9058a = null;
            int i7 = this.f9059b + 1;
            while (true) {
                C1999q c1999q = C1999q.this;
                AbstractC2003u[] abstractC2003uArr = c1999q.f9049c2;
                if (i7 >= abstractC2003uArr.length) {
                    int length = i7 - abstractC2003uArr.length;
                    while (true) {
                        h[] hVarArr = c1999q.f9050d2;
                        if (length >= hVarArr.length) {
                            return false;
                        }
                        for (h hVar2 = hVarArr[length]; hVar2 != null; hVar2 = hVar2.mo4669k()) {
                            i first2 = hVar2.first();
                            if (first2 != null) {
                                this.f9059b = c1999q.f9049c2.length + length;
                                this.f9060c = hVar2;
                                this.f9058a = first2;
                                return true;
                            }
                        }
                        length++;
                    }
                } else if (abstractC2003uArr[i7] == null || ((interfaceC2004v = this.f9061d.f9052f2) != null && interfaceC2004v.mo4656i(abstractC2003uArr, i7) == null)) {
                    i7++;
                }
            }
            this.f9059b = i7;
            return true;
        }

        /* renamed from: c */
        public final AbstractC2003u m4846c() {
            i iVar = this.f9058a;
            if (iVar != null) {
                return iVar.value();
            }
            InterfaceC2004v interfaceC2004v = this.f9061d.f9052f2;
            C1999q c1999q = C1999q.this;
            return interfaceC2004v == null ? c1999q.f9049c2[this.f9059b] : interfaceC2004v.mo4656i(c1999q.f9049c2, this.f9059b);
        }
    }

    /* renamed from: u6.q$e */
    public static class e implements i {

        /* renamed from: c */
        public b f9063c;

        /* renamed from: e */
        public h f9064e;

        public e(b bVar, h hVar) {
            this.f9063c = bVar;
            this.f9064e = hVar;
        }

        @Override // p165u6.C1999q.i
        /* renamed from: a */
        public final AbstractC2003u mo4842a() {
            return this.f9063c.mo4842a();
        }

        @Override // p165u6.C1999q.h
        /* renamed from: b */
        public final int mo4660b(int i7) {
            return this.f9063c.mo4660b(i7);
        }

        @Override // p165u6.C1999q.h
        /* renamed from: d */
        public final h mo4665d(h hVar) {
            h mo4665d = this.f9064e.mo4665d(hVar);
            if (mo4665d == null) {
                return this.f9063c;
            }
            this.f9064e = mo4665d;
            return this;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: e */
        public final h mo4666e(h hVar) {
            return hVar != null ? new e(this.f9063c, hVar) : this.f9063c;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: f */
        public final h mo4667f(i iVar, AbstractC2003u abstractC2003u) {
            if (iVar == this) {
                this.f9063c = this.f9063c.mo4841O(abstractC2003u);
                return this;
            }
            h mo4667f = this.f9064e.mo4667f(iVar, abstractC2003u);
            if (mo4667f == null) {
                return this.f9063c;
            }
            this.f9064e = mo4667f;
            return this;
        }

        @Override // p165u6.C1999q.h
        public final i first() {
            return this.f9063c;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: h */
        public final h mo4668h(i iVar) {
            if (this == iVar) {
                return new a(mo4842a(), this.f9064e);
            }
            this.f9064e = this.f9064e.mo4668h(iVar);
            return this;
        }

        @Override // p165u6.C1999q.i
        /* renamed from: j */
        public final AbstractC1984c0 mo4843j() {
            return this.f9063c.mo4843j();
        }

        @Override // p165u6.C1999q.h
        /* renamed from: k */
        public final h mo4669k() {
            return this.f9064e;
        }

        @Override // p165u6.C1999q.h
        /* renamed from: l */
        public final boolean mo4670l(AbstractC2003u abstractC2003u) {
            return this.f9063c.mo4670l(abstractC2003u);
        }

        @Override // p165u6.C1999q.h
        /* renamed from: m */
        public final int mo4671m(int i7) {
            return this.f9063c.mo4671m(i7);
        }

        @Override // p165u6.C1999q.h
        /* renamed from: o */
        public final i mo4672o(AbstractC2003u abstractC2003u) {
            if (this.f9063c.mo4670l(abstractC2003u)) {
                return this;
            }
            return null;
        }

        public final String toString() {
            return this.f9063c + "; " + this.f9064e;
        }

        @Override // p165u6.C1999q.i
        public final AbstractC2003u value() {
            return this.f9063c.value();
        }
    }

    /* renamed from: u6.q$f */
    public static class f extends b {

        /* renamed from: e */
        public final AbstractC2003u f9065e;

        /* renamed from: m */
        public AbstractC2003u f9066m;

        public f(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            this.f9065e = abstractC2003u;
            this.f9066m = abstractC2003u2;
        }

        @Override // p165u6.C1999q.b
        /* renamed from: O */
        public final b mo4841O(AbstractC2003u abstractC2003u) {
            this.f9066m = abstractC2003u;
            return this;
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.i
        /* renamed from: a */
        public final AbstractC2003u mo4842a() {
            return this.f9065e;
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.h
        /* renamed from: b */
        public final int mo4660b(int i7) {
            return C1999q.m4828J2(i7, this.f9065e);
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.i
        /* renamed from: j */
        public final AbstractC1984c0 mo4843j() {
            return this;
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.h
        /* renamed from: l */
        public final boolean mo4670l(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4674Q1(this.f9065e);
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.i
        public final AbstractC2003u value() {
            return this.f9066m;
        }
    }

    /* renamed from: u6.q$g */
    public static class g extends b {

        /* renamed from: e */
        public double f9067e;

        /* renamed from: m */
        public final AbstractC2003u f9068m;

        public g(AbstractC2003u abstractC2003u, double d7) {
            this.f9068m = abstractC2003u;
            this.f9067e = d7;
        }

        @Override // p165u6.C1999q.b
        /* renamed from: O */
        public final b mo4841O(AbstractC2003u abstractC2003u) {
            if (abstractC2003u.mo4675t2() == 3) {
                AbstractC2003u mo4750q2 = abstractC2003u.mo4750q2();
                if (!mo4750q2.mo4804d1()) {
                    this.f9067e = mo4750q2.mo4744n2();
                    return this;
                }
            }
            return new f(this.f9068m, abstractC2003u);
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.i
        /* renamed from: a */
        public final AbstractC2003u mo4842a() {
            return this.f9068m;
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.h
        /* renamed from: b */
        public final int mo4660b(int i7) {
            return C1999q.m4828J2(i7, this.f9068m);
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.h
        /* renamed from: l */
        public final boolean mo4670l(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4674Q1(this.f9068m);
        }

        @Override // p165u6.C1999q.b, p165u6.C1999q.i
        public final AbstractC2003u value() {
            return C1990h.m4698E2(this.f9067e);
        }
    }

    /* renamed from: u6.q$h */
    public interface h {
        /* renamed from: b */
        int mo4660b(int i7);

        /* renamed from: d */
        h mo4665d(h hVar);

        /* renamed from: e */
        h mo4666e(h hVar);

        /* renamed from: f */
        h mo4667f(i iVar, AbstractC2003u abstractC2003u);

        i first();

        /* renamed from: h */
        h mo4668h(i iVar);

        /* renamed from: k */
        h mo4669k();

        /* renamed from: l */
        boolean mo4670l(AbstractC2003u abstractC2003u);

        /* renamed from: m */
        int mo4671m(int i7);

        /* renamed from: o */
        i mo4672o(AbstractC2003u abstractC2003u);
    }

    /* renamed from: u6.q$i */
    public interface i extends h {
        /* renamed from: a */
        AbstractC2003u mo4842a();

        /* renamed from: j */
        AbstractC1984c0 mo4843j();

        AbstractC2003u value();
    }

    public C1999q() {
        this.f9049c2 = AbstractC2003u.f9133x1;
        this.f9050d2 = f9048k2;
    }

    public C1999q(int i7, int i8) {
        m4835Q2(i7, i8);
    }

    public C1999q(AbstractC1984c0 abstractC1984c0) {
        int max = Math.max(abstractC1984c0.mo4621I() - 0, 0);
        m4835Q2(max, 1);
        mo4790Y1(f9045h2, C1993k.m4765C2(max));
        for (int i7 = 1; i7 <= max; i7++) {
            mo4788W1(i7, abstractC1984c0.mo4623t(i7 + 0));
        }
    }

    public C1999q(C1999q c1999q) {
        AbstractC2003u[] abstractC2003uArr = c1999q.f9049c2;
        this.f9049c2 = (AbstractC2003u[]) Arrays.copyOf(abstractC2003uArr, abstractC2003uArr.length);
        h[] hVarArr = c1999q.f9050d2;
        this.f9050d2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length);
    }

    public C1999q(AbstractC2003u[] abstractC2003uArr) {
        int length = abstractC2003uArr.length;
        m4835Q2(0, length >> 1);
        for (int i7 = 0; i7 < length; i7 += 2) {
            int i8 = i7 + 1;
            if (!abstractC2003uArr[i8].mo4804d1()) {
                mo4787V1(abstractC2003uArr[i7], abstractC2003uArr[i8]);
            }
        }
    }

    /* renamed from: F2 */
    public static b m4827F2(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        return abstractC2003u.mo4726b1() ? new c(abstractC2003u.mo4747o2(), abstractC2003u2) : abstractC2003u2.mo4675t2() == 3 ? new g(abstractC2003u, abstractC2003u2.mo4744n2()) : new f(abstractC2003u, abstractC2003u2);
    }

    /* renamed from: J2 */
    public static int m4828J2(int i7, AbstractC2003u abstractC2003u) {
        int mo4675t2 = abstractC2003u.mo4675t2();
        return (mo4675t2 == 2 || mo4675t2 == 3 || mo4675t2 == 5 || mo4675t2 == 7 || mo4675t2 == 8) ? (abstractC2003u.hashCode() & Integer.MAX_VALUE) % i7 : i7 & abstractC2003u.hashCode();
    }

    /* renamed from: P2 */
    public static int m4829P2(int i7) {
        int i8;
        int i9 = i7 - 1;
        if (i9 < 0) {
            return Integer.MIN_VALUE;
        }
        if (((-65536) & i9) != 0) {
            i9 >>>= 16;
            i8 = 16;
        } else {
            i8 = 0;
        }
        if ((65280 & i9) != 0) {
            i8 += 8;
            i9 >>>= 8;
        }
        if ((i9 & 240) != 0) {
            i8 += 4;
            i9 >>>= 4;
        }
        switch (i9) {
            case 0:
                return 0;
            case 1:
                return i8 + 1;
            case 2:
            case 3:
                return i8 + 2;
            case 4:
            case 5:
            case 6:
            case 7:
                return i8 + 3;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i8 + 4;
            default:
                return i8;
        }
    }

    /* renamed from: C2 */
    public final boolean m4830C2(int i7, AbstractC2003u abstractC2003u) {
        if (i7 <= 0) {
            return false;
        }
        AbstractC2003u[] abstractC2003uArr = this.f9049c2;
        if (i7 > abstractC2003uArr.length) {
            return false;
        }
        int i8 = i7 - 1;
        if (abstractC2003u.mo4804d1()) {
            abstractC2003u = null;
        } else {
            InterfaceC2004v interfaceC2004v = this.f9052f2;
            if (interfaceC2004v != null) {
                abstractC2003u = interfaceC2004v.mo4658p(abstractC2003u);
            }
        }
        abstractC2003uArr[i8] = abstractC2003u;
        return true;
    }

    /* renamed from: D2 */
    public final boolean m4831D2(int i7, int i8, AbstractC2003u abstractC2003u) {
        AbstractC2003u mo4776J0 = mo4776J0(i7);
        AbstractC2003u mo4776J02 = mo4776J0(i8);
        if (mo4776J0 == null || mo4776J02 == null) {
            return false;
        }
        return abstractC2003u != null ? abstractC2003u.mo4692g0(mo4776J0, mo4776J02).mo4682m2() : mo4776J0.mo4739l1(mo4776J02);
    }

    /* renamed from: E2 */
    public C1998p mo4772E2(C1998p c1998p, int i7, int i8) {
        C1979a c1979a = new C1979a();
        if (i7 <= i8) {
            while (true) {
                c1979a.m4616c(mo4776J0(i7).mo4753s0());
                i7++;
                if (i7 > i8) {
                    break;
                }
                c1979a.m4616c(c1998p);
            }
        }
        return c1979a.m4619f();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: F1 */
    public C1999q mo4773F1() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: G0 */
    public boolean mo4704G0(AbstractC2003u abstractC2003u) {
        AbstractC2003u mo4681M0;
        if (this == abstractC2003u) {
            return true;
        }
        return this.f9052f2 != null && abstractC2003u.mo4839g1() && (mo4681M0 = abstractC2003u.mo4681M0()) != null && AbstractC2003u.m4860H0(this, this.f9052f2.mo4654c(), abstractC2003u, mo4681M0);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e2  */
    /* renamed from: G2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4832G2(java.lang.String r28, java.lang.Appendable r29) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p165u6.C1999q.m4832G2(java.lang.String, java.lang.Appendable):void");
    }

    /* renamed from: H2 */
    public int mo4774H2() {
        return this.f9049c2.length;
    }

    /* renamed from: I2 */
    public int mo4775I2() {
        return this.f9050d2.length;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: J0 */
    public AbstractC2003u mo4776J0(int i7) {
        AbstractC2003u mo4783R2 = mo4783R2(i7);
        return (!mo4783R2.mo4804d1() || this.f9052f2 == null) ? mo4783R2 : AbstractC2003u.m4862N0(this, C1993k.m4765C2(i7));
    }

    /* renamed from: K2 */
    public final AbstractC2003u m4833K2(AbstractC2003u abstractC2003u) {
        if (this.f9051e2 > 0) {
            for (h hVar = this.f9050d2[m4828J2(r0.length - 1, abstractC2003u)]; hVar != null; hVar = hVar.mo4669k()) {
                i mo4672o = hVar.mo4672o(abstractC2003u);
                if (mo4672o != null) {
                    return mo4672o.value();
                }
            }
        }
        return AbstractC2003u.f9130m;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: L0 */
    public AbstractC2003u mo4777L0(AbstractC2003u abstractC2003u) {
        AbstractC2003u mo4782R1 = mo4782R1(abstractC2003u);
        return (!mo4782R1.mo4804d1() || this.f9052f2 == null) ? mo4782R1 : AbstractC2003u.m4862N0(this, abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: L1 */
    public void mo4778L1(int i7) {
        AbstractC2003u[] abstractC2003uArr = this.f9049c2;
        if (i7 > abstractC2003uArr.length) {
            AbstractC2003u[] abstractC2003uArr2 = new AbstractC2003u[1 << m4829P2(i7)];
            System.arraycopy(abstractC2003uArr, 0, abstractC2003uArr2, 0, abstractC2003uArr.length);
            this.f9049c2 = abstractC2003uArr2;
        }
    }

    /* renamed from: L2 */
    public final void m4834L2(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        int i7;
        if (abstractC2003u2.mo4804d1()) {
            if (this.f9050d2.length > 0) {
                int m4828J2 = m4828J2(r8.length - 1, abstractC2003u);
                for (h hVar = this.f9050d2[m4828J2]; hVar != null; hVar = hVar.mo4669k()) {
                    i mo4672o = hVar.mo4672o(abstractC2003u);
                    if (mo4672o != null) {
                        h[] hVarArr = this.f9050d2;
                        hVarArr[m4828J2] = hVarArr[m4828J2].mo4668h(mo4672o);
                        this.f9051e2--;
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (this.f9050d2.length > 0) {
            i7 = m4828J2(r0.length - 1, abstractC2003u);
            for (h hVar2 = this.f9050d2[i7]; hVar2 != null; hVar2 = hVar2.mo4669k()) {
                i mo4672o2 = hVar2.mo4672o(abstractC2003u);
                if (mo4672o2 != null) {
                    h[] hVarArr2 = this.f9050d2;
                    hVarArr2[i7] = hVarArr2[i7].mo4667f(mo4672o2, abstractC2003u2);
                    return;
                }
            }
        } else {
            i7 = 0;
        }
        if (this.f9051e2 >= this.f9050d2.length) {
            InterfaceC2004v interfaceC2004v = this.f9052f2;
            if ((interfaceC2004v == null || !interfaceC2004v.mo4659r()) && abstractC2003u.mo4726b1() && abstractC2003u.mo4747o2() > 0) {
                m4836T2(abstractC2003u.mo4747o2());
                if (m4830C2(abstractC2003u.mo4747o2(), abstractC2003u2)) {
                    return;
                }
            } else {
                m4836T2(-1);
            }
            i7 = m4828J2(this.f9050d2.length - 1, abstractC2003u);
        }
        InterfaceC2004v interfaceC2004v2 = this.f9052f2;
        h mo4657n = interfaceC2004v2 != null ? interfaceC2004v2.mo4657n(abstractC2003u, abstractC2003u2) : m4827F2(abstractC2003u, abstractC2003u2);
        h[] hVarArr3 = this.f9050d2;
        h hVar3 = hVarArr3[i7];
        if (hVar3 != null) {
            mo4657n = hVar3.mo4665d(mo4657n);
        }
        hVarArr3[i7] = mo4657n;
        this.f9051e2++;
    }

    @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        try {
            return m4838X2(new StringBuilder());
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M0 */
    public AbstractC2003u mo4681M0() {
        InterfaceC2004v interfaceC2004v = this.f9052f2;
        if (interfaceC2004v != null) {
            return interfaceC2004v.mo4654c();
        }
        return null;
    }

    /* renamed from: M2 */
    public AbstractC1984c0 mo4779M2(AbstractC2003u abstractC2003u) {
        int mo4740m0 = abstractC2003u.mo4740m0() + 1;
        AbstractC2003u mo4783R2 = mo4783R2(mo4740m0);
        return mo4783R2.mo4804d1() ? AbstractC2003u.f9124Y : AbstractC2003u.m4867y2(C1993k.m4765C2(mo4740m0), mo4783R2);
    }

    /* renamed from: N2 */
    public void mo4780N2(int i7, AbstractC2003u abstractC2003u) {
        if (i7 == 0) {
            i7 = mo4794k1() + 1;
        }
        while (!abstractC2003u.mo4804d1()) {
            AbstractC2003u mo4776J0 = mo4776J0(i7);
            mo4788W1(i7, abstractC2003u);
            abstractC2003u = mo4776J0;
            i7++;
        }
    }

    /* renamed from: O2 */
    public AbstractC2003u[] mo4781O2() {
        Vector vector = new Vector();
        AbstractC2003u abstractC2003u = AbstractC2003u.f9130m;
        while (true) {
            abstractC2003u = mo4796x1(abstractC2003u).mo4624u();
            if (abstractC2003u.mo4804d1()) {
                AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[vector.size()];
                vector.copyInto(abstractC2003uArr);
                return abstractC2003uArr;
            }
            vector.addElement(abstractC2003u);
        }
    }

    /* renamed from: Q2 */
    public final void m4835Q2(int i7, int i8) {
        if (i8 > 0 && i8 < 2) {
            i8 = 2;
        }
        this.f9049c2 = i7 > 0 ? new AbstractC2003u[1 << m4829P2(i7)] : AbstractC2003u.f9133x1;
        this.f9050d2 = i8 > 0 ? new h[1 << m4829P2(i8)] : f9048k2;
        this.f9051e2 = 0;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: R1 */
    public AbstractC2003u mo4782R1(AbstractC2003u abstractC2003u) {
        int mo4747o2;
        if (abstractC2003u.mo4726b1() && (mo4747o2 = abstractC2003u.mo4747o2()) > 0) {
            AbstractC2003u[] abstractC2003uArr = this.f9049c2;
            if (mo4747o2 <= abstractC2003uArr.length) {
                InterfaceC2004v interfaceC2004v = this.f9052f2;
                int i7 = mo4747o2 - 1;
                AbstractC2003u mo4656i = interfaceC2004v == null ? abstractC2003uArr[i7] : interfaceC2004v.mo4656i(abstractC2003uArr, i7);
                return mo4656i != null ? mo4656i : AbstractC2003u.f9130m;
            }
        }
        return m4833K2(abstractC2003u);
    }

    /* renamed from: R2 */
    public AbstractC2003u mo4783R2(int i7) {
        if (i7 > 0) {
            AbstractC2003u[] abstractC2003uArr = this.f9049c2;
            if (i7 <= abstractC2003uArr.length) {
                InterfaceC2004v interfaceC2004v = this.f9052f2;
                int i8 = i7 - 1;
                AbstractC2003u mo4656i = interfaceC2004v == null ? abstractC2003uArr[i8] : interfaceC2004v.mo4656i(abstractC2003uArr, i8);
                return mo4656i != null ? mo4656i : AbstractC2003u.f9130m;
            }
        }
        return m4833K2(C1993k.m4765C2(i7));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: S1 */
    public int mo4784S1() {
        int mo4774H2 = mo4774H2();
        int i7 = mo4774H2 + 1;
        int i8 = 0;
        while (!mo4783R2(i7).mo4804d1()) {
            i8 = i7;
            i7 = mo4775I2() + mo4774H2 + 1 + i7;
        }
        while (i7 > i8 + 1) {
            int i9 = (i7 + i8) / 2;
            if (mo4783R2(i9).mo4804d1()) {
                i7 = i9;
            } else {
                i8 = i9;
            }
        }
        return i8;
    }

    /* renamed from: S2 */
    public void mo4785S2(int i7, AbstractC2003u abstractC2003u) {
        if (this.f9053g2) {
            throw new C1991i("can not be set a const table");
        }
        if (m4830C2(i7, abstractC2003u)) {
            return;
        }
        m4834L2(C1993k.m4765C2(i7), abstractC2003u);
    }

    /* renamed from: T2 */
    public final void m4836T2(int i7) {
        AbstractC2003u[] abstractC2003uArr;
        h[] hVarArr;
        int i8;
        h m4827F2;
        InterfaceC2004v interfaceC2004v = this.f9052f2;
        if (interfaceC2004v != null && (interfaceC2004v.mo4655g() || this.f9052f2.mo4659r())) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i9 >= this.f9050d2.length) {
                    break;
                }
                for (h hVar = r3[i9]; hVar != null; hVar = hVar.mo4669k()) {
                    if (hVar.first() != null) {
                        i10++;
                    }
                }
                i9++;
            }
            this.f9051e2 = i10;
            if (this.f9052f2.mo4659r()) {
                int i11 = 0;
                while (true) {
                    AbstractC2003u[] abstractC2003uArr2 = this.f9049c2;
                    if (i11 >= abstractC2003uArr2.length) {
                        break;
                    }
                    this.f9052f2.mo4656i(abstractC2003uArr2, i11);
                    i11++;
                }
            }
        }
        int[] iArr = new int[32];
        int i12 = 1;
        int i13 = 0;
        for (int i14 = 0; i14 < 31; i14++) {
            AbstractC2003u[] abstractC2003uArr3 = this.f9049c2;
            if (i12 > abstractC2003uArr3.length) {
                break;
            }
            int min = Math.min(abstractC2003uArr3.length, 1 << i14);
            int i15 = 0;
            while (i12 <= min) {
                int i16 = i12 + 1;
                if (this.f9049c2[i12 - 1] != null) {
                    i15++;
                }
                i12 = i16;
            }
            iArr[i14] = i15;
            i13 += i15;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= this.f9050d2.length) {
                break;
            }
            for (h hVar2 = r5[i17]; hVar2 != null; hVar2 = hVar2.mo4669k()) {
                int mo4671m = hVar2.mo4671m(Integer.MAX_VALUE);
                if (mo4671m > 0) {
                    int m4829P2 = m4829P2(mo4671m);
                    iArr[m4829P2] = iArr[m4829P2] + 1;
                    i13++;
                }
            }
            i17++;
        }
        if (i7 > 0) {
            i13++;
            int m4829P22 = m4829P2(i7);
            iArr[m4829P22] = iArr[m4829P22] + 1;
        }
        int i18 = iArr[0];
        int i19 = 1;
        int i20 = 0;
        while (true) {
            if (i19 >= 32) {
                break;
            }
            i18 += iArr[i19];
            int i21 = 1 << i19;
            if (i13 * 2 < i21) {
                break;
            }
            if (i18 >= (1 << (i19 - 1))) {
                i20 = i21;
            }
            i19++;
        }
        AbstractC2003u[] abstractC2003uArr4 = this.f9049c2;
        h[] hVarArr2 = this.f9050d2;
        int i22 = (i7 <= 0 || i7 > i20) ? 0 : -1;
        if (i20 != abstractC2003uArr4.length) {
            abstractC2003uArr = new AbstractC2003u[i20];
            if (i20 > abstractC2003uArr4.length) {
                int m4829P23 = m4829P2(i20) + 1;
                for (int m4829P24 = m4829P2(abstractC2003uArr4.length + 1); m4829P24 < m4829P23; m4829P24++) {
                    i22 += iArr[m4829P24];
                }
            } else if (abstractC2003uArr4.length > i20) {
                int m4829P25 = m4829P2(abstractC2003uArr4.length) + 1;
                for (int m4829P26 = m4829P2(i20 + 1); m4829P26 < m4829P25; m4829P26++) {
                    i22 -= iArr[m4829P26];
                }
            }
            System.arraycopy(abstractC2003uArr4, 0, abstractC2003uArr, 0, Math.min(abstractC2003uArr4.length, i20));
        } else {
            abstractC2003uArr = abstractC2003uArr4;
        }
        int i23 = (this.f9051e2 - i22) + ((i7 < 0 || i7 > i20) ? 1 : 0);
        if (i23 > 0) {
            int m4829P27 = i23 >= 2 ? 1 << m4829P2(i23) : 2;
            i8 = m4829P27 - 1;
            hVarArr = new h[m4829P27];
        } else {
            hVarArr = f9048k2;
            i8 = 0;
        }
        for (h hVar3 : hVarArr2) {
            for (; hVar3 != null; hVar3 = hVar3.mo4669k()) {
                int mo4671m2 = hVar3.mo4671m(i20);
                if (mo4671m2 > 0) {
                    i first = hVar3.first();
                    if (first != null) {
                        abstractC2003uArr[mo4671m2 - 1] = first.value();
                    }
                } else {
                    int mo4660b = hVar3.mo4660b(i8);
                    hVarArr[mo4660b] = hVar3.mo4666e(hVarArr[mo4660b]);
                }
            }
        }
        while (i20 < abstractC2003uArr4.length) {
            int i24 = i20 + 1;
            AbstractC2003u abstractC2003u = abstractC2003uArr4[i20];
            if (abstractC2003u != null) {
                C1993k[] c1993kArr = C1993k.f9023e2;
                int i25 = (i24 & Integer.MAX_VALUE) % i8;
                InterfaceC2004v interfaceC2004v2 = this.f9052f2;
                if (interfaceC2004v2 != null) {
                    m4827F2 = interfaceC2004v2.mo4657n(C1993k.m4765C2(i24), abstractC2003u);
                    if (m4827F2 == null) {
                    }
                } else {
                    m4827F2 = m4827F2(C1993k.m4765C2(i24), abstractC2003u);
                }
                h hVar4 = hVarArr[i25];
                if (hVar4 != null) {
                    m4827F2 = hVar4.mo4665d(m4827F2);
                }
                hVarArr[i25] = m4827F2;
            }
            i20 = i24;
        }
        this.f9050d2 = hVarArr;
        this.f9049c2 = abstractC2003uArr;
        this.f9051e2 -= i22;
    }

    /* renamed from: U2 */
    public AbstractC2003u mo4786U2(int i7) {
        int mo4794k1 = mo4794k1();
        AbstractC2003u.a aVar = AbstractC2003u.f9124Y;
        if (i7 == 0) {
            i7 = mo4794k1;
        } else if (i7 > mo4794k1) {
            return aVar;
        }
        AbstractC2003u mo4776J0 = mo4776J0(i7);
        AbstractC2003u abstractC2003u = mo4776J0;
        while (!abstractC2003u.mo4804d1()) {
            int i8 = i7 + 1;
            AbstractC2003u mo4776J02 = mo4776J0(i8);
            mo4788W1(i7, mo4776J02);
            i7 = i8;
            abstractC2003u = mo4776J02;
        }
        return mo4776J0.mo4804d1() ? aVar : mo4776J0;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: V1 */
    public void mo4787V1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        if (this.f9053g2) {
            throw new C1991i("can not be set a const table");
        }
        if (abstractC2003u.mo4726b1() && m4830C2(abstractC2003u.mo4747o2(), abstractC2003u2)) {
            return;
        }
        m4834L2(abstractC2003u, abstractC2003u2);
    }

    /* renamed from: V2 */
    public final void m4837V2(int i7, int i8, AbstractC2003u abstractC2003u) {
        while (true) {
            int i9 = i7 * 2;
            if (i9 > i8) {
                return;
            }
            if (i9 < i8) {
                int i10 = i9 + 1;
                if (m4831D2(i9, i10, abstractC2003u)) {
                    i9 = i10;
                }
            }
            if (!m4831D2(i7, i9, abstractC2003u)) {
                return;
            }
            AbstractC2003u mo4776J0 = mo4776J0(i7);
            mo4788W1(i7, mo4776J0(i9));
            mo4788W1(i9, mo4776J0);
            i7 = i9;
        }
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: W1 */
    public void mo4788W1(int i7, AbstractC2003u abstractC2003u) {
        if (this.f9053g2) {
            throw new C1991i("can not be set a const table");
        }
        if (this.f9052f2 == null || !mo4783R2(i7).mo4804d1()) {
            mo4785S2(i7, abstractC2003u);
        } else {
            AbstractC2003u.m4864a2(this, C1993k.m4765C2(i7), abstractC2003u);
        }
    }

    /* renamed from: W2 */
    public void mo4789W2(AbstractC2003u abstractC2003u) {
        if (mo4793j1().mo4748p2() >= 2147483647L) {
            throw new C1991i("array too big: " + mo4793j1().mo4748p2());
        }
        InterfaceC2004v interfaceC2004v = this.f9052f2;
        if (interfaceC2004v != null && interfaceC2004v.mo4659r()) {
            int i7 = 0;
            while (true) {
                AbstractC2003u[] abstractC2003uArr = this.f9049c2;
                if (i7 >= abstractC2003uArr.length) {
                    break;
                }
                this.f9052f2.mo4656i(abstractC2003uArr, i7);
                i7++;
            }
        }
        int mo4794k1 = mo4794k1();
        if (mo4794k1 > 1) {
            if (abstractC2003u.mo4804d1()) {
                abstractC2003u = null;
            }
            for (int i8 = mo4794k1 / 2; i8 > 0; i8--) {
                m4837V2(i8, mo4794k1, abstractC2003u);
            }
            while (mo4794k1 > 1) {
                AbstractC2003u mo4776J0 = mo4776J0(mo4794k1);
                mo4788W1(mo4794k1, mo4776J0(1));
                mo4788W1(1, mo4776J0);
                mo4794k1--;
                m4837V2(1, mo4794k1, abstractC2003u);
            }
        }
    }

    /* renamed from: X2 */
    public final String m4838X2(StringBuilder sb) {
        if (f9046i2 != null) {
            m4832G2("", sb);
            return sb.toString();
        }
        f9046i2 = new HashSet();
        f9047j2 = 0;
        m4832G2("", sb);
        String obj = sb.toString();
        f9047j2 = 0;
        f9046i2 = null;
        return obj;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Y1 */
    public void mo4790Y1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        if (this.f9053g2) {
            throw new C1991i("can not be set a const table");
        }
        if (abstractC2003u == null || !(abstractC2003u.mo4734i1() || m4882q1(AbstractC2003u.f9099A1).mo4763Y0())) {
            throw new C1991i("value ('" + abstractC2003u + "') can not be used as a table index");
        }
        if (this.f9052f2 == null || !mo4782R1(abstractC2003u).mo4804d1()) {
            mo4787V1(abstractC2003u, abstractC2003u2);
        } else {
            AbstractC2003u.m4864a2(this, abstractC2003u, abstractC2003u2);
        }
    }

    /* renamed from: Y2 */
    public AbstractC1984c0 mo4791Y2(int i7, int i8) {
        AbstractC2003u.a aVar = AbstractC2003u.f9124Y;
        if (i8 < i7) {
            return aVar;
        }
        int i9 = i8 - i7;
        if (i9 < 0) {
            throw new C1991i("too many results to unpack: greater 2147483647");
        }
        if (i9 >= 16777215) {
            throw new C1991i("too many results to unpack: " + i9 + " (max is 16777215)");
        }
        int i10 = (i8 + 1) - i7;
        if (i10 == 0) {
            return aVar;
        }
        if (i10 == 1) {
            return mo4776J0(i7);
        }
        if (i10 == 2) {
            return AbstractC2003u.m4867y2(mo4776J0(i7), mo4776J0(i7 + 1));
        }
        if (i10 < 0) {
            return aVar;
        }
        try {
            AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[i10];
            while (true) {
                i10--;
                if (i10 < 0) {
                    return AbstractC2003u.m4868z2(abstractC2003uArr);
                }
                abstractC2003uArr[i10] = mo4776J0(i7 + i10);
            }
        } catch (OutOfMemoryError unused) {
            throw new C1991i(C0090b.m219e("too many results to unpack [out of memory]: ", i10));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r3 != (r5 != null && r5.mo4659r())) goto L28;
     */
    @Override // p165u6.AbstractC2003u
    /* renamed from: Z1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p165u6.AbstractC2003u mo4792Z1(p165u6.AbstractC2003u r5) {
        /*
            r4 = this;
            u6.v r0 = r4.f9052f2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.mo4655g()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            u6.v r3 = r4.f9052f2
            if (r3 == 0) goto L1b
            boolean r3 = r3.mo4659r()
            if (r3 == 0) goto L1b
            r3 = 1
            goto L1c
        L1b:
            r3 = 0
        L1c:
            u6.v r5 = p165u6.AbstractC2003u.m4865p1(r5)
            r4.f9052f2 = r5
            if (r5 == 0) goto L2c
            boolean r5 = r5.mo4655g()
            if (r5 == 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            if (r0 != r5) goto L3d
            u6.v r5 = r4.f9052f2
            if (r5 == 0) goto L3a
            boolean r5 = r5.mo4659r()
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r1 = 0
        L3b:
            if (r3 == r1) goto L40
        L3d:
            r4.m4836T2(r2)
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p165u6.C1999q.mo4792Z1(u6.u):u6.u");
    }

    /* renamed from: c */
    public AbstractC2003u mo4654c() {
        return this;
    }

    public final Object clone() {
        return new C1999q(this);
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: g */
    public boolean mo4655g() {
        return false;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: g1 */
    public boolean mo4839g1() {
        return true;
    }

    /* renamed from: i */
    public AbstractC2003u mo4656i(AbstractC2003u[] abstractC2003uArr, int i7) {
        return abstractC2003uArr[i7];
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j1 */
    public AbstractC2003u mo4793j1() {
        AbstractC2003u m4882q1 = m4882q1(AbstractC2003u.f9110L1);
        return m4882q1.mo4682m2() ? m4882q1.mo4691f0(this) : C1993k.m4765C2(mo4784S1());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: k1 */
    public int mo4794k1() {
        if (this.f9052f2 == null) {
            return mo4784S1();
        }
        AbstractC2003u mo4793j1 = mo4793j1();
        if (mo4793j1.mo4724Z0()) {
            return mo4793j1.mo4747o2();
        }
        throw new C1991i("table length is not an integer: " + mo4793j1);
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: n */
    public final h mo4657n(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        return m4827F2(abstractC2003u, abstractC2003u2);
    }

    /* renamed from: p */
    public AbstractC2003u mo4658p(AbstractC2003u abstractC2003u) {
        return abstractC2003u;
    }

    @Override // p165u6.InterfaceC2004v
    /* renamed from: r */
    public boolean mo4659r() {
        return false;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t0 */
    public C1999q mo4795t0() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t2 */
    public int mo4675t2() {
        return 5;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u2 */
    public String mo4676u2() {
        return "table";
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: x1 */
    public AbstractC1984c0 mo4796x1(AbstractC2003u abstractC2003u) {
        int mo4747o2;
        int i7 = 0;
        if (!abstractC2003u.mo4804d1()) {
            if (!abstractC2003u.mo4726b1() || (mo4747o2 = abstractC2003u.mo4747o2()) <= 0 || mo4747o2 > this.f9049c2.length) {
                if (this.f9050d2.length == 0) {
                    AbstractC2003u.m4861I0("invalid key to 'next' 1: " + abstractC2003u);
                    throw null;
                }
                int m4828J2 = m4828J2(r0.length - 1, abstractC2003u);
                for (h hVar = this.f9050d2[m4828J2]; hVar != null; hVar = hVar.mo4669k()) {
                    if (i7 != 0) {
                        i first = hVar.first();
                        if (first != null) {
                            return first.mo4843j();
                        }
                    } else if (hVar.mo4670l(abstractC2003u)) {
                        i7 = 1;
                    }
                }
                if (i7 == 0) {
                    AbstractC2003u.m4861I0("invalid key to 'next' 2: " + abstractC2003u);
                    throw null;
                }
                i7 = this.f9049c2.length + 1 + m4828J2;
            } else {
                i7 = mo4747o2;
            }
        }
        while (true) {
            AbstractC2003u[] abstractC2003uArr = this.f9049c2;
            if (i7 < abstractC2003uArr.length) {
                AbstractC2003u abstractC2003u2 = abstractC2003uArr[i7];
                if (abstractC2003u2 != null) {
                    InterfaceC2004v interfaceC2004v = this.f9052f2;
                    if (interfaceC2004v != null) {
                        abstractC2003u2 = interfaceC2004v.mo4656i(abstractC2003uArr, i7);
                    }
                    if (abstractC2003u2 != null) {
                        return AbstractC2003u.m4867y2(C1993k.m4765C2(i7 + 1), abstractC2003u2);
                    }
                }
                i7++;
            } else {
                int length = i7 - abstractC2003uArr.length;
                while (true) {
                    h[] hVarArr = this.f9050d2;
                    if (length >= hVarArr.length) {
                        return AbstractC2003u.f9130m;
                    }
                    for (h hVar2 = hVarArr[length]; hVar2 != null; hVar2 = hVar2.mo4669k()) {
                        i first2 = hVar2.first();
                        if (first2 != null) {
                            return first2.mo4843j();
                        }
                    }
                    length++;
                }
            }
        }
    }
}
