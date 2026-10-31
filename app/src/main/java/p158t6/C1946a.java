package p158t6;

import p142r6.AbstractC1856m;
import p142r6.C1852i;

/* renamed from: t6.a */
/* loaded from: classes.dex */
public final class C1946a implements InterfaceC1950e {

    /* renamed from: a */
    public final C1852i f8761a;

    /* renamed from: b */
    public final C1948c f8762b;

    /* renamed from: c */
    public final AbstractC1949d f8763c;

    public C1946a(C1852i c1852i, C1948c c1948c, AbstractC1949d abstractC1949d) {
        this.f8761a = c1852i;
        this.f8762b = c1948c;
        this.f8763c = abstractC1949d;
    }

    @Override // p158t6.InterfaceC1950e
    /* renamed from: a */
    public final void mo4375a(AbstractC1856m abstractC1856m, int i7) {
        if (abstractC1856m instanceof C1852i) {
            C1852i c1852i = (C1852i) abstractC1856m;
            if (this.f8763c.mo4546a(this.f8761a, c1852i)) {
                this.f8762b.add(c1852i);
            }
        }
    }

    @Override // p158t6.InterfaceC1950e
    /* renamed from: b */
    public final void mo4376b(AbstractC1856m abstractC1856m, int i7) {
    }
}
