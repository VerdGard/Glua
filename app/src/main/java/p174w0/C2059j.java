package p174w0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: w0.j */
/* loaded from: classes.dex */
public final class C2059j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2057h f9410a;

    public C2059j(AbstractC2057h abstractC2057h) {
        this.f9410a = abstractC2057h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9410a.m5111m();
        animator.removeListener(this);
    }
}
