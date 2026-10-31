package p131q3;

import android.view.View;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: q3.v */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1766v implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0946x.h.m2867c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
