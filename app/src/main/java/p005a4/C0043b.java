package p005a4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: a4.b */
/* loaded from: classes.dex */
public final class C0043b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f128a;

    public C0043b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f128a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f128a.m2492d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f128a;
        InterfaceC0049h interfaceC0049h = baseTransientBottomBar.f4412j;
        int i7 = baseTransientBottomBar.f4405c;
        int i8 = baseTransientBottomBar.f4403a;
        int i9 = i7 - i8;
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC0049h;
        snackbarContentLayout.f4441c.setAlpha(0.0f);
        long j7 = i8;
        ViewPropertyAnimator duration = snackbarContentLayout.f4441c.animate().alpha(1.0f).setDuration(j7);
        TimeInterpolator timeInterpolator = snackbarContentLayout.f4443m;
        long j8 = i9;
        duration.setInterpolator(timeInterpolator).setStartDelay(j8).start();
        if (snackbarContentLayout.f4442e.getVisibility() == 0) {
            snackbarContentLayout.f4442e.setAlpha(0.0f);
            snackbarContentLayout.f4442e.animate().alpha(1.0f).setDuration(j7).setInterpolator(timeInterpolator).setStartDelay(j8).start();
        }
    }
}
