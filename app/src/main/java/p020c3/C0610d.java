package p020c3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* renamed from: c3.d */
/* loaded from: classes.dex */
public final class C0610d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3021a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f3022b;

    /* renamed from: c */
    public final /* synthetic */ int f3023c;

    /* renamed from: d */
    public final /* synthetic */ boolean f3024d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f3025e;

    public C0610d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i7, boolean z6) {
        this.f3025e = bottomAppBar;
        this.f3022b = actionMenuView;
        this.f3023c = i7;
        this.f3024d = z6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3021a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3021a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f3025e;
        int i7 = bottomAppBar.f3851v2;
        boolean z6 = i7 != 0;
        if (i7 != 0) {
            bottomAppBar.f3851v2 = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.mo632k(i7);
        }
        bottomAppBar.m2287B(this.f3022b, this.f3023c, this.f3024d, z6);
    }
}
