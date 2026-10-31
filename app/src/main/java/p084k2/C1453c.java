package p084k2;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p052g2.C1208a;
import p052g2.C1210c;

/* renamed from: k2.c */
/* loaded from: classes.dex */
public final class C1453c implements InterfaceC1451a {

    /* renamed from: d */
    public static C1453c f6966d;

    /* renamed from: a */
    public final File f6967a;

    /* renamed from: b */
    public final int f6968b;

    /* renamed from: c */
    public C1208a f6969c;

    public C1453c(File file, int i7) {
        new HashMap();
        new ArrayDeque();
        this.f6967a = file;
        this.f6968b = i7;
        new LinkedHashMap(100, 0.75f, true);
    }

    /* renamed from: a */
    public final synchronized C1208a m3836a() {
        if (this.f6969c == null) {
            this.f6969c = C1208a.m3412c(this.f6967a, this.f6968b);
        }
        return this.f6969c;
    }

    /* renamed from: b */
    public final synchronized void m3837b() {
        this.f6969c = null;
    }

    @Override // p084k2.InterfaceC1451a
    public final synchronized void clear() {
        try {
            C1208a m3836a = m3836a();
            m3836a.close();
            C1210c.m3423a(m3836a.f5927c);
            m3837b();
        } catch (IOException e7) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to clear disk cache", e7);
            }
        }
    }
}
