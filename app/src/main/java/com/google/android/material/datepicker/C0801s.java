package com.google.android.material.datepicker;

import android.view.View;
import p034e0.C0935n0;
import p034e0.InterfaceC0938p;

/* renamed from: com.google.android.material.datepicker.s */
/* loaded from: classes.dex */
public final class C0801s implements InterfaceC0938p {

    /* renamed from: a */
    public final /* synthetic */ int f4207a;

    /* renamed from: b */
    public final /* synthetic */ View f4208b;

    /* renamed from: c */
    public final /* synthetic */ int f4209c;

    public C0801s(int i7, View view, int i8) {
        this.f4207a = i7;
        this.f4208b = view;
        this.f4209c = i8;
    }

    @Override // p034e0.InterfaceC0938p
    /* renamed from: a */
    public final C0935n0 mo133a(View view, C0935n0 c0935n0) {
        int i7 = c0935n0.m2750a(7).f9765b;
        View view2 = this.f4208b;
        int i8 = this.f4207a;
        if (i8 >= 0) {
            view2.getLayoutParams().height = i8 + i7;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f4209c + i7, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0935n0;
    }
}
