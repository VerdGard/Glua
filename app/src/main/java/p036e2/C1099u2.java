package p036e2;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import p036e2.C0963b;

/* renamed from: e2.u2 */
/* loaded from: classes.dex */
public final class C1099u2 implements C0963b.a {
    @Override // p036e2.C0963b.a
    /* renamed from: a */
    public final void mo2957a() {
    }

    @Override // p036e2.C0963b.a
    /* renamed from: b */
    public final void mo2958b() {
    }

    @Override // p036e2.C0963b.a
    /* renamed from: c */
    public final void mo2959c() {
    }

    @Override // p036e2.C0963b.a
    /* renamed from: d */
    public final void mo2960d() {
    }

    @Override // p036e2.C0963b.a
    /* renamed from: e */
    public final void mo2961e() {
    }

    @Override // p036e2.C0963b.a
    public final void onActivityPaused(Activity activity) {
        Window window;
        if (C1042m1.f5244a && !C0981d3.f5007b.f5008a) {
            C1009h3 c1009h3 = C1009h3.f5097k;
            if (!TextUtils.isEmpty(c1009h3.f5106h)) {
                Activity activity2 = c1009h3.f5100b;
                if (activity2 != null && (window = activity2.getWindow()) != null) {
                    Window.Callback callback = window.getCallback();
                    while (callback != null && (callback instanceof WindowCallbackC1112w1)) {
                        callback = ((WindowCallbackC1112w1) callback).f5512c;
                    }
                    window.setCallback(callback);
                }
                c1009h3.f5100b = null;
                c1009h3.f5108j.m3138a(activity, false);
            }
        }
    }

    @Override // p036e2.C0963b.a
    public final void onActivityResumed(Activity activity) {
        Window.Callback callback;
        if (C1042m1.f5244a && !C0981d3.f5007b.f5008a) {
            C1009h3 c1009h3 = C1009h3.f5097k;
            if (!TextUtils.isEmpty(c1009h3.f5106h)) {
                C1058o3.f5275j = 0;
                C1009h3.f5098l = true;
                Context applicationContext = activity.getApplicationContext();
                c1009h3.f5099a = applicationContext;
                c1009h3.f5100b = activity;
                if (C0968b4.m2981o(applicationContext) && !c1009h3.f5101c) {
                    if (!c1009h3.f5102d) {
                        c1009h3.f5103e = C1121x3.m3288a(c1009h3.f5099a, "mtj_autoTracker.js");
                        c1009h3.f5102d = true;
                    }
                    if (c1009h3.f5104f == 0) {
                        c1009h3.f5104f = c1009h3.f5099a.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getLong("autotrace_track_js_fetch_time", 0L);
                        c1009h3.f5105g = c1009h3.f5099a.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getLong("autotrace_track_js_fetch_interval", 0L);
                    }
                    if ((c1009h3.f5102d && TextUtils.isEmpty(c1009h3.f5103e)) || System.currentTimeMillis() - c1009h3.f5104f > c1009h3.f5105g) {
                        Thread thread = new Thread(new RunnableC1002g3(c1009h3));
                        thread.setName("downloadThread");
                        thread.start();
                    }
                }
                Window window = activity.getWindow();
                if (window != null && (callback = window.getCallback()) != null) {
                    window.setCallback(new WindowCallbackC1112w1(callback, new C0995f3(c1009h3)));
                }
                c1009h3.f5108j.m3139b(activity, false, null, false);
            }
        }
    }
}
