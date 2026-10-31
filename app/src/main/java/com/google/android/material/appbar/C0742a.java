package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.a */
/* loaded from: classes.dex */
public final class C0742a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f3801a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f3802b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3803c;

    public C0742a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f3803c = baseBehavior;
        this.f3801a = coordinatorLayout;
        this.f3802b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f3803c.m1843E(this.f3801a, this.f3802b, intValue);
    }
}
