package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0908a;
import p034e0.C0923h0;
import p034e0.C0935n0;
import p034e0.C0946x;
import p042f0.C1151g;
import p042f0.InterfaceC1155k;
import p082k0.AbstractC1446a;
import p090l0.C1486c;
import p166v.C2009a;
import p181x.C2153b;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: V1 */
    public static final int[] f1498V1 = {R.attr.colorPrimaryDark};

    /* renamed from: W1 */
    public static final int[] f1499W1 = {R.attr.layout_gravity};

    /* renamed from: X1 */
    public static final boolean f1500X1;

    /* renamed from: Y1 */
    public static final boolean f1501Y1;

    /* renamed from: Z1 */
    public static final boolean f1502Z1;

    /* renamed from: A1 */
    public final C0312h f1503A1;

    /* renamed from: B1 */
    public final C0312h f1504B1;

    /* renamed from: C1 */
    public int f1505C1;

    /* renamed from: D1 */
    public boolean f1506D1;

    /* renamed from: E1 */
    public boolean f1507E1;

    /* renamed from: F1 */
    public int f1508F1;

    /* renamed from: G1 */
    public int f1509G1;

    /* renamed from: H1 */
    public int f1510H1;

    /* renamed from: I1 */
    public int f1511I1;

    /* renamed from: J1 */
    public boolean f1512J1;

    /* renamed from: K1 */
    public InterfaceC0308d f1513K1;

    /* renamed from: L1 */
    public ArrayList f1514L1;

    /* renamed from: M1 */
    public float f1515M1;

    /* renamed from: N1 */
    public float f1516N1;

    /* renamed from: O1 */
    public Drawable f1517O1;

    /* renamed from: P1 */
    public Object f1518P1;

    /* renamed from: Q1 */
    public boolean f1519Q1;

    /* renamed from: R1 */
    public final ArrayList<View> f1520R1;

    /* renamed from: S1 */
    public Rect f1521S1;

    /* renamed from: T1 */
    public Matrix f1522T1;

    /* renamed from: U1 */
    public final C0305a f1523U1;

    /* renamed from: c */
    public final C0307c f1524c;

    /* renamed from: e */
    public float f1525e;

    /* renamed from: m */
    public final int f1526m;

    /* renamed from: s */
    public int f1527s;

    /* renamed from: w1 */
    public float f1528w1;

    /* renamed from: x1 */
    public final Paint f1529x1;

    /* renamed from: y1 */
    public final C1486c f1530y1;

    /* renamed from: z1 */
    public final C1486c f1531z1;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C0305a implements InterfaceC1155k {
        public C0305a() {
        }

        @Override // p042f0.InterfaceC1155k
        /* renamed from: a */
        public final boolean mo1053a(View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (!DrawerLayout.m1031o(view) || drawerLayout.m1043j(view) == 2) {
                return false;
            }
            drawerLayout.m1036c(view, true);
            return true;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class C0306b extends C0908a {

        /* renamed from: d */
        public final Rect f1533d = new Rect();

        public C0306b() {
        }

        @Override // p034e0.C0908a
        /* renamed from: a */
        public final boolean mo1054a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo1054a(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View m1041h = drawerLayout.m1041h();
            if (m1041h == null) {
                return true;
            }
            int m1044k = drawerLayout.m1044k(m1041h);
            drawerLayout.getClass();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            Gravity.getAbsoluteGravity(m1044k, C0946x.e.m2847d(drawerLayout));
            return true;
        }

        @Override // p034e0.C0908a
        /* renamed from: c */
        public final void mo1026c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1026c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            boolean z6 = DrawerLayout.f1500X1;
            AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
            View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
            if (z6) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                c1151g.f5687c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                Object m2830f = C0946x.d.m2830f(view);
                if (m2830f instanceof View) {
                    c1151g.f5686b = -1;
                    accessibilityNodeInfo.setParent((View) m2830f);
                }
                Rect rect = this.f1533d;
                obtain.getBoundsInScreen(rect);
                accessibilityNodeInfo.setBoundsInScreen(rect);
                accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                c1151g.m3342g(obtain.getClassName());
                accessibilityNodeInfo.setContentDescription(obtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                accessibilityNodeInfo.setFocused(obtain.isFocused());
                accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(obtain.isSelected());
                c1151g.m3336a(obtain.getActions());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if (DrawerLayout.m1029m(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            c1151g.m3342g("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C1151g.a.f5688e.f5698a);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C1151g.a.f5689f.f5698a);
        }

        @Override // p034e0.C0908a
        /* renamed from: f */
        public final boolean mo1055f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f1500X1 || DrawerLayout.m1029m(view)) {
                return super.mo1055f(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public static final class C0307c extends C0908a {
        @Override // p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
            AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (DrawerLayout.m1029m(view)) {
                return;
            }
            c1151g.f5686b = -1;
            accessibilityNodeInfo.setParent(null);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface InterfaceC0308d {
        /* renamed from: a */
        void mo1056a();

        /* renamed from: b */
        void mo1057b(float f7);

        /* renamed from: c */
        void mo1058c(View view);

        /* renamed from: d */
        void mo1059d(View view);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public static class C0309e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public final int f1535a;

        /* renamed from: b */
        public float f1536b;

        /* renamed from: c */
        public boolean f1537c;

        /* renamed from: d */
        public int f1538d;

        public C0309e() {
            super(-1, -1);
            this.f1535a = 0;
        }

        public C0309e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1535a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1499W1);
            this.f1535a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0309e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1535a = 0;
        }

        public C0309e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1535a = 0;
        }

        public C0309e(C0309e c0309e) {
            super((ViewGroup.MarginLayoutParams) c0309e);
            this.f1535a = 0;
            this.f1535a = c0309e.f1535a;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static class C0310f extends AbstractC1446a {
        public static final Parcelable.Creator<C0310f> CREATOR = new a();

        /* renamed from: X */
        public int f1539X;

        /* renamed from: Y */
        public int f1540Y;

        /* renamed from: Z */
        public int f1541Z;

        /* renamed from: m */
        public int f1542m;

        /* renamed from: s */
        public int f1543s;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        public class a implements Parcelable.ClassLoaderCreator<C0310f> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0310f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0310f[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0310f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0310f(parcel, classLoader);
            }
        }

        public C0310f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1542m = 0;
            this.f1542m = parcel.readInt();
            this.f1543s = parcel.readInt();
            this.f1539X = parcel.readInt();
            this.f1540Y = parcel.readInt();
            this.f1541Z = parcel.readInt();
        }

        public C0310f(Parcelable parcelable) {
            super(parcelable);
            this.f1542m = 0;
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeInt(this.f1542m);
            parcel.writeInt(this.f1543s);
            parcel.writeInt(this.f1539X);
            parcel.writeInt(this.f1540Y);
            parcel.writeInt(this.f1541Z);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    public static abstract class AbstractC0311g implements InterfaceC0308d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0308d
        /* renamed from: a */
        public final void mo1056a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0308d
        /* renamed from: b */
        public final void mo1057b(float f7) {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$h */
    public class C0312h extends C1486c.c {

        /* renamed from: a */
        public final int f1544a;

        /* renamed from: b */
        public C1486c f1545b;

        /* renamed from: c */
        public final a f1546c = new a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$h$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                View m1039f;
                int width;
                C0312h c0312h = C0312h.this;
                int i7 = c0312h.f1545b.f7085o;
                int i8 = c0312h.f1544a;
                boolean z6 = i8 == 3;
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z6) {
                    m1039f = drawerLayout.m1039f(3);
                    width = (m1039f != null ? -m1039f.getWidth() : 0) + i7;
                } else {
                    m1039f = drawerLayout.m1039f(5);
                    width = drawerLayout.getWidth() - i7;
                }
                if (m1039f != null) {
                    if (((!z6 || m1039f.getLeft() >= width) && (z6 || m1039f.getLeft() <= width)) || drawerLayout.m1043j(m1039f) != 0) {
                        return;
                    }
                    C0309e c0309e = (C0309e) m1039f.getLayoutParams();
                    c0312h.f1545b.m3911s(m1039f, width, m1039f.getTop());
                    c0309e.f1537c = true;
                    drawerLayout.invalidate();
                    View m1039f2 = drawerLayout.m1039f(i8 == 3 ? 5 : 3);
                    if (m1039f2 != null) {
                        drawerLayout.m1036c(m1039f2, true);
                    }
                    if (drawerLayout.f1512J1) {
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        drawerLayout.getChildAt(i9).dispatchTouchEvent(obtain);
                    }
                    obtain.recycle();
                    drawerLayout.f1512J1 = true;
                }
            }
        }

        public C0312h(int i7) {
            this.f1544a = i7;
        }

        @Override // p090l0.C1486c.c
        /* renamed from: a */
        public final int mo1060a(View view, int i7) {
            int width;
            int width2;
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.m1035b(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = drawerLayout.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i7, width));
        }

        @Override // p090l0.C1486c.c
        /* renamed from: b */
        public final int mo1061b(View view, int i7) {
            return view.getTop();
        }

        @Override // p090l0.C1486c.c
        /* renamed from: c */
        public final int mo1062c(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.m1032p(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p090l0.C1486c.c
        /* renamed from: e */
        public final void mo1063e(int i7, int i8) {
            int i9 = (i7 & 1) == 1 ? 3 : 5;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View m1039f = drawerLayout.m1039f(i9);
            if (m1039f == null || drawerLayout.m1043j(m1039f) != 0) {
                return;
            }
            this.f1545b.m3894b(m1039f, i8);
        }

        @Override // p090l0.C1486c.c
        /* renamed from: f */
        public final void mo1064f() {
            DrawerLayout.this.postDelayed(this.f1546c, 160L);
        }

        @Override // p090l0.C1486c.c
        /* renamed from: g */
        public final void mo1065g(View view, int i7) {
            ((C0309e) view.getLayoutParams()).f1537c = false;
            int i8 = this.f1544a == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View m1039f = drawerLayout.m1039f(i8);
            if (m1039f != null) {
                drawerLayout.m1036c(m1039f, true);
            }
        }

        @Override // p090l0.C1486c.c
        /* renamed from: h */
        public final void mo1066h(int i7) {
            DrawerLayout.this.m1052y(this.f1545b.f7090t, i7);
        }

        @Override // p090l0.C1486c.c
        /* renamed from: i */
        public final void mo1067i(View view, int i7, int i8) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.m1035b(view, 3) ? i7 + width : drawerLayout.getWidth() - i7) / width;
            drawerLayout.m1049v(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // p090l0.C1486c.c
        /* renamed from: j */
        public final void mo1068j(View view, float f7, float f8) {
            int i7;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f9 = ((C0309e) view.getLayoutParams()).f1536b;
            int width = view.getWidth();
            if (drawerLayout.m1035b(view, 3)) {
                i7 = (f7 > 0.0f || (f7 == 0.0f && f9 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f7 < 0.0f || (f7 == 0.0f && f9 > 0.5f)) {
                    width2 -= width;
                }
                i7 = width2;
            }
            this.f1545b.m3909q(i7, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // p090l0.C1486c.c
        /* renamed from: k */
        public final boolean mo1069k(View view, int i7) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            return DrawerLayout.m1032p(view) && drawerLayout.m1035b(view, this.f1544a) && drawerLayout.m1043j(view) == 0;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f1500X1 = true;
        f1501Y1 = true;
        f1502Z1 = i7 >= 29;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DrawerLayout(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: l */
    public static String m1028l(int i7) {
        return (i7 & 3) == 3 ? "LEFT" : (i7 & 5) == 5 ? "RIGHT" : Integer.toHexString(i7);
    }

    /* renamed from: m */
    public static boolean m1029m(View view) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return (C0946x.d.m2827c(view) == 4 || C0946x.d.m2827c(view) == 2) ? false : true;
    }

    /* renamed from: n */
    public static boolean m1030n(View view) {
        return ((C0309e) view.getLayoutParams()).f1535a == 0;
    }

    /* renamed from: o */
    public static boolean m1031o(View view) {
        if (m1032p(view)) {
            return (((C0309e) view.getLayoutParams()).f1538d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: p */
    public static boolean m1032p(View view) {
        int i7 = ((C0309e) view.getLayoutParams()).f1535a;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, C0946x.e.m2847d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    /* renamed from: q */
    public static boolean m1033q(View view) {
        if (m1032p(view)) {
            return ((C0309e) view.getLayoutParams()).f1536b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: a */
    public final void m1034a(InterfaceC0308d interfaceC0308d) {
        if (interfaceC0308d == null) {
            return;
        }
        if (this.f1514L1 == null) {
            this.f1514L1 = new ArrayList();
        }
        this.f1514L1.add(interfaceC0308d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i7, int i8) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        boolean z6 = false;
        while (true) {
            arrayList2 = this.f1520R1;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            if (!m1032p(childAt)) {
                arrayList2.add(childAt);
            } else if (m1031o(childAt)) {
                childAt.addFocusables(arrayList, i7, i8);
                z6 = true;
            }
            i9++;
        }
        if (!z6) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = arrayList2.get(i10);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i7, i8);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        int i8;
        super.addView(view, i7, layoutParams);
        if (m1040g() != null || m1032p(view)) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            i8 = 4;
        } else {
            WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
            i8 = 1;
        }
        C0946x.d.m2843s(view, i8);
        if (f1500X1) {
            return;
        }
        C0946x.m2817r(view, this.f1524c);
    }

    /* renamed from: b */
    public final boolean m1035b(View view, int i7) {
        return (m1044k(view) & i7) == i7;
    }

    /* renamed from: c */
    public final void m1036c(View view, boolean z6) {
        int width;
        int top;
        C1486c c1486c;
        if (!m1032p(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0309e c0309e = (C0309e) view.getLayoutParams();
        if (this.f1507E1) {
            c0309e.f1536b = 0.0f;
            c0309e.f1538d = 0;
        } else if (z6) {
            c0309e.f1538d |= 4;
            if (m1035b(view, 3)) {
                width = -view.getWidth();
                top = view.getTop();
                c1486c = this.f1530y1;
            } else {
                width = getWidth();
                top = view.getTop();
                c1486c = this.f1531z1;
            }
            c1486c.m3911s(view, width, top);
        } else {
            m1045r(view, 0.0f);
            m1052y(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0309e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f7 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            f7 = Math.max(f7, ((C0309e) getChildAt(i7).getLayoutParams()).f1536b);
        }
        this.f1528w1 = f7;
        boolean m3899g = this.f1530y1.m3899g();
        boolean m3899g2 = this.f1531z1.m3899g();
        if (m3899g || m3899g2) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    /* renamed from: d */
    public final void m1037d() {
        View m1039f = m1039f(8388611);
        if (m1039f != null) {
            m1036c(m1039f, true);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + m1028l(8388611));
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1528w1 <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt = getChildAt(i7);
            if (this.f1521S1 == null) {
                this.f1521S1 = new Rect();
            }
            childAt.getHitRect(this.f1521S1);
            if (this.f1521S1.contains((int) x7, (int) y7) && !m1030n(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f1522T1 == null) {
                            this.f1522T1 = new Matrix();
                        }
                        matrix.invert(this.f1522T1);
                        obtain.transform(this.f1522T1);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        int height = getHeight();
        boolean m1030n = m1030n(view);
        int width = getWidth();
        int save = canvas.save();
        int i7 = 0;
        if (m1030n) {
            int childCount = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && m1032p(childAt) && childAt.getHeight() >= height) {
                        if (m1035b(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i8) {
                                i8 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i8, 0, width, getHeight());
            i7 = i8;
        }
        boolean drawChild = super.drawChild(canvas, view, j7);
        canvas.restoreToCount(save);
        float f7 = this.f1528w1;
        if (f7 > 0.0f && m1030n) {
            int i10 = this.f1527s;
            Paint paint = this.f1529x1;
            paint.setColor((((int) ((((-16777216) & i10) >>> 24) * f7)) << 24) | (i10 & 16777215));
            canvas.drawRect(i7, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    /* renamed from: e */
    public final void m1038e(boolean z6) {
        int width;
        int top;
        C1486c c1486c;
        int childCount = getChildCount();
        boolean z7 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            C0309e c0309e = (C0309e) childAt.getLayoutParams();
            if (m1032p(childAt) && (!z6 || c0309e.f1537c)) {
                int width2 = childAt.getWidth();
                if (m1035b(childAt, 3)) {
                    width = -width2;
                    top = childAt.getTop();
                    c1486c = this.f1530y1;
                } else {
                    width = getWidth();
                    top = childAt.getTop();
                    c1486c = this.f1531z1;
                }
                z7 |= c1486c.m3911s(childAt, width, top);
                c0309e.f1537c = false;
            }
        }
        C0312h c0312h = this.f1503A1;
        DrawerLayout.this.removeCallbacks(c0312h.f1546c);
        C0312h c0312h2 = this.f1504B1;
        DrawerLayout.this.removeCallbacks(c0312h2.f1546c);
        if (z7) {
            invalidate();
        }
    }

    /* renamed from: f */
    public final View m1039f(int i7) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, C0946x.e.m2847d(this)) & 7;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((m1044k(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final View m1040g() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((((C0309e) childAt.getLayoutParams()).f1538d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0309e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0309e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0309e ? new C0309e((C0309e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0309e((ViewGroup.MarginLayoutParams) layoutParams) : new C0309e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1501Y1) {
            return this.f1525e;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1517O1;
    }

    /* renamed from: h */
    public final View m1041h() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (m1032p(childAt) && m1033q(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final int m1042i(int i7) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        int m2847d = C0946x.e.m2847d(this);
        if (i7 == 3) {
            int i8 = this.f1508F1;
            if (i8 != 3) {
                return i8;
            }
            int i9 = m2847d == 0 ? this.f1510H1 : this.f1511I1;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i7 == 5) {
            int i10 = this.f1509G1;
            if (i10 != 3) {
                return i10;
            }
            int i11 = m2847d == 0 ? this.f1511I1 : this.f1510H1;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i7 == 8388611) {
            int i12 = this.f1510H1;
            if (i12 != 3) {
                return i12;
            }
            int i13 = m2847d == 0 ? this.f1508F1 : this.f1509G1;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i7 != 8388613) {
            return 0;
        }
        int i14 = this.f1511I1;
        if (i14 != 3) {
            return i14;
        }
        int i15 = m2847d == 0 ? this.f1509G1 : this.f1508F1;
        if (i15 != 3) {
            return i15;
        }
        return 0;
    }

    /* renamed from: j */
    public final int m1043j(View view) {
        if (m1032p(view)) {
            return m1042i(((C0309e) view.getLayoutParams()).f1535a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: k */
    public final int m1044k(View view) {
        int i7 = ((C0309e) view.getLayoutParams()).f1535a;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return Gravity.getAbsoluteGravity(i7, C0946x.e.m2847d(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1507E1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1507E1 = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1519Q1 || this.f1517O1 == null) {
            return;
        }
        Object obj = this.f1518P1;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f1517O1.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1517O1.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0058 A[LOOP:1: B:30:0x0022->B:39:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            if (m1041h() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            return super.onKeyUp(i7, keyEvent);
        }
        View m1041h = m1041h();
        if (m1041h != null && m1043j(m1041h) == 0) {
            m1038e(false);
        }
        return m1041h != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        WindowInsets rootWindowInsets;
        float f7;
        int i11;
        int measuredHeight;
        int i12;
        int i13;
        this.f1506D1 = true;
        int i14 = i9 - i7;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C0309e c0309e = (C0309e) childAt.getLayoutParams();
                if (m1030n(childAt)) {
                    int i16 = ((ViewGroup.MarginLayoutParams) c0309e).leftMargin;
                    childAt.layout(i16, ((ViewGroup.MarginLayoutParams) c0309e).topMargin, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0309e).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (m1035b(childAt, 3)) {
                        float f8 = measuredWidth;
                        i11 = (-measuredWidth) + ((int) (c0309e.f1536b * f8));
                        f7 = (measuredWidth + i11) / f8;
                    } else {
                        float f9 = measuredWidth;
                        f7 = (i14 - r11) / f9;
                        i11 = i14 - ((int) (c0309e.f1536b * f9));
                    }
                    boolean z7 = f7 != c0309e.f1536b;
                    int i17 = c0309e.f1535a & 112;
                    if (i17 != 16) {
                        if (i17 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) c0309e).topMargin;
                            i12 = measuredWidth + i11;
                            i13 = measuredHeight2 + measuredHeight;
                        } else {
                            int i18 = i10 - i8;
                            measuredHeight = (i18 - ((ViewGroup.MarginLayoutParams) c0309e).bottomMargin) - childAt.getMeasuredHeight();
                            i12 = measuredWidth + i11;
                            i13 = i18 - ((ViewGroup.MarginLayoutParams) c0309e).bottomMargin;
                        }
                        childAt.layout(i11, measuredHeight, i12, i13);
                    } else {
                        int i19 = i10 - i8;
                        int i20 = (i19 - measuredHeight2) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) c0309e).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight2;
                            int i23 = i19 - ((ViewGroup.MarginLayoutParams) c0309e).bottomMargin;
                            if (i22 > i23) {
                                i20 = i23 - measuredHeight2;
                            }
                        }
                        childAt.layout(i11, i20, measuredWidth + i11, measuredHeight2 + i20);
                    }
                    if (z7) {
                        m1049v(childAt, f7);
                    }
                    int i24 = c0309e.f1536b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i24) {
                        childAt.setVisibility(i24);
                    }
                }
            }
        }
        if (f1502Z1 && (rootWindowInsets = getRootWindowInsets()) != null) {
            C2153b mo2787i = C0935n0.m2749i(null, rootWindowInsets).f4835a.mo2787i();
            C1486c c1486c = this.f1530y1;
            c1486c.f7085o = Math.max(c1486c.f7086p, mo2787i.f9764a);
            C1486c c1486c2 = this.f1531z1;
            c1486c2.f7085o = Math.max(c1486c2.f7086p, mo2787i.f9766c);
        }
        this.f1506D1 = false;
        this.f1507E1 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View m1039f;
        if (!(parcelable instanceof C0310f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0310f c0310f = (C0310f) parcelable;
        super.onRestoreInstanceState(c0310f.f6946c);
        int i7 = c0310f.f1542m;
        if (i7 != 0 && (m1039f = m1039f(i7)) != null) {
            m1046s(m1039f);
        }
        int i8 = c0310f.f1543s;
        if (i8 != 3) {
            m1048u(i8, 3);
        }
        int i9 = c0310f.f1539X;
        if (i9 != 3) {
            m1048u(i9, 5);
        }
        int i10 = c0310f.f1540Y;
        if (i10 != 3) {
            m1048u(i10, 8388611);
        }
        int i11 = c0310f.f1541Z;
        if (i11 != 3) {
            m1048u(i11, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        if (f1501Y1) {
            return;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.e.m2847d(this);
        C0946x.e.m2847d(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0310f c0310f = new C0310f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            C0309e c0309e = (C0309e) getChildAt(i7).getLayoutParams();
            int i8 = c0309e.f1538d;
            boolean z6 = i8 == 1;
            boolean z7 = i8 == 2;
            if (z6 || z7) {
                c0310f.f1542m = c0309e.f1535a;
                break;
            }
        }
        c0310f.f1543s = this.f1508F1;
        c0310f.f1539X = this.f1509G1;
        c0310f.f1540Y = this.f1510H1;
        c0310f.f1541Z = this.f1511I1;
        return c0310f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (m1043j(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            l0.c r0 = r6.f1530y1
            r0.m3903k(r7)
            l0.c r1 = r6.f1531z1
            r1.m3903k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L5a
            if (r1 == r3) goto L1e
            r7 = 3
            if (r1 == r7) goto L1a
            goto L68
        L1a:
            r6.m1038e(r3)
            goto L66
        L1e:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.m3900h(r4, r5)
            if (r4 == 0) goto L55
            boolean r4 = m1030n(r4)
            if (r4 == 0) goto L55
            float r4 = r6.f1515M1
            float r1 = r1 - r4
            float r4 = r6.f1516N1
            float r7 = r7 - r4
            int r0 = r0.f7072b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L55
            android.view.View r7 = r6.m1040g()
            if (r7 == 0) goto L55
            int r7 = r6.m1043j(r7)
            r0 = 2
            if (r7 != r0) goto L56
        L55:
            r2 = 1
        L56:
            r6.m1038e(r2)
            goto L68
        L5a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f1515M1 = r0
            r6.f1516N1 = r7
        L66:
            r6.f1512J1 = r2
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public final void m1045r(View view, float f7) {
        float f8 = ((C0309e) view.getLayoutParams()).f1536b;
        float width = view.getWidth();
        int i7 = ((int) (width * f7)) - ((int) (f8 * width));
        if (!m1035b(view, 3)) {
            i7 = -i7;
        }
        view.offsetLeftAndRight(i7);
        m1049v(view, f7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (z6) {
            m1038e(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1506D1) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public final void m1046s(View view) {
        if (!m1032p(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C0309e c0309e = (C0309e) view.getLayoutParams();
        if (this.f1507E1) {
            c0309e.f1536b = 1.0f;
            c0309e.f1538d = 1;
            m1051x(view, true);
            m1050w(view);
        } else {
            c0309e.f1538d |= 2;
            if (m1035b(view, 3)) {
                this.f1530y1.m3911s(view, 0, view.getTop());
            } else {
                this.f1531z1.m3911s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public void setDrawerElevation(float f7) {
        this.f1525e = f7;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (m1032p(childAt)) {
                float f8 = this.f1525e;
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.i.m2886s(childAt, f8);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC0308d interfaceC0308d) {
        ArrayList arrayList;
        InterfaceC0308d interfaceC0308d2 = this.f1513K1;
        if (interfaceC0308d2 != null && (arrayList = this.f1514L1) != null) {
            arrayList.remove(interfaceC0308d2);
        }
        if (interfaceC0308d != null) {
            m1034a(interfaceC0308d);
        }
        this.f1513K1 = interfaceC0308d;
    }

    public void setDrawerLockMode(int i7) {
        m1048u(i7, 3);
        m1048u(i7, 5);
    }

    public void setScrimColor(int i7) {
        this.f1527s = i7;
        invalidate();
    }

    public void setStatusBarBackground(int i7) {
        Drawable drawable;
        if (i7 != 0) {
            Context context = getContext();
            Object obj = C2009a.f9156a;
            drawable = C2009a.c.m4903b(context, i7);
        } else {
            drawable = null;
        }
        this.f1517O1 = drawable;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1517O1 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i7) {
        this.f1517O1 = new ColorDrawable(i7);
        invalidate();
    }

    /* renamed from: t */
    public final void m1047t() {
        View m1039f = m1039f(8388611);
        if (m1039f != null) {
            m1046s(m1039f);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + m1028l(8388611));
        }
    }

    /* renamed from: u */
    public final void m1048u(int i7, int i8) {
        View m1039f;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, C0946x.e.m2847d(this));
        if (i8 == 3) {
            this.f1508F1 = i7;
        } else if (i8 == 5) {
            this.f1509G1 = i7;
        } else if (i8 == 8388611) {
            this.f1510H1 = i7;
        } else if (i8 == 8388613) {
            this.f1511I1 = i7;
        }
        if (i7 != 0) {
            (absoluteGravity == 3 ? this.f1530y1 : this.f1531z1).m3893a();
        }
        if (i7 != 1) {
            if (i7 == 2 && (m1039f = m1039f(absoluteGravity)) != null) {
                m1046s(m1039f);
                return;
            }
            return;
        }
        View m1039f2 = m1039f(absoluteGravity);
        if (m1039f2 != null) {
            m1036c(m1039f2, true);
        }
    }

    /* renamed from: v */
    public final void m1049v(View view, float f7) {
        C0309e c0309e = (C0309e) view.getLayoutParams();
        if (f7 == c0309e.f1536b) {
            return;
        }
        c0309e.f1536b = f7;
        ArrayList arrayList = this.f1514L1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC0308d) this.f1514L1.get(size)).mo1057b(f7);
            }
        }
    }

    /* renamed from: w */
    public final void m1050w(View view) {
        C1151g.a aVar = C1151g.a.f5695l;
        C0946x.m2814o(view, aVar.m3347a());
        C0946x.m2809j(view, 0);
        if (!m1031o(view) || m1043j(view) == 2) {
            return;
        }
        C0946x.m2815p(view, aVar, this.f1523U1);
    }

    /* renamed from: x */
    public final void m1051x(View view, boolean z6) {
        int i7;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((z6 || m1032p(childAt)) && !(z6 && childAt == view)) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                i7 = 4;
            } else {
                WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
                i7 = 1;
            }
            C0946x.d.m2843s(childAt, i7);
        }
    }

    /* renamed from: y */
    public final void m1052y(View view, int i7) {
        int i8;
        View rootView;
        int i9 = this.f1530y1.f7071a;
        int i10 = this.f1531z1.f7071a;
        if (i9 == 1 || i10 == 1) {
            i8 = 1;
        } else {
            i8 = 2;
            if (i9 != 2 && i10 != 2) {
                i8 = 0;
            }
        }
        if (view != null && i7 == 0) {
            float f7 = ((C0309e) view.getLayoutParams()).f1536b;
            if (f7 == 0.0f) {
                C0309e c0309e = (C0309e) view.getLayoutParams();
                if ((c0309e.f1538d & 1) == 1) {
                    c0309e.f1538d = 0;
                    ArrayList arrayList = this.f1514L1;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((InterfaceC0308d) this.f1514L1.get(size)).mo1059d(view);
                        }
                    }
                    m1051x(view, false);
                    m1050w(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f7 == 1.0f) {
                C0309e c0309e2 = (C0309e) view.getLayoutParams();
                if ((c0309e2.f1538d & 1) == 0) {
                    c0309e2.f1538d = 1;
                    ArrayList arrayList2 = this.f1514L1;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((InterfaceC0308d) this.f1514L1.get(size2)).mo1058c(view);
                        }
                    }
                    m1051x(view, true);
                    m1050w(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i8 != this.f1505C1) {
            this.f1505C1 = i8;
            ArrayList arrayList3 = this.f1514L1;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((InterfaceC0308d) this.f1514L1.get(size3)).mo1056a();
                }
            }
        }
    }
}
