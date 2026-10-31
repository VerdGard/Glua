package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C0843e;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.InterfaceC1155k;

/* renamed from: com.google.android.material.behavior.a */
/* loaded from: classes.dex */
public final class C0750a implements InterfaceC1155k {

    /* renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f3839c;

    public C0750a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3839c = swipeDismissBehavior;
    }

    @Override // p042f0.InterfaceC1155k
    /* renamed from: a */
    public final boolean mo1053a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f3839c;
        boolean z6 = false;
        if (!swipeDismissBehavior.mo2282w(view)) {
            return false;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        boolean z7 = C0946x.e.m2847d(view) == 1;
        int i7 = swipeDismissBehavior.f3824X;
        if ((i7 == 0 && z7) || (i7 == 1 && !z7)) {
            z6 = true;
        }
        int width = view.getWidth();
        if (z6) {
            width = -width;
        }
        C0946x.m2810k(view, width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.InterfaceC0748b interfaceC0748b = swipeDismissBehavior.f3828e;
        if (interfaceC0748b != null) {
            ((C0843e) interfaceC0748b).m2500a(view);
        }
        return true;
    }
}
