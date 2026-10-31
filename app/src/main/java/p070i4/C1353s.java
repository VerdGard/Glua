package p070i4;

import java.lang.reflect.Method;

/* renamed from: i4.s */
/* loaded from: classes.dex */
public final class C1353s extends AbstractC1355u {

    /* renamed from: b */
    public final /* synthetic */ Method f6601b;

    public C1353s(Method method) {
        this.f6601b = method;
    }

    @Override // p070i4.AbstractC1355u
    /* renamed from: b */
    public final <T> T mo3715b(Class<T> cls) {
        AbstractC1355u.m3716a(cls);
        return (T) this.f6601b.invoke(null, cls, Object.class);
    }
}
