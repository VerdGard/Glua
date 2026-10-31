package p131q3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: q3.l */
/* loaded from: classes.dex */
public final class C1756l extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C1756l> CREATOR = new a();

    /* renamed from: q3.l$a */
    public class a implements Parcelable.ClassLoaderCreator<C1756l> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new C1756l(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i7) {
            return new C1756l[i7];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final C1756l createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C1756l(parcel, classLoader);
        }
    }

    public C1756l() {
    }

    public C1756l(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i7 = 0; i7 < readInt; i7++) {
            put(iArr[i7], readParcelableArray[i7]);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = keyAt(i8);
            parcelableArr[i8] = valueAt(i8);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i7);
    }
}
