package p036e2;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import p036e2.C1135z3;

/* renamed from: e2.b2 */
/* loaded from: classes.dex */
public final class C0966b2 {

    /* renamed from: a */
    public final String f4952a;

    /* renamed from: b */
    public final String f4953b;

    /* renamed from: c */
    public final JSONArray f4954c;

    /* renamed from: d */
    public final String f4955d;

    /* renamed from: e */
    public final String f4956e;

    /* renamed from: f */
    public final String f4957f;

    /* renamed from: g */
    public final boolean f4958g;

    /* renamed from: h */
    public final long f4959h;

    /* renamed from: i */
    public long f4960i;

    /* renamed from: j */
    public long f4961j;

    /* renamed from: l */
    public String f4963l;

    /* renamed from: n */
    public final String f4965n;

    /* renamed from: o */
    public final JSONArray f4966o;

    /* renamed from: k */
    public int f4962k = 1;

    /* renamed from: m */
    public String f4964m = "";

    public C0966b2(String str, String str2, JSONArray jSONArray, String str3, String str4, String str5, String str6, boolean z6, long j7, long j8, long j9, String str7, JSONArray jSONArray2) {
        this.f4952a = str;
        this.f4953b = str2;
        this.f4954c = jSONArray;
        this.f4955d = str3;
        this.f4956e = str5;
        this.f4957f = str6;
        this.f4958g = z6;
        this.f4959h = j7;
        this.f4960i = j8;
        this.f4961j = j9;
        this.f4963l = str7;
        this.f4965n = str4;
        this.f4966o = jSONArray2;
    }

    /* renamed from: a */
    public static String m2966a(String str, String str2, JSONArray jSONArray, String str3, String str4, String str5, boolean z6) {
        String str6;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", str);
            jSONObject.put("p", str2);
            jSONObject.put("path", jSONArray);
            jSONObject.put("title", str3);
            jSONObject.put("index", str4);
            jSONObject.put("n", str5);
            jSONObject.put("user", z6 ? 1 : 0);
            str6 = jSONObject.toString();
        } catch (Exception unused) {
            str6 = "";
        }
        return !TextUtils.isEmpty(str6) ? C1135z3.a.m3315a(str6.getBytes()) : "";
    }
}
