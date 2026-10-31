package p131q3;

import android.view.View;
import p034e0.C0908a;
import p042f0.C1151g;
import p131q3.C1753i;

/* renamed from: q3.j */
/* loaded from: classes.dex */
public final class C1754j extends C0908a {

    /* renamed from: d */
    public final /* synthetic */ int f8081d;

    /* renamed from: e */
    public final /* synthetic */ boolean f8082e;

    /* renamed from: f */
    public final /* synthetic */ C1753i.c f8083f;

    public C1754j(C1753i.c cVar, int i7, boolean z6) {
        this.f8083f = cVar;
        this.f8081d = i7;
        this.f8082e = z6;
    }

    @Override // p034e0.C0908a
    /* renamed from: d */
    public final void mo134d(View view, C1151g c1151g) {
        this.f4774a.onInitializeAccessibilityNodeInfo(view, c1151g.f5685a);
        int i7 = this.f8081d;
        int i8 = 0;
        int i9 = i7;
        while (true) {
            C1753i.c cVar = this.f8083f;
            if (i8 >= i7) {
                cVar.getClass();
                c1151g.m3343h(C1151g.b.m3349a(i9, 1, 1, 1, this.f8082e, view.isSelected()));
                return;
            } else {
                C1753i c1753i = C1753i.this;
                if (c1753i.f8060X.mo1585c(i8) == 2 || c1753i.f8060X.mo1585c(i8) == 3) {
                    i9--;
                }
                i8++;
            }
        }
    }
}
