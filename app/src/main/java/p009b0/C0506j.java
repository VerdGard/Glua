package p009b0;

import java.util.ArrayList;
import p009b0.C0507k;
import p026d0.InterfaceC0873a;
import p089l.C1481o;

/* renamed from: b0.j */
/* loaded from: classes.dex */
public final class C0506j implements InterfaceC0873a<C0507k.a> {

    /* renamed from: a */
    public final /* synthetic */ String f2530a;

    public C0506j(String str) {
        this.f2530a = str;
    }

    @Override // p026d0.InterfaceC0873a
    public final void accept(C0507k.a aVar) {
        C0507k.a aVar2 = aVar;
        synchronized (C0507k.f2533c) {
            C1481o<String, ArrayList<InterfaceC0873a<C0507k.a>>> c1481o = C0507k.f2534d;
            ArrayList<InterfaceC0873a<C0507k.a>> arrayList = c1481o.get(this.f2530a);
            if (arrayList == null) {
                return;
            }
            c1481o.remove(this.f2530a);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                arrayList.get(i7).accept(aVar2);
            }
        }
    }
}
