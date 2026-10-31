package com.google.android.material.datepicker;

import android.view.View;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0796n implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ C0791i f4174c;

    public ViewOnClickListenerC0796n(C0791i c0791i) {
        this.f4174c = c0791i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0791i c0791i = this.f4174c;
        int i7 = c0791i.f4154n2;
        if (i7 == 2) {
            c0791i.m2428R(1);
        } else if (i7 == 1) {
            c0791i.m2428R(2);
        }
    }
}
