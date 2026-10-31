package p089l;

import androidx.activity.C0143v;
import java.util.Arrays;
import p002a1.C0017d;
import p032d6.C0898f;
import p195y5.C2255c;

/* renamed from: l.g */
/* loaded from: classes.dex */
public final class C1473g<E> implements Cloneable {

    /* renamed from: c */
    public /* synthetic */ boolean f7029c;

    /* renamed from: e */
    public /* synthetic */ long[] f7030e;

    /* renamed from: m */
    public /* synthetic */ Object[] f7031m;

    /* renamed from: s */
    public /* synthetic */ int f7032s;

    public C1473g() {
        this(10);
    }

    /* renamed from: a */
    public final void m3853a(long j7, Long l7) {
        int i7 = this.f7032s;
        if (i7 != 0 && j7 <= this.f7030e[i7 - 1]) {
            m3859g(j7, l7);
            return;
        }
        if (this.f7029c) {
            long[] jArr = this.f7030e;
            if (i7 >= jArr.length) {
                Object[] objArr = this.f7031m;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj = objArr[i9];
                    if (obj != C1474h.f7033a) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr[i8] = obj;
                            objArr[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f7029c = false;
                this.f7032s = i8;
            }
        }
        int i10 = this.f7032s;
        if (i10 >= this.f7030e.length) {
            int i11 = (i10 + 1) * 8;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 8;
            long[] copyOf = Arrays.copyOf(this.f7030e, i14);
            C0898f.m2605d(copyOf, "copyOf(this, newSize)");
            this.f7030e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7031m, i14);
            C0898f.m2605d(copyOf2, "copyOf(this, newSize)");
            this.f7031m = copyOf2;
        }
        this.f7030e[i10] = j7;
        this.f7031m[i10] = l7;
        this.f7032s = i10 + 1;
    }

    /* renamed from: b */
    public final void m3854b() {
        int i7 = this.f7032s;
        Object[] objArr = this.f7031m;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f7032s = 0;
        this.f7029c = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1473g<E> clone() {
        Object clone = super.clone();
        C0898f.m2604c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1473g<E> c1473g = (C1473g) clone;
        c1473g.f7030e = (long[]) this.f7030e.clone();
        c1473g.f7031m = (Object[]) this.f7031m.clone();
        return c1473g;
    }

    /* renamed from: d */
    public final E m3856d(long j7) {
        E e7;
        int m86k = C0017d.m86k(this.f7030e, this.f7032s, j7);
        if (m86k < 0 || (e7 = (E) this.f7031m[m86k]) == C1474h.f7033a) {
            return null;
        }
        return e7;
    }

    /* renamed from: e */
    public final Object m3857e(long j7, Long l7) {
        Object obj;
        int m86k = C0017d.m86k(this.f7030e, this.f7032s, j7);
        return (m86k < 0 || (obj = this.f7031m[m86k]) == C1474h.f7033a) ? l7 : obj;
    }

    /* renamed from: f */
    public final long m3858f(int i7) {
        if (!(i7 >= 0 && i7 < this.f7032s)) {
            C0143v.m476z0("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f7029c) {
            int i8 = this.f7032s;
            long[] jArr = this.f7030e;
            Object[] objArr = this.f7031m;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != C1474h.f7033a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f7029c = false;
            this.f7032s = i9;
        }
        return this.f7030e[i7];
    }

    /* renamed from: g */
    public final void m3859g(long j7, E e7) {
        int m86k = C0017d.m86k(this.f7030e, this.f7032s, j7);
        if (m86k >= 0) {
            this.f7031m[m86k] = e7;
            return;
        }
        int i7 = ~m86k;
        int i8 = this.f7032s;
        if (i7 < i8) {
            Object[] objArr = this.f7031m;
            if (objArr[i7] == C1474h.f7033a) {
                this.f7030e[i7] = j7;
                objArr[i7] = e7;
                return;
            }
        }
        if (this.f7029c) {
            long[] jArr = this.f7030e;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f7031m;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr2[i10];
                    if (obj != C1474h.f7033a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f7029c = false;
                this.f7032s = i9;
                i7 = ~C0017d.m86k(this.f7030e, i9, j7);
            }
        }
        int i11 = this.f7032s;
        if (i11 >= this.f7030e.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] copyOf = Arrays.copyOf(this.f7030e, i15);
            C0898f.m2605d(copyOf, "copyOf(this, newSize)");
            this.f7030e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7031m, i15);
            C0898f.m2605d(copyOf2, "copyOf(this, newSize)");
            this.f7031m = copyOf2;
        }
        int i16 = this.f7032s - i7;
        if (i16 != 0) {
            long[] jArr2 = this.f7030e;
            int i17 = i7 + 1;
            C0898f.m2606e(jArr2, "<this>");
            System.arraycopy(jArr2, i7, jArr2, i17, i16);
            Object[] objArr3 = this.f7031m;
            C2255c.m5464G0(objArr3, objArr3, i17, i7, this.f7032s);
        }
        this.f7030e[i7] = j7;
        this.f7031m[i7] = e7;
        this.f7032s++;
    }

    /* renamed from: h */
    public final int m3860h() {
        if (this.f7029c) {
            int i7 = this.f7032s;
            long[] jArr = this.f7030e;
            Object[] objArr = this.f7031m;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != C1474h.f7033a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f7029c = false;
            this.f7032s = i8;
        }
        return this.f7032s;
    }

    /* renamed from: i */
    public final E m3861i(int i7) {
        if (!(i7 >= 0 && i7 < this.f7032s)) {
            C0143v.m476z0("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f7029c) {
            int i8 = this.f7032s;
            long[] jArr = this.f7030e;
            Object[] objArr = this.f7031m;
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                Object obj = objArr[i10];
                if (obj != C1474h.f7033a) {
                    if (i10 != i9) {
                        jArr[i9] = jArr[i10];
                        objArr[i9] = obj;
                        objArr[i10] = null;
                    }
                    i9++;
                }
            }
            this.f7029c = false;
            this.f7032s = i9;
        }
        return (E) this.f7031m[i7];
    }

    public final String toString() {
        if (m3860h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7032s * 28);
        sb.append('{');
        int i7 = this.f7032s;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(m3858f(i8));
            sb.append('=');
            E m3861i = m3861i(i8);
            if (m3861i != sb) {
                sb.append(m3861i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C0898f.m2605d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C1473g(int i7) {
        if (i7 == 0) {
            this.f7030e = C0017d.f27o;
            this.f7031m = C0017d.f28p;
            return;
        }
        int i8 = i7 * 8;
        int i9 = 4;
        while (true) {
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 8;
        this.f7030e = new long[i11];
        this.f7031m = new Object[i11];
    }
}
