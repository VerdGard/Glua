package p129q1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q1.o */
/* loaded from: classes.dex */
public class C1739o implements Parcelable {
    public static final Parcelable.Creator<C1739o> CREATOR = new a();

    /* renamed from: c */
    public final String f7948c;

    /* renamed from: e */
    public final String f7949e;

    /* renamed from: q1.o$a */
    public static final class a implements Parcelable.Creator<C1739o> {
        @Override // android.os.Parcelable.Creator
        public final C1739o createFromParcel(Parcel parcel) {
            return new C1739o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C1739o[] newArray(int i7) {
            return new C1739o[i7];
        }
    }

    public C1739o(Parcel parcel) {
        this.f7948c = null;
        this.f7949e = null;
        this.f7948c = parcel.readString();
        this.f7949e = parcel.readString();
    }

    public C1739o(String str, String str2) {
        this.f7948c = null;
        this.f7949e = null;
        this.f7948c = str;
        this.f7949e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f7948c);
        parcel.writeString(this.f7949e);
    }
}
