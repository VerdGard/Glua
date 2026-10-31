package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p034e0.C0908a;
import p042f0.C1151g;
import p042f0.C1152h;

/* renamed from: androidx.recyclerview.widget.x */
/* loaded from: classes.dex */
public class C0490x extends C0908a {

    /* renamed from: d */
    public final RecyclerView f2497d;

    /* renamed from: e */
    public final a f2498e;

    /* renamed from: androidx.recyclerview.widget.x$a */
    public static class a extends C0908a {

        /* renamed from: d */
        public final C0490x f2499d;

        /* renamed from: e */
        public final WeakHashMap f2500e = new WeakHashMap();

        public a(C0490x c0490x) {
            this.f2499d = c0490x;
        }

        @Override // p034e0.C0908a
        /* renamed from: a */
        public final boolean mo1054a(View view, AccessibilityEvent accessibilityEvent) {
            C0908a c0908a = (C0908a) this.f2500e.get(view);
            return c0908a != null ? c0908a.mo1054a(view, accessibilityEvent) : super.mo1054a(view, accessibilityEvent);
        }

        @Override // p034e0.C0908a
        /* renamed from: b */
        public final C1152h mo1812b(View view) {
            C0908a c0908a = (C0908a) this.f2500e.get(view);
            return c0908a != null ? c0908a.mo1812b(view) : super.mo1812b(view);
        }

        @Override // p034e0.C0908a
        /* renamed from: c */
        public final void mo1026c(View view, AccessibilityEvent accessibilityEvent) {
            C0908a c0908a = (C0908a) this.f2500e.get(view);
            if (c0908a != null) {
                c0908a.mo1026c(view, accessibilityEvent);
            } else {
                super.mo1026c(view, accessibilityEvent);
            }
        }

        @Override // p034e0.C0908a
        /* renamed from: d */
        public final void mo134d(View view, C1151g c1151g) {
            C0490x c0490x = this.f2499d;
            RecyclerView recyclerView = c0490x.f2497d;
            if (!(!recyclerView.f2125K1 || recyclerView.f2133S1 || recyclerView.f2162s.m1731g())) {
                RecyclerView recyclerView2 = c0490x.f2497d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().m1626V(view, c1151g);
                    C0908a c0908a = (C0908a) this.f2500e.get(view);
                    if (c0908a != null) {
                        c0908a.mo134d(view, c1151g);
                        return;
                    }
                }
            }
            this.f4774a.onInitializeAccessibilityNodeInfo(view, c1151g.f5685a);
        }

        @Override // p034e0.C0908a
        /* renamed from: e */
        public final void mo1813e(View view, AccessibilityEvent accessibilityEvent) {
            C0908a c0908a = (C0908a) this.f2500e.get(view);
            if (c0908a != null) {
                c0908a.mo1813e(view, accessibilityEvent);
            } else {
                super.mo1813e(view, accessibilityEvent);
            }
        }

