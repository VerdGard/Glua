package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p004a3.C0034a;
import p121p0.C1691c;
import p139r3.C1832j;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0289c<V> {

    /* renamed from: X */
    public TimeInterpolator f3814X;

    /* renamed from: Y */
    public int f3815Y;

    /* renamed from: Z */
    public int f3816Z;

    /* renamed from: c */
    public final LinkedHashSet<InterfaceC0746b> f3817c;

    /* renamed from: e */
    public int f3818e;

    /* renamed from: m */
    public int f3819m;

    /* renamed from: s */
    public TimeInterpolator f3820s;

    /* renamed from: w1 */
    public int f3821w1;

    /* renamed from: x1 */
    public ViewPropertyAnimator f3822x1;

    /* renamed from: y1 */
    public static final int f3812y1 = R$attr.motionDurationLong2;

    /* renamed from: z1 */
    public static final int f3813z1 = R$attr.motionDurationMedium4;

    /* renamed from: A1 */
    public static final int f3811A1 = R$attr.motionEasingEmphasizedInterpolator;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C0745a extends AnimatorListenerAdapter {
        public C0745a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f3822x1 = null;
        }
    }

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    public interface InterfaceC0746b {
        /* renamed from: a */
        void m2281a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f3817c = new LinkedHashSet<>();
        this.f3815Y = 0;
        this.f3816Z = 2;
        this.f3821w1 = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3817c = new LinkedHashSet<>();
        this.f3815Y = 0;
        this.f3816Z = 2;
        this.f3821w1 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: l */
    public boolean mo985l(CoordinatorLayout coordinatorLayout, V v5, int i7) {
        this.f3815Y = v5.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v5.getLayoutParams()).bottomMargin;
        this.f3818e = C1832j.m4312c(v5.getContext(), f3812y1, 225);
        this.f3819m = C1832j.m4312c(v5.getContext(), f3813z1, 175);
        Context context = v5.getContext();
        C1691c c1691c = C0034a.f111d;
        int i8 = f3811A1;
        this.f3820s = C1832j.m4313d(context, i8, c1691c);
        this.f3814X = C1832j.m4313d(v5.getContext(), i8, C0034a.f110c);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: p */
    public final void mo989p(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int[] iArr) {
        LinkedHashSet<InterfaceC0746b> linkedHashSet = this.f3817c;
        if (i7 > 0) {
            if (this.f3816Z == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f3822x1;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f3816Z = 1;
            Iterator<InterfaceC0746b> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().m2281a();
            }
            m2280w(view, this.f3815Y + this.f3821w1, this.f3819m, this.f3814X);
            return;
        }
        if (i7 < 0) {
            if (this.f3816Z == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f3822x1;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f3816Z = 2;
            Iterator<InterfaceC0746b> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                it2.next().m2281a();
            }
            m2280w(view, 0, this.f3818e, this.f3820s);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0289c
    /* renamed from: t */
    public boolean mo993t(CoordinatorLayout coordinatorLayout, V v5, View view, View view2, int i7, int i8) {
        return i7 == 2;
    }

    /* renamed from: w */
    public final void m2280w(V v5, int i7, long j7, TimeInterpolator timeInterpolator) {
        this.f3822x1 = v5.animate().translationY(i7).setInterpolator(timeInterpolator).setDuration(j7).setListener(new C0745a());
    }
}
