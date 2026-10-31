package p034e0;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: e0.s */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0941s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c */
    public final View f4873c;

    /* renamed from: e */
    public ViewTreeObserver f4874e;

    /* renamed from: m */
    public final Runnable f4875m;

    public ViewTreeObserverOnPreDrawListenerC0941s(View view, Runnable runnable) {
        this.f4873c = view;
        this.f4874e = view.getViewTreeObserver();
        this.f4875m = runnable;
    }

    /* renamed from: a */
    public static void m2796a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0941s viewTreeObserverOnPreDrawListenerC0941s = new ViewTreeObserverOnPreDrawListenerC0941s(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0941s);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0941s);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f4874e.isAlive();
        View view = this.f4873c;
        (isAlive ? this.f4874e : view.getViewTreeObserver()).removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f4875m.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f4874e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f4874e.isAlive();
        View view2 = this.f4873c;
        (isAlive ? this.f4874e : view2.getViewTreeObserver()).removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
