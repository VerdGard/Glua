package p070i4;

import java.lang.reflect.Method;

/* renamed from: i4.q */
/* loaded from: classes.dex */
public final class C1351q extends AbstractC1355u {

    /* renamed from: b */
    public final /* synthetic */ Method f6597b;

    /* renamed from: c */
    public final /* synthetic */ Object f6598c;

    public C1351q(Method method, Object obj) {
        this.f6597b = method;
        this.f6598c = obj;
    }

    @Override // p070i4.AbstractC1355u
    /* renamed from: b */
    public final <T> T mo3715b(Class<T> cls) {
        AbstractC1355u.m3716a(cls);
        return (T) this.f6597b.invoke(this.f6598c, cls);
    }
}
