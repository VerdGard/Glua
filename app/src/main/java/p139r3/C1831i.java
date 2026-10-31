package p139r3;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.ext.C0091c;
import android.util.Log;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.activity.C0117b;
import com.google.android.material.R$dimen;
import java.util.WeakHashMap;
import p004a3.C0034a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p121p0.C1690b;

/* renamed from: r3.i */
/* loaded from: classes.dex */
public final class C1831i extends AbstractC1823a<View> {

    /* renamed from: g */
    public final float f8275g;

    /* renamed from: h */
    public final float f8276h;

    /* renamed from: i */
    public final float f8277i;

    public C1831i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f8275g = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f8276h = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f8277i = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    /* renamed from: a */
    public final void m4307a() {
        if (this.f8261f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0117b c0117b = this.f8261f;
        this.f8261f = null;
        if (c0117b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        V v5 = this.f8257b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(v5, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v5, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i7), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f8260e);
        animatorSet.start();
    }

    /* renamed from: b */
    public final void m4308b(C0117b c0117b, int i7, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i8;
        boolean z6 = c0117b.f222d == 0;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        V v5 = this.f8257b;
        boolean z7 = (Gravity.getAbsoluteGravity(i7, C0946x.e.m2847d(v5)) & 3) == 3;
        float scaleX = v5.getScaleX() * v5.getWidth();
        ViewGroup.LayoutParams layoutParams = v5.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i8 = z7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i8 = 0;
        }
        float f7 = scaleX + i8;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (z7) {
            f7 = -f7;
        }
        fArr[0] = f7;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v5, (Property<V, Float>) property, fArr);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new C1690b());
        ofFloat.setDuration(C0034a.m127b(c0117b.f221c, this.f8258c, this.f8259d));
        ofFloat.addListener(new C1830h(this, z6, i7));
        ofFloat.addListener(animatorListenerAdapter);
        ofFloat.start();
    }

    /* renamed from: c */
    public final void m4309c(float f7, int i7, boolean z6) {
        float interpolation = this.f8256a.getInterpolation(f7);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        V v5 = this.f8257b;
        boolean z7 = (Gravity.getAbsoluteGravity(i7, C0946x.e.m2847d(v5)) & 3) == 3;
        boolean z8 = z6 == z7;
        int width = v5.getWidth();
        int height = v5.getHeight();
        float f8 = width;
        if (f8 > 0.0f) {
            float f9 = height;
            if (f9 <= 0.0f) {
                return;
            }
            float f10 = this.f8275g / f8;
            float f11 = this.f8276h / f8;
            float f12 = this.f8277i / f9;
            if (z7) {
                f8 = 0.0f;
            }
            v5.setPivotX(f8);
            if (!z8) {
                f11 = -f10;
            }
            LinearInterpolator linearInterpolator = C0034a.f108a;
            float m227e = C0091c.m227e(f11, 0.0f, interpolation, 0.0f);
            float f13 = m227e + 1.0f;
            v5.setScaleX(f13);
            float f14 = 1.0f - (((f12 - 0.0f) * interpolation) + 0.0f);
            v5.setScaleY(f14);
            if (v5 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v5;
                for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    childAt.setPivotX(z7 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f15 = z8 ? 1.0f - m227e : 1.0f;
                    float f16 = f14 != 0.0f ? (f13 / f14) * f15 : 1.0f;
                    childAt.setScaleX(f15);
                    childAt.setScaleY(f16);
                }
            }
        }
    }
}
