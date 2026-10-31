package p053g3;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: g3.e */
/* loaded from: classes.dex */
public final class C1215e extends AbstractC1216f {

    /* renamed from: b */
    public final /* synthetic */ CarouselLayoutManager f5962b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215e(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f5962b = carouselLayoutManager;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: a */
    public final void mo3424a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f7 = rectF2.left;
        float f8 = rectF3.left;
        if (f7 < f8 && rectF2.right > f8) {
            float f9 = f8 - f7;
            rectF.left += f9;
            rectF2.left += f9;
        }
        float f10 = rectF2.right;
        float f11 = rectF3.right;
        if (f10 <= f11 || rectF2.left >= f11) {
            return;
        }
        float f12 = f10 - f11;
        rectF.right = Math.max(rectF.right - f12, rectF.left);
        rectF2.right = Math.max(rectF2.right - f12, rectF2.left);
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: b */
    public final float mo3425b(RecyclerView.C0445n c0445n) {
        return ((ViewGroup.MarginLayoutParams) c0445n).rightMargin + ((ViewGroup.MarginLayoutParams) c0445n).leftMargin;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: c */
    public final RectF mo3426c(float f7, float f8, float f9, float f10) {
        return new RectF(f10, 0.0f, f8 - f10, f7);
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: d */
    public final int mo3427d() {
        CarouselLayoutManager carouselLayoutManager = this.f5962b;
        return carouselLayoutManager.f2222o - carouselLayoutManager.m1619F();
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: e */
    public final int mo3428e() {
        CarouselLayoutManager carouselLayoutManager = this.f5962b;
        if (carouselLayoutManager.m2344N0()) {
            return 0;
        }
        return carouselLayoutManager.f2221n;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: f */
    public final int mo3429f() {
        return 0;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: g */
    public final int mo3430g() {
        return this.f5962b.f2221n;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: h */
    public final int mo3431h() {
        CarouselLayoutManager carouselLayoutManager = this.f5962b;
        if (carouselLayoutManager.m2344N0()) {
            return carouselLayoutManager.f2221n;
        }
        return 0;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: i */
    public final int mo3432i() {
        return this.f5962b.m1622I();
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: j */
    public final void mo3433j(View view, int i7, int i8) {
        int mo3432i = mo3432i();
        int mo3427d = mo3427d();
        this.f5962b.getClass();
        RecyclerView.AbstractC0444m.m1612P(view, i7, mo3432i, i8, mo3427d);
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: k */
    public final void mo3434k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            rectF.right = ((float) Math.floor(rectF.right)) - 1.0f;
        }
        if (rectF2.left >= rectF3.right) {
            rectF.left = ((float) Math.ceil(rectF.left)) + 1.0f;
        }
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: l */
    public final void mo3435l(float f7, float f8, Rect rect, View view) {
        view.offsetLeftAndRight((int) (f8 - (rect.left + f7)));
    }
}
