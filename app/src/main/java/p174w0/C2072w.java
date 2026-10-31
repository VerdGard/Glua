package p174w0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: w0.w */
/* loaded from: classes.dex */
public final class C2072w extends C2071v {
    @Override // p174w0.C2070u, p002a1.C0017d
    /* renamed from: P */
    public final void mo102P(View view, int i7, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override // p174w0.C2071v, p002a1.C0017d
    /* renamed from: S */
    public final void mo103S(View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override // p174w0.C2068s
    /* renamed from: W */
    public final float mo5127W(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // p174w0.C2068s
    /* renamed from: X */
    public final void mo5128X(View view, float f7) {
        view.setTransitionAlpha(f7);
    }

    @Override // p174w0.C2069t
    /* renamed from: Y */
    public final void mo5129Y(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p174w0.C2069t
    /* renamed from: Z */
    public final void mo5130Z(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
