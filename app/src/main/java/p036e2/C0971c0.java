package p036e2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: e2.c0 */
/* loaded from: classes.dex */
public final class C0971c0 {

    /* renamed from: a */
    public final C0957a0 f4981a;

    public C0971c0() {
        C0957a0 c0957a0 = new C0957a0(40);
        this.f4981a = c0957a0;
        C0957a0.m2950b(0, 40);
        if (c0957a0.f4926e < 1) {
            c0957a0.m2953d(1);
            c0957a0.f4926e = 1;
        }
        long[] jArr = c0957a0.f4925c;
        jArr[0] = jArr[0] | 1099511627775L;
    }

    /* renamed from: a */
    public final byte[] m2988a() {
        C0957a0 c0957a0 = this.f4981a;
        int i7 = c0957a0.f4926e;
        if (i7 == 0) {
            return new byte[0];
        }
        int i8 = i7 - 1;
        int i9 = i8 * 8;
        for (long j7 = c0957a0.f4925c[i8]; j7 != 0; j7 >>>= 8) {
            i9++;
        }
        byte[] bArr = new byte[i9];
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        for (int i10 = 0; i10 < i8; i10++) {
            order.putLong(c0957a0.f4925c[i10]);
        }
        for (long j8 = c0957a0.f4925c[i8]; j8 != 0; j8 >>>= 8) {
            order.put((byte) (255 & j8));
        }
        return bArr;
    }
}
