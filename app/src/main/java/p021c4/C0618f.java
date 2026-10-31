package p021c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: c4.f */
/* loaded from: classes.dex */
public final class C0618f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0619g f3038a;

    public C0618f(C0619g c0619g) {
        this.f3038a = c0619g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3038a.f3072b.m2539h(false);
    }
}
