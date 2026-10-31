package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.transformation.a */
/* loaded from: classes.dex */
public final class C0869a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f4639a;

    public C0869a(View view) {
        this.f4639a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4639a.invalidate();
    }
}
