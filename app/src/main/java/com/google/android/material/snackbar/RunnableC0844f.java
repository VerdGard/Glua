package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p005a4.C0043b;
import p005a4.C0048g;

/* renamed from: com.google.android.material.snackbar.f */
/* loaded from: classes.dex */
public final class RunnableC0844f implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ BaseTransientBottomBar f4450c;

    public RunnableC0844f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f4450c = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f4450c;
        BaseTransientBottomBar.C0838e c0838e = baseTransientBottomBar.f4411i;
        if (c0838e == null) {
            return;
        }
        ViewParent parent = c0838e.getParent();
        BaseTransientBottomBar.C0838e c0838e2 = baseTransientBottomBar.f4411i;
        if (parent != null) {
            c0838e2.setVisibility(0);
        }
        if (c0838e2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(baseTransientBottomBar.f4406d);
            ofFloat.addUpdateListener(new C0839a(baseTransientBottomBar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(baseTransientBottomBar.f4408f);
            ofFloat2.addUpdateListener(new C0840b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f4403a);
            animatorSet.addListener(new C0048g(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int height = c0838e2.getHeight();
        ViewGroup.LayoutParams layoutParams = c0838e2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        c0838e2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f4407e);
        valueAnimator.setDuration(baseTransientBottomBar.f4405c);
        valueAnimator.addListener(new C0043b(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new C0841c(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
