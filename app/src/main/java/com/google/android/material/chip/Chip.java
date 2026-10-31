package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.result.AbstractC0136c;
import androidx.appcompat.widget.C0228g;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.chip.C0775a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p004a3.C0040g;
import p017c0.C0573a;
import p017c0.C0579g;
import p025d.C0872a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1151g;
import p069i3.C1334c;
import p090l0.AbstractC1484a;
import p131q3.C1760p;
import p131q3.InterfaceC1751g;
import p163u3.C1973d;
import p166v.C2009a;
import p170v3.C2016b;
import p189y.C2213a;
import p189y.InterfaceC2215c;
import p193y3.C2240i;
import p193y3.InterfaceC2244m;

/* loaded from: classes.dex */
public class Chip extends C0228g implements C0775a.a, InterfaceC2244m, Checkable {

    /* renamed from: O1 */
    public static final int f4015O1 = R$style.Widget_MaterialComponents_Chip_Action;

    /* renamed from: P1 */
    public static final Rect f4016P1 = new Rect();

    /* renamed from: Q1 */
    public static final int[] f4017Q1 = {R.attr.state_selected};

    /* renamed from: R1 */
    public static final int[] f4018R1 = {R.attr.state_checkable};

    /* renamed from: A1 */
    public CompoundButton.OnCheckedChangeListener f4019A1;

    /* renamed from: B1 */
    public boolean f4020B1;

    /* renamed from: C1 */
    public boolean f4021C1;

    /* renamed from: D1 */
    public boolean f4022D1;

    /* renamed from: E1 */
    public boolean f4023E1;

    /* renamed from: F1 */
    public boolean f4024F1;

    /* renamed from: G1 */
    public int f4025G1;

    /* renamed from: H1 */
    public int f4026H1;

    /* renamed from: I1 */
    public CharSequence f4027I1;

    /* renamed from: J1 */
    public final C0774b f4028J1;

    /* renamed from: K1 */
    public boolean f4029K1;

    /* renamed from: L1 */
    public final Rect f4030L1;

    /* renamed from: M1 */
    public final RectF f4031M1;

    /* renamed from: N1 */
    public final C0773a f4032N1;

    /* renamed from: w1 */
    public C0775a f4033w1;

    /* renamed from: x1 */
    public InsetDrawable f4034x1;

    /* renamed from: y1 */
    public RippleDrawable f4035y1;

