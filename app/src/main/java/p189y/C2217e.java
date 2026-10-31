package p189y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: y.e */
/* loaded from: classes.dex */
public final class C2217e extends C2216d {

    /* renamed from: w1 */
    public static Method f10044w1;

    public C2217e(Drawable drawable) {
        super(drawable);
        if (f10044w1 == null) {
            try {
                f10044w1 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e7) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e7);
            }
        }
    }

    @Override // p189y.C2216d
    /* renamed from: c */
    public final boolean mo5378c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f10039Y;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f10039Y.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f10039Y.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f10039Y;
        if (drawable != null && (method = f10044w1) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e7) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e7);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f7, float f8) {
        this.f10039Y.setHotspot(f7, f8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i8, int i9, int i10) {
        this.f10039Y.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // p189y.C2216d, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p189y.C2216d, android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        if (mo5378c()) {
            super.setTint(i7);
        } else {
            this.f10039Y.setTint(i7);
        }
    }

    @Override // p189y.C2216d, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (mo5378c()) {
            super.setTintList(colorStateList);
        } else {
            this.f10039Y.setTintList(colorStateList);
        }
    }

    @Override // p189y.C2216d, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (mo5378c()) {
            super.setTintMode(mode);
        } else {
            this.f10039Y.setTintMode(mode);
        }
    }

    public C2217e(C2218f c2218f, Resources resources) {
        super(c2218f, resources);
        if (f10044w1 == null) {
            try {
                f10044w1 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e7) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e7);
            }
        }
    }
}
