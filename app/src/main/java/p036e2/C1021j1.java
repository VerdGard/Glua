package p036e2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.activity.C0143v;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p002a1.C0017d;
import p016c.C0572z;
import p036e2.AbstractC1006h0;
import p036e2.C0986e1;

/* renamed from: e2.j1 */
/* loaded from: classes.dex */
public final class C1021j1 {

    /* renamed from: g */
    public static String f5149g;

    /* renamed from: a */
    public final Context f5150a;

    /* renamed from: b */
    public final C0986e1.a f5151b;

    /* renamed from: c */
    public volatile FileLock f5152c;

    /* renamed from: d */
    public volatile RandomAccessFile f5153d;

    /* renamed from: e */
    public C1013i0 f5154e;

    /* renamed from: f */
    public final C0979d1 f5155f;

    /* renamed from: e2.j1$a */
    public static class a {

        /* renamed from: k */
        public static final String[] f5156k = {"V", "O", "0"};

        /* renamed from: a */
        public String f5157a;

        /* renamed from: b */
        public String f5158b;

        /* renamed from: c */
        public String f5159c;

        /* renamed from: d */
        public long f5160d;

        /* renamed from: e */
        public String f5161e;

        /* renamed from: f */
        public boolean f5162f;

        /* renamed from: g */
        public String f5163g;

        /* renamed from: i */
        public String f5165i;

        /* renamed from: h */
        public boolean f5164h = true;

        /* renamed from: j */
        public int f5166j = 1;

        /* renamed from: a */
        public final synchronized void m3056a() {
            this.f5164h = false;
        }

        /* renamed from: b */
        public final String m3057b() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dik", this.f5157a);
                jSONObject.put("v270fk", this.f5158b);
                jSONObject.put("cck", this.f5159c);
                jSONObject.put("vsk", this.f5166j);
                jSONObject.put("ctk", this.f5160d);
                jSONObject.put("csk", this.f5162f);
                if (!TextUtils.isEmpty(this.f5163g)) {
                    jSONObject.put("pmk", this.f5163g);
                }
                if (!TextUtils.isEmpty(this.f5165i)) {
                    jSONObject.put("ock", this.f5165i);
                }
                jSONObject.put("hrk", this.f5164h);
                jSONObject.put("ek", this.f5161e);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public final String m3058c() {
            String str = this.f5158b;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5157a);
            sb.append("|");
            sb.append(str);
            if ("V".equals(str)) {
                sb.append(this.f5159c);
            }
            if (!TextUtils.isEmpty(this.f5161e)) {
                sb.append(this.f5161e);
            }
            return sb.toString().trim();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0986e1.a.class != obj.getClass()) {
                return false;
            }
            C0986e1.a aVar = (C0986e1.a) obj;
            if (this.f5166j == aVar.f5166j && this.f5157a.equals(aVar.f5157a) && this.f5158b.equals(aVar.f5158b) && this.f5159c.equals(aVar.f5159c) && this.f5162f == aVar.f5162f && this.f5163g.equals(aVar.f5163g)) {
                String str = this.f5161e;
                String str2 = aVar.f5161e;
                if (str == str2) {
                    return true;
                }
                if (str != null && str.equals(str2)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5157a, this.f5158b, this.f5159c, Boolean.valueOf(this.f5162f), this.f5163g, this.f5161e, Integer.valueOf(this.f5166j)});
        }
    }

    public C1021j1(Context context, C0986e1 c0986e1, C0979d1 c0979d1) {
        C0986e1.a aVar;
        if (context == null) {
            throw new NullPointerException("context should not be null!!!");
        }
        Context applicationContext = context.getApplicationContext();
        this.f5150a = applicationContext;
        synchronized (c0986e1) {
            if (c0986e1.f5028b == null) {
                c0986e1.f5028b = c0986e1.new a(".cesium", null);
            }
            aVar = c0986e1.f5028b;
        }
        C0986e1.a aVar2 = C0986e1.this.new a("bohrium", aVar);
        this.f5151b = aVar2;
        aVar2.m3010c().mkdirs();
        this.f5155f = c0979d1;
        C1013i0 c1013i0 = new C1013i0(new C0017d());
        AbstractC1006h0.b bVar = new AbstractC1006h0.b();
        bVar.f5088a = applicationContext;
        bVar.f5089b = c0986e1;
        Iterator it = new ArrayList(c1013i0.f5123a.values()).iterator();
        while (it.hasNext()) {
            AbstractC1006h0 abstractC1006h0 = (AbstractC1006h0) it.next();
            abstractC1006h0.f5084a = bVar;
            C0986e1.a m3007b = bVar.f5089b.m3007b();
            abstractC1006h0.f5085b = C0986e1.this.new a("cs", m3007b);
            abstractC1006h0.mo3035c();
        }
        this.f5154e = c1013i0;
    }

    /* renamed from: a */
    public static C0986e1.a m3051a(C0993f1 c0993f1) {
        String str;
        C0986e1.a aVar = new C0986e1.a();
        aVar.f5160d = System.currentTimeMillis();
        aVar.f5166j = 1;
        try {
            boolean z6 = false;
            aVar.f5158b = c0993f1.f5062b.substring(0, 1);
            String str2 = c0993f1.f5061a;
            aVar.f5157a = str2;
            aVar.f5159c = m3054d(str2);
            String[] strArr = C0986e1.a.f5156k;
            int i7 = 0;
            while (true) {
                if (i7 >= 3) {
                    z6 = true;
                    break;
                }
                if (strArr[i7].equals(aVar.f5158b)) {
                    break;
                }
                i7++;
            }
            if (z6 && (str = c0993f1.f5062b) != null && str.length() >= 2) {
                aVar.f5161e = c0993f1.f5062b.substring(1);
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static C0986e1.a m3052b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("dik", "");
            String optString2 = jSONObject.optString("cck", "");
            long optLong = jSONObject.optLong("ctk", 0L);
            int optInt = jSONObject.optInt("vsk", 1);
            boolean optBoolean = jSONObject.optBoolean("csk", false);
            String optString3 = jSONObject.optString("pmk", "");
            boolean optBoolean2 = jSONObject.optBoolean("hrk", true);
            String optString4 = jSONObject.optString("ock", null);
            String optString5 = jSONObject.optString("ek", "");
            String optString6 = jSONObject.optString("v270fk", "V");
            if (!TextUtils.isEmpty(optString)) {
                C0986e1.a aVar = new C0986e1.a();
                aVar.f5157a = optString;
                aVar.f5159c = optString2;
                aVar.f5160d = optLong;
                aVar.f5166j = optInt;
                aVar.f5161e = optString5;
                aVar.f5158b = optString6;
                aVar.f5162f = optBoolean;
                aVar.f5163g = optString3;
                aVar.f5164h = optBoolean2;
                aVar.f5165i = optString4;
                return aVar;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: c */
    public static String m3053c() {
        String str = f5149g;
        if (str != null) {
            return str;
        }
        String str2 = Build.MODEL;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String substring = C0143v.m431b(false, str2.getBytes()).substring(3, 15);
        f5149g = substring;
        return substring;
    }

    /* renamed from: d */
    public static String m3054d(String str) {
        try {
            return new C1109v5().m3258e(new C0572z(4).m1996c(str.getBytes("UTF-8")));
        } catch (Exception e7) {
            e7.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public final synchronized void m3055e() {
        if (this.f5152c != null) {
            try {
                this.f5152c.release();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            this.f5152c = null;
        }
        C1007h1.m3037b(this.f5153d);
        this.f5153d = null;
    }
}
