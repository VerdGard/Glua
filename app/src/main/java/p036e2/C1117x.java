package p036e2;

import android.content.Context;
import android.text.TextUtils;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p018c1.C0586g;
import p036e2.C1110w;
import p120p.C1686g;

/* renamed from: e2.x */
/* loaded from: classes.dex */
public final class C1117x {

    /* renamed from: a */
    public boolean f5537a = false;

    /* renamed from: b */
    public final a f5538b;

    /* renamed from: c */
    public final a f5539c;

    /* renamed from: d */
    public boolean f5540d;

    /* renamed from: e */
    public long f5541e;

    /* renamed from: f */
    public final C1110w f5542f;

    /* renamed from: g */
    public int f5543g;

    /* renamed from: h */
    public int f5544h;

    /* renamed from: i */
    public long f5545i;

    /* renamed from: j */
    public final boolean f5546j;

    /* renamed from: k */
    public C0586g f5547k;

    /* renamed from: l */
    public C0586g f5548l;

    /* renamed from: e2.x$a */
    public static class a {

        /* renamed from: a */
        public String f5549a;

        /* renamed from: b */
        public long f5550b;

        /* renamed from: c */
        public boolean f5551c = false;
    }

    public C1117x() {
        new HashMap();
        this.f5538b = new a();
        this.f5539c = new a();
        this.f5540d = false;
        this.f5541e = 0L;
        this.f5542f = new C1110w();
        this.f5543g = 0;
        this.f5544h = 0;
        this.f5545i = 0L;
        this.f5546j = true;
    }

    /* renamed from: a */
    public final void m3274a(Context context) {
        if (this.f5542f.f5494a > 0) {
            String jSONObject = this.f5542f.m3260a().toString();
            this.f5544h = jSONObject.getBytes().length;
            StringBuilder m4107b = C1686g.m4107b(C0968b4.m2982p(context));
            m4107b.append(C1047n.f5254c);
            C1121x3.m3289b(context, m4107b.toString(), jSONObject);
        }
    }

    /* renamed from: b */
    public final void m3275b(Context context, long j7, long j8, int i7, int i8) {
        long j9 = j8 - j7;
        if (this.f5543g <= 0) {
            this.f5543g = 30000;
        }
        if (j9 > ((long) this.f5543g)) {
            if (j7 > 0) {
                if (2 == i8) {
                    this.f5542f.f5495b = j7;
                }
                C0586g c0586g = this.f5548l;
                m3276c(context, j8, false, false, c0586g != null ? c0586g.m2035a(context) : 0);
            }
            C1110w c1110w = this.f5542f;
            long j10 = this.f5545i;
            if (c1110w.f5496c <= 0) {
                c1110w.f5496c = j10;
            }
            this.f5542f.f5499f = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3276c(android.content.Context r17, long r18, boolean r20, boolean r21, int r22) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1117x.m3276c(android.content.Context, long, boolean, boolean, int):void");
    }

    /* renamed from: d */
    public final void m3277d(Context context, String str, String str2, long j7, long j8, String str3, String str4, String str5, boolean z6, boolean z7) {
        boolean z8;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
            return;
        }
        C1110w.a aVar = new C1110w.a(str3, str4, str5, j8 - j7, j7, z6, z7, C1061p.f5300l.m3152i());
        ArrayList arrayList = this.f5542f.f5500g;
        try {
            C0961a4.m2954a().getClass();
            if (C0961a4.f4941d && arrayList != null) {
                int size = arrayList.size();
                if (size != 0) {
                    C1110w.a aVar2 = (C1110w.a) arrayList.get(size - 1);
                    if (!TextUtils.isEmpty(aVar2.f5502a) && !TextUtils.isEmpty(aVar.f5502a) && aVar2.f5502a.equals(aVar.f5502a) && (z8 = aVar2.f5507f) != aVar.f5507f) {
                        if (z8) {
                            aVar2.m3262a(aVar);
                        }
                    }
                }
                arrayList.add(aVar);
            }
        } catch (Exception unused) {
        }
        this.f5542f.f5495b = j8;
        m3274a(context);
        C1061p c1061p = C1061p.f5300l;
        JSONObject jSONObject = c1061p.f5309i;
        if (TextUtils.isEmpty((jSONObject == null || jSONObject.length() <= 0) ? "" : jSONObject.toString())) {
            return;
        }
        c1061p.m3150g(context);
    }

    /* renamed from: e */
    public final void m3278e(Context context, long j7, boolean z6) {
        JSONObject jSONObject;
        if (this.f5537a) {
            return;
        }
        C1061p c1061p = C1061p.f5300l;
        c1061p.getClass();
        if (context != null) {
            StringBuilder m4107b = C1686g.m4107b(C0968b4.m2982p(context));
            m4107b.append(C1047n.f5256e);
            String sb = m4107b.toString();
            Proxy proxy = C1121x3.f5592a;
            if (context.getFileStreamPath(sb).exists()) {
                String m3288a = C1121x3.m3288a(context, sb);
                if (!TextUtils.isEmpty(m3288a)) {
                    try {
                        jSONObject = new JSONObject(m3288a);
                    } catch (Exception unused) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            JSONArray jSONArray = jSONObject.getJSONArray("pr");
                            if (jSONArray != null) {
                                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                                    if (currentTimeMillis - jSONObject2.getLong("s") <= 604800000) {
                                        c1061p.m3156n(jSONObject2);
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("ev");
                            if (jSONArray2 != null) {
                                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i8);
                                    if (currentTimeMillis - jSONObject3.getLong("t") <= 604800000) {
                                        c1061p.m3155m(jSONObject3);
                                    }
                                }
                            }
                        } catch (Exception unused3) {
                        }
                        try {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("he");
                            if (jSONObject4 != null) {
                                synchronized (C1061p.f5298j) {
                                    C1061p.f5298j = jSONObject4;
                                }
                            }
                        } catch (Exception unused4) {
                        }
                        try {
                            String optString = jSONObject.optString("pyd");
                            if (TextUtils.isEmpty(optString)) {
                                optString = "";
                            }
                            C1061p.f5299k = optString;
                        } catch (Exception unused5) {
                        }
                    }
                }
            }
        }
        C1061p c1061p2 = C1061p.f5300l;
        c1061p2.getClass();
        if (context != null) {
            StringBuilder m4107b2 = C1686g.m4107b(C0968b4.m2982p(context));
            m4107b2.append(C1047n.f5254c);
            String sb2 = m4107b2.toString();
            Proxy proxy2 = C1121x3.f5592a;
            if (context.getFileStreamPath(sb2).exists()) {
                String m3288a2 = C1121x3.m3288a(context, sb2);
                if (!TextUtils.isEmpty(m3288a2)) {
                    C1121x3.m3289b(context, sb2, new JSONObject().toString());
                    if (!TextUtils.isEmpty(m3288a2) && !m3288a2.equals(new JSONObject().toString())) {
                        try {
                            c1061p2.m3156n(new JSONObject(m3288a2));
                        } catch (JSONException unused6) {
                        }
                    }
                    c1061p2.m3150g(context);
                }
            }
        }
        C1061p.f5300l.getClass();
        C1061p.m3143k(context);
        try {
            Thread.sleep(3000L);
        } catch (Exception unused7) {
        }
        C0586g c0586g = this.f5547k;
        m3276c(context, j7, z6, true, c0586g != null ? c0586g.m2035a(context) : 0);
        this.f5537a = true;
    }
}
