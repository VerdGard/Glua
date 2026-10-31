package androidx.fragment.app;

import android.ext.C0091c;
import androidx.fragment.app.ComponentCallbacksC0361n;
import p089l.C1481o;

/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
public class C0373t {

    /* renamed from: a */
    public static final C1481o<ClassLoader, C1481o<String, Class<?>>> f1867a = new C1481o<>();

    /* renamed from: b */
    public static Class<?> m1268b(ClassLoader classLoader, String str) {
        C1481o<ClassLoader, C1481o<String, Class<?>>> c1481o = f1867a;
        C1481o<String, Class<?>> c1481o2 = c1481o.get(classLoader);
        if (c1481o2 == null) {
            c1481o2 = new C1481o<>();
            c1481o.put(classLoader, c1481o2);
        }
        Class<?> cls = c1481o2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1481o2.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class<? extends ComponentCallbacksC0361n> m1269c(ClassLoader classLoader, String str) {
        try {
            return m1268b(classLoader, str);
        } catch (ClassCastException e7) {
            throw new ComponentCallbacksC0361n.c(C0091c.m228f("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e8) {
            throw new ComponentCallbacksC0361n.c(C0091c.m228f("Unable to instantiate fragment ", str, ": make sure class name exists"), e8);
        }
    }

    /* renamed from: a */
    public ComponentCallbacksC0361n mo1270a(String str) {
        throw null;
    }
}
