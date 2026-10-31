package p089l;

import androidx.activity.C0143v;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p002a1.C0017d;
import p032d6.C0898f;
import p195y5.C2255c;

/* renamed from: l.b */
/* loaded from: classes.dex */
public final class C1468b<E> implements Collection<E>, Set<E> {

    /* renamed from: c */
    public int[] f7016c = C0017d.f26n;

    /* renamed from: e */
    public Object[] f7017e = C0017d.f28p;

    /* renamed from: m */
    public int f7018m;

    /* renamed from: l.b$a */
    public final class a extends AbstractC1469c<E> {
        public a() {
            super(C1468b.this.f7018m);
        }

        @Override // p089l.AbstractC1469c
        /* renamed from: a */
        public final E mo3849a(int i7) {
            return (E) C1468b.this.f7017e[i7];
        }

        @Override // p089l.AbstractC1469c
        /* renamed from: b */
        public final void mo3850b(int i7) {
            C1468b.this.m3851a(i7);
        }
    }

    /* renamed from: a */
    public final E m3851a(int i7) {
        int i8 = this.f7018m;
        Object[] objArr = this.f7017e;
        E e7 = (E) objArr[i7];
        if (i8 <= 1) {
            clear();
        } else {
            int i9 = i8 - 1;
            int[] iArr = this.f7016c;
            if (iArr.length <= 8 || i8 >= iArr.length / 3) {
                if (i7 < i9) {
                    int i10 = i7 + 1;
                    int i11 = i9 + 1;
                    C2255c.m5463F0(i7, i10, i11, iArr, iArr);
                    Object[] objArr2 = this.f7017e;
                    C2255c.m5464G0(objArr2, objArr2, i7, i10, i11);
                }
                this.f7017e[i9] = null;
            } else {
                int i12 = i8 > 8 ? i8 + (i8 >> 1) : 8;
                int[] iArr2 = new int[i12];
                this.f7016c = iArr2;
                this.f7017e = new Object[i12];
                if (i7 > 0) {
                    C2255c.m5465H0(iArr, iArr2, 0, i7, 6);
                    C2255c.m5466I0(objArr, this.f7017e, 0, i7, 6);
                }
                if (i7 < i9) {
                    int i13 = i7 + 1;
                    int i14 = i9 + 1;
                    C2255c.m5463F0(i7, i13, i14, iArr, this.f7016c);
                    C2255c.m5464G0(objArr, this.f7017e, i7, i13, i14);
                }
            }
            if (i8 != this.f7018m) {
                throw new ConcurrentModificationException();
            }
            this.f7018m = i9;
        }
        return e7;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e7) {
        int i7;
        int m411I;
        int i8 = this.f7018m;
        if (e7 == null) {
            m411I = C0143v.m411I(this, null, 0);
            i7 = 0;
        } else {
            int hashCode = e7.hashCode();
            i7 = hashCode;
            m411I = C0143v.m411I(this, e7, hashCode);
        }
        if (m411I >= 0) {
            return false;
        }
        int i9 = ~m411I;
        int[] iArr = this.f7016c;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f7017e;
            int[] iArr2 = new int[i10];
            this.f7016c = iArr2;
            this.f7017e = new Object[i10];
            if (i8 != this.f7018m) {
                throw new ConcurrentModificationException();
            }
            if (!(iArr2.length == 0)) {
                C2255c.m5465H0(iArr, iArr2, 0, iArr.length, 6);
                C2255c.m5466I0(objArr, this.f7017e, 0, objArr.length, 6);
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f7016c;
            int i11 = i9 + 1;
            C2255c.m5463F0(i11, i9, i8, iArr3, iArr3);
            Object[] objArr2 = this.f7017e;
            C2255c.m5464G0(objArr2, objArr2, i11, i9, i8);
        }
        int i12 = this.f7018m;
        if (i8 == i12) {
            int[] iArr4 = this.f7016c;
            if (i9 < iArr4.length) {
                iArr4[i9] = i7;
                this.f7017e[i9] = e7;
                this.f7018m = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        C0898f.m2606e(collection, "elements");
        int size = collection.size() + this.f7018m;
        int i7 = this.f7018m;
        int[] iArr = this.f7016c;
        boolean z6 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f7017e;
            int[] iArr2 = new int[size];
            this.f7016c = iArr2;
            this.f7017e = new Object[size];
            int i8 = this.f7018m;
            if (i8 > 0) {
                C2255c.m5465H0(iArr, iArr2, 0, i8, 6);
                C2255c.m5466I0(objArr, this.f7017e, 0, this.f7018m, 6);
            }
        }
        if (this.f7018m != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z6 |= add(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f7018m != 0) {
            this.f7016c = C0017d.f26n;
            this.f7017e = C0017d.f28p;
            this.f7018m = 0;
        }
        if (this.f7018m != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? C0143v.m411I(this, null, 0) : C0143v.m411I(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        C0898f.m2606e(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f7018m == ((Set) obj).size()) {
            try {
                int i7 = this.f7018m;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (((Set) obj).contains(this.f7017e[i8])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f7016c;
        int i7 = this.f7018m;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7018m <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m411I = obj == null ? C0143v.m411I(this, null, 0) : C0143v.m411I(this, obj, obj.hashCode());
        if (m411I < 0) {
            return false;
        }
        m3851a(m411I);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        C0898f.m2606e(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= remove(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        C0898f.m2606e(collection, "elements");
        boolean z6 = false;
        for (int i7 = this.f7018m - 1; -1 < i7; i7--) {
            if (!collection.contains(this.f7017e[i7])) {
                m3851a(i7);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f7018m;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f7017e;
        int i7 = this.f7018m;
        C0898f.m2606e(objArr, "<this>");
        int length = objArr.length;
        if (i7 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i7);
            C0898f.m2605d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7018m * 14);
        sb.append('{');
        int i7 = this.f7018m;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f7017e[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        C0898f.m2605d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        C0898f.m2606e(tArr, "array");
        int i7 = this.f7018m;
        if (tArr.length < i7) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i7));
        } else if (tArr.length > i7) {
            tArr[i7] = null;
        }
        C2255c.m5464G0(this.f7017e, tArr, 0, 0, this.f7018m);
        return tArr;
    }
}
