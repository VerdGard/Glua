package androidx.lifecycle;

import androidx.lifecycle.AbstractC0394f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public final class C0384a {

    /* renamed from: c */
    public static final C0384a f1952c = new C0384a();

    /* renamed from: a */
    public final HashMap f1953a = new HashMap();

    /* renamed from: b */
    public final HashMap f1954b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a */
    public static class a {

        /* renamed from: a */
        public final HashMap f1955a = new HashMap();

        /* renamed from: b */
        public final Map<b, AbstractC0394f.a> f1956b;

        public a(HashMap hashMap) {
            this.f1956b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                AbstractC0394f.a aVar = (AbstractC0394f.a) entry.getValue();
                List list = (List) this.f1955a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1955a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        /* renamed from: a */
        public static void m1353a(List<b> list, InterfaceC0400k interfaceC0400k, AbstractC0394f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i7 = bVar.f1957a;
                        Method method = bVar.f1958b;
                        if (i7 == 0) {
                            method.invoke(obj, new Object[0]);
                        } else if (i7 == 1) {
                            method.invoke(obj, interfaceC0400k);
                        } else if (i7 == 2) {
                            method.invoke(obj, interfaceC0400k, aVar);
                        }
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException(e7);
                    } catch (InvocationTargetException e8) {
                        throw new RuntimeException("Failed to call observer method", e8.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f1957a;

        /* renamed from: b */
        public final Method f1958b;

        public b(int i7, Method method) {
            this.f1957a = i7;
            this.f1958b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1957a == bVar.f1957a && this.f1958b.getName().equals(bVar.f1958b.getName());
        }

        public final int hashCode() {
            return this.f1958b.getName().hashCode() + (this.f1957a * 31);
        }
    }

    /* renamed from: c */
    public static void m1350c(HashMap hashMap, b bVar, AbstractC0394f.a aVar, Class cls) {
        AbstractC0394f.a aVar2 = (AbstractC0394f.a) hashMap.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                hashMap.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f1958b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* renamed from: a */
    public final a m1351a(Class<?> cls, Method[] methodArr) {
        int i7;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(m1352b(superclass).f1956b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0394f.a> entry : m1352b(cls2).f1956b.entrySet()) {
                m1350c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            InterfaceC0406q interfaceC0406q = (InterfaceC0406q) method.getAnnotation(InterfaceC0406q.class);
            if (interfaceC0406q != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC0400k.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                AbstractC0394f.a value = interfaceC0406q.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC0394f.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0394f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1350c(hashMap, new b(i7, method), value, cls);
                z6 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f1953a.put(cls, aVar);
        this.f1954b.put(cls, Boolean.valueOf(z6));
        return aVar;
    }

    /* renamed from: b */
    public final a m1352b(Class<?> cls) {
        a aVar = (a) this.f1953a.get(cls);
        return aVar != null ? aVar : m1351a(cls, null);
    }
}
