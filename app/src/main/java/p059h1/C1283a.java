package p059h1;

import p018c1.AbstractC0580a;
import p018c1.C0582c;

/* renamed from: h1.a */
/* loaded from: classes.dex */
public final class C1283a implements AbstractC0580a.a {

    /* renamed from: a */
    public final /* synthetic */ C0582c f6359a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1284b f6360b;

    public C1283a(AbstractC1284b abstractC1284b, C0582c c0582c) {
        this.f6360b = abstractC1284b;
        this.f6359a = c0582c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        boolean z6 = ((Float) this.f6359a.mo2030e()).floatValue() == 1.0f;
        AbstractC1284b abstractC1284b = this.f6360b;
        if (z6 != abstractC1284b.f6381u) {
            abstractC1284b.f6381u = z6;
            abstractC1284b.f6373m.invalidateSelf();
        }
    }
}
