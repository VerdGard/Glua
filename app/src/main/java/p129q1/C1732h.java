package p129q1;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: q1.h */
/* loaded from: classes.dex */
public final class C1732h extends C1739o {
    public static final Parcelable.Creator<C1732h> CREATOR = new a();

    /* renamed from: X */
    public final File f7934X;

    /* renamed from: m */
    public final int f7935m;

    /* renamed from: s */
    public final String f7936s;

    /* renamed from: q1.h$a */
    public static final class a implements Parcelable.Creator<C1732h> {
        @Override // android.os.Parcelable.Creator
        public final C1732h createFromParcel(Parcel parcel) {
            return new C1732h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C1732h[] newArray(int i7) {
            return new C1732h[i7];
        }
    }

    public C1732h(Parcel parcel) {
        super(parcel);
        this.f7934X = (File) parcel.readSerializable();
        this.f7935m = parcel.readInt();
        this.f7936s = parcel.readString();
    }

    public C1732h(File file, int i7, String str) {
        super(file.getPath(), file.getName());
        this.f7934X = file;
        this.f7935m = i7;
        this.f7936s = str;
    }

    @Override // p129q1.C1739o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p129q1.C1739o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeSerializable(this.f7934X);
        parcel.writeInt(this.f7935m);
        parcel.writeString(this.f7936s);
    }
}
