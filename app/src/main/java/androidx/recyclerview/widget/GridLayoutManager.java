package androidx.recyclerview.widget;

import android.content.Context;
import android.ext.C0090b;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC0479m;
import java.util.Arrays;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f2049E;

    /* renamed from: F */
    public int f2050F;

    /* renamed from: G */
    public int[] f2051G;

    /* renamed from: H */
    public View[] f2052H;

    /* renamed from: I */
    public final SparseIntArray f2053I;

    /* renamed from: J */
    public final SparseIntArray f2054J;

    /* renamed from: K */
    public final C0424a f2055K;

    /* renamed from: L */
    public final Rect f2056L;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0424a extends AbstractC0426c {
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0425b extends RecyclerView.C0445n {

        /* renamed from: e */
        public int f2057e;

        /* renamed from: f */
        public int f2058f;

        public C0425b(int i7, int i8) {
            super(i7, i8);
            this.f2057e = -1;
            this.f2058f = 0;
        }

        public C0425b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2057e = -1;
            this.f2058f = 0;
        }

        public C0425b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2057e = -1;
            this.f2058f = 0;
        }

        public C0425b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2057e = -1;
            this.f2058f = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0426c {

        /* renamed from: a */
        public final SparseIntArray f2059a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f2060b = new SparseIntArray();

        /* renamed from: a */
        public static int m1462a(int i7, int i8) {
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                i9++;
                if (i9 == i8) {
                    i10++;
                    i9 = 0;
                } else if (i9 > i8) {
                    i10++;
                    i9 = 1;
                }
            }
            return i9 + 1 > i8 ? i10 + 1 : i10;
        }

        /* renamed from: b */
        public final void m1463b() {
            this.f2059a.clear();
        }
    }

    public GridLayoutManager(int i7) {
        super(1);
        this.f2049E = false;
        this.f2050F = -1;
        this.f2053I = new SparseIntArray();
        this.f2054J = new SparseIntArray();
        this.f2055K = new C0424a();
        this.f2056L = new Rect();
        m1451m1(i7);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f2049E = false;
        this.f2050F = -1;
        this.f2053I = new SparseIntArray();
        this.f2054J = new SparseIntArray();
        this.f2055K = new C0424a();
        this.f2056L = new Rect();
        m1451m1(RecyclerView.AbstractC0444m.m1610K(context, attributeSet, i7, i8).f2226b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: A0 */
    public final boolean mo1426A0() {
        return this.f2075z == null && !this.f2049E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: C0 */
    public final void mo1427C0(RecyclerView.C0455x c0455x, LinearLayoutManager.C0429c c0429c, RecyclerView.AbstractC0444m.c cVar) {
        int i7 = this.f2050F;
        for (int i8 = 0; i8 < this.f2050F; i8++) {
            int i9 = c0429c.f2088d;
            if (!(i9 >= 0 && i9 < c0455x.m1679b()) || i7 <= 0) {
                return;
            }
            ((RunnableC0479m.b) cVar).m1780a(c0429c.f2088d, Math.max(0, c0429c.f2091g));
            this.f2055K.getClass();
            i7--;
            c0429c.f2088d += c0429c.f2089e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: L */
    public final int mo1428L(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (this.f2065p == 0) {
            return this.f2050F;
        }
        if (c0455x.m1679b() < 1) {
            return 0;
        }
        return m1445i1(c0455x.m1679b() - 1, c0450s, c0455x) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: P0 */
    public final View mo1429P0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, int i7, int i8, int i9) {
        m1469H0();
        int mo1796k = this.f2067r.mo1796k();
        int mo1792g = this.f2067r.mo1792g();
        int i10 = i8 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i8) {
            View m1641v = m1641v(i7);
            int m1609J = RecyclerView.AbstractC0444m.m1609J(m1641v);
            if (m1609J >= 0 && m1609J < i9 && m1446j1(m1609J, c0450s, c0455x) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010e, code lost:
    
        if (r13 == (r2 > r8)) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo1430T(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C0450s r25, androidx.recyclerview.widget.RecyclerView.C0455x r26) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1430T(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: V0 */
    public final void mo1431V0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, LinearLayoutManager.C0429c c0429c, LinearLayoutManager.C0428b c0428b) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int m1614x;
        int i18;
        boolean z6;
        View m1511b;
        int mo1795j = this.f2067r.mo1795j();
        boolean z7 = mo1795j != 1073741824;
        int i19 = m1643w() > 0 ? this.f2051G[this.f2050F] : 0;
        if (z7) {
            m1453n1();
        }
        boolean z8 = c0429c.f2089e == 1;
        int i20 = this.f2050F;
        if (!z8) {
            i20 = m1446j1(c0429c.f2088d, c0450s, c0455x) + m1447k1(c0429c.f2088d, c0450s, c0455x);
        }
        int i21 = 0;
        while (i21 < this.f2050F) {
            int i22 = c0429c.f2088d;
            if (!(i22 >= 0 && i22 < c0455x.m1679b()) || i20 <= 0) {
                break;
            }
            int i23 = c0429c.f2088d;
            int m1447k1 = m1447k1(i23, c0450s, c0455x);
            if (m1447k1 > this.f2050F) {
                throw new IllegalArgumentException("Item at position " + i23 + " requires " + m1447k1 + " spans but GridLayoutManager has only " + this.f2050F + " spans.");
            }
            i20 -= m1447k1;
            if (i20 < 0 || (m1511b = c0429c.m1511b(c0450s)) == null) {
                break;
            }
            this.f2052H[i21] = m1511b;
            i21++;
        }
        if (i21 == 0) {
            c0428b.f2082b = true;
            return;
        }
        if (z8) {
            i8 = i21;
            i7 = 0;
            i9 = 0;
            i10 = 1;
        } else {
            i7 = i21 - 1;
            i8 = -1;
            i9 = 0;
            i10 = -1;
        }
        while (i7 != i8) {
            View view = this.f2052H[i7];
            C0425b c0425b = (C0425b) view.getLayoutParams();
            int m1447k12 = m1447k1(RecyclerView.AbstractC0444m.m1609J(view), c0450s, c0455x);
            c0425b.f2058f = m1447k12;
            c0425b.f2057e = i9;
            i9 += m1447k12;
            i7 += i10;
        }
        float f7 = 0.0f;
        int i24 = 0;
        for (int i25 = 0; i25 < i21; i25++) {
            View view2 = this.f2052H[i25];
            if (c0429c.f2095k != null) {
                z6 = false;
                if (z8) {
                    m1627b(view2, -1, true);
                } else {
                    m1627b(view2, 0, true);
                }
            } else if (z8) {
                z6 = false;
                m1627b(view2, -1, false);
            } else {
                z6 = false;
                m1627b(view2, 0, false);
            }
            m1628d(view2, this.f2056L);
            m1449l1(view2, mo1795j, z6);
            int mo1788c = this.f2067r.mo1788c(view2);
            if (mo1788c > i24) {
                i24 = mo1788c;
            }
            float mo1789d = (this.f2067r.mo1789d(view2) * 1.0f) / ((C0425b) view2.getLayoutParams()).f2058f;
            if (mo1789d > f7) {
                f7 = mo1789d;
            }
        }
        if (z7) {
            m1443g1(Math.max(Math.round(f7 * this.f2050F), i19));
            i24 = 0;
            for (int i26 = 0; i26 < i21; i26++) {
                View view3 = this.f2052H[i26];
                m1449l1(view3, 1073741824, true);
                int mo1788c2 = this.f2067r.mo1788c(view3);
                if (mo1788c2 > i24) {
                    i24 = mo1788c2;
                }
            }
        }
        for (int i27 = 0; i27 < i21; i27++) {
            View view4 = this.f2052H[i27];
            if (this.f2067r.mo1788c(view4) != i24) {
                C0425b c0425b2 = (C0425b) view4.getLayoutParams();
                Rect rect = c0425b2.f2230b;
                int i28 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0425b2).topMargin + ((ViewGroup.MarginLayoutParams) c0425b2).bottomMargin;
                int i29 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0425b2).leftMargin + ((ViewGroup.MarginLayoutParams) c0425b2).rightMargin;
                int m1444h1 = m1444h1(c0425b2.f2057e, c0425b2.f2058f);
                if (this.f2065p == 1) {
                    i18 = RecyclerView.AbstractC0444m.m1614x(false, m1444h1, 1073741824, i29, ((ViewGroup.MarginLayoutParams) c0425b2).width);
                    m1614x = View.MeasureSpec.makeMeasureSpec(i24 - i28, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i24 - i29, 1073741824);
                    m1614x = RecyclerView.AbstractC0444m.m1614x(false, m1444h1, 1073741824, i28, ((ViewGroup.MarginLayoutParams) c0425b2).height);
                    i18 = makeMeasureSpec;
                }
                if (m1644x0(view4, i18, m1614x, (RecyclerView.C0445n) view4.getLayoutParams())) {
                    view4.measure(i18, m1614x);
                }
            }
        }
        c0428b.f2081a = i24;
        if (this.f2065p == 1) {
            if (c0429c.f2090f == -1) {
                i17 = c0429c.f2086b;
                i16 = i17 - i24;
            } else {
                int i30 = c0429c.f2086b;
                i16 = i30;
                i17 = i24 + i30;
            }
            i14 = i16;
            i13 = 0;
            i15 = i17;
            i12 = 0;
        } else {
            if (c0429c.f2090f == -1) {
                i12 = c0429c.f2086b;
                i11 = i12 - i24;
            } else {
                int i31 = c0429c.f2086b;
                i11 = i31;
                i12 = i24 + i31;
            }
            i13 = i11;
            i14 = 0;
            i15 = 0;
        }
        for (int i32 = 0; i32 < i21; i32++) {
            View view5 = this.f2052H[i32];
            C0425b c0425b3 = (C0425b) view5.getLayoutParams();
            if (this.f2065p != 1) {
                i14 = m1622I() + this.f2051G[c0425b3.f2057e];
                i15 = this.f2067r.mo1789d(view5) + i14;
            } else if (m1484U0()) {
                i12 = m1620G() + this.f2051G[this.f2050F - c0425b3.f2057e];
                i13 = i12 - this.f2067r.mo1789d(view5);
            } else {
                int m1620G = m1620G() + this.f2051G[c0425b3.f2057e];
                i13 = m1620G;
                i12 = this.f2067r.mo1789d(view5) + m1620G;
            }
            RecyclerView.AbstractC0444m.m1612P(view5, i13, i14, i12, i15);
            if (c0425b3.m1653c() || c0425b3.m1652b()) {
                c0428b.f2083c = true;
            }
            c0428b.f2084d = view5.hasFocusable() | c0428b.f2084d;
        }
        Arrays.fill(this.f2052H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: W */
    public final void mo1432W(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, View view, C1151g c1151g) {
        int i7;
        int i8;
        int i9;
        int i10;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0425b)) {
            m1626V(view, c1151g);
            return;
        }
        C0425b c0425b = (C0425b) layoutParams;
        int m1445i1 = m1445i1(c0425b.m1651a(), c0450s, c0455x);
        if (this.f2065p == 0) {
            i8 = m1445i1;
            i7 = c0425b.f2057e;
            i10 = c0425b.f2058f;
            i9 = 1;
        } else {
            i7 = m1445i1;
            i8 = c0425b.f2057e;
            i9 = c0425b.f2058f;
            i10 = 1;
        }
        c1151g.m3343h(C1151g.b.m3349a(i7, i10, i8, i9, false, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: W0 */
    public final void mo1433W0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x, LinearLayoutManager.C0427a c0427a, int i7) {
        m1453n1();
        if (c0455x.m1679b() > 0 && !c0455x.f2270g) {
            boolean z6 = i7 == 1;
            int m1446j1 = m1446j1(c0427a.f2077b, c0450s, c0455x);
            if (z6) {
                while (m1446j1 > 0) {
                    int i8 = c0427a.f2077b;
                    if (i8 <= 0) {
                        break;
                    }
                    int i9 = i8 - 1;
                    c0427a.f2077b = i9;
                    m1446j1 = m1446j1(i9, c0450s, c0455x);
                }
            } else {
                int m1679b = c0455x.m1679b() - 1;
                int i10 = c0427a.f2077b;
                while (i10 < m1679b) {
                    int i11 = i10 + 1;
                    int m1446j12 = m1446j1(i11, c0450s, c0455x);
                    if (m1446j12 <= m1446j1) {
                        break;
                    }
                    i10 = i11;
                    m1446j1 = m1446j12;
                }
                c0427a.f2077b = i10;
            }
        }
        View[] viewArr = this.f2052H;
        if (viewArr == null || viewArr.length != this.f2050F) {
            this.f2052H = new View[this.f2050F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: X */
    public final void mo1434X(int i7, int i8) {
        C0424a c0424a = this.f2055K;
        c0424a.m1463b();
        c0424a.f2060b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: Y */
    public final void mo1435Y() {
        C0424a c0424a = this.f2055K;
        c0424a.m1463b();
        c0424a.f2060b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: Z */
    public final void mo1436Z(int i7, int i8) {
        C0424a c0424a = this.f2055K;
        c0424a.m1463b();
        c0424a.f2060b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: a0 */
    public final void mo1437a0(int i7, int i8) {
        C0424a c0424a = this.f2055K;
        c0424a.m1463b();
        c0424a.f2060b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: b0 */
    public final void mo1438b0(int i7, int i8) {
        C0424a c0424a = this.f2055K;
        c0424a.m1463b();
        c0424a.f2060b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: c0 */
    public final void mo1439c0(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        boolean z6 = c0455x.f2270g;
        SparseIntArray sparseIntArray = this.f2054J;
        SparseIntArray sparseIntArray2 = this.f2053I;
        if (z6) {
            int m1643w = m1643w();
            for (int i7 = 0; i7 < m1643w; i7++) {
                C0425b c0425b = (C0425b) m1641v(i7).getLayoutParams();
                int m1651a = c0425b.m1651a();
                sparseIntArray2.put(m1651a, c0425b.f2058f);
                sparseIntArray.put(m1651a, c0425b.f2057e);
            }
        }
        super.mo1439c0(c0450s, c0455x);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: c1 */
    public final void mo1440c1(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1440c1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: d0 */
    public final void mo1441d0(RecyclerView.C0455x c0455x) {
        super.mo1441d0(c0455x);
        this.f2049E = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: g */
    public final boolean mo1442g(RecyclerView.C0445n c0445n) {
        return c0445n instanceof C0425b;
    }

    /* renamed from: g1 */
    public final void m1443g1(int i7) {
        int i8;
        int[] iArr = this.f2051G;
        int i9 = this.f2050F;
        if (iArr == null || iArr.length != i9 + 1 || iArr[iArr.length - 1] != i7) {
            iArr = new int[i9 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i7 / i9;
        int i12 = i7 % i9;
        int i13 = 0;
        for (int i14 = 1; i14 <= i9; i14++) {
            i10 += i12;
            if (i10 <= 0 || i9 - i10 >= i12) {
                i8 = i11;
            } else {
                i8 = i11 + 1;
                i10 -= i9;
            }
            i13 += i8;
            iArr[i14] = i13;
        }
        this.f2051G = iArr;
    }

    /* renamed from: h1 */
    public final int m1444h1(int i7, int i8) {
        if (this.f2065p != 1 || !m1484U0()) {
            int[] iArr = this.f2051G;
            return iArr[i8 + i7] - iArr[i7];
        }
        int[] iArr2 = this.f2051G;
        int i9 = this.f2050F;
        return iArr2[i9 - i7] - iArr2[(i9 - i7) - i8];
    }

    /* renamed from: i1 */
    public final int m1445i1(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        boolean z6 = c0455x.f2270g;
        C0424a c0424a = this.f2055K;
        if (!z6) {
            int i8 = this.f2050F;
            c0424a.getClass();
            return AbstractC0426c.m1462a(i7, i8);
        }
        int m1661b = c0450s.m1661b(i7);
        if (m1661b != -1) {
            int i9 = this.f2050F;
            c0424a.getClass();
            return AbstractC0426c.m1462a(m1661b, i9);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
        return 0;
    }

    /* renamed from: j1 */
    public final int m1446j1(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        boolean z6 = c0455x.f2270g;
        C0424a c0424a = this.f2055K;
        if (!z6) {
            int i8 = this.f2050F;
            c0424a.getClass();
            return i7 % i8;
        }
        int i9 = this.f2054J.get(i7, -1);
        if (i9 != -1) {
            return i9;
        }
        int m1661b = c0450s.m1661b(i7);
        if (m1661b != -1) {
            int i10 = this.f2050F;
            c0424a.getClass();
            return m1661b % i10;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 0;
    }

    /* renamed from: k1 */
    public final int m1447k1(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        boolean z6 = c0455x.f2270g;
        C0424a c0424a = this.f2055K;
        if (!z6) {
            c0424a.getClass();
            return 1;
        }
        int i8 = this.f2053I.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        if (c0450s.m1661b(i7) != -1) {
            c0424a.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: l */
    public final int mo1448l(RecyclerView.C0455x c0455x) {
        return m1466E0(c0455x);
    }

    /* renamed from: l1 */
    public final void m1449l1(View view, int i7, boolean z6) {
        int i8;
        int i9;
        C0425b c0425b = (C0425b) view.getLayoutParams();
        Rect rect = c0425b.f2230b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0425b).topMargin + ((ViewGroup.MarginLayoutParams) c0425b).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0425b).leftMargin + ((ViewGroup.MarginLayoutParams) c0425b).rightMargin;
        int m1444h1 = m1444h1(c0425b.f2057e, c0425b.f2058f);
        if (this.f2065p == 1) {
            i9 = RecyclerView.AbstractC0444m.m1614x(false, m1444h1, i7, i11, ((ViewGroup.MarginLayoutParams) c0425b).width);
            i8 = RecyclerView.AbstractC0444m.m1614x(true, this.f2067r.mo1797l(), this.f2220m, i10, ((ViewGroup.MarginLayoutParams) c0425b).height);
        } else {
            int m1614x = RecyclerView.AbstractC0444m.m1614x(false, m1444h1, i7, i10, ((ViewGroup.MarginLayoutParams) c0425b).height);
            int m1614x2 = RecyclerView.AbstractC0444m.m1614x(true, this.f2067r.mo1797l(), this.f2219l, i11, ((ViewGroup.MarginLayoutParams) c0425b).width);
            i8 = m1614x;
            i9 = m1614x2;
        }
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        if (z6 ? m1644x0(view, i9, i8, c0445n) : m1642v0(view, i9, i8, c0445n)) {
            view.measure(i9, i8);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: m */
    public final int mo1450m(RecyclerView.C0455x c0455x) {
        return m1467F0(c0455x);
    }

    /* renamed from: m1 */
    public final void m1451m1(int i7) {
        if (i7 == this.f2050F) {
            return;
        }
        this.f2049E = true;
        if (i7 < 1) {
            throw new IllegalArgumentException(C0090b.m219e("Span count should be at least 1. Provided ", i7));
        }
        this.f2050F = i7;
        this.f2055K.m1463b();
        m1635m0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: n0 */
    public final int mo1452n0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        m1453n1();
        View[] viewArr = this.f2052H;
        if (viewArr == null || viewArr.length != this.f2050F) {
            this.f2052H = new View[this.f2050F];
        }
        return super.mo1452n0(i7, c0450s, c0455x);
    }

    /* renamed from: n1 */
    public final void m1453n1() {
        int m1619F;
        int m1622I;
        if (this.f2065p == 1) {
            m1619F = this.f2221n - m1621H();
            m1622I = m1620G();
        } else {
            m1619F = this.f2222o - m1619F();
            m1622I = m1622I();
        }
        m1443g1(m1619F - m1622I);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: o */
    public final int mo1454o(RecyclerView.C0455x c0455x) {
        return m1466E0(c0455x);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: p */
    public final int mo1455p(RecyclerView.C0455x c0455x) {
        return m1467F0(c0455x);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: p0 */
    public final int mo1456p0(int i7, RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        m1453n1();
        View[] viewArr = this.f2052H;
        if (viewArr == null || viewArr.length != this.f2050F) {
            this.f2052H = new View[this.f2050F];
        }
        return super.mo1456p0(i7, c0450s, c0455x);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: s */
    public final RecyclerView.C0445n mo1457s() {
        return this.f2065p == 0 ? new C0425b(-2, -1) : new C0425b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: s0 */
    public final void mo1458s0(Rect rect, int i7, int i8) {
        int m1613h;
        int m1613h2;
        if (this.f2051G == null) {
            super.mo1458s0(rect, i7, i8);
        }
        int m1621H = m1621H() + m1620G();
        int m1619F = m1619F() + m1622I();
        if (this.f2065p == 1) {
            int height = rect.height() + m1619F;
            RecyclerView recyclerView = this.f2209b;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            m1613h2 = RecyclerView.AbstractC0444m.m1613h(i8, height, C0946x.d.m2828d(recyclerView));
            int[] iArr = this.f2051G;
            m1613h = RecyclerView.AbstractC0444m.m1613h(i7, iArr[iArr.length - 1] + m1621H, C0946x.d.m2829e(this.f2209b));
        } else {
            int width = rect.width() + m1621H;
            RecyclerView recyclerView2 = this.f2209b;
            WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
            m1613h = RecyclerView.AbstractC0444m.m1613h(i7, width, C0946x.d.m2829e(recyclerView2));
            int[] iArr2 = this.f2051G;
            m1613h2 = RecyclerView.AbstractC0444m.m1613h(i8, iArr2[iArr2.length - 1] + m1619F, C0946x.d.m2828d(this.f2209b));
        }
        this.f2209b.setMeasuredDimension(m1613h, m1613h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: t */
    public final RecyclerView.C0445n mo1459t(Context context, AttributeSet attributeSet) {
        return new C0425b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: u */
    public final RecyclerView.C0445n mo1460u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0425b((ViewGroup.MarginLayoutParams) layoutParams) : new C0425b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0444m
    /* renamed from: y */
    public final int mo1461y(RecyclerView.C0450s c0450s, RecyclerView.C0455x c0455x) {
        if (this.f2065p == 1) {
            return this.f2050F;
        }
        if (c0455x.m1679b() < 1) {
            return 0;
        }
        return m1445i1(c0455x.m1679b() - 1, c0450s, c0455x) + 1;
    }
}
