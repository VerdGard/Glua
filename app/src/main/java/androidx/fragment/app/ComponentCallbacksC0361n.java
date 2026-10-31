package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.ext.Tools;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0136c;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0389c0;
import androidx.lifecycle.C0393e0;
import androidx.lifecycle.C0401l;
import androidx.lifecycle.C0404o;
import androidx.lifecycle.InterfaceC0392e;
import androidx.lifecycle.InterfaceC0395f0;
import androidx.lifecycle.InterfaceC0400k;
import androidx.lifecycle.runtime.R$id;
import androidx.savedstate.C0493a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p032d6.C0898f;
import p089l.C1482p;
import p128q0.AbstractC1721a;
import p136r0.C1820a;
import p152t0.C1919b;
import p152t0.InterfaceC1920c;

/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public class ComponentCallbacksC0361n implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0400k, InterfaceC0395f0, InterfaceC0392e, InterfaceC1920c {

    /* renamed from: g2 */
    public static final Object f1772g2 = new Object();

    /* renamed from: A1 */
    public boolean f1773A1;

    /* renamed from: B1 */
    public boolean f1774B1;

    /* renamed from: C1 */
    public boolean f1775C1;

    /* renamed from: D1 */
    public boolean f1776D1;

    /* renamed from: E1 */
    public boolean f1777E1;

    /* renamed from: F1 */
    public boolean f1778F1;

    /* renamed from: G1 */
    public int f1779G1;

    /* renamed from: H1 */
    public AbstractC0378x f1780H1;

    /* renamed from: I1 */
    public AbstractC0375u<?> f1781I1;

    /* renamed from: K1 */
    public ComponentCallbacksC0361n f1783K1;

    /* renamed from: L1 */
    public int f1784L1;

    /* renamed from: M1 */
    public int f1785M1;

    /* renamed from: N1 */
    public String f1786N1;

    /* renamed from: O1 */
    public boolean f1787O1;

    /* renamed from: P1 */
    public boolean f1788P1;

    /* renamed from: Q1 */
    public boolean f1789Q1;

    /* renamed from: S1 */
    public boolean f1791S1;

    /* renamed from: T1 */
    public ViewGroup f1792T1;

    /* renamed from: U1 */
    public View f1793U1;

    /* renamed from: V1 */
    public boolean f1794V1;

    /* renamed from: X */
    public Boolean f1796X;

    /* renamed from: X1 */
    public b f1797X1;

    /* renamed from: Y1 */
    public boolean f1799Y1;

    /* renamed from: Z */
    public Bundle f1800Z;

    /* renamed from: Z1 */
    public boolean f1801Z1;

    /* renamed from: b2 */
    public C0401l f1803b2;

    /* renamed from: c2 */
    public C0360m0 f1805c2;

    /* renamed from: e */
    public Bundle f1807e;

    /* renamed from: e2 */
    public C1919b f1808e2;

    /* renamed from: f2 */
    public final ArrayList<d> f1809f2;

    /* renamed from: m */
    public SparseArray<Parcelable> f1810m;

    /* renamed from: s */
    public Bundle f1811s;

    /* renamed from: w1 */
    public ComponentCallbacksC0361n f1812w1;

    /* renamed from: y1 */
    public int f1814y1;

    /* renamed from: c */
    public int f1804c = -1;

    /* renamed from: Y */
    public String f1798Y = UUID.randomUUID().toString();

    /* renamed from: x1 */
    public String f1813x1 = null;

    /* renamed from: z1 */
    public Boolean f1815z1 = null;

    /* renamed from: J1 */
    public C0379y f1782J1 = new C0379y();

    /* renamed from: R1 */
    public boolean f1790R1 = true;

    /* renamed from: W1 */
    public boolean f1795W1 = true;

    /* renamed from: a2 */
    public AbstractC0394f.b f1802a2 = AbstractC0394f.b.f1983X;

    /* renamed from: d2 */
    public final C0404o<InterfaceC0400k> f1806d2 = new C0404o<>();

    /* renamed from: androidx.fragment.app.n$a */
    public class a extends AbstractC0136c {
        public a() {
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: s */
        public final View mo390s(int i7) {
            ComponentCallbacksC0361n componentCallbacksC0361n = ComponentCallbacksC0361n.this;
            View view = componentCallbacksC0361n.f1793U1;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + componentCallbacksC0361n + " does not have a view");
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: w */
        public final boolean mo394w() {
            return ComponentCallbacksC0361n.this.f1793U1 != null;
        }
    }

    /* renamed from: androidx.fragment.app.n$b */
    public static class b {

        /* renamed from: a */
        public boolean f1817a;

        /* renamed from: b */
        public int f1818b;

        /* renamed from: c */
        public int f1819c;

        /* renamed from: d */
        public int f1820d;

        /* renamed from: e */
        public int f1821e;

        /* renamed from: f */
        public int f1822f;

        /* renamed from: g */
        public ArrayList<String> f1823g;

        /* renamed from: h */
        public ArrayList<String> f1824h;

        /* renamed from: i */
        public final Object f1825i;

        /* renamed from: j */
        public final Object f1826j;

        /* renamed from: k */
        public final Object f1827k;

        /* renamed from: l */
        public float f1828l;

        /* renamed from: m */
        public View f1829m;

        public b() {
            Object obj = ComponentCallbacksC0361n.f1772g2;
            this.f1825i = obj;
            this.f1826j = obj;
            this.f1827k = obj;
            this.f1828l = 1.0f;
            this.f1829m = null;
        }
    }

    /* renamed from: androidx.fragment.app.n$c */
    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.n$d */
    public static abstract class d {
        /* renamed from: a */
        public abstract void m1246a();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* renamed from: androidx.fragment.app.n$e */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c */
        public final Bundle f1830c;

        /* renamed from: androidx.fragment.app.n$e$a */
        public class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new e[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }
        }

        public e(Bundle bundle) {
            this.f1830c = bundle;
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1830c = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeBundle(this.f1830c);
        }
    }

    public ComponentCallbacksC0361n() {
        new AtomicInteger();
        this.f1809f2 = new ArrayList<>();
        this.f1803b2 = new C0401l(this);
        this.f1808e2 = new C1919b(this);
    }

    /* renamed from: A */
    public void mo1207A() {
        this.f1791S1 = true;
    }

    /* renamed from: B */
    public void mo1208B(Bundle bundle) {
        this.f1791S1 = true;
    }

    /* renamed from: C */
    public void mo1209C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1782J1.m1299N();
        this.f1778F1 = true;
        this.f1805c2 = new C0360m0(mo353k());
        View mo1245u = mo1245u(layoutInflater, viewGroup, bundle);
        this.f1793U1 = mo1245u;
        if (mo1245u == null) {
            if (this.f1805c2.f1770e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1805c2 = null;
            return;
        }
        this.f1805c2.m1222e();
        View view = this.f1793U1;
        C0360m0 c0360m0 = this.f1805c2;
        C0898f.m2606e(view, "<this>");
        view.setTag(R$id.view_tree_lifecycle_owner, c0360m0);
        View view2 = this.f1793U1;
        C0360m0 c0360m02 = this.f1805c2;
        C0898f.m2606e(view2, "<this>");
        view2.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, c0360m02);
        View view3 = this.f1793U1;
        C0360m0 c0360m03 = this.f1805c2;
        C0898f.m2606e(view3, "<this>");
        view3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, c0360m03);
        this.f1806d2.mo1388h(this.f1805c2);
    }

    /* renamed from: D */
    public final void m1223D() {
        this.f1782J1.m1333t(1);
        if (this.f1793U1 != null) {
            C0360m0 c0360m0 = this.f1805c2;
            c0360m0.m1222e();
            if (c0360m0.f1770e.f1992c.compareTo(AbstractC0394f.b.f1987m) >= 0) {
                this.f1805c2.m1221d(AbstractC0394f.a.ON_DESTROY);
            }
        }
        this.f1804c = 1;
        this.f1791S1 = false;
        mo1216v();
        if (!this.f1791S1) {
            throw new C0374t0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        C1482p<C1820a.a> c1482p = ((C1820a.b) new C0389c0(mo353k(), C1820a.b.f8247d).m1354a(C1820a.b.class)).f8248c;
        int i7 = c1482p.f7050m;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C1820a.a) c1482p.f7049e[i8]).getClass();
        }
        this.f1778F1 = false;
    }

    /* renamed from: E */
    public final void m1224E() {
        onLowMemory();
        this.f1782J1.m1326m();
    }

    /* renamed from: F */
    public final void m1225F(boolean z6) {
        this.f1782J1.m1327n(z6);
    }

    /* renamed from: G */
    public final void m1226G(boolean z6) {
        this.f1782J1.m1331r(z6);
    }

    /* renamed from: H */
    public final boolean m1227H() {
        if (this.f1787O1) {
            return false;
        }
        return false | this.f1782J1.m1332s();
    }

    /* renamed from: I */
    public final Context m1228I() {
        Context m1237i = m1237i();
        if (m1237i != null) {
            return m1237i;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: J */
    public final View m1229J() {
        View view = this.f1793U1;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: K */
    public final void m1230K(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f1782J1.m1304S(parcelable);
        C0379y c0379y = this.f1782J1;
        c0379y.f1908y = false;
        c0379y.f1909z = false;
        c0379y.f1882F.f1636h = false;
        c0379y.m1333t(1);
    }

    /* renamed from: L */
    public final void m1231L(int i7, int i8, int i9, int i10) {
        if (this.f1797X1 == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        m1234e().f1818b = i7;
        m1234e().f1819c = i8;
        m1234e().f1820d = i9;
        m1234e().f1821e = i10;
    }

    /* renamed from: M */
    public final void m1232M(Bundle bundle) {
        AbstractC0378x abstractC0378x = this.f1780H1;
        if (abstractC0378x != null) {
            if (abstractC0378x.f1908y || abstractC0378x.f1909z) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1800Z = bundle;
    }

    @Deprecated
    /* renamed from: N */
    public final void m1233N(boolean z6) {
        AbstractC0378x abstractC0378x;
        if (!this.f1795W1 && z6 && this.f1804c < 5 && (abstractC0378x = this.f1780H1) != null) {
            if ((this.f1781I1 != null && this.f1773A1) && this.f1801Z1) {
                C0342d0 m1320g = abstractC0378x.m1320g(this);
                ComponentCallbacksC0361n componentCallbacksC0361n = m1320g.f1674c;
                if (componentCallbacksC0361n.f1794V1) {
                    if (abstractC0378x.f1885b) {
                        abstractC0378x.f1878B = true;
                    } else {
                        componentCallbacksC0361n.f1794V1 = false;
                        m1320g.m1156k();
                    }
                }
            }
        }
        this.f1795W1 = z6;
        this.f1794V1 = this.f1804c < 5 && !z6;
        if (this.f1807e != null) {
            this.f1796X = Boolean.valueOf(z6);
        }
    }

    @Override // p152t0.InterfaceC1920c
    /* renamed from: b */
    public final C0493a mo350b() {
        return this.f1808e2.f8684b;
    }

    /* renamed from: d */
    public AbstractC0136c mo1213d() {
        return new a();
    }

    /* renamed from: e */
    public final b m1234e() {
        if (this.f1797X1 == null) {
            this.f1797X1 = new b();
        }
        return this.f1797X1;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final ActivityC0367q m1235f() {
        AbstractC0375u<?> abstractC0375u = this.f1781I1;
        if (abstractC0375u == null) {
            return null;
        }
        return (ActivityC0367q) abstractC0375u.f1869e;
    }

    /* renamed from: g */
    public final AbstractC0378x m1236g() {
        if (this.f1781I1 != null) {
            return this.f1782J1;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // androidx.lifecycle.InterfaceC0392e
    /* renamed from: h */
    public final AbstractC1721a mo351h() {
        return AbstractC1721a.a.f7883b;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final Context m1237i() {
        AbstractC0375u<?> abstractC0375u = this.f1781I1;
        if (abstractC0375u == null) {
            return null;
        }
        return abstractC0375u.f1870m;
    }

    /* renamed from: j */
    public final int m1238j() {
        AbstractC0394f.b bVar = this.f1802a2;
        return (bVar == AbstractC0394f.b.f1986e || this.f1783K1 == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f1783K1.m1238j());
    }

    @Override // androidx.lifecycle.InterfaceC0395f0
    /* renamed from: k */
    public final C0393e0 mo353k() {
        if (this.f1780H1 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1238j() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, C0393e0> hashMap = this.f1780H1.f1882F.f1633e;
        C0393e0 c0393e0 = hashMap.get(this.f1798Y);
        if (c0393e0 != null) {
            return c0393e0;
        }
        C0393e0 c0393e02 = new C0393e0();
        hashMap.put(this.f1798Y, c0393e02);
        return c0393e02;
    }

    /* renamed from: l */
    public final AbstractC0378x m1239l() {
        AbstractC0378x abstractC0378x = this.f1780H1;
        if (abstractC0378x != null) {
            return abstractC0378x;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // androidx.lifecycle.InterfaceC0400k
    /* renamed from: m */
    public final C0401l mo354m() {
        return this.f1803b2;
    }

    /* renamed from: n */
    public final Object m1240n() {
        Object obj;
        b bVar = this.f1797X1;
        if (bVar == null || (obj = bVar.f1826j) == f1772g2) {
            return null;
        }
        return obj;
    }

    /* renamed from: o */
    public final Object m1241o() {
        Object obj;
        b bVar = this.f1797X1;
        if (bVar == null || (obj = bVar.f1825i) == f1772g2) {
            return null;
        }
        return obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1791S1 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        ActivityC0367q m1235f = m1235f();
        if (m1235f != null) {
            m1235f.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1791S1 = true;
    }

    /* renamed from: p */
    public final Object m1242p() {
        Object obj;
        b bVar = this.f1797X1;
        if (bVar == null || (obj = bVar.f1827k) == f1772g2) {
            return null;
        }
        return obj;
    }

    /* renamed from: q */
    public final String m1243q(int i7) {
        return m1228I().getResources().getString(i7);
    }

    @Deprecated
    /* renamed from: r */
    public final void m1244r(int i7, int i8, Intent intent) {
        if (AbstractC0378x.m1285I(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    /* renamed from: s */
    public void mo1214s(Context context) {
        this.f1791S1 = true;
        AbstractC0375u<?> abstractC0375u = this.f1781I1;
        if ((abstractC0375u == null ? null : abstractC0375u.f1869e) != null) {
            this.f1791S1 = true;
        }
    }

    /* renamed from: t */
    public void mo1215t(Bundle bundle) {
        this.f1791S1 = true;
        m1230K(bundle);
        C0379y c0379y = this.f1782J1;
        if (c0379y.f1896m >= 1) {
            return;
        }
        c0379y.f1908y = false;
        c0379y.f1909z = false;
        c0379y.f1882F.f1636h = false;
        c0379y.m1333t(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Tools.Semaphore.f159S7);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1798Y);
        if (this.f1784L1 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1784L1));
        }
        if (this.f1786N1 != null) {
            sb.append(" tag=");
            sb.append(this.f1786N1);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public View mo1245u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* renamed from: v */
    public void mo1216v() {
        this.f1791S1 = true;
    }

    /* renamed from: w */
    public void mo1217w() {
        this.f1791S1 = true;
    }

    /* renamed from: x */
    public LayoutInflater mo1218x(Bundle bundle) {
        AbstractC0375u<?> abstractC0375u = this.f1781I1;
        if (abstractC0375u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater mo1251A = abstractC0375u.mo1251A();
        mo1251A.setFactory2(this.f1782J1.f1889f);
        return mo1251A;
    }

    /* renamed from: y */
    public void mo1219y(Bundle bundle) {
    }

    /* renamed from: z */
    public void mo1220z() {
        this.f1791S1 = true;
    }
}
