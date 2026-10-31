package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: classes.dex */
public final class C0484r extends AbstractC0485s {
    public C0484r(RecyclerView.AbstractC0444m abstractC0444m) {
        super(abstractC0444m);
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: b */
    public final int mo1787b(View view) {
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        this.f2489a.getClass();
        return RecyclerView.AbstractC0444m.m1615z(view) + ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: c */
    public final int mo1788c(View view) {
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        this.f2489a.getClass();
        return RecyclerView.AbstractC0444m.m1607B(view) + ((ViewGroup.MarginLayoutParams) c0445n).topMargin + ((ViewGroup.MarginLayoutParams) c0445n).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: d */
    public final int mo1789d(View view) {
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        this.f2489a.getClass();
        Rect rect = ((RecyclerView.C0445n) view.getLayoutParams()).f2230b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0445n).leftMargin + ((ViewGroup.MarginLayoutParams) c0445n).rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: e */
    public final int mo1790e(View view) {
        RecyclerView.C0445n c0445n = (RecyclerView.C0445n) view.getLayoutParams();
        this.f2489a.getClass();
        return RecyclerView.AbstractC0444m.m1608C(view) - ((ViewGroup.MarginLayoutParams) c0445n).topMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: f */
    public final int mo1791f() {
        return this.f2489a.f2222o;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: g */
    public final int mo1792g() {
        RecyclerView.AbstractC0444m abstractC0444m = this.f2489a;
        return abstractC0444m.f2222o - abstractC0444m.m1619F();
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: h */
    public final int mo1793h() {
        return this.f2489a.m1619F();
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: i */
    public final int mo1794i() {
        return this.f2489a.f2220m;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: j */
    public final int mo1795j() {
        return this.f2489a.f2219l;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: k */
    public final int mo1796k() {
        return this.f2489a.m1622I();
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: l */
    public final int mo1797l() {
        RecyclerView.AbstractC0444m abstractC0444m = this.f2489a;
        return (abstractC0444m.f2222o - abstractC0444m.m1622I()) - abstractC0444m.m1619F();
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: m */
    public final int mo1798m(View view) {
        RecyclerView.AbstractC0444m abstractC0444m = this.f2489a;
        Rect rect = this.f2491c;
        abstractC0444m.m1623M(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: n */
    public final int mo1799n(View view) {
        RecyclerView.AbstractC0444m abstractC0444m = this.f2489a;
        Rect rect = this.f2491c;
        abstractC0444m.m1623M(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.AbstractC0485s
    /* renamed from: o */
    public final void mo1800o(int i7) {
        this.f2489a.mo1625R(i7);
    }
}
