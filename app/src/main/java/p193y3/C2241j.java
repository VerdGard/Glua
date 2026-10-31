package p193y3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p162u2.C1969a;
import p193y3.C2237f;

/* renamed from: y3.j */
/* loaded from: classes.dex */
public final class C2241j {

    /* renamed from: a */
    public final C2243l[] f10210a = new C2243l[4];

    /* renamed from: b */
    public final Matrix[] f10211b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f10212c = new Matrix[4];

    /* renamed from: d */
    public final PointF f10213d = new PointF();

    /* renamed from: e */
    public final Path f10214e = new Path();

    /* renamed from: f */
    public final Path f10215f = new Path();

    /* renamed from: g */
    public final C2243l f10216g = new C2243l();

    /* renamed from: h */
    public final float[] f10217h = new float[2];

    /* renamed from: i */
    public final float[] f10218i = new float[2];

    /* renamed from: j */
    public final Path f10219j = new Path();

    /* renamed from: k */
    public final Path f10220k = new Path();

    /* renamed from: l */
    public final boolean f10221l = true;

    /* renamed from: y3.j$a */
    public static class a {

        /* renamed from: a */
        public static final C2241j f10222a = new C2241j();
    }

    public C2241j() {
        for (int i7 = 0; i7 < 4; i7++) {
            this.f10210a[i7] = new C2243l();
            this.f10211b[i7] = new Matrix();
            this.f10212c[i7] = new Matrix();
        }
    }

