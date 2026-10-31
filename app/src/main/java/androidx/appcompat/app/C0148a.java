package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public final class C0148a extends ArrayAdapter<CharSequence> {

    /* renamed from: c */
    public final /* synthetic */ AlertController.RecycleListView f366c;

    /* renamed from: e */
    public final /* synthetic */ AlertController.C0145b f367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148a(AlertController.C0145b c0145b, Context context, int i7, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i7, android.R.id.text1, charSequenceArr);
        this.f367e = c0145b;
        this.f366c = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i7, view, viewGroup);
        boolean[] zArr = this.f367e.f360t;
        if (zArr != null && zArr[i7]) {
            this.f366c.setItemChecked(i7, true);
        }
        return view2;
    }
}
