package p139r3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: r3.h */
/* loaded from: classes.dex */
public final class C1830h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f8272a;

    /* renamed from: b */
    public final /* synthetic */ int f8273b;

    /* renamed from: c */
    public final /* synthetic */ C1831i f8274c;

    public C1830h(C1831i c1831i, boolean z6, int i7) {
        this.f8274c = c1831i;
        this.f8272a = z6;
        this.f8273b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1831i c1831i = this.f8274c;
        c1831i.f8257b.setTranslationX(0.0f);
        c1831i.m4309c(0.0f, this.f8273b, this.f8272a);
    }
}
