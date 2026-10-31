package p021c4;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.activity.RunnableC0119d;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.textfield.C0855a;
import p004a3.C0034a;
import p139r3.C1832j;

/* renamed from: c4.g */
/* loaded from: classes.dex */
public final class C0619g extends AbstractC0628p {

    /* renamed from: e */
    public final int f3039e;

    /* renamed from: f */
    public final int f3040f;

    /* renamed from: g */
    public final TimeInterpolator f3041g;

    /* renamed from: h */
    public final TimeInterpolator f3042h;

    /* renamed from: i */
    public EditText f3043i;

    /* renamed from: j */
    public final ViewOnClickListenerC0615c f3044j;

    /* renamed from: k */
    public final ViewOnFocusChangeListenerC0616d f3045k;

    /* renamed from: l */
    public AnimatorSet f3046l;

    /* renamed from: m */
    public ValueAnimator f3047m;

    /* JADX WARN: Type inference failed for: r0v1, types: [c4.d] */
    public C0619g(C0855a c0855a) {
        super(c0855a);
        this.f3044j = new ViewOnClickListenerC0615c(this, 0);
        this.f3045k = new View.OnFocusChangeListener() { // from class: c4.d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                C0619g c0619g = C0619g.this;
                c0619g.m2061t(c0619g.m2062u());
            }
        };
        Context context = c0855a.getContext();
        int i7 = R$attr.motionDurationShort3;
        this.f3039e = C1832j.m4312c(context, i7, 100);
        this.f3040f = C1832j.m4312c(c0855a.getContext(), i7, 150);
        this.f3041g = C1832j.m4313d(c0855a.getContext(), R$attr.motionEasingLinearInterpolator, C0034a.f108a);
        this.f3042h = C1832j.m4313d(c0855a.getContext(), R$attr.motionEasingEmphasizedInterpolator, C0034a.f111d);
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: a */
    public final void mo2051a() {
        if (this.f3072b.f4553H1 != null) {
            return;
        }
        m2061t(m2062u());
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: c */
    public final int mo2052c() {
        return R$string.clear_text_end_icon_content_description;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: d */
    public final int mo2053d() {
        return R$drawable.mtrl_ic_cancel;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: e */
    public final View.OnFocusChangeListener mo2054e() {
        return this.f3045k;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: f */
    public final View.OnClickListener mo2055f() {
        return this.f3044j;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: g */
    public final View.OnFocusChangeListener mo2056g() {
        return this.f3045k;
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: m */
    public final void mo2057m(EditText editText) {
        this.f3043i = editText;
        this.f3071a.setEndIconVisible(m2062u());
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: p */
    public final void mo2058p(boolean z6) {
        if (this.f3072b.f4553H1 == null) {
            return;
        }
        m2061t(z6);
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: r */
    public final void mo2059r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f3042h);
        ofFloat.setDuration(this.f3040f);
        ofFloat.addUpdateListener(new C0613a(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3041g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i7 = this.f3039e;
        ofFloat2.setDuration(i7);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c4.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0619g c0619g = C0619g.this;
                c0619g.getClass();
                c0619g.f3074d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3046l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f3046l.addListener(new C0617e(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i7);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c4.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0619g c0619g = C0619g.this;
                c0619g.getClass();
                c0619g.f3074d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f3047m = ofFloat3;
        ofFloat3.addListener(new C0618f(this));
    }

    @Override // p021c4.AbstractC0628p
    /* renamed from: s */
    public final void mo2060s() {
        EditText editText = this.f3043i;
        if (editText != null) {
            editText.post(new RunnableC0119d(8, this));
        }
    }

    /* renamed from: t */
    public final void m2061t(boolean z6) {
        boolean z7 = this.f3072b.m2535d() == z6;
        if (z6 && !this.f3046l.isRunning()) {
            this.f3047m.cancel();
            this.f3046l.start();
            if (z7) {
                this.f3046l.end();
                return;
            }
            return;
        }
        if (z6) {
            return;
        }
        this.f3046l.cancel();
        this.f3047m.start();
        if (z7) {
            this.f3047m.end();
        }
    }

    /* renamed from: u */
    public final boolean m2062u() {
        EditText editText = this.f3043i;
        return editText != null && (editText.hasFocus() || this.f3074d.hasFocus()) && this.f3043i.getText().length() > 0;
    }
}
