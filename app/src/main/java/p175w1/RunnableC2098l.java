package p175w1;

import android.ext.Tools;

/* renamed from: w1.l */
/* loaded from: classes.dex */
public final class RunnableC2098l implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ AbstractC2100m f9525c;

    public RunnableC2098l(AbstractC2100m abstractC2100m) {
        this.f9525c = abstractC2100m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2100m abstractC2100m = this.f9525c;
        if (abstractC2100m.f9528B1) {
            abstractC2100m.f9528B1 = false;
            abstractC2100m.getClass();
            try {
                Tools.removeViewWithWrapper(abstractC2100m);
            } catch (Throwable unused) {
            }
        }
    }
}
