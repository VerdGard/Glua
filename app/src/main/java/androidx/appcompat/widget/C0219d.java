package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.activity.C0143v;
import androidx.appcompat.R$attr;
import p025d.C0872a;
import p066i0.C1315i;
import p066i0.InterfaceC1318l;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C0219d extends AutoCompleteTextView implements InterfaceC1318l {

    /* renamed from: s */
    public static final int[] f855s = {R.attr.popupBackground};

    /* renamed from: c */
    public final C0222e f856c;

    /* renamed from: e */
    public final C0220d0 f857e;

    /* renamed from: m */
    public final C0246m f858m;

    public C0219d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0219d(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        C0224e1.m743a(context);
        C0218c1.m702a(getContext(), this);
        C0233h1 m790m = C0233h1.m790m(getContext(), attributeSet, f855s, i7);
        if (m790m.m802l(0)) {
            setDropDownBackgroundDrawable(m790m.m795e(0));
        }
        m790m.m803n();
        C0222e c0222e = new C0222e(this);
        this.f856c = c0222e;
        c0222e.m737d(attributeSet, i7);
        C0220d0 c0220d0 = new C0220d0(this);
        this.f857e = c0220d0;
        c0220d0.m712f(attributeSet, i7);
        c0220d0.m709b();
        C0246m c0246m = new C0246m(this);
        this.f858m = c0246m;
        c0246m.m852g(attributeSet, i7);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m851f = c0246m.m851f(keyListener);
            if (m851f == keyListener) {
                return;
            }
            super.setKeyListener(m851f);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f856c;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0220d0 c0220d0 = this.f857e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1315i.m3657f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f856c;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f856c;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f857e.m710d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f857e.m711e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0143v.m426X(this, editorInfo, onCreateInputConnection);
        return this.f858m.m853h(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f856c;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f856c;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f857e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f857e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1315i.m3658g(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(C0872a.m2561a(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f858m.m854i(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f858m.m851f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f856c;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f856c;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0220d0 c0220d0 = this.f857e;
        c0220d0.m717l(colorStateList);
        c0220d0.m709b();
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0220d0 c0220d0 = this.f857e;
        c0220d0.m718m(mode);
        c0220d0.m709b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0220d0 c0220d0 = this.f857e;
        if (c0220d0 != null) {
            c0220d0.m713g(i7, context);
        }
    }
}
