package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0790h implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ C0807y f4146c;

    /* renamed from: e */
    public final /* synthetic */ C0791i f4147e;

    public ViewOnClickListenerC0790h(C0791i c0791i, C0807y c0807y) {
        this.f4147e = c0791i;
        this.f4146c = c0807y;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0791i c0791i = this.f4147e;
        int m1474M0 = ((LinearLayoutManager) c0791i.f4157q2.getLayoutManager()).m1474M0() - 1;
        if (m1474M0 >= 0) {
            Calendar m2423c = C0785e0.m2423c(this.f4146c.f4231c.f4107c.f4217c);
            m2423c.add(2, m1474M0);
            c0791i.m2427Q(new C0804v(m2423c));
        }
    }
}
