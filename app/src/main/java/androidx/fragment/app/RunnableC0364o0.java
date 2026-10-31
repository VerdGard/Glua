package androidx.fragment.app;

import android.ext.C0089a;
import androidx.fragment.app.AbstractC0368q0;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.o0 */
/* loaded from: classes.dex */
public final class RunnableC0364o0 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ AbstractC0368q0.a f1834c;

    /* renamed from: e */
    public final /* synthetic */ AbstractC0368q0 f1835e;

    public RunnableC0364o0(AbstractC0368q0 abstractC0368q0, AbstractC0368q0.a aVar) {
        this.f1835e = abstractC0368q0;
        this.f1834c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<AbstractC0368q0.b> arrayList = this.f1835e.f1846b;
        AbstractC0368q0.a aVar = this.f1834c;
        if (arrayList.contains(aVar)) {
            C0089a.m205b(aVar.f1851a, aVar.f1853c.f1793U1);
        }
    }
}
