package p129q1;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
import p019c2.C0599g;

/* renamed from: q1.j */
/* loaded from: classes.dex */
public final class C1734j {

    /* renamed from: a */
    public final Context f7937a;

    /* renamed from: b */
    public final a f7938b = new a();

    /* renamed from: q1.j$a */
    public class a {
        /* renamed from: a */
        public static C1735k m4206a(JSONObject jSONObject) {
            C1735k c1735k = new C1735k();
            if (jSONObject.has("time")) {
                c1735k.f7943e = jSONObject.getInt("time");
            }
            if (jSONObject.has("path")) {
                c1735k.f7942d = jSONObject.getString("path");
            }
            if (jSONObject.has("encoding")) {
                c1735k.f7939a = jSONObject.getString("encoding");
            }
            if (jSONObject.has("offset")) {
                c1735k.f7941c = jSONObject.getInt("offset");
            }
            if (jSONObject.has("isLastOpen")) {
                c1735k.f7940b = jSONObject.getBoolean("isLastOpen");
            }
            return c1735k;
        }

        /* renamed from: b */
        public static void m4207b(JSONObject jSONObject, C1735k c1735k) {
            jSONObject.put("time", c1735k.f7943e);
            jSONObject.put("path", c1735k.f7942d);
            jSONObject.put("encoding", c1735k.f7939a);
            jSONObject.put("offset", c1735k.f7941c);
            jSONObject.put("isLastOpen", c1735k.f7940b);
        }
    }

    public C1734j(Context context) {
        this.f7937a = context;
    }

    /* renamed from: a */
    public final JSONObject m4203a() {
        try {
            File file = new File(this.f7937a.getFilesDir(), "database" + File.separator + "recent_files.json");
            file.getParentFile().mkdirs();
            FileInputStream fileInputStream = new FileInputStream(file);
            String m2046a = C0599g.m2046a(fileInputStream);
            fileInputStream.close();
            return new JSONObject(m2046a);
        } catch (IOException | JSONException e7) {
            e7.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public final void m4204b(JSONObject jSONObject) {
        try {
            File file = new File(this.f7937a.getFilesDir(), "database" + File.separator + "recent_files.json");
            file.getParentFile().mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String jSONObject2 = jSONObject.toString();
            Charset forName = Charset.forName("UTF-8");
            if (jSONObject2 != null) {
                fileOutputStream.write(jSONObject2.getBytes(forName));
            }
            fileOutputStream.close();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void m4205c(String str) {
        a aVar = this.f7938b;
        try {
            JSONObject m4203a = m4203a();
            if (m4203a.has(str)) {
                JSONObject jSONObject = m4203a.getJSONObject(str);
                aVar.getClass();
                C1735k m4206a = a.m4206a(jSONObject);
                m4206a.f7942d = str;
                m4206a.f7940b = false;
                a.m4207b(jSONObject, m4206a);
                m4204b(m4203a);
            }
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }
}
