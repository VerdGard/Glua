package p071i5;

import p055g5.C1245b;

/* renamed from: i5.e0 */
/* loaded from: classes.dex */
public final class RunnableC1365e0 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ ViewOnClickListenerC1367f0 f6633c;

    public RunnableC1365e0(ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0) {
        this.f6633c = viewOnClickListenerC1367f0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnClickListenerC1367f0 viewOnClickListenerC1367f0 = this.f6633c;
        boolean m3570i = viewOnClickListenerC1367f0.f6638B1.getEventHandler().m3570i();
        C1245b c1245b = viewOnClickListenerC1367f0.f6638B1;
        if (!m3570i && !c1245b.getCursor().m2163a()) {
            viewOnClickListenerC1367f0.mo3615b();
        } else {
            if (c1245b.getCursor().m2163a()) {
                return;
            }
            c1245b.m3487d0(this, 100L);
        }
    }
}
