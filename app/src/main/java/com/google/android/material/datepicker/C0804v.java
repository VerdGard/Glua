package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes.dex */
public final class C0804v implements Comparable<C0804v>, Parcelable {
    public static final Parcelable.Creator<C0804v> CREATOR = new a();

    /* renamed from: X */
    public final int f4214X;

    /* renamed from: Y */
    public final long f4215Y;

    /* renamed from: Z */
    public String f4216Z;

    /* renamed from: c */
    public final Calendar f4217c;

    /* renamed from: e */
    public final int f4218e;

    /* renamed from: m */
    public final int f4219m;

    /* renamed from: s */
    public final int f4220s;

    /* renamed from: com.google.android.material.datepicker.v$a */
    public class a implements Parcelable.Creator<C0804v> {
        @Override // android.os.Parcelable.Creator
        public final C0804v createFromParcel(Parcel parcel) {
            return C0804v.m2436a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C0804v[] newArray(int i7) {
            return new C0804v[i7];
        }
    }

    public C0804v(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m2423c = C0785e0.m2423c(calendar);
        this.f4217c = m2423c;
        this.f4218e = m2423c.get(2);
        this.f4219m = m2423c.get(1);
        this.f4220s = m2423c.getMaximum(7);
        this.f4214X = m2423c.getActualMaximum(5);
        this.f4215Y = m2423c.getTimeInMillis();
    }

    /* renamed from: a */
    public static C0804v m2436a(int i7, int i8) {
        Calendar m2425e = C0785e0.m2425e(null);
        m2425e.set(1, i7);
        m2425e.set(2, i8);
        return new C0804v(m2425e);
    }

    /* renamed from: c */
    public static C0804v m2437c(long j7) {
        Calendar m2425e = C0785e0.m2425e(null);
        m2425e.setTimeInMillis(j7);
        return new C0804v(m2425e);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0804v c0804v) {
        return this.f4217c.compareTo(c0804v.f4217c);
    }

    /* renamed from: d */
    public final String m2438d() {
        if (this.f4216Z == null) {
            long timeInMillis = this.f4217c.getTimeInMillis();
            this.f4216Z = Build.VERSION.SDK_INT >= 24 ? C0785e0.m2422b("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        return this.f4216Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0804v)) {
            return false;
        }
        C0804v c0804v = (C0804v) obj;
        return this.f4218e == c0804v.f4218e && this.f4219m == c0804v.f4219m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4218e), Integer.valueOf(this.f4219m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4219m);
        parcel.writeInt(this.f4218e);
    }
}
