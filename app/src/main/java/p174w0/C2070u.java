package p174w0;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: w0.u */
/* loaded from: classes.dex */
public class C2070u extends C2069t {

    /* renamed from: z */
    public static boolean f9441z = true;

    @Override // p002a1.C0017d
    @SuppressLint({"NewApi"})
    /* renamed from: P */
    public void mo102P(View view, int i7, int i8, int i9, int i10) {
        if (f9441z) {
            try {
                view.setLeftTopRightBottom(i7, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f9441z = false;
            }
        }
    }
}
