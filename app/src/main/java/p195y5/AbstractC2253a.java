package p195y5;

import androidx.activity.C0143v;
import java.util.AbstractList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: y5.a */
/* loaded from: classes.dex */
public abstract class AbstractC2253a<E> extends AbstractList<E> implements List<E> {
    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i7) {
        C2254b c2254b = (C2254b) this;
        int i8 = c2254b.f10274m;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
        }
        if (i7 == C0143v.m406E(c2254b)) {
            if (c2254b.isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int m5462d = c2254b.m5462d(C0143v.m406E(c2254b) + c2254b.f10272c);
            Object[] objArr = c2254b.f10273e;
            E e7 = (E) objArr[m5462d];
            objArr[m5462d] = null;
            c2254b.f10274m--;
            return e7;
        }
        if (i7 == 0) {
            if (c2254b.isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            Object[] objArr2 = c2254b.f10273e;
            int i9 = c2254b.f10272c;
            E e8 = (E) objArr2[i9];
            objArr2[i9] = null;
            c2254b.f10272c = c2254b.m5461c(i9);
            c2254b.f10274m--;
            return e8;
        }
        int m5462d2 = c2254b.m5462d(c2254b.f10272c + i7);
        Object[] objArr3 = c2254b.f10273e;
        E e9 = (E) objArr3[m5462d2];
        if (i7 < (c2254b.f10274m >> 1)) {
            int i10 = c2254b.f10272c;
            if (m5462d2 >= i10) {
                C2255c.m5464G0(objArr3, objArr3, i10 + 1, i10, m5462d2);
            } else {
                C2255c.m5464G0(objArr3, objArr3, 1, 0, m5462d2);
                Object[] objArr4 = c2254b.f10273e;
                objArr4[0] = objArr4[objArr4.length - 1];
                int i11 = c2254b.f10272c;
                C2255c.m5464G0(objArr4, objArr4, i11 + 1, i11, objArr4.length - 1);
            }
            Object[] objArr5 = c2254b.f10273e;
            int i12 = c2254b.f10272c;
            objArr5[i12] = null;
            c2254b.f10272c = c2254b.m5461c(i12);
        } else {
            int m5462d3 = c2254b.m5462d(C0143v.m406E(c2254b) + c2254b.f10272c);
            Object[] objArr6 = c2254b.f10273e;
            int i13 = m5462d2 + 1;
            if (m5462d2 <= m5462d3) {
                C2255c.m5464G0(objArr6, objArr6, m5462d2, i13, m5462d3 + 1);
            } else {
                C2255c.m5464G0(objArr6, objArr6, m5462d2, i13, objArr6.length);
                Object[] objArr7 = c2254b.f10273e;
                objArr7[objArr7.length - 1] = objArr7[0];
                C2255c.m5464G0(objArr7, objArr7, 0, 1, m5462d3 + 1);
            }
            c2254b.f10273e[m5462d3] = null;
        }
        c2254b.f10274m--;
        return e9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C2254b) this).f10274m;
    }
}
