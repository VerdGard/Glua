package p053g3;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0136c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.carousel.C0771a;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: g3.h */
/* loaded from: classes.dex */
public final class C1218h extends AbstractC0136c {

    /* renamed from: e */
    public static final int[] f5964e = {1};

    /* renamed from: m */
    public static final int[] f5965m = {1, 0};

    @Override // androidx.activity.result.AbstractC0136c
    /* renamed from: t */
    public final C0771a mo391t(InterfaceC1212b interfaceC1212b, View view) {
        float f7;
        float f8;
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) interfaceC1212b;
        float f9 = carouselLayoutManager.f2222o;
        if (carouselLayoutManager.m2343M0()) {
            f9 = carouselLayoutManager.f2221n;
        }
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) c0445n).topMargin + ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carouselLayoutManager.m2343M0()) {
            f10 = ((ViewGroup.MarginLayoutParams) c0445n).leftMargin + ((ViewGroup.MarginLayoutParams) c0445n).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f11 = f10;
        Resources resources = view.getContext().getResources();
        int i7 = R$dimen.m3_carousel_small_item_size_min;
        float dimension = resources.getDimension(i7) + f11;
        Resources resources2 = view.getContext().getResources();
        int i8 = R$dimen.m3_carousel_small_item_size_max;
        float dimension2 = resources2.getDimension(i8) + f11;
        float min = Math.min(measuredHeight + f11, f9);
        float f12 = (measuredHeight / 3.0f) + f11;
        float dimension3 = view.getContext().getResources().getDimension(i7) + f11;
        float dimension4 = view.getContext().getResources().getDimension(i8) + f11;
        float f13 = f12 < dimension3 ? dimension3 : f12 > dimension4 ? dimension4 : f12;
        float f14 = (min + f13) / 2.0f;
        int[] iArr = f5964e;
        int[] iArr2 = f5965m;
        int i9 = Integer.MIN_VALUE;
        for (int i10 : iArr2) {
            if (i10 > i9) {
                i9 = i10;
            }
        }
        float f15 = f9 - (i9 * f14);
        int max = (int) Math.max(1.0d, Math.floor((f15 - ((iArr[0] > Integer.MIN_VALUE ? r4 : Integer.MIN_VALUE) * dimension2)) / min));
        int ceil = (int) Math.ceil(f9 / min);
        int i11 = 1;
        int i12 = (ceil - max) + 1;
        int[] iArr3 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr3[i13] = ceil - i13;
        }
        C1211a c1211a = null;
        int i14 = 1;
        int i15 = 0;
        loop2: while (true) {
            if (i15 >= i12) {
                f7 = f11;
                f8 = 0.0f;
                break;
            }
            int i16 = iArr3[i15];
            int length = iArr2.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = iArr2[i17];
                int i19 = i14;
                C1211a c1211a2 = c1211a;
                int i20 = 0;
                while (i20 < i11) {
                    f7 = f11;
                    int i21 = i20;
                    int i22 = i17;
                    int i23 = length;
                    float f16 = dimension;
                    float f17 = dimension;
                    f8 = 0.0f;
                    int i24 = i15;
                    int[] iArr4 = iArr3;
                    int i25 = i12;
                    int[] iArr5 = iArr2;
                    C1211a c1211a3 = new C1211a(i19, f13, f16, dimension2, iArr[i20], f14, i18, min, i16, f9);
                    float f18 = c1211a3.f5959h;
                    c1211a2 = c1211a2;
                    if (c1211a2 == null || f18 < c1211a2.f5959h) {
                        if (f18 == 0.0f) {
                            c1211a = c1211a3;
                            break loop2;
                        }
                        c1211a2 = c1211a3;
                    }
                    i19++;
                    i20 = i21 + 1;
                    f11 = f7;
                    iArr3 = iArr4;
                    i17 = i22;
                    length = i23;
                    dimension = f17;
                    i15 = i24;
                    i12 = i25;
                    iArr2 = iArr5;
                    i11 = 1;
                }
                i17++;
                c1211a = c1211a2;
                i14 = i19;
                dimension = dimension;
                i11 = 1;
            }
            i15++;
            i11 = 1;
        }
        float dimension5 = view.getContext().getResources().getDimension(R$dimen.m3_carousel_gone_size) + f7;
        float f19 = dimension5 / 2.0f;
        float f20 = f8 - f19;
        float f21 = (c1211a.f5957f / 2.0f) + f8;
        int i26 = c1211a.f5958g;
        int i27 = 0;
        float max2 = Math.max(0, i26 - 1);
        float f22 = c1211a.f5957f;
        float f23 = (max2 * f22) + f21;
        float f24 = (f22 / 2.0f) + f23;
        int i28 = c1211a.f5955d;
        if (i28 > 0) {
            f23 = (c1211a.f5956e / 2.0f) + f24;
        }
        if (i28 > 0) {
            f24 = (c1211a.f5956e / 2.0f) + f23;
        }
        int i29 = c1211a.f5954c;
        float f25 = i29 > 0 ? (c1211a.f5953b / 2.0f) + f24 : f23;
        float f26 = f9 + f19;
        float f27 = 1.0f - ((dimension5 - f7) / (f22 - f7));
        float f28 = 1.0f - ((c1211a.f5953b - f7) / (f22 - f7));
        float f29 = 1.0f - ((c1211a.f5956e - f7) / (f22 - f7));
        C0771a.a aVar = new C0771a.a(f22);
        aVar.m2357a(f20, f27, dimension5, false);
        float f30 = c1211a.f5957f;
        if (i26 > 0 && f30 > 0.0f) {
            while (i27 < i26) {
                aVar.m2357a((i27 * f30) + f21, 0.0f, f30, true);
                i27++;
                f21 = f21;
                i26 = i26;
            }
        }
        if (i28 > 0) {
            aVar.m2357a(f23, f29, c1211a.f5956e, false);
        }
        if (i29 > 0) {
            float f31 = c1211a.f5953b;
            if (i29 > 0 && f31 > 0.0f) {
                for (int i30 = 0; i30 < i29; i30++) {
                    aVar.m2357a((i30 * f31) + f25, f28, f31, false);
                }
            }
        }
        aVar.m2357a(f26, f27, dimension5, false);
        return aVar.m2358b();
    }
}
