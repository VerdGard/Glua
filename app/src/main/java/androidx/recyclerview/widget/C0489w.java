package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C0464a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.w */
/* loaded from: classes.dex */
public final class C0489w implements C0464a.a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f2496a;

    public C0489w(RecyclerView recyclerView) {
        this.f2496a = recyclerView;
    }

    /* renamed from: a */
    public final void m1807a(C0464a.b bVar) {
        int i7 = bVar.f2344a;
        RecyclerView recyclerView = this.f2496a;
        if (i7 == 1) {
            recyclerView.f2114E1.mo1434X(bVar.f2345b, bVar.f2347d);
            return;
        }
        if (i7 == 2) {
            recyclerView.f2114E1.mo1437a0(bVar.f2345b, bVar.f2347d);
        } else if (i7 == 4) {
            recyclerView.f2114E1.mo1438b0(bVar.f2345b, bVar.f2347d);
        } else {
            if (i7 != 8) {
                return;
            }
            recyclerView.f2114E1.mo1436Z(bVar.f2345b, bVar.f2347d);
        }
    }

    /* renamed from: b */
    public final RecyclerView.AbstractC0432a0 m1808b(int i7) {
        RecyclerView recyclerView = this.f2496a;
        int m1747h = recyclerView.f2167w1.m1747h();
        int i8 = 0;
        RecyclerView.AbstractC0432a0 abstractC0432a0 = null;
        while (true) {
            if (i8 >= m1747h) {
                break;
            }
            RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(recyclerView.f2167w1.m1746g(i8));
            if (m1513I != null && !m1513I.m1575i() && m1513I.f2179c == i7) {
                if (!recyclerView.f2167w1.m1749j(m1513I.f2177a)) {
                    abstractC0432a0 = m1513I;
                    break;
                }
                abstractC0432a0 = m1513I;
            }
            i8++;
        }
        if (abstractC0432a0 == null || recyclerView.f2167w1.m1749j(abstractC0432a0.f2177a)) {
            return null;
        }
        return abstractC0432a0;
    }

    /* renamed from: c */
    public final void m1809c(int i7, int i8, Object obj) {
        int i9;
        int i10;
        RecyclerView recyclerView = this.f2496a;
        int m1747h = recyclerView.f2167w1.m1747h();
        int i11 = i8 + i7;
        for (int i12 = 0; i12 < m1747h; i12++) {
            View m1746g = recyclerView.f2167w1.m1746g(i12);
            RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(m1746g);
            if (m1513I != null && !m1513I.m1581o() && (i10 = m1513I.f2179c) >= i7 && i10 < i11) {
                m1513I.m1568b(2);
                m1513I.m1567a(obj);
                ((RecyclerView.C0445n) m1746g.getLayoutParams()).f2231c = true;
            }
        }
        RecyclerView.C0450s c0450s = recyclerView.f2146e;
        ArrayList<RecyclerView.AbstractC0432a0> arrayList = c0450s.f2241c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.f2170x2 = true;
                return;
            }
            RecyclerView.AbstractC0432a0 abstractC0432a0 = arrayList.get(size);
            if (abstractC0432a0 != null && (i9 = abstractC0432a0.f2179c) >= i7 && i9 < i11) {
                abstractC0432a0.m1568b(2);
                c0450s.m1665f(size);
            }
        }
    }

    /* renamed from: d */
    public final void m1810d(int i7, int i8) {
        RecyclerView recyclerView = this.f2496a;
        int m1747h = recyclerView.f2167w1.m1747h();
        for (int i9 = 0; i9 < m1747h; i9++) {
            RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(recyclerView.f2167w1.m1746g(i9));
            if (m1513I != null && !m1513I.m1581o() && m1513I.f2179c >= i7) {
                m1513I.m1578l(i8, false);
                recyclerView.f2164t2.f2269f = true;
            }
        }
        ArrayList<RecyclerView.AbstractC0432a0> arrayList = recyclerView.f2146e.f2241c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView.AbstractC0432a0 abstractC0432a0 = arrayList.get(i10);
            if (abstractC0432a0 != null && abstractC0432a0.f2179c >= i7) {
                abstractC0432a0.m1578l(i8, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2168w2 = true;
    }

    /* renamed from: e */
    public final void m1811e(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RecyclerView recyclerView = this.f2496a;
        int m1747h = recyclerView.f2167w1.m1747h();
        int i16 = -1;
        if (i7 < i8) {
            i10 = i7;
            i9 = i8;
            i11 = -1;
        } else {
            i9 = i7;
            i10 = i8;
            i11 = 1;
        }
        for (int i17 = 0; i17 < m1747h; i17++) {
            RecyclerView.AbstractC0432a0 m1513I = RecyclerView.m1513I(recyclerView.f2167w1.m1746g(i17));
            if (m1513I != null && (i15 = m1513I.f2179c) >= i10 && i15 <= i9) {
                if (i15 == i7) {
                    m1513I.m1578l(i8 - i7, false);
                } else {
                    m1513I.m1578l(i11, false);
                }
                recyclerView.f2164t2.f2269f = true;
            }
        }
        RecyclerView.C0450s c0450s = recyclerView.f2146e;
        c0450s.getClass();
        if (i7 < i8) {
            i13 = i7;
            i12 = i8;
        } else {
            i12 = i7;
            i13 = i8;
            i16 = 1;
        }
        ArrayList<RecyclerView.AbstractC0432a0> arrayList = c0450s.f2241c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            RecyclerView.AbstractC0432a0 abstractC0432a0 = arrayList.get(i18);
            if (abstractC0432a0 != null && (i14 = abstractC0432a0.f2179c) >= i13 && i14 <= i12) {
                if (i14 == i7) {
                    abstractC0432a0.m1578l(i8 - i7, false);
                } else {
                    abstractC0432a0.m1578l(i16, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2168w2 = true;
    }
}
