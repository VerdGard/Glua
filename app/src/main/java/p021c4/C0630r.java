package p021c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p004a3.C0034a;
import p034e0.C0923h0;
import p034e0.C0946x;
import p036e2.C1109v5;
import p139r3.C1832j;
import p163u3.C1972c;

/* renamed from: c4.r */
/* loaded from: classes.dex */
public final class C0630r {

    /* renamed from: A */
    public ColorStateList f3075A;

    /* renamed from: B */
    public Typeface f3076B;

    /* renamed from: a */
    public final int f3077a;

    /* renamed from: b */
    public final int f3078b;

    /* renamed from: c */
    public final int f3079c;

    /* renamed from: d */
    public final TimeInterpolator f3080d;

    /* renamed from: e */
    public final TimeInterpolator f3081e;

    /* renamed from: f */
    public final TimeInterpolator f3082f;

    /* renamed from: g */
    public final Context f3083g;

    /* renamed from: h */
    public final TextInputLayout f3084h;

    /* renamed from: i */
    public LinearLayout f3085i;

    /* renamed from: j */
    public int f3086j;

    /* renamed from: k */
    public FrameLayout f3087k;

    /* renamed from: l */
    public Animator f3088l;

    /* renamed from: m */
    public final float f3089m;

    /* renamed from: n */
    public int f3090n;

    /* renamed from: o */
    public int f3091o;

    /* renamed from: p */
    public CharSequence f3092p;

    /* renamed from: q */
    public boolean f3093q;

    /* renamed from: r */
    public AppCompatTextView f3094r;

    /* renamed from: s */
    public CharSequence f3095s;

    /* renamed from: t */
    public int f3096t;

    /* renamed from: u */
    public int f3097u;

    /* renamed from: v */
    public ColorStateList f3098v;

    /* renamed from: w */
    public CharSequence f3099w;

    /* renamed from: x */
    public boolean f3100x;

    /* renamed from: y */
    public AppCompatTextView f3101y;

    /* renamed from: z */
    public int f3102z;

    /* renamed from: c4.r$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f3103a;

        /* renamed from: b */
        public final /* synthetic */ TextView f3104b;

        /* renamed from: c */
        public final /* synthetic */ int f3105c;

        /* renamed from: d */
        public final /* synthetic */ TextView f3106d;

