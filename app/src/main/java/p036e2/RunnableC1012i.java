package p036e2;

import android.content.Context;

/* renamed from: e2.i */
/* loaded from: classes.dex */
public final class RunnableC1012i implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Context f5120c;

    /* renamed from: e */
    public final /* synthetic */ long f5121e;

    /* renamed from: m */
    public final /* synthetic */ C0991f f5122m;

    public RunnableC1012i(C0991f c0991f, Context context, long j7) {
        this.f5122m = c0991f;
        this.f5120c = context;
        this.f5121e = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1117x c1117x = this.f5122m.f5048c;
        Context context = this.f5120c;
        long j7 = this.f5121e;
        if (context == null) {
            c1117x.getClass();
        } else {
            c1117x.f5542f.f5497d = j7;
            c1117x.m3274a(context);
        }
    }
}
