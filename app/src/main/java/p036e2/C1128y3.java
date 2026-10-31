package p036e2;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: e2.y3 */
/* loaded from: classes.dex */
public final class C1128y3 extends AbstractC1114w3 {

    /* renamed from: a */
    public static final C1128y3 f5622a = new C1128y3();

    @Override // p036e2.AbstractC1114w3
    /* renamed from: a */
    public final SharedPreferences mo3103a(Context context) {
        return context.getSharedPreferences("__Baidu_Stat_SDK_SendRem", 0);
    }
}
