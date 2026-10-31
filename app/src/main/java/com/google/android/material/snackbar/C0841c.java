package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import p121p0.C1690b;

/* renamed from: com.google.android.material.snackbar.c */
/* loaded from: classes.dex */
public final class C0841c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f4447a;

    public C0841c(BaseTransientBottomBar baseTransientBottomBar, int i7) {
        this.f4447a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1690b c1690b = BaseTransientBottomBar.f4397u;
        this.f4447a.f4411i.setTranslationY(intValue);
    }
}
