package p189y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p189y.C2213a;

/* renamed from: y.d */
/* loaded from: classes.dex */
public class C2216d extends Drawable implements Drawable.Callback, InterfaceC2215c, InterfaceC2214b {

    /* renamed from: Z */
    public static final PorterDuff.Mode f10037Z = PorterDuff.Mode.SRC_IN;

    /* renamed from: X */
    public boolean f10038X;

    /* renamed from: Y */
    public Drawable f10039Y;

    /* renamed from: c */
    public int f10040c;

    /* renamed from: e */
    public PorterDuff.Mode f10041e;

    /* renamed from: m */
    public boolean f10042m;

    /* renamed from: s */
    public C2218f f10043s;

    public C2216d(Drawable drawable) {
        this.f10043s = new C2218f(this.f10043s);
        mo5376a(drawable);
    }

    @Override // p189y.InterfaceC2215c
    /* renamed from: a */
    public final void mo5376a(Drawable drawable) {
        Drawable drawable2 = this.f10039Y;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f10039Y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C2218f c2218f = this.f10043s;
            if (c2218f != null) {
                c2218f.f10046b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // p189y.InterfaceC2215c
    /* renamed from: b */
    public final Drawable mo5377b() {
        return this.f10039Y;
    }

    /* renamed from: c */
    public boolean mo5378c() {
        throw null;
    }

    /* renamed from: d */
    public final boolean m5379d(int[] iArr) {
        if (!mo5378c()) {
            return false;
        }
        C2218f c2218f = this.f10043s;
        ColorStateList colorStateList = c2218f.f10047c;
        PorterDuff.Mode mode = c2218f.f10048d;
        if (colorStateList == null || mode == null) {
            this.f10042m = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f10042m || colorForState != this.f10040c || mode != this.f10041e) {
                setColorFilter(colorForState, mode);
                this.f10040c = colorForState;
                this.f10041e = mode;
                this.f10042m = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f10039Y.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C2218f c2218f = this.f10043s;
        return changingConfigurations | (c2218f != null ? c2218f.getChangingConfigurations() : 0) | this.f10039Y.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C2218f c2218f = this.f10043s;
        if (c2218f == null) {
            return null;
        }
        if (!(c2218f.f10046b != null)) {
            return null;
        }
        c2218f.f10045a = getChangingConfigurations();
        return this.f10043s;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f10039Y.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f10039Y.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f10039Y.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return C2213a.m5354b(this.f10039Y);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f10039Y.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f10039Y.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f10039Y.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f10039Y.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f10039Y.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f10039Y.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return C2213a.a.m5363d(this.f10039Y);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C2218f c2218f;
        ColorStateList colorStateList = (!mo5378c() || (c2218f = this.f10043s) == null) ? null : c2218f.f10047c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f10039Y.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f10039Y.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f10038X && super.mutate() == this) {
            this.f10043s = new C2218f(this.f10043s);
            Drawable drawable = this.f10039Y;
            if (drawable != null) {
                drawable.mutate();
            }
            C2218f c2218f = this.f10043s;
            if (c2218f != null) {
                Drawable drawable2 = this.f10039Y;
                c2218f.f10046b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f10038X = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10039Y;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        return C2213a.m5355c(this.f10039Y, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        return this.f10039Y.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f10039Y.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        C2213a.a.m5364e(this.f10039Y, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i7) {
        this.f10039Y.setChangingConfigurations(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f10039Y.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        this.f10039Y.setDither(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z6) {
        this.f10039Y.setFilterBitmap(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m5379d(iArr) || this.f10039Y.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f10043s.f10047c = colorStateList;
        m5379d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f10043s.f10048d = mode;
        m5379d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        return super.setVisible(z6, z7) || this.f10039Y.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public C2216d(C2218f c2218f, Resources resources) {
        Drawable.ConstantState constantState;
        this.f10043s = c2218f;
        if (c2218f == null || (constantState = c2218f.f10046b) == null) {
            return;
        }
        mo5376a(constantState.newDrawable(resources));
    }
}
