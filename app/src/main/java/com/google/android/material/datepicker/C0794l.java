package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.R$string;
import p034e0.C0908a;
import p042f0.C1151g;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class C0794l extends C0908a {

    /* renamed from: d */
    public final /* synthetic */ C0791i f4170d;

    public C0794l(C0791i c0791i) {
        this.f4170d = c0791i;
    }

    @Override // p034e0.C0908a
    /* renamed from: d */
    public final void mo134d(View view, C1151g c1151g) {
        this.f4774a.onInitializeAccessibilityNodeInfo(view, c1151g.f5685a);
        C0791i c0791i = this.f4170d;
        c1151g.m3344i(c0791i.m1243q(c0791i.f4161u2.getVisibility() == 0 ? R$string.mtrl_picker_toggle_to_year_selection : R$string.mtrl_picker_toggle_to_day_selection));
    }
}
