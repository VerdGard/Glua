package androidx.activity;

import android.window.BackEvent;
import p032d6.C0898f;

/* renamed from: androidx.activity.a */
/* loaded from: classes.dex */
public final class C0116a {

    /* renamed from: a */
    public static final C0116a f218a = new C0116a();

    /* renamed from: a */
    public final BackEvent m368a(float f7, float f8, float f9, int i7) {
        return new BackEvent(f7, f8, f9, i7);
    }

    /* renamed from: b */
    public final float m369b(BackEvent backEvent) {
        C0898f.m2606e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m370c(BackEvent backEvent) {
        C0898f.m2606e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m371d(BackEvent backEvent) {
        C0898f.m2606e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m372e(BackEvent backEvent) {
        C0898f.m2606e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
