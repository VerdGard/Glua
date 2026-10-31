package com.google.android.material.sidesheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.ext.C0090b;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.activity.C0117b;
import androidx.activity.C0143v;
import androidx.activity.RunnableC0119d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p004a3.C0034a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p055g5.C1253j;
import p082k0.AbstractC1446a;
import p090l0.C1486c;
import p139r3.C1831i;
import p139r3.InterfaceC1824b;
import p163u3.C1972c;
import p193y3.C2237f;
import p193y3.C2240i;
import p201z3.AbstractC2283d;
import p201z3.InterfaceC2282c;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0289c<V> implements InterfaceC1824b {

    /* renamed from: M1 */
    public static final int f4365M1 = R$string.side_sheet_accessibility_pane_title;

    /* renamed from: N1 */
    public static final int f4366N1 = R$style.Widget_Material3_SideSheet;

    /* renamed from: A1 */
    public int f4367A1;

    /* renamed from: B1 */
    public int f4368B1;

    /* renamed from: C1 */
    public int f4369C1;

    /* renamed from: D1 */
    public int f4370D1;

    /* renamed from: E1 */
    public WeakReference<V> f4371E1;

    /* renamed from: F1 */
    public WeakReference<View> f4372F1;

    /* renamed from: G1 */
    public int f4373G1;

    /* renamed from: H1 */
    public VelocityTracker f4374H1;

    /* renamed from: I1 */
    public C1831i f4375I1;

    /* renamed from: J1 */
    public int f4376J1;

    /* renamed from: K1 */
    public final LinkedHashSet f4377K1;

    /* renamed from: L1 */
    public final C0830a f4378L1;

    /* renamed from: X */
    public final SideSheetBehavior<V>.C0833d f4379X;

    /* renamed from: Y */
    public final float f4380Y;

    /* renamed from: Z */
    public boolean f4381Z;

    /* renamed from: c */
    public AbstractC2283d f4382c;

    /* renamed from: e */
    public C2237f f4383e;

    /* renamed from: m */
    public final ColorStateList f4384m;

    /* renamed from: s */
    public final C2240i f4385s;

    /* renamed from: w1 */
    public int f4386w1;

    /* renamed from: x1 */
    public C1486c f4387x1;

    /* renamed from: y1 */
    public boolean f4388y1;

    /* renamed from: z1 */
    public final float f4389z1;

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    public class C0830a extends C1486c.c {
        public C0830a() {
        }

        @Override // p090l0.C1486c.c
        /* renamed from: a */
        public final int mo1060a(View view, int i7) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return C0143v.m460r(i7, sideSheetBehavior.f4382c.mo5532g(), sideSheetBehavior.f4382c.mo5531f());
        }

        @Override // p090l0.C1486c.c
        /* renamed from: b */
        public final int mo1061b(View view, int i7) {
            return view.getTop();
        }

        @Override // p090l0.C1486c.c
        /* renamed from: c */
        public final int mo1062c(View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.f4367A1 + sideSheetBehavior.f4370D1;
        }

        @Override // p090l0.C1486c.c
        /* renamed from: h */
        public final void mo1066h(int i7) {
            if (i7 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f4381Z) {
                    sideSheetBehavior.m2486y(1);
                }
            }
        }

        @Override // p090l0.C1486c.c
        /* renamed from: i */
        public final void mo1067i(View view, int i7, int i8) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f4372F1;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.f4382c.mo5541p(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.f4377K1;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.f4382c.mo5527b(i7);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC2282c) it.next()).m5543b();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        
            if ((java.lang.Math.abs(r5) > java.lang.Math.abs(r6)) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (java.lang.Math.abs(r5 - r0.f4382c.mo5529d()) < java.lang.Math.abs(r5 - r0.f4382c.mo5530e())) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (r0.f4382c.mo5537l(r4) == false) goto L21;
         */
        @Override // p090l0.C1486c.c
        /* renamed from: j */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo1068j(android.view.View r4, float r5, float r6) {
            /*
                r3 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                z3.d r1 = r0.f4382c
                boolean r1 = r1.mo5536k(r5)
                r2 = 1
                if (r1 == 0) goto Lc
                goto L58
            Lc:
                z3.d r1 = r0.f4382c
                boolean r1 = r1.mo5539n(r4, r5)
                if (r1 == 0) goto L25
                z3.d r1 = r0.f4382c
                boolean r5 = r1.mo5538m(r5, r6)
                if (r5 != 0) goto L5a
                z3.d r5 = r0.f4382c
                boolean r5 = r5.mo5537l(r4)
                if (r5 == 0) goto L58
                goto L5a
            L25:
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 == 0) goto L3b
                float r5 = java.lang.Math.abs(r5)
                float r6 = java.lang.Math.abs(r6)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 <= 0) goto L38
                r5 = 1
                goto L39
            L38:
                r5 = 0
            L39:
                if (r5 != 0) goto L5a
            L3b:
                int r5 = r4.getLeft()
                z3.d r6 = r0.f4382c
                int r6 = r6.mo5529d()
                int r6 = r5 - r6
                int r6 = java.lang.Math.abs(r6)
                z3.d r1 = r0.f4382c
                int r1 = r1.mo5530e()
                int r5 = r5 - r1
                int r5 = java.lang.Math.abs(r5)
                if (r6 >= r5) goto L5a
            L58:
                r5 = 3
                goto L5b
            L5a:
                r5 = 5
            L5b:
                r0.m2487z(r4, r5, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.C0830a.mo1068j(android.view.View, float, float):void");
        }

        @Override // p090l0.C1486c.c
        /* renamed from: k */
        public final boolean mo1069k(View view, int i7) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.f4386w1 == 1 || (weakReference = sideSheetBehavior.f4371E1) == null || weakReference.get() != view) ? false : true;
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    public class C0831b extends AnimatorListenerAdapter {
        public C0831b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.m2486y(5);
            WeakReference<V> weakReference = sideSheetBehavior.f4371E1;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            sideSheetBehavior.f4371E1.get().requestLayout();
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c */
    public static class C0832c extends AbstractC1446a {
        public static final Parcelable.Creator<C0832c> CREATOR = new a();

        /* renamed from: m */
        public final int f4392m;

        /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c$a */
        public class a implements Parcelable.ClassLoaderCreator<C0832c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0832c(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0832c[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0832c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0832c(parcel, classLoader);
            }
        }

        public C0832c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4392m = parcel.readInt();
        }

        public C0832c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.f4392m = sideSheetBehavior.f4386w1;
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeInt(this.f4392m);
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$d */
    public class C0833d {

        /* renamed from: a */
        public int f4393a;

        /* renamed from: b */
        public boolean f4394b;

        /* renamed from: c */
        public final RunnableC0119d f4395c = new RunnableC0119d(7, this);

        public C0833d() {
        }

        /* renamed from: a */
        public final void m2488a(int i7) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f4371E1;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f4393a = i7;
            if (this.f4394b) {
                return;
            }
            V v5 = sideSheetBehavior.f4371E1.get();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2837m(v5, this.f4395c);
            this.f4394b = true;
        }
    }

    public SideSheetBehavior() {
        this.f4379X = new C0833d();
        this.f4381Z = true;
        this.f4386w1 = 5;
        this.f4389z1 = 0.1f;
        this.f4373G1 = -1;
        this.f4377K1 = new LinkedHashSet();
        this.f4378L1 = new C0830a();
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4379X = new C0833d();
        this.f4381Z = true;
        this.f4386w1 = 5;
        this.f4389z1 = 0.1f;
        this.f4373G1 = -1;
        this.f4377K1 = new LinkedHashSet();
        this.f4378L1 = new C0830a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3720A);
        int i7 = R$styleable.SideSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i7)) {
            this.f4384m = C1972c.m4585a(context, obtainStyledAttributes, i7);
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f4385s = new C2240i(C2240i.m5433b(context, attributeSet, 0, f4366N1));
        }
        int i8 = R$styleable.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (obtainStyledAttributes.hasValue(i8)) {
            int resourceId = obtainStyledAttributes.getResourceId(i8, -1);
            this.f4373G1 = resourceId;
            WeakReference<View> weakReference = this.f4372F1;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f4372F1 = null;
            WeakReference<V> weakReference2 = this.f4371E1;
            if (weakReference2 != null) {
                V v5 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                    if (C0946x.g.m2860c(v5)) {
                        v5.requestLayout();
                    }
                }
            }
        }
        C2240i c2240i = this.f4385s;
        if (c2240i != null) {
            C2237f c2237f = new C2237f(c2240i);
            this.f4383e = c2237f;
            c2237f.m5426i(context);
            ColorStateList colorStateList = this.f4384m;
            if (colorStateList != null) {
                this.f4383e.m5428k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f4383e.setTint(typedValue.data);
            }
        }
        this.f4380Y = obtainStyledAttributes.getDimension(R$styleable.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.f4381Z = obtainStyledAttributes.getBoolean(R$styleable.SideSheetBehavior_Layout_behavior_draggable, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: A */
    public final void m2483A() {
        V v5;
        WeakReference<V> weakReference = this.f4371E1;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        C0946x.m2814o(v5, 262144);
        C0946x.m2809j(v5, 0);
        C0946x.m2814o(v5, 1048576);
        C0946x.m2809j(v5, 0);
        int i7 = 5;
        if (this.f4386w1 != 5) {
            C0946x.m2815p(v5, C1151g.a.f5695l, new C1253j(i7, this));
        }
        int i8 = 3;
        if (this.f4386w1 != 3) {
            C0946x.m2815p(v5, C1151g.a.f5693j, new C1253j(i8, this));
        }
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: a */
    public final void mo2308a() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        C1831i c1831i = this.f4375I1;
        if (c1831i == null) {
            return;
        }
        C0117b c0117b = c1831i.f8261f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        c1831i.f8261f = null;
        int i7 = 5;
        if (c0117b == null || Build.VERSION.SDK_INT < 34) {
            m2485x(5);
            return;
        }
        AbstractC2283d abstractC2283d = this.f4382c;
        if (abstractC2283d != null && abstractC2283d.mo5535j() != 0) {
            i7 = 3;
        }
        C0831b c0831b = new C0831b();
        WeakReference<View> weakReference = this.f4372F1;
        final View view = weakReference != null ? weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int mo5528c = this.f4382c.mo5528c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: z3.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.f4382c.mo5540o(marginLayoutParams, C0034a.m127b(valueAnimator.getAnimatedFraction(), mo5528c, 0));
                    view.requestLayout();
                }
            };
        }
        c1831i.m4308b(c0117b, i7, c0831b, animatorUpdateListener);
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: b */
    public final void mo2309b(C0117b c0117b) {
        C1831i c1831i = this.f4375I1;
        if (c1831i == null) {
            return;
        }
        c1831i.f8261f = c0117b;
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: c */
    public final void mo2310c(C0117b c0117b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1831i c1831i = this.f4375I1;
        if (c1831i == null) {
            return;
        }
        AbstractC2283d abstractC2283d = this.f4382c;
        int i7 = (abstractC2283d == null || abstractC2283d.mo5535j() == 0) ? 5 : 3;
        if (c1831i.f8261f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0117b c0117b2 = c1831i.f8261f;
        c1831i.f8261f = c0117b;
        if (c0117b2 != null) {
            c1831i.m4309c(c0117b.f221c, i7, c0117b.f222d == 0);
        }
        WeakReference<V> weakReference = this.f4371E1;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v5 = this.f4371E1.get();
        WeakReference<View> weakReference2 = this.f4372F1;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (view == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        this.f4382c.mo5540o(marginLayoutParams, (int) ((v5.getScaleX() * this.f4367A1) + this.f4370D1));
        view.requestLayout();
    }

    @Override // p139r3.InterfaceC1824b
    /* renamed from: d */
    public final void mo2311d() {
        C1831i c1831i = this.f4375I1;
        if (c1831i == null) {
            return;
        }
        c1831i.m4307a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: g */
    public final void mo980g(CoordinatorLayout.C0292f c0292f) {
        this.f4371E1 = null;
        this.f4387x1 = null;
        this.f4375I1 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: j */
    public final void mo983j() {
        this.f4371E1 = null;
        this.f4387x1 = null;
        this.f4375I1 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: k */
    public final boolean mo984k(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        C1486c c1486c;
        VelocityTracker velocityTracker;
        if (!((v5.isShown() || C0946x.m2804e(v5) != null) && this.f4381Z)) {
            this.f4388y1 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f4374H1) != null) {
            velocityTracker.recycle();
            this.f4374H1 = null;
        }
        if (this.f4374H1 == null) {
            this.f4374H1 = VelocityTracker.obtain();
        }
        this.f4374H1.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f4376J1 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f4388y1) {
            this.f4388y1 = false;
            return false;
        }
        return (this.f4388y1 || (c1486c = this.f4387x1) == null || !c1486c.m3910r(motionEvent)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo985l(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, int r10) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.mo985l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: m */
    public final boolean mo986m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: r */
    public final void mo991r(View view, Parcelable parcelable) {
        int i7 = ((C0832c) parcelable).f4392m;
        if (i7 == 1 || i7 == 2) {
            i7 = 5;
        }
        this.f4386w1 = i7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: s */
    public final Parcelable mo992s(View view) {
        return new C0832c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: v */
    public final boolean mo995v(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z6 = false;
        if (!v5.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.f4386w1;
        if (i7 == 1 && actionMasked == 0) {
            return true;
        }
        C1486c c1486c = this.f4387x1;
        if (c1486c != null && (this.f4381Z || i7 == 1)) {
            c1486c.m3903k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f4374H1) != null) {
            velocityTracker.recycle();
            this.f4374H1 = null;
        }
        if (this.f4374H1 == null) {
            this.f4374H1 = VelocityTracker.obtain();
        }
        this.f4374H1.addMovement(motionEvent);
        C1486c c1486c2 = this.f4387x1;
        if ((c1486c2 != null && (this.f4381Z || this.f4386w1 == 1)) && actionMasked == 2 && !this.f4388y1) {
            if ((c1486c2 != null && (this.f4381Z || this.f4386w1 == 1)) && Math.abs(this.f4376J1 - motionEvent.getX()) > this.f4387x1.f7072b) {
                z6 = true;
            }
            if (z6) {
                this.f4387x1.m3894b(v5, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f4388y1;
    }

    /* renamed from: w */
    public final CoordinatorLayout.C0292f m2484w() {
        V v5;
        WeakReference<V> weakReference = this.f4371E1;
        if (weakReference == null || (v5 = weakReference.get()) == null || !(v5.getLayoutParams() instanceof CoordinatorLayout.C0292f)) {
            return null;
        }
        return (CoordinatorLayout.C0292f) v5.getLayoutParams();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (p034e0.C0946x.g.m2859b(r1) != false) goto L20;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2485x(final int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L43
            r1 = 2
            if (r5 != r1) goto L7
            goto L43
        L7:
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r4.f4371E1
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L12
            goto L3f
        L12:
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r4.f4371E1
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            z3.f r2 = new z3.f
            r2.<init>()
            android.view.ViewParent r5 = r1.getParent()
            if (r5 == 0) goto L34
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L34
            java.util.WeakHashMap<android.view.View, e0.h0> r5 = p034e0.C0946x.f4876a
            boolean r5 = p034e0.C0946x.g.m2859b(r1)
            if (r5 == 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 == 0) goto L3b
            r1.post(r2)
            goto L42
        L3b:
            r2.run()
            goto L42
        L3f:
            r4.m2486y(r5)
        L42:
            return
        L43:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L51
            java.lang.String r5 = "DRAGGING"
            goto L53
        L51:
            java.lang.String r5 = "SETTLING"
        L53:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = android.ext.C0090b.m220f(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.m2485x(int):void");
    }

    /* renamed from: y */
    public final void m2486y(int i7) {
        V v5;
        if (this.f4386w1 == i7) {
            return;
        }
        this.f4386w1 = i7;
        WeakReference<V> weakReference = this.f4371E1;
        if (weakReference == null || (v5 = weakReference.get()) == null) {
            return;
        }
        int i8 = this.f4386w1 == 5 ? 4 : 0;
        if (v5.getVisibility() != i8) {
            v5.setVisibility(i8);
        }
        Iterator it = this.f4377K1.iterator();
        while (it.hasNext()) {
            ((InterfaceC2282c) it.next()).m5542a();
        }
        m2483A();
    }

    /* renamed from: z */
    public final void m2487z(View view, int i7, boolean z6) {
        int mo5529d;
        if (i7 == 3) {
            mo5529d = this.f4382c.mo5529d();
        } else {
            if (i7 != 5) {
                throw new IllegalArgumentException(C0090b.m219e("Invalid state to get outer edge offset: ", i7));
            }
            mo5529d = this.f4382c.mo5530e();
        }
        C1486c c1486c = this.f4387x1;
        if (!(c1486c != null && (!z6 ? !c1486c.m3911s(view, mo5529d, view.getTop()) : !c1486c.m3909q(mo5529d, view.getTop())))) {
            m2486y(i7);
        } else {
            m2486y(2);
            this.f4379X.m2488a(i7);
        }
    }
}
