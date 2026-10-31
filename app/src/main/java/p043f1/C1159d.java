package p043f1;

import java.util.ArrayList;
import java.util.List;
import p018c1.AbstractC0580a;
import p018c1.C0584e;
import p018c1.C0589j;

/* renamed from: f1.d */
/* loaded from: classes.dex */
public final class C1159d extends AbstractC1163h {

    /* renamed from: c */
    public final /* synthetic */ int f5707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1159d() {
        super((Object) 100);
        this.f5707c = 0;
    }

    @Override // p043f1.InterfaceC1162g
    /* renamed from: a */
    public final AbstractC0580a mo1994a() {
        int i7 = this.f5707c;
        Object obj = this.f5720b;
        switch (i7) {
            case 0:
                return new C0584e(0, (List) obj);
            default:
                return new C0589j((List) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1159d(int i7, ArrayList arrayList) {
        super(0, arrayList);
        this.f5707c = i7;
    }
}
