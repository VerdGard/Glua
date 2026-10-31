package p036e2;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Window;
import android.webkit.WebView;
import p036e2.C0963b;

/* renamed from: e2.m1 */
/* loaded from: classes.dex */
public final class C1042m1 {

    /* renamed from: a */
    public static volatile boolean f5244a = false;

    /* renamed from: e2.m1$a */
    public static class a implements C0963b.a {
        @Override // p036e2.C0963b.a
        /* renamed from: a */
        public final void mo2957a() {
        }

        @Override // p036e2.C0963b.a
        /* renamed from: b */
        public final void mo2958b() {
            C1119x1.f5553E.getClass();
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
            C1119x1 c1119x1 = C1119x1.f5553E;
            if (!TextUtils.isEmpty(c1119x1.f5577t)) {
                c1119x1.f5561d = null;
                C0991f.m3015d().m3019f(activity, true);
                C1098u1 c1098u1 = c1119x1.f5559b;
                if (c1098u1 != null) {
                    Activity activity2 = c1098u1.f5472b;
                    if (activity2 != null && (window = activity2.getWindow()) != null) {
                        Window.Callback callback = window.getCallback();
                        while (callback != null && (callback instanceof WindowCallbackC1112w1)) {
                            callback = ((WindowCallbackC1112w1) callback).f5512c;
                        }
                        window.setCallback(callback);
                    }
                    c1098u1.f5472b = null;
                    c1119x1.f5559b = null;
                }
                c1119x1.f5582y.m3138a(activity, true);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
        @Override // p036e2.C0963b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onActivityResumed(android.app.Activity r13) {
            /*
                Method dump skipped, instructions count: 572
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e2.C1042m1.a.onActivityResumed(android.app.Activity):void");
        }
    }

    /* renamed from: e2.m1$b */
    public static class b implements InterfaceC1040m {
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
        
            if (r11.length() != 0) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[Catch: Exception -> 0x00c4, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c4, blocks: (B:22:0x0071, B:23:0x008a, B:25:0x0090, B:27:0x00a4, B:29:0x00a7, B:36:0x00b8, B:46:0x00af), top: B:21:0x0071 }] */
        @Override // p036e2.InterfaceC1040m
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo3114a(android.webkit.WebView r17, p036e2.C1107v3 r18) {
            /*
                r16 = this;
                r2 = r17
                r0 = r18
                java.lang.String r1 = "WebViewInterface"
                r2.addJavascriptInterface(r0, r1)
                e2.x1 r1 = p036e2.C1119x1.f5553E
                java.lang.String r3 = r1.f5571n
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L1d
                android.content.Context r3 = r1.f5558a
                java.lang.String r4 = "mtj_vizParser.js"
                java.lang.String r3 = p036e2.C1121x3.m3288a(r3, r4)
                r1.f5571n = r3
            L1d:
                java.lang.String r3 = r1.f5571n
                if (r0 != 0) goto L22
                goto L3a
            L22:
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 == 0) goto L29
                goto L3a
            L29:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "javascript:"
                r4.<init>(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r2.loadUrl(r3)
            L3a:
                java.lang.String r3 = r1.f5572o
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L4c
                android.content.Context r3 = r1.f5558a
                java.lang.String r4 = "mtj_autoTracker.js"
                java.lang.String r3 = p036e2.C1121x3.m3288a(r3, r4)
                r1.f5572o = r3
            L4c:
                java.lang.String r3 = r1.f5572o
                if (r0 != 0) goto L52
                goto Lcf
            L52:
                org.json.JSONObject r4 = r1.f5580w
                android.app.Activity r5 = r1.f5561d
                r6 = 0
                if (r5 == 0) goto L62
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.getName()
                goto L63
            L62:
                r5 = r6
            L63:
                java.lang.String r7 = "data"
                java.lang.String r8 = "meta"
                if (r4 != 0) goto L6a
                goto Lc4
            L6a:
                boolean r9 = android.text.TextUtils.isEmpty(r5)
                if (r9 == 0) goto L71
                goto Lc4
            L71:
                java.lang.Object r9 = r4.get(r8)     // Catch: java.lang.Exception -> Lc4
                org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch: java.lang.Exception -> Lc4
                java.lang.String r10 = "matchAll"
                int r10 = r9.getInt(r10)     // Catch: java.lang.Exception -> Lc4
                java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Exception -> Lc4
                org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: java.lang.Exception -> Lc4
                org.json.JSONArray r11 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lc4
                r11.<init>()     // Catch: java.lang.Exception -> Lc4
                r12 = 0
                r13 = 0
            L8a:
                int r14 = r4.length()     // Catch: java.lang.Exception -> Lc4
                if (r13 >= r14) goto Laa
                java.lang.Object r14 = r4.get(r13)     // Catch: java.lang.Exception -> Lc4
                org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch: java.lang.Exception -> Lc4
                java.lang.String r15 = "page"
                java.lang.Object r15 = r14.get(r15)     // Catch: java.lang.Exception -> Lc4
                java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Exception -> Lc4
                boolean r15 = r5.equals(r15)     // Catch: java.lang.Exception -> Lc4
                if (r15 == 0) goto La7
                r11.put(r14)     // Catch: java.lang.Exception -> Lc4
            La7:
                int r13 = r13 + 1
                goto L8a
            Laa:
                if (r10 == 0) goto Lad
                goto Lb5
            Lad:
                if (r10 != 0) goto Lb6
                int r4 = r11.length()     // Catch: java.lang.Exception -> Lc4
                if (r4 == 0) goto Lb6
            Lb5:
                r12 = 1
            Lb6:
                if (r12 == 0) goto Lc4
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lc4
                r4.<init>()     // Catch: java.lang.Exception -> Lc4
                r4.put(r8, r9)     // Catch: java.lang.Exception -> Lc5
                r4.put(r7, r11)     // Catch: java.lang.Exception -> Lc5
                goto Lc5
            Lc4:
                r4 = r6
            Lc5:
                android.app.Activity r1 = r1.f5561d
                r5 = 1
                r0 = r18
                r2 = r17
                r0.m3235a(r1, r2, r3, r4, r5)
            Lcf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e2.C1042m1.b.mo3114a(android.webkit.WebView, e2.v3):void");
        }

        @Override // p036e2.InterfaceC1040m
        /* renamed from: b */
        public final void mo3115b(WebView webView, C1107v3 c1107v3) {
            webView.addJavascriptInterface(c1107v3, "WebViewInterface");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:7:0x000e, B:11:0x0010, B:13:0x0016, B:15:0x001c, B:17:0x0025, B:18:0x002c, B:19:0x003e), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray m3116a() {
        /*
            e2.x1 r0 = p036e2.C1119x1.f5553E
            java.lang.Object r1 = r0.f5557D
            monitor-enter(r1)
            android.content.Context r2 = r0.f5558a     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L10
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L41
            r0.<init>()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            goto L40
        L10:
            java.lang.String r3 = "trace_circle.data"
            java.lang.String r2 = p036e2.C1121x3.m3288a(r2, r3)     // Catch: java.lang.Throwable -> L41
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L41
            if (r3 != 0) goto L22
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L41
            r3.<init>(r2)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L41
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 != 0) goto L2b
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L41
            goto L2c
        L2b:
            r2 = r3
        L2c:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
            r0.f5556C = r3     // Catch: java.lang.Throwable -> L41
            android.content.Context r0 = r0.f5558a     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "trace_circle.data"
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L41
            p036e2.C1121x3.m3289b(r0, r4, r3)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            r0 = r2
        L40:
            return r0
        L41:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1042m1.m3116a():org.json.JSONArray");
    }
}
