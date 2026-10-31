package p051g1;

import p002a1.C0020g;
import p010b1.C0527p;
import p010b1.InterfaceC0513b;
import p043f1.C1159d;
import p059h1.AbstractC1284b;

/* renamed from: g1.n */
/* loaded from: classes.dex */
public final class C1205n implements InterfaceC1193b {

    /* renamed from: a */
    public final String f5907a;

    /* renamed from: b */
    public final int f5908b;

    /* renamed from: c */
    public final C1159d f5909c;

    public C1205n(String str, int i7, C1159d c1159d) {
        this.f5907a = str;
        this.f5908b = i7;
        this.f5909c = c1159d;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0527p(c0020g, abstractC1284b, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f5907a + ", index=" + this.f5908b + '}';
    }
}
