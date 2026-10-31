package p082k0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: k0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1446a implements Parcelable {

    /* renamed from: c */
    public final Parcelable f6946c;

    /* renamed from: e */
    public static final a f6945e = new a();
    public static final Parcelable.Creator<AbstractC1446a> CREATOR = new b();

    /* renamed from: k0.a$a */
    public class a extends AbstractC1446a {
    }

    public AbstractC1446a() {
        this.f6946c = null;
    }

    public AbstractC1446a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f6946c = readParcelable == null ? f6945e : readParcelable;
    }

    public AbstractC1446a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f6946c = parcelable == f6945e ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f6946c, i7);
    }

    /* renamed from: k0.a$b */
    public class b implements Parcelable.ClassLoaderCreator<AbstractC1446a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbstractC1446a.f6945e;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i7) {
            return new AbstractC1446a[i7];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final AbstractC1446a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC1446a.f6945e;
            }
            throw new IllegalStateException("superState must be null");
        }
    }
}
