package p036e2;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: e2.l1 */
/* loaded from: classes.dex */
public final class C1035l1 extends AbstractC1114w3 {

    /* renamed from: a */
    public static final C1035l1 f5224a = new C1035l1();

    @Override // p036e2.AbstractC1114w3
    /* renamed from: a */
    public final SharedPreferences mo3103a(Context context) {
        return context.getSharedPreferences("baidu_mtj_sdk_record", 0);
    }
}
