package androidx.activity;

import android.window.BackEvent;
import p032d6.C0898f;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public final class C0117b {

    /* renamed from: a */
    public final float f219a;

    /* renamed from: b */
    public final float f220b;

    /* renamed from: c */
    public final float f221c;

    /* renamed from: d */
    public final int f222d;

    public C0117b(BackEvent backEvent) {
        C0898f.m2606e(backEvent, "backEvent");
        C0116a c0116a = C0116a.f218a;
        float m371d = c0116a.m371d(backEvent);
        float m372e = c0116a.m372e(backEvent);
        float m369b = c0116a.m369b(backEvent);
        int m370c = c0116a.m370c(backEvent);
        this.f219a = m371d;
        this.f220b = m372e;
        this.f221c = m369b;
        this.f222d = m370c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f219a + ", touchY=" + this.f220b + ", progress=" + this.f221c + ", swipeEdge=" + this.f222d + '}';
    }
}
