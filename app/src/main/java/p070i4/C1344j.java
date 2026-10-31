package p070i4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p094l4.C1509a;

/* renamed from: i4.j */
/* loaded from: classes.dex */
public final class C1344j implements InterfaceC1349o<Object> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f6557a;

    public C1344j(Constructor constructor) {
        this.f6557a = constructor;
    }

    @Override // p070i4.InterfaceC1349o
    /* renamed from: e */
    public final Object mo107e() {
        Constructor constructor = this.f6557a;
        try {
            return constructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e7) {
            C1509a.a aVar = C1509a.f7128a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Failed to invoke constructor '" + C1509a.m3917b(constructor) + "' with no args", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Failed to invoke constructor '" + C1509a.m3917b(constructor) + "' with no args", e9.getCause());
        }
    }
}
