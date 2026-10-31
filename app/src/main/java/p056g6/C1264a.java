package p056g6;

import java.util.Iterator;

/* renamed from: g6.a */
/* loaded from: classes.dex */
public class C1264a implements Iterable<Integer> {

    /* renamed from: c */
    public final int f6305c;

    /* renamed from: e */
    public final int f6306e;

    /* renamed from: m */
    public final int f6307m;

    public C1264a(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6305c = i7;
        if (i9 > 0) {
            if (i7 < i8) {
                int i10 = i8 % i9;
                int i11 = i7 % i9;
                int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                i8 -= i12 < 0 ? i12 + i9 : i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i7 > i8) {
                int i13 = -i9;
                int i14 = i7 % i13;
                int i15 = i8 % i13;
                int i16 = ((i14 < 0 ? i14 + i13 : i14) - (i15 < 0 ? i15 + i13 : i15)) % i13;
                i8 += i16 < 0 ? i16 + i13 : i16;
            }
        }
        this.f6306e = i8;
        this.f6307m = i9;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C1265b(this.f6305c, this.f6306e, this.f6307m);
    }
}
