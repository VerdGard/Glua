package p188x6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC1992j;
import p165u6.AbstractC2003u;
import p165u6.C1991i;

/* renamed from: x6.h */
/* loaded from: classes.dex */
public final class C2207h extends AbstractC2206g {

    /* renamed from: m2 */
    public static final Map f10013m2 = Collections.synchronizedMap(new HashMap());

    /* renamed from: k2 */
    public final Class<?> f10014k2;

    /* renamed from: l2 */
    public final Method f10015l2;

    /* renamed from: x6.h$a */
    public static class a extends AbstractC1992j {

        /* renamed from: e2 */
        public final C2207h[] f10016e2;

        public a(C2207h[] c2207hArr) {
            this.f10016e2 = c2207hArr;
        }

        /* renamed from: G2 */
        public final AbstractC2003u m5350G2(Object obj, AbstractC1984c0 abstractC1984c0) {
            Map map = C2201b.f9977a;
            int i7 = 65536;
            int i8 = 0;
            C2207h c2207h = null;
            while (true) {
                C2207h[] c2207hArr = this.f10016e2;
                if (i8 >= c2207hArr.length) {
                    break;
                }
                int m5348J2 = c2207hArr[i8].m5348J2(abstractC1984c0);
                if (m5348J2 < i7) {
                    c2207h = c2207hArr[i8];
                    if (m5348J2 == 0) {
                        break;
                    }
                    i7 = m5348J2;
                }
                i8++;
            }
            if (c2207h != null) {
                c2207h.f9136e = this.f9136e;
                return c2207h.m5349K2(obj, abstractC1984c0);
            }
            AbstractC2003u.m4861I0("no coercible public method");
            throw null;
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            return m5350G2(this.f9136e.mo4851s2(), abstractC1984c0);
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: X0 */
        public final AbstractC1984c0 mo4877X0(AbstractC2003u[] abstractC2003uArr) {
            return mo4689W0(AbstractC2003u.m4868z2(abstractC2003uArr));
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: d0 */
        public final AbstractC2003u mo4690d0() {
            return m5350G2(this.f9136e.mo4851s2(), AbstractC2003u.f9124Y);
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: f0 */
        public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
            return m5350G2(this.f9136e.mo4851s2(), abstractC2003u);
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            return m5350G2(this.f9136e.mo4851s2(), AbstractC2003u.m4867y2(abstractC2003u, abstractC2003u2));
        }

        @Override // p165u6.AbstractC2003u
        /* renamed from: h0 */
        public final AbstractC2003u mo4693h0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
            return m5350G2(this.f9136e.mo4851s2(), AbstractC2003u.m4866x2(abstractC2003u, abstractC2003u2, abstractC2003u3));
        }
    }

    public C2207h(Method method) {
        super(method.getParameterTypes(), method.getModifiers());
        this.f10015l2 = method;
        this.f10014k2 = method.getReturnType();
        try {
            if (method.isAccessible()) {
                return;
            }
            method.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: K2 */
    public final AbstractC2003u m5349K2(Object obj, AbstractC1984c0 abstractC1984c0) {
        Object[] m5347I2 = m5347I2(abstractC1984c0);
        try {
            Class<?> cls = this.f10014k2;
            Class<?> cls2 = Void.TYPE;
            Method method = this.f10015l2;
            if (cls != cls2) {
                return C2200a.m5337a(method.invoke(obj, m5347I2));
            }
            method.invoke(obj, m5347I2);
            return this.f9136e;
        } catch (InvocationTargetException e7) {
            throw new C1991i(e7.getTargetException());
        } catch (Exception e8) {
            e8.printStackTrace();
            throw new C1991i("coercion error " + e8);
        }
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: W0 */
    public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        return m5349K2(this.f9136e.mo4851s2(), abstractC1984c0);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: X0 */
    public final AbstractC1984c0 mo4877X0(AbstractC2003u[] abstractC2003uArr) {
        return mo4689W0(AbstractC2003u.m4868z2(abstractC2003uArr));
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: d0 */
    public final AbstractC2003u mo4690d0() {
        return m5349K2(this.f9136e.mo4851s2(), AbstractC2003u.f9124Y);
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: f0 */
    public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
        return m5349K2(this.f9136e.mo4851s2(), abstractC2003u);
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        return m5349K2(this.f9136e.mo4851s2(), AbstractC2003u.m4867y2(abstractC2003u, abstractC2003u2));
    }

    @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: h0 */
    public final AbstractC2003u mo4693h0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
        return m5349K2(this.f9136e.mo4851s2(), AbstractC2003u.m4866x2(abstractC2003u, abstractC2003u2, abstractC2003u3));
    }
}
