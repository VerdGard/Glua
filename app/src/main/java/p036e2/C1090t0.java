package p036e2;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* renamed from: e2.t0 */
/* loaded from: classes.dex */
public final class C1090t0 {

    /* renamed from: a */
    public final int f5434a;

    /* renamed from: b */
    public final int f5435b;

    /* renamed from: d */
    public final C1104v0 f5437d;

    /* renamed from: e */
    public final C1083s0 f5438e;

    /* renamed from: f */
    public boolean f5439f = false;

    /* renamed from: c */
    public int f5436c = 16;

    public C1090t0(C1069q0 c1069q0) {
        this.f5434a = 0;
        this.f5435b = 0;
        this.f5437d = null;
        this.f5438e = null;
        this.f5434a = 16;
        this.f5435b = 16;
        this.f5438e = new C1083s0(c1069q0);
        this.f5437d = new C1104v0();
    }

    /* renamed from: a */
    public final int m3216a(byte[] bArr, int i7, byte[] bArr2) {
        int i8;
        int m3217b;
        int i9 = 0 + i7;
        C1104v0 c1104v0 = this.f5437d;
        int i10 = this.f5435b;
        int i11 = this.f5434a;
        if (i10 != i11) {
            int i12 = this.f5436c;
            i8 = i9 < i12 ? i12 - i9 : i11 - ((i9 - i12) % i11);
        } else if (c1104v0 != null) {
            int i13 = c1104v0.f5482a;
            i8 = i13 - (i9 % i13);
        } else {
            i8 = 0;
        }
        if (i8 > 0 && i8 != i11 && c1104v0 != null && this.f5439f) {
            throw new IllegalBlockSizeException("Input length must be multiple of " + i11 + " when decrypting with padded cipher");
        }
        boolean z6 = this.f5439f;
        int i14 = (z6 || c1104v0 == null) ? i9 : i9 + i8;
        int length = bArr2.length - 0;
        if (((!z6 || c1104v0 == null) && length < i14) || (z6 && length < i14 - i11)) {
            throw new ShortBufferException("Output buffer too short: " + length + " bytes given, " + i14 + " bytes needed");
        }
        if (!z6 && c1104v0 != null) {
            byte[] bArr3 = new byte[i14];
            if (i7 != 0) {
                System.arraycopy(bArr, 0, bArr3, 0, i7);
            }
            if (!this.f5439f && c1104v0 != null) {
                if (i9 + i8 > i14) {
                    throw new ShortBufferException("Buffer too small to hold padding");
                }
                byte b7 = (byte) (i8 & 255);
                for (int i15 = 0; i15 < i8; i15++) {
                    bArr3[i15 + i9] = b7;
                }
            }
            bArr = bArr3;
        }
        boolean z7 = this.f5439f;
        C1083s0 c1083s0 = this.f5438e;
        if (z7) {
            if (length < i14) {
                if (c1083s0.f5406e == null) {
                    c1083s0.f5406e = new byte[16];
                }
                System.arraycopy(c1083s0.f5404c, 0, c1083s0.f5406e, 0, 16);
            }
            byte[] bArr4 = new byte[i9];
            m3217b = m3217b(bArr, 0, bArr4, i9);
            if (c1104v0 != null) {
                if (m3217b != 0) {
                    int i16 = m3217b + 0;
                    byte b8 = bArr4[i16 - 1];
                    int i17 = b8 & 255;
                    if (i17 >= 1 && i17 <= c1104v0.f5482a && (m3217b = i16 - i17) >= 0) {
                        for (int i18 = 0; i18 < i17; i18++) {
                            if (bArr4[m3217b + i18] == b8) {
                            }
                        }
                    }
                    m3217b = -1;
                    break;
                } else {
                    m3217b = 0;
                }
                if (m3217b < 0) {
                    throw new BadPaddingException("Given final block not properly padded");
                }
            }
            if (bArr2.length - 0 < m3217b) {
                System.arraycopy(c1083s0.f5406e, 0, c1083s0.f5404c, 0, 16);
                throw new ShortBufferException("Output buffer too short: " + (bArr2.length - 0) + " bytes given, " + m3217b + " bytes needed");
            }
            for (int i19 = 0; i19 < m3217b; i19++) {
                bArr2[0 + i19] = bArr4[i19];
            }
        } else {
            m3217b = m3217b(bArr, 0, bArr2, i14);
        }
        this.f5436c = i11;
        System.arraycopy(c1083s0.f5403b, 0, c1083s0.f5404c, 0, 16);
        return m3217b;
    }

