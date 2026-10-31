package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.e */
/* loaded from: classes.dex */
public final class C0843e implements SwipeDismissBehavior.InterfaceC0748b {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f4449a;

    public C0843e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f4449a = baseTransientBottomBar;
    }

    /* renamed from: a */
    public final void m2500a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f4449a.m2490b(0);
    }
}
