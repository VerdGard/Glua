package p036e2;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e2.w */
/* loaded from: classes.dex */
public final class C1110w {

    /* renamed from: a */
    public volatile long f5494a = 0;

    /* renamed from: b */
    public volatile long f5495b = 0;

    /* renamed from: c */
    public volatile long f5496c = 0;

    /* renamed from: d */
    public volatile long f5497d = 0;

    /* renamed from: e */
    public volatile long f5498e = 0;

    /* renamed from: f */
    public volatile int f5499f = 0;

    /* renamed from: g */
    public final ArrayList f5500g = new ArrayList();

    /* renamed from: h */
    public volatile JSONObject f5501h = null;

    /* renamed from: e2.w$a */
    public static class a {

        /* renamed from: a */
        public String f5502a;

        /* renamed from: b */
        public String f5503b;

        /* renamed from: c */
        public String f5504c;

        /* renamed from: d */
        public long f5505d;

        /* renamed from: e */
        public long f5506e;

        /* renamed from: f */
        public boolean f5507f;

        /* renamed from: g */
        public JSONObject f5508g = new JSONObject();

        /* renamed from: h */
        public boolean f5509h;

        /* renamed from: i */
        public String f5510i;

        public a(String str, String str2, String str3, long j7, long j8, boolean z6, boolean z7, String str4) {
            this.f5503b = str;
            this.f5504c = str2;
            this.f5502a = str3;
            this.f5505d = j7;
            this.f5506e = j8;
            this.f5507f = z6;
            this.f5510i = str4;
            this.f5509h = z7;
        }

        /* renamed from: a */
        public final void m3262a(a aVar) {
            this.f5502a = aVar.f5502a;
            this.f5503b = aVar.f5503b;
            this.f5504c = aVar.f5504c;
            this.f5505d = aVar.f5505d;
            this.f5506e = aVar.f5506e;
            this.f5507f = aVar.f5507f;
            this.f5508g = aVar.f5508g;
            this.f5509h = aVar.f5509h;
            this.f5510i = aVar.f5510i;
        }
    }

    /* renamed from: b */
    public static JSONObject m3259b(a aVar, long j7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("n", aVar.f5503b);
            jSONObject.put("d", aVar.f5505d);
            long j8 = aVar.f5506e - j7;
            if (j8 < 0) {
                j8 = 0;
            }
            jSONObject.put("ps", j8);
            jSONObject.put("t", aVar.f5504c);
            int i7 = 1;
            jSONObject.put("at", aVar.f5507f ? 1 : 0);
            JSONObject jSONObject2 = aVar.f5508g;
            if (jSONObject2 != null && jSONObject2.length() != 0) {
                jSONObject.put("ext", jSONObject2);
            }
            if (!aVar.f5509h) {
                i7 = 0;
            }
            jSONObject.put("h5", i7);
            jSONObject.put("py", aVar.f5510i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final JSONObject m3260a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", this.f5494a);
            jSONObject.put("e", this.f5495b);
            jSONObject.put("i", this.f5498e);
            jSONObject.put("c", 1);
            jSONObject.put("s2", this.f5496c == 0 ? this.f5494a : this.f5496c);
            jSONObject.put("e2", this.f5497d == 0 ? this.f5495b : this.f5497d);
            jSONObject.put("pc", this.f5499f);
            if (this.f5501h != null && this.f5501h.length() != 0) {
                jSONObject.put("launch", this.f5501h);
            }
            JSONArray jSONArray = new JSONArray();
            for (int i7 = 0; i7 < this.f5500g.size(); i7++) {
                jSONArray.put(m3259b((a) this.f5500g.get(i7), this.f5494a));
            }
            C0961a4.m2954a().getClass();
            if (C0961a4.f4941d) {
                jSONObject.put("p", jSONArray);
            }
            jSONObject.put("py", C1061p.f5300l.m3153j());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: c */
    public final JSONObject m3261c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", this.f5494a);
            jSONObject.put("e", this.f5495b);
            jSONObject.put("i", this.f5498e);
            jSONObject.put("c", 1);
            jSONObject.put("s2", this.f5496c == 0 ? this.f5494a : this.f5496c);
            jSONObject.put("e2", this.f5497d == 0 ? this.f5495b : this.f5497d);
            jSONObject.put("pc", this.f5499f);
            jSONObject.put("py", C1061p.f5300l.m3153j());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return m3260a().toString();
    }
}
