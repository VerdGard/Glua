package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0477k;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public final class C0476j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0477k.a f2394a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2395b;

    /* renamed from: c */
    public final /* synthetic */ View f2396c;

    /* renamed from: d */
    public final /* synthetic */ C0477k f2397d;

    public C0476j(C0477k c0477k, C0477k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2397d = c0477k;
        this.f2394a = aVar;
        this.f2395b = viewPropertyAnimator;
        this.f2396c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2395b.setListener(null);
        View view = this.f2396c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C0477k.a aVar = this.f2394a;
        RecyclerView.AbstractC0432a0 abstractC0432a0 = aVar.f2411b;
        C0477k c0477k = this.f2397d;
        c0477k.m1599c(abstractC0432a0);
        c0477k.f2409r.remove(aVar.f2411b);
        c0477k.m1768i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC0432a0 abstractC0432a0 = this.f2394a.f2411b;
        this.f2397d.getClass();
    }
}
