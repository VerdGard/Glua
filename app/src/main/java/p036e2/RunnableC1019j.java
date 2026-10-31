package p036e2;

import android.content.Context;

/* renamed from: e2.j */
/* loaded from: classes.dex */
public final class RunnableC1019j implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Context f5134c;

    /* renamed from: e */
    public final /* synthetic */ C0991f f5135e;

    public RunnableC1019j(C0991f c0991f, Context context) {
        this.f5135e = c0991f;
        this.f5134c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1117x c1117x = this.f5135e.f5048c;
        Context context = this.f5134c;
        long currentTimeMillis = System.currentTimeMillis();
        long j7 = c1117x.f5541e;
        if (j7 > 0) {
            long j8 = currentTimeMillis - j7;
            if (c1117x.f5543g <= 0) {
                c1117x.f5543g = 30000;
            }
            if (j8 > c1117x.f5543g) {
                c1117x.m3276c(context, -1L, false, false, 0);
            }
        }
    }
}
