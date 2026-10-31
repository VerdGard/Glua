package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.activity.RunnableC0125j;
import androidx.lifecycle.AbstractC0394f;
import androidx.lifecycle.FragmentC0410u;
import p032d6.C0898f;

/* renamed from: androidx.lifecycle.s */
/* loaded from: classes.dex */
public final class C0408s implements InterfaceC0400k {

    /* renamed from: x1 */
    public static final C0408s f2002x1 = new C0408s();

    /* renamed from: X */
    public Handler f2003X;

    /* renamed from: c */
    public int f2006c;

    /* renamed from: e */
    public int f2007e;

    /* renamed from: m */
    public boolean f2008m = true;

    /* renamed from: s */
    public boolean f2009s = true;

    /* renamed from: Y */
    public final C0401l f2004Y = new C0401l(this);

    /* renamed from: Z */
    public final RunnableC0125j f2005Z = new RunnableC0125j(1, this);

    /* renamed from: w1 */
    public final b f2010w1 = new b();

    /* renamed from: androidx.lifecycle.s$a */
    public static final class a {
        /* renamed from: a */
        public static final void m1405a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C0898f.m2606e(activity, "activity");
            C0898f.m2606e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: androidx.lifecycle.s$b */
    public static final class b implements FragmentC0410u.a {
        public b() {
        }

        @Override // androidx.lifecycle.FragmentC0410u.a
        /* renamed from: a */
        public final void mo1406a() {
            C0408s.this.m1404d();
        }

        @Override // androidx.lifecycle.FragmentC0410u.a
        /* renamed from: b */
        public final void mo1407b() {
        }

        @Override // androidx.lifecycle.FragmentC0410u.a
        /* renamed from: c */
        public final void mo1408c() {
            C0408s c0408s = C0408s.this;
            int i7 = c0408s.f2006c + 1;
            c0408s.f2006c = i7;
            if (i7 == 1 && c0408s.f2009s) {
                c0408s.f2004Y.m1379e(AbstractC0394f.a.ON_START);
                c0408s.f2009s = false;
            }
        }
    }

    /* renamed from: d */
    public final void m1404d() {
        int i7 = this.f2007e + 1;
        this.f2007e = i7;
        if (i7 == 1) {
            if (this.f2008m) {
                this.f2004Y.m1379e(AbstractC0394f.a.ON_RESUME);
                this.f2008m = false;
            } else {
                Handler handler = this.f2003X;
                C0898f.m2603b(handler);
                handler.removeCallbacks(this.f2005Z);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0400k
    /* renamed from: m */
    public final C0401l mo354m() {
        return this.f2004Y;
    }
}
