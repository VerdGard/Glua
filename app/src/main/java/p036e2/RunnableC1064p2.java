package p036e2;

import android.webkit.WebView;

/* renamed from: e2.p2 */
/* loaded from: classes.dex */
public final class RunnableC1064p2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ WebView f5317c;

    /* renamed from: e */
    public final /* synthetic */ C1085s2 f5318e;

    public RunnableC1064p2(C1085s2 c1085s2, WebView webView) {
        this.f5318e = c1085s2;
        this.f5317c = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f5318e.f5430w) {
            this.f5318e.f5428u = this.f5317c.getContentHeight();
            this.f5318e.f5429v = this.f5317c.getScale();
            this.f5318e.f5430w.notifyAll();
        }
    }
}
