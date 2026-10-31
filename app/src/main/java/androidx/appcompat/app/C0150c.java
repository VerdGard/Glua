package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public final class C0150c implements AdapterView.OnItemClickListener {

    /* renamed from: c */
    public final /* synthetic */ AlertController.RecycleListView f370c;

    /* renamed from: e */
    public final /* synthetic */ AlertController f371e;

    /* renamed from: m */
    public final /* synthetic */ AlertController.C0145b f372m;

    public C0150c(AlertController.C0145b c0145b, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f372m = c0145b;
        this.f370c = recycleListView;
        this.f371e = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        AlertController.C0145b c0145b = this.f372m;
        boolean[] zArr = c0145b.f360t;
        AlertController.RecycleListView recycleListView = this.f370c;
        if (zArr != null) {
            zArr[i7] = recycleListView.isItemChecked(i7);
        }
        c0145b.f364x.onClick(this.f371e.f313b, i7, recycleListView.isItemChecked(i7));
    }
}
