package p036e2;

import android.webkit.WebView;

/* renamed from: e2.u3 */
/* loaded from: classes.dex */
public final class RunnableC1100u3 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ WebView f5475c;

    /* renamed from: e */
    public final /* synthetic */ String f5476e;

    public RunnableC1100u3(WebView webView, String str) {
        this.f5475c = webView;
        this.f5476e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5475c.loadUrl(this.f5476e);
    }
}