        @Override // p034e0.C0908a
        /* renamed from: f */
        public final boolean mo1055f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0908a c0908a = (C0908a) this.f2500e.get(viewGroup);
            return c0908a != null ? c0908a.mo1055f(viewGroup, view, accessibilityEvent) : super.mo1055f(viewGroup, view, accessibilityEvent);
        }

        @Override // p034e0.C0908a
        /* renamed from: g */
        public final boolean mo135g(View view, int i7, Bundle bundle) {
            C0490x c0490x = this.f2499d;
            RecyclerView recyclerView = c0490x.f2497d;
            if (!(!recyclerView.f2125K1 || recyclerView.f2133S1 || recyclerView.f2162s.m1731g())) {
                RecyclerView recyclerView2 = c0490x.f2497d;
                if (recyclerView2.getLayoutManager() != null) {
                    C0908a c0908a = (C0908a) this.f2500e.get(view);
                    if (c0908a != null) {
                        if (c0908a.mo135g(view, i7, bundle)) {
                            return true;
                        }
                    } else if (super.mo135g(view, i7, bundle)) {
                        return true;
                    }
                    RecyclerView.C0450s c0450s = recyclerView2.getLayoutManager().f2209b.f2146e;
                    return false;
                }
            }
            return super.mo135g(view, i7, bundle);
        }

        @Override // p034e0.C0908a
        /* renamed from: h */
        public final void mo1814h(View view, int i7) {
            C0908a c0908a = (C0908a) this.f2500e.get(view);
            if (c0908a != null) {
                c0908a.mo1814h(view, i7);
            } else {
                super.mo1814h(view, i7);
            }
        }

        @Override // p034e0.C0908a
        /* renamed from: i */
        public final void mo1815i(View view, AccessibilityEvent accessibilityEvent) {
            C0908a c0908a = (C0908a) this.f2500e.get(view);
            if (c0908a != null) {
                c0908a.mo1815i(view, accessibilityEvent);
            } else {
                super.mo1815i(view, accessibilityEvent);
            }
        }
    }

    public C0490x(RecyclerView recyclerView) {
        this.f2497d = recyclerView;
        a aVar = this.f2498e;
        this.f2498e = aVar == null ? new a(this) : aVar;
    }

    @Override // p034e0.C0908a
    /* renamed from: c */
    public final void mo1026c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1026c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f2497d;
            if (!recyclerView.f2125K1 || recyclerView.f2133S1 || recyclerView.f2162s.m1731g()) {
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) view;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().mo1483U(accessibilityEvent);
            }
        }
    }

    @Override // p034e0.C0908a
    /* renamed from: d */
    public void mo134d(View view, C1151g c1151g) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4774a;
        AccessibilityNodeInfo accessibilityNodeInfo = c1151g.f5685a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f2497d;
        if ((!recyclerView.f2125K1 || recyclerView.f2133S1 || recyclerView.f2162s.m1731g()) || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.AbstractC0444m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2209b;
        RecyclerView.C0450s c0450s = recyclerView2.f2146e;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f2209b.canScrollHorizontally(-1)) {
            c1151g.m3336a(8192);
            c1151g.m3345j(true);
        }
        if (layoutManager.f2209b.canScrollVertically(1) || layoutManager.f2209b.canScrollHorizontally(1)) {
            c1151g.m3336a(4096);
            c1151g.m3345j(true);
        }
        RecyclerView.C0455x c0455x = recyclerView2.f2164t2;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo1428L(c0450s, c0455x), layoutManager.mo1461y(c0450s, c0455x), false, 0));
    }

    @Override // p034e0.C0908a
    /* renamed from: g */
    public final boolean mo135g(View view, int i7, Bundle bundle) {
        int m1622I;
        int m1620G;
        if (super.mo135g(view, i7, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2497d;
        if ((!recyclerView.f2125K1 || recyclerView.f2133S1 || recyclerView.f2162s.m1731g()) || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.AbstractC0444m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f2209b;
        RecyclerView.C0450s c0450s = recyclerView2.f2146e;
        if (i7 == 4096) {
            m1622I = recyclerView2.canScrollVertically(1) ? (layoutManager.f2222o - layoutManager.m1622I()) - layoutManager.m1619F() : 0;
            if (layoutManager.f2209b.canScrollHorizontally(1)) {
                m1620G = (layoutManager.f2221n - layoutManager.m1620G()) - layoutManager.m1621H();
            }
            m1620G = 0;
        } else if (i7 != 8192) {
            m1620G = 0;
            m1622I = 0;
        } else {
            m1622I = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f2222o - layoutManager.m1622I()) - layoutManager.m1619F()) : 0;
            if (layoutManager.f2209b.canScrollHorizontally(-1)) {
                m1620G = -((layoutManager.f2221n - layoutManager.m1620G()) - layoutManager.m1621H());
            }
            m1620G = 0;
        }
        if (m1622I == 0 && m1620G == 0) {
            return false;
        }
        layoutManager.f2209b.m1543a0(m1620G, m1622I, true);
        return true;
    }
}
