package p036e2;

import android.app.Activity;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* renamed from: e2.f2 */
/* loaded from: classes.dex */
public final class RunnableC0994f2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ C1085s2 f5065c;

    public RunnableC0994f2(C1085s2 c1085s2) {
        this.f5065c = c1085s2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        C1085s2 c1085s2 = this.f5065c;
        WeakReference<Activity> weakReference = c1085s2.f5409b;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        String m3213x = C1086s3.m3213x(activity);
        if (TextUtils.isEmpty(c1085s2.f5417j) || !c1085s2.f5417j.equals(m3213x)) {
            return;
        }
        c1085s2.f5415h = 0L;
        c1085s2.f5417j = "";
        c1085s2.f5418k = "";
        c1085s2.f5419l = "";
        c1085s2.getClass();
        c1085s2.f5420m = "";
    }
}