    /* renamed from: a */
    public final void m5442a(C2240i c2240i, float f7, RectF rectF, C2237f.a aVar, Path path) {
        int i7;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C2243l[] c2243lArr;
        float centerX;
        float f8;
        Path path2;
        C2237f.a aVar2;
        float f9;
        float f10;
        float f11;
        C2241j c2241j = this;
        C2240i c2240i2 = c2240i;
        RectF rectF2 = rectF;
        C2237f.a aVar3 = aVar;
        Path path3 = path;
        path.rewind();
        Path path4 = c2241j.f10214e;
        path4.rewind();
        Path path5 = c2241j.f10215f;
        path5.rewind();
        path5.addRect(rectF2, Path.Direction.CW);
        int i8 = 0;
        while (true) {
            i7 = 4;
            matrixArr = c2241j.f10212c;
            fArr = c2241j.f10217h;
            matrixArr2 = c2241j.f10211b;
            c2243lArr = c2241j.f10210a;
            if (i8 >= 4) {
                break;
            }
            InterfaceC2234c interfaceC2234c = i8 != 1 ? i8 != 2 ? i8 != 3 ? c2240i2.f10191f : c2240i2.f10190e : c2240i2.f10193h : c2240i2.f10192g;
            C1969a c1969a = i8 != 1 ? i8 != 2 ? i8 != 3 ? c2240i2.f10187b : c2240i2.f10186a : c2240i2.f10189d : c2240i2.f10188c;
            C2243l c2243l = c2243lArr[i8];
            c1969a.getClass();
            c1969a.mo4581a(f7, interfaceC2234c.mo5418a(rectF2), c2243l);
            int i9 = i8 + 1;
            float f12 = (i9 % 4) * 90;
            matrixArr2[i8].reset();
            PointF pointF = c2241j.f10213d;
            if (i8 == 1) {
                f9 = rectF2.right;
            } else if (i8 != 2) {
                f10 = i8 != 3 ? rectF2.right : rectF2.left;
                f11 = rectF2.top;
                pointF.set(f10, f11);
                matrixArr2[i8].setTranslate(pointF.x, pointF.y);
                matrixArr2[i8].preRotate(f12);
                C2243l c2243l2 = c2243lArr[i8];
                fArr[0] = c2243l2.f10227c;
                fArr[1] = c2243l2.f10228d;
                matrixArr2[i8].mapPoints(fArr);
                matrixArr[i8].reset();
                matrixArr[i8].setTranslate(fArr[0], fArr[1]);
                matrixArr[i8].preRotate(f12);
                rectF2 = rectF;
                i8 = i9;
            } else {
                f9 = rectF2.left;
            }
            f10 = f9;
            f11 = rectF2.bottom;
            pointF.set(f10, f11);
            matrixArr2[i8].setTranslate(pointF.x, pointF.y);
            matrixArr2[i8].preRotate(f12);
            C2243l c2243l22 = c2243lArr[i8];
            fArr[0] = c2243l22.f10227c;
            fArr[1] = c2243l22.f10228d;
            matrixArr2[i8].mapPoints(fArr);
            matrixArr[i8].reset();
            matrixArr[i8].setTranslate(fArr[0], fArr[1]);
            matrixArr[i8].preRotate(f12);
            rectF2 = rectF;
            i8 = i9;
        }
        char c7 = 1;
        char c8 = 0;
        int i10 = 0;
        while (i10 < i7) {
            C2243l c2243l3 = c2243lArr[i10];
            fArr[c8] = c2243l3.f10225a;
            fArr[c7] = c2243l3.f10226b;
            matrixArr2[i10].mapPoints(fArr);
            if (i10 == 0) {
                path3.moveTo(fArr[c8], fArr[c7]);
            } else {
                path3.lineTo(fArr[c8], fArr[c7]);
            }
            c2243lArr[i10].m5447c(matrixArr2[i10], path3);
            if (aVar3 != null) {
                C2243l c2243l4 = c2243lArr[i10];
                Matrix matrix = matrixArr2[i10];
                C2237f c2237f = C2237f.this;
                BitSet bitSet = c2237f.f10157s;
                c2243l4.getClass();
                bitSet.set(i10, false);
                c2243l4.m5446b(c2243l4.f10230f);
                c2237f.f10155e[i10] = new C2242k(new ArrayList(c2243l4.f10232h), new Matrix(matrix));
            }
            int i11 = i10 + 1;
            int i12 = i11 % 4;
            C2243l c2243l5 = c2243lArr[i10];
            fArr[0] = c2243l5.f10227c;
            fArr[1] = c2243l5.f10228d;
            matrixArr2[i10].mapPoints(fArr);
            C2243l c2243l6 = c2243lArr[i12];
            float f13 = c2243l6.f10225a;
            float[] fArr2 = c2241j.f10218i;
            fArr2[0] = f13;
            fArr2[1] = c2243l6.f10226b;
            matrixArr2[i12].mapPoints(fArr2);
            Path path6 = path4;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C2243l c2243l7 = c2243lArr[i10];
            fArr[0] = c2243l7.f10227c;
            fArr[1] = c2243l7.f10228d;
            matrixArr2[i10].mapPoints(fArr);
            if (i10 == 1 || i10 == 3) {
                centerX = rectF.centerX();
                f8 = fArr[0];
            } else {
                centerX = rectF.centerY();
                f8 = fArr[1];
            }
            float abs = Math.abs(centerX - f8);
            C2243l c2243l8 = c2241j.f10216g;
            c2243l8.m5449e(0.0f, 270.0f, 0.0f);
            (i10 != 1 ? i10 != 2 ? i10 != 3 ? c2240i2.f10195j : c2240i2.f10194i : c2240i2.f10197l : c2240i2.f10196k).m5419a(max, abs, f7, c2243l8);
            Path path7 = c2241j.f10219j;
            path7.reset();
            c2243l8.m5447c(matrixArr[i10], path7);
            if (c2241j.f10221l && (c2241j.m5443b(path7, i10) || c2241j.m5443b(path7, i12))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = c2243l8.f10225a;
                fArr[1] = c2243l8.f10226b;
                matrixArr[i10].mapPoints(fArr);
                path6.moveTo(fArr[0], fArr[1]);
                c2243l8.m5447c(matrixArr[i10], path6);
                aVar2 = aVar;
                path2 = path;
            } else {
                path2 = path;
                c2243l8.m5447c(matrixArr[i10], path2);
                aVar2 = aVar;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i10];
                C2237f c2237f2 = C2237f.this;
                c2237f2.f10157s.set(i10 + 4, false);
                c2243l8.m5446b(c2243l8.f10230f);
                c2237f2.f10156m[i10] = new C2242k(new ArrayList(c2243l8.f10232h), new Matrix(matrix2));
            }
            c2241j = this;
            c2240i2 = c2240i;
            i10 = i11;
            c7 = 1;
            i7 = 4;
            c8 = 0;
            Path path8 = path2;
            path4 = path6;
            aVar3 = aVar2;
            path3 = path8;
        }
        Path path9 = path4;
        Path path10 = path3;
        path.close();
        path9.close();
        if (path9.isEmpty()) {
            return;
        }
        path10.op(path9, Path.Op.UNION);
    }

    /* renamed from: b */
    public final boolean m5443b(Path path, int i7) {
        Path path2 = this.f10220k;
        path2.reset();
        this.f10210a[i7].m5447c(this.f10211b[i7], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
