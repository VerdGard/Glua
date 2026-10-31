package p036e2;

/* renamed from: e2.u0 */
/* loaded from: classes.dex */
public final class C1097u0 {

    /* renamed from: a */
    public static volatile byte[] f5469a;

    /* renamed from: a */
    public static byte[] m3231a() {
        if (f5469a == null) {
            synchronized (C1097u0.class) {
                if (f5469a == null) {
                    byte[] bArr = new byte[16];
                    System.arraycopy(C1109v5.m3250n(), 0, bArr, 0, 16);
                    C1076r0 c1076r0 = new C1076r0();
                    c1076r0.m3171b(2, bArr, bArr);
                    f5469a = c1076r0.m3170a(new byte[]{-71, -100, -115, 26, 39, -124, 14, 14, -31, -46, -56, 1, 25, -127, -99, -107, -54, 51, 46, 14, 68, -68, -19, 28, 66, 19, -113, 5, 25, -11, -123, 50});
                }
            }
        }
        return f5469a;
    }
}
