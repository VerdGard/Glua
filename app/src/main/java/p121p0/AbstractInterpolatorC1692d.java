package p121p0;

import android.ext.C0091c;
import android.view.animation.Interpolator;

/* renamed from: p0.d */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC1692d implements Interpolator {

    /* renamed from: a */
    public final /* synthetic */ int f7623a;

    /* renamed from: b */
    public final float[] f7624b;

    /* renamed from: c */
    public final float f7625c;

    public AbstractInterpolatorC1692d(int i7, float[] fArr) {
        this.f7623a = i7;
        if (i7 != 1) {
            this.f7624b = fArr;
            this.f7625c = 1.0f / (fArr.length - 1);
        } else {
            this.f7624b = fArr;
            this.f7625c = 1.0f / (fArr.length - 1);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        int i7 = this.f7623a;
        float f8 = this.f7625c;
        float[] fArr = this.f7624b;
        switch (i7) {
            case 0:
                if (f7 >= 1.0f) {
                    return 1.0f;
                }
                if (f7 <= 0.0f) {
                    return 0.0f;
                }
                int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
                float f9 = (f7 - (min * f8)) / f8;
                float f10 = fArr[min];
                return C0091c.m227e(fArr[min + 1], f10, f9, f10);
            default:
                if (f7 >= 1.0f) {
                    return 1.0f;
                }
                if (f7 <= 0.0f) {
                    return 0.0f;
                }
                int min2 = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
                float f11 = (f7 - (min2 * f8)) / f8;
                float f12 = fArr[min2];
                return C0091c.m227e(fArr[min2 + 1], f12, f11, f12);
        }
    }
}
