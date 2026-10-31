package p036e2;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: e2.i2 */
/* loaded from: classes.dex */
public final class RunnableC1015i2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ WeakReference f5126c;

    /* renamed from: e */
    public final /* synthetic */ long f5127e;

    /* renamed from: m */
    public final /* synthetic */ C1085s2 f5128m;

    public RunnableC1015i2(C1085s2 c1085s2, WeakReference weakReference, long j7) {
        this.f5128m = c1085s2;
        this.f5126c = weakReference;
        this.f5127e = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = (Activity) this.f5126c.get();
        if (activity == null) {
            return;
        }
        this.f5128m.m3183f(activity, this.f5127e);
    }
}
