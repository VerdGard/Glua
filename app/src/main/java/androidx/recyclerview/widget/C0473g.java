package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
/* loaded from: classes.dex */
public final class C0473g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0432a0 f2380a;

    /* renamed from: b */
    public final /* synthetic */ View f2381b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f2382c;

    /* renamed from: d */
    public final /* synthetic */ C0477k f2383d;

    public C0473g(View view, ViewPropertyAnimator viewPropertyAnimator, C0477k c0477k, RecyclerView.AbstractC0432a0 abstractC0432a0) {
        this.f2383d = c0477k;
        this.f2380a = abstractC0432a0;
        this.f2381b = view;
        this.f2382c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2381b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2382c.setListener(null);
        C0477k c0477k = this.f2383d;
        RecyclerView.AbstractC0432a0 abstractC0432a0 = this.f2380a;
        c0477k.m1599c(abstractC0432a0);
        c0477k.f2406o.remove(abstractC0432a0);
        c0477k.m1768i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2383d.getClass();
    }
}
