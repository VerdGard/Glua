package p188x6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1991i;
import p180w6.AbstractC2150s;

/* renamed from: x6.e */
/* loaded from: classes.dex */
public final class C2204e extends AbstractC2206g {

    /* renamed from: l2 */
    public static final Map f10002l2 = Collections.synchronizedMap(new HashMap());

    /* renamed from: k2 */
    public final Constructor f10003k2;

    /* renamed from: x6.e$a */
    public static class a extends AbstractC2150s {

        /* renamed from: g2 */
        public final C2204e[] f10004g2;

        public a(C2204e[] c2204eArr) {
            this.f10004g2 = c2204eArr;
        }

        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            Map map = C2201b.f9977a;
            int i7 = 65536;
            int i8 = 0;
            C2204e c2204e = null;
            while (true) {
                C2204e[] c2204eArr = this.f10004g2;
                if (i8 >= c2204eArr.length) {
                    break;
                }
                int m5348J2 = c2204eArr[i8].m5348J2(abstractC1984c0);
                if (m5348J2 < i7) {
                    c2204e = c2204eArr[i8];
                    if (m5348J2 == 0) {
                        break;
                    }
                    i7 = m5348J2;
                }
                i8++;
            }
            if (c2204e != null) {
                return c2204e.mo4689W0(abstractC1984c0);
            }
            AbstractC2003u.m4861I0("no coercible public method");
            throw null;
        }
    }

    public C2204e(Constructor constructor) {
        super(constructor.getParameterTypes(), constructor.getModifiers());
        this.f10003k2 = constructor;
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: W0 */
    public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        try {
            return new C2205f(this.f10003k2.newInstance(m5347I2(abstractC1984c0)));
        } catch (InvocationTargetException e7) {
            throw new C1991i(e7.getTargetException());
        } catch (Exception e8) {
            throw new C1991i("coercion error " + e8);
        }
    }
}
