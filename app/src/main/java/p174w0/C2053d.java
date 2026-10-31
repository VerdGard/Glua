package p174w0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: w0.d */
/* loaded from: classes.dex */
public final class C2053d extends AbstractC2074y {

    /* renamed from: w0.d$a */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f9369a;

        /* renamed from: b */
        public boolean f9370b = false;

        public a(View view) {
            this.f9369a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C2069t c2069t = C2067r.f9436a;
            View view = this.f9369a;
            c2069t.mo5128X(view, 1.0f);
            if (this.f9370b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            View view = this.f9369a;
            if (C0946x.d.m2832h(view) && view.getLayerType() == 0) {
                this.f9370b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public C2053d() {
    }

    public C2053d(int i7) {
        if ((i7 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f9448M1 = i7;
    }

    /* renamed from: J */
    public final ObjectAnimator m5090J(View view, float f7, float f8) {
        if (f7 == f8) {
            return null;
        }
        C2067r.f9436a.mo5128X(view, f7);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C2067r.f9437b, f8);
        ofFloat.addListener(new a(view));
        mo5103a(new C2052c(view));
        return ofFloat;
    }

    @Override // p174w0.AbstractC2057h
    /* renamed from: g */
    public final void mo5083g(C2064o c2064o) {
        m5132H(c2064o);
        c2064o.f9428a.put("android:fade:transitionAlpha", Float.valueOf(C2067r.f9436a.mo5127W(c2064o.f9429b)));
    }
}
