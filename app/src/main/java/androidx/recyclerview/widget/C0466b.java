package androidx.recyclerview.widget;

import android.ext.Tools;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public final class C0466b {

    /* renamed from: a */
    public final b f2352a;

    /* renamed from: b */
    public final a f2353b = new a();

    /* renamed from: c */
    public final ArrayList f2354c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    public static class a {

        /* renamed from: a */
        public long f2355a = 0;

        /* renamed from: b */
        public a f2356b;

        /* renamed from: a */
        public final void m1751a(int i7) {
            if (i7 < 64) {
                this.f2355a &= ~(1 << i7);
                return;
            }
            a aVar = this.f2356b;
            if (aVar != null) {
                aVar.m1751a(i7 - 64);
            }
        }

        /* renamed from: b */
        public final int m1752b(int i7) {
            long j7;
            a aVar = this.f2356b;
            if (aVar == null) {
                if (i7 >= 64) {
                    j7 = this.f2355a;
                    return Long.bitCount(j7);
                }
            } else if (i7 >= 64) {
                return Long.bitCount(this.f2355a) + aVar.m1752b(i7 - 64);
            }
            j7 = this.f2355a & ((1 << i7) - 1);
            return Long.bitCount(j7);
        }

        /* renamed from: c */
        public final void m1753c() {
            if (this.f2356b == null) {
                this.f2356b = new a();
            }
        }

        /* renamed from: d */
        public final boolean m1754d(int i7) {
            if (i7 < 64) {
                return (this.f2355a & (1 << i7)) != 0;
            }
            m1753c();
            return this.f2356b.m1754d(i7 - 64);
        }

        /* renamed from: e */
        public final void m1755e(int i7, boolean z6) {
            if (i7 >= 64) {
                m1753c();
                this.f2356b.m1755e(i7 - 64, z6);
                return;
            }
            long j7 = this.f2355a;
            boolean z7 = (Long.MIN_VALUE & j7) != 0;
            long j8 = (1 << i7) - 1;
            this.f2355a = ((j7 & (~j8)) << 1) | (j7 & j8);
            if (z6) {
                m1758h(i7);
            } else {
                m1751a(i7);
            }
            if (z7 || this.f2356b != null) {
                m1753c();
                this.f2356b.m1755e(0, z7);
            }
        }

        /* renamed from: f */
        public final boolean m1756f(int i7) {
            if (i7 >= 64) {
                m1753c();
                return this.f2356b.m1756f(i7 - 64);
            }
            long j7 = 1 << i7;
            long j8 = this.f2355a;
            boolean z6 = (j8 & j7) != 0;
            long j9 = j8 & (~j7);
            this.f2355a = j9;
            long j10 = j7 - 1;
            this.f2355a = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
            a aVar = this.f2356b;
            if (aVar != null) {
                if (aVar.m1754d(0)) {
                    m1758h(63);
                }
                this.f2356b.m1756f(0);
            }
            return z6;
        }

        /* renamed from: g */
        public final void m1757g() {
            this.f2355a = 0L;
            a aVar = this.f2356b;
            if (aVar != null) {
                aVar.m1757g();
            }
        }

        /* renamed from: h */
        public final void m1758h(int i7) {
            if (i7 < 64) {
                this.f2355a |= 1 << i7;
            } else {
                m1753c();
                this.f2356b.m1758h(i7 - 64);
            }
        }

        public final String toString() {
            if (this.f2356b == null) {
                return Long.toBinaryString(this.f2355a);
            }
            return this.f2356b.toString() + "xx" + Long.toBinaryString(this.f2355a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    public interface b {
    }

    public C0466b(C0488v c0488v) {
        this.f2352a = c0488v;
    }

    /* renamed from: a */
    public final void m1740a(View view, int i7, boolean z6) {
        b bVar = this.f2352a;
        int m1805a = i7 < 0 ? ((C0488v) bVar).m1805a() : m1745f(i7);
        this.f2353b.m1755e(m1805a, z6);
        if (z6) {
            m1748i(view);
        }
        ((C0488v) bVar).f2495a.addView(view, m1805a);
        RecyclerView.m1513I(view);
    }

    /* renamed from: b */
    public final void m1741b(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z6) {
        b bVar = this.f2352a;
        int m1805a = i7 < 0 ? ((C0488v) bVar).m1805a() : m1745f(i7);
        this.f2353b.m1755e(m1805a, z6);
        if (z6) {
            m1748i(view);
        }
        C0488v c0488v = (C0488v) bVar;
        c0488v.getClass();
        RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
        RecyclerView recyclerView = c0488v.f2495a;
        if (m1513I != null) {
            if (!m1513I.m1577k() && !m1513I.m1581o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + m1513I + recyclerView.m1565y());
            }
            m1513I.f2186j &= -257;
        }
        recyclerView.attachViewToParent(view, m1805a, layoutParams);
    }

    /* renamed from: c */
    public final void m1742c(int i7) {
        RecyclerView.AbstractC0432a0 m1513I;
        int m1745f = m1745f(i7);
        this.f2353b.m1756f(m1745f);
        C0488v c0488v = (C0488v) this.f2352a;
        View childAt = c0488v.f2495a.getChildAt(m1745f);
        RecyclerView recyclerView = c0488v.f2495a;
        if (childAt != null && (m1513I = RecyclerView.m1513I(childAt)) != null) {
            if (m1513I.m1577k() && !m1513I.m1581o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + m1513I + recyclerView.m1565y());
            }
            m1513I.m1568b(Tools.Semaphore.f160S8);
        }
        recyclerView.detachViewFromParent(m1745f);
    }

    /* renamed from: d */
    public final View m1743d(int i7) {
        return ((C0488v) this.f2352a).f2495a.getChildAt(m1745f(i7));
    }

    /* renamed from: e */
    public final int m1744e() {
        return ((C0488v) this.f2352a).m1805a() - this.f2354c.size();
    }

    /* renamed from: f */
    public final int m1745f(int i7) {
        if (i7 < 0) {
            return -1;
        }
        int m1805a = ((C0488v) this.f2352a).m1805a();
        int i8 = i7;
        while (i8 < m1805a) {
            a aVar = this.f2353b;
            int m1752b = i7 - (i8 - aVar.m1752b(i8));
            if (m1752b == 0) {
                while (aVar.m1754d(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += m1752b;
        }
        return -1;
    }

    /* renamed from: g */
    public final View m1746g(int i7) {
        return ((C0488v) this.f2352a).f2495a.getChildAt(i7);
    }

    /* renamed from: h */
    public final int m1747h() {
        return ((C0488v) this.f2352a).m1805a();
    }

    /* renamed from: i */
    public final void m1748i(View view) {
        this.f2354c.add(view);
        C0488v c0488v = (C0488v) this.f2352a;
        c0488v.getClass();
        RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
        if (m1513I != null) {
            int i7 = m1513I.f2193q;
            View view2 = m1513I.f2177a;
            if (i7 == -1) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                i7 = C0946x.d.m2827c(view2);
            }
            m1513I.f2192p = i7;
            RecyclerView recyclerView = c0488v.f2495a;
            if (recyclerView.m1527K()) {
                m1513I.f2193q = 4;
                recyclerView.f2119G2.add(m1513I);
            } else {
                WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                C0946x.d.m2843s(view2, 4);
            }
        }
    }

    /* renamed from: j */
    public final boolean m1749j(View view) {
        return this.f2354c.contains(view);
    }

    /* renamed from: k */
    public final void m1750k(View view) {
        if (this.f2354c.remove(view)) {
            C0488v c0488v = (C0488v) this.f2352a;
            c0488v.getClass();
            RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
            if (m1513I != null) {
                int i7 = m1513I.f2192p;
                RecyclerView recyclerView = c0488v.f2495a;
                if (recyclerView.m1527K()) {
                    m1513I.f2193q = i7;
                    recyclerView.f2119G2.add(m1513I);
                } else {
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    C0946x.d.m2843s(m1513I.f2177a, i7);
                }
                m1513I.f2192p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2353b.toString() + ", hidden list:" + this.f2354c.size();
    }
}
