package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.ext.C0090b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.C0143v;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0240k;
import androidx.appcompat.widget.C0244l0;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p002a1.C0017d;
import p004a3.C0034a;
import p017c0.C0573a;
import p017c0.C0579g;
import p021c4.C0621i;
import p021c4.C0629q;
import p021c4.C0630r;
import p021c4.C0631s;
import p021c4.C0633u;
import p021c4.C0636x;
import p025d.C0872a;
import p034e0.C0908a;
import p034e0.C0920g;
import p034e0.C0923h0;
import p034e0.C0946x;
import p066i0.C1315i;
import p082k0.AbstractC1446a;
import p131q3.C1746b;
import p131q3.C1747c;
import p131q3.C1767w;
import p139r3.C1832j;
import p162u2.C1969a;
import p163u3.C1970a;
import p163u3.C1971b;
import p163u3.C1973d;
import p166v.C2009a;
import p174w0.C2053d;
import p174w0.C2061l;
import p181x.C2152a;
import p189y.C2213a;
import p193y3.C2237f;
import p193y3.C2240i;
import p193y3.InterfaceC2234c;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: P2 */
    public static final int f4462P2 = R$style.Widget_Design_TextInputLayout;

    /* renamed from: Q2 */
    public static final int[][] f4463Q2 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A1 */
    public int f4464A1;

    /* renamed from: A2 */
    public int f4465A2;

    /* renamed from: B1 */
    public final C0630r f4466B1;

    /* renamed from: B2 */
    public int f4467B2;

    /* renamed from: C1 */
    public boolean f4468C1;

    /* renamed from: C2 */
    public ColorStateList f4469C2;

    /* renamed from: D1 */
    public int f4470D1;

    /* renamed from: D2 */
    public int f4471D2;

    /* renamed from: E1 */
    public boolean f4472E1;

    /* renamed from: E2 */
    public int f4473E2;

    /* renamed from: F1 */
    public InterfaceC0851f f4474F1;

    /* renamed from: F2 */
    public int f4475F2;

    /* renamed from: G1 */
    public AppCompatTextView f4476G1;

    /* renamed from: G2 */
    public int f4477G2;

    /* renamed from: H1 */
    public int f4478H1;

    /* renamed from: H2 */
    public int f4479H2;

    /* renamed from: I1 */
    public int f4480I1;

    /* renamed from: I2 */
    public boolean f4481I2;

    /* renamed from: J1 */
    public CharSequence f4482J1;

    /* renamed from: J2 */
    public final C1747c f4483J2;

    /* renamed from: K1 */
    public boolean f4484K1;

    /* renamed from: K2 */
    public boolean f4485K2;

    /* renamed from: L1 */
    public AppCompatTextView f4486L1;

    /* renamed from: L2 */
    public boolean f4487L2;

    /* renamed from: M1 */
    public ColorStateList f4488M1;

    /* renamed from: M2 */
    public ValueAnimator f4489M2;

    /* renamed from: N1 */
    public int f4490N1;

    /* renamed from: N2 */
    public boolean f4491N2;

    /* renamed from: O1 */
    public C2053d f4492O1;

    /* renamed from: O2 */
    public boolean f4493O2;

    /* renamed from: P1 */
    public C2053d f4494P1;

    /* renamed from: Q1 */
    public ColorStateList f4495Q1;

    /* renamed from: R1 */
    public ColorStateList f4496R1;

    /* renamed from: S1 */
    public ColorStateList f4497S1;

    /* renamed from: T1 */
    public ColorStateList f4498T1;

    /* renamed from: U1 */
    public boolean f4499U1;

    /* renamed from: V1 */
    public CharSequence f4500V1;

    /* renamed from: W1 */
    public boolean f4501W1;

    /* renamed from: X1 */
    public C2237f f4502X1;

    /* renamed from: Y1 */
    public C2237f f4503Y1;

    /* renamed from: Z1 */
    public StateListDrawable f4504Z1;

    /* renamed from: a2 */
    public boolean f4505a2;

    /* renamed from: b2 */
    public C2237f f4506b2;

    /* renamed from: c */
    public final FrameLayout f4507c;

    /* renamed from: c2 */
    public C2237f f4508c2;

    /* renamed from: d2 */
    public C2240i f4509d2;

    /* renamed from: e */
    public final C0636x f4510e;

    /* renamed from: e2 */
    public boolean f4511e2;

    /* renamed from: f2 */
    public final int f4512f2;

    /* renamed from: g2 */
    public int f4513g2;

    /* renamed from: h2 */
    public int f4514h2;

    /* renamed from: i2 */
    public int f4515i2;

    /* renamed from: j2 */
    public int f4516j2;

    /* renamed from: k2 */
    public int f4517k2;

    /* renamed from: l2 */
    public int f4518l2;

    /* renamed from: m */
    public final C0855a f4519m;

    /* renamed from: m2 */
    public int f4520m2;

    /* renamed from: n2 */
    public final Rect f4521n2;

    /* renamed from: o2 */
    public final Rect f4522o2;

    /* renamed from: p2 */
    public final RectF f4523p2;

    /* renamed from: q2 */
    public Typeface f4524q2;

    /* renamed from: r2 */
    public ColorDrawable f4525r2;

    /* renamed from: s */
    public EditText f4526s;

    /* renamed from: s2 */
    public int f4527s2;

    /* renamed from: t2 */
    public final LinkedHashSet<InterfaceC0852g> f4528t2;

    /* renamed from: u2 */
    public ColorDrawable f4529u2;

    /* renamed from: v2 */
    public int f4530v2;

    /* renamed from: w1 */
    public CharSequence f4531w1;

    /* renamed from: w2 */
    public Drawable f4532w2;

    /* renamed from: x1 */
    public int f4533x1;

    /* renamed from: x2 */
    public ColorStateList f4534x2;

    /* renamed from: y1 */
    public int f4535y1;

    /* renamed from: y2 */
    public ColorStateList f4536y2;

    /* renamed from: z1 */
    public int f4537z1;

    /* renamed from: z2 */
    public int f4538z2;

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C0846a implements TextWatcher {
        public C0846a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m2526t(!textInputLayout.f4493O2, false);
            if (textInputLayout.f4468C1) {
                textInputLayout.m2519m(editable);
            }
            if (textInputLayout.f4484K1) {
                textInputLayout.m2527u(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class RunnableC0847b implements Runnable {
        public RunnableC0847b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f4519m.f4566y1;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class RunnableC0848c implements Runnable {
        public RunnableC0848c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f4526s.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C0849d implements ValueAnimator.AnimatorUpdateListener {
        public C0849d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f4483J2.m4221k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C0850e extends C0908a {

        /* renamed from: d */
        public final TextInputLayout f4543d;

        public C0850e(TextInputLayout textInputLayout) {
            this.f4543d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0098, code lost:
        
            if (r7 != null) goto L33;
         */
        @Override // p034e0.C0908a
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void mo134d(android.view.View r18, p042f0.C1151g r19) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.C0850e.mo134d(android.view.View, f0.g):void");
        }

        @Override // p034e0.C0908a
        /* renamed from: e */
        public final void mo1813e(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1813e(view, accessibilityEvent);
            this.f4543d.f4519m.m2533b().mo2071o(accessibilityEvent);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC0851f {
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC0852g {
        /* renamed from: a */
        void mo2530a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public interface InterfaceC0853h {
        /* renamed from: a */
        void m2531a();
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$i */
    public static class C0854i extends AbstractC1446a {
        public static final Parcelable.Creator<C0854i> CREATOR = new a();

        /* renamed from: m */
        public CharSequence f4544m;

        /* renamed from: s */
        public boolean f4545s;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$i$a */
        public class a implements Parcelable.ClassLoaderCreator<C0854i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0854i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new C0854i[i7];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0854i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0854i(parcel, classLoader);
            }
        }

        public C0854i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4544m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4545s = parcel.readInt() == 1;
        }

        public C0854i(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f4544m) + "}";
        }

        @Override // p082k0.AbstractC1446a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.f6946c, i7);
            TextUtils.writeToParcel(this.f4544m, parcel, i7);
            parcel.writeInt(this.f4545s ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f4526s;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int m400B = C0143v.m400B(this.f4526s, R$attr.colorControlHighlight);
                int i7 = this.f4513g2;
                int[][] iArr = f4463Q2;
                if (i7 != 2) {
                    if (i7 != 1) {
                        return null;
                    }
                    C2237f c2237f = this.f4502X1;
                    int i8 = this.f4520m2;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{C0143v.m417O(0.1f, m400B, i8), i8}), c2237f, c2237f);
                }
                Context context = getContext();
                C2237f c2237f2 = this.f4502X1;
                TypedValue m4584c = C1971b.m4584c(R$attr.colorSurface, context, "TextInputLayout");
                int i9 = m4584c.resourceId;
                int m4895b = i9 != 0 ? C2009a.m4895b(context, i9) : m4584c.data;
                C2237f c2237f3 = new C2237f(c2237f2.f10154c.f10163a);
                int m417O = C0143v.m417O(0.1f, m400B, m4895b);
                c2237f3.m5428k(new ColorStateList(iArr, new int[]{m417O, 0}));
                c2237f3.setTint(m4895b);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m417O, m4895b});
                C2237f c2237f4 = new C2237f(c2237f2.f10154c.f10163a);
                c2237f4.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2237f3, c2237f4), c2237f2});
            }
        }
        return this.f4502X1;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f4504Z1 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f4504Z1 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f4504Z1.addState(new int[0], m2513f(false));
        }
        return this.f4504Z1;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f4503Y1 == null) {
            this.f4503Y1 = m2513f(true);
        }
        return this.f4503Y1;
    }

    /* renamed from: j */
    public static void m2507j(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            childAt.setEnabled(z6);
            if (childAt instanceof ViewGroup) {
                m2507j((ViewGroup) childAt, z6);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f4526s != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f4526s = editText;
        int i7 = this.f4533x1;
        if (i7 != -1) {
            setMinEms(i7);
        } else {
            setMinWidth(this.f4537z1);
        }
        int i8 = this.f4535y1;
        if (i8 != -1) {
            setMaxEms(i8);
        } else {
            setMaxWidth(this.f4464A1);
        }
        this.f4505a2 = false;
        m2515h();
        setTextInputAccessibilityDelegate(new C0850e(this));
        Typeface typeface = this.f4526s.getTypeface();
        C1747c c1747c = this.f4483J2;
        c1747c.m4223m(typeface);
        float textSize = this.f4526s.getTextSize();
        if (c1747c.f8011h != textSize) {
            c1747c.f8011h = textSize;
            c1747c.m4218h(false);
        }
        int i9 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f4526s.getLetterSpacing();
        if (c1747c.f7994W != letterSpacing) {
            c1747c.f7994W = letterSpacing;
            c1747c.m4218h(false);
        }
        int gravity = this.f4526s.getGravity();
        int i10 = (gravity & (-113)) | 48;
        if (c1747c.f8010g != i10) {
            c1747c.f8010g = i10;
            c1747c.m4218h(false);
        }
        if (c1747c.f8008f != gravity) {
            c1747c.f8008f = gravity;
            c1747c.m4218h(false);
        }
        this.f4526s.addTextChangedListener(new C0846a());
        if (this.f4534x2 == null) {
            this.f4534x2 = this.f4526s.getHintTextColors();
        }
        if (this.f4499U1) {
            if (TextUtils.isEmpty(this.f4500V1)) {
                CharSequence hint = this.f4526s.getHint();
                this.f4531w1 = hint;
                setHint(hint);
                this.f4526s.setHint((CharSequence) null);
            }
            this.f4501W1 = true;
        }
        if (i9 >= 29) {
            m2521o();
        }
        if (this.f4476G1 != null) {
            m2519m(this.f4526s.getText());
        }
        m2523q();
        this.f4466B1.m2083b();
        this.f4510e.bringToFront();
        C0855a c0855a = this.f4519m;
        c0855a.bringToFront();
        Iterator<InterfaceC0852g> it = this.f4528t2.iterator();
        while (it.hasNext()) {
            it.next().mo2530a(this);
        }
        c0855a.m2544m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m2526t(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f4500V1)) {
            return;
        }
        this.f4500V1 = charSequence;
        C1747c c1747c = this.f4483J2;
        if (charSequence == null || !TextUtils.equals(c1747c.f7972A, charSequence)) {
            c1747c.f7972A = charSequence;
            c1747c.f7973B = null;
            Bitmap bitmap = c1747c.f7976E;
            if (bitmap != null) {
                bitmap.recycle();
                c1747c.f7976E = null;
            }
            c1747c.m4218h(false);
        }
        if (this.f4481I2) {
            return;
        }
        m2516i();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.f4484K1 == z6) {
            return;
        }
        if (z6) {
            AppCompatTextView appCompatTextView = this.f4486L1;
            if (appCompatTextView != null) {
                this.f4507c.addView(appCompatTextView);
                this.f4486L1.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f4486L1;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f4486L1 = null;
        }
        this.f4484K1 = z6;
    }

    /* renamed from: a */
    public final void m2508a(float f7) {
        C1747c c1747c = this.f4483J2;
        if (c1747c.f8000b == f7) {
            return;
        }
        if (this.f4489M2 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f4489M2 = valueAnimator;
            valueAnimator.setInterpolator(C1832j.m4313d(getContext(), R$attr.motionEasingEmphasizedInterpolator, C0034a.f109b));
            this.f4489M2.setDuration(C1832j.m4312c(getContext(), R$attr.motionDurationMedium4, 167));
            this.f4489M2.addUpdateListener(new C0849d());
        }
        this.f4489M2.setFloatValues(c1747c.f8000b, f7);
        this.f4489M2.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i7, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f4507c;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m2525s();
        setEditText((EditText) view);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2509b() {
        /*
            r7 = this;
            y3.f r0 = r7.f4502X1
            if (r0 != 0) goto L5
            return
        L5:
            y3.f$b r1 = r0.f10154c
            y3.i r1 = r1.f10163a
            y3.i r2 = r7.f4509d2
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.f4513g2
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.f4515i2
            if (r0 <= r2) goto L22
            int r0 = r7.f4518l2
            if (r0 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == 0) goto L4b
            y3.f r0 = r7.f4502X1
            int r1 = r7.f4515i2
            float r1 = (float) r1
            int r5 = r7.f4518l2
            y3.f$b r6 = r0.f10154c
            r6.f10173k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            y3.f$b r5 = r0.f10154c
            android.content.res.ColorStateList r6 = r5.f10166d
            if (r6 == r1) goto L4b
            r5.f10166d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.f4520m2
            int r1 = r7.f4513g2
            if (r1 != r4) goto L61
            int r0 = com.google.android.material.R$attr.colorSurface
            android.content.Context r1 = r7.getContext()
            int r0 = androidx.activity.C0143v.m398A(r1, r0, r3)
            int r1 = r7.f4520m2
            int r0 = p181x.C2152a.m5264c(r1, r0)
        L61:
            r7.f4520m2 = r0
            y3.f r1 = r7.f4502X1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.m5428k(r0)
            y3.f r0 = r7.f4506b2
            if (r0 == 0) goto La2
            y3.f r1 = r7.f4508c2
            if (r1 != 0) goto L75
            goto La2
        L75:
            int r1 = r7.f4515i2
            if (r1 <= r2) goto L7e
            int r1 = r7.f4518l2
            if (r1 == 0) goto L7e
            r3 = 1
        L7e:
            if (r3 == 0) goto L9f
            android.widget.EditText r1 = r7.f4526s
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L8b
            int r1 = r7.f4538z2
            goto L8d
        L8b:
            int r1 = r7.f4518l2
        L8d:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m5428k(r1)
            y3.f r0 = r7.f4508c2
            int r1 = r7.f4518l2
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m5428k(r1)
        L9f:
            r7.invalidate()
        La2:
            r7.m2524r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2509b():void");
    }

    /* renamed from: c */
    public final int m2510c() {
        float m4215d;
        if (!this.f4499U1) {
            return 0;
        }
        int i7 = this.f4513g2;
        C1747c c1747c = this.f4483J2;
        if (i7 == 0) {
            m4215d = c1747c.m4215d();
        } else {
            if (i7 != 2) {
                return 0;
            }
            m4215d = c1747c.m4215d() / 2.0f;
        }
        return (int) m4215d;
    }

    /* renamed from: d */
    public final C2053d m2511d() {
        C2053d c2053d = new C2053d();
        c2053d.f9397m = C1832j.m4312c(getContext(), R$attr.motionDurationShort2, 87);
        c2053d.f9398s = C1832j.m4313d(getContext(), R$attr.motionEasingLinearInterpolator, C0034a.f108a);
        return c2053d;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i7) {
        EditText editText = this.f4526s;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i7);
            return;
        }
        if (this.f4531w1 != null) {
            boolean z6 = this.f4501W1;
            this.f4501W1 = false;
            CharSequence hint = editText.getHint();
            this.f4526s.setHint(this.f4531w1);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i7);
                return;
            } finally {
                this.f4526s.setHint(hint);
                this.f4501W1 = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i7);
        onProvideAutofillVirtualStructure(viewStructure, i7);
        FrameLayout frameLayout = this.f4507c;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i8 = 0; i8 < frameLayout.getChildCount(); i8++) {
            View childAt = frameLayout.getChildAt(i8);
            ViewStructure newChild = viewStructure.newChild(i8);
            childAt.dispatchProvideAutofillStructure(newChild, i7);
            if (childAt == this.f4526s) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f4493O2 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f4493O2 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C2237f c2237f;
        super.draw(canvas);
        boolean z6 = this.f4499U1;
        C1747c c1747c = this.f4483J2;
        if (z6) {
            c1747c.getClass();
            int save = canvas.save();
            if (c1747c.f7973B != null) {
                RectF rectF = c1747c.f8006e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c1747c.f7985N;
                    textPaint.setTextSize(c1747c.f7978G);
                    float f7 = c1747c.f8019p;
                    float f8 = c1747c.f8020q;
                    float f9 = c1747c.f7977F;
                    if (f9 != 1.0f) {
                        canvas.scale(f9, f9, f7, f8);
                    }
                    if (c1747c.f8005d0 > 1 && !c1747c.f7974C) {
                        float lineStart = c1747c.f8019p - c1747c.f7996Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f8);
                        float f10 = alpha;
                        textPaint.setAlpha((int) (c1747c.f8001b0 * f10));
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31) {
                            float f11 = c1747c.f7979H;
                            float f12 = c1747c.f7980I;
                            float f13 = c1747c.f7981J;
                            int i8 = c1747c.f7982K;
                            textPaint.setShadowLayer(f11, f12, f13, C2152a.m5266e(i8, (Color.alpha(i8) * textPaint.getAlpha()) / 255));
                        }
                        c1747c.f7996Y.draw(canvas);
                        textPaint.setAlpha((int) (c1747c.f7999a0 * f10));
                        if (i7 >= 31) {
                            float f14 = c1747c.f7979H;
                            float f15 = c1747c.f7980I;
                            float f16 = c1747c.f7981J;
                            int i9 = c1747c.f7982K;
                            textPaint.setShadowLayer(f14, f15, f16, C2152a.m5266e(i9, (Color.alpha(i9) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c1747c.f7996Y.getLineBaseline(0);
                        CharSequence charSequence = c1747c.f8003c0;
                        float f17 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f17, textPaint);
                        if (i7 >= 31) {
                            textPaint.setShadowLayer(c1747c.f7979H, c1747c.f7980I, c1747c.f7981J, c1747c.f7982K);
                        }
                        String trim = c1747c.f8003c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c1747c.f7996Y.getLineEnd(0), str.length()), 0.0f, f17, (Paint) textPaint);
                    } else {
                        canvas.translate(f7, f8);
                        c1747c.f7996Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f4508c2 == null || (c2237f = this.f4506b2) == null) {
            return;
        }
        c2237f.draw(canvas);
        if (this.f4526s.isFocused()) {
            Rect bounds = this.f4508c2.getBounds();
            Rect bounds2 = this.f4506b2.getBounds();
            float f18 = c1747c.f8000b;
            int centerX = bounds2.centerX();
            bounds.left = C0034a.m127b(f18, centerX, bounds2.left);
            bounds.right = C0034a.m127b(f18, centerX, bounds2.right);
            this.f4508c2.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z6;
        ColorStateList colorStateList;
        boolean z7;
        if (this.f4491N2) {
            return;
        }
        this.f4491N2 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1747c c1747c = this.f4483J2;
        if (c1747c != null) {
            c1747c.f7983L = drawableState;
            ColorStateList colorStateList2 = c1747c.f8014k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c1747c.f8013j) != null && colorStateList.isStateful())) {
                c1747c.m4218h(false);
                z7 = true;
            } else {
                z7 = false;
            }
            z6 = z7 | false;
        } else {
            z6 = false;
        }
        if (this.f4526s != null) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            m2526t(C0946x.g.m2860c(this) && isEnabled(), false);
        }
        m2523q();
        m2529w();
        if (z6) {
            invalidate();
        }
        this.f4491N2 = false;
    }

    /* renamed from: e */
    public final boolean m2512e() {
        return this.f4499U1 && !TextUtils.isEmpty(this.f4500V1) && (this.f4502X1 instanceof C0621i);
    }

    /* renamed from: f */
    public final C2237f m2513f(boolean z6) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.mtrl_shape_corner_size_small_component);
        float f7 = z6 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f4526s;
        float popupElevation = editText instanceof C0633u ? ((C0633u) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R$dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C2240i.a aVar = new C2240i.a();
        aVar.m5440e(f7);
        aVar.m5441f(f7);
        aVar.m5438c(dimensionPixelOffset);
        aVar.m5439d(dimensionPixelOffset);
        C2240i c2240i = new C2240i(aVar);
        EditText editText2 = this.f4526s;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0633u ? ((C0633u) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C2237f.f10139L1;
            TypedValue m4584c = C1971b.m4584c(R$attr.colorSurface, context, C2237f.class.getSimpleName());
            int i7 = m4584c.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i7 != 0 ? C2009a.m4895b(context, i7) : m4584c.data);
        }
        C2237f c2237f = new C2237f();
        c2237f.m5426i(context);
        c2237f.m5428k(dropDownBackgroundTintList);
        c2237f.m5427j(popupElevation);
        c2237f.setShapeAppearanceModel(c2240i);
        C2237f.b bVar = c2237f.f10154c;
        if (bVar.f10170h == null) {
            bVar.f10170h = new Rect();
        }
        c2237f.f10154c.f10170h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c2237f.invalidateSelf();
        return c2237f;
    }

    /* renamed from: g */
    public final int m2514g(int i7, boolean z6) {
        return ((z6 || getPrefixText() == null) ? (!z6 || getSuffixText() == null) ? this.f4526s.getCompoundPaddingLeft() : this.f4519m.m2534c() : this.f4510e.m2094a()) + i7;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f4526s;
        if (editText == null) {
            return super.getBaseline();
        }
        return m2510c() + getPaddingTop() + editText.getBaseline();
    }

    public C2237f getBoxBackground() {
        int i7 = this.f4513g2;
        if (i7 == 1 || i7 == 2) {
            return this.f4502X1;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f4520m2;
    }

    public int getBoxBackgroundMode() {
        return this.f4513g2;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f4514h2;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean m4239b = C1767w.m4239b(this);
        return (m4239b ? this.f4509d2.f10193h : this.f4509d2.f10192g).mo5418a(this.f4523p2);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean m4239b = C1767w.m4239b(this);
        return (m4239b ? this.f4509d2.f10192g : this.f4509d2.f10193h).mo5418a(this.f4523p2);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean m4239b = C1767w.m4239b(this);
        return (m4239b ? this.f4509d2.f10190e : this.f4509d2.f10191f).mo5418a(this.f4523p2);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean m4239b = C1767w.m4239b(this);
        return (m4239b ? this.f4509d2.f10191f : this.f4509d2.f10190e).mo5418a(this.f4523p2);
    }

    public int getBoxStrokeColor() {
        return this.f4467B2;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f4469C2;
    }

    public int getBoxStrokeWidth() {
        return this.f4516j2;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f4517k2;
    }

    public int getCounterMaxLength() {
        return this.f4470D1;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f4468C1 && this.f4472E1 && (appCompatTextView = this.f4476G1) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f4496R1;
    }

    public ColorStateList getCounterTextColor() {
        return this.f4495Q1;
    }

    public ColorStateList getCursorColor() {
        return this.f4497S1;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f4498T1;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f4534x2;
    }

    public EditText getEditText() {
        return this.f4526s;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f4519m.f4566y1.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f4519m.f4566y1.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f4519m.f4550E1;
    }

    public int getEndIconMode() {
        return this.f4519m.f4546A1;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f4519m.f4551F1;
    }

    public CheckableImageButton getEndIconView() {
        return this.f4519m.f4566y1;
    }

    public CharSequence getError() {
        C0630r c0630r = this.f4466B1;
        if (c0630r.f3093q) {
            return c0630r.f3092p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f4466B1.f3096t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f4466B1.f3095s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f4466B1.f3094r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f4519m.f4562m.getDrawable();
    }

    public CharSequence getHelperText() {
        C0630r c0630r = this.f4466B1;
        if (c0630r.f3100x) {
            return c0630r.f3099w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f4466B1.f3101y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f4499U1) {
            return this.f4500V1;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f4483J2.m4215d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C1747c c1747c = this.f4483J2;
        return c1747c.m4216e(c1747c.f8014k);
    }

    public ColorStateList getHintTextColor() {
        return this.f4536y2;
    }

    public InterfaceC0851f getLengthCounter() {
        return this.f4474F1;
    }

    public int getMaxEms() {
        return this.f4535y1;
    }

    public int getMaxWidth() {
        return this.f4464A1;
    }

    public int getMinEms() {
        return this.f4533x1;
    }

    public int getMinWidth() {
        return this.f4537z1;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f4519m.f4566y1.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f4519m.f4566y1.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f4484K1) {
            return this.f4482J1;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f4490N1;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f4488M1;
    }

    public CharSequence getPrefixText() {
        return this.f4510e.f3128m;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f4510e.f3127e.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f4510e.f3127e;
    }

    public C2240i getShapeAppearanceModel() {
        return this.f4509d2;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f4510e.f3129s.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f4510e.f3129s.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f4510e.f3132y1;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f4510e.f3133z1;
    }

    public CharSequence getSuffixText() {
        return this.f4519m.f4553H1;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f4519m.f4554I1.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f4519m.f4554I1;
    }

    public Typeface getTypeface() {
        return this.f4524q2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2515h() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2515h():void");
    }

    /* renamed from: i */
    public final void m2516i() {
        float f7;
        float f8;
        float f9;
        RectF rectF;
        float f10;
        if (m2512e()) {
            int width = this.f4526s.getWidth();
            int gravity = this.f4526s.getGravity();
            C1747c c1747c = this.f4483J2;
            boolean m4213b = c1747c.m4213b(c1747c.f7972A);
            c1747c.f7974C = m4213b;
            Rect rect = c1747c.f8004d;
            if (gravity == 17 || (gravity & 7) == 1) {
                f7 = width / 2.0f;
                f8 = c1747c.f7997Z / 2.0f;
            } else {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? m4213b : !m4213b) {
                    f9 = rect.left;
                    float max = Math.max(f9, rect.left);
                    rectF = this.f4523p2;
                    rectF.left = max;
                    rectF.top = rect.top;
                    if (gravity != 17 || (gravity & 7) == 1) {
                        f10 = (width / 2.0f) + (c1747c.f7997Z / 2.0f);
                    } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                        if (c1747c.f7974C) {
                            f10 = c1747c.f7997Z + max;
                        }
                        f10 = rect.right;
                    } else {
                        if (!c1747c.f7974C) {
                            f10 = c1747c.f7997Z + max;
                        }
                        f10 = rect.right;
                    }
                    rectF.right = Math.min(f10, rect.right);
                    rectF.bottom = c1747c.m4215d() + rect.top;
                    if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                    }
                    float f11 = rectF.left;
                    float f12 = this.f4512f2;
                    rectF.left = f11 - f12;
                    rectF.right += f12;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f4515i2);
                    C0621i c0621i = (C0621i) this.f4502X1;
                    c0621i.getClass();
                    c0621i.m2063o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                f7 = rect.right;
                f8 = c1747c.f7997Z;
            }
            f9 = f7 - f8;
            float max2 = Math.max(f9, rect.left);
            rectF = this.f4523p2;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f10 = (width / 2.0f) + (c1747c.f7997Z / 2.0f);
            rectF.right = Math.min(f10, rect.right);
            rectF.bottom = c1747c.m4215d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2517k(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            p066i0.C1315i.m3656e(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = com.google.android.material.R$style.TextAppearance_AppCompat_Caption
            p066i0.C1315i.m3656e(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = com.google.android.material.R$color.design_error
            int r4 = p166v.C2009a.m4895b(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2517k(android.widget.TextView, int):void");
    }

    /* renamed from: l */
    public final boolean m2518l() {
        C0630r c0630r = this.f4466B1;
        return (c0630r.f3091o != 1 || c0630r.f3094r == null || TextUtils.isEmpty(c0630r.f3092p)) ? false : true;
    }

    /* renamed from: m */
    public final void m2519m(Editable editable) {
        ((C0090b) this.f4474F1).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z6 = this.f4472E1;
        int i7 = this.f4470D1;
        String str = null;
        if (i7 == -1) {
            this.f4476G1.setText(String.valueOf(length));
            this.f4476G1.setContentDescription(null);
            this.f4472E1 = false;
        } else {
            this.f4472E1 = length > i7;
            Context context = getContext();
            this.f4476G1.setContentDescription(context.getString(this.f4472E1 ? R$string.character_counter_overflowed_content_description : R$string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f4470D1)));
            if (z6 != this.f4472E1) {
                m2520n();
            }
            String str2 = C0573a.f2926d;
            Locale locale = Locale.getDefault();
            int i8 = C0579g.f2950a;
            C0573a c0573a = C0579g.a.m2025a(locale) == 1 ? C0573a.f2929g : C0573a.f2928f;
            AppCompatTextView appCompatTextView = this.f4476G1;
            String string = getContext().getString(R$string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f4470D1));
            if (string == null) {
                c0573a.getClass();
            } else {
                str = c0573a.m1999c(string, c0573a.f2932c).toString();
            }
            appCompatTextView.setText(str);
        }
        if (this.f4526s == null || z6 == this.f4472E1) {
            return;
        }
        m2526t(false, false);
        m2529w();
        m2523q();
    }

    /* renamed from: n */
    public final void m2520n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f4476G1;
        if (appCompatTextView != null) {
            m2517k(appCompatTextView, this.f4472E1 ? this.f4478H1 : this.f4480I1);
            if (!this.f4472E1 && (colorStateList2 = this.f4495Q1) != null) {
                this.f4476G1.setTextColor(colorStateList2);
            }
            if (!this.f4472E1 || (colorStateList = this.f4496R1) == null) {
                return;
            }
            this.f4476G1.setTextColor(colorStateList);
        }
    }

    /* renamed from: o */
    public final void m2521o() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f4497S1;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue m4582a = C1971b.m4582a(R$attr.colorControlActivated, context);
            if (m4582a != null) {
                int i7 = m4582a.resourceId;
                if (i7 != 0) {
                    colorStateList2 = C2009a.m4896c(i7, context);
                } else {
                    int i8 = m4582a.data;
                    if (i8 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i8);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f4526s;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f4526s.getTextCursorDrawable();
            if ((m2518l() || (this.f4476G1 != null && this.f4472E1)) && (colorStateList = this.f4498T1) != null) {
                colorStateList2 = colorStateList;
            }
            C2213a.b.m5372h(textCursorDrawable2, colorStateList2);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4483J2.m4217g(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z6;
        EditText editText;
        int max;
        super.onMeasure(i7, i8);
        EditText editText2 = this.f4526s;
        C0855a c0855a = this.f4519m;
        if (editText2 != null && this.f4526s.getMeasuredHeight() < (max = Math.max(c0855a.getMeasuredHeight(), this.f4510e.getMeasuredHeight()))) {
            this.f4526s.setMinimumHeight(max);
            z6 = true;
        } else {
            z6 = false;
        }
        boolean m2522p = m2522p();
        if (z6 || m2522p) {
            this.f4526s.post(new RunnableC0848c());
        }
        if (this.f4486L1 != null && (editText = this.f4526s) != null) {
            this.f4486L1.setGravity(editText.getGravity());
            this.f4486L1.setPadding(this.f4526s.getCompoundPaddingLeft(), this.f4526s.getCompoundPaddingTop(), this.f4526s.getCompoundPaddingRight(), this.f4526s.getCompoundPaddingBottom());
        }
        c0855a.m2544m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0854i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0854i c0854i = (C0854i) parcelable;
        super.onRestoreInstanceState(c0854i.f6946c);
        setError(c0854i.f4544m);
        if (c0854i.f4545s) {
            post(new RunnableC0847b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        boolean z6 = i7 == 1;
        if (z6 != this.f4511e2) {
            InterfaceC2234c interfaceC2234c = this.f4509d2.f10190e;
            RectF rectF = this.f4523p2;
            float mo5418a = interfaceC2234c.mo5418a(rectF);
            float mo5418a2 = this.f4509d2.f10191f.mo5418a(rectF);
            float mo5418a3 = this.f4509d2.f10193h.mo5418a(rectF);
            float mo5418a4 = this.f4509d2.f10192g.mo5418a(rectF);
            C2240i c2240i = this.f4509d2;
            C1969a c1969a = c2240i.f10186a;
            C2240i.a aVar = new C2240i.a();
            C1969a c1969a2 = c2240i.f10187b;
            aVar.f10198a = c1969a2;
            float m5436b = C2240i.a.m5436b(c1969a2);
            if (m5436b != -1.0f) {
                aVar.m5440e(m5436b);
            }
            aVar.f10199b = c1969a;
            float m5436b2 = C2240i.a.m5436b(c1969a);
            if (m5436b2 != -1.0f) {
                aVar.m5441f(m5436b2);
            }
            C1969a c1969a3 = c2240i.f10188c;
            aVar.f10201d = c1969a3;
            float m5436b3 = C2240i.a.m5436b(c1969a3);
            if (m5436b3 != -1.0f) {
                aVar.m5438c(m5436b3);
            }
            C1969a c1969a4 = c2240i.f10189d;
            aVar.f10200c = c1969a4;
            float m5436b4 = C2240i.a.m5436b(c1969a4);
            if (m5436b4 != -1.0f) {
                aVar.m5439d(m5436b4);
            }
            aVar.m5440e(mo5418a2);
            aVar.m5441f(mo5418a);
            aVar.m5438c(mo5418a4);
            aVar.m5439d(mo5418a3);
            C2240i c2240i2 = new C2240i(aVar);
            this.f4511e2 = z6;
            setShapeAppearanceModel(c2240i2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0854i c0854i = new C0854i(super.onSaveInstanceState());
        if (m2518l()) {
            c0854i.f4544m = getError();
        }
        C0855a c0855a = this.f4519m;
        c0854i.f4545s = (c0855a.f4546A1 != 0) && c0855a.f4566y1.isChecked();
        return c0854i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r3.m2535d() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r3.f4553H1 != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2522p() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2522p():boolean");
    }

    /* renamed from: q */
    public final void m2523q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        int currentTextColor;
        EditText editText = this.f4526s;
        if (editText == null || this.f4513g2 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = C0244l0.f969a;
        Drawable mutate = background.mutate();
        if (m2518l()) {
            currentTextColor = getErrorCurrentTextColors();
        } else {
            if (!this.f4472E1 || (appCompatTextView = this.f4476G1) == null) {
                C2213a.m5353a(mutate);
                this.f4526s.refreshDrawableState();
                return;
            }
            currentTextColor = appCompatTextView.getCurrentTextColor();
        }
        mutate.setColorFilter(C0240k.m808c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: r */
    public final void m2524r() {
        EditText editText = this.f4526s;
        if (editText == null || this.f4502X1 == null) {
            return;
        }
        if ((this.f4505a2 || editText.getBackground() == null) && this.f4513g2 != 0) {
            EditText editText2 = this.f4526s;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2841q(editText2, editTextBoxBackground);
            this.f4505a2 = true;
        }
    }

    /* renamed from: s */
    public final void m2525s() {
        if (this.f4513g2 != 1) {
            FrameLayout frameLayout = this.f4507c;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int m2510c = m2510c();
            if (m2510c != layoutParams.topMargin) {
                layoutParams.topMargin = m2510c;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i7) {
        if (this.f4520m2 != i7) {
            this.f4520m2 = i7;
            this.f4471D2 = i7;
            this.f4475F2 = i7;
            this.f4477G2 = i7;
            m2509b();
        }
    }

    public void setBoxBackgroundColorResource(int i7) {
        setBoxBackgroundColor(C2009a.m4895b(getContext(), i7));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f4471D2 = defaultColor;
        this.f4520m2 = defaultColor;
        this.f4473E2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f4475F2 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f4477G2 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m2509b();
    }

    public void setBoxBackgroundMode(int i7) {
        if (i7 == this.f4513g2) {
            return;
        }
        this.f4513g2 = i7;
        if (this.f4526s != null) {
            m2515h();
        }
    }

    public void setBoxCollapsedPaddingTop(int i7) {
        this.f4514h2 = i7;
    }

    public void setBoxCornerFamily(int i7) {
        C2240i c2240i = this.f4509d2;
        c2240i.getClass();
        C2240i.a aVar = new C2240i.a(c2240i);
        InterfaceC2234c interfaceC2234c = this.f4509d2.f10190e;
        C1969a m94s = C0017d.m94s(i7);
        aVar.f10198a = m94s;
        float m5436b = C2240i.a.m5436b(m94s);
        if (m5436b != -1.0f) {
            aVar.m5440e(m5436b);
        }
        aVar.f10202e = interfaceC2234c;
        InterfaceC2234c interfaceC2234c2 = this.f4509d2.f10191f;
        C1969a m94s2 = C0017d.m94s(i7);
        aVar.f10199b = m94s2;
        float m5436b2 = C2240i.a.m5436b(m94s2);
        if (m5436b2 != -1.0f) {
            aVar.m5441f(m5436b2);
        }
        aVar.f10203f = interfaceC2234c2;
        InterfaceC2234c interfaceC2234c3 = this.f4509d2.f10193h;
        C1969a m94s3 = C0017d.m94s(i7);
        aVar.f10201d = m94s3;
        float m5436b3 = C2240i.a.m5436b(m94s3);
        if (m5436b3 != -1.0f) {
            aVar.m5438c(m5436b3);
        }
        aVar.f10205h = interfaceC2234c3;
        InterfaceC2234c interfaceC2234c4 = this.f4509d2.f10192g;
        C1969a m94s4 = C0017d.m94s(i7);
        aVar.f10200c = m94s4;
        float m5436b4 = C2240i.a.m5436b(m94s4);
        if (m5436b4 != -1.0f) {
            aVar.m5439d(m5436b4);
        }
        aVar.f10204g = interfaceC2234c4;
        this.f4509d2 = new C2240i(aVar);
        m2509b();
    }

    public void setBoxStrokeColor(int i7) {
        if (this.f4467B2 != i7) {
            this.f4467B2 = i7;
            m2529w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f4467B2 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            m2529w();
        } else {
            this.f4538z2 = colorStateList.getDefaultColor();
            this.f4479H2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f4465A2 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.f4467B2 = defaultColor;
        m2529w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f4469C2 != colorStateList) {
            this.f4469C2 = colorStateList;
            m2529w();
        }
    }

    public void setBoxStrokeWidth(int i7) {
        this.f4516j2 = i7;
        m2529w();
    }

    public void setBoxStrokeWidthFocused(int i7) {
        this.f4517k2 = i7;
        m2529w();
    }

    public void setBoxStrokeWidthFocusedResource(int i7) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i7));
    }

    public void setBoxStrokeWidthResource(int i7) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setCounterEnabled(boolean z6) {
        if (this.f4468C1 != z6) {
            C0630r c0630r = this.f4466B1;
            if (z6) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f4476G1 = appCompatTextView;
                appCompatTextView.setId(R$id.textinput_counter);
                Typeface typeface = this.f4524q2;
                if (typeface != null) {
                    this.f4476G1.setTypeface(typeface);
                }
                this.f4476G1.setMaxLines(1);
                c0630r.m2082a(this.f4476G1, 2);
                C0920g.m2702h((ViewGroup.MarginLayoutParams) this.f4476G1.getLayoutParams(), getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_counter_margin_start));
                m2520n();
                if (this.f4476G1 != null) {
                    EditText editText = this.f4526s;
                    m2519m(editText != null ? editText.getText() : null);
                }
            } else {
                c0630r.m2088g(this.f4476G1, 2);
                this.f4476G1 = null;
            }
            this.f4468C1 = z6;
        }
    }

    public void setCounterMaxLength(int i7) {
        if (this.f4470D1 != i7) {
            if (i7 <= 0) {
                i7 = -1;
            }
            this.f4470D1 = i7;
            if (!this.f4468C1 || this.f4476G1 == null) {
                return;
            }
            EditText editText = this.f4526s;
            m2519m(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i7) {
        if (this.f4478H1 != i7) {
            this.f4478H1 = i7;
            m2520n();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f4496R1 != colorStateList) {
            this.f4496R1 = colorStateList;
            m2520n();
        }
    }

    public void setCounterTextAppearance(int i7) {
        if (this.f4480I1 != i7) {
            this.f4480I1 = i7;
            m2520n();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f4495Q1 != colorStateList) {
            this.f4495Q1 = colorStateList;
            m2520n();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f4497S1 != colorStateList) {
            this.f4497S1 = colorStateList;
            m2521o();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f4498T1 != colorStateList) {
            this.f4498T1 = colorStateList;
            if (m2518l() || (this.f4476G1 != null && this.f4472E1)) {
                m2521o();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f4534x2 = colorStateList;
        this.f4536y2 = colorStateList;
        if (this.f4526s != null) {
            m2526t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        m2507j(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f4519m.f4566y1.setActivated(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f4519m.f4566y1.setCheckable(z6);
    }

    public void setEndIconContentDescription(int i7) {
        C0855a c0855a = this.f4519m;
        CharSequence text = i7 != 0 ? c0855a.getResources().getText(i7) : null;
        CheckableImageButton checkableImageButton = c0855a.f4566y1;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i7) {
        C0855a c0855a = this.f4519m;
        Drawable m2561a = i7 != 0 ? C0872a.m2561a(c0855a.getContext(), i7) : null;
        CheckableImageButton checkableImageButton = c0855a.f4566y1;
        checkableImageButton.setImageDrawable(m2561a);
        if (m2561a != null) {
            ColorStateList colorStateList = c0855a.f4548C1;
            PorterDuff.Mode mode = c0855a.f4549D1;
            TextInputLayout textInputLayout = c0855a.f4560c;
            C0629q.m2077a(textInputLayout, checkableImageButton, colorStateList, mode);
            C0629q.m2079c(textInputLayout, checkableImageButton, c0855a.f4548C1);
        }
    }

    public void setEndIconMinSize(int i7) {
        C0855a c0855a = this.f4519m;
        if (i7 < 0) {
            c0855a.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i7 != c0855a.f4550E1) {
            c0855a.f4550E1 = i7;
            CheckableImageButton checkableImageButton = c0855a.f4566y1;
            checkableImageButton.setMinimumWidth(i7);
            checkableImageButton.setMinimumHeight(i7);
            CheckableImageButton checkableImageButton2 = c0855a.f4562m;
            checkableImageButton2.setMinimumWidth(i7);
            checkableImageButton2.setMinimumHeight(i7);
        }
    }

    public void setEndIconMode(int i7) {
        this.f4519m.m2538g(i7);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0855a c0855a = this.f4519m;
        View.OnLongClickListener onLongClickListener = c0855a.f4552G1;
        CheckableImageButton checkableImageButton = c0855a.f4566y1;
        checkableImageButton.setOnClickListener(onClickListener);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0855a c0855a = this.f4519m;
        c0855a.f4552G1 = onLongClickListener;
        CheckableImageButton checkableImageButton = c0855a.f4566y1;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0855a c0855a = this.f4519m;
        c0855a.f4551F1 = scaleType;
        c0855a.f4566y1.setScaleType(scaleType);
        c0855a.f4562m.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0855a c0855a = this.f4519m;
        if (c0855a.f4548C1 != colorStateList) {
            c0855a.f4548C1 = colorStateList;
            C0629q.m2077a(c0855a.f4560c, c0855a.f4566y1, colorStateList, c0855a.f4549D1);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0855a c0855a = this.f4519m;
        if (c0855a.f4549D1 != mode) {
            c0855a.f4549D1 = mode;
            C0629q.m2077a(c0855a.f4560c, c0855a.f4566y1, c0855a.f4548C1, mode);
        }
    }

    public void setEndIconVisible(boolean z6) {
        this.f4519m.m2539h(z6);
    }

    public void setError(CharSequence charSequence) {
        C0630r c0630r = this.f4466B1;
        if (!c0630r.f3093q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0630r.m2087f();
            return;
        }
        c0630r.m2084c();
        c0630r.f3092p = charSequence;
        c0630r.f3094r.setText(charSequence);
        int i7 = c0630r.f3090n;
        if (i7 != 1) {
            c0630r.f3091o = 1;
        }
        c0630r.m2090i(i7, c0630r.f3091o, c0630r.m2089h(c0630r.f3094r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i7) {
        C0630r c0630r = this.f4466B1;
        c0630r.f3096t = i7;
        AppCompatTextView appCompatTextView = c0630r.f3094r;
        if (appCompatTextView != null) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.g.m2863f(appCompatTextView, i7);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0630r c0630r = this.f4466B1;
        c0630r.f3095s = charSequence;
        AppCompatTextView appCompatTextView = c0630r.f3094r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z6) {
        C0630r c0630r = this.f4466B1;
        if (c0630r.f3093q == z6) {
            return;
        }
        c0630r.m2084c();
        TextInputLayout textInputLayout = c0630r.f3084h;
        if (z6) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c0630r.f3083g, null);
            c0630r.f3094r = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_error);
            c0630r.f3094r.setTextAlignment(5);
            Typeface typeface = c0630r.f3076B;
            if (typeface != null) {
                c0630r.f3094r.setTypeface(typeface);
            }
            int i7 = c0630r.f3097u;
            c0630r.f3097u = i7;
            AppCompatTextView appCompatTextView2 = c0630r.f3094r;
            if (appCompatTextView2 != null) {
                textInputLayout.m2517k(appCompatTextView2, i7);
            }
            ColorStateList colorStateList = c0630r.f3098v;
            c0630r.f3098v = colorStateList;
            AppCompatTextView appCompatTextView3 = c0630r.f3094r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0630r.f3095s;
            c0630r.f3095s = charSequence;
            AppCompatTextView appCompatTextView4 = c0630r.f3094r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i8 = c0630r.f3096t;
            c0630r.f3096t = i8;
            AppCompatTextView appCompatTextView5 = c0630r.f3094r;
            if (appCompatTextView5 != null) {
                WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
                C0946x.g.m2863f(appCompatTextView5, i8);
            }
            c0630r.f3094r.setVisibility(4);
            c0630r.m2082a(c0630r.f3094r, 0);
        } else {
            c0630r.m2087f();
            c0630r.m2088g(c0630r.f3094r, 0);
            c0630r.f3094r = null;
            textInputLayout.m2523q();
            textInputLayout.m2529w();
        }
        c0630r.f3093q = z6;
    }

    public void setErrorIconDrawable(int i7) {
        C0855a c0855a = this.f4519m;
        c0855a.m2540i(i7 != 0 ? C0872a.m2561a(c0855a.getContext(), i7) : null);
        C0629q.m2079c(c0855a.f4560c, c0855a.f4562m, c0855a.f4563s);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f4519m.m2540i(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0855a c0855a = this.f4519m;
        CheckableImageButton checkableImageButton = c0855a.f4562m;
        View.OnLongClickListener onLongClickListener = c0855a.f4565x1;
        checkableImageButton.setOnClickListener(onClickListener);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0855a c0855a = this.f4519m;
        c0855a.f4565x1 = onLongClickListener;
        CheckableImageButton checkableImageButton = c0855a.f4562m;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0855a c0855a = this.f4519m;
        if (c0855a.f4563s != colorStateList) {
            c0855a.f4563s = colorStateList;
            C0629q.m2077a(c0855a.f4560c, c0855a.f4562m, colorStateList, c0855a.f4564w1);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0855a c0855a = this.f4519m;
        if (c0855a.f4564w1 != mode) {
            c0855a.f4564w1 = mode;
            C0629q.m2077a(c0855a.f4560c, c0855a.f4562m, c0855a.f4563s, mode);
        }
    }

    public void setErrorTextAppearance(int i7) {
        C0630r c0630r = this.f4466B1;
        c0630r.f3097u = i7;
        AppCompatTextView appCompatTextView = c0630r.f3094r;
        if (appCompatTextView != null) {
            c0630r.f3084h.m2517k(appCompatTextView, i7);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0630r c0630r = this.f4466B1;
        c0630r.f3098v = colorStateList;
        AppCompatTextView appCompatTextView = c0630r.f3094r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.f4485K2 != z6) {
            this.f4485K2 = z6;
            m2526t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C0630r c0630r = this.f4466B1;
        if (isEmpty) {
            if (c0630r.f3100x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0630r.f3100x) {
            setHelperTextEnabled(true);
        }
        c0630r.m2084c();
        c0630r.f3099w = charSequence;
        c0630r.f3101y.setText(charSequence);
        int i7 = c0630r.f3090n;
        if (i7 != 2) {
            c0630r.f3091o = 2;
        }
        c0630r.m2090i(i7, c0630r.f3091o, c0630r.m2089h(c0630r.f3101y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0630r c0630r = this.f4466B1;
        c0630r.f3075A = colorStateList;
        AppCompatTextView appCompatTextView = c0630r.f3101y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) {
        C0630r c0630r = this.f4466B1;
        if (c0630r.f3100x == z6) {
            return;
        }
        c0630r.m2084c();
        if (z6) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c0630r.f3083g, null);
            c0630r.f3101y = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_helper_text);
            c0630r.f3101y.setTextAlignment(5);
            Typeface typeface = c0630r.f3076B;
            if (typeface != null) {
                c0630r.f3101y.setTypeface(typeface);
            }
            c0630r.f3101y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = c0630r.f3101y;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.g.m2863f(appCompatTextView2, 1);
            int i7 = c0630r.f3102z;
            c0630r.f3102z = i7;
            AppCompatTextView appCompatTextView3 = c0630r.f3101y;
            if (appCompatTextView3 != null) {
                C1315i.m3656e(appCompatTextView3, i7);
            }
            ColorStateList colorStateList = c0630r.f3075A;
            c0630r.f3075A = colorStateList;
            AppCompatTextView appCompatTextView4 = c0630r.f3101y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            c0630r.m2082a(c0630r.f3101y, 1);
            c0630r.f3101y.setAccessibilityDelegate(new C0631s(c0630r));
        } else {
            c0630r.m2084c();
            int i8 = c0630r.f3090n;
            if (i8 == 2) {
                c0630r.f3091o = 0;
            }
            c0630r.m2090i(i8, c0630r.f3091o, c0630r.m2089h(c0630r.f3101y, ""));
            c0630r.m2088g(c0630r.f3101y, 1);
            c0630r.f3101y = null;
            TextInputLayout textInputLayout = c0630r.f3084h;
            textInputLayout.m2523q();
            textInputLayout.m2529w();
        }
        c0630r.f3100x = z6;
    }

    public void setHelperTextTextAppearance(int i7) {
        C0630r c0630r = this.f4466B1;
        c0630r.f3102z = i7;
        AppCompatTextView appCompatTextView = c0630r.f3101y;
        if (appCompatTextView != null) {
            C1315i.m3656e(appCompatTextView, i7);
        }
    }

    public void setHint(int i7) {
        setHint(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f4499U1) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.f4487L2 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.f4499U1) {
            this.f4499U1 = z6;
            if (z6) {
                CharSequence hint = this.f4526s.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f4500V1)) {
                        setHint(hint);
                    }
                    this.f4526s.setHint((CharSequence) null);
                }
                this.f4501W1 = true;
            } else {
                this.f4501W1 = false;
                if (!TextUtils.isEmpty(this.f4500V1) && TextUtils.isEmpty(this.f4526s.getHint())) {
                    this.f4526s.setHint(this.f4500V1);
                }
                setHintInternal(null);
            }
            if (this.f4526s != null) {
                m2525s();
            }
        }
    }

    public void setHintTextAppearance(int i7) {
        C1747c c1747c = this.f4483J2;
        View view = c1747c.f7998a;
        C1973d c1973d = new C1973d(i7, view.getContext());
        ColorStateList colorStateList = c1973d.f8837j;
        if (colorStateList != null) {
            c1747c.f8014k = colorStateList;
        }
        float f7 = c1973d.f8838k;
        if (f7 != 0.0f) {
            c1747c.f8012i = f7;
        }
        ColorStateList colorStateList2 = c1973d.f8828a;
        if (colorStateList2 != null) {
            c1747c.f7992U = colorStateList2;
        }
        c1747c.f7990S = c1973d.f8832e;
        c1747c.f7991T = c1973d.f8833f;
        c1747c.f7989R = c1973d.f8834g;
        c1747c.f7993V = c1973d.f8836i;
        C1970a c1970a = c1747c.f8028y;
        if (c1970a != null) {
            c1970a.f8827s = true;
        }
        C1746b c1746b = new C1746b(c1747c);
        c1973d.m4589a();
        c1747c.f8028y = new C1970a(c1746b, c1973d.f8841n);
        c1973d.m4591c(view.getContext(), c1747c.f8028y);
        c1747c.m4218h(false);
        this.f4536y2 = c1747c.f8014k;
        if (this.f4526s != null) {
            m2526t(false, false);
            m2525s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f4536y2 != colorStateList) {
            if (this.f4534x2 == null) {
                C1747c c1747c = this.f4483J2;
                if (c1747c.f8014k != colorStateList) {
                    c1747c.f8014k = colorStateList;
                    c1747c.m4218h(false);
                }
            }
            this.f4536y2 = colorStateList;
            if (this.f4526s != null) {
                m2526t(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0851f interfaceC0851f) {
        this.f4474F1 = interfaceC0851f;
    }

    public void setMaxEms(int i7) {
        this.f4535y1 = i7;
        EditText editText = this.f4526s;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxEms(i7);
    }

    public void setMaxWidth(int i7) {
        this.f4464A1 = i7;
        EditText editText = this.f4526s;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxWidth(i7);
    }

    public void setMaxWidthResource(int i7) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    public void setMinEms(int i7) {
        this.f4533x1 = i7;
        EditText editText = this.f4526s;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinEms(i7);
    }

    public void setMinWidth(int i7) {
        this.f4537z1 = i7;
        EditText editText = this.f4526s;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinWidth(i7);
    }

    public void setMinWidthResource(int i7) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i7) {
        C0855a c0855a = this.f4519m;
        c0855a.f4566y1.setContentDescription(i7 != 0 ? c0855a.getResources().getText(i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i7) {
        C0855a c0855a = this.f4519m;
        c0855a.f4566y1.setImageDrawable(i7 != 0 ? C0872a.m2561a(c0855a.getContext(), i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) {
        C0855a c0855a = this.f4519m;
        if (z6 && c0855a.f4546A1 != 1) {
            c0855a.m2538g(1);
        } else if (z6) {
            c0855a.getClass();
        } else {
            c0855a.m2538g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0855a c0855a = this.f4519m;
        c0855a.f4548C1 = colorStateList;
        C0629q.m2077a(c0855a.f4560c, c0855a.f4566y1, colorStateList, c0855a.f4549D1);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0855a c0855a = this.f4519m;
        c0855a.f4549D1 = mode;
        C0629q.m2077a(c0855a.f4560c, c0855a.f4566y1, c0855a.f4548C1, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f4486L1 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f4486L1 = appCompatTextView;
            appCompatTextView.setId(R$id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f4486L1;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.d.m2843s(appCompatTextView2, 2);
            C2053d m2511d = m2511d();
            this.f4492O1 = m2511d;
            m2511d.f9396e = 67L;
            this.f4494P1 = m2511d();
            setPlaceholderTextAppearance(this.f4490N1);
            setPlaceholderTextColor(this.f4488M1);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f4484K1) {
                setPlaceholderTextEnabled(true);
            }
            this.f4482J1 = charSequence;
        }
        EditText editText = this.f4526s;
        m2527u(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i7) {
        this.f4490N1 = i7;
        AppCompatTextView appCompatTextView = this.f4486L1;
        if (appCompatTextView != null) {
            C1315i.m3656e(appCompatTextView, i7);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f4488M1 != colorStateList) {
            this.f4488M1 = colorStateList;
            AppCompatTextView appCompatTextView = this.f4486L1;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0636x c0636x = this.f4510e;
        c0636x.getClass();
        c0636x.f3128m = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0636x.f3127e.setText(charSequence);
        c0636x.m2098e();
    }

    public void setPrefixTextAppearance(int i7) {
        C1315i.m3656e(this.f4510e.f3127e, i7);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f4510e.f3127e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C2240i c2240i) {
        C2237f c2237f = this.f4502X1;
        if (c2237f == null || c2237f.f10154c.f10163a == c2240i) {
            return;
        }
        this.f4509d2 = c2240i;
        m2509b();
    }

    public void setStartIconCheckable(boolean z6) {
        this.f4510e.f3129s.setCheckable(z6);
    }

    public void setStartIconContentDescription(int i7) {
        setStartIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f4510e.f3129s;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i7) {
        setStartIconDrawable(i7 != 0 ? C0872a.m2561a(getContext(), i7) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f4510e.m2095b(drawable);
    }

    public void setStartIconMinSize(int i7) {
        C0636x c0636x = this.f4510e;
        if (i7 < 0) {
            c0636x.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i7 != c0636x.f3132y1) {
            c0636x.f3132y1 = i7;
            CheckableImageButton checkableImageButton = c0636x.f3129s;
            checkableImageButton.setMinimumWidth(i7);
            checkableImageButton.setMinimumHeight(i7);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0636x c0636x = this.f4510e;
        View.OnLongClickListener onLongClickListener = c0636x.f3124A1;
        CheckableImageButton checkableImageButton = c0636x.f3129s;
        checkableImageButton.setOnClickListener(onClickListener);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0636x c0636x = this.f4510e;
        c0636x.f3124A1 = onLongClickListener;
        CheckableImageButton checkableImageButton = c0636x.f3129s;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0636x c0636x = this.f4510e;
        c0636x.f3133z1 = scaleType;
        c0636x.f3129s.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0636x c0636x = this.f4510e;
        if (c0636x.f3130w1 != colorStateList) {
            c0636x.f3130w1 = colorStateList;
            C0629q.m2077a(c0636x.f3126c, c0636x.f3129s, colorStateList, c0636x.f3131x1);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0636x c0636x = this.f4510e;
        if (c0636x.f3131x1 != mode) {
            c0636x.f3131x1 = mode;
            C0629q.m2077a(c0636x.f3126c, c0636x.f3129s, c0636x.f3130w1, mode);
        }
    }

    public void setStartIconVisible(boolean z6) {
        this.f4510e.m2096c(z6);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0855a c0855a = this.f4519m;
        c0855a.getClass();
        c0855a.f4553H1 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0855a.f4554I1.setText(charSequence);
        c0855a.m2545n();
    }

    public void setSuffixTextAppearance(int i7) {
        C1315i.m3656e(this.f4519m.f4554I1, i7);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f4519m.f4554I1.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0850e c0850e) {
        EditText editText = this.f4526s;
        if (editText != null) {
            C0946x.m2817r(editText, c0850e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f4524q2) {
            this.f4524q2 = typeface;
            this.f4483J2.m4223m(typeface);
            C0630r c0630r = this.f4466B1;
            if (typeface != c0630r.f3076B) {
                c0630r.f3076B = typeface;
                AppCompatTextView appCompatTextView = c0630r.f3094r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = c0630r.f3101y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f4476G1;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012c  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2526t(boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2526t(boolean, boolean):void");
    }

    /* renamed from: u */
    public final void m2527u(Editable editable) {
        ((C0090b) this.f4474F1).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f4507c;
        if (length != 0 || this.f4481I2) {
            AppCompatTextView appCompatTextView = this.f4486L1;
            if (appCompatTextView == null || !this.f4484K1) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            C2061l.m5122a(frameLayout, this.f4494P1);
            this.f4486L1.setVisibility(4);
            return;
        }
        if (this.f4486L1 == null || !this.f4484K1 || TextUtils.isEmpty(this.f4482J1)) {
            return;
        }
        this.f4486L1.setText(this.f4482J1);
        C2061l.m5122a(frameLayout, this.f4492O1);
        this.f4486L1.setVisibility(0);
        this.f4486L1.bringToFront();
        announceForAccessibility(this.f4482J1);
    }

    /* renamed from: v */
    public final void m2528v(boolean z6, boolean z7) {
        int defaultColor = this.f4469C2.getDefaultColor();
        int colorForState = this.f4469C2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f4469C2.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.f4518l2 = colorForState2;
        } else if (z7) {
            this.f4518l2 = colorForState;
        } else {
            this.f4518l2 = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2529w() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m2529w():void");
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f4519m.f4566y1.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f4519m.f4566y1.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f4519m.f4566y1;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0855a c0855a = this.f4519m;
        CheckableImageButton checkableImageButton = c0855a.f4566y1;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0855a.f4548C1;
            PorterDuff.Mode mode = c0855a.f4549D1;
            TextInputLayout textInputLayout = c0855a.f4560c;
            C0629q.m2077a(textInputLayout, checkableImageButton, colorStateList, mode);
            C0629q.m2079c(textInputLayout, checkableImageButton, c0855a.f4548C1);
        }
    }
}
