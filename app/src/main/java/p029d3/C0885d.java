package p029d3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p193y3.C2237f;

/* renamed from: d3.d */
/* loaded from: classes.dex */
public final class C0885d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f4663a;

    public C0885d(BottomSheetBehavior bottomSheetBehavior) {
        this.f4663a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C2237f c2237f = this.f4663a.f3920x1;
        if (c2237f != null) {
            C2237f.b bVar = c2237f.f10154c;
            if (bVar.f10172j != floatValue) {
                bVar.f10172j = floatValue;
                c2237f.f10151X = true;
                c2237f.invalidateSelf();
            }
        }
    }
}
