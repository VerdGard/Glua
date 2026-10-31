package p183x1;

import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p175w1.AbstractC2084e;
import p175w1.C2083d0;
import p175w1.C2101m0;
import p175w1.RunnableC2077a0;

/* renamed from: x1.h */
/* loaded from: classes.dex */
public final class C2181h extends AbstractC2084e {

    /* renamed from: j2 */
    public final C2083d0 f9904j2;

    public C2181h(C2083d0 c2083d0) {
        this.f9904j2 = c2083d0;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: I2 */
    public final AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0) {
        C2083d0 c2083d0 = this.f9904j2;
        if (c2083d0.f9498j2 != null) {
            C2101m0.m5155a(0, new RunnableC2077a0(c2083d0, false));
        }
        return AbstractC2003u.f9130m;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: J2 */
    public final String mo5147J2() {
        return "gg.hideUiButton() -> nil";
    }
}
