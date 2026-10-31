package androidx.fragment.app;

import android.content.Context;
import android.ext.C0089a;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0368q0;
import androidx.fragment.app.C0369r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p001a0.C0005d;
import p034e0.C0915d0;
import p034e0.C0923h0;
import p034e0.C0946x;
import p089l.C1467a;

/* renamed from: androidx.fragment.app.l */
/* loaded from: classes.dex */
public final class C0357l extends AbstractC0368q0 {

    /* renamed from: androidx.fragment.app.l$a */
    public static class a extends b {

        /* renamed from: c */
        public final boolean f1739c;

        /* renamed from: d */
        public boolean f1740d;

        /* renamed from: e */
        public C0369r.a f1741e;

        public a(AbstractC0368q0.b bVar, C0005d c0005d, boolean z6) {
            super(bVar, c0005d);
            this.f1740d = false;
            this.f1739c = z6;
        }

        /* renamed from: c */
        public final C0369r.a m1198c(Context context) {
            if (this.f1740d) {
                return this.f1741e;
            }
            AbstractC0368q0.b bVar = this.f1742a;
            C0369r.a m1266a = C0369r.m1266a(context, bVar.f1853c, bVar.f1851a == 2, this.f1739c);
            this.f1741e = m1266a;
            this.f1740d = true;
            return m1266a;
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    public static class b {

        /* renamed from: a */
        public final AbstractC0368q0.b f1742a;

        /* renamed from: b */
        public final C0005d f1743b;

        public b(AbstractC0368q0.b bVar, C0005d c0005d) {
            this.f1742a = bVar;
            this.f1743b = c0005d;
        }

        /* renamed from: a */
        public final void m1199a() {
            AbstractC0368q0.b bVar = this.f1742a;
            HashSet<C0005d> hashSet = bVar.f1855e;
            if (hashSet.remove(this.f1743b) && hashSet.isEmpty()) {
                bVar.mo1262b();
            }
        }

        /* renamed from: b */
        public final boolean m1200b() {
            AbstractC0368q0.b bVar = this.f1742a;
            int m207e = C0089a.m207e(bVar.f1853c.f1793U1);
            int i7 = bVar.f1851a;
            return m207e == i7 || !(m207e == 2 || i7 == 2);
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    public static class c extends b {

        /* renamed from: c */
        public final Object f1744c;

        /* renamed from: d */
        public final boolean f1745d;

        /* renamed from: e */
        public final Object f1746e;

        public c(AbstractC0368q0.b bVar, C0005d c0005d, boolean z6, boolean z7) {
            super(bVar, c0005d);
            Object obj;
            Object obj2;
            int i7 = bVar.f1851a;
            ComponentCallbacksC0361n componentCallbacksC0361n = bVar.f1853c;
            if (i7 == 2) {
                if (z6) {
                    obj2 = componentCallbacksC0361n.m1240n();
                } else {
                    componentCallbacksC0361n.getClass();
                    obj2 = null;
                }
                this.f1744c = obj2;
                componentCallbacksC0361n.getClass();
            } else {
                if (z6) {
                    obj = componentCallbacksC0361n.m1241o();
                } else {
                    componentCallbacksC0361n.getClass();
                    obj = null;
                }
                this.f1744c = obj;
            }
            this.f1745d = true;
            if (z7) {
                if (z6) {
                    this.f1746e = componentCallbacksC0361n.m1242p();
                    return;
                }
                componentCallbacksC0361n.getClass();
            }
            this.f1746e = null;
        }

        /* renamed from: c */
        public final AbstractC0358l0 m1201c(Object obj) {
            if (obj == null) {
                return null;
            }
            C0352i0 c0352i0 = C0348g0.f1712a;
            if (c0352i0 != null && (obj instanceof Transition)) {
                return c0352i0;
            }
            AbstractC0358l0 abstractC0358l0 = C0348g0.f1713b;
            if (abstractC0358l0 != null && abstractC0358l0.mo1181e(obj)) {
                return abstractC0358l0;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1742a.f1853c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public C0357l(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: i */
    public static void m1194i(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C0915d0.m2681b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                m1194i(arrayList, childAt);
            }
        }
    }

    /* renamed from: j */
    public static void m1195j(C1467a c1467a, View view) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        String m2878k = C0946x.i.m2878k(view);
        if (m2878k != null) {
            c1467a.put(m2878k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    m1195j(c1467a, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static void m1196k(C1467a c1467a, Collection collection) {
        Iterator it = ((C1467a.a) c1467a.entrySet()).iterator();
        while (true) {
            C1467a.d dVar = (C1467a.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            View view = (View) dVar.getValue();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (!collection.contains(C0946x.i.m2878k(view))) {
                dVar.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0626 A[LOOP:6: B:144:0x0620->B:146:0x0626, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0506  */
    @Override // androidx.fragment.app.AbstractC0368q0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1197b(java.util.ArrayList r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0357l.mo1197b(java.util.ArrayList, boolean):void");
    }
}
