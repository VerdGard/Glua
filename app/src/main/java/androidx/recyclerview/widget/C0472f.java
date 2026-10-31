package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public final class C0472f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0432a0 f2376a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2377b;

    /* renamed from: c */
    public final /* synthetic */ View f2378c;

    /* renamed from: d */
    public final /* synthetic */ C0477k f2379d;

    public C0472f(View view, ViewPropertyAnimator viewPropertyAnimator, C0477k c0477k, RecyclerView.AbstractC0432a0 abstractC0432a0) {
        this.f2379d = c0477k;
        this.f2376a = abstractC0432a0;
        this.f2377b = viewPropertyAnimator;
        this.f2378c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2377b.setListener(null);
        this.f2378c.setAlpha(1.0f);
        C0477k c0477k = this.f2379d;
        RecyclerView.AbstractC0432a0 abstractC0432a0 = this.f2376a;
        c0477k.m1599c(abstractC0432a0);
        c0477k.f2408q.remove(abstractC0432a0);
        c0477k.m1768i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2379d.getClass();
    }
}
