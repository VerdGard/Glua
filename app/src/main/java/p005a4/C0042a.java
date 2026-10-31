package p005a4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: a4.a */
/* loaded from: classes.dex */
public final class C0042a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f127a;

    public C0042a(BaseTransientBottomBar baseTransientBottomBar, int i7) {
        this.f127a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f127a.m2491c();
    }
}
