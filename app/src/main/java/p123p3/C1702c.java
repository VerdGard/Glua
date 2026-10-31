package p123p3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.C0819d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* renamed from: p3.c */
/* loaded from: classes.dex */
public final class C1702c extends C0819d {

    /* renamed from: I */
    public StateListAnimator f7668I;

    public C1702c(FloatingActionButton floatingActionButton, FloatingActionButton.C0814b c0814b) {
        super(floatingActionButton, c0814b);
    }

    @Override // com.google.android.material.floatingactionbutton.C0819d
    /* renamed from: e */
    public final float mo2465e() {
        return this.f4290q.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C0819d
    /* renamed from: f */
    public final void mo2466f(Rect rect) {
        if (FloatingActionButton.this.f4242B1) {
            super.mo2466f(rect);
            return;
        }
        boolean z6 = this.f4275b;
        FloatingActionButton floatingActionButton = this.f4290q;
        int sizeDimension = !z6 || floatingActionButton.getSizeDimension() >= 0 ? 0 : (0 - floatingActionButton.getSizeDimension()) / 2;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    @Override // com.google.android.material.floatingactionbutton.C0819d
    /* renamed from: g */
    public final void mo2467g() {
    }

    @Override // com.google.android.material.floatingactionbutton.C0819d
    /* renamed from: h */
    public final void mo2468h() {
        m2474n();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.C0819d
    /* renamed from: i */
    public final void mo2469i(int[] iArr) {
        float f7;
        if (Build.VERSION.SDK_INT == 21) {
            FloatingActionButton floatingActionButton = this.f4290q;
            if (floatingActionButton.isEnabled()) {
                floatingActionButton.setElevation(this.f4277d);
                if (floatingActionButton.isPressed()) {
                    f7 = this.f4279f;
                } else if (floatingActionButton.isFocused() || floatingActionButton.isHovered()) {
                    f7 = this.f4278e;
                }
                floatingActionButton.setTranslationZ(f7);
                return;
            }
            floatingActionButton.setElevation(0.0f);
            floatingActionButton.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C0819d
    /* renamed from: j */
    public final void mo2470j(float f7, float f8, float f9) {
        int i7 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f4290q;
        if (i7 == 21) {
            floatingActionButton.refreshDrawableState();
        } else if (floatingActionButton.getStateListAnimator() == this.f7668I) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C0819d.f4265C, m4125o(f7, f9));
            stateListAnimator.addState(C0819d.f4266D, m4125o(f7, f8));
            stateListAnimator.addState(C0819d.f4267E, m4125o(f7, f8));
            stateListAnimator.addState(C0819d.f4268F, m4125o(f7, f8));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f7).setDuration(0L));
            if (i7 >= 22 && i7 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C0819d.f4271x);
            stateListAnimator.addState(C0819d.f4269G, animatorSet);
            stateListAnimator.addState(C0819d.f4270H, m4125o(0.0f, 0.0f));
            this.f7668I = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (m4126p()) {
            m2474n();
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C0819d
    /* renamed from: l */
    public final void mo2472l() {
    }

    @Override // com.google.android.material.floatingactionbutton.C0819d
    /* renamed from: m */
    public final void mo2473m() {
    }

    /* renamed from: o */
    public final AnimatorSet m4125o(float f7, float f8) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f4290q;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f7).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f8).setDuration(100L));
        animatorSet.setInterpolator(C0819d.f4271x);
        return animatorSet;
    }

    /* renamed from: p */
    public final boolean m4126p() {
        if (FloatingActionButton.this.f4242B1) {
            return true;
        }
        return !(!this.f4275b || this.f4290q.getSizeDimension() >= 0);
    }
}
