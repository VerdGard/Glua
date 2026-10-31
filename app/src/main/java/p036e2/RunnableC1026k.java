package p036e2;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import p036e2.C1117x;

/* renamed from: e2.k */
/* loaded from: classes.dex */
public final class RunnableC1026k implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ WeakReference f5186c;

    /* renamed from: e */
    public final /* synthetic */ boolean f5187e;

    /* renamed from: m */
    public final /* synthetic */ Context f5188m;

    /* renamed from: s */
    public final /* synthetic */ C0991f f5189s;

    public RunnableC1026k(C0991f c0991f, WeakReference weakReference, boolean z6, Context context) {
        this.f5189s = c0991f;
        this.f5186c = weakReference;
        this.f5187e = z6;
        this.f5188m = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = (Activity) this.f5186c.get();
        if (activity == null) {
            return;
        }
        Class<?> cls = activity.getClass();
        String name = activity.getClass().getName();
        String simpleName = activity.getClass().getSimpleName();
        CharSequence title = activity.getTitle();
        String charSequence = title == null ? "" : title.toString();
        C1023j3 c1023j3 = C1023j3.f5170m;
        if (!this.f5187e) {
            c1023j3.m382g(3, "End page view ".concat(cls.getSimpleName()));
        }
        long currentTimeMillis = System.currentTimeMillis();
        C1117x c1117x = this.f5189s.f5048c;
        Context context = this.f5188m;
        boolean z6 = this.f5187e;
        c1117x.f5540d = false;
        C1117x.a aVar = z6 ? c1117x.f5539c : c1117x.f5538b;
        if (aVar.f5551c) {
            c1117x.m3277d(context, aVar.f5549a, name, aVar.f5550b, currentTimeMillis, simpleName, charSequence, name, z6, false);
            aVar.f5551c = false;
            c1117x.f5541e = currentTimeMillis;
        } else {
            if (z6) {
                return;
            }
            c1023j3.m382g(6, "[WARNING] 遗漏StatService.onResume(Activity), 请检查邻近页面埋点: ".concat(name));
        }
    }
}
