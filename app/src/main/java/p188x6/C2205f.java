package p188x6;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC2003u;
import p165u6.C1991i;
import p165u6.C1998p;
import p165u6.C1999q;
import p165u6.C2001s;

/* renamed from: x6.f */
/* loaded from: classes.dex */
public class C2205f extends C2001s {

    /* renamed from: g2 */
    public static final HashMap<C2205f, HashMap<AbstractC2003u, AbstractC2003u>> f10005g2 = new HashMap<>();

    /* renamed from: h2 */
    public static final C1998p f10006h2 = C1998p.m4815M2("class");

    /* renamed from: e2 */
    public C2203d f10007e2;

    /* renamed from: f2 */
    public HashMap<AbstractC2003u, AbstractC2003u> f10008f2;

    public C2205f(Object obj) {
        super(obj);
    }

    @Override // p165u6.C2001s, p165u6.AbstractC2003u
    /* renamed from: L0 */
    public AbstractC2003u mo4777L0(AbstractC2003u abstractC2003u) {
        Field m5345D2;
        AbstractC2003u m5346E2;
        if (this.f10007e2 == null) {
            this.f10007e2 = C2203d.m5344C2(this.f9091c2.getClass());
        }
        AbstractC2003u abstractC2003u2 = this.f10007e2.f9996k2.get(abstractC2003u);
        if (abstractC2003u2 != null) {
            return abstractC2003u2;
        }
        Integer num = this.f10007e2.f9994i2.get(abstractC2003u);
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue == 0 || intValue == 1) && (m5345D2 = this.f10007e2.m5345D2(abstractC2003u)) != null) {
            if (intValue == 0) {
                this.f10007e2.f9994i2.put(abstractC2003u, 1);
            }
            try {
                AbstractC2003u m5337a = C2200a.m5337a(m5345D2.get(this.f9091c2));
                if (Modifier.isFinal(m5345D2.getModifiers())) {
                    this.f10007e2.f9996k2.put(abstractC2003u, m5337a);
                }
                return m5337a;
            } catch (Exception e7) {
                throw new C1991i(e7);
            }
        }
        if ((intValue == 0 || intValue == 2) && (m5346E2 = this.f10007e2.m5346E2(abstractC2003u)) != null) {
            if (intValue == 0) {
                this.f10007e2.f9994i2.put(abstractC2003u, 2);
            }
            m5346E2.f9136e = this;
            return m5346E2;
        }
        if ((intValue == 0 || intValue == 3) && (this.f9091c2 instanceof Class)) {
            C2203d c2203d = this.f10007e2;
            if (c2203d.f10001p2 == null) {
                HashMap hashMap = new HashMap();
                for (Class<?> cls : ((Class) c2203d.f9091c2).getClasses()) {
                    String name = cls.getName();
                    hashMap.put(C1998p.m4815M2(name.substring(Math.max(name.lastIndexOf(36), name.lastIndexOf(46)) + 1)), cls);
                }
                c2203d.f10001p2 = hashMap;
            }
            Class cls2 = (Class) c2203d.f10001p2.get(abstractC2003u);
            if (cls2 != null) {
                if (intValue == 0) {
                    this.f10007e2.f9994i2.put(abstractC2003u, 3);
                }
                C2203d m5344C2 = C2203d.m5344C2(cls2);
                if (Modifier.isStatic(cls2.getModifiers())) {
                    this.f10007e2.f9996k2.put(abstractC2003u, m5344C2);
                }
                return m5344C2;
            }
        }
        if (intValue == 0 || intValue == 4) {
            AbstractC2003u abstractC2003u3 = this.f10007e2.f9997l2.get(abstractC2003u);
            if (abstractC2003u3 == null) {
                String mo4645M = abstractC2003u.mo4645M();
                if (mo4645M.equals("class")) {
                    return C2200a.m5337a(this.f9091c2.getClass());
                }
                if (Character.isLowerCase(mo4645M.charAt(0))) {
                    mo4645M = Character.toUpperCase(mo4645M.charAt(0)) + mo4645M.substring(1);
                }
                AbstractC2003u m5346E22 = this.f10007e2.m5346E2(C2200a.m5337a("get" + mo4645M));
                abstractC2003u3 = m5346E22 == null ? this.f10007e2.m5346E2(C2200a.m5337a("is" + mo4645M)) : m5346E22;
            }
            if (abstractC2003u3 != null) {
                if (intValue == 0) {
                    this.f10007e2.f9997l2.put(abstractC2003u, abstractC2003u3);
                    this.f10007e2.f9994i2.put(abstractC2003u, 4);
                }
                abstractC2003u3.f9136e = this;
                return abstractC2003u3.mo4690d0();
            }
        }
        if (intValue == 0 || intValue == 5) {
            Object obj = this.f9091c2;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (intValue == 0) {
                    this.f10007e2.f9994i2.put(abstractC2003u, 5);
                }
                return C2200a.m5337a(map.get(C2201b.m5339a(Object.class, abstractC2003u)));
            }
            if (obj instanceof List) {
                if (intValue == 0) {
                    this.f10007e2.f9994i2.put(abstractC2003u, 5);
                }
                return C2200a.m5337a(((List) this.f9091c2).get(abstractC2003u.mo4740m0()));
            }
        }
        HashMap<AbstractC2003u, AbstractC2003u> hashMap2 = this.f10008f2;
        HashMap<C2205f, HashMap<AbstractC2003u, AbstractC2003u>> hashMap3 = f10005g2;
        if (hashMap2 == null) {
            if (hashMap3.containsKey(this)) {
                HashMap<AbstractC2003u, AbstractC2003u> hashMap4 = hashMap3.get(this);
                this.f10008f2 = hashMap4;
                if (hashMap4.containsKey(abstractC2003u)) {
                    return this.f10008f2.get(abstractC2003u);
                }
            }
        } else if (hashMap2.containsKey(abstractC2003u)) {
            return this.f10008f2.get(abstractC2003u);
        }
        if (hashMap3.containsKey(this.f10007e2)) {
            HashMap<AbstractC2003u, AbstractC2003u> hashMap5 = hashMap3.get(this.f10007e2);
            if (hashMap5.containsKey(abstractC2003u)) {
                return hashMap5.get(abstractC2003u);
            }
        }
        if (!abstractC2003u.mo4704G0(f10006h2)) {
            return super.mo4777L0(abstractC2003u);
        }
        C2203d c2203d2 = this.f10007e2;
        c2203d2.f9996k2.put(abstractC2003u, c2203d2);
        return this.f10007e2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: W0 */
    public AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        if (abstractC1984c0.mo4621I() == 1) {
            AbstractC2003u mo4624u = abstractC1984c0.mo4624u();
            if (mo4624u.mo4839g1()) {
                AbstractC2003u abstractC2003u = AbstractC2003u.f9130m;
                while (true) {
                    AbstractC1984c0 mo4796x1 = mo4624u.mo4796x1(abstractC2003u);
                    if (mo4796x1.m4641G(1)) {
                        return this;
                    }
                    AbstractC2003u mo4624u2 = mo4796x1.mo4624u();
                    mo4790Y1(mo4624u2, mo4796x1.mo4623t(2));
                    abstractC2003u = mo4624u2;
                }
            }
        }
        return super.mo4689W0(abstractC1984c0);
    }

    @Override // p165u6.C2001s, p165u6.AbstractC2003u
    /* renamed from: Y1 */
    public final void mo4790Y1(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        Field m5345D2;
        if (this.f10007e2 == null) {
            this.f10007e2 = C2203d.m5344C2(this.f9091c2.getClass());
        }
        Integer num = this.f10007e2.f9995j2.get(abstractC2003u);
        boolean z6 = false;
        int intValue = num != null ? num.intValue() : 0;
        if ((intValue == 0 || intValue == 6) && (m5345D2 = this.f10007e2.m5345D2(abstractC2003u)) != null) {
            if (intValue == 0) {
                this.f10007e2.f9995j2.put(abstractC2003u, 6);
            }
            try {
                m5345D2.set(this.f9091c2, C2201b.m5339a(m5345D2.getType(), abstractC2003u2));
                return;
            } catch (Exception e7) {
                throw new C1991i(e7);
            }
        }
        if (intValue == 0 || intValue == 7) {
            AbstractC2003u abstractC2003u3 = this.f10007e2.f9998m2.get(abstractC2003u);
            if (abstractC2003u3 == null) {
                String mo4645M = abstractC2003u.mo4645M();
                if (Character.isLowerCase(mo4645M.charAt(0))) {
                    mo4645M = Character.toUpperCase(mo4645M.charAt(0)) + mo4645M.substring(1);
                }
                abstractC2003u3 = this.f10007e2.m5346E2(C2200a.m5337a("set" + mo4645M));
            }
            if (abstractC2003u3 != null) {
                if (intValue == 0) {
                    this.f10007e2.f9998m2.put(abstractC2003u, abstractC2003u3);
                    this.f10007e2.f9995j2.put(abstractC2003u, 7);
                }
                abstractC2003u3.f9136e = this;
                abstractC2003u3.mo4691f0(abstractC2003u2);
                return;
            }
        }
        if (intValue == 0 || intValue == 9) {
            String mo4645M2 = abstractC2003u.mo4645M();
            if (mo4645M2.length() > 2 && mo4645M2.substring(0, 2).equals("on") && abstractC2003u2.mo4763Y0()) {
                C2207h c2207h = (C2207h) this.f10007e2.m5346E2(C2200a.m5337a("setOn" + mo4645M2.substring(2) + "Listener"));
                if (c2207h != null) {
                    C1999q c1999q = new C1999q();
                    c1999q.mo4790Y1(C1998p.m4815M2(mo4645M2), abstractC2003u2);
                    Class<?>[] parameterTypes = c2207h.f10015l2.getParameterTypes();
                    c2207h.f9136e = this;
                    c2207h.mo4691f0(C2212m.m5352J2(parameterTypes[0], c1999q));
                    z6 = true;
                }
                if (z6) {
                    if (intValue == 0) {
                        this.f10007e2.f9995j2.put(abstractC2003u, 9);
                        return;
                    }
                    return;
                }
            }
        }
        if (intValue == 0 || intValue == 8) {
            Object obj = this.f9091c2;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (intValue == 0) {
                    this.f10007e2.f9995j2.put(abstractC2003u, 8);
                }
                C2200a.m5337a(map.put(C2201b.m5339a(Object.class, abstractC2003u), C2201b.m5339a(Object.class, abstractC2003u2)));
                return;
            }
            if (obj instanceof List) {
                if (intValue == 0) {
                    this.f10007e2.f9995j2.put(abstractC2003u, 8);
                }
                C2200a.m5337a(((List) this.f9091c2).set(abstractC2003u.mo4740m0(), C2201b.m5339a(Object.class, abstractC2003u2)));
                return;
            }
        }
        if (this.f10008f2 == null) {
            HashMap<C2205f, HashMap<AbstractC2003u, AbstractC2003u>> hashMap = f10005g2;
            if (hashMap.containsKey(this)) {
                this.f10008f2 = hashMap.get(this);
            } else {
                HashMap<AbstractC2003u, AbstractC2003u> hashMap2 = new HashMap<>();
                this.f10008f2 = hashMap2;
                hashMap.put(this, hashMap2);
            }
        }
        this.f10008f2.put(abstractC2003u, abstractC2003u2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: f0 */
    public AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
        if (!abstractC2003u.mo4839g1()) {
            return super.mo4691f0(abstractC2003u);
        }
        AbstractC2003u abstractC2003u2 = AbstractC2003u.f9130m;
        while (true) {
            AbstractC1984c0 mo4796x1 = abstractC2003u.mo4796x1(abstractC2003u2);
            if (mo4796x1.m4641G(1)) {
                return this;
            }
            AbstractC2003u mo4624u = mo4796x1.mo4624u();
            mo4790Y1(mo4624u, mo4796x1.mo4623t(2));
            abstractC2003u2 = mo4624u;
        }
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j1 */
    public final AbstractC2003u mo4793j1() {
        int size;
        Object obj = this.f9091c2;
        if (obj instanceof Map) {
            size = ((Map) obj).size();
        } else {
            if (!(obj instanceof List)) {
                return super.mo4793j1();
            }
            size = ((List) obj).size();
        }
        return C2200a.m5337a(Integer.valueOf(size));
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: x1 */
    public final AbstractC1984c0 mo4796x1(AbstractC2003u abstractC2003u) {
        Object obj = this.f9091c2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Set keySet = map.keySet();
            Object m5339a = C2201b.m5339a(Object.class, abstractC2003u);
            for (Object obj2 : keySet) {
                if (m5339a == null || m5339a.equals(obj2)) {
                    return AbstractC2003u.m4868z2(new AbstractC2003u[]{C2200a.m5337a(obj2), C2200a.m5337a(map.get(obj2))});
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            int mo4747o2 = abstractC2003u.mo4804d1() ? 0 : abstractC2003u.mo4747o2() + 1;
            return mo4747o2 >= list.size() ? AbstractC2003u.f9130m : AbstractC2003u.m4868z2(new AbstractC2003u[]{C2200a.m5337a(Integer.valueOf(mo4747o2)), C2200a.m5337a(list.get(mo4747o2))});
        }
        super.mo4796x1(abstractC2003u);
        throw null;
    }
}
