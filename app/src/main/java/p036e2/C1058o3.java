package p036e2;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONObject;
import p036e2.AbstractC1093t3;
import p036e2.C1042m1;

/* renamed from: e2.o3 */
/* loaded from: classes.dex */
public final class C1058o3 {

    /* renamed from: j */
    public static volatile int f5275j;

    /* renamed from: k */
    public static final C1058o3 f5276k = new C1058o3();

    /* renamed from: a */
    public WeakReference<Activity> f5277a;

    /* renamed from: b */
    public int f5278b;

    /* renamed from: c */
    public boolean f5279c;

    /* renamed from: d */
    public JSONObject f5280d;

    /* renamed from: e */
    public boolean f5281e;

    /* renamed from: g */
    public final Handler f5283g;

    /* renamed from: h */
    public a f5284h;

    /* renamed from: f */
    public final Handler f5282f = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public final C1030k3 f5285i = new C1030k3();

    /* renamed from: e2.o3$a */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, Runnable {

        /* renamed from: X */
        public final Handler f5287X;

        /* renamed from: Y */
        public final Handler f5288Y;

        /* renamed from: Z */
        public final JSONObject f5289Z;

        /* renamed from: m */
        public final WeakReference<View> f5292m;

        /* renamed from: s */
        public final AbstractC1093t3 f5293s;

        /* renamed from: w1 */
        public final WeakReference<Activity> f5294w1;

        /* renamed from: x1 */
        public final boolean f5295x1;

        /* renamed from: z1 */
        public final boolean f5297z1;

        /* renamed from: A1 */
        public RunnableC1044m3 f5286A1 = null;

        /* renamed from: e */
        public boolean f5291e = true;

        /* renamed from: c */
        public volatile boolean f5290c = false;

        /* renamed from: y1 */
        public final boolean f5296y1 = true;

        public a(Activity activity, View view, AbstractC1093t3.a aVar, Handler handler, Handler handler2, JSONObject jSONObject, boolean z6, boolean z7) {
            this.f5294w1 = new WeakReference<>(activity);
            this.f5289Z = jSONObject;
            this.f5293s = aVar;
            this.f5292m = new WeakReference<>(view);
            this.f5287X = handler;
            this.f5288Y = handler2;
            this.f5295x1 = z6;
            this.f5297z1 = z7;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
            }
            run();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            run();
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            Activity activity;
            if (this.f5291e) {
                if (this.f5292m.get() == null || this.f5290c) {
                    if (this.f5291e) {
                        View view = this.f5292m.get();
                        if (view != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(this);
                            }
                        }
                        AbstractC1093t3 abstractC1093t3 = this.f5293s;
                        if (abstractC1093t3 != null && (handler = this.f5288Y) != null) {
                            handler.postDelayed(new RunnableC1051n3(abstractC1093t3), 500L);
                        }
                    }
                    this.f5291e = false;
                    return;
                }
                if (C1009h3.f5098l && (activity = this.f5294w1.get()) != null) {
                    boolean z6 = this.f5295x1;
                    boolean z7 = this.f5297z1;
                    if (z6) {
                        C1058o3.m3137c(activity, C1086s3.m3190a(activity), z7);
                    }
                    WeakReference<Activity> weakReference = this.f5294w1;
                    JSONObject jSONObject = this.f5289Z;
                    AbstractC1093t3 abstractC1093t32 = this.f5293s;
                    Handler handler2 = this.f5288Y;
                    boolean z8 = this.f5296y1;
                    if (abstractC1093t32 != null && handler2 != null) {
                        RunnableC1044m3 runnableC1044m3 = new RunnableC1044m3(this, weakReference, z8, abstractC1093t32, jSONObject);
                        RunnableC1044m3 runnableC1044m32 = this.f5286A1;
                        if (runnableC1044m32 != null) {
                            handler2.removeCallbacks(runnableC1044m32);
                        }
                        this.f5286A1 = runnableC1044m3;
                        handler2.postDelayed(runnableC1044m3, 500L);
                    }
                }
                this.f5287X.removeCallbacks(this);
            }
        }
    }

    public C1058o3() {
        HandlerThread handlerThread = new HandlerThread("visitorThread");
        handlerThread.start();
        this.f5283g = new Handler(handlerThread.getLooper());
    }

    /* renamed from: c */
    public static void m3137c(Activity activity, View view, boolean z6) {
        if (view == null || C1086s3.m3209t(activity, view)) {
            return;
        }
        if (!(view instanceof WebView)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                    m3137c(activity, viewGroup.getChildAt(i7), z6);
                }
                return;
            }
            return;
        }
        WebView webView = (WebView) view;
        if (webView.getTag(-96001) == null) {
            Context applicationContext = activity.getApplicationContext();
            C1023j3 c1023j3 = C1023j3.f5170m;
            if (applicationContext == null) {
                c1023j3.m382g(6, "[WARNING] context is null, invalid");
                return;
            }
            if (C1124y.m3298a(applicationContext)) {
                return;
            }
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDefaultTextEncodingName("UTF-8");
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            C1107v3 c1107v3 = new C1107v3();
            webView.addJavascriptInterface(c1107v3, "WebViewInterface");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C1042m1.b());
            arrayList.add(new C1106v2());
            C1033l c1033l = new C1033l(applicationContext, arrayList, c1107v3);
            webView.setWebChromeClient(c1033l);
            webView.setTag(-96001, c1033l);
            C0991f.m3015d().m3017c(applicationContext);
        }
    }

    /* renamed from: a */
    public final void m3138a(Activity activity, boolean z6) {
        if ((!z6) && !C0973c2.f4982d.f4983a) {
            C1085s2 c1085s2 = C1085s2.f5407x;
            if (!c1085s2.m3182e() && activity != null) {
                c1085s2.f5410c.post(new RunnableC1071q2(c1085s2, new WeakReference(activity), System.currentTimeMillis()));
            }
        }
        WeakReference<Activity> weakReference = this.f5277a;
        if (weakReference != null && weakReference.get() == activity && this.f5278b == 2) {
            return;
        }
        this.f5277a = new WeakReference<>(activity);
        this.f5278b = 2;
        a aVar = this.f5284h;
        if (aVar == null || aVar.f5290c) {
            return;
        }
        aVar.f5290c = true;
        aVar.f5287X.post(aVar);
    }

    /* renamed from: b */
    public final void m3139b(Activity activity, boolean z6, JSONObject jSONObject, boolean z7) {
        a aVar;
        if ((!z6) && !C0973c2.f4982d.f4983a) {
            C1085s2 c1085s2 = C1085s2.f5407x;
            if (!c1085s2.m3182e() && activity != null) {
                c1085s2.f5410c.post(new RunnableC1022j2(c1085s2, new WeakReference(activity), System.currentTimeMillis()));
            }
        }
        if (!this.f5279c) {
            this.f5279c = z7;
        }
        if (z6) {
            this.f5281e = z6;
            this.f5280d = jSONObject;
        }
        WeakReference<Activity> weakReference = this.f5277a;
        if (weakReference != null && weakReference.get() == activity && this.f5278b == 1) {
            return;
        }
        if (this.f5277a != null && (aVar = this.f5284h) != null && !aVar.f5290c) {
            aVar.f5290c = true;
            aVar.f5287X.post(aVar);
        }
        WeakReference<Activity> weakReference2 = new WeakReference<>(activity);
        this.f5277a = weakReference2;
        this.f5278b = 1;
        this.f5284h = new a(activity, C1086s3.m3190a(activity), new AbstractC1093t3.a(weakReference2, this.f5285i), this.f5282f, this.f5283g, this.f5280d, this.f5279c, this.f5281e);
    }
}
