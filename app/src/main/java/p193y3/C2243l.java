package p193y3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import p185x3.C2191a;

/* renamed from: y3.l */
/* loaded from: classes.dex */
public final class C2243l {

    /* renamed from: a */
    @Deprecated
    public float f10225a;

    /* renamed from: b */
    @Deprecated
    public float f10226b;

    /* renamed from: c */
    @Deprecated
    public float f10227c;

    /* renamed from: d */
    @Deprecated
    public float f10228d;

    /* renamed from: e */
    @Deprecated
    public float f10229e;

    /* renamed from: f */
    @Deprecated
    public float f10230f;

    /* renamed from: g */
    public final ArrayList f10231g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f10232h = new ArrayList();

    /* renamed from: y3.l$a */
    public static class a extends f {

        /* renamed from: c */
        public final c f10233c;

        public a(c cVar) {
            this.f10233c = cVar;
        }

        @Override // p193y3.C2243l.f
        /* renamed from: a */
        public final void mo5444a(Matrix matrix, C2191a c2191a, int i7, Canvas canvas) {
            c cVar = this.f10233c;
            float f7 = cVar.f10242f;
            float f8 = cVar.f10243g;
            RectF rectF = new RectF(cVar.f10238b, cVar.f10239c, cVar.f10240d, cVar.f10241e);
            c2191a.getClass();
            boolean z6 = f8 < 0.0f;
            Path path = c2191a.f9936g;
            int[] iArr = C2191a.f9928k;
            if (z6) {
                iArr[0] = 0;
                iArr[1] = c2191a.f9935f;
                iArr[2] = c2191a.f9934e;
                iArr[3] = c2191a.f9933d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f7, f8);
                path.close();
                float f9 = -i7;
                rectF.inset(f9, f9);
                iArr[0] = 0;
                iArr[1] = c2191a.f9933d;
                iArr[2] = c2191a.f9934e;
                iArr[3] = c2191a.f9935f;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f10 = 1.0f - (i7 / width);
            float[] fArr = C2191a.f9929l;
            fArr[1] = f10;
            fArr[2] = ((1.0f - f10) / 2.0f) + f10;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = c2191a.f9931b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z6) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c2191a.f9937h);
            }
            canvas.drawArc(rectF, f7, f8, true, paint);
            canvas.restore();
        }
    }

    /* renamed from: y3.l$b */
    public static class b extends f {

        /* renamed from: c */
        public final d f10234c;

        /* renamed from: d */
        public final float f10235d;

        /* renamed from: e */
        public final float f10236e;

        public b(d dVar, float f7, float f8) {
            this.f10234c = dVar;
            this.f10235d = f7;
            this.f10236e = f8;
        }

        @Override // p193y3.C2243l.f
        /* renamed from: a */
        public final void mo5444a(Matrix matrix, C2191a c2191a, int i7, Canvas canvas) {
            d dVar = this.f10234c;
            float f7 = dVar.f10245c;
            float f8 = this.f10236e;
            float f9 = dVar.f10244b;
            float f10 = this.f10235d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f7 - f8, f9 - f10), 0.0f);
            Matrix matrix2 = this.f10248a;
            matrix2.set(matrix);
            matrix2.preTranslate(f10, f8);
            matrix2.preRotate(m5450b());
            c2191a.getClass();
            rectF.bottom += i7;
            rectF.offset(0.0f, -i7);
            int[] iArr = C2191a.f9926i;
            iArr[0] = c2191a.f9935f;
            iArr[1] = c2191a.f9934e;
            iArr[2] = c2191a.f9933d;
            Paint paint = c2191a.f9932c;
            float f11 = rectF.left;
            paint.setShader(new LinearGradient(f11, rectF.top, f11, rectF.bottom, iArr, C2191a.f9927j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        /* renamed from: b */
        public final float m5450b() {
            d dVar = this.f10234c;
            return (float) Math.toDegrees(Math.atan((dVar.f10245c - this.f10236e) / (dVar.f10244b - this.f10235d)));
        }
    }

    /* renamed from: y3.l$c */
    public static class c extends e {

        /* renamed from: h */
        public static final RectF f10237h = new RectF();

        /* renamed from: b */
        @Deprecated
        public float f10238b;

        /* renamed from: c */
        @Deprecated
        public float f10239c;

        /* renamed from: d */
        @Deprecated
        public float f10240d;

        /* renamed from: e */
        @Deprecated
        public float f10241e;

        /* renamed from: f */
        @Deprecated
        public float f10242f;

        /* renamed from: g */
        @Deprecated
        public float f10243g;

        public c(float f7, float f8, float f9, float f10) {
            this.f10238b = f7;
            this.f10239c = f8;
            this.f10240d = f9;
            this.f10241e = f10;
        }

        @Override // p193y3.C2243l.e
        /* renamed from: a */
        public final void mo5451a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f10246a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f10237h;
            rectF.set(this.f10238b, this.f10239c, this.f10240d, this.f10241e);
            path.arcTo(rectF, this.f10242f, this.f10243g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: y3.l$d */
    public static class d extends e {

        /* renamed from: b */
        public float f10244b;

        /* renamed from: c */
        public float f10245c;

        @Override // p193y3.C2243l.e
        /* renamed from: a */
        public final void mo5451a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f10246a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f10244b, this.f10245c);
            path.transform(matrix);
        }
    }

    /* renamed from: y3.l$e */
    public static abstract class e {

        /* renamed from: a */
        public final Matrix f10246a = new Matrix();

        /* renamed from: a */
        public abstract void mo5451a(Matrix matrix, Path path);
    }

    /* renamed from: y3.l$f */
    public static abstract class f {

        /* renamed from: b */
        public static final Matrix f10247b = new Matrix();

        /* renamed from: a */
        public final Matrix f10248a = new Matrix();

        /* renamed from: a */
        public abstract void mo5444a(Matrix matrix, C2191a c2191a, int i7, Canvas canvas);
    }

    public C2243l() {
        m5449e(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m5445a(float f7, float f8, float f9, float f10, float f11, float f12) {
        c cVar = new c(f7, f8, f9, f10);
        cVar.f10242f = f11;
        cVar.f10243g = f12;
        this.f10231g.add(cVar);
        a aVar = new a(cVar);
        float f13 = f11 + f12;
        boolean z6 = f12 < 0.0f;
        if (z6) {
            f11 = (f11 + 180.0f) % 360.0f;
        }
        float f14 = z6 ? (180.0f + f13) % 360.0f : f13;
        m5446b(f11);
        this.f10232h.add(aVar);
        this.f10229e = f14;
        double d7 = f13;
        this.f10227c = (((f9 - f7) / 2.0f) * ((float) Math.cos(Math.toRadians(d7)))) + ((f7 + f9) * 0.5f);
        this.f10228d = (((f10 - f8) / 2.0f) * ((float) Math.sin(Math.toRadians(d7)))) + ((f8 + f10) * 0.5f);
    }

    /* renamed from: b */
    public final void m5446b(float f7) {
        float f8 = this.f10229e;
        if (f8 == f7) {
            return;
        }
        float f9 = ((f7 - f8) + 360.0f) % 360.0f;
        if (f9 > 180.0f) {
            return;
        }
        float f10 = this.f10227c;
        float f11 = this.f10228d;
        c cVar = new c(f10, f11, f10, f11);
        cVar.f10242f = this.f10229e;
        cVar.f10243g = f9;
        this.f10232h.add(new a(cVar));
        this.f10229e = f7;
    }

    /* renamed from: c */
    public final void m5447c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f10231g;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) arrayList.get(i7)).mo5451a(matrix, path);
        }
    }

    /* renamed from: d */
    public final void m5448d(float f7, float f8) {
        d dVar = new d();
        dVar.f10244b = f7;
        dVar.f10245c = f8;
        this.f10231g.add(dVar);
        b bVar = new b(dVar, this.f10227c, this.f10228d);
        float m5450b = bVar.m5450b() + 270.0f;
        float m5450b2 = bVar.m5450b() + 270.0f;
        m5446b(m5450b);
        this.f10232h.add(bVar);
        this.f10229e = m5450b2;
        this.f10227c = f7;
        this.f10228d = f8;
    }

    /* renamed from: e */
    public final void m5449e(float f7, float f8, float f9) {
        this.f10225a = 0.0f;
        this.f10226b = f7;
        this.f10227c = 0.0f;
        this.f10228d = f7;
        this.f10229e = f8;
        this.f10230f = (f8 + f9) % 360.0f;
        this.f10231g.clear();
        this.f10232h.clear();
    }
}
