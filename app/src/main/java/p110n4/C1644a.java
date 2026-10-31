package p110n4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import p070i4.C1335a;

/* renamed from: n4.a */
/* loaded from: classes.dex */
public final class C1644a<T> {

    /* renamed from: a */
    public final Class<? super T> f7479a;

    /* renamed from: b */
    public final Type f7480b;

    /* renamed from: c */
    public final int f7481c;

    public C1644a() {
        Type genericSuperclass = C1644a.class.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == C1644a.class) {
                Type m3691a = C1335a.m3691a(parameterizedType.getActualTypeArguments()[0]);
                this.f7480b = m3691a;
                this.f7479a = (Class<? super T>) C1335a.m3695e(m3691a);
                this.f7481c = m3691a.hashCode();
                return;
            }
        } else if (genericSuperclass == C1644a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public C1644a(Type type) {
        Objects.requireNonNull(type);
        Type m3691a = C1335a.m3691a(type);
        this.f7480b = m3691a;
        this.f7479a = (Class<? super T>) C1335a.m3695e(m3691a);
        this.f7481c = m3691a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1644a) {
            if (C1335a.m3693c(this.f7480b, ((C1644a) obj).f7480b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7481c;
    }

    public final String toString() {
        return C1335a.m3698h(this.f7480b);
    }
}
