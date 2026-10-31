package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.g0 */
/* loaded from: classes.dex */
public final class C0789g0 extends RecyclerView.AbstractC0436e<a> {

    /* renamed from: c */
    public final C0791i<?> f4144c;

    /* renamed from: com.google.android.material.datepicker.g0$a */
    public static class a extends RecyclerView.AbstractC0432a0 {

        /* renamed from: t */
        public final TextView f4145t;

        public a(TextView textView) {
            super(textView);
            this.f4145t = textView;
        }
    }

    public C0789g0(C0791i<?> c0791i) {
        this.f4144c = c0791i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: a */
    public final int mo1583a() {
        return this.f4144c.f4151k2.f4105Y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: d */
    public final void mo1586d(a aVar, int i7) {
        C0791i<?> c0791i = this.f4144c;
        int i8 = c0791i.f4151k2.f4107c.f4219m + i7;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i8));
        TextView textView = aVar.f4145t;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(C0785e0.m2424d().get(1) == i8 ? String.format(context.getString(R$string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i8)) : String.format(context.getString(R$string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i8)));
        C0780c c0780c = c0791i.f4155o2;
        Calendar m2424d = C0785e0.m2424d();
        C0778b c0778b = m2424d.get(1) == i8 ? c0780c.f4130f : c0780c.f4128d;
        Iterator<Long> it = c0791i.f4150j2.m2418o().iterator();
        while (it.hasNext()) {
            m2424d.setTimeInMillis(it.next().longValue());
            if (m2424d.get(1) == i8) {
                c0778b = c0780c.f4129e;
            }
        }
        c0778b.m2411b(textView);
        textView.setOnClickListener(new ViewOnClickListenerC0787f0(this, i8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: f */
    public final RecyclerView.AbstractC0432a0 mo1588f(RecyclerView recyclerView, int i7) {
        return new a((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R$layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
