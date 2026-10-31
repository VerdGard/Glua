package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.activity.C0143v;
import p025d.C0872a;
import p066i0.InterfaceC1318l;

/* renamed from: androidx.appcompat.widget.q */
/* loaded from: classes.dex */
public final class C0258q extends MultiAutoCompleteTextView implements InterfaceC1318l {

    /* renamed from: s */
    public static final int[] f1049s = {R.attr.popupBackground};

    /* renamed from: c */
    public final C0222e f1050c;

    /* renamed from: e */
    public final C0220d0 f1051e;

    /* renamed from: m */
    public final C0246m f1052m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0258q(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            int r0 = androidx.appcompat.R$attr.autoCompleteTextViewStyle
            androidx.appcompat.widget.C0224e1.m743a(r5)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            androidx.appcompat.widget.C0218c1.m702a(r5, r4)
            android.content.Context r5 = r4.getContext()
            int[] r1 = androidx.appcompat.widget.C0258q.f1049s
            androidx.appcompat.widget.h1 r5 = androidx.appcompat.widget.C0233h1.m790m(r5, r6, r1, r0)
            r1 = 0
            boolean r2 = r5.m802l(r1)
            if (r2 == 0) goto L27
            android.graphics.drawable.Drawable r1 = r5.m795e(r1)
            r4.setDropDownBackgroundDrawable(r1)
        L27:
            r5.m803n()
            androidx.appcompat.widget.e r5 = new androidx.appcompat.widget.e
            r5.<init>(r4)
            r4.f1050c = r5
            r5.m737d(r6, r0)
            androidx.appcompat.widget.d0 r5 = new androidx.appcompat.widget.d0
            r5.<init>(r4)
            r4.f1051e = r5
            r5.m712f(r6, r0)
            r5.m709b()
            androidx.appcompat.widget.m r5 = new androidx.appcompat.widget.m
            r5.<init>(r4)
            r4.f1052m = r5
            r5.m852g(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            boolean r0 = r4.isFocusable()
            boolean r1 = r4.isClickable()
            boolean r2 = r4.isLongClickable()
            int r3 = r4.getInputType()
            android.text.method.KeyListener r5 = r5.m851f(r6)
            if (r5 != r6) goto L6c
            goto L7b
        L6c:
            super.setKeyListener(r5)
            r4.setRawInputType(r3)
            r4.setFocusable(r0)
            r4.setClickable(r1)
            r4.setLongClickable(r2)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0258q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f1050c;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0220d0 c0220d0 = this.f1051e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f1050c;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f1050c;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1051e.m710d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1051e.m711e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0143v.m426X(this, editorInfo, onCreateInputConnection);
        return this.f1052m.m853h(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f1050c;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f1050c;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f1051e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f1051e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(C0872a.m2561a(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f1052m.m854i(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1052m.m851f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f1050c;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f1050c;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0220d0 c0220d0 = this.f1051e;
        c0220d0.m717l(colorStateList);
        c0220d0.m709b();
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0220d0 c0220d0 = this.f1051e;
        c0220d0.m718m(mode);
        c0220d0.m709b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0220d0 c0220d0 = this.f1051e;
        if (c0220d0 != null) {
            c0220d0.m713g(i7, context);
        }
    }
}
