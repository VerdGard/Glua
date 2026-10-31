package p021c4;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0233h1;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p034e0.C0920g;
import p034e0.C0923h0;
import p034e0.C0946x;
import p066i0.C1315i;
import p131q3.C1767w;
import p163u3.C1972c;

@SuppressLint({"ViewConstructor"})
/* renamed from: c4.x */
/* loaded from: classes.dex */
public final class C0636x extends LinearLayout {

    /* renamed from: A1 */
    public View.OnLongClickListener f3124A1;

    /* renamed from: B1 */
    public boolean f3125B1;

    /* renamed from: c */
    public final TextInputLayout f3126c;

    /* renamed from: e */
    public final AppCompatTextView f3127e;

    /* renamed from: m */
    public CharSequence f3128m;

    /* renamed from: s */
    public final CheckableImageButton f3129s;

    /* renamed from: w1 */
    public ColorStateList f3130w1;

    /* renamed from: x1 */
    public PorterDuff.Mode f3131x1;

    /* renamed from: y1 */
    public int f3132y1;

    /* renamed from: z1 */
    public ImageView.ScaleType f3133z1;

    public C0636x(TextInputLayout textInputLayout, C0233h1 c0233h1) {
        super(textInputLayout.getContext());
        CharSequence m801k;
        this.f3126c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3129s = checkableImageButton;
        C0629q.m2080d(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f3127e = appCompatTextView;
        if (C1972c.m4588d(getContext())) {
            C0920g.m2701g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f3124A1;
        checkableImageButton.setOnClickListener(null);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
        this.f3124A1 = null;
        checkableImageButton.setOnLongClickListener(null);
        C0629q.m2081e(checkableImageButton, null);
        int i7 = R$styleable.TextInputLayout_startIconTint;
        if (c0233h1.m802l(i7)) {
            this.f3130w1 = C1972c.m4586b(getContext(), c0233h1, i7);
        }
        int i8 = R$styleable.TextInputLayout_startIconTintMode;
        if (c0233h1.m802l(i8)) {
            this.f3131x1 = C1767w.m4240c(c0233h1.m798h(i8, -1), null);
        }
        int i9 = R$styleable.TextInputLayout_startIconDrawable;
        if (c0233h1.m802l(i9)) {
            m2095b(c0233h1.m795e(i9));
            int i10 = R$styleable.TextInputLayout_startIconContentDescription;
            if (c0233h1.m802l(i10) && checkableImageButton.getContentDescription() != (m801k = c0233h1.m801k(i10))) {
                checkableImageButton.setContentDescription(m801k);
            }
            checkableImageButton.setCheckable(c0233h1.m791a(R$styleable.TextInputLayout_startIconCheckable, true));
        }
        int m794d = c0233h1.m794d(R$styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size));
        if (m794d < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (m794d != this.f3132y1) {
            this.f3132y1 = m794d;
            checkableImageButton.setMinimumWidth(m794d);
            checkableImageButton.setMinimumHeight(m794d);
        }
        int i11 = R$styleable.TextInputLayout_startIconScaleType;
        if (c0233h1.m802l(i11)) {
            ImageView.ScaleType m2078b = C0629q.m2078b(c0233h1.m798h(i11, -1));
            this.f3133z1 = m2078b;
            checkableImageButton.setScaleType(m2078b);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R$id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.g.m2863f(appCompatTextView, 1);
        C1315i.m3656e(appCompatTextView, c0233h1.m799i(R$styleable.TextInputLayout_prefixTextAppearance, 0));
        int i12 = R$styleable.TextInputLayout_prefixTextColor;
        if (c0233h1.m802l(i12)) {
            appCompatTextView.setTextColor(c0233h1.m792b(i12));
        }
        CharSequence m801k2 = c0233h1.m801k(R$styleable.TextInputLayout_prefixText);
        this.f3128m = TextUtils.isEmpty(m801k2) ? null : m801k2;
        appCompatTextView.setText(m801k2);
        m2098e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: a */
    public final int m2094a() {
        CheckableImageButton checkableImageButton = this.f3129s;
        int m2696b = checkableImageButton.getVisibility() == 0 ? C0920g.m2696b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() : 0;
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        return C0946x.e.m2849f(this.f3127e) + C0946x.e.m2849f(this) + m2696b;
    }

    /* renamed from: b */
    public final void m2095b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3129s;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3130w1;
            PorterDuff.Mode mode = this.f3131x1;
            TextInputLayout textInputLayout = this.f3126c;
            C0629q.m2077a(textInputLayout, checkableImageButton, colorStateList, mode);
            m2096c(true);
            C0629q.m2079c(textInputLayout, checkableImageButton, this.f3130w1);
            return;
        }
        m2096c(false);
        View.OnLongClickListener onLongClickListener = this.f3124A1;
        checkableImageButton.setOnClickListener(null);
        C0629q.m2081e(checkableImageButton, onLongClickListener);
        this.f3124A1 = null;
        checkableImageButton.setOnLongClickListener(null);
        C0629q.m2081e(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: c */
    public final void m2096c(boolean z6) {
        CheckableImageButton checkableImageButton = this.f3129s;
        if ((checkableImageButton.getVisibility() == 0) != z6) {
            checkableImageButton.setVisibility(z6 ? 0 : 8);
            m2097d();
            m2098e();
        }
    }

    /* renamed from: d */
    public final void m2097d() {
        EditText editText = this.f3126c.f4526s;
        if (editText == null) {
            return;
        }
        int i7 = 0;
        if (!(this.f3129s.getVisibility() == 0)) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            i7 = C0946x.e.m2849f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, C0923h0> weakHashMap2 = C0946x.f4876a;
        C0946x.e.m2854k(this.f3127e, i7, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: e */
    public final void m2098e() {
        int i7 = (this.f3128m == null || this.f3125B1) ? 8 : 0;
        setVisibility(this.f3129s.getVisibility() == 0 || i7 == 0 ? 0 : 8);
        this.f3127e.setVisibility(i7);
        this.f3126c.m2522p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        m2097d();
    }
}
