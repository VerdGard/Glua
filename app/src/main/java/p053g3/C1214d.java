package p053g3;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: g3.d */
/* loaded from: classes.dex */
public final class C1214d extends AbstractC1216f {

    /* renamed from: b */
    public final /* synthetic */ CarouselLayoutManager f5961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1214d(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f5961b = carouselLayoutManager;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: a */
    public final void mo3424a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f7 = rectF2.top;
        float f8 = rectF3.top;
        if (f7 < f8 && rectF2.bottom > f8) {
            float f9 = f8 - f7;
            rectF.top += f9;
            rectF3.top += f9;
        }
        float f10 = rectF2.bottom;
        float f11 = rectF3.bottom;
        if (f10 <= f11 || rectF2.top >= f11) {
            return;
        }
        float f12 = f10 - f11;
        rectF.bottom = Math.max(rectF.bottom - f12, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f12, rectF2.top);
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: b */
    public final float mo3425b(RecyclerView.C0445n c0445n) {
        return ((ViewGroup.MarginLayoutParams) c0445n).topMargin + ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: c */
    public final RectF mo3426c(float f7, float f8, float f9, float f10) {
        return new RectF(0.0f, f9, f8, f7 - f9);
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: d */
    public final int mo3427d() {
        return this.f5961b.f2222o;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: e */
    public final int mo3428e() {
        return this.f5961b.f2222o;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: f */
    public final int mo3429f() {
        return this.f5961b.m1620G();
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: g */
    public final int mo3430g() {
        CarouselLayoutManager carouselLayoutManager = this.f5961b;
        return carouselLayoutManager.f2221n - carouselLayoutManager.m1621H();
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: h */
    public final int mo3431h() {
        return 0;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: i */
    public final int mo3432i() {
        return 0;
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: j */
    public final void mo3433j(View view, int i7, int i8) {
        int mo3429f = mo3429f();
        int mo3430g = mo3430g();
        this.f5961b.getClass();
        RecyclerView.AbstractC0444m.m1612P(view, mo3429f, i7, mo3430g, i8);
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: k */
    public final void mo3434k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            rectF.bottom = ((float) Math.floor(rectF.bottom)) - 1.0f;
        }
        if (rectF2.top >= rectF3.bottom) {
            rectF.top = ((float) Math.ceil(rectF.top)) + 1.0f;
        }
    }

    @Override // p053g3.AbstractC1216f
    /* renamed from: l */
    public final void mo3435l(float f7, float f8, Rect rect, View view) {
        view.offsetTopAndBottom((int) (f8 - (rect.top + f7)));
    }
}
