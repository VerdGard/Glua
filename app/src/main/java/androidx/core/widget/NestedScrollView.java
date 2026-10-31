package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p016c.C0548d;
import p034e0.C0908a;
import p034e0.C0923h0;
import p034e0.C0930l;
import p034e0.C0936o;
import p034e0.C0946x;
import p034e0.InterfaceC0928k;
import p034e0.InterfaceC0934n;
import p042f0.C1151g;
import p042f0.C1153i;
import p066i0.C1309c;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0934n, InterfaceC0928k {

    /* renamed from: T1 */
    public static final float f1466T1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: U1 */
    public static final C0301a f1467U1 = new C0301a();

    /* renamed from: V1 */
    public static final int[] f1468V1 = {R.attr.fillViewport};

    /* renamed from: A1 */
    public boolean f1469A1;

    /* renamed from: B1 */
    public View f1470B1;

    /* renamed from: C1 */
    public boolean f1471C1;

    /* renamed from: D1 */
    public VelocityTracker f1472D1;

    /* renamed from: E1 */
    public boolean f1473E1;

    /* renamed from: F1 */
    public boolean f1474F1;

    /* renamed from: G1 */
    public int f1475G1;

    /* renamed from: H1 */
    public int f1476H1;

    /* renamed from: I1 */
    public int f1477I1;

    /* renamed from: J1 */
    public int f1478J1;

    /* renamed from: K1 */
    public final int[] f1479K1;

    /* renamed from: L1 */
    public final int[] f1480L1;

    /* renamed from: M1 */
    public int f1481M1;

    /* renamed from: N1 */
    public int f1482N1;

    /* renamed from: O1 */
    public C0304d f1483O1;

    /* renamed from: P1 */
    public final C0936o f1484P1;

    /* renamed from: Q1 */
    public final C0930l f1485Q1;

    /* renamed from: R1 */
    public float f1486R1;

    /* renamed from: S1 */
    public InterfaceC0303c f1487S1;

    /* renamed from: c */
    public final float f1488c;

    /* renamed from: e */
    public long f1489e;

    /* renamed from: m */
    public final Rect f1490m;

    /* renamed from: s */
    public OverScroller f1491s;

    /* renamed from: w1 */
    public final EdgeEffect f1492w1;

    /* renamed from: x1 */
    public final EdgeEffect f1493x1;

    /* renamed from: y1 */
    public int f1494y1;

    /* renamed from: z1 */
    public boolean f1495z1;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0301a extends C0908a {
        @Override // p034e0.C0908a
        /* renamed from: c */
        public final void mo1026c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1026c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C1153i.m3355c(accessibilityEvent, nestedScrollView.getScrollX());
            C1153i.m3356d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            int scrollRange;
            this.f4774a.onInitializeAccessibilityNodeInfo(view, c1151g.f5685a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c1151g.m3342g(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c1151g.m3345j(true);
            if (nestedScrollView.getScrollY() > 0) {
                c1151g.m3337b(C1151g.a.f5692i);
                c1151g.m3337b(C1151g.a.f5696m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c1151g.m3337b(C1151g.a.f5691h);
                c1151g.m3337b(C1151g.a.f5697n);
            }
        }

        @Override // p034e0.C0908a
        /* renamed from: g */
        public final boolean mo135g(View view, int i7, Bundle bundle) {
            if (super.mo135g(view, i7, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i7 != 4096) {
                if (i7 == 8192 || i7 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m1023u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                }
                if (i7 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m1023u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C0302b {
        /* renamed from: a */
        public static boolean m1027a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public interface InterfaceC0303c {
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    public static class C0304d extends View.BaseSavedState {
        public static final Parcelable.Creator<C0304d> CREATOR = new a();

        /* renamed from: c */
        public int f1496c;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        public class a implements Parcelable.Creator<C0304d> {
            @Override // android.os.Parcelable.Creator
            public final C0304d createFromParcel(Parcel parcel) {
                return new C0304d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C0304d[] newArray(int i7) {
                return new C0304d[i7];
            }
        }

        public C0304d(Parcel parcel) {
            super(parcel);
            this.f1496c = parcel.readInt();
        }

        public C0304d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1496c + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f1496c);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NestedScrollView(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r0 = androidx.core.R$attr.nestedScrollViewStyle
            r6.<init>(r7, r8, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.f1490m = r1
            r1 = 1
            r6.f1495z1 = r1
            r2 = 0
            r6.f1469A1 = r2
            r3 = 0
            r6.f1470B1 = r3
            r6.f1471C1 = r2
            r6.f1474F1 = r1
            r3 = -1
            r6.f1478J1 = r3
            r3 = 2
            int[] r4 = new int[r3]
            r6.f1479K1 = r4
            int[] r3 = new int[r3]
            r6.f1480L1 = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L30
            android.widget.EdgeEffect r5 = p066i0.C1309c.b.m3636a(r7, r8)
            goto L35
        L30:
            android.widget.EdgeEffect r5 = new android.widget.EdgeEffect
            r5.<init>(r7)
        L35:
            r6.f1492w1 = r5
            if (r3 < r4) goto L3e
            android.widget.EdgeEffect r3 = p066i0.C1309c.b.m3636a(r7, r8)
            goto L43
        L3e:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r7)
        L43:
            r6.f1493x1 = r3
            android.content.res.Resources r3 = r7.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r4
            r4 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r4
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r4
            r6.f1488c = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r6.getContext()
            r3.<init>(r4)
            r6.f1491s = r3
            r6.setFocusable(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r3)
            r6.setWillNotDraw(r2)
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r4 = r3.getScaledTouchSlop()
            r6.f1475G1 = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r6.f1476H1 = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r6.f1477I1 = r3
            int[] r3 = androidx.core.widget.NestedScrollView.f1468V1
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r3, r0, r2)
            boolean r8 = r7.getBoolean(r2, r2)
            r6.setFillViewport(r8)
            r7.recycle()
            e0.o r7 = new e0.o
            r7.<init>()
            r6.f1484P1 = r7
            e0.l r7 = new e0.l
            r7.<init>(r6)
            r6.f1485Q1 = r7
            r6.setNestedScrollingEnabled(r1)
            androidx.core.widget.NestedScrollView$a r7 = androidx.core.widget.NestedScrollView.f1467U1
            p034e0.C0946x.m2817r(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1486R1 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1486R1 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1486R1;
    }

    /* renamed from: k */
    public static boolean m1009k(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1009k((View) parent, view2);
    }

    /* renamed from: a */
    public final boolean m1010a(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1017l(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1012c(maxScrollAmount);
        } else {
            Rect rect = this.f1490m;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            m1012c(m1011b(rect));
            findNextFocus.requestFocus(i7);
        }
        if (findFocus != null && findFocus.isFocused() && (!m1017l(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public final int m1011b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i8) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* renamed from: c */
    public final void m1012c(int i7) {
        if (i7 != 0) {
            if (this.f1474F1) {
                m1023u(0, i7, false);
            } else {
                scrollBy(0, i7);
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public final void m1013d() {
        this.f1471C1 = false;
        VelocityTracker velocityTracker = this.f1472D1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1472D1 = null;
        }
        m1025w(0);
        this.f1492w1.onRelease();
        this.f1493x1.onRelease();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1014e(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return this.f1485Q1.m2727a(f7, f8, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f1485Q1.m2728b(f7, f8);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f1485Q1.m2729c(i7, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f1485Q1.m2731e(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1492w1;
        int i8 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C0302b.m1027a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i7 = getPaddingLeft() + 0;
            } else {
                i7 = 0;
            }
            if (C0302b.m1027a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.d.m2835k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1493x1;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (C0302b.m1027a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i8 = 0 + getPaddingLeft();
        }
        if (C0302b.m1027a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i8 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
        canvas.restoreToCount(save2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1014e(android.view.KeyEvent r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1014e(android.view.KeyEvent):boolean");
    }

    /* renamed from: f */
    public final void m1015f(int i7) {
        if (getChildCount() > 0) {
            this.f1491s.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1485Q1.m2733g(2, 1);
            this.f1482N1 = getScrollY();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(this);
        }
    }

    /* renamed from: g */
    public final boolean m1016g(int i7) {
        int childCount;
        boolean z6 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f1490m;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return m1021s(i7, rect.top, rect.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0936o c0936o = this.f1484P1;
        return c0936o.f4867b | c0936o.f4866a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: h */
    public final void mo577h(View view, View view2, int i7, int i8) {
        C0936o c0936o = this.f1484P1;
        if (i8 == 1) {
            c0936o.f4867b = i7;
        } else {
            c0936o.f4866a = i7;
        }
        this.f1485Q1.m2733g(2, i8);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1485Q1.m2732f(0) != null;
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: i */
    public final void mo578i(View view, int i7) {
        C0936o c0936o = this.f1484P1;
        if (i7 == 1) {
            c0936o.f4867b = 0;
        } else {
            c0936o.f4866a = 0;
        }
        m1025w(i7);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1485Q1.f4805d;
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: j */
    public final void mo579j(View view, int i7, int i8, int[] iArr, int i9) {
        this.f1485Q1.m2729c(i7, i8, i9, iArr, null);
    }

    /* renamed from: l */
    public final boolean m1017l(View view, int i7, int i8) {
        Rect rect = this.f1490m;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i8;
    }

    @Override // p034e0.InterfaceC0934n
    /* renamed from: m */
    public final void mo582m(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        m1018p(i10, i11, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: n */
    public final void mo583n(View view, int i7, int i8, int i9, int i10, int i11) {
        m1018p(i10, i11, null);
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: o */
    public final boolean mo584o(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1469A1 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto Lbf
            boolean r0 = r8.f1471C1
            if (r0 != 0) goto Lbf
            r0 = 2
            boolean r0 = p002a1.C0017d.m66E(r9, r0)
            r1 = 0
            if (r0 == 0) goto L18
            r0 = 9
            goto L22
        L18:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = p002a1.C0017d.m66E(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
        L22:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L27:
            r0 = 0
        L28:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto Lbf
            float r1 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r0 >= 0) goto L7a
            int r1 = r8.getOverScrollMode()
            if (r1 == 0) goto L55
            if (r1 != r4) goto L53
            int r1 = r8.getScrollRange()
            if (r1 <= 0) goto L53
            goto L55
        L53:
            r1 = 0
            goto L56
        L55:
            r1 = 1
        L56:
            if (r1 == 0) goto L60
            boolean r9 = p002a1.C0017d.m66E(r9, r6)
            if (r9 != 0) goto L60
            r9 = 1
            goto L61
        L60:
            r9 = 0
        L61:
            if (r9 == 0) goto L78
            float r9 = (float) r0
            float r9 = -r9
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.f1492w1
            p066i0.C1309c.m3634b(r0, r9, r5)
            r0.onRelease()
            r8.invalidate()
            r9 = 1
            goto Lb4
        L78:
            r0 = 0
            goto Lb2
        L7a:
            if (r0 <= r1) goto Lb2
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L8d
            if (r7 != r4) goto L8b
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L8b
            goto L8d
        L8b:
            r7 = 0
            goto L8e
        L8d:
            r7 = 1
        L8e:
            if (r7 == 0) goto L98
            boolean r9 = p002a1.C0017d.m66E(r9, r6)
            if (r9 != 0) goto L98
            r9 = 1
            goto L99
        L98:
            r9 = 0
        L99:
            if (r9 == 0) goto Laf
            int r0 = r0 - r1
            float r9 = (float) r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.f1493x1
            p066i0.C1309c.m3634b(r0, r9, r5)
            r0.onRelease()
            r8.invalidate()
            r2 = 1
        Laf:
            r9 = r2
            r2 = r1
            goto Lb4
        Lb2:
            r2 = r0
            r9 = 0
        Lb4:
            if (r2 == r3) goto Lbe
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r2)
            return r4
        Lbe:
            return r9
        Lbf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        super.onLayout(z6, i7, i8, i9, i10);
        int i12 = 0;
        this.f1495z1 = false;
        View view = this.f1470B1;
        if (view != null && m1009k(view, this)) {
            View view2 = this.f1470B1;
            Rect rect = this.f1490m;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1011b = m1011b(rect);
            if (m1011b != 0) {
                scrollBy(0, m1011b);
            }
        }
        this.f1470B1 = null;
        if (!this.f1469A1) {
            if (this.f1483O1 != null) {
                scrollTo(getScrollX(), this.f1483O1.f1496c);
                this.f1483O1 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i11 = 0;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i11 && scrollY >= 0) {
                i12 = paddingTop + scrollY > i11 ? i11 - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1469A1 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f1473E1 && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        m1015f((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        mo579j(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        m1018p(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        mo577h(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i8, boolean z6, boolean z7) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i7) : focusFinder.findNextFocusFromRect(this, rect, i7);
        if (findNextFocus == null || (true ^ m1017l(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0304d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0304d c0304d = (C0304d) parcelable;
        super.onRestoreInstanceState(c0304d.getSuperState());
        this.f1483O1 = c0304d;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0304d c0304d = new C0304d(super.onSaveInstanceState());
        c0304d.f1496c = getScrollY();
        return c0304d;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        InterfaceC0303c interfaceC0303c = this.f1487S1;
        if (interfaceC0303c != null) {
            C0548d c0548d = (C0548d) interfaceC0303c;
            AlertController.m479b(this, c0548d.f2739a, c0548d.f2740b);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1017l(findFocus, 0, i10)) {
            return;
        }
        Rect rect = this.f1490m;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        m1012c(m1011b(rect));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return mo584o(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo578i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x024f, code lost:
    
        if (m1022t(r10, r2) != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m1018p(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1485Q1.m2730d(scrollY2, i7 - scrollY2, i8, iArr);
    }

    /* renamed from: q */
    public final void m1019q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1478J1) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f1494y1 = (int) motionEvent.getY(i7);
            this.f1478J1 = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f1472D1;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1020r(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L18
            goto L1a
        L18:
            if (r11 >= 0) goto L1d
        L1a:
            r10 = 1
            r11 = 0
            goto L1e
        L1d:
            r10 = 0
        L1e:
            if (r12 <= r13) goto L22
            r12 = r13
            goto L25
        L22:
            if (r12 >= 0) goto L27
            r12 = 0
        L25:
            r13 = 1
            goto L28
        L27:
            r13 = 0
        L28:
            if (r13 == 0) goto L45
            e0.l r2 = r9.f1485Q1
            android.view.ViewParent r2 = r2.m2732f(r1)
            if (r2 == 0) goto L34
            r2 = 1
            goto L35
        L34:
            r2 = 0
        L35:
            if (r2 != 0) goto L45
            android.widget.OverScroller r2 = r9.f1491s
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L45:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L4e
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m1020r(int, int, int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1495z1) {
            this.f1470B1 = view2;
        } else {
            Rect rect = this.f1490m;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int m1011b = m1011b(rect);
            if (m1011b != 0) {
                scrollBy(0, m1011b);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m1011b = m1011b(rect);
        boolean z7 = m1011b != 0;
        if (z7) {
            if (z6) {
                scrollBy(0, m1011b);
            } else {
                m1023u(0, m1011b, false);
            }
        }
        return z7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f1472D1) != null) {
            velocityTracker.recycle();
            this.f1472D1 = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1495z1 = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m1021s(int i7, int i8, int i9) {
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z7 = i7 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z8 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = focusables.get(i11);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i8 < bottom && top < i9) {
                boolean z9 = i8 < top && bottom < i9;
                if (view == null) {
                    view = view2;
                    z8 = z9;
                } else {
                    boolean z10 = (z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom());
                    if (z8) {
                        if (z9) {
                            if (!z10) {
                            }
                            view = view2;
                        }
                    } else if (z9) {
                        view = view2;
                        z8 = true;
                    } else {
                        if (!z10) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i8 < scrollY || i9 > i10) {
            m1012c(z7 ? i8 - scrollY : i9 - i10);
            z6 = true;
        } else {
            z6 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i7);
        }
        return z6;
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i7 = 0;
            } else if (width + i7 > width2) {
                i7 = width2 - width;
            }
            if (height >= height2 || i8 < 0) {
                i8 = 0;
            } else if (height + i8 > height2) {
                i8 = height2 - height;
            }
            if (i7 == getScrollX() && i8 == getScrollY()) {
                return;
            }
            super.scrollTo(i7, i8);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f1473E1) {
            this.f1473E1 = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0930l c0930l = this.f1485Q1;
        if (c0930l.f4805d) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.i.m2893z(c0930l.f4804c);
        }
        c0930l.f4805d = z6;
    }

    public void setOnScrollChangeListener(InterfaceC0303c interfaceC0303c) {
        this.f1487S1 = interfaceC0303c;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f1474F1 = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return this.f1485Q1.m2733g(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m1025w(0);
    }

    /* renamed from: t */
    public final boolean m1022t(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float m3633a = C1309c.m3633a(edgeEffect) * getHeight();
        float abs = Math.abs(-i7) * 0.35f;
        float f7 = this.f1488c * 0.015f;
        double log = Math.log(abs / f7);
        double d7 = f1466T1;
        return ((float) (Math.exp((d7 / (d7 - 1.0d)) * log) * ((double) f7))) < m3633a;
    }

    /* renamed from: u */
    public final void m1023u(int i7, int i8, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1489e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1491s.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z6) {
                this.f1485Q1.m2733g(2, 1);
            } else {
                m1025w(1);
            }
            this.f1482N1 = getScrollY();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2835k(this);
        } else {
            if (!this.f1491s.isFinished()) {
                this.f1491s.abortAnimation();
                m1025w(1);
            }
            scrollBy(i7, i8);
        }
        this.f1489e = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: v */
    public final boolean m1024v(MotionEvent motionEvent) {
        boolean z6;
        EdgeEffect edgeEffect = this.f1492w1;
        if (C1309c.m3633a(edgeEffect) != 0.0f) {
            C1309c.m3634b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f1493x1;
        if (C1309c.m3633a(edgeEffect2) == 0.0f) {
            return z6;
        }
        C1309c.m3634b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: w */
    public final void m1025w(int i7) {
        this.f1485Q1.m2734h(i7);
    }
}
