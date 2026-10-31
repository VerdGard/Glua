package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.ext.Tools;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c0 */
/* loaded from: classes.dex */
public final class C0340c0 implements Parcelable {
    public static final Parcelable.Creator<C0340c0> CREATOR = new a();

    /* renamed from: A1 */
    public final int f1654A1;

    /* renamed from: B1 */
    public Bundle f1655B1;

    /* renamed from: X */
    public final int f1656X;

    /* renamed from: Y */
    public final String f1657Y;

    /* renamed from: Z */
    public final boolean f1658Z;

    /* renamed from: c */
    public final String f1659c;

    /* renamed from: e */
    public final String f1660e;

    /* renamed from: m */
    public final boolean f1661m;

    /* renamed from: s */
    public final int f1662s;

    /* renamed from: w1 */
    public final boolean f1663w1;

    /* renamed from: x1 */
    public final boolean f1664x1;

    /* renamed from: y1 */
    public final Bundle f1665y1;

    /* renamed from: z1 */
    public final boolean f1666z1;

    /* renamed from: androidx.fragment.app.c0$a */
    public class a implements Parcelable.Creator<C0340c0> {
        @Override // android.os.Parcelable.Creator
        public final C0340c0 createFromParcel(Parcel parcel) {
            return new C0340c0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C0340c0[] newArray(int i7) {
            return new C0340c0[i7];
        }
    }

    public C0340c0(Parcel parcel) {
        this.f1659c = parcel.readString();
        this.f1660e = parcel.readString();
        this.f1661m = parcel.readInt() != 0;
        this.f1662s = parcel.readInt();
        this.f1656X = parcel.readInt();
        this.f1657Y = parcel.readString();
        this.f1658Z = parcel.readInt() != 0;
        this.f1663w1 = parcel.readInt() != 0;
        this.f1664x1 = parcel.readInt() != 0;
        this.f1665y1 = parcel.readBundle();
        this.f1666z1 = parcel.readInt() != 0;
        this.f1655B1 = parcel.readBundle();
        this.f1654A1 = parcel.readInt();
    }

    public C0340c0(ComponentCallbacksC0361n componentCallbacksC0361n) {
        this.f1659c = componentCallbacksC0361n.getClass().getName();
        this.f1660e = componentCallbacksC0361n.f1798Y;
        this.f1661m = componentCallbacksC0361n.f1775C1;
        this.f1662s = componentCallbacksC0361n.f1784L1;
        this.f1656X = componentCallbacksC0361n.f1785M1;
        this.f1657Y = componentCallbacksC0361n.f1786N1;
        this.f1658Z = componentCallbacksC0361n.f1789Q1;
        this.f1663w1 = componentCallbacksC0361n.f1774B1;
        this.f1664x1 = componentCallbacksC0361n.f1788P1;
        this.f1665y1 = componentCallbacksC0361n.f1800Z;
        this.f1666z1 = componentCallbacksC0361n.f1787O1;
        this.f1654A1 = componentCallbacksC0361n.f1802a2.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Tools.Semaphore.f159S7);
        sb.append("FragmentState{");
        sb.append(this.f1659c);
        sb.append(" (");
        sb.append(this.f1660e);
        sb.append(")}:");
        if (this.f1661m) {
            sb.append(" fromLayout");
        }
        int i7 = this.f1656X;
        if (i7 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i7));
        }
        String str = this.f1657Y;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1658Z) {
            sb.append(" retainInstance");
        }
        if (this.f1663w1) {
            sb.append(" removing");
        }
        if (this.f1664x1) {
            sb.append(" detached");
        }
        if (this.f1666z1) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f1659c);
        parcel.writeString(this.f1660e);
        parcel.writeInt(this.f1661m ? 1 : 0);
        parcel.writeInt(this.f1662s);
        parcel.writeInt(this.f1656X);
        parcel.writeString(this.f1657Y);
        parcel.writeInt(this.f1658Z ? 1 : 0);
        parcel.writeInt(this.f1663w1 ? 1 : 0);
        parcel.writeInt(this.f1664x1 ? 1 : 0);
        parcel.writeBundle(this.f1665y1);
        parcel.writeInt(this.f1666z1 ? 1 : 0);
        parcel.writeBundle(this.f1655B1);
        parcel.writeInt(this.f1654A1);
    }
}
