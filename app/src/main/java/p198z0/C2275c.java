package p198z0;

import android.graphics.Rect;
import android.view.View;
import p034e0.C0935n0;
import p034e0.C0946x;
import p034e0.InterfaceC0938p;

/* renamed from: z0.c */
/* loaded from: classes.dex */
public final class C2275c implements InterfaceC0938p {

    /* renamed from: a */
    public final Rect f10439a = new Rect();

    /* renamed from: b */
    public final /* synthetic */ C2274b f10440b;

    public C2275c(C2274b c2274b) {
        this.f10440b = c2274b;
    }

    @Override // p034e0.InterfaceC0938p
    /* renamed from: a */
    public final C0935n0 mo133a(View view, C0935n0 c0935n0) {
        C0935n0 m2812m = C0946x.m2812m(view, c0935n0);
        if (m2812m.f4835a.mo2782m()) {
            return m2812m;
        }
        int m2752c = m2812m.m2752c();
        Rect rect = this.f10439a;
        rect.left = m2752c;
        rect.top = m2812m.m2754e();
        rect.right = m2812m.m2753d();
        rect.bottom = m2812m.m2751b();
        C2274b c2274b = this.f10440b;
        int childCount = c2274b.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            C0935n0 m2801b = C0946x.m2801b(c2274b.getChildAt(i7), m2812m);
            rect.left = Math.min(m2801b.m2752c(), rect.left);
            rect.top = Math.min(m2801b.m2754e(), rect.top);
            rect.right = Math.min(m2801b.m2753d(), rect.right);
            rect.bottom = Math.min(m2801b.m2751b(), rect.bottom);
        }
        return m2812m.m2755g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
