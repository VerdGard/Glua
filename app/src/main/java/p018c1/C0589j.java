package p018c1;

import android.ext.C0091c;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p035e1.C0949a;
import p051g1.C1202k;
import p083k1.C1447a;

/* renamed from: c1.j */
/* loaded from: classes.dex */
public final class C0589j extends AbstractC0580a<C1202k, Path> {

    /* renamed from: g */
    public final C1202k f2969g;

    /* renamed from: h */
    public final Path f2970h;

    public C0589j(List<C1447a<C1202k>> list) {
        super(list);
        this.f2969g = new C1202k();
        this.f2970h = new Path();
    }

    @Override // p018c1.AbstractC0580a
    /* renamed from: f */
    public final Path mo2031f(C1447a<C1202k> c1447a, float f7) {
        C1202k c1202k = c1447a.f6948b;
        C1202k c1202k2 = c1447a.f6949c;
        C1202k c1202k3 = this.f2969g;
        if (c1202k3.f5898b == null) {
            c1202k3.f5898b = new PointF();
        }
        c1202k3.f5899c = c1202k.f5899c || c1202k2.f5899c;
        ArrayList arrayList = c1202k3.f5897a;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = c1202k.f5897a;
        if (!isEmpty && arrayList.size() != arrayList2.size() && arrayList.size() != c1202k2.f5897a.size()) {
            throw new IllegalStateException("Curves must have the same number of control points. This: " + arrayList.size() + "\tShape 1: " + arrayList2.size() + "\tShape 2: " + c1202k2.f5897a.size());
        }
        if (arrayList.isEmpty()) {
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                arrayList.add(new C0949a());
            }
        }
        PointF pointF = c1202k.f5898b;
        PointF pointF2 = c1202k2.f5898b;
        float f8 = pointF.x;
        float m227e = C0091c.m227e(pointF2.x, f8, f7, f8);
        float f9 = pointF.y;
        float m227e2 = C0091c.m227e(pointF2.y, f9, f7, f9);
        if (c1202k3.f5898b == null) {
            c1202k3.f5898b = new PointF();
        }
        c1202k3.f5898b.set(m227e, m227e2);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0949a c0949a = (C0949a) arrayList2.get(size2);
            C0949a c0949a2 = (C0949a) c1202k2.f5897a.get(size2);
            PointF pointF3 = c0949a.f4897a;
            PointF pointF4 = c0949a2.f4897a;
            C0949a c0949a3 = (C0949a) arrayList.get(size2);
            float f10 = pointF3.x;
            float m227e3 = C0091c.m227e(pointF4.x, f10, f7, f10);
            float f11 = pointF3.y;
            c0949a3.f4897a.set(m227e3, C0091c.m227e(pointF4.y, f11, f7, f11));
            C0949a c0949a4 = (C0949a) arrayList.get(size2);
            PointF pointF5 = c0949a.f4898b;
            float f12 = pointF5.x;
            PointF pointF6 = c0949a2.f4898b;
            float m227e4 = C0091c.m227e(pointF6.x, f12, f7, f12);
            float f13 = pointF5.y;
            c0949a4.f4898b.set(m227e4, C0091c.m227e(pointF6.y, f13, f7, f13));
            C0949a c0949a5 = (C0949a) arrayList.get(size2);
            PointF pointF7 = c0949a.f4899c;
            float f14 = pointF7.x;
            PointF pointF8 = c0949a2.f4899c;
            float m227e5 = C0091c.m227e(pointF8.x, f14, f7, f14);
            float f15 = pointF7.y;
            c0949a5.f4899c.set(m227e5, C0091c.m227e(pointF8.y, f15, f7, f15));
        }
        Path path = this.f2970h;
        path.reset();
        PointF pointF9 = c1202k3.f5898b;
        path.moveTo(pointF9.x, pointF9.y);
        PointF pointF10 = new PointF(pointF9.x, pointF9.y);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            C0949a c0949a6 = (C0949a) arrayList.get(i7);
            PointF pointF11 = c0949a6.f4897a;
            boolean equals = pointF11.equals(pointF10);
            PointF pointF12 = c0949a6.f4898b;
            PointF pointF13 = c0949a6.f4899c;
            if (equals && pointF12.equals(pointF13)) {
                path.lineTo(pointF13.x, pointF13.y);
            } else {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            }
            pointF10.set(pointF13.x, pointF13.y);
        }
        if (c1202k3.f5899c) {
            path.close();
        }
        return path;
    }
}
