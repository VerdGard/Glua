package p065i;

import androidx.activity.result.AbstractC0136c;

/* renamed from: i.a */
/* loaded from: classes.dex */
public final class C1305a extends AbstractC0136c {

    /* renamed from: m */
    public static volatile C1305a f6472m;

    /* renamed from: e */
    public final C1306b f6473e = new C1306b();

    /* renamed from: y */
    public static C1305a m3618y() {
        if (f6472m != null) {
            return f6472m;
        }
        synchronized (C1305a.class) {
            if (f6472m == null) {
                f6472m = new C1305a();
            }
        }
        return f6472m;
    }

    /* renamed from: z */
    public final boolean m3619z() {
        return this.f6473e.m3620y();
    }
}
