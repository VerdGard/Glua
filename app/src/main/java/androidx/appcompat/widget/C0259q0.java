package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
public final class C0259q0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: c */
    public final /* synthetic */ C0262r0 f1053c;

    public C0259q0(C0262r0 c0262r0) {
        this.f1053c = c0262r0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
        C0247m0 c0247m0;
        if (i7 == -1 || (c0247m0 = this.f1053c.f1077m) == null) {
            return;
        }
        c0247m0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
