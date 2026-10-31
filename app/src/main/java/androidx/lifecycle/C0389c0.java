package androidx.lifecycle;

import p032d6.C0898f;
import p128q0.AbstractC1721a;
import p128q0.C1723c;

/* renamed from: androidx.lifecycle.c0 */
/* loaded from: classes.dex */
public final class C0389c0 {

    /* renamed from: a */
    public final C0393e0 f1962a;

    /* renamed from: b */
    public final a f1963b;

    /* renamed from: c */
    public final AbstractC1721a f1964c;

    /* renamed from: androidx.lifecycle.c0$a */
    public interface a {
        /* renamed from: a */
        <T extends AbstractC0387b0> T mo1143a(Class<T> cls);

        /* renamed from: b */
        AbstractC0387b0 mo1144b(Class cls, C1723c c1723c);
    }

    /* renamed from: androidx.lifecycle.c0$b */
    public static class b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0389c0(C0393e0 c0393e0, a aVar) {
        this(c0393e0, aVar, AbstractC1721a.a.f7883b);
        C0898f.m2606e(c0393e0, "store");
    }

    public C0389c0(C0393e0 c0393e0, a aVar, AbstractC1721a abstractC1721a) {
        C0898f.m2606e(c0393e0, "store");
        C0898f.m2606e(abstractC1721a, "defaultCreationExtras");
        this.f1962a = c0393e0;
        this.f1963b = aVar;
        this.f1964c = abstractC1721a;
    }

    /* renamed from: a */
    public final <T extends AbstractC0387b0> T m1354a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m1355b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final <T extends AbstractC0387b0> T m1355b(String str, Class<T> cls) {
        T t7;
        C0898f.m2606e(str, "key");
        C0393e0 c0393e0 = this.f1962a;
        c0393e0.getClass();
        T t8 = (T) c0393e0.f1981a.get(str);
        boolean isInstance = cls.isInstance(t8);
        a aVar = this.f1963b;
        if (isInstance) {
            if ((aVar instanceof b ? (b) aVar : null) != null) {
                C0898f.m2603b(t8);
            }
            C0898f.m2604c(t8, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t8;
        }
        C1723c c1723c = new C1723c(this.f1964c);
        c1723c.f7882a.put(C0391d0.f1965a, str);
        try {
            t7 = (T) aVar.mo1144b(cls, c1723c);
        } catch (AbstractMethodError unused) {
            t7 = (T) aVar.mo1143a(cls);
        }
        C0898f.m2606e(t7, "viewModel");
        AbstractC0387b0 abstractC0387b0 = (AbstractC0387b0) c0393e0.f1981a.put(str, t7);
        if (abstractC0387b0 != null) {
            abstractC0387b0.mo1141a();
        }
        return t7;
    }
}
