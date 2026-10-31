package p036e2;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p002a1.C0017d;

/* renamed from: e2.f1 */
/* loaded from: classes.dex */
public final class C0993f1 {

    /* renamed from: a */
    public String f5061a;

    /* renamed from: b */
    public String f5062b;

    /* renamed from: c */
    public int f5063c = 2;

    /* renamed from: d */
    public int f5064d = 0;

    /* renamed from: a */
    public static C0993f1 m3021a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C0993f1 c0993f1 = new C0993f1();
        c0993f1.f5061a = str;
        int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
        c0993f1.f5064d = length;
        if (length < 14) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "0";
            }
            c0993f1.f5062b = str2;
        }
        return c0993f1;
    }

    /* renamed from: b */
    public static C0993f1 m3022b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            try {
                byte[] m3231a = C1097u0.m3231a();
                byte[] m83h = C0017d.m83h(str.getBytes());
                C1076r0 c1076r0 = new C1076r0();
                c1076r0.m3171b(2, m3231a, m3231a);
                str2 = new String(c1076r0.m3170a(m83h));
            } catch (Exception unused) {
                str2 = "";
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> keys = jSONObject.keys();
            String str3 = "0";
            String str4 = "0";
            while (keys.hasNext()) {
                String next = keys.next();
                if (!m3023d("ZGV2aWNlaWQ=").equals(next) && !m3023d("dmVy").equals(next)) {
                    str4 = jSONObject.optString(next, "0");
                }
            }
            String string = jSONObject.getString(m3023d("ZGV2aWNlaWQ="));
            int i7 = jSONObject.getInt(m3023d("dmVy"));
            int length = TextUtils.isEmpty(str4) ? 0 : str4.length();
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            C0993f1 c0993f1 = new C0993f1();
            c0993f1.f5061a = string;
            c0993f1.f5063c = i7;
            c0993f1.f5064d = length;
            if (length < 14) {
                if (!TextUtils.isEmpty(str4)) {
                    str3 = str4;
                }
                c0993f1.f5062b = str3;
            }
            c0993f1.m3025e();
            return c0993f1;
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m3023d(String str) {
        return new String(C0017d.m83h(str.getBytes()));
    }

    /* renamed from: c */
    public final String m3024c() {
        String str;
        try {
            str = new JSONObject().put(m3023d("ZGV2aWNlaWQ="), this.f5061a).put(m3023d("aW1laQ=="), this.f5062b).put(m3023d("dmVy"), this.f5063c).toString();
        } catch (JSONException unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] m3231a = C1097u0.m3231a();
            byte[] bytes = str.getBytes();
            C1076r0 c1076r0 = new C1076r0();
            c1076r0.m3171b(1, m3231a, m3231a);
            return C0017d.m82g(c1076r0.m3170a(bytes));
        } catch (UnsupportedEncodingException | Exception unused2) {
            return "";
        }
    }

    /* renamed from: e */
    public final boolean m3025e() {
        String str;
        if (this.f5064d >= 14) {
            str = "O";
        } else {
            if (!TextUtils.isEmpty(this.f5062b)) {
                return false;
            }
            str = "0";
        }
        this.f5062b = str;
        return true;
    }
}
