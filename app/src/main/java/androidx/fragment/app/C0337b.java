package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0346f0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0337b implements Parcelable {
    public static final Parcelable.Creator<C0337b> CREATOR = new a();

    /* renamed from: A1 */
    public final ArrayList<String> f1637A1;

    /* renamed from: B1 */
    public final ArrayList<String> f1638B1;

    /* renamed from: C1 */
    public final boolean f1639C1;

    /* renamed from: X */
    public final int f1640X;

    /* renamed from: Y */
    public final String f1641Y;

    /* renamed from: Z */
    public final int f1642Z;

    /* renamed from: c */
    public final int[] f1643c;

    /* renamed from: e */
    public final ArrayList<String> f1644e;

    /* renamed from: m */
    public final int[] f1645m;

    /* renamed from: s */
    public final int[] f1646s;

    /* renamed from: w1 */
    public final int f1647w1;

    /* renamed from: x1 */
    public final CharSequence f1648x1;

    /* renamed from: y1 */
    public final int f1649y1;

    /* renamed from: z1 */
    public final CharSequence f1650z1;

    /* renamed from: androidx.fragment.app.b$a */
    public class a implements Parcelable.Creator<C0337b> {
        @Override // android.os.Parcelable.Creator
        public final C0337b createFromParcel(Parcel parcel) {
            return new C0337b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C0337b[] newArray(int i7) {
            return new C0337b[i7];
        }
    }

    public C0337b(Parcel parcel) {
        this.f1643c = parcel.createIntArray();
        this.f1644e = parcel.createStringArrayList();
        this.f1645m = parcel.createIntArray();
        this.f1646s = parcel.createIntArray();
        this.f1640X = parcel.readInt();
        this.f1641Y = parcel.readString();
        this.f1642Z = parcel.readInt();
        this.f1647w1 = parcel.readInt();
        this.f1648x1 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1649y1 = parcel.readInt();
        this.f1650z1 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1637A1 = parcel.createStringArrayList();
        this.f1638B1 = parcel.createStringArrayList();
        this.f1639C1 = parcel.readInt() != 0;
    }

    public C0337b(C0335a c0335a) {
        int size = c0335a.f1686a.size();
        this.f1643c = new int[size * 5];
        if (!c0335a.f1692g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1644e = new ArrayList<>(size);
        this.f1645m = new int[size];
        this.f1646s = new int[size];
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            AbstractC0346f0.a aVar = c0335a.f1686a.get(i7);
            int i9 = i8 + 1;
            this.f1643c[i8] = aVar.f1701a;
            ArrayList<String> arrayList = this.f1644e;
            ComponentCallbacksC0361n componentCallbacksC0361n = aVar.f1702b;
            arrayList.add(componentCallbacksC0361n != null ? componentCallbacksC0361n.f1798Y : null);
            int[] iArr = this.f1643c;
            int i10 = i9 + 1;
            iArr[i9] = aVar.f1703c;
            int i11 = i10 + 1;
            iArr[i10] = aVar.f1704d;
            int i12 = i11 + 1;
            iArr[i11] = aVar.f1705e;
            iArr[i12] = aVar.f1706f;
            this.f1645m[i7] = aVar.f1707g.ordinal();
            this.f1646s[i7] = aVar.f1708h.ordinal();
            i7++;
            i8 = i12 + 1;
        }
        this.f1640X = c0335a.f1691f;
        this.f1641Y = c0335a.f1693h;
        this.f1642Z = c0335a.f1629r;
        this.f1647w1 = c0335a.f1694i;
        this.f1648x1 = c0335a.f1695j;
        this.f1649y1 = c0335a.f1696k;
        this.f1650z1 = c0335a.f1697l;
        this.f1637A1 = c0335a.f1698m;
        this.f1638B1 = c0335a.f1699n;
        this.f1639C1 = c0335a.f1700o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f1643c);
        parcel.writeStringList(this.f1644e);
        parcel.writeIntArray(this.f1645m);
        parcel.writeIntArray(this.f1646s);
        parcel.writeInt(this.f1640X);
        parcel.writeString(this.f1641Y);
        parcel.writeInt(this.f1642Z);
        parcel.writeInt(this.f1647w1);
        TextUtils.writeToParcel(this.f1648x1, parcel, 0);
        parcel.writeInt(this.f1649y1);
        TextUtils.writeToParcel(this.f1650z1, parcel, 0);
        parcel.writeStringList(this.f1637A1);
        parcel.writeStringList(this.f1638B1);
        parcel.writeInt(this.f1639C1 ? 1 : 0);
    }
}
