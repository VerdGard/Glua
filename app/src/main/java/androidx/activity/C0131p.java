package androidx.activity;

import java.util.ListIterator;
import p023c6.InterfaceC0655a;
import p032d6.AbstractC0899g;
import p187x5.C2199c;
import p195y5.C2254b;

/* renamed from: androidx.activity.p */
/* loaded from: classes.dex */
public final class C0131p extends AbstractC0899g implements InterfaceC0655a<C2199c> {

    /* renamed from: m */
    public final /* synthetic */ OnBackPressedDispatcher f245m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0131p(OnBackPressedDispatcher onBackPressedDispatcher) {
        super(0);
        this.f245m = onBackPressedDispatcher;
    }

    @Override // p023c6.InterfaceC0655a
    /* renamed from: a */
    public final C2199c mo373a() {
        AbstractC0127l abstractC0127l;
        OnBackPressedDispatcher onBackPressedDispatcher = this.f245m;
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
        onBackPressedDispatcher.f201d = null;
        return C2199c.f9972a;
    }
}
