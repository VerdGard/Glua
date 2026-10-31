package p033e;

import android.content.Context;
import android.content.res.TypedArray;
import android.ext.C0091c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import p189y.C2213a;

/* renamed from: e.d */
/* loaded from: classes.dex */
public final class C0906d extends Drawable {

    /* renamed from: m */
    public static final float f4757m = (float) Math.toRadians(45.0d);

    /* renamed from: a */
    public final Paint f4758a;

    /* renamed from: b */
    public final float f4759b;

    /* renamed from: c */
    public final float f4760c;

    /* renamed from: d */
    public final float f4761d;

    /* renamed from: e */
    public float f4762e;

    /* renamed from: f */
    public boolean f4763f;

    /* renamed from: g */
    public final Path f4764g;

    /* renamed from: h */
    public final int f4765h;

    /* renamed from: i */
    public boolean f4766i;

    /* renamed from: j */
    public float f4767j;

    /* renamed from: k */
    public float f4768k;

    /* renamed from: l */
    public final int f4769l;

    public C0906d(Context context) {
        Paint paint = new Paint();
        this.f4758a = paint;
        this.f4764g = new Path();
        this.f4766i = false;
        this.f4769l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, R$styleable.f286n, R$attr.drawerArrowStyle, R$style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(R$styleable.DrawerArrowToggle_color, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_thickness, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f4768k = (float) (Math.cos(f4757m) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z6 = obtainStyledAttributes.getBoolean(R$styleable.DrawerArrowToggle_spinBars, true);
        if (this.f4763f != z6) {
            this.f4763f = z6;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (round != this.f4762e) {
            this.f4762e = round;
            invalidateSelf();
        }
        this.f4765h = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DrawerArrowToggle_drawableSize, 0);
        this.f4760c = Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f4759b = Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f4761d = obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void m2625a(boolean z6) {
        if (this.f4766i != z6) {
            this.f4766i = z6;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z6 = false;
        int i7 = this.f4769l;
        if (i7 != 0 && (i7 == 1 || (i7 == 3 ? C2213a.m5354b(this) == 0 : C2213a.m5354b(this) == 1))) {
            z6 = true;
        }
        float f7 = this.f4759b;
        float sqrt = (float) Math.sqrt(f7 * f7 * 2.0f);
        float f8 = this.f4767j;
        float f9 = this.f4760c;
        float m227e = C0091c.m227e(sqrt, f9, f8, f9);
        float m227e2 = C0091c.m227e(this.f4761d, f9, f8, f9);
        float round = Math.round(((this.f4768k - 0.0f) * f8) + 0.0f);
        float f10 = this.f4767j;
        float m227e3 = C0091c.m227e(f4757m, 0.0f, f10, 0.0f);
        float f11 = z6 ? 0.0f : -180.0f;
        float m227e4 = C0091c.m227e(z6 ? 180.0f : 0.0f, f11, f10, f11);
        double d7 = m227e;
        double d8 = m227e3;
        float round2 = Math.round(Math.cos(d8) * d7);
        float round3 = Math.round(Math.sin(d8) * d7);
        Path path = this.f4764g;
        path.rewind();
        float f12 = this.f4762e;
        Paint paint = this.f4758a;
        float strokeWidth = paint.getStrokeWidth() + f12;
        float m227e5 = C0091c.m227e(-this.f4768k, strokeWidth, this.f4767j, strokeWidth);
        float f13 = (-m227e2) / 2.0f;
        path.moveTo(f13 + round, 0.0f);
        path.rLineTo(m227e2 - (round * 2.0f), 0.0f);
        path.moveTo(f13, m227e5);
        path.rLineTo(round2, round3);
        path.moveTo(f13, -m227e5);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth2 = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth2);
        canvas.translate(bounds.centerX(), (strokeWidth2 * 1.5f) + this.f4762e + ((((int) (height - (2.0f * r7))) / 4) * 2));
        if (this.f4763f) {
            canvas.rotate(m227e4 * (this.f4766i ^ z6 ? -1 : 1));
        } else if (z6) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4765h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4765h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Paint paint = this.f4758a;
        if (i7 != paint.getAlpha()) {
            paint.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4758a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
