package p139r3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: r3.e */
/* loaded from: classes.dex */
public final class C1827e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1828f f8269a;

    public C1827e(C1828f c1828f) {
        this.f8269a = c1828f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1828f c1828f = this.f8269a;
        c1828f.f8257b.setTranslationY(0.0f);
        c1828f.m4306b(0.0f);
    }
}
