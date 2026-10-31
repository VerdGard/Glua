package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.b */
/* loaded from: classes.dex */
public final class C0840b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f4446a;

    public C0840b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f4446a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f4446a;
        baseTransientBottomBar.f4411i.setScaleX(floatValue);
        baseTransientBottomBar.f4411i.setScaleY(floatValue);
    }
}
