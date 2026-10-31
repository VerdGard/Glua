package p043f1;

import java.util.ArrayList;
import java.util.List;
import p018c1.AbstractC0580a;
import p018c1.C0581b;
import p018c1.C0582c;
import p018c1.C0583d;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public final class C1156a extends AbstractC1163h {

    /* renamed from: c */
    public final /* synthetic */ int f5705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1156a(int i7, ArrayList arrayList) {
        super(0, arrayList);
        this.f5705c = i7;
    }

    @Override // p043f1.InterfaceC1162g
    /* renamed from: a */
    public final AbstractC0580a mo1994a() {
        int i7 = this.f5705c;
        Object obj = this.f5720b;
        switch (i7) {
            case 0:
                return new C0581b((List) obj);
            case 1:
                return new C0583d(1, (List) obj);
            default:
                return new C0582c(1, (List) obj);
        }
    }
}
