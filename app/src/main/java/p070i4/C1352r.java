package p070i4;

import java.lang.reflect.Method;

/* renamed from: i4.r */
/* loaded from: classes.dex */
public final class C1352r extends AbstractC1355u {

    /* renamed from: b */
    public final /* synthetic */ Method f6599b;

    /* renamed from: c */
    public final /* synthetic */ int f6600c;

    public C1352r(int i7, Method method) {
        this.f6599b = method;
        this.f6600c = i7;
    }

    @Override // p070i4.AbstractC1355u
    /* renamed from: b */
    public final <T> T mo3715b(Class<T> cls) {
        AbstractC1355u.m3716a(cls);
        return (T) this.f6599b.invoke(null, cls, Integer.valueOf(this.f6600c));
    }
}
