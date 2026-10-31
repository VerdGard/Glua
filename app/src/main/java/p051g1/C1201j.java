package p051g1;

import p002a1.C0020g;
import p010b1.C0526o;
import p010b1.InterfaceC0513b;
import p043f1.C1157b;
import p043f1.C1161f;
import p059h1.AbstractC1284b;

/* renamed from: g1.j */
/* loaded from: classes.dex */
public final class C1201j implements InterfaceC1193b {

    /* renamed from: a */
    public final String f5893a;

    /* renamed from: b */
    public final C1157b f5894b;

    /* renamed from: c */
    public final C1157b f5895c;

    /* renamed from: d */
    public final C1161f f5896d;

    public C1201j(String str, C1157b c1157b, C1157b c1157b2, C1161f c1161f) {
        this.f5893a = str;
        this.f5894b = c1157b;
        this.f5895c = c1157b2;
        this.f5896d = c1161f;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0526o(c0020g, abstractC1284b, this);
    }
}
