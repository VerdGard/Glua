package p036e2;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: e2.e2 */
/* loaded from: classes.dex */
public final class RunnableC0987e2 implements Runnable {

    /* renamed from: X */
    public final /* synthetic */ C1085s2 f5034X;

    /* renamed from: c */
    public final /* synthetic */ WeakReference f5035c;

    /* renamed from: e */
    public final /* synthetic */ WeakReference f5036e;

    /* renamed from: m */
    public final /* synthetic */ View f5037m;

    /* renamed from: s */
    public final /* synthetic */ long f5038s;

    public RunnableC0987e2(C1085s2 c1085s2, WeakReference weakReference, WeakReference weakReference2, View view, long j7) {
        this.f5034X = c1085s2;
        this.f5035c = weakReference;
        this.f5036e = weakReference2;
        this.f5037m = view;
        this.f5038s = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        Activity activity = (Activity) this.f5035c.get();
        if (activity == null || ((View) this.f5036e.get()) == null) {
            return;
        }
        C1085s2 c1085s2 = this.f5034X;
        c1085s2.getClass();
        View m3191b = C1086s3.m3191b(activity, this.f5037m);
        View view2 = null;
        if (m3191b != null) {
            Object parent = m3191b.getParent();
            if ((parent instanceof View) && (view = (View) parent) != null && C1086s3.m3186C(view)) {
                view2 = view;
            }
        }
        if (view2 == null) {
            if (c1085s2.f5421n) {
                return;
            }
        } else {
            if (!c1085s2.m3181c(view2)) {
                c1085s2.f5415h = this.f5038s;
                c1085s2.f5417j = C1086s3.m3213x(activity);
                c1085s2.f5418k = "";
                HashMap m3203n = C1086s3.m3203n(m3191b, true);
                if (m3203n.size() > 0 && !TextUtils.isEmpty((CharSequence) m3203n.get("title"))) {
                    c1085s2.f5418k = (String) m3203n.get("title");
                }
                c1085s2.f5419l = C1086s3.m3206q(view2, c1085s2.f5417j);
                C1086s3.m3188E(view2);
                c1085s2.getClass();
                c1085s2.f5420m = C1085s2.m3178a(activity, m3191b, view2);
                return;
            }
            if (c1085s2.f5421n) {
                return;
            }
        }
        c1085s2.f5415h = 0L;
        c1085s2.f5417j = "";
        c1085s2.f5418k = "";
        c1085s2.f5419l = "";
        c1085s2.getClass();
        c1085s2.f5420m = "";
    }
}
