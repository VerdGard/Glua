package p070i4;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: i4.u */
/* loaded from: classes.dex */
public abstract class AbstractC1355u {

    /* renamed from: a */
    public static final AbstractC1355u f6602a;

    static {
        AbstractC1355u c1354t;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            c1354t = new C1351q(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    c1354t = new C1352r(intValue, declaredMethod2);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    c1354t = new C1353s(declaredMethod3);
                }
            } catch (Exception unused3) {
                c1354t = new C1354t();
            }
        }
        f6602a = c1354t;
    }

    /* renamed from: a */
    public static void m3716a(Class cls) {
        String m3699a = C1338d.m3699a(cls);
        if (m3699a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m3699a));
        }
    }

    /* renamed from: b */
    public abstract <T> T mo3715b(Class<T> cls);
}
