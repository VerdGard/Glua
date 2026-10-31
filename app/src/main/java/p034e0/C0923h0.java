package p034e0;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* renamed from: e0.h0 */
/* loaded from: classes.dex */
public final class C0923h0 {

    /* renamed from: a */
    public final WeakReference<View> f4801a;

    /* renamed from: e0.h0$a */
    public static class a {
        /* renamed from: a */
        public static ViewPropertyAnimator m2708a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public C0923h0(View view) {
        this.f4801a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public final void m2703a(float f7) {
        View view = this.f4801a.get();
        if (view != null) {
            view.animate().alpha(f7);
        }
    }

    /* renamed from: b */
    public final void m2704b() {
        View view = this.f4801a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void m2705c(long j7) {
        View view = this.f4801a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
    }

    /* renamed from: d */
    public final void m2706d(InterfaceC0925i0 interfaceC0925i0) {
        View view = this.f4801a.get();
        if (view != null) {
            if (interfaceC0925i0 != null) {
                view.animate().setListener(new C0921g0(interfaceC0925i0, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: e */
    public final void m2707e(float f7) {
        View view = this.f4801a.get();
        if (view != null) {
            view.animate().translationY(f7);
        }
    }
}
