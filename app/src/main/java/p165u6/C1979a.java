package p165u6;

/* renamed from: u6.a */
/* loaded from: classes.dex */
public final class C1979a {

    /* renamed from: e */
    public static final byte[] f8937e = new byte[0];

    /* renamed from: a */
    public byte[] f8938a;

    /* renamed from: b */
    public int f8939b;

    /* renamed from: c */
    public int f8940c;

    /* renamed from: d */
    public AbstractC2003u f8941d;

    public C1979a() {
        this(64);
    }

    public C1979a(int i7) {
        this.f8938a = new byte[i7];
        this.f8939b = 0;
        this.f8940c = 0;
        this.f8941d = null;
    }

    public C1979a(AbstractC2003u abstractC2003u) {
        this.f8938a = f8937e;
        this.f8940c = 0;
        this.f8939b = 0;
        this.f8941d = abstractC2003u;
    }

    /* renamed from: a */
    public final void m4614a(byte b7) {
        m4617d(0, 1);
        byte[] bArr = this.f8938a;
        int i7 = this.f8940c;
        int i8 = this.f8939b;
        this.f8939b = i8 + 1;
        bArr[i7 + i8] = b7;
    }

    /* renamed from: b */
    public final void m4615b(String str) {
        char[] charArray = str.toCharArray();
        C1999q c1999q = C1998p.f9038h2;
        int length = charArray.length;
        int i7 = length;
        while (true) {
            length--;
            if (length < 0) {
                m4617d(0, i7);
                C1998p.m4812D2(charArray, charArray.length, this.f8938a, this.f8940c + this.f8939b);
                this.f8939b += i7;
                return;
            } else {
                char c7 = charArray[length];
                if (c7 >= 128) {
                    i7 += c7 >= 2048 ? 2 : 1;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m4616c(C1998p c1998p) {
        int i7 = c1998p.f9041e2;
        m4617d(0, i7);
        System.arraycopy(c1998p.f9039c2, c1998p.f9040d2 + 0, this.f8938a, this.f8940c + this.f8939b, i7);
        this.f8939b += i7;
    }

    /* renamed from: d */
    public final void m4617d(int i7, int i8) {
        AbstractC2003u abstractC2003u = this.f8941d;
        if (abstractC2003u != null) {
            C1998p mo4735i2 = abstractC2003u.mo4735i2();
            this.f8941d = null;
            int i9 = mo4735i2.f9041e2;
            this.f8939b = i9;
            this.f8940c = i7;
            byte[] bArr = new byte[i7 + i9 + i8];
            this.f8938a = bArr;
            System.arraycopy(mo4735i2.f9039c2, mo4735i2.f9040d2, bArr, i7, i9);
            return;
        }
        int i10 = this.f8940c;
        int i11 = this.f8939b;
        int i12 = i10 + i11 + i8;
        byte[] bArr2 = this.f8938a;
        if (i12 > bArr2.length || i10 < i7) {
            int i13 = i7 + i11 + i8;
            if (i13 < 32) {
                i13 = 32;
            } else {
                int i14 = i11 * 2;
                if (i13 < i14) {
                    i13 = i14;
                }
            }
            int i15 = i7 == 0 ? 0 : (i13 - i11) - i8;
            if (i13 != bArr2.length) {
                byte[] bArr3 = new byte[i13];
                System.arraycopy(bArr2, i10, bArr3, i15, i11);
                this.f8938a = bArr3;
                this.f8940c = i15;
            }
        }
    }

    /* renamed from: e */
    public final void m4618e(C1998p c1998p) {
        int i7 = c1998p.f9041e2;
        m4617d(i7, 0);
        System.arraycopy(c1998p.f9039c2, c1998p.f9040d2, this.f8938a, this.f8940c - i7, i7);
        this.f8940c -= i7;
        this.f8939b += i7;
        this.f8941d = null;
    }

    /* renamed from: f */
    public final C1998p m4619f() {
        int i7 = this.f8939b;
        byte[] bArr = this.f8938a;
        if (i7 != bArr.length) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, this.f8940c, bArr2, 0, i7);
            this.f8938a = bArr2;
            this.f8940c = 0;
        }
        return C1998p.m4816N2(this.f8938a, this.f8940c, this.f8939b);
    }

    public final String toString() {
        AbstractC1984c0 abstractC1984c0 = this.f8941d;
        if (abstractC1984c0 == null) {
            abstractC1984c0 = m4619f();
        }
        return abstractC1984c0.mo4645M();
    }
}
