package p142r6;

import p150s6.C1906b;
import p150s6.C1910f;

/* renamed from: r6.n */
/* loaded from: classes.dex */
public final class C1857n {
    /* renamed from: a */
    public static C1910f m4390a(AbstractC1856m abstractC1856m) {
        C1910f c1910f;
        abstractC1856m.getClass();
        while (true) {
            AbstractC1856m abstractC1856m2 = abstractC1856m.f8357c;
            if (abstractC1856m2 == null) {
                break;
            }
            abstractC1856m = abstractC1856m2;
        }
        C1850g c1850g = abstractC1856m instanceof C1850g ? (C1850g) abstractC1856m : null;
        return (c1850g == null || (c1910f = c1850g.f8327y1) == null) ? new C1910f(new C1906b()) : c1910f;
    }
}
