package androidx.activity;

import p023c6.InterfaceC0655a;
import p032d6.AbstractC0899g;
import p187x5.C2199c;

/* renamed from: androidx.activity.o */
/* loaded from: classes.dex */
public final class C0130o extends AbstractC0899g implements InterfaceC0655a<C2199c> {

    /* renamed from: m */
    public final /* synthetic */ OnBackPressedDispatcher f244m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130o(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(0);
        this.f244m = onBackPressedDispatcher;
    }

    @Override // p023c6.InterfaceC0655a
    /* renamed from: a */
    public final C2199c mo373a() {
        this.f244m.m361b();
        return C2199c.f9972a;
    }
}
