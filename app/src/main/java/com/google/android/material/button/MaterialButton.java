package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0225f;
import com.google.android.material.R$style;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p025d.C0872a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p037e3.C1137a;
import p066i0.C1315i;
import p082k0.AbstractC1446a;
import p166v.C2009a;
import p170v3.C2015a;
import p170v3.C2016b;
import p189y.C2213a;
import p193y3.C2240i;
import p193y3.InterfaceC2244m;

/* loaded from: classes.dex */
public class MaterialButton extends C0225f implements Checkable, InterfaceC2244m {

    /* renamed from: J1 */
    public static final int[] f3938J1 = {R.attr.state_checkable};

    /* renamed from: K1 */
    public static final int[] f3939K1 = {R.attr.state_checked};

    /* renamed from: L1 */
    public static final int f3940L1 = R$style.Widget_MaterialComponents_Button;

    /* renamed from: A1 */
    public Drawable f3941A1;

    /* renamed from: B1 */
    public String f3942B1;

    /* renamed from: C1 */
    public int f3943C1;

    /* renamed from: D1 */
    public int f3944D1;

    /* renamed from: E1 */
    public int f3945E1;

    /* renamed from: F1 */
    public int f3946F1;

    /* renamed from: G1 */
    public boolean f3947G1;

    /* renamed from: H1 */
    public boolean f3948H1;

    /* renamed from: I1 */
    public int f3949I1;

    /* renamed from: s */
    public final C1137a f3950s;

    /* renamed from: w1 */
    public final LinkedHashSet<InterfaceC0760a> f3951w1;

    /* renamed from: x1 */
    public InterfaceC0761b f3952x1;

    /* renamed from: y1 */
    public PorterDuff.Mode f3953y1;

    /* renamed from: z1 */
    public ColorStateList f3954z1;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC0760a {
        /* renamed from: a */
        void m2324a();
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC0761b {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public static class C0762c extends AbstractC1446a {
        public static final Parcelable.Creator<C0762c> CREATOR = new a();

        /* renamed from: m */
        public boolean f3955m;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        public class a implements Parcelable.ClassLoaderCreator<C0762c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0762c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0762c[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0762c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0762c(parcel, classLoader);
            }
        }

        public C0762c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C0762c.class.getClassLoader();
            }
            this.f3955m = parcel.readInt() == 1;
        }

        public C0762c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            parcel.writeInt(this.f3955m ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f7 = 0.0f;
        for (int i7 = 0; i7 < lineCount; i7++) {
            f7 = Math.max(f7, getLayout().getLineWidth(i7));
        }
        return (int) Math.ceil(f7);
    }

    /* renamed from: a */
    public final boolean m2320a() {
        C1137a c1137a = this.f3950s;
        return (c1137a == null || c1137a.f5666o) ? false : true;
    }

    /* renamed from: b */
    public final void m2321b() {
        int i7 = this.f3949I1;
        if (i7 == 1 || i7 == 2) {
            C1315i.b.m3666e(this, this.f3941A1, null, null, null);
            return;
        }
        if (i7 == 3 || i7 == 4) {
            C1315i.b.m3666e(this, null, null, this.f3941A1, null);
            return;
        }
        if (i7 == 16 || i7 == 32) {
            C1315i.b.m3666e(this, null, this.f3941A1, null, null);
        }
    }

