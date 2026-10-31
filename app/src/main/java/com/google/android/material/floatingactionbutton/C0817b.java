package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C0819d;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
public final class C0817b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f4256a;

    /* renamed from: b */
    public final /* synthetic */ boolean f4257b;

    /* renamed from: c */
    public final /* synthetic */ C0819d.g f4258c;

    /* renamed from: d */
    public final /* synthetic */ C0819d f4259d;

    public C0817b(C0819d c0819d, boolean z6, C0816a c0816a) {
        this.f4259d = c0819d;
        this.f4257b = z6;
        this.f4258c = c0816a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4256a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0819d c0819d = this.f4259d;
        c0819d.f4286m = 0;
        c0819d.f4280g = null;
        if (this.f4256a) {
            return;
        }
        boolean z6 = this.f4257b;
        c0819d.f4290q.m4241b(z6 ? 8 : 4, z6);
        C0819d.g gVar = this.f4258c;
        if (gVar != null) {
            C0816a c0816a = (C0816a) gVar;
            c0816a.f4254a.mo2049a(c0816a.f4255b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C0819d c0819d = this.f4259d;
        c0819d.f4290q.m4241b(0, this.f4257b);
        c0819d.f4286m = 1;
        c0819d.f4280g = animator;
        this.f4256a = false;
    }
}
