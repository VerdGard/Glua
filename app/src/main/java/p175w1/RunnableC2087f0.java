package p175w1;

import android.os.Handler;
import com.so.revelation.lua.p024gg.ShowApp;

/* renamed from: w1.f0 */
/* loaded from: classes.dex */
public final class RunnableC2087f0 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ ShowApp f9510c;

    public RunnableC2087f0(ShowApp showApp) {
        this.f9510c = showApp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = C2101m0.f9540a[0];
        ShowApp showApp = this.f9510c;
        handler.removeCallbacks(showApp.f3680c);
        showApp.getClass();
        int[] iArr = C2083d0.f9490m2;
    }
}
