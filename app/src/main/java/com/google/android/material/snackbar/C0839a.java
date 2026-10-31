package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes.dex */
public final class C0839a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f4445a;

    public C0839a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f4445a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4445a.f4411i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
