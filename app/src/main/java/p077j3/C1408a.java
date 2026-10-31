package p077j3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: j3.a */
/* loaded from: classes.dex */
public final class C1408a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1411d f6768a;

    public C1408a(InterfaceC1411d interfaceC1411d) {
        this.f6768a = interfaceC1411d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6768a.mo3760a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6768a.mo3761b();
    }
}
