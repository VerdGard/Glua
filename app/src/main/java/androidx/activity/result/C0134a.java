package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final class C0134a implements Parcelable {
    public static final Parcelable.Creator<C0134a> CREATOR = new a();

    /* renamed from: c */
    public final int f248c;

    /* renamed from: e */
    public final Intent f249e;

    /* renamed from: androidx.activity.result.a$a */
    public class a implements Parcelable.Creator<C0134a> {
        @Override // android.os.Parcelable.Creator
        public final C0134a createFromParcel(Parcel parcel) {
            return new C0134a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C0134a[] newArray(int i7) {
            return new C0134a[i7];
        }
    }

    public C0134a(Intent intent, int i7) {
        this.f248c = i7;
        this.f249e = intent;
    }

    public C0134a(Parcel parcel) {
        this.f248c = parcel.readInt();
        this.f249e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i7 = this.f248c;
        sb.append(i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f249e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f248c);
        Intent intent = this.f249e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }
}
