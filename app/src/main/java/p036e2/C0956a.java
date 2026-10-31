package p036e2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import p036e2.C0963b;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public final class C0956a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C0963b f4923a;

    public C0956a(C0963b c0963b) {
        this.f4923a = c0963b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (this.f4923a.f4944b) {
            Iterator it = this.f4923a.f4944b.iterator();
            while (it.hasNext()) {
                ((C0963b.a) it.next()).mo2958b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f4923a.f4944b) {
            Iterator it = this.f4923a.f4944b.iterator();
            while (it.hasNext()) {
                ((C0963b.a) it.next()).mo2960d();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.f4923a.f4944b) {
            Iterator it = this.f4923a.f4944b.iterator();
            while (it.hasNext()) {
                ((C0963b.a) it.next()).onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        synchronized (this.f4923a.f4944b) {
            Iterator it = this.f4923a.f4944b.iterator();
            while (it.hasNext()) {
                ((C0963b.a) it.next()).onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        synchronized (this.f4923a.f4944b) {
            Iterator it = this.f4923a.f4944b.iterator();
            while (it.hasNext()) {
                ((C0963b.a) it.next()).mo2957a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        synchronized (this.f4923a.f4944b) {
            Iterator it = this.f4923a.f4944b.iterator();
            while (it.hasNext()) {
                ((C0963b.a) it.next()).mo2961e();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        synchronized (this.f4923a.f4944b) {
            Iterator it = this.f4923a.f4944b.iterator();
            while (it.hasNext()) {
                ((C0963b.a) it.next()).mo2959c();
            }
        }
    }
}
