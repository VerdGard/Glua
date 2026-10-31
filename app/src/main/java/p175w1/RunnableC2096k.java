package p175w1;

import android.ext.Tools;

/* renamed from: w1.k */
/* loaded from: classes.dex */
public final class RunnableC2096k implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ AbstractC2100m f9524c;

    public RunnableC2096k(AbstractC2100m abstractC2100m) {
        this.f9524c = abstractC2100m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2100m abstractC2100m = this.f9524c;
        if (abstractC2100m.f9529C1) {
            return;
        }
        if (abstractC2100m.f9528B1) {
            try {
                Tools.removeViewWithWrapper(abstractC2100m);
            } catch (Throwable unused) {
            }
        }
        abstractC2100m.f9528B1 = true;
        try {
            Tools.addViewWithWrapper(abstractC2100m, abstractC2100m.f9534m);
        } catch (Throwable unused2) {
        }
    }
}
