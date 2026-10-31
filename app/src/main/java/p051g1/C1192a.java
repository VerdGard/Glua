package p051g1;

import android.graphics.PointF;
import p002a1.C0020g;
import p010b1.C0516e;
import p010b1.InterfaceC0513b;
import p043f1.C1156a;
import p043f1.InterfaceC1162g;
import p059h1.AbstractC1284b;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public final class C1192a implements InterfaceC1193b {

    /* renamed from: a */
    public final String f5852a;

    /* renamed from: b */
    public final InterfaceC1162g<PointF, PointF> f5853b;

    /* renamed from: c */
    public final C1156a f5854c;

    /* renamed from: d */
    public final boolean f5855d;

    public C1192a(String str, InterfaceC1162g<PointF, PointF> interfaceC1162g, C1156a c1156a, boolean z6) {
        this.f5852a = str;
        this.f5853b = interfaceC1162g;
        this.f5854c = c1156a;
        this.f5855d = z6;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0516e(c0020g, abstractC1284b, this);
    }
}
