package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R$string;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import p026d0.C0875c;

/* renamed from: com.google.android.material.datepicker.w */
/* loaded from: classes.dex */
public final class C0805w extends BaseAdapter {

    /* renamed from: Z */
    public static final int f4221Z = C0785e0.m2425e(null).getMaximum(4);

    /* renamed from: w1 */
    public static final int f4222w1 = (C0785e0.m2425e(null).getMaximum(7) + C0785e0.m2425e(null).getMaximum(5)) - 1;

    /* renamed from: X */
    public final C0776a f4223X;

    /* renamed from: Y */
    public final AbstractC0786f f4224Y;

    /* renamed from: c */
    public final C0804v f4225c;

    /* renamed from: e */
    public final InterfaceC0782d<?> f4226e;

    /* renamed from: m */
    public Collection<Long> f4227m;

    /* renamed from: s */
    public C0780c f4228s;

    public C0805w(C0804v c0804v, InterfaceC0782d<?> interfaceC0782d, C0776a c0776a, AbstractC0786f abstractC0786f) {
        this.f4225c = c0804v;
        this.f4226e = interfaceC0782d;
        this.f4223X = c0776a;
        this.f4224Y = abstractC0786f;
        this.f4227m = interfaceC0782d.m2418o();
    }

    /* renamed from: b */
    public final int m2439b() {
        int i7 = this.f4223X.f4104X;
        C0804v c0804v = this.f4225c;
        Calendar calendar = c0804v.f4217c;
        int i8 = calendar.get(7);
        if (i7 <= 0) {
            i7 = calendar.getFirstDayOfWeek();
        }
        int i9 = i8 - i7;
        return i9 < 0 ? i9 + c0804v.f4220s : i9;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i7) {
        if (i7 < m2439b()) {
            return null;
        }
        int m2439b = m2439b();
        C0804v c0804v = this.f4225c;
        if (i7 > (m2439b + c0804v.f4214X) - 1) {
            return null;
        }
        int m2439b2 = (i7 - m2439b()) + 1;
        Calendar m2423c = C0785e0.m2423c(c0804v.f4217c);
        m2423c.set(5, m2439b2);
        return Long.valueOf(m2423c.getTimeInMillis());
    }

    /* renamed from: d */
    public final void m2441d(TextView textView, long j7, int i7) {
        boolean z6;
        boolean z7;
        String format;
        C0778b c0778b;
        boolean z8;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z9 = C0785e0.m2424d().getTimeInMillis() == j7;
        InterfaceC0782d<?> interfaceC0782d = this.f4226e;
        Iterator<C0875c<Long, Long>> it = interfaceC0782d.m2415g().iterator();
        while (true) {
            if (!it.hasNext()) {
                z6 = false;
                break;
            }
            Long l7 = it.next().f4643a;
            if (l7 != null && l7.longValue() == j7) {
                z6 = true;
                break;
            }
        }
        Iterator<C0875c<Long, Long>> it2 = interfaceC0782d.m2415g().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z7 = false;
                break;
            }
            Long l8 = it2.next().f4644b;
            if (l8 != null && l8.longValue() == j7) {
                z7 = true;
                break;
            }
        }
        Calendar m2424d = C0785e0.m2424d();
        Calendar m2425e = C0785e0.m2425e(null);
        m2425e.setTimeInMillis(j7);
        if (m2424d.get(1) == m2425e.get(1)) {
            Locale locale = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                format = C0785e0.m2422b("MMMMEEEEd", locale).format(new Date(j7));
            } else {
                DateFormat dateInstance = DateFormat.getDateInstance(0, locale);
                dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
                format = dateInstance.format(new Date(j7));
            }
        } else {
            Locale locale2 = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                format = C0785e0.m2422b("yMMMMEEEEd", locale2).format(new Date(j7));
            } else {
                DateFormat dateInstance2 = DateFormat.getDateInstance(0, locale2);
                dateInstance2.setTimeZone(TimeZone.getTimeZone("UTC"));
                format = dateInstance2.format(new Date(j7));
            }
        }
        if (z9) {
            format = String.format(context.getString(R$string.mtrl_picker_today_description), format);
        }
        if (z6) {
            format = String.format(context.getString(R$string.mtrl_picker_start_date_description), format);
        } else if (z7) {
            format = String.format(context.getString(R$string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.f4223X.f4109m.mo2408h(j7)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = interfaceC0782d.m2418o().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z8 = false;
                    break;
                } else if (C0785e0.m2421a(j7) == C0785e0.m2421a(it3.next().longValue())) {
                    z8 = true;
                    break;
                }
            }
            textView.setSelected(z8);
            if (z8) {
                c0778b = this.f4228s.f4126b;
            } else {
                boolean z10 = C0785e0.m2424d().getTimeInMillis() == j7;
                C0780c c0780c = this.f4228s;
                c0778b = z10 ? c0780c.f4127c : c0780c.f4125a;
            }
        } else {
            textView.setEnabled(false);
            c0778b = this.f4228s.f4131g;
        }
        if (this.f4224Y == null || i7 == -1) {
            c0778b.m2411b(textView);
            return;
        }
        int i8 = this.f4225c.f4219m;
        c0778b.m2411b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(format);
    }

    /* renamed from: e */
    public final void m2442e(MaterialCalendarGridView materialCalendarGridView, long j7) {
        C0804v m2437c = C0804v.m2437c(j7);
        C0804v c0804v = this.f4225c;
        if (m2437c.equals(c0804v)) {
            Calendar m2423c = C0785e0.m2423c(c0804v.f4217c);
            m2423c.setTimeInMillis(j7);
            int i7 = m2423c.get(5);
            m2441d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().m2439b() + (i7 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j7, i7);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f4222w1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i7) {
        return i7 / this.f4225c.f4220s;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.c r1 = r5.f4228s
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r5.f4228s = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L26
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R$layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r7 = r5.m2439b()
            int r7 = r6 - r7
            if (r7 < 0) goto L5c
            com.google.android.material.datepicker.v r8 = r5.f4225c
            int r2 = r8.f4214X
            if (r7 < r2) goto L35
            goto L5c
        L35:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5c:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L65:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6c
            goto L73
        L6c:
            long r1 = r6.longValue()
            r5.m2441d(r0, r1, r7)
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C0805w.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
