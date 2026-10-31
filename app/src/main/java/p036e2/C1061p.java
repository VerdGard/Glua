package p036e2;

import android.content.Context;
import android.text.TextUtils;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p120p.C1686g;

/* renamed from: e2.p */
/* loaded from: classes.dex */
public final class C1061p {

    /* renamed from: j */
    public static JSONObject f5298j = new JSONObject();

    /* renamed from: k */
    public static String f5299k = "";

    /* renamed from: l */
    public static final C1061p f5300l = new C1061p();

    /* renamed from: a */
    public JSONArray f5301a = new JSONArray();

    /* renamed from: b */
    public JSONArray f5302b = new JSONArray();

    /* renamed from: c */
    public JSONArray f5303c = new JSONArray();

    /* renamed from: d */
    public boolean f5304d = false;

    /* renamed from: e */
    public volatile int f5305e = 0;

    /* renamed from: f */
    public boolean f5306f = false;

    /* renamed from: g */
    public final HashMap<String, String> f5307g = new HashMap<>();

    /* renamed from: h */
    public final List<String> f5308h = Collections.synchronizedList(new ArrayList());

    /* renamed from: i */
    public final JSONObject f5309i = new JSONObject();

    /* renamed from: b */
    public static void m3140b(Context context, String str, boolean z6) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONArray optJSONArray3;
        JSONArray optJSONArray4;
        C1096u.f5460f.getClass();
        boolean z7 = false;
        C1096u.m3229d(context, str, false);
        C1023j3.f5170m.m382g(3, "Save log: " + str);
        C0981d3 c0981d3 = C0981d3.f5007b;
        if (!z6) {
            C0974c3 c0974c3 = C0974c3.f4986j;
            if (c0974c3.f4990c == 0 && c0974c3.f4996i) {
                z7 = true;
            }
            if (C1042m1.f5244a && !c0981d3.f5008a) {
                c0974c3.f4988a.post(new RunnableC1120x2(c0974c3, context, z7));
                return;
            }
            return;
        }
        if (C1042m1.f5244a && !c0981d3.f5008a) {
            C0974c3 c0974c32 = C0974c3.f4986j;
            if (context == null) {
                c0974c32.getClass();
                return;
            }
            c0974c32.f4996i = true;
            c0974c32.f4990c = 0;
            StringBuilder m4107b = C1686g.m4107b(C0968b4.m2982p(context));
            m4107b.append(C1047n.f5257f);
            String sb = m4107b.toString();
            Proxy proxy = C1121x3.f5592a;
            if (context.getFileStreamPath(sb).exists()) {
                String m3288a = C1121x3.m3288a(context, sb);
                if (TextUtils.isEmpty(m3288a)) {
                    return;
                }
                try {
                    jSONObject = new JSONObject(m3288a);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return;
                }
                try {
                    optJSONArray = jSONObject.optJSONArray("ev");
                    optJSONArray2 = jSONObject.optJSONArray("pr");
                    optJSONArray3 = jSONObject.optJSONArray("ti");
                    optJSONArray4 = jSONObject.optJSONArray("sv");
                } catch (Exception unused2) {
                }
                if ((optJSONArray != null && optJSONArray.length() != 0) || ((optJSONArray2 != null && optJSONArray2.length() != 0) || ((optJSONArray3 != null && optJSONArray3.length() != 0) || (optJSONArray4 != null && optJSONArray4.length() != 0)))) {
                    c0974c32.m2994e(context, jSONObject.getJSONObject("he"));
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("failed_cnt", 0);
                    } catch (Exception unused3) {
                    }
                    try {
                        jSONObject.put("trace", jSONObject2);
                    } catch (Exception unused4) {
                    }
                    m3288a = jSONObject.toString();
                    C1096u.f5460f.getClass();
                    C1096u.m3229d(context, m3288a, true);
                    c0974c32.m2998j(context, false);
                    c0974c32.f4996i = false;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:18|(3:19|20|21)|(36:25|26|27|(2:31|(5:34|35|(2:39|40)|41|32))|45|46|(28:48|49|(1:51)|52|(1:55)|56|(4:58|(1:(2:159|64))(1:62)|63|64)(1:160)|65|(1:157)(1:73)|74|(17:153|154|77|(1:152)(1:81)|82|(1:84)|85|(7:147|148|149|89|(4:138|(3:143|144|(1:142))|140|(0))(8:96|(3:127|128|(3:130|(3:133|134|131)|135))|98|(2:99|(6:101|102|103|105|106|(2:108|109)(2:121|122))(2:125|126))|(2:117|118)|111|(1:113)|114)|115|116)(1:87)|88|89|(1:91)|138|(0)|140|(0)|115|116)|76|77|(1:79)|152|82|(0)|85|(0)(0)|88|89|(0)|138|(0)|140|(0)|115|116)|162|49|(0)|52|(1:55)|56|(0)(0)|65|(1:67)|157|74|(0)|76|77|(0)|152|82|(0)|85|(0)(0)|88|89|(0)|138|(0)|140|(0)|115|116)|165|26|27|(3:29|31|(1:32))|45|46|(0)|162|49|(0)|52|(0)|56|(0)(0)|65|(0)|157|74|(0)|76|77|(0)|152|82|(0)|85|(0)(0)|88|89|(0)|138|(0)|140|(0)|115|116) */
    /* JADX WARN: Can't wrap try/catch for region: R(41:18|19|20|21|(36:25|26|27|(2:31|(5:34|35|(2:39|40)|41|32))|45|46|(28:48|49|(1:51)|52|(1:55)|56|(4:58|(1:(2:159|64))(1:62)|63|64)(1:160)|65|(1:157)(1:73)|74|(17:153|154|77|(1:152)(1:81)|82|(1:84)|85|(7:147|148|149|89|(4:138|(3:143|144|(1:142))|140|(0))(8:96|(3:127|128|(3:130|(3:133|134|131)|135))|98|(2:99|(6:101|102|103|105|106|(2:108|109)(2:121|122))(2:125|126))|(2:117|118)|111|(1:113)|114)|115|116)(1:87)|88|89|(1:91)|138|(0)|140|(0)|115|116)|76|77|(1:79)|152|82|(0)|85|(0)(0)|88|89|(0)|138|(0)|140|(0)|115|116)|162|49|(0)|52|(1:55)|56|(0)(0)|65|(1:67)|157|74|(0)|76|77|(0)|152|82|(0)|85|(0)(0)|88|89|(0)|138|(0)|140|(0)|115|116)|165|26|27|(3:29|31|(1:32))|45|46|(0)|162|49|(0)|52|(0)|56|(0)(0)|65|(0)|157|74|(0)|76|77|(0)|152|82|(0)|85|(0)(0)|88|89|(0)|138|(0)|140|(0)|115|116) */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0259 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[Catch: Exception -> 0x0082, TRY_LEAVE, TryCatch #12 {Exception -> 0x0082, blocks: (B:27:0x004e, B:29:0x0056, B:32:0x005d, B:34:0x0063), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088 A[Catch: Exception -> 0x008d, TRY_LEAVE, TryCatch #2 {Exception -> 0x008d, blocks: (B:46:0x0082, B:48:0x0088), top: B:45:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b5  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3141c(android.content.Context r17, org.json.JSONObject r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1061p.m3141c(android.content.Context, org.json.JSONObject, boolean):void");
    }

    /* renamed from: d */
    public static void m3142d(JSONObject jSONObject, String str, Object obj) {
        if (!jSONObject.has("visit")) {
            try {
                jSONObject.put("visit", new JSONObject());
            } catch (Exception unused) {
            }
        }
        try {
            ((JSONObject) jSONObject.get("visit")).put(str, obj);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: k */
    public static void m3143k(Context context) {
        synchronized (f5298j) {
            C1054o.m3127l().f5267a.m3174b(context, f5298j);
        }
    }

    /* renamed from: o */
    public static String m3144o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith("_")) {
            str = str.replaceFirst("_", "");
        }
        if (str.endsWith("_")) {
            str = str.substring(0, str.length() - 1);
        }
        String replace = str.replace("null", "");
        return TextUtils.isEmpty(replace) ? "" : replace;
    }

    /* renamed from: q */
    public static void m3145q(String str, StringBuffer stringBuffer, String str2, int i7) {
        if (i7 >= 0 && str.equals(str2)) {
            if (!TextUtils.isEmpty(stringBuffer)) {
                stringBuffer.append("_");
            }
            stringBuffer.append(i7);
        }
    }

    /* renamed from: r */
    public static void m3146r(String str) {
        try {
            String str2 = "";
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            f5299k = str;
            C0974c3.f4986j.getClass();
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            C0974c3.f4987k = str2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void m3147a(Context context) {
        synchronized (this.f5302b) {
            this.f5302b = new JSONArray();
        }
        synchronized (this.f5301a) {
            this.f5301a = new JSONArray();
        }
        synchronized (this.f5303c) {
            this.f5303c = new JSONArray();
        }
        m3150g(context);
    }

    /* renamed from: e */
    public final void m3148e(Context context) {
        this.f5304d = false;
        String optString = f5298j.optString("dd");
        if (!TextUtils.isEmpty(optString)) {
            context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).edit().putString("encrypt_device_id", optString).commit();
        }
        synchronized (f5298j) {
            f5298j = new JSONObject();
        }
        m3143k(context);
        m3147a(context);
    }

    /* renamed from: f */
    public final void m3149f(String str) {
        String str2;
        boolean equals = str.equals("0");
        HashMap<String, String> hashMap = this.f5307g;
        if (equals) {
            str2 = "uidPy";
        } else if (str.equals("1")) {
            str2 = "userPy";
        } else if (str.equals("2")) {
            hashMap.put("sessionPy", "");
            str2 = "sessionJson";
        } else if (str.equals("3")) {
            str2 = "eventPy";
        } else if (!str.equals("4")) {
            return;
        } else {
            str2 = "pagePy";
        }
        hashMap.put(str2, "");
    }

    /* renamed from: g */
    public final void m3150g(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            synchronized (this.f5301a) {
                jSONObject.put("pr", new JSONArray(this.f5301a.toString()));
            }
            synchronized (this.f5302b) {
                jSONObject.put("ev", new JSONArray(this.f5302b.toString()));
            }
            synchronized (f5298j) {
                jSONObject.put("he", new JSONObject(f5298j.toString()));
            }
            jSONObject.put("pyd", f5299k);
        } catch (Exception unused) {
        }
        String jSONObject2 = jSONObject.toString();
        if (this.f5304d) {
            C1023j3.f5170m.m382g(3, "[WARNING] stat cache exceed 184320 Bytes, ignored");
            return;
        }
        int length = jSONObject2.getBytes().length;
        if (length >= 184320) {
            this.f5304d = true;
            return;
        }
        this.f5305e = length;
        StringBuilder m4107b = C1686g.m4107b(C0968b4.m2982p(context));
        m4107b.append(C1047n.f5256e);
        C1121x3.m3289b(context, m4107b.toString(), jSONObject2);
        synchronized (this.f5303c) {
            C1121x3.m3289b(context, C1047n.f5255d, this.f5303c.toString());
        }
    }

    /* renamed from: h */
    public final String m3151h() {
        String str = this.f5307g.get("eventPy");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return m3144o(m3153j() + "_" + str);
    }

    /* renamed from: i */
    public final String m3152i() {
        String str = this.f5307g.get("pagePy");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        return m3144o(m3153j() + "_" + str);
    }

    /* renamed from: j */
    public final String m3153j() {
        HashMap<String, String> hashMap = this.f5307g;
        String str = hashMap.get("sessionPy");
        String str2 = hashMap.get("userPy");
        String str3 = hashMap.get("uidPy");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return m3144o(m3144o(str + "_" + str3) + "_" + str2);
    }

    /* renamed from: l */
    public final void m3154l(Context context) {
        String string = context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getString("user_property", "");
        if (!TextUtils.isEmpty(string)) {
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray jSONArray = (JSONArray) jSONObject.get(next);
                    if (jSONArray != null && jSONArray.length() > 0) {
                        hashMap.put(next, jSONArray.optString(0));
                    }
                }
            } catch (Exception unused) {
            }
            if (hashMap.size() > 0) {
                m3157p(new HashMap(hashMap), "1");
            }
        }
        String string2 = context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).getString("custom_userid", "");
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("uid_", string2);
        m3157p(new HashMap(hashMap2), "0");
    }

    /* renamed from: m */
    public final void m3155m(JSONObject jSONObject) {
        if ((jSONObject.toString().getBytes().length + C0991f.m3015d().f5048c.f5544h) + this.f5305e > 184320) {
            C1023j3.f5170m.m382g(5, "[WARNING] data to put exceed limit, ignored");
        } else {
            synchronized (this.f5302b) {
                C1068q.m3162c(this.f5302b, jSONObject);
            }
        }
    }

    /* renamed from: n */
    public final void m3156n(JSONObject jSONObject) {
        if ((jSONObject.toString().getBytes().length + C0991f.m3015d().f5048c.f5544h) + this.f5305e > 184320) {
            C1023j3.f5170m.m382g(5, "[WARNING] data to put exceed limit, ignored");
        } else {
            synchronized (this.f5301a) {
                try {
                    this.f5301a.put(this.f5301a.length(), jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01de, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e0, code lost:
    
        r14.put("sessionPy", r5.toString());
        r0 = "sessionJson";
        r2 = r16.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
    
        if (r27.equals("3") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fa, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fc, code lost:
    
        r0 = "eventPy";
        r2 = r12.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:
    
        if (r27.equals("4") == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0210, code lost:
    
        if (android.text.TextUtils.isEmpty(r17) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0212, code lost:
    
        r0 = "pagePy";
        r2 = r17.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b8, code lost:
    
        if (android.text.TextUtils.isEmpty(r7) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ba, code lost:
    
        r0 = "uidPy";
        r2 = r7.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        r5 = r10;
        r8 = r8.toString();
        r0 = r27.equals("0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
    
        r14 = r25.f5307g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b2, code lost:
    
        if (r0 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c5, code lost:
    
        if (r27.equals("1") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01cb, code lost:
    
        if (android.text.TextUtils.isEmpty(r9) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cd, code lost:
    
        r0 = "userPy";
        r2 = r9.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0202, code lost:
    
        r14.put(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021d, code lost:
    
        if (r27.equals("2") == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x021f, code lost:
    
        p036e2.C1054o.m3127l().f5267a.f5375E = r16.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022d, code lost:
    
        if (r25.f5306f == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022f, code lost:
    
        m3146r(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d8, code lost:
    
        if (r27.equals("2") == false) goto L77;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3157p(java.util.HashMap r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1061p.m3157p(java.util.HashMap, java.lang.String):void");
    }
}
