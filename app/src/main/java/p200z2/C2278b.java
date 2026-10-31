package p200z2;

/* renamed from: z2.b */
/* loaded from: classes.dex */
public final class C2278b {

    /* renamed from: a */
    public Class<?> f10443a;

    /* renamed from: b */
    public Class<?> f10444b;

    public C2278b() {
    }

    public C2278b(Class<?> cls, Class<?> cls2) {
        this.f10443a = cls;
        this.f10444b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2278b.class != obj.getClass()) {
            return false;
        }
        C2278b c2278b = (C2278b) obj;
        return this.f10443a.equals(c2278b.f10443a) && this.f10444b.equals(c2278b.f10444b);
    }

    public final int hashCode() {
        return this.f10444b.hashCode() + (this.f10443a.hashCode() * 31);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f10443a + ", second=" + this.f10444b + '}';
    }
}
