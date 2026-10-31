package p159u;

import android.app.Application;
import p159u.C1958e;

/* renamed from: u.c */
/* loaded from: classes.dex */
public final class RunnableC1956c implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Application f8798c;

    /* renamed from: e */
    public final /* synthetic */ C1958e.a f8799e;

    public RunnableC1956c(Application application, C1958e.a aVar) {
        this.f8798c = application;
        this.f8799e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8798c.unregisterActivityLifecycleCallbacks(this.f8799e);
    }
}
