package p032d6;

/* renamed from: d6.h */
/* loaded from: classes.dex */
public final class C0900h implements InterfaceC0894b {

    /* renamed from: a */
    public final Class<?> f4691a;

    public C0900h(Class cls) {
        C0898f.m2606e(cls, "jClass");
        this.f4691a = cls;
    }

    @Override // p032d6.InterfaceC0894b
    /* renamed from: a */
    public final Class<?> mo2601a() {
        return this.f4691a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0900h) {
            if (C0898f.m2602a(this.f4691a, ((C0900h) obj).f4691a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4691a.hashCode();
    }

    public final String toString() {
        return this.f4691a.toString() + " (Kotlin reflection is not available)";
    }
}