    /* renamed from: b */
    public final int m3217b(byte[] bArr, int i7, byte[] bArr2, int i8) {
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6 = bArr;
        char c7 = 0;
        if (bArr6 == null || i8 == 0) {
            return 0;
        }
        int i9 = this.f5435b;
        if (i8 % i9 != 0) {
            if (this.f5437d != null) {
                throw new IllegalBlockSizeException("Input length (with padding) not multiple of " + i9 + " bytes");
            }
            throw new IllegalBlockSizeException("Input length not multiple of " + i9 + " bytes");
        }
        boolean z6 = this.f5439f;
        int i10 = 16;
        C1083s0 c1083s0 = this.f5438e;
        if (z6) {
            c1083s0.getClass();
            int i11 = i8 + i7;
            byte[] bArr7 = (bArr6 != bArr2 || i7 < 0 || i7 + 0 >= 16) ? null : (byte[]) bArr.clone();
            int i12 = 0;
            int i13 = i7;
            while (i13 < i11) {
                C1069q0 c1069q0 = c1083s0.f5402a;
                byte[] bArr8 = c1083s0.f5405d;
                c1069q0.m3166b(i13, bArr6, bArr8);
                int i14 = 0;
                while (true) {
                    bArr5 = c1083s0.f5404c;
                    if (i14 >= 16) {
                        break;
                    }
                    bArr2[i14 + i12] = (byte) (bArr5[i14] ^ bArr8[i14]);
                    i14++;
                }
                if (bArr7 == null) {
                    System.arraycopy(bArr6, i13, bArr5, 0, 16);
                } else {
                    System.arraycopy(bArr7, i13, bArr5, 0, 16);
                }
                i13 += 16;
                i12 += 16;
            }
        } else {
            int i15 = i7 + i8;
            int i16 = i7;
            int i17 = 0;
            while (i16 < i15) {
                int i18 = 0;
                while (true) {
                    bArr3 = c1083s0.f5404c;
                    bArr4 = c1083s0.f5405d;
                    if (i18 >= i10) {
                        break;
                    }
                    bArr4[i18] = (byte) (bArr3[i18] ^ bArr6[i18 + i16]);
                    i18++;
                }
                C1069q0 c1069q02 = c1083s0.f5402a;
                c1069q02.getClass();
                int i19 = (bArr4[c7] << 24) | ((bArr4[1] & 255) << i10) | ((bArr4[2] & 255) << 8) | (bArr4[3] & 255);
                int[] iArr = c1069q02.f5343e;
                int i20 = i19 ^ iArr[c7];
                int i21 = ((((bArr4[4] << 24) | ((bArr4[5] & 255) << i10)) | ((bArr4[6] & 255) << 8)) | (bArr4[7] & 255)) ^ iArr[1];
                int i22 = ((((bArr4[8] << 24) | ((bArr4[9] & 255) << i10)) | ((bArr4[10] & 255) << 8)) | (bArr4[11] & 255)) ^ iArr[2];
                int i23 = (((((bArr4[13] & 255) << i10) | (bArr4[12] << 24)) | ((bArr4[14] & 255) << 8)) | (bArr4[15] & 255)) ^ iArr[3];
                int i24 = 4;
                while (i24 < c1069q02.f5344f) {
                    int[] iArr2 = C1069q0.f5327k;
                    int i25 = iArr2[i20 >>> 24];
                    int[] iArr3 = C1069q0.f5328l;
                    int i26 = iArr3[(i21 >>> 16) & 255] ^ i25;
                    int[] iArr4 = C1069q0.f5329m;
                    int i27 = iArr4[(i22 >>> 8) & 255] ^ i26;
                    int[] iArr5 = C1069q0.f5330n;
                    int i28 = i15;
                    int i29 = i27 ^ iArr5[i23 & 255];
                    int[] iArr6 = c1069q02.f5343e;
                    int i30 = i24 + 1;
                    int i31 = i29 ^ iArr6[i24];
                    int i32 = i30 + 1;
                    int i33 = (((iArr3[(i22 >>> 16) & 255] ^ iArr2[i21 >>> 24]) ^ iArr4[(i23 >>> 8) & 255]) ^ iArr5[i20 & 255]) ^ iArr6[i30];
                    C1083s0 c1083s02 = c1083s0;
                    int i34 = i32 + 1;
                    int i35 = (((iArr2[i22 >>> 24] ^ iArr3[(i23 >>> 16) & 255]) ^ iArr4[(i20 >>> 8) & 255]) ^ iArr5[i21 & 255]) ^ iArr6[i32];
                    i24 = i34 + 1;
                    i23 = (((iArr2[i23 >>> 24] ^ iArr3[(i20 >>> 16) & 255]) ^ iArr4[(i21 >>> 8) & 255]) ^ iArr5[i22 & 255]) ^ iArr6[i34];
                    i20 = i31;
                    i22 = i35;
                    i15 = i28;
                    c1083s0 = c1083s02;
                    i21 = i33;
                }
                int i36 = i15;
                C1083s0 c1083s03 = c1083s0;
                int[] iArr7 = c1069q02.f5343e;
                int i37 = i24 + 1;
                int i38 = iArr7[i24];
                int i39 = i17 + 1;
                byte[] bArr9 = C1069q0.f5325i;
                bArr2[i17] = (byte) (bArr9[i20 >>> 24] ^ (i38 >>> 24));
                int i40 = i39 + 1;
                bArr2[i39] = (byte) (bArr9[(i21 >>> 16) & 255] ^ (i38 >>> 16));
                int i41 = i40 + 1;
                bArr2[i40] = (byte) (bArr9[(i22 >>> 8) & 255] ^ (i38 >>> 8));
                int i42 = i41 + 1;
                bArr2[i41] = (byte) (i38 ^ bArr9[i23 & 255]);
                int i43 = i37 + 1;
                int i44 = iArr7[i37];
                int i45 = i42 + 1;
                bArr2[i42] = (byte) (bArr9[i21 >>> 24] ^ (i44 >>> 24));
                int i46 = i45 + 1;
                bArr2[i45] = (byte) (bArr9[(i22 >>> 16) & 255] ^ (i44 >>> 16));
                int i47 = i46 + 1;
                bArr2[i46] = (byte) (bArr9[(i23 >>> 8) & 255] ^ (i44 >>> 8));
                int i48 = i47 + 1;
                bArr2[i47] = (byte) (i44 ^ bArr9[i20 & 255]);
                int i49 = i43 + 1;
                int i50 = iArr7[i43];
                int i51 = i48 + 1;
                bArr2[i48] = (byte) (bArr9[i22 >>> 24] ^ (i50 >>> 24));
                int i52 = i51 + 1;
                bArr2[i51] = (byte) (bArr9[(i23 >>> 16) & 255] ^ (i50 >>> 16));
                int i53 = i52 + 1;
                bArr2[i52] = (byte) (bArr9[(i20 >>> 8) & 255] ^ (i50 >>> 8));
                int i54 = i53 + 1;
                bArr2[i53] = (byte) (i50 ^ bArr9[i21 & 255]);
                int i55 = iArr7[i49];
                int i56 = i54 + 1;
                bArr2[i54] = (byte) (bArr9[i23 >>> 24] ^ (i55 >>> 24));
                int i57 = i56 + 1;
                bArr2[i56] = (byte) (bArr9[(i20 >>> 16) & 255] ^ (i55 >>> 16));
                bArr2[i57] = (byte) (bArr9[(i21 >>> 8) & 255] ^ (i55 >>> 8));
                bArr2[i57 + 1] = (byte) (bArr9[i22 & 255] ^ i55);
                System.arraycopy(bArr2, i17, bArr3, 0, 16);
                i16 += 16;
                i17 += 16;
                bArr6 = bArr;
                i15 = i36;
                c1083s0 = c1083s03;
                c7 = 0;
                i10 = 16;
            }
            c1083s0.getClass();
        }
        return i8;
    }
}
