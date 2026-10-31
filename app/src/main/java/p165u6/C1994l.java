package p165u6;

import java.util.ArrayList;
import java.util.Vector;
import p165u6.AbstractC2003u;
import p165u6.C1999q;

/* renamed from: u6.l */
/* loaded from: classes.dex */
public final class C1994l extends C1999q {

    /* renamed from: n2 */
    public static final C1998p f9025n2 = C1998p.m4815M2("n");

    /* renamed from: o2 */
    public static final C1999q.h[] f9026o2 = new C1999q.h[0];

    /* renamed from: l2 */
    public final ArrayList<AbstractC2003u> f9027l2;

    /* renamed from: m2 */
    public InterfaceC2004v f9028m2;

    public C1994l(int i7) {
        this.f9027l2 = new ArrayList<>();
        this.f9027l2 = new ArrayList<>(i7);
    }

    /* renamed from: D2 */
    private boolean m4769D2(int i7, int i8, AbstractC2003u abstractC2003u) {
        AbstractC2003u mo4656i;
        AbstractC2003u mo4656i2;
        ArrayList<AbstractC2003u> arrayList = this.f9027l2;
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[arrayList.size()];
        arrayList.toArray(abstractC2003uArr);
        InterfaceC2004v interfaceC2004v = this.f9028m2;
        if (interfaceC2004v == null) {
            mo4656i = arrayList.get(i7);
            mo4656i2 = arrayList.get(i8);
        } else {
            mo4656i = interfaceC2004v.mo4656i(abstractC2003uArr, i7);
            mo4656i2 = this.f9028m2.mo4656i(abstractC2003uArr, i8);
        }
        if (mo4656i == null || mo4656i2 == null) {
            return false;
        }
        return !abstractC2003u.mo4804d1() ? abstractC2003u.mo4692g0(mo4656i, mo4656i2).mo4682m2() : mo4656i.mo4739l1(mo4656i2);
    }

    /* renamed from: V2 */
    private void m4770V2(int i7, int i8, AbstractC2003u abstractC2003u) {
        while (true) {
            int i9 = (i7 * 2) + 1;
            if (i9 > i8) {
                return;
            }
            if (i9 < i8) {
                int i10 = i9 + 1;
                if (m4769D2(i9, i10, abstractC2003u)) {
                    i9 = i10;
                }
            }
            if (!m4769D2(i7, i9, abstractC2003u)) {
                return;
            }
            ArrayList<AbstractC2003u> arrayList = this.f9027l2;
            AbstractC2003u abstractC2003u2 = arrayList.get(i7);
            arrayList.set(i7, arrayList.get(i9));
            arrayList.set(i9, abstractC2003u2);
            i7 = i9;
        }
    }

    /* renamed from: Z2 */
    private void m4771Z2(int i7, AbstractC2003u abstractC2003u) {
        int i8 = i7 - 1;
        ArrayList<AbstractC2003u> arrayList = this.f9027l2;
        if (i8 == arrayList.size()) {
            arrayList.add(abstractC2003u);
            return;
        }
        if (i7 <= 0 || i7 > arrayList.size()) {
            throw new C1991i("array insert position out of bounds");
        }
        if (abstractC2003u.mo4804d1()) {
            abstractC2003u = null;
        } else {
            InterfaceC2004v interfaceC2004v = this.f9028m2;
            if (interfaceC2004v != null) {
                abstractC2003u = interfaceC2004v.mo4658p(abstractC2003u);
            }
        }
        arrayList.set(i8, abstractC2003u);
    }

