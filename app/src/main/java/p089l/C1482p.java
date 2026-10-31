package p089l;

import java.util.Arrays;
import p002a1.C0017d;
import p032d6.C0898f;
import p195y5.C2255c;

/* renamed from: l.p */
/* loaded from: classes.dex */
public final class C1482p<E> implements Cloneable {

    /* renamed from: c */
    public /* synthetic */ int[] f7048c;

    /* renamed from: e */
    public /* synthetic */ Object[] f7049e;

    /* renamed from: m */
    public /* synthetic */ int f7050m;

    public C1482p() {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 40;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (40 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 4;
        this.f7048c = new int[i10];
        this.f7049e = new Object[i10];
    }

    /* renamed from: a */
    public final void m3878a(int i7, E e7) {
        int i8 = this.f7050m;
        if (i8 != 0 && i7 <= this.f7048c[i8 - 1]) {
            m3881d(i7, e7);
            return;
        }
        if (i8 >= this.f7048c.length) {
            int i9 = (i8 + 1) * 4;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 4;
            int[] copyOf = Arrays.copyOf(this.f7048c, i12);
            C0898f.m2605d(copyOf, "copyOf(this, newSize)");
            this.f7048c = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7049e, i12);
            C0898f.m2605d(copyOf2, "copyOf(this, newSize)");
            this.f7049e = copyOf2;
        }
        this.f7048c[i8] = i7;
        this.f7049e[i8] = e7;
        this.f7050m = i8 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1482p<E> clone() {
        Object clone = super.clone();
        C0898f.m2604c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C1482p<E> c1482p = (C1482p) clone;
        c1482p.f7048c = (int[]) this.f7048c.clone();
        c1482p.f7049e = (Object[]) this.f7049e.clone();
        return c1482p;
    }

    /* renamed from: c */
    public final E m3880c(int i7) {
        E e7;
        Object obj = C1483q.f7051a;
        int m85j = C0017d.m85j(this.f7050m, i7, this.f7048c);
        if (m85j < 0 || (e7 = (E) this.f7049e[m85j]) == C1483q.f7051a) {
            return null;
        }
        return e7;
    }

    /* renamed from: d */
    public final void m3881d(int i7, E e7) {
        int m85j = C0017d.m85j(this.f7050m, i7, this.f7048c);
        if (m85j >= 0) {
            this.f7049e[m85j] = e7;
            return;
        }
        int i8 = ~m85j;
        int i9 = this.f7050m;
        if (i8 < i9) {
            Object[] objArr = this.f7049e;
            if (objArr[i8] == C1483q.f7051a) {
                this.f7048c[i8] = i7;
                objArr[i8] = e7;
                return;
            }
        }
        if (i9 >= this.f7048c.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f7048c, i13);
            C0898f.m2605d(copyOf, "copyOf(this, newSize)");
            this.f7048c = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7049e, i13);
            C0898f.m2605d(copyOf2, "copyOf(this, newSize)");
            this.f7049e = copyOf2;
        }
        int i14 = this.f7050m;
        if (i14 - i8 != 0) {
            int[] iArr = this.f7048c;
            int i15 = i8 + 1;
            C2255c.m5463F0(i15, i8, i14, iArr, iArr);
            Object[] objArr2 = this.f7049e;
            C2255c.m5464G0(objArr2, objArr2, i15, i8, this.f7050m);
        }
        this.f7048c[i8] = i7;
        this.f7049e[i8] = e7;
        this.f7050m++;
    }

    public final String toString() {
        int i7 = this.f7050m;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        int i8 = this.f7050m;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(this.f7048c[i9]);
            sb.append('=');
            Object obj = this.f7049e[i9];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C0898f.m2605d(sb2, "buffer.toString()");
        return sb2;
    }
}
