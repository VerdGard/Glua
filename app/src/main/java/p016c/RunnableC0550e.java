package p016c;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* renamed from: c.e */
/* loaded from: classes.dex */
public final class RunnableC0550e implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ View f2747c;

    /* renamed from: e */
    public final /* synthetic */ View f2748e;

    /* renamed from: m */
    public final /* synthetic */ AlertController f2749m;

    public RunnableC0550e(AlertController alertController, View view, View view2) {
        this.f2749m = alertController;
        this.f2747c = view;
        this.f2748e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.m479b(this.f2749m.f334w, this.f2747c, this.f2748e);
    }
}
