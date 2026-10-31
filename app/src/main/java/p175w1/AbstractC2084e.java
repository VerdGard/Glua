package p175w1;

import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1998p;
import p180w6.AbstractC2150s;

/* renamed from: w1.e */
/* loaded from: classes.dex */
public abstract class AbstractC2084e extends AbstractC2150s {

    /* renamed from: h2 */
    public static WeakReference<Pattern> f9504h2 = new WeakReference<>(null);

    /* renamed from: i2 */
    public static WeakReference<Pattern> f9505i2 = new WeakReference<>(null);

    /* renamed from: g2 */
    public String f9506g2;

    @Override // p165u6.AbstractC1992j
    /* renamed from: E2 */
    public final String mo4686E2() {
        String str = this.f9506g2;
        if (str != null) {
            return str;
        }
        String m4760C2 = m4760C2();
        this.f9506g2 = m4760C2;
        return m4760C2;
    }

    /* renamed from: I2 */
    public abstract AbstractC1984c0 mo5146I2(AbstractC1984c0 abstractC1984c0);

    /* renamed from: J2 */
    public abstract String mo5147J2();

    @Override // p180w6.AbstractC2139h, p165u6.AbstractC1992j, p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        String mo5147J2 = mo5147J2();
        String replace = mo5147J2.replace("[", "").replace("]", "").replace(" ,", ",");
        Pattern pattern = f9504h2.get();
        if (pattern == null) {
            pattern = Pattern.compile(".*(\\(.*\\)).*");
            f9504h2 = new WeakReference<>(pattern);
        }
        String replaceAll = pattern.matcher(replace).replaceAll("$1");
        Pattern pattern2 = f9505i2.get();
        if (pattern2 == null) {
            pattern2 = Pattern.compile("(?<=[\\(,])( ?)\\s*\\S*\\s*(\\S*)(\\s*=\\s*[^,\\)]*)?(?=[,\\)])");
            f9505i2 = new WeakReference<>(pattern2);
        }
        return "function " + pattern2.matcher(replaceAll).replaceAll("$1$2") + " end, -- " + mo5147J2;
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: W0 */
    public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        ThreadLocal<AbstractC2150s> threadLocal = AbstractC1984c0.f8977c;
        AbstractC2150s abstractC2150s = threadLocal.get();
        threadLocal.set(this);
        try {
            AbstractC2003u mo4624u = abstractC1984c0.mo4624u();
            if ((mo4624u instanceof C1998p) && mo4624u.mo4784S1() > 1000000) {
                abstractC1984c0 = AbstractC2003u.m4867y2(mo4624u.mo4753s0().m4823K2(0, 1000000), abstractC1984c0.mo4622L(2));
            }
            return mo5146I2(abstractC1984c0);
        } finally {
            threadLocal.set(abstractC2150s);
        }
    }
}
