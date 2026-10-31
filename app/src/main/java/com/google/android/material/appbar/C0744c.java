package com.google.android.material.appbar;

import android.view.View;
import p042f0.InterfaceC1155k;

/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
public final class C0744c implements InterfaceC1155k {

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout f3809c;

    /* renamed from: e */
    public final /* synthetic */ boolean f3810e;

    public C0744c(AppBarLayout appBarLayout, boolean z6) {
        this.f3809c = appBarLayout;
        this.f3810e = z6;
    }

    @Override // p042f0.InterfaceC1155k
    /* renamed from: a */
    public final boolean mo1053a(View view) {
        this.f3809c.setExpanded(this.f3810e);
        return true;
    }
}
