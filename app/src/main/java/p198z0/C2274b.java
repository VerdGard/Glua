package p198z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.ext.C0090b;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.AbstractC0378x;
import androidx.fragment.app.ComponentCallbacksC0361n;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import p034e0.C0908a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p082k0.AbstractC1446a;
import p122p1.AbstractC1693a;
import p137r1.AbstractC1821a;
import p166v.C2009a;

/* renamed from: z0.b */
/* loaded from: classes.dex */
public class C2274b extends ViewGroup {

    /* renamed from: n2 */
    public static final int[] f10374n2 = {R.attr.layout_gravity};

    /* renamed from: o2 */
    public static final a f10375o2 = new a();

    /* renamed from: p2 */
    public static final b f10376p2 = new b();

    /* renamed from: A1 */
    public ClassLoader f10377A1;

    /* renamed from: B1 */
    public Scroller f10378B1;

    /* renamed from: C1 */
    public boolean f10379C1;

    /* renamed from: D1 */
    public i f10380D1;

    /* renamed from: E1 */
    public int f10381E1;

    /* renamed from: F1 */
    public Drawable f10382F1;

    /* renamed from: G1 */
    public int f10383G1;

    /* renamed from: H1 */
    public int f10384H1;

    /* renamed from: I1 */
    public float f10385I1;

    /* renamed from: J1 */
    public float f10386J1;

    /* renamed from: K1 */
    public int f10387K1;

    /* renamed from: L1 */
    public boolean f10388L1;

    /* renamed from: M1 */
    public boolean f10389M1;

    /* renamed from: N1 */
    public boolean f10390N1;

    /* renamed from: O1 */
    public int f10391O1;

    /* renamed from: P1 */
    public boolean f10392P1;

    /* renamed from: Q1 */
    public boolean f10393Q1;

    /* renamed from: R1 */
    public int f10394R1;

    /* renamed from: S1 */
    public int f10395S1;

    /* renamed from: T1 */
    public int f10396T1;

    /* renamed from: U1 */
    public float f10397U1;

    /* renamed from: V1 */
    public float f10398V1;

    /* renamed from: W1 */
    public float f10399W1;

    /* renamed from: X1 */
    public float f10400X1;

    /* renamed from: Y1 */
    public int f10401Y1;

    /* renamed from: Z1 */
    public VelocityTracker f10402Z1;

    /* renamed from: a2 */
    public int f10403a2;

    /* renamed from: b2 */
    public int f10404b2;

    /* renamed from: c */
    public int f10405c;

    /* renamed from: c2 */
    public int f10406c2;

    /* renamed from: d2 */
    public int f10407d2;

    /* renamed from: e */
    public final ArrayList<e> f10408e;

    /* renamed from: e2 */
    public EdgeEffect f10409e2;

    /* renamed from: f2 */
    public EdgeEffect f10410f2;

    /* renamed from: g2 */
    public boolean f10411g2;

    /* renamed from: h2 */
    public boolean f10412h2;

    /* renamed from: i2 */
    public int f10413i2;

    /* renamed from: j2 */
    public ArrayList f10414j2;

    /* renamed from: k2 */
    public h f10415k2;

    /* renamed from: l2 */
    public final c f10416l2;

    /* renamed from: m */
    public final e f10417m;

    /* renamed from: m2 */
    public int f10418m2;

    /* renamed from: s */
    public final Rect f10419s;

    /* renamed from: w1 */
    public AbstractC2273a f10420w1;

    /* renamed from: x1 */
    public int f10421x1;

    /* renamed from: y1 */
    public int f10422y1;

    /* renamed from: z1 */
    public Parcelable f10423z1;

