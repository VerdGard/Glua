package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p089l.C1473g;
import p089l.C1474h;
import p089l.C1481o;
import p120p.C1684e;

/* renamed from: androidx.recyclerview.widget.c0 */
/* loaded from: classes.dex */
public final class C0469c0 {

    /* renamed from: a */
    public final C1481o<RecyclerView.AbstractC0432a0, a> f2366a = new C1481o<>();

    /* renamed from: b */
    public final C1473g<RecyclerView.AbstractC0432a0> f2367b = new C1473g<>();

    /* renamed from: androidx.recyclerview.widget.c0$a */
    public static class a {

        /* renamed from: d */
        public static final C1684e f2368d = new C1684e(20, 1);

        /* renamed from: a */
        public int f2369a;

        /* renamed from: b */
        public RecyclerView.AbstractC0441j.c f2370b;

        /* renamed from: c */
        public RecyclerView.AbstractC0441j.c f2371c;

        /* renamed from: a */
        public static a m1765a() {
            a aVar = (a) f2368d.mo2564a();
            return aVar == null ? new a() : aVar;
        }
    }

    /* renamed from: a */
    public final RecyclerView.AbstractC0441j.c m1762a(RecyclerView.AbstractC0432a0 abstractC0432a0, int i7) {
        a m3877i;
        RecyclerView.AbstractC0441j.c cVar;
        C1481o<RecyclerView.AbstractC0432a0, a> c1481o = this.f2366a;
        int m3872d = c1481o.m3872d(abstractC0432a0);
        if (m3872d >= 0 && (m3877i = c1481o.m3877i(m3872d)) != null) {
            int i8 = m3877i.f2369a;
            if ((i8 & i7) != 0) {
                int i9 = i8 & (~i7);
                m3877i.f2369a = i9;
                if (i7 == 4) {
                    cVar = m3877i.f2370b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = m3877i.f2371c;
                }
                if ((i9 & 12) == 0) {
                    c1481o.m3875g(m3872d);
                    m3877i.f2369a = 0;
                    m3877i.f2370b = null;
                    m3877i.f2371c = null;
                    a.f2368d.mo2565b(m3877i);
                }
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void m1763b(RecyclerView.AbstractC0432a0 abstractC0432a0) {
        a aVar = this.f2366a.get(abstractC0432a0);
        if (aVar == null) {
            return;
        }
        aVar.f2369a &= -2;
    }

    /* renamed from: c */
    public final void m1764c(RecyclerView.AbstractC0432a0 abstractC0432a0) {
        C1473g<RecyclerView.AbstractC0432a0> c1473g = this.f2367b;
        int m3860h = c1473g.m3860h() - 1;
        while (true) {
            if (m3860h < 0) {
                break;
            }
            if (abstractC0432a0 == c1473g.m3861i(m3860h)) {
                Object[] objArr = c1473g.f7031m;
                Object obj = objArr[m3860h];
                Object obj2 = C1474h.f7033a;
                if (obj != obj2) {
                    objArr[m3860h] = obj2;
                    c1473g.f7029c = true;
                }
            } else {
                m3860h--;
            }
        }
        a remove = this.f2366a.remove(abstractC0432a0);
        if (remove != null) {
            remove.f2369a = 0;
            remove.f2370b = null;
            remove.f2371c = null;
            a.f2368d.mo2565b(remove);
        }
    }
}
