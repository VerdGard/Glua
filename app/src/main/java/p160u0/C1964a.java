package p160u0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.R$string;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p167v0.C2010a;

/* renamed from: u0.a */
/* loaded from: classes.dex */
public final class C1964a {

    /* renamed from: d */
    public static volatile C1964a f8817d;

    /* renamed from: e */
    public static final Object f8818e = new Object();

    /* renamed from: c */
    public final Context f8821c;

    /* renamed from: b */
    public final HashSet f8820b = new HashSet();

    /* renamed from: a */
    public final HashMap f8819a = new HashMap();

    public C1964a(Context context) {
        this.f8821c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C1964a m4578c(Context context) {
        if (f8817d == null) {
            synchronized (f8818e) {
                if (f8817d == null) {
                    f8817d = new C1964a(context);
                }
            }
        }
        return f8817d;
    }

    /* renamed from: a */
    public final void m4579a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f8821c.getString(R$string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f8820b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1965b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m4580b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new C1966c(e7);
            }
        }
    }

    /* renamed from: b */
    public final Object m4580b(Class cls, HashSet hashSet) {
        Object obj;
        if (C2010a.m4908a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        HashMap hashMap = this.f8819a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1965b interfaceC1965b = (InterfaceC1965b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends InterfaceC1965b<?>>> mo1070a = interfaceC1965b.mo1070a();
                if (!mo1070a.isEmpty()) {
                    for (Class<? extends InterfaceC1965b<?>> cls2 : mo1070a) {
                        if (!hashMap.containsKey(cls2)) {
                            m4580b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC1965b.mo1071b(this.f8821c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new C1966c(th);
            }
        }
        return obj;
    }
}
