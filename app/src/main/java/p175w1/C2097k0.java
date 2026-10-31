package p175w1;

import android.ext.Config;
import android.os.Build;

/* renamed from: w1.k0 */
/* loaded from: classes.dex */
public final class C2097k0 {
    /* renamed from: a */
    public static int m5152a() {
        int i7 = Config.floatType;
        if (i7 < 0) {
            i7 = 2002;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return 2038;
        }
        return i7;
    }

    /* renamed from: b */
    public static int m5153b() {
        int i7 = Config.floatType;
        if (i7 < 0) {
            i7 = 2003;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return 2038;
        }
        return i7;
    }
}
