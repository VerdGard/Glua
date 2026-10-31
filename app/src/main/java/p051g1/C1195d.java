package p051g1;

import android.graphics.Path;
import p002a1.C0020g;
import p010b1.C0518g;
import p010b1.InterfaceC0513b;
import p043f1.C1156a;
import p043f1.C1158c;
import p043f1.C1159d;
import p059h1.AbstractC1284b;

/* renamed from: g1.d */
/* loaded from: classes.dex */
public final class C1195d implements InterfaceC1193b {

    /* renamed from: a */
    public final int f5858a;

    /* renamed from: b */
    public final Path.FillType f5859b;

    /* renamed from: c */
    public final C1158c f5860c;

    /* renamed from: d */
    public final C1159d f5861d;

    /* renamed from: e */
    public final C1156a f5862e;

    /* renamed from: f */
    public final C1156a f5863f;

    /* renamed from: g */
    public final String f5864g;

    public C1195d(String str, int i7, Path.FillType fillType, C1158c c1158c, C1159d c1159d, C1156a c1156a, C1156a c1156a2) {
        this.f5858a = i7;
        this.f5859b = fillType;
        this.f5860c = c1158c;
        this.f5861d = c1159d;
        this.f5862e = c1156a;
        this.f5863f = c1156a2;
        this.f5864g = str;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0518g(c0020g, abstractC1284b, this);
    }
}
