package p036e2;

/* renamed from: e2.g3 */
/* loaded from: classes.dex */
public final class RunnableC1002g3 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ C1009h3 f5077c;

    public RunnableC1002g3(C1009h3 c1009h3) {
        this.f5077c = c1009h3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5077c.f5101c) {
            return;
        }
        C1009h3 c1009h3 = this.f5077c;
        boolean m3159b = C1065p3.m3159b(c1009h3.f5099a, c1009h3.f5106h, 1);
        this.f5077c.f5101c = true;
        if (m3159b) {
            C1009h3 c1009h32 = this.f5077c;
            c1009h32.f5103e = C1121x3.m3288a(c1009h32.f5099a, "mtj_autoTracker.js");
        }
    }
}
