package p036e2;

import android.content.Context;

/* renamed from: e2.h */
/* loaded from: classes.dex */
public final class RunnableC1005h implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Context f5080c;

    /* renamed from: e */
    public final /* synthetic */ long f5081e;

    /* renamed from: m */
    public final /* synthetic */ C0991f f5082m;

    public RunnableC1005h(C0991f c0991f, Context context, long j7) {
        this.f5082m = c0991f;
        this.f5080c = context;
        this.f5081e = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1117x c1117x = this.f5082m.f5048c;
        if (this.f5080c == null) {
            c1117x.getClass();
            return;
        }
        C1110w c1110w = c1117x.f5542f;
        long j7 = this.f5081e;
        if (c1110w.f5496c <= 0) {
            c1110w.f5496c = j7;
        }
        c1117x.f5545i = j7;
    }
}
