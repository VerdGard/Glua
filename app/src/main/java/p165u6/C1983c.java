package p165u6;

import android.ext.Tools;
import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: u6.c */
/* loaded from: classes.dex */
public final class C1983c {

    /* renamed from: f */
    public static final a f8964f = new a();

    /* renamed from: g */
    public static final byte[] f8965g = {27, 76, 117, 97};

    /* renamed from: h */
    public static final byte[] f8966h = {25, -109, 13, 10, 26, 10};

    /* renamed from: i */
    public static final AbstractC2003u[] f8967i = new AbstractC2003u[0];

    /* renamed from: j */
    public static final C2008z[] f8968j = new C2008z[0];

    /* renamed from: k */
    public static final C1985d[] f8969k = new C1985d[0];

    /* renamed from: l */
    public static final C1982b0[] f8970l = new C1982b0[0];

    /* renamed from: m */
    public static final int[] f8971m = new int[0];

    /* renamed from: a */
    public boolean f8972a;

    /* renamed from: b */
    public int f8973b;

    /* renamed from: c */
    public int f8974c;

    /* renamed from: d */
    public final DataInputStream f8975d;

    /* renamed from: e */
    public byte[] f8976e = new byte[Tools.Semaphore.f161S9];

    /* renamed from: u6.c$a */
    public static final class a {
    }

    public C1983c(InputStream inputStream) {
        this.f8975d = new DataInputStream(inputStream);
    }

    /* renamed from: a */
    public final C2008z m4631a() {
        AbstractC2003u m4698E2;
        C2008z c2008z = new C2008z();
        c2008z.f9150h = m4632b();
        c2008z.f9151i = m4632b();
        DataInputStream dataInputStream = this.f8975d;
        c2008z.f9152j = dataInputStream.readUnsignedByte();
        c2008z.f9153k = dataInputStream.readUnsignedByte();
        c2008z.f9154l = dataInputStream.readUnsignedByte();
        c2008z.f9144b = m4634d();
        int m4632b = m4632b();
        AbstractC2003u[] abstractC2003uArr = m4632b > 0 ? new AbstractC2003u[m4632b] : f8967i;
        for (int i7 = 0; i7 < m4632b; i7++) {
            byte readByte = dataInputStream.readByte();
            if (readByte == -2) {
                abstractC2003uArr[i7] = C1993k.m4765C2(m4632b());
            } else if (readByte == 0) {
                abstractC2003uArr[i7] = AbstractC2003u.f9130m;
            } else if (readByte == 1) {
                abstractC2003uArr[i7] = dataInputStream.readUnsignedByte() != 0 ? AbstractC2003u.f9131s : AbstractC2003u.f9122X;
            } else if (readByte == 3) {
                if (this.f8974c == 1) {
                    m4698E2 = C1993k.m4765C2(m4632b());
                } else {
                    long m4633c = m4633c();
                    if ((Long.MAX_VALUE & m4633c) == 0) {
                        m4698E2 = AbstractC2003u.f9126Z;
                    } else {
                        int i8 = ((int) ((m4633c >> 52) & 2047)) - 1023;
                        if (i8 >= 0 && i8 < 31) {
                            long j7 = 4503599627370495L & m4633c;
                            int i9 = 52 - i8;
                            if ((j7 & ((1 << i9) - 1)) == 0) {
                                int i10 = (1 << i8) | ((int) (j7 >> i9));
                                if ((m4633c >> 63) != 0) {
                                    i10 = -i10;
                                }
                                m4698E2 = C1993k.m4765C2(i10);
                            }
                        }
                        double longBitsToDouble = Double.longBitsToDouble(m4633c);
                        C1996n c1996n = AbstractC2003u.f9130m;
                        m4698E2 = C1990h.m4698E2(longBitsToDouble);
                    }
                }
                abstractC2003uArr[i7] = m4698E2;
            } else {
                if (readByte != 4) {
                    throw new IllegalStateException("bad constant");
                }
                abstractC2003uArr[i7] = m4635e();
            }
        }
        c2008z.f9143a = abstractC2003uArr;
        int m4632b2 = m4632b();
        C2008z[] c2008zArr = m4632b2 > 0 ? new C2008z[m4632b2] : f8968j;
        for (int i11 = 0; i11 < m4632b2; i11++) {
            c2008zArr[i11] = m4631a();
        }
        c2008z.f9145c = c2008zArr;
        int m4632b3 = m4632b();
        c2008z.f9148f = m4632b3 > 0 ? new C1982b0[m4632b3] : f8970l;
        for (int i12 = 0; i12 < m4632b3; i12++) {
            c2008z.f9148f[i12] = new C1982b0(dataInputStream.readByte() & 255, null, dataInputStream.readByte() != 0);
        }
        c2008z.f9149g = m4635e();
        c2008z.f9146d = m4634d();
        int m4632b4 = m4632b();
        c2008z.f9147e = m4632b4 > 0 ? new C1985d[m4632b4] : f8969k;
        for (int i13 = 0; i13 < m4632b4; i13++) {
            c2008z.f9147e[i13] = new C1985d(m4635e(), m4632b(), m4632b());
        }
        int m4632b5 = m4632b();
        for (int i14 = 0; i14 < m4632b5; i14++) {
            c2008z.f9148f[i14].f8961a = m4635e();
        }
        return c2008z;
    }

