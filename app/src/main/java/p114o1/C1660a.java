package p114o1;

import android.animation.ValueAnimator;
import com.so.revelation.lua.View.widget.Chouti;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public final class C1660a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ Chouti f7513a;

    public C1660a(Chouti chouti) {
        this.f7513a = chouti;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7513a.setExpansion(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
