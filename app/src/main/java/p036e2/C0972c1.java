package p036e2;

import java.util.Comparator;

/* renamed from: e2.c1 */
/* loaded from: classes.dex */
public final class C0972c1 implements Comparator<C1055o0> {
    @Override // java.util.Comparator
    public final int compare(C1055o0 c1055o0, C1055o0 c1055o02) {
        C1055o0 c1055o03 = c1055o0;
        C1055o0 c1055o04 = c1055o02;
        int i7 = c1055o04.f5269b - c1055o03.f5269b;
        if (i7 != 0) {
            return i7;
        }
        boolean z6 = c1055o03.f5271d;
        if (z6 && c1055o04.f5271d) {
            return 0;
        }
        if (z6) {
            return -1;
        }
        if (c1055o04.f5271d) {
            return 1;
        }
        return i7;
    }
}
