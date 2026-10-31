package p026d0;

import p120p.C1684e;

/* renamed from: d0.d */
/* loaded from: classes.dex */
public final class C0876d<T> extends C1684e {

    /* renamed from: d */
    public final Object f4645d;

    public C0876d() {
        super(12, 1);
        this.f4645d = new Object();
    }

    @Override // p120p.C1684e
    /* renamed from: a */
    public final T mo2564a() {
        T t7;
        synchronized (this.f4645d) {
            t7 = (T) super.mo2564a();
        }
        return t7;
    }

    @Override // p120p.C1684e
    /* renamed from: b */
    public final boolean mo2565b(T t7) {
        boolean mo2565b;
        synchronized (this.f4645d) {
            mo2565b = super.mo2565b(t7);
        }
        return mo2565b;
    }
}
