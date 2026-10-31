package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p077j3.InterfaceC1411d;

/* renamed from: com.google.android.material.transformation.c */
/* loaded from: classes.dex */
public final class C0871c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1411d f4642a;

    public C0871c(InterfaceC1411d interfaceC1411d) {
        this.f4642a = interfaceC1411d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC1411d interfaceC1411d = this.f4642a;
        InterfaceC1411d.d revealInfo = interfaceC1411d.getRevealInfo();
        revealInfo.f6775c = Float.MAX_VALUE;
        interfaceC1411d.setRevealInfo(revealInfo);
    }
}
