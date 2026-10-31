package p036e2;

import org.json.JSONObject;

/* renamed from: e2.z */
/* loaded from: classes.dex */
public final class C1131z {

    /* renamed from: a */
    public String f5624a;

    public C1131z(JSONObject jSONObject) {
        C1016i3 c1016i3 = C1016i3.f5129e;
        this.f5624a = "";
        try {
            jSONObject.getBoolean("SDK_BPLUS_SERVICE");
        } catch (Exception e7) {
            c1016i3.m386n(e7);
        }
        try {
            this.f5624a = jSONObject.getString("SDK_PRODUCT_LY");
        } catch (Exception e8) {
            c1016i3.m386n(e8);
        }
        try {
            jSONObject.getBoolean("SDK_LOCAL_SERVER");
        } catch (Exception e9) {
            c1016i3.m386n(e9);
        }
    }
}
