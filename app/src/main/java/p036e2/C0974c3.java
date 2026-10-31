package p036e2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p120p.C1686g;

/* renamed from: e2.c3 */
/* loaded from: classes.dex */
public final class C0974c3 {

    /* renamed from: j */
    public static final C0974c3 f4986j = new C0974c3();

    /* renamed from: k */
    public static String f4987k = "";

    /* renamed from: a */
    public final Handler f4988a;

    /* renamed from: b */
    public volatile int f4989b;

    /* renamed from: c */
    public int f4990c;

    /* renamed from: d */
    public JSONObject f4991d;

    /* renamed from: e */
    public JSONArray f4992e;

    /* renamed from: f */
    public JSONArray f4993f;

    /* renamed from: g */
    public JSONArray f4994g;

    /* renamed from: h */
    public JSONArray f4995h;

    /* renamed from: i */
    public boolean f4996i;

    public C0974c3() {
        HandlerThread handlerThread = new HandlerThread("fullTraceHandleThread");
        this.f4991d = new JSONObject();
        this.f4992e = new JSONArray();
        this.f4993f = new JSONArray();
        this.f4994g = new JSONArray();
        this.f4995h = new JSONArray();
        this.f4996i = false;
        new ArrayList();
        new ArrayList();
        new ArrayList();
        handlerThread.start();
        handlerThread.setPriority(10);
        this.f4988a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: b */
    public static boolean m2989b(String str, String str2) {
        return str == str2 || !(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2));
    }

