package p203z5;

import p007a6.C0058a;
import p015b6.C0541a;
import p032d6.C0898f;

/* renamed from: z5.b */
/* loaded from: classes.dex */
public final class C2289b {

    /* renamed from: a */
    public static final C2288a f10454a;

    static {
        C2288a c2288a;
        try {
            Object newInstance = C0541a.class.newInstance();
            C0898f.m2605d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c2288a = (C2288a) newInstance;
                } catch (ClassCastException e7) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C2288a.class.getClassLoader();
                    if (C0898f.m2602a(classLoader, classLoader2)) {
                        throw e7;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e7);
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = C0058a.class.newInstance();
                C0898f.m2605d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        c2288a = (C2288a) newInstance2;
                    } catch (ClassNotFoundException unused2) {
                        c2288a = new C2288a();
                    }
                } catch (ClassCastException e8) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = C2288a.class.getClassLoader();
                    if (C0898f.m2602a(classLoader3, classLoader4)) {
                        throw e8;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e8);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            C0898f.m2605d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c2288a = (C2288a) newInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C0898f.m2605d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        c2288a = (C2288a) newInstance4;
                    } catch (ClassCastException e9) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C2288a.class.getClassLoader();
                        if (C0898f.m2602a(classLoader5, classLoader6)) {
                            throw e9;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e9);
                    }
                }
            } catch (ClassCastException e10) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = C2288a.class.getClassLoader();
                if (C0898f.m2602a(classLoader7, classLoader8)) {
                    throw e10;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e10);
            }
        }
        f10454a = c2288a;
    }
}
