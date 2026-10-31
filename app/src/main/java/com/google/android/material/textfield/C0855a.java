package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.ext.C0090b;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0233h1;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p021c4.AbstractC0628p;
import p021c4.C0619g;
import p021c4.C0620h;
import p021c4.C0627o;
import p021c4.C0629q;
import p021c4.C0634v;
import p021c4.C0635w;
import p025d.C0872a;
import p034e0.C0920g;
import p034e0.C0923h0;
import p034e0.C0946x;
import p042f0.C1147c;
import p042f0.InterfaceC1148d;
import p066i0.C1315i;
import p131q3.C1761q;
import p131q3.C1767w;
import p163u3.C1972c;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes.dex */
public final class C0855a extends LinearLayout {

    /* renamed from: A1 */
    public int f4546A1;

    /* renamed from: B1 */
    public final LinkedHashSet<TextInputLayout.InterfaceC0853h> f4547B1;

    /* renamed from: C1 */
    public ColorStateList f4548C1;

    /* renamed from: D1 */
    public PorterDuff.Mode f4549D1;

    /* renamed from: E1 */
    public int f4550E1;

    /* renamed from: F1 */
    public ImageView.ScaleType f4551F1;

    /* renamed from: G1 */
    public View.OnLongClickListener f4552G1;

    /* renamed from: H1 */
    public CharSequence f4553H1;

    /* renamed from: I1 */
    public final AppCompatTextView f4554I1;

    /* renamed from: J1 */
    public boolean f4555J1;

    /* renamed from: K1 */
    public EditText f4556K1;

    /* renamed from: L1 */
    public final AccessibilityManager f4557L1;

    /* renamed from: M1 */
    public InterfaceC1148d f4558M1;

    /* renamed from: N1 */
    public final a f4559N1;

    /* renamed from: c */
    public final TextInputLayout f4560c;

    /* renamed from: e */
    public final FrameLayout f4561e;

    /* renamed from: m */
    public final CheckableImageButton f4562m;

    /* renamed from: s */
    public ColorStateList f4563s;

    /* renamed from: w1 */
    public PorterDuff.Mode f4564w1;

    /* renamed from: x1 */
    public View.OnLongClickListener f4565x1;

    /* renamed from: y1 */
    public final CheckableImageButton f4566y1;

    /* renamed from: z1 */
    public final d f4567z1;

    /* renamed from: com.google.android.material.textfield.a$a */
    public class a extends C1761q {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            C0855a.this.m2533b().mo2051a();
        }

