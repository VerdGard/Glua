package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import p026d0.C0875c;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C0793k extends RecyclerView.AbstractC0443l {

    /* renamed from: a */
    public final Calendar f4167a = C0785e0.m2425e(null);

    /* renamed from: b */
    public final Calendar f4168b = C0785e0.m2425e(null);

    /* renamed from: c */
    public final /* synthetic */ C0791i f4169c;

    public C0793k(C0791i c0791i) {
        this.f4169c = c0791i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0443l
    /* renamed from: d */
    public final void mo1605d(Canvas canvas, RecyclerView recyclerView) {
        Long l7;
        if ((recyclerView.getAdapter() instanceof C0789g0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C0789g0 c0789g0 = (C0789g0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            C0791i c0791i = this.f4169c;
            for (C0875c<Long, Long> c0875c : c0791i.f4150j2.m2415g()) {
                Long l8 = c0875c.f4643a;
                if (l8 != null && (l7 = c0875c.f4644b) != null) {
                    long longValue = l8.longValue();
                    Calendar calendar = this.f4167a;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = l7.longValue();
                    Calendar calendar2 = this.f4168b;
                    calendar2.setTimeInMillis(longValue2);
                    int i7 = calendar.get(1) - c0789g0.f4144c.f4151k2.f4107c.f4219m;
                    int i8 = calendar2.get(1) - c0789g0.f4144c.f4151k2.f4107c.f4219m;
                    View mo1504r = gridLayoutManager.mo1504r(i7);
                    View mo1504r2 = gridLayoutManager.mo1504r(i8);
                    int i9 = gridLayoutManager.f2050F;
                    int i10 = i7 / i9;
                    int i11 = i8 / i9;
                    int i12 = i10;
                    while (i12 <= i11) {
                        if (gridLayoutManager.mo1504r(gridLayoutManager.f2050F * i12) != null) {
                            canvas.drawRect((i12 != i10 || mo1504r == null) ? 0 : (mo1504r.getWidth() / 2) + mo1504r.getLeft(), r10.getTop() + c0791i.f4155o2.f4128d.f4119a.top, (i12 != i11 || mo1504r2 == null) ? recyclerView.getWidth() : (mo1504r2.getWidth() / 2) + mo1504r2.getLeft(), r10.getBottom() - c0791i.f4155o2.f4128d.f4119a.bottom, c0791i.f4155o2.f4132h);
                        }
                        i12++;
                    }
                }
            }
        }
    }
}
