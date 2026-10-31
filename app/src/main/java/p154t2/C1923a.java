package p154t2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p138r2.AbstractC1822a;

/* renamed from: t2.a */
/* loaded from: classes.dex */
public final class C1923a extends AbstractC1822a {

    /* renamed from: c */
    public boolean f8687c;

    /* renamed from: e */
    public boolean f8688e;

    /* renamed from: m */
    public boolean f8689m;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.f8689m) {
            throw null;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8689m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        this.f8688e = z6;
        if (!z6) {
            throw null;
        }
        if (this.f8687c) {
            throw null;
        }
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f8687c = true;
        if (this.f8688e) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f8687c = false;
        throw null;
    }
}
