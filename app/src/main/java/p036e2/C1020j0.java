package p036e2;

import android.content.Context;
import android.os.Build;
import android.system.Os;
import android.text.TextUtils;
import java.io.File;
import org.json.JSONObject;
import p036e2.AbstractC1006h0;
import p036e2.C0986e1;
import p036e2.C1021j1;

/* renamed from: e2.j0 */
/* loaded from: classes.dex */
public final class C1020j0 extends AbstractC1006h0 {

    /* renamed from: f */
    public C0986e1.a f5136f;

    /* renamed from: g */
    public final b f5137g;

    /* renamed from: e2.j0$a */
    public static class a {
        /* renamed from: a */
        public static boolean m3046a(File file) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            try {
                int i7 = Os.stat(file.getAbsolutePath()).st_mode;
                if ((i7 & 1) == 0) {
                    Os.chmod(file.getAbsolutePath(), i7 | 1);
                }
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: e2.j0$b */
    public class b {

        /* renamed from: b */
        public long f5139b;

        /* renamed from: c */
        public C1021j1.a f5140c;

        /* renamed from: d */
        public boolean f5141d;

        /* renamed from: a */
        public final C1000g1 f5138a = new C1000g1();

        /* renamed from: e */
        public boolean f5142e = true;

        public b() {
        }

        /* renamed from: a */
        public final void m3047a() {
            if (!this.f5142e) {
                throw new IllegalStateException();
            }
            if (this.f5141d) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pub_info", this.f5140c.m3057b());
                    jSONObject.put("pub_lst_ts", this.f5139b);
                    jSONObject.put("d_form_ver", 1);
                    C1020j0.this.f5136f.m3009b("pub.dat", jSONObject.toString());
                    this.f5141d = false;
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public final void m3048b() {
            C0986e1.a aVar = C1020j0.this.f5136f;
            aVar.getClass();
            File file = new File(aVar.f5029a, "pub.dat");
            try {
                if (Build.VERSION.SDK_INT < 23) {
                    file.setReadable(true, false);
                } else {
                    Os.chmod(file.getAbsolutePath(), 436);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e2.j0$c */
    public class c extends AbstractC1006h0.c {

        /* renamed from: d */
        public String f5144d;

        /* renamed from: e */
        public long f5145e;

        /* renamed from: f */
        public long f5146f;

        /* renamed from: g */
        public long f5147g;

        /* renamed from: h */
        public C1021j1.a f5148h;

        public c(C1020j0 c1020j0, String str) {
            super(c1020j0.f5136f, str);
        }

        /* renamed from: a */
        public final void m3049a(JSONObject jSONObject) {
            this.f5144d = jSONObject.getString("pkg");
            this.f5146f = jSONObject.getInt("tar_pkg_lst_pub_ts");
            this.f5145e = jSONObject.getLong("last_fe_ts");
            this.f5148h = C1021j1.m3052b(jSONObject.getString("info"));
            this.f5147g = jSONObject.getLong("tar_pkg_lst_up_ts");
            jSONObject.getInt("d_form_ver");
        }

        /* renamed from: b */
        public final void m3050b(JSONObject jSONObject) {
            jSONObject.put("pkg", this.f5144d);
            jSONObject.put("last_fe_ts", this.f5145e);
            jSONObject.put("tar_pkg_lst_pub_ts", this.f5146f);
            jSONObject.put("info", this.f5148h.m3057b());
            jSONObject.put("tar_pkg_lst_up_ts", this.f5147g);
            jSONObject.put("d_form_ver", 1);
        }
    }

    public C1020j0() {
        super("isc", 8000000L);
        this.f5137g = new b();
    }

    @Override // p036e2.AbstractC1006h0
    /* renamed from: a */
    public final AbstractC1006h0.e mo3033a(AbstractC1006h0.d dVar, C1021j1.a aVar) {
        Context context = this.f5084a.f5088a;
        if (Build.VERSION.SDK_INT >= 28 && context.getApplicationInfo().targetSdkVersion >= 28) {
            return new AbstractC1006h0.e();
        }
        b bVar = this.f5137g;
        String m3008a = C1020j0.this.f5136f.m3008a("pub.dat");
        if (!TextUtils.isEmpty(m3008a)) {
            try {
                JSONObject jSONObject = new JSONObject(m3008a);
                bVar.f5139b = jSONObject.getLong("pub_lst_ts");
                bVar.f5140c = C1021j1.m3052b(jSONObject.getString("pub_info"));
                jSONObject.getInt("d_form_ver");
                bVar.f5141d = false;
            } catch (Exception unused) {
            }
        }
        try {
            return m3044d(aVar);
        } finally {
            bVar.m3047a();
            m3045e();
            bVar.m3047a();
            bVar.m3048b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    @Override // p036e2.AbstractC1006h0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p036e2.AbstractC1006h0.g mo3034b(java.lang.String r13, p036e2.AbstractC1006h0.f r14) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p036e2.C1020j0.mo3034b(java.lang.String, e2.h0$f):e2.h0$g");
    }

    @Override // p036e2.AbstractC1006h0
    /* renamed from: c */
    public final void mo3035c() {
        C0986e1.a aVar = this.f5085b;
        this.f5136f = C0986e1.this.new a("isc", aVar);
    }

    /* renamed from: d */
    public final AbstractC1006h0.e m3044d(C1021j1.a aVar) {
        b bVar = this.f5137g;
        String m3008a = C1020j0.this.f5136f.m3008a("pub.dat");
        if (!TextUtils.isEmpty(m3008a)) {
            try {
                JSONObject jSONObject = new JSONObject(m3008a);
                bVar.f5139b = jSONObject.getLong("pub_lst_ts");
                bVar.f5140c = C1021j1.m3052b(jSONObject.getString("pub_info"));
                jSONObject.getInt("d_form_ver");
                bVar.f5141d = false;
            } catch (Exception unused) {
            }
        }
        this.f5136f.m3010c().mkdirs();
        if (aVar.equals(bVar.f5140c)) {
            return new AbstractC1006h0.e();
        }
        if (!aVar.equals(bVar.f5140c)) {
            bVar.f5140c = aVar;
            bVar.f5141d = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar.f5139b != currentTimeMillis) {
            bVar.f5139b = currentTimeMillis;
            bVar.f5141d = true;
        }
        return new AbstractC1006h0.e();
    }

    /* renamed from: e */
    public final void m3045e() {
        boolean m3046a;
        C0986e1.a aVar = this.f5136f;
        C0986e1 c0986e1 = this.f5084a.f5089b;
        if (Build.VERSION.SDK_INT >= 23) {
            while (true) {
                if (aVar == null) {
                    m3046a = C0986e1.a.m3046a(c0986e1.m3006a());
                    break;
                } else {
                    if (!C0986e1.a.m3046a(aVar.m3010c())) {
                        m3046a = false;
                        break;
                    }
                    aVar = aVar.f5031c;
                }
            }
        } else {
            while (aVar != null && !aVar.m3010c().equals(c0986e1.m3006a())) {
                aVar.m3010c().setExecutable(true, false);
                aVar = aVar.f5031c;
            }
            m3046a = true;
        }
        int i7 = m3046a ? 1 : 2;
        b bVar = this.f5137g;
        C1000g1 c1000g1 = bVar.f5138a;
        long j7 = c1000g1.f5075a;
        long j8 = (i7 & 3) | ((-4) & j7);
        c1000g1.f5075a = j8;
        if ((j8 ^ j7) != 0) {
            bVar.f5141d = true;
        }
    }
}
