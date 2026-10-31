package p036e2;

import android.app.Activity;
import android.content.Context;
import p036e2.C0963b;

/* renamed from: e2.d */
/* loaded from: classes.dex */
public final class C0977d implements C0963b.a {

    /* renamed from: a */
    public final int f4998a;

    public C0977d(int i7) {
        this.f4998a = i7;
    }

    @Override // p036e2.C0963b.a
    /* renamed from: a */
    public final void mo2957a() {
    }

    @Override // p036e2.C0963b.a
    /* renamed from: b */
    public final void mo2958b() {
    }

    @Override // p036e2.C0963b.a
    /* renamed from: c */
    public final void mo2959c() {
    }

    @Override // p036e2.C0963b.a
    /* renamed from: d */
    public final void mo2960d() {
    }

    @Override // p036e2.C0963b.a
    /* renamed from: e */
    public final void mo2961e() {
    }

    @Override // p036e2.C0963b.a
    public final void onActivityPaused(Activity activity) {
        C0991f m3015d;
        Context applicationContext = activity.getApplicationContext();
        int i7 = this.f4998a;
        if (i7 == 1) {
            m3015d = C0991f.m3015d();
            if (applicationContext != null) {
                m3015d.m3017c(applicationContext);
                m3015d.f5046a.post(new RunnableC1012i(m3015d, applicationContext, System.currentTimeMillis()));
                return;
            }
        } else {
            if (i7 != 2) {
                return;
            }
            m3015d = C0991f.m3015d();
            if (applicationContext != null) {
                C1117x c1117x = m3015d.f5048c;
                if (c1117x.f5543g <= 0) {
                    c1117x.f5543g = 30000;
                }
                int i8 = c1117x.f5543g;
                RunnableC1019j runnableC1019j = new RunnableC1019j(m3015d, applicationContext);
                m3015d.f5050e = runnableC1019j;
                m3015d.f5046a.postDelayed(runnableC1019j, i8);
                return;
            }
        }
        m3015d.getClass();
    }

    @Override // p036e2.C0963b.a
    public final void onActivityResumed(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        int i7 = this.f4998a;
        if (i7 == 1) {
            C0991f m3015d = C0991f.m3015d();
            if (applicationContext == null) {
                m3015d.getClass();
                return;
            }
            m3015d.m3017c(applicationContext);
            m3015d.f5046a.post(new RunnableC1005h(m3015d, applicationContext, System.currentTimeMillis()));
            return;
        }
        if (i7 == 2) {
            C0991f m3015d2 = C0991f.m3015d();
            RunnableC1019j runnableC1019j = m3015d2.f5050e;
            if (runnableC1019j != null) {
                m3015d2.f5046a.removeCallbacks(runnableC1019j);
            }
            m3015d2.f5050e = null;
        }
    }
}
