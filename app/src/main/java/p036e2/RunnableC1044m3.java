package p036e2;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p036e2.C1058o3;
import p036e2.C1072q3;

/* renamed from: e2.m3 */
/* loaded from: classes.dex */
public final class RunnableC1044m3 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ WeakReference f5245c;

    /* renamed from: e */
    public final /* synthetic */ boolean f5246e;

    /* renamed from: m */
    public final /* synthetic */ AbstractC1093t3 f5247m;

    /* renamed from: s */
    public final /* synthetic */ JSONObject f5248s;

    public RunnableC1044m3(C1058o3.a aVar, WeakReference weakReference, boolean z6, AbstractC1093t3 abstractC1093t3, JSONObject jSONObject) {
        this.f5245c = weakReference;
        this.f5246e = z6;
        this.f5247m = abstractC1093t3;
        this.f5248s = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        if (C1009h3.f5098l) {
            int i7 = C1058o3.f5275j + 1;
            C1058o3.f5275j = i7;
            if (i7 >= 3) {
                C1009h3.f5098l = false;
            }
            Activity activity = (Activity) this.f5245c.get();
            if (activity != null) {
                if (this.f5246e && !C0973c2.f4982d.f4983a) {
                    C1085s2 c1085s2 = C1085s2.f5407x;
                    if (!c1085s2.m3182e()) {
                        c1085s2.f5410c.post(new RunnableC0980d2(c1085s2, new WeakReference(activity), System.currentTimeMillis()));
                    }
                }
                AbstractC1093t3 abstractC1093t3 = this.f5247m;
                JSONObject jSONObject = this.f5248s;
                boolean z6 = this.f5246e;
                if (abstractC1093t3.f5450a == null) {
                    C1072q3 c1072q3 = new C1072q3(activity, abstractC1093t3, z6);
                    abstractC1093t3.f5450a = c1072q3;
                    if (jSONObject != null) {
                        try {
                            c1072q3.f5348a = ((JSONObject) jSONObject.get("meta")).getInt("matchAll") != 0;
                        } catch (Exception unused) {
                        }
                        if (!c1072q3.f5348a) {
                            try {
                                JSONArray jSONArray = (JSONArray) jSONObject.get("data");
                                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i8);
                                    String optString = jSONObject2.optString("page");
                                    String optString2 = jSONObject2.optString("layout");
                                    jSONObject2.optInt("contentAsLabel");
                                    boolean z7 = jSONObject2.optInt("ignoreCellIndex") != 0;
                                    if (c1072q3.f5350c.equals(optString)) {
                                        c1072q3.f5349b.add(new C1072q3.a(optString2, z7));
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
                C1072q3 c1072q32 = abstractC1093t3.f5450a;
                if (c1072q32.f5352e || c1072q32.f5348a || !((arrayList = c1072q32.f5349b) == null || arrayList.size() == 0)) {
                    View m3190a = C1086s3.m3190a(activity);
                    c1072q32.m3167a(activity, m3190a, null, m3190a);
                }
            }
        }
    }
}
