package p036e2;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: e2.g2 */
/* loaded from: classes.dex */
public final class RunnableC1001g2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ String f5076c;

    public RunnableC1001g2(String str) {
        this.f5076c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0973c2 c0973c2 = C0973c2.f4982d;
        String str = this.f5076c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) new JSONObject(str).opt("sv");
            if (jSONObject != null) {
                int optInt = jSONObject.optInt("close");
                String optString = jSONObject.optString("area");
                String optString2 = jSONObject.optString("duration");
                c0973c2.f4983a = optInt != 0;
                if (!TextUtils.isEmpty(optString)) {
                    try {
                        c0973c2.f4984b = Float.valueOf(optString).floatValue();
                    } catch (Exception unused) {
                    }
                }
                if (TextUtils.isEmpty(optString2)) {
                    return;
                }
                c0973c2.f4985c = Long.valueOf(optString2).longValue();
            }
        } catch (Exception unused2) {
        }
    }
}
