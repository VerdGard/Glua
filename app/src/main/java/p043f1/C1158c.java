package p043f1;

import java.util.ArrayList;
import java.util.List;
import p018c1.AbstractC0580a;
import p018c1.C0583d;
import p018c1.C0584e;
import p083k1.C1450d;

/* renamed from: f1.c */
/* loaded from: classes.dex */
public final class C1158c extends AbstractC1163h {

    /* renamed from: c */
    public final /* synthetic */ int f5706c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1158c() {
        this(new C1450d(1.0f, 1.0f));
        this.f5706c = 1;
    }

    @Override // p043f1.InterfaceC1162g
    /* renamed from: a */
    public final AbstractC0580a mo1994a() {
        int i7 = this.f5706c;
        Object obj = this.f5720b;
        switch (i7) {
            case 0:
                return new C0583d(0, (List) obj);
            default:
                return new C0584e(1, (List) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1158c(int i7, ArrayList arrayList) {
        super(0, arrayList);
        this.f5706c = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158c(C1450d c1450d) {
        super(c1450d);
        this.f5706c = 1;
    }
}
