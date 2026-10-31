package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C0776a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C0784e implements C0776a.c {
    public static final Parcelable.Creator<C0784e> CREATOR = new a();

    /* renamed from: c */
    public final long f4136c;

    /* renamed from: com.google.android.material.datepicker.e$a */
    public class a implements Parcelable.Creator<C0784e> {
        @Override // android.os.Parcelable.Creator
        public final C0784e createFromParcel(Parcel parcel) {
            return new C0784e(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final C0784e[] newArray(int i7) {
            return new C0784e[i7];
        }
    }

    public C0784e(long j7) {
        this.f4136c = j7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0784e) && this.f4136c == ((C0784e) obj).f4136c;
    }

    @Override // com.google.android.material.datepicker.C0776a.c
    /* renamed from: h */
    public final boolean mo2408h(long j7) {
        return j7 >= this.f4136c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4136c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f4136c);
    }
}
