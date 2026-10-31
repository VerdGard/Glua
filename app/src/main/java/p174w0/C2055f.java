package p174w0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0358l0;
import java.util.ArrayList;
import p174w0.AbstractC2057h;

@SuppressLint({"RestrictedApi"})
/* renamed from: w0.f */
/* loaded from: classes.dex */
public class C2055f extends AbstractC0358l0 {

    /* renamed from: w0.f$a */
    public class a implements AbstractC2057h.d {

        /* renamed from: a */
        public final /* synthetic */ View f9371a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f9372b;

        public a(View view, ArrayList arrayList) {
            this.f9371a = view;
            this.f9372b = arrayList;
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: a */
        public final void mo5092a() {
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: b */
        public final void mo5086b() {
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: c */
        public final void mo5087c() {
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: d */
        public final void mo5088d() {
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: e */
        public final void mo5089e(AbstractC2057h abstractC2057h) {
            abstractC2057h.mo5117v(this);
            this.f9371a.setVisibility(8);
            ArrayList arrayList = this.f9372b;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) arrayList.get(i7)).setVisibility(0);
            }
        }
    }

    /* renamed from: w0.f$b */
    public class b extends C2060k {

        /* renamed from: a */
        public final /* synthetic */ Object f9373a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f9374b;

        /* renamed from: c */
        public final /* synthetic */ Object f9375c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f9376d;

        /* renamed from: e */
        public final /* synthetic */ Object f9377e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f9378f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f9373a = obj;
            this.f9374b = arrayList;
            this.f9375c = obj2;
            this.f9376d = arrayList2;
            this.f9377e = obj3;
            this.f9378f = arrayList3;
        }

        @Override // p174w0.C2060k, p174w0.AbstractC2057h.d
        /* renamed from: a */
        public final void mo5092a() {
            C2055f c2055f = C2055f.this;
            Object obj = this.f9373a;
            if (obj != null) {
                c2055f.m5091u(obj, this.f9374b, null);
            }
            Object obj2 = this.f9375c;
            if (obj2 != null) {
                c2055f.m5091u(obj2, this.f9376d, null);
            }
            Object obj3 = this.f9377e;
            if (obj3 != null) {
                c2055f.m5091u(obj3, this.f9378f, null);
            }
        }

        @Override // p174w0.AbstractC2057h.d
        /* renamed from: e */
        public final void mo5089e(AbstractC2057h abstractC2057h) {
            abstractC2057h.mo5117v(this);
        }
    }

