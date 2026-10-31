package p051g1;

import java.util.ArrayList;
import java.util.List;
import p002a1.C0020g;
import p010b1.C0519h;
import p010b1.InterfaceC0513b;
import p043f1.C1156a;
import p043f1.C1157b;
import p043f1.C1158c;
import p043f1.C1159d;
import p059h1.AbstractC1284b;

/* renamed from: g1.e */
/* loaded from: classes.dex */
public final class C1196e implements InterfaceC1193b {

    /* renamed from: a */
    public final String f5865a;

    /* renamed from: b */
    public final int f5866b;

    /* renamed from: c */
    public final C1158c f5867c;

    /* renamed from: d */
    public final C1159d f5868d;

    /* renamed from: e */
    public final C1156a f5869e;

    /* renamed from: f */
    public final C1156a f5870f;

    /* renamed from: g */
    public final C1157b f5871g;

    /* renamed from: h */
    public final int f5872h;

    /* renamed from: i */
    public final int f5873i;

    /* renamed from: j */
    public final List<C1157b> f5874j;

    /* renamed from: k */
    public final C1157b f5875k;

    public C1196e(String str, int i7, C1158c c1158c, C1159d c1159d, C1156a c1156a, C1156a c1156a2, C1157b c1157b, int i8, int i9, ArrayList arrayList, C1157b c1157b2) {
        this.f5865a = str;
        this.f5866b = i7;
        this.f5867c = c1158c;
        this.f5868d = c1159d;
        this.f5869e = c1156a;
        this.f5870f = c1156a2;
        this.f5871g = c1157b;
        this.f5872h = i8;
        this.f5873i = i9;
        this.f5874j = arrayList;
        this.f5875k = c1157b2;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0519h(c0020g, abstractC1284b, this);
    }
}