    /* renamed from: z1 */
    public View.OnClickListener f4036z1;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C0773a extends AbstractC0136c {
        public C0773a() {
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: u */
        public final void mo392u(int i7) {
        }

        @Override // androidx.activity.result.AbstractC0136c
        /* renamed from: v */
        public final void mo393v(Typeface typeface, boolean z6) {
            Chip chip = Chip.this;
            C0775a c0775a = chip.f4033w1;
            chip.setText(c0775a.f4066S2 ? c0775a.f4067T1 : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C0774b extends AbstractC1484a {
        public C0774b(Chip chip) {
            super(chip);
        }

        @Override // p090l0.AbstractC1484a
        /* renamed from: l */
        public final void mo2369l(ArrayList arrayList) {
            boolean z6 = false;
            arrayList.add(0);
            int i7 = Chip.f4015O1;
            Chip chip = Chip.this;
            if (chip.m2364d()) {
                C0775a c0775a = chip.f4033w1;
                if (c0775a != null && c0775a.f4075Z1) {
                    z6 = true;
                }
                if (!z6 || chip.f4036z1 == null) {
                    return;
                }
                arrayList.add(1);
            }
        }

        @Override // p090l0.AbstractC1484a
        /* renamed from: o */
        public final void mo2370o(int i7, C1151g c1151g) {
            AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
            if (i7 != 1) {
                accessibilityNodeInfo.setContentDescription("");
                accessibilityNodeInfo.setBoundsInParent(Chip.f4016P1);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                int i8 = R$string.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                accessibilityNodeInfo.setContentDescription(context.getString(i8, objArr).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            c1151g.m3337b(C1151g.a.f5690g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f4031M1;
        rectF.setEmpty();
        if (m2364d() && this.f4036z1 != null) {
            C0775a c0775a = this.f4033w1;
            Rect bounds = c0775a.getBounds();
            rectF.setEmpty();
            if (c0775a.m2394U()) {
                float f7 = c0775a.f4094s2 + c0775a.f4093r2 + c0775a.f4079d2 + c0775a.f4092q2 + c0775a.f4091p2;
                if (C2213a.m5354b(c0775a) == 0) {
                    float f8 = bounds.right;
                    rectF.right = f8;
                    rectF.left = f8 - f7;
                } else {
                    float f9 = bounds.left;
                    rectF.left = f9;
                    rectF.right = f9 + f7;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i7 = (int) closeIconTouchBounds.left;
        int i8 = (int) closeIconTouchBounds.top;
        int i9 = (int) closeIconTouchBounds.right;
        int i10 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f4030L1;
        rect.set(i7, i8, i9, i10);
        return rect;
    }

    private C1973d getTextAppearance() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4101z2.f8117f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.f4022D1 != z6) {
            this.f4022D1 = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.f4021C1 != z6) {
            this.f4021C1 = z6;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.C0775a.a
    /* renamed from: a */
    public final void mo2362a() {
        m2363c(this.f4026H1);
        requestLayout();
        invalidateOutline();
    }

    /* renamed from: c */
    public final void m2363c(int i7) {
        this.f4026H1 = i7;
        if (!this.f4024F1) {
            InsetDrawable insetDrawable = this.f4034x1;
            if (insetDrawable == null) {
                int[] iArr = C2016b.f9168a;
                m2366f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f4034x1 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = C2016b.f9168a;
                    m2366f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i7 - ((int) this.f4033w1.f4057O1));
        int max2 = Math.max(0, i7 - this.f4033w1.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f4034x1;
            if (insetDrawable2 == null) {
                int[] iArr3 = C2016b.f9168a;
                m2366f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f4034x1 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = C2016b.f9168a;
                    m2366f();
                    return;
                }
                return;
            }
        }
        int i8 = max2 > 0 ? max2 / 2 : 0;
        int i9 = max > 0 ? max / 2 : 0;
        if (this.f4034x1 != null) {
            Rect rect = new Rect();
            this.f4034x1.getPadding(rect);
            if (rect.top == i9 && rect.bottom == i9 && rect.left == i8 && rect.right == i8) {
                int[] iArr5 = C2016b.f9168a;
                m2366f();
                return;
            }
        }
        if (getMinHeight() != i7) {
            setMinHeight(i7);
        }
        if (getMinWidth() != i7) {
            setMinWidth(i7);
        }
        this.f4034x1 = new InsetDrawable((Drawable) this.f4033w1, i8, i9, i8, i9);
        int[] iArr6 = C2016b.f9168a;
        m2366f();
    }

    /* renamed from: d */
    public final boolean m2364d() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            Object obj = c0775a.f4076a2;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof InterfaceC2215c) {
                obj = ((InterfaceC2215c) obj).mo5377b();
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f4029K1
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            com.google.android.material.chip.Chip$b r0 = r10.f4028J1
            android.view.accessibility.AccessibilityManager r1 = r0.f7059h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.794E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.f7064m
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.f7064m = r7
            r0.m3887q(r7, r5)
            r0.m3887q(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r9 = r8.m2364d()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = 1
            goto L5f
        L5e:
            r1 = 0
        L5f:
            int r6 = r0.f7064m
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.f7064m = r1
            r0.m3887q(r1, r5)
            r0.m3887q(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = 1
            goto L71
        L70:
            r0 = 0
        L71:
            if (r0 != 0) goto L7b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L7a
            goto L7b
        L7a:
            r3 = 0
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f4029K1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0774b c0774b = this.f4028J1;
        c0774b.getClass();
        boolean z6 = false;
        int i7 = 0;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        z6 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i8 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i8 = 33;
                                } else if (keyCode == 21) {
                                    i8 = 17;
                                } else if (keyCode != 22) {
                                    i8 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z7 = false;
                                while (i7 < repeatCount && c0774b.m3884m(i8, null)) {
                                    i7++;
                                    z7 = true;
                                }
                                z6 = z7;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i9 = c0774b.f7063l;
                    if (i9 != Integer.MIN_VALUE) {
                        Chip chip = Chip.this;
                        if (i9 == 0) {
                            chip.performClick();
                        } else if (i9 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f4036z1;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f4029K1) {
                                chip.f4028J1.m3887q(1, 1);
                            }
                        }
                    }
                    z6 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z6 = c0774b.m3884m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z6 = c0774b.m3884m(1, null);
            }
        }
        if (!z6 || c0774b.f7063l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.C0228g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i7;
        super.drawableStateChanged();
        C0775a c0775a = this.f4033w1;
        boolean z6 = false;
        if (c0775a != null && C0775a.m2373u(c0775a.f4076a2)) {
            C0775a c0775a2 = this.f4033w1;
            ?? isEnabled = isEnabled();
            int i8 = isEnabled;
            if (this.f4023E1) {
                i8 = isEnabled + 1;
            }
            int i9 = i8;
            if (this.f4022D1) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (this.f4021C1) {
                i10 = i9 + 1;
            }
            int i11 = i10;
            if (isChecked()) {
                i11 = i10 + 1;
            }
            int[] iArr = new int[i11];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (this.f4023E1) {
                iArr[i7] = 16842908;
                i7++;
            }
            if (this.f4022D1) {
                iArr[i7] = 16843623;
                i7++;
            }
            if (this.f4021C1) {
                iArr[i7] = 16842919;
                i7++;
            }
            if (isChecked()) {
                iArr[i7] = 16842913;
            }
            if (!Arrays.equals(c0775a2.f4056N2, iArr)) {
                c0775a2.f4056N2 = iArr;
                if (c0775a2.m2394U()) {
                    z6 = c0775a2.m2402w(c0775a2.getState(), iArr);
                }
            }
        }
        if (z6) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m2365e() {
        boolean z6 = false;
        if (m2364d()) {
            C0775a c0775a = this.f4033w1;
            if ((c0775a != null && c0775a.f4075Z1) && this.f4036z1 != null) {
                C0946x.m2817r(this, this.f4028J1);
                z6 = true;
                this.f4029K1 = z6;
            }
        }
        C0946x.m2817r(this, null);
        this.f4029K1 = z6;
    }

    /* renamed from: f */
    public final void m2366f() {
        this.f4035y1 = new RippleDrawable(C2016b.m4910a(this.f4033w1.f4065S1), getBackgroundDrawable(), null);
        C0775a c0775a = this.f4033w1;
        if (c0775a.f4058O2) {
            c0775a.f4058O2 = false;
            c0775a.f4060P2 = null;
            c0775a.onStateChange(c0775a.getState());
        }
        RippleDrawable rippleDrawable = this.f4035y1;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2841q(this, rippleDrawable);
        m2367g();
    }

    /* renamed from: g */
    public final void m2367g() {
        C0775a c0775a;
        if (TextUtils.isEmpty(getText()) || (c0775a = this.f4033w1) == null) {
            return;
        }
        int m2399r = (int) (c0775a.m2399r() + c0775a.f4094s2 + c0775a.f4091p2);
        C0775a c0775a2 = this.f4033w1;
        int m2398q = (int) (c0775a2.m2398q() + c0775a2.f4087l2 + c0775a2.f4090o2);
        if (this.f4034x1 != null) {
            Rect rect = new Rect();
            this.f4034x1.getPadding(rect);
            m2398q += rect.left;
            m2399r += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.e.m2854k(this, m2398q, paddingTop, m2399r, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f4027I1)) {
            return this.f4027I1;
        }
        C0775a c0775a = this.f4033w1;
        if (!(c0775a != null && c0775a.f4081f2)) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof C1334c)) {
            return "android.widget.Button";
        }
        ((C1334c) parent).getClass();
        throw null;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f4034x1;
        return insetDrawable == null ? this.f4033w1 : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4083h2;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4084i2;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4055N1;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return Math.max(0.0f, c0775a.m2400s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f4033w1;
    }

    public float getChipEndPadding() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4094s2;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || (drawable = c0775a.f4071V1) == 0) {
            return null;
        }
        boolean z6 = drawable instanceof InterfaceC2215c;
        Drawable drawable2 = drawable;
        if (z6) {
            drawable2 = ((InterfaceC2215c) drawable).mo5377b();
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4073X1;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4072W1;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4057O1;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4087l2;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4061Q1;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4063R1;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || (drawable = c0775a.f4076a2) == 0) {
            return null;
        }
        boolean z6 = drawable instanceof InterfaceC2215c;
        Drawable drawable2 = drawable;
        if (z6) {
            drawable2 = ((InterfaceC2215c) drawable).mo5377b();
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4080e2;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4093r2;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4079d2;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4092q2;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4078c2;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4064R2;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f4029K1) {
            C0774b c0774b = this.f4028J1;
            if (c0774b.f7063l == 1 || c0774b.f7062k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0040g getHideMotionSpec() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4086k2;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4089n2;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4088m2;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4065S1;
        }
        return null;
    }

    public C2240i getShapeAppearanceModel() {
        return this.f4033w1.f10154c.f10163a;
    }

    public C0040g getShowMotionSpec() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4085j2;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4091p2;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            return c0775a.f4090o2;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void m2368h() {
        TextPaint paint = getPaint();
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            paint.drawableState = c0775a.getState();
        }
        C1973d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4593e(getContext(), paint, this.f4032N1);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0017d.m78R(this, this.f4033w1);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f4017Q1);
        }
        C0775a c0775a = this.f4033w1;
        if (c0775a != null && c0775a.f4081f2) {
            View.mergeDrawableStates(onCreateDrawableState, f4018R1);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i7, Rect rect) {
        super.onFocusChanged(z6, i7, rect);
        if (this.f4029K1) {
            C0774b c0774b = this.f4028J1;
            int i8 = c0774b.f7063l;
            if (i8 != Integer.MIN_VALUE) {
                c0774b.m3882j(i8);
            }
            if (z6) {
                c0774b.m3884m(i7, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C0775a c0775a = this.f4033w1;
        accessibilityNodeInfo.setCheckable(c0775a != null && c0775a.f4081f2);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C1334c) {
            C1334c c1334c = (C1334c) getParent();
            if (c1334c.f8034m) {
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i8 >= c1334c.getChildCount()) {
                        i9 = -1;
                        break;
                    }
                    View childAt = c1334c.getChildAt(i8);
                    if (childAt instanceof Chip) {
                        if (!(c1334c.getChildAt(i8).getVisibility() == 0)) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    i8++;
                }
                i7 = i9;
            } else {
                i7 = -1;
            }
            Object tag = getTag(R$id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C1151g.b.m3349a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i7, 1, false, isChecked()).f5702a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        PointerIcon systemIcon;
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i7);
        }
        systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        return systemIcon;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        if (this.f4025G1 != i7) {
            this.f4025G1 = i7;
            m2367g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.f4021C1
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.f4021C1
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f4036z1
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f4029K1
            if (r0 == 0) goto L42
            com.google.android.material.chip.Chip$b r0 = r5.f4028J1
            r0.m3887q(r2, r2)
        L42:
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = 0
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f4027I1 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4035y1) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0228g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4035y1) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0228g, android.view.View
    public void setBackgroundResource(int i7) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z6) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2403x(z6);
        }
    }

    public void setCheckableResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2403x(c0775a.f4095t2.getResources().getBoolean(i7));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null) {
            this.f4020B1 = z6;
        } else if (c0775a.f4081f2) {
            super.setChecked(z6);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2404y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i7) {
        setCheckedIconVisible(i7);
    }

    public void setCheckedIconResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2404y(C0872a.m2561a(c0775a.f4095t2, i7));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2405z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2405z(C2009a.m4896c(i7, c0775a.f4095t2));
        }
    }

    public void setCheckedIconVisible(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2374A(c0775a.f4095t2.getResources().getBoolean(i7));
        }
    }

