package p036e2;

import java.lang.reflect.Method;
import java.util.Arrays;
import p036e2.C0964b0;

/* renamed from: e2.e0 */
/* loaded from: classes.dex */
public final class C0985e0 extends AbstractC0978d0 {

    /* renamed from: d */
    public final a f5023d;

    /* renamed from: e2.e0$a */
    public static class a {

        /* renamed from: a */
        public Class<?> f5024a;

        /* renamed from: b */
        public Method f5025b;

        /* renamed from: c */
        public Method f5026c;

        public a() {
            try {
                this.f5024a = Class.forName(C0964b0.m2962a(new byte[]{-8, 55, 15, 115, 74, -108, -56, -37, -56, -80, -90, 107, 115, -78, 65, 82, -59, 2, -104, 65, 10, 21, 19, -71, -74, 114, -100, 1, 29, -66, 72, 72}), true, Object.class.getClassLoader());
                String m2962a = C0964b0.m2962a(new byte[]{-102, 65, -58, 79, -27, -122, 9, -80, 45, 79, 37, -12, 70, -80, -110, 30});
                Class<?> cls = this.f5024a;
                Class<?> cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod(m2962a, byte[].class, cls2, cls2);
                declaredMethod.setAccessible(true);
                this.f5025b = declaredMethod;
                Method declaredMethod2 = this.f5024a.getDeclaredMethod(C0964b0.m2962a(new byte[]{-40, -59, -7, 54, -86, 73, -69, 120, 54, -124, -45, -125, 120, -95, 68, 70}), null);
                declaredMethod2.setAccessible(true);
                this.f5026c = declaredMethod2;
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    public C0985e0(int i7, int i8) {
        this.f4999a = 32;
        this.f5000b = i7;
        this.f5001c = i8;
        this.f5023d = new a();
    }

    @Override // p036e2.AbstractC0978d0
    /* renamed from: a */
    public final C0957a0 mo3001a(byte[] bArr, int i7) {
        long j7;
        a aVar = this.f5023d;
        int i8 = 1;
        try {
            Object newInstance = aVar.f5024a.newInstance();
            try {
                aVar.f5025b.invoke(newInstance, bArr, 0, Integer.valueOf(i7));
                try {
                    j7 = ((Long) aVar.f5026c.invoke(newInstance, new Object[0])).longValue();
                } catch (Exception unused) {
                    throw new C0964b0.a();
                }
            } catch (Exception unused2) {
                throw new C0964b0.a();
            }
        } catch (Exception unused3) {
            j7 = 4294967295L;
        }
        long[] jArr = {j7};
        int i9 = C0957a0.f4924s;
        while (i8 > 0) {
            int i10 = i8 - 1;
            if (jArr[i10] != 0) {
                break;
            }
            i8 = i10;
        }
        return new C0957a0(Arrays.copyOf(jArr, i8));
    }
}
