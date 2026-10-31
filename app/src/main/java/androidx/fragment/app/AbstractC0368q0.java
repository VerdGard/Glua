package androidx.fragment.app;

import android.ext.C0089a;
import android.ext.C0091c;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractC0378x;
import androidx.fragment.app.ComponentCallbacksC0361n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import p001a0.C0005d;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.fragment.app.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC0368q0 {

    /* renamed from: a */
    public final ViewGroup f1845a;

    /* renamed from: b */
    public final ArrayList<b> f1846b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<b> f1847c = new ArrayList<>();

    /* renamed from: d */
    public boolean f1848d = false;

    /* renamed from: e */
    public boolean f1849e = false;

    /* renamed from: androidx.fragment.app.q0$a */
    public static class a extends b {

        /* renamed from: h */
        public final C0342d0 f1850h;

        public a(int i7, int i8, C0342d0 c0342d0, C0005d c0005d) {
            super(i7, i8, c0342d0.f1674c, c0005d);
            this.f1850h = c0342d0;
        }

        @Override // androidx.fragment.app.AbstractC0368q0.b
        /* renamed from: b */
        public final void mo1262b() {
            super.mo1262b();
            this.f1850h.m1156k();
        }

        @Override // androidx.fragment.app.AbstractC0368q0.b
        /* renamed from: d */
        public final void mo1263d() {
            if (this.f1852b == 2) {
                C0342d0 c0342d0 = this.f1850h;
                ComponentCallbacksC0361n componentCallbacksC0361n = c0342d0.f1674c;
                View findFocus = componentCallbacksC0361n.f1793U1.findFocus();
                if (findFocus != null) {
                    componentCallbacksC0361n.m1234e().f1829m = findFocus;
                    if (AbstractC0378x.m1285I(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + componentCallbacksC0361n);
                    }
                }
                View m1229J = this.f1853c.m1229J();
                if (m1229J.getParent() == null) {
                    c0342d0.m1147b();
                    m1229J.setAlpha(0.0f);
                }
                if (m1229J.getAlpha() == 0.0f && m1229J.getVisibility() == 0) {
                    m1229J.setVisibility(4);
                }
                ComponentCallbacksC0361n.b bVar = componentCallbacksC0361n.f1797X1;
                m1229J.setAlpha(bVar == null ? 1.0f : bVar.f1828l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.q0$b */
    public static class b {

        /* renamed from: a */
        public int f1851a;

        /* renamed from: b */
        public int f1852b;

        /* renamed from: c */
        public final ComponentCallbacksC0361n f1853c;

        /* renamed from: d */
        public final ArrayList f1854d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C0005d> f1855e = new HashSet<>();

        /* renamed from: f */
        public boolean f1856f = false;

        /* renamed from: g */
        public boolean f1857g = false;

        public b(int i7, int i8, ComponentCallbacksC0361n componentCallbacksC0361n, C0005d c0005d) {
            this.f1851a = i7;
            this.f1852b = i8;
            this.f1853c = componentCallbacksC0361n;
            c0005d.m6b(new C0370r0((a) this));
        }

        /* renamed from: a */
        public final void m1264a() {
            if (this.f1856f) {
                return;
            }
            this.f1856f = true;
            HashSet<C0005d> hashSet = this.f1855e;
            if (hashSet.isEmpty()) {
                mo1262b();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((C0005d) it.next()).m5a();
            }
        }

        /* renamed from: b */
        public void mo1262b() {
            if (this.f1857g) {
                return;
            }
            if (AbstractC0378x.m1285I(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f1857g = true;
            Iterator it = this.f1854d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        /* renamed from: c */
        public final void m1265c(int i7, int i8) {
            if (i8 == 0) {
                throw null;
            }
            int i9 = i8 - 1;
            ComponentCallbacksC0361n componentCallbacksC0361n = this.f1853c;
            if (i9 == 0) {
                if (this.f1851a != 1) {
                    if (AbstractC0378x.m1285I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC0361n + " mFinalState = " + C0089a.m212j(this.f1851a) + " -> " + C0089a.m212j(i7) + ". ");
                    }
                    this.f1851a = i7;
                    return;
                }
                return;
            }
            if (i9 == 1) {
                if (this.f1851a == 1) {
                    if (AbstractC0378x.m1285I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC0361n + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + C0091c.m232j(this.f1852b) + " to ADDING.");
                    }
                    this.f1851a = 2;
                    this.f1852b = 2;
                    return;
                }
                return;
            }
            if (i9 != 2) {
                return;
            }
            if (AbstractC0378x.m1285I(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + componentCallbacksC0361n + " mFinalState = " + C0089a.m212j(this.f1851a) + " -> REMOVED. mLifecycleImpact  = " + C0091c.m232j(this.f1852b) + " to REMOVING.");
            }
            this.f1851a = 1;
            this.f1852b = 3;
        }

        /* renamed from: d */
        public void mo1263d() {
        }

        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + C0089a.m212j(this.f1851a) + "} {mLifecycleImpact = " + C0091c.m232j(this.f1852b) + "} {mFragment = " + this.f1853c + "}";
        }
    }

    public AbstractC0368q0(ViewGroup viewGroup) {
        this.f1845a = viewGroup;
    }

    /* renamed from: f */
    public static AbstractC0368q0 m1255f(ViewGroup viewGroup, InterfaceC0372s0 interfaceC0372s0) {
        int i7 = R$id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i7);
        if (tag instanceof AbstractC0368q0) {
            return (AbstractC0368q0) tag;
        }
        ((AbstractC0378x.f) interfaceC0372s0).getClass();
        C0357l c0357l = new C0357l(viewGroup);
        viewGroup.setTag(i7, c0357l);
        return c0357l;
    }

    /* renamed from: a */
    public final void m1256a(int i7, int i8, C0342d0 c0342d0) {
        synchronized (this.f1846b) {
            C0005d c0005d = new C0005d();
            b m1258d = m1258d(c0342d0.f1674c);
            if (m1258d != null) {
                m1258d.m1265c(i7, i8);
                return;
            }
            a aVar = new a(i7, i8, c0342d0, c0005d);
            this.f1846b.add(aVar);
            aVar.f1854d.add(new RunnableC0364o0(this, aVar));
            aVar.f1854d.add(new RunnableC0366p0(this, aVar));
        }
    }

    /* renamed from: b */
    public abstract void mo1197b(ArrayList arrayList, boolean z6);

    /* renamed from: c */
    public final void m1257c() {
        if (this.f1849e) {
            return;
        }
        ViewGroup viewGroup = this.f1845a;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (!C0946x.g.m2859b(viewGroup)) {
            m1259e();
            this.f1848d = false;
            return;
        }
        synchronized (this.f1846b) {
            if (!this.f1846b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f1847c);
                this.f1847c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (AbstractC0378x.m1285I(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + bVar);
                    }
                    bVar.m1264a();
                    if (!bVar.f1857g) {
                        this.f1847c.add(bVar);
                    }
                }
                m1261h();
                ArrayList arrayList2 = new ArrayList(this.f1846b);
                this.f1846b.clear();
                this.f1847c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).mo1263d();
                }
                mo1197b(arrayList2, this.f1848d);
                this.f1848d = false;
            }
        }
    }

    /* renamed from: d */
    public final b m1258d(ComponentCallbacksC0361n componentCallbacksC0361n) {
        Iterator<b> it = this.f1846b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1853c.equals(componentCallbacksC0361n) && !next.f1856f) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m1259e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1845a;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean m2859b = C0946x.g.m2859b(viewGroup);
        synchronized (this.f1846b) {
            m1261h();
            Iterator<b> it = this.f1846b.iterator();
            while (it.hasNext()) {
                it.next().mo1263d();
            }
            Iterator it2 = new ArrayList(this.f1847c).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (AbstractC0378x.m1285I(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (m2859b) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1845a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(bVar);
                    Log.v("FragmentManager", sb.toString());
                }
                bVar.m1264a();
            }
            Iterator it3 = new ArrayList(this.f1846b).iterator();
            while (it3.hasNext()) {
                b bVar2 = (b) it3.next();
                if (AbstractC0378x.m1285I(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m2859b) {
                        str = "";
                    } else {
                        str = "Container " + this.f1845a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(bVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                bVar2.m1264a();
            }
        }
    }

    /* renamed from: g */
    public final void m1260g() {
        synchronized (this.f1846b) {
            m1261h();
            this.f1849e = false;
            int size = this.f1846b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                b bVar = this.f1846b.get(size);
                int m207e = C0089a.m207e(bVar.f1853c.f1793U1);
                if (bVar.f1851a == 2 && m207e != 2) {
                    bVar.f1853c.getClass();
                    this.f1849e = false;
                    break;
                }
            }
        }
    }

    /* renamed from: h */
    public final void m1261h() {
        Iterator<b> it = this.f1846b.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1852b == 2) {
                next.m1265c(C0089a.m206d(next.f1853c.m1229J().getVisibility()), 1);
            }
        }
    }
}
