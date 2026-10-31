package p021c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: c4.e */
/* loaded from: classes.dex */
public final class C0617e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0619g f3037a;

    public C0617e(C0619g c0619g) {
        this.f3037a = c0619g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3037a.f3072b.m2539h(true);
    }
}
