package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: classes.dex */
public final class C0477k extends AbstractC0492z {

    /* renamed from: s */
    public static TimeInterpolator f2398s;

    /* renamed from: h */
    public final ArrayList<RecyclerView.AbstractC0432a0> f2399h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<RecyclerView.AbstractC0432a0> f2400i = new ArrayList<>();

    /* renamed from: j */
    public final ArrayList<b> f2401j = new ArrayList<>();

    /* renamed from: k */
    public final ArrayList<a> f2402k = new ArrayList<>();

    /* renamed from: l */
    public final ArrayList<ArrayList<RecyclerView.AbstractC0432a0>> f2403l = new ArrayList<>();

    /* renamed from: m */
    public final ArrayList<ArrayList<b>> f2404m = new ArrayList<>();

    /* renamed from: n */
    public final ArrayList<ArrayList<a>> f2405n = new ArrayList<>();

    /* renamed from: o */
    public final ArrayList<RecyclerView.AbstractC0432a0> f2406o = new ArrayList<>();

    /* renamed from: p */
    public final ArrayList<RecyclerView.AbstractC0432a0> f2407p = new ArrayList<>();

    /* renamed from: q */
    public final ArrayList<RecyclerView.AbstractC0432a0> f2408q = new ArrayList<>();

    /* renamed from: r */
    public final ArrayList<RecyclerView.AbstractC0432a0> f2409r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.k$a */
    public static class a {

        /* renamed from: a */
        public RecyclerView.AbstractC0432a0 f2410a;

        /* renamed from: b */
        public RecyclerView.AbstractC0432a0 f2411b;

        /* renamed from: c */
        public final int f2412c;

        /* renamed from: d */
        public final int f2413d;

        /* renamed from: e */
        public final int f2414e;

        /* renamed from: f */
        public final int f2415f;

