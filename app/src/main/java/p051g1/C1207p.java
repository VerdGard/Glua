package p051g1;

import p002a1.C0020g;
import p010b1.C0529r;
import p010b1.InterfaceC0513b;
import p043f1.C1157b;
import p059h1.AbstractC1284b;

/* renamed from: g1.p */
/* loaded from: classes.dex */
public final class C1207p implements InterfaceC1193b {

    /* renamed from: a */
    public final int f5918a;

    /* renamed from: b */
    public final C1157b f5919b;

    /* renamed from: c */
    public final C1157b f5920c;

    /* renamed from: d */
    public final C1157b f5921d;

    public C1207p(String str, int i7, C1157b c1157b, C1157b c1157b2, C1157b c1157b3) {
        this.f5918a = i7;
        this.f5919b = c1157b;
        this.f5920c = c1157b2;
        this.f5921d = c1157b3;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0529r(abstractC1284b, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f5919b + ", end: " + this.f5920c + ", offset: " + this.f5921d + "}";
    }
}
