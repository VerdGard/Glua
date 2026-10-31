package p188x6;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p165u6.AbstractC2003u;
import p165u6.C1998p;
import p188x6.C2200a;
import p188x6.C2204e;
import p188x6.C2207h;

/* renamed from: x6.d */
/* loaded from: classes.dex */
public final class C2203d extends C2205f implements C2200a.e {

    /* renamed from: q2 */
    public static final HashMap<AbstractC2003u, AbstractC2003u> f9991q2 = new HashMap<>();

    /* renamed from: r2 */
    public static final Map f9992r2 = Collections.synchronizedMap(new HashMap());

    /* renamed from: s2 */
    public static final C1998p f9993s2 = C1998p.m4815M2("new");

    /* renamed from: i2 */
    public final HashMap<AbstractC2003u, Integer> f9994i2;

    /* renamed from: j2 */
    public final HashMap<AbstractC2003u, Integer> f9995j2;

    /* renamed from: k2 */
    public final HashMap<AbstractC2003u, AbstractC2003u> f9996k2;

    /* renamed from: l2 */
    public final HashMap<AbstractC2003u, AbstractC2003u> f9997l2;

    /* renamed from: m2 */
    public final HashMap<AbstractC2003u, AbstractC2003u> f9998m2;

    /* renamed from: n2 */
    public HashMap f9999n2;

    /* renamed from: o2 */
    public HashMap f10000o2;

    /* renamed from: p2 */
    public HashMap f10001p2;

    static {
        for (Method method : Class.class.getMethods()) {
            HashMap<AbstractC2003u, AbstractC2003u> hashMap = f9991q2;
            C1998p m4815M2 = C1998p.m4815M2(method.getName());
            Map map = C2207h.f10013m2;
            C2207h c2207h = (C2207h) map.get(method);
            if (c2207h == null) {
                c2207h = new C2207h(method);
                map.put(method, c2207h);
            }
            hashMap.put(m4815M2, c2207h);
        }
    }

    public C2203d(Class cls) {
        super(cls);
        this.f9994i2 = new HashMap<>();
        this.f9995j2 = new HashMap<>();
        this.f9996k2 = new HashMap<>();
        this.f9997l2 = new HashMap<>();
        this.f9998m2 = new HashMap<>();
        this.f10007e2 = this;
    }

    /* renamed from: C2 */
    public static C2203d m5344C2(Class cls) {
        Map map = f9992r2;
        C2203d c2203d = (C2203d) map.get(cls);
        if (c2203d != null) {
            return c2203d;
        }
        C2203d c2203d2 = new C2203d(cls);
        map.put(cls, c2203d2);
        return c2203d2;
    }

    /* renamed from: D2 */
    public final Field m5345D2(AbstractC2003u abstractC2003u) {
        if (this.f9999n2 == null) {
            HashMap hashMap = new HashMap();
            for (Field field : ((Class) this.f9091c2).getFields()) {
                if (Modifier.isPublic(field.getModifiers())) {
                    hashMap.put(C1998p.m4815M2(field.getName()), field);
                    try {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                    } catch (SecurityException unused) {
                    }
                }
            }
            this.f9999n2 = hashMap;
        }
        return (Field) this.f9999n2.get(abstractC2003u);
    }

