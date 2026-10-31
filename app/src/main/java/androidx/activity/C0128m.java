package androidx.activity;

import java.util.ListIterator;
import p023c6.InterfaceC0666l;
import p032d6.AbstractC0899g;
import p032d6.C0898f;
import p187x5.C2199c;
import p195y5.C2254b;

/* renamed from: androidx.activity.m */
/* loaded from: classes.dex */
public final class C0128m extends AbstractC0899g implements InterfaceC0666l<C0117b, C2199c> {

    /* renamed from: m */
    public final /* synthetic */ OnBackPressedDispatcher f242m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0128m(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(1);
        this.f242m = onBackPressedDispatcher;
    }

    @Override // p023c6.InterfaceC0666l
    /* renamed from: c */
    public final C2199c mo216c(C0117b c0117b) {
        AbstractC0127l abstractC0127l;
        C0898f.m2606e(c0117b, "backEvent");
        OnBackPressedDispatcher onBackPressedDispatcher = this.f242m;
        C2254b<AbstractC0127l> c2254b = onBackPressedDispatcher.f200c;
        ListIterator<AbstractC0127l> listIterator = c2254b.listIterator(c2254b.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC0127l = null;
                break;
            }
            abstractC0127l = listIterator.previous();
            if (abstractC0127l.f239a) {
                break;
            }
        }
        onBackPressedDispatcher.f201d = abstractC0127l;
        return C2199c.f9972a;
    }
}