    public void setCheckedIconVisible(boolean z6) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2374A(z6);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || c0775a.f4055N1 == colorStateList) {
            return;
        }
        c0775a.f4055N1 = colorStateList;
        c0775a.onStateChange(c0775a.getState());
    }

    public void setChipBackgroundColorResource(int i7) {
        ColorStateList m4896c;
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || c0775a.f4055N1 == (m4896c = C2009a.m4896c(i7, c0775a.f4095t2))) {
            return;
        }
        c0775a.f4055N1 = m4896c;
        c0775a.onStateChange(c0775a.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2375B(f7);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2375B(c0775a.f4095t2.getResources().getDimension(i7));
        }
    }

    public void setChipDrawable(C0775a c0775a) {
        C0775a c0775a2 = this.f4033w1;
        if (c0775a2 != c0775a) {
            if (c0775a2 != null) {
                c0775a2.f4062Q2 = new WeakReference<>(null);
            }
            this.f4033w1 = c0775a;
            c0775a.f4066S2 = false;
            c0775a.f4062Q2 = new WeakReference<>(this);
            m2363c(this.f4026H1);
        }
    }

    public void setChipEndPadding(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || c0775a.f4094s2 == f7) {
            return;
        }
        c0775a.f4094s2 = f7;
        c0775a.invalidateSelf();
        c0775a.m2401v();
    }

    public void setChipEndPaddingResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            float dimension = c0775a.f4095t2.getResources().getDimension(i7);
            if (c0775a.f4094s2 != dimension) {
                c0775a.f4094s2 = dimension;
                c0775a.invalidateSelf();
                c0775a.m2401v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2376C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i7) {
        setChipIconVisible(i7);
    }

    public void setChipIconResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2376C(C0872a.m2561a(c0775a.f4095t2, i7));
        }
    }

    public void setChipIconSize(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2377D(f7);
        }
    }

    public void setChipIconSizeResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2377D(c0775a.f4095t2.getResources().getDimension(i7));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2378E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2378E(C2009a.m4896c(i7, c0775a.f4095t2));
        }
    }

    public void setChipIconVisible(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2379F(c0775a.f4095t2.getResources().getBoolean(i7));
        }
    }

    public void setChipIconVisible(boolean z6) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2379F(z6);
        }
    }

    public void setChipMinHeight(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || c0775a.f4057O1 == f7) {
            return;
        }
        c0775a.f4057O1 = f7;
        c0775a.invalidateSelf();
        c0775a.m2401v();
    }

    public void setChipMinHeightResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            float dimension = c0775a.f4095t2.getResources().getDimension(i7);
            if (c0775a.f4057O1 != dimension) {
                c0775a.f4057O1 = dimension;
                c0775a.invalidateSelf();
                c0775a.m2401v();
            }
        }
    }

    public void setChipStartPadding(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || c0775a.f4087l2 == f7) {
            return;
        }
        c0775a.f4087l2 = f7;
        c0775a.invalidateSelf();
        c0775a.m2401v();
    }

    public void setChipStartPaddingResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            float dimension = c0775a.f4095t2.getResources().getDimension(i7);
            if (c0775a.f4087l2 != dimension) {
                c0775a.f4087l2 = dimension;
                c0775a.invalidateSelf();
                c0775a.m2401v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2380G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2380G(C2009a.m4896c(i7, c0775a.f4095t2));
        }
    }

    public void setChipStrokeWidth(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2381H(f7);
        }
    }

    public void setChipStrokeWidthResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2381H(c0775a.f4095t2.getResources().getDimension(i7));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i7) {
        setText(getResources().getString(i7));
    }

    public void setCloseIcon(Drawable drawable) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2382I(drawable);
        }
        m2365e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || c0775a.f4080e2 == charSequence) {
            return;
        }
        String str = C0573a.f2926d;
        Locale locale = Locale.getDefault();
        int i7 = C0579g.f2950a;
        C0573a c0573a = C0579g.a.m2025a(locale) == 1 ? C0573a.f2929g : C0573a.f2928f;
        c0775a.f4080e2 = c0573a.m1999c(charSequence, c0573a.f2932c);
        c0775a.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i7) {
        setCloseIconVisible(i7);
    }

    public void setCloseIconEndPadding(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2383J(f7);
        }
    }

    public void setCloseIconEndPaddingResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2383J(c0775a.f4095t2.getResources().getDimension(i7));
        }
    }

    public void setCloseIconResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2382I(C0872a.m2561a(c0775a.f4095t2, i7));
        }
        m2365e();
    }

    public void setCloseIconSize(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2384K(f7);
        }
    }

    public void setCloseIconSizeResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2384K(c0775a.f4095t2.getResources().getDimension(i7));
        }
    }

    public void setCloseIconStartPadding(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2385L(f7);
        }
    }

    public void setCloseIconStartPaddingResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2385L(c0775a.f4095t2.getResources().getDimension(i7));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2386M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2386M(C2009a.m4896c(i7, c0775a.f4095t2));
        }
    }

    public void setCloseIconVisible(int i7) {
        setCloseIconVisible(getResources().getBoolean(i7));
    }

    public void setCloseIconVisible(boolean z6) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2387N(z6);
        }
        m2365e();
    }

    @Override // androidx.appcompat.widget.C0228g, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C0228g, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i7, i8, i9, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m5427j(f7);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f4033w1 == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.f4064R2 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.f4024F1 = z6;
        m2363c(this.f4026H1);
    }

    @Override // android.widget.TextView
    public void setGravity(int i7) {
        if (i7 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i7);
        }
    }

    public void setHideMotionSpec(C0040g c0040g) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.f4086k2 = c0040g;
        }
    }

    public void setHideMotionSpecResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.f4086k2 = C0040g.m128a(i7, c0775a.f4095t2);
        }
    }

    public void setIconEndPadding(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2388O(f7);
        }
    }

    public void setIconEndPaddingResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2388O(c0775a.f4095t2.getResources().getDimension(i7));
        }
    }

    public void setIconStartPadding(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2389P(f7);
        }
    }

    public void setIconStartPaddingResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2389P(c0775a.f4095t2.getResources().getDimension(i7));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC1751g<Chip> interfaceC1751g) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
        if (this.f4033w1 == null) {
            return;
        }
        super.setLayoutDirection(i7);
    }

    @Override // android.widget.TextView
    public void setLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i7) {
        super.setMaxWidth(i7);
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.f4068T2 = i7;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i7);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4019A1 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f4036z1 = onClickListener;
        m2365e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2390Q(colorStateList);
        }
        if (this.f4033w1.f4058O2) {
            return;
        }
        m2366f();
    }

    public void setRippleColorResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2390Q(C2009a.m4896c(i7, c0775a.f4095t2));
            if (this.f4033w1.f4058O2) {
                return;
            }
            m2366f();
        }
    }

    @Override // p193y3.InterfaceC2244m
    public void setShapeAppearanceModel(C2240i c2240i) {
        this.f4033w1.setShapeAppearanceModel(c2240i);
    }

    public void setShowMotionSpec(C0040g c0040g) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.f4085j2 = c0040g;
        }
    }

    public void setShowMotionSpecResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.f4085j2 = C0040g.m128a(i7, c0775a.f4095t2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0775a.f4066S2 ? null : charSequence, bufferType);
        C0775a c0775a2 = this.f4033w1;
        if (c0775a2 == null || TextUtils.equals(c0775a2.f4067T1, charSequence)) {
            return;
        }
        c0775a2.f4067T1 = charSequence;
        c0775a2.f4101z2.f8115d = true;
        c0775a2.invalidateSelf();
        c0775a2.m2401v();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2391R(new C1973d(i7, c0775a.f4095t2));
        }
        m2368h();
    }

    public void setTextAppearance(C1973d c1973d) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2391R(c1973d);
        }
        m2368h();
    }

    public void setTextAppearanceResource(int i7) {
        setTextAppearance(getContext(), i7);
    }

    public void setTextEndPadding(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || c0775a.f4091p2 == f7) {
            return;
        }
        c0775a.f4091p2 = f7;
        c0775a.invalidateSelf();
        c0775a.m2401v();
    }

    public void setTextEndPaddingResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            float dimension = c0775a.f4095t2.getResources().getDimension(i7);
            if (c0775a.f4091p2 != dimension) {
                c0775a.f4091p2 = dimension;
                c0775a.invalidateSelf();
                c0775a.m2401v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f7) {
        super.setTextSize(i7, f7);
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            float applyDimension = TypedValue.applyDimension(i7, f7, getResources().getDisplayMetrics());
            C1760p c1760p = c0775a.f4101z2;
            C1973d c1973d = c1760p.f8117f;
            if (c1973d != null) {
                c1973d.f8838k = applyDimension;
                c1760p.f8112a.setTextSize(applyDimension);
                c0775a.mo2395a();
            }
        }
        m2368h();
    }

    public void setTextStartPadding(float f7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a == null || c0775a.f4090o2 == f7) {
            return;
        }
        c0775a.f4090o2 = f7;
        c0775a.invalidateSelf();
        c0775a.m2401v();
    }

    public void setTextStartPaddingResource(int i7) {
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            float dimension = c0775a.f4095t2.getResources().getDimension(i7);
            if (c0775a.f4090o2 != dimension) {
                c0775a.f4090o2 = dimension;
                c0775a.invalidateSelf();
                c0775a.m2401v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C0775a c0775a = this.f4033w1;
        if (c0775a != null) {
            c0775a.m2391R(new C1973d(i7, c0775a.f4095t2));
        }
        m2368h();
    }
}
