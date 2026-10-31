package p036e2;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: e2.v */
/* loaded from: classes.dex */
public final class RunnableC1103v implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Context f5480c;

    /* renamed from: e */
    public final /* synthetic */ C1096u f5481e;

    public RunnableC1103v(C1096u c1096u, Context context) {
        this.f5481e = c1096u;
        this.f5480c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        JSONObject jSONObject;
        String str2 = C1047n.f5252a;
        C1096u c1096u = this.f5481e;
        Context context = this.f5480c;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = C1047n.f5253b;
            c1096u.getClass();
            arrayList.addAll(C1096u.m3226a(context, str3));
            arrayList.addAll(C1096u.m3226a(context, str2));
            Iterator it = arrayList.iterator();
            while (true) {
                int i7 = 0;
                while (it.hasNext()) {
                    str = (String) it.next();
                    String m3288a = C1121x3.m3288a(context, str);
                    if (TextUtils.isEmpty(m3288a)) {
                        context.deleteFile(str);
                    } else {
                        if (C1096u.m3227b(c1096u, context, m3288a, str.contains(str2))) {
                            break;
                        }
                        try {
                            jSONObject = new JSONObject(m3288a);
                        } catch (Exception unused) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            try {
                                JSONObject jSONObject2 = (JSONObject) jSONObject.get("trace");
                                jSONObject2.put("failed_cnt", jSONObject2.getLong("failed_cnt") + 1);
                            } catch (Exception unused2) {
                            }
                            C1121x3.m3289b(context, str, jSONObject.toString());
                        }
                        i7++;
                        if (i7 >= 5) {
                            return;
                        }
                    }
                }
                return;
                context.deleteFile(str);
            }
        } catch (Exception unused3) {
        }
    }
}
