package p036e2;

import android.ext.C0090b;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: e2.a0 */
/* loaded from: classes.dex */
public final class C0957a0 implements Serializable, Cloneable {

    /* renamed from: s */
    public static final /* synthetic */ int f4924s = 0;

    /* renamed from: c */
    public long[] f4925c;

    /* renamed from: e */
    public transient int f4926e;

    /* renamed from: m */
    public transient boolean f4927m;

    static {
        new ObjectStreamField("bits", long[].class);
    }

    public C0957a0() {
        this.f4926e = 0;
        this.f4925c = new long[1];
        this.f4927m = false;
    }

    public C0957a0(long[] jArr) {
        this.f4926e = 0;
        this.f4927m = false;
        this.f4925c = jArr;
        this.f4926e = jArr.length;
    }

    /* renamed from: b */
    public static void m2950b(int i7, int i8) {
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(C0090b.m219e("fromIndex < 0: ", i7));
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException(C0090b.m219e("toIndex < 0: ", i8));
        }
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i7 + " > toIndex: " + i8);
    }

    /* renamed from: a */
    public final int m2951a(int i7) {
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(C0090b.m219e("fromIndex < 0: ", i7));
        }
        int i8 = i7 >> 6;
        if (i8 >= this.f4926e) {
            return -1;
        }
        long j7 = this.f4925c[i8] & ((-1) << i7);
        while (j7 == 0) {
            i8++;
            if (i8 == this.f4926e) {
                return -1;
            }
            j7 = this.f4925c[i8];
        }
        return Long.numberOfTrailingZeros(j7) + (i8 * 64);
    }

    /* renamed from: c */
    public final void m2952c() {
        int i7 = this.f4926e - 1;
        while (i7 >= 0 && this.f4925c[i7] == 0) {
            i7--;
        }
        this.f4926e = i7 + 1;
    }

    public final Object clone() {
        if (!this.f4927m) {
            int i7 = this.f4926e;
            long[] jArr = this.f4925c;
            if (i7 != jArr.length) {
                this.f4925c = Arrays.copyOf(jArr, i7);
            }
        }
        try {
            C0957a0 c0957a0 = (C0957a0) super.clone();
            c0957a0.f4925c = (long[]) this.f4925c.clone();
            return c0957a0;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* renamed from: d */
    public final void m2953d(int i7) {
        long[] jArr = this.f4925c;
        if (jArr.length < i7) {
            this.f4925c = Arrays.copyOf(this.f4925c, Math.max(jArr.length * 2, i7));
            this.f4927m = false;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0957a0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0957a0 c0957a0 = (C0957a0) obj;
        c0957a0.getClass();
        if (this.f4926e != c0957a0.f4926e) {
            return false;
        }
        for (int i7 = 0; i7 < this.f4926e; i7++) {
            if (this.f4925c[i7] != c0957a0.f4925c[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f4926e;
        long j7 = 1234;
        while (true) {
            i7--;
            if (i7 < 0) {
                return (int) ((j7 >> 32) ^ j7);
            }
            j7 ^= this.f4925c[i7] * (i7 + 1);
        }
    }

    public final String toString() {
        int i7;
        int numberOfTrailingZeros;
        int i8 = this.f4926e;
        if (i8 > 128) {
            i7 = 0;
            for (int i9 = 0; i9 < this.f4926e; i9++) {
                i7 += Long.bitCount(this.f4925c[i9]);
            }
        } else {
            i7 = i8 * 64;
        }
        StringBuilder sb = new StringBuilder((i7 * 6) + 2);
        sb.append('{');
        int m2951a = m2951a(0);
        if (m2951a != -1) {
            sb.append(m2951a);
            while (true) {
                m2951a = m2951a(m2951a + 1);
                if (m2951a < 0) {
                    break;
                }
                if (m2951a < 0) {
                    throw new IndexOutOfBoundsException(C0090b.m219e("fromIndex < 0: ", m2951a));
                }
                int i10 = m2951a >> 6;
                if (i10 >= this.f4926e) {
                    numberOfTrailingZeros = m2951a;
                } else {
                    long j7 = (~this.f4925c[i10]) & ((-1) << m2951a);
                    while (true) {
                        if (j7 != 0) {
                            numberOfTrailingZeros = Long.numberOfTrailingZeros(j7) + (i10 * 64);
                            break;
                        }
                        i10++;
                        int i11 = this.f4926e;
                        if (i10 == i11) {
                            numberOfTrailingZeros = i11 * 64;
                            break;
                        }
                        j7 = ~this.f4925c[i10];
                    }
                }
                do {
                    sb.append(", ");
                    sb.append(m2951a);
                    m2951a++;
                } while (m2951a < numberOfTrailingZeros);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0957a0(int i7) {
        this.f4926e = 0;
        this.f4927m = false;
        if (i7 >= 0) {
            this.f4925c = new long[((i7 - 1) >> 6) + 1];
            this.f4927m = true;
            return;
        }
        throw new NegativeArraySizeException(C0090b.m219e("nbits < 0: ", i7));
    }
}
