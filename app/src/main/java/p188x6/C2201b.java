package p188x6;

import android.ext.C0090b;
import android.ext.Tools;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p165u6.AbstractC1984c0;
import p165u6.AbstractC1992j;
import p165u6.AbstractC2003u;
import p165u6.C1998p;
import p165u6.C1999q;

/* renamed from: x6.b */
/* loaded from: classes.dex */
public final class C2201b {

    /* renamed from: a */
    public static final Map f9977a;

    /* renamed from: x6.b$a */
    public static final class a implements c {

        /* renamed from: a */
        public final Class f9978a;

        /* renamed from: b */
        public final c f9979b;

        public a(Class cls) {
            this.f9978a = cls;
            this.f9979b = C2201b.m5340b(cls);
        }

        @Override // p188x6.C2201b.c
        /* renamed from: a */
        public final Object mo5342a(AbstractC2003u abstractC2003u) {
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 != 5) {
                if (mo4675t2 != 7) {
                    return null;
                }
                return abstractC2003u.mo4851s2();
            }
            int mo4794k1 = abstractC2003u.mo4794k1();
            Object newInstance = Array.newInstance((Class<?>) this.f9978a, mo4794k1);
            int i7 = 0;
            while (i7 < mo4794k1) {
                int i8 = i7 + 1;
                Array.set(newInstance, i7, this.f9979b.mo5342a(abstractC2003u.mo4776J0(i8)));
                i7 = i8;
            }
            return newInstance;
        }

