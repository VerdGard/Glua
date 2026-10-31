package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.ext.C0090b;
import android.ext.Tools;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.R$attr;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.C0464a;
import androidx.recyclerview.widget.C0466b;
import androidx.recyclerview.widget.C0467b0;
import androidx.recyclerview.widget.C0469c0;
import androidx.recyclerview.widget.C0477k;
import androidx.recyclerview.widget.C0490x;
import androidx.recyclerview.widget.RunnableC0479m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p001a0.C0013l;
import p034e0.C0908a;
import p034e0.C0923h0;
import p034e0.C0930l;
import p034e0.C0946x;
import p034e0.InterfaceC0928k;
import p042f0.C1146b;
import p042f0.C1151g;
import p082k0.AbstractC1446a;
import p089l.C1481o;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0928k {

    /* renamed from: J2 */
    public static final int[] f2100J2 = {R.attr.nestedScrollingEnabled};

    /* renamed from: K2 */
    public static final boolean f2101K2;

    /* renamed from: L2 */
    public static final boolean f2102L2;

    /* renamed from: M2 */
    public static final boolean f2103M2;

    /* renamed from: N2 */
    public static final Class<?>[] f2104N2;

    /* renamed from: O2 */
    public static final InterpolatorC0434c f2105O2;

    /* renamed from: A1 */
    public final Rect f2106A1;

    /* renamed from: A2 */
    public C0490x f2107A2;

    /* renamed from: B1 */
    public final Rect f2108B1;

    /* renamed from: B2 */
    public final int[] f2109B2;

    /* renamed from: C1 */
    public final RectF f2110C1;

    /* renamed from: C2 */
    public C0930l f2111C2;

    /* renamed from: D1 */
    public AbstractC0436e f2112D1;

    /* renamed from: D2 */
    public final int[] f2113D2;

    /* renamed from: E1 */
    public AbstractC0444m f2114E1;

    /* renamed from: E2 */
    public final int[] f2115E2;

    /* renamed from: F1 */
    public final ArrayList<AbstractC0443l> f2116F1;

    /* renamed from: F2 */
    public final int[] f2117F2;

    /* renamed from: G1 */
    public final ArrayList<InterfaceC0447p> f2118G1;

    /* renamed from: G2 */
    public final ArrayList f2119G2;

    /* renamed from: H1 */
    public InterfaceC0447p f2120H1;

    /* renamed from: H2 */
    public final RunnableC0433b f2121H2;

    /* renamed from: I1 */
    public boolean f2122I1;

    /* renamed from: I2 */
    public final C0435d f2123I2;

    /* renamed from: J1 */
    public boolean f2124J1;

    /* renamed from: K1 */
    public boolean f2125K1;

    /* renamed from: L1 */
    public int f2126L1;

    /* renamed from: M1 */
    public boolean f2127M1;

    /* renamed from: N1 */
    public boolean f2128N1;

    /* renamed from: O1 */
    public boolean f2129O1;

    /* renamed from: P1 */
    public int f2130P1;

    /* renamed from: Q1 */
    public boolean f2131Q1;

    /* renamed from: R1 */
    public final AccessibilityManager f2132R1;

    /* renamed from: S1 */
    public boolean f2133S1;

    /* renamed from: T1 */
    public boolean f2134T1;

    /* renamed from: U1 */
    public int f2135U1;

    /* renamed from: V1 */
    public int f2136V1;

    /* renamed from: W1 */
    public C0440i f2137W1;

    /* renamed from: X1 */
    public EdgeEffect f2138X1;

    /* renamed from: Y1 */
    public EdgeEffect f2139Y1;

    /* renamed from: Z1 */
    public EdgeEffect f2140Z1;

    /* renamed from: a2 */
    public EdgeEffect f2141a2;

    /* renamed from: b2 */
    public AbstractC0441j f2142b2;

    /* renamed from: c */
    public final C0452u f2143c;

    /* renamed from: c2 */
    public int f2144c2;

    /* renamed from: d2 */
    public int f2145d2;

    /* renamed from: e */
    public final C0450s f2146e;

    /* renamed from: e2 */
    public VelocityTracker f2147e2;

    /* renamed from: f2 */
    public int f2148f2;

    /* renamed from: g2 */
    public int f2149g2;

    /* renamed from: h2 */
    public int f2150h2;

    /* renamed from: i2 */
    public int f2151i2;

    /* renamed from: j2 */
    public int f2152j2;

    /* renamed from: k2 */
    public AbstractC0446o f2153k2;

    /* renamed from: l2 */
    public final int f2154l2;

    /* renamed from: m */
    public C0453v f2155m;

    /* renamed from: m2 */
    public final int f2156m2;

    /* renamed from: n2 */
    public final float f2157n2;

    /* renamed from: o2 */
    public final float f2158o2;

    /* renamed from: p2 */
    public boolean f2159p2;

    /* renamed from: q2 */
    public final RunnableC0457z f2160q2;

    /* renamed from: r2 */
    public RunnableC0479m f2161r2;

    /* renamed from: s */
    public C0464a f2162s;

    /* renamed from: s2 */
    public final RunnableC0479m.b f2163s2;

    /* renamed from: t2 */
    public final C0455x f2164t2;

    /* renamed from: u2 */
    public AbstractC0448q f2165u2;

    /* renamed from: v2 */
    public ArrayList f2166v2;

    /* renamed from: w1 */
    public C0466b f2167w1;

    /* renamed from: w2 */
    public boolean f2168w2;

    /* renamed from: x1 */
    public final C0469c0 f2169x1;

    /* renamed from: x2 */
    public boolean f2170x2;

    /* renamed from: y1 */
    public boolean f2171y1;

    /* renamed from: y2 */
    public final C0442k f2172y2;

    /* renamed from: z1 */
    public final RunnableC0431a f2173z1;

    /* renamed from: z2 */
    public boolean f2174z2;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC0431a implements Runnable {
        public RunnableC0431a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f2125K1 || recyclerView.isLayoutRequested()) {
                return;
            }
            if (!recyclerView.f2122I1) {
                recyclerView.requestLayout();
            } else if (recyclerView.f2128N1) {
                recyclerView.f2127M1 = true;
            } else {
                recyclerView.m1553m();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class AbstractC0432a0 {

        /* renamed from: s */
        public static final List<Object> f2176s = Collections.emptyList();

        /* renamed from: a */
        public final View f2177a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f2178b;

        /* renamed from: j */
        public int f2186j;

        /* renamed from: r */
        public RecyclerView f2194r;

        /* renamed from: c */
        public int f2179c = -1;

        /* renamed from: d */
        public int f2180d = -1;

        /* renamed from: e */
        public long f2181e = -1;

        /* renamed from: f */
        public int f2182f = -1;

        /* renamed from: g */
        public int f2183g = -1;

        /* renamed from: h */
        public AbstractC0432a0 f2184h = null;

        /* renamed from: i */
        public AbstractC0432a0 f2185i = null;

        /* renamed from: k */
        public ArrayList f2187k = null;

        /* renamed from: l */
        public List<Object> f2188l = null;

        /* renamed from: m */
        public int f2189m = 0;

        /* renamed from: n */
        public C0450s f2190n = null;

        /* renamed from: o */
        public boolean f2191o = false;

        /* renamed from: p */
        public int f2192p = 0;

        /* renamed from: q */
        public int f2193q = -1;

        public AbstractC0432a0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f2177a = view;
        }

        /* renamed from: a */
        public final void m1567a(Object obj) {
            if (obj == null) {
                m1568b(1024);
                return;
            }
            if ((1024 & this.f2186j) == 0) {
                if (this.f2187k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f2187k = arrayList;
                    this.f2188l = Collections.unmodifiableList(arrayList);
                }
                this.f2187k.add(obj);
            }
        }

        /* renamed from: b */
        public final void m1568b(int i7) {
            this.f2186j = i7 | this.f2186j;
        }

        /* renamed from: c */
        public final int m1569c() {
            int i7 = this.f2183g;
            return i7 == -1 ? this.f2179c : i7;
        }

        /* renamed from: d */
        public final List<Object> m1570d() {
            ArrayList arrayList;
            return ((this.f2186j & 1024) != 0 || (arrayList = this.f2187k) == null || arrayList.size() == 0) ? f2176s : this.f2188l;
        }

        /* renamed from: e */
        public final boolean m1571e() {
            View view = this.f2177a;
            return (view.getParent() == null || view.getParent() == this.f2194r) ? false : true;
        }

        /* renamed from: f */
        public final boolean m1572f() {
            return (this.f2186j & 1) != 0;
        }

        /* renamed from: g */
        public final boolean m1573g() {
            return (this.f2186j & 4) != 0;
        }

        /* renamed from: h */
        public final boolean m1574h() {
            if ((this.f2186j & 16) == 0) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (!C0946x.d.m2833i(this.f2177a)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: i */
        public final boolean m1575i() {
            return (this.f2186j & 8) != 0;
        }

        /* renamed from: j */
        public final boolean m1576j() {
            return this.f2190n != null;
        }

        /* renamed from: k */
        public final boolean m1577k() {
            return (this.f2186j & Tools.Semaphore.f160S8) != 0;
        }

        /* renamed from: l */
        public final void m1578l(int i7, boolean z6) {
            if (this.f2180d == -1) {
                this.f2180d = this.f2179c;
            }
            if (this.f2183g == -1) {
                this.f2183g = this.f2179c;
            }
            if (z6) {
                this.f2183g += i7;
            }
            this.f2179c += i7;
            View view = this.f2177a;
            if (view.getLayoutParams() != null) {
                ((C0445n) view.getLayoutParams()).f2231c = true;
            }
        }

        /* renamed from: m */
        public final void m1579m() {
            this.f2186j = 0;
            this.f2179c = -1;
            this.f2180d = -1;
            this.f2181e = -1L;
            this.f2183g = -1;
            this.f2189m = 0;
            this.f2184h = null;
            this.f2185i = null;
            ArrayList arrayList = this.f2187k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f2186j &= -1025;
            this.f2192p = 0;
            this.f2193q = -1;
            RecyclerView.m1518j(this);
        }

        /* renamed from: n */
        public final void m1580n(boolean z6) {
            int i7;
            int i8 = this.f2189m;
            int i9 = z6 ? i8 - 1 : i8 + 1;
            this.f2189m = i9;
            if (i9 < 0) {
                this.f2189m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z6 && i9 == 1) {
                i7 = this.f2186j | 16;
            } else if (!z6 || i9 != 0) {
                return;
            } else {
                i7 = this.f2186j & (-17);
            }
            this.f2186j = i7;
        }

        /* renamed from: o */
        public final boolean m1581o() {
            return (this.f2186j & Tools.Semaphore.f159S7) != 0;
        }

        /* renamed from: p */
        public final boolean m1582p() {
            return (this.f2186j & 32) != 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2179c + " id=" + this.f2181e + ", oldPos=" + this.f2180d + ", pLpos:" + this.f2183g);
            if (m1576j()) {
                sb.append(" scrap ");
                sb.append(this.f2191o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m1573g()) {
                sb.append(" invalid");
            }
            if (!m1572f()) {
                sb.append(" unbound");
            }
            boolean z6 = true;
            if ((this.f2186j & 2) != 0) {
                sb.append(" update");
            }
            if (m1575i()) {
                sb.append(" removed");
            }
            if (m1581o()) {
                sb.append(" ignored");
            }
            if (m1577k()) {
                sb.append(" tmpDetached");
            }
            if (!m1574h()) {
                sb.append(" not recyclable(" + this.f2189m + ")");
            }
            if ((this.f2186j & Tools.Semaphore.f161S9) == 0 && !m1573g()) {
                z6 = false;
            }
            if (z6) {
                sb.append(" undefined adapter position");
            }
            if (this.f2177a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class RunnableC0433b implements Runnable {
        public RunnableC0433b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j7;
            RecyclerView recyclerView = RecyclerView.this;
            AbstractC0441j abstractC0441j = recyclerView.f2142b2;
            if (abstractC0441j != null) {
                C0477k c0477k = (C0477k) abstractC0441j;
                ArrayList<AbstractC0432a0> arrayList = c0477k.f2399h;
                boolean z6 = !arrayList.isEmpty();
                ArrayList<C0477k.b> arrayList2 = c0477k.f2401j;
                boolean z7 = !arrayList2.isEmpty();
                ArrayList<C0477k.a> arrayList3 = c0477k.f2402k;
                boolean z8 = !arrayList3.isEmpty();
                ArrayList<AbstractC0432a0> arrayList4 = c0477k.f2400i;
                boolean z9 = !arrayList4.isEmpty();
                if (z6 || z7 || z9 || z8) {
                    Iterator<AbstractC0432a0> it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        j7 = c0477k.f2202d;
                        if (!hasNext) {
                            break;
                        }
                        AbstractC0432a0 next = it.next();
                        View view = next.f2177a;
                        ViewPropertyAnimator animate = view.animate();
                        c0477k.f2408q.add(next);
                        animate.setDuration(j7).alpha(0.0f).setListener(new C0472f(view, animate, c0477k, next)).start();
                        it = it;
                    }
                    arrayList.clear();
                    if (z7) {
                        ArrayList<C0477k.b> arrayList5 = new ArrayList<>();
                        arrayList5.addAll(arrayList2);
                        c0477k.f2404m.add(arrayList5);
                        arrayList2.clear();
                        RunnableC0468c runnableC0468c = new RunnableC0468c(c0477k, arrayList5);
                        if (z6) {
                            View view2 = arrayList5.get(0).f2416a.f2177a;
                            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                            C0946x.d.m2838n(view2, runnableC0468c, j7);
                        } else {
                            runnableC0468c.run();
                        }
                    }
                    if (z8) {
                        ArrayList<C0477k.a> arrayList6 = new ArrayList<>();
                        arrayList6.addAll(arrayList3);
                        c0477k.f2405n.add(arrayList6);
                        arrayList3.clear();
                        RunnableC0470d runnableC0470d = new RunnableC0470d(c0477k, arrayList6);
                        if (z6) {
                            View view3 = arrayList6.get(0).f2410a.f2177a;
                            WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                            C0946x.d.m2838n(view3, runnableC0470d, j7);
                        } else {
                            runnableC0470d.run();
                        }
                    }
                    if (z9) {
                        ArrayList<AbstractC0432a0> arrayList7 = new ArrayList<>();
                        arrayList7.addAll(arrayList4);
                        c0477k.f2403l.add(arrayList7);
                        arrayList4.clear();
                        RunnableC0471e runnableC0471e = new RunnableC0471e(c0477k, arrayList7);
                        if (z6 || z7 || z8) {
                            if (!z6) {
                                j7 = 0;
                            }
                            long max = Math.max(z7 ? c0477k.f2203e : 0L, z8 ? c0477k.f2204f : 0L) + j7;
                            View view4 = arrayList7.get(0).f2177a;
                            WeakHashMap<View, C0923h0> weakHashMap3 = C0946x.f4876a;
                            C0946x.d.m2838n(view4, runnableC0471e, max);
                        } else {
                            runnableC0471e.run();
                        }
                    }
                }
            }
            recyclerView.f2174z2 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public static class InterpolatorC0434c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C0435d {
        public C0435d() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static abstract class AbstractC0436e<VH extends AbstractC0432a0> {

        /* renamed from: a */
        public final C0437f f2197a = new C0437f();

        /* renamed from: b */
        public boolean f2198b = false;

        /* renamed from: a */
        public abstract int mo1583a();

        /* renamed from: b */
        public long mo1584b(int i7) {
            return -1L;
        }

        /* renamed from: c */
        public int mo1585c(int i7) {
            return 0;
        }

        /* renamed from: d */
        public abstract void mo1586d(VH vh, int i7);

        /* renamed from: e */
        public void mo1587e(VH vh, int i7, List<Object> list) {
            mo1586d(vh, i7);
        }

        /* renamed from: f */
        public abstract AbstractC0432a0 mo1588f(RecyclerView recyclerView, int i7);

        /* renamed from: g */
        public void mo1589g(VH vh) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static class C0437f extends Observable<AbstractC0438g> {
        /* renamed from: a */
        public final boolean m1590a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public final void m1591b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0438g) ((Observable) this).mObservers.get(size)).mo1594a();
            }
        }

        /* renamed from: c */
        public final void m1592c(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0438g) ((Observable) this).mObservers.get(size)).mo1595b(i7, i8);
            }
        }

        /* renamed from: d */
        public final void m1593d(int i7, int i8) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0438g) ((Observable) this).mObservers.get(size)).mo1596c(i7, i8);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class AbstractC0438g {
        /* renamed from: a */
        public void mo1594a() {
        }

        /* renamed from: b */
        public void mo1595b(int i7, int i8) {
        }

        /* renamed from: c */
        public void mo1596c(int i7, int i8) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public interface InterfaceC0439h {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C0440i {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class AbstractC0441j {

        /* renamed from: a */
        public b f2199a = null;

        /* renamed from: b */
        public final ArrayList<a> f2200b = new ArrayList<>();

        /* renamed from: c */
        public final long f2201c = 120;

        /* renamed from: d */
        public final long f2202d = 120;

        /* renamed from: e */
        public final long f2203e = 250;

        /* renamed from: f */
        public final long f2204f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$a */
        public interface a {
            /* renamed from: a */
            void m1603a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$b */
        public interface b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$c */
        public static class c {

            /* renamed from: a */
            public int f2205a;

            /* renamed from: b */
            public int f2206b;

            /* renamed from: a */
            public final void m1604a(AbstractC0432a0 abstractC0432a0) {
                View view = abstractC0432a0.f2177a;
                this.f2205a = view.getLeft();
                this.f2206b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        /* renamed from: b */
        public static void m1597b(AbstractC0432a0 abstractC0432a0) {
            RecyclerView recyclerView;
            int i7 = abstractC0432a0.f2186j & 14;
            if (abstractC0432a0.m1573g() || (i7 & 4) != 0 || (recyclerView = abstractC0432a0.f2194r) == null) {
                return;
            }
            recyclerView.m1523F(abstractC0432a0);
        }

        /* renamed from: a */
        public abstract boolean mo1598a(AbstractC0432a0 abstractC0432a0, AbstractC0432a0 abstractC0432a02, c cVar, c cVar2);

        /* renamed from: c */
        public final void m1599c(AbstractC0432a0 abstractC0432a0) {
            b bVar = this.f2199a;
            if (bVar != null) {
                C0442k c0442k = (C0442k) bVar;
                boolean z6 = true;
                abstractC0432a0.m1580n(true);
                if (abstractC0432a0.f2184h != null && abstractC0432a0.f2185i == null) {
                    abstractC0432a0.f2184h = null;
                }
                abstractC0432a0.f2185i = null;
                if ((abstractC0432a0.f2186j & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.m1544b0();
                C0466b c0466b = recyclerView.f2167w1;
                C0488v c0488v = (C0488v) c0466b.f2352a;
                RecyclerView recyclerView2 = c0488v.f2495a;
                View view = abstractC0432a0.f2177a;
                int indexOfChild = recyclerView2.indexOfChild(view);
                if (indexOfChild == -1) {
                    c0466b.m1750k(view);
                } else {
                    C0466b.a aVar = c0466b.f2353b;
                    if (aVar.m1754d(indexOfChild)) {
                        aVar.m1756f(indexOfChild);
                        c0466b.m1750k(view);
                        c0488v.m1806b(indexOfChild);
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
                    C0450s c0450s = recyclerView.f2146e;
                    c0450s.m1670k(m1513I);
                    c0450s.m1667h(m1513I);
                }
                recyclerView.m1545c0(!z6);
                if (z6 || !abstractC0432a0.m1577k()) {
                    return;
                }
                recyclerView.removeDetachedView(view, false);
            }
        }

        /* renamed from: d */
        public abstract void mo1600d(AbstractC0432a0 abstractC0432a0);

        /* renamed from: e */
        public abstract void mo1601e();

        /* renamed from: f */
        public abstract boolean mo1602f();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public class C0442k implements AbstractC0441j.b {
        public C0442k() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class AbstractC0443l {
        /* renamed from: d */
        public void mo1605d(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: e */
        public void mo1606e(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class AbstractC0444m {

        /* renamed from: a */
        public C0466b f2208a;

        /* renamed from: b */
        public RecyclerView f2209b;

        /* renamed from: c */
        public final C0467b0 f2210c;

        /* renamed from: d */
        public final C0467b0 f2211d;

        /* renamed from: e */
        public AbstractC0454w f2212e;

        /* renamed from: f */
        public boolean f2213f;

        /* renamed from: g */
        public boolean f2214g;

        /* renamed from: h */
        public final boolean f2215h;

        /* renamed from: i */
        public final boolean f2216i;

        /* renamed from: j */
        public int f2217j;

        /* renamed from: k */
        public boolean f2218k;

        /* renamed from: l */
        public int f2219l;

        /* renamed from: m */
        public int f2220m;

        /* renamed from: n */
        public int f2221n;

        /* renamed from: o */
        public int f2222o;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public class a implements C0467b0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: a */
            public final int mo1646a() {
                AbstractC0444m abstractC0444m = AbstractC0444m.this;
                return abstractC0444m.f2221n - abstractC0444m.m1621H();
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: b */
            public final int mo1647b(View view) {
                C0445n c0445n = (C0445n) view.getLayoutParams();
                AbstractC0444m.this.getClass();
                return (view.getLeft() - ((C0445n) view.getLayoutParams()).f2230b.left) - ((ViewGroup.MarginLayoutParams) c0445n).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: c */
            public final View mo1648c(int i7) {
                return AbstractC0444m.this.m1641v(i7);
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: d */
            public final int mo1649d() {
                return AbstractC0444m.this.m1620G();
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: e */
            public final int mo1650e(View view) {
                C0445n c0445n = (C0445n) view.getLayoutParams();
                AbstractC0444m.this.getClass();
                return view.getRight() + ((C0445n) view.getLayoutParams()).f2230b.right + ((ViewGroup.MarginLayoutParams) c0445n).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public class b implements C0467b0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: a */
            public final int mo1646a() {
                AbstractC0444m abstractC0444m = AbstractC0444m.this;
                return abstractC0444m.f2222o - abstractC0444m.m1619F();
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: b */
            public final int mo1647b(View view) {
                C0445n c0445n = (C0445n) view.getLayoutParams();
                AbstractC0444m.this.getClass();
                return AbstractC0444m.m1608C(view) - ((ViewGroup.MarginLayoutParams) c0445n).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: c */
            public final View mo1648c(int i7) {
                return AbstractC0444m.this.m1641v(i7);
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: d */
            public final int mo1649d() {
                return AbstractC0444m.this.m1622I();
            }

            @Override // androidx.recyclerview.widget.C0467b0.b
            /* renamed from: e */
            public final int mo1650e(View view) {
                C0445n c0445n = (C0445n) view.getLayoutParams();
                AbstractC0444m.this.getClass();
                return AbstractC0444m.m1615z(view) + ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public interface c {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$d */
        public static class d {

            /* renamed from: a */
            public int f2225a;

            /* renamed from: b */
            public int f2226b;

            /* renamed from: c */
            public boolean f2227c;

            /* renamed from: d */
            public boolean f2228d;
        }

        public AbstractC0444m() {
            a aVar = new a();
            b bVar = new b();
            this.f2210c = new C0467b0(aVar);
            this.f2211d = new C0467b0(bVar);
            this.f2213f = false;
            this.f2214g = false;
            this.f2215h = true;
            this.f2216i = true;
        }

        /* renamed from: B */
        public static int m1607B(View view) {
            Rect rect = ((C0445n) view.getLayoutParams()).f2230b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: C */
        public static int m1608C(View view) {
            return view.getTop() - ((C0445n) view.getLayoutParams()).f2230b.top;
        }

        /* renamed from: J */
        public static int m1609J(View view) {
            return ((C0445n) view.getLayoutParams()).m1651a();
        }

        /* renamed from: K */
        public static d m1610K(Context context, AttributeSet attributeSet, int i7, int i8) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2048a, i7, i8);
            dVar.f2225a = obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 1);
            dVar.f2226b = obtainStyledAttributes.getInt(R$styleable.RecyclerView_spanCount, 1);
            dVar.f2227c = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_reverseLayout, false);
            dVar.f2228d = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: O */
        public static boolean m1611O(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (i9 > 0 && i7 != i9) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i7;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i7;
            }
            return true;
        }

        /* renamed from: P */
        public static void m1612P(View view, int i7, int i8, int i9, int i10) {
            C0445n c0445n = (C0445n) view.getLayoutParams();
            Rect rect = c0445n.f2230b;
            view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) c0445n).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) c0445n).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) c0445n).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin);
        }

        /* renamed from: h */
        public static int m1613h(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i8, i9) : size : Math.min(size, Math.max(i8, i9));
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r6 == 1073741824) goto L14;
         */
        /* renamed from: x */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int m1614x(boolean r4, int r5, int r6, int r7, int r8) {
            /*
                int r5 = r5 - r7
                r7 = 0
                int r5 = java.lang.Math.max(r7, r5)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L1a
                if (r8 < 0) goto L11
                goto L1c
            L11:
                if (r8 != r1) goto L31
                if (r6 == r2) goto L21
                if (r6 == 0) goto L31
                if (r6 == r3) goto L21
                goto L31
            L1a:
                if (r8 < 0) goto L1f
            L1c:
                r6 = 1073741824(0x40000000, float:2.0)
                goto L33
            L1f:
                if (r8 != r1) goto L23
            L21:
                r8 = r5
                goto L33
            L23:
                if (r8 != r0) goto L31
                if (r6 == r2) goto L2d
                if (r6 != r3) goto L2a
                goto L2d
            L2a:
                r8 = r5
                r6 = 0
                goto L33
            L2d:
                r8 = r5
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L33
            L31:
                r6 = 0
                r8 = 0
            L33:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0444m.m1614x(boolean, int, int, int, int):int");
        }

        /* renamed from: z */
        public static int m1615z(View view) {
            return view.getBottom() + ((C0445n) view.getLayoutParams()).f2230b.bottom;
        }

        /* renamed from: A */
        public void mo1616A(View view, Rect rect) {
            int[] iArr = RecyclerView.f2100J2;
            C0445n c0445n = (C0445n) view.getLayoutParams();
            Rect rect2 = c0445n.f2230b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0445n).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0445n).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0445n).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin);
        }

        /* renamed from: A0 */
        public boolean mo1426A0() {
            return false;
        }

        /* renamed from: D */
        public final int m1617D() {
            RecyclerView recyclerView = this.f2209b;
            AbstractC0436e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo1583a();
            }
            return 0;
        }

        /* renamed from: E */
        public final int m1618E() {
            RecyclerView recyclerView = this.f2209b;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            return C0946x.e.m2847d(recyclerView);
        }

        /* renamed from: F */
        public final int m1619F() {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: G */
        public final int m1620G() {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: H */
        public final int m1621H() {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: I */
        public final int m1622I() {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: L */
        public int mo1428L(C0450s c0450s, C0455x c0455x) {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView == null || recyclerView.f2112D1 == null || !mo1496f()) {
                return 1;
            }
            return this.f2209b.f2112D1.mo1583a();
        }

        /* renamed from: M */
        public final void m1623M(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((C0445n) view.getLayoutParams()).f2230b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f2209b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f2209b.f2110C1;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: N */
        public boolean mo1475N() {
            return false;
        }

        /* renamed from: Q */
        public void mo1624Q(int i7) {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView != null) {
                int m1744e = recyclerView.f2167w1.m1744e();
                for (int i8 = 0; i8 < m1744e; i8++) {
                    recyclerView.f2167w1.m1743d(i8).offsetLeftAndRight(i7);
                }
            }
        }

        /* renamed from: R */
        public void mo1625R(int i7) {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView != null) {
                int m1744e = recyclerView.f2167w1.m1744e();
                for (int i8 = 0; i8 < m1744e; i8++) {
                    recyclerView.f2167w1.m1743d(i8).offsetTopAndBottom(i7);
                }
            }
        }

        /* renamed from: S */
        public void mo1480S(RecyclerView recyclerView) {
        }

        /* renamed from: T */
        public View mo1430T(View view, int i7, C0450s c0450s, C0455x c0455x) {
            return null;
        }

        /* renamed from: U */
        public void mo1483U(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2209b;
            C0450s c0450s = recyclerView.f2146e;
            C0455x c0455x = recyclerView.f2164t2;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z6 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f2209b.canScrollVertically(-1) && !this.f2209b.canScrollHorizontally(-1) && !this.f2209b.canScrollHorizontally(1)) {
                z6 = false;
            }
            accessibilityEvent.setScrollable(z6);
            AbstractC0436e abstractC0436e = this.f2209b.f2112D1;
            if (abstractC0436e != null) {
                accessibilityEvent.setItemCount(abstractC0436e.mo1583a());
            }
        }

        /* renamed from: V */
        public final void m1626V(View view, C1151g c1151g) {
            AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
            if (m1513I == null || m1513I.m1575i() || this.f2208a.m1749j(m1513I.f2177a)) {
                return;
            }
            RecyclerView recyclerView = this.f2209b;
            mo1432W(recyclerView.f2146e, recyclerView.f2164t2, view, c1151g);
        }

        /* renamed from: W */
        public void mo1432W(C0450s c0450s, C0455x c0455x, View view, C1151g c1151g) {
            c1151g.m3343h(C1151g.b.m3349a(mo1496f() ? m1609J(view) : 0, 1, mo1493e() ? m1609J(view) : 0, 1, false, false));
        }

        /* renamed from: X */
        public void mo1434X(int i7, int i8) {
        }

        /* renamed from: Y */
        public void mo1435Y() {
        }

        /* renamed from: Z */
        public void mo1436Z(int i7, int i8) {
        }

        /* renamed from: a0 */
        public void mo1437a0(int i7, int i8) {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1627b(android.view.View r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0444m.m1627b(android.view.View, int, boolean):void");
        }

        /* renamed from: b0 */
        public void mo1438b0(int i7, int i8) {
        }

        /* renamed from: c */
        public void mo1491c(String str) {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView != null) {
                recyclerView.m1550i(str);
            }
        }

        /* renamed from: c0 */
        public void mo1439c0(C0450s c0450s, C0455x c0455x) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: d */
        public final void m1628d(View view, Rect rect) {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m1526J(view));
            }
        }

        /* renamed from: d0 */
        public void mo1441d0(C0455x c0455x) {
        }

        /* renamed from: e */
        public boolean mo1493e() {
            return false;
        }

        /* renamed from: e0 */
        public void mo1494e0(Parcelable parcelable) {
        }

        /* renamed from: f */
        public boolean mo1496f() {
            return false;
        }

        /* renamed from: f0 */
        public Parcelable mo1497f0() {
            return null;
        }

        /* renamed from: g */
        public boolean mo1442g(C0445n c0445n) {
            return c0445n != null;
        }

        /* renamed from: g0 */
        public void mo1629g0(int i7) {
        }

        /* renamed from: h0 */
        public final void m1630h0(C0450s c0450s) {
            int m1643w = m1643w();
            while (true) {
                m1643w--;
                if (m1643w < 0) {
                    return;
                }
                if (!RecyclerView.m1513I(m1641v(m1643w)).m1581o()) {
                    View m1641v = m1641v(m1643w);
                    m1633k0(m1643w);
                    c0450s.m1666g(m1641v);
                }
            }
        }

        /* renamed from: i */
        public void mo1499i(int i7, int i8, C0455x c0455x, c cVar) {
        }

        /* renamed from: i0 */
        public final void m1631i0(C0450s c0450s) {
            ArrayList<AbstractC0432a0> arrayList;
            int size = c0450s.f2239a.size();
            int i7 = size - 1;
            while (true) {
                arrayList = c0450s.f2239a;
                if (i7 < 0) {
                    break;
                }
                View view = arrayList.get(i7).f2177a;
                AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
                if (!m1513I.m1581o()) {
                    m1513I.m1580n(false);
                    if (m1513I.m1577k()) {
                        this.f2209b.removeDetachedView(view, false);
                    }
                    AbstractC0441j abstractC0441j = this.f2209b.f2142b2;
                    if (abstractC0441j != null) {
                        abstractC0441j.mo1600d(m1513I);
                    }
                    m1513I.m1580n(true);
                    AbstractC0432a0 m1513I2 = RecyclerView.m1513I(view);
                    m1513I2.f2190n = null;
                    m1513I2.f2191o = false;
                    m1513I2.f2186j &= -33;
                    c0450s.m1667h(m1513I2);
                }
                i7--;
            }
            arrayList.clear();
            ArrayList<AbstractC0432a0> arrayList2 = c0450s.f2240b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.f2209b.invalidate();
            }
        }

        /* renamed from: j */
        public void mo1500j(int i7, c cVar) {
        }

        /* renamed from: j0 */
        public final void m1632j0(View view, C0450s c0450s) {
            C0466b c0466b = this.f2208a;
            C0488v c0488v = (C0488v) c0466b.f2352a;
            int indexOfChild = c0488v.f2495a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (c0466b.f2353b.m1756f(indexOfChild)) {
                    c0466b.m1750k(view);
                }
                c0488v.m1806b(indexOfChild);
            }
            c0450s.m1666g(view);
        }

        /* renamed from: k */
        public int mo1501k(C0455x c0455x) {
            return 0;
        }

        /* renamed from: k0 */
        public final void m1633k0(int i7) {
            if (m1641v(i7) != null) {
                C0466b c0466b = this.f2208a;
                int m1745f = c0466b.m1745f(i7);
                C0488v c0488v = (C0488v) c0466b.f2352a;
                View childAt = c0488v.f2495a.getChildAt(m1745f);
                if (childAt == null) {
                    return;
                }
                if (c0466b.f2353b.m1756f(m1745f)) {
                    c0466b.m1750k(childAt);
                }
                c0488v.m1806b(m1745f);
            }
        }

        /* renamed from: l */
        public int mo1448l(C0455x c0455x) {
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
        
            if (r10 == false) goto L33;
         */
        /* renamed from: l0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo1634l0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.m1620G()
                int r1 = r8.m1622I()
                int r2 = r8.f2221n
                int r3 = r8.m1621H()
                int r2 = r2 - r3
                int r3 = r8.f2222o
                int r4 = r8.m1619F()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.m1618E()
                r7 = 1
                if (r3 != r7) goto L5c
                if (r2 == 0) goto L57
                goto L64
            L57:
                int r2 = java.lang.Math.max(r6, r10)
                goto L64
            L5c:
                if (r6 == 0) goto L5f
                goto L63
            L5f:
                int r6 = java.lang.Math.min(r4, r2)
            L63:
                r2 = r6
            L64:
                if (r1 == 0) goto L67
                goto L6b
            L67:
                int r1 = java.lang.Math.min(r5, r11)
            L6b:
                if (r13 == 0) goto Lab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L74
                goto La8
            L74:
                int r11 = r8.m1620G()
                int r13 = r8.m1622I()
                int r3 = r8.f2221n
                int r4 = r8.m1621H()
                int r3 = r3 - r4
                int r4 = r8.f2222o
                int r5 = r8.m1619F()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f2209b
                android.graphics.Rect r5 = r5.f2106A1
                r8.mo1616A(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto La8
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto La8
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto La8
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto La6
                goto La8
            La6:
                r10 = 1
                goto La9
            La8:
                r10 = 0
            La9:
                if (r10 == 0) goto Lb0
            Lab:
                if (r2 != 0) goto Lb1
                if (r1 == 0) goto Lb0
                goto Lb1
            Lb0:
                return r0
            Lb1:
                if (r12 == 0) goto Lb7
                r9.scrollBy(r2, r1)
                goto Lba
            Lb7:
                r9.m1543a0(r2, r1, r0)
            Lba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0444m.mo1634l0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: m */
        public int mo1450m(C0455x c0455x) {
            return 0;
        }

        /* renamed from: m0 */
        public final void m1635m0() {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: n */
        public int mo1502n(C0455x c0455x) {
            return 0;
        }

        /* renamed from: n0 */
        public int mo1452n0(int i7, C0450s c0450s, C0455x c0455x) {
            return 0;
        }

        /* renamed from: o */
        public int mo1454o(C0455x c0455x) {
            return 0;
        }

        /* renamed from: o0 */
        public void mo1503o0(int i7) {
        }

        /* renamed from: p */
        public int mo1455p(C0455x c0455x) {
            return 0;
        }

        /* renamed from: p0 */
        public int mo1456p0(int i7, C0450s c0450s, C0455x c0455x) {
            return 0;
        }

        /* renamed from: q */
        public final void m1636q(C0450s c0450s) {
            int m1643w = m1643w();
            while (true) {
                m1643w--;
                if (m1643w < 0) {
                    return;
                }
                View m1641v = m1641v(m1643w);
                AbstractC0432a0 m1513I = RecyclerView.m1513I(m1641v);
                if (!m1513I.m1581o()) {
                    if (!m1513I.m1573g() || m1513I.m1575i() || this.f2209b.f2112D1.f2198b) {
                        m1641v(m1643w);
                        this.f2208a.m1742c(m1643w);
                        c0450s.m1668i(m1641v);
                        this.f2209b.f2169x1.m1763b(m1513I);
                    } else {
                        m1633k0(m1643w);
                        c0450s.m1667h(m1513I);
                    }
                }
            }
        }

        /* renamed from: q0 */
        public final void m1637q0(RecyclerView recyclerView) {
            m1638r0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: r */
        public View mo1504r(int i7) {
            int m1643w = m1643w();
            for (int i8 = 0; i8 < m1643w; i8++) {
                View m1641v = m1641v(i8);
                AbstractC0432a0 m1513I = RecyclerView.m1513I(m1641v);
                if (m1513I != null && m1513I.m1569c() == i7 && !m1513I.m1581o() && (this.f2209b.f2164t2.f2270g || !m1513I.m1575i())) {
                    return m1641v;
                }
            }
            return null;
        }

        /* renamed from: r0 */
        public final void m1638r0(int i7, int i8) {
            this.f2221n = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            this.f2219l = mode;
            if (mode == 0 && !RecyclerView.f2101K2) {
                this.f2221n = 0;
            }
            this.f2222o = View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f2220m = mode2;
            if (mode2 != 0 || RecyclerView.f2101K2) {
                return;
            }
            this.f2222o = 0;
        }

        /* renamed from: s */
        public abstract C0445n mo1457s();

        /* renamed from: s0 */
        public void mo1458s0(Rect rect, int i7, int i8) {
            int m1621H = m1621H() + m1620G() + rect.width();
            int m1619F = m1619F() + m1622I() + rect.height();
            RecyclerView recyclerView = this.f2209b;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            this.f2209b.setMeasuredDimension(m1613h(i7, m1621H, C0946x.d.m2829e(recyclerView)), m1613h(i8, m1619F, C0946x.d.m2828d(this.f2209b)));
        }

        /* renamed from: t */
        public C0445n mo1459t(Context context, AttributeSet attributeSet) {
            return new C0445n(context, attributeSet);
        }

        /* renamed from: t0 */
        public final void m1639t0(int i7, int i8) {
            int m1643w = m1643w();
            if (m1643w == 0) {
                this.f2209b.m1554n(i7, i8);
                return;
            }
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            for (int i13 = 0; i13 < m1643w; i13++) {
                View m1641v = m1641v(i13);
                Rect rect = this.f2209b.f2106A1;
                mo1616A(m1641v, rect);
                int i14 = rect.left;
                if (i14 < i9) {
                    i9 = i14;
                }
                int i15 = rect.right;
                if (i15 > i11) {
                    i11 = i15;
                }
                int i16 = rect.top;
                if (i16 < i10) {
                    i10 = i16;
                }
                int i17 = rect.bottom;
                if (i17 > i12) {
                    i12 = i17;
                }
            }
            this.f2209b.f2106A1.set(i9, i10, i11, i12);
            mo1458s0(this.f2209b.f2106A1, i7, i8);
        }

        /* renamed from: u */
        public C0445n mo1460u(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0445n ? new C0445n((C0445n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0445n((ViewGroup.MarginLayoutParams) layoutParams) : new C0445n(layoutParams);
        }

        /* renamed from: u0 */
        public final void m1640u0(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f2209b = null;
                this.f2208a = null;
                height = 0;
                this.f2221n = 0;
            } else {
                this.f2209b = recyclerView;
                this.f2208a = recyclerView.f2167w1;
                this.f2221n = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f2222o = height;
            this.f2219l = 1073741824;
            this.f2220m = 1073741824;
        }

        /* renamed from: v */
        public final View m1641v(int i7) {
            C0466b c0466b = this.f2208a;
            if (c0466b != null) {
                return c0466b.m1743d(i7);
            }
            return null;
        }

        /* renamed from: v0 */
        public final boolean m1642v0(View view, int i7, int i8, C0445n c0445n) {
            return (!view.isLayoutRequested() && this.f2215h && m1611O(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) c0445n).width) && m1611O(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) c0445n).height)) ? false : true;
        }

        /* renamed from: w */
        public final int m1643w() {
            C0466b c0466b = this.f2208a;
            if (c0466b != null) {
                return c0466b.m1744e();
            }
            return 0;
        }

        /* renamed from: w0 */
        public boolean mo1505w0() {
            return false;
        }

        /* renamed from: x0 */
        public final boolean m1644x0(View view, int i7, int i8, C0445n c0445n) {
            return (this.f2215h && m1611O(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) c0445n).width) && m1611O(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) c0445n).height)) ? false : true;
        }

        /* renamed from: y */
        public int mo1461y(C0450s c0450s, C0455x c0455x) {
            RecyclerView recyclerView = this.f2209b;
            if (recyclerView == null || recyclerView.f2112D1 == null || !mo1493e()) {
                return 1;
            }
            return this.f2209b.f2112D1.mo1583a();
        }

        /* renamed from: y0 */
        public void mo1506y0(RecyclerView recyclerView, int i7) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: z0 */
        public final void m1645z0(C0481o c0481o) {
            AbstractC0454w abstractC0454w = this.f2212e;
            if (abstractC0454w != null && c0481o != abstractC0454w && abstractC0454w.f2253e) {
                abstractC0454w.m1676d();
            }
            this.f2212e = c0481o;
            RecyclerView recyclerView = this.f2209b;
            RunnableC0457z runnableC0457z = recyclerView.f2160q2;
            RecyclerView.this.removeCallbacks(runnableC0457z);
            runnableC0457z.f2283m.abortAnimation();
            if (c0481o.f2256h) {
                Log.w("RecyclerView", "An instance of " + c0481o.getClass().getSimpleName() + " was started more than once. Each instance of" + c0481o.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            c0481o.f2250b = recyclerView;
            c0481o.f2251c = this;
            int i7 = c0481o.f2249a;
            if (i7 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f2164t2.f2264a = i7;
            c0481o.f2253e = true;
            c0481o.f2252d = true;
            c0481o.f2254f = recyclerView.f2114E1.mo1504r(i7);
            c0481o.f2250b.f2160q2.m1680a();
            c0481o.f2256h = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static class C0445n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0432a0 f2229a;

        /* renamed from: b */
        public final Rect f2230b;

        /* renamed from: c */
        public boolean f2231c;

        /* renamed from: d */
        public boolean f2232d;

        public C0445n(int i7, int i8) {
            super(i7, i8);
            this.f2230b = new Rect();
            this.f2231c = true;
            this.f2232d = false;
        }

        public C0445n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2230b = new Rect();
            this.f2231c = true;
            this.f2232d = false;
        }

        public C0445n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2230b = new Rect();
            this.f2231c = true;
            this.f2232d = false;
        }

        public C0445n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2230b = new Rect();
            this.f2231c = true;
            this.f2232d = false;
        }

        public C0445n(C0445n c0445n) {
            super((ViewGroup.LayoutParams) c0445n);
            this.f2230b = new Rect();
            this.f2231c = true;
            this.f2232d = false;
        }

        /* renamed from: a */
        public final int m1651a() {
            return this.f2229a.m1569c();
        }

        /* renamed from: b */
        public final boolean m1652b() {
            return (this.f2229a.f2186j & 2) != 0;
        }

        /* renamed from: c */
        public final boolean m1653c() {
            return this.f2229a.m1575i();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC0446o {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public interface InterfaceC0447p {
        /* renamed from: a */
        void mo1654a(MotionEvent motionEvent);

        /* renamed from: b */
        boolean mo1655b(MotionEvent motionEvent);

        /* renamed from: c */
        void mo1656c();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static abstract class AbstractC0448q {
        /* renamed from: a */
        public void mo1657a(RecyclerView recyclerView, int i7) {
        }

        /* renamed from: b */
        public void mo1658b(RecyclerView recyclerView, int i7, int i8) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static class C0449r {

        /* renamed from: a */
        public final SparseArray<a> f2233a = new SparseArray<>();

        /* renamed from: b */
        public int f2234b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$r$a */
        public static class a {

            /* renamed from: a */
            public final ArrayList<AbstractC0432a0> f2235a = new ArrayList<>();

            /* renamed from: b */
            public final int f2236b = 5;

            /* renamed from: c */
            public long f2237c = 0;

            /* renamed from: d */
            public long f2238d = 0;
        }

        /* renamed from: a */
        public final a m1659a(int i7) {
            SparseArray<a> sparseArray = this.f2233a;
            a aVar = sparseArray.get(i7);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            sparseArray.put(i7, aVar2);
            return aVar2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public final class C0450s {

        /* renamed from: a */
        public final ArrayList<AbstractC0432a0> f2239a;

        /* renamed from: b */
        public ArrayList<AbstractC0432a0> f2240b;

        /* renamed from: c */
        public final ArrayList<AbstractC0432a0> f2241c;

        /* renamed from: d */
        public final List<AbstractC0432a0> f2242d;

        /* renamed from: e */
        public int f2243e;

        /* renamed from: f */
        public int f2244f;

        /* renamed from: g */
        public C0449r f2245g;

        public C0450s() {
            ArrayList<AbstractC0432a0> arrayList = new ArrayList<>();
            this.f2239a = arrayList;
            this.f2240b = null;
            this.f2241c = new ArrayList<>();
            this.f2242d = Collections.unmodifiableList(arrayList);
            this.f2243e = 2;
            this.f2244f = 2;
        }

        /* renamed from: a */
        public final void m1660a(AbstractC0432a0 abstractC0432a0, boolean z6) {
            RecyclerView.m1518j(abstractC0432a0);
            RecyclerView recyclerView = RecyclerView.this;
            C0490x c0490x = recyclerView.f2107A2;
            if (c0490x != null) {
                C0490x.a aVar = c0490x.f2498e;
                boolean z7 = aVar instanceof C0490x.a;
                View view = abstractC0432a0.f2177a;
                C0946x.m2817r(view, z7 ? (C0908a) aVar.f2500e.remove(view) : null);
            }
            if (z6) {
                AbstractC0436e abstractC0436e = recyclerView.f2112D1;
                if (abstractC0436e != null) {
                    abstractC0436e.mo1589g(abstractC0432a0);
                }
                if (recyclerView.f2164t2 != null) {
                    recyclerView.f2169x1.m1764c(abstractC0432a0);
                }
            }
            abstractC0432a0.f2194r = null;
            C0449r m1662c = m1662c();
            m1662c.getClass();
            int i7 = abstractC0432a0.f2182f;
            ArrayList<AbstractC0432a0> arrayList = m1662c.m1659a(i7).f2235a;
            if (m1662c.f2233a.get(i7).f2236b <= arrayList.size()) {
                return;
            }
            abstractC0432a0.m1579m();
            arrayList.add(abstractC0432a0);
        }

        /* renamed from: b */
        public final int m1661b(int i7) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i7 >= 0 && i7 < recyclerView.f2164t2.m1679b()) {
                return !recyclerView.f2164t2.f2270g ? i7 : recyclerView.f2162s.m1730f(i7, 0);
            }
            StringBuilder m221g = C0090b.m221g("invalid position ", i7, ". State item count is ");
            m221g.append(recyclerView.f2164t2.m1679b());
            m221g.append(recyclerView.m1565y());
            throw new IndexOutOfBoundsException(m221g.toString());
        }

        /* renamed from: c */
        public final C0449r m1662c() {
            if (this.f2245g == null) {
                this.f2245g = new C0449r();
            }
            return this.f2245g;
        }

        /* renamed from: d */
        public final View m1663d(int i7) {
            return m1669j(i7, Long.MAX_VALUE).f2177a;
        }

        /* renamed from: e */
        public final void m1664e() {
            ArrayList<AbstractC0432a0> arrayList = this.f2241c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m1665f(size);
            }
            arrayList.clear();
            if (RecyclerView.f2103M2) {
                RunnableC0479m.b bVar = RecyclerView.this.f2163s2;
                int[] iArr = bVar.f2464c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f2465d = 0;
            }
        }

        /* renamed from: f */
        public final void m1665f(int i7) {
            ArrayList<AbstractC0432a0> arrayList = this.f2241c;
            m1660a(arrayList.get(i7), true);
            arrayList.remove(i7);
        }

        /* renamed from: g */
        public final void m1666g(View view) {
            AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
            boolean m1577k = m1513I.m1577k();
            RecyclerView recyclerView = RecyclerView.this;
            if (m1577k) {
                recyclerView.removeDetachedView(view, false);
            }
            if (m1513I.m1576j()) {
                m1513I.f2190n.m1670k(m1513I);
            } else if (m1513I.m1582p()) {
                m1513I.f2186j &= -33;
            }
            m1667h(m1513I);
            if (recyclerView.f2142b2 == null || m1513I.m1574h()) {
                return;
            }
            recyclerView.f2142b2.mo1600d(m1513I);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00af  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1667h(androidx.recyclerview.widget.RecyclerView.AbstractC0432a0 r12) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0450s.m1667h(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1668i(android.view.View r6) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r6 = androidx.recyclerview.widget.RecyclerView.m1513I(r6)
                int r0 = r6.f2186j
                r1 = r0 & 12
                r2 = 1
                r3 = 0
                if (r1 == 0) goto Le
                r1 = 1
                goto Lf
            Le:
                r1 = 0
            Lf:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                if (r1 != 0) goto L5b
                r0 = r0 & 2
                if (r0 == 0) goto L19
                r0 = 1
                goto L1a
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L5b
                androidx.recyclerview.widget.RecyclerView$j r0 = r4.f2142b2
                if (r0 == 0) goto L45
                java.util.List r1 = r6.m1570d()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.C0477k) r0
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L3f
                boolean r0 = r0.f2501g
                if (r0 == 0) goto L39
                boolean r0 = r6.m1573g()
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = 0
                goto L3a
            L39:
                r0 = 1
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = 0
                goto L40
            L3f:
                r0 = 1
            L40:
                if (r0 == 0) goto L43
                goto L45
            L43:
                r0 = 0
                goto L46
            L45:
                r0 = 1
            L46:
                if (r0 == 0) goto L49
                goto L5b
            L49:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r5.f2240b
                if (r0 != 0) goto L54
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.f2240b = r0
            L54:
                r6.f2190n = r5
                r6.f2191o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r5.f2240b
                goto L8c
            L5b:
                boolean r0 = r6.m1573g()
                if (r0 == 0) goto L86
                boolean r0 = r6.m1575i()
                if (r0 != 0) goto L86
                androidx.recyclerview.widget.RecyclerView$e r0 = r4.f2112D1
                boolean r0 = r0.f2198b
                if (r0 == 0) goto L6e
                goto L86
            L6e:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r0.<init>(r1)
                java.lang.String r1 = r4.m1565y()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L86:
                r6.f2190n = r5
                r6.f2191o = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r5.f2239a
            L8c:
                r0.add(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0450s.m1668i(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:254:0x041f, code lost:
        
            if (r9.m1573g() == false) goto L252;
         */
        /* JADX WARN: Code restructure failed: missing block: B:263:0x0450, code lost:
        
            if ((r7 == 0 || r7 + r10 < r19) == false) goto L252;
         */
        /* JADX WARN: Removed duplicated region for block: B:186:0x030b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x03d8  */
        /* JADX WARN: Removed duplicated region for block: B:223:0x03dd  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x03da  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x051c  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x053a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:243:0x0521  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0410  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x0439  */
        /* JADX WARN: Removed duplicated region for block: B:267:0x0461  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x0481  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x0494  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x04b2  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x04cc  */
        /* JADX WARN: Removed duplicated region for block: B:303:0x0510  */
        /* JADX WARN: Removed duplicated region for block: B:306:0x050b  */
        /* JADX WARN: Removed duplicated region for block: B:316:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.recyclerview.widget.RecyclerView.AbstractC0432a0 m1669j(int r18, long r19) {
            /*
                Method dump skipped, instructions count: 1394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0450s.m1669j(int, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        /* renamed from: k */
        public final void m1670k(AbstractC0432a0 abstractC0432a0) {
            (abstractC0432a0.f2191o ? this.f2240b : this.f2239a).remove(abstractC0432a0);
            abstractC0432a0.f2190n = null;
            abstractC0432a0.f2191o = false;
            abstractC0432a0.f2186j &= -33;
        }

        /* renamed from: l */
        public final void m1671l() {
            AbstractC0444m abstractC0444m = RecyclerView.this.f2114E1;
            this.f2244f = this.f2243e + (abstractC0444m != null ? abstractC0444m.f2217j : 0);
            ArrayList<AbstractC0432a0> arrayList = this.f2241c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2244f; size--) {
                m1665f(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public interface InterfaceC0451t {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public class C0452u extends AbstractC0438g {
        public C0452u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0438g
        /* renamed from: a */
        public final void mo1594a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m1550i(null);
            recyclerView.f2164t2.f2269f = true;
            recyclerView.m1536T(true);
            if (recyclerView.f2162s.m1731g()) {
                return;
            }
            recyclerView.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0438g
        /* renamed from: b */
        public final void mo1595b(int i7, int i8) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m1550i(null);
            C0464a c0464a = recyclerView.f2162s;
            boolean z6 = false;
            if (i8 < 1) {
                c0464a.getClass();
            } else {
                ArrayList<C0464a.b> arrayList = c0464a.f2339b;
                arrayList.add(c0464a.m1732h(null, 1, i7, i8));
                c0464a.f2343f |= 1;
                z6 = arrayList.size() == 1;
            }
            if (z6) {
                m1672d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0438g
        /* renamed from: c */
        public final void mo1596c(int i7, int i8) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m1550i(null);
            C0464a c0464a = recyclerView.f2162s;
            boolean z6 = false;
            if (i8 < 1) {
                c0464a.getClass();
            } else {
                ArrayList<C0464a.b> arrayList = c0464a.f2339b;
                arrayList.add(c0464a.m1732h(null, 2, i7, i8));
                c0464a.f2343f |= 2;
                z6 = arrayList.size() == 1;
            }
            if (z6) {
                m1672d();
            }
        }

        /* renamed from: d */
        public final void m1672d() {
            boolean z6 = RecyclerView.f2102L2;
            RecyclerView recyclerView = RecyclerView.this;
            if (z6 && recyclerView.f2124J1 && recyclerView.f2122I1) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2837m(recyclerView, recyclerView.f2173z1);
            } else {
                recyclerView.f2131Q1 = true;
                recyclerView.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C0453v extends AbstractC1446a {
        public static final Parcelable.Creator<C0453v> CREATOR = new a();

        /* renamed from: m */
        public Parcelable f2248m;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0453v> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0453v(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0453v[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0453v createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0453v(parcel, classLoader);
            }
        }

        public C0453v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2248m = parcel.readParcelable(classLoader == null ? AbstractC0444m.class.getClassLoader() : classLoader);
        }

        public C0453v(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeParcelable(this.f2248m, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static abstract class AbstractC0454w {

        /* renamed from: b */
        public RecyclerView f2250b;

        /* renamed from: c */
        public AbstractC0444m f2251c;

        /* renamed from: d */
        public boolean f2252d;

        /* renamed from: e */
        public boolean f2253e;

        /* renamed from: f */
        public View f2254f;

        /* renamed from: h */
        public boolean f2256h;

        /* renamed from: a */
        public int f2249a = -1;

        /* renamed from: g */
        public final a f2255g = new a();

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$a */
        public static class a {

            /* renamed from: d */
            public int f2260d = -1;

            /* renamed from: f */
            public boolean f2262f = false;

            /* renamed from: g */
            public int f2263g = 0;

            /* renamed from: a */
            public int f2257a = 0;

            /* renamed from: b */
            public int f2258b = 0;

            /* renamed from: c */
            public int f2259c = Integer.MIN_VALUE;

            /* renamed from: e */
            public Interpolator f2261e = null;

            /* renamed from: a */
            public final void m1677a(RecyclerView recyclerView) {
                int i7 = this.f2260d;
                if (i7 >= 0) {
                    this.f2260d = -1;
                    recyclerView.m1528L(i7);
                    this.f2262f = false;
                    return;
                }
                if (!this.f2262f) {
                    this.f2263g = 0;
                    return;
                }
                Interpolator interpolator = this.f2261e;
                if (interpolator != null && this.f2259c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                int i8 = this.f2259c;
                if (i8 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                recyclerView.f2160q2.m1681b(this.f2257a, this.f2258b, i8, interpolator);
                int i9 = this.f2263g + 1;
                this.f2263g = i9;
                if (i9 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f2262f = false;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$b */
        public interface b {
            /* renamed from: a */
            PointF mo1488a(int i7);
        }

        /* renamed from: a */
        public PointF mo1673a(int i7) {
            Object obj = this.f2251c;
            if (obj instanceof b) {
                return ((b) obj).mo1488a(i7);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public final void m1674b(int i7, int i8) {
            PointF mo1673a;
            RecyclerView recyclerView = this.f2250b;
            if (this.f2249a == -1 || recyclerView == null) {
                m1676d();
            }
            if (this.f2252d && this.f2254f == null && this.f2251c != null && (mo1673a = mo1673a(this.f2249a)) != null) {
                float f7 = mo1673a.x;
                if (f7 != 0.0f || mo1673a.y != 0.0f) {
                    recyclerView.m1541Y((int) Math.signum(f7), (int) Math.signum(mo1673a.y), null);
                }
            }
            this.f2252d = false;
            View view = this.f2254f;
            a aVar = this.f2255g;
            if (view != null) {
                this.f2250b.getClass();
                AbstractC0432a0 m1513I = RecyclerView.m1513I(view);
                if ((m1513I != null ? m1513I.m1569c() : -1) == this.f2249a) {
                    View view2 = this.f2254f;
                    C0455x c0455x = recyclerView.f2164t2;
                    mo1675c(view2, aVar);
                    aVar.m1677a(recyclerView);
                    m1676d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2254f = null;
                }
            }
            if (this.f2253e) {
                C0455x c0455x2 = recyclerView.f2164t2;
                C0481o c0481o = (C0481o) this;
                if (c0481o.f2250b.f2114E1.m1643w() == 0) {
                    c0481o.m1676d();
                } else {
                    int i9 = c0481o.f2486o;
                    int i10 = i9 - i7;
                    if (i9 * i10 <= 0) {
                        i10 = 0;
                    }
                    c0481o.f2486o = i10;
                    int i11 = c0481o.f2487p;
                    int i12 = i11 - i8;
                    if (i11 * i12 <= 0) {
                        i12 = 0;
                    }
                    c0481o.f2487p = i12;
                    if (i10 == 0 && i12 == 0) {
                        PointF mo1673a2 = c0481o.mo1673a(c0481o.f2249a);
                        if (mo1673a2 != null) {
                            if (mo1673a2.x != 0.0f || mo1673a2.y != 0.0f) {
                                float f8 = mo1673a2.y;
                                float sqrt = (float) Math.sqrt((f8 * f8) + (r10 * r10));
                                float f9 = mo1673a2.x / sqrt;
                                mo1673a2.x = f9;
                                float f10 = mo1673a2.y / sqrt;
                                mo1673a2.y = f10;
                                c0481o.f2482k = mo1673a2;
                                c0481o.f2486o = (int) (f9 * 10000.0f);
                                c0481o.f2487p = (int) (f10 * 10000.0f);
                                int mo1786i = c0481o.mo1786i(10000);
                                int i13 = (int) (c0481o.f2486o * 1.2f);
                                int i14 = (int) (c0481o.f2487p * 1.2f);
                                LinearInterpolator linearInterpolator = c0481o.f2480i;
                                aVar.f2257a = i13;
                                aVar.f2258b = i14;
                                aVar.f2259c = (int) (mo1786i * 1.2f);
                                aVar.f2261e = linearInterpolator;
                                aVar.f2262f = true;
                            }
                        }
                        aVar.f2260d = c0481o.f2249a;
                        c0481o.m1676d();
                    }
                }
                boolean z6 = aVar.f2260d >= 0;
                aVar.m1677a(recyclerView);
                if (z6 && this.f2253e) {
                    this.f2252d = true;
                    recyclerView.f2160q2.m1680a();
                }
            }
        }

        /* renamed from: c */
        public abstract void mo1675c(View view, a aVar);

        /* renamed from: d */
        public final void m1676d() {
            if (this.f2253e) {
                this.f2253e = false;
                C0481o c0481o = (C0481o) this;
                c0481o.f2487p = 0;
                c0481o.f2486o = 0;
                c0481o.f2482k = null;
                this.f2250b.f2164t2.f2264a = -1;
                this.f2254f = null;
                this.f2249a = -1;
                this.f2252d = false;
                AbstractC0444m abstractC0444m = this.f2251c;
                if (abstractC0444m.f2212e == this) {
                    abstractC0444m.f2212e = null;
                }
                this.f2251c = null;
                this.f2250b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static class C0455x {

        /* renamed from: a */
        public int f2264a = -1;

        /* renamed from: b */
        public int f2265b = 0;

        /* renamed from: c */
        public int f2266c = 0;

        /* renamed from: d */
        public int f2267d = 1;

        /* renamed from: e */
        public int f2268e = 0;

        /* renamed from: f */
        public boolean f2269f = false;

        /* renamed from: g */
        public boolean f2270g = false;

        /* renamed from: h */
        public boolean f2271h = false;

        /* renamed from: i */
        public boolean f2272i = false;

        /* renamed from: j */
        public boolean f2273j = false;

        /* renamed from: k */
        public boolean f2274k = false;

        /* renamed from: l */
        public int f2275l;

        /* renamed from: m */
        public long f2276m;

        /* renamed from: n */
        public int f2277n;

        /* renamed from: a */
        public final void m1678a(int i7) {
            if ((this.f2267d & i7) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.f2267d));
        }

        /* renamed from: b */
        public final int m1679b() {
            return this.f2270g ? this.f2265b - this.f2266c : this.f2268e;
        }

        public final String toString() {
            return "State{mTargetPosition=" + this.f2264a + ", mData=null, mItemCount=" + this.f2268e + ", mIsMeasuring=" + this.f2272i + ", mPreviousLayoutItemCount=" + this.f2265b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2266c + ", mStructureChanged=" + this.f2269f + ", mInPreLayout=" + this.f2270g + ", mRunSimpleAnimations=" + this.f2273j + ", mRunPredictiveAnimations=" + this.f2274k + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class AbstractC0456y {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public class RunnableC0457z implements Runnable {

        /* renamed from: X */
        public boolean f2278X;

        /* renamed from: Y */
        public boolean f2279Y;

        /* renamed from: c */
        public int f2281c;

        /* renamed from: e */
        public int f2282e;

        /* renamed from: m */
        public OverScroller f2283m;

        /* renamed from: s */
        public Interpolator f2284s;

        public RunnableC0457z() {
            InterpolatorC0434c interpolatorC0434c = RecyclerView.f2105O2;
            this.f2284s = interpolatorC0434c;
            this.f2278X = false;
            this.f2279Y = false;
            this.f2283m = new OverScroller(RecyclerView.this.getContext(), interpolatorC0434c);
        }

        /* renamed from: a */
        public final void m1680a() {
            if (this.f2278X) {
                this.f2279Y = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2837m(recyclerView, this);
        }

        /* renamed from: b */
        public final void m1681b(int i7, int i8, int i9, Interpolator interpolator) {
            int i10;
            RecyclerView recyclerView = RecyclerView.this;
            if (i9 == Integer.MIN_VALUE) {
                int abs = Math.abs(i7);
                int abs2 = Math.abs(i8);
                boolean z6 = abs > abs2;
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i8 * i8) + (i7 * i7));
                int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
                int i11 = width / 2;
                float f7 = width;
                float f8 = i11;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f8) + f8;
                if (sqrt > 0) {
                    i10 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z6) {
                        abs = abs2;
                    }
                    i10 = (int) (((abs / f7) + 1.0f) * 300.0f);
                }
                i9 = Math.min(i10, 2000);
            }
            int i12 = i9;
            if (interpolator == null) {
                interpolator = RecyclerView.f2105O2;
            }
            if (this.f2284s != interpolator) {
                this.f2284s = interpolator;
                this.f2283m = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f2282e = 0;
            this.f2281c = 0;
            recyclerView.setScrollState(2);
            this.f2283m.startScroll(0, 0, i7, i8, i12);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2283m.computeScrollOffset();
            }
            m1680a();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i7;
            int i8;
            int i9;
            int i10;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2114E1 == null) {
                recyclerView.removeCallbacks(this);
                this.f2283m.abortAnimation();
                return;
            }
            this.f2279Y = false;
            this.f2278X = true;
            recyclerView.m1553m();
            OverScroller overScroller = this.f2283m;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i11 = currX - this.f2281c;
                int i12 = currY - this.f2282e;
                this.f2281c = currX;
                this.f2282e = currY;
                int[] iArr = recyclerView.f2117F2;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean m1558r = recyclerView.m1558r(i11, i12, 1, iArr, null);
                int[] iArr2 = recyclerView.f2117F2;
                if (m1558r) {
                    i11 -= iArr2[0];
                    i12 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.m1552l(i11, i12);
                }
                if (recyclerView.f2112D1 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.m1541Y(i11, i12, iArr2);
                    int i13 = iArr2[0];
                    int i14 = iArr2[1];
                    int i15 = i11 - i13;
                    int i16 = i12 - i14;
                    AbstractC0454w abstractC0454w = recyclerView.f2114E1.f2212e;
                    if (abstractC0454w != null && !abstractC0454w.f2252d && abstractC0454w.f2253e) {
                        int m1679b = recyclerView.f2164t2.m1679b();
                        if (m1679b == 0) {
                            abstractC0454w.m1676d();
                        } else {
                            if (abstractC0454w.f2249a >= m1679b) {
                                abstractC0454w.f2249a = m1679b - 1;
                            }
                            abstractC0454w.m1674b(i13, i14);
                        }
                    }
                    i10 = i13;
                    i7 = i15;
                    i8 = i16;
                    i9 = i14;
                } else {
                    i7 = i11;
                    i8 = i12;
                    i9 = 0;
                    i10 = 0;
                }
                if (!recyclerView.f2116F1.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.f2117F2;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i17 = i9;
                recyclerView.m1559s(i10, i9, i7, i8, null, 1, iArr3);
                int i18 = i7 - iArr2[0];
                int i19 = i8 - iArr2[1];
                if (i10 != 0 || i17 != 0) {
                    recyclerView.m1560t(i10, i17);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                AbstractC0454w abstractC0454w2 = recyclerView.f2114E1.f2212e;
                if ((abstractC0454w2 != null && abstractC0454w2.f2252d) || !z6) {
                    m1680a();
                    RunnableC0479m runnableC0479m = recyclerView.f2161r2;
                    if (runnableC0479m != null) {
                        runnableC0479m.m1778a(recyclerView, i10, i17);
                    }
                } else {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        if (i20 < 0) {
                            recyclerView.m1562v();
                            if (recyclerView.f2138X1.isFinished()) {
                                recyclerView.f2138X1.onAbsorb(-i20);
                            }
                        } else if (i20 > 0) {
                            recyclerView.m1563w();
                            if (recyclerView.f2140Z1.isFinished()) {
                                recyclerView.f2140Z1.onAbsorb(i20);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.m1564x();
                            if (recyclerView.f2139Y1.isFinished()) {
                                recyclerView.f2139Y1.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.m1561u();
                            if (recyclerView.f2141a2.isFinished()) {
                                recyclerView.f2141a2.onAbsorb(currVelocity);
                            }
                        }
                        if (i20 != 0 || currVelocity != 0) {
                            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                            C0946x.d.m2835k(recyclerView);
                        }
                    }
                    if (RecyclerView.f2103M2) {
                        RunnableC0479m.b bVar = recyclerView.f2163s2;
                        int[] iArr4 = bVar.f2464c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.f2465d = 0;
                    }
                }
            }
            AbstractC0454w abstractC0454w3 = recyclerView.f2114E1.f2212e;
            if (abstractC0454w3 != null && abstractC0454w3.f2252d) {
                abstractC0454w3.m1674b(0, 0);
            }
            this.f2278X = false;
            if (!this.f2279Y) {
                recyclerView.setScrollState(0);
                recyclerView.m1546d0(1);
            } else {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                C0946x.d.m2837m(recyclerView, this);
            }
        }
    }

    static {
        f2101K2 = Build.VERSION.SDK_INT >= 23;
        f2102L2 = true;
        f2103M2 = true;
        Class<?> cls = Integer.TYPE;
        f2104N2 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2105O2 = new InterpolatorC0434c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:42)(10:80|(1:82)|44|45|46|(1:48)(1:64)|49|50|51|52)|45|46|(0)(0)|49|50|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x027f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0281, code lost:
    
        r0 = r3.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0287, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0297, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0298, code lost:
    
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02b8, code lost:
    
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024d A[Catch: ClassCastException -> 0x02b9, IllegalAccessException -> 0x02d8, InstantiationException -> 0x02f7, InvocationTargetException -> 0x0314, ClassNotFoundException -> 0x0331, TryCatch #4 {ClassCastException -> 0x02b9, ClassNotFoundException -> 0x0331, IllegalAccessException -> 0x02d8, InstantiationException -> 0x02f7, InvocationTargetException -> 0x0314, blocks: (B:46:0x0247, B:48:0x024d, B:49:0x025a, B:51:0x0264, B:52:0x0289, B:57:0x0281, B:61:0x0298, B:62:0x02b8, B:64:0x0256), top: B:45:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0256 A[Catch: ClassCastException -> 0x02b9, IllegalAccessException -> 0x02d8, InstantiationException -> 0x02f7, InvocationTargetException -> 0x0314, ClassNotFoundException -> 0x0331, TryCatch #4 {ClassCastException -> 0x02b9, ClassNotFoundException -> 0x0331, IllegalAccessException -> 0x02d8, InstantiationException -> 0x02f7, InvocationTargetException -> 0x0314, blocks: (B:46:0x0247, B:48:0x024d, B:49:0x025a, B:51:0x0264, B:52:0x0289, B:57:0x0281, B:61:0x0298, B:62:0x02b8, B:64:0x0256), top: B:45:0x0247 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: D */
    public static RecyclerView m1512D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView m1512D = m1512D(viewGroup.getChildAt(i7));
            if (m1512D != null) {
                return m1512D;
            }
        }
        return null;
    }

    /* renamed from: I */
    public static AbstractC0432a0 m1513I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0445n) view.getLayoutParams()).f2229a;
    }

    private C0930l getScrollingChildHelper() {
        if (this.f2111C2 == null) {
            this.f2111C2 = new C0930l(this);
        }
        return this.f2111C2;
    }

    /* renamed from: j */
    public static void m1518j(AbstractC0432a0 abstractC0432a0) {
        WeakReference<RecyclerView> weakReference = abstractC0432a0.f2178b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == abstractC0432a0.f2177a) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                abstractC0432a0.f2178b = null;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m1519A(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1519A(android.view.View):android.view.View");
    }

    /* renamed from: B */
    public final boolean m1520B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<InterfaceC0447p> arrayList = this.f2118G1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC0447p interfaceC0447p = arrayList.get(i7);
            if (interfaceC0447p.mo1655b(motionEvent) && action != 3) {
                this.f2120H1 = interfaceC0447p;
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m1521C(int[] iArr) {
        int m1744e = this.f2167w1.m1744e();
        if (m1744e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < m1744e; i9++) {
            AbstractC0432a0 m1513I = m1513I(this.f2167w1.m1743d(i9));
            if (!m1513I.m1581o()) {
                int m1569c = m1513I.m1569c();
                if (m1569c < i7) {
                    i7 = m1569c;
                }
                if (m1569c > i8) {
                    i8 = m1569c;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
    }

    /* renamed from: E */
    public final AbstractC0432a0 m1522E(int i7) {
        AbstractC0432a0 abstractC0432a0 = null;
        if (this.f2133S1) {
            return null;
        }
        int m1747h = this.f2167w1.m1747h();
        for (int i8 = 0; i8 < m1747h; i8++) {
            AbstractC0432a0 m1513I = m1513I(this.f2167w1.m1746g(i8));
            if (m1513I != null && !m1513I.m1575i() && m1523F(m1513I) == i7) {
                if (!this.f2167w1.m1749j(m1513I.f2177a)) {
                    return m1513I;
                }
                abstractC0432a0 = m1513I;
            }
        }
        return abstractC0432a0;
    }

    /* renamed from: F */
    public final int m1523F(AbstractC0432a0 abstractC0432a0) {
        if (!((abstractC0432a0.f2186j & 524) != 0) && abstractC0432a0.m1572f()) {
            C0464a c0464a = this.f2162s;
            int i7 = abstractC0432a0.f2179c;
            ArrayList<C0464a.b> arrayList = c0464a.f2339b;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0464a.b bVar = arrayList.get(i8);
                int i9 = bVar.f2344a;
                if (i9 != 1) {
                    if (i9 == 2) {
                        int i10 = bVar.f2345b;
                        if (i10 <= i7) {
                            int i11 = bVar.f2347d;
                            if (i10 + i11 <= i7) {
                                i7 -= i11;
                            }
                        } else {
                            continue;
                        }
                    } else if (i9 == 8) {
                        int i12 = bVar.f2345b;
                        if (i12 == i7) {
                            i7 = bVar.f2347d;
                        } else {
                            if (i12 < i7) {
                                i7--;
                            }
                            if (bVar.f2347d <= i7) {
                                i7++;
                            }
                        }
                    }
                } else if (bVar.f2345b <= i7) {
                    i7 += bVar.f2347d;
                }
            }
            return i7;
        }
        return -1;
    }

    /* renamed from: G */
    public final long m1524G(AbstractC0432a0 abstractC0432a0) {
        return this.f2112D1.f2198b ? abstractC0432a0.f2181e : abstractC0432a0.f2179c;
    }

    /* renamed from: H */
    public final AbstractC0432a0 m1525H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1513I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: J */
    public final Rect m1526J(View view) {
        C0445n c0445n = (C0445n) view.getLayoutParams();
        boolean z6 = c0445n.f2231c;
        Rect rect = c0445n.f2230b;
        if (!z6) {
            return rect;
        }
        if (this.f2164t2.f2270g && (c0445n.m1652b() || c0445n.f2229a.m1573g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<AbstractC0443l> arrayList = this.f2116F1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Rect rect2 = this.f2106A1;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i7).getClass();
            ((C0445n) view.getLayoutParams()).m1651a();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0445n.f2231c = false;
        return rect;
    }

    /* renamed from: K */
    public final boolean m1527K() {
        return this.f2135U1 > 0;
    }

    /* renamed from: L */
    public final void m1528L(int i7) {
        if (this.f2114E1 == null) {
            return;
        }
        setScrollState(2);
        this.f2114E1.mo1503o0(i7);
        awakenScrollBars();
    }

    /* renamed from: M */
    public final void m1529M() {
        int m1747h = this.f2167w1.m1747h();
        for (int i7 = 0; i7 < m1747h; i7++) {
            ((C0445n) this.f2167w1.m1746g(i7).getLayoutParams()).f2231c = true;
        }
        ArrayList<AbstractC0432a0> arrayList = this.f2146e.f2241c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0445n c0445n = (C0445n) arrayList.get(i8).f2177a.getLayoutParams();
            if (c0445n != null) {
                c0445n.f2231c = true;
            }
        }
    }

    /* renamed from: N */
    public final void m1530N(int i7, int i8, boolean z6) {
        int i9 = i7 + i8;
        int m1747h = this.f2167w1.m1747h();
        for (int i10 = 0; i10 < m1747h; i10++) {
            AbstractC0432a0 m1513I = m1513I(this.f2167w1.m1746g(i10));
            if (m1513I != null && !m1513I.m1581o()) {
                int i11 = m1513I.f2179c;
                if (i11 >= i9) {
                    m1513I.m1578l(-i8, z6);
                } else if (i11 >= i7) {
                    m1513I.m1568b(8);
                    m1513I.m1578l(-i8, z6);
                    m1513I.f2179c = i7 - 1;
                }
                this.f2164t2.f2269f = true;
            }
        }
        C0450s c0450s = this.f2146e;
        ArrayList<AbstractC0432a0> arrayList = c0450s.f2241c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            AbstractC0432a0 abstractC0432a0 = arrayList.get(size);
            if (abstractC0432a0 != null) {
                int i12 = abstractC0432a0.f2179c;
                if (i12 >= i9) {
                    abstractC0432a0.m1578l(-i8, z6);
                } else if (i12 >= i7) {
                    abstractC0432a0.m1568b(8);
                    c0450s.m1665f(size);
                }
            }
        }
    }

    /* renamed from: O */
    public final void m1531O() {
        this.f2135U1++;
    }

    /* renamed from: P */
    public final void m1532P(boolean z6) {
        int i7;
        int i8 = this.f2135U1 - 1;
        this.f2135U1 = i8;
        if (i8 < 1) {
            this.f2135U1 = 0;
            if (z6) {
                int i9 = this.f2130P1;
                this.f2130P1 = 0;
                if (i9 != 0) {
                    AccessibilityManager accessibilityManager = this.f2132R1;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        C1146b.m3332b(obtain, i9);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.f2119G2;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0432a0 abstractC0432a0 = (AbstractC0432a0) arrayList.get(size);
                    if (abstractC0432a0.f2177a.getParent() == this && !abstractC0432a0.m1581o() && (i7 = abstractC0432a0.f2193q) != -1) {
                        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                        C0946x.d.m2843s(abstractC0432a0.f2177a, i7);
                        abstractC0432a0.f2193q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: Q */
    public final void m1533Q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2145d2) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f2145d2 = motionEvent.getPointerId(i7);
            int x7 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f2150h2 = x7;
            this.f2148f2 = x7;
            int y7 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f2151i2 = y7;
            this.f2149g2 = y7;
        }
    }

    /* renamed from: R */
    public final void m1534R() {
        if (this.f2174z2 || !this.f2122I1) {
            return;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2837m(this, this.f2121H2);
        this.f2174z2 = true;
    }

    /* renamed from: S */
    public final void m1535S() {
        boolean z6;
        boolean z7 = false;
        if (this.f2133S1) {
            C0464a c0464a = this.f2162s;
            c0464a.m1736l(c0464a.f2339b);
            c0464a.m1736l(c0464a.f2340c);
            c0464a.f2343f = 0;
            if (this.f2134T1) {
                this.f2114E1.mo1435Y();
            }
        }
        if (this.f2142b2 != null && this.f2114E1.mo1426A0()) {
            this.f2162s.m1734j();
        } else {
            this.f2162s.m1727c();
        }
        boolean z8 = this.f2168w2 || this.f2170x2;
        boolean z9 = this.f2125K1 && this.f2142b2 != null && ((z6 = this.f2133S1) || z8 || this.f2114E1.f2213f) && (!z6 || this.f2112D1.f2198b);
        C0455x c0455x = this.f2164t2;
        c0455x.f2273j = z9;
        if (z9 && z8 && !this.f2133S1) {
            if (this.f2142b2 != null && this.f2114E1.mo1426A0()) {
                z7 = true;
            }
        }
        c0455x.f2274k = z7;
    }

    /* renamed from: T */
    public final void m1536T(boolean z6) {
        this.f2134T1 = z6 | this.f2134T1;
        this.f2133S1 = true;
        int m1747h = this.f2167w1.m1747h();
        for (int i7 = 0; i7 < m1747h; i7++) {
            AbstractC0432a0 m1513I = m1513I(this.f2167w1.m1746g(i7));
            if (m1513I != null && !m1513I.m1581o()) {
                m1513I.m1568b(6);
            }
        }
        m1529M();
        C0450s c0450s = this.f2146e;
        ArrayList<AbstractC0432a0> arrayList = c0450s.f2241c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC0432a0 abstractC0432a0 = arrayList.get(i8);
            if (abstractC0432a0 != null) {
                abstractC0432a0.m1568b(6);
                abstractC0432a0.m1567a(null);
            }
        }
        AbstractC0436e abstractC0436e = RecyclerView.this.f2112D1;
        if (abstractC0436e == null || !abstractC0436e.f2198b) {
            c0450s.m1664e();
        }
    }

    /* renamed from: U */
    public final void m1537U(AbstractC0432a0 abstractC0432a0, AbstractC0441j.c cVar) {
        int i7 = (abstractC0432a0.f2186j & (-8193)) | 0;
        abstractC0432a0.f2186j = i7;
        boolean z6 = this.f2164t2.f2271h;
        C0469c0 c0469c0 = this.f2169x1;
        if (z6) {
            if (((i7 & 2) != 0) && !abstractC0432a0.m1575i() && !abstractC0432a0.m1581o()) {
                c0469c0.f2367b.m3859g(m1524G(abstractC0432a0), abstractC0432a0);
            }
        }
        C1481o<AbstractC0432a0, C0469c0.a> c1481o = c0469c0.f2366a;
        C0469c0.a aVar = c1481o.get(abstractC0432a0);
        if (aVar == null) {
            aVar = C0469c0.a.m1765a();
            c1481o.put(abstractC0432a0, aVar);
        }
        aVar.f2370b = cVar;
        aVar.f2369a |= 4;
    }

    /* renamed from: V */
    public final void m1538V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2106A1;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0445n) {
            C0445n c0445n = (C0445n) layoutParams;
            if (!c0445n.f2231c) {
                int i7 = rect.left;
                Rect rect2 = c0445n.f2230b;
                rect.left = i7 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2114E1.mo1634l0(this, view, this.f2106A1, !this.f2125K1, view2 == null);
    }

    /* renamed from: W */
    public final void m1539W() {
        VelocityTracker velocityTracker = this.f2147e2;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z6 = false;
        m1546d0(0);
        EdgeEffect edgeEffect = this.f2138X1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z6 = this.f2138X1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2139Y1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z6 |= this.f2139Y1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2140Z1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z6 |= this.f2140Z1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2141a2;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z6 |= this.f2141a2.isFinished();
        }
        if (z6) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1540X(int r22, int r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1540X(int, int, android.view.MotionEvent):boolean");
    }

    /* renamed from: Y */
    public final void m1541Y(int i7, int i8, int[] iArr) {
        AbstractC0432a0 abstractC0432a0;
        m1544b0();
        m1531O();
        int i9 = C0013l.f12a;
        C0013l.a.m60a("RV Scroll");
        C0455x c0455x = this.f2164t2;
        m1566z(c0455x);
        C0450s c0450s = this.f2146e;
        int mo1452n0 = i7 != 0 ? this.f2114E1.mo1452n0(i7, c0450s, c0455x) : 0;
        int mo1456p0 = i8 != 0 ? this.f2114E1.mo1456p0(i8, c0450s, c0455x) : 0;
        C0013l.a.m61b();
        int m1744e = this.f2167w1.m1744e();
        for (int i10 = 0; i10 < m1744e; i10++) {
            View m1743d = this.f2167w1.m1743d(i10);
            AbstractC0432a0 m1525H = m1525H(m1743d);
            if (m1525H != null && (abstractC0432a0 = m1525H.f2185i) != null) {
                int left = m1743d.getLeft();
                int top = m1743d.getTop();
                View view = abstractC0432a0.f2177a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1532P(true);
        m1545c0(false);
        if (iArr != null) {
            iArr[0] = mo1452n0;
            iArr[1] = mo1456p0;
        }
    }

    /* renamed from: Z */
    public final void m1542Z(int i7) {
        AbstractC0454w abstractC0454w;
        if (this.f2128N1) {
            return;
        }
        setScrollState(0);
        RunnableC0457z runnableC0457z = this.f2160q2;
        RecyclerView.this.removeCallbacks(runnableC0457z);
        runnableC0457z.f2283m.abortAnimation();
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null && (abstractC0454w = abstractC0444m.f2212e) != null) {
            abstractC0454w.m1676d();
        }
        AbstractC0444m abstractC0444m2 = this.f2114E1;
        if (abstractC0444m2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0444m2.mo1503o0(i7);
            awakenScrollBars();
        }
    }

    /* renamed from: a0 */
    public final void m1543a0(int i7, int i8, boolean z6) {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2128N1) {
            return;
        }
        if (!abstractC0444m.mo1493e()) {
            i7 = 0;
        }
        if (!this.f2114E1.mo1496f()) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        if (z6) {
            int i9 = i7 != 0 ? 1 : 0;
            if (i8 != 0) {
                i9 |= 2;
            }
            getScrollingChildHelper().m2733g(i9, 1);
        }
        this.f2160q2.m1681b(i7, i8, Integer.MIN_VALUE, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i7, int i8) {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null) {
            abstractC0444m.getClass();
        }
        super.addFocusables(arrayList, i7, i8);
    }

    /* renamed from: b0 */
    public final void m1544b0() {
        int i7 = this.f2126L1 + 1;
        this.f2126L1 = i7;
        if (i7 != 1 || this.f2128N1) {
            return;
        }
        this.f2127M1 = false;
    }

    /* renamed from: c0 */
    public final void m1545c0(boolean z6) {
        if (this.f2126L1 < 1) {
            this.f2126L1 = 1;
        }
        if (!z6 && !this.f2128N1) {
            this.f2127M1 = false;
        }
        if (this.f2126L1 == 1) {
            if (z6 && this.f2127M1 && !this.f2128N1 && this.f2114E1 != null && this.f2112D1 != null) {
                m1555o();
            }
            if (!this.f2128N1) {
                this.f2127M1 = false;
            }
        }
        this.f2126L1--;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0445n) && this.f2114E1.mo1442g((C0445n) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null && abstractC0444m.mo1493e()) {
            return this.f2114E1.mo1501k(this.f2164t2);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null && abstractC0444m.mo1493e()) {
            return this.f2114E1.mo1448l(this.f2164t2);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null && abstractC0444m.mo1493e()) {
            return this.f2114E1.mo1450m(this.f2164t2);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null && abstractC0444m.mo1496f()) {
            return this.f2114E1.mo1502n(this.f2164t2);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null && abstractC0444m.mo1496f()) {
            return this.f2114E1.mo1454o(this.f2164t2);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null && abstractC0444m.mo1496f()) {
            return this.f2114E1.mo1455p(this.f2164t2);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void m1546d0(int i7) {
        getScrollingChildHelper().m2734h(i7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return getScrollingChildHelper().m2727a(f7, f8, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return getScrollingChildHelper().m2728b(f7, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2729c(i7, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().m2731e(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z6;
        float f7;
        float f8;
        super.draw(canvas);
        ArrayList<AbstractC0443l> arrayList = this.f2116F1;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).mo1606e(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2138X1;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2171y1 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2138X1;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2139Y1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2171y1) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2139Y1;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2140Z1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2171y1 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2140Z1;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2141a2;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2171y1) {
                f7 = getPaddingRight() + (-getWidth());
                f8 = getPaddingBottom() + (-getHeight());
            } else {
                f7 = -getWidth();
                f8 = -getHeight();
            }
            canvas.translate(f7, f8);
            EdgeEffect edgeEffect8 = this.f2141a2;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z6 |= z7;
            canvas.restoreToCount(save4);
        }
        if ((z6 || this.f2142b2 == null || arrayList.size() <= 0 || !this.f2142b2.mo1602f()) ? z6 : true) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    /* renamed from: f */
    public final void m1547f(AbstractC0432a0 abstractC0432a0) {
        View view = abstractC0432a0.f2177a;
        boolean z6 = view.getParent() == this;
        this.f2146e.m1670k(m1525H(view));
        if (abstractC0432a0.m1577k()) {
            this.f2167w1.m1741b(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0466b c0466b = this.f2167w1;
        if (!z6) {
            c0466b.m1740a(view, -1, true);
            return;
        }
        int indexOfChild = ((C0488v) c0466b.f2352a).f2495a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0466b.f2353b.m1758h(indexOfChild);
            c0466b.m1748i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018f, code lost:
    
        if ((r3 * r1) > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0159, code lost:
    
        if (r4 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0177, code lost:
    
        if (r3 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017a, code lost:
    
        if (r4 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017d, code lost:
    
        if (r3 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0186, code lost:
    
        if ((r3 * r1) < 0) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public final void m1548g(AbstractC0443l abstractC0443l) {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null) {
            abstractC0444m.mo1491c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<AbstractC0443l> arrayList = this.f2116F1;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0443l);
        m1529M();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null) {
            return abstractC0444m.mo1457s();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1565y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null) {
            return abstractC0444m.mo1459t(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1565y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null) {
            return abstractC0444m.mo1460u(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1565y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0436e getAdapter() {
        return this.f2112D1;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m == null) {
            return super.getBaseline();
        }
        abstractC0444m.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        return super.getChildDrawingOrder(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2171y1;
    }

    public C0490x getCompatAccessibilityDelegate() {
        return this.f2107A2;
    }

    public C0440i getEdgeEffectFactory() {
        return this.f2137W1;
    }

    public AbstractC0441j getItemAnimator() {
        return this.f2142b2;
    }

    public int getItemDecorationCount() {
        return this.f2116F1.size();
    }

    public AbstractC0444m getLayoutManager() {
        return this.f2114E1;
    }

    public int getMaxFlingVelocity() {
        return this.f2156m2;
    }

    public int getMinFlingVelocity() {
        return this.f2154l2;
    }

    public long getNanoTime() {
        if (f2103M2) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0446o getOnFlingListener() {
        return this.f2153k2;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2159p2;
    }

    public C0449r getRecycledViewPool() {
        return this.f2146e.m1662c();
    }

    public int getScrollState() {
        return this.f2144c2;
    }

    /* renamed from: h */
    public final void m1549h(AbstractC0448q abstractC0448q) {
        if (this.f2166v2 == null) {
            this.f2166v2 = new ArrayList();
        }
        this.f2166v2.add(abstractC0448q);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2732f(0) != null;
    }

    /* renamed from: i */
    public final void m1550i(String str) {
        if (m1527K()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1565y());
        }
        if (this.f2136V1 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m1565y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2122I1;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2128N1;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f4805d;
    }

    /* renamed from: k */
    public final void m1551k() {
        int m1747h = this.f2167w1.m1747h();
        for (int i7 = 0; i7 < m1747h; i7++) {
            AbstractC0432a0 m1513I = m1513I(this.f2167w1.m1746g(i7));
            if (!m1513I.m1581o()) {
                m1513I.f2180d = -1;
                m1513I.f2183g = -1;
            }
        }
        C0450s c0450s = this.f2146e;
        ArrayList<AbstractC0432a0> arrayList = c0450s.f2241c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC0432a0 abstractC0432a0 = arrayList.get(i8);
            abstractC0432a0.f2180d = -1;
            abstractC0432a0.f2183g = -1;
        }
        ArrayList<AbstractC0432a0> arrayList2 = c0450s.f2239a;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            AbstractC0432a0 abstractC0432a02 = arrayList2.get(i9);
            abstractC0432a02.f2180d = -1;
            abstractC0432a02.f2183g = -1;
        }
        ArrayList<AbstractC0432a0> arrayList3 = c0450s.f2240b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                AbstractC0432a0 abstractC0432a03 = c0450s.f2240b.get(i10);
                abstractC0432a03.f2180d = -1;
                abstractC0432a03.f2183g = -1;
            }
        }
    }

    /* renamed from: l */
    public final void m1552l(int i7, int i8) {
        boolean z6;
        EdgeEffect edgeEffect = this.f2138X1;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            z6 = false;
        } else {
            this.f2138X1.onRelease();
            z6 = this.f2138X1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2140Z1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f2140Z1.onRelease();
            z6 |= this.f2140Z1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2139Y1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f2139Y1.onRelease();
            z6 |= this.f2139Y1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2141a2;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f2141a2.onRelease();
            z6 |= this.f2141a2.isFinished();
        }
        if (z6) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    /* renamed from: m */
    public final void m1553m() {
        if (!this.f2125K1 || this.f2133S1) {
            int i7 = C0013l.f12a;
            C0013l.a.m60a("RV FullInvalidate");
            m1555o();
            C0013l.a.m61b();
            return;
        }
        if (this.f2162s.m1731g()) {
            C0464a c0464a = this.f2162s;
            int i8 = c0464a.f2343f;
            boolean z6 = false;
            if ((4 & i8) != 0) {
                if (!((i8 & 11) != 0)) {
                    int i9 = C0013l.f12a;
                    C0013l.a.m60a("RV PartialInvalidate");
                    m1544b0();
                    m1531O();
                    this.f2162s.m1734j();
                    if (!this.f2127M1) {
                        int m1744e = this.f2167w1.m1744e();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= m1744e) {
                                break;
                            }
                            AbstractC0432a0 m1513I = m1513I(this.f2167w1.m1743d(i10));
                            if (m1513I != null && !m1513I.m1581o()) {
                                if ((m1513I.f2186j & 2) != 0) {
                                    z6 = true;
                                    break;
                                }
                            }
                            i10++;
                        }
                        if (z6) {
                            m1555o();
                        } else {
                            this.f2162s.m1726b();
                        }
                    }
                    m1545c0(true);
                    m1532P(true);
                    C0013l.a.m61b();
                }
            }
            if (c0464a.m1731g()) {
                int i11 = C0013l.f12a;
                C0013l.a.m60a("RV FullInvalidate");
                m1555o();
                C0013l.a.m61b();
            }
        }
    }

    /* renamed from: n */
    public final void m1554n(int i7, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        setMeasuredDimension(AbstractC0444m.m1613h(i7, paddingRight, C0946x.d.m2829e(this)), AbstractC0444m.m1613h(i8, getPaddingBottom() + getPaddingTop(), C0946x.d.m2828d(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x022c, code lost:
    
        if (r14.f2142b2.mo1598a(r9, r9, r5, r8) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0255, code lost:
    
        r14.m1534R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0253, code lost:
    
        if (r5 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03b2, code lost:
    
        if (r18.f2167w1.m1749j(getFocusedChild()) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0409, code lost:
    
        if (r6.hasFocusable() != false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0416  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1555o() {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1555o():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2135U1 = r0
            r1 = 1
            r5.f2122I1 = r1
            boolean r2 = r5.f2125K1
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r5.f2125K1 = r2
            androidx.recyclerview.widget.RecyclerView$m r2 = r5.f2114E1
            if (r2 == 0) goto L1e
            r2.f2214g = r1
        L1e:
            r5.f2174z2 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f2103M2
            if (r0 == 0) goto L65
            java.lang.ThreadLocal<androidx.recyclerview.widget.m> r0 = androidx.recyclerview.widget.RunnableC0479m.f2456X
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.m r1 = (androidx.recyclerview.widget.RunnableC0479m) r1
            r5.f2161r2 = r1
            if (r1 != 0) goto L5e
            androidx.recyclerview.widget.m r1 = new androidx.recyclerview.widget.m
            r1.<init>()
            r5.f2161r2 = r1
            java.util.WeakHashMap<android.view.View, e0.h0> r1 = p034e0.C0946x.f4876a
            android.view.Display r1 = p034e0.C0946x.e.m2845b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L50
            if (r1 == 0) goto L50
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L50
            goto L52
        L50:
            r1 = 1114636288(0x42700000, float:60.0)
        L52:
            androidx.recyclerview.widget.m r2 = r5.f2161r2
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f2460m = r3
            r0.set(r2)
        L5e:
            androidx.recyclerview.widget.m r0 = r5.f2161r2
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r0.f2458c
            r0.add(r5)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC0479m runnableC0479m;
        AbstractC0454w abstractC0454w;
        super.onDetachedFromWindow();
        AbstractC0441j abstractC0441j = this.f2142b2;
        if (abstractC0441j != null) {
            abstractC0441j.mo1601e();
        }
        setScrollState(0);
        RunnableC0457z runnableC0457z = this.f2160q2;
        RecyclerView.this.removeCallbacks(runnableC0457z);
        runnableC0457z.f2283m.abortAnimation();
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m != null && (abstractC0454w = abstractC0444m.f2212e) != null) {
            abstractC0454w.m1676d();
        }
        this.f2122I1 = false;
        AbstractC0444m abstractC0444m2 = this.f2114E1;
        if (abstractC0444m2 != null) {
            abstractC0444m2.f2214g = false;
            abstractC0444m2.mo1480S(this);
        }
        this.f2119G2.clear();
        removeCallbacks(this.f2121H2);
        this.f2169x1.getClass();
        while (C0469c0.a.f2368d.mo2564a() != null) {
        }
        if (!f2103M2 || (runnableC0479m = this.f2161r2) == null) {
            return;
        }
        runnableC0479m.f2458c.remove(this);
        this.f2161r2 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<AbstractC0443l> arrayList = this.f2116F1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).mo1605d(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r5.f2114E1
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f2128N1
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$m r0 = r5.f2114E1
            boolean r0 = r0.mo1496f()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.f2114E1
            boolean r3 = r3.mo1493e()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.f2114E1
            boolean r3 = r3.mo1496f()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.f2114E1
            boolean r3 = r3.mo1493e()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.f2157n2
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f2158o2
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m1540X(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        if (this.f2128N1) {
            return false;
        }
        this.f2120H1 = null;
        if (m1520B(motionEvent)) {
            m1539W();
            setScrollState(0);
            return true;
        }
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m == null) {
            return false;
        }
        boolean mo1493e = abstractC0444m.mo1493e();
        boolean mo1496f = this.f2114E1.mo1496f();
        if (this.f2147e2 == null) {
            this.f2147e2 = VelocityTracker.obtain();
        }
        this.f2147e2.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2129O1) {
                this.f2129O1 = false;
            }
            this.f2145d2 = motionEvent.getPointerId(0);
            int x7 = (int) (motionEvent.getX() + 0.5f);
            this.f2150h2 = x7;
            this.f2148f2 = x7;
            int y7 = (int) (motionEvent.getY() + 0.5f);
            this.f2151i2 = y7;
            this.f2149g2 = y7;
            if (this.f2144c2 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m1546d0(1);
            }
            int[] iArr = this.f2115E2;
            iArr[1] = 0;
            iArr[0] = 0;
            int i7 = mo1493e;
            if (mo1496f) {
                i7 = (mo1493e ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m2733g(i7, 0);
        } else if (actionMasked == 1) {
            this.f2147e2.clear();
            m1546d0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2145d2);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2145d2 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x8 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y8 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2144c2 != 1) {
                int i8 = x8 - this.f2148f2;
                int i9 = y8 - this.f2149g2;
                if (mo1493e == 0 || Math.abs(i8) <= this.f2152j2) {
                    z6 = false;
                } else {
                    this.f2150h2 = x8;
                    z6 = true;
                }
                if (mo1496f && Math.abs(i9) > this.f2152j2) {
                    this.f2151i2 = y8;
                    z6 = true;
                }
                if (z6) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m1539W();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2145d2 = motionEvent.getPointerId(actionIndex);
            int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2150h2 = x9;
            this.f2148f2 = x9;
            int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2151i2 = y9;
            this.f2149g2 = y9;
        } else if (actionMasked == 6) {
            m1533Q(motionEvent);
        }
        return this.f2144c2 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11 = C0013l.f12a;
        C0013l.a.m60a("RV OnLayout");
        m1555o();
        C0013l.a.m61b();
        this.f2125K1 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m == null) {
            m1554n(i7, i8);
            return;
        }
        boolean mo1475N = abstractC0444m.mo1475N();
        boolean z6 = false;
        C0455x c0455x = this.f2164t2;
        if (mo1475N) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f2114E1.f2209b.m1554n(i7, i8);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            if (z6 || this.f2112D1 == null) {
                return;
            }
            if (c0455x.f2267d == 1) {
                m1556p();
            }
            this.f2114E1.m1638r0(i7, i8);
            c0455x.f2272i = true;
            m1557q();
            this.f2114E1.m1639t0(i7, i8);
            if (this.f2114E1.mo1505w0()) {
                this.f2114E1.m1638r0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c0455x.f2272i = true;
                m1557q();
                this.f2114E1.m1639t0(i7, i8);
                return;
            }
            return;
        }
        if (this.f2124J1) {
            this.f2114E1.f2209b.m1554n(i7, i8);
            return;
        }
        if (this.f2131Q1) {
            m1544b0();
            m1531O();
            m1535S();
            m1532P(true);
            if (c0455x.f2274k) {
                c0455x.f2270g = true;
            } else {
                this.f2162s.m1727c();
                c0455x.f2270g = false;
            }
            this.f2131Q1 = false;
            m1545c0(false);
        } else if (c0455x.f2274k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0436e abstractC0436e = this.f2112D1;
        if (abstractC0436e != null) {
            c0455x.f2268e = abstractC0436e.mo1583a();
        } else {
            c0455x.f2268e = 0;
        }
        m1544b0();
        this.f2114E1.f2209b.m1554n(i7, i8);
        m1545c0(false);
        c0455x.f2270g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (m1527K()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0453v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0453v c0453v = (C0453v) parcelable;
        this.f2155m = c0453v;
        super.onRestoreInstanceState(c0453v.f6946c);
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m == null || (parcelable2 = this.f2155m.f2248m) == null) {
            return;
        }
        abstractC0444m.mo1494e0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0453v c0453v = new C0453v(super.onSaveInstanceState());
        C0453v c0453v2 = this.f2155m;
        if (c0453v2 != null) {
            c0453v.f2248m = c0453v2.f2248m;
        } else {
            AbstractC0444m abstractC0444m = this.f2114E1;
            c0453v.f2248m = abstractC0444m != null ? abstractC0444m.mo1497f0() : null;
        }
        return c0453v;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        this.f2141a2 = null;
        this.f2139Y1 = null;
        this.f2140Z1 = null;
        this.f2138X1 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x038d, code lost:
    
        if (r8 != false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0314, code lost:
    
        if (r0 < r8) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:? A[LOOP:4: B:112:0x007a->B:121:?, LOOP_END, SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1556p() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1556p():void");
    }

    /* renamed from: q */
    public final void m1557q() {
        m1544b0();
        m1531O();
        C0455x c0455x = this.f2164t2;
        c0455x.m1678a(6);
        this.f2162s.m1727c();
        c0455x.f2268e = this.f2112D1.mo1583a();
        c0455x.f2266c = 0;
        c0455x.f2270g = false;
        this.f2114E1.mo1439c0(this.f2146e, c0455x);
        c0455x.f2269f = false;
        this.f2155m = null;
        c0455x.f2273j = c0455x.f2273j && this.f2142b2 != null;
        c0455x.f2267d = 4;
        m1532P(true);
        m1545c0(false);
    }

    /* renamed from: r */
    public final boolean m1558r(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2729c(i7, i8, i9, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z6) {
        AbstractC0432a0 m1513I = m1513I(view);
        if (m1513I != null) {
            if (m1513I.m1577k()) {
                m1513I.f2186j &= -257;
            } else if (!m1513I.m1581o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m1513I + m1565y());
            }
        }
        view.clearAnimation();
        m1513I(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        AbstractC0454w abstractC0454w = this.f2114E1.f2212e;
        boolean z6 = true;
        if (!(abstractC0454w != null && abstractC0454w.f2253e) && !m1527K()) {
            z6 = false;
        }
        if (!z6 && view2 != null) {
            m1538V(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f2114E1.mo1634l0(this, view, rect, z6, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ArrayList<InterfaceC0447p> arrayList = this.f2118G1;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.get(i7).mo1656c();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2126L1 != 0 || this.f2128N1) {
            this.f2127M1 = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m1559s(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().m2731e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
        AbstractC0444m abstractC0444m = this.f2114E1;
        if (abstractC0444m == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2128N1) {
            return;
        }
        boolean mo1493e = abstractC0444m.mo1493e();
        boolean mo1496f = this.f2114E1.mo1496f();
        if (mo1493e || mo1496f) {
            if (!mo1493e) {
                i7 = 0;
            }
            if (!mo1496f) {
                i8 = 0;
            }
            m1540X(i7, i8, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m1527K()) {
            int m3331a = accessibilityEvent != null ? C1146b.m3331a(accessibilityEvent) : 0;
            this.f2130P1 |= m3331a != 0 ? m3331a : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0490x c0490x) {
        this.f2107A2 = c0490x;
        C0946x.m2817r(this, c0490x);
    }

    public void setAdapter(AbstractC0436e abstractC0436e) {
        setLayoutFrozen(false);
        AbstractC0436e abstractC0436e2 = this.f2112D1;
        C0452u c0452u = this.f2143c;
        if (abstractC0436e2 != null) {
            abstractC0436e2.f2197a.unregisterObserver(c0452u);
            this.f2112D1.getClass();
        }
        AbstractC0441j abstractC0441j = this.f2142b2;
        if (abstractC0441j != null) {
            abstractC0441j.mo1601e();
        }
        AbstractC0444m abstractC0444m = this.f2114E1;
        C0450s c0450s = this.f2146e;
        if (abstractC0444m != null) {
            abstractC0444m.m1630h0(c0450s);
            this.f2114E1.m1631i0(c0450s);
        }
        c0450s.f2239a.clear();
        c0450s.m1664e();
        C0464a c0464a = this.f2162s;
        c0464a.m1736l(c0464a.f2339b);
        c0464a.m1736l(c0464a.f2340c);
        c0464a.f2343f = 0;
        AbstractC0436e abstractC0436e3 = this.f2112D1;
        this.f2112D1 = abstractC0436e;
        if (abstractC0436e != null) {
            abstractC0436e.f2197a.registerObserver(c0452u);
        }
        AbstractC0436e abstractC0436e4 = this.f2112D1;
        c0450s.f2239a.clear();
        c0450s.m1664e();
        C0449r m1662c = c0450s.m1662c();
        if (abstractC0436e3 != null) {
            m1662c.f2234b--;
        }
        if (m1662c.f2234b == 0) {
            int i7 = 0;
            while (true) {
                SparseArray<C0449r.a> sparseArray = m1662c.f2233a;
                if (i7 >= sparseArray.size()) {
                    break;
                }
                sparseArray.valueAt(i7).f2235a.clear();
                i7++;
            }
        }
        if (abstractC0436e4 != null) {
            m1662c.f2234b++;
        }
        this.f2164t2.f2269f = true;
        m1536T(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0439h interfaceC0439h) {
        if (interfaceC0439h == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f2171y1) {
            this.f2141a2 = null;
            this.f2139Y1 = null;
            this.f2140Z1 = null;
            this.f2138X1 = null;
        }
        this.f2171y1 = z6;
        super.setClipToPadding(z6);
        if (this.f2125K1) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0440i c0440i) {
        c0440i.getClass();
        this.f2137W1 = c0440i;
        this.f2141a2 = null;
        this.f2139Y1 = null;
        this.f2140Z1 = null;
        this.f2138X1 = null;
    }

    public void setHasFixedSize(boolean z6) {
        this.f2124J1 = z6;
    }

    public void setItemAnimator(AbstractC0441j abstractC0441j) {
        AbstractC0441j abstractC0441j2 = this.f2142b2;
        if (abstractC0441j2 != null) {
            abstractC0441j2.mo1601e();
            this.f2142b2.f2199a = null;
        }
        this.f2142b2 = abstractC0441j;
        if (abstractC0441j != null) {
            abstractC0441j.f2199a = this.f2172y2;
        }
    }

    public void setItemViewCacheSize(int i7) {
        C0450s c0450s = this.f2146e;
        c0450s.f2243e = i7;
        c0450s.m1671l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(AbstractC0444m abstractC0444m) {
        C0466b.b bVar;
        RecyclerView recyclerView;
        AbstractC0454w abstractC0454w;
        if (abstractC0444m == this.f2114E1) {
            return;
        }
        int i7 = 0;
        setScrollState(0);
        RunnableC0457z runnableC0457z = this.f2160q2;
        RecyclerView.this.removeCallbacks(runnableC0457z);
        runnableC0457z.f2283m.abortAnimation();
        AbstractC0444m abstractC0444m2 = this.f2114E1;
        if (abstractC0444m2 != null && (abstractC0454w = abstractC0444m2.f2212e) != null) {
            abstractC0454w.m1676d();
        }
        AbstractC0444m abstractC0444m3 = this.f2114E1;
        C0450s c0450s = this.f2146e;
        if (abstractC0444m3 != null) {
            AbstractC0441j abstractC0441j = this.f2142b2;
            if (abstractC0441j != null) {
                abstractC0441j.mo1601e();
            }
            this.f2114E1.m1630h0(c0450s);
            this.f2114E1.m1631i0(c0450s);
            c0450s.f2239a.clear();
            c0450s.m1664e();
            if (this.f2122I1) {
                AbstractC0444m abstractC0444m4 = this.f2114E1;
                abstractC0444m4.f2214g = false;
                abstractC0444m4.mo1480S(this);
            }
            this.f2114E1.m1640u0(null);
            this.f2114E1 = null;
        } else {
            c0450s.f2239a.clear();
            c0450s.m1664e();
        }
        C0466b c0466b = this.f2167w1;
        c0466b.f2353b.m1757g();
        ArrayList arrayList = c0466b.f2354c;
        int size = arrayList.size();
        while (true) {
            size--;
            bVar = c0466b.f2352a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            C0488v c0488v = (C0488v) bVar;
            c0488v.getClass();
            AbstractC0432a0 m1513I = m1513I(view);
            if (m1513I != null) {
                int i8 = m1513I.f2192p;
                RecyclerView recyclerView2 = c0488v.f2495a;
                if (recyclerView2.m1527K()) {
                    m1513I.f2193q = i8;
                    recyclerView2.f2119G2.add(m1513I);
                } else {
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    C0946x.d.m2843s(m1513I.f2177a, i8);
                }
                m1513I.f2192p = 0;
            }
            arrayList.remove(size);
        }
        C0488v c0488v2 = (C0488v) bVar;
        int m1805a = c0488v2.m1805a();
        while (true) {
            recyclerView = c0488v2.f2495a;
            if (i7 >= m1805a) {
                break;
            }
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.getClass();
            m1513I(childAt);
            AbstractC0436e abstractC0436e = recyclerView.f2112D1;
            childAt.clearAnimation();
            i7++;
        }
        recyclerView.removeAllViews();
        this.f2114E1 = abstractC0444m;
        if (abstractC0444m != null) {
            if (abstractC0444m.f2209b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0444m + " is already attached to a RecyclerView:" + abstractC0444m.f2209b.m1565y());
            }
            abstractC0444m.m1640u0(this);
            if (this.f2122I1) {
                this.f2114E1.f2214g = true;
            }
        }
        c0450s.m1671l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0930l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f4805d) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.i.m2893z(scrollingChildHelper.f4804c);
        }
        scrollingChildHelper.f4805d = z6;
    }

    public void setOnFlingListener(AbstractC0446o abstractC0446o) {
        this.f2153k2 = abstractC0446o;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0448q abstractC0448q) {
        this.f2165u2 = abstractC0448q;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f2159p2 = z6;
    }

    public void setRecycledViewPool(C0449r c0449r) {
        C0450s c0450s = this.f2146e;
        if (c0450s.f2245g != null) {
            r1.f2234b--;
        }
        c0450s.f2245g = c0449r;
        if (c0449r == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        c0450s.f2245g.f2234b++;
    }

    public void setRecyclerListener(InterfaceC0451t interfaceC0451t) {
    }

    void setScrollState(int i7) {
        AbstractC0454w abstractC0454w;
        if (i7 == this.f2144c2) {
            return;
        }
        this.f2144c2 = i7;
        if (i7 != 2) {
            RunnableC0457z runnableC0457z = this.f2160q2;
            RecyclerView.this.removeCallbacks(runnableC0457z);
            runnableC0457z.f2283m.abortAnimation();
            AbstractC0444m abstractC0444m = this.f2114E1;
            if (abstractC0444m != null && (abstractC0454w = abstractC0444m.f2212e) != null) {
                abstractC0454w.m1676d();
            }
        }
        AbstractC0444m abstractC0444m2 = this.f2114E1;
        if (abstractC0444m2 != null) {
            abstractC0444m2.mo1629g0(i7);
        }
        AbstractC0448q abstractC0448q = this.f2165u2;
        if (abstractC0448q != null) {
            abstractC0448q.mo1657a(this, i7);
        }
        ArrayList arrayList = this.f2166v2;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC0448q) this.f2166v2.get(size)).mo1657a(this, i7);
            }
        }
    }

    public void setScrollingTouchSlop(int i7) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f2152j2 = scaledTouchSlop;
            } else {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f2152j2 = scaledTouchSlop;
    }

    public void setViewCacheExtension(AbstractC0456y abstractC0456y) {
        this.f2146e.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().m2733g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m2734h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        AbstractC0454w abstractC0454w;
        if (z6 != this.f2128N1) {
            m1550i("Do not suppressLayout in layout or scroll");
            if (!z6) {
                this.f2128N1 = false;
                if (this.f2127M1 && this.f2114E1 != null && this.f2112D1 != null) {
                    requestLayout();
                }
                this.f2127M1 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2128N1 = true;
            this.f2129O1 = true;
            setScrollState(0);
            RunnableC0457z runnableC0457z = this.f2160q2;
            RecyclerView.this.removeCallbacks(runnableC0457z);
            runnableC0457z.f2283m.abortAnimation();
            AbstractC0444m abstractC0444m = this.f2114E1;
            if (abstractC0444m == null || (abstractC0454w = abstractC0444m.f2212e) == null) {
                return;
            }
            abstractC0454w.m1676d();
        }
    }

    /* renamed from: t */
    public final void m1560t(int i7, int i8) {
        this.f2136V1++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i8);
        AbstractC0448q abstractC0448q = this.f2165u2;
        if (abstractC0448q != null) {
            abstractC0448q.mo1658b(this, i7, i8);
        }
        ArrayList arrayList = this.f2166v2;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((AbstractC0448q) this.f2166v2.get(size)).mo1658b(this, i7, i8);
                }
            }
        }
        this.f2136V1--;
    }

    /* renamed from: u */
    public final void m1561u() {
        int measuredWidth;
        int measuredHeight;
        if (this.f2141a2 != null) {
            return;
        }
        this.f2137W1.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2141a2 = edgeEffect;
        if (this.f2171y1) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: v */
    public final void m1562v() {
        int measuredHeight;
        int measuredWidth;
        if (this.f2138X1 != null) {
            return;
        }
        this.f2137W1.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2138X1 = edgeEffect;
        if (this.f2171y1) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: w */
    public final void m1563w() {
        int measuredHeight;
        int measuredWidth;
        if (this.f2140Z1 != null) {
            return;
        }
        this.f2137W1.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2140Z1 = edgeEffect;
        if (this.f2171y1) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: x */
    public final void m1564x() {
        int measuredWidth;
        int measuredHeight;
        if (this.f2139Y1 != null) {
            return;
        }
        this.f2137W1.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2139Y1 = edgeEffect;
        if (this.f2171y1) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: y */
    public final String m1565y() {
        return " " + super.toString() + ", adapter:" + this.f2112D1 + ", layout:" + this.f2114E1 + ", context:" + getContext();
    }

    /* renamed from: z */
    public final void m1566z(C0455x c0455x) {
        if (getScrollState() != 2) {
            c0455x.getClass();
            return;
        }
        OverScroller overScroller = this.f2160q2.f2283m;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0455x.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }
}
