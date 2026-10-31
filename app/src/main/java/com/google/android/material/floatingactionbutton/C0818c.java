package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C0819d;

/* renamed from: com.google.android.material.floatingactionbutton.c */
/* loaded from: classes.dex */
public final class C0818c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f4260a;

    /* renamed from: b */
    public final /* synthetic */ C0819d.g f4261b;

    /* renamed from: c */
    public final /* synthetic */ C0819d f4262c;

    public C0818c(C0819d c0819d, boolean z6, C0816a c0816a) {
        this.f4262c = c0819d;
        this.f4260a = z6;
        this.f4261b = c0816a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0819d c0819d = this.f4262c;
        c0819d.f4286m = 0;
        c0819d.f4280g = null;
        C0819d.g gVar = this.f4261b;
        if (gVar != null) {
            ((C0816a) gVar).f4254a.mo2050b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C0819d c0819d = this.f4262c;
        c0819d.f4290q.m4241b(0, this.f4260a);
        c0819d.f4286m = 2;
        c0819d.f4280g = animator;
    }
}
