package p051g1;

import java.util.ArrayList;
import java.util.List;
import p002a1.C0020g;
import p010b1.C0528q;
import p010b1.InterfaceC0513b;
import p043f1.C1156a;
import p043f1.C1157b;
import p043f1.C1159d;
import p059h1.AbstractC1284b;

/* renamed from: g1.o */
/* loaded from: classes.dex */
public final class C1206o implements InterfaceC1193b {

    /* renamed from: a */
    public final String f5910a;

    /* renamed from: b */
    public final C1157b f5911b;

    /* renamed from: c */
    public final List<C1157b> f5912c;

    /* renamed from: d */
    public final C1156a f5913d;

    /* renamed from: e */
    public final C1159d f5914e;

    /* renamed from: f */
    public final C1157b f5915f;

    /* renamed from: g */
    public final int f5916g;

    /* renamed from: h */
    public final int f5917h;

    public C1206o(String str, C1157b c1157b, ArrayList arrayList, C1156a c1156a, C1159d c1159d, C1157b c1157b2, int i7, int i8) {
        this.f5910a = str;
        this.f5911b = c1157b;
        this.f5912c = arrayList;
        this.f5913d = c1156a;
        this.f5914e = c1159d;
        this.f5915f = c1157b2;
        this.f5916g = i7;
        this.f5917h = i8;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0528q(c0020g, abstractC1284b, this);
    }
}
