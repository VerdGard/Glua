package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C0357l;

/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0345f implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f1682a;

    /* renamed from: b */
    public final /* synthetic */ View f1683b;

    /* renamed from: c */
    public final /* synthetic */ C0357l.a f1684c;

    /* renamed from: androidx.fragment.app.f$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnimationAnimationListenerC0345f animationAnimationListenerC0345f = AnimationAnimationListenerC0345f.this;
            animationAnimationListenerC0345f.f1682a.endViewTransition(animationAnimationListenerC0345f.f1683b);
            animationAnimationListenerC0345f.f1684c.m1199a();
        }
    }

    public AnimationAnimationListenerC0345f(View view, ViewGroup viewGroup, C0357l.a aVar) {
        this.f1682a = viewGroup;
        this.f1683b = view;
        this.f1684c = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1682a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
