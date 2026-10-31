package p005a4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: a4.g */
/* loaded from: classes.dex */
public final class C0048g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f133a;

    public C0048g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f133a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f133a.m2492d();
    }
}
