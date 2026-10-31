package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.e0 */
/* loaded from: classes.dex */
public final class C0785e0 {

    /* renamed from: a */
    public static final AtomicReference<C0783d0> f4137a = new AtomicReference<>();

    /* renamed from: a */
    public static long m2421a(long j7) {
        Calendar m2425e = m2425e(null);
        m2425e.setTimeInMillis(j7);
        return m2423c(m2425e).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m2422b(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext displayContext;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        timeZone = TimeZone.getTimeZone("UTC");
        instanceForSkeleton.setTimeZone(timeZone);
        displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        instanceForSkeleton.setContext(displayContext);
        return instanceForSkeleton;
    }

    /* renamed from: c */
    public static Calendar m2423c(Calendar calendar) {
        Calendar m2425e = m2425e(calendar);
        Calendar m2425e2 = m2425e(null);
        m2425e2.set(m2425e.get(1), m2425e.get(2), m2425e.get(5));
        return m2425e2;
    }

    /* renamed from: d */
    public static Calendar m2424d() {
        C0783d0 c0783d0 = f4137a.get();
        if (c0783d0 == null) {
            c0783d0 = C0783d0.f4133c;
        }
        java.util.TimeZone timeZone = c0783d0.f4135b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l7 = c0783d0.f4134a;
        if (l7 != null) {
            calendar.setTimeInMillis(l7.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: e */
    public static Calendar m2425e(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
