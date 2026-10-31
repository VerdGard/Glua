package com.so.revelation.lua.p024gg;

import com.so.revelation.lua.p024gg.PathSelector;

/* renamed from: com.so.revelation.lua.gg.a */
/* loaded from: classes.dex */
public final class RunnableC0734a implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f3686c;

    /* renamed from: e */
    public final /* synthetic */ PathSelector.ViewOnClickListenerC0726b f3687e;

    public RunnableC0734a(PathSelector.ViewOnClickListenerC0726b viewOnClickListenerC0726b, int i7) {
        this.f3687e = viewOnClickListenerC0726b;
        this.f3686c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3687e.f3669y1.setSelection(this.f3686c);
    }
}
