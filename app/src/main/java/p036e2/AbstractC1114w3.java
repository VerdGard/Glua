package p036e2;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: e2.w3 */
/* loaded from: classes.dex */
public abstract class AbstractC1114w3 {
    /* renamed from: a */
    public abstract SharedPreferences mo3103a(Context context);

    /* renamed from: b */
    public final String m3266b(Context context, String str, String str2) {
        return mo3103a(context).getString(str, str2);
    }

    /* renamed from: c */
    public final void m3267c(long j7, Context context, String str) {
        mo3103a(context).edit().putLong(str, j7).commit();
    }

    /* renamed from: d */
    public final void m3268d(Context context, String str) {
        context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0).edit().remove(str).commit();
    }
}
