package p009b0;

import androidx.lifecycle.C0391d0;
import p173w.C2044f;
import p181x.C2156e;

/* renamed from: b0.b */
/* loaded from: classes.dex */
public final class RunnableC0498b implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ C0391d0 f2510c;

    /* renamed from: e */
    public final /* synthetic */ int f2511e;

    public RunnableC0498b(C0391d0 c0391d0, int i7) {
        this.f2510c = c0391d0;
        this.f2511e = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2044f.e eVar = ((C2156e.a) this.f2510c).f9773q;
        if (eVar != null) {
            eVar.mo720c(this.f2511e);
        }
    }
}
