package p018c1;

import java.util.List;
import p036e2.C1109v5;
import p083k1.C1447a;
import p083k1.C1449c;

/* renamed from: c1.b */
/* loaded from: classes.dex */
public final class C0581b extends AbstractC0585f<Integer> {
    public C0581b(List<C1447a<Integer>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p018c1.AbstractC0580a
    /* renamed from: f */
    public final Object mo2031f(C1447a c1447a, float f7) {
        T t7;
        T t8 = c1447a.f6948b;
        if (t8 == 0 || (t7 = c1447a.f6949c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t8).intValue();
        int intValue2 = ((Integer) t7).intValue();
        C1449c c1449c = this.f2955e;
        if (c1449c == null) {
            return Integer.valueOf(C1109v5.m3254r(f7, intValue, intValue2));
        }
        c1447a.f6952f.floatValue();
        Integer valueOf = Integer.valueOf(intValue);
        Integer valueOf2 = Integer.valueOf(intValue2);
        m2029d();
        return (Integer) c1449c.m3834a(valueOf, valueOf2);
    }
}