    /* renamed from: z0.b$a */
    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f10426b - eVar2.f10426b;
        }
    }

    /* renamed from: z0.b$b */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    /* renamed from: z0.b$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2274b c2274b = C2274b.this;
            c2274b.setScrollState(0);
            c2274b.m5520p();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: z0.b$d */
    public @interface d {
    }

    /* renamed from: z0.b$e */
    public static class e {

        /* renamed from: a */
        public Object f10425a;

        /* renamed from: b */
        public int f10426b;

        /* renamed from: c */
        public boolean f10427c;

        /* renamed from: d */
        public float f10428d;

        /* renamed from: e */
        public float f10429e;
    }

    /* renamed from: z0.b$f */
    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f10430a;

        /* renamed from: b */
        public final int f10431b;

        /* renamed from: c */
        public float f10432c;

        /* renamed from: d */
        public boolean f10433d;

        public f() {
            super(-1, -1);
            this.f10432c = 0.0f;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10432c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2274b.f10374n2);
            this.f10431b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: z0.b$g */
    public class g extends C0908a {
        public g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
        
            if (r0.mo4299c() > 1) goto L8;
         */
        @Override // p034e0.C0908a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo1026c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            /*
                r2 = this;
                super.mo1026c(r3, r4)
                java.lang.Class<z0.b> r3 = p198z0.C2274b.class
                java.lang.String r3 = r3.getName()
                r4.setClassName(r3)
                z0.b r3 = p198z0.C2274b.this
                z0.a r0 = r3.f10420w1
                if (r0 == 0) goto L1a
                int r0 = r0.mo4299c()
                r1 = 1
                if (r0 <= r1) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                r4.setScrollable(r1)
                int r0 = r4.getEventType()
                r1 = 4096(0x1000, float:5.74E-42)
                if (r0 != r1) goto L3b
                z0.a r0 = r3.f10420w1
                if (r0 == 0) goto L3b
                int r0 = r0.mo4299c()
                r4.setItemCount(r0)
                int r0 = r3.f10421x1
                r4.setFromIndex(r0)
                int r3 = r3.f10421x1
                r4.setToIndex(r3)
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p198z0.C2274b.g.mo1026c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
        }

        @Override // p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            this.f4774a.onInitializeAccessibilityNodeInfo(view, c1151g.f5685a);
            c1151g.m3342g(C2274b.class.getName());
            C2274b c2274b = C2274b.this;
            AbstractC2273a abstractC2273a = c2274b.f10420w1;
            c1151g.m3345j(abstractC2273a != null && abstractC2273a.mo4299c() > 1);
            if (c2274b.canScrollHorizontally(1)) {
                c1151g.m3336a(4096);
            }
            if (c2274b.canScrollHorizontally(-1)) {
                c1151g.m3336a(8192);
            }
        }

        @Override // p034e0.C0908a
        /* renamed from: g */
        public final boolean mo135g(View view, int i7, Bundle bundle) {
            int i8;
            if (super.mo135g(view, i7, bundle)) {
                return true;
            }
            C2274b c2274b = C2274b.this;
            if (i7 != 4096) {
                if (i7 != 8192 || !c2274b.canScrollHorizontally(-1)) {
                    return false;
                }
                i8 = c2274b.f10421x1 - 1;
            } else {
                if (!c2274b.canScrollHorizontally(1)) {
                    return false;
                }
                i8 = c2274b.f10421x1 + 1;
            }
            c2274b.setCurrentItem(i8);
            return true;
        }
    }

    /* renamed from: z0.b$h */
    public interface h {
        /* renamed from: a */
        void mo116a(int i7);

        /* renamed from: b */
        void mo117b(int i7);

        /* renamed from: d */
        void mo119d(float f7, int i7, int i8);
    }

    /* renamed from: z0.b$i */
    public class i extends DataSetObserver {
        public i() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            C2274b.this.m5509e();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            C2274b.this.m5509e();
        }
    }

    /* renamed from: z0.b$j */
    public static class j extends AbstractC1446a {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: X */
        public final ClassLoader f10436X;

        /* renamed from: m */
        public int f10437m;

        /* renamed from: s */
        public Parcelable f10438s;

        /* renamed from: z0.b$j$a */
        public static class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new j[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? j.class.getClassLoader() : classLoader;
            this.f10437m = parcel.readInt();
            this.f10438s = parcel.readParcelable(classLoader);
            this.f10436X = classLoader;
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f10437m + "}";
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeInt(this.f10437m);
            parcel.writeParcelable(this.f10438s, i7);
        }
    }

    public C2274b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10408e = new ArrayList<>();
        this.f10417m = new e();
        this.f10419s = new Rect();
        this.f10422y1 = -1;
        this.f10423z1 = null;
        this.f10377A1 = null;
        this.f10385I1 = -3.4028235E38f;
        this.f10386J1 = Float.MAX_VALUE;
        this.f10391O1 = 1;
        this.f10401Y1 = -1;
        this.f10411g2 = true;
        this.f10416l2 = new c();
        this.f10418m2 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f10378B1 = new Scroller(context2, f10376p2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f7 = context2.getResources().getDisplayMetrics().density;
        this.f10396T1 = viewConfiguration.getScaledPagingTouchSlop();
        this.f10403a2 = (int) (400.0f * f7);
        this.f10404b2 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10409e2 = new EdgeEffect(context2);
        this.f10410f2 = new EdgeEffect(context2);
        this.f10406c2 = (int) (25.0f * f7);
        this.f10407d2 = (int) (2.0f * f7);
        this.f10394R1 = (int) (f7 * 16.0f);
        C0946x.m2817r(this, new g());
        if (C0946x.d.m2827c(this) == 0) {
            C0946x.d.m2843s(this, 1);
        }
        C0946x.i.m2888u(this, new C2275c(this));
    }

    /* renamed from: c */
    public static boolean m5505c(int i7, int i8, int i9, View view, boolean z6) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i11 = i8 + scrollX;
                if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && (i10 = i9 + scrollY) >= childAt.getTop() && i10 < childAt.getBottom() && m5505c(i7, i11 - childAt.getLeft(), i10 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z6 && view.canScrollHorizontally(-i7);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z6) {
        if (this.f10389M1 != z6) {
            this.f10389M1 = z6;
        }
    }

    /* renamed from: a */
    public final e m5506a(int i7, int i8) {
        e eVar = new e();
        eVar.f10426b = i7;
        eVar.f10425a = this.f10420w1.mo4119d(this, i7);
        this.f10420w1.getClass();
        eVar.f10428d = 1.0f;
        ArrayList<e> arrayList = this.f10408e;
        if (i8 < 0 || i8 >= arrayList.size()) {
            arrayList.add(eVar);
        } else {
            arrayList.add(i8, eVar);
        }
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i7, int i8) {
        e m5512h;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() == 0 && (m5512h = m5512h(childAt)) != null && m5512h.f10426b == this.f10421x1) {
                    childAt.addFocusables(arrayList, i7, i8);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i8 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        e m5512h;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (m5512h = m5512h(childAt)) != null && m5512h.f10426b == this.f10421x1) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean z6 = fVar.f10430a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f10430a = z6;
        if (!this.f10388L1) {
            super.addView(view, i7, layoutParams);
        } else {
            if (z6) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f10433d = true;
            addViewInLayout(view, i7, layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r0 > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        mo2210u(r0 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        if (r0 <= 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5507b(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r7) goto L9
            goto L63
        L9:
            if (r0 == 0) goto L64
            android.view.ViewParent r3 = r0.getParent()
        Lf:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L1c
            if (r3 != r7) goto L17
            r3 = 1
            goto L1d
        L17:
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L1c:
            r3 = 0
        L1d:
            if (r3 != 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L33:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L4c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L63:
            r0 = 0
        L64:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r7, r0, r8)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Laa
            if (r3 == r0) goto Laa
            android.graphics.Rect r6 = r7.f10419s
            if (r8 != r5) goto L8d
            android.graphics.Rect r4 = r7.m5511g(r3, r6)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.m5511g(r0, r6)
            int r5 = r5.left
            if (r0 == 0) goto La4
            if (r4 < r5) goto La4
            int r0 = r7.f10421x1
            if (r0 <= 0) goto Lc2
            goto Lbd
        L8d:
            if (r8 != r4) goto Lc4
            android.graphics.Rect r1 = r7.m5511g(r3, r6)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.m5511g(r0, r6)
            int r2 = r2.left
            if (r0 == 0) goto La4
            if (r1 > r2) goto La4
            boolean r0 = r7.m5517m()
            goto La8
        La4:
            boolean r0 = r3.requestFocus()
        La8:
            r2 = r0
            goto Lc4
        Laa:
            if (r8 == r5) goto Lb9
            if (r8 != r1) goto Laf
            goto Lb9
        Laf:
            if (r8 == r4) goto Lb4
            r0 = 2
            if (r8 != r0) goto Lc4
        Lb4:
            boolean r2 = r7.m5517m()
            goto Lc4
        Lb9:
            int r0 = r7.f10421x1
            if (r0 <= 0) goto Lc2
        Lbd:
            int r0 = r0 - r1
            r7.mo2210u(r0)
            goto Lc3
        Lc2:
            r1 = 0
        Lc3:
            r2 = r1
        Lc4:
            if (r2 == 0) goto Lcd
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p198z0.C2274b.m5507b(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        if (this.f10420w1 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i7 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f10385I1)) : i7 > 0 && scrollX < ((int) (((float) clientWidth) * this.f10386J1));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f10379C1 = true;
        if (this.f10378B1.isFinished() || !this.f10378B1.computeScrollOffset()) {
            m5508d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f10378B1.getCurrX();
        int currY = this.f10378B1.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m5518n(currX)) {
                this.f10378B1.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2835k(this);
    }

    /* renamed from: d */
    public final void m5508d(boolean z6) {
        boolean z7 = this.f10418m2 == 2;
        if (z7) {
            setScrollingCacheEnabled(false);
            if (!this.f10378B1.isFinished()) {
                this.f10378B1.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f10378B1.getCurrX();
                int currY = this.f10378B1.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m5518n(currX);
                    }
                }
            }
        }
        this.f10390N1 = false;
        int i7 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f10408e;
            if (i7 >= arrayList.size()) {
                break;
            }
            e eVar = arrayList.get(i7);
            if (eVar.f10427c) {
                eVar.f10427c = false;
                z7 = true;
            }
            i7++;
        }
        if (z7) {
            c cVar = this.f10416l2;
            if (!z6) {
                cVar.run();
            } else {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2837m(this, cVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L60
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5b
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L44
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5b
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.m5507b(r4)
            goto L5c
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5b
            boolean r6 = r5.m5507b(r1)
            goto L5c
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.m5517m()
            goto L5c
        L41:
            r6 = 66
            goto L56
        L44:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L54
            int r6 = r5.f10421x1
            if (r6 <= 0) goto L5b
            int r6 = r6 - r1
            r5.mo2210u(r6)
            r6 = 1
            goto L5c
        L54:
            r6 = 17
        L56:
            boolean r6 = r5.m5507b(r6)
            goto L5c
        L5b:
            r6 = 0
        L5c:
            if (r6 == 0) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p198z0.C2274b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e m5512h;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (m5512h = m5512h(childAt)) != null && m5512h.f10426b == this.f10421x1 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC2273a abstractC2273a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z6 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC2273a = this.f10420w1) != null && abstractC2273a.mo4299c() > 1)) {
            if (!this.f10409e2.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f10385I1 * width);
                this.f10409e2.setSize(height, width);
                z6 = false | this.f10409e2.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f10410f2.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f10386J1 + 1.0f)) * width2);
                this.f10410f2.setSize(height2, width2);
                z6 |= this.f10410f2.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f10409e2.finish();
            this.f10410f2.finish();
        }
        if (z6) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10382F1;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    /* renamed from: e */
    public final void m5509e() {
        int i7;
        int mo4299c = this.f10420w1.mo4299c();
        this.f10405c = mo4299c;
        ArrayList<e> arrayList = this.f10408e;
        boolean z6 = arrayList.size() < (this.f10391O1 * 2) + 1 && arrayList.size() < mo4299c;
        int i8 = this.f10421x1;
        int i9 = 0;
        boolean z7 = false;
        while (i9 < arrayList.size()) {
            e eVar = arrayList.get(i9);
            AbstractC2273a abstractC2273a = this.f10420w1;
            Object obj = eVar.f10425a;
            AbstractC1821a abstractC1821a = (AbstractC1821a) abstractC2273a;
            if (!abstractC1821a.f8251e.contains(obj)) {
                i7 = -2;
            } else if (abstractC1821a.f8250d.size() != abstractC1821a.f8251e.size()) {
                int indexOf = abstractC1821a.f8251e.indexOf(obj);
                i7 = !abstractC1821a.f8250d.get(indexOf) ? indexOf : -1;
                abstractC1821a.f8250d.put(indexOf, true);
            } else {
                i7 = -1;
            }
            if (i7 != -1) {
                if (i7 == -2) {
                    arrayList.remove(i9);
                    i9--;
                    if (!z7) {
                        this.f10420w1.getClass();
                        z7 = true;
                    }
                    this.f10420w1.mo4117a(eVar.f10426b, eVar.f10425a);
                    int i10 = this.f10421x1;
                    if (i10 == eVar.f10426b) {
                        i8 = Math.max(0, Math.min(i10, (-1) + mo4299c));
                    }
                } else {
                    int i11 = eVar.f10426b;
                    if (i11 != i7) {
                        if (i11 == this.f10421x1) {
                            i8 = i7;
                        }
                        eVar.f10426b = i7;
                    }
                }
                z6 = true;
            }
            i9++;
        }
        if (z7) {
            this.f10420w1.mo4118b();
        }
        Collections.sort(arrayList, f10375o2);
        if (z6) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                f fVar = (f) getChildAt(i12).getLayoutParams();
                if (!fVar.f10430a) {
                    fVar.f10432c = 0.0f;
                }
            }
            m5525v(i8, 0, false, true);
            requestLayout();
        }
    }

    /* renamed from: f */
    public final void m5510f(int i7) {
        h hVar = this.f10415k2;
        if (hVar != null) {
            hVar.mo117b(i7);
        }
        ArrayList arrayList = this.f10414j2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                h hVar2 = (h) this.f10414j2.get(i8);
                if (hVar2 != null) {
                    hVar2.mo117b(i7);
                }
            }
        }
    }

    /* renamed from: g */
    public final Rect m5511g(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC2273a getAdapter() {
        return this.f10420w1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f10421x1;
    }

    public int getOffscreenPageLimit() {
        return this.f10391O1;
    }

    public int getPageMargin() {
        return this.f10381E1;
    }

    /* renamed from: h */
    public final e m5512h(View view) {
        int i7 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f10408e;
            if (i7 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i7);
            AbstractC2273a abstractC2273a = this.f10420w1;
            Object obj = eVar.f10425a;
            ((AbstractC1693a) abstractC2273a).getClass();
            if (obj == view.getTag(com.so.revelation.lua.R.id.avpa_view_tag_key)) {
                return eVar;
            }
            i7++;
        }
    }

    /* renamed from: i */
    public final e m5513i() {
        e eVar;
        int i7;
        int clientWidth = getClientWidth();
        float f7 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f8 = clientWidth > 0 ? this.f10381E1 / clientWidth : 0.0f;
        e eVar2 = null;
        float f9 = 0.0f;
        int i8 = -1;
        int i9 = 0;
        boolean z6 = true;
        while (true) {
            ArrayList<e> arrayList = this.f10408e;
            if (i9 >= arrayList.size()) {
                return eVar2;
            }
            e eVar3 = arrayList.get(i9);
            if (z6 || eVar3.f10426b == (i7 = i8 + 1)) {
                eVar = eVar3;
            } else {
                float f10 = f7 + f9 + f8;
                e eVar4 = this.f10417m;
                eVar4.f10429e = f10;
                eVar4.f10426b = i7;
                this.f10420w1.getClass();
                eVar4.f10428d = 1.0f;
                i9--;
                eVar = eVar4;
            }
            f7 = eVar.f10429e;
            float f11 = eVar.f10428d + f7 + f8;
            if (!z6 && scrollX < f7) {
                return eVar2;
            }
            if (scrollX < f11 || i9 == arrayList.size() - 1) {
                break;
            }
            int i10 = eVar.f10426b;
            float f12 = eVar.f10428d;
            i9++;
            z6 = false;
            e eVar5 = eVar;
            i8 = i10;
            f9 = f12;
            eVar2 = eVar5;
        }
        return eVar;
    }

    /* renamed from: j */
    public final e m5514j(int i7) {
        int i8 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f10408e;
            if (i8 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i8);
            if (eVar.f10426b == i7) {
                return eVar;
            }
            i8++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5515k(float r13, int r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f10413i2
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            z0.b$f r9 = (p198z0.C2274b.f) r9
            boolean r10 = r9.f10430a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f10431b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            z0.b$h r0 = r12.f10415k2
            if (r0 == 0) goto L72
            r0.mo119d(r13, r14, r15)
        L72:
            java.util.ArrayList r0 = r12.f10414j2
            if (r0 == 0) goto L8c
            int r0 = r0.size()
        L7a:
            if (r1 >= r0) goto L8c
            java.util.ArrayList r3 = r12.f10414j2
            java.lang.Object r3 = r3.get(r1)
            z0.b$h r3 = (p198z0.C2274b.h) r3
            if (r3 == 0) goto L89
            r3.mo119d(r13, r14, r15)
        L89:
            int r1 = r1 + 1
            goto L7a
        L8c:
            r12.f10412h2 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p198z0.C2274b.m5515k(float, int, int):void");
    }

    /* renamed from: l */
    public final void m5516l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10401Y1) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f10397U1 = motionEvent.getX(i7);
            this.f10401Y1 = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f10402Z1;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: m */
    public final boolean m5517m() {
        AbstractC2273a abstractC2273a = this.f10420w1;
        if (abstractC2273a == null || this.f10421x1 >= abstractC2273a.mo4299c() - 1) {
            return false;
        }
        mo2210u(this.f10421x1 + 1);
        return true;
    }

    /* renamed from: n */
    public final boolean m5518n(int i7) {
        if (this.f10408e.size() == 0) {
            if (this.f10411g2) {
                return false;
            }
            this.f10412h2 = false;
            m5515k(0.0f, 0, 0);
            if (this.f10412h2) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e m5513i = m5513i();
        int clientWidth = getClientWidth();
        int i8 = this.f10381E1;
        int i9 = clientWidth + i8;
        float f7 = clientWidth;
        int i10 = m5513i.f10426b;
        float f8 = ((i7 / f7) - m5513i.f10429e) / (m5513i.f10428d + (i8 / f7));
        this.f10412h2 = false;
        m5515k(f8, i10, (int) (i9 * f8));
        if (this.f10412h2) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: o */
    public final boolean m5519o(float f7) {
        boolean z6;
        boolean z7;
        float f8 = this.f10397U1 - f7;
        this.f10397U1 = f7;
        float scrollX = getScrollX() + f8;
        float clientWidth = getClientWidth();
        float f9 = this.f10385I1 * clientWidth;
        float f10 = this.f10386J1 * clientWidth;
        ArrayList<e> arrayList = this.f10408e;
        boolean z8 = false;
        e eVar = arrayList.get(0);
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f10426b != 0) {
            f9 = eVar.f10429e * clientWidth;
            z6 = false;
        } else {
            z6 = true;
        }
        if (eVar2.f10426b != this.f10420w1.mo4299c() - 1) {
            f10 = eVar2.f10429e * clientWidth;
            z7 = false;
        } else {
            z7 = true;
        }
        if (scrollX < f9) {
            if (z6) {
                this.f10409e2.onPull(Math.abs(f9 - scrollX) / clientWidth);
                z8 = true;
            }
            scrollX = f9;
        } else if (scrollX > f10) {
            if (z7) {
                this.f10410f2.onPull(Math.abs(scrollX - f10) / clientWidth);
                z8 = true;
            }
            scrollX = f10;
        }
        int i7 = (int) scrollX;
        this.f10397U1 = (scrollX - i7) + this.f10397U1;
        scrollTo(i7, getScrollY());
        m5518n(i7);
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10411g2 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f10416l2);
        Scroller scroller = this.f10378B1;
        if (scroller != null && !scroller.isFinished()) {
            this.f10378B1.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f7;
        ArrayList<e> arrayList;
        float f8;
        super.onDraw(canvas);
        if (this.f10381E1 <= 0 || this.f10382F1 == null) {
            return;
        }
        ArrayList<e> arrayList2 = this.f10408e;
        if (arrayList2.size() <= 0 || this.f10420w1 == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f9 = this.f10381E1 / width;
        int i8 = 0;
        e eVar = arrayList2.get(0);
        float f10 = eVar.f10429e;
        int size = arrayList2.size();
        int i9 = eVar.f10426b;
        int i10 = arrayList2.get(size - 1).f10426b;
        while (i9 < i10) {
            while (true) {
                i7 = eVar.f10426b;
                if (i9 <= i7 || i8 >= size) {
                    break;
                }
                i8++;
                eVar = arrayList2.get(i8);
            }
            if (i9 == i7) {
                float f11 = eVar.f10429e;
                float f12 = eVar.f10428d;
                f7 = (f11 + f12) * width;
                f10 = f11 + f12 + f9;
            } else {
                this.f10420w1.getClass();
                f7 = (f10 + 1.0f) * width;
                f10 = 1.0f + f9 + f10;
            }
            if (this.f10381E1 + f7 > scrollX) {
                arrayList = arrayList2;
                f8 = f9;
                this.f10382F1.setBounds(Math.round(f7), this.f10383G1, Math.round(this.f10381E1 + f7), this.f10384H1);
                this.f10382F1.draw(canvas);
            } else {
                arrayList = arrayList2;
                f8 = f9;
            }
            if (f7 > scrollX + r3) {
                return;
            }
            i9++;
            arrayList2 = arrayList;
            f9 = f8;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m5523s();
            return false;
        }
        if (action != 0) {
            if (this.f10392P1) {
                return true;
            }
            if (this.f10393Q1) {
                return false;
            }
        }
        if (action == 0) {
            float x7 = motionEvent.getX();
            this.f10399W1 = x7;
            this.f10397U1 = x7;
            float y7 = motionEvent.getY();
            this.f10400X1 = y7;
            this.f10398V1 = y7;
            this.f10401Y1 = motionEvent.getPointerId(0);
            this.f10393Q1 = false;
            this.f10379C1 = true;
            this.f10378B1.computeScrollOffset();
            if (this.f10418m2 != 2 || Math.abs(this.f10378B1.getFinalX() - this.f10378B1.getCurrX()) <= this.f10407d2) {
                m5508d(false);
                this.f10392P1 = false;
            } else {
                this.f10378B1.abortAnimation();
                this.f10390N1 = false;
                m5520p();
                this.f10392P1 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i7 = this.f10401Y1;
            if (i7 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i7);
                float x8 = motionEvent.getX(findPointerIndex);
                float f7 = x8 - this.f10397U1;
                float abs = Math.abs(f7);
                float y8 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y8 - this.f10400X1);
                if (f7 != 0.0f) {
                    float f8 = this.f10397U1;
                    if (!((f8 < ((float) this.f10395S1) && f7 > 0.0f) || (f8 > ((float) (getWidth() - this.f10395S1)) && f7 < 0.0f)) && m5505c((int) f7, (int) x8, (int) y8, this, false)) {
                        this.f10397U1 = x8;
                        this.f10398V1 = y8;
                        this.f10393Q1 = true;
                        return false;
                    }
                }
                float f9 = this.f10396T1;
                if (abs > f9 && abs * 0.5f > abs2) {
                    this.f10392P1 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f10 = this.f10399W1;
                    float f11 = this.f10396T1;
                    this.f10397U1 = f7 > 0.0f ? f10 + f11 : f10 - f11;
                    this.f10398V1 = y8;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f9) {
                    this.f10393Q1 = true;
                }
                if (this.f10392P1 && m5519o(x8)) {
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    C0946x.d.m2835k(this);
                }
            }
        } else if (action == 6) {
            m5516l(motionEvent);
        }
        if (this.f10402Z1 == null) {
            this.f10402Z1 = VelocityTracker.obtain();
        }
        this.f10402Z1.addMovement(motionEvent);
        return this.f10392P1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198z0.C2274b.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198z0.C2274b.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i8;
        int i9;
        int i10;
        e m5512h;
        int childCount = getChildCount();
        if ((i7 & 2) != 0) {
            i9 = childCount;
            i8 = 0;
            i10 = 1;
        } else {
            i8 = childCount - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i8 != i9) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 0 && (m5512h = m5512h(childAt)) != null && m5512h.f10426b == this.f10421x1 && childAt.requestFocus(i7, rect)) {
                return true;
            }
            i8 += i10;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f6946c);
        AbstractC2273a abstractC2273a = this.f10420w1;
        ClassLoader classLoader = jVar.f10436X;
        if (abstractC2273a != null) {
            abstractC2273a.mo4120f(jVar.f10438s, classLoader);
            m5525v(jVar.f10437m, 0, false, true);
        } else {
            this.f10422y1 = jVar.f10437m;
            this.f10423z1 = jVar.f10438s;
            this.f10377A1 = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f10437m = this.f10421x1;
        AbstractC2273a abstractC2273a = this.f10420w1;
        if (abstractC2273a != null) {
            AbstractC1693a abstractC1693a = (AbstractC1693a) abstractC2273a;
            Bundle bundle = new Bundle();
            ArrayList<ComponentCallbacksC0361n.e> arrayList = abstractC1693a.f7631l;
            if (arrayList.size() > 0) {
                ComponentCallbacksC0361n.e[] eVarArr = new ComponentCallbacksC0361n.e[arrayList.size()];
                arrayList.toArray(eVarArr);
                bundle.putParcelableArray("states", eVarArr);
            }
            int i7 = 0;
            while (true) {
                ArrayList<ComponentCallbacksC0361n> arrayList2 = abstractC1693a.f7629j;
                if (i7 < arrayList2.size()) {
                    ComponentCallbacksC0361n componentCallbacksC0361n = arrayList2.get(i7);
                    if (componentCallbacksC0361n != null) {
                        if (componentCallbacksC0361n.f1781I1 != null && componentCallbacksC0361n.f1773A1) {
                            String m219e = C0090b.m219e("f", i7);
                            AbstractC0378x abstractC0378x = abstractC1693a.f7628i;
                            abstractC0378x.getClass();
                            if (componentCallbacksC0361n.f1780H1 != abstractC0378x) {
                                abstractC0378x.m1314b0(new IllegalStateException("Fragment " + componentCallbacksC0361n + " is not currently in the FragmentManager"));
                                throw null;
                            }
                            bundle.putString(m219e, componentCallbacksC0361n.f1798Y);
                        } else {
                            continue;
                        }
                    }
                    i7++;
                } else {
                    AbstractC1693a.a aVar = abstractC1693a.f7630k;
                    if (aVar != null) {
                        aVar.mo4122b(bundle, abstractC1693a.m4300h());
                    }
                    jVar.f10438s = bundle;
                }
            }
        }
        return jVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 != i9) {
            int i11 = this.f10381E1;
            m5522r(i7, i9, i11, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0198  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198z0.C2274b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m5520p() {
        m5521q(this.f10421x1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x00c1, code lost:
    
        if (r8 >= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00cf, code lost:
    
        if (r8 >= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r8 == r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        if (r8 >= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
    
        r9 = r6.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0126, code lost:
    
        if (r12 < r6.size()) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0151, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014a, code lost:
    
        r9 = r6.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0138, code lost:
    
        if (r12 < r6.size()) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0148, code lost:
    
        if (r12 < r6.size()) goto L94;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5521q(int r18) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198z0.C2274b.m5521q(int):void");
    }

    /* renamed from: r */
    public final void m5522r(int i7, int i8, int i9, int i10) {
        int min;
        if (i8 <= 0 || this.f10408e.isEmpty()) {
            e m5514j = m5514j(this.f10421x1);
            min = (int) ((m5514j != null ? Math.min(m5514j.f10429e, this.f10386J1) : 0.0f) * ((i7 - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            } else {
                m5508d(false);
            }
        } else if (!this.f10378B1.isFinished()) {
            this.f10378B1.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i8 - getPaddingLeft()) - getPaddingRight()) + i10)) * (((i7 - getPaddingLeft()) - getPaddingRight()) + i9));
        }
        scrollTo(min, getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f10388L1) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public final boolean m5523s() {
        this.f10401Y1 = -1;
        this.f10392P1 = false;
        this.f10393Q1 = false;
        VelocityTracker velocityTracker = this.f10402Z1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10402Z1 = null;
        }
        this.f10409e2.onRelease();
        this.f10410f2.onRelease();
        return this.f10409e2.isFinished() || this.f10410f2.isFinished();
    }

    public void setAdapter(AbstractC2273a abstractC2273a) {
        ArrayList<e> arrayList;
        AbstractC2273a abstractC2273a2 = this.f10420w1;
        if (abstractC2273a2 != null) {
            synchronized (abstractC2273a2) {
                abstractC2273a2.f10373b = null;
            }
            this.f10420w1.getClass();
            int i7 = 0;
            while (true) {
                arrayList = this.f10408e;
                if (i7 >= arrayList.size()) {
                    break;
                }
                e eVar = arrayList.get(i7);
                this.f10420w1.mo4117a(eVar.f10426b, eVar.f10425a);
                i7++;
            }
            this.f10420w1.mo4118b();
            arrayList.clear();
            int i8 = 0;
            while (i8 < getChildCount()) {
                if (!((f) getChildAt(i8).getLayoutParams()).f10430a) {
                    removeViewAt(i8);
                    i8--;
                }
                i8++;
            }
            this.f10421x1 = 0;
            scrollTo(0, 0);
        }
        this.f10420w1 = abstractC2273a;
        this.f10405c = 0;
        if (abstractC2273a != null) {
            if (this.f10380D1 == null) {
                this.f10380D1 = new i();
            }
            this.f10420w1.m5504g(this.f10380D1);
            this.f10390N1 = false;
            boolean z6 = this.f10411g2;
            this.f10411g2 = true;
            this.f10405c = this.f10420w1.mo4299c();
            if (this.f10422y1 < 0) {
                if (z6) {
                    requestLayout();
                    return;
                } else {
                    m5520p();
                    return;
                }
            }
            this.f10420w1.mo4120f(this.f10423z1, this.f10377A1);
            m5525v(this.f10422y1, 0, false, true);
            this.f10422y1 = -1;
            this.f10423z1 = null;
            this.f10377A1 = null;
        }
    }

    public void setCurrentItem(int i7) {
        this.f10390N1 = false;
        m5525v(i7, 0, !this.f10411g2, false);
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i7 + " too small; defaulting to 1");
            i7 = 1;
        }
        if (i7 != this.f10391O1) {
            this.f10391O1 = i7;
            m5520p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.f10415k2 = hVar;
    }

    public void setPageMargin(int i7) {
        int i8 = this.f10381E1;
        this.f10381E1 = i7;
        int width = getWidth();
        m5522r(width, width, i7, i8);
        requestLayout();
    }

    public void setPageMarginDrawable(int i7) {
        Context context = getContext();
        Object obj = C2009a.f9156a;
        setPageMarginDrawable(C2009a.c.m4903b(context, i7));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f10382F1 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i7) {
        if (this.f10418m2 == i7) {
            return;
        }
        this.f10418m2 = i7;
        h hVar = this.f10415k2;
        if (hVar != null) {
            hVar.mo116a(i7);
        }
        ArrayList arrayList = this.f10414j2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                h hVar2 = (h) this.f10414j2.get(i8);
                if (hVar2 != null) {
                    hVar2.mo116a(i7);
                }
            }
        }
    }

    /* renamed from: t */
    public final void m5524t(int i7, int i8, boolean z6, boolean z7) {
        int scrollX;
        int abs;
        e m5514j = m5514j(i7);
        int max = m5514j != null ? (int) (Math.max(this.f10385I1, Math.min(m5514j.f10429e, this.f10386J1)) * getClientWidth()) : 0;
        if (!z6) {
            if (z7) {
                m5510f(i7);
            }
            m5508d(false);
            scrollTo(max, 0);
            m5518n(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.f10378B1;
            if ((scroller == null || scroller.isFinished()) ? false : true) {
                scrollX = this.f10379C1 ? this.f10378B1.getCurrX() : this.f10378B1.getStartX();
                this.f10378B1.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                scrollX = getScrollX();
            }
            int i9 = scrollX;
            int scrollY = getScrollY();
            int i10 = max - i9;
            int i11 = 0 - scrollY;
            if (i10 == 0 && i11 == 0) {
                m5508d(false);
                m5520p();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i12 = clientWidth / 2;
                float f7 = clientWidth;
                float f8 = i12;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i10) * 1.0f) / f7) - 0.5f) * 0.47123894f)) * f8) + f8;
                int abs2 = Math.abs(i8);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f10420w1.getClass();
                    abs = (int) (((Math.abs(i10) / ((f7 * 1.0f) + this.f10381E1)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f10379C1 = false;
                this.f10378B1.startScroll(i9, scrollY, i10, i11, min);
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2835k(this);
            }
        }
        if (z7) {
            m5510f(i7);
        }
    }

    /* renamed from: u */
    public void mo2210u(int i7) {
        this.f10390N1 = false;
        m5525v(i7, 0, true, false);
    }

    /* renamed from: v */
    public final void m5525v(int i7, int i8, boolean z6, boolean z7) {
        AbstractC2273a abstractC2273a = this.f10420w1;
        if (abstractC2273a == null || abstractC2273a.mo4299c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<e> arrayList = this.f10408e;
        if (!z7 && this.f10421x1 == i7 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 >= this.f10420w1.mo4299c()) {
            i7 = this.f10420w1.mo4299c() - 1;
        }
        int i9 = this.f10391O1;
        int i10 = this.f10421x1;
        if (i7 > i10 + i9 || i7 < i10 - i9) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.get(i11).f10427c = true;
            }
        }
        boolean z8 = this.f10421x1 != i7;
        if (!this.f10411g2) {
            m5521q(i7);
            m5524t(i7, i8, z6, z8);
        } else {
            this.f10421x1 = i7;
            if (z8) {
                m5510f(i7);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10382F1;
    }
}
