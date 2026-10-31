package p036e2;

import java.util.Arrays;

/* renamed from: e2.f0 */
/* loaded from: classes.dex */
public final class C0992f0 extends AbstractC0978d0 {
    public C0992f0(int i7) {
        this.f4999a = 32;
        this.f5000b = i7;
        this.f5001c = 1;
    }

    @Override // p036e2.AbstractC0978d0
    /* renamed from: a */
    public final C0957a0 mo3001a(byte[] bArr, int i7) {
        int i8;
        C0999g0 c0999g0 = new C0999g0();
        byte[] bArr2 = c0999g0.f5072b;
        if (i7 > 0) {
            c0999g0.f5073c += i7;
            int i9 = 0 + i7;
            int i10 = c0999g0.f5074d;
            if (i10 + i7 < 16) {
                System.arraycopy(bArr, 0, bArr2, i10, i7);
                c0999g0.f5074d += i7;
            } else {
                if (i10 > 0) {
                    int i11 = 16 - i10;
                    System.arraycopy(bArr, 0, bArr2, i10, i11);
                    c0999g0.m3029b(0, bArr2);
                    i8 = i11 + 0;
                } else {
                    i8 = 0;
                }
                int i12 = i9 - 16;
                while (i8 <= i12) {
                    c0999g0.m3029b(i8, bArr);
                    i8 += 16;
                }
                if (i8 < i9) {
                    int i13 = i9 - i8;
                    c0999g0.f5074d = i13;
                    System.arraycopy(bArr, i8, bArr2, 0, i13);
                }
            }
        }
        int i14 = c0999g0.f5073c;
        int i15 = 1;
        int[] iArr = c0999g0.f5071a;
        int rotateLeft = (i14 > 16 ? Integer.rotateLeft(iArr[3], 18) + Integer.rotateLeft(iArr[2], 12) + Integer.rotateLeft(iArr[1], 7) + Integer.rotateLeft(iArr[0], 1) : iArr[2] + 374761393) + c0999g0.f5073c;
        int i16 = c0999g0.f5074d - 4;
        int i17 = 0;
        while (i17 <= i16) {
            rotateLeft = Integer.rotateLeft((C0999g0.m3028a(i17, bArr2) * (-1028477379)) + rotateLeft, 17) * 668265263;
            i17 += 4;
        }
        while (i17 < c0999g0.f5074d) {
            rotateLeft = Integer.rotateLeft(((bArr2[i17] & 255) * 374761393) + rotateLeft, 11) * (-1640531535);
            i17++;
        }
        int i18 = ((rotateLeft >>> 15) ^ rotateLeft) * (-2048144777);
        int i19 = (i18 ^ (i18 >>> 13)) * (-1028477379);
        long[] jArr = {(i19 ^ (i19 >>> 16)) & 4294967295L};
        int i20 = C0957a0.f4924s;
        while (i15 > 0) {
            int i21 = i15 - 1;
            if (jArr[i21] != 0) {
                break;
            }
            i15 = i21;
        }
        return new C0957a0(Arrays.copyOf(jArr, i15));
    }
}
