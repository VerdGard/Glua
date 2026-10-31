package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.datepicker.C0791i;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0945w;
import p034e0.C0946x;

/* renamed from: com.google.android.material.datepicker.y */
/* loaded from: classes.dex */
public final class C0807y extends RecyclerView.AbstractC0436e<a> {

    /* renamed from: c */
    public final C0776a f4231c;

    /* renamed from: d */
    public final InterfaceC0782d<?> f4232d;

    /* renamed from: e */
    public final AbstractC0786f f4233e;

    /* renamed from: f */
    public final C0791i.e f4234f;

    /* renamed from: g */
    public final int f4235g;

    /* renamed from: com.google.android.material.datepicker.y$a */
    public static class a extends RecyclerView.AbstractC0432a0 {

        /* renamed from: t */
        public final TextView f4236t;

        /* renamed from: u */
        public final MaterialCalendarGridView f4237u;

        public a(LinearLayout linearLayout, boolean z6) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R$id.month_title);
            this.f4236t = textView;
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            new C0945w(androidx.core.R$id.tag_accessibility_heading).m2823e(textView, Boolean.TRUE);
            this.f4237u = (MaterialCalendarGridView) linearLayout.findViewById(R$id.month_grid);
            if (z6) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C0807y(ContextThemeWrapper contextThemeWrapper, InterfaceC0782d interfaceC0782d, C0776a c0776a, AbstractC0786f abstractC0786f, C0791i.d dVar) {
        Calendar calendar = c0776a.f4107c.f4217c;
        C0804v c0804v = c0776a.f4110s;
        if (calendar.compareTo(c0804v.f4217c) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0804v.f4217c.compareTo(c0776a.f4108e.f4217c) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i7 = C0805w.f4221Z;
        int i8 = C0791i.f4148v2;
        Resources resources = contextThemeWrapper.getResources();
        int i9 = R$dimen.mtrl_calendar_day_height;
        this.f4235g = (resources.getDimensionPixelSize(i9) * i7) + (C0800r.m2430T(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(i9) : 0);
        this.f4231c = c0776a;
        this.f4232d = interfaceC0782d;
        this.f4233e = abstractC0786f;
        this.f4234f = dVar;
        if (this.f2197a.m1590a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f2198b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: a */
    public final int mo1583a() {
        return this.f4231c.f4106Z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: b */
    public final long mo1584b(int i7) {
        Calendar m2423c = C0785e0.m2423c(this.f4231c.f4107c.f4217c);
        m2423c.add(2, i7);
        return new C0804v(m2423c).f4217c.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: d */
    public final void mo1586d(a aVar, int i7) {
        a aVar2 = aVar;
        C0776a c0776a = this.f4231c;
        Calendar m2423c = C0785e0.m2423c(c0776a.f4107c.f4217c);
        m2423c.add(2, i7);
        C0804v c0804v = new C0804v(m2423c);
        aVar2.f4236t.setText(c0804v.m2438d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f4237u.findViewById(R$id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !c0804v.equals(materialCalendarGridView.getAdapter().f4225c)) {
            C0805w c0805w = new C0805w(c0804v, this.f4232d, c0776a, this.f4233e);
            materialCalendarGridView.setNumColumns(c0804v.f4220s);
            materialCalendarGridView.setAdapter((ListAdapter) c0805w);
        } else {
            materialCalendarGridView.invalidate();
            C0805w adapter = materialCalendarGridView.getAdapter();
            Iterator<Long> it = adapter.f4227m.iterator();
            while (it.hasNext()) {
                adapter.m2442e(materialCalendarGridView, it.next().longValue());
            }
            InterfaceC0782d<?> interfaceC0782d = adapter.f4226e;
            if (interfaceC0782d != null) {
                Iterator<Long> it2 = interfaceC0782d.m2418o().iterator();
                while (it2.hasNext()) {
                    adapter.m2442e(materialCalendarGridView, it2.next().longValue());
                }
                adapter.f4227m = interfaceC0782d.m2418o();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C0806x(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0436e
    /* renamed from: f */
    public final RecyclerView.AbstractC0432a0 mo1588f(RecyclerView recyclerView, int i7) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R$layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (!C0800r.m2430T(recyclerView.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0445n(-1, this.f4235g));
        return new a(linearLayout, true);
    }
}
