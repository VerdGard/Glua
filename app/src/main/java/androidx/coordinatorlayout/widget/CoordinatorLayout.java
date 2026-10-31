package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.ext.C0089a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p026d0.C0874b;
import p026d0.C0876d;
import p034e0.C0916e;
import p034e0.C0923h0;
import p034e0.C0935n0;
import p034e0.C0936o;
import p034e0.C0946x;
import p034e0.InterfaceC0932m;
import p034e0.InterfaceC0934n;
import p034e0.InterfaceC0938p;
import p082k0.AbstractC1446a;
import p089l.C1481o;
import p120p.C1682c;
import p151t.C1917a;
import p166v.C2009a;
import p189y.C2213a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0932m, InterfaceC0934n {

    /* renamed from: L1 */
    public static final String f1393L1;

    /* renamed from: M1 */
    public static final Class<?>[] f1394M1;

    /* renamed from: N1 */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0289c>>> f1395N1;

    /* renamed from: O1 */
    public static final C0295i f1396O1;

    /* renamed from: P1 */
    public static final C0876d f1397P1;

    /* renamed from: A1 */
    public final int[] f1398A1;

    /* renamed from: B1 */
    public View f1399B1;

    /* renamed from: C1 */
    public View f1400C1;

    /* renamed from: D1 */
    public ViewTreeObserverOnPreDrawListenerC0293g f1401D1;

    /* renamed from: E1 */
    public boolean f1402E1;

    /* renamed from: F1 */
    public C0935n0 f1403F1;

    /* renamed from: G1 */
    public boolean f1404G1;

    /* renamed from: H1 */
    public Drawable f1405H1;

    /* renamed from: I1 */
    public ViewGroup.OnHierarchyChangeListener f1406I1;

    /* renamed from: J1 */
    public C0287a f1407J1;

    /* renamed from: K1 */
    public final C0936o f1408K1;

    /* renamed from: c */
    public final ArrayList f1409c;

    /* renamed from: e */
    public final C1682c f1410e;

    /* renamed from: m */
    public final ArrayList f1411m;

    /* renamed from: s */
    public final ArrayList f1412s;

    /* renamed from: w1 */
    public final int[] f1413w1;

    /* renamed from: x1 */
    public final int[] f1414x1;

    /* renamed from: y1 */
    public boolean f1415y1;

    /* renamed from: z1 */
    public boolean f1416z1;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0287a implements InterfaceC0938p {
        public C0287a() {
        }

        @Override // p034e0.InterfaceC0938p
        /* renamed from: a */
        public final C0935n0 mo133a(View view, C0935n0 c0935n0) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!C0874b.m2562a(coordinatorLayout.f1403F1, c0935n0)) {
                coordinatorLayout.f1403F1 = c0935n0;
                boolean z6 = c0935n0.m2754e() > 0;
                coordinatorLayout.f1404G1 = z6;
                coordinatorLayout.setWillNotDraw(!z6 && coordinatorLayout.getBackground() == null);
                C0935n0.k kVar = c0935n0.f4835a;
                if (!kVar.mo2782m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = coordinatorLayout.getChildAt(i7);
                        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                        if (C0946x.d.m2826b(childAt) && ((C0292f) childAt.getLayoutParams()).f1419a != null && kVar.mo2782m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return c0935n0;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface InterfaceC0288b {
        AbstractC0289c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0289c<V extends View> {
        public AbstractC0289c() {
        }

        public AbstractC0289c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: e */
        public boolean mo978e(View view) {
            return false;
        }

        /* renamed from: f */
        public boolean mo979f(View view, View view2) {
            return false;
        }

        /* renamed from: g */
        public void mo980g(C0292f c0292f) {
        }

        /* renamed from: h */
        public boolean mo981h(CoordinatorLayout coordinatorLayout, V v5, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo982i(CoordinatorLayout coordinatorLayout, View view) {
        }

        /* renamed from: j */
        public void mo983j() {
        }

        /* renamed from: k */
        public boolean mo984k(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo985l(CoordinatorLayout coordinatorLayout, V v5, int i7) {
            return false;
        }

        /* renamed from: m */
        public boolean mo986m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9) {
            return false;
        }

        /* renamed from: n */
        public boolean mo987n(View view) {
            return false;
        }

        /* renamed from: o */
        public void mo988o(CoordinatorLayout coordinatorLayout, V v5, View view, int i7, int i8, int[] iArr, int i9) {
        }

        /* renamed from: p */
        public void mo989p(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int[] iArr) {
            iArr[0] = iArr[0] + i8;
            iArr[1] = iArr[1] + i9;
        }

        /* renamed from: q */
        public boolean mo990q(CoordinatorLayout coordinatorLayout, V v5, Rect rect, boolean z6) {
            return false;
        }

        /* renamed from: r */
        public void mo991r(View view, Parcelable parcelable) {
        }

        /* renamed from: s */
        public Parcelable mo992s(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: t */
        public boolean mo993t(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i7, int i8) {
            return false;
        }

        /* renamed from: u */
        public void mo994u(CoordinatorLayout coordinatorLayout, V v5, View view, int i7) {
        }

        /* renamed from: v */
        public boolean mo995v(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface InterfaceC0290d {
        Class<? extends AbstractC0289c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class ViewGroupOnHierarchyChangeListenerC0291e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC0291e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1406I1;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.m971p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1406I1;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0292f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0289c f1419a;

        /* renamed from: b */
        public boolean f1420b;

        /* renamed from: c */
        public final int f1421c;

        /* renamed from: d */
        public int f1422d;

        /* renamed from: e */
        public final int f1423e;

        /* renamed from: f */
        public final int f1424f;

        /* renamed from: g */
        public int f1425g;

        /* renamed from: h */
        public int f1426h;

        /* renamed from: i */
        public int f1427i;

        /* renamed from: j */
        public int f1428j;

        /* renamed from: k */
        public View f1429k;

        /* renamed from: l */
        public View f1430l;

        /* renamed from: m */
        public boolean f1431m;

        /* renamed from: n */
        public boolean f1432n;

        /* renamed from: o */
        public boolean f1433o;

        /* renamed from: p */
        public boolean f1434p;

        /* renamed from: q */
        public final Rect f1435q;

        public C0292f() {
            super(-2, -2);
            this.f1420b = false;
            this.f1421c = 0;
            this.f1422d = 0;
            this.f1423e = -1;
            this.f1424f = -1;
            this.f1425g = 0;
            this.f1426h = 0;
            this.f1435q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0292f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC0289c newInstance;
            this.f1420b = false;
            this.f1421c = 0;
            this.f1422d = 0;
            this.f1423e = -1;
            this.f1424f = -1;
            this.f1425g = 0;
            this.f1426h = 0;
            this.f1435q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f1392b);
            this.f1421c = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f1424f = obtainStyledAttributes.getResourceId(R$styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1422d = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f1423e = obtainStyledAttributes.getInteger(R$styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f1425g = obtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f1426h = obtainStyledAttributes.getInt(R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i7 = R$styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i7);
            this.f1420b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(i7);
                String str = CoordinatorLayout.f1393L1;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f1393L1;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<AbstractC0289c>>> threadLocal = CoordinatorLayout.f1395N1;
                        Map<String, Constructor<AbstractC0289c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<AbstractC0289c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1394M1);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e7) {
                        throw new RuntimeException(C0089a.m208f("Could not inflate Behavior subclass ", string), e7);
                    }
                }
                this.f1419a = newInstance;
            }
            obtainStyledAttributes.recycle();
            AbstractC0289c abstractC0289c = this.f1419a;
            if (abstractC0289c != null) {
                abstractC0289c.mo980g(this);
            }
        }

        public C0292f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1420b = false;
            this.f1421c = 0;
            this.f1422d = 0;
            this.f1423e = -1;
            this.f1424f = -1;
            this.f1425g = 0;
            this.f1426h = 0;
            this.f1435q = new Rect();
        }

        public C0292f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1420b = false;
            this.f1421c = 0;
            this.f1422d = 0;
            this.f1423e = -1;
            this.f1424f = -1;
            this.f1425g = 0;
            this.f1426h = 0;
            this.f1435q = new Rect();
        }

        public C0292f(C0292f c0292f) {
            super((ViewGroup.MarginLayoutParams) c0292f);
            this.f1420b = false;
            this.f1421c = 0;
            this.f1422d = 0;
            this.f1423e = -1;
            this.f1424f = -1;
            this.f1425g = 0;
            this.f1426h = 0;
            this.f1435q = new Rect();
        }

        /* renamed from: a */
        public final boolean m996a(int i7) {
            if (i7 == 0) {
                return this.f1432n;
            }
            if (i7 != 1) {
                return false;
            }
            return this.f1433o;
        }

        /* renamed from: b */
        public final void m997b(AbstractC0289c abstractC0289c) {
            AbstractC0289c abstractC0289c2 = this.f1419a;
            if (abstractC0289c2 != abstractC0289c) {
                if (abstractC0289c2 != null) {
                    abstractC0289c2.mo983j();
                }
                this.f1419a = abstractC0289c;
                this.f1420b = true;
                if (abstractC0289c != null) {
                    abstractC0289c.mo980g(this);
                }
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserverOnPreDrawListenerC0293g implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC0293g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.m971p(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0294h extends AbstractC1446a {
        public static final Parcelable.Creator<C0294h> CREATOR = new a();

        /* renamed from: m */
        public SparseArray<Parcelable> f1437m;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0294h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0294h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0294h[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0294h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0294h(parcel, classLoader);
            }
        }

        public C0294h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1437m = new SparseArray<>(readInt);
            for (int i7 = 0; i7 < readInt; i7++) {
                this.f1437m.append(iArr[i7], readParcelableArray[i7]);
            }
        }

        public C0294h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            SparseArray<Parcelable> sparseArray = this.f1437m;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = this.f1437m.keyAt(i8);
                parcelableArr[i8] = this.f1437m.valueAt(i8);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i7);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0295i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            float m2880m = C0946x.i.m2880m(view);
            float m2880m2 = C0946x.i.m2880m(view2);
            if (m2880m > m2880m2) {
                return -1;
            }
            return m2880m < m2880m2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1393L1 = r02 != null ? r02.getName() : null;
        f1396O1 = new C0295i();
        f1394M1 = new Class[]{Context.class, AttributeSet.class};
        f1395N1 = new ThreadLocal<>();
        f1397P1 = new C0876d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CoordinatorLayout(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r5 = androidx.coordinatorlayout.R$attr.coordinatorLayoutStyle
            r10.<init>(r11, r12, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1409c = r0
            p.c r0 = new p.c
            r7 = 1
            r0.<init>(r7)
            r10.f1410e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1411m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f1412s = r0
            r0 = 2
            int[] r1 = new int[r0]
            r10.f1413w1 = r1
            int[] r0 = new int[r0]
            r10.f1414x1 = r0
            e0.o r0 = new e0.o
            r0.<init>()
            r10.f1408K1 = r0
            int[] r2 = androidx.coordinatorlayout.R$styleable.f1391a
            r8 = 0
            if (r5 != 0) goto L3e
            int r0 = androidx.coordinatorlayout.R$style.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r2, r8, r0)
            goto L42
        L3e:
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r2, r5, r8)
        L42:
            r9 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5e
            if (r5 != 0) goto L56
            r5 = 0
            int r6 = androidx.coordinatorlayout.R$style.Widget_Support_CoordinatorLayout
            r0 = r10
            r1 = r11
            r3 = r12
            r4 = r9
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
            goto L5e
        L56:
            r6 = 0
            r0 = r10
            r1 = r11
            r3 = r12
            r4 = r9
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
        L5e:
            int r0 = androidx.coordinatorlayout.R$styleable.CoordinatorLayout_keylines
            int r0 = r9.getResourceId(r0, r8)
            if (r0 == 0) goto L86
            android.content.res.Resources r1 = r11.getResources()
            int[] r0 = r1.getIntArray(r0)
            r10.f1398A1 = r0
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r0 = r0.length
        L77:
            if (r8 >= r0) goto L86
            int[] r2 = r10.f1398A1
            r3 = r2[r8]
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2[r8] = r3
            int r8 = r8 + 1
            goto L77
        L86:
            int r0 = androidx.coordinatorlayout.R$styleable.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            r10.f1405H1 = r0
            r9.recycle()
            r10.m977x()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$e
            r0.<init>()
            super.setOnHierarchyChangeListener(r0)
            java.util.WeakHashMap<android.view.View, e0.h0> r0 = p034e0.C0946x.f4876a
            int r0 = p034e0.C0946x.d.m2827c(r10)
            if (r0 != 0) goto La7
            p034e0.C0946x.d.m2843s(r10, r7)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public static Rect m960a() {
        Rect rect = (Rect) f1397P1.mo2564a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: f */
    public static void m961f(int i7, Rect rect, Rect rect2, C0292f c0292f, int i8, int i9) {
        int i10 = c0292f.f1421c;
        if (i10 == 0) {
            i10 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i7);
        int i11 = c0292f.f1422d;
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, i7);
        int i12 = absoluteGravity & 7;
        int i13 = absoluteGravity & 112;
        int i14 = absoluteGravity2 & 7;
        int i15 = absoluteGravity2 & 112;
        int width = i14 != 1 ? i14 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i15 != 16 ? i15 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i12 == 1) {
            width -= i8 / 2;
        } else if (i12 != 5) {
            width -= i8;
        }
        if (i13 == 16) {
            height -= i9 / 2;
        } else if (i13 != 80) {
            height -= i9;
        }
        rect2.set(width, height, i8 + width, i9 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public static C0292f m962k(View view) {
        C0292f c0292f = (C0292f) view.getLayoutParams();
        if (!c0292f.f1420b) {
            if (view instanceof InterfaceC0288b) {
                AbstractC0289c behavior = ((InterfaceC0288b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0292f.m997b(behavior);
            } else {
                InterfaceC0290d interfaceC0290d = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    interfaceC0290d = (InterfaceC0290d) cls.getAnnotation(InterfaceC0290d.class);
                    if (interfaceC0290d != null) {
                        break;
                    }
                }
                if (interfaceC0290d != null) {
                    try {
                        c0292f.m997b(interfaceC0290d.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e7) {
                        Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0290d.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                    }
                }
            }
            c0292f.f1420b = true;
        }
        return c0292f;
    }

    /* renamed from: v */
    public static void m963v(View view, int i7) {
        C0292f c0292f = (C0292f) view.getLayoutParams();
        int i8 = c0292f.f1427i;
        if (i8 != i7) {
            C0946x.m2810k(view, i7 - i8);
            c0292f.f1427i = i7;
        }
    }

    /* renamed from: w */
    public static void m964w(View view, int i7) {
        C0292f c0292f = (C0292f) view.getLayoutParams();
        int i8 = c0292f.f1428j;
        if (i8 != i7) {
            C0946x.m2811l(view, i7 - i8);
            c0292f.f1428j = i7;
        }
    }

    /* renamed from: b */
    public final void m965b(C0292f c0292f, Rect rect, int i7, int i8) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0292f).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) c0292f).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0292f).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) c0292f).bottomMargin));
        rect.set(max, max2, i7 + max, i8 + max2);
    }

    /* renamed from: c */
    public final void m966c(View view, Rect rect, boolean z6) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            m968e(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0292f) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final ArrayList m967d(View view) {
        C1481o c1481o = (C1481o) this.f1410e.f7568b;
        int i7 = c1481o.f7047m;
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < i7; i8++) {
            ArrayList arrayList2 = (ArrayList) c1481o.m3877i(i8);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1481o.m3874f(i8));
            }
        }
        ArrayList arrayList3 = this.f1412s;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        AbstractC0289c abstractC0289c = ((C0292f) view.getLayoutParams()).f1419a;
        if (abstractC0289c != null) {
            abstractC0289c.getClass();
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1405H1;
        boolean z6 = false;
        if (drawable != null && drawable.isStateful()) {
            z6 = false | drawable.setState(drawableState);
        }
        if (z6) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m968e(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C1917a.f8680a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C1917a.f8680a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C1917a.m4531a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C1917a.f8681b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: g */
    public final int m969g(int i7) {
        StringBuilder sb;
        int[] iArr = this.f1398A1;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i7);
        } else {
            if (i7 >= 0 && i7 < iArr.length) {
                return iArr[i7];
            }
            sb = new StringBuilder("Keyline index ");
            sb.append(i7);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0292f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0292f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        m975t();
        return Collections.unmodifiableList(this.f1409c);
    }

    public final C0935n0 getLastWindowInsets() {
        return this.f1403F1;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0936o c0936o = this.f1408K1;
        return c0936o.f4867b | c0936o.f4866a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1405H1;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: h */
    public final void mo577h(View view, View view2, int i7, int i8) {
        C0936o c0936o = this.f1408K1;
        if (i8 == 1) {
            c0936o.f4867b = i7;
        } else {
            c0936o.f4866a = i7;
        }
        this.f1400C1 = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ((C0292f) getChildAt(i9).getLayoutParams()).getClass();
        }
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: i */
    public final void mo578i(View view, int i7) {
        C0936o c0936o = this.f1408K1;
        if (i7 == 1) {
            c0936o.f4867b = 0;
        } else {
            c0936o.f4866a = 0;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C0292f c0292f = (C0292f) childAt.getLayoutParams();
            if (c0292f.m996a(i7)) {
                AbstractC0289c abstractC0289c = c0292f.f1419a;
                if (abstractC0289c != null) {
                    abstractC0289c.mo994u(this, childAt, view, i7);
                }
                if (i7 == 0) {
                    c0292f.f1432n = false;
                } else if (i7 == 1) {
                    c0292f.f1433o = false;
                }
                c0292f.f1434p = false;
            }
        }
        this.f1400C1 = null;
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: j */
    public final void mo579j(View view, int i7, int i8, int[] iArr, int i9) {
        AbstractC0289c abstractC0289c;
        int childCount = getChildCount();
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0292f c0292f = (C0292f) childAt.getLayoutParams();
                if (c0292f.m996a(i9) && (abstractC0289c = c0292f.f1419a) != null) {
                    int[] iArr2 = this.f1413w1;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0289c.mo988o(this, childAt, view, i7, i8, iArr2, i9);
                    int[] iArr3 = this.f1413w1;
                    i10 = i7 > 0 ? Math.max(i10, iArr3[0]) : Math.min(i10, iArr3[0]);
                    i11 = i8 > 0 ? Math.max(i11, iArr3[1]) : Math.min(i11, iArr3[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        if (z6) {
            m971p(1);
        }
    }

    /* renamed from: l */
    public final boolean m970l(View view, int i7, int i8) {
        C0876d c0876d = f1397P1;
        Rect m960a = m960a();
        m968e(view, m960a);
        try {
            return m960a.contains(i7, i8);
        } finally {
            m960a.setEmpty();
            c0876d.mo2565b(m960a);
        }
    }

    @Override // p034e0.InterfaceC0934n
    /* renamed from: m */
    public final void mo582m(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        AbstractC0289c abstractC0289c;
        int childCount = getChildCount();
        boolean z6 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0292f c0292f = (C0292f) childAt.getLayoutParams();
                if (c0292f.m996a(i11) && (abstractC0289c = c0292f.f1419a) != null) {
                    int[] iArr2 = this.f1413w1;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0289c.mo989p(this, childAt, i8, i9, i10, iArr2);
                    i12 = i9 > 0 ? Math.max(i12, iArr2[0]) : Math.min(i12, iArr2[0]);
                    i13 = i10 > 0 ? Math.max(i13, iArr2[1]) : Math.min(i13, iArr2[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (z6) {
            m971p(1);
        }
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: n */
    public final void mo583n(View view, int i7, int i8, int i9, int i10, int i11) {
        mo582m(view, i7, i8, i9, i10, 0, this.f1414x1);
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: o */
    public final boolean mo584o(View view, View view2, int i7, int i8) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0292f c0292f = (C0292f) childAt.getLayoutParams();
                AbstractC0289c abstractC0289c = c0292f.f1419a;
                if (abstractC0289c != null) {
                    boolean mo993t = abstractC0289c.mo993t(this, childAt, view, view2, i7, i8);
                    z6 |= mo993t;
                    if (i8 == 0) {
                        c0292f.f1432n = mo993t;
                    } else if (i8 == 1) {
                        c0292f.f1433o = mo993t;
                    }
                } else if (i8 == 0) {
                    c0292f.f1432n = false;
                } else if (i8 == 1) {
                    c0292f.f1433o = false;
                }
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m976u(false);
        if (this.f1402E1) {
            if (this.f1401D1 == null) {
                this.f1401D1 = new ViewTreeObserverOnPreDrawListenerC0293g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1401D1);
        }
        if (this.f1403F1 == null) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (C0946x.d.m2826b(this)) {
                C0946x.h.m2867c(this);
            }
        }
        this.f1416z1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m976u(false);
        if (this.f1402E1 && this.f1401D1 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1401D1);
        }
        View view = this.f1400C1;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1416z1 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1404G1 || this.f1405H1 == null) {
            return;
        }
        C0935n0 c0935n0 = this.f1403F1;
        int m2754e = c0935n0 != null ? c0935n0.m2754e() : 0;
        if (m2754e > 0) {
            this.f1405H1.setBounds(0, 0, getWidth(), m2754e);
            this.f1405H1.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m976u(true);
        }
        boolean m974s = m974s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m976u(true);
        }
        return m974s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        AbstractC0289c abstractC0289c;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        int m2847d = C0946x.e.m2847d(this);
        ArrayList arrayList = this.f1409c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            if (view.getVisibility() != 8 && ((abstractC0289c = ((C0292f) view.getLayoutParams()).f1419a) == null || !abstractC0289c.mo985l(this, view, m2847d))) {
                m972q(view, m2847d);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0193, code lost:
    
        if (r0.mo986m(r32, r19, r25, r20, r26) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0292f c0292f = (C0292f) childAt.getLayoutParams();
                if (c0292f.m996a(0)) {
                    AbstractC0289c abstractC0289c = c0292f.f1419a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        AbstractC0289c abstractC0289c;
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0292f c0292f = (C0292f) childAt.getLayoutParams();
                if (c0292f.m996a(0) && (abstractC0289c = c0292f.f1419a) != null) {
                    z6 |= abstractC0289c.mo987n(view);
                }
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        mo579j(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        mo583n(view, i7, i8, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        mo577h(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0294h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0294h c0294h = (C0294h) parcelable;
        super.onRestoreInstanceState(c0294h.f6946c);
        SparseArray<Parcelable> sparseArray = c0294h.f1437m;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            AbstractC0289c abstractC0289c = m962k(childAt).f1419a;
            if (id != -1 && abstractC0289c != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0289c.mo991r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable mo992s;
        C0294h c0294h = new C0294h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            AbstractC0289c abstractC0289c = ((C0292f) childAt.getLayoutParams()).f1419a;
            if (id != -1 && abstractC0289c != null && (mo992s = abstractC0289c.mo992s(childAt)) != null) {
                sparseArray.append(id, mo992s);
            }
        }
        c0294h.f1437m = sparseArray;
        return c0294h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return mo584o(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo578i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1399B1
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m974s(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f1399B1
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0292f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1419a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f1399B1
            boolean r6 = r6.mo995v(r0, r7, r1)
            goto L2a
        L29:
            r6 = 0
        L2a:
            android.view.View r7 = r0.f1399B1
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m976u(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m971p(int i7) {
        int i8;
        Rect rect;
        int i9;
        ArrayList arrayList;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int width;
        int i10;
        int i11;
        int i12;
        int height;
        int i13;
        int i14;
        int i15;
        int i16;
        C0292f c0292f;
        ArrayList arrayList2;
        int i17;
        Rect rect2;
        int i18;
        View view;
        C0876d c0876d;
        C0292f c0292f2;
        int i19;
        boolean z10;
        AbstractC0289c abstractC0289c;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        int m2847d = C0946x.e.m2847d(this);
        ArrayList arrayList3 = this.f1409c;
        int size = arrayList3.size();
        Rect m960a = m960a();
        Rect m960a2 = m960a();
        Rect m960a3 = m960a();
        int i20 = i7;
        int i21 = 0;
        while (true) {
            C0876d c0876d2 = f1397P1;
            if (i21 >= size) {
                Rect rect3 = m960a3;
                m960a.setEmpty();
                c0876d2.mo2565b(m960a);
                m960a2.setEmpty();
                c0876d2.mo2565b(m960a2);
                rect3.setEmpty();
                c0876d2.mo2565b(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i21);
            C0292f c0292f3 = (C0292f) view2.getLayoutParams();
            if (i20 == 0 && view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i9 = size;
                rect = m960a3;
                i8 = i21;
            } else {
                int i22 = 0;
                while (i22 < i21) {
                    if (c0292f3.f1430l == ((View) arrayList3.get(i22))) {
                        C0292f c0292f4 = (C0292f) view2.getLayoutParams();
                        if (c0292f4.f1429k != null) {
                            Rect m960a4 = m960a();
                            Rect m960a5 = m960a();
                            arrayList2 = arrayList3;
                            Rect m960a6 = m960a();
                            i16 = i22;
                            m968e(c0292f4.f1429k, m960a4);
                            m966c(view2, m960a5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            i17 = size;
                            int measuredHeight = view2.getMeasuredHeight();
                            i18 = i21;
                            c0292f = c0292f3;
                            view = view2;
                            rect2 = m960a3;
                            c0876d = c0876d2;
                            m961f(m2847d, m960a4, m960a6, c0292f4, measuredWidth, measuredHeight);
                            if (m960a6.left == m960a5.left && m960a6.top == m960a5.top) {
                                c0292f2 = c0292f4;
                                i19 = measuredWidth;
                                z10 = false;
                            } else {
                                c0292f2 = c0292f4;
                                i19 = measuredWidth;
                                z10 = true;
                            }
                            m965b(c0292f2, m960a6, i19, measuredHeight);
                            int i23 = m960a6.left - m960a5.left;
                            int i24 = m960a6.top - m960a5.top;
                            if (i23 != 0) {
                                C0946x.m2810k(view, i23);
                            }
                            if (i24 != 0) {
                                C0946x.m2811l(view, i24);
                            }
                            if (z10 && (abstractC0289c = c0292f2.f1419a) != null) {
                                abstractC0289c.mo981h(this, view, c0292f2.f1429k);
                            }
                            m960a4.setEmpty();
                            c0876d.mo2565b(m960a4);
                            m960a5.setEmpty();
                            c0876d.mo2565b(m960a5);
                            m960a6.setEmpty();
                            c0876d.mo2565b(m960a6);
                            i22 = i16 + 1;
                            c0876d2 = c0876d;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i17;
                            i21 = i18;
                            c0292f3 = c0292f;
                            m960a3 = rect2;
                        }
                    }
                    i16 = i22;
                    c0292f = c0292f3;
                    arrayList2 = arrayList3;
                    i17 = size;
                    rect2 = m960a3;
                    i18 = i21;
                    view = view2;
                    c0876d = c0876d2;
                    i22 = i16 + 1;
                    c0876d2 = c0876d;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i17;
                    i21 = i18;
                    c0292f3 = c0292f;
                    m960a3 = rect2;
                }
                C0292f c0292f5 = c0292f3;
                ArrayList arrayList4 = arrayList3;
                int i25 = size;
                Rect rect4 = m960a3;
                i8 = i21;
                View view3 = view2;
                C0876d c0876d3 = c0876d2;
                m966c(view3, m960a2, true);
                if (c0292f5.f1425g != 0 && !m960a2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0292f5.f1425g, m2847d);
                    int i26 = absoluteGravity & 112;
                    if (i26 == 48) {
                        m960a.top = Math.max(m960a.top, m960a2.bottom);
                    } else if (i26 == 80) {
                        m960a.bottom = Math.max(m960a.bottom, getHeight() - m960a2.top);
                    }
                    int i27 = absoluteGravity & 7;
                    if (i27 == 3) {
                        m960a.left = Math.max(m960a.left, m960a2.right);
                    } else if (i27 == 5) {
                        m960a.right = Math.max(m960a.right, getWidth() - m960a2.left);
                    }
                }
                if (c0292f5.f1426h != 0 && view3.getVisibility() == 0) {
                    WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                    if (C0946x.g.m2860c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                        C0292f c0292f6 = (C0292f) view3.getLayoutParams();
                        AbstractC0289c abstractC0289c2 = c0292f6.f1419a;
                        Rect m960a7 = m960a();
                        Rect m960a8 = m960a();
                        m960a8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                        if (abstractC0289c2 == null || !abstractC0289c2.mo978e(view3)) {
                            m960a7.set(m960a8);
                        } else if (!m960a8.contains(m960a7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m960a7.toShortString() + " | Bounds:" + m960a8.toShortString());
                        }
                        m960a8.setEmpty();
                        c0876d3.mo2565b(m960a8);
                        if (!m960a7.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0292f6.f1426h, m2847d);
                            if ((absoluteGravity2 & 48) != 48 || (i14 = (m960a7.top - ((ViewGroup.MarginLayoutParams) c0292f6).topMargin) - c0292f6.f1428j) >= (i15 = m960a.top)) {
                                z7 = false;
                            } else {
                                m964w(view3, i15 - i14);
                                z7 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - m960a7.bottom) - ((ViewGroup.MarginLayoutParams) c0292f6).bottomMargin) + c0292f6.f1428j) < (i13 = m960a.bottom)) {
                                m964w(view3, height - i13);
                                z7 = true;
                            }
                            if (!z7) {
                                m964w(view3, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i11 = (m960a7.left - ((ViewGroup.MarginLayoutParams) c0292f6).leftMargin) - c0292f6.f1427i) >= (i12 = m960a.left)) {
                                z8 = false;
                            } else {
                                m963v(view3, i12 - i11);
                                z8 = true;
                            }
                            if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - m960a7.right) - ((ViewGroup.MarginLayoutParams) c0292f6).rightMargin) + c0292f6.f1427i) >= (i10 = m960a.right)) {
                                z9 = z8;
                            } else {
                                m963v(view3, width - i10);
                                z9 = true;
                            }
                            if (!z9) {
                                m963v(view3, 0);
                            }
                        }
                        m960a7.setEmpty();
                        c0876d3.mo2565b(m960a7);
                    }
                }
                if (i7 != 2) {
                    rect = rect4;
                    rect.set(((C0292f) view3.getLayoutParams()).f1435q);
                    if (rect.equals(m960a2)) {
                        arrayList = arrayList4;
                        i9 = i25;
                        i20 = i7;
                    } else {
                        ((C0292f) view3.getLayoutParams()).f1435q.set(m960a2);
                    }
                } else {
                    rect = rect4;
                }
                int i28 = i8 + 1;
                i9 = i25;
                while (true) {
                    arrayList = arrayList4;
                    if (i28 >= i9) {
                        break;
                    }
                    View view4 = (View) arrayList.get(i28);
                    C0292f c0292f7 = (C0292f) view4.getLayoutParams();
                    AbstractC0289c abstractC0289c3 = c0292f7.f1419a;
                    if (abstractC0289c3 != null && abstractC0289c3.mo979f(view4, view3)) {
                        if (i7 == 0 && c0292f7.f1434p) {
                            c0292f7.f1434p = false;
                        } else {
                            if (i7 != 2) {
                                z6 = abstractC0289c3.mo981h(this, view4, view3);
                            } else {
                                abstractC0289c3.mo982i(this, view3);
                                z6 = true;
                            }
                            if (i7 == 1) {
                                c0292f7.f1434p = z6;
                            }
                        }
                    }
                    i28++;
                    arrayList4 = arrayList;
                }
                i20 = i7;
            }
            i21 = i8 + 1;
            m960a3 = rect;
            size = i9;
            arrayList3 = arrayList;
        }
    }

    /* renamed from: q */
    public final void m972q(View view, int i7) {
        Rect m960a;
        Rect m960a2;
        C0292f c0292f = (C0292f) view.getLayoutParams();
        View view2 = c0292f.f1429k;
        int i8 = 0;
        if (view2 == null && c0292f.f1424f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0876d c0876d = f1397P1;
        if (view2 != null) {
            m960a = m960a();
            m960a2 = m960a();
            try {
                m968e(view2, m960a);
                C0292f c0292f2 = (C0292f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m961f(i7, m960a, m960a2, c0292f2, measuredWidth, measuredHeight);
                m965b(c0292f2, m960a2, measuredWidth, measuredHeight);
                view.layout(m960a2.left, m960a2.top, m960a2.right, m960a2.bottom);
                return;
            } finally {
                m960a.setEmpty();
                c0876d.mo2565b(m960a);
                m960a2.setEmpty();
                c0876d.mo2565b(m960a2);
            }
        }
        int i9 = c0292f.f1423e;
        if (i9 < 0) {
            C0292f c0292f3 = (C0292f) view.getLayoutParams();
            m960a = m960a();
            m960a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0292f3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0292f3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0292f3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0292f3).bottomMargin);
            if (this.f1403F1 != null) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (C0946x.d.m2826b(this) && !C0946x.d.m2826b(view)) {
                    m960a.left = this.f1403F1.m2752c() + m960a.left;
                    m960a.top = this.f1403F1.m2754e() + m960a.top;
                    m960a.right -= this.f1403F1.m2753d();
                    m960a.bottom -= this.f1403F1.m2751b();
                }
            }
            m960a2 = m960a();
            int i10 = c0292f3.f1421c;
            if ((i10 & 7) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            C0916e.m2684b(i10, view.getMeasuredWidth(), view.getMeasuredHeight(), m960a, m960a2, i7);
            view.layout(m960a2.left, m960a2.top, m960a2.right, m960a2.bottom);
            return;
        }
        C0292f c0292f4 = (C0292f) view.getLayoutParams();
        int i11 = c0292f4.f1421c;
        if (i11 == 0) {
            i11 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, i7);
        int i12 = absoluteGravity & 7;
        int i13 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i7 == 1) {
            i9 = width - i9;
        }
        int m969g = m969g(i9) - measuredWidth2;
        if (i12 == 1) {
            m969g += measuredWidth2 / 2;
        } else if (i12 == 5) {
            m969g += measuredWidth2;
        }
        if (i13 == 16) {
            i8 = 0 + (measuredHeight2 / 2);
        } else if (i13 == 80) {
            i8 = measuredHeight2 + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0292f4).leftMargin, Math.min(m969g, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0292f4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0292f4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0292f4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    /* renamed from: r */
    public final void m973r(View view, int i7, int i8, int i9) {
        measureChildWithMargins(view, i7, i8, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        AbstractC0289c abstractC0289c = ((C0292f) view.getLayoutParams()).f1419a;
        if (abstractC0289c == null || !abstractC0289c.mo990q(this, view, rect, z6)) {
            return super.requestChildRectangleOnScreen(view, rect, z6);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f1415y1) {
            return;
        }
        m976u(false);
        this.f1415y1 = true;
    }

    /* renamed from: s */
    public final boolean m974s(MotionEvent motionEvent, int i7) {
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1411m;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i8) : i8));
        }
        C0295i c0295i = f1396O1;
        if (c0295i != null) {
            Collections.sort(arrayList, c0295i);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z7 = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            C0292f c0292f = (C0292f) view.getLayoutParams();
            AbstractC0289c abstractC0289c = c0292f.f1419a;
            if (!(z7 || z8) || actionMasked == 0) {
                if (!z7 && abstractC0289c != null) {
                    if (i7 == 0) {
                        z7 = abstractC0289c.mo984k(this, view, motionEvent);
                    } else if (i7 == 1) {
                        z7 = abstractC0289c.mo995v(this, view, motionEvent);
                    }
                    if (z7) {
                        this.f1399B1 = view;
                    }
                }
                if (c0292f.f1419a == null) {
                    c0292f.f1431m = false;
                }
                boolean z9 = c0292f.f1431m;
                if (z9) {
                    z6 = true;
                } else {
                    z6 = z9 | false;
                    c0292f.f1431m = z6;
                }
                z8 = z6 && !z9;
                if (z6 && !z8) {
                    break;
                }
            } else if (abstractC0289c != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i7 == 0) {
                    abstractC0289c.mo984k(this, view, motionEvent2);
                } else if (i7 == 1) {
                    abstractC0289c.mo995v(this, view, motionEvent2);
                }
            }
        }
        arrayList.clear();
        return z7;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        m977x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1406I1 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1405H1;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1405H1 = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1405H1.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1405H1;
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C2213a.m5355c(drawable3, C0946x.e.m2847d(this));
                this.f1405H1.setVisible(getVisibility() == 0, false);
                this.f1405H1.setCallback(this);
            }
            WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(int i7) {
        Drawable drawable;
        if (i7 != 0) {
            Context context = getContext();
            Object obj = C2009a.f9156a;
            drawable = C2009a.c.m4903b(context, i7);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f1405H1;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.f1405H1.setVisible(z6, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0075, code lost:
    
        if (r12 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a A[SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m975t() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m975t():void");
    }

    /* renamed from: u */
    public final void m976u(boolean z6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            AbstractC0289c abstractC0289c = ((C0292f) childAt.getLayoutParams()).f1419a;
            if (abstractC0289c != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z6) {
                    abstractC0289c.mo984k(this, childAt, obtain);
                } else {
                    abstractC0289c.mo995v(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            ((C0292f) getChildAt(i8).getLayoutParams()).f1431m = false;
        }
        this.f1399B1 = null;
        this.f1415y1 = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1405H1;
    }

    /* renamed from: x */
    public final void m977x() {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (!C0946x.d.m2826b(this)) {
            C0946x.i.m2888u(this, null);
            return;
        }
        if (this.f1407J1 == null) {
            this.f1407J1 = new C0287a();
        }
        C0946x.i.m2888u(this, this.f1407J1);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0292f ? new C0292f((C0292f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0292f((ViewGroup.MarginLayoutParams) layoutParams) : new C0292f(layoutParams);
    }
}
