package p051g1;

import java.util.Arrays;
import java.util.List;
import p002a1.C0020g;
import p010b1.C0514c;
import p010b1.InterfaceC0513b;
import p059h1.AbstractC1284b;

/* renamed from: g1.m */
/* loaded from: classes.dex */
public final class C1204m implements InterfaceC1193b {

    /* renamed from: a */
    public final String f5905a;

    /* renamed from: b */
    public final List<InterfaceC1193b> f5906b;

    public C1204m(String str, List<InterfaceC1193b> list) {
        this.f5905a = str;
        this.f5906b = list;
    }

    @Override // p051g1.InterfaceC1193b
    /* renamed from: a */
    public final InterfaceC0513b mo3358a(C0020g c0020g, AbstractC1284b abstractC1284b) {
        return new C0514c(c0020g, abstractC1284b, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f5905a + "' Shapes: " + Arrays.toString(this.f5906b.toArray()) + '}';
    }
}
