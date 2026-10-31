package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class C0795m extends RecyclerView.AbstractC0448q {

    /* renamed from: a */
    public final /* synthetic */ C0807y f4171a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f4172b;

    /* renamed from: c */
    public final /* synthetic */ C0791i f4173c;

    public C0795m(C0791i c0791i, C0807y c0807y, MaterialButton materialButton) {
        this.f4173c = c0791i;
        this.f4171a = c0807y;
        this.f4172b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0448q
    /* renamed from: a */
    public final void mo1657a(RecyclerView recyclerView, int i7) {
        if (i7 == 0) {
            recyclerView.announceForAccessibility(this.f4172b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0448q
    /* renamed from: b */
    public final void mo1658b(RecyclerView recyclerView, int i7, int i8) {
        C0791i c0791i = this.f4173c;
        int m1473L0 = i7 < 0 ? ((LinearLayoutManager) c0791i.f4157q2.getLayoutManager()).m1473L0() : ((LinearLayoutManager) c0791i.f4157q2.getLayoutManager()).m1474M0();
        C0807y c0807y = this.f4171a;
        Calendar m2423c = C0785e0.m2423c(c0807y.f4231c.f4107c.f4217c);
        m2423c.add(2, m1473L0);
        c0791i.f4153m2 = new C0804v(m2423c);
        Calendar m2423c2 = C0785e0.m2423c(c0807y.f4231c.f4107c.f4217c);
        m2423c2.add(2, m1473L0);
        m2423c2.set(5, 1);
        Calendar m2423c3 = C0785e0.m2423c(m2423c2);
        m2423c3.get(2);
        m2423c3.get(1);
        m2423c3.getMaximum(7);
        m2423c3.getActualMaximum(5);
        m2423c3.getTimeInMillis();
        long timeInMillis = m2423c3.getTimeInMillis();
        this.f4172b.setText(Build.VERSION.SDK_INT >= 24 ? C0785e0.m2422b("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228));
    }
}
