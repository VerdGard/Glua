package p021c4;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: c4.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0613a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f3031a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0628p f3032b;

    public /* synthetic */ C0613a(AbstractC0628p abstractC0628p, int i7) {
        this.f3031a = i7;
        this.f3032b = abstractC0628p;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f3031a;
        AbstractC0628p abstractC0628p = this.f3032b;
        switch (i7) {
            case 0:
                C0619g c0619g = (C0619g) abstractC0628p;
                c0619g.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = c0619g.f3074d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                break;
            default:
                C0627o c0627o = (C0627o) abstractC0628p;
                c0627o.getClass();
                c0627o.f3074d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
