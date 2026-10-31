package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.activity.C0143v;
import androidx.appcompat.widget.C0217c0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p017c0.C0576d;
import p025d.C0872a;
import p036e2.C1109v5;
import p066i0.C1315i;
import p066i0.InterfaceC1318l;
import p181x.C2156e;
import p181x.C2163l;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC1318l {

    /* renamed from: c */
    public final C0222e f644c;

    /* renamed from: e */
    public final C0220d0 f645e;

    /* renamed from: m */
    public final C0217c0 f646m;

    /* renamed from: s */
    public C0249n f647s;

    /* renamed from: w1 */
    public boolean f648w1;

    /* renamed from: x1 */
    public C0179b f649x1;

    /* renamed from: y1 */
    public Future<C0576d> f650y1;

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$a */
    public interface InterfaceC0178a {
        /* renamed from: a */
        void mo602a(int i7);

        /* renamed from: b */
        void mo603b(int i7);
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$b */
    public class C0179b implements InterfaceC0178a {
        public C0179b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC0178a
        /* renamed from: a */
        public void mo602a(int i7) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC0178a
        /* renamed from: b */
        public void mo603b(int i7) {
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$c */
    public class C0180c extends C0179b {
        public C0180c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C0179b, androidx.appcompat.widget.AppCompatTextView.InterfaceC0178a
        /* renamed from: a */
        public final void mo602a(int i7) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i7);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C0179b, androidx.appcompat.widget.AppCompatTextView.InterfaceC0178a
        /* renamed from: b */
        public final void mo603b(int i7) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i7);
        }
    }

    public AppCompatTextView() {
        throw null;
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        C0224e1.m743a(context);
        this.f648w1 = false;
        this.f649x1 = null;
        C0218c1.m702a(getContext(), this);
        C0222e c0222e = new C0222e(this);
        this.f644c = c0222e;
        c0222e.m737d(attributeSet, i7);
        C0220d0 c0220d0 = new C0220d0(this);
        this.f645e = c0220d0;
        c0220d0.m712f(attributeSet, i7);
        c0220d0.m709b();
        this.f646m = new C0217c0(this);
        getEmojiTextViewHelper().m863a(attributeSet, i7);
    }

    private C0249n getEmojiTextViewHelper() {
        if (this.f647s == null) {
            this.f647s = new C0249n(this);
        }
        return this.f647s;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0222e c0222e = this.f644c;
        if (c0222e != null) {
            c0222e.m734a();
        }
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C0257p1.f1048b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0220d0 c0220d0 = this.f645e;
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
        C0220d0 c0220d0 = this.f645e;
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
        C0220d0 c0220d0 = this.f645e;
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
        C0220d0 c0220d0 = this.f645e;
        return c0220d0 != null ? c0220d0.f867i.f908f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0257p1.f1048b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            return c0220d0.f867i.f903a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1315i.m3657f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0178a getSuperCaller() {
        C0179b c0179b;
        if (this.f649x1 == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                c0179b = new C0180c();
            } else if (i7 >= 26) {
                c0179b = new C0179b();
            }
            this.f649x1 = c0179b;
        }
        return this.f649x1;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0222e c0222e = this.f644c;
        if (c0222e != null) {
            return c0222e.m735b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0222e c0222e = this.f644c;
        if (c0222e != null) {
            return c0222e.m736c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f645e.m710d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f645e.m711e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<C0576d> future = this.f650y1;
        if (future != null) {
            try {
                this.f650y1 = null;
                C1315i.m3655d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0217c0 c0217c0;
        if (Build.VERSION.SDK_INT >= 28 || (c0217c0 = this.f646m) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c0217c0.f847b;
        return textClassifier == null ? C0217c0.a.m701a(c0217c0.f846a) : textClassifier;
    }

    public C0576d.a getTextMetricsParamsCompat() {
        return C1315i.m3652a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f645e.getClass();
        C0220d0.m707h(this, onCreateInputConnection, editorInfo);
        C0143v.m426X(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 == null || C0257p1.f1048b) {
            return;
        }
        c0220d0.f867i.m777a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i8) {
        Future<C0576d> future = this.f650y1;
        if (future != null) {
            try {
                this.f650y1 = null;
                C1315i.m3655d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        boolean z6 = false;
        C0220d0 c0220d0 = this.f645e;
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
        C0220d0 c0220d0 = this.f645e;
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
        C0220d0 c0220d0 = this.f645e;
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
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            c0220d0.m716k(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0222e c0222e = this.f644c;
        if (c0222e != null) {
            c0222e.m738e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0222e c0222e = this.f644c;
        if (c0222e != null) {
            c0222e.m739f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? C0872a.m2561a(context, i7) : null, i8 != 0 ? C0872a.m2561a(context, i8) : null, i9 != 0 ? C0872a.m2561a(context, i9) : null, i10 != 0 ? C0872a.m2561a(context, i10) : null);
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? C0872a.m2561a(context, i7) : null, i8 != 0 ? C0872a.m2561a(context, i8) : null, i9 != 0 ? C0872a.m2561a(context, i9) : null, i10 != 0 ? C0872a.m2561a(context, i10) : null);
        C0220d0 c0220d0 = this.f645e;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1005b.f7502a.mo4012a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo603b(i7);
        } else {
            C1315i.m3653b(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo602a(i7);
        } else {
            C1315i.m3654c(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        C1109v5.m3252p(i7);
        if (i7 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i7 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(C0576d c0576d) {
        C1315i.m3655d(this, c0576d);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0222e c0222e = this.f644c;
        if (c0222e != null) {
            c0222e.m741h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0222e c0222e = this.f644c;
        if (c0222e != null) {
            c0222e.m742i(mode);
        }
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0220d0 c0220d0 = this.f645e;
        c0220d0.m717l(colorStateList);
        c0220d0.m709b();
    }

    @Override // p066i0.InterfaceC1318l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0220d0 c0220d0 = this.f645e;
        c0220d0.m718m(mode);
        c0220d0.m709b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            c0220d0.m713g(i7, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0217c0 c0217c0;
        if (Build.VERSION.SDK_INT >= 28 || (c0217c0 = this.f646m) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0217c0.f847b = textClassifier;
        }
    }

    public void setTextFuture(Future<C0576d> future) {
        this.f650y1 = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTextMetricsParamsCompat(p017c0.C0576d.a r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            android.text.TextDirectionHeuristic r1 = r4.f2940b
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 != r2) goto L9
            goto L32
        L9:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r2) goto Le
            goto L32
        Le:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r1 != r2) goto L14
            r1 = 2
            goto L33
        L14:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LTR
            if (r1 != r2) goto L1a
            r1 = 3
            goto L33
        L1a:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.RTL
            if (r1 != r2) goto L20
            r1 = 4
            goto L33
        L20:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LOCALE
            if (r1 != r2) goto L26
            r1 = 5
            goto L33
        L26:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r2) goto L2c
            r1 = 6
            goto L33
        L2c:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 != r2) goto L32
            r1 = 7
            goto L33
        L32:
            r1 = 1
        L33:
            p066i0.C1315i.b.m3669h(r3, r1)
            r1 = 23
            android.text.TextPaint r2 = r4.f2939a
            if (r0 >= r1) goto L5d
            float r4 = r2.getTextScaleX()
            android.text.TextPaint r0 = r3.getPaint()
            r0.set(r2)
            float r0 = r3.getTextScaleX()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L59
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r4 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            r3.setTextScaleX(r0)
        L59:
            r3.setTextScaleX(r4)
            goto L6e
        L5d:
            android.text.TextPaint r0 = r3.getPaint()
            r0.set(r2)
            int r0 = r4.f2941c
            p066i0.C1315i.c.m3674e(r3, r0)
            int r4 = r4.f2942d
            p066i0.C1315i.c.m3677h(r3, r4)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.setTextMetricsParamsCompat(c0.d$a):void");
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f7) {
        boolean z6 = C0257p1.f1048b;
        if (z6) {
            super.setTextSize(i7, f7);
            return;
        }
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 == null || z6) {
            return;
        }
        C0232h0 c0232h0 = c0220d0.f867i;
        if (c0232h0.m782i() && c0232h0.f903a != 0) {
            return;
        }
        c0232h0.m779f(i7, f7);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typeface2;
        if (this.f648w1) {
            return;
        }
        if (typeface == null || i7 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            C2163l c2163l = C2156e.f9771a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i7);
        }
        this.f648w1 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f648w1 = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0220d0 c0220d0 = this.f645e;
        if (c0220d0 != null) {
            c0220d0.m709b();
        }
    }
}
