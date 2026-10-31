package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import p026d0.C0874b;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes.dex */
public final class C0776a implements Parcelable {
    public static final Parcelable.Creator<C0776a> CREATOR = new a();

    /* renamed from: X */
    public final int f4104X;

    /* renamed from: Y */
    public final int f4105Y;

    /* renamed from: Z */
    public final int f4106Z;

    /* renamed from: c */
    public final C0804v f4107c;

    /* renamed from: e */
    public final C0804v f4108e;

    /* renamed from: m */
    public final c f4109m;

    /* renamed from: s */
    public final C0804v f4110s;

    /* renamed from: com.google.android.material.datepicker.a$a */
    public class a implements Parcelable.Creator<C0776a> {
        @Override // android.os.Parcelable.Creator
        public final C0776a createFromParcel(Parcel parcel) {
            return new C0776a((C0804v) parcel.readParcelable(C0804v.class.getClassLoader()), (C0804v) parcel.readParcelable(C0804v.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (C0804v) parcel.readParcelable(C0804v.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final C0776a[] newArray(int i7) {
            return new C0776a[i7];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public static final class b {

        /* renamed from: f */
        public static final long f4111f = C0785e0.m2421a(C0804v.m2436a(1900, 0).f4215Y);

        /* renamed from: g */
        public static final long f4112g = C0785e0.m2421a(C0804v.m2436a(2100, 11).f4215Y);

        /* renamed from: a */
        public final long f4113a;

        /* renamed from: b */
        public final long f4114b;

        /* renamed from: c */
        public Long f4115c;

        /* renamed from: d */
        public final int f4116d;

        /* renamed from: e */
        public final c f4117e;

        public b(C0776a c0776a) {
            this.f4113a = f4111f;
            this.f4114b = f4112g;
            this.f4117e = new C0784e(Long.MIN_VALUE);
            this.f4113a = c0776a.f4107c.f4215Y;
            this.f4114b = c0776a.f4108e.f4215Y;
            this.f4115c = Long.valueOf(c0776a.f4110s.f4215Y);
            this.f4116d = c0776a.f4104X;
            this.f4117e = c0776a.f4109m;
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$c */
    public interface c extends Parcelable {
        /* renamed from: h */
        boolean mo2408h(long j7);
    }

    public C0776a(C0804v c0804v, C0804v c0804v2, c cVar, C0804v c0804v3, int i7) {
        Objects.requireNonNull(c0804v, "start cannot be null");
        Objects.requireNonNull(c0804v2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f4107c = c0804v;
        this.f4108e = c0804v2;
        this.f4110s = c0804v3;
        this.f4104X = i7;
        this.f4109m = cVar;
        Calendar calendar = c0804v.f4217c;
        if (c0804v3 != null && calendar.compareTo(c0804v3.f4217c) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0804v3 != null && c0804v3.f4217c.compareTo(c0804v2.f4217c) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i7 < 0 || i7 > C0785e0.m2425e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i8 = c0804v2.f4219m;
        int i9 = c0804v.f4219m;
        this.f4106Z = (c0804v2.f4218e - c0804v.f4218e) + ((i8 - i9) * 12) + 1;
        this.f4105Y = (i8 - i9) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0776a)) {
            return false;
        }
        C0776a c0776a = (C0776a) obj;
        return this.f4107c.equals(c0776a.f4107c) && this.f4108e.equals(c0776a.f4108e) && C0874b.m2562a(this.f4110s, c0776a.f4110s) && this.f4104X == c0776a.f4104X && this.f4109m.equals(c0776a.f4109m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4107c, this.f4108e, this.f4110s, Integer.valueOf(this.f4104X), this.f4109m});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f4107c, 0);
        parcel.writeParcelable(this.f4108e, 0);
        parcel.writeParcelable(this.f4110s, 0);
        parcel.writeParcelable(this.f4109m, 0);
        parcel.writeInt(this.f4104X);
    }
}
