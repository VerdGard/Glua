package p078j4;

import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1241w;
import p054g4.InterfaceC1229k;
import p054g4.InterfaceC1236r;
import p054g4.InterfaceC1243y;
import p062h4.InterfaceC1298a;
import p070i4.C1338d;
import p110n4.C1644a;

/* renamed from: j4.d */
/* loaded from: classes.dex */
public final class C1415d implements InterfaceC1243y {

    /* renamed from: c */
    public final C1338d f6784c;

    public C1415d(C1338d c1338d) {
        this.f6784c = c1338d;
    }

    /* renamed from: b */
    public static AbstractC1242x m3762b(C1338d c1338d, C1226h c1226h, C1644a c1644a, InterfaceC1298a interfaceC1298a) {
        AbstractC1242x c1425n;
        Object mo107e = c1338d.m3700b(new C1644a(interfaceC1298a.value())).mo107e();
        boolean nullSafe = interfaceC1298a.nullSafe();
        if (mo107e instanceof AbstractC1242x) {
            c1425n = (AbstractC1242x) mo107e;
        } else if (mo107e instanceof InterfaceC1243y) {
            c1425n = ((InterfaceC1243y) mo107e).mo3457a(c1226h, c1644a);
        } else {
            boolean z6 = mo107e instanceof InterfaceC1236r;
            if (!z6 && !(mo107e instanceof InterfaceC1229k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo107e.getClass().getName() + " as a @JsonAdapter for " + c1644a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            c1425n = new C1425n(z6 ? (InterfaceC1236r) mo107e : null, mo107e instanceof InterfaceC1229k ? (InterfaceC1229k) mo107e : null, c1226h, c1644a, nullSafe);
            nullSafe = false;
        }
        return (c1425n == null || !nullSafe) ? c1425n : new C1241w(c1425n);
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
        InterfaceC1298a interfaceC1298a = (InterfaceC1298a) c1644a.f7479a.getAnnotation(InterfaceC1298a.class);
        if (interfaceC1298a == null) {
            return null;
        }
        return m3762b(this.f6784c, c1226h, c1644a, interfaceC1298a);
    }
}
