package androidx.appcompat.widget;

import android.view.View;
import p002a1.C0017d;

/* renamed from: androidx.appcompat.widget.j1 */
/* loaded from: classes.dex */
public final class C0239j1 extends C0017d {

    /* renamed from: w */
    public boolean f934w = false;

    /* renamed from: x */
    public final /* synthetic */ int f935x;

    /* renamed from: y */
    public final /* synthetic */ C0242k1 f936y;

    public C0239j1(C0242k1 c0242k1, int i7) {
        this.f936y = c0242k1;
        this.f935x = i7;
    }

    @Override // p034e0.InterfaceC0925i0
    /* renamed from: a */
    public final void mo651a() {
        if (this.f934w) {
            return;
        }
        this.f936y.f946a.setVisibility(this.f935x);
    }

    @Override // p002a1.C0017d, p034e0.InterfaceC0925i0
    /* renamed from: b */
    public final void mo104b(View view) {
        this.f934w = true;
    }

    @Override // p002a1.C0017d, p034e0.InterfaceC0925i0
    /* renamed from: f */
    public final void mo108f() {
        this.f936y.f946a.setVisibility(0);
    }
}
