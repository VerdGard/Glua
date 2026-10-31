package p175w1;

import android.ext.Tools;
import android.view.WindowManager;
import com.so.revelation.lua.p024gg.ShowApp;

/* renamed from: w1.i0 */
/* loaded from: classes.dex */
public final class RunnableC2093i0 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ ShowApp f9520c;

    public RunnableC2093i0(ShowApp showApp) {
        this.f9520c = showApp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = false;
        if (this.f9520c.f3683s) {
            ShowApp showApp = this.f9520c;
            showApp.getClass();
            if (ShowApp.m2260a(showApp)) {
                this.f9520c.f3683s = false;
            }
        }
        ShowApp showApp2 = this.f9520c;
        WindowManager.LayoutParams layoutParams = showApp2.f3681e;
        try {
            if (showApp2 instanceof AbstractC2100m) {
                C2101m0.m5155a(0, new RunnableC2096k((AbstractC2100m) showApp2));
            } else {
                Tools.addViewWithWrapper(showApp2, layoutParams);
            }
            try {
                showApp2.setAlpha(1.0f);
            } catch (Throwable unused) {
            }
            z6 = true;
        } catch (Throwable unused2) {
        }
        if (z6) {
            this.f9520c.f3683s = true;
        }
    }
}
