package p028d2;

import android.content.Context;
import android.os.SystemClock;
import p036e2.C0993f1;

@Deprecated
/* renamed from: d2.a */
/* loaded from: classes.dex */
public final class C0879a {
    @Deprecated
    /* renamed from: a */
    public static String m2567a(Context context) {
        if (C0881c.f4657e == null) {
            synchronized (C0993f1.class) {
                if (C0881c.f4657e == null) {
                    SystemClock.uptimeMillis();
                    C0881c.f4657e = C0881c.m2568a(context).m2572e();
                    SystemClock.uptimeMillis();
                }
            }
        }
        C0881c.m2568a(context).getClass();
        return C0881c.f4657e.m3058c();
    }
}
