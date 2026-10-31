package p059h1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import p002a1.C0020g;
import p002a1.InterfaceC0025l;
import p018c1.C0592m;
import p083k1.C1449c;

/* renamed from: h1.h */
/* loaded from: classes.dex */
public final class C1290h extends AbstractC1284b {

    /* renamed from: A */
    public C0592m f6412A;

    /* renamed from: v */
    public final RectF f6413v;

    /* renamed from: w */
    public final Paint f6414w;

    /* renamed from: x */
    public final float[] f6415x;

    /* renamed from: y */
    public final Path f6416y;

    /* renamed from: z */
    public final C1287e f6417z;

    public C1290h(C0020g c0020g, C1287e c1287e) {
        super(c0020g, c1287e);
        this.f6413v = new RectF();
        Paint paint = new Paint();
        this.f6414w = paint;
        this.f6415x = new float[8];
        this.f6416y = new Path();
        this.f6417z = c1287e;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(c1287e.f6401l);
    }

    @Override // p059h1.AbstractC1284b, p035e1.InterfaceC0954f
    /* renamed from: b */
    public final <T> void mo1827b(T t7, C1449c c1449c) {
        super.mo1827b(t7, c1449c);
        if (t7 == InterfaceC0025l.f91x) {
            this.f6412A = c1449c == null ? null : new C0592m(c1449c);
        }
    }

    @Override // p059h1.AbstractC1284b, p010b1.InterfaceC0515d
    /* renamed from: h */
    public final void mo1831h(RectF rectF, Matrix matrix) {
        super.mo1831h(rectF, matrix);
        RectF rectF2 = this.f6413v;
        C1287e c1287e = this.f6417z;
        rectF2.set(0.0f, 0.0f, c1287e.f6399j, c1287e.f6400k);
        this.f6372l.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // p059h1.AbstractC1284b
    /* renamed from: k */
    public final void mo3600k(Canvas canvas, Matrix matrix, int i7) {
        C1287e c1287e = this.f6417z;
        int alpha = Color.alpha(c1287e.f6401l);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((((alpha / 255.0f) * this.f6380t.f2979f.mo2030e().intValue()) / 100.0f) * (i7 / 255.0f) * 255.0f);
        Paint paint = this.f6414w;
        paint.setAlpha(intValue);
        C0592m c0592m = this.f6412A;
        if (c0592m != null) {
            paint.setColorFilter((ColorFilter) c0592m.mo2030e());
        }
        if (intValue > 0) {
            float[] fArr = this.f6415x;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f7 = c1287e.f6399j;
            fArr[2] = f7;
            fArr[3] = 0.0f;
            fArr[4] = f7;
            float f8 = c1287e.f6400k;
            fArr[5] = f8;
            fArr[6] = 0.0f;
            fArr[7] = f8;
            matrix.mapPoints(fArr);
            Path path = this.f6416y;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, paint);
        }
    }
}
