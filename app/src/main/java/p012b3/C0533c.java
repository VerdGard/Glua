package p012b3;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import p026d0.C0874b;
import p034e0.C0923h0;
import p034e0.C0935n0;
import p034e0.C0946x;
import p034e0.InterfaceC0938p;

/* renamed from: b3.c */
/* loaded from: classes.dex */
public final class C0533c implements InterfaceC0938p {

    /* renamed from: a */
    public final /* synthetic */ AppBarLayout f2672a;

    public C0533c(AppBarLayout appBarLayout) {
        this.f2672a = appBarLayout;
    }

    @Override // p034e0.InterfaceC0938p
    /* renamed from: a */
    public final C0935n0 mo133a(View view, C0935n0 c0935n0) {
        AppBarLayout appBarLayout = this.f2672a;
        appBarLayout.getClass();
        WeakHashMap<View, C0923h0> weakHashMap = C0946x.f4876a;
        C0935n0 c0935n02 = C0946x.d.m2826b(appBarLayout) ? c0935n0 : null;
        if (!C0874b.m2562a(appBarLayout.f3775y1, c0935n02)) {
            appBarLayout.f3775y1 = c0935n02;
            appBarLayout.setWillNotDraw(!(appBarLayout.f3766M1 != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return c0935n0;
    }
}
