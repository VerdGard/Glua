package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.AbstractC0465a0;
import androidx.recyclerview.widget.C0487u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C0800r;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p034e0.C0908a;
import p034e0.C0946x;
import p042f0.C1151g;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public final class C0791i<S> extends AbstractC0777a0<S> {

    /* renamed from: v2 */
    public static final /* synthetic */ int f4148v2 = 0;

    /* renamed from: i2 */
    public int f4149i2;

    /* renamed from: j2 */
    public InterfaceC0782d<S> f4150j2;

    /* renamed from: k2 */
    public C0776a f4151k2;

    /* renamed from: l2 */
    public AbstractC0786f f4152l2;

    /* renamed from: m2 */
    public C0804v f4153m2;

    /* renamed from: n2 */
    public int f4154n2;

    /* renamed from: o2 */
    public C0780c f4155o2;

    /* renamed from: p2 */
    public RecyclerView f4156p2;

    /* renamed from: q2 */
    public RecyclerView f4157q2;

    /* renamed from: r2 */
    public View f4158r2;

    /* renamed from: s2 */
    public View f4159s2;

    /* renamed from: t2 */
    public View f4160t2;

    /* renamed from: u2 */
    public View f4161u2;

    /* renamed from: com.google.android.material.datepicker.i$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f4162c;

        public a(int i7) {
            this.f4162c = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = C0791i.this.f4157q2;
            if (recyclerView.f2128N1) {
                return;
            }
            RecyclerView.AbstractC0444m abstractC0444m = recyclerView.f2114E1;
            if (abstractC0444m == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                abstractC0444m.mo1506y0(recyclerView, this.f4162c);
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    public class b extends C0908a {
        @Override // p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
            AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$c */
    public class c extends C0781c0 {

        /* renamed from: E */
        public final /* synthetic */ int f4164E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i7, int i8) {
            super(i7);
            this.f4164E = i8;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: B0 */
        public final void mo1464B0(RecyclerView.C0455x c0455x, int[] iArr) {
            int i7 = this.f4164E;
            C0791i c0791i = C0791i.this;
            if (i7 == 0) {
                iArr[0] = c0791i.f4157q2.getWidth();
                iArr[1] = c0791i.f4157q2.getWidth();
            } else {
                iArr[0] = c0791i.f4157q2.getHeight();
                iArr[1] = c0791i.f4157q2.getHeight();
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$d */
    public class d implements e {
        public d() {
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$e */
    public interface e {
    }

    @Override // com.google.android.material.datepicker.AbstractC0777a0
    /* renamed from: O */
    public final boolean mo2409O(C0800r.c cVar) {
        return super.mo2409O(cVar);
    }

    /* renamed from: P */
    public final void m2426P(int i7) {
        this.f4157q2.post(new a(i7));
    }

    /* renamed from: Q */
    public final void m2427Q(C0804v c0804v) {
        RecyclerView recyclerView;
        int i7;
        C0804v c0804v2 = ((C0807y) this.f4157q2.getAdapter()).f4231c.f4107c;
        Calendar calendar = c0804v2.f4217c;
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i8 = c0804v.f4219m;
        int i9 = c0804v2.f4219m;
        int i10 = c0804v.f4218e;
        int i11 = c0804v2.f4218e;
        int i12 = (i10 - i11) + ((i8 - i9) * 12);
        C0804v c0804v3 = this.f4153m2;
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i13 = i12 - ((c0804v3.f4218e - i11) + ((c0804v3.f4219m - i9) * 12));
        boolean z6 = Math.abs(i13) > 3;
        boolean z7 = i13 > 0;
        this.f4153m2 = c0804v;
        if (!z6 || !z7) {
            if (z6) {
                recyclerView = this.f4157q2;
                i7 = i12 + 3;
            }
            m2426P(i12);
        }
        recyclerView = this.f4157q2;
        i7 = i12 - 3;
        recyclerView.m1542Z(i7);
        m2426P(i12);
    }

    /* renamed from: R */
    public final void m2428R(int i7) {
        this.f4154n2 = i7;
        if (i7 == 2) {
            this.f4156p2.getLayoutManager().mo1503o0(this.f4153m2.f4219m - ((C0789g0) this.f4156p2.getAdapter()).f4144c.f4151k2.f4107c.f4219m);
            this.f4160t2.setVisibility(0);
            this.f4161u2.setVisibility(8);
            this.f4158r2.setVisibility(8);
            this.f4159s2.setVisibility(8);
            return;
        }
        if (i7 == 1) {
            this.f4160t2.setVisibility(8);
            this.f4161u2.setVisibility(0);
            this.f4158r2.setVisibility(0);
            this.f4159s2.setVisibility(0);
            m2427Q(this.f4153m2);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: t */
    public final void mo1215t(Bundle bundle) {
        super.mo1215t(bundle);
        if (bundle == null) {
            bundle = this.f1800Z;
        }
        this.f4149i2 = bundle.getInt("THEME_RES_ID_KEY");
        this.f4150j2 = (InterfaceC0782d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f4151k2 = (C0776a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f4152l2 = (AbstractC0786f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f4153m2 = (C0804v) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: u */
    public final View mo1245u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7;
        int i8;
        C0487u c0487u;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1237i(), this.f4149i2);
        this.f4155o2 = new C0780c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0804v c0804v = this.f4151k2.f4107c;
        if (C0800r.m2430T(contextThemeWrapper)) {
            i7 = R$layout.mtrl_calendar_vertical;
            i8 = 1;
        } else {
            i7 = R$layout.mtrl_calendar_horizontal;
            i8 = 0;
        }
        View inflate = cloneInContext.inflate(i7, viewGroup, false);
        Resources resources = m1228I().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R$dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_days_of_week_height);
        int i9 = C0805w.f4221Z;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_vertical_padding) * (i9 - 1)) + (resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * i9) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R$id.mtrl_calendar_days_of_week);
        C0946x.m2817r(gridView, new b());
        int i10 = this.f4151k2.f4104X;
        gridView.setAdapter((ListAdapter) (i10 > 0 ? new C0788g(i10) : new C0788g()));
        gridView.setNumColumns(c0804v.f4220s);
        gridView.setEnabled(false);
        this.f4157q2 = (RecyclerView) inflate.findViewById(R$id.mtrl_calendar_months);
        m1237i();
        this.f4157q2.setLayoutManager(new c(i8, i8));
        this.f4157q2.setTag("MONTHS_VIEW_GROUP_TAG");
        C0807y c0807y = new C0807y(contextThemeWrapper, this.f4150j2, this.f4151k2, this.f4152l2, new d());
        this.f4157q2.setAdapter(c0807y);
        int integer = contextThemeWrapper.getResources().getInteger(R$integer.mtrl_calendar_year_selector_span);
        int i11 = R$id.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(i11);
        this.f4156p2 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f4156p2.setLayoutManager(new GridLayoutManager(integer));
            this.f4156p2.setAdapter(new C0789g0(this));
            this.f4156p2.m1548g(new C0793k(this));
        }
        int i12 = R$id.month_navigation_fragment_toggle;
        if (inflate.findViewById(i12) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i12);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C0946x.m2817r(materialButton, new C0794l(this));
            View findViewById = inflate.findViewById(R$id.month_navigation_previous);
            this.f4158r2 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R$id.month_navigation_next);
            this.f4159s2 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f4160t2 = inflate.findViewById(i11);
            this.f4161u2 = inflate.findViewById(R$id.mtrl_calendar_day_selector_frame);
            m2428R(1);
            materialButton.setText(this.f4153m2.m2438d());
            this.f4157q2.m1549h(new C0795m(this, c0807y, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0796n(this));
            this.f4159s2.setOnClickListener(new ViewOnClickListenerC0797o(this, c0807y));
            this.f4158r2.setOnClickListener(new ViewOnClickListenerC0790h(this, c0807y));
        }
        if (!C0800r.m2430T(contextThemeWrapper) && (recyclerView2 = (c0487u = new C0487u()).f2348a) != (recyclerView = this.f4157q2)) {
            AbstractC0465a0.a aVar = c0487u.f2349b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f2166v2;
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                c0487u.f2348a.setOnFlingListener(null);
            }
            c0487u.f2348a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0487u.f2348a.m1549h(aVar);
                c0487u.f2348a.setOnFlingListener(c0487u);
                new Scroller(c0487u.f2348a.getContext(), new DecelerateInterpolator());
                c0487u.m1739b();
            }
        }
        RecyclerView recyclerView4 = this.f4157q2;
        C0804v c0804v2 = this.f4153m2;
        C0804v c0804v3 = c0807y.f4231c.f4107c;
        if (!(c0804v3.f4217c instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        recyclerView4.m1542Z((c0804v2.f4218e - c0804v3.f4218e) + ((c0804v2.f4219m - c0804v3.f4219m) * 12));
        C0946x.m2817r(this.f4157q2, new C0792j());
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0361n
    /* renamed from: y */
    public final void mo1219y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f4149i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f4150j2);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f4151k2);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f4152l2);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f4153m2);
    }
}
