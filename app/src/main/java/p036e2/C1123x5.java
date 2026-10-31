package p036e2;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C0391d0;
import java.security.Key;
import java.security.interfaces.RSAKey;
import java.text.SimpleDateFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e2.x5 */
/* loaded from: classes.dex */
public final class C1123x5 {

    /* renamed from: l */
    public static C1123x5 f5594l;

    /* renamed from: a */
    public final Context f5595a;

    /* renamed from: b */
    public JSONObject f5596b;

    /* renamed from: c */
    public long f5597c = 24;

    /* renamed from: d */
    public long f5598d = 0;

    /* renamed from: e */
    public long f5599e = 0;

    /* renamed from: f */
    public long f5600f = 5;

    /* renamed from: g */
    public long f5601g = 24;

    /* renamed from: h */
    public long f5602h = 15;

    /* renamed from: i */
    public long f5603i = 15;

    /* renamed from: j */
    public long f5604j = 12;

    /* renamed from: k */
    public long f5605k = 24;

    public C1123x5(Context context) {
        this.f5596b = new JSONObject();
        this.f5595a = context;
        String m3288a = C1121x3.m3288a(context, ".mtj_timestamp");
        try {
            if (!TextUtils.isEmpty(m3288a)) {
                this.f5596b = new JSONObject(m3288a);
            }
        } catch (Exception unused) {
        }
        m3296e();
        m3297f();
    }

    /* renamed from: b */
    public static C1123x5 m3292b(Context context) {
        if (f5594l == null) {
            synchronized (C1123x5.class) {
                if (f5594l == null) {
                    f5594l = new C1123x5(context);
                }
            }
        }
        return f5594l;
    }

    /* renamed from: d */
    public static boolean m3293d(long j7) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.format(Long.valueOf(j7)).equals(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
    }

    /* renamed from: a */
    public final long m3294a(EnumC1011h5 enumC1011h5) {
        long j7 = enumC1011h5.f5119c;
        try {
            String obj = enumC1011h5.toString();
            if (this.f5596b.has(obj)) {
                j7 = this.f5596b.getLong(obj);
            }
        } catch (Exception e7) {
            C1016i3.f5129e.m383h(e7);
        }
        if (j7 - System.currentTimeMillis() > 0) {
            return 0L;
        }
        return j7;
    }

    /* renamed from: c */
    public final void m3295c(EnumC1011h5 enumC1011h5, long j7) {
        C1016i3 c1016i3 = C1016i3.f5129e;
        enumC1011h5.f5119c = j7;
        try {
            this.f5596b.put(enumC1011h5.toString(), j7);
        } catch (Exception e7) {
            c1016i3.m383h(e7);
        }
        try {
            C1121x3.m3289b(this.f5595a, ".mtj_timestamp", this.f5596b.toString());
        } catch (Exception e8) {
            c1016i3.m383h(e8);
        }
    }

    /* renamed from: e */
    public final void m3296e() {
        C1016i3 c1016i3 = C1016i3.f5129e;
        String m3288a = C1121x3.m3288a(this.f5595a, ".config2");
        try {
            byte[] m3247k = C1109v5.m3247k();
            byte[] m1359f = C0391d0.m1359f(m3288a.getBytes());
            RSAKey m3242f = C1109v5.m3242f(m3247k);
            String str = new String(C1109v5.m3244h(2, (Key) m3242f, (m3242f.getModulus().bitLength() + 1) / 8, m1359f));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            try {
                this.f5598d = jSONObject.getLong("c");
            } catch (JSONException e7) {
                c1016i3.m386n(e7);
            }
            try {
                this.f5600f = jSONObject.getLong("d");
            } catch (JSONException e8) {
                c1016i3.m386n(e8);
            }
            try {
                this.f5601g = jSONObject.getLong("e");
            } catch (JSONException e9) {
                c1016i3.m386n(e9);
            }
            try {
                this.f5602h = jSONObject.getLong("i");
            } catch (JSONException e10) {
                c1016i3.m386n(e10);
            }
            try {
                this.f5597c = jSONObject.getLong("f");
            } catch (JSONException e11) {
                c1016i3.m386n(e11);
            }
            try {
                this.f5605k = jSONObject.getLong("s");
            } catch (JSONException e12) {
                c1016i3.m386n(e12);
            }
            try {
                this.f5603i = jSONObject.getLong("pk");
            } catch (JSONException e13) {
                c1016i3.m386n(e13);
            }
            try {
                jSONObject.getLong("at");
            } catch (JSONException e14) {
                c1016i3.m386n(e14);
            }
            try {
                this.f5604j = jSONObject.getLong("as");
            } catch (JSONException e15) {
                c1016i3.m386n(e15);
            }
            try {
                jSONObject.getLong("ac");
            } catch (JSONException e16) {
                c1016i3.m386n(e16);
            }
            try {
                this.f5599e = jSONObject.getLong("mc");
            } catch (JSONException e17) {
                c1016i3.m386n(e17);
            }
            try {
                jSONObject.getLong("lsc");
            } catch (JSONException e18) {
                c1016i3.m386n(e18);
            }
        } catch (Exception e19) {
            c1016i3.m386n(e19);
        }
    }

    /* renamed from: f */
    public final void m3297f() {
        C1016i3 c1016i3 = C1016i3.f5129e;
        String m3288a = C1121x3.m3288a(this.f5595a, ".sign");
        try {
            byte[] m3247k = C1109v5.m3247k();
            byte[] m1359f = C0391d0.m1359f(m3288a.getBytes());
            RSAKey m3242f = C1109v5.m3242f(m3247k);
            String str = new String(C1109v5.m3244h(2, (Key) m3242f, (m3242f.getModulus().bitLength() + 1) / 8, m1359f));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            try {
                jSONObject.getString("sign");
            } catch (Exception e7) {
                c1016i3.m386n(e7);
            }
            try {
                jSONObject.getString("ver");
            } catch (Exception e8) {
                c1016i3.m386n(e8);
            }
        } catch (Exception e9) {
            c1016i3.m386n(e9);
        }
    }
}
