package p036e2;

import p018c1.C0586g;

/* renamed from: e2.g */
/* loaded from: classes.dex */
public final class RunnableC0998g implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ C0586g f5068c;

    /* renamed from: e */
    public final /* synthetic */ boolean f5069e;

    /* renamed from: m */
    public final /* synthetic */ C0991f f5070m;

    public RunnableC0998g(C0991f c0991f, C0586g c0586g, boolean z6) {
        this.f5070m = c0991f;
        this.f5068c = c0586g;
        this.f5069e = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1117x c1117x = this.f5070m.f5048c;
        C0586g c0586g = this.f5068c;
        if (this.f5069e) {
            c1117x.f5547k = c0586g;
        } else {
            c1117x.f5548l = c0586g;
        }
    }
}
