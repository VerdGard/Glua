package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public final class C0788g extends BaseAdapter {

    /* renamed from: s */
    public static final int f4140s;

    /* renamed from: c */
    public final Calendar f4141c;

    /* renamed from: e */
    public final int f4142e;

    /* renamed from: m */
    public final int f4143m;

    static {
        f4140s = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0788g() {
        Calendar m2425e = C0785e0.m2425e(null);
        this.f4141c = m2425e;
        this.f4142e = m2425e.getMaximum(7);
        this.f4143m = m2425e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4142e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i7) {
        int i8 = this.f4142e;
        if (i7 >= i8) {
            return null;
        }
        int i9 = i7 + this.f4143m;
        if (i9 > i8) {
            i9 -= i8;
        }
        return Integer.valueOf(i9);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i8 = i7 + this.f4143m;
        int i9 = this.f4142e;
        if (i8 > i9) {
            i8 -= i9;
        }
        Calendar calendar = this.f4141c;
        calendar.set(7, i8);
        textView.setText(calendar.getDisplayName(7, f4140s, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R$string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0788g(int i7) {
        Calendar m2425e = C0785e0.m2425e(null);
        this.f4141c = m2425e;
        this.f4142e = m2425e.getMaximum(7);
        this.f4143m = i7;
    }
}