    /* renamed from: b */
    public final int m4632b() {
        this.f8975d.readFully(this.f8976e, 0, 4);
        if (this.f8972a) {
            byte[] bArr = this.f8976e;
            return (bArr[0] & 255) | (bArr[3] << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
        }
        byte[] bArr2 = this.f8976e;
        return (bArr2[3] & 255) | ((bArr2[2] & 255) << 8) | (bArr2[0] << 24) | ((bArr2[1] & 255) << 16);
    }

    /* renamed from: c */
    public final long m4633c() {
        int m4632b;
        int m4632b2;
        if (this.f8972a) {
            m4632b2 = m4632b();
            m4632b = m4632b();
        } else {
            m4632b = m4632b();
            m4632b2 = m4632b();
        }
        return (m4632b << 32) | (m4632b2 & 4294967295L);
    }

    /* renamed from: d */
    public final int[] m4634d() {
        int i7;
        byte b7;
        int m4632b = m4632b();
        if (m4632b == 0) {
            return f8971m;
        }
        int i8 = m4632b << 2;
        if (this.f8976e.length < i8) {
            this.f8976e = new byte[i8];
        }
        int i9 = 0;
        this.f8975d.readFully(this.f8976e, 0, i8);
        int[] iArr = new int[m4632b];
        int i10 = 0;
        while (i9 < m4632b) {
            if (this.f8972a) {
                byte[] bArr = this.f8976e;
                i7 = (bArr[i10 + 3] << 24) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
                b7 = bArr[i10 + 0];
            } else {
                byte[] bArr2 = this.f8976e;
                i7 = (bArr2[i10 + 0] << 24) | ((bArr2[i10 + 1] & 255) << 16) | ((bArr2[i10 + 2] & 255) << 8);
                b7 = bArr2[i10 + 3];
            }
            iArr[i9] = (b7 & 255) | i7;
            i9++;
            i10 += 4;
        }
        return iArr;
    }

    /* renamed from: e */
    public final C1998p m4635e() {
        int m4633c = this.f8973b == 8 ? (int) m4633c() : m4632b();
        if (m4633c == 0) {
            return null;
        }
        int i7 = m4633c - 1;
        byte b7 = (byte) i7;
        byte[] bArr = new byte[m4633c];
        this.f8975d.readFully(bArr, 0, m4633c);
        for (int i8 = 0; i8 < m4633c; i8++) {
            bArr[i8] = (byte) (bArr[i8] ^ b7);
        }
        return C1998p.m4817O2(bArr, 0, i7);
    }
}
