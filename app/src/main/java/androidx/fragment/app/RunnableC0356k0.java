package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p034e0.C0923h0;
import p034e0.C0946x;

/* renamed from: androidx.fragment.app.k0 */
/* loaded from: classes.dex */
public final class RunnableC0356k0 implements Runnable {

    /* renamed from: X */
    public final /* synthetic */ ArrayList f1734X;

    /* renamed from: c */
    public final /* synthetic */ int f1735c;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f1736e;

    /* renamed from: m */
    public final /* synthetic */ ArrayList f1737m;

    /* renamed from: s */
    public final /* synthetic */ ArrayList f1738s;

    public RunnableC0356k0(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1735c = i7;
        this.f1736e = arrayList;
        this.f1737m = arrayList2;
        this.f1738s = arrayList3;
        this.f1734X = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i7 = 0; i7 < this.f1735c; i7++) {
            View view = (View) this.f1736e.get(i7);
            String str = (String) this.f1737m.get(i7);
            WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
            C0946x.i.m2889v(view, str);
            C0946x.i.m2889v((View) this.f1738s.get(i7), (String) this.f1734X.get(i7));
        }
    }
}
