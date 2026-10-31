package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import p057h.C1267a;

/* renamed from: androidx.appcompat.widget.i1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0236i1 implements View.OnClickListener {

    /* renamed from: c */
    public final C1267a f926c;

    /* renamed from: e */
    public final /* synthetic */ C0242k1 f927e;

    public ViewOnClickListenerC0236i1(C0242k1 c0242k1) {
        this.f927e = c0242k1;
        this.f926c = new C1267a(c0242k1.f946a.getContext(), 0, android.R.id.home, 0, c0242k1.f954i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0242k1 c0242k1 = this.f927e;
        Window.Callback callback = c0242k1.f957l;
        if (callback == null || !c0242k1.f958m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f926c);
    }
}
