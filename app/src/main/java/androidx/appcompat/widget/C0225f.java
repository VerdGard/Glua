package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R$attr;
import p066i0.C1315i;
import p066i0.InterfaceC1318l;

/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public class C0225f extends Button implements InterfaceC1318l {

    /* renamed from: c */
    public final C0222e f886c;

    /* renamed from: e */
    public final C0220d0 f887e;

    /* renamed from: m */
    public C0249n f888m;

    public C0225f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0225f(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        C0224e1.m743a(context);
        C0218c1.m702a(getContext(), this);
        C0222e c0222e = new C0222e(this);
        this.f886c = c0222e;
        c0222e.m737d(attributeSet, i7);
        C0220d0 c0220d0 = new C0220d0(this);
        this.f887e = c0220d0;
        c0220d0.m712f(attributeSet, i7);
        c0220d0.m709b();
        getEmojiTextViewHelper().m863a(attributeSet, i7);
    }

    private C0249n getEmojiTextViewHelper() {
        if (this.f888m == null) {
            this.f888m = new C0249n(this);
        }
        return this.f888m;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f886c;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C0257p1.f1048b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            return Math.round(c0220d0.f867i.f907e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C0257p1.f1048b) {
            return super.getAutoSizeMinTextSize();
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            return Math.round(c0220d0.f867i.f906d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C0257p1.f1048b) {
            return super.getAutoSizeStepGranularity();
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            return Math.round(c0220d0.f867i.f905c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0257p1.f1048b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0220d0 c0220d0 = this.f887e;
        return c0220d0 != null ? c0220d0.f867i.f908f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0257p1.f1048b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            return c0220d0.f867i.f903a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1315i.m3657f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f886c;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f886c;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f887e.m710d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f887e.m711e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 == null || C0257p1.f1048b) {
            return;
        }
        c0220d0.f867i.m777a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        boolean z6 = false;
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null && !C0257p1.f1048b) {
            C0232h0 c0232h0 = c0220d0.f867i;
            if (c0232h0.m782i() && c0232h0.f903a != 0) {
                z6 = true;
            }
        }
        if (z6) {
            c0220d0.f867i.m777a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().m864b(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (C0257p1.f1048b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            c0220d0.m714i(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (C0257p1.f1048b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            c0220d0.m715j(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (C0257p1.f1048b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            c0220d0.m716k(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f886c;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f886c;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1315i.m3658g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().m865c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1005b.f7502a.mo4012a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            c0220d0.f859a.setAllCaps(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f886c;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f886c;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0220d0 c0220d0 = this.f887e;
        c0220d0.m717l(colorStateList);
        c0220d0.m709b();
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0220d0 c0220d0 = this.f887e;
        c0220d0.m718m(mode);
        c0220d0.m709b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 != null) {
            c0220d0.m713g(i7, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f7) {
        boolean z6 = C0257p1.f1048b;
        if (z6) {
            super.setTextSize(i7, f7);
            return;
        }
        C0220d0 c0220d0 = this.f887e;
        if (c0220d0 == null || z6) {
            return;
        }
        C0232h0 c0232h0 = c0220d0.f867i;
        if (c0232h0.m782i() && c0232h0.f903a != 0) {
            return;
        }
        c0232h0.m779f(i7, f7);
    }
}
