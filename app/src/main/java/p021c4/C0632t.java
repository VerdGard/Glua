package p021c4;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.C0262r0;

/* renamed from: c4.t */
/* loaded from: classes.dex */
public final class C0632t implements AdapterView.OnItemClickListener {

    /* renamed from: c */
    public final /* synthetic */ C0633u f3109c;

    public C0632t(C0633u c0633u) {
        this.f3109c = c0633u;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        Object item;
        C0633u c0633u = this.f3109c;
        if (i7 < 0) {
            C0262r0 c0262r0 = c0633u.f3114w1;
            item = !c0262r0.mo502c() ? null : c0262r0.f1077m.getSelectedItem();
        } else {
            item = c0633u.getAdapter().getItem(i7);
        }
        C0633u.m2091a(c0633u, item);
        AdapterView.OnItemClickListener onItemClickListener = c0633u.getOnItemClickListener();
        C0262r0 c0262r02 = c0633u.f3114w1;
        if (onItemClickListener != null) {
            if (view == null || i7 < 0) {
                view = c0262r02.mo502c() ? c0262r02.f1077m.getSelectedView() : null;
                i7 = !c0262r02.mo502c() ? -1 : c0262r02.f1077m.getSelectedItemPosition();
                j7 = !c0262r02.mo502c() ? Long.MIN_VALUE : c0262r02.f1077m.getSelectedItemId();
            }
            onItemClickListener.onItemClick(c0262r02.f1077m, view, i7, j7);
        }
        c0262r02.dismiss();
    }
}