    /* renamed from: E2 */
    public final AbstractC2003u m5346E2(AbstractC2003u abstractC2003u) {
        Object aVar;
        if (this.f10000o2 == null) {
            HashMap hashMap = new HashMap();
            for (Method method : ((Class) this.f9091c2).getMethods()) {
                if (Modifier.isPublic(method.getModifiers())) {
                    String name = method.getName();
                    List list = (List) hashMap.get(name);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap.put(name, list);
                    }
                    Map map = C2207h.f10013m2;
                    C2207h c2207h = (C2207h) map.get(method);
                    if (c2207h == null) {
                        c2207h = new C2207h(method);
                        map.put(method, c2207h);
                    }
                    list.add(c2207h);
                }
            }
            HashMap hashMap2 = new HashMap();
            Constructor<?>[] constructors = ((Class) this.f9091c2).getConstructors();
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < constructors.length; i7++) {
                if (Modifier.isPublic(constructors[i7].getModifiers())) {
                    Constructor<?> constructor = constructors[i7];
                    Map map2 = C2204e.f10002l2;
                    C2204e c2204e = (C2204e) map2.get(constructor);
                    if (c2204e == null) {
                        c2204e = new C2204e(constructor);
                        map2.put(constructor, c2204e);
                    }
                    arrayList.add(c2204e);
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                C1998p c1998p = f9993s2;
                if (size != 1) {
                    C2204e[] c2204eArr = (C2204e[]) arrayList.toArray(new C2204e[arrayList.size()]);
                    Map map3 = C2204e.f10002l2;
                    hashMap2.put(c1998p, new C2204e.a(c2204eArr));
                } else {
                    hashMap2.put(c1998p, arrayList.get(0));
                }
            }
            hashMap2.putAll(f9991q2);
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                C1998p m4815M2 = C1998p.m4815M2(str);
                if (list2.size() == 1) {
                    aVar = list2.get(0);
                } else {
                    C2207h[] c2207hArr = (C2207h[]) list2.toArray(new C2207h[list2.size()]);
                    Map map4 = C2207h.f10013m2;
                    aVar = new C2207h.a(c2207hArr);
                }
                hashMap2.put(m4815M2, aVar);
            }
            this.f10000o2 = hashMap2;
        }
        return (AbstractC2003u) this.f10000o2.get(abstractC2003u);
    }

    @Override // p188x6.C2205f, p165u6.C2001s, p165u6.AbstractC2003u
    /* renamed from: L0 */
    public final AbstractC2003u mo4777L0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4808e1() ? C2200a.m5337a(Array.newInstance((Class<?>) this.f9091c2, abstractC2003u.mo4747o2())) : super.mo4777L0(abstractC2003u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 != 7) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // p188x6.C2205f, p165u6.AbstractC2003u
    /* renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p165u6.AbstractC1984c0 mo4689W0(p165u6.AbstractC1984c0 r9) {
        /*
            r8 = this;
            int r0 = r9.mo4621I()
            r1 = 1
            if (r0 != r1) goto Lc7
            java.lang.Object r0 = r8.f9091c2
            java.lang.Class r0 = (java.lang.Class) r0
            u6.u r1 = r9.mo4624u()
            boolean r2 = r0.isPrimitive()
            if (r2 == 0) goto L1e
            java.lang.Object r9 = p188x6.C2201b.m5339a(r0, r1)
            u6.u r9 = p188x6.C2200a.m5337a(r9)
            return r9
        L1e:
            boolean r2 = r1.mo4839g1()
            if (r2 == 0) goto Lc7
            boolean r9 = r0.isInterface()
            if (r9 == 0) goto L2f
            u6.s r9 = p188x6.C2212m.m5352J2(r0, r1)
            return r9
        L2f:
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r2 = r9.isAssignableFrom(r0)
            if (r2 == 0) goto L45
            x6.b$e r9 = new x6.b$e
            r9.<init>(r0)
            java.lang.Object r9 = r9.mo5342a(r1)
            u6.u r9 = p188x6.C2200a.m5337a(r9)
            return r9
        L45:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r2 = r2.isAssignableFrom(r0)
            r3 = 0
            r4 = 7
            r5 = 0
            r6 = 5
            if (r2 == 0) goto L97
            x6.b$g r2 = new x6.b$g
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r2.<init>(r7)
            int r7 = r1.mo4675t2()
            if (r7 == r6) goto L61
            if (r7 == r4) goto L8e
            goto L92
        L61:
            boolean r9 = r0.equals(r9)     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
            if (r9 == 0) goto L6d
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
            r9.<init>()     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
            goto L73
        L6d:
            java.lang.Object r9 = r0.newInstance()     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
        L73:
            r3 = r9
            int r9 = r1.mo4794k1()     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
        L78:
            if (r5 >= r9) goto L92
            int r5 = r5 + 1
            u6.u r0 = r1.mo4776J0(r5)     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
            java.lang.Object r0 = r2.mo5342a(r0)     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
            r3.add(r0)     // Catch: java.lang.InstantiationException -> L88 java.lang.IllegalAccessException -> L8a
            goto L78
        L88:
            r9 = move-exception
            goto L8b
        L8a:
            r9 = move-exception
        L8b:
            r9.printStackTrace()
        L8e:
            java.lang.Object r3 = r1.mo4851s2()
        L92:
            u6.u r9 = p188x6.C2200a.m5337a(r3)
            return r9
        L97:
            x6.b$c r9 = p188x6.C2201b.m5340b(r0)
            int r2 = r1.mo4675t2()
            if (r2 == r6) goto La9
            if (r2 == r4) goto La4
            goto Lc2
        La4:
            java.lang.Object r3 = r1.mo4851s2()
            goto Lc2
        La9:
            int r2 = r1.mo4794k1()
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r0, r2)
        Lb1:
            if (r5 >= r2) goto Lc2
            int r0 = r5 + 1
            u6.u r4 = r1.mo4776J0(r0)
            java.lang.Object r4 = r9.mo5342a(r4)
            java.lang.reflect.Array.set(r3, r5, r4)
            r5 = r0
            goto Lb1
        Lc2:
            u6.u r9 = p188x6.C2200a.m5337a(r3)
            return r9
        Lc7:
            u6.p r0 = p188x6.C2203d.f9993s2
            u6.u r0 = r8.mo4777L0(r0)
            u6.c0 r9 = r0.mo4689W0(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p188x6.C2203d.mo4689W0(u6.c0):u6.c0");
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: d0 */
    public final AbstractC2003u mo4690d0() {
        return mo4777L0(f9993s2).mo4690d0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7 != 7) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // p188x6.C2205f, p165u6.AbstractC2003u
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p165u6.AbstractC2003u mo4691f0(p165u6.AbstractC2003u r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f9091c2
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L13
            java.lang.Object r9 = p188x6.C2201b.m5339a(r0, r9)
            u6.u r9 = p188x6.C2200a.m5337a(r9)
            return r9
        L13:
            boolean r1 = r9.mo4839g1()
            if (r1 == 0) goto Lbc
            boolean r1 = r0.isInterface()
            if (r1 == 0) goto L24
            u6.s r9 = p188x6.C2212m.m5352J2(r0, r9)
            return r9
        L24:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L3a
            x6.b$e r1 = new x6.b$e
            r1.<init>(r0)
            java.lang.Object r9 = r1.mo5342a(r9)
            u6.u r9 = p188x6.C2200a.m5337a(r9)
            return r9
        L3a:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r2 = r2.isAssignableFrom(r0)
            r3 = 0
            r4 = 7
            r5 = 0
            r6 = 5
            if (r2 == 0) goto L8c
            x6.b$g r2 = new x6.b$g
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r2.<init>(r7)
            int r7 = r9.mo4675t2()
            if (r7 == r6) goto L56
            if (r7 == r4) goto L83
            goto L87
        L56:
            boolean r1 = r0.equals(r1)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
            if (r1 == 0) goto L62
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
            r0.<init>()     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
            goto L68
        L62:
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
        L68:
            r3 = r0
            int r0 = r9.mo4794k1()     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
        L6d:
            if (r5 >= r0) goto L87
            int r5 = r5 + 1
            u6.u r1 = r9.mo4776J0(r5)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
            java.lang.Object r1 = r2.mo5342a(r1)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
            r3.add(r1)     // Catch: java.lang.InstantiationException -> L7d java.lang.IllegalAccessException -> L7f
            goto L6d
        L7d:
            r0 = move-exception
            goto L80
        L7f:
            r0 = move-exception
        L80:
            r0.printStackTrace()
        L83:
            java.lang.Object r3 = r9.mo4851s2()
        L87:
            u6.u r9 = p188x6.C2200a.m5337a(r3)
            return r9
        L8c:
            x6.b$c r1 = p188x6.C2201b.m5340b(r0)
            int r2 = r9.mo4675t2()
            if (r2 == r6) goto L9e
            if (r2 == r4) goto L99
            goto Lb7
        L99:
            java.lang.Object r3 = r9.mo4851s2()
            goto Lb7
        L9e:
            int r2 = r9.mo4794k1()
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r0, r2)
        La6:
            if (r5 >= r2) goto Lb7
            int r0 = r5 + 1
            u6.u r4 = r9.mo4776J0(r0)
            java.lang.Object r4 = r1.mo5342a(r4)
            java.lang.reflect.Array.set(r3, r5, r4)
            r5 = r0
            goto La6
        Lb7:
            u6.u r9 = p188x6.C2200a.m5337a(r3)
            return r9
        Lbc:
            u6.p r0 = p188x6.C2203d.f9993s2
            u6.u r0 = r8.mo4777L0(r0)
            u6.u r9 = r0.mo4691f0(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p188x6.C2203d.mo4691f0(u6.u):u6.u");
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        return mo4777L0(f9993s2).mo4692g0(abstractC2003u, abstractC2003u2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: h0 */
    public final AbstractC2003u mo4693h0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
        return mo4777L0(f9993s2).mo4693h0(abstractC2003u, abstractC2003u2, abstractC2003u3);
    }

    @Override // p188x6.C2200a.e
    /* renamed from: q */
    public final AbstractC2003u mo5338q(Object obj) {
        return this;
    }
}
