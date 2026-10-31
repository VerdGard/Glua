package p123p3;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.C0819d;

/* renamed from: p3.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1701b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: c */
    public final /* synthetic */ C0819d f7667c;

    public ViewTreeObserverOnPreDrawListenerC1701b(C0819d c0819d) {
        this.f7667c = c0819d;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0819d c0819d = this.f7667c;
        float rotation = c0819d.f4290q.getRotation();
        if (c0819d.f4283j == rotation) {
            return true;
        }
        c0819d.f4283j = rotation;
        c0819d.mo2473m();
        return true;
    }
}