        public a(RecyclerView.AbstractC0432a0 abstractC0432a0, RecyclerView.AbstractC0432a0 abstractC0432a02, int i7, int i8, int i9, int i10) {
            this.f2410a = abstractC0432a0;
            this.f2411b = abstractC0432a02;
            this.f2412c = i7;
            this.f2413d = i8;
            this.f2414e = i9;
            this.f2415f = i10;
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f2410a + ", newHolder=" + this.f2411b + ", fromX=" + this.f2412c + ", fromY=" + this.f2413d + ", toX=" + this.f2414e + ", toY=" + this.f2415f + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    public static class b {

        /* renamed from: a */
        public final RecyclerView.AbstractC0432a0 f2416a;

        /* renamed from: b */
        public final int f2417b;

        /* renamed from: c */
        public final int f2418c;

        /* renamed from: d */
        public final int f2419d;

        /* renamed from: e */
        public final int f2420e;

        public b(RecyclerView.AbstractC0432a0 abstractC0432a0, int i7, int i8, int i9, int i10) {
            this.f2416a = abstractC0432a0;
            this.f2417b = i7;
            this.f2418c = i8;
            this.f2419d = i9;
            this.f2420e = i10;
        }
    }

    /* renamed from: h */
    public static void m1766h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((RecyclerView.AbstractC0432a0) arrayList.get(size)).f2177a.animate().cancel();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0441j
    /* renamed from: d */
    public final void mo1600d(RecyclerView.AbstractC0432a0 abstractC0432a0) {
        View view = abstractC0432a0.f2177a;
        view.animate().cancel();
        ArrayList<b> arrayList = this.f2401j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f2416a == abstractC0432a0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m1599c(abstractC0432a0);
                arrayList.remove(size);
            }
        }
        m1769j(abstractC0432a0, this.f2402k);
        if (this.f2399h.remove(abstractC0432a0)) {
            view.setAlpha(1.0f);
            m1599c(abstractC0432a0);
        }
        if (this.f2400i.remove(abstractC0432a0)) {
            view.setAlpha(1.0f);
            m1599c(abstractC0432a0);
        }
        ArrayList<ArrayList<a>> arrayList2 = this.f2405n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList3 = arrayList2.get(size2);
            m1769j(abstractC0432a0, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<b>> arrayList4 = this.f2404m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).f2416a == abstractC0432a0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m1599c(abstractC0432a0);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.AbstractC0432a0>> arrayList6 = this.f2403l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f2408q.remove(abstractC0432a0);
                this.f2406o.remove(abstractC0432a0);
                this.f2409r.remove(abstractC0432a0);
                this.f2407p.remove(abstractC0432a0);
                m1768i();
                return;
            }
            ArrayList<RecyclerView.AbstractC0432a0> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(abstractC0432a0)) {
                view.setAlpha(1.0f);
                m1599c(abstractC0432a0);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0441j
    /* renamed from: e */
    public final void mo1601e() {
        ArrayList<b> arrayList = this.f2401j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            View view = bVar.f2416a.f2177a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m1599c(bVar.f2416a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.AbstractC0432a0> arrayList2 = this.f2399h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m1599c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.AbstractC0432a0> arrayList3 = this.f2400i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0432a0 abstractC0432a0 = arrayList3.get(size3);
            abstractC0432a0.f2177a.setAlpha(1.0f);
            m1599c(abstractC0432a0);
            arrayList3.remove(size3);
        }
        ArrayList<a> arrayList4 = this.f2402k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = arrayList4.get(size4);
            RecyclerView.AbstractC0432a0 abstractC0432a02 = aVar.f2410a;
            if (abstractC0432a02 != null) {
                m1770k(aVar, abstractC0432a02);
            }
            RecyclerView.AbstractC0432a0 abstractC0432a03 = aVar.f2411b;
            if (abstractC0432a03 != null) {
                m1770k(aVar, abstractC0432a03);
            }
        }
        arrayList4.clear();
        if (mo1602f()) {
            ArrayList<ArrayList<b>> arrayList5 = this.f2404m;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList<b> arrayList6 = arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = arrayList6.get(size6);
                        View view2 = bVar2.f2416a.f2177a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        m1599c(bVar2.f2416a);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.AbstractC0432a0>> arrayList7 = this.f2403l;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList<RecyclerView.AbstractC0432a0> arrayList8 = arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.AbstractC0432a0 abstractC0432a04 = arrayList8.get(size8);
                        abstractC0432a04.f2177a.setAlpha(1.0f);
                        m1599c(abstractC0432a04);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList<ArrayList<a>> arrayList9 = this.f2405n;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList<a> arrayList10 = arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        a aVar2 = arrayList10.get(size10);
                        RecyclerView.AbstractC0432a0 abstractC0432a05 = aVar2.f2410a;
                        if (abstractC0432a05 != null) {
                            m1770k(aVar2, abstractC0432a05);
                        }
                        RecyclerView.AbstractC0432a0 abstractC0432a06 = aVar2.f2411b;
                        if (abstractC0432a06 != null) {
                            m1770k(aVar2, abstractC0432a06);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            m1766h(this.f2408q);
            m1766h(this.f2407p);
            m1766h(this.f2406o);
            m1766h(this.f2409r);
            ArrayList<RecyclerView.AbstractC0441j.a> arrayList11 = this.f2200b;
            int size11 = arrayList11.size();
            for (int i7 = 0; i7 < size11; i7++) {
                arrayList11.get(i7).m1603a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0441j
    /* renamed from: f */
    public final boolean mo1602f() {
        return (this.f2400i.isEmpty() && this.f2402k.isEmpty() && this.f2401j.isEmpty() && this.f2399h.isEmpty() && this.f2407p.isEmpty() && this.f2408q.isEmpty() && this.f2406o.isEmpty() && this.f2409r.isEmpty() && this.f2404m.isEmpty() && this.f2403l.isEmpty() && this.f2405n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0492z
    /* renamed from: g */
    public final boolean mo1767g(RecyclerView.AbstractC0432a0 abstractC0432a0, int i7, int i8, int i9, int i10) {
        View view = abstractC0432a0.f2177a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) abstractC0432a0.f2177a.getTranslationY());
        m1771l(abstractC0432a0);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            m1599c(abstractC0432a0);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        this.f2401j.add(new b(abstractC0432a0, translationX, translationY, i9, i10));
        return true;
    }

    /* renamed from: i */
    public final void m1768i() {
        if (mo1602f()) {
            return;
        }
        ArrayList<RecyclerView.AbstractC0441j.a> arrayList = this.f2200b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).m1603a();
        }
        arrayList.clear();
    }

    /* renamed from: j */
    public final void m1769j(RecyclerView.AbstractC0432a0 abstractC0432a0, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            a aVar = (a) arrayList.get(size);
            if (m1770k(aVar, abstractC0432a0) && aVar.f2410a == null && aVar.f2411b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    /* renamed from: k */
    public final boolean m1770k(a aVar, RecyclerView.AbstractC0432a0 abstractC0432a0) {
        if (aVar.f2411b == abstractC0432a0) {
            aVar.f2411b = null;
        } else {
            if (aVar.f2410a != abstractC0432a0) {
                return false;
            }
            aVar.f2410a = null;
        }
        abstractC0432a0.f2177a.setAlpha(1.0f);
        View view = abstractC0432a0.f2177a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m1599c(abstractC0432a0);
        return true;
    }

    /* renamed from: l */
    public final void m1771l(RecyclerView.AbstractC0432a0 abstractC0432a0) {
        if (f2398s == null) {
            f2398s = new ValueAnimator().getInterpolator();
        }
        abstractC0432a0.f2177a.animate().setInterpolator(f2398s);
        mo1600d(abstractC0432a0);
    }
}
