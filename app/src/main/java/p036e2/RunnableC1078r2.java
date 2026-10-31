package p036e2;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: e2.r2 */
/* loaded from: classes.dex */
public final class RunnableC1078r2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ C1085s2 f5369c;

    public RunnableC1078r2(C1085s2 c1085s2) {
        this.f5369c = c1085s2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference<View> weakReference;
        View view;
        ViewTreeObserver viewTreeObserver;
        C1085s2 c1085s2 = this.f5369c;
        List<WeakReference<View>> list = c1085s2.f5412e;
        if (c1085s2.f5426s == null) {
            c1085s2.f5426s = new ViewTreeObserverOnScrollChangedListenerC1008h2(c1085s2);
        }
        ViewTreeObserverOnScrollChangedListenerC1008h2 viewTreeObserverOnScrollChangedListenerC1008h2 = c1085s2.f5426s;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                weakReference = list.get(i7);
            } catch (Exception unused) {
                weakReference = null;
            }
            if (weakReference != null && (view = weakReference.get()) != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && viewTreeObserverOnScrollChangedListenerC1008h2 != null) {
                viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1008h2);
            }
        }
        list.clear();
    }
}
