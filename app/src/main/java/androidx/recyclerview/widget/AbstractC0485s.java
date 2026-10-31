package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: classes.dex */
public abstract class AbstractC0485s {

    /* renamed from: a */
    public final RecyclerView.AbstractC0444m f2489a;

    /* renamed from: b */
    public int f2490b = Integer.MIN_VALUE;

    /* renamed from: c */
    public final Rect f2491c = new Rect();

    public AbstractC0485s(RecyclerView.AbstractC0444m abstractC0444m) {
        this.f2489a = abstractC0444m;
    }

    /* renamed from: a */
    public static AbstractC0485s m1801a(RecyclerView.AbstractC0444m abstractC0444m, int i7) {
        if (i7 == 0) {
            return new C0483q(abstractC0444m);
        }
        if (i7 == 1) {
            return new C0484r(abstractC0444m);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo1787b(View view);

    /* renamed from: c */
    public abstract int mo1788c(View view);

    /* renamed from: d */
    public abstract int mo1789d(View view);

    /* renamed from: e */
    public abstract int mo1790e(View view);

    /* renamed from: f */
    public abstract int mo1791f();

    /* renamed from: g */
    public abstract int mo1792g();

    /* renamed from: h */
    public abstract int mo1793h();

    /* renamed from: i */
    public abstract int mo1794i();

    /* renamed from: j */
    public abstract int mo1795j();

    /* renamed from: k */
    public abstract int mo1796k();

    /* renamed from: l */
    public abstract int mo1797l();

    /* renamed from: m */
    public abstract int mo1798m(View view);

    /* renamed from: n */
    public abstract int mo1799n(View view);

    /* renamed from: o */
    public abstract void mo1800o(int i7);
}
