package com.so.revelation.lua.View.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.so.revelation.lua.R$styleable;

/* loaded from: classes.dex */
public class CircleImageView extends ImageView {

    /* renamed from: H1 */
    public static final ImageView.ScaleType f3507H1 = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: I1 */
    public static final Bitmap.Config f3508I1 = Bitmap.Config.ARGB_8888;

    /* renamed from: A1 */
    public BitmapShader f3509A1;

    /* renamed from: B1 */
    public int f3510B1;

    /* renamed from: C1 */
    public int f3511C1;

    /* renamed from: D1 */
    public float f3512D1;

    /* renamed from: E1 */
    public float f3513E1;

    /* renamed from: F1 */
    public final boolean f3514F1;

    /* renamed from: G1 */
    public boolean f3515G1;

    /* renamed from: c */
    public final RectF f3516c;

    /* renamed from: e */
    public final RectF f3517e;

    /* renamed from: m */
    public final Matrix f3518m;

    /* renamed from: s */
    public final Paint f3519s;

    /* renamed from: w1 */
    public final Paint f3520w1;

    /* renamed from: x1 */
    public int f3521x1;

    /* renamed from: y1 */
    public int f3522y1;

    /* renamed from: z1 */
    public Bitmap f3523z1;

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3516c = new RectF();
        this.f3517e = new RectF();
        this.f3518m = new Matrix();
        this.f3519s = new Paint();
        this.f3520w1 = new Paint();
        this.f3521x1 = -16777216;
        this.f3522y1 = 0;
        super.setScaleType(f3507H1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f3391b, 0, 0);
        this.f3522y1 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3521x1 = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.f3514F1 = true;
        if (this.f3515G1) {
            m2216b();
            this.f3515G1 = false;
        }
    }

    /* renamed from: a */
    public static Bitmap m2215a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            boolean z6 = drawable instanceof ColorDrawable;
            Bitmap.Config config = f3508I1;
            Bitmap createBitmap = z6 ? Bitmap.createBitmap(1, 1, config) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void m2216b() {
        float width;
        float height;
        if (!this.f3514F1) {
            this.f3515G1 = true;
            return;
        }
        if (this.f3523z1 == null) {
            return;
        }
        Bitmap bitmap = this.f3523z1;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f3509A1 = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = this.f3519s;
        paint.setAntiAlias(true);
        paint.setShader(this.f3509A1);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.f3520w1;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f3521x1);
        paint2.setStrokeWidth(this.f3522y1);
        this.f3511C1 = this.f3523z1.getHeight();
        this.f3510B1 = this.f3523z1.getWidth();
        float width2 = getWidth();
        float height2 = getHeight();
        RectF rectF = this.f3517e;
        float f7 = 0.0f;
        rectF.set(0.0f, 0.0f, width2, height2);
        this.f3513E1 = Math.min((rectF.height() - this.f3522y1) / 2.0f, (rectF.width() - this.f3522y1) / 2.0f);
        int i7 = this.f3522y1;
        float width3 = rectF.width() - this.f3522y1;
        float height3 = rectF.height() - this.f3522y1;
        RectF rectF2 = this.f3516c;
        rectF2.set(i7, i7, width3, height3);
        this.f3512D1 = Math.min(rectF2.height() / 2.0f, rectF2.width() / 2.0f);
        Matrix matrix = this.f3518m;
        matrix.set(null);
        if (rectF2.height() * this.f3510B1 > rectF2.width() * this.f3511C1) {
            width = rectF2.height() / this.f3511C1;
            f7 = (rectF2.width() - (this.f3510B1 * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = rectF2.width() / this.f3510B1;
            height = (rectF2.height() - (this.f3511C1 * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        int i8 = (int) (f7 + 0.5f);
        int i9 = this.f3522y1;
        matrix.postTranslate(i8 + i9, ((int) (height + 0.5f)) + i9);
        this.f3509A1.setLocalMatrix(matrix);
        invalidate();
    }

    public int getBorderColor() {
        return this.f3521x1;
    }

    public int getBorderWidth() {
        return this.f3522y1;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f3507H1;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f3512D1, this.f3519s);
        if (this.f3522y1 != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f3513E1, this.f3520w1);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        m2216b();
    }

    public void setBorderColor(int i7) {
        if (i7 == this.f3521x1) {
            return;
        }
        this.f3521x1 = i7;
        this.f3520w1.setColor(i7);
        invalidate();
    }

    public void setBorderWidth(int i7) {
        if (i7 == this.f3522y1) {
            return;
        }
        this.f3522y1 = i7;
        m2216b();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f3523z1 = bitmap;
        m2216b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f3523z1 = m2215a(drawable);
        m2216b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.f3523z1 = m2215a(getDrawable());
        m2216b();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f3507H1) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
