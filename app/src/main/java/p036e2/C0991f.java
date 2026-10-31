package p036e2;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: e2.f */
/* loaded from: classes.dex */
public final class C0991f {

    /* renamed from: h */
    public static C0991f f5045h;

    /* renamed from: a */
    public final Handler f5046a;

    /* renamed from: c */
    public final C1117x f5048c;

    /* renamed from: d */
    public final C1068q f5049d;

    /* renamed from: e */
    public RunnableC1019j f5050e;

    /* renamed from: g */
    public final Handler f5052g;

    /* renamed from: b */
    public volatile boolean f5047b = false;

    /* renamed from: f */
    public volatile boolean f5051f = false;

    /* renamed from: e2.f$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f5053c;

        public a(Context context) {
            this.f5053c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z6;
            EnumC1102u5 enumC1102u5;
            try {
                ActivityManager activityManager = (ActivityManager) this.f5053c.getSystemService("activity");
                if (activityManager != null) {
                    try {
                        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
                        int i7 = 0;
                        while (runningServices != null) {
                            if (i7 >= runningServices.size()) {
                                break;
                            }
                            if ("com.baidu.bottom.service.BottomService".equals(runningServices.get(i7).service.getClassName())) {
                                z6 = true;
                                break;
                            }
                            i7++;
                        }
                    } catch (Exception e7) {
                        C1016i3.f5129e.m383h(e7);
                    }
                }
                z6 = false;
                if (!z6) {
                    EnumC1102u5[] values = EnumC1102u5.values();
                    int length = values.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            enumC1102u5 = EnumC1102u5.f5477e;
                            break;
                        }
                        enumC1102u5 = values[i8];
                        if (enumC1102u5.f5479c == 2) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    enumC1102u5.mo3232a(this.f5053c);
                }
            } catch (Throwable unused) {
            }
            C0991f.this.f5051f = false;
        }
    }

    /* renamed from: e2.f$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f5055c;

        public b(Context context) {
            this.f5055c = context;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:5|6|7|(2:11|(3:17|(1:19)|20))|22|(2:23|24)|(3:26|27|(1:29)(10:30|(3:64|65|66)(2:32|(3:34|35|36))|37|38|(2:40|(1:44))|46|47|(4:49|50|(1:52)(2:55|(1:57))|53)|58|59))|69|70|37|38|(0)|46|47|(0)|58|59) */
        /* JADX WARN: Can't wrap try/catch for region: R(18:5|6|7|(2:11|(3:17|(1:19)|20))|22|23|24|(3:26|27|(1:29)(10:30|(3:64|65|66)(2:32|(3:34|35|36))|37|38|(2:40|(1:44))|46|47|(4:49|50|(1:52)(2:55|(1:57))|53)|58|59))|69|70|37|38|(0)|46|47|(0)|58|59) */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c5 A[Catch: Exception -> 0x00e2, TryCatch #5 {Exception -> 0x00e2, blocks: (B:38:0x00b9, B:40:0x00c5, B:44:0x00d3), top: B:37:0x00b9 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00ee A[Catch: Exception -> 0x011b, TRY_LEAVE, TryCatch #2 {Exception -> 0x011b, blocks: (B:47:0x00e2, B:49:0x00ee, B:52:0x00f6, B:53:0x0102, B:55:0x0106, B:57:0x010e), top: B:46:0x00e2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e2.C0991f.b.run():void");
        }
    }

    /* renamed from: e2.f$c */
    public class c implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ WeakReference f5057c;

        /* renamed from: e */
        public final /* synthetic */ boolean f5058e;

        /* renamed from: m */
        public final /* synthetic */ Context f5059m;

        public c(WeakReference weakReference, boolean z6, Context context) {
            this.f5057c = weakReference;
            this.f5058e = z6;
            this.f5059m = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e2.C0991f.c.run():void");
        }
    }

    public C0991f() {
        HandlerThread handlerThread = new HandlerThread("BDStatCore", 10);
        handlerThread.start();
        this.f5046a = new Handler(handlerThread.getLooper());
        this.f5048c = new C1117x();
        this.f5049d = new C1068q();
        HandlerThread handlerThread2 = new HandlerThread("dataAnalyzeThread");
        handlerThread2.start();
        handlerThread2.setPriority(10);
        this.f5052g = new Handler(handlerThread2.getLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m3014a(p036e2.C0991f r2, java.lang.String r3, java.lang.String r4, int r5, long r6, java.util.Map r8) {
        /*
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r8 == 0) goto L1a
            int r0 = r8.size()
            if (r0 == 0) goto L1a
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L1a
            r0.<init>(r8)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = " eventId "
            r8.<init>(r1)
            r8.append(r3)
            java.lang.String r3 = ", with eventLabel "
            r8.append(r3)
            r8.append(r4)
            java.lang.String r3 = ", with acc "
            r8.append(r3)
            r8.append(r5)
            java.lang.String r3 = r8.toString()
            r2.append(r3)
            r3 = 0
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ", with duration "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
        L53:
            if (r0 == 0) goto L6c
            int r3 = r0.length()
            if (r3 == 0) goto L6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ", with attributes "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
        L6c:
            java.lang.String r2 = r2.toString()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C0991f.m3014a(e2.f, java.lang.String, java.lang.String, int, long, java.util.Map):java.lang.String");
    }

    /* renamed from: d */
    public static C0991f m3015d() {
        if (f5045h == null) {
            synchronized (C0991f.class) {
                if (f5045h == null) {
                    f5045h = new C0991f();
                }
            }
        }
        return f5045h;
    }

    /* renamed from: b */
    public final void m3016b(Context context) {
        Handler handler;
        C0961a4.m2954a().getClass();
        if (!C0961a4.f4940c || this.f5051f || context == null || (handler = this.f5052g) == null) {
            return;
        }
        handler.postDelayed(new a(context), 5000L);
        this.f5051f = true;
    }

    /* renamed from: c */
    public final void m3017c(Context context) {
        String m3131e = C1054o.m3127l().m3131e(context);
        if (!TextUtils.isEmpty(m3131e) && C1042m1.f5244a && !C0981d3.f5007b.f5008a) {
            C1009h3.f5097k.f5106h = m3131e;
        }
        if (this.f5047b) {
            return;
        }
        synchronized (C0970c.class) {
            if (!C0970c.f4976a) {
                C0970c.m2987a();
                C0963b c0963b = C0963b.f4942c;
                c0963b.m2956b();
                c0963b.m2955a(C0970c.f4977b);
                c0963b.m2955a(C0970c.f4979d);
                c0963b.m2955a(C0970c.f4978c);
                c0963b.m2955a(C0970c.f4980e);
                if (!c0963b.f4943a) {
                    try {
                        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0956a(c0963b));
                    } catch (Exception unused) {
                        C1023j3.f5170m.m382g(3, "registerActivityLifecycleCallbacks encounter exception");
                    }
                    c0963b.f4943a = true;
                }
                C0970c.f4976a = true;
            }
        }
        this.f5046a.post(new b(context));
    }

    /* renamed from: e */
    public final void m3018e(Context context, String str, long j7, JSONArray jSONArray, JSONArray jSONArray2, String str2, String str3, String str4, Map map, boolean z6) {
        if (context == null) {
            return;
        }
        m3017c(context);
        m3016b(context);
        this.f5046a.post(new RunnableC0984e(this, str, context, j7, map, jSONArray, jSONArray2, str2, str3, str4, z6));
    }

    /* renamed from: f */
    public final void m3019f(Activity activity, boolean z6) {
        Context applicationContext;
        if (activity == null || (applicationContext = activity.getApplicationContext()) == null) {
            return;
        }
        m3017c(applicationContext);
        this.f5046a.post(new RunnableC1026k(this, new WeakReference(activity), z6, applicationContext));
    }

    /* renamed from: g */
    public final void m3020g(Activity activity, boolean z6) {
        Context applicationContext;
        if (activity == null || (applicationContext = activity.getApplicationContext()) == null) {
            return;
        }
        m3017c(applicationContext);
        m3016b(applicationContext);
        this.f5046a.post(new c(new WeakReference(activity), z6, applicationContext));
    }
}
