package androidx.fragment.app;

import androidx.fragment.app.AbstractC0368q0;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.p0 */
/* loaded from: classes.dex */
public final class RunnableC0366p0 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ AbstractC0368q0.a f1837c;

    /* renamed from: e */
    public final /* synthetic */ AbstractC0368q0 f1838e;

    public RunnableC0366p0(AbstractC0368q0 abstractC0368q0, AbstractC0368q0.a aVar) {
        this.f1838e = abstractC0368q0;
        this.f1837c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0368q0 abstractC0368q0 = this.f1838e;
        ArrayList<AbstractC0368q0.b> arrayList = abstractC0368q0.f1846b;
        AbstractC0368q0.a aVar = this.f1837c;
        arrayList.remove(aVar);
        abstractC0368q0.f1847c.remove(aVar);
    }
}
