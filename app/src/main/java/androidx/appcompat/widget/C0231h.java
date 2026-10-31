package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.activity.C0143v;
import p025d.C0872a;
import p066i0.C1315i;
import p066i0.InterfaceC1318l;

/* renamed from: androidx.appcompat.widget.h */
/* loaded from: classes.dex */
public final class C0231h extends CheckedTextView implements InterfaceC1318l {

    /* renamed from: c */
    public final C0234i f897c;

    /* renamed from: e */
    public final C0222e f898e;

    /* renamed from: m */
    public final C0220d0 f899m;

    /* renamed from: s */
    public C0249n f900s;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[Catch: all -> 0x00ab, TRY_ENTER, TryCatch #1 {all -> 0x00ab, blocks: (B:3:0x0043, B:5:0x004c, B:8:0x0052, B:11:0x0063, B:13:0x006b, B:15:0x0071, B:16:0x007c, B:18:0x0084, B:19:0x008b, B:21:0x0093), top: B:2:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:3:0x0043, B:5:0x004c, B:8:0x0052, B:11:0x0063, B:13:0x006b, B:15:0x0071, B:16:0x007c, B:18:0x0084, B:19:0x008b, B:21:0x0093), top: B:2:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #1 {all -> 0x00ab, blocks: (B:3:0x0043, B:5:0x004c, B:8:0x0052, B:11:0x0063, B:13:0x006b, B:15:0x0071, B:16:0x007c, B:18:0x0084, B:19:0x008b, B:21:0x0093), top: B:2:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0231h(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r6 = androidx.appcompat.R$attr.checkedTextViewStyle
            androidx.appcompat.widget.C0224e1.m743a(r8)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.C0218c1.m702a(r8, r7)
            androidx.appcompat.widget.d0 r8 = new androidx.appcompat.widget.d0
            r8.<init>(r7)
            r7.f899m = r8
            r8.m712f(r9, r6)
            r8.m709b()
            androidx.appcompat.widget.e r8 = new androidx.appcompat.widget.e
            r8.<init>(r7)
            r7.f898e = r8
            r8.m737d(r9, r6)
            androidx.appcompat.widget.i r8 = new androidx.appcompat.widget.i
            r8.<init>(r7)
            r7.f897c = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = androidx.appcompat.R$styleable.f284l
            androidx.appcompat.widget.h1 r8 = androidx.appcompat.widget.C0233h1.m790m(r8, r9, r2, r6)
            android.content.Context r1 = r7.getContext()
            android.content.res.TypedArray r4 = r8.f915b
            r0 = r7
            r3 = r9
            r5 = r6
            p034e0.C0946x.m2816q(r0, r1, r2, r3, r4, r5)
            int r0 = androidx.appcompat.R$styleable.CheckedTextView_checkMarkCompat     // Catch: java.lang.Throwable -> Lab
            boolean r1 = r8.m802l(r0)     // Catch: java.lang.Throwable -> Lab
            r2 = 0
            if (r1 == 0) goto L60
            int r0 = r8.m799i(r0, r2)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L60
            android.content.Context r1 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.Throwable -> Lab
            android.graphics.drawable.Drawable r0 = p025d.C0872a.m2561a(r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.Throwable -> Lab
            r7.setCheckMarkDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L5f java.lang.Throwable -> Lab
            r0 = 1
            goto L61
        L5f:
        L60:
            r0 = 0
        L61:
            if (r0 != 0) goto L7c
            int r0 = androidx.appcompat.R$styleable.CheckedTextView_android_checkMark     // Catch: java.lang.Throwable -> Lab
            boolean r1 = r8.m802l(r0)     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L7c
            int r0 = r8.m799i(r0, r2)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L7c
            android.content.Context r1 = r7.getContext()     // Catch: java.lang.Throwable -> Lab
            android.graphics.drawable.Drawable r0 = p025d.C0872a.m2561a(r1, r0)     // Catch: java.lang.Throwable -> Lab
            r7.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> Lab
        L7c:
            int r0 = androidx.appcompat.R$styleable.CheckedTextView_checkMarkTint     // Catch: java.lang.Throwable -> Lab
            boolean r1 = r8.m802l(r0)     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L8b
            android.content.res.ColorStateList r0 = r8.m792b(r0)     // Catch: java.lang.Throwable -> Lab
            r7.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> Lab
        L8b:
            int r0 = androidx.appcompat.R$styleable.CheckedTextView_checkMarkTintMode     // Catch: java.lang.Throwable -> Lab
            boolean r1 = r8.m802l(r0)     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto La0
            r1 = -1
            int r0 = r8.m798h(r0, r1)     // Catch: java.lang.Throwable -> Lab
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0244l0.m844c(r0, r1)     // Catch: java.lang.Throwable -> Lab
            r7.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> Lab
        La0:
            r8.m803n()
            androidx.appcompat.widget.n r8 = r7.getEmojiTextViewHelper()
            r8.m863a(r9, r6)
            return
        Lab:
            r9 = move-exception
            r8.m803n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0231h.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0249n getEmojiTextViewHelper() {
        if (this.f900s == null) {
            this.f900s = new C0249n(this);
        }
        return this.f900s;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0220d0 c0220d0 = this.f899m;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
        C0222e c0222e = this.f898e;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0234i c0234i = this.f897c;
        if (c0234i != null) {
            c0234i.m804a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1315i.m3657f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f898e;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f898e;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0234i c0234i = this.f897c;
        if (c0234i != null) {
            return c0234i.f918b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0234i c0234i = this.f897c;
        if (c0234i != null) {
            return c0234i.f919c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f899m.m710d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f899m.m711e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0143v.m426X(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().m864b(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f898e;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f898e;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(C0872a.m2561a(getContext(), i7));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0234i c0234i = this.f897c;
        if (c0234i != null) {
            if (c0234i.f922f) {
                c0234i.f922f = false;
            } else {
                c0234i.f922f = true;
                c0234i.m804a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f899m;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f899m;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1315i.m3658g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().m865c(z6);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f898e;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f898e;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0234i c0234i = this.f897c;
        if (c0234i != null) {
            c0234i.f918b = colorStateList;
            c0234i.f920d = true;
            c0234i.m804a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0234i c0234i = this.f897c;
        if (c0234i != null) {
            c0234i.f919c = mode;
            c0234i.f921e = true;
            c0234i.m804a();
        }
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0220d0 c0220d0 = this.f899m;
        c0220d0.m717l(colorStateList);
        c0220d0.m709b();
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0220d0 c0220d0 = this.f899m;
        c0220d0.m718m(mode);
        c0220d0.m709b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0220d0 c0220d0 = this.f899m;
        if (c0220d0 != null) {
            c0220d0.m713g(i7, context);
        }
    }
}