    /* renamed from: w0.f$c */
    public class c extends AbstractC2057h.c {
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: a */
    public final void mo1178a(View view, Object obj) {
        if (obj != null) {
            ((AbstractC2057h) obj).mo5104b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: b */
    public final void mo1179b(Object obj, ArrayList<View> arrayList) {
        AbstractC2057h abstractC2057h = (AbstractC2057h) obj;
        if (abstractC2057h == null) {
            return;
        }
        int i7 = 0;
        if (abstractC2057h instanceof C2062m) {
            C2062m c2062m = (C2062m) abstractC2057h;
            int size = c2062m.f9418M1.size();
            while (i7 < size) {
                mo1179b((i7 < 0 || i7 >= c2062m.f9418M1.size()) ? null : c2062m.f9418M1.get(i7), arrayList);
                i7++;
            }
            return;
        }
        if (((AbstractC0358l0.m1204h(abstractC2057h.f9392X) && AbstractC0358l0.m1204h(null) && AbstractC0358l0.m1204h(null)) ? false : true) || !AbstractC0358l0.m1204h(abstractC2057h.f9393Y)) {
            return;
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            abstractC2057h.mo5104b(arrayList.get(i7));
            i7++;
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: c */
    public final void mo1180c(ViewGroup viewGroup, Object obj) {
        C2061l.m5122a(viewGroup, (AbstractC2057h) obj);
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: e */
    public final boolean mo1181e(Object obj) {
        return obj instanceof AbstractC2057h;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: f */
    public final Object mo1182f(Object obj) {
        if (obj != null) {
            return ((AbstractC2057h) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: i */
    public final Object mo1183i(Object obj, Object obj2, Object obj3) {
        AbstractC2057h abstractC2057h = (AbstractC2057h) obj;
        AbstractC2057h abstractC2057h2 = (AbstractC2057h) obj2;
        AbstractC2057h abstractC2057h3 = (AbstractC2057h) obj3;
        if (abstractC2057h != null && abstractC2057h2 != null) {
            C2062m c2062m = new C2062m();
            c2062m.m5124H(abstractC2057h);
            c2062m.m5124H(abstractC2057h2);
            c2062m.f9419N1 = false;
            abstractC2057h = c2062m;
        } else if (abstractC2057h == null) {
            abstractC2057h = abstractC2057h2 != null ? abstractC2057h2 : null;
        }
        if (abstractC2057h3 == null) {
            return abstractC2057h;
        }
        C2062m c2062m2 = new C2062m();
        if (abstractC2057h != null) {
            c2062m2.m5124H(abstractC2057h);
        }
        c2062m2.m5124H(abstractC2057h3);
        return c2062m2;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: j */
    public final Object mo1184j(Object obj, Object obj2, Object obj3) {
        C2062m c2062m = new C2062m();
        if (obj != null) {
            c2062m.m5124H((AbstractC2057h) obj);
        }
        if (obj2 != null) {
            c2062m.m5124H((AbstractC2057h) obj2);
        }
        if (obj3 != null) {
            c2062m.m5124H((AbstractC2057h) obj3);
        }
        return c2062m;
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: l */
    public final void mo1185l(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC2057h) obj).mo5103a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: m */
    public final void mo1186m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC2057h) obj).mo5103a(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: n */
    public final void mo1187n(View view, Object obj) {
        if (view != null) {
            AbstractC0358l0.m1203g(view, new Rect());
            ((AbstractC2057h) obj).mo5096A(new C2054e());
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: o */
    public final void mo1188o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC2057h) obj).mo5096A(new c());
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: r */
    public final void mo1190r(Object obj, View view, ArrayList<View> arrayList) {
        C2062m c2062m = (C2062m) obj;
        ArrayList<View> arrayList2 = c2062m.f9393Y;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0358l0.m1202d(arrayList.get(i7), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo1179b(c2062m, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: s */
    public final void mo1191s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C2062m c2062m = (C2062m) obj;
        if (c2062m != null) {
            ArrayList<View> arrayList3 = c2062m.f9393Y;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            m5091u(c2062m, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0358l0
    /* renamed from: t */
    public final Object mo1192t(Object obj) {
        if (obj == null) {
            return null;
        }
        C2062m c2062m = new C2062m();
        c2062m.m5124H((AbstractC2057h) obj);
        return c2062m;
    }

    /* renamed from: u */
    public final void m5091u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC2057h abstractC2057h = (AbstractC2057h) obj;
        int i7 = 0;
        if (abstractC2057h instanceof C2062m) {
            C2062m c2062m = (C2062m) abstractC2057h;
            int size = c2062m.f9418M1.size();
            while (i7 < size) {
                m5091u((i7 < 0 || i7 >= c2062m.f9418M1.size()) ? null : c2062m.f9418M1.get(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if ((AbstractC0358l0.m1204h(abstractC2057h.f9392X) && AbstractC0358l0.m1204h(null) && AbstractC0358l0.m1204h(null)) ? false : true) {
            return;
        }
        ArrayList<View> arrayList3 = abstractC2057h.f9393Y;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i7 < size2) {
            abstractC2057h.mo5104b(arrayList2.get(i7));
            i7++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                abstractC2057h.mo5118w(arrayList.get(size3));
            }
        }
    }
}
