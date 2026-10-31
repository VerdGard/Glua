package p036e2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p002a1.C0017d;

/* renamed from: e2.i0 */
/* loaded from: classes.dex */
public final class C1013i0 {

    /* renamed from: a */
    public final HashMap f5123a = new HashMap();

    public C1013i0(C0017d c0017d) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1027k0());
        arrayList.add(new C1020j0());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1006h0 abstractC1006h0 = (AbstractC1006h0) it.next();
            this.f5123a.put(abstractC1006h0.f5086c, abstractC1006h0);
        }
    }
}
