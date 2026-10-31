package p051g1;

import android.graphics.PointF;
import p002a1.C0020g;
import p010b1.C0524m;
import p010b1.InterfaceC0513b;
import p043f1.C1157b;
import p043f1.InterfaceC1162g;
import p059h1.AbstractC1284b;

/* renamed from: g1.h */
/* loaded from: classes.dex */
public final class C1199h implements InterfaceC1193b {

    /* renamed from: a */
    public final String f5880a;

    /* renamed from: b */
    public final int f5881b;

    /* renamed from: c */
    public final C1157b f5882c;

    /* renamed from: d */
    public final InterfaceC1162g<PointF, PointF> f5883d;

    /* renamed from: e */
    public final C1157b f5884e;

    /* renamed from: f */
    public final C1157b f5885f;

    /* renamed from: g */
    public final C1157b f5886g;

    /* renamed from: h */
    public final C1157b f5887h;

    /* renamed from: i */
    public final C1157b f5888i;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;Lf1/b;Lf1/g<Landroid/graphics/PointF;Landroid/graphics/PointF;>;Lf1/b;Lf1/b;Lf1/b;Lf1/b;Lf1/b;)V */
    public C1199h(String str, int i7, C1157b c1157b, InterfaceC1162g interfaceC1162g, C1157b c1157b2, C1157b c1157b3, C1157b c1157b4, C1157b c1157b5, C1157b c1157b6) {
        this.f5880a = str;
        this.f5881b = i7;
        this.f5882c = c1157b;
        this.f5883d = interfaceC1162g;
        this.f5884e = c1157b2;
        this.f5885f = c1157b3;
        this.f5886g = c1157b4;
        this.f5887h = c1157b5;
        this.f5888i = c1157b6;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0524m(c0020g, abstractC1284b, this);
    }
}
