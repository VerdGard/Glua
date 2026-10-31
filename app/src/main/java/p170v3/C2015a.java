package p170v3;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p189y.InterfaceC2214b;
import p193y3.C2237f;
import p193y3.C2240i;
import p193y3.InterfaceC2244m;

/* renamed from: v3.a */
/* loaded from: classes.dex */
public final class C2015a extends Drawable implements InterfaceC2244m, InterfaceC2214b {

    /* renamed from: c */
    public a f9165c;

    /* renamed from: v3.a$a */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a */
        public final C2237f f9166a;

        /* renamed from: b */
        public boolean f9167b;

        public a(a aVar) {
            this.f9166a = (C2237f) aVar.f9166a.f10154c.newDrawable();
            this.f9167b = aVar.f9167b;
        }

        public a(C2237f c2237f) {
            this.f9166a = c2237f;
            this.f9167b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new C2015a(new a(this));
        }
    }

    public C2015a(a aVar) {
        this.f9165c = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a aVar = this.f9165c;
        if (aVar.f9167b) {
            aVar.f9166a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f9165c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f9165c.f9166a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f9165c = new a(this.f9165c);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9165c.f9166a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f9165c.f9166a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m4911b = C2016b.m4911b(iArr);
        a aVar = this.f9165c;
        if (aVar.f9167b == m4911b) {
            return onStateChange;
        }
        aVar.f9167b = m4911b;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f9165c.f9166a.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9165c.f9166a.setColorFilter(colorFilter);
    }

    @Override // p193y3.InterfaceC2244m
    public final void setShapeAppearanceModel(C2240i c2240i) {
        this.f9165c.f9166a.setShapeAppearanceModel(c2240i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        this.f9165c.f9166a.setTint(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f9165c.f9166a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f9165c.f9166a.setTintMode(mode);
    }
}
