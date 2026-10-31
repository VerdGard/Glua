package p022c5;

import p002a1.C0017d;
import p047f5.C1177h;

/* renamed from: c5.j */
/* loaded from: classes.dex */
public final class C0646j {
    /* renamed from: a */
    public static long m2166a(int i7, C0642f c0642f) {
        int i8 = i7;
        while (i8 < c0642f.f3160e && C1177h.m3386b(c0642f.charAt(i8))) {
            i8++;
        }
        if (i8 > i7) {
            while (i7 > 0) {
                int i9 = i7 - 1;
                if (!C1177h.m3386b(c0642f.charAt(i9))) {
                    break;
                }
                i7 = i9;
            }
        }
        return C0017d.m68G(i7, i8);
    }
}
