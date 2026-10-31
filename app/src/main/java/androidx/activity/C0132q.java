package androidx.activity;

import p023c6.InterfaceC0655a;
import p032d6.AbstractC0899g;
import p187x5.C2199c;

/* renamed from: androidx.activity.q */
/* loaded from: classes.dex */
public final class C0132q extends AbstractC0899g implements InterfaceC0655a<C2199c> {

    /* renamed from: m */
    public final /* synthetic */ OnBackPressedDispatcher f246m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0132q(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(0);
        this.f246m = onBackPressedDispatcher;
    }

    @Override // p023c6.InterfaceC0655a
    /* renamed from: a */
    public final C2199c mo373a() {
        this.f246m.m361b();
        return C2199c.f9972a;
    }
}
