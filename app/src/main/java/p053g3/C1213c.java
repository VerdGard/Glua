package p053g3;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.C0481o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: g3.c */
/* loaded from: classes.dex */
public final class C1213c extends C0481o {

    /* renamed from: q */
    public final /* synthetic */ CarouselLayoutManager f5960q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213c(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f5960q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0454w
    /* renamed from: a */
    public final PointF mo1673a(int i7) {
        return this.f5960q.mo1488a(i7);
    }

    @Override // androidx.recyclerview.widget.C0481o
    /* renamed from: f */
    public final int mo1783f(View view, int i7) {
        CarouselLayoutManager carouselLayoutManager = this.f5960q;
        if (carouselLayoutManager.f3980u == null || !carouselLayoutManager.m2343M0()) {
            return 0;
        }
        int m1609J = RecyclerView.AbstractC0444m.m1609J(view);
        return (int) (carouselLayoutManager.f3975p - carouselLayoutManager.m2342K0(m1609J, carouselLayoutManager.m2341I0(m1609J)));
    }

    @Override // androidx.recyclerview.widget.C0481o
    /* renamed from: g */
    public final int mo1784g(View view, int i7) {
        CarouselLayoutManager carouselLayoutManager = this.f5960q;
        if (carouselLayoutManager.f3980u == null || carouselLayoutManager.m2343M0()) {
            return 0;
        }
        int m1609J = RecyclerView.AbstractC0444m.m1609J(view);
        return (int) (carouselLayoutManager.f3975p - carouselLayoutManager.m2342K0(m1609J, carouselLayoutManager.m2341I0(m1609J)));
    }
}
