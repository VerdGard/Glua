package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: androidx.fragment.app.h0 */
/* loaded from: classes.dex */
public final class C0350h0 extends Transition.EpicenterCallback {

    /* renamed from: a */
    public final /* synthetic */ Rect f1717a;

    public C0350h0(Rect rect) {
        this.f1717a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f1717a;
    }
}
