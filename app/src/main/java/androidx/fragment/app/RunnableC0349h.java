package androidx.fragment.app;

import androidx.fragment.app.AbstractC0368q0;
import p089l.C1467a;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public final class RunnableC0349h implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ AbstractC0368q0.b f1714c;

    /* renamed from: e */
    public final /* synthetic */ AbstractC0368q0.b f1715e;

    /* renamed from: m */
    public final /* synthetic */ boolean f1716m;

    public RunnableC0349h(AbstractC0368q0.b bVar, AbstractC0368q0.b bVar2, boolean z6, C1467a c1467a) {
        this.f1714c = bVar;
        this.f1715e = bVar2;
        this.f1716m = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0348g0.m1175a(this.f1714c.f1853c, this.f1715e.f1853c, this.f1716m);
    }
}
