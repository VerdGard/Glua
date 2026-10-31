package p174w0;

import android.annotation.SuppressLint;
import android.view.View;
import p002a1.C0017d;

/* renamed from: w0.s */
/* loaded from: classes.dex */
public class C2068s extends C0017d {

    /* renamed from: w */
    public static boolean f9438w = true;

    @SuppressLint({"NewApi"})
    /* renamed from: W */
    public float mo5127W(View view) {
        float transitionAlpha;
        if (f9438w) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f9438w = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: X */
    public void mo5128X(View view, float f7) {
        if (f9438w) {
            try {
                view.setTransitionAlpha(f7);
                return;
            } catch (NoSuchMethodError unused) {
                f9438w = false;
            }
        }
        view.setAlpha(f7);
    }
}
