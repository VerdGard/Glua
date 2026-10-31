package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0477k;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public final class C0475i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C0477k.a f2390a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f2391b;

    /* renamed from: c */
    public final /* synthetic */ View f2392c;

    /* renamed from: d */
    public final /* synthetic */ C0477k f2393d;

    public C0475i(C0477k c0477k, C0477k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2393d = c0477k;
        this.f2390a = aVar;
        this.f2391b = viewPropertyAnimator;
        this.f2392c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2391b.setListener(null);
        View view = this.f2392c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C0477k.a aVar = this.f2390a;
        RecyclerView.AbstractC0432a0 abstractC0432a0 = aVar.f2410a;
        C0477k c0477k = this.f2393d;
        c0477k.m1599c(abstractC0432a0);
        c0477k.f2409r.remove(aVar.f2410a);
        c0477k.m1768i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC0432a0 abstractC0432a0 = this.f2390a.f2410a;
        this.f2393d.getClass();
    }
}