        @Override // p188x6.C2201b.c
        /* renamed from: b */
        public final int mo5343b(AbstractC2003u abstractC2003u) {
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 0) {
                Map map = C2201b.f9977a;
                return 16;
            }
            if (mo4675t2 != 5) {
                if (mo4675t2 == 7) {
                    return C2201b.m5341c(this.f9978a, abstractC2003u.mo4851s2().getClass().getComponentType());
                }
                Map map2 = C2201b.f9977a;
                return 65536;
            }
            if (abstractC2003u.mo4794k1() == 0) {
                return 0;
            }
            int mo4794k1 = abstractC2003u.mo4794k1();
            int i7 = mo4794k1 > 10 ? mo4794k1 / 10 : 1;
            int i8 = 0;
            for (int i9 = 0; i9 < mo4794k1; i9 += i7) {
                int mo5343b = this.f9979b.mo5343b(abstractC2003u.mo4776J0(i9));
                if (mo5343b > i8) {
                    i8 = mo5343b;
                }
                Map map3 = C2201b.f9977a;
                if (mo5343b == 256) {
                    break;
                }
            }
            return i8;
        }

        public final String toString() {
            return "ArrayCoercion(" + this.f9978a.getName() + ")";
        }
    }

    /* renamed from: x6.b$b */
    public static final class b implements c {
        @Override // p188x6.C2201b.c
        /* renamed from: a */
        public final Object mo5342a(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4682m2() ? Boolean.TRUE : Boolean.FALSE;
        }

        @Override // p188x6.C2201b.c
        /* renamed from: b */
        public final int mo5343b(AbstractC2003u abstractC2003u) {
            return abstractC2003u.mo4675t2() != 1 ? 32 : 0;
        }

        public final String toString() {
            return "BoolCoercion()";
        }
    }

    /* renamed from: x6.b$c */
    public interface c {
        /* renamed from: a */
        Object mo5342a(AbstractC2003u abstractC2003u);

        /* renamed from: b */
        int mo5343b(AbstractC2003u abstractC2003u);
    }

    /* renamed from: x6.b$d */
    public static final class d implements c {

        /* renamed from: a */
        public final Class f9980a;

        /* renamed from: b */
        public final g f9981b = new g(Object.class);

        public d(Class cls) {
            this.f9980a = cls;
        }

        @Override // p188x6.C2201b.c
        /* renamed from: a */
        public final Object mo5342a(AbstractC2003u abstractC2003u) {
            Class cls = this.f9980a;
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 5) {
                try {
                    List arrayList = cls.equals(Map.class) ? new ArrayList() : (List) cls.newInstance();
                    int mo4794k1 = abstractC2003u.mo4794k1();
                    int i7 = 0;
                    while (i7 < mo4794k1) {
                        i7++;
                        arrayList.add(this.f9981b.mo5342a(abstractC2003u.mo4776J0(i7)));
                    }
                    return arrayList;
                } catch (IllegalAccessException | InstantiationException e7) {
                    e7.printStackTrace();
                }
            } else if (mo4675t2 != 7) {
                return null;
            }
            return abstractC2003u.mo4851s2();
        }

        @Override // p188x6.C2201b.c
        /* renamed from: b */
        public final int mo5343b(AbstractC2003u abstractC2003u) {
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 0) {
                Map map = C2201b.f9977a;
                return 16;
            }
            if (mo4675t2 == 5) {
                return 0;
            }
            if (mo4675t2 != 7) {
                Map map2 = C2201b.f9977a;
                return 65536;
            }
            return C2201b.m5341c(this.f9980a, abstractC2003u.mo4851s2().getClass());
        }

        public final String toString() {
            return "ListCoercion(" + this.f9980a.getName() + ")";
        }
    }

    /* renamed from: x6.b$e */
    public static final class e implements c {

        /* renamed from: a */
        public final Class f9982a;

        /* renamed from: b */
        public final g f9983b = new g(Object.class);

        public e(Class cls) {
            this.f9982a = cls;
        }

        @Override // p188x6.C2201b.c
        /* renamed from: a */
        public final Object mo5342a(AbstractC2003u abstractC2003u) {
            Class cls = this.f9982a;
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 5) {
                try {
                    Map hashMap = cls.equals(Map.class) ? new HashMap() : (Map) cls.newInstance();
                    AbstractC1984c0 mo4796x1 = abstractC2003u.mo4796x1(AbstractC2003u.f9130m);
                    while (mo4796x1 != AbstractC2003u.f9130m) {
                        AbstractC2003u mo4624u = mo4796x1.mo4624u();
                        g gVar = this.f9983b;
                        hashMap.put(gVar.mo5342a(mo4624u), gVar.mo5342a(mo4796x1.mo4623t(2)));
                        mo4796x1 = abstractC2003u.mo4796x1(mo4624u);
                    }
                    return hashMap;
                } catch (IllegalAccessException | InstantiationException e7) {
                    e7.printStackTrace();
                }
            } else if (mo4675t2 != 7) {
                return null;
            }
            return abstractC2003u.mo4851s2();
        }

        @Override // p188x6.C2201b.c
        /* renamed from: b */
        public final int mo5343b(AbstractC2003u abstractC2003u) {
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 0) {
                Map map = C2201b.f9977a;
                return 16;
            }
            if (mo4675t2 == 5) {
                return 0;
            }
            if (mo4675t2 != 7) {
                Map map2 = C2201b.f9977a;
                return 65536;
            }
            return C2201b.m5341c(this.f9982a, abstractC2003u.mo4851s2().getClass());
        }

        public final String toString() {
            return "MapCoercion(" + this.f9982a.getName() + ")";
        }
    }

    /* renamed from: x6.b$f */
    public static final class f implements c {

        /* renamed from: b */
        public static final String[] f9984b = {"byte", "char", "short", "int", "long", "float", "double"};

        /* renamed from: a */
        public final int f9985a;

        public f(int i7) {
            this.f9985a = i7;
        }

        @Override // p188x6.C2201b.c
        /* renamed from: a */
        public final Object mo5342a(AbstractC2003u abstractC2003u) {
            switch (this.f9985a) {
                case 0:
                    return new Byte((byte) abstractC2003u.mo4747o2());
                case 1:
                    return new Character((char) abstractC2003u.mo4747o2());
                case 2:
                    return new Short((short) abstractC2003u.mo4747o2());
                case 3:
                    return new Integer(abstractC2003u.mo4747o2());
                case 4:
                    return new Long(abstractC2003u.mo4748p2());
                case 5:
                    return new Float((float) abstractC2003u.mo4744n2());
                case 6:
                    return new Double(abstractC2003u.mo4744n2());
                default:
                    return null;
            }
        }

        @Override // p188x6.C2201b.c
        /* renamed from: b */
        public final int mo5343b(AbstractC2003u abstractC2003u) {
            int i7 = 4;
            if (abstractC2003u.mo4675t2() == 4) {
                abstractC2003u = abstractC2003u.mo4750q2();
                if (abstractC2003u.mo4804d1()) {
                    Map map = C2201b.f9977a;
                    return 65536;
                }
            } else {
                i7 = 0;
            }
            boolean mo4724Z0 = abstractC2003u.mo4724Z0();
            int i8 = this.f9985a;
            if (!mo4724Z0) {
                if (!abstractC2003u.mo4808e1()) {
                    Map map2 = C2201b.f9977a;
                    return 65536;
                }
                switch (i8) {
                    case 0:
                        Map map3 = C2201b.f9977a;
                        return Tools.Semaphore.f160S8;
                    case 1:
                        Map map4 = C2201b.f9977a;
                        return Tools.Semaphore.f160S8;
                    case 2:
                        Map map5 = C2201b.f9977a;
                        return Tools.Semaphore.f160S8;
                    case 3:
                        Map map6 = C2201b.f9977a;
                        return Tools.Semaphore.f160S8;
                    case 4:
                        if (abstractC2003u.mo4744n2() != ((long) r0)) {
                            Map map7 = C2201b.f9977a;
                            r2 = Tools.Semaphore.f160S8;
                        }
                        return i7 + r2;
                    case 5:
                        if (abstractC2003u.mo4744n2() != ((float) r0)) {
                            Map map8 = C2201b.f9977a;
                            r2 = Tools.Semaphore.f160S8;
                        }
                        return i7 + r2;
                    case 6:
                        double mo4744n2 = abstractC2003u.mo4744n2();
                        return i7 + ((mo4744n2 == ((double) ((long) mo4744n2)) || mo4744n2 == ((double) ((float) mo4744n2))) ? 1 : 0);
                    default:
                        Map map9 = C2201b.f9977a;
                        return Tools.Semaphore.f160S8;
                }
            }
            switch (i8) {
                case 0:
                    int mo4747o2 = abstractC2003u.mo4747o2();
                    if (mo4747o2 != ((byte) mo4747o2)) {
                        Map map10 = C2201b.f9977a;
                        r2 = Tools.Semaphore.f160S8;
                    }
                    return i7 + r2;
                case 1:
                    int mo4747o22 = abstractC2003u.mo4747o2();
                    if (mo4747o22 == ((byte) mo4747o22)) {
                        r2 = 1;
                    } else if (mo4747o22 != ((char) mo4747o22)) {
                        Map map11 = C2201b.f9977a;
                        r2 = Tools.Semaphore.f160S8;
                    }
                    return i7 + r2;
                case 2:
                    int mo4747o23 = abstractC2003u.mo4747o2();
                    if (mo4747o23 == ((byte) mo4747o23)) {
                        r2 = 1;
                    } else if (mo4747o23 != ((short) mo4747o23)) {
                        Map map12 = C2201b.f9977a;
                        r2 = Tools.Semaphore.f160S8;
                    }
                    return i7 + r2;
                case 3:
                    long mo4748p2 = abstractC2003u.mo4748p2();
                    int i9 = (int) mo4748p2;
                    if (mo4748p2 == ((byte) i9)) {
                        r2 = 2;
                    } else if (mo4748p2 == ((char) i9) || mo4748p2 == ((short) i9)) {
                        r2 = 1;
                    } else if (mo4748p2 != i9) {
                        Map map13 = C2201b.f9977a;
                        r2 = Tools.Semaphore.f160S8;
                    }
                    return i7 + r2;
                case 4:
                    long mo4748p22 = abstractC2003u.mo4748p2();
                    int i10 = (int) mo4748p22;
                    if (mo4748p22 == ((byte) i10)) {
                        r2 = 3;
                    } else if (mo4748p22 == ((char) i10) || mo4748p22 == ((short) i10)) {
                        r2 = 2;
                    } else if (mo4748p22 == i10) {
                        r2 = 1;
                    }
                    return i7 + r2;
                case 5:
                    return i7 + 1;
                case 6:
                    return i7 + 2;
                default:
                    Map map14 = C2201b.f9977a;
                    return Tools.Semaphore.f160S8;
            }
        }

        public final String toString() {
            return C0090b.m220f(new StringBuilder("NumericCoercion("), f9984b[this.f9985a], ")");
        }
    }

    /* renamed from: x6.b$g */
    public static final class g implements c {

        /* renamed from: a */
        public final Class f9986a;

        public g(Class cls) {
            this.f9986a = cls;
        }

        @Override // p188x6.C2201b.c
        /* renamed from: a */
        public final Object mo5342a(AbstractC2003u abstractC2003u) {
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 0) {
                return null;
            }
            if (mo4675t2 == 1) {
                return abstractC2003u.mo4682m2() ? Boolean.TRUE : Boolean.FALSE;
            }
            if (mo4675t2 == 3) {
                return abstractC2003u.mo4724Z0() ? new Integer(abstractC2003u.mo4747o2()) : new Double(abstractC2003u.mo4744n2());
            }
            if (mo4675t2 == 4) {
                return abstractC2003u.mo4645M();
            }
            Class cls = this.f9986a;
            return (mo4675t2 == 5 || mo4675t2 == 6) ? cls.isInterface() ? C2212m.m5352J2(cls, abstractC2003u).f9091c2 : abstractC2003u : mo4675t2 != 7 ? abstractC2003u : abstractC2003u.mo4802G1(cls);
        }

        @Override // p188x6.C2201b.c
        /* renamed from: b */
        public final int mo5343b(AbstractC2003u abstractC2003u) {
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 0) {
                Map map = C2201b.f9977a;
                return 16;
            }
            Class cls = this.f9986a;
            if (mo4675t2 == 1) {
                return C2201b.m5341c(cls, Boolean.class);
            }
            if (mo4675t2 == 3) {
                return C2201b.m5341c(cls, abstractC2003u.mo4724Z0() ? Integer.class : Double.class);
            }
            if (mo4675t2 == 4) {
                return C2201b.m5341c(cls, String.class);
            }
            if (mo4675t2 == 5) {
                if (cls.isInterface()) {
                    return 10;
                }
                return C2201b.m5341c(cls, C1999q.class);
            }
            if (mo4675t2 != 6) {
                return mo4675t2 != 7 ? C2201b.m5341c(cls, abstractC2003u.getClass()) : C2201b.m5341c(cls, abstractC2003u.mo4851s2().getClass());
            }
            if (cls.isInterface()) {
                return 10;
            }
            return C2201b.m5341c(cls, AbstractC1992j.class);
        }

        public final String toString() {
            return "ObjectCoercion(" + this.f9986a.getName() + ")";
        }
    }

    /* renamed from: x6.b$h */
    public static final class h implements c {

        /* renamed from: a */
        public final int f9987a;

        public h(int i7) {
            this.f9987a = i7;
        }

        @Override // p188x6.C2201b.c
        /* renamed from: a */
        public final Object mo5342a(AbstractC2003u abstractC2003u) {
            if (abstractC2003u.mo4804d1()) {
                return null;
            }
            if (this.f9987a == 0) {
                return abstractC2003u.mo4645M();
            }
            C1998p mo4753s0 = abstractC2003u.mo4753s0();
            int i7 = mo4753s0.f9041e2;
            byte[] bArr = new byte[i7];
            System.arraycopy(mo4753s0.f9039c2, mo4753s0.f9040d2 + 0, bArr, 0, i7);
            return bArr;
        }

        @Override // p188x6.C2201b.c
        /* renamed from: b */
        public final int mo5343b(AbstractC2003u abstractC2003u) {
            int mo4675t2 = abstractC2003u.mo4675t2();
            if (mo4675t2 == 0) {
                Map map = C2201b.f9977a;
                return 16;
            }
            int i7 = this.f9987a;
            if (mo4675t2 != 4) {
                Map map2 = C2201b.f9977a;
                if (i7 == 0) {
                    return Tools.Semaphore.f160S8;
                }
                return 65536;
            }
            if (abstractC2003u.mo4753s0().m4819G2()) {
                if (i7 != 0) {
                    return 1;
                }
            } else if (i7 != 1) {
                Map map3 = C2201b.f9977a;
                return Tools.Semaphore.f160S8;
            }
            return 0;
        }

        public final String toString() {
            return C0090b.m220f(new StringBuilder("StringCoercion("), this.f9987a == 0 ? "String" : "byte[]", ")");
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        f9977a = synchronizedMap;
        b bVar = new b();
        f fVar = new f(0);
        f fVar2 = new f(1);
        f fVar3 = new f(2);
        f fVar4 = new f(3);
        f fVar5 = new f(4);
        f fVar6 = new f(5);
        f fVar7 = new f(6);
        h hVar = new h(0);
        h hVar2 = new h(1);
        synchronizedMap.put(Boolean.TYPE, bVar);
        synchronizedMap.put(Boolean.class, bVar);
        synchronizedMap.put(Byte.TYPE, fVar);
        synchronizedMap.put(Byte.class, fVar);
        synchronizedMap.put(Character.TYPE, fVar2);
        synchronizedMap.put(Character.class, fVar2);
        synchronizedMap.put(Short.TYPE, fVar3);
        synchronizedMap.put(Short.class, fVar3);
        synchronizedMap.put(Integer.TYPE, fVar4);
        synchronizedMap.put(Integer.class, fVar4);
        synchronizedMap.put(Long.TYPE, fVar5);
        synchronizedMap.put(Long.class, fVar5);
        synchronizedMap.put(Float.TYPE, fVar6);
        synchronizedMap.put(Float.class, fVar6);
        synchronizedMap.put(Double.TYPE, fVar7);
        synchronizedMap.put(Double.class, fVar7);
        synchronizedMap.put(String.class, hVar);
        synchronizedMap.put(byte[].class, hVar2);
    }

    /* renamed from: a */
    public static Object m5339a(Class cls, AbstractC2003u abstractC2003u) {
        return m5340b(cls).mo5342a(abstractC2003u);
    }

    /* renamed from: b */
    public static c m5340b(Class cls) {
        Map map = f9977a;
        c cVar = (c) map.get(cls);
        if (cVar != null) {
            return cVar;
        }
        c aVar = cls.isArray() ? new a(cls.getComponentType()) : Map.class.isAssignableFrom(cls) ? new e(cls) : List.class.isAssignableFrom(cls) ? new d(cls) : new g(cls);
        map.put(cls, aVar);
        return aVar;
    }

    /* renamed from: c */
    public static final int m5341c(Class cls, Class cls2) {
        if (cls2 == null) {
            return 65536;
        }
        if (cls == cls2) {
            return 0;
        }
        int min = Math.min(65536, m5341c(cls, cls2.getSuperclass()) + 1);
        for (Class<?> cls3 : cls2.getInterfaces()) {
            min = Math.min(min, m5341c(cls, cls3) + 1);
        }
        return min;
    }
}
