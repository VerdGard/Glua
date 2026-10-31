package p078j4;

import android.ext.C0089a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p054g4.AbstractC1242x;
import p054g4.C1226h;
import p054g4.C1231m;
import p054g4.C1237s;
import p054g4.EnumC1220b;
import p054g4.InterfaceC1221c;
import p054g4.InterfaceC1238t;
import p054g4.InterfaceC1243y;
import p070i4.C1338d;
import p070i4.C1345k;
import p070i4.C1350p;
import p070i4.InterfaceC1349o;
import p094l4.C1509a;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: j4.l */
/* loaded from: classes.dex */
public final class C1423l implements InterfaceC1243y {

    /* renamed from: X */
    public final List<InterfaceC1238t> f6804X;

    /* renamed from: c */
    public final C1338d f6805c;

    /* renamed from: e */
    public final InterfaceC1221c f6806e;

    /* renamed from: m */
    public final C1345k f6807m;

    /* renamed from: s */
    public final C1415d f6808s;

    /* renamed from: j4.l$a */
    public static abstract class a<T, A> extends AbstractC1242x<T> {

        /* renamed from: a */
        public final Map<String, b> f6809a;

        public a(LinkedHashMap linkedHashMap) {
            this.f6809a = linkedHashMap;
        }

        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final T mo3442a(C1667a c1667a) {
            if (c1667a.mo3785x() == 9) {
                c1667a.mo3783t();
                return null;
            }
            A mo3793b = mo3793b();
            try {
                c1667a.mo3772b();
                while (c1667a.mo3777k()) {
                    b bVar = this.f6809a.get(c1667a.mo3782r());
                    if (bVar != null && bVar.f6813d) {
                        mo3795d(mo3793b, c1667a, bVar);
                    }
                    c1667a.mo3765D();
                }
                c1667a.mo3774f();
                return mo3794c(mo3793b);
            } catch (IllegalAccessException e7) {
                C1509a.a aVar = C1509a.f7128a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
            } catch (IllegalStateException e8) {
                throw new C1237s(e8);
            }
        }

        /* renamed from: b */
        public abstract A mo3793b();

        /* renamed from: c */
        public abstract T mo3794c(A a7);

        /* renamed from: d */
        public abstract void mo3795d(A a7, C1667a c1667a, b bVar);
    }

    /* renamed from: j4.l$b */
    public static abstract class b {

        /* renamed from: a */
        public final String f6810a;

        /* renamed from: b */
        public final Field f6811b;

        /* renamed from: c */
        public final String f6812c;

        /* renamed from: d */
        public final boolean f6813d;

        public b(String str, Field field, boolean z6, boolean z7) {
            this.f6810a = str;
            this.f6811b = field;
            this.f6812c = field.getName();
            this.f6813d = z7;
        }

        /* renamed from: a */
        public abstract void mo3788a(C1667a c1667a, int i7, Object[] objArr);

        /* renamed from: b */
        public abstract void mo3789b(C1667a c1667a, Object obj);
    }

    /* renamed from: j4.l$c */
    public static final class c<T> extends a<T, T> {

        /* renamed from: b */
        public final InterfaceC1349o<T> f6814b;

        public c(InterfaceC1349o interfaceC1349o, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f6814b = interfaceC1349o;
        }

        @Override // p078j4.C1423l.a
        /* renamed from: b */
        public final T mo3793b() {
            return this.f6814b.mo107e();
        }

        @Override // p078j4.C1423l.a
        /* renamed from: c */
        public final T mo3794c(T t7) {
            return t7;
        }

        @Override // p078j4.C1423l.a
        /* renamed from: d */
        public final void mo3795d(T t7, C1667a c1667a, b bVar) {
            bVar.mo3789b(c1667a, t7);
        }
    }

    /* renamed from: j4.l$d */
    public static final class d<T> extends a<T, Object[]> {

        /* renamed from: e */
        public static final HashMap f6815e;

        /* renamed from: b */
        public final Constructor<T> f6816b;

        /* renamed from: c */
        public final Object[] f6817c;

        /* renamed from: d */
        public final HashMap f6818d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f6815e = hashMap;
        }

        public d(Class cls, LinkedHashMap linkedHashMap, boolean z6) {
            super(linkedHashMap);
            this.f6818d = new HashMap();
            C1509a.a aVar = C1509a.f7128a;
            Constructor<T> mo3922b = aVar.mo3922b(cls);
            this.f6816b = mo3922b;
            if (z6) {
                C1423l.m3790b(null, mo3922b);
            } else {
                C1509a.m3920e(mo3922b);
            }
            String[] mo3923c = aVar.mo3923c(cls);
            for (int i7 = 0; i7 < mo3923c.length; i7++) {
                this.f6818d.put(mo3923c[i7], Integer.valueOf(i7));
            }
            Class<?>[] parameterTypes = this.f6816b.getParameterTypes();
            this.f6817c = new Object[parameterTypes.length];
            for (int i8 = 0; i8 < parameterTypes.length; i8++) {
                this.f6817c[i8] = f6815e.get(parameterTypes[i8]);
            }
        }

        @Override // p078j4.C1423l.a
        /* renamed from: b */
        public final Object[] mo3793b() {
            return (Object[]) this.f6817c.clone();
        }

