package p174w0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: w0.t */
/* loaded from: classes.dex */
public class C2069t extends C2068s {

    /* renamed from: x */
    public static boolean f9439x = true;

    /* renamed from: y */
    public static boolean f9440y = true;

    @SuppressLint({"NewApi"})
    /* renamed from: Y */
    public void mo5129Y(View view, Matrix matrix) {
        if (f9439x) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f9439x = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Z */
    public void mo5130Z(View view, Matrix matrix) {
        if (f9440y) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f9440y = false;
            }
        }
    }
}
