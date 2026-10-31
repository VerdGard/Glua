package p174w0;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: w0.q */
/* loaded from: classes.dex */
public final class C2066q {

    /* renamed from: a */
    public static boolean f9435a = true;

    /* renamed from: a */
    public static void m5125a(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z6);
        } else if (f9435a) {
            try {
                viewGroup.suppressLayout(z6);
            } catch (NoSuchMethodError unused) {
                f9435a = false;
            }
        }
    }
}
