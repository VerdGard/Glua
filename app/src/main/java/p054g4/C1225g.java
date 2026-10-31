package p054g4;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import p117o4.C1667a;

/* renamed from: g4.g */
/* loaded from: classes.dex */
public final class C1225g extends AbstractC1242x<AtomicLongArray> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1242x f5969a;

    public C1225g(AbstractC1242x abstractC1242x) {
        this.f5969a = abstractC1242x;
    }

    @Override // p054g4.AbstractC1242x
    /* renamed from: a */
    public final AtomicLongArray mo3442a(C1667a c1667a) {
        ArrayList arrayList = new ArrayList();
        c1667a.mo3771a();
        while (c1667a.mo3777k()) {
            arrayList.add(Long.valueOf(((Number) this.f5969a.mo3442a(c1667a)).longValue()));
        }
        c1667a.mo3773e();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i7 = 0; i7 < size; i7++) {
            atomicLongArray.set(i7, ((Long) arrayList.get(i7)).longValue());
        }
        return atomicLongArray;
    }
}
