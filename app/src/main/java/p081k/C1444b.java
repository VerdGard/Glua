package p081k;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: k.b */
/* loaded from: classes.dex */
public final class C1444b extends Drawable {

    /* renamed from: a */
    public float f6932a;

    /* renamed from: c */
    public final RectF f6934c;

    /* renamed from: d */
    public final Rect f6935d;

    /* renamed from: e */
    public float f6936e;

    /* renamed from: h */
    public ColorStateList f6939h;

    /* renamed from: i */
    public PorterDuffColorFilter f6940i;

    /* renamed from: j */
    public ColorStateList f6941j;

    /* renamed from: f */
    public boolean f6937f = false;

    /* renamed from: g */
    public boolean f6938g = true;

    /* renamed from: k */
    public PorterDuff.Mode f6942k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f6933b = new Paint(5);

    public C1444b(float f7, ColorStateList colorStateList) {
        this.f6932a = f7;
        m3827b(colorStateList);
        this.f6934c = new RectF();
        this.f6935d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m3826a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public final void m3827b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f6939h = colorStateList;
        this.f6933b.setColor(colorStateList.getColorForState(getState(), this.f6939h.getDefaultColor()));
    }

    /* renamed from: c */
    public final void m3828c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f6934c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f6935d;
        rect2.set(rect);
        if (this.f6937f) {
            float m3829a = C1445c.m3829a(this.f6936e, this.f6932a, this.f6938g);
            float f7 = this.f6936e;
            float f8 = this.f6932a;
            if (this.f6938g) {
                f7 = (float) (((1.0d - C1445c.f6943a) * f8) + f7);
            }
            rect2.inset((int) Math.ceil(f7), (int) Math.ceil(m3829a));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z6;
        Paint paint = this.f6933b;
        if (this.f6940i == null || paint.getColorFilter() != null) {
            z6 = false;
        } else {
            paint.setColorFilter(this.f6940i);
            z6 = true;
        }
        RectF rectF = this.f6934c;
        float f7 = this.f6932a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (z6) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f6935d, this.f6932a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f6941j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f6939h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m3828c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f6939h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f6933b;
        boolean z6 = colorForState != paint.getColor();
        if (z6) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f6941j;
        if (colorStateList2 == null || (mode = this.f6942k) == null) {
            return z6;
        }
        this.f6940i = m3826a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f6933b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6933b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f6941j = colorStateList;
        this.f6940i = m3826a(colorStateList, this.f6942k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f6942k = mode;
        this.f6940i = m3826a(this.f6941j, mode);
        invalidateSelf();
    }
}
