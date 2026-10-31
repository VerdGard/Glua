package p131q3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0256p0;
import com.google.android.material.R$styleable;

/* renamed from: q3.f */
/* loaded from: classes.dex */
public class C1750f extends C0256p0 {

    /* renamed from: H1 */
    public Drawable f8036H1;

    /* renamed from: I1 */
    public final Rect f8037I1;

    /* renamed from: J1 */
    public final Rect f8038J1;

    /* renamed from: K1 */
    public int f8039K1;

    /* renamed from: L1 */
    public final boolean f8040L1;

    /* renamed from: M1 */
    public boolean f8041M1;

    public C1750f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1750f(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, 0);
        this.f8037I1 = new Rect();
        this.f8038J1 = new Rect();
        this.f8039K1 = 119;
        this.f8040L1 = true;
        this.f8041M1 = false;
        TypedArray m4235d = C1762r.m4235d(context, attributeSet, R$styleable.f3736j, 0, 0, new int[0]);
        this.f8039K1 = m4235d.getInt(R$styleable.ForegroundLinearLayout_android_foregroundGravity, this.f8039K1);
        Drawable drawable = m4235d.getDrawable(R$styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8040L1 = m4235d.getBoolean(R$styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        m4235d.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f8036H1;
        if (drawable != null) {
            if (this.f8041M1) {
                this.f8041M1 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z6 = this.f8040L1;
                Rect rect = this.f8037I1;
                if (z6) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i7 = this.f8039K1;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f8038J1;
                Gravity.apply(i7, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f8036H1;
        if (drawable != null) {
            drawable.setHotspot(f7, f8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8036H1;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f8036H1.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f8036H1;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f8039K1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8036H1;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.C0256p0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        this.f8041M1 = z6 | this.f8041M1;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f8041M1 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f8036H1;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f8036H1);
            }
            this.f8036H1 = drawable;
            this.f8041M1 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8039K1 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i7) {
        if (this.f8039K1 != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f8039K1 = i7;
            if (i7 == 119 && this.f8036H1 != null) {
                this.f8036H1.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8036H1;
    }
}
