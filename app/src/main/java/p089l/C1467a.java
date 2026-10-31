package p089l;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p032d6.C0898f;
import p195y5.C2255c;

/* renamed from: l.a */
/* loaded from: classes.dex */
public final class C1467a<K, V> extends C1481o<K, V> implements Map<K, V> {

    /* renamed from: X */
    public C1467a<K, V>.c f7004X;

    /* renamed from: Y */
    public C1467a<K, V>.e f7005Y;

    /* renamed from: s */
    public C1467a<K, V>.a f7006s;

    /* renamed from: l.a$a */
    public final class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C1467a.this.f7047m;
        }
    }

    /* renamed from: l.a$b */
    public final class b extends AbstractC1469c<K> {
        public b() {
            super(C1467a.this.f7047m);
        }

        @Override // p089l.AbstractC1469c
        /* renamed from: a */
        public final K mo3849a(int i7) {
            return C1467a.this.m3874f(i7);
        }

        @Override // p089l.AbstractC1469c
        /* renamed from: b */
        public final void mo3850b(int i7) {
            C1467a.this.m3875g(i7);
        }
    }

    /* renamed from: l.a$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: c */
        public int f7010c;

        /* renamed from: e */
        public int f7011e = -1;

        /* renamed from: m */
        public boolean f7012m;

        public d() {
            this.f7010c = C1467a.this.f7047m - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f7012m) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i7 = this.f7011e;
            C1467a c1467a = C1467a.this;
            return C0898f.m2602a(key, c1467a.m3874f(i7)) && C0898f.m2602a(entry.getValue(), c1467a.m3877i(this.f7011e));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f7012m) {
                return C1467a.this.m3874f(this.f7011e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f7012m) {
                return C1467a.this.m3877i(this.f7011e);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f7011e < this.f7010c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f7012m) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i7 = this.f7011e;
            C1467a c1467a = C1467a.this;
            K m3874f = c1467a.m3874f(i7);
            V m3877i = c1467a.m3877i(this.f7011e);
            return (m3874f == null ? 0 : m3874f.hashCode()) ^ (m3877i != null ? m3877i.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f7011e++;
            this.f7012m = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f7012m) {
                throw new IllegalStateException();
            }
            C1467a.this.m3875g(this.f7011e);
            this.f7011e--;
            this.f7010c--;
            this.f7012m = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v5) {
            if (this.f7012m) {
                return C1467a.this.m3876h(this.f7011e, v5);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: l.a$f */
    public final class f extends AbstractC1469c<V> {
        public f() {
            super(C1467a.this.f7047m);
        }

        @Override // p089l.AbstractC1469c
        /* renamed from: a */
        public final V mo3849a(int i7) {
            return C1467a.this.m3877i(i7);
        }

        @Override // p089l.AbstractC1469c
        /* renamed from: b */
        public final void mo3850b(int i7) {
            C1467a.this.m3875g(i7);
        }
    }

    public C1467a() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1467a(C1467a c1467a) {
        super(0);
        if (c1467a != null) {
            int i7 = c1467a.f7047m;
            m3870b(this.f7047m + i7);
            if (this.f7047m != 0) {
                for (int i8 = 0; i8 < i7; i8++) {
                    put(c1467a.m3874f(i8), c1467a.m3877i(i8));
                }
            } else if (i7 > 0) {
                C2255c.m5463F0(0, 0, i7, c1467a.f7045c, this.f7045c);
                C2255c.m5464G0(c1467a.f7046e, this.f7046e, 0, 0, i7 << 1);
                this.f7047m = i7;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p089l.C1481o, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p089l.C1481o, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C1467a<K, V>.a aVar = this.f7006s;
        if (aVar != null) {
            return aVar;
        }
        C1467a<K, V>.a aVar2 = new a();
        this.f7006s = aVar2;
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p089l.C1481o, java.util.Map
    public final V get(Object obj) {
        return (V) super.get(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final boolean m3846j(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final boolean m3847k(Collection<?> collection) {
        int i7 = this.f7047m;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i7 != this.f7047m;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C1467a<K, V>.c cVar = this.f7004X;
        if (cVar != null) {
            return cVar;
        }
        C1467a<K, V>.c cVar2 = new c();
        this.f7004X = cVar2;
        return cVar2;
    }

    /* renamed from: l */
    public final boolean m3848l(Collection<?> collection) {
        int i7 = this.f7047m;
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (!collection.contains(m3874f(i8))) {
                m3875g(i8);
            }
        }
        return i7 != this.f7047m;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m3870b(map.size() + this.f7047m);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p089l.C1481o, java.util.Map
    public final V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C1467a<K, V>.e eVar = this.f7005Y;
        if (eVar != null) {
            return eVar;
        }
        C1467a<K, V>.e eVar2 = new e();
        this.f7005Y = eVar2;
        return eVar2;
    }

    /* renamed from: l.a$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k7) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            C1467a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return C1467a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return C1467a.this.m3846j(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                            return true;
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            C1467a c1467a = C1467a.this;
            int i7 = 0;
            for (int i8 = c1467a.f7047m - 1; i8 >= 0; i8--) {
                K m3874f = c1467a.m3874f(i8);
                i7 += m3874f == null ? 0 : m3874f.hashCode();
            }
            return i7;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return C1467a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            C1467a c1467a = C1467a.this;
            int m3872d = c1467a.m3872d(obj);
            if (m3872d < 0) {
                return false;
            }
            c1467a.m3875g(m3872d);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return C1467a.this.m3847k(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return C1467a.this.m3848l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return C1467a.this.f7047m;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            C1467a c1467a = C1467a.this;
            int i7 = c1467a.f7047m;
            Object[] objArr = new Object[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                objArr[i8] = c1467a.m3874f(i8);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            C1467a c1467a = C1467a.this;
            int i7 = c1467a.f7047m;
            if (tArr.length < i7) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i7));
            }
            for (int i8 = 0; i8 < i7; i8++) {
                tArr[i8] = c1467a.m3874f(i8);
            }
            if (tArr.length > i7) {
                tArr[i7] = null;
            }
            return tArr;
        }
    }

    /* renamed from: l.a$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            C1467a.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return C1467a.this.m3869a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return C1467a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            C1467a c1467a = C1467a.this;
            int m3869a = c1467a.m3869a(obj);
            if (m3869a < 0) {
                return false;
            }
            c1467a.m3875g(m3869a);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            C1467a c1467a = C1467a.this;
            int i7 = c1467a.f7047m;
            int i8 = 0;
            boolean z6 = false;
            while (i8 < i7) {
                if (collection.contains(c1467a.m3877i(i8))) {
                    c1467a.m3875g(i8);
                    i8--;
                    i7--;
                    z6 = true;
                }
                i8++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            C1467a c1467a = C1467a.this;
            int i7 = c1467a.f7047m;
            int i8 = 0;
            boolean z6 = false;
            while (i8 < i7) {
                if (!collection.contains(c1467a.m3877i(i8))) {
                    c1467a.m3875g(i8);
                    i8--;
                    i7--;
                    z6 = true;
                }
                i8++;
            }
            return z6;
        }

        @Override // java.util.Collection
        public final int size() {
            return C1467a.this.f7047m;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            C1467a c1467a = C1467a.this;
            int i7 = c1467a.f7047m;
            Object[] objArr = new Object[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                objArr[i8] = c1467a.m3877i(i8);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            C1467a c1467a = C1467a.this;
            int i7 = c1467a.f7047m;
            if (tArr.length < i7) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i7));
            }
            for (int i8 = 0; i8 < i7; i8++) {
                tArr[i8] = c1467a.m3877i(i8);
            }
            if (tArr.length > i7) {
                tArr[i7] = null;
            }
            return tArr;
        }
    }
}
