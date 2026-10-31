package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0159f;
import androidx.appcompat.view.menu.InterfaceC0164k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0164k {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0164k
    /* renamed from: b */
    public final void mo496b(C0159f c0159f) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
