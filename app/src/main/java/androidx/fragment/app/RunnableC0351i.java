package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class RunnableC0351i implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ AbstractC0358l0 f1718c;

    /* renamed from: e */
    public final /* synthetic */ View f1719e;

    /* renamed from: m */
    public final /* synthetic */ Rect f1720m;

    public RunnableC0351i(AbstractC0358l0 abstractC0358l0, View view, Rect rect) {
        this.f1718c = abstractC0358l0;
        this.f1719e = view;
        this.f1720m = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1718c.getClass();
        AbstractC0358l0.m1203g(this.f1719e, this.f1720m);
    }
}
