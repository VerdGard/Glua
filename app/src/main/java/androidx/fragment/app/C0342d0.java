package androidx.fragment.app;

import android.content.res.Resources;
import android.ext.C0089a;
import android.ext.C0090b;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractC0368q0;
import androidx.fragment.app.ComponentCallbacksC0361n;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.InterfaceC0398i;
import androidx.lifecycle.InterfaceC0400k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.fragment.app.d0 */
/* loaded from: classes.dex */
public final class C0342d0 {

    /* renamed from: a */
    public final C0377w f1672a;

    /* renamed from: b */
    public final C0344e0 f1673b;

    /* renamed from: c */
    public final ComponentCallbacksC0361n f1674c;

    /* renamed from: d */
    public boolean f1675d = false;

    /* renamed from: e */
    public int f1676e = -1;

    /* renamed from: androidx.fragment.app.d0$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: c */
        public final /* synthetic */ View f1677c;

        public a(View view) {
            this.f1677c = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f1677c;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.h.m2867c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public C0342d0(C0377w c0377w, C0344e0 c0344e0, ComponentCallbacksC0361n componentCallbacksC0361n) {
        this.f1672a = c0377w;
        this.f1673b = c0344e0;
        this.f1674c = componentCallbacksC0361n;
    }

    public C0342d0(C0377w c0377w, C0344e0 c0344e0, ComponentCallbacksC0361n componentCallbacksC0361n, C0340c0 c0340c0) {
        this.f1672a = c0377w;
        this.f1673b = c0344e0;
        this.f1674c = componentCallbacksC0361n;
        componentCallbacksC0361n.f1810m = null;
        componentCallbacksC0361n.f1811s = null;
        componentCallbacksC0361n.f1779G1 = 0;
        componentCallbacksC0361n.f1776D1 = false;
        componentCallbacksC0361n.f1773A1 = false;
        ComponentCallbacksC0361n componentCallbacksC0361n2 = componentCallbacksC0361n.f1812w1;
        componentCallbacksC0361n.f1813x1 = componentCallbacksC0361n2 != null ? componentCallbacksC0361n2.f1798Y : null;
        componentCallbacksC0361n.f1812w1 = null;
        Bundle bundle = c0340c0.f1655B1;
        componentCallbacksC0361n.f1807e = bundle == null ? new Bundle() : bundle;
    }

    public C0342d0(C0377w c0377w, C0344e0 c0344e0, ClassLoader classLoader, C0373t c0373t, C0340c0 c0340c0) {
        this.f1672a = c0377w;
        this.f1673b = c0344e0;
        ComponentCallbacksC0361n mo1270a = c0373t.mo1270a(c0340c0.f1659c);
        this.f1674c = mo1270a;
        Bundle bundle = c0340c0.f1665y1;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo1270a.m1232M(bundle);
        mo1270a.f1798Y = c0340c0.f1660e;
        mo1270a.f1775C1 = c0340c0.f1661m;
        mo1270a.f1777E1 = true;
        mo1270a.f1784L1 = c0340c0.f1662s;
        mo1270a.f1785M1 = c0340c0.f1656X;
        mo1270a.f1786N1 = c0340c0.f1657Y;
        mo1270a.f1789Q1 = c0340c0.f1658Z;
        mo1270a.f1774B1 = c0340c0.f1663w1;
        mo1270a.f1788P1 = c0340c0.f1664x1;
        mo1270a.f1787O1 = c0340c0.f1666z1;
        mo1270a.f1802a2 = AbstractC0394f.b.values()[c0340c0.f1654A1];
        Bundle bundle2 = c0340c0.f1655B1;
        mo1270a.f1807e = bundle2 == null ? new Bundle() : bundle2;
        if (AbstractC0378x.m1285I(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + mo1270a);
        }
    }

    /* renamed from: a */
    public final void m1146a() {
        boolean m1285I = AbstractC0378x.m1285I(3);
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (m1285I) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + componentCallbacksC0361n);
        }
        Bundle bundle = componentCallbacksC0361n.f1807e;
        componentCallbacksC0361n.f1782J1.m1299N();
        componentCallbacksC0361n.f1804c = 3;
        componentCallbacksC0361n.f1791S1 = true;
        if (AbstractC0378x.m1285I(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + componentCallbacksC0361n);
        }
        View view = componentCallbacksC0361n.f1793U1;
        if (view != null) {
            Bundle bundle2 = componentCallbacksC0361n.f1807e;
            SparseArray<Parcelable> sparseArray = componentCallbacksC0361n.f1810m;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                componentCallbacksC0361n.f1810m = null;
            }
            if (componentCallbacksC0361n.f1793U1 != null) {
                componentCallbacksC0361n.f1805c2.f1771m.m4533b(componentCallbacksC0361n.f1811s);
                componentCallbacksC0361n.f1811s = null;
            }
            componentCallbacksC0361n.f1791S1 = false;
            componentCallbacksC0361n.mo1208B(bundle2);
            if (!componentCallbacksC0361n.f1791S1) {
                throw new C0374t0("Fragment " + componentCallbacksC0361n + " did not call through to super.onViewStateRestored()");
            }
            if (componentCallbacksC0361n.f1793U1 != null) {
                componentCallbacksC0361n.f1805c2.m1221d(AbstractC0394f.a.ON_CREATE);
            }
        }
        componentCallbacksC0361n.f1807e = null;
        C0379y c0379y = componentCallbacksC0361n.f1782J1;
        c0379y.f1908y = false;
        c0379y.f1909z = false;
        c0379y.f1882F.f1636h = false;
        c0379y.m1333t(4);
        this.f1672a.m1271a(false);
    }

    /* renamed from: b */
    public final void m1147b() {
        View view;
        View view2;
        C0344e0 c0344e0 = this.f1673b;
        c0344e0.getClass();
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        ViewGroup viewGroup = componentCallbacksC0361n.f1792T1;
        int i7 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0344e0.f1679a;
            int indexOf = arrayList.indexOf(componentCallbacksC0361n);
            int i8 = indexOf - 1;
            while (true) {
                if (i8 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        ComponentCallbacksC0361n componentCallbacksC0361n2 = (ComponentCallbacksC0361n) arrayList.get(indexOf);
                        if (componentCallbacksC0361n2.f1792T1 == viewGroup && (view = componentCallbacksC0361n2.f1793U1) != null) {
                            i7 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ComponentCallbacksC0361n componentCallbacksC0361n3 = (ComponentCallbacksC0361n) arrayList.get(i8);
                    if (componentCallbacksC0361n3.f1792T1 == viewGroup && (view2 = componentCallbacksC0361n3.f1793U1) != null) {
                        i7 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i8--;
                }
            }
        }
        componentCallbacksC0361n.f1792T1.addView(componentCallbacksC0361n.f1793U1, i7);
    }

    /* renamed from: c */
    public final void m1148c() {
        boolean m1285I = AbstractC0378x.m1285I(3);
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (m1285I) {
            Log.d("FragmentManager", "moveto ATTACHED: " + componentCallbacksC0361n);
        }
        ComponentCallbacksC0361n componentCallbacksC0361n2 = componentCallbacksC0361n.f1812w1;
        C0342d0 c0342d0 = null;
        C0344e0 c0344e0 = this.f1673b;
        if (componentCallbacksC0361n2 != null) {
            C0342d0 m1170g = c0344e0.m1170g(componentCallbacksC0361n2.f1798Y);
            if (m1170g == null) {
                throw new IllegalStateException("Fragment " + componentCallbacksC0361n + " declared target fragment " + componentCallbacksC0361n.f1812w1 + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC0361n.f1813x1 = componentCallbacksC0361n.f1812w1.f1798Y;
            componentCallbacksC0361n.f1812w1 = null;
            c0342d0 = m1170g;
        } else {
            String str = componentCallbacksC0361n.f1813x1;
            if (str != null && (c0342d0 = c0344e0.m1170g(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(componentCallbacksC0361n);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(C0090b.m220f(sb, componentCallbacksC0361n.f1813x1, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0342d0 != null) {
            c0342d0.m1156k();
        }
        AbstractC0378x abstractC0378x = componentCallbacksC0361n.f1780H1;
        componentCallbacksC0361n.f1781I1 = abstractC0378x.f1897n;
        componentCallbacksC0361n.f1783K1 = abstractC0378x.f1899p;
        C0377w c0377w = this.f1672a;
        c0377w.m1277g(false);
        ArrayList<ComponentCallbacksC0361n.d> arrayList = componentCallbacksC0361n.f1809f2;
        Iterator<ComponentCallbacksC0361n.d> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m1246a();
        }
        arrayList.clear();
        componentCallbacksC0361n.f1782J1.m1315c(componentCallbacksC0361n.f1781I1, componentCallbacksC0361n.mo1213d(), componentCallbacksC0361n);
        componentCallbacksC0361n.f1804c = 0;
        componentCallbacksC0361n.f1791S1 = false;
        componentCallbacksC0361n.mo1214s(componentCallbacksC0361n.f1781I1.f1870m);
        if (!componentCallbacksC0361n.f1791S1) {
            throw new C0374t0("Fragment " + componentCallbacksC0361n + " did not call through to super.onAttach()");
        }
        Iterator<InterfaceC0338b0> it2 = componentCallbacksC0361n.f1780H1.f1895l.iterator();
        while (it2.hasNext()) {
            it2.next().mo1145d();
        }
        C0379y c0379y = componentCallbacksC0361n.f1782J1;
        c0379y.f1908y = false;
        c0379y.f1909z = false;
        c0379y.f1882F.f1636h = false;
        c0379y.m1333t(0);
        c0377w.m1272b(false);
    }

    /* renamed from: d */
    public final int m1149d() {
        int i7;
        AbstractC0368q0.b bVar;
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (componentCallbacksC0361n.f1780H1 == null) {
            return componentCallbacksC0361n.f1804c;
        }
        int i8 = this.f1676e;
        int ordinal = componentCallbacksC0361n.f1802a2.ordinal();
        if (ordinal == 1) {
            i8 = Math.min(i8, 0);
        } else if (ordinal == 2) {
            i8 = Math.min(i8, 1);
        } else if (ordinal == 3) {
            i8 = Math.min(i8, 5);
        } else if (ordinal != 4) {
            i8 = Math.min(i8, -1);
        }
        if (componentCallbacksC0361n.f1775C1) {
            if (componentCallbacksC0361n.f1776D1) {
                i8 = Math.max(this.f1676e, 2);
                View view = componentCallbacksC0361n.f1793U1;
                if (view != null && view.getParent() == null) {
                    i8 = Math.min(i8, 2);
                }
            } else {
                i8 = this.f1676e < 4 ? Math.min(i8, componentCallbacksC0361n.f1804c) : Math.min(i8, 1);
            }
        }
        if (!componentCallbacksC0361n.f1773A1) {
            i8 = Math.min(i8, 1);
        }
        ViewGroup viewGroup = componentCallbacksC0361n.f1792T1;
        if (viewGroup != null) {
            AbstractC0368q0 m1255f = AbstractC0368q0.m1255f(viewGroup, componentCallbacksC0361n.m1239l().m1296G());
            m1255f.getClass();
            AbstractC0368q0.b m1258d = m1255f.m1258d(componentCallbacksC0361n);
            i7 = m1258d != null ? m1258d.f1852b : 0;
            Iterator<AbstractC0368q0.b> it = m1255f.f1847c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                if (bVar.f1853c.equals(componentCallbacksC0361n) && !bVar.f1856f) {
                    break;
                }
            }
            if (bVar != null && (i7 == 0 || i7 == 1)) {
                i7 = bVar.f1852b;
            }
        } else {
            i7 = 0;
        }
        if (i7 == 2) {
            i8 = Math.min(i8, 6);
        } else if (i7 == 3) {
            i8 = Math.max(i8, 3);
        } else if (componentCallbacksC0361n.f1774B1) {
            i8 = componentCallbacksC0361n.f1779G1 > 0 ? Math.min(i8, 1) : Math.min(i8, -1);
        }
        if (componentCallbacksC0361n.f1794V1 && componentCallbacksC0361n.f1804c < 5) {
            i8 = Math.min(i8, 4);
        }
        if (AbstractC0378x.m1285I(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i8 + " for " + componentCallbacksC0361n);
        }
        return i8;
    }

    /* renamed from: e */
    public final void m1150e() {
        boolean m1285I = AbstractC0378x.m1285I(3);
        final ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (m1285I) {
            Log.d("FragmentManager", "moveto CREATED: " + componentCallbacksC0361n);
        }
        if (componentCallbacksC0361n.f1801Z1) {
            componentCallbacksC0361n.m1230K(componentCallbacksC0361n.f1807e);
            componentCallbacksC0361n.f1804c = 1;
            return;
        }
        C0377w c0377w = this.f1672a;
        c0377w.m1278h(false);
        Bundle bundle = componentCallbacksC0361n.f1807e;
        componentCallbacksC0361n.f1782J1.m1299N();
        componentCallbacksC0361n.f1804c = 1;
        componentCallbacksC0361n.f1791S1 = false;
        componentCallbacksC0361n.f1803b2.mo1373a(new InterfaceC0398i() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.InterfaceC0398i
            /* renamed from: d */
            public final void mo357d(InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar) {
                View view;
                if (aVar != AbstractC0394f.a.ON_STOP || (view = ComponentCallbacksC0361n.this.f1793U1) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        componentCallbacksC0361n.f1808e2.m4533b(bundle);
        componentCallbacksC0361n.mo1215t(bundle);
        componentCallbacksC0361n.f1801Z1 = true;
        if (componentCallbacksC0361n.f1791S1) {
            componentCallbacksC0361n.f1803b2.m1379e(AbstractC0394f.a.ON_CREATE);
            c0377w.m1273c(false);
        } else {
            throw new C0374t0("Fragment " + componentCallbacksC0361n + " did not call through to super.onCreate()");
        }
    }

    /* renamed from: f */
    public final void m1151f() {
        String str;
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (componentCallbacksC0361n.f1775C1) {
            return;
        }
        if (AbstractC0378x.m1285I(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC0361n);
        }
        LayoutInflater mo1218x = componentCallbacksC0361n.mo1218x(componentCallbacksC0361n.f1807e);
        ViewGroup viewGroup = componentCallbacksC0361n.f1792T1;
        if (viewGroup == null) {
            int i7 = componentCallbacksC0361n.f1785M1;
            if (i7 == 0) {
                viewGroup = null;
            } else {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + componentCallbacksC0361n + " for a container view with no id");
                }
                viewGroup = (ViewGroup) componentCallbacksC0361n.f1780H1.f1898o.mo390s(i7);
                if (viewGroup == null && !componentCallbacksC0361n.f1777E1) {
                    try {
                        str = componentCallbacksC0361n.m1228I().getResources().getResourceName(componentCallbacksC0361n.f1785M1);
                    } catch (Resources.NotFoundException unused) {
                        str = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(componentCallbacksC0361n.f1785M1) + " (" + str + ") for fragment " + componentCallbacksC0361n);
                }
            }
        }
        componentCallbacksC0361n.f1792T1 = viewGroup;
        componentCallbacksC0361n.mo1209C(mo1218x, viewGroup, componentCallbacksC0361n.f1807e);
        View view = componentCallbacksC0361n.f1793U1;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            componentCallbacksC0361n.f1793U1.setTag(R$id.fragment_container_view_tag, componentCallbacksC0361n);
            if (viewGroup != null) {
                m1147b();
            }
            if (componentCallbacksC0361n.f1787O1) {
                componentCallbacksC0361n.f1793U1.setVisibility(8);
            }
            View view2 = componentCallbacksC0361n.f1793U1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (C0946x.g.m2859b(view2)) {
                C0946x.h.m2867c(componentCallbacksC0361n.f1793U1);
            } else {
                View view3 = componentCallbacksC0361n.f1793U1;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            componentCallbacksC0361n.f1782J1.m1333t(2);
            this.f1672a.m1283m(false);
            int visibility = componentCallbacksC0361n.f1793U1.getVisibility();
            componentCallbacksC0361n.m1234e().f1828l = componentCallbacksC0361n.f1793U1.getAlpha();
            if (componentCallbacksC0361n.f1792T1 != null && visibility == 0) {
                View findFocus = componentCallbacksC0361n.f1793U1.findFocus();
                if (findFocus != null) {
                    componentCallbacksC0361n.m1234e().f1829m = findFocus;
                    if (AbstractC0378x.m1285I(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + componentCallbacksC0361n);
                    }
                }
                componentCallbacksC0361n.f1793U1.setAlpha(0.0f);
            }
        }
        componentCallbacksC0361n.f1804c = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1152g() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0342d0.m1152g():void");
    }

    /* renamed from: h */
    public final void m1153h() {
        View view;
        boolean m1285I = AbstractC0378x.m1285I(3);
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (m1285I) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + componentCallbacksC0361n);
        }
        ViewGroup viewGroup = componentCallbacksC0361n.f1792T1;
        if (viewGroup != null && (view = componentCallbacksC0361n.f1793U1) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC0361n.m1223D();
        this.f1672a.m1284n(false);
        componentCallbacksC0361n.f1792T1 = null;
        componentCallbacksC0361n.f1793U1 = null;
        componentCallbacksC0361n.f1805c2 = null;
        componentCallbacksC0361n.f1806d2.mo1388h(null);
        componentCallbacksC0361n.f1776D1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1154i() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0342d0.m1154i():void");
    }

    /* renamed from: j */
    public final void m1155j() {
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (componentCallbacksC0361n.f1775C1 && componentCallbacksC0361n.f1776D1 && !componentCallbacksC0361n.f1778F1) {
            if (AbstractC0378x.m1285I(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + componentCallbacksC0361n);
            }
            componentCallbacksC0361n.mo1209C(componentCallbacksC0361n.mo1218x(componentCallbacksC0361n.f1807e), null, componentCallbacksC0361n.f1807e);
            View view = componentCallbacksC0361n.f1793U1;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC0361n.f1793U1.setTag(R$id.fragment_container_view_tag, componentCallbacksC0361n);
                if (componentCallbacksC0361n.f1787O1) {
                    componentCallbacksC0361n.f1793U1.setVisibility(8);
                }
                componentCallbacksC0361n.f1782J1.m1333t(2);
                this.f1672a.m1283m(false);
                componentCallbacksC0361n.f1804c = 2;
            }
        }
    }

    /* renamed from: k */
    public final void m1156k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z6 = this.f1675d;
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (z6) {
            if (AbstractC0378x.m1285I(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + componentCallbacksC0361n);
                return;
            }
            return;
        }
        try {
            this.f1675d = true;
            while (true) {
                int m1149d = m1149d();
                int i7 = componentCallbacksC0361n.f1804c;
                if (m1149d == i7) {
                    if (componentCallbacksC0361n.f1799Y1) {
                        if (componentCallbacksC0361n.f1793U1 != null && (viewGroup = componentCallbacksC0361n.f1792T1) != null) {
                            AbstractC0368q0 m1255f = AbstractC0368q0.m1255f(viewGroup, componentCallbacksC0361n.m1239l().m1296G());
                            if (componentCallbacksC0361n.f1787O1) {
                                m1255f.getClass();
                                if (AbstractC0378x.m1285I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + componentCallbacksC0361n);
                                }
                                m1255f.m1256a(3, 1, this);
                            } else {
                                m1255f.getClass();
                                if (AbstractC0378x.m1285I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + componentCallbacksC0361n);
                                }
                                m1255f.m1256a(2, 1, this);
                            }
                        }
                        AbstractC0378x abstractC0378x = componentCallbacksC0361n.f1780H1;
                        if (abstractC0378x != null && componentCallbacksC0361n.f1773A1 && AbstractC0378x.m1286J(componentCallbacksC0361n)) {
                            abstractC0378x.f1907x = true;
                        }
                        componentCallbacksC0361n.f1799Y1 = false;
                    }
                    return;
                }
                if (m1149d <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            m1154i();
                            break;
                        case 0:
                            m1152g();
                            break;
                        case 1:
                            m1153h();
                            componentCallbacksC0361n.f1804c = 1;
                            break;
                        case 2:
                            componentCallbacksC0361n.f1776D1 = false;
                            componentCallbacksC0361n.f1804c = 2;
                            break;
                        case 3:
                            if (AbstractC0378x.m1285I(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + componentCallbacksC0361n);
                            }
                            if (componentCallbacksC0361n.f1793U1 != null && componentCallbacksC0361n.f1810m == null) {
                                m1161p();
                            }
                            if (componentCallbacksC0361n.f1793U1 != null && (viewGroup3 = componentCallbacksC0361n.f1792T1) != null) {
                                AbstractC0368q0 m1255f2 = AbstractC0368q0.m1255f(viewGroup3, componentCallbacksC0361n.m1239l().m1296G());
                                m1255f2.getClass();
                                if (AbstractC0378x.m1285I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + componentCallbacksC0361n);
                                }
                                m1255f2.m1256a(1, 3, this);
                            }
                            componentCallbacksC0361n.f1804c = 3;
                            break;
                        case 4:
                            m1163r();
                            break;
                        case 5:
                            componentCallbacksC0361n.f1804c = 5;
                            break;
                        case 6:
                            m1157l();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            m1148c();
                            break;
                        case 1:
                            m1150e();
                            break;
                        case 2:
                            m1155j();
                            m1151f();
                            break;
                        case 3:
                            m1146a();
                            break;
                        case 4:
                            if (componentCallbacksC0361n.f1793U1 != null && (viewGroup2 = componentCallbacksC0361n.f1792T1) != null) {
                                AbstractC0368q0 m1255f3 = AbstractC0368q0.m1255f(viewGroup2, componentCallbacksC0361n.m1239l().m1296G());
                                int m206d = C0089a.m206d(componentCallbacksC0361n.f1793U1.getVisibility());
                                m1255f3.getClass();
                                if (AbstractC0378x.m1285I(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + componentCallbacksC0361n);
                                }
                                m1255f3.m1256a(m206d, 2, this);
                            }
                            componentCallbacksC0361n.f1804c = 4;
                            break;
                        case 5:
                            m1162q();
                            break;
                        case 6:
                            componentCallbacksC0361n.f1804c = 6;
                            break;
                        case 7:
                            m1159n();
                            break;
                    }
                }
            }
        } finally {
            this.f1675d = false;
        }
    }

    /* renamed from: l */
    public final void m1157l() {
        boolean m1285I = AbstractC0378x.m1285I(3);
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (m1285I) {
            Log.d("FragmentManager", "movefrom RESUMED: " + componentCallbacksC0361n);
        }
        componentCallbacksC0361n.f1782J1.m1333t(5);
        if (componentCallbacksC0361n.f1793U1 != null) {
            componentCallbacksC0361n.f1805c2.m1221d(AbstractC0394f.a.ON_PAUSE);
        }
        componentCallbacksC0361n.f1803b2.m1379e(AbstractC0394f.a.ON_PAUSE);
        componentCallbacksC0361n.f1804c = 6;
        componentCallbacksC0361n.f1791S1 = true;
        this.f1672a.m1276f(false);
    }

    /* renamed from: m */
    public final void m1158m(ClassLoader classLoader) {
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        Bundle bundle = componentCallbacksC0361n.f1807e;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        componentCallbacksC0361n.f1810m = componentCallbacksC0361n.f1807e.getSparseParcelableArray("android:view_state");
        componentCallbacksC0361n.f1811s = componentCallbacksC0361n.f1807e.getBundle("android:view_registry_state");
        componentCallbacksC0361n.f1813x1 = componentCallbacksC0361n.f1807e.getString("android:target_state");
        if (componentCallbacksC0361n.f1813x1 != null) {
            componentCallbacksC0361n.f1814y1 = componentCallbacksC0361n.f1807e.getInt("android:target_req_state", 0);
        }
        Boolean bool = componentCallbacksC0361n.f1796X;
        if (bool != null) {
            componentCallbacksC0361n.f1795W1 = bool.booleanValue();
            componentCallbacksC0361n.f1796X = null;
        } else {
            componentCallbacksC0361n.f1795W1 = componentCallbacksC0361n.f1807e.getBoolean("android:user_visible_hint", true);
        }
        if (componentCallbacksC0361n.f1795W1) {
            return;
        }
        componentCallbacksC0361n.f1794V1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1159n() {
        /*
            r9 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.AbstractC0378x.m1285I(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.n r2 = r9.f1674c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            androidx.fragment.app.n$b r0 = r2.f1797X1
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f1829m
        L25:
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L83
            android.view.View r6 = r2.f1793U1
            if (r0 != r6) goto L2e
            goto L38
        L2e:
            android.view.ViewParent r6 = r0.getParent()
        L32:
            if (r6 == 0) goto L3f
            android.view.View r7 = r2.f1793U1
            if (r6 != r7) goto L3a
        L38:
            r6 = 1
            goto L40
        L3a:
            android.view.ViewParent r6 = r6.getParent()
            goto L32
        L3f:
            r6 = 0
        L40:
            if (r6 == 0) goto L83
            boolean r6 = r0.requestFocus()
            r7 = 2
            boolean r7 = androidx.fragment.app.AbstractC0378x.m1285I(r7)
            if (r7 == 0) goto L83
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "requestFocus: Restoring focused view "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = " "
            r7.append(r0)
            if (r6 == 0) goto L61
            java.lang.String r0 = "succeeded"
            goto L63
        L61:
            java.lang.String r0 = "failed"
        L63:
            r7.append(r0)
            java.lang.String r0 = " on Fragment "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r7.append(r0)
            android.view.View r0 = r2.f1793U1
            android.view.View r0 = r0.findFocus()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.v(r1, r0)
        L83:
            androidx.fragment.app.n$b r0 = r2.m1234e()
            r0.f1829m = r3
            androidx.fragment.app.y r0 = r2.f1782J1
            r0.m1299N()
            androidx.fragment.app.y r0 = r2.f1782J1
            r0.m1337x(r4)
            r0 = 7
            r2.f1804c = r0
            r2.f1791S1 = r4
            androidx.lifecycle.l r1 = r2.f1803b2
            androidx.lifecycle.f$a r4 = androidx.lifecycle.AbstractC0394f.a.ON_RESUME
            r1.m1379e(r4)
            android.view.View r1 = r2.f1793U1
            if (r1 == 0) goto Laa
            androidx.fragment.app.m0 r1 = r2.f1805c2
            androidx.lifecycle.l r1 = r1.f1770e
            r1.m1379e(r4)
        Laa:
            androidx.fragment.app.y r1 = r2.f1782J1
            r1.f1908y = r5
            r1.f1909z = r5
            androidx.fragment.app.a0 r4 = r1.f1882F
            r4.f1636h = r5
            r1.m1333t(r0)
            androidx.fragment.app.w r0 = r9.f1672a
            r0.m1279i(r5)
            r2.f1807e = r3
            r2.f1810m = r3
            r2.f1811s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0342d0.m1159n():void");
    }

    /* renamed from: o */
    public final Bundle m1160o() {
        Bundle bundle = new Bundle();
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        componentCallbacksC0361n.mo1219y(bundle);
        componentCallbacksC0361n.f1808e2.m4534c(bundle);
        C0380z m1305T = componentCallbacksC0361n.f1782J1.m1305T();
        if (m1305T != null) {
            bundle.putParcelable("android:support:fragments", m1305T);
        }
        this.f1672a.m1280j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (componentCallbacksC0361n.f1793U1 != null) {
            m1161p();
        }
        if (componentCallbacksC0361n.f1810m != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", componentCallbacksC0361n.f1810m);
        }
        if (componentCallbacksC0361n.f1811s != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", componentCallbacksC0361n.f1811s);
        }
        if (!componentCallbacksC0361n.f1795W1) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", componentCallbacksC0361n.f1795W1);
        }
        return bundle;
    }

    /* renamed from: p */
    public final void m1161p() {
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (componentCallbacksC0361n.f1793U1 == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        componentCallbacksC0361n.f1793U1.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC0361n.f1810m = sparseArray;
        }
        Bundle bundle = new Bundle();
        componentCallbacksC0361n.f1805c2.f1771m.m4534c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC0361n.f1811s = bundle;
    }

    /* renamed from: q */
    public final void m1162q() {
        boolean m1285I = AbstractC0378x.m1285I(3);
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (m1285I) {
            Log.d("FragmentManager", "moveto STARTED: " + componentCallbacksC0361n);
        }
        componentCallbacksC0361n.f1782J1.m1299N();
        componentCallbacksC0361n.f1782J1.m1337x(true);
        componentCallbacksC0361n.f1804c = 5;
        componentCallbacksC0361n.f1791S1 = false;
        componentCallbacksC0361n.mo1220z();
        if (!componentCallbacksC0361n.f1791S1) {
            throw new C0374t0("Fragment " + componentCallbacksC0361n + " did not call through to super.onStart()");
        }
        C0401l c0401l = componentCallbacksC0361n.f1803b2;
        AbstractC0394f.a aVar = AbstractC0394f.a.ON_START;
        c0401l.m1379e(aVar);
        if (componentCallbacksC0361n.f1793U1 != null) {
            componentCallbacksC0361n.f1805c2.f1770e.m1379e(aVar);
        }
        C0379y c0379y = componentCallbacksC0361n.f1782J1;
        c0379y.f1908y = false;
        c0379y.f1909z = false;
        c0379y.f1882F.f1636h = false;
        c0379y.m1333t(5);
        this.f1672a.m1281k(false);
    }

    /* renamed from: r */
    public final void m1163r() {
        boolean m1285I = AbstractC0378x.m1285I(3);
        ComponentCallbacksC0361n componentCallbacksC0361n = this.f1674c;
        if (m1285I) {
            Log.d("FragmentManager", "movefrom STARTED: " + componentCallbacksC0361n);
        }
        C0379y c0379y = componentCallbacksC0361n.f1782J1;
        c0379y.f1909z = true;
        c0379y.f1882F.f1636h = true;
        c0379y.m1333t(4);
        if (componentCallbacksC0361n.f1793U1 != null) {
            componentCallbacksC0361n.f1805c2.m1221d(AbstractC0394f.a.ON_STOP);
        }
        componentCallbacksC0361n.f1803b2.m1379e(AbstractC0394f.a.ON_STOP);
        componentCallbacksC0361n.f1804c = 4;
        componentCallbacksC0361n.f1791S1 = false;
        componentCallbacksC0361n.mo1207A();
        if (componentCallbacksC0361n.f1791S1) {
            this.f1672a.m1282l(false);
            return;
        }
        throw new C0374t0("Fragment " + componentCallbacksC0361n + " did not call through to super.onStop()");
    }
}
