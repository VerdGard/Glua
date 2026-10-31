package p151t;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: t.a */
/* loaded from: classes.dex */
public final class C1917a {

    /* renamed from: a */
    public static final ThreadLocal<Matrix> f8680a = new ThreadLocal<>();

    /* renamed from: b */
    public static final ThreadLocal<RectF> f8681b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m4531a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m4531a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
