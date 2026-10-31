package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p025d.C0872a;
import p066i0.InterfaceC1317k;
import p066i0.InterfaceC1318l;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0265t extends RadioButton implements InterfaceC1317k, InterfaceC1318l {

    /* renamed from: c */
    public final C0237j f1091c;

    /* renamed from: e */
    public final C0222e f1092e;

    /* renamed from: m */
    public final C0220d0 f1093m;

    /* renamed from: s */
    public C0249n f1094s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0265t(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        C0224e1.m743a(context);
        C0218c1.m702a(getContext(), this);
        C0237j c0237j = new C0237j(this);
        this.f1091c = c0237j;
        c0237j.m806b(attributeSet, i7);
        C0222e c0222e = new C0222e(this);
        this.f1092e = c0222e;
        c0222e.m737d(attributeSet, i7);
        C0220d0 c0220d0 = new C0220d0(this);
        this.f1093m = c0220d0;
        c0220d0.m712f(attributeSet, i7);
        getEmojiTextViewHelper().m863a(attributeSet, i7);
    }

    private C0249n getEmojiTextViewHelper() {
        if (this.f1094s == null) {
            this.f1094s = new C0249n(this);
        }
        return this.f1094s;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f1092e;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0220d0 c0220d0 = this.f1093m;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0237j c0237j = this.f1091c;
        if (c0237j != null) {
            c0237j.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f1092e;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f1092e;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    @Override // p066i0.InterfaceC1317k
    public ColorStateList getSupportButtonTintList() {
        C0237j c0237j = this.f1091c;
        if (c0237j != null) {
            return c0237j.f929b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0237j c0237j = this.f1091c;
        if (c0237j != null) {
            return c0237j.f930c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1093m.m710d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1093m.m711e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().m864b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f1092e;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f1092e;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(C0872a.m2561a(getContext(), i7));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0237j c0237j = this.f1091c;
        if (c0237j != null) {
            if (c0237j.f933f) {
                c0237j.f933f = false;
            } else {
                c0237j.f933f = true;
                c0237j.m805a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f1093m;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f1093m;
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
        C0222e c0222e = this.f1092e;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f1092e;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    @Override // p066i0.InterfaceC1317k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0237j c0237j = this.f1091c;
        if (c0237j != null) {
            c0237j.f929b = colorStateList;
            c0237j.f931d = true;
            c0237j.m805a();
        }
    }

    @Override // p066i0.InterfaceC1317k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0237j c0237j = this.f1091c;
        if (c0237j != null) {
            c0237j.f930c = mode;
            c0237j.f932e = true;
            c0237j.m805a();
        }
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0220d0 c0220d0 = this.f1093m;
        c0220d0.m717l(colorStateList);
        c0220d0.m709b();
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0220d0 c0220d0 = this.f1093m;
        c0220d0.m718m(mode);
        c0220d0.m709b();
    }
}
