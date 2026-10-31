package p183x1;

import dalvik.system.DexClassLoader;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1998p;
import p168v1.AbstractApplicationC2012b;
import p175w1.AbstractC2084e;
import p175w1.C2083d0;
import p175w1.C2101m0;
import p175w1.RunnableC2077a0;
import p188x6.C2200a;

/* renamed from: x1.a */
/* loaded from: classes.dex */
public final class C2174a extends AbstractC2084e {

    /* renamed from: j2 */
    public final /* synthetic */ int f9884j2;

    /* renamed from: k2 */
    public final AbstractC2003u f9885k2;

    public /* synthetic */ C2174a(int i7, AbstractC2003u abstractC2003u) {
        this.f9884j2 = i7;
        this.f9885k2 = abstractC2003u;
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: I2 */
    public final AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0) {
        switch (this.f9884j2) {
            case 0:
                try {
                    Object newInstance = new DexClassLoader(abstractC1984c0.m4649x(1), AbstractApplicationC2012b.f9161c.getCacheDir().getAbsolutePath(), null, AbstractApplicationC2012b.f9161c.getClassLoader()).loadClass(abstractC1984c0.m4649x(2)).newInstance();
                    return newInstance != null ? C2200a.m5337a(newInstance) : C1998p.m4815M2(this.f9701f2);
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return C1998p.m4815M2(e7.getMessage());
                }
            default:
                C2083d0 c2083d0 = (C2083d0) this.f9885k2;
                if (true != (c2083d0.f9498j2 != null)) {
                    C2101m0.m5155a(0, new RunnableC2077a0(c2083d0, true));
                }
                return C1998p.m4815M2("UI开启");
        }
    }

    @Override // p175w1.AbstractC2084e
    /* renamed from: J2 */
    public final String mo5147J2() {
        switch (this.f9884j2) {
            case 0:
                return "ap.ClassLoad(string text) -> nil";
            default:
                return "gg.showUiButton() -> nil";
        }
    }
}
