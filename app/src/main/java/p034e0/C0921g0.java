package p034e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: e0.g0 */
/* loaded from: classes.dex */
public final class C0921g0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0925i0 f4798a;

    /* renamed from: b */
    public final /* synthetic */ View f4799b;

    public C0921g0(InterfaceC0925i0 interfaceC0925i0, View view) {
        this.f4798a = interfaceC0925i0;
        this.f4799b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4798a.mo104b(this.f4799b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4798a.mo651a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4798a.mo108f();
    }
}
