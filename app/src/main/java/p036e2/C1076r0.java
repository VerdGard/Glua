package p036e2;

import java.lang.reflect.Array;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;

/* renamed from: e2.r0 */
/* loaded from: classes.dex */
public final class C1076r0 {

    /* renamed from: b */
    public static final SecureRandom f5367b = new SecureRandom();

    /* renamed from: a */
    public final C1090t0 f5368a;

    public C1076r0() {
        this.f5368a = null;
        this.f5368a = new C1090t0(new C1069q0());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[Catch: ShortBufferException -> 0x003f, TRY_LEAVE, TryCatch #0 {ShortBufferException -> 0x003f, blocks: (B:4:0x000a, B:8:0x002d, B:10:0x0035, B:22:0x000f, B:25:0x0014, B:27:0x001a, B:30:0x001f, B:31:0x0026), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] m3170a(byte[] r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L41
            int r0 = r7.length
            e2.t0 r1 = r6.f5368a
            r1.getClass()
            int r2 = r0 + 0
            e2.v0 r3 = r1.f5437d     // Catch: javax.crypto.ShortBufferException -> L3f
            if (r3 != 0) goto Lf
            goto L2c
        Lf:
            boolean r4 = r1.f5439f     // Catch: javax.crypto.ShortBufferException -> L3f
            if (r4 == 0) goto L14
            goto L2c
        L14:
            int r4 = r1.f5435b     // Catch: javax.crypto.ShortBufferException -> L3f
            int r5 = r1.f5434a     // Catch: javax.crypto.ShortBufferException -> L3f
            if (r4 == r5) goto L26
            int r3 = r1.f5436c     // Catch: javax.crypto.ShortBufferException -> L3f
            if (r2 >= r3) goto L1f
            goto L2d
        L1f:
            int r4 = r2 + r5
            int r2 = r2 - r3
            int r2 = r2 % r5
            int r2 = r4 - r2
            goto L2c
        L26:
            int r3 = r3.f5482a     // Catch: javax.crypto.ShortBufferException -> L3f
            int r4 = r2 % r3
            int r3 = r3 - r4
            int r2 = r2 + r3
        L2c:
            r3 = r2
        L2d:
            byte[] r2 = new byte[r3]     // Catch: javax.crypto.ShortBufferException -> L3f
            int r7 = r1.m3216a(r7, r0, r2)     // Catch: javax.crypto.ShortBufferException -> L3f
            if (r7 >= r3) goto L40
            byte[] r0 = new byte[r7]     // Catch: javax.crypto.ShortBufferException -> L3f
            if (r7 == 0) goto L3d
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r7)     // Catch: javax.crypto.ShortBufferException -> L3d
        L3d:
            r2 = r0
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null input buffer"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1076r0.m3170a(byte[]):byte[]");
    }

    /* renamed from: b */
    public final void m3171b(int i7, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int[] iArr;
        boolean z6;
        boolean z7;
        int i8;
        int i9;
        SecureRandom secureRandom = f5367b;
        C1090t0 c1090t0 = this.f5368a;
        c1090t0.getClass();
        char c7 = 0;
        boolean z8 = i7 == 2 || i7 == 4;
        c1090t0.f5439f = z8;
        int i10 = c1090t0.f5434a;
        if (bArr2 != null) {
            bArr3 = bArr2;
        } else {
            if (z8) {
                throw new InvalidAlgorithmParameterException("Parameters missing");
            }
            bArr3 = new byte[i10];
            secureRandom.nextBytes(bArr3);
        }
        c1090t0.f5436c = i10;
        boolean z9 = c1090t0.f5439f;
        C1083s0 c1083s0 = c1090t0.f5438e;
        c1083s0.getClass();
        if (bArr != null) {
            int i11 = 16;
            if (bArr3.length == 16) {
                c1083s0.f5403b = bArr3;
                System.arraycopy(bArr3, 0, c1083s0.f5404c, 0, 16);
                C1069q0 c1069q0 = c1083s0.f5402a;
                c1069q0.getClass();
                int length = bArr.length;
                int i12 = 0;
                while (true) {
                    iArr = InterfaceC1062p0.f5310a;
                    if (i12 >= 3) {
                        z6 = false;
                        break;
                    } else {
                        if (length == iArr[i12]) {
                            z6 = true;
                            break;
                        }
                        i12++;
                    }
                }
                if (!z6) {
                    throw new InvalidKeyException("Invalid AES key length: " + bArr.length + " bytes");
                }
                int length2 = bArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= 3) {
                        z7 = false;
                        break;
                    } else {
                        if (length2 == iArr[i13]) {
                            z7 = true;
                            break;
                        }
                        i13++;
                    }
                }
                if (!z7) {
                    throw new InvalidKeyException("Invalid AES key length: " + bArr.length + " bytes");
                }
                int length3 = (bArr.length >> 2) + 6;
                int i14 = length3 + 1;
                int i15 = i14 * 4;
                Class cls = Integer.TYPE;
                int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, i14, 4);
                int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, i14, 4);
                int length4 = bArr.length / 4;
                int[] iArr4 = new int[length4];
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    i8 = 8;
                    if (i16 >= length4) {
                        break;
                    }
                    iArr4[i16] = ((bArr[i17 + 2] & 255) << 8) | ((bArr[i17 + 1] & 255) << i11) | (bArr[i17] << 24) | (bArr[i17 + 3] & 255);
                    i16++;
                    i17 += 4;
                    i11 = 16;
                }
                int i18 = 0;
                int i19 = 0;
                while (i18 < length4 && i19 < i15) {
                    int i20 = i19 / 4;
                    int i21 = i19 % 4;
                    iArr2[i20][i21] = iArr4[i18];
                    iArr3[length3 - i20][i21] = iArr4[i18];
                    i18++;
                    i19++;
                }
                int i22 = 0;
                while (i19 < i15) {
                    int i23 = iArr4[length4 - 1];
                    int i24 = iArr4[c7];
                    byte[] bArr4 = C1069q0.f5325i;
                    int i25 = (((bArr4[(i23 >>> 16) & 255] << 24) ^ ((bArr4[(i23 >>> 8) & 255] & 255) << 16)) ^ ((bArr4[i23 & 255] & 255) << i8)) ^ (bArr4[i23 >>> 24] & 255);
                    int i26 = i22 + 1;
                    iArr4[0] = ((C1069q0.f5339w[i22] << 24) ^ i25) ^ i24;
                    int i27 = 0;
                    int i28 = 1;
                    if (length4 != i8) {
                        while (i28 < length4) {
                            iArr4[i28] = iArr4[i28] ^ iArr4[i27];
                            i28++;
                            i27++;
                        }
                    } else {
                        while (true) {
                            i9 = length4 / 2;
                            if (i28 >= i9) {
                                break;
                            }
                            iArr4[i28] = iArr4[i28] ^ iArr4[i27];
                            i28++;
                            i27++;
                        }
                        int i29 = iArr4[i9 - 1];
                        iArr4[i9] = ((bArr4[i29 >>> 24] << 24) ^ ((((bArr4[(i29 >>> 8) & 255] & 255) << 8) ^ (bArr4[i29 & 255] & 255)) ^ ((bArr4[(i29 >>> 16) & 255] & 255) << 16))) ^ iArr4[i9];
                        int i30 = i9 + 1;
                        while (i30 < length4) {
                            iArr4[i30] = iArr4[i30] ^ iArr4[i9];
                            i30++;
                            i9++;
                        }
                    }
                    int i31 = 0;
                    while (i31 < length4 && i19 < i15) {
                        int i32 = i19 / 4;
                        int i33 = i19 % 4;
                        iArr2[i32][i33] = iArr4[i31];
                        iArr3[length3 - i32][i33] = iArr4[i31];
                        i31++;
                        i19++;
                    }
                    i22 = i26;
                    i8 = 8;
                    c7 = 0;
                }
                for (int i34 = 1; i34 < length3; i34++) {
                    for (int i35 = 0; i35 < 4; i35++) {
                        int[] iArr5 = iArr3[i34];
                        int i36 = iArr5[i35];
                        iArr5[i35] = C1069q0.f5338v[i36 & 255] ^ ((C1069q0.f5335s[(i36 >>> 24) & 255] ^ C1069q0.f5336t[(i36 >>> 16) & 255]) ^ C1069q0.f5337u[(i36 >>> 8) & 255]);
                    }
                }
                Object[] objArr = {iArr2, iArr3};
                c1069q0.f5342d = objArr;
                int[][] iArr6 = (int[][]) objArr[z9 ? 1 : 0];
                int length5 = iArr6.length;
                c1069q0.f5343e = new int[length5 * 4];
                for (int i37 = 0; i37 < length5; i37++) {
                    for (int i38 = 0; i38 < 4; i38++) {
                        c1069q0.f5343e[(i37 * 4) + i38] = iArr6[i37][i38];
                    }
                }
                if (z9) {
                    int[] iArr7 = c1069q0.f5343e;
                    int i39 = iArr7[iArr7.length - 4];
                    int i40 = iArr7[iArr7.length - 3];
                    int i41 = iArr7[iArr7.length - 2];
                    int i42 = iArr7[iArr7.length - 1];
                    int length6 = iArr7.length - 1;
                    for (int i43 = 3; length6 > i43; i43 = 3) {
                        int[] iArr8 = c1069q0.f5343e;
                        iArr8[length6] = iArr8[length6 - 4];
                        length6--;
                    }
                    int[] iArr9 = c1069q0.f5343e;
                    iArr9[0] = i39;
                    iArr9[1] = i40;
                    iArr9[2] = i41;
                    iArr9[3] = i42;
                }
                c1069q0.f5340b = length5 >= 13;
                c1069q0.f5341c = length5 == 15;
                c1069q0.f5344f = (length5 - 1) * 4;
                return;
            }
        }
        throw new InvalidKeyException("Internal error");
    }
}
