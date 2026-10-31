package p036e2;

import android.content.Context;

/* renamed from: e2.q5 */
/* loaded from: classes.dex */
public final class RunnableC1074q5 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Context f5360c;

    /* renamed from: e */
    public final /* synthetic */ String f5361e;

    /* renamed from: m */
    public final /* synthetic */ C1095t5 f5362m;

    public RunnableC1074q5(C1095t5 c1095t5, Context context, String str) {
        this.f5362m = c1095t5;
        this.f5360c = context;
        this.f5361e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1095t5 c1095t5 = this.f5362m;
        Context context = this.f5360c;
        if (context == null) {
            return;
        }
        try {
            String str = this.f5361e;
            c1095t5.getClass();
            C1121x3.m3289b(context, "__send_log_data_" + System.currentTimeMillis(), str);
            C1095t5.m3224a(c1095t5, context.getApplicationContext());
        } catch (Throwable th) {
            C1016i3.f5129e.m386n(th);
        }
    }
}
