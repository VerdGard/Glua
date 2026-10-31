package p018c1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p083k1.C1447a;
import p083k1.C1449c;

/* renamed from: c1.i */
/* loaded from: classes.dex */
public final class C0588i extends AbstractC0585f<PointF> {

    /* renamed from: g */
    public final PointF f2965g;

    /* renamed from: h */
    public final float[] f2966h;

    /* renamed from: i */
    public C0587h f2967i;

    /* renamed from: j */
    public PathMeasure f2968j;

    public C0588i(List<? extends C1447a<PointF>> list) {
        super(list);
        this.f2965g = new PointF();
        this.f2966h = new float[2];
    }

    @Override // p018c1.AbstractC0580a
    /* renamed from: f */
    public final Object mo2031f(C1447a c1447a, float f7) {
        Object m3834a;
        C0587h c0587h = (C0587h) c1447a;
        Path path = c0587h.f2964k;
        if (path == null) {
            m3834a = c1447a.f6948b;
        } else {
            C1449c c1449c = this.f2955e;
            if (c1449c == null) {
                if (this.f2967i != c0587h) {
                    this.f2968j = new PathMeasure(path, false);
                    this.f2967i = c0587h;
                }
                PathMeasure pathMeasure = this.f2968j;
                float length = pathMeasure.getLength() * f7;
                float[] fArr = this.f2966h;
                pathMeasure.getPosTan(length, fArr, null);
                PointF pointF = this.f2965g;
                pointF.set(fArr[0], fArr[1]);
                return pointF;
            }
            c0587h.f6952f.floatValue();
            m2029d();
            m3834a = c1449c.m3834a(c0587h.f6948b, c0587h.f6949c);
        }
        return (PointF) m3834a;
    }
}
