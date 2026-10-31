package p190y0;

import android.ext.C0090b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p089l.C1467a;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public final class C2220b extends AbstractC2219a {

    /* renamed from: d */
    public final SparseIntArray f10052d;

    /* renamed from: e */
    public final Parcel f10053e;

    /* renamed from: f */
    public final int f10054f;

    /* renamed from: g */
    public final int f10055g;

    /* renamed from: h */
    public final String f10056h;

    /* renamed from: i */
    public int f10057i;

    /* renamed from: j */
    public int f10058j;

    /* renamed from: k */
    public int f10059k;

    public C2220b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1467a(), new C1467a(), new C1467a());
    }

    public C2220b(Parcel parcel, int i7, int i8, String str, C1467a<String, Method> c1467a, C1467a<String, Method> c1467a2, C1467a<String, Class> c1467a3) {
        super(c1467a, c1467a2, c1467a3);
        this.f10052d = new SparseIntArray();
        this.f10057i = -1;
        this.f10059k = -1;
        this.f10053e = parcel;
        this.f10054f = i7;
        this.f10055g = i8;
        this.f10058j = i7;
        this.f10056h = str;
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: a */
    public final C2220b mo5380a() {
        Parcel parcel = this.f10053e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f10058j;
        if (i7 == this.f10054f) {
            i7 = this.f10055g;
        }
        return new C2220b(parcel, dataPosition, i7, C0090b.m220f(new StringBuilder(), this.f10056h, "  "), this.f10049a, this.f10050b, this.f10051c);
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: e */
    public final boolean mo5384e() {
        return this.f10053e.readInt() != 0;
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: f */
    public final byte[] mo5385f() {
        Parcel parcel = this.f10053e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: g */
    public final CharSequence mo5386g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f10053e);
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: h */
    public final boolean mo5387h(int i7) {
        while (this.f10058j < this.f10055g) {
            int i8 = this.f10059k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i9 = this.f10058j;
            Parcel parcel = this.f10053e;
            parcel.setDataPosition(i9);
            int readInt = parcel.readInt();
            this.f10059k = parcel.readInt();
            this.f10058j += readInt;
        }
        return this.f10059k == i7;
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: i */
    public final int mo5388i() {
        return this.f10053e.readInt();
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: j */
    public final <T extends Parcelable> T mo5389j() {
        return (T) this.f10053e.readParcelable(C2220b.class.getClassLoader());
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: k */
    public final String mo5390k() {
        return this.f10053e.readString();
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: m */
    public final void mo5392m(int i7) {
        m5400u();
        this.f10057i = i7;
        this.f10052d.put(i7, this.f10053e.dataPosition());
        mo5396q(0);
        mo5396q(i7);
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: n */
    public final void mo5393n(boolean z6) {
        this.f10053e.writeInt(z6 ? 1 : 0);
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: o */
    public final void mo5394o(byte[] bArr) {
        Parcel parcel = this.f10053e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: p */
    public final void mo5395p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f10053e, 0);
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: q */
    public final void mo5396q(int i7) {
        this.f10053e.writeInt(i7);
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: r */
    public final void mo5397r(Parcelable parcelable) {
        this.f10053e.writeParcelable(parcelable, 0);
    }

    @Override // p190y0.AbstractC2219a
    /* renamed from: s */
    public final void mo5398s(String str) {
        this.f10053e.writeString(str);
    }

    /* renamed from: u */
    public final void m5400u() {
        int i7 = this.f10057i;
        if (i7 >= 0) {
            int i8 = this.f10052d.get(i7);
            Parcel parcel = this.f10053e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i8);
            parcel.writeInt(dataPosition - i8);
            parcel.setDataPosition(dataPosition);
        }
    }
}
