package p016c;

import android.window.OnBackInvokedCallback;

/* renamed from: c.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C0565s implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f2900a;

    /* renamed from: b */
    public final /* synthetic */ Object f2901b;

    public /* synthetic */ C0565s(int i7, Object obj) {
        this.f2900a = i7;
        this.f2901b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f2900a) {
            case 0:
                ((LayoutInflaterFactory2C0560n) this.f2901b).m1955T();
                break;
            default:
                ((Runnable) this.f2901b).run();
                break;
        }
    }
}
