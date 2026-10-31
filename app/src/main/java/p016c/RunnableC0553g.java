package p016c;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* renamed from: c.g */
/* loaded from: classes.dex */
public final class RunnableC0553g implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ View f2787c;

    /* renamed from: e */
    public final /* synthetic */ View f2788e;

    /* renamed from: m */
    public final /* synthetic */ AlertController f2789m;

    public RunnableC0553g(AlertController alertController, View view, View view2) {
        this.f2789m = alertController;
        this.f2787c = view;
        this.f2788e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.m479b(this.f2789m.f318g, this.f2787c, this.f2788e);
    }
}
