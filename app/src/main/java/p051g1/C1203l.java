package p051g1;

import android.graphics.Path;
import p002a1.C0020g;
import p010b1.C0517f;
import p010b1.InterfaceC0513b;
import p043f1.C1156a;
import p043f1.C1159d;
import p059h1.AbstractC1284b;

/* renamed from: g1.l */
/* loaded from: classes.dex */
public final class C1203l implements InterfaceC1193b {

    /* renamed from: a */
    public final boolean f5900a;

    /* renamed from: b */
    public final Path.FillType f5901b;

    /* renamed from: c */
    public final String f5902c;

    /* renamed from: d */
    public final C1156a f5903d;

    /* renamed from: e */
    public final C1159d f5904e;

    public C1203l(String str, boolean z6, Path.FillType fillType, C1156a c1156a, C1159d c1159d) {
        this.f5902c = str;
        this.f5900a = z6;
        this.f5901b = fillType;
        this.f5903d = c1156a;
        this.f5904e = c1159d;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0517f(c0020g, abstractC1284b, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f5900a + '}';
    }
}