    @Override // p165u6.C1999q
    /* renamed from: E2 */
    public final C1998p mo4772E2(C1998p c1998p, int i7, int i8) {
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

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: F1 */
    public final C1999q mo4773F1() {
        return this;
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: G0 */
    public final boolean mo4704G0(AbstractC2003u abstractC2003u) {
        AbstractC2003u mo4681M0;
        if (this == abstractC2003u) {
            return true;
        }
        return this.f9028m2 != null && abstractC2003u.mo4839g1() && (mo4681M0 = abstractC2003u.mo4681M0()) != null && AbstractC2003u.m4860H0(this, this.f9028m2.mo4654c(), abstractC2003u, mo4681M0);
    }

    @Override // p165u6.C1999q
    /* renamed from: H2 */
    public final int mo4774H2() {
        return this.f9027l2.size();
    }

    @Override // p165u6.C1999q
    /* renamed from: I2 */
    public final int mo4775I2() {
        return 0;
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: J0 */
    public final AbstractC2003u mo4776J0(int i7) {
        AbstractC2003u mo4783R2 = mo4783R2(i7);
        return (!mo4783R2.mo4804d1() || this.f9028m2 == null) ? mo4783R2 : AbstractC2003u.m4862N0(this, C1993k.m4765C2(i7));
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: L0 */
    public final AbstractC2003u mo4777L0(AbstractC2003u abstractC2003u) {
        AbstractC2003u mo4782R1 = mo4782R1(abstractC2003u);
        return (!mo4782R1.mo4804d1() || this.f9028m2 == null) ? mo4782R1 : AbstractC2003u.m4862N0(this, abstractC2003u);
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: L1 */
    public final void mo4778L1(int i7) {
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: M0 */
    public final AbstractC2003u mo4681M0() {
        InterfaceC2004v interfaceC2004v = this.f9028m2;
        if (interfaceC2004v != null) {
            return interfaceC2004v.mo4654c();
        }
        return null;
    }

    @Override // p165u6.C1999q
    /* renamed from: M2 */
    public final AbstractC1984c0 mo4779M2(AbstractC2003u abstractC2003u) {
        int mo4740m0 = abstractC2003u.mo4740m0() + 1;
        AbstractC2003u mo4783R2 = mo4783R2(mo4740m0);
        return mo4783R2.mo4804d1() ? AbstractC2003u.f9124Y : AbstractC2003u.m4867y2(C1993k.m4765C2(mo4740m0), mo4783R2);
    }

    @Override // p165u6.C1999q
    /* renamed from: N2 */
    public final void mo4780N2(int i7, AbstractC2003u abstractC2003u) {
        if (i7 == 0) {
            i7 = mo4784S1() + 1;
        }
        ArrayList<AbstractC2003u> arrayList = this.f9027l2;
        if (i7 == arrayList.size() + 1) {
            arrayList.add(abstractC2003u);
        } else {
            if (i7 <= 0 || i7 > arrayList.size()) {
                throw new C1991i("array insert position out of bounds");
            }
            arrayList.add(i7, abstractC2003u);
        }
    }

    @Override // p165u6.C1999q
    /* renamed from: O2 */
    public final AbstractC2003u[] mo4781O2() {
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

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: R1 */
    public final AbstractC2003u mo4782R1(AbstractC2003u abstractC2003u) {
        if (abstractC2003u.mo4704G0(f9025n2)) {
            return C1993k.m4765C2(mo4784S1());
        }
        if (!abstractC2003u.mo4726b1()) {
            throw new C1991i("array key only integer");
        }
        int mo4747o2 = abstractC2003u.mo4747o2();
        C1996n c1996n = AbstractC2003u.f9130m;
        if (mo4747o2 <= 0) {
            return c1996n;
        }
        ArrayList<AbstractC2003u> arrayList = this.f9027l2;
        if (mo4747o2 > arrayList.size()) {
            return c1996n;
        }
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[arrayList.size()];
        arrayList.toArray(abstractC2003uArr);
        InterfaceC2004v interfaceC2004v = this.f9028m2;
        int i7 = mo4747o2 - 1;
        AbstractC2003u mo4656i = interfaceC2004v == null ? arrayList.get(i7) : interfaceC2004v.mo4656i(abstractC2003uArr, i7);
        return mo4656i != null ? mo4656i : c1996n;
    }

    @Override // p165u6.C1999q
    /* renamed from: R2 */
    public final AbstractC2003u mo4783R2(int i7) {
        C1996n c1996n = AbstractC2003u.f9130m;
        if (i7 <= 0) {
            return c1996n;
        }
        ArrayList<AbstractC2003u> arrayList = this.f9027l2;
        if (i7 > arrayList.size()) {
            return c1996n;
        }
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[arrayList.size()];
        arrayList.toArray(abstractC2003uArr);
        InterfaceC2004v interfaceC2004v = this.f9028m2;
        int i8 = i7 - 1;
        AbstractC2003u mo4656i = interfaceC2004v == null ? arrayList.get(i8) : interfaceC2004v.mo4656i(abstractC2003uArr, i8);
        return mo4656i != null ? mo4656i : c1996n;
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: S1 */
    public final int mo4784S1() {
        int mo4774H2 = mo4774H2() + 1;
        int i7 = 0;
        while (mo4774H2 > i7 + 1) {
            int i8 = (mo4774H2 + i7) / 2;
            if (mo4783R2(i8).mo4804d1()) {
                mo4774H2 = i8;
            } else {
                i7 = i8;
            }
        }
        return i7;
    }

    @Override // p165u6.C1999q
    /* renamed from: S2 */
    public final void mo4785S2(int i7, AbstractC2003u abstractC2003u) {
        if (this.f9053g2) {
            throw new C1991i("can not be set a const table");
        }
        m4771Z2(i7, abstractC2003u);
    }

    @Override // p165u6.C1999q
    /* renamed from: U2 */
    public final AbstractC2003u mo4786U2(int i7) {
        int mo4784S1 = mo4784S1();
        AbstractC2003u.a aVar = AbstractC2003u.f9124Y;
        if (i7 == 0) {
            i7 = mo4784S1;
        } else if (i7 > mo4784S1) {
            return aVar;
        }
        AbstractC2003u mo4783R2 = mo4783R2(i7);
        this.f9027l2.remove(i7 - 1);
        return mo4783R2.mo4804d1() ? aVar : mo4783R2;
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: V1 */
    public final void mo4787V1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        if (this.f9053g2) {
            throw new C1991i("can not be set a const table");
        }
        if (!abstractC2003u.mo4704G0(f9025n2)) {
            if (!abstractC2003u.mo4726b1()) {
                throw new C1991i("array key only integer");
            }
            m4771Z2(abstractC2003u.mo4747o2(), abstractC2003u2);
            return;
        }
        int mo4740m0 = abstractC2003u2.mo4740m0();
        ArrayList<AbstractC2003u> arrayList = this.f9027l2;
        for (int size = arrayList.size(); size < mo4740m0; size++) {
            arrayList.add(AbstractC2003u.f9130m);
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < mo4740m0) {
                return;
            } else {
                arrayList.remove(size2);
            }
        }
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: W1 */
    public final void mo4788W1(int i7, AbstractC2003u abstractC2003u) {
        if (this.f9053g2) {
            throw new C1991i("can not be set a const table");
        }
        if (this.f9028m2 == null || !mo4783R2(i7).mo4804d1()) {
            mo4785S2(i7, abstractC2003u);
        } else {
            AbstractC2003u.m4864a2(this, C1993k.m4765C2(i7), abstractC2003u);
        }
    }

    @Override // p165u6.C1999q
    /* renamed from: W2 */
    public final void mo4789W2(AbstractC2003u abstractC2003u) {
        InterfaceC2004v interfaceC2004v = this.f9028m2;
        ArrayList<AbstractC2003u> arrayList = this.f9027l2;
        if (interfaceC2004v != null && interfaceC2004v.mo4659r()) {
            AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[arrayList.size()];
            arrayList.toArray(abstractC2003uArr);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                this.f9028m2.mo4656i(abstractC2003uArr, i7);
            }
        }
        int size = arrayList.size();
        while (size > 0) {
            int i8 = size - 1;
            if (arrayList.get(i8) != null) {
                break;
            } else {
                size = i8;
            }
        }
        if (size > 1) {
            int i9 = size / 2;
            while (true) {
                i9--;
                if (i9 < 0) {
                    break;
                } else {
                    m4770V2(i9, size - 1, abstractC2003u);
                }
            }
            int i10 = size - 1;
            while (i10 > 0) {
                AbstractC2003u abstractC2003u2 = arrayList.get(i10);
                arrayList.set(i10, arrayList.get(0));
                arrayList.set(0, abstractC2003u2);
                i10--;
                m4770V2(0, i10, abstractC2003u);
            }
        }
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: Y1 */
    public final void mo4790Y1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        if (this.f9053g2) {
            throw new C1991i("can not be set a const table");
        }
        if (!abstractC2003u.mo4734i1() && !m4882q1(AbstractC2003u.f9099A1).mo4763Y0()) {
            m4883v2("table index");
            throw null;
        }
        if (this.f9028m2 == null || !mo4782R1(abstractC2003u).mo4804d1()) {
            mo4787V1(abstractC2003u, abstractC2003u2);
        } else {
            AbstractC2003u.m4864a2(this, abstractC2003u, abstractC2003u2);
        }
    }

    @Override // p165u6.C1999q
    /* renamed from: Y2 */
    public final AbstractC1984c0 mo4791Y2(int i7, int i8) {
        int i9 = (i8 + 1) - i7;
        AbstractC2003u.a aVar = AbstractC2003u.f9124Y;
        if (i9 == 0) {
            return aVar;
        }
        if (i9 == 1) {
            return mo4776J0(i7);
        }
        if (i9 == 2) {
            return AbstractC2003u.m4867y2(mo4776J0(i7), mo4776J0(i7 + 1));
        }
        if (i9 < 0) {
            return aVar;
        }
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[i9];
        while (true) {
            i9--;
            if (i9 < 0) {
                return AbstractC2003u.m4868z2(abstractC2003uArr);
            }
            abstractC2003uArr[i9] = mo4776J0(i7 + i9);
        }
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: Z1 */
    public final AbstractC2003u mo4792Z1(AbstractC2003u abstractC2003u) {
        InterfaceC2004v interfaceC2004v;
        InterfaceC2004v interfaceC2004v2 = this.f9028m2;
        boolean z6 = interfaceC2004v2 != null && interfaceC2004v2.mo4655g();
        InterfaceC2004v interfaceC2004v3 = this.f9028m2;
        if (interfaceC2004v3 != null) {
            interfaceC2004v3.mo4659r();
        }
        InterfaceC2004v m4865p1 = AbstractC2003u.m4865p1(abstractC2003u);
        this.f9028m2 = m4865p1;
        if (z6 == (m4865p1 != null && m4865p1.mo4655g()) && (interfaceC2004v = this.f9028m2) != null) {
            interfaceC2004v.mo4659r();
        }
        return this;
    }

    @Override // p165u6.C1999q, p165u6.InterfaceC2004v
    /* renamed from: c */
    public final AbstractC2003u mo4654c() {
        return this;
    }

    @Override // p165u6.C1999q, p165u6.InterfaceC2004v
    /* renamed from: i */
    public final AbstractC2003u mo4656i(AbstractC2003u[] abstractC2003uArr, int i7) {
        return abstractC2003uArr[i7];
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: j1 */
    public final AbstractC2003u mo4793j1() {
        AbstractC2003u m4882q1 = m4882q1(AbstractC2003u.f9110L1);
        return m4882q1.mo4682m2() ? m4882q1.mo4691f0(this) : C1993k.m4765C2(mo4784S1());
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: k1 */
    public final int mo4794k1() {
        return this.f9028m2 != null ? mo4793j1().mo4747o2() : mo4784S1();
    }

    @Override // p165u6.C1999q, p165u6.InterfaceC2004v
    /* renamed from: p */
    public final AbstractC2003u mo4658p(AbstractC2003u abstractC2003u) {
        return abstractC2003u;
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: t0 */
    public final C1999q mo4795t0() {
        return this;
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: t2 */
    public final int mo4675t2() {
        return 5;
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: u2 */
    public final String mo4676u2() {
        return "table";
    }

    @Override // p165u6.C1999q, p165u6.AbstractC2003u
    /* renamed from: x1 */
    public final AbstractC1984c0 mo4796x1(AbstractC2003u abstractC2003u) {
        boolean mo4804d1 = abstractC2003u.mo4804d1();
        ArrayList<AbstractC2003u> arrayList = this.f9027l2;
        int i7 = 0;
        if (!mo4804d1 && (!abstractC2003u.mo4726b1() || (i7 = abstractC2003u.mo4747o2()) <= 0 || i7 > arrayList.size())) {
            i7 += arrayList.size() + 1;
        }
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[arrayList.size()];
        arrayList.toArray(abstractC2003uArr);
        while (i7 < arrayList.size()) {
            if (arrayList.get(i7) != null) {
                InterfaceC2004v interfaceC2004v = this.f9028m2;
                AbstractC2003u mo4656i = interfaceC2004v == null ? arrayList.get(i7) : interfaceC2004v.mo4656i(abstractC2003uArr, i7);
                if (mo4656i != null) {
                    return AbstractC2003u.m4867y2(C1993k.m4765C2(i7 + 1), mo4656i);
                }
            }
            i7++;
        }
        return AbstractC2003u.f9130m;
    }
}
