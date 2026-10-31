package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.y */
/* loaded from: classes.dex */
public final class C0491y {
    /* renamed from: a */
    public static int m1816a(RecyclerView.C0455x c0455x, AbstractC0485s abstractC0485s, View view, View view2, RecyclerView.AbstractC0444m abstractC0444m, boolean z6) {
        if (abstractC0444m.m1643w() == 0 || c0455x.m1679b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(RecyclerView.AbstractC0444m.m1609J(view) - RecyclerView.AbstractC0444m.m1609J(view2)) + 1;
        }
        return Math.min(abstractC0485s.mo1797l(), abstractC0485s.mo1787b(view2) - abstractC0485s.mo1790e(view));
    }

    /* renamed from: b */
    public static int m1817b(RecyclerView.C0455x c0455x, AbstractC0485s abstractC0485s, View view, View view2, RecyclerView.AbstractC0444m abstractC0444m, boolean z6, boolean z7) {
        if (abstractC0444m.m1643w() == 0 || c0455x.m1679b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z7 ? Math.max(0, (c0455x.m1679b() - Math.max(RecyclerView.AbstractC0444m.m1609J(view), RecyclerView.AbstractC0444m.m1609J(view2))) - 1) : Math.max(0, Math.min(RecyclerView.AbstractC0444m.m1609J(view), RecyclerView.AbstractC0444m.m1609J(view2)));
        if (z6) {
            return Math.round((max * (Math.abs(abstractC0485s.mo1787b(view2) - abstractC0485s.mo1790e(view)) / (Math.abs(RecyclerView.AbstractC0444m.m1609J(view) - RecyclerView.AbstractC0444m.m1609J(view2)) + 1))) + (abstractC0485s.mo1796k() - abstractC0485s.mo1790e(view)));
        }
        return max;
    }

    /* renamed from: c */
    public static int m1818c(RecyclerView.C0455x c0455x, AbstractC0485s abstractC0485s, View view, View view2, RecyclerView.AbstractC0444m abstractC0444m, boolean z6) {
        if (abstractC0444m.m1643w() == 0 || c0455x.m1679b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return c0455x.m1679b();
        }
        return (int) (((abstractC0485s.mo1787b(view2) - abstractC0485s.mo1790e(view)) / (Math.abs(RecyclerView.AbstractC0444m.m1609J(view) - RecyclerView.AbstractC0444m.m1609J(view2)) + 1)) * c0455x.m1679b());
    }
}
