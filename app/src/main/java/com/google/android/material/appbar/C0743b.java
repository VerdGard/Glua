package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p042f0.InterfaceC1155k;

/* renamed from: com.google.android.material.appbar.b */
/* loaded from: classes.dex */
public final class C0743b implements InterfaceC1155k {

    /* renamed from: X */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3804X;

    /* renamed from: c */
    public final /* synthetic */ CoordinatorLayout f3805c;

    /* renamed from: e */
    public final /* synthetic */ AppBarLayout f3806e;

    /* renamed from: m */
    public final /* synthetic */ View f3807m;

    /* renamed from: s */
    public final /* synthetic */ int f3808s;

    public C0743b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7) {
        this.f3804X = baseBehavior;
        this.f3805c = coordinatorLayout;
        this.f3806e = appBarLayout;
        this.f3807m = view;
        this.f3808s = i7;
    }

    @Override // p042f0.InterfaceC1155k
    /* renamed from: a */
    public final boolean mo1053a(View view) {
        this.f3804X.m2272H(this.f3805c, this.f3806e, this.f3807m, this.f3808s, new int[]{0, 0});
        return true;
    }
}
