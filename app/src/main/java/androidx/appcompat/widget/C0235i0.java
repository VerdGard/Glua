package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p066i0.InterfaceC1318l;

/* renamed from: androidx.appcompat.widget.i0 */
/* loaded from: classes.dex */
public final class C0235i0 extends ToggleButton implements InterfaceC1318l {

    /* renamed from: c */
    public final C0222e f923c;

    /* renamed from: e */
    public final C0220d0 f924e;

    /* renamed from: m */
    public C0249n f925m;

    public C0235i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        C0218c1.m702a(getContext(), this);
        C0222e c0222e = new C0222e(this);
        this.f923c = c0222e;
        c0222e.m737d(attributeSet, R.attr.buttonStyleToggle);
        C0220d0 c0220d0 = new C0220d0(this);
        this.f924e = c0220d0;
        c0220d0.m712f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m863a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0249n getEmojiTextViewHelper() {
        if (this.f925m == null) {
            this.f925m = new C0249n(this);
        }
        return this.f925m;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f923c;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0220d0 c0220d0 = this.f924e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f923c;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f923c;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f924e.m710d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f924e.m711e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().m864b(z6);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f923c;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f923c;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f924e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f924e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().m865c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1005b.f7502a.mo4012a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f923c;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f923c;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0220d0 c0220d0 = this.f924e;
        c0220d0.m717l(colorStateList);
        c0220d0.m709b();
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0220d0 c0220d0 = this.f924e;
        c0220d0.m718m(mode);
        c0220d0.m709b();
    }
}
