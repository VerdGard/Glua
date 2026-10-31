package p094l4;

import android.ext.C0091c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p054g4.C1231m;

/* renamed from: l4.a */
/* loaded from: classes.dex */
public final class C1509a {

    /* renamed from: a */
    public static final a f7128a;

    /* renamed from: l4.a$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract Method mo3921a(Class<?> cls, Field field);

        /* renamed from: b */
        public abstract <T> Constructor<T> mo3922b(Class<T> cls);

        /* renamed from: c */
        public abstract String[] mo3923c(Class<?> cls);

        /* renamed from: d */
        public abstract boolean mo3924d(Class<?> cls);
    }

    /* renamed from: l4.a$b */
    public static class b extends a {
        @Override // p094l4.C1509a.a
        /* renamed from: a */
        public final Method mo3921a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p094l4.C1509a.a
        /* renamed from: b */
        public final <T> Constructor<T> mo3922b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p094l4.C1509a.a
        /* renamed from: c */
        public final String[] mo3923c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p094l4.C1509a.a
        /* renamed from: d */
        public final boolean mo3924d(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: l4.a$c */
    public static class c extends a {

        /* renamed from: a */
        public final Method f7129a = Class.class.getMethod("isRecord", new Class[0]);

        /* renamed from: b */
        public final Method f7130b;

        /* renamed from: c */
        public final Method f7131c;

        /* renamed from: d */
        public final Method f7132d;

        public c() {
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.f7130b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f7131c = componentType.getMethod("getName", new Class[0]);
            this.f7132d = componentType.getMethod("getType", new Class[0]);
        }

        @Override // p094l4.C1509a.a
        /* renamed from: a */
        public final Method mo3921a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e7) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
            }
        }

        @Override // p094l4.C1509a.a
        /* renamed from: b */
        public final <T> Constructor<T> mo3922b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f7130b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i7 = 0; i7 < objArr.length; i7++) {
                    clsArr[i7] = (Class) this.f7132d.invoke(objArr[i7], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e7) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
            }
        }

        @Override // p094l4.C1509a.a
        /* renamed from: c */
        public final String[] mo3923c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f7130b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i7 = 0; i7 < objArr.length; i7++) {
                    strArr[i7] = (String) this.f7131c.invoke(objArr[i7], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e7) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
            }
        }

        @Override // p094l4.C1509a.a
        /* renamed from: d */
        public final boolean mo3924d(Class<?> cls) {
            try {
                return ((Boolean) this.f7129a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e7) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
            }
        }
    }

    static {
        a bVar;
        try {
            bVar = new c();
        } catch (NoSuchMethodException unused) {
            bVar = new b();
        }
        f7128a = bVar;
    }

    /* renamed from: a */
    public static void m3916a(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i7 = 0; i7 < parameterTypes.length; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i7].getSimpleName());
        }
        sb.append(')');
    }

    /* renamed from: b */
    public static String m3917b(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m3916a(constructor, sb);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m3918c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0078  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3919d(java.lang.reflect.AccessibleObject r4, boolean r5) {
        /*
            boolean r0 = r4 instanceof java.lang.reflect.Field
            java.lang.String r1 = "'"
            if (r0 == 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "field '"
            r0.<init>(r2)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = m3918c(r4)
            goto L5d
        L14:
            boolean r0 = r4 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L4c
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r4.getName()
            r0.<init>(r2)
            m3916a(r4, r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "method '"
            r2.<init>(r3)
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = "#"
            r2.append(r4)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            goto L76
        L4c:
            boolean r0 = r4 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "constructor '"
            r0.<init>(r2)
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.String r4 = m3917b(r4)
        L5d:
            r0.append(r4)
            r0.append(r1)
            goto L72
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<unknown AccessibleObject> "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
        L72:
            java.lang.String r4 = r0.toString()
        L76:
            if (r5 == 0) goto L9f
            r5 = 0
            char r0 = r4.charAt(r5)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto L9f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r5 = r4.charAt(r5)
            char r5 = java.lang.Character.toUpperCase(r5)
            r0.append(r5)
            r5 = 1
            java.lang.String r4 = r4.substring(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L9f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p094l4.C1509a.m3919d(java.lang.reflect.AccessibleObject, boolean):java.lang.String");
    }

    /* renamed from: e */
    public static void m3920e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e7) {
            throw new C1231m(C0091c.m228f("Failed making ", m3919d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e7);
        }
    }
}
