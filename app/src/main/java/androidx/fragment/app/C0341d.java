package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.ext.C0089a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0368q0;
import androidx.fragment.app.C0357l;

/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public final class C0341d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1667a;

    /* renamed from: b */
    public final /* synthetic */ View f1668b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1669c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0368q0.b f1670d;

    /* renamed from: e */
    public final /* synthetic */ C0357l.a f1671e;

    public C0341d(ViewGroup viewGroup, View view, boolean z6, AbstractC0368q0.b bVar, C0357l.a aVar) {
        this.f1667a = viewGroup;
        this.f1668b = view;
        this.f1669c = z6;
        this.f1670d = bVar;
        this.f1671e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1667a;
        View view = this.f1668b;
        viewGroup.endViewTransition(view);
        if (this.f1669c) {
            C0089a.m205b(this.f1670d.f1851a, view);
        }
        this.f1671e.m1199a();
    }
}
