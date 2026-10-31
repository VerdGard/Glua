package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.j0 */
/* loaded from: classes.dex */
public final class C0354j0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f1732a;

    public C0354j0(Runnable runnable) {
        this.f1732a = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f1732a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
