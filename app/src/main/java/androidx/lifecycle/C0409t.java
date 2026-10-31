package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.C0408s;
import p032d6.C0898f;

/* renamed from: androidx.lifecycle.t */
/* loaded from: classes.dex */
public final class C0409t extends C0388c {
    final /* synthetic */ C0408s this$0;

    /* renamed from: androidx.lifecycle.t$a */
    public static final class a extends C0388c {
        final /* synthetic */ C0408s this$0;

        public a(C0408s c0408s) {
            this.this$0 = c0408s;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C0898f.m2606e(activity, "activity");
            this.this$0.m1404d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C0898f.m2606e(activity, "activity");
            C0408s c0408s = this.this$0;
            int i7 = c0408s.f2006c + 1;
            c0408s.f2006c = i7;
            if (i7 == 1 && c0408s.f2009s) {
                c0408s.f2004Y.m1379e(AbstractC0394f.a.ON_START);
                c0408s.f2009s = false;
            }
        }
    }

    public C0409t(C0408s c0408s) {
        this.this$0 = c0408s;
    }

    @Override // androidx.lifecycle.C0388c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C0898f.m2606e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i7 = FragmentC0410u.f2012e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C0898f.m2604c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC0410u) findFragmentByTag).f2013c = this.this$0.f2010w1;
        }
    }

    @Override // androidx.lifecycle.C0388c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C0898f.m2606e(activity, "activity");
        C0408s c0408s = this.this$0;
        int i7 = c0408s.f2007e - 1;
        c0408s.f2007e = i7;
        if (i7 == 0) {
            Handler handler = c0408s.f2003X;
            C0898f.m2603b(handler);
            handler.postDelayed(c0408s.f2005Z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C0898f.m2606e(activity, "activity");
        C0408s.a.m1405a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.C0388c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0898f.m2606e(activity, "activity");
        C0408s c0408s = this.this$0;
        int i7 = c0408s.f2006c - 1;
        c0408s.f2006c = i7;
        if (i7 == 0 && c0408s.f2008m) {
            c0408s.f2004Y.m1379e(AbstractC0394f.a.ON_STOP);
            c0408s.f2009s = true;
        }
    }
}
