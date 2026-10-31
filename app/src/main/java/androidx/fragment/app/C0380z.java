package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.AbstractC0378x;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public final class C0380z implements Parcelable {
    public static final Parcelable.Creator<C0380z> CREATOR = new a();

    /* renamed from: X */
    public String f1922X;

    /* renamed from: Y */
    public final ArrayList<String> f1923Y;

    /* renamed from: Z */
    public final ArrayList<Bundle> f1924Z;

    /* renamed from: c */
    public ArrayList<C0340c0> f1925c;

    /* renamed from: e */
    public ArrayList<String> f1926e;

    /* renamed from: m */
    public C0337b[] f1927m;

    /* renamed from: s */
    public int f1928s;

    /* renamed from: w1 */
    public ArrayList<AbstractC0378x.k> f1929w1;

    /* renamed from: androidx.fragment.app.z$a */
    public class a implements Parcelable.Creator<C0380z> {
        @Override // android.os.Parcelable.Creator
        public final C0380z createFromParcel(Parcel parcel) {
            return new C0380z(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C0380z[] newArray(int i7) {
            return new C0380z[i7];
        }
    }

    public C0380z() {
        this.f1922X = null;
        this.f1923Y = new ArrayList<>();
        this.f1924Z = new ArrayList<>();
    }

    public C0380z(Parcel parcel) {
        this.f1922X = null;
        this.f1923Y = new ArrayList<>();
        this.f1924Z = new ArrayList<>();
        this.f1925c = parcel.createTypedArrayList(C0340c0.CREATOR);
        this.f1926e = parcel.createStringArrayList();
        this.f1927m = (C0337b[]) parcel.createTypedArray(C0337b.CREATOR);
        this.f1928s = parcel.readInt();
        this.f1922X = parcel.readString();
        this.f1923Y = parcel.createStringArrayList();
        this.f1924Z = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1929w1 = parcel.createTypedArrayList(AbstractC0378x.k.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeTypedList(this.f1925c);
        parcel.writeStringList(this.f1926e);
        parcel.writeTypedArray(this.f1927m, i7);
        parcel.writeInt(this.f1928s);
        parcel.writeString(this.f1922X);
        parcel.writeStringList(this.f1923Y);
        parcel.writeTypedList(this.f1924Z);
        parcel.writeTypedList(this.f1929w1);
    }
}
