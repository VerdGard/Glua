package androidx.fragment.app;

import android.ext.C0089a;
import androidx.fragment.app.AbstractC0368q0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public final class RunnableC0339c implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ List f1651c;

    /* renamed from: e */
    public final /* synthetic */ AbstractC0368q0.b f1652e;

    /* renamed from: m */
    public final /* synthetic */ C0357l f1653m;

    public RunnableC0339c(C0357l c0357l, ArrayList arrayList, AbstractC0368q0.b bVar) {
        this.f1653m = c0357l;
        this.f1651c = arrayList;
        this.f1652e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f1651c;
        AbstractC0368q0.b bVar = this.f1652e;
        if (list.contains(bVar)) {
            list.remove(bVar);
            this.f1653m.getClass();
            C0089a.m205b(bVar.f1851a, bVar.f1853c.f1793U1);
        }
    }
}
