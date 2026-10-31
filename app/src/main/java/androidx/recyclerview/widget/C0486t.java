package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes.dex */
public final class C0486t extends C0481o {

    /* renamed from: q */
    public final /* synthetic */ C0487u f2492q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0486t(C0487u c0487u, Context context) {
        super(context);
        this.f2492q = c0487u;
    }

    @Override // androidx.recyclerview.widget.C0481o, androidx.recyclerview.widget.RecyclerView.AbstractC0454w
    /* renamed from: c */
    public final void mo1675c(View view, RecyclerView.AbstractC0454w.a aVar) {
        C0487u c0487u = this.f2492q;
        int[] mo1738a = c0487u.mo1738a(c0487u.f2348a.getLayoutManager(), view);
        int i7 = mo1738a[0];
        int i8 = mo1738a[1];
        int ceil = (int) Math.ceil(mo1786i(Math.max(Math.abs(i7), Math.abs(i8))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f2481j;
            aVar.f2257a = i7;
            aVar.f2258b = i8;
            aVar.f2259c = ceil;
            aVar.f2261e = decelerateInterpolator;
            aVar.f2262f = true;
        }
    }

    @Override // androidx.recyclerview.widget.C0481o
    /* renamed from: h */
    public final float mo1785h(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C0481o
    /* renamed from: i */
    public final int mo1786i(int i7) {
        return Math.min(100, super.mo1786i(i7));
    }
}
