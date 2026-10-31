package p036e2;

import androidx.activity.C0143v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* renamed from: e2.w0 */
/* loaded from: classes.dex */
public final class C1111w0 {

    /* renamed from: a */
    public static final int[] f5511a = m3265c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    public static void m3263a(int i7, int i8, int i9, int i10, int[] iArr) {
        int i11 = iArr[i7] + iArr[i8];
        iArr[i7] = i11;
        int i12 = i11 ^ iArr[i10];
        int i13 = (i12 >>> (-16)) | (i12 << 16);
        iArr[i10] = i13;
        int i14 = iArr[i9] + i13;
        iArr[i9] = i14;
        int i15 = iArr[i8] ^ i14;
        int i16 = (i15 >>> (-12)) | (i15 << 12);
        iArr[i8] = i16;
        int i17 = iArr[i7] + i16;
        iArr[i7] = i17;
        int i18 = iArr[i10] ^ i17;
        int i19 = (i18 >>> (-8)) | (i18 << 8);
        iArr[i10] = i19;
        int i20 = iArr[i9] + i19;
        iArr[i9] = i20;
        int i21 = iArr[i8] ^ i20;
        iArr[i8] = (i21 >>> (-7)) | (i21 << 7);
    }

    /* renamed from: b */
    public static void m3264b(byte[] bArr, byte[] bArr2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i7 = (remaining / 64) + 1;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = i8 + 32;
            int[] m3265c = m3265c(bArr);
            int[] m3265c2 = m3265c(bArr2);
            if (m3265c.length != 3) {
                throw new IllegalArgumentException(String.format("need 96-bit param, but got a %d-bit param", Integer.valueOf(m3265c.length * 32)));
            }
            int[] iArr = new int[16];
            int[] iArr2 = f5511a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            int i10 = 8;
            System.arraycopy(m3265c2, 0, iArr, iArr2.length, 8);
            iArr[12] = i9;
            int i11 = 13;
            System.arraycopy(m3265c, 0, iArr, 13, m3265c.length);
            int[] iArr3 = (int[]) iArr.clone();
            int i12 = 0;
            while (i12 < 10) {
                m3263a(0, 4, i10, 12, iArr3);
                m3263a(1, 5, 9, i11, iArr3);
                m3263a(2, 6, 10, 14, iArr3);
                m3263a(3, 7, 11, 15, iArr3);
                m3263a(0, 5, 10, 15, iArr3);
                m3263a(1, 6, 11, 12, iArr3);
                m3263a(2, 7, 8, 13, iArr3);
                m3263a(3, 4, 9, 14, iArr3);
                i12++;
                i11 = 13;
                i10 = 8;
            }
            for (int i13 = 0; i13 < 16; i13++) {
                iArr[i13] = iArr[i13] + iArr3[i13];
            }
            int i14 = 64;
            ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
            order.asIntBuffer().put(iArr, 0, 16);
            if (i8 == i7 - 1) {
                i14 = remaining % 64;
            }
            C0143v.m442i(byteBuffer, byteBuffer2, order, i14);
        }
    }

    /* renamed from: c */
    public static int[] m3265c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