        public a(int i7, TextView textView, int i8, TextView textView2) {
            this.f3103a = i7;
            this.f3104b = textView;
            this.f3105c = i8;
            this.f3106d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i7 = this.f3103a;
            C0630r c0630r = C0630r.this;
            c0630r.f3090n = i7;
            c0630r.f3088l = null;
            TextView textView = this.f3104b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f3105c == 1 && (appCompatTextView = c0630r.f3094r) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f3106d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f3106d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public C0630r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f3083g = context;
        this.f3084h = textInputLayout;
        this.f3089m = context.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y);
        int i7 = R$attr.motionDurationShort4;
        this.f3077a = C1832j.m4312c(context, i7, 217);
        this.f3078b = C1832j.m4312c(context, R$attr.motionDurationMedium4, 167);
        this.f3079c = C1832j.m4312c(context, i7, 167);
        int i8 = R$attr.motionEasingEmphasizedDecelerateInterpolator;
        this.f3080d = C1832j.m4313d(context, i8, C0034a.f111d);
        LinearInterpolator linearInterpolator = C0034a.f108a;
        this.f3081e = C1832j.m4313d(context, i8, linearInterpolator);
        this.f3082f = C1832j.m4313d(context, R$attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m2082a(TextView textView, int i7) {
        if (this.f3085i == null && this.f3087k == null) {
            Context context = this.f3083g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f3085i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f3085i;
            TextInputLayout textInputLayout = this.f3084h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f3087k = new FrameLayout(context);
            this.f3085i.addView(this.f3087k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m2083b();
            }
        }
        if (i7 == 0 || i7 == 1) {
            this.f3087k.setVisibility(0);
            this.f3087k.addView(textView);
        } else {
            this.f3085i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f3085i.setVisibility(0);
        this.f3086j++;
    }

    /* renamed from: b */
    public final void m2083b() {
        LinearLayout linearLayout = this.f3085i;
        TextInputLayout textInputLayout = this.f3084h;
        if ((linearLayout == null || textInputLayout.getEditText() == null) ? false : true) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f3083g;
            boolean m4588d = C1972c.m4588d(context);
            LinearLayout linearLayout2 = this.f3085i;
            int i7 = R$dimen.material_helper_text_font_1_3_padding_horizontal;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            int m2849f = C0946x.e.m2849f(editText);
            if (m4588d) {
                m2849f = context.getResources().getDimensionPixelSize(i7);
            }
            int i8 = R$dimen.material_helper_text_font_1_3_padding_top;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.material_helper_text_default_padding_top);
            if (m4588d) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(i8);
            }
            int m2848e = C0946x.e.m2848e(editText);
            if (m4588d) {
                m2848e = context.getResources().getDimensionPixelSize(i7);
            }
            C0946x.e.m2854k(linearLayout2, m2849f, dimensionPixelSize, m2848e, 0);
        }
    }

    /* renamed from: c */
    public final void m2084c() {
        Animator animator = this.f3088l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void m2085d(ArrayList arrayList, boolean z6, TextView textView, int i7, int i8, int i9) {
        if (textView == null || !z6) {
            return;
        }
        if (i7 == i9 || i7 == i8) {
            boolean z7 = i9 == i7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z7 ? 1.0f : 0.0f);
            int i10 = this.f3079c;
            ofFloat.setDuration(z7 ? this.f3078b : i10);
            ofFloat.setInterpolator(z7 ? this.f3081e : this.f3082f);
            if (i7 == i9 && i8 != 0) {
                ofFloat.setStartDelay(i10);
            }
            arrayList.add(ofFloat);
            if (i9 != i7 || i8 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f3089m, 0.0f);
            ofFloat2.setDuration(this.f3077a);
            ofFloat2.setInterpolator(this.f3080d);
            ofFloat2.setStartDelay(i10);
            arrayList.add(ofFloat2);
        }
    }

    /* renamed from: e */
    public final TextView m2086e(int i7) {
        if (i7 == 1) {
            return this.f3094r;
        }
        if (i7 != 2) {
            return null;
        }
        return this.f3101y;
    }

    /* renamed from: f */
    public final void m2087f() {
        this.f3092p = null;
        m2084c();
        if (this.f3090n == 1) {
            this.f3091o = (!this.f3100x || TextUtils.isEmpty(this.f3099w)) ? 0 : 2;
        }
        m2090i(this.f3090n, this.f3091o, m2089h(this.f3094r, ""));
    }

    /* renamed from: g */
    public final void m2088g(TextView textView, int i7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f3085i;
        if (viewGroup2 == null) {
            return;
        }
        boolean z6 = true;
        if (i7 != 0 && i7 != 1) {
            z6 = false;
        }
        if (z6 && (viewGroup = this.f3087k) != null) {
            viewGroup2 = viewGroup;
        }
        viewGroup2.removeView(textView);
        int i8 = this.f3086j - 1;
        this.f3086j = i8;
        LinearLayout linearLayout = this.f3085i;
        if (i8 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m2089h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        TextInputLayout textInputLayout = this.f3084h;
        return C0946x.g.m2860c(textInputLayout) && textInputLayout.isEnabled() && !(this.f3091o == this.f3090n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: i */
    public final void m2090i(int i7, int i8, boolean z6) {
        TextView m2086e;
        TextView m2086e2;
        if (i7 == i8) {
            return;
        }
        if (z6) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f3088l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m2085d(arrayList, this.f3100x, this.f3101y, 2, i7, i8);
            m2085d(arrayList, this.f3093q, this.f3094r, 1, i7, i8);
            C1109v5.m3256t(animatorSet, arrayList);
            animatorSet.addListener(new a(i8, m2086e(i7), i7, m2086e(i8)));
            animatorSet.start();
        } else if (i7 != i8) {
            if (i8 != 0 && (m2086e2 = m2086e(i8)) != null) {
                m2086e2.setVisibility(0);
                m2086e2.setAlpha(1.0f);
            }
            if (i7 != 0 && (m2086e = m2086e(i7)) != null) {
                m2086e.setVisibility(4);
                if (i7 == 1) {
                    m2086e.setText((CharSequence) null);
                }
            }
            this.f3090n = i8;
        }
        TextInputLayout textInputLayout = this.f3084h;
        textInputLayout.m2523q();
        textInputLayout.m2526t(z6, false);
        textInputLayout.m2529w();
    }
}
