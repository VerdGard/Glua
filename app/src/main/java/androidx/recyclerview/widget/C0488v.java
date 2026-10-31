package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C0466b;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.v */
/* loaded from: classes.dex */
public final class C0488v implements C0466b.b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f2495a;

    public C0488v(RecyclerView recyclerView) {
        this.f2495a = recyclerView;
    }

    /* renamed from: a */
    public final int m1805a() {
        return this.f2495a.getChildCount();
    }

    /* renamed from: b */
    public final void m1806b(int i7) {
        RecyclerView recyclerView = this.f2495a;
        View childAt = recyclerView.getChildAt(i7);
        if (childAt != null) {
            RecyclerView.m1513I(childAt);
            RecyclerView.AbstractC0436e abstractC0436e = recyclerView.f2112D1;
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i7);
    }
}
