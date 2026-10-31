package p036e2;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import org.json.JSONObject;

/* renamed from: e2.r */
/* loaded from: classes.dex */
public final class C1075r {

    /* renamed from: d */
    public static final C1075r f5363d = new C1075r();

    /* renamed from: b */
    public Context f5365b;

    /* renamed from: a */
    public boolean f5364a = false;

    /* renamed from: c */
    public final C1082s f5366c = new C1082s();

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static JSONObject m3169a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("total", memoryInfo.totalMem);
            jSONObject.put("free", memoryInfo.availMem);
            jSONObject.put("low", memoryInfo.lowMemory ? 1 : 0);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
