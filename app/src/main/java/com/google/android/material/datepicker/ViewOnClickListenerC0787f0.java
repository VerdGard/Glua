package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.f0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0787f0 implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ int f4138c;

    /* renamed from: e */
    public final /* synthetic */ C0789g0 f4139e;

    public ViewOnClickListenerC0787f0(C0789g0 c0789g0, int i7) {
        this.f4139e = c0789g0;
        this.f4138c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0789g0 c0789g0 = this.f4139e;
        C0804v m2436a = C0804v.m2436a(this.f4138c, c0789g0.f4144c.f4153m2.f4218e);
        C0791i<?> c0791i = c0789g0.f4144c;
        C0776a c0776a = c0791i.f4151k2;
        C0804v c0804v = c0776a.f4107c;
        Calendar calendar = c0804v.f4217c;
        Calendar calendar2 = m2436a.f4217c;
        if (calendar2.compareTo(calendar) < 0) {
            m2436a = c0804v;
        } else {
            C0804v c0804v2 = c0776a.f4108e;
            if (calendar2.compareTo(c0804v2.f4217c) > 0) {
                m2436a = c0804v2;
            }
        }
        c0791i.m2427Q(m2436a);
        c0791i.m2428R(1);
    }
}
