package p036e2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e2.l */
/* loaded from: classes.dex */
public final class C1033l extends WebChromeClient {

    /* renamed from: a */
    public final WebChromeClient f5220a;

    /* renamed from: b */
    public final ArrayList<InterfaceC1040m> f5221b;

    /* renamed from: c */
    public final C1107v3 f5222c;

    /* renamed from: d */
    public int f5223d = 0;

    public C1033l(Context context, ArrayList arrayList, C1107v3 c1107v3) {
        new WeakReference(context);
        this.f5220a = null;
        this.f5221b = arrayList;
        this.f5222c = c1107v3;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onCloseWindow(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onConsoleMessage(String str, int i7, String str2) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onConsoleMessage(str, i7, str2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        WebChromeClient webChromeClient = this.f5220a;
        return webChromeClient != null ? webChromeClient.onConsoleMessage(consoleMessage) : super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z6, boolean z7, Message message) {
        WebChromeClient webChromeClient = this.f5220a;
        return webChromeClient != null ? webChromeClient.onCreateWindow(webView, z6, z7, message) : super.onCreateWindow(webView, z6, z7, message);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onExceededDatabaseQuota(String str, String str2, long j7, long j8, long j9, WebStorage.QuotaUpdater quotaUpdater) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j7, j8, j9, quotaUpdater);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.f5220a;
        return webChromeClient != null ? webChromeClient.onJsAlert(webView, str, str2, jsResult) : super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.f5220a;
        return webChromeClient != null ? webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult) : super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        WebChromeClient webChromeClient = this.f5220a;
        return webChromeClient != null ? webChromeClient.onJsConfirm(webView, str, str2, jsResult) : super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        WebChromeClient webChromeClient = this.f5220a;
        return webChromeClient != null ? webChromeClient.onJsPrompt(webView, str, str2, str3, jsPromptResult) : super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final boolean onJsTimeout() {
        WebChromeClient webChromeClient = this.f5220a;
        return webChromeClient != null ? webChromeClient.onJsTimeout() : super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    @SuppressLint({"NewApi"})
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onPermissionRequest(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    @SuppressLint({"NewApi"})
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i7) {
        ArrayList<InterfaceC1040m> arrayList = this.f5221b;
        if (arrayList != null) {
            int i8 = this.f5223d;
            C1107v3 c1107v3 = this.f5222c;
            if (i8 == 0) {
                Iterator<InterfaceC1040m> it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC1040m next = it.next();
                    if (next != null) {
                        webView.getUrl();
                        next.mo3115b(webView, c1107v3);
                    }
                }
            }
            this.f5223d = i7;
            if (i7 == 100) {
                Iterator<InterfaceC1040m> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    InterfaceC1040m next2 = it2.next();
                    if (next2 != null) {
                        webView.getUrl();
                        next2.mo3114a(webView, c1107v3);
                    }
                }
            }
        }
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onProgressChanged(webView, i7);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onReceivedIcon(webView, bitmap);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTitle(webView, str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z6) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z6);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    @SuppressLint({"NewApi"})
    @Deprecated
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, i7, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        WebChromeClient webChromeClient = this.f5220a;
        if (webChromeClient != null) {
            webChromeClient.onShowCustomView(view, customViewCallback);
        }
    }

    @Override // android.webkit.WebChromeClient
    @SuppressLint({"NewApi"})
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        WebChromeClient webChromeClient = this.f5220a;
        return webChromeClient != null ? webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams) : super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }
}
