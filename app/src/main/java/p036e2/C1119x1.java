package p036e2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.json.JSONArray;
import org.json.JSONObject;
import p036e2.C1091t1;
import p036e2.C1098u1;

/* renamed from: e2.x1 */
/* loaded from: classes.dex */
public final class C1119x1 {

    /* renamed from: E */
    public static final C1119x1 f5553E = new C1119x1();

    /* renamed from: a */
    public Context f5558a;

    /* renamed from: b */
    public C1098u1 f5559b;

    /* renamed from: c */
    public C1091t1 f5560c;

    /* renamed from: d */
    public Activity f5561d;

    /* renamed from: f */
    public final c f5563f;

    /* renamed from: g */
    public final e f5564g;

    /* renamed from: h */
    public volatile boolean f5565h;

    /* renamed from: i */
    public volatile boolean f5566i;

    /* renamed from: j */
    public volatile boolean f5567j;

    /* renamed from: k */
    public volatile boolean f5568k;

    /* renamed from: l */
    public volatile boolean f5569l;

    /* renamed from: m */
    public volatile boolean f5570m;

    /* renamed from: n */
    public volatile String f5571n;

    /* renamed from: o */
    public volatile String f5572o;

    /* renamed from: p */
    public volatile String f5573p;

    /* renamed from: q */
    public long f5574q;

    /* renamed from: r */
    public long f5575r;

    /* renamed from: s */
    public long f5576s;

    /* renamed from: t */
    public String f5577t;

    /* renamed from: u */
    public boolean f5578u;

    /* renamed from: v */
    public String f5579v;

    /* renamed from: w */
    public final JSONObject f5580w = new JSONObject();

    /* renamed from: x */
    public final JSONObject f5581x = new JSONObject();

    /* renamed from: y */
    public final C1058o3 f5582y = C1058o3.f5276k;

    /* renamed from: z */
    public final a f5583z = new a(Looper.getMainLooper());

    /* renamed from: A */
    public final b f5554A = new b();

    /* renamed from: B */
    public boolean f5555B = true;

    /* renamed from: C */
    public JSONArray f5556C = new JSONArray();

    /* renamed from: D */
    public final Object f5557D = new Object();

    /* renamed from: e */
    public final C1126y1 f5562e = new C1126y1();

    /* renamed from: e2.x1$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i7 = message.what;
            C1119x1 c1119x1 = C1119x1.this;
            switch (i7) {
                case 32:
                    c1119x1.m3283b();
                    break;
                case 33:
                    c1119x1.m3284c();
                    break;
                case 34:
                    c1119x1.m3285d();
                    break;
            }
        }
    }

    /* renamed from: e2.x1$b */
    public class b implements C1098u1.b {
        public b() {
        }
    }

