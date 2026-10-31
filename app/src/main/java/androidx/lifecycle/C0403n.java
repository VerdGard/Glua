package androidx.lifecycle;

import android.ext.C0090b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p032d6.C0898f;
import p072i6.C1394e;

/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public final class C0403n {

    /* renamed from: a */
    public static final HashMap f2000a = new HashMap();

    /* renamed from: b */
    public static final HashMap f2001b = new HashMap();

    /* renamed from: a */
    public static InterfaceC0390d m1385a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            C0898f.m2605d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (InterfaceC0390d) newInstance;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* renamed from: b */
    public static final String m1386b(String str) {
        StringBuilder sb = new StringBuilder();
        int m3740W = C1394e.m3740W(str, 0, false);
        if (m3740W >= 0) {
            int length = (str.length() - 1) + 1;
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            int i7 = 0;
            do {
                sb2.append((CharSequence) str, i7, m3740W);
                sb2.append("_");
                i7 = m3740W + 1;
                if (m3740W >= str.length()) {
                    break;
                }
                m3740W = C1394e.m3740W(str, i7, false);
            } while (m3740W > 0);
            sb2.append((CharSequence) str, i7, str.length());
            str = sb2.toString();
            C0898f.m2605d(str, "stringBuilder.append(this, i, length).toString()");
        }
        return C0090b.m220f(sb, str, "_LifecycleAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static int m1387c(Class cls) {
        Constructor constructor;
        boolean z6;
        List list;
        HashMap hashMap = f2000a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i7 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r42 != null ? r42.getName() : "";
                C0898f.m2605d(name, "fullPackage");
                if (!(name.length() == 0)) {
                    C0898f.m2605d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    C0898f.m2605d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                C0898f.m2605d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String m1386b = m1386b(canonicalName);
                if (!(name.length() == 0)) {
                    m1386b = name + '.' + m1386b;
                }
                constructor = Class.forName(m1386b).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e7) {
                throw new RuntimeException(e7);
            }
            HashMap hashMap2 = f2001b;
            if (constructor != null) {
                list = Collections.singletonList(constructor);
                C0898f.m2605d(list, "singletonList(element)");
            } else {
                C0384a c0384a = C0384a.f1952c;
                HashMap hashMap3 = c0384a.f1954b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z6 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z6 = false;
                                break;
                            }
                            if (((InterfaceC0406q) declaredMethods[i8].getAnnotation(InterfaceC0406q.class)) != null) {
                                c0384a.m1351a(cls, declaredMethods);
                                z6 = true;
                                break;
                            }
                            i8++;
                        }
                    } catch (NoClassDefFoundError e8) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
                    }
                }
                if (!z6) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0399j.class.isAssignableFrom(superclass)) {
                        C0898f.m2605d(superclass, "superclass");
                        if (m1387c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            C0898f.m2603b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    C0898f.m2605d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            Class<?> cls2 = interfaces[i9];
                            if (cls2 != null && InterfaceC0399j.class.isAssignableFrom(cls2)) {
                                C0898f.m2605d(cls2, "intrface");
                                if (m1387c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                C0898f.m2603b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i9++;
                        } else if (arrayList != null) {
                            list = arrayList;
                        }
                    }
                }
            }
            hashMap2.put(cls, list);
            i7 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i7));
        return i7;
    }
}
