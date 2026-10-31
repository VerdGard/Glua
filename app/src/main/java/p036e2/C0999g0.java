package p036e2;

/* renamed from: e2.g0 */
/* loaded from: classes.dex */
public final class C0999g0 {

    /* renamed from: a */
    public final int[] f5071a = {606290984, -2048144777, 0, 1640531535};

    /* renamed from: b */
    public final byte[] f5072b = new byte[16];

    /* renamed from: c */
    public int f5073c;

    /* renamed from: d */
    public int f5074d;

    /* renamed from: a */
    public static int m3028a(int i7, byte[] bArr) {
        long j7 = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            j7 |= (bArr[i7 + i8] & 255) << (i8 * 8);
        }
        return (int) (4294967295L & j7);
    }

    /* renamed from: b */
    public final void m3029b(int i7, byte[] bArr) {
        int[] iArr = this.f5071a;
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int rotateLeft = Integer.rotateLeft((m3028a(i7, bArr) * (-2048144777)) + i8, 13) * (-1640531535);
        int rotateLeft2 = Integer.rotateLeft((m3028a(i7 + 4, bArr) * (-2048144777)) + i9, 13) * (-1640531535);
        int rotateLeft3 = Integer.rotateLeft((m3028a(i7 + 8, bArr) * (-2048144777)) + i10, 13) * (-1640531535);
        int rotateLeft4 = Integer.rotateLeft((m3028a(i7 + 12, bArr) * (-2048144777)) + i11, 13) * (-1640531535);
        iArr[0] = rotateLeft;
        iArr[1] = rotateLeft2;
        iArr[2] = rotateLeft3;
        iArr[3] = rotateLeft4;
        this.f5074d = 0;
    }
}
