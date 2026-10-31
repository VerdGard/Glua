package p036e2;

import android.app.Activity;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* renamed from: e2.j2 */
/* loaded from: classes.dex */
public final class RunnableC1022j2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ WeakReference f5167c;

    /* renamed from: e */
    public final /* synthetic */ long f5168e;

    /* renamed from: m */
    public final /* synthetic */ C1085s2 f5169m;

    public RunnableC1022j2(C1085s2 c1085s2, WeakReference weakReference, long j7) {
        this.f5169m = c1085s2;
        this.f5167c = weakReference;
        this.f5168e = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1085s2 c1085s2 = this.f5169m;
        c1085s2.f5411d = true;
        Activity activity = (Activity) this.f5167c.get();
        if (activity == null) {
            return;
        }
        c1085s2.getClass();
        c1085s2.f5408a = activity.getApplicationContext();
        c1085s2.f5409b = new WeakReference<>(activity);
        c1085s2.f5414g = this.f5168e;
        String m3213x = C1086s3.m3213x(activity);
        boolean z6 = false;
        if (TextUtils.isEmpty(m3213x) ? false : !m3213x.equals(c1085s2.f5416i)) {
            c1085s2.f5421n = false;
            String str = c1085s2.f5417j;
            String str2 = c1085s2.f5416i;
            long j7 = c1085s2.f5415h;
            long j8 = c1085s2.f5414g;
            if (!TextUtils.isEmpty(m3213x) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !m3213x.equals(str) && str.equals(str2)) {
                long j9 = j8 - j7;
                if (j9 > 0 && j9 < 5000) {
                    z6 = true;
                }
            }
            if (z6) {
                c1085s2.f5421n = true;
            }
        }
    }
}
