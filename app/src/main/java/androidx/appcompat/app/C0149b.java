package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public final class C0149b implements AdapterView.OnItemClickListener {

    /* renamed from: c */
    public final /* synthetic */ AlertController f368c;

    /* renamed from: e */
    public final /* synthetic */ AlertController.C0145b f369e;

    public C0149b(AlertController.C0145b c0145b, AlertController alertController) {
        this.f369e = c0145b;
        this.f368c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        AlertController.C0145b c0145b = this.f369e;
        DialogInterface.OnClickListener onClickListener = c0145b.f358r;
        AlertController alertController = this.f368c;
        onClickListener.onClick(alertController.f313b, i7);
        if (c0145b.f362v) {
            return;
        }
        alertController.f313b.dismiss();
    }
}
