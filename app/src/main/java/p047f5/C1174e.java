package p047f5;

import java.util.WeakHashMap;

/* renamed from: f5.e */
/* loaded from: classes.dex */
public final class C1174e {

    /* renamed from: b */
    public static final WeakHashMap f5756b = new WeakHashMap();

    /* renamed from: a */
    public final String f5757a;

    public C1174e(String str) {
        this.f5757a = str;
    }

    /* renamed from: a */
    public static synchronized C1174e m3367a(String str) {
        C1174e c1174e;
        synchronized (C1174e.class) {
            WeakHashMap weakHashMap = f5756b;
            c1174e = (C1174e) weakHashMap.get(str);
            if (c1174e == null) {
                c1174e = new C1174e(str);
                weakHashMap.put(str, c1174e);
            }
        }
        return c1174e;
    }
}
