package p051g1;

import android.graphics.PointF;
import p002a1.C0020g;
import p010b1.C0525n;
import p010b1.InterfaceC0513b;
import p043f1.C1156a;
import p043f1.C1157b;
import p043f1.InterfaceC1162g;
import p059h1.AbstractC1284b;

/* renamed from: g1.i */
/* loaded from: classes.dex */
public final class C1200i implements InterfaceC1193b {

    /* renamed from: a */
    public final String f5889a;

    /* renamed from: b */
    public final InterfaceC1162g<PointF, PointF> f5890b;

    /* renamed from: c */
    public final C1156a f5891c;

    /* renamed from: d */
    public final C1157b f5892d;

    public C1200i(String str, InterfaceC1162g<PointF, PointF> interfaceC1162g, C1156a c1156a, C1157b c1157b) {
        this.f5889a = str;
        this.f5890b = interfaceC1162g;
        this.f5891c = c1156a;
        this.f5892d = c1157b;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0525n(c0020g, abstractC1284b, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f5890b + ", size=" + this.f5891c + '}';
    }
}
