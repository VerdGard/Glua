package p034e0;

import android.view.View;
import android.view.Window;

/* renamed from: e0.k0 */
/* loaded from: classes.dex */
public final class C0929k0 {
    /* renamed from: a */
    public static void m2726a(Window window, boolean z6) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
