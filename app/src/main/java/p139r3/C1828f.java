package p139r3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.ext.C0091c;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.material.R$dimen;
import p004a3.C0034a;
import p121p0.C1690b;

/* renamed from: r3.f */
/* loaded from: classes.dex */
public final class C1828f extends AbstractC1823a<View> {

    /* renamed from: g */
    public final float f8270g;

    /* renamed from: h */
    public final float f8271h;

    public C1828f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f8270g = resources.getDimension(R$dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f8271h = resources.getDimension(R$dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    /* renamed from: a */
    public final AnimatorSet m4305a() {
        AnimatorSet animatorSet = new AnimatorSet();
        V v5 = this.f8257b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(v5, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v5, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i7), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C1690b());
        return animatorSet;
    }

    /* renamed from: b */
    public final void m4306b(float f7) {
        float interpolation = this.f8256a.getInterpolation(f7);
        V v5 = this.f8257b;
        float width = v5.getWidth();
        float height = v5.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f8 = this.f8270g / width;
        float f9 = this.f8271h / height;
        LinearInterpolator linearInterpolator = C0034a.f108a;
        float m227e = 1.0f - C0091c.m227e(f8, 0.0f, interpolation, 0.0f);
        float m227e2 = 1.0f - C0091c.m227e(f9, 0.0f, interpolation, 0.0f);
        v5.setScaleX(m227e);
        v5.setPivotY(height);
        v5.setScaleY(m227e2);
        if (v5 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v5;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(m227e2 != 0.0f ? m227e / m227e2 : 1.0f);
            }
        }
    }
}
