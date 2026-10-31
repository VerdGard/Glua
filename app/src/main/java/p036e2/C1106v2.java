package p036e2;

import android.text.TextUtils;
import android.webkit.WebView;

/* renamed from: e2.v2 */
/* loaded from: classes.dex */
public final class C1106v2 implements InterfaceC1040m {
    @Override // p036e2.InterfaceC1040m
    /* renamed from: a */
    public final void mo3114a(WebView webView, C1107v3 c1107v3) {
        if (C1042m1.f5244a && !C0981d3.f5007b.f5008a) {
            webView.addJavascriptInterface(c1107v3, "WebViewInterface");
            C1009h3 c1009h3 = C1009h3.f5097k;
            if (TextUtils.isEmpty(c1009h3.f5103e)) {
                c1009h3.f5103e = C1121x3.m3288a(c1009h3.f5099a, "mtj_autoTracker.js");
            }
            String str = c1009h3.f5103e;
            if (c1107v3 == null) {
                return;
            }
            c1107v3.m3235a(c1009h3.f5100b, webView, str, null, false);
        }
    }

    @Override // p036e2.InterfaceC1040m
    /* renamed from: b */
    public final void mo3115b(WebView webView, C1107v3 c1107v3) {
        if (C1042m1.f5244a && !C0981d3.f5007b.f5008a) {
            webView.addJavascriptInterface(c1107v3, "WebViewInterface");
        }
    }
}
