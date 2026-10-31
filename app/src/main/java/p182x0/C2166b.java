package p182x0;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: x0.b */
/* loaded from: classes.dex */
public final class C2166b extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2167c f9801a;

    public C2166b(AbstractC2167c abstractC2167c) {
        this.f9801a = abstractC2167c;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f9801a.mo3610a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f9801a.mo3611b(drawable);
    }
}
