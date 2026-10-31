package p089l;

import androidx.activity.C0143v;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p002a1.C0017d;
import p032d6.C0898f;
import p195y5.C2255c;

/* renamed from: l.o */
/* loaded from: classes.dex */
public class C1481o<K, V> {

    /* renamed from: c */
    public int[] f7045c;

    /* renamed from: e */
    public Object[] f7046e;

    /* renamed from: m */
    public int f7047m;

    public C1481o() {
        this(0);
    }

    public C1481o(int i7) {
        this.f7045c = i7 == 0 ? C0017d.f26n : new int[i7];
        this.f7046e = i7 == 0 ? C0017d.f28p : new Object[i7 << 1];
    }

    /* renamed from: a */
    public final int m3869a(V v5) {
        int i7 = this.f7047m * 2;
        Object[] objArr = this.f7046e;
        if (v5 == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (C0898f.m2602a(v5, objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final void m3870b(int i7) {
        int i8 = this.f7047m;
        int[] iArr = this.f7045c;
        if (iArr.length < i7) {
            int[] copyOf = Arrays.copyOf(iArr, i7);
            C0898f.m2605d(copyOf, "copyOf(this, newSize)");
            this.f7045c = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7046e, i7 * 2);
            C0898f.m2605d(copyOf2, "copyOf(this, newSize)");
            this.f7046e = copyOf2;
        }
        if (this.f7047m != i8) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public final int m3871c(int i7, Object obj) {
        int i8 = this.f7047m;
        if (i8 == 0) {
            return -1;
        }
        int m85j = C0017d.m85j(i8, i7, this.f7045c);
        if (m85j < 0 || C0898f.m2602a(obj, this.f7046e[m85j << 1])) {
            return m85j;
        }
        int i9 = m85j + 1;
        while (i9 < i8 && this.f7045c[i9] == i7) {
            if (C0898f.m2602a(obj, this.f7046e[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = m85j - 1; i10 >= 0 && this.f7045c[i10] == i7; i10--) {
            if (C0898f.m2602a(obj, this.f7046e[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final void clear() {
        if (this.f7047m > 0) {
            this.f7045c = C0017d.f26n;
            this.f7046e = C0017d.f28p;
            this.f7047m = 0;
        }
        if (this.f7047m > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k7) {
        return m3872d(k7) >= 0;
    }

    public boolean containsValue(V v5) {
        return m3869a(v5) >= 0;
    }

    /* renamed from: d */
    public final int m3872d(K k7) {
        return k7 == null ? m3873e() : m3871c(k7.hashCode(), k7);
    }

    /* renamed from: e */
    public final int m3873e() {
        int i7 = this.f7047m;
        if (i7 == 0) {
            return -1;
        }
        int m85j = C0017d.m85j(i7, 0, this.f7045c);
        if (m85j < 0 || this.f7046e[m85j << 1] == null) {
            return m85j;
        }
        int i8 = m85j + 1;
        while (i8 < i7 && this.f7045c[i8] == 0) {
            if (this.f7046e[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = m85j - 1; i9 >= 0 && this.f7045c[i9] == 0; i9--) {
            if (this.f7046e[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1481o) {
                int i7 = this.f7047m;
                if (i7 != ((C1481o) obj).f7047m) {
                    return false;
                }
                C1481o c1481o = (C1481o) obj;
                for (int i8 = 0; i8 < i7; i8++) {
                    K m3874f = m3874f(i8);
                    V m3877i = m3877i(i8);
                    Object obj2 = c1481o.get(m3874f);
                    if (m3877i == null) {
                        if (obj2 != null || !c1481o.containsKey(m3874f)) {
                            return false;
                        }
                    } else if (!C0898f.m2602a(m3877i, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f7047m != ((Map) obj).size()) {
                return false;
            }
            int i9 = this.f7047m;
            for (int i10 = 0; i10 < i9; i10++) {
                K m3874f2 = m3874f(i10);
                V m3877i2 = m3877i(i10);
                Object obj3 = ((Map) obj).get(m3874f2);
                if (m3877i2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(m3874f2)) {
                        return false;
                    }
                } else if (!C0898f.m2602a(m3877i2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* renamed from: f */
    public final K m3874f(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 < this.f7047m) {
            z6 = true;
        }
        if (z6) {
            return (K) this.f7046e[i7 << 1];
        }
        C0143v.m476z0("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    /* renamed from: g */
    public final V m3875g(int i7) {
        if (!(i7 >= 0 && i7 < this.f7047m)) {
            C0143v.m476z0("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        Object[] objArr = this.f7046e;
        int i8 = i7 << 1;
        V v5 = (V) objArr[i8 + 1];
        int i9 = this.f7047m;
        if (i9 <= 1) {
            clear();
        } else {
            int i10 = i9 - 1;
            int[] iArr = this.f7045c;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i7 < i10) {
                    int i11 = i7 + 1;
                    int i12 = i10 + 1;
                    C2255c.m5463F0(i7, i11, i12, iArr, iArr);
                    Object[] objArr2 = this.f7046e;
                    C2255c.m5464G0(objArr2, objArr2, i8, i11 << 1, i12 << 1);
                }
                Object[] objArr3 = this.f7046e;
                int i13 = i10 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                int i14 = i9 > 8 ? i9 + (i9 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i14);
                C0898f.m2605d(copyOf, "copyOf(this, newSize)");
                this.f7045c = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f7046e, i14 << 1);
                C0898f.m2605d(copyOf2, "copyOf(this, newSize)");
                this.f7046e = copyOf2;
                if (i9 != this.f7047m) {
                    throw new ConcurrentModificationException();
                }
                if (i7 > 0) {
                    C2255c.m5463F0(0, 0, i7, iArr, this.f7045c);
                    C2255c.m5464G0(objArr, this.f7046e, 0, 0, i8);
                }
                if (i7 < i10) {
                    int i15 = i7 + 1;
                    int i16 = i10 + 1;
                    C2255c.m5463F0(i7, i15, i16, iArr, this.f7045c);
                    C2255c.m5464G0(objArr, this.f7046e, i8, i15 << 1, i16 << 1);
                }
            }
            if (i9 != this.f7047m) {
                throw new ConcurrentModificationException();
            }
            this.f7047m = i10;
        }
        return v5;
    }

    public V get(K k7) {
        int m3872d = m3872d(k7);
        if (m3872d >= 0) {
            return (V) this.f7046e[(m3872d << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v5) {
        int m3872d = m3872d(obj);
        return m3872d >= 0 ? (V) this.f7046e[(m3872d << 1) + 1] : v5;
    }

    /* renamed from: h */
    public final V m3876h(int i7, V v5) {
        boolean z6 = false;
        if (i7 >= 0 && i7 < this.f7047m) {
            z6 = true;
        }
        if (!z6) {
            C0143v.m476z0("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f7046e;
        V v7 = (V) objArr[i8];
        objArr[i8] = v5;
        return v7;
    }

    public final int hashCode() {
        int[] iArr = this.f7045c;
        Object[] objArr = this.f7046e;
        int i7 = this.f7047m;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            i10 += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return i10;
    }

    /* renamed from: i */
    public final V m3877i(int i7) {
        boolean z6 = false;
        if (i7 >= 0 && i7 < this.f7047m) {
            z6 = true;
        }
        if (z6) {
            return (V) this.f7046e[(i7 << 1) + 1];
        }
        C0143v.m476z0("Expected index to be within 0..size()-1, but was " + i7);
        throw null;
    }

    public final boolean isEmpty() {
        return this.f7047m <= 0;
    }

    public final V put(K k7, V v5) {
        int i7 = this.f7047m;
        int hashCode = k7 != null ? k7.hashCode() : 0;
        int m3871c = k7 != null ? m3871c(hashCode, k7) : m3873e();
        if (m3871c >= 0) {
            int i8 = (m3871c << 1) + 1;
            Object[] objArr = this.f7046e;
            V v7 = (V) objArr[i8];
            objArr[i8] = v5;
            return v7;
        }
        int i9 = ~m3871c;
        int[] iArr = this.f7045c;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i10);
            C0898f.m2605d(copyOf, "copyOf(this, newSize)");
            this.f7045c = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f7046e, i10 << 1);
            C0898f.m2605d(copyOf2, "copyOf(this, newSize)");
            this.f7046e = copyOf2;
            if (i7 != this.f7047m) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr2 = this.f7045c;
            int i11 = i9 + 1;
            C2255c.m5463F0(i11, i9, i7, iArr2, iArr2);
            Object[] objArr2 = this.f7046e;
            C2255c.m5464G0(objArr2, objArr2, i11 << 1, i9 << 1, this.f7047m << 1);
        }
        int i12 = this.f7047m;
        if (i7 == i12) {
            int[] iArr3 = this.f7045c;
            if (i9 < iArr3.length) {
                iArr3[i9] = hashCode;
                Object[] objArr3 = this.f7046e;
                int i13 = i9 << 1;
                objArr3[i13] = k7;
                objArr3[i13 + 1] = v5;
                this.f7047m = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k7, V v5) {
        V v7 = get(k7);
        return v7 == null ? put(k7, v5) : v7;
    }

    public V remove(K k7) {
        int m3872d = m3872d(k7);
        if (m3872d >= 0) {
            return m3875g(m3872d);
        }
        return null;
    }

    public final boolean remove(K k7, V v5) {
        int m3872d = m3872d(k7);
        if (m3872d < 0 || !C0898f.m2602a(v5, m3877i(m3872d))) {
            return false;
        }
        m3875g(m3872d);
        return true;
    }

    public final V replace(K k7, V v5) {
        int m3872d = m3872d(k7);
        if (m3872d >= 0) {
            return m3876h(m3872d, v5);
        }
        return null;
    }

    public final boolean replace(K k7, V v5, V v7) {
        int m3872d = m3872d(k7);
        if (m3872d < 0 || !C0898f.m2602a(v5, m3877i(m3872d))) {
            return false;
        }
        m3876h(m3872d, v7);
        return true;
    }

    public final int size() {
        return this.f7047m;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7047m * 28);
        sb.append('{');
        int i7 = this.f7047m;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            K m3874f = m3874f(i8);
            if (m3874f != sb) {
                sb.append(m3874f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m3877i = m3877i(i8);
            if (m3877i != sb) {
                sb.append(m3877i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C0898f.m2605d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
