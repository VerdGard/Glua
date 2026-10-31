package p171v4;

import java.util.Collections;
import java.util.Comparator;
import p055g5.C1245b;

/* renamed from: v4.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2023g implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f9189c;

    /* renamed from: e */
    public final /* synthetic */ Object f9190e;

    /* renamed from: m */
    public final /* synthetic */ Object f9191m;

    public /* synthetic */ RunnableC2023g(Object obj, int i7, Object obj2) {
        this.f9189c = i7;
        this.f9190e = obj;
        this.f9191m = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f9189c;
        Object obj = this.f9191m;
        Object obj2 = this.f9190e;
        switch (i7) {
            case 0:
                C2024h c2024h = (C2024h) obj2;
                Comparator comparator = (Comparator) obj;
                if (!c2024h.f9200i) {
                    Collections.sort(c2024h.f9192a, comparator);
                    c2024h.f9196e.run();
                    break;
                }
                break;
            default:
                int i8 = C1245b.f5985n3;
                ((C1245b) obj2).getClass();
                ((Runnable) obj).run();
                break;
        }
    }
}
