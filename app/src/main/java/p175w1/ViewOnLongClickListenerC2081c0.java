package p175w1;

import android.view.View;
import p175w1.C2083d0;
import p183x1.C2177d;

/* renamed from: w1.c0 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC2081c0 implements View.OnLongClickListener {

    /* renamed from: c */
    public final /* synthetic */ C2083d0.a f9487c;

    public ViewOnLongClickListenerC2081c0(C2083d0.a aVar) {
        this.f9487c = aVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C2083d0.a aVar = this.f9487c;
        aVar.f9529C1 = true;
        C2101m0.m5155a(0, new RunnableC2098l(aVar));
        new C2177d(0);
        return true;
    }
}
