package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.ext.Tools;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.view.menu.C0159f;
import java.util.WeakHashMap;
import p016c.C0551e0;
import p016c.LayoutInflaterFactory2C0560n;
import p034e0.C0923h0;
import p034e0.C0935n0;
import p034e0.C0936o;
import p034e0.C0946x;
import p034e0.InterfaceC0932m;
import p034e0.InterfaceC0934n;
import p049g.C1189g;
import p181x.C2153b;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0238j0, InterfaceC0932m, InterfaceC0934n {

    /* renamed from: T1 */
    public static final int[] f590T1 = {R$attr.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A1 */
    public boolean f591A1;

    /* renamed from: B1 */
    public boolean f592B1;

    /* renamed from: C1 */
    public boolean f593C1;

    /* renamed from: D1 */
    public int f594D1;

    /* renamed from: E1 */
    public int f595E1;

    /* renamed from: F1 */
    public final Rect f596F1;

    /* renamed from: G1 */
    public final Rect f597G1;

    /* renamed from: H1 */
    public final Rect f598H1;

    /* renamed from: I1 */
    public C0935n0 f599I1;

    /* renamed from: J1 */
    public C0935n0 f600J1;

    /* renamed from: K1 */
    public C0935n0 f601K1;

    /* renamed from: L1 */
    public C0935n0 f602L1;

    /* renamed from: M1 */
    public InterfaceC0171d f603M1;

    /* renamed from: N1 */
    public OverScroller f604N1;

    /* renamed from: O1 */
    public ViewPropertyAnimator f605O1;

    /* renamed from: P1 */
    public final C0168a f606P1;

    /* renamed from: Q1 */
    public final RunnableC0169b f607Q1;

    /* renamed from: R1 */
    public final RunnableC0170c f608R1;

    /* renamed from: S1 */
    public final C0936o f609S1;

    /* renamed from: c */
    public int f610c;

    /* renamed from: e */
    public int f611e;

    /* renamed from: m */
    public ContentFrameLayout f612m;

    /* renamed from: s */
    public ActionBarContainer f613s;

    /* renamed from: w1 */
    public InterfaceC0241k0 f614w1;

    /* renamed from: x1 */
    public Drawable f615x1;

    /* renamed from: y1 */
    public boolean f616y1;

    /* renamed from: z1 */
    public boolean f617z1;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0168a extends AnimatorListenerAdapter {
        public C0168a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f605O1 = null;
            actionBarOverlayLayout.f593C1 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f605O1 = null;
            actionBarOverlayLayout.f593C1 = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC0169b implements Runnable {
        public RunnableC0169b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m585q();
            actionBarOverlayLayout.f605O1 = actionBarOverlayLayout.f613s.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f606P1);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC0170c implements Runnable {
        public RunnableC0170c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.m585q();
            actionBarOverlayLayout.f605O1 = actionBarOverlayLayout.f613s.animate().translationY(-actionBarOverlayLayout.f613s.getHeight()).setListener(actionBarOverlayLayout.f606P1);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0171d {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0172e extends ViewGroup.MarginLayoutParams {
        public C0172e() {
            super(-1, -1);
        }

        public C0172e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0172e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f611e = 0;
        this.f596F1 = new Rect();
        this.f597G1 = new Rect();
        this.f598H1 = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C0935n0 c0935n0 = C0935n0.f4834b;
        this.f599I1 = c0935n0;
        this.f600J1 = c0935n0;
        this.f601K1 = c0935n0;
        this.f602L1 = c0935n0;
        this.f606P1 = new C0168a();
        this.f607Q1 = new RunnableC0169b();
        this.f608R1 = new RunnableC0170c();
        m586r(context);
        this.f609S1 = new C0936o();
    }

    /* renamed from: p */
    public static boolean m569p(FrameLayout frameLayout, Rect rect, boolean z6) {
        boolean z7;
        C0172e c0172e = (C0172e) frameLayout.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) c0172e).leftMargin;
        int i8 = rect.left;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0172e).leftMargin = i8;
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c0172e).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c0172e).topMargin = i10;
            z7 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c0172e).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c0172e).rightMargin = i12;
            z7 = true;
        }
        if (z6) {
            int i13 = ((ViewGroup.MarginLayoutParams) c0172e).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c0172e).bottomMargin = i14;
                return true;
            }
        }
        return z7;
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: a */
    public final void mo570a(C0159f c0159f, LayoutInflaterFactory2C0560n.d dVar) {
        m587s();
        this.f614w1.mo816a(c0159f, dVar);
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: b */
    public final boolean mo571b() {
        m587s();
        return this.f614w1.mo817b();
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: c */
    public final void mo572c() {
        m587s();
        this.f614w1.mo818c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0172e;
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: d */
    public final boolean mo573d() {
        m587s();
        return this.f614w1.mo819d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        if (this.f615x1 == null || this.f616y1) {
            return;
        }
        if (this.f613s.getVisibility() == 0) {
            i7 = (int) (this.f613s.getTranslationY() + this.f613s.getBottom() + 0.5f);
        } else {
            i7 = 0;
        }
        this.f615x1.setBounds(0, i7, getWidth(), this.f615x1.getIntrinsicHeight() + i7);
        this.f615x1.draw(canvas);
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: e */
    public final boolean mo574e() {
        m587s();
        return this.f614w1.mo820e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: f */
    public final boolean mo575f() {
        m587s();
        return this.f614w1.mo821f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: g */
    public final boolean mo576g() {
        m587s();
        return this.f614w1.mo822g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0172e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0172e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0172e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f613s;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0936o c0936o = this.f609S1;
        return c0936o.f4867b | c0936o.f4866a;
    }

    public CharSequence getTitle() {
        m587s();
        return this.f614w1.getTitle();
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: h */
    public final void mo577h(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: i */
    public final void mo578i(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: j */
    public final void mo579j(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: k */
    public final void mo580k(int i7) {
        m587s();
        if (i7 == 2) {
            this.f614w1.mo835t();
        } else if (i7 == 5) {
            this.f614w1.mo836u();
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    /* renamed from: l */
    public final void mo581l() {
        m587s();
        this.f614w1.mo823h();
    }

    @Override // p034e0.InterfaceC0934n
    /* renamed from: m */
    public final void mo582m(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        mo583n(view, i7, i8, i9, i10, i11);
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: n */
    public final void mo583n(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // p034e0.InterfaceC0932m
    /* renamed from: o */
    public final boolean mo584o(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m587s();
        C0935n0 m2749i = C0935n0.m2749i(this, windowInsets);
        boolean m569p = m569p(this.f613s, new Rect(m2749i.m2752c(), m2749i.m2754e(), m2749i.m2753d(), m2749i.m2751b()), false);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        Rect rect = this.f596F1;
        C0946x.i.m2869b(this, m2749i, rect);
        int i7 = rect.left;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        C0935n0.k kVar = m2749i.f4835a;
        C0935n0 mo2773l = kVar.mo2773l(i7, i8, i9, i10);
        this.f599I1 = mo2773l;
        boolean z6 = true;
        if (!this.f600J1.equals(mo2773l)) {
            this.f600J1 = this.f599I1;
            m569p = true;
        }
        Rect rect2 = this.f597G1;
        if (rect2.equals(rect)) {
            z6 = m569p;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return kVar.mo2784a().f4835a.mo2780c().f4835a.mo2779b().m2756h();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m586r(getContext());
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.h.m2867c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m585q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0172e c0172e = (C0172e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c0172e).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c0172e).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int measuredHeight;
        C0935n0 mo2758b;
        m587s();
        measureChildWithMargins(this.f613s, i7, 0, i8, 0);
        C0172e c0172e = (C0172e) this.f613s.getLayoutParams();
        int max = Math.max(0, this.f613s.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0172e).leftMargin + ((ViewGroup.MarginLayoutParams) c0172e).rightMargin);
        int max2 = Math.max(0, this.f613s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0172e).topMargin + ((ViewGroup.MarginLayoutParams) c0172e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f613s.getMeasuredState());
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean z6 = (C0946x.d.m2831g(this) & Tools.Semaphore.f160S8) != 0;
        if (z6) {
            measuredHeight = this.f610c;
            if (this.f591A1 && this.f613s.getTabContainer() != null) {
                measuredHeight += this.f610c;
            }
        } else {
            measuredHeight = this.f613s.getVisibility() != 8 ? this.f613s.getMeasuredHeight() : 0;
        }
        Rect rect = this.f596F1;
        Rect rect2 = this.f598H1;
        rect2.set(rect);
        C0935n0 c0935n0 = this.f599I1;
        this.f601K1 = c0935n0;
        if (this.f617z1 || z6) {
            C2153b m5268b = C2153b.m5268b(c0935n0.m2752c(), this.f601K1.m2754e() + measuredHeight, this.f601K1.m2753d(), this.f601K1.m2751b() + 0);
            C0935n0 c0935n02 = this.f601K1;
            int i9 = Build.VERSION.SDK_INT;
            C0935n0.e dVar = i9 >= 30 ? new C0935n0.d(c0935n02) : i9 >= 29 ? new C0935n0.c(c0935n02) : new C0935n0.b(c0935n02);
            dVar.mo2760g(m5268b);
            mo2758b = dVar.mo2758b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            mo2758b = c0935n0.f4835a.mo2773l(0, measuredHeight, 0, 0);
        }
        this.f601K1 = mo2758b;
        m569p(this.f612m, rect2, true);
        if (!this.f602L1.equals(this.f601K1)) {
            C0935n0 c0935n03 = this.f601K1;
            this.f602L1 = c0935n03;
            C0946x.m2801b(this.f612m, c0935n03);
        }
        measureChildWithMargins(this.f612m, i7, 0, i8, 0);
        C0172e c0172e2 = (C0172e) this.f612m.getLayoutParams();
        int max3 = Math.max(max, this.f612m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0172e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0172e2).rightMargin);
        int max4 = Math.max(max2, this.f612m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0172e2).topMargin + ((ViewGroup.MarginLayoutParams) c0172e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f612m.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        if (!this.f592B1 || !z6) {
            return false;
        }
        this.f604N1.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f604N1.getFinalY() > this.f613s.getHeight()) {
            m585q();
            this.f608R1.run();
        } else {
            m585q();
            this.f607Q1.run();
        }
        this.f593C1 = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f7, float f8) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f594D1 + i8;
        this.f594D1 = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        C0551e0 c0551e0;
        C1189g c1189g;
        this.f609S1.f4866a = i7;
        this.f594D1 = getActionBarHideOffset();
        m585q();
        InterfaceC0171d interfaceC0171d = this.f603M1;
        if (interfaceC0171d == null || (c1189g = (c0551e0 = (C0551e0) interfaceC0171d).f2771t) == null) {
            return;
        }
        c1189g.m3402a();
        c0551e0.f2771t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f613s.getVisibility() != 0) {
            return false;
        }
        return this.f592B1;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f592B1 || this.f593C1) {
            return;
        }
        if (this.f594D1 <= this.f613s.getHeight()) {
            m585q();
            postDelayed(this.f607Q1, 600L);
        } else {
            m585q();
            postDelayed(this.f608R1, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        m587s();
        int i8 = this.f595E1 ^ i7;
        this.f595E1 = i7;
        boolean z6 = (i7 & 4) == 0;
        boolean z7 = (i7 & Tools.Semaphore.f160S8) != 0;
        InterfaceC0171d interfaceC0171d = this.f603M1;
        if (interfaceC0171d != null) {
            ((C0551e0) interfaceC0171d).f2767p = !z7;
            if (z6 || !z7) {
                C0551e0 c0551e0 = (C0551e0) interfaceC0171d;
                if (c0551e0.f2768q) {
                    c0551e0.f2768q = false;
                    c0551e0.m1889v(true);
                }
            } else {
                C0551e0 c0551e02 = (C0551e0) interfaceC0171d;
                if (!c0551e02.f2768q) {
                    c0551e02.f2768q = true;
                    c0551e02.m1889v(true);
                }
            }
        }
        if ((i8 & Tools.Semaphore.f160S8) == 0 || this.f603M1 == null) {
            return;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.h.m2867c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f611e = i7;
        InterfaceC0171d interfaceC0171d = this.f603M1;
        if (interfaceC0171d != null) {
            ((C0551e0) interfaceC0171d).f2766o = i7;
        }
    }

    /* renamed from: q */
    public final void m585q() {
        removeCallbacks(this.f607Q1);
        removeCallbacks(this.f608R1);
        ViewPropertyAnimator viewPropertyAnimator = this.f605O1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: r */
    public final void m586r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f590T1);
        this.f610c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f615x1 = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f616y1 = context.getApplicationInfo().targetSdkVersion < 19;
        this.f604N1 = new OverScroller(context);
    }

    /* renamed from: s */
    public final void m587s() {
        InterfaceC0241k0 wrapper;
        if (this.f612m == null) {
            this.f612m = (ContentFrameLayout) findViewById(R$id.action_bar_activity_content);
            this.f613s = (ActionBarContainer) findViewById(R$id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R$id.action_bar);
            if (findViewById instanceof InterfaceC0241k0) {
                wrapper = (InterfaceC0241k0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f614w1 = wrapper;
        }
    }

    public void setActionBarHideOffset(int i7) {
        m585q();
        this.f613s.setTranslationY(-Math.max(0, Math.min(i7, this.f613s.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0171d interfaceC0171d) {
        this.f603M1 = interfaceC0171d;
        if (getWindowToken() != null) {
            ((C0551e0) this.f603M1).f2766o = this.f611e;
            int i7 = this.f595E1;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.h.m2867c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f591A1 = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f592B1) {
            this.f592B1 = z6;
            if (z6) {
                return;
            }
            m585q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        m587s();
        this.f614w1.setIcon(i7);
    }

    public void setIcon(Drawable drawable) {
        m587s();
        this.f614w1.setIcon(drawable);
    }

    public void setLogo(int i7) {
        m587s();
        this.f614w1.mo832q(i7);
    }

    public void setOverlayMode(boolean z6) {
        this.f617z1 = z6;
        this.f616y1 = z6 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    public void setWindowCallback(Window.Callback callback) {
        m587s();
        this.f614w1.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.InterfaceC0238j0
    public void setWindowTitle(CharSequence charSequence) {
        m587s();
        this.f614w1.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
