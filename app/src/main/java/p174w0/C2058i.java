package p174w0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p089l.C1467a;

/* renamed from: w0.i */
/* loaded from: classes.dex */
public final class C2058i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1467a f9408a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC2057h f9409b;

    public C2058i(AbstractC2057h abstractC2057h, C1467a c1467a) {
        this.f9409b = abstractC2057h;
        this.f9408a = c1467a;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f9408a.remove(animator);
        this.f9409b.f9384B1.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9409b.f9384B1.add(animator);
    }
}
