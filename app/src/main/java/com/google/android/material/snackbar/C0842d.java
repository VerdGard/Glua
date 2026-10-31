package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import p121p0.C1690b;

/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes.dex */
public final class C0842d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f4448a;

    public C0842d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f4448a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C1690b c1690b = BaseTransientBottomBar.f4397u;
        this.f4448a.f4411i.setTranslationY(intValue);
    }
}
