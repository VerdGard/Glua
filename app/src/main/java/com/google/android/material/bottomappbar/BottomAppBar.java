package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$animator;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p004a3.C0034a;
import p020c3.C0607a;
import p020c3.C0608b;
import p020c3.C0609c;
import p020c3.C0610d;
import p020c3.C0611e;
import p020c3.C0612f;
import p034e0.C0923h0;
import p034e0.C0946x;
import p082k0.AbstractC1446a;
import p089l.C1481o;
import p131q3.C1767w;
import p139r3.C1832j;
import p189y.C2213a;

/* loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC0288b {

    /* renamed from: y2 */
    public static final int f3840y2 = R$attr.motionDurationLong2;

    /* renamed from: z2 */
    public static final int f3841z2 = R$attr.motionEasingEmphasizedInterpolator;

    /* renamed from: m2 */
    public Integer f3842m2;

    /* renamed from: n2 */
    public Animator f3843n2;

    /* renamed from: o2 */
    public Animator f3844o2;

    /* renamed from: p2 */
    public int f3845p2;

    /* renamed from: q2 */
    public int f3846q2;

    /* renamed from: r2 */
    public int f3847r2;

    /* renamed from: s2 */
    public int f3848s2;

    /* renamed from: t2 */
    public int f3849t2;

    /* renamed from: u2 */
    public boolean f3850u2;

    /* renamed from: v2 */
    public int f3851v2;

    /* renamed from: w2 */
    public boolean f3852w2;

    /* renamed from: x2 */
    public Behavior f3853x2;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: B1 */
        public final Rect f3854B1;

        /* renamed from: C1 */
        public WeakReference<BottomAppBar> f3855C1;

        /* renamed from: D1 */
        public int f3856D1;

        /* renamed from: E1 */
        public final ViewOnLayoutChangeListenerC0751a f3857E1;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        public class ViewOnLayoutChangeListenerC0751a implements View.OnLayoutChangeListener {
            public ViewOnLayoutChangeListenerC0751a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f3855C1.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.f3854B1.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                CoordinatorLayout.C0292f c0292f = (CoordinatorLayout.C0292f) view.getLayoutParams();
                if (behavior.f3856D1 == 0) {
                    if (bottomAppBar.f3847r2 == 1) {
                        ((ViewGroup.MarginLayoutParams) c0292f).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R$dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) c0292f).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) c0292f).rightMargin = bottomAppBar.getRightInset();
                    if (C1767w.m4239b(view)) {
                        ((ViewGroup.MarginLayoutParams) c0292f).leftMargin += 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0292f).rightMargin += 0;
                    }
                }
                int i15 = BottomAppBar.f3840y2;
                bottomAppBar.m2286A();
                throw null;
            }
        }

        public Behavior() {
            this.f3857E1 = new ViewOnLayoutChangeListenerC0751a();
            this.f3854B1 = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3857E1 = new ViewOnLayoutChangeListenerC0751a();
            this.f3854B1 = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: l */
        public final boolean mo985l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f3855C1 = new WeakReference<>(bottomAppBar);
            int i8 = BottomAppBar.f3840y2;
            View m2288w = bottomAppBar.m2288w();
            if (m2288w != null) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                if (!C0946x.g.m2860c(m2288w)) {
                    CoordinatorLayout.C0292f c0292f = (CoordinatorLayout.C0292f) m2288w.getLayoutParams();
                    c0292f.f1422d = 17;
                    int i9 = bottomAppBar.f3847r2;
                    if (i9 == 1) {
                        c0292f.f1422d = 49;
                    }
                    if (i9 == 0) {
                        c0292f.f1422d |= 80;
                    }
                    this.f3856D1 = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0292f) m2288w.getLayoutParams())).bottomMargin;
                    if (m2288w instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) m2288w;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R$animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R$animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.m2447c();
                        floatingActionButton.m2448d(new C0611e(bottomAppBar));
                        floatingActionButton.m2449e();
                    }
                    m2288w.addOnLayoutChangeListener(this.f3857E1);
                    bottomAppBar.m2286A();
                    throw null;
                }
            }
            coordinatorLayout.m972q(bottomAppBar, i7);
            super.mo985l(coordinatorLayout, bottomAppBar, i7);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
        /* renamed from: t */
        public final boolean mo993t(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.mo993t(coordinatorLayout, bottomAppBar, view2, view3, i7, i8);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    public class RunnableC0752a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ ActionMenuView f3859c;

        /* renamed from: e */
        public final /* synthetic */ int f3860e;

        /* renamed from: m */
        public final /* synthetic */ boolean f3861m;

        public RunnableC0752a(ActionMenuView actionMenuView, int i7, boolean z6) {
            this.f3859c = actionMenuView;
            this.f3860e = i7;
            this.f3861m = z6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i7 = this.f3860e;
            boolean z6 = this.f3861m;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            this.f3859c.setTranslationX(bottomAppBar.m2289x(r3, i7, z6));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    public static class C0753b extends AbstractC1446a {
        public static final Parcelable.Creator<C0753b> CREATOR = new a();

        /* renamed from: m */
        public int f3863m;

        /* renamed from: s */
        public boolean f3864s;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        public class a implements Parcelable.ClassLoaderCreator<C0753b> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0753b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0753b[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0753b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0753b(parcel, classLoader);
            }
        }

        public C0753b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3863m = parcel.readInt();
            this.f3864s = parcel.readInt() != 0;
        }

        public C0753b(Toolbar.C0208i c0208i) {
            super(c0208i);
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeInt(this.f3863m);
            parcel.writeInt(this.f3864s ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return 0;
    }

    private int getFabAlignmentAnimationDuration() {
        return C1832j.m4312c(getContext(), f3840y2, 300);
    }

    private float getFabTranslationX() {
        return m2290y(this.f3845p2);
    }

    private float getFabTranslationY() {
        if (this.f3847r2 == 1) {
            return -getTopEdgeTreatment().f3029m;
        }
        return m2288w() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return 0;
    }

    private C0612f getTopEdgeTreatment() {
        throw null;
    }

    /* renamed from: A */
    public final void m2286A() {
        C0612f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        if (this.f3852w2) {
            m2291z();
        }
        throw null;
    }

    /* renamed from: B */
    public final void m2287B(ActionMenuView actionMenuView, int i7, boolean z6, boolean z7) {
        RunnableC0752a runnableC0752a = new RunnableC0752a(actionMenuView, i7, z6);
        if (z7) {
            actionMenuView.post(runnableC0752a);
        } else {
            runnableC0752a.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0288b
    public Behavior getBehavior() {
        if (this.f3853x2 == null) {
            this.f3853x2 = new Behavior();
        }
        return this.f3853x2;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f3029m;
    }

    public int getFabAlignmentMode() {
        return this.f3845p2;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f3848s2;
    }

    public int getFabAnchorMode() {
        return this.f3847r2;
    }

    public int getFabAnimationMode() {
        return this.f3846q2;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f3028e;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f3027c;
    }

    public boolean getHideOnScroll() {
        return this.f3850u2;
    }

    public int getMenuAlignmentMode() {
        return this.f3849t2;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0017d.m78R(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (z6) {
            Animator animator = this.f3844o2;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f3843n2;
            if (animator2 != null) {
                animator2.cancel();
            }
            m2286A();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f3844o2 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (m2291z()) {
            m2287B(actionMenuView, this.f3845p2, this.f3852w2, false);
        } else {
            m2287B(actionMenuView, 0, false, false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0753b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0753b c0753b = (C0753b) parcelable;
        super.onRestoreInstanceState(c0753b.f6946c);
        this.f3845p2 = c0753b.f3863m;
        this.f3852w2 = c0753b.f3864s;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0753b c0753b = new C0753b((Toolbar.C0208i) super.onSaveInstanceState());
        c0753b.f3863m = this.f3845p2;
        c0753b.f3864s = this.f3852w2;
        return c0753b;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C2213a.b.m5372h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f7) {
        if (f7 != getCradleVerticalOffset()) {
            C0612f topEdgeTreatment = getTopEdgeTreatment();
            if (f7 >= 0.0f) {
                topEdgeTreatment.f3029m = f7;
                throw null;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        throw null;
    }

    public void setFabAlignmentMode(int i7) {
        int i8;
        this.f3851v2 = 0;
        boolean z6 = this.f3852w2;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        if (C0946x.g.m2860c(this)) {
            Animator animator = this.f3844o2;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (m2291z()) {
                i8 = i7;
            } else {
                z6 = false;
                i8 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                ofFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
                if (Math.abs(actionMenuView.getTranslationX() - m2289x(actionMenuView, i8, z6)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                    ofFloat2.addListener(new C0610d(this, actionMenuView, i8, z6));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f3844o2 = animatorSet2;
            animatorSet2.addListener(new C0609c(this));
            this.f3844o2.start();
        } else {
            int i9 = this.f3851v2;
            if (i9 != 0) {
                this.f3851v2 = 0;
                getMenu().clear();
                mo632k(i9);
            }
        }
        if (this.f3845p2 != i7 && C0946x.g.m2860c(this)) {
            Animator animator2 = this.f3843n2;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f3846q2 == 1) {
                View m2288w = m2288w();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m2288w instanceof FloatingActionButton ? (FloatingActionButton) m2288w : null, "translationX", m2290y(i7));
                ofFloat3.setDuration(getFabAlignmentAnimationDuration());
                arrayList2.add(ofFloat3);
            } else {
                View m2288w2 = m2288w();
                FloatingActionButton floatingActionButton = m2288w2 instanceof FloatingActionButton ? (FloatingActionButton) m2288w2 : null;
                if (floatingActionButton != null && !floatingActionButton.m2452h()) {
                    floatingActionButton.m2451g(new C0608b(this, i7), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            animatorSet3.setInterpolator(C1832j.m4313d(getContext(), f3841z2, C0034a.f108a));
            this.f3843n2 = animatorSet3;
            animatorSet3.addListener(new C0607a(this));
            this.f3843n2.start();
        }
        this.f3845p2 = i7;
    }

    public void setFabAlignmentModeEndMargin(int i7) {
        if (this.f3848s2 == i7) {
            return;
        }
        this.f3848s2 = i7;
        m2286A();
        throw null;
    }

    public void setFabAnchorMode(int i7) {
        this.f3847r2 = i7;
        m2286A();
        throw null;
    }

    public void setFabAnimationMode(int i7) {
        this.f3846q2 = i7;
    }

    public void setFabCornerSize(float f7) {
        if (f7 == getTopEdgeTreatment().f3030s) {
            return;
        }
        getTopEdgeTreatment().f3030s = f7;
        throw null;
    }

    public void setFabCradleMargin(float f7) {
        if (f7 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f3028e = f7;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f7) {
        if (f7 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f3027c = f7;
        throw null;
    }

    public void setHideOnScroll(boolean z6) {
        this.f3850u2 = z6;
    }

    public void setMenuAlignmentMode(int i7) {
        if (this.f3849t2 != i7) {
            this.f3849t2 = i7;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                m2287B(actionMenuView, this.f3845p2, m2291z(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3842m2 != null) {
            drawable = C2213a.m5359g(drawable.mutate());
            C2213a.b.m5371g(drawable, this.f3842m2.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i7) {
        this.f3842m2 = Integer.valueOf(i7);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: w */
    public final View m2288w() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getParent();
        List list = (List) ((C1481o) coordinatorLayout.f1410e.f7568b).get(this);
        ArrayList arrayList = coordinatorLayout.f1412s;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: x */
    public final int m2289x(ActionMenuView actionMenuView, int i7, boolean z6) {
        int i8;
        if (this.f3849t2 != 1 && (i7 != 1 || !z6)) {
            return 0;
        }
        boolean m4239b = C1767w.m4239b(this);
        int measuredWidth = m4239b ? getMeasuredWidth() : 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0206g) && (((Toolbar.C0206g) childAt.getLayoutParams()).f2699a & 8388615) == 8388611) {
                measuredWidth = m4239b ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = m4239b ? actionMenuView.getRight() : actionMenuView.getLeft();
        if (getNavigationIcon() == null) {
            i8 = getResources().getDimensionPixelOffset(R$dimen.m3_bottomappbar_horizontal_padding);
            if (!m4239b) {
                i8 = -i8;
            }
        } else {
            i8 = 0;
        }
        return measuredWidth - ((right + 0) + i8);
    }

    /* renamed from: y */
    public final float m2290y(int i7) {
        boolean m4239b = C1767w.m4239b(this);
        if (i7 != 1) {
            return 0.0f;
        }
        View m2288w = m2288w();
        int i8 = 0;
        if (this.f3848s2 != -1 && m2288w != null) {
            i8 = 0 + (m2288w.getMeasuredWidth() / 2) + this.f3848s2;
        }
        return ((getMeasuredWidth() / 2) - i8) * (m4239b ? -1 : 1);
    }

    /* renamed from: z */
    public final boolean m2291z() {
        View m2288w = m2288w();
        FloatingActionButton floatingActionButton = m2288w instanceof FloatingActionButton ? (FloatingActionButton) m2288w : null;
        return floatingActionButton != null && floatingActionButton.m2453i();
    }
}