    /* renamed from: e2.x1$c */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 21:
                    C1119x1 c1119x1 = C1119x1.this;
                    if (!c1119x1.f5566i) {
                        boolean m3159b = C1065p3.m3159b(c1119x1.f5558a, c1119x1.f5577t, 0);
                        c1119x1.f5566i = true;
                        if (m3159b) {
                            c1119x1.f5571n = C1121x3.m3288a(c1119x1.f5558a, "mtj_vizParser.js");
                            break;
                        }
                    }
                    break;
                case 22:
                    C1119x1 c1119x12 = C1119x1.this;
                    if (!c1119x12.f5567j) {
                        boolean m3159b2 = C1065p3.m3159b(c1119x12.f5558a, c1119x12.f5577t, 1);
                        c1119x12.f5567j = true;
                        if (m3159b2) {
                            c1119x12.f5572o = C1121x3.m3288a(c1119x12.f5558a, "mtj_autoTracker.js");
                            break;
                        }
                    }
                    break;
                case 23:
                    C1119x1 c1119x13 = C1119x1.this;
                    if (!c1119x13.f5568k) {
                        boolean m3159b3 = C1065p3.m3159b(c1119x13.f5558a, c1119x13.f5577t, 2);
                        c1119x13.f5568k = true;
                        if (m3159b3) {
                            c1119x13.f5583z.sendMessage(c1119x13.f5583z.obtainMessage(34));
                            break;
                        }
                    }
                    break;
                case 24:
                    Bundle data = message.getData();
                    if (data != null) {
                        String string = data.getString("autoconfig.key");
                        C1119x1 c1119x14 = C1119x1.this;
                        if (c1119x14.f5558a != null && !TextUtils.isEmpty(string)) {
                            Context context = c1119x14.f5558a;
                            context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).edit().putLong("autotrace_config_fetch_time", System.currentTimeMillis()).commit();
                            C1121x3.m3289b(c1119x14.f5558a, "mtj_auto.config", string);
                            a aVar = c1119x14.f5583z;
                            aVar.sendMessage(aVar.obtainMessage(34));
                            break;
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: e2.x1$d */
    public class d implements C1091t1.a {
        public d() {
        }
    }

    /* renamed from: e2.x1$e */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x017a, code lost:
        
            if (r7 != null) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0086 A[Catch: all -> 0x00be, TryCatch #8 {all -> 0x00be, blocks: (B:42:0x006f, B:52:0x0075, B:45:0x007b, B:47:0x0086, B:48:0x008a), top: B:41:0x006f }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r10) {
            /*
                Method dump skipped, instructions count: 593
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e2.C1119x1.e.handleMessage(android.os.Message):void");
        }
    }

    public C1119x1() {
        HandlerThread handlerThread = new HandlerThread("crawlerThread");
        handlerThread.start();
        this.f5564g = new e(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("downloadThread");
        handlerThread2.start();
        this.f5563f = new c(handlerThread2.getLooper());
    }

    /* renamed from: a */
    public final void m3282a(int i7, String str) {
        synchronized (this.f5557D) {
            if (this.f5558a == null) {
                return;
            }
            if (str == null) {
                str = "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean m2981o = C0968b4.m2981o(this.f5558a);
            StringBuilder sb = new StringBuilder();
            sb.append(m2981o ? 1 : 0);
            sb.append("|");
            sb.append(str);
            this.f5556C.put(i7 + "_" + currentTimeMillis + "_" + sb.toString());
            C1121x3.m3289b(this.f5558a, "trace_circle.data", this.f5556C.toString());
        }
    }

    /* renamed from: b */
    public final void m3283b() {
        ViewGroup viewGroup;
        Activity activity = this.f5561d;
        if (activity == null) {
            return;
        }
        try {
            viewGroup = (ViewGroup) C1086s3.m3190a(activity).findViewById(android.R.id.content);
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup != null && C1084s1.m3176a(viewGroup) == null) {
            C1049n1 c1049n1 = new C1049n1(activity);
            c1049n1.setBackgroundColor(-16745729);
            c1049n1.setGravity(17);
            c1049n1.setText("连接中");
            c1049n1.setTag(-5000, "baidu_mtj_edit_txtview");
            viewGroup.post(new RunnableC1056o1(viewGroup, activity, c1049n1));
            viewGroup.addView(c1049n1);
            c1049n1.setOnTouchListener(new ViewOnTouchListenerC1063p1(activity, (View) c1049n1.getParent()));
        }
    }

    /* renamed from: c */
    public final void m3284c() {
        ViewGroup viewGroup;
        View m3176a;
        Activity activity = this.f5561d;
        if (activity == null) {
            return;
        }
        try {
            viewGroup = (ViewGroup) C1086s3.m3190a(activity).findViewById(android.R.id.content);
        } catch (Exception unused) {
            viewGroup = null;
        }
        if (viewGroup == null || (m3176a = C1084s1.m3176a(viewGroup)) == null) {
            return;
        }
        viewGroup.removeView(m3176a);
    }

    /* renamed from: d */
    public final void m3285d() {
        this.f5573p = C1121x3.m3288a(this.f5558a, "mtj_auto.config");
        String str = this.f5573p;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = (JSONObject) jSONObject.get("meta");
                JSONArray jSONArray = (JSONArray) jSONObject.get("data");
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray.get(i7);
                    String str2 = (String) jSONObject3.opt("webLayout");
                    String str3 = (String) jSONObject3.opt("url");
                    if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                        jSONArray3.put(jSONObject3);
                    } else {
                        jSONArray2.put(jSONObject3);
                    }
                }
                JSONObject jSONObject4 = this.f5580w;
                jSONObject4.put("meta", jSONObject2);
                jSONObject4.put("data", jSONArray2);
                JSONObject jSONObject5 = this.f5581x;
                jSONObject5.put("meta", jSONObject2);
                jSONObject5.put("data", jSONArray3);
            } catch (Exception unused) {
            }
        }
        String str4 = this.f5573p;
        if (C1042m1.f5244a) {
            C1009h3.f5097k.getClass();
            C0981d3 c0981d3 = C0981d3.f5007b;
            if (!TextUtils.isEmpty(str4)) {
                try {
                    JSONObject jSONObject6 = (JSONObject) new JSONObject(str4).opt("full");
                    c0981d3.f5008a = (jSONObject6 != null ? jSONObject6.optInt("close") : 0) != 0;
                } catch (Exception unused2) {
                }
            }
        }
        String str5 = this.f5573p;
        C1085s2 c1085s2 = C1085s2.f5407x;
        if (c1085s2.m3182e()) {
            return;
        }
        c1085s2.f5410c.post(new RunnableC1001g2(str5));
    }

    /* renamed from: e */
    public final void m3286e() {
        if (m3287f()) {
            return;
        }
        C1023j3 c1023j3 = C1023j3.f5170m;
        c1023j3.m382g(3, "autotrace: gesture success");
        m3282a(0, "");
        if (!C0968b4.m2981o(this.f5558a)) {
            c1023j3.m382g(3, "autotrace: network invalid, failed to connect to circle server");
        } else {
            e eVar = this.f5564g;
            eVar.sendMessage(eVar.obtainMessage(1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3287f() {
        /*
            r5 = this;
            e2.t1 r0 = r5.f5560c
            r1 = 0
            if (r0 == 0) goto L26
            e2.t1$b r0 = r0.f5441b
            e2.j4 r0 = r0.f5235m
            int r2 = r0.f5176d
            r3 = 5
            r4 = 1
            if (r2 != r3) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 != 0) goto L22
            r3 = 4
            if (r2 != r3) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 != 0) goto L22
            boolean r0 = r0.f5175c
            if (r0 != 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 == 0) goto L26
            r1 = 1
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1119x1.m3287f():boolean");
    }
}
