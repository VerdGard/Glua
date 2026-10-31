package p021c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: c4.n */
/* loaded from: classes.dex */
public final class C0626n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0627o f3056a;

    public C0626n(C0627o c0627o) {
        this.f3056a = c0627o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0627o c0627o = this.f3056a;
        c0627o.m2076q();
        c0627o.f3070r.start();
    }
}