        @Override // p078j4.C1423l.a
        /* renamed from: c */
        public final Object mo3794c(Object[] objArr) {
            Object[] objArr2 = objArr;
            Constructor<T> constructor = this.f6816b;
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalAccessException e7) {
                C1509a.a aVar = C1509a.f7128a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
            } catch (IllegalArgumentException e8) {
                e = e8;
                throw new RuntimeException("Failed to invoke constructor '" + C1509a.m3917b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InstantiationException e9) {
                e = e9;
                throw new RuntimeException("Failed to invoke constructor '" + C1509a.m3917b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + C1509a.m3917b(constructor) + "' with args " + Arrays.toString(objArr2), e10.getCause());
            }
        }

        @Override // p078j4.C1423l.a
        /* renamed from: d */
        public final void mo3795d(Object[] objArr, C1667a c1667a, b bVar) {
            Object[] objArr2 = objArr;
            HashMap hashMap = this.f6818d;
            String str = bVar.f6812c;
            Integer num = (Integer) hashMap.get(str);
            if (num != null) {
                bVar.mo3788a(c1667a, num.intValue(), objArr2);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + C1509a.m3917b(this.f6816b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public C1423l(C1338d c1338d, C1345k c1345k, C1415d c1415d, List list) {
        EnumC1220b.a aVar = EnumC1220b.f5966c;
        this.f6805c = c1338d;
        this.f6806e = aVar;
        this.f6807m = c1345k;
        this.f6808s = c1415d;
        this.f6804X = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static void m3790b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!C1350p.a.f6595a.mo3714a(obj, accessibleObject)) {
            throw new C1231m(C0089a.m210h(C1509a.m3919d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // p054g4.InterfaceC1243y
    /* renamed from: a */
    public final <T> AbstractC1242x<T> mo3457a(C1226h c1226h, C1644a<T> c1644a) {
        Class<? super T> cls = c1644a.f7479a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        int m3713a = C1350p.m3713a(this.f6804X, cls);
        if (m3713a != 4) {
            boolean z6 = m3713a == 3;
            return C1509a.f7128a.mo3924d(cls) ? new d(cls, m3791c(c1226h, c1644a, cls, z6, true), z6) : new c(this.f6805c.m3700b(c1644a), m3791c(c1226h, c1644a, cls, z6, false));
        }
        throw new C1231m("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3, types: [j4.l] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r6v7, types: [l4.a$a] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap m3791c(p054g4.C1226h r34, p110n4.C1644a r35, java.lang.Class r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p078j4.C1423l.m3791c(g4.h, n4.a, java.lang.Class, boolean, boolean):java.util.LinkedHashMap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0 == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3792d(java.lang.reflect.Field r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getType()
            i4.k r1 = r9.f6807m
            boolean r2 = r1.m3702b(r0)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L17
            boolean r0 = r1.m3703c(r0, r11)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            if (r0 != 0) goto La3
            int r0 = r10.getModifiers()
            int r2 = r1.f6561e
            r0 = r0 & r2
            if (r0 == 0) goto L25
            goto L9d
        L25:
            double r5 = r1.f6560c
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L44
            java.lang.Class<h4.c> r0 = p062h4.InterfaceC1300c.class
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r0)
            h4.c r0 = (p062h4.InterfaceC1300c) r0
            java.lang.Class<h4.d> r2 = p062h4.InterfaceC1301d.class
            java.lang.annotation.Annotation r2 = r10.getAnnotation(r2)
            h4.d r2 = (p062h4.InterfaceC1301d) r2
            boolean r0 = r1.m3704e(r0, r2)
            if (r0 != 0) goto L44
            goto L9d
        L44:
            boolean r0 = r10.isSynthetic()
            if (r0 == 0) goto L4b
            goto L9d
        L4b:
            boolean r0 = r1.f6562m
            if (r0 != 0) goto L6c
            java.lang.Class r0 = r10.getType()
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L68
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L63
            r0 = 1
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 != 0) goto L68
            r0 = 1
            goto L69
        L68:
            r0 = 0
        L69:
            if (r0 == 0) goto L6c
            goto L9d
        L6c:
            java.lang.Class r0 = r10.getType()
            boolean r0 = p070i4.C1345k.m3701d(r0)
            if (r0 == 0) goto L77
            goto L9d
        L77:
            if (r11 == 0) goto L7c
            java.util.List<g4.a> r11 = r1.f6563s
            goto L7e
        L7c:
            java.util.List<g4.a> r11 = r1.f6559X
        L7e:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L9f
            java.util.Objects.requireNonNull(r10)
            java.util.Iterator r10 = r11.iterator()
        L8b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L9f
            java.lang.Object r11 = r10.next()
            g4.a r11 = (p054g4.InterfaceC1219a) r11
            boolean r11 = r11.m3438b()
            if (r11 == 0) goto L8b
        L9d:
            r10 = 1
            goto La0
        L9f:
            r10 = 0
        La0:
            if (r10 != 0) goto La3
            goto La4
        La3:
            r3 = 0
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p078j4.C1423l.m3792d(java.lang.reflect.Field, boolean):boolean");
    }
}
