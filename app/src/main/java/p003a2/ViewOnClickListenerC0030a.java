package p003a2;

import android.view.View;
import p198z0.C2274b;

/* renamed from: a2.a */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0030a implements View.OnClickListener {

    /* renamed from: c */
    public final /* synthetic */ int f95c;

    /* renamed from: e */
    public final /* synthetic */ C0033d f96e;

    public ViewOnClickListenerC0030a(C0033d c0033d, int i7) {
        this.f96e = c0033d;
        this.f95c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0033d c0033d = this.f96e;
        C2274b c2274b = c0033d.f105e;
        int i7 = this.f95c;
        c2274b.setCurrentItem(i7);
        c0033d.f106f.edit().putInt("TabIndex", i7).apply();
    }
}
