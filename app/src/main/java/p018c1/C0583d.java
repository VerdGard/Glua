package p018c1;

import android.ext.C0091c;
import android.graphics.PointF;
import java.util.List;
import p036e2.C1109v5;
import p051g1.C1194c;
import p083k1.C1447a;
import p083k1.C1449c;

/* renamed from: c1.d */
/* loaded from: classes.dex */
public final class C0583d extends AbstractC0585f {

    /* renamed from: g */
    public final /* synthetic */ int f2958g;

    /* renamed from: h */
    public final Object f2959h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0583d(int i7, List list) {
        super(list);
        this.f2958g = i7;
        if (i7 == 1) {
            super(list);
            this.f2959h = new PointF();
        } else {
            C1194c c1194c = (C1194c) ((C1447a) list.get(0)).f6948b;
            int length = c1194c != null ? c1194c.f5857b.length : 0;
            this.f2959h = new C1194c(new float[length], new int[length]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p018c1.AbstractC0580a
    /* renamed from: f */
    public final Object mo2031f(C1447a c1447a, float f7) {
        T t7;
        int i7 = this.f2958g;
        Object obj = this.f2959h;
        switch (i7) {
            case 0:
                C1194c c1194c = (C1194c) obj;
                C1194c c1194c2 = (C1194c) c1447a.f6948b;
                C1194c c1194c3 = (C1194c) c1447a.f6949c;
                c1194c.getClass();
                int[] iArr = c1194c2.f5857b;
                int length = iArr.length;
                int[] iArr2 = c1194c3.f5857b;
                if (length != iArr2.length) {
                    throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + iArr.length + " vs " + iArr2.length + ")");
                }
                for (int i8 = 0; i8 < iArr.length; i8++) {
                    float f8 = c1194c2.f5856a[i8];
                    c1194c.f5856a[i8] = C0091c.m227e(c1194c3.f5856a[i8], f8, f7, f8);
                    c1194c.f5857b[i8] = C1109v5.m3254r(f7, iArr[i8], iArr2[i8]);
                }
                return c1194c;
            default:
                T t8 = c1447a.f6948b;
                if (t8 == 0 || (t7 = c1447a.f6949c) == 0) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                PointF pointF = (PointF) t8;
                PointF pointF2 = (PointF) t7;
                C1449c c1449c = this.f2955e;
                if (c1449c != null) {
                    c1447a.f6952f.floatValue();
                    m2029d();
                    return (PointF) c1449c.m3834a(pointF, pointF2);
                }
                PointF pointF3 = (PointF) obj;
                float f9 = pointF.x;
                float m227e = C0091c.m227e(pointF2.x, f9, f7, f9);
                float f10 = pointF.y;
                pointF3.set(m227e, ((pointF2.y - f10) * f7) + f10);
                return pointF3;
        }
    }
}