    /* renamed from: c */
    public static boolean m2990c(JSONObject jSONObject, JSONObject jSONObject2) {
        String optString = jSONObject.optString("id");
        jSONObject.optString("d");
        String optString2 = jSONObject.optString("p");
        String optString3 = jSONObject.optString("path");
        String optString4 = jSONObject.optString("title");
        String optString5 = jSONObject.optString("index");
        String optString6 = jSONObject.optString("n");
        int optInt = jSONObject.optInt("user");
        jSONObject.optInt("c");
        jSONObject.optLong("t");
        jSONObject.optString("ps");
        String optString7 = jSONObject2.optString("id");
        jSONObject2.optString("d");
        String optString8 = jSONObject2.optString("p");
        String optString9 = jSONObject2.optString("path");
        String optString10 = jSONObject2.optString("title");
        String optString11 = jSONObject2.optString("index");
        String optString12 = jSONObject2.optString("n");
        int optInt2 = jSONObject2.optInt("user");
        jSONObject2.optInt("c");
        jSONObject2.optLong("t");
        jSONObject2.optString("ps");
        return m2989b(optString, optString7) && m2989b(optString2, optString8) && m2989b(optString3, optString9) && m2989b(optString4, optString10) && m2989b(optString5, optString11) && m2989b(optString6, optString12) && optInt == optInt2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:9|(2:10|11)|(6:27|28|14|15|(2:20|21)|(1:18))|13|14|15|(0)|(0)) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray m2991d(org.json.JSONArray r5, org.json.JSONObject r6) {
        /*
            if (r6 == 0) goto L68
            if (r5 != 0) goto L6
            goto L68
        L6:
            java.lang.String r0 = "s"
            long r0 = r6.optLong(r0)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L13
            return r5
        L13:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r1 = r5.length()
            java.lang.String r2 = "p"
            r3 = 0
            if (r1 != 0) goto L3e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Exception -> L36
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L36
            r6.<init>(r5)     // Catch: java.lang.Exception -> L36
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> L33
            r5.<init>()     // Catch: java.lang.Exception -> L33
            r6.put(r2, r5)     // Catch: java.lang.Exception -> L33
            goto L38
        L33:
            r3 = r6
            goto L37
        L36:
        L37:
            r6 = r3
        L38:
            if (r6 == 0) goto L67
            r0.put(r6)
            goto L67
        L3e:
            r1 = 0
            org.json.JSONObject r5 = r5.getJSONObject(r1)     // Catch: java.lang.Exception -> L44
            goto L46
        L44:
            r5 = r3
        L46:
            if (r5 == 0) goto L4d
            org.json.JSONArray r5 = r5.getJSONArray(r2)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r5 = r3
        L4e:
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L60
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L60
            r1.<init>(r6)     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L62
            r1.put(r2, r5)     // Catch: java.lang.Exception -> L5d
            goto L62
        L5d:
            r3 = r1
            goto L61
        L60:
        L61:
            r1 = r3
        L62:
            if (r1 == 0) goto L67
            r0.put(r1)
        L67:
            return r0
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C0974c3.m2991d(org.json.JSONArray, org.json.JSONObject):org.json.JSONArray");
    }

    /* renamed from: g */
    public static void m2992g(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        long j7;
        int i7;
        String str3;
        long j8;
        String str4 = "d";
        String optString = jSONObject.optString("d");
        int optInt = jSONObject.optInt("c");
        long optLong = jSONObject.optLong("t");
        String optString2 = jSONObject.optString("ps");
        String optString3 = jSONObject2.optString("d");
        int optInt2 = jSONObject2.optInt("c");
        long optLong2 = jSONObject2.optLong("t");
        String optString4 = jSONObject2.optString("ps");
        int i8 = optInt + optInt2;
        long j9 = optLong <= optLong2 ? optLong : optLong2;
        StringBuilder sb = new StringBuilder();
        if (optLong <= optLong2) {
            sb.append(optString);
            sb.append("|");
            sb.append(optString3);
        } else {
            sb.append(optString3);
            sb.append("|");
            sb.append(optString);
        }
        String sb2 = sb.toString();
        int i9 = 0;
        long j10 = 0;
        if (optLong <= optLong2) {
            long j11 = optLong2 - optLong;
            StringBuilder sb3 = new StringBuilder();
            String[] split = optString4.split("\\|");
            if (split == null || split.length == 0) {
                str = "d";
                try {
                    j10 = Long.valueOf(optString4).longValue();
                } catch (Exception unused) {
                }
                sb3.append(j11 + j10);
            } else {
                int length = split.length;
                while (i9 < length) {
                    String str5 = split[i9];
                    if (!TextUtils.isEmpty(sb3.toString())) {
                        sb3.append("|");
                    }
                    try {
                        j8 = Long.valueOf(str5).longValue();
                        i7 = length;
                        str3 = str4;
                    } catch (Exception unused2) {
                        i7 = length;
                        str3 = str4;
                        j8 = 0;
                    }
                    sb3.append(j8 + j11);
                    i9++;
                    str4 = str3;
                    length = i7;
                }
                str = str4;
            }
            str2 = optString2 + "|" + sb3.toString();
        } else {
            str = "d";
            long j12 = optLong - optLong2;
            StringBuilder sb4 = new StringBuilder();
            String[] split2 = optString2.split("\\|");
            if (split2 == null || split2.length == 0) {
                try {
                    j10 = Long.valueOf(optString2).longValue();
                } catch (Exception unused3) {
                }
                sb4.append(j12 + j10);
            } else {
                int length2 = split2.length;
                while (i9 < length2) {
                    String str6 = split2[i9];
                    if (!TextUtils.isEmpty(sb4.toString())) {
                        sb4.append("|");
                    }
                    try {
                        j7 = Long.valueOf(str6).longValue();
                    } catch (Exception unused4) {
                        j7 = 0;
                    }
                    sb4.append(j7 + j12);
                    i9++;
                }
            }
            str2 = optString4 + "|" + sb4.toString();
        }
        try {
            jSONObject.put("c", i8);
            jSONObject.put("t", j9);
            jSONObject.put(str, sb2);
            jSONObject.put("ps", str2);
        } catch (Exception unused5) {
        }
    }

    /* renamed from: a */
    public final void m2993a(Context context, String str, String str2, long j7, String str3, JSONArray jSONArray, String str4, JSONArray jSONArray2, String str5, Map map, boolean z6, JSONObject jSONObject, String str6, JSONArray jSONArray3) {
        C0961a4.m2954a().getClass();
        if (C0961a4.f4941d) {
            this.f4988a.post(new RunnableC1113w2(this, context, str, str2, j7, str3, jSONArray, str4, jSONArray2, str5, map, z6, jSONObject, str6, jSONArray3));
        }
    }

    /* renamed from: e */
    public final void m2994e(Context context, JSONObject jSONObject) {
        C1054o.m3127l().f5267a.m3174b(context, jSONObject);
        try {
            jSONObject.put("t", System.currentTimeMillis());
            jSONObject.put("sq", this.f4990c);
            jSONObject.put("ss", C0991f.m3015d().f5048c.f5542f.f5494a);
            jSONObject.put("at", "1");
            C1054o.m3127l().getClass();
            jSONObject.put("sign", C1054o.m3126k());
            String str = C1061p.f5300l.f5307g.get("sessionJson");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jSONObject.put("py", str);
            C1054o.m3127l().getClass();
            jSONObject.put("plt", "0");
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final void m2995f(Context context, boolean z6) {
        if (z6) {
            this.f4990c = 0;
        } else {
            this.f4990c++;
        }
        try {
            m2994e(context, this.f4991d);
        } catch (Exception unused) {
        }
        if (this.f4992e.length() == 0 && this.f4993f.length() == 0 && this.f4994g.length() == 0 && this.f4995h.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("he", this.f4991d);
        } catch (Exception unused2) {
        }
        try {
            jSONObject.put("pr", this.f4993f);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put("ev", this.f4992e);
        } catch (Exception unused4) {
        }
        try {
            jSONObject.put("ti", this.f4994g);
        } catch (Exception unused5) {
        }
        try {
            jSONObject.put("sv", this.f4995h);
        } catch (Exception unused6) {
        }
        try {
            jSONObject.put("pd", C1092t2.f5443g.m3221b(1));
        } catch (Exception unused7) {
        }
        try {
            jSONObject.put("ed", C1092t2.f5443g.m3221b(0));
        } catch (Exception unused8) {
        }
        try {
            jSONObject.put("sd", C1092t2.f5443g.m3221b(2));
        } catch (Exception unused9) {
        }
        try {
            jSONObject.put("pyd", f4987k);
        } catch (Exception unused10) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("failed_cnt", 0);
        } catch (Exception unused11) {
        }
        try {
            jSONObject.put("trace", jSONObject2);
        } catch (Exception unused12) {
        }
        String jSONObject3 = jSONObject.toString();
        C1096u.f5460f.getClass();
        C1096u.m3229d(context, jSONObject3, true);
        m2998j(context, !z6);
        this.f4996i = true;
    }

    /* renamed from: h */
    public final boolean m2996h(String str) {
        return (str != null ? str.getBytes().length : 0) + this.f4989b > 184320;
    }

    /* renamed from: i */
    public final void m2997i(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("he", new JSONObject(this.f4991d.toString()));
            jSONObject.put("pr", new JSONArray(this.f4993f.toString()));
            jSONObject.put("ev", new JSONArray(this.f4992e.toString()));
            jSONObject.put("ti", new JSONArray(this.f4994g.toString()));
            jSONObject.put("sv", new JSONArray(this.f4995h.toString()));
            jSONObject.put("pyd", f4987k);
            C1092t2 c1092t2 = C1092t2.f5443g;
            jSONObject.put("pd", c1092t2.m3221b(1));
            jSONObject.put("ed", c1092t2.m3221b(0));
            jSONObject.put("sd", c1092t2.m3221b(2));
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        int length = jSONObject2.getBytes().length;
        if (length >= 184320) {
            return;
        }
        this.f4989b = length;
        StringBuilder m4107b = C1686g.m4107b(C0968b4.m2982p(context));
        m4107b.append(C1047n.f5257f);
        C1121x3.m3289b(context, m4107b.toString(), jSONObject2);
    }

    /* renamed from: j */
    public final void m2998j(Context context, boolean z6) {
        this.f4991d = new JSONObject();
        C1054o.m3127l().f5267a.m3174b(context, this.f4991d);
        this.f4993f = new JSONArray();
        this.f4992e = new JSONArray();
        this.f4994g = new JSONArray();
        this.f4995h = new JSONArray();
        if (!z6) {
            C1092t2 c1092t2 = C1092t2.f5443g;
            c1092t2.m3222d(0);
            c1092t2.m3222d(2);
            c1092t2.m3222d(1);
        }
        m2997i(context);
    }

    /* renamed from: k */
    public final void m2999k(Context context) {
        this.f4993f = m2991d(this.f4993f, C0991f.m3015d().f5048c.f5542f.m3261c());
        m2995f(context, false);
        this.f4990c++;
    }
}
