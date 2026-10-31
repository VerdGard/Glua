package p087k5;

import p023c6.InterfaceC0666l;
import p032d6.AbstractC0899g;
import p032d6.C0898f;

/* renamed from: k5.b */
/* loaded from: classes.dex */
public final class C1462b extends AbstractC0899g implements InterfaceC0666l<C1461a, Boolean> {

    /* renamed from: m */
    public final /* synthetic */ int f6979m;

    /* renamed from: s */
    public final /* synthetic */ int f6980s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1462b(int i7, int i8) {
        super(1);
        this.f6979m = i7;
        this.f6980s = i8;
    }

    @Override // p023c6.InterfaceC0666l
    /* renamed from: c */
    public final Boolean mo216c(C1461a c1461a) {
        C1461a c1461a2 = c1461a;
        C0898f.m2606e(c1461a2, "it");
        int i7 = c1461a2.f6976a;
        return Boolean.valueOf(this.f6979m <= i7 && i7 <= this.f6980s);
    }
}
