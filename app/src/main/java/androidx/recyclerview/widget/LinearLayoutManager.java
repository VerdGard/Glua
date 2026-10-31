package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.ext.C0090b;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC0479m;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0444m implements RecyclerView.AbstractC0454w.b {

    /* renamed from: A */
    public final C0427a f2061A;

    /* renamed from: B */
    public final C0428b f2062B;

    /* renamed from: C */
    public final int f2063C;

    /* renamed from: D */
    public final int[] f2064D;

    /* renamed from: p */
    public int f2065p;

    /* renamed from: q */
    public C0429c f2066q;

    /* renamed from: r */
    public AbstractC0485s f2067r;

    /* renamed from: s */
    public boolean f2068s;

    /* renamed from: t */
    public boolean f2069t;

    /* renamed from: u */
    public boolean f2070u;

    /* renamed from: v */
    public boolean f2071v;

    /* renamed from: w */
    public final boolean f2072w;

    /* renamed from: x */
    public int f2073x;

    /* renamed from: y */
    public int f2074y;

    /* renamed from: z */
    public C0430d f2075z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0427a {

        /* renamed from: a */
        public AbstractC0485s f2076a;

        /* renamed from: b */
        public int f2077b;

        /* renamed from: c */
        public int f2078c;

        /* renamed from: d */
        public boolean f2079d;

        /* renamed from: e */
        public boolean f2080e;

        public C0427a() {
            m1509c();
        }

        /* renamed from: a */
        public final void m1507a(View view, int i7) {
            if (this.f2079d) {
                int mo1787b = this.f2076a.mo1787b(view);
                AbstractC0485s abstractC0485s = this.f2076a;
                this.f2078c = (Integer.MIN_VALUE == abstractC0485s.f2490b ? 0 : abstractC0485s.mo1797l() - abstractC0485s.f2490b) + mo1787b;
            } else {
                this.f2078c = this.f2076a.mo1790e(view);
            }
            this.f2077b = i7;
        }

        /* renamed from: b */
        public final void m1508b(View view, int i7) {
            int min;
            AbstractC0485s abstractC0485s = this.f2076a;
            int mo1797l = Integer.MIN_VALUE == abstractC0485s.f2490b ? 0 : abstractC0485s.mo1797l() - abstractC0485s.f2490b;
            if (mo1797l >= 0) {
                m1507a(view, i7);
                return;
            }
            this.f2077b = i7;
            if (this.f2079d) {
                int mo1792g = (this.f2076a.mo1792g() - mo1797l) - this.f2076a.mo1787b(view);
                this.f2078c = this.f2076a.mo1792g() - mo1792g;
                if (mo1792g <= 0) {
                    return;
                }
                int mo1788c = this.f2078c - this.f2076a.mo1788c(view);
                int mo1796k = this.f2076a.mo1796k();
                int min2 = mo1788c - (Math.min(this.f2076a.mo1790e(view) - mo1796k, 0) + mo1796k);
                if (min2 >= 0) {
                    return;
                } else {
                    min = Math.min(mo1792g, -min2) + this.f2078c;
                }
            } else {
                int mo1790e = this.f2076a.mo1790e(view);
                int mo1796k2 = mo1790e - this.f2076a.mo1796k();
                this.f2078c = mo1790e;
                if (mo1796k2 <= 0) {
                    return;
                }
                int mo1792g2 = (this.f2076a.mo1792g() - Math.min(0, (this.f2076a.mo1792g() - mo1797l) - this.f2076a.mo1787b(view))) - (this.f2076a.mo1788c(view) + mo1790e);
                if (mo1792g2 >= 0) {
                    return;
                } else {
                    min = this.f2078c - Math.min(mo1796k2, -mo1792g2);
                }
            }
            this.f2078c = min;
        }

        /* renamed from: c */
        public final void m1509c() {
            this.f2077b = -1;
            this.f2078c = Integer.MIN_VALUE;
            this.f2079d = false;
            this.f2080e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f2077b + ", mCoordinate=" + this.f2078c + ", mLayoutFromEnd=" + this.f2079d + ", mValid=" + this.f2080e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0428b {

        /* renamed from: a */
        public int f2081a;

        /* renamed from: b */
        public boolean f2082b;

        /* renamed from: c */
        public boolean f2083c;

        /* renamed from: d */
        public boolean f2084d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0429c {

        /* renamed from: b */
        public int f2086b;

        /* renamed from: c */
        public int f2087c;

        /* renamed from: d */
        public int f2088d;

        /* renamed from: e */
        public int f2089e;

        /* renamed from: f */
        public int f2090f;

        /* renamed from: g */
        public int f2091g;

        /* renamed from: j */
        public int f2094j;

        /* renamed from: l */
        public boolean f2096l;

        /* renamed from: a */
        public boolean f2085a = true;

        /* renamed from: h */
        public int f2092h = 0;

        /* renamed from: i */
        public int f2093i = 0;

        /* renamed from: k */
        public List<RecyclerView.AbstractC0432a0> f2095k = null;

        /* renamed from: a */
        public final void m1510a(View view) {
            int m1651a;
            int size = this.f2095k.size();
            View view2 = null;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < size; i8++) {
                View view3 = this.f2095k.get(i8).f2177a;
                RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view3.getLayoutParams();
                if (view3 != view && !c0445n.m1653c() && (m1651a = (c0445n.m1651a() - this.f2088d) * this.f2089e) >= 0 && m1651a < i7) {
                    view2 = view3;
                    if (m1651a == 0) {
                        break;
                    } else {
                        i7 = m1651a;
                    }
                }
            }
            this.f2088d = view2 == null ? -1 : ((RecyclerView.C0445n) view2.getLayoutParams()).m1651a();
        }

        /* renamed from: b */
        public final View m1511b(RecyclerView.C0450s c0450s) {
            List<RecyclerView.AbstractC0432a0> list = this.f2095k;
            if (list == null) {
                View m1663d = c0450s.m1663d(this.f2088d);
                this.f2088d += this.f2089e;
                return m1663d;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = this.f2095k.get(i7).f2177a;
                RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
                if (!c0445n.m1653c() && this.f2088d == c0445n.m1651a()) {
                    m1510a(view);
                    return view;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0430d implements Parcelable {
        public static final Parcelable.Creator<C0430d> CREATOR = new a();

        /* renamed from: c */
        public int f2097c;

        /* renamed from: e */
        public int f2098e;

        /* renamed from: m */
        public boolean f2099m;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public static class a implements Parcelable.Creator<C0430d> {
            @Override // android.os.Parcelable.Creator
            public final C0430d createFromParcel(Parcel parcel) {
                return new C0430d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C0430d[] newArray(int i7) {
                return new C0430d[i7];
            }
        }

        public C0430d() {
        }

        public C0430d(Parcel parcel) {
            this.f2097c = parcel.readInt();
            this.f2098e = parcel.readInt();
            this.f2099m = parcel.readInt() == 1;
        }

        public C0430d(C0430d c0430d) {
            this.f2097c = c0430d.f2097c;
            this.f2098e = c0430d.f2098e;
            this.f2099m = c0430d.f2099m;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f2097c);
            parcel.writeInt(this.f2098e);
            parcel.writeInt(this.f2099m ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i7) {
        this.f2065p = 1;
        this.f2069t = false;
        this.f2070u = false;
        this.f2071v = false;
        this.f2072w = true;
        this.f2073x = -1;
        this.f2074y = Integer.MIN_VALUE;
        this.f2075z = null;
        this.f2061A = new C0427a();
        this.f2062B = new C0428b();
        this.f2063C = 2;
        this.f2064D = new int[2];
        m1490b1(i7);
        mo1491c(null);
        if (this.f2069t) {
            this.f2069t = false;
            m1635m0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: A0 */
    public boolean mo1426A0() {
        return this.f2075z == null && this.f2068s == this.f2071v;
    }

    /* renamed from: B0 */
    public void mo1464B0(RecyclerView.C0455x c0455x, int[] iArr) {
        int i7;
        int mo1797l = c0455x.f2264a != -1 ? this.f2067r.mo1797l() : 0;
        if (this.f2066q.f2090f == -1) {
            i7 = 0;
        } else {
            i7 = mo1797l;
            mo1797l = 0;
        }
        iArr[0] = mo1797l;
        iArr[1] = i7;
    }

    /* renamed from: C0 */
    public void mo1427C0(RecyclerView.C0455x c0455x, C0429c c0429c, RecyclerView.AbstractC0444m.c cVar) {
        int i7 = c0429c.f2088d;
        if (i7 < 0 || i7 >= c0455x.m1679b()) {
            return;
        }
        ((RunnableC0479m.b) cVar).m1780a(i7, Math.max(0, c0429c.f2091g));
    }

    /* renamed from: D0 */
    public final int m1465D0(RecyclerView.C0455x c0455x) {
        if (m1643w() == 0) {
            return 0;
        }
        m1469H0();
        AbstractC0485s abstractC0485s = this.f2067r;
        boolean z6 = !this.f2072w;
        return C0491y.m1816a(c0455x, abstractC0485s, m1472K0(z6), m1471J0(z6), this, this.f2072w);
    }

    /* renamed from: E0 */
    public final int m1466E0(RecyclerView.C0455x c0455x) {
        if (m1643w() == 0) {
            return 0;
        }
        m1469H0();
        AbstractC0485s abstractC0485s = this.f2067r;
        boolean z6 = !this.f2072w;
        return C0491y.m1817b(c0455x, abstractC0485s, m1472K0(z6), m1471J0(z6), this, this.f2072w, this.f2070u);
    }

    /* renamed from: F0 */
    public final int m1467F0(RecyclerView.C0455x c0455x) {
        if (m1643w() == 0) {
            return 0;
        }
        m1469H0();
        AbstractC0485s abstractC0485s = this.f2067r;
        boolean z6 = !this.f2072w;
        return C0491y.m1818c(c0455x, abstractC0485s, m1472K0(z6), m1471J0(z6), this, this.f2072w);
    }

    /* renamed from: G0 */
    public final int m1468G0(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f2065p == 1) ? 1 : Integer.MIN_VALUE : this.f2065p == 0 ? 1 : Integer.MIN_VALUE : this.f2065p == 1 ? -1 : Integer.MIN_VALUE : this.f2065p == 0 ? -1 : Integer.MIN_VALUE : (this.f2065p != 1 && m1484U0()) ? -1 : 1 : (this.f2065p != 1 && m1484U0()) ? 1 : -1;
    }

    /* renamed from: H0 */
    public final void m1469H0() {
        if (this.f2066q == null) {
            this.f2066q = new C0429c();
        }
    }

    /* renamed from: I0 */
    public final int m1470I0(RecyclerView.C0450s c0450s, C0429c c0429c, RecyclerView.C0455x c0455x, boolean z6) {
        int i7 = c0429c.f2087c;
        int i8 = c0429c.f2091g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                c0429c.f2091g = i8 + i7;
            }
            m1485X0(c0450s, c0429c);
        }
        int i9 = c0429c.f2087c + c0429c.f2092h;
        while (true) {
            if (!c0429c.f2096l && i9 <= 0) {
                break;
            }
            int i10 = c0429c.f2088d;
            if (!(i10 >= 0 && i10 < c0455x.m1679b())) {
                break;
            }
            C0428b c0428b = this.f2062B;
            c0428b.f2081a = 0;
            c0428b.f2082b = false;
            c0428b.f2083c = false;
            c0428b.f2084d = false;
            mo1431V0(c0450s, c0455x, c0429c, c0428b);
            if (!c0428b.f2082b) {
                int i11 = c0429c.f2086b;
                int i12 = c0428b.f2081a;
                c0429c.f2086b = (c0429c.f2090f * i12) + i11;
                if (!c0428b.f2083c || c0429c.f2095k != null || !c0455x.f2270g) {
                    c0429c.f2087c -= i12;
                    i9 -= i12;
                }
                int i13 = c0429c.f2091g;
                if (i13 != Integer.MIN_VALUE) {
                    int i14 = i13 + i12;
                    c0429c.f2091g = i14;
                    int i15 = c0429c.f2087c;
                    if (i15 < 0) {
                        c0429c.f2091g = i14 + i15;
                    }
                    m1485X0(c0450s, c0429c);
                }
                if (z6 && c0428b.f2084d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - c0429c.f2087c;
    }

    /* renamed from: J0 */
    public final View m1471J0(boolean z6) {
        int m1643w;
        int i7;
        if (this.f2070u) {
            i7 = m1643w();
            m1643w = 0;
        } else {
            m1643w = m1643w() - 1;
            i7 = -1;
        }
        return m1477O0(m1643w, i7, z6);
    }

    /* renamed from: K0 */
    public final View m1472K0(boolean z6) {
        int m1643w;
        int i7;
        if (this.f2070u) {
            m1643w = -1;
            i7 = m1643w() - 1;
        } else {
            m1643w = m1643w();
            i7 = 0;
        }
        return m1477O0(i7, m1643w, z6);
    }

    /* renamed from: L0 */
    public final int m1473L0() {
        View m1477O0 = m1477O0(0, m1643w(), false);
        if (m1477O0 == null) {
            return -1;
        }
        return RecyclerView.AbstractC0444m.m1609J(m1477O0);
    }

    /* renamed from: M0 */
    public final int m1474M0() {
        View m1477O0 = m1477O0(m1643w() - 1, -1, false);
        if (m1477O0 == null) {
            return -1;
        }
        return RecyclerView.AbstractC0444m.m1609J(m1477O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: N */
    public final boolean mo1475N() {
        return true;
    }

    /* renamed from: N0 */
    public final View m1476N0(int i7, int i8) {
        int i9;
        int i10;
        m1469H0();
        if ((i8 > i7 ? (char) 1 : i8 < i7 ? (char) 65535 : (char) 0) == 0) {
            return m1641v(i7);
        }
        if (this.f2067r.mo1790e(m1641v(i7)) < this.f2067r.mo1796k()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = 4097;
        }
        return (this.f2065p == 0 ? this.f2210c : this.f2211d).m1759a(i7, i8, i9, i10);
    }

    /* renamed from: O0 */
    public final View m1477O0(int i7, int i8, boolean z6) {
        m1469H0();
        return (this.f2065p == 0 ? this.f2210c : this.f2211d).m1759a(i7, i8, z6 ? 24579 : 320, 320);
    }

    /* renamed from: P0 */
    public View mo1429P0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, int i7, int i8, int i9) {
        m1469H0();
        int mo1796k = this.f2067r.mo1796k();
        int mo1792g = this.f2067r.mo1792g();
        int i10 = i8 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i8) {
            View m1641v = m1641v(i7);
            int m1609J = RecyclerView.AbstractC0444m.m1609J(m1641v);
            if (m1609J >= 0 && m1609J < i9) {
                if (((RecyclerView.C0445n) m1641v.getLayoutParams()).m1653c()) {
                    if (view2 == null) {
                        view2 = m1641v;
                    }
                } else {
                    if (this.f2067r.mo1790e(m1641v) < mo1792g && this.f2067r.mo1787b(m1641v) >= mo1796k) {
                        return m1641v;
                    }
                    if (view == null) {
                        view = m1641v;
                    }
                }
            }
            i7 += i10;
        }
        return view != null ? view : view2;
    }

    /* renamed from: Q0 */
    public final int m1478Q0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, boolean z6) {
        int mo1792g;
        int mo1792g2 = this.f2067r.mo1792g() - i7;
        if (mo1792g2 <= 0) {
            return 0;
        }
        int i8 = -m1489a1(-mo1792g2, c0450s, c0455x);
        int i9 = i7 + i8;
        if (!z6 || (mo1792g = this.f2067r.mo1792g() - i9) <= 0) {
            return i8;
        }
        this.f2067r.mo1800o(mo1792g);
        return mo1792g + i8;
    }

    /* renamed from: R0 */
    public final int m1479R0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, boolean z6) {
        int mo1796k;
        int mo1796k2 = i7 - this.f2067r.mo1796k();
        if (mo1796k2 <= 0) {
            return 0;
        }
        int i8 = -m1489a1(mo1796k2, c0450s, c0455x);
        int i9 = i7 + i8;
        if (!z6 || (mo1796k = i9 - this.f2067r.mo1796k()) <= 0) {
            return i8;
        }
        this.f2067r.mo1800o(-mo1796k);
        return i8 - mo1796k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: S */
    public final void mo1480S(RecyclerView recyclerView) {
    }

    /* renamed from: S0 */
    public final View m1481S0() {
        return m1641v(this.f2070u ? 0 : m1643w() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: T */
    public View mo1430T(View view, int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        int m1468G0;
        m1487Z0();
        if (m1643w() == 0 || (m1468G0 = m1468G0(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        m1469H0();
        m1492d1(m1468G0, (int) (this.f2067r.mo1797l() * 0.33333334f), false, c0455x);
        C0429c c0429c = this.f2066q;
        c0429c.f2091g = Integer.MIN_VALUE;
        c0429c.f2085a = false;
        m1470I0(c0450s, c0429c, c0455x, true);
        View m1476N0 = m1468G0 == -1 ? this.f2070u ? m1476N0(m1643w() - 1, -1) : m1476N0(0, m1643w()) : this.f2070u ? m1476N0(0, m1643w()) : m1476N0(m1643w() - 1, -1);
        View m1482T0 = m1468G0 == -1 ? m1482T0() : m1481S0();
        if (!m1482T0.hasFocusable()) {
            return m1476N0;
        }
        if (m1476N0 == null) {
            return null;
        }
        return m1482T0;
    }

    /* renamed from: T0 */
    public final View m1482T0() {
        return m1641v(this.f2070u ? m1643w() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: U */
    public final void mo1483U(AccessibilityEvent accessibilityEvent) {
        super.mo1483U(accessibilityEvent);
        if (m1643w() > 0) {
            accessibilityEvent.setFromIndex(m1473L0());
            accessibilityEvent.setToIndex(m1474M0());
        }
    }

    /* renamed from: U0 */
    public final boolean m1484U0() {
        return m1618E() == 1;
    }

    /* renamed from: V0 */
    public void mo1431V0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, C0429c c0429c, C0428b c0428b) {
        int mo1789d;
        int i7;
        int i8;
        int i9;
        int m1620G;
        int i10;
        View m1511b = c0429c.m1511b(c0450s);
        if (m1511b == null) {
            c0428b.f2082b = true;
            return;
        }
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) m1511b.getLayoutParams();
        if (c0429c.f2095k == null) {
            if (this.f2070u == (c0429c.f2090f == -1)) {
                m1627b(m1511b, -1, false);
            } else {
                m1627b(m1511b, 0, false);
            }
        } else {
            if (this.f2070u == (c0429c.f2090f == -1)) {
                m1627b(m1511b, -1, true);
            } else {
                m1627b(m1511b, 0, true);
            }
        }
        RecyclerView.C0445n c0445n2 = (RecyclerView.C0445n) m1511b.getLayoutParams();
        Rect m1526J = this.f2209b.m1526J(m1511b);
        int i11 = m1526J.left + m1526J.right + 0;
        int i12 = m1526J.top + m1526J.bottom + 0;
        int m1614x = RecyclerView.AbstractC0444m.m1614x(mo1493e(), this.f2221n, this.f2219l, m1621H() + m1620G() + ((ViewGroup.MarginLayoutParams) c0445n2).leftMargin + ((ViewGroup.MarginLayoutParams) c0445n2).rightMargin + i11, ((ViewGroup.MarginLayoutParams) c0445n2).width);
        int m1614x2 = RecyclerView.AbstractC0444m.m1614x(mo1496f(), this.f2222o, this.f2220m, m1619F() + m1622I() + ((ViewGroup.MarginLayoutParams) c0445n2).topMargin + ((ViewGroup.MarginLayoutParams) c0445n2).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) c0445n2).height);
        if (m1642v0(m1511b, m1614x, m1614x2, c0445n2)) {
            m1511b.measure(m1614x, m1614x2);
        }
        c0428b.f2081a = this.f2067r.mo1788c(m1511b);
        if (this.f2065p == 1) {
            if (m1484U0()) {
                i9 = this.f2221n - m1621H();
                m1620G = i9 - this.f2067r.mo1789d(m1511b);
            } else {
                m1620G = m1620G();
                i9 = this.f2067r.mo1789d(m1511b) + m1620G;
            }
            int i13 = c0429c.f2090f;
            i8 = c0429c.f2086b;
            if (i13 == -1) {
                i10 = m1620G;
                mo1789d = i8;
                i8 -= c0428b.f2081a;
            } else {
                i10 = m1620G;
                mo1789d = c0428b.f2081a + i8;
            }
            i7 = i10;
        } else {
            int m1622I = m1622I();
            mo1789d = this.f2067r.mo1789d(m1511b) + m1622I;
            int i14 = c0429c.f2090f;
            int i15 = c0429c.f2086b;
            if (i14 == -1) {
                i7 = i15 - c0428b.f2081a;
                i9 = i15;
                i8 = m1622I;
            } else {
                int i16 = c0428b.f2081a + i15;
                i7 = i15;
                i8 = m1622I;
                i9 = i16;
            }
        }
        RecyclerView.AbstractC0444m.m1612P(m1511b, i7, i8, i9, mo1789d);
        if (c0445n.m1653c() || c0445n.m1652b()) {
            c0428b.f2083c = true;
        }
        c0428b.f2084d = m1511b.hasFocusable();
    }

    /* renamed from: W0 */
    public void mo1433W0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, C0427a c0427a, int i7) {
    }

    /* renamed from: X0 */
    public final void m1485X0(RecyclerView.C0450s c0450s, C0429c c0429c) {
        if (!c0429c.f2085a || c0429c.f2096l) {
            return;
        }
        int i7 = c0429c.f2091g;
        int i8 = c0429c.f2093i;
        if (c0429c.f2090f == -1) {
            int m1643w = m1643w();
            if (i7 < 0) {
                return;
            }
            int mo1791f = (this.f2067r.mo1791f() - i7) + i8;
            if (this.f2070u) {
                for (int i9 = 0; i9 < m1643w; i9++) {
                    View m1641v = m1641v(i9);
                    if (this.f2067r.mo1790e(m1641v) < mo1791f || this.f2067r.mo1799n(m1641v) < mo1791f) {
                        m1486Y0(c0450s, 0, i9);
                        return;
                    }
                }
                return;
            }
            int i10 = m1643w - 1;
            for (int i11 = i10; i11 >= 0; i11--) {
                View m1641v2 = m1641v(i11);
                if (this.f2067r.mo1790e(m1641v2) < mo1791f || this.f2067r.mo1799n(m1641v2) < mo1791f) {
                    m1486Y0(c0450s, i10, i11);
                    return;
                }
            }
            return;
        }
        if (i7 < 0) {
            return;
        }
        int i12 = i7 - i8;
        int m1643w2 = m1643w();
        if (!this.f2070u) {
            for (int i13 = 0; i13 < m1643w2; i13++) {
                View m1641v3 = m1641v(i13);
                if (this.f2067r.mo1787b(m1641v3) > i12 || this.f2067r.mo1798m(m1641v3) > i12) {
                    m1486Y0(c0450s, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = m1643w2 - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View m1641v4 = m1641v(i15);
            if (this.f2067r.mo1787b(m1641v4) > i12 || this.f2067r.mo1798m(m1641v4) > i12) {
                m1486Y0(c0450s, i14, i15);
                return;
            }
        }
    }

    /* renamed from: Y0 */
    public final void m1486Y0(RecyclerView.C0450s c0450s, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        if (i8 <= i7) {
            while (i7 > i8) {
                View m1641v = m1641v(i7);
                m1633k0(i7);
                c0450s.m1666g(m1641v);
                i7--;
            }
            return;
        }
        while (true) {
            i8--;
            if (i8 < i7) {
                return;
            }
            View m1641v2 = m1641v(i8);
            m1633k0(i8);
            c0450s.m1666g(m1641v2);
        }
    }

    /* renamed from: Z0 */
    public final void m1487Z0() {
        this.f2070u = (this.f2065p == 1 || !m1484U0()) ? this.f2069t : !this.f2069t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0454w.b
    /* renamed from: a */
    public final PointF mo1488a(int i7) {
        if (m1643w() == 0) {
            return null;
        }
        int i8 = (i7 < RecyclerView.AbstractC0444m.m1609J(m1641v(0))) != this.f2070u ? -1 : 1;
        return this.f2065p == 0 ? new PointF(i8, 0.0f) : new PointF(0.0f, i8);
    }

    /* renamed from: a1 */
    public final int m1489a1(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (m1643w() == 0 || i7 == 0) {
            return 0;
        }
        m1469H0();
        this.f2066q.f2085a = true;
        int i8 = i7 > 0 ? 1 : -1;
        int abs = Math.abs(i7);
        m1492d1(i8, abs, true, c0455x);
        C0429c c0429c = this.f2066q;
        int m1470I0 = m1470I0(c0450s, c0429c, c0455x, false) + c0429c.f2091g;
        if (m1470I0 < 0) {
            return 0;
        }
        if (abs > m1470I0) {
            i7 = i8 * m1470I0;
        }
        this.f2067r.mo1800o(-i7);
        this.f2066q.f2094j = i7;
        return i7;
    }

    /* renamed from: b1 */
    public final void m1490b1(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(C0090b.m219e("invalid orientation:", i7));
        }
        mo1491c(null);
        if (i7 != this.f2065p || this.f2067r == null) {
            AbstractC0485s m1801a = AbstractC0485s.m1801a(this, i7);
            this.f2067r = m1801a;
            this.f2061A.f2076a = m1801a;
            this.f2065p = i7;
            m1635m0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: c */
    public final void mo1491c(String str) {
        if (this.f2075z == null) {
            super.mo1491c(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0298  */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v40 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1439c0(androidx.recyclerview.widget.RecyclerView.C0450s r18, androidx.recyclerview.widget.RecyclerView.C0455x r19) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1439c0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    /* renamed from: c1 */
    public void mo1440c1(boolean z6) {
        mo1491c(null);
        if (this.f2071v == z6) {
            return;
        }
        this.f2071v = z6;
        m1635m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: d0 */
    public void mo1441d0(RecyclerView.C0455x c0455x) {
        this.f2075z = null;
        this.f2073x = -1;
        this.f2074y = Integer.MIN_VALUE;
        this.f2061A.m1509c();
    }

    /* renamed from: d1 */
    public final void m1492d1(int i7, int i8, boolean z6, RecyclerView.C0455x c0455x) {
        int mo1796k;
        this.f2066q.f2096l = this.f2067r.mo1794i() == 0 && this.f2067r.mo1791f() == 0;
        this.f2066q.f2090f = i7;
        int[] iArr = this.f2064D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1464B0(c0455x, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z7 = i7 == 1;
        C0429c c0429c = this.f2066q;
        int i9 = z7 ? max2 : max;
        c0429c.f2092h = i9;
        if (!z7) {
            max = max2;
        }
        c0429c.f2093i = max;
        if (z7) {
            c0429c.f2092h = this.f2067r.mo1793h() + i9;
            View m1481S0 = m1481S0();
            C0429c c0429c2 = this.f2066q;
            c0429c2.f2089e = this.f2070u ? -1 : 1;
            int m1609J = RecyclerView.AbstractC0444m.m1609J(m1481S0);
            C0429c c0429c3 = this.f2066q;
            c0429c2.f2088d = m1609J + c0429c3.f2089e;
            c0429c3.f2086b = this.f2067r.mo1787b(m1481S0);
            mo1796k = this.f2067r.mo1787b(m1481S0) - this.f2067r.mo1792g();
        } else {
            View m1482T0 = m1482T0();
            C0429c c0429c4 = this.f2066q;
            c0429c4.f2092h = this.f2067r.mo1796k() + c0429c4.f2092h;
            C0429c c0429c5 = this.f2066q;
            c0429c5.f2089e = this.f2070u ? 1 : -1;
            int m1609J2 = RecyclerView.AbstractC0444m.m1609J(m1482T0);
            C0429c c0429c6 = this.f2066q;
            c0429c5.f2088d = m1609J2 + c0429c6.f2089e;
            c0429c6.f2086b = this.f2067r.mo1790e(m1482T0);
            mo1796k = (-this.f2067r.mo1790e(m1482T0)) + this.f2067r.mo1796k();
        }
        C0429c c0429c7 = this.f2066q;
        c0429c7.f2087c = i8;
        if (z6) {
            c0429c7.f2087c = i8 - mo1796k;
        }
        c0429c7.f2091g = mo1796k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: e */
    public final boolean mo1493e() {
        return this.f2065p == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: e0 */
    public final void mo1494e0(Parcelable parcelable) {
        if (parcelable instanceof C0430d) {
            this.f2075z = (C0430d) parcelable;
            m1635m0();
        }
    }

    /* renamed from: e1 */
    public final void m1495e1(int i7, int i8) {
        this.f2066q.f2087c = this.f2067r.mo1792g() - i8;
        C0429c c0429c = this.f2066q;
        c0429c.f2089e = this.f2070u ? -1 : 1;
        c0429c.f2088d = i7;
        c0429c.f2090f = 1;
        c0429c.f2086b = i8;
        c0429c.f2091g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: f */
    public final boolean mo1496f() {
        return this.f2065p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: f0 */
    public final Parcelable mo1497f0() {
        C0430d c0430d = this.f2075z;
        if (c0430d != null) {
            return new C0430d(c0430d);
        }
        C0430d c0430d2 = new C0430d();
        if (m1643w() > 0) {
            m1469H0();
            boolean z6 = this.f2068s ^ this.f2070u;
            c0430d2.f2099m = z6;
            if (z6) {
                View m1481S0 = m1481S0();
                c0430d2.f2098e = this.f2067r.mo1792g() - this.f2067r.mo1787b(m1481S0);
                c0430d2.f2097c = RecyclerView.AbstractC0444m.m1609J(m1481S0);
            } else {
                View m1482T0 = m1482T0();
                c0430d2.f2097c = RecyclerView.AbstractC0444m.m1609J(m1482T0);
                c0430d2.f2098e = this.f2067r.mo1790e(m1482T0) - this.f2067r.mo1796k();
            }
        } else {
            c0430d2.f2097c = -1;
        }
        return c0430d2;
    }

    /* renamed from: f1 */
    public final void m1498f1(int i7, int i8) {
        this.f2066q.f2087c = i8 - this.f2067r.mo1796k();
        C0429c c0429c = this.f2066q;
        c0429c.f2088d = i7;
        c0429c.f2089e = this.f2070u ? 1 : -1;
        c0429c.f2090f = -1;
        c0429c.f2086b = i8;
        c0429c.f2091g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: i */
    public final void mo1499i(int i7, int i8, RecyclerView.C0455x c0455x, RecyclerView.AbstractC0444m.c cVar) {
        if (this.f2065p != 0) {
            i7 = i8;
        }
        if (m1643w() == 0 || i7 == 0) {
            return;
        }
        m1469H0();
        m1492d1(i7 > 0 ? 1 : -1, Math.abs(i7), true, c0455x);
        mo1427C0(c0455x, this.f2066q, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1500j(int r7, androidx.recyclerview.widget.RecyclerView.AbstractC0444m.c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r6.f2075z
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f2097c
            if (r4 < 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f2099m
            goto L22
        L13:
            r6.m1487Z0()
            boolean r0 = r6.f2070u
            int r4 = r6.f2073x
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = 0
        L22:
            if (r0 == 0) goto L25
            r1 = -1
        L25:
            r0 = 0
        L26:
            int r2 = r6.f2063C
            if (r0 >= r2) goto L38
            if (r4 < 0) goto L38
            if (r4 >= r7) goto L38
            r2 = r8
            androidx.recyclerview.widget.m$b r2 = (androidx.recyclerview.widget.RunnableC0479m.b) r2
            r2.m1780a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1500j(int, androidx.recyclerview.widget.RecyclerView$m$c):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: k */
    public final int mo1501k(RecyclerView.C0455x c0455x) {
        return m1465D0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: l */
    public int mo1448l(RecyclerView.C0455x c0455x) {
        return m1466E0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: m */
    public int mo1450m(RecyclerView.C0455x c0455x) {
        return m1467F0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: n */
    public final int mo1502n(RecyclerView.C0455x c0455x) {
        return m1465D0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: n0 */
    public int mo1452n0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (this.f2065p == 1) {
            return 0;
        }
        return m1489a1(i7, c0450s, c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: o */
    public int mo1454o(RecyclerView.C0455x c0455x) {
        return m1466E0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: o0 */
    public final void mo1503o0(int i7) {
        this.f2073x = i7;
        this.f2074y = Integer.MIN_VALUE;
        C0430d c0430d = this.f2075z;
        if (c0430d != null) {
            c0430d.f2097c = -1;
        }
        m1635m0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: p */
    public int mo1455p(RecyclerView.C0455x c0455x) {
        return m1467F0(c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: p0 */
    public int mo1456p0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (this.f2065p == 0) {
            return 0;
        }
        return m1489a1(i7, c0450s, c0455x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: r */
    public final View mo1504r(int i7) {
        int m1643w = m1643w();
        if (m1643w == 0) {
            return null;
        }
        int m1609J = i7 - RecyclerView.AbstractC0444m.m1609J(m1641v(0));
        if (m1609J >= 0 && m1609J < m1643w) {
            View m1641v = m1641v(m1609J);
            if (RecyclerView.AbstractC0444m.m1609J(m1641v) == i7) {
                return m1641v;
            }
        }
        return super.mo1504r(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: s */
    public RecyclerView.C0445n mo1457s() {
        return new RecyclerView.C0445n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: w0 */
    public final boolean mo1505w0() {
        boolean z6;
        if (this.f2220m == 1073741824 || this.f2219l == 1073741824) {
            return false;
        }
        int m1643w = m1643w();
        int i7 = 0;
        while (true) {
            if (i7 >= m1643w) {
                z6 = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = m1641v(i7).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z6 = true;
                break;
            }
            i7++;
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: y0 */
    public void mo1506y0(RecyclerView recyclerView, int i7) {
        C0481o c0481o = new C0481o(recyclerView.getContext());
        c0481o.f2249a = i7;
        m1645z0(c0481o);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f2065p = 1;
        this.f2069t = false;
        this.f2070u = false;
        this.f2071v = false;
        this.f2072w = true;
        this.f2073x = -1;
        this.f2074y = Integer.MIN_VALUE;
        this.f2075z = null;
        this.f2061A = new C0427a();
        this.f2062B = new C0428b();
        this.f2063C = 2;
        this.f2064D = new int[2];
        RecyclerView.AbstractC0444m.d m1610K = RecyclerView.AbstractC0444m.m1610K(context, attributeSet, i7, i8);
        m1490b1(m1610K.f2225a);
        boolean z6 = m1610K.f2227c;
        mo1491c(null);
        if (z6 != this.f2069t) {
            this.f2069t = z6;
            m1635m0();
        }
        mo1440c1(m1610K.f2228d);
    }
}
