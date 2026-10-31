package p005a4;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p034e0.C0935n0;
import p034e0.InterfaceC0938p;

/* renamed from: a4.d */
/* loaded from: classes.dex */
public final class C0045d implements InterfaceC0938p {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f130a;

    public C0045d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f130a = baseTransientBottomBar;
    }

    @Override // p034e0.InterfaceC0938p
    /* renamed from: a */
    public final C0935n0 mo133a(View view, C0935n0 c0935n0) {
        int m2751b = c0935n0.m2751b();
        BaseTransientBottomBar baseTransientBottomBar = this.f130a;
        baseTransientBottomBar.f4415m = m2751b;
        baseTransientBottomBar.f4416n = c0935n0.m2752c();
        baseTransientBottomBar.f4417o = c0935n0.m2753d();
        baseTransientBottomBar.m2494f();
        return c0935n0;
    }
}
