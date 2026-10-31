package p005a4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: a4.c */
/* loaded from: classes.dex */
public final class C0044c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f129a;

    public C0044c(BaseTransientBottomBar baseTransientBottomBar, int i7) {
        this.f129a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f129a.m2491c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f129a;
        InterfaceC0049h interfaceC0049h = baseTransientBottomBar.f4412j;
        int i7 = baseTransientBottomBar.f4404b;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC0049h;
        snackbarContentLayout.f4441c.setAlpha(1.0f);
        long j7 = i7;
        ViewPropertyAnimator duration = snackbarContentLayout.f4441c.animate().alpha(0.0f).setDuration(j7);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f4443m;
        long j8 = 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j8).start();
        if (snackbarContentLayout.f4442e.getVisibility() == 0) {
            snackbarContentLayout.f4442e.setAlpha(1.0f);
            snackbarContentLayout.f4442e.animate().alpha(0.0f).setDuration(j7).setInterpolator(timeInterpolator).setStartDelay(j8).start();
        }
    }
}
