package p036e2;

import java.util.Comparator;

/* renamed from: e2.n2 */
/* loaded from: classes.dex */
public final class C1050n2 implements Comparator<C0966b2> {
    @Override // java.util.Comparator
    public final int compare(C0966b2 c0966b2, C0966b2 c0966b22) {
        long j7 = c0966b2.f4959h - c0966b22.f4959h;
        if (j7 > 0) {
            return 1;
        }
        return j7 < 0 ? -1 : 0;
    }
}
