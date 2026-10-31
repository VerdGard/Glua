package p174w0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: w0.v */
/* loaded from: classes.dex */
public class C2071v extends C2070u {

    /* renamed from: A */
    public static boolean f9442A = true;

    @Override // p002a1.C0017d
    @SuppressLint({"NewApi"})
    /* renamed from: S */
    public void mo103S(View view, int i7) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo103S(view, i7);
        } else if (f9442A) {
            try {
                view.setTransitionVisibility(i7);
            } catch (NoSuchMethodError unused) {
                f9442A = false;
            }
        }
    }
}
