package p009b0;

import android.os.Handler;
import androidx.lifecycle.C0391d0;
import p009b0.C0507k;
import p181x.C2156e;

/* renamed from: b0.c */
/* loaded from: classes.dex */
public final class C0499c {

    /* renamed from: a */
    public final C0391d0 f2512a;

    /* renamed from: b */
    public final Handler f2513b;

    public C0499c(C2156e.a aVar, Handler handler) {
        this.f2512a = aVar;
        this.f2513b = handler;
    }

    /* renamed from: a */
    public final void m1822a(C0507k.a aVar) {
        int i7 = aVar.f2536b;
        boolean z6 = i7 == 0;
        Handler handler = this.f2513b;
        C0391d0 c0391d0 = this.f2512a;
        if (z6) {
            handler.post(new RunnableC0497a(c0391d0, aVar.f2535a));
        } else {
            handler.post(new RunnableC0498b(c0391d0, i7));
        }
    }
}
