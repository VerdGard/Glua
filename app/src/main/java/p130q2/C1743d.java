package p130q2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import p138r2.AbstractC1822a;

/* renamed from: q2.d */
/* loaded from: classes.dex */
public final class C1743d extends AbstractC1822a {

    /* renamed from: X */
    public boolean f7956X;

    /* renamed from: Y */
    public a f7957Y;

    /* renamed from: c */
    public final Rect f7958c = new Rect();

    /* renamed from: e */
    public final int f7959e;

    /* renamed from: m */
    public final int f7960m;

    /* renamed from: s */
    public boolean f7961s;

    /* renamed from: q2.d$a */
    public static class a extends Drawable.ConstantState {

        /* renamed from: d */
        public static final Paint f7962d = new Paint(6);

        /* renamed from: a */
        public final Bitmap f7963a;

        /* renamed from: b */
        public int f7964b;

        /* renamed from: c */
        public Paint f7965c;

        public a(a aVar) {
            Bitmap bitmap = aVar.f7963a;
            this.f7965c = f7962d;
            this.f7963a = bitmap;
            this.f7964b = aVar.f7964b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new C1743d(null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new C1743d(resources, this);
        }
    }

    public C1743d(Resources resources, a aVar) {
        int i7;
        if (aVar == null) {
            throw new NullPointerException("BitmapState must not be null");
        }
        this.f7957Y = aVar;
        if (resources != null) {
            i7 = resources.getDisplayMetrics().densityDpi;
            i7 = i7 == 0 ? 160 : i7;
            aVar.f7964b = i7;
        } else {
            i7 = aVar.f7964b;
        }
        Bitmap bitmap = aVar.f7963a;
        this.f7959e = bitmap.getScaledWidth(i7);
        this.f7960m = bitmap.getScaledHeight(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6 = this.f7961s;
        Rect rect = this.f7958c;
        if (z6) {
            Gravity.apply(119, this.f7959e, this.f7960m, getBounds(), rect);
            this.f7961s = false;
        }
        a aVar = this.f7957Y;
        canvas.drawBitmap(aVar.f7963a, (Rect) null, rect, aVar.f7965c);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f7957Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f7960m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f7959e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap = this.f7957Y.f7963a;
        return (bitmap == null || bitmap.hasAlpha() || this.f7957Y.f7965c.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f7956X && super.mutate() == this) {
            this.f7957Y = new a(this.f7957Y);
            this.f7956X = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7961s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f7957Y.f7965c.getAlpha() != i7) {
            a aVar = this.f7957Y;
            if (a.f7962d == aVar.f7965c) {
                aVar.f7965c = new Paint(6);
            }
            aVar.f7965c.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        a aVar = this.f7957Y;
        if (a.f7962d == aVar.f7965c) {
            aVar.f7965c = new Paint(6);
        }
        aVar.f7965c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
    }
}
