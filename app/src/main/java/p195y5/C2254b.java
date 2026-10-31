package p195y5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p032d6.C0898f;

/* renamed from: y5.b */
/* loaded from: classes.dex */
public final class C2254b<E> extends AbstractC2253a<E> {

    /* renamed from: s */
    public static final Object[] f10271s = new Object[0];

    /* renamed from: c */
    public int f10272c;

    /* renamed from: e */
    public Object[] f10273e = f10271s;

    /* renamed from: m */
    public int f10274m;

    /* renamed from: a */
    public final void m5459a(int i7, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f10273e.length;
        while (i7 < length && it.hasNext()) {
            this.f10273e[i7] = it.next();
            i7++;
        }
        int i8 = this.f10272c;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f10273e[i9] = it.next();
        }
        this.f10274m = collection.size() + this.f10274m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, E e7) {
        int i8 = this.f10274m;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
        }
        if (i7 == i8) {
            addLast(e7);
            return;
        }
        int i9 = i8 + 1;
        if (i7 == 0) {
            m5460b(i9);
            int i10 = this.f10272c;
            if (i10 == 0) {
                Object[] objArr = this.f10273e;
                C0898f.m2606e(objArr, "<this>");
                i10 = objArr.length;
            }
            int i11 = i10 - 1;
            this.f10272c = i11;
            this.f10273e[i11] = e7;
            this.f10274m++;
            return;
        }
        m5460b(i9);
        int m5462d = m5462d(this.f10272c + i7);
        int i12 = this.f10274m;
        if (i7 < ((i12 + 1) >> 1)) {
            if (m5462d == 0) {
                Object[] objArr2 = this.f10273e;
                C0898f.m2606e(objArr2, "<this>");
                m5462d = objArr2.length;
            }
            int i13 = m5462d - 1;
            int i14 = this.f10272c;
            if (i14 == 0) {
                Object[] objArr3 = this.f10273e;
                C0898f.m2606e(objArr3, "<this>");
                i14 = objArr3.length;
            }
            int i15 = i14 - 1;
            int i16 = this.f10272c;
            Object[] objArr4 = this.f10273e;
            if (i13 >= i16) {
                objArr4[i15] = objArr4[i16];
                C2255c.m5464G0(objArr4, objArr4, i16, i16 + 1, i13 + 1);
            } else {
                C2255c.m5464G0(objArr4, objArr4, i16 - 1, i16, objArr4.length);
                Object[] objArr5 = this.f10273e;
                objArr5[objArr5.length - 1] = objArr5[0];
                C2255c.m5464G0(objArr5, objArr5, 0, 1, i13 + 1);
            }
            this.f10273e[i13] = e7;
            this.f10272c = i15;
        } else {
            int m5462d2 = m5462d(this.f10272c + i12);
            Object[] objArr6 = this.f10273e;
            if (m5462d < m5462d2) {
                C2255c.m5464G0(objArr6, objArr6, m5462d + 1, m5462d, m5462d2);
            } else {
                C2255c.m5464G0(objArr6, objArr6, 1, 0, m5462d2);
                Object[] objArr7 = this.f10273e;
                objArr7[0] = objArr7[objArr7.length - 1];
                C2255c.m5464G0(objArr7, objArr7, m5462d + 1, m5462d, objArr7.length - 1);
            }
            this.f10273e[m5462d] = e7;
        }
        this.f10274m++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e7) {
        addLast(e7);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        C0898f.m2606e(collection, "elements");
        int i8 = this.f10274m;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
        }
        if (collection.isEmpty()) {
            return false;
        }
        int i9 = this.f10274m;
        if (i7 == i9) {
            return addAll(collection);
        }
        m5460b(collection.size() + i9);
        int m5462d = m5462d(this.f10272c + this.f10274m);
        int m5462d2 = m5462d(this.f10272c + i7);
        int size = collection.size();
        if (i7 < ((this.f10274m + 1) >> 1)) {
            int i10 = this.f10272c;
            int i11 = i10 - size;
            if (m5462d2 < i10) {
                Object[] objArr = this.f10273e;
                C2255c.m5464G0(objArr, objArr, i11, i10, objArr.length);
                Object[] objArr2 = this.f10273e;
                int length = objArr2.length - size;
                if (size >= m5462d2) {
                    C2255c.m5464G0(objArr2, objArr2, length, 0, m5462d2);
                } else {
                    C2255c.m5464G0(objArr2, objArr2, length, 0, size);
                    Object[] objArr3 = this.f10273e;
                    C2255c.m5464G0(objArr3, objArr3, 0, size, m5462d2);
                }
            } else if (i11 >= 0) {
                Object[] objArr4 = this.f10273e;
                C2255c.m5464G0(objArr4, objArr4, i11, i10, m5462d2);
            } else {
                Object[] objArr5 = this.f10273e;
                i11 += objArr5.length;
                int i12 = m5462d2 - i10;
                int length2 = objArr5.length - i11;
                if (length2 >= i12) {
                    C2255c.m5464G0(objArr5, objArr5, i11, i10, m5462d2);
                } else {
                    C2255c.m5464G0(objArr5, objArr5, i11, i10, i10 + length2);
                    Object[] objArr6 = this.f10273e;
                    C2255c.m5464G0(objArr6, objArr6, 0, this.f10272c + length2, m5462d2);
                }
            }
            this.f10272c = i11;
            m5462d2 -= size;
            if (m5462d2 < 0) {
                m5462d2 += this.f10273e.length;
            }
        } else {
            int i13 = m5462d2 + size;
            if (m5462d2 < m5462d) {
                int i14 = size + m5462d;
                Object[] objArr7 = this.f10273e;
                if (i14 > objArr7.length) {
                    if (i13 >= objArr7.length) {
                        i13 -= objArr7.length;
                    } else {
                        int length3 = m5462d - (i14 - objArr7.length);
                        C2255c.m5464G0(objArr7, objArr7, 0, length3, m5462d);
                        Object[] objArr8 = this.f10273e;
                        C2255c.m5464G0(objArr8, objArr8, i13, m5462d2, length3);
                    }
                }
                C2255c.m5464G0(objArr7, objArr7, i13, m5462d2, m5462d);
            } else {
                Object[] objArr9 = this.f10273e;
                C2255c.m5464G0(objArr9, objArr9, size, 0, m5462d);
                Object[] objArr10 = this.f10273e;
                if (i13 >= objArr10.length) {
                    C2255c.m5464G0(objArr10, objArr10, i13 - objArr10.length, m5462d2, objArr10.length);
                } else {
                    C2255c.m5464G0(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f10273e;
                    C2255c.m5464G0(objArr11, objArr11, i13, m5462d2, objArr11.length - size);
                }
            }
        }
        m5459a(m5462d2, collection);
        return true;
    }

    public final void addLast(E e7) {
        m5460b(this.f10274m + 1);
        this.f10273e[m5462d(this.f10272c + this.f10274m)] = e7;
        this.f10274m++;
    }

    /* renamed from: b */
    public final void m5460b(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f10273e;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f10271s) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f10273e = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i8 = length + (length >> 1);
        if (i8 - i7 < 0) {
            i8 = i7;
        }
        if (i8 - 2147483639 > 0) {
            i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i8];
        C2255c.m5464G0(objArr, objArr2, 0, this.f10272c, objArr.length);
        Object[] objArr3 = this.f10273e;
        int length2 = objArr3.length;
        int i9 = this.f10272c;
        C2255c.m5464G0(objArr3, objArr2, length2 - i9, 0, i9);
        this.f10272c = 0;
        this.f10273e = objArr2;
    }

    /* renamed from: c */
    public final int m5461c(int i7) {
        C0898f.m2606e(this.f10273e, "<this>");
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int m5462d = m5462d(this.f10272c + this.f10274m);
        int i7 = this.f10272c;
        if (i7 < m5462d) {
            Object[] objArr = this.f10273e;
            C0898f.m2606e(objArr, "<this>");
            Arrays.fill(objArr, i7, m5462d, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f10273e;
            Arrays.fill(objArr2, this.f10272c, objArr2.length, (Object) null);
            Object[] objArr3 = this.f10273e;
            C0898f.m2606e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, m5462d, (Object) null);
        }
        this.f10272c = 0;
        this.f10274m = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m5462d(int i7) {
        Object[] objArr = this.f10273e;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i7) {
        int i8 = this.f10274m;
        if (i7 >= 0 && i7 < i8) {
            return (E) this.f10273e[m5462d(this.f10272c + i7)];
        }
        throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int m5462d = m5462d(this.f10272c + this.f10274m);
        int i7 = this.f10272c;
        if (i7 < m5462d) {
            while (i7 < m5462d) {
                if (!C0898f.m2602a(obj, this.f10273e[i7])) {
                    i7++;
                }
            }
            return -1;
        }
        if (i7 < m5462d) {
            return -1;
        }
        int length = this.f10273e.length;
        while (true) {
            if (i7 >= length) {
                for (int i8 = 0; i8 < m5462d; i8++) {
                    if (C0898f.m2602a(obj, this.f10273e[i8])) {
                        i7 = i8 + this.f10273e.length;
                    }
                }
                return -1;
            }
            if (C0898f.m2602a(obj, this.f10273e[i7])) {
                break;
            }
            i7++;
        }
        return i7 - this.f10272c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f10274m == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int m5462d = m5462d(this.f10272c + this.f10274m);
        int i7 = this.f10272c;
        if (i7 < m5462d) {
            length = m5462d - 1;
            if (i7 <= length) {
                while (!C0898f.m2602a(obj, this.f10273e[length])) {
                    if (length != i7) {
                        length--;
                    }
                }
                return length - this.f10272c;
            }
            return -1;
        }
        if (i7 > m5462d) {
            int i8 = m5462d - 1;
            while (true) {
                if (-1 >= i8) {
                    Object[] objArr = this.f10273e;
                    C0898f.m2606e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i9 = this.f10272c;
                    if (i9 <= length) {
                        while (!C0898f.m2602a(obj, this.f10273e[length])) {
                            if (length != i9) {
                                length--;
                            }
                        }
                    }
                } else {
                    if (C0898f.m2602a(obj, this.f10273e[i8])) {
                        length = i8 + this.f10273e.length;
                        break;
                    }
                    i8--;
                }
            }
            return length - this.f10272c;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        int m5462d;
        C0898f.m2606e(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty()) {
            if (!(this.f10273e.length == 0)) {
                int m5462d2 = m5462d(this.f10272c + this.f10274m);
                int i7 = this.f10272c;
                if (i7 < m5462d2) {
                    m5462d = i7;
                    while (i7 < m5462d2) {
                        Object obj = this.f10273e[i7];
                        if (!collection.contains(obj)) {
                            this.f10273e[m5462d] = obj;
                            m5462d++;
                        } else {
                            z6 = true;
                        }
                        i7++;
                    }
                    Object[] objArr = this.f10273e;
                    C0898f.m2606e(objArr, "<this>");
                    Arrays.fill(objArr, m5462d, m5462d2, (Object) null);
                } else {
                    int length = this.f10273e.length;
                    int i8 = i7;
                    boolean z7 = false;
                    while (i7 < length) {
                        Object[] objArr2 = this.f10273e;
                        Object obj2 = objArr2[i7];
                        objArr2[i7] = null;
                        if (!collection.contains(obj2)) {
                            this.f10273e[i8] = obj2;
                            i8++;
                        } else {
                            z7 = true;
                        }
                        i7++;
                    }
                    m5462d = m5462d(i8);
                    for (int i9 = 0; i9 < m5462d2; i9++) {
                        Object[] objArr3 = this.f10273e;
                        Object obj3 = objArr3[i9];
                        objArr3[i9] = null;
                        if (!collection.contains(obj3)) {
                            this.f10273e[m5462d] = obj3;
                            m5462d = m5461c(m5462d);
                        } else {
                            z7 = true;
                        }
                    }
                    z6 = z7;
                }
                if (z6) {
                    int i10 = m5462d - this.f10272c;
                    if (i10 < 0) {
                        i10 += this.f10273e.length;
                    }
                    this.f10274m = i10;
                }
            }
        }
        return z6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        int m5462d;
        C0898f.m2606e(collection, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty()) {
            if (!(this.f10273e.length == 0)) {
                int m5462d2 = m5462d(this.f10272c + this.f10274m);
                int i7 = this.f10272c;
                if (i7 < m5462d2) {
                    m5462d = i7;
                    while (i7 < m5462d2) {
                        Object obj = this.f10273e[i7];
                        if (collection.contains(obj)) {
                            this.f10273e[m5462d] = obj;
                            m5462d++;
                        } else {
                            z6 = true;
                        }
                        i7++;
                    }
                    Object[] objArr = this.f10273e;
                    C0898f.m2606e(objArr, "<this>");
                    Arrays.fill(objArr, m5462d, m5462d2, (Object) null);
                } else {
                    int length = this.f10273e.length;
                    int i8 = i7;
                    boolean z7 = false;
                    while (i7 < length) {
                        Object[] objArr2 = this.f10273e;
                        Object obj2 = objArr2[i7];
                        objArr2[i7] = null;
                        if (collection.contains(obj2)) {
                            this.f10273e[i8] = obj2;
                            i8++;
                        } else {
                            z7 = true;
                        }
                        i7++;
                    }
                    m5462d = m5462d(i8);
                    for (int i9 = 0; i9 < m5462d2; i9++) {
                        Object[] objArr3 = this.f10273e;
                        Object obj3 = objArr3[i9];
                        objArr3[i9] = null;
                        if (collection.contains(obj3)) {
                            this.f10273e[m5462d] = obj3;
                            m5462d = m5461c(m5462d);
                        } else {
                            z7 = true;
                        }
                    }
                    z6 = z7;
                }
                if (z6) {
                    int i10 = m5462d - this.f10272c;
                    if (i10 < 0) {
                        i10 += this.f10273e.length;
                    }
                    this.f10274m = i10;
                }
            }
        }
        return z6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i7, E e7) {
        int i8 = this.f10274m;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
        }
        int m5462d = m5462d(this.f10272c + i7);
        Object[] objArr = this.f10273e;
        E e8 = (E) objArr[m5462d];
        objArr[m5462d] = e7;
        return e8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f10274m]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        C0898f.m2606e(tArr, "array");
        int length = tArr.length;
        int i7 = this.f10274m;
        if (length < i7) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i7);
            C0898f.m2604c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) newInstance);
        }
        int m5462d = m5462d(this.f10272c + this.f10274m);
        int i8 = this.f10272c;
        if (i8 < m5462d) {
            C2255c.m5466I0(this.f10273e, tArr, i8, m5462d, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f10273e;
            C2255c.m5464G0(objArr, tArr, 0, this.f10272c, objArr.length);
            Object[] objArr2 = this.f10273e;
            C2255c.m5464G0(objArr2, tArr, objArr2.length - this.f10272c, 0, m5462d);
        }
        int length2 = tArr.length;
        int i9 = this.f10274m;
        if (length2 > i9) {
            tArr[i9] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        C0898f.m2606e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m5460b(collection.size() + this.f10274m);
        m5459a(m5462d(this.f10272c + this.f10274m), collection);
        return true;
    }
}
