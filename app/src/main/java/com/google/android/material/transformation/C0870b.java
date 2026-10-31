package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import p077j3.InterfaceC1411d;

/* renamed from: com.google.android.material.transformation.b */
/* loaded from: classes.dex */
public final class C0870b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1411d f4640a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f4641b;

    public C0870b(InterfaceC1411d interfaceC1411d, Drawable drawable) {
        this.f4640a = interfaceC1411d;
        this.f4641b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4640a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4640a.setCircularRevealOverlayDrawable(this.f4641b);
    }
}
