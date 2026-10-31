package p036e2;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: e2.h4 */
/* loaded from: classes.dex */
public final class C1010h4 {

    /* renamed from: a */
    public static final Object f5109a;

    /* renamed from: b */
    public static final Method f5110b;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f5109a = cls.newInstance();
            f5110b = cls.getMethod("getOAID", Context.class);
        } catch (Exception unused) {
        }
    }
}
