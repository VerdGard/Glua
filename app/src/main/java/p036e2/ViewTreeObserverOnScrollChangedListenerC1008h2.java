package p036e2;

import android.app.Activity;
import android.os.Handler;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: e2.h2 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC1008h2 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C1085s2 f5096a;

    public ViewTreeObserverOnScrollChangedListenerC1008h2(C1085s2 c1085s2) {
        this.f5096a = c1085s2;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        C1085s2 c1085s2 = this.f5096a;
        WeakReference<Activity> weakReference = c1085s2.f5409b;
        if (weakReference == null) {
            return;
        }
        RunnableC1015i2 runnableC1015i2 = new RunnableC1015i2(c1085s2, weakReference, System.currentTimeMillis());
        RunnableC1015i2 runnableC1015i22 = c1085s2.f5427t;
        Handler handler = c1085s2.f5410c;
        if (runnableC1015i22 != null) {
            handler.removeCallbacks(runnableC1015i22);
        }
        c1085s2.f5427t = runnableC1015i2;
        handler.postDelayed(runnableC1015i2, 350L);
    }
}
