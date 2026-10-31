package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
/* loaded from: classes.dex */
public final class C0474h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.AbstractC0432a0 f2384a;

    /* renamed from: b */
    public final /* synthetic */ int f2385b;

    /* renamed from: c */
    public final /* synthetic */ View f2386c;

    /* renamed from: d */
    public final /* synthetic */ int f2387d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f2388e;

    /* renamed from: f */
    public final /* synthetic */ C0477k f2389f;

    public C0474h(C0477k c0477k, RecyclerView.AbstractC0432a0 abstractC0432a0, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2389f = c0477k;
        this.f2384a = abstractC0432a0;
        this.f2385b = i7;
        this.f2386c = view;
        this.f2387d = i8;
        this.f2388e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i7 = this.f2385b;
        View view = this.f2386c;
        if (i7 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f2387d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2388e.setListener(null);
        C0477k c0477k = this.f2389f;
        RecyclerView.AbstractC0432a0 abstractC0432a0 = this.f2384a;
        c0477k.m1599c(abstractC0432a0);
        c0477k.f2407p.remove(abstractC0432a0);
        c0477k.m1768i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2389f.getClass();
    }
}
