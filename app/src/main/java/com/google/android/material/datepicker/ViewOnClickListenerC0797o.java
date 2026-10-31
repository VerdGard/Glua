package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0797o implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ C0807y f4175c;

    /* renamed from: e */
    public final /* synthetic */ C0791i f4176e;

    public ViewOnClickListenerC0797o(C0791i c0791i, C0807y c0807y) {
        this.f4176e = c0791i;
        this.f4175c = c0807y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0791i c0791i = this.f4176e;
        int m1473L0 = ((LinearLayoutManager) c0791i.f4157q2.getLayoutManager()).m1473L0() + 1;
        if (m1473L0 < c0791i.f4157q2.getAdapter().mo1583a()) {
            Calendar m2423c = C0785e0.m2423c(this.f4175c.f4231c.f4107c.f4217c);
            m2423c.add(2, m1473L0);
            c0791i.m2427Q(new C0804v(m2423c));
        }
    }
}
