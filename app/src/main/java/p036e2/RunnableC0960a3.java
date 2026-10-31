package p036e2;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e2.a3 */
/* loaded from: classes.dex */
public final class RunnableC0960a3 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ Context f4935c;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f4936e;

    /* renamed from: m */
    public final /* synthetic */ C0974c3 f4937m;

    public RunnableC0960a3(C0974c3 c0974c3, Context context, ArrayList arrayList) {
        this.f4937m = c0974c3;
        this.f4935c = context;
        this.f4936e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        C0974c3 c0974c3 = this.f4937m;
        c0974c3.getClass();
        Context context = this.f4935c;
        if (context == null || (arrayList = this.f4936e) == null || arrayList.size() == 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0959a2 c0959a2 = (C0959a2) it.next();
            String m3220a = C1092t2.f5443g.m3220a(2, c0959a2.f4930a);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", m3220a);
                jSONObject.put("s", c0959a2.f4931b);
                jSONObject.put("e", c0959a2.f4932c);
                jSONObject.put("user", c0959a2.f4933d ? 1 : 0);
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (c0974c3.f4994g != null && jSONArray.length() != 0) {
            if (c0974c3.m2996h(jSONArray.toString())) {
                c0974c3.m2999k(context);
            }
            JSONArray jSONArray2 = c0974c3.f4994g;
            if (jSONArray2 != null) {
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    try {
                        jSONArray2.put(jSONArray.getJSONObject(i7));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        c0974c3.m2997i(context);
    }
}