    /* renamed from: c */
    public final void m2322c(boolean z6) {
        Drawable drawable = this.f3941A1;
        boolean z7 = true;
        if (drawable != null) {
            Drawable mutate = C2213a.m5359g(drawable).mutate();
            this.f3941A1 = mutate;
            C2213a.b.m5372h(mutate, this.f3954z1);
            PorterDuff.Mode mode = this.f3953y1;
            if (mode != null) {
                C2213a.b.m5373i(this.f3941A1, mode);
            }
            int i7 = this.f3943C1;
            if (i7 == 0) {
                i7 = this.f3941A1.getIntrinsicWidth();
            }
            int i8 = this.f3943C1;
            if (i8 == 0) {
                i8 = this.f3941A1.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3941A1;
            int i9 = this.f3944D1;
            int i10 = this.f3945E1;
            drawable2.setBounds(i9, i10, i7 + i9, i8 + i10);
            this.f3941A1.setVisible(true, z6);
        }
        if (z6) {
            m2321b();
            return;
        }
        Drawable[] m3662a = C1315i.b.m3662a(this);
        Drawable drawable3 = m3662a[0];
        Drawable drawable4 = m3662a[1];
        Drawable drawable5 = m3662a[2];
        int i11 = this.f3949I1;
        if (!(i11 == 1 || i11 == 2) || drawable3 == this.f3941A1) {
            if (!(i11 == 3 || i11 == 4) || drawable5 == this.f3941A1) {
                if (!(i11 == 16 || i11 == 32) || drawable4 == this.f3941A1) {
                    z7 = false;
                }
            }
        }
        if (z7) {
            m2321b();
        }
    }

    /* renamed from: d */
    public final void m2323d(int i7, int i8) {
        if (this.f3941A1 == null || getLayout() == null) {
            return;
        }
        int i9 = this.f3949I1;
        if (!(i9 == 1 || i9 == 2)) {
            if (!(i9 == 3 || i9 == 4)) {
                if (i9 != 16 && i9 != 32) {
                    r2 = false;
                }
                if (r2) {
                    this.f3944D1 = 0;
                    if (i9 == 16) {
                        this.f3945E1 = 0;
                        m2322c(false);
                        return;
                    }
                    int i10 = this.f3943C1;
                    if (i10 == 0) {
                        i10 = this.f3941A1.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i8 - getTextHeight()) - getPaddingTop()) - i10) - this.f3946F1) - getPaddingBottom()) / 2);
                    if (this.f3945E1 != max) {
                        this.f3945E1 = max;
                        m2322c(false);
                    }
                    return;
                }
                return;
            }
        }
        this.f3945E1 = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i11 = this.f3949I1;
        if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f3944D1 = 0;
            m2322c(false);
            return;
        }
        int i12 = this.f3943C1;
        if (i12 == 0) {
            i12 = this.f3941A1.getIntrinsicWidth();
        }
        int textLayoutWidth = i7 - getTextLayoutWidth();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        int m2848e = (((textLayoutWidth - C0946x.e.m2848e(this)) - i12) - this.f3946F1) - C0946x.e.m2849f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            m2848e /= 2;
        }
        if ((C0946x.e.m2847d(this) == 1) != (this.f3949I1 == 4)) {
            m2848e = -m2848e;
        }
        if (this.f3944D1 != m2848e) {
            this.f3944D1 = m2848e;
            m2322c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f3942B1)) {
            return this.f3942B1;
        }
        C1137a c1137a = this.f3950s;
        return (c1137a != null && c1137a.f5668q ? CompoundButton.class : Button.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m2320a()) {
            return this.f3950s.f5658g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3941A1;
    }

    public int getIconGravity() {
        return this.f3949I1;
    }

    public int getIconPadding() {
        return this.f3946F1;
    }

    public int getIconSize() {
        return this.f3943C1;
    }

    public ColorStateList getIconTint() {
        return this.f3954z1;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3953y1;
    }

    public int getInsetBottom() {
        return this.f3950s.f5657f;
    }

    public int getInsetTop() {
        return this.f3950s.f5656e;
    }

    public ColorStateList getRippleColor() {
        if (m2320a()) {
            return this.f3950s.f5663l;
        }
        return null;
    }

    public C2240i getShapeAppearanceModel() {
        if (m2320a()) {
            return this.f3950s.f5653b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m2320a()) {
            return this.f3950s.f5662k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m2320a()) {
            return this.f3950s.f5659h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0225f
    public ColorStateList getSupportBackgroundTintList() {
        return m2320a() ? this.f3950s.f5661j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0225f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m2320a() ? this.f3950s.f5660i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3947G1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m2320a()) {
            C0017d.m78R(this, this.f3950s.m3317b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        C1137a c1137a = this.f3950s;
        if (c1137a != null && c1137a.f5668q) {
            View.mergeDrawableStates(onCreateDrawableState, f3938J1);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3939K1);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0225f, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0225f, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C1137a c1137a = this.f3950s;
        accessibilityNodeInfo.setCheckable(c1137a != null && c1137a.f5668q);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0225f, android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        C1137a c1137a;
        super.onLayout(z6, i7, i8, i9, i10);
        if (Build.VERSION.SDK_INT == 21 && (c1137a = this.f3950s) != null) {
            int i11 = i10 - i8;
            int i12 = i9 - i7;
            Drawable drawable = c1137a.f5664m;
            if (drawable != null) {
                drawable.setBounds(c1137a.f5654c, c1137a.f5656e, i12 - c1137a.f5655d, i11 - c1137a.f5657f);
            }
        }
        m2323d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0762c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0762c c0762c = (C0762c) parcelable;
        super.onRestoreInstanceState(c0762c.f6946c);
        setChecked(c0762c.f3955m);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0762c c0762c = new C0762c(super.onSaveInstanceState());
        c0762c.f3955m = this.f3947G1;
        return c0762c;
    }

    @Override // androidx.appcompat.widget.C0225f, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        m2323d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3950s.f5669r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3941A1 != null) {
            if (this.f3941A1.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f3942B1 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (!m2320a()) {
            super.setBackgroundColor(i7);
            return;
        }
        C1137a c1137a = this.f3950s;
        if (c1137a.m3317b(false) != null) {
            c1137a.m3317b(false).setTint(i7);
        }
    }

    @Override // androidx.appcompat.widget.C0225f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m2320a()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            C1137a c1137a = this.f3950s;
            c1137a.f5666o = true;
            ColorStateList colorStateList = c1137a.f5661j;
            MaterialButton materialButton = c1137a.f5652a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(c1137a.f5660i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0225f, android.view.View
    public void setBackgroundResource(int i7) {
        setBackgroundDrawable(i7 != 0 ? C0872a.m2561a(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (m2320a()) {
            this.f3950s.f5668q = z6;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        C1137a c1137a = this.f3950s;
        if ((c1137a != null && c1137a.f5668q) && isEnabled() && this.f3947G1 != z6) {
            this.f3947G1 = z6;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z7 = this.f3947G1;
                if (!materialButtonToggleGroup.f3964x1) {
                    materialButtonToggleGroup.m2326b(getId(), z7);
                }
            }
            if (this.f3948H1) {
                return;
            }
            this.f3948H1 = true;
            Iterator<InterfaceC0760a> it = this.f3951w1.iterator();
            while (it.hasNext()) {
                it.next().m2324a();
            }
            this.f3948H1 = false;
        }
    }

    public void setCornerRadius(int i7) {
        if (m2320a()) {
            C1137a c1137a = this.f3950s;
            if (c1137a.f5667p && c1137a.f5658g == i7) {
                return;
            }
            c1137a.f5658g = i7;
            c1137a.f5667p = true;
            C2240i c2240i = c1137a.f5653b;
            float f7 = i7;
            c2240i.getClass();
            C2240i.a aVar = new C2240i.a(c2240i);
            aVar.m5440e(f7);
            aVar.m5441f(f7);
            aVar.m5439d(f7);
            aVar.m5438c(f7);
            c1137a.m3318c(new C2240i(aVar));
        }
    }

    public void setCornerRadiusResource(int i7) {
        if (m2320a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        if (m2320a()) {
            this.f3950s.m3317b(false).m5427j(f7);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3941A1 != drawable) {
            this.f3941A1 = drawable;
            m2322c(true);
            m2323d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i7) {
        if (this.f3949I1 != i7) {
            this.f3949I1 = i7;
            m2323d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i7) {
        if (this.f3946F1 != i7) {
            this.f3946F1 = i7;
            setCompoundDrawablePadding(i7);
        }
    }

    public void setIconResource(int i7) {
        setIcon(i7 != 0 ? C0872a.m2561a(getContext(), i7) : null);
    }

    public void setIconSize(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3943C1 != i7) {
            this.f3943C1 = i7;
            m2322c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3954z1 != colorStateList) {
            this.f3954z1 = colorStateList;
            m2322c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3953y1 != mode) {
            this.f3953y1 = mode;
            m2322c(false);
        }
    }

    public void setIconTintResource(int i7) {
        setIconTint(C2009a.m4896c(i7, getContext()));
    }

    public void setInsetBottom(int i7) {
        C1137a c1137a = this.f3950s;
        c1137a.m3319d(c1137a.f5656e, i7);
    }

    public void setInsetTop(int i7) {
        C1137a c1137a = this.f3950s;
        c1137a.m3319d(i7, c1137a.f5657f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0761b interfaceC0761b) {
        this.f3952x1 = interfaceC0761b;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        InterfaceC0761b interfaceC0761b = this.f3952x1;
        if (interfaceC0761b != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z6);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m2320a()) {
            C1137a c1137a = this.f3950s;
            if (c1137a.f5663l != colorStateList) {
                c1137a.f5663l = colorStateList;
                boolean z6 = C1137a.f5650u;
                MaterialButton materialButton = c1137a.f5652a;
                if (z6 && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C2016b.m4910a(colorStateList));
                } else {
                    if (z6 || !(materialButton.getBackground() instanceof C2015a)) {
                        return;
                    }
                    ((C2015a) materialButton.getBackground()).setTintList(C2016b.m4910a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i7) {
        if (m2320a()) {
            setRippleColor(C2009a.m4896c(i7, getContext()));
        }
    }

    @Override // p193y3.InterfaceC2244m
    public void setShapeAppearanceModel(C2240i c2240i) {
        if (!m2320a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f3950s.m3318c(c2240i);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (m2320a()) {
            C1137a c1137a = this.f3950s;
            c1137a.f5665n = z6;
            c1137a.m3321f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m2320a()) {
            C1137a c1137a = this.f3950s;
            if (c1137a.f5662k != colorStateList) {
                c1137a.f5662k = colorStateList;
                c1137a.m3321f();
            }
        }
    }

    public void setStrokeColorResource(int i7) {
        if (m2320a()) {
            setStrokeColor(C2009a.m4896c(i7, getContext()));
        }
    }

    public void setStrokeWidth(int i7) {
        if (m2320a()) {
            C1137a c1137a = this.f3950s;
            if (c1137a.f5659h != i7) {
                c1137a.f5659h = i7;
                c1137a.m3321f();
            }
        }
    }

    public void setStrokeWidthResource(int i7) {
        if (m2320a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i7));
        }
    }

    @Override // androidx.appcompat.widget.C0225f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m2320a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1137a c1137a = this.f3950s;
        if (c1137a.f5661j != colorStateList) {
            c1137a.f5661j = colorStateList;
            if (c1137a.m3317b(false) != null) {
                C2213a.b.m5372h(c1137a.m3317b(false), c1137a.f5661j);
            }
        }
    }

    @Override // androidx.appcompat.widget.C0225f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m2320a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1137a c1137a = this.f3950s;
        if (c1137a.f5660i != mode) {
            c1137a.f5660i = mode;
            if (c1137a.m3317b(false) == null || c1137a.f5660i == null) {
                return;
            }
            C2213a.b.m5373i(c1137a.m3317b(false), c1137a.f5660i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i7) {
        super.setTextAlignment(i7);
        m2323d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z6) {
        this.f3950s.f5669r = z6;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3947G1);
    }
}
