package p036e2;

import android.app.Activity;
import java.util.LinkedHashSet;

/* renamed from: e2.b */
/* loaded from: classes.dex */
public final class C0963b {

    /* renamed from: c */
    public static final C0963b f4942c = new C0963b();

    /* renamed from: a */
    public boolean f4943a;

    /* renamed from: b */
    public final LinkedHashSet f4944b = new LinkedHashSet();

    /* renamed from: e2.b$a */
    public interface a {
        /* renamed from: a */
        void mo2957a();

        /* renamed from: b */
        void mo2958b();

        /* renamed from: c */
        void mo2959c();

        /* renamed from: d */
        void mo2960d();

        /* renamed from: e */
        void mo2961e();

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);
    }

    /* renamed from: a */
    public final void m2955a(a aVar) {
        synchronized (this.f4944b) {
            this.f4944b.add(aVar);
        }
    }

    /* renamed from: b */
    public final void m2956b() {
        synchronized (this.f4944b) {
            this.f4944b.clear();
        }
    }
}
