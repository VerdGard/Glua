package p013b4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p082k0.AbstractC1446a;
import p089l.C1481o;

/* renamed from: b4.a */
/* loaded from: classes.dex */
public final class C0539a extends AbstractC1446a {
    public static final Parcelable.Creator<C0539a> CREATOR = new a();

    /* renamed from: m */
    public final C1481o<String, Bundle> f2694m;

    /* renamed from: b4.a$a */
    public class a implements Parcelable.ClassLoaderCreator<C0539a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new C0539a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i7) {
            return new C0539a[i7];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final C0539a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0539a(parcel, classLoader);
        }
    }

    public C0539a() {
        throw null;
    }

    public C0539a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2694m = new C1481o<>(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f2694m.put(strArr[i7], bundleArr[i7]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f2694m + "}";
    }

    @Override // p082k0.AbstractC1446a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f6946c, i7);
        C1481o<String, Bundle> c1481o = this.f2694m;
        int i8 = c1481o.f7047m;
        parcel.writeInt(i8);
        String[] strArr = new String[i8];
        Bundle[] bundleArr = new Bundle[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            strArr[i9] = c1481o.m3874f(i9);
            bundleArr[i9] = c1481o.m3877i(i9);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
