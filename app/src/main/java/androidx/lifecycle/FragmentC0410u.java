package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0394f;
import p032d6.C0898f;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public final class FragmentC0410u extends Fragment {

    /* renamed from: e */
    public static final /* synthetic */ int f2012e = 0;

    /* renamed from: c */
    public a f2013c;

    /* renamed from: androidx.lifecycle.u$a */
    public interface a {
        /* renamed from: a */
        void mo1406a();

        /* renamed from: b */
        void mo1407b();

        /* renamed from: c */
        void mo1408c();
    }

    /* renamed from: androidx.lifecycle.u$b */
    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static void m1410a(Activity activity, AbstractC0394f.a aVar) {
            C0898f.m2606e(activity, "activity");
            C0898f.m2606e(aVar, "event");
            if (activity instanceof InterfaceC0402m) {
                ((InterfaceC0402m) activity).m1384c().m1379e(aVar);
            } else if (activity instanceof InterfaceC0400k) {
                C0401l mo354m = ((InterfaceC0400k) activity).mo354m();
                if (mo354m instanceof C0401l) {
                    mo354m.m1379e(aVar);
                }
            }
        }

        /* renamed from: b */
        public static void m1411b(Activity activity) {
            C0898f.m2606e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new c());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC0410u(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* renamed from: androidx.lifecycle.u$c */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        /* renamed from: androidx.lifecycle.u$c$a */
        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            C0898f.m2606e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new c());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0898f.m2606e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C0898f.m2606e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C0898f.m2606e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C0898f.m2606e(activity, "activity");
            int i7 = FragmentC0410u.f2012e;
            b.m1410a(activity, AbstractC0394f.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C0898f.m2606e(activity, "activity");
            int i7 = FragmentC0410u.f2012e;
            b.m1410a(activity, AbstractC0394f.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C0898f.m2606e(activity, "activity");
            int i7 = FragmentC0410u.f2012e;
            b.m1410a(activity, AbstractC0394f.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            C0898f.m2606e(activity, "activity");
            int i7 = FragmentC0410u.f2012e;
            b.m1410a(activity, AbstractC0394f.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            C0898f.m2606e(activity, "activity");
            int i7 = FragmentC0410u.f2012e;
            b.m1410a(activity, AbstractC0394f.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            C0898f.m2606e(activity, "activity");
            int i7 = FragmentC0410u.f2012e;
            b.m1410a(activity, AbstractC0394f.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C0898f.m2606e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C0898f.m2606e(activity, "activity");
            C0898f.m2606e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C0898f.m2606e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C0898f.m2606e(activity, "activity");
        }
    }

    /* renamed from: a */
    public final void m1409a(AbstractC0394f.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C0898f.m2605d(activity, "activity");
            b.m1410a(activity, aVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f2013c;
        if (aVar != null) {
            aVar.mo1407b();
        }
        m1409a(AbstractC0394f.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1409a(AbstractC0394f.a.ON_DESTROY);
        this.f2013c = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1409a(AbstractC0394f.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.f2013c;
        if (aVar != null) {
            aVar.mo1406a();
        }
        m1409a(AbstractC0394f.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a aVar = this.f2013c;
        if (aVar != null) {
            aVar.mo1408c();
        }
        m1409a(AbstractC0394f.a.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1409a(AbstractC0394f.a.ON_STOP);
    }
}
