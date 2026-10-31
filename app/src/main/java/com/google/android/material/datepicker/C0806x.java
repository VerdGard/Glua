package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C0791i;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.x */
/* loaded from: classes.dex */
public final class C0806x implements AdapterView.OnItemClickListener {

    /* renamed from: c */
    public final /* synthetic */ MaterialCalendarGridView f4229c;

    /* renamed from: e */
    public final /* synthetic */ C0807y f4230e;

    public C0806x(C0807y c0807y, MaterialCalendarGridView materialCalendarGridView) {
        this.f4230e = c0807y;
        this.f4229c = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        MaterialCalendarGridView materialCalendarGridView = this.f4229c;
        C0805w adapter = materialCalendarGridView.getAdapter();
        if (i7 >= adapter.m2439b() && i7 <= (adapter.m2439b() + adapter.f4225c.f4214X) + (-1)) {
            C0791i.e eVar = this.f4230e.f4234f;
            long longValue = materialCalendarGridView.getAdapter().getItem(i7).longValue();
            C0791i c0791i = C0791i.this;
            if (c0791i.f4151k2.f4109m.mo2408h(longValue)) {
                c0791i.f4150j2.m2412b();
                Iterator it = c0791i.f4118h2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0808z) it.next()).mo2434a(c0791i.f4150j2.m2419q());
                }
                c0791i.f4157q2.getAdapter().f2197a.m1591b();
                RecyclerView recyclerView = c0791i.f4156p2;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f2197a.m1591b();
                }
            }
        }
    }
}
