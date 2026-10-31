package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.C0217c0;
import p034e0.C0912c;
import p034e0.C0946x;
import p034e0.InterfaceC0940r;
import p066i0.C1315i;
import p066i0.C1316j;
import p066i0.InterfaceC1318l;

/* renamed from: androidx.appcompat.widget.l */
/* loaded from: classes.dex */
public class C0243l extends EditText implements InterfaceC0940r, InterfaceC1318l {

    /* renamed from: c */
    public final C0222e f962c;

    /* renamed from: e */
    public final C0220d0 f963e;

    /* renamed from: m */
    public final C0217c0 f964m;

    /* renamed from: s */
    public final C1316j f965s;

    /* renamed from: w1 */
    public final C0246m f966w1;

    /* renamed from: x1 */
    public a f967x1;

    /* renamed from: androidx.appcompat.widget.l$a */
    public class a {
        public a() {
        }
    }

    public C0243l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0243l(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        C0224e1.m743a(context);
        C0218c1.m702a(getContext(), this);
        C0222e c0222e = new C0222e(this);
        this.f962c = c0222e;
        c0222e.m737d(attributeSet, i7);
        C0220d0 c0220d0 = new C0220d0(this);
        this.f963e = c0220d0;
        c0220d0.m712f(attributeSet, i7);
        c0220d0.m709b();
        this.f964m = new C0217c0(this);
        this.f965s = new C1316j();
        C0246m c0246m = new C0246m(this);
        this.f966w1 = c0246m;
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

    private a getSuperCaller() {
        if (this.f967x1 == null) {
            this.f967x1 = new a();
        }
        return this.f967x1;
    }

    @Override // p034e0.InterfaceC0940r
    /* renamed from: a */
    public final C0912c mo841a(C0912c c0912c) {
        return this.f965s.mo2795a(this, c0912c);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f962c;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0220d0 c0220d0 = this.f963e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1315i.m3657f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f962c;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f962c;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f963e.m710d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f963e.m711e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0217c0 c0217c0;
        if (Build.VERSION.SDK_INT >= 28 || (c0217c0 = this.f964m) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0217c0.f847b;
        return textClassifier == null ? C0217c0.a.m701a(c0217c0.f846a) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            androidx.appcompat.widget.d0 r1 = r7.f963e
            r1.getClass()
            androidx.appcompat.widget.C0220d0.m707h(r7, r0, r8)
            androidx.activity.C0143v.m426X(r7, r8, r0)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = p034e0.C0946x.m2807h(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            p058h0.C1274a.m3585b(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            h0.d r2 = new h0.d
            r6 = 0
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            h0.e r1 = new h0.e
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = p058h0.C1276c.f6349a
            if (r1 < r5) goto L59
            java.lang.String[] r1 = p058h0.C1275b.m3588b(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            h0.f r1 = new h0.f
            r1.<init>(r0, r2)
            goto L4b
        L77:
            androidx.appcompat.widget.m r1 = r7.f966w1
            android.view.inputmethod.InputConnection r8 = r1.m853h(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0243l.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i7 = Build.VERSION.SDK_INT;
        boolean z6 = false;
        if (i7 < 31 && i7 >= 24 && dragEvent.getLocalState() == null && C0946x.m2807h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z6 = C0269v.m892a(dragEvent, this, activity);
            }
        }
        if (z6) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 31 && C0946x.m2807h(this) != null && (i7 == 16908322 || i7 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C0912c.b aVar = i8 >= 31 ? new C0912c.a(primaryClip, 1) : new C0912c.c(primaryClip, 1);
                aVar.mo2664b(i7 != 16908322 ? 1 : 0);
                C0946x.m2813n(this, aVar.build());
            }
            r2 = 1;
        }
        if (r2 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f962c;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f962c;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f963e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f963e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1315i.m3658g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f966w1.m854i(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f966w1.m851f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f962c;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f962c;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0220d0 c0220d0 = this.f963e;
        c0220d0.m717l(colorStateList);
        c0220d0.m709b();
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0220d0 c0220d0 = this.f963e;
        c0220d0.m718m(mode);
        c0220d0.m709b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0220d0 c0220d0 = this.f963e;
        if (c0220d0 != null) {
            c0220d0.m713g(i7, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0217c0 c0217c0;
        if (Build.VERSION.SDK_INT >= 28 || (c0217c0 = this.f964m) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0217c0.f847b = textClassifier;
        }
    }
}
