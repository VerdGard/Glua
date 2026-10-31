package p128q0;

import androidx.lifecycle.AbstractC0387b0;
import androidx.lifecycle.C0389c0;
import p032d6.C0898f;

/* renamed from: q0.b */
/* loaded from: classes.dex */
public final class C1722b implements C0389c0.a {

    /* renamed from: a */
    public final C1724d<?>[] f7884a;

    public C1722b(C1724d<?>... c1724dArr) {
        C0898f.m2606e(c1724dArr, "initializers");
        this.f7884a = c1724dArr;
    }

    @Override // androidx.lifecycle.C0389c0.a
    /* renamed from: a */
    public final AbstractC0387b0 mo1143a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.C0389c0.a
    /* renamed from: b */
    public final AbstractC0387b0 mo1144b(Class cls, C1723c c1723c) {
        AbstractC0387b0 abstractC0387b0 = null;
        for (C1724d<?> c1724d : this.f7884a) {
            if (C0898f.m2602a(c1724d.f7885a, cls)) {
                Object mo216c = c1724d.f7886b.mo216c(c1723c);
                abstractC0387b0 = mo216c instanceof AbstractC0387b0 ? (AbstractC0387b0) mo216c : null;
            }
        }
        if (abstractC0387b0 != null) {
            return abstractC0387b0;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
