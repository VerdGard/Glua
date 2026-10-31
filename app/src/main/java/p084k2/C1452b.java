package p084k2;

import java.io.File;
import p084k2.InterfaceC1451a;

/* renamed from: k2.b */
/* loaded from: classes.dex */
public class C1452b implements InterfaceC1451a.a {

    /* renamed from: a */
    public final int f6964a = 262144000;

    /* renamed from: b */
    public final a f6965b;

    /* renamed from: k2.b$a */
    public interface a {
    }

    public C1452b(C1454d c1454d) {
        this.f6965b = c1454d;
    }

    /* renamed from: a */
    public final C1453c m3835a() {
        C1453c c1453c;
        C1454d c1454d = (C1454d) this.f6965b;
        File cacheDir = c1454d.f6970a.getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else {
            String str = c1454d.f6971b;
            if (str != null) {
                cacheDir = new File(cacheDir, str);
            }
        }
        if (cacheDir == null) {
            return null;
        }
        if (!cacheDir.mkdirs() && (!cacheDir.exists() || !cacheDir.isDirectory())) {
            return null;
        }
        int i7 = this.f6964a;
        synchronized (C1453c.class) {
            if (C1453c.f6966d == null) {
                C1453c.f6966d = new C1453c(cacheDir, i7);
            }
            c1453c = C1453c.f6966d;
        }
        return c1453c;
    }
}
