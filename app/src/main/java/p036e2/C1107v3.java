package p036e2;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: e2.v3 */
/* loaded from: classes.dex */
public final class C1107v3 {

    /* renamed from: e */
    public static String f5484e;

    /* renamed from: a */
    public WeakReference<WebView> f5485a;

    /* renamed from: b */
    public WeakReference<Activity> f5486b;

    /* renamed from: c */
    public JSONObject f5487c;

    /* renamed from: d */
    public boolean f5488d;

    /* renamed from: a */
    public final void m3235a(Activity activity, WebView webView, String str, JSONObject jSONObject, boolean z6) {
        String jSONObject2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z6) {
            this.f5487c = jSONObject;
        }
        if (z6) {
            Objects.toString(jSONObject);
        }
        WeakReference<WebView> weakReference = this.f5485a;
        if ((weakReference == null || weakReference.get() != webView || this.f5488d == z6) ? false : true) {
            return;
        }
        if (activity != null) {
            this.f5486b = new WeakReference<>(activity);
        }
        if (webView != null) {
            this.f5485a = new WeakReference<>(webView);
        }
        this.f5488d = z6;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("matchAll", 1);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("meta", jSONObject3);
            jSONObject2 = jSONObject4.toString();
        } catch (Exception unused) {
            jSONObject2 = new JSONObject().toString();
        }
        if (TextUtils.isEmpty(jSONObject2)) {
            jSONObject2 = new JSONObject().toString();
        }
        String str2 = "(function(){var h5conf = {\"sdkAPI\": \"window.WebViewInterface.setEventToNative\", \"sdkType\": \"android\", \"events\": " + jSONObject2 + "};" + str + "})()";
        if (webView != null) {
            webView.loadUrl("javascript:" + str2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(2:62|63)|(4:65|(1:67)|68|69)|70|71|72|(5:76|(2:84|85)|86|73|74)|91|92|(0)|68|69) */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9 A[Catch: Exception -> 0x0142, TryCatch #9 {Exception -> 0x0142, blocks: (B:40:0x00e3, B:42:0x00e9, B:44:0x0122, B:46:0x0136, B:49:0x013d), top: B:39:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2 A[Catch: Exception -> 0x01f3, TryCatch #6 {Exception -> 0x01f3, blocks: (B:74:0x01ac, B:76:0x01b2, B:78:0x01da, B:80:0x01e0, B:82:0x01e6), top: B:73:0x01ac }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setEventToNative(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1107v3.setEventToNative(java.lang.String):void");
    }

    @JavascriptInterface
    public void setViewportTreeToNative(String str) {
        f5484e = str;
    }
}