        @Override // p131q3.C1761q, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            C0855a.this.m2533b().mo2074b();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    public class b implements TextInputLayout.InterfaceC0852g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC0852g
        /* renamed from: a */
        public final void mo2530a(TextInputLayout textInputLayout) {
            C0855a c0855a = C0855a.this;
            if (c0855a.f4556K1 == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = c0855a.f4556K1;
            a aVar = c0855a.f4559N1;
            if (editText != null) {
                editText.removeTextChangedListener(aVar);
                if (c0855a.f4556K1.getOnFocusChangeListener() == c0855a.m2533b().mo2054e()) {
                    c0855a.f4556K1.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            c0855a.f4556K1 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(aVar);
            }
            c0855a.m2533b().mo2057m(c0855a.f4556K1);
            c0855a.m2541j(c0855a.m2533b());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            C0855a c0855a = C0855a.this;
            if (c0855a.f4558M1 == null || (accessibilityManager = c0855a.f4557L1) == null) {
                return;
            }
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (C0946x.g.m2859b(c0855a)) {
                C1147c.m3333a(accessibilityManager, c0855a.f4558M1);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            C0855a c0855a = C0855a.this;
            InterfaceC1148d interfaceC1148d = c0855a.f4558M1;
            if (interfaceC1148d == null || (accessibilityManager = c0855a.f4557L1) == null) {
                return;
            }
            C1147c.m3334b(accessibilityManager, interfaceC1148d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    public static class d {

        /* renamed from: a */
        public final SparseArray<AbstractC0628p> f4571a = new SparseArray<>();

        /* renamed from: b */
        public final C0855a f4572b;

        /* renamed from: c */
        public final int f4573c;

        /* renamed from: d */
        public final int f4574d;

        public d(C0855a c0855a, C0233h1 c0233h1) {
            this.f4572b = c0855a;
            this.f4573c = c0233h1.m799i(R$styleable.TextInputLayout_endIconDrawable, 0);
            this.f4574d = c0233h1.m799i(R$styleable.TextInputLayout_passwordToggleDrawable, 0);
        }
    }

    public C0855a(TextInputLayout textInputLayout, C0233h1 c0233h1) {
        super(textInputLayout.getContext());
        CharSequence m801k;
        this.f4546A1 = 0;
        this.f4547B1 = new LinkedHashSet<>();
        this.f4559N1 = new a();
        b bVar = new b();
        this.f4557L1 = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f4560c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4561e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m2532a = m2532a(this, from, R$id.text_input_error_icon);
        this.f4562m = m2532a;
        CheckableImageButton m2532a2 = m2532a(frameLayout, from, R$id.text_input_end_icon);
        this.f4566y1 = m2532a2;
        this.f4567z1 = new d(this, c0233h1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f4554I1 = appCompatTextView;
        int i7 = R$styleable.TextInputLayout_errorIconTint;
        if (c0233h1.m802l(i7)) {
            this.f4563s = C1972c.m4586b(getContext(), c0233h1, i7);
        }
        int i8 = R$styleable.TextInputLayout_errorIconTintMode;
        if (c0233h1.m802l(i8)) {
            this.f4564w1 = C1767w.m4240c(c0233h1.m798h(i8, -1), null);
        }
        int i9 = R$styleable.TextInputLayout_errorIconDrawable;
        if (c0233h1.m802l(i9)) {
            m2540i(c0233h1.m795e(i9));
        }
        m2532a.setContentDescription(getResources().getText(R$string.error_icon_content_description));
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.d.m2843s(m2532a, 2);
        m2532a.setClickable(false);
        m2532a.setPressable(false);
        m2532a.setFocusable(false);
        int i10 = R$styleable.TextInputLayout_passwordToggleEnabled;
        if (!c0233h1.m802l(i10)) {
            int i11 = R$styleable.TextInputLayout_endIconTint;
            if (c0233h1.m802l(i11)) {
                this.f4548C1 = C1972c.m4586b(getContext(), c0233h1, i11);
            }
            int i12 = R$styleable.TextInputLayout_endIconTintMode;
            if (c0233h1.m802l(i12)) {
                this.f4549D1 = C1767w.m4240c(c0233h1.m798h(i12, -1), null);
            }
        }
        int i13 = R$styleable.TextInputLayout_endIconMode;
        if (c0233h1.m802l(i13)) {
            m2538g(c0233h1.m798h(i13, 0));
            int i14 = R$styleable.TextInputLayout_endIconContentDescription;
            if (c0233h1.m802l(i14) && m2532a2.getContentDescription() != (m801k = c0233h1.m801k(i14))) {
                m2532a2.setContentDescription(m801k);
            }
            m2532a2.setCheckable(c0233h1.m791a(R$styleable.TextInputLayout_endIconCheckable, true));
        } else if (c0233h1.m802l(i10)) {
            int i15 = R$styleable.TextInputLayout_passwordToggleTint;
            if (c0233h1.m802l(i15)) {
                this.f4548C1 = C1972c.m4586b(getContext(), c0233h1, i15);
            }
            int i16 = R$styleable.TextInputLayout_passwordToggleTintMode;
            if (c0233h1.m802l(i16)) {
                this.f4549D1 = C1767w.m4240c(c0233h1.m798h(i16, -1), null);
            }
            m2538g(c0233h1.m791a(i10, false) ? 1 : 0);
            CharSequence m801k2 = c0233h1.m801k(R$styleable.TextInputLayout_passwordToggleContentDescription);
            if (m2532a2.getContentDescription() != m801k2) {
                m2532a2.setContentDescription(m801k2);
            }
        }
        int m794d = c0233h1.m794d(R$styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size));
        if (m794d < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (m794d != this.f4550E1) {
            this.f4550E1 = m794d;
            m2532a2.setMinimumWidth(m794d);
            m2532a2.setMinimumHeight(m794d);
            m2532a.setMinimumWidth(m794d);
            m2532a.setMinimumHeight(m794d);
        }
        int i17 = R$styleable.TextInputLayout_endIconScaleType;
        if (c0233h1.m802l(i17)) {
            ImageView.ScaleType m2078b = C0629q.m2078b(c0233h1.m798h(i17, -1));
            this.f4551F1 = m2078b;
            m2532a2.setScaleType(m2078b);
            m2532a.setScaleType(m2078b);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R$id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C0946x.g.m2863f(appCompatTextView, 1);
        C1315i.m3656e(appCompatTextView, c0233h1.m799i(R$styleable.TextInputLayout_suffixTextAppearance, 0));
        int i18 = R$styleable.TextInputLayout_suffixTextColor;
        if (c0233h1.m802l(i18)) {
            appCompatTextView.setTextColor(c0233h1.m792b(i18));
        }
        CharSequence m801k3 = c0233h1.m801k(R$styleable.TextInputLayout_suffixText);
        this.f4553H1 = TextUtils.isEmpty(m801k3) ? null : m801k3;
        appCompatTextView.setText(m801k3);
        m2545n();
        frameLayout.addView(m2532a2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(m2532a);
        textInputLayout.f4528t2.add(bVar);
        if (textInputLayout.f4526s != null) {
            bVar.mo2530a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    /* renamed from: a */
    public final CheckableImageButton m2532a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i7) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R$layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i7);
        C0629q.m2080d(checkableImageButton);
        if (C1972c.m4588d(getContext())) {
            C0920g.m2702h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC0628p m2533b() {
        AbstractC0628p c0620h;
        int i7 = this.f4546A1;
        d dVar = this.f4567z1;
        SparseArray<AbstractC0628p> sparseArray = dVar.f4571a;
        AbstractC0628p abstractC0628p = sparseArray.get(i7);
        if (abstractC0628p == null) {
            C0855a c0855a = dVar.f4572b;
            if (i7 == -1) {
                c0620h = new C0620h(c0855a);
            } else if (i7 == 0) {
                c0620h = new C0634v(c0855a);
            } else if (i7 == 1) {
                abstractC0628p = new C0635w(c0855a, dVar.f4574d);
                sparseArray.append(i7, abstractC0628p);
            } else if (i7 == 2) {
                c0620h = new C0619g(c0855a);
            } else {
                if (i7 != 3) {
                    throw new IllegalArgumentException(C0090b.m219e("Invalid end icon mode: ", i7));
                }
                c0620h = new C0627o(c0855a);
            }
            abstractC0628p = c0620h;
            sparseArray.append(i7, abstractC0628p);
        }
        return abstractC0628p;
    }

    /* renamed from: c */
    public final int m2534c() {
        int m2697c;
        if (m2535d() || m2536e()) {
            CheckableImageButton checkableImageButton = this.f4566y1;
            m2697c = C0920g.m2697c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            m2697c = 0;
        }
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return C0946x.e.m2848e(this.f4554I1) + C0946x.e.m2848e(this) + m2697c;
    }

    /* renamed from: d */
    public final boolean m2535d() {
        return this.f4561e.getVisibility() == 0 && this.f4566y1.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean m2536e() {
        return this.f4562m.getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m2537f(boolean z6) {
        boolean z7;
        boolean isActivated;
        boolean isChecked;
        AbstractC0628p m2533b = m2533b();
        boolean mo2075k = m2533b.mo2075k();
        CheckableImageButton checkableImageButton = this.f4566y1;
        boolean z8 = true;
        if (!mo2075k || (isChecked = checkableImageButton.isChecked()) == m2533b.mo2069l()) {
            z7 = false;
        } else {
            checkableImageButton.setChecked(!isChecked);
            z7 = true;
        }
        if (!(m2533b instanceof C0627o) || (isActivated = checkableImageButton.isActivated()) == m2533b.mo2068j()) {
            z8 = z7;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z6 || z8) {
            C0629q.m2079c(this.f4560c, checkableImageButton, this.f4548C1);
        }
    }

    /* renamed from: g */
    public final void m2538g(int i7) {
        if (this.f4546A1 == i7) {
            return;
        }
        AbstractC0628p m2533b = m2533b();
        InterfaceC1148d interfaceC1148d = this.f4558M1;
        AccessibilityManager accessibilityManager = this.f4557L1;
        if (interfaceC1148d != null && accessibilityManager != null) {
            C1147c.m3334b(accessibilityManager, interfaceC1148d);
        }
        this.f4558M1 = null;
        m2533b.mo2060s();
        this.f4546A1 = i7;
        Iterator<TextInputLayout.InterfaceC0853h> it = this.f4547B1.iterator();
        while (it.hasNext()) {
            it.next().m2531a();
        }
        m2539h(i7 != 0);
        AbstractC0628p m2533b2 = m2533b();
        int i8 = this.f4567z1.f4573c;
        if (i8 == 0) {
            i8 = m2533b2.mo2053d();
        }
        Drawable m2561a = i8 != 0 ? C0872a.m2561a(getContext(), i8) : null;
        CheckableImageButton checkableImageButton = this.f4566y1;
        checkableImageButton.setImageDrawable(m2561a);
        TextInputLayout textInputLayout = this.f4560c;
        if (m2561a != null) {
            C0629q.m2077a(textInputLayout, checkableImageButton, this.f4548C1, this.f4549D1);
            C0629q.m2079c(textInputLayout, checkableImageButton, this.f4548C1);
        }
        int mo2052c = m2533b2.mo2052c();
        CharSequence text = mo2052c != 0 ? getResources().getText(mo2052c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(m2533b2.mo2075k());
        if (!m2533b2.mo2067i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i7);
        }
        m2533b2.mo2059r();
        InterfaceC1148d mo2066h = m2533b2.mo2066h();
        this.f4558M1 = mo2066h;
        if (mo2066h != null && accessibilityManager != null) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            if (C0946x.g.m2859b(this)) {
                C1147c.m3333a(accessibilityManager, this.f4558M1);
            }
        }
        View.OnClickListener mo2055f = m2533b2.mo2055f();
        View.OnLongClickListener onLongClickListener = this.f4552G1;
        checkableImageButton.setOnClickListener(mo2055f);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
        EditText editText = this.f4556K1;
        if (editText != null) {
            m2533b2.mo2057m(editText);
            m2541j(m2533b2);
        }
        C0629q.m2077a(textInputLayout, checkableImageButton, this.f4548C1, this.f4549D1);
        m2537f(true);
    }

    /* renamed from: h */
    public final void m2539h(boolean z6) {
        if (m2535d() != z6) {
            this.f4566y1.setVisibility(z6 ? 0 : 8);
            m2542k();
            m2544m();
            this.f4560c.m2522p();
        }
    }

    /* renamed from: i */
    public final void m2540i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4562m;
        checkableImageButton.setImageDrawable(drawable);
        m2543l();
        C0629q.m2077a(this.f4560c, checkableImageButton, this.f4563s, this.f4564w1);
    }

    /* renamed from: j */
    public final void m2541j(AbstractC0628p abstractC0628p) {
        if (this.f4556K1 == null) {
            return;
        }
        if (abstractC0628p.mo2054e() != null) {
            this.f4556K1.setOnFocusChangeListener(abstractC0628p.mo2054e());
        }
        if (abstractC0628p.mo2056g() != null) {
            this.f4566y1.setOnFocusChangeListener(abstractC0628p.mo2056g());
        }
    }

    /* renamed from: k */
    public final void m2542k() {
        this.f4561e.setVisibility((this.f4566y1.getVisibility() != 0 || m2536e()) ? 8 : 0);
        setVisibility(m2535d() || m2536e() || ((this.f4553H1 == null || this.f4555J1) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    /* renamed from: l */
    public final void m2543l() {
        CheckableImageButton checkableImageButton = this.f4562m;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f4560c;
        checkableImageButton.setVisibility(drawable != null && textInputLayout.f4466B1.f3093q && textInputLayout.m2518l() ? 0 : 8);
        m2542k();
        m2544m();
        if (this.f4546A1 != 0) {
            return;
        }
        textInputLayout.m2522p();
    }

    /* renamed from: m */
    public final void m2544m() {
        int i7;
        TextInputLayout textInputLayout = this.f4560c;
        if (textInputLayout.f4526s == null) {
            return;
        }
        if (m2535d() || m2536e()) {
            i7 = 0;
        } else {
            EditText editText = textInputLayout.f4526s;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            i7 = C0946x.e.m2848e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f4526s.getPaddingTop();
        int paddingBottom = textInputLayout.f4526s.getPaddingBottom();
        WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
        C0946x.e.m2854k(this.f4554I1, dimensionPixelSize, paddingTop, i7, paddingBottom);
    }

    /* renamed from: n */
    public final void m2545n() {
        AppCompatTextView appCompatTextView = this.f4554I1;
        int visibility = appCompatTextView.getVisibility();
        int i7 = (this.f4553H1 == null || this.f4555J1) ? 8 : 0;
        if (visibility != i7) {
            m2533b().mo2058p(i7 == 0);
        }
        m2542k();
        appCompatTextView.setVisibility(i7);
        this.f4560c.m2522p();
    }
}
