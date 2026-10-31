package p036e2;

import android.content.Context;

/* renamed from: e2.x2 */
/* loaded from: classes.dex */
public final class RunnableC1120x2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Context f5589c;

    /* renamed from: e */
    public final /* synthetic */ boolean f5590e;

    /* renamed from: m */
    public final /* synthetic */ C0974c3 f5591m;

    public RunnableC1120x2(C0974c3 c0974c3, Context context, boolean z6) {
        this.f5591m = c0974c3;
        this.f5589c = context;
        this.f5590e = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5591m.m2995f(this.f5589c, this.f5590e);
    }
}
