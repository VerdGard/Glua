package p077j3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import p077j3.InterfaceC1411d;

/* renamed from: j3.b */
/* loaded from: classes.dex */
public final class C1409b {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static AnimatorSet m3759a(InterfaceC1411d interfaceC1411d, float f7, float f8, float f9) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC1411d, InterfaceC1411d.b.f6771a, InterfaceC1411d.a.f6769b, new InterfaceC1411d.d(f7, f8, f9));
        InterfaceC1411d.d revealInfo = interfaceC1411d.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC1411d, (int) f7, (int) f8, revealInfo.f6775c, f9);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }
}
