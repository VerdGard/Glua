package p070i4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: i4.n */
/* loaded from: classes.dex */
public final class C1348n<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: x1 */
    public static final a f6571x1 = new a();

    /* renamed from: X */
    public int f6572X;

    /* renamed from: Y */
    public final e<K, V> f6573Y;

    /* renamed from: Z */
    public C1348n<K, V>.b f6574Z;

    /* renamed from: c */
    public final Comparator<? super K> f6575c;

    /* renamed from: e */
    public final boolean f6576e;

    /* renamed from: m */
    public e<K, V> f6577m;

    /* renamed from: s */
    public int f6578s;

    /* renamed from: w1 */
    public C1348n<K, V>.c f6579w1;

    /* renamed from: i4.n$a */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: i4.n$b */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: i4.n$b$a */
        public class a extends C1348n<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return m3712a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C1348n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C1348n.this.m3706b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            C1348n c1348n;
            e<K, V> m3706b;
            if (!(obj instanceof Map.Entry) || (m3706b = (c1348n = C1348n.this).m3706b((Map.Entry) obj)) == null) {
                return false;
            }
            c1348n.m3708d(m3706b, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C1348n.this.f6578s;
        }
    }

    /* renamed from: i4.n$c */
    public final class c extends AbstractSet<K> {

        /* renamed from: i4.n$c$a */
        public class a extends C1348n<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return m3712a().f6587Y;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C1348n.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return C1348n.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[ORIG_RETURN, RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                i4.n r0 = p070i4.C1348n.this
                r0.getClass()
                r1 = 0
                if (r4 == 0) goto Ld
                i4.n$e r4 = r0.m3705a(r4, r1)     // Catch: java.lang.ClassCastException -> Ld
                goto Le
            Ld:
                r4 = 0
            Le:
                r2 = 1
                if (r4 == 0) goto L14
                r0.m3708d(r4, r2)
            L14:
                if (r4 == 0) goto L17
                r1 = 1
            L17:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p070i4.C1348n.c.remove(java.lang.Object):boolean");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C1348n.this.f6578s;
        }
    }

    /* renamed from: i4.n$d */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: c */
        public e<K, V> f6582c;

        /* renamed from: e */
        public e<K, V> f6583e = null;

        /* renamed from: m */
        public int f6584m;

        public d() {
            this.f6582c = C1348n.this.f6573Y.f6592s;
            this.f6584m = C1348n.this.f6572X;
        }

        /* renamed from: a */
        public final e<K, V> m3712a() {
            e<K, V> eVar = this.f6582c;
            C1348n c1348n = C1348n.this;
            if (eVar == c1348n.f6573Y) {
                throw new NoSuchElementException();
            }
            if (c1348n.f6572X != this.f6584m) {
                throw new ConcurrentModificationException();
            }
            this.f6582c = eVar.f6592s;
            this.f6583e = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6582c != C1348n.this.f6573Y;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f6583e;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            C1348n c1348n = C1348n.this;
            c1348n.m3708d(eVar, true);
            this.f6583e = null;
            this.f6584m = c1348n.f6572X;
        }
    }

    /* renamed from: i4.n$e */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: X */
        public e<K, V> f6586X;

        /* renamed from: Y */
        public final K f6587Y;

        /* renamed from: Z */
        public final boolean f6588Z;

        /* renamed from: c */
        public e<K, V> f6589c;

        /* renamed from: e */
        public e<K, V> f6590e;

        /* renamed from: m */
        public e<K, V> f6591m;

        /* renamed from: s */
        public e<K, V> f6592s;

        /* renamed from: w1 */
        public V f6593w1;

        /* renamed from: x1 */
        public int f6594x1;

        public e(boolean z6) {
            this.f6587Y = null;
            this.f6588Z = z6;
            this.f6586X = this;
            this.f6592s = this;
        }

        public e(boolean z6, e<K, V> eVar, K k7, e<K, V> eVar2, e<K, V> eVar3) {
            this.f6589c = eVar;
            this.f6587Y = k7;
            this.f6588Z = z6;
            this.f6594x1 = 1;
            this.f6592s = eVar2;
            this.f6586X = eVar3;
            eVar3.f6592s = this;
            eVar2.f6586X = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k7 = this.f6587Y;
            if (k7 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k7.equals(entry.getKey())) {
                return false;
            }
            V v5 = this.f6593w1;
            Object value = entry.getValue();
            if (v5 == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v5.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f6587Y;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f6593w1;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k7 = this.f6587Y;
            int hashCode = k7 == null ? 0 : k7.hashCode();
            V v5 = this.f6593w1;
            return (v5 != null ? v5.hashCode() : 0) ^ hashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v5) {
            if (v5 == null && !this.f6588Z) {
                throw new NullPointerException("value == null");
            }
            V v7 = this.f6593w1;
            this.f6593w1 = v5;
            return v7;
        }

        public final String toString() {
            return this.f6587Y + "=" + this.f6593w1;
        }
    }

    public C1348n() {
        this(true);
    }

    public C1348n(boolean z6) {
        a aVar = f6571x1;
        this.f6578s = 0;
        this.f6572X = 0;
        this.f6575c = aVar;
        this.f6576e = z6;
        this.f6573Y = new e<>(z6);
    }

    /* renamed from: a */
    public final e<K, V> m3705a(K k7, boolean z6) {
        int i7;
        e<K, V> eVar;
        e<K, V> eVar2 = this.f6577m;
        a aVar = f6571x1;
        Comparator<? super K> comparator = this.f6575c;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k7 : null;
            while (true) {
                K k8 = eVar2.f6587Y;
                i7 = comparable != null ? comparable.compareTo(k8) : comparator.compare(k7, k8);
                if (i7 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i7 < 0 ? eVar2.f6590e : eVar2.f6591m;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i7 = 0;
        }
        if (!z6) {
            return null;
        }
        e<K, V> eVar4 = this.f6573Y;
        if (eVar2 != null) {
            eVar = new e<>(this.f6576e, eVar2, k7, eVar4, eVar4.f6586X);
            if (i7 < 0) {
                eVar2.f6590e = eVar;
            } else {
                eVar2.f6591m = eVar;
            }
            m3707c(eVar2, true);
        } else {
            if (comparator == aVar && !(k7 instanceof Comparable)) {
                throw new ClassCastException(k7.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(this.f6576e, eVar2, k7, eVar4, eVar4.f6586X);
            this.f6577m = eVar;
        }
        this.f6578s++;
        this.f6572X++;
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p070i4.C1348n.e<K, V> m3706b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            i4.n$e r0 = r4.m3705a(r0, r1)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r2
        Le:
            if (r0 == 0) goto L1d
            V r3 = r0.f6593w1
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r3, r5)
            if (r5 == 0) goto L1d
            r1 = 1
        L1d:
            if (r1 == 0) goto L20
            r2 = r0
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p070i4.C1348n.m3706b(java.util.Map$Entry):i4.n$e");
    }

    /* renamed from: c */
    public final void m3707c(e<K, V> eVar, boolean z6) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f6590e;
            e<K, V> eVar3 = eVar.f6591m;
            int i7 = eVar2 != null ? eVar2.f6594x1 : 0;
            int i8 = eVar3 != null ? eVar3.f6594x1 : 0;
            int i9 = i7 - i8;
            if (i9 == -2) {
                e<K, V> eVar4 = eVar3.f6590e;
                e<K, V> eVar5 = eVar3.f6591m;
                int i10 = (eVar4 != null ? eVar4.f6594x1 : 0) - (eVar5 != null ? eVar5.f6594x1 : 0);
                if (i10 != -1 && (i10 != 0 || z6)) {
                    m3711g(eVar3);
                }
                m3710f(eVar);
                if (z6) {
                    return;
                }
            } else if (i9 == 2) {
                e<K, V> eVar6 = eVar2.f6590e;
                e<K, V> eVar7 = eVar2.f6591m;
                int i11 = (eVar6 != null ? eVar6.f6594x1 : 0) - (eVar7 != null ? eVar7.f6594x1 : 0);
                if (i11 != 1 && (i11 != 0 || z6)) {
                    m3710f(eVar2);
                }
                m3711g(eVar);
                if (z6) {
                    return;
                }
            } else if (i9 == 0) {
                eVar.f6594x1 = i7 + 1;
                if (z6) {
                    return;
                }
            } else {
                eVar.f6594x1 = Math.max(i7, i8) + 1;
                if (!z6) {
                    return;
                }
            }
            eVar = eVar.f6589c;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6577m = null;
        this.f6578s = 0;
        this.f6572X++;
        e<K, V> eVar = this.f6573Y;
        eVar.f6586X = eVar;
        eVar.f6592s = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsKey(java.lang.Object r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L8
            i4.n$e r2 = r1.m3705a(r2, r0)     // Catch: java.lang.ClassCastException -> L8
            goto L9
        L8:
            r2 = 0
        L9:
            if (r2 == 0) goto Lc
            r0 = 1
        Lc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p070i4.C1348n.containsKey(java.lang.Object):boolean");
    }

    /* renamed from: d */
    public final void m3708d(e<K, V> eVar, boolean z6) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i7;
        if (z6) {
            e<K, V> eVar4 = eVar.f6586X;
            eVar4.f6592s = eVar.f6592s;
            eVar.f6592s.f6586X = eVar4;
        }
        e<K, V> eVar5 = eVar.f6590e;
        e<K, V> eVar6 = eVar.f6591m;
        e<K, V> eVar7 = eVar.f6589c;
        int i8 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                m3709e(eVar, eVar5);
                eVar.f6590e = null;
            } else if (eVar6 != null) {
                m3709e(eVar, eVar6);
                eVar.f6591m = null;
            } else {
                m3709e(eVar, null);
            }
            m3707c(eVar7, false);
            this.f6578s--;
            this.f6572X++;
            return;
        }
        if (eVar5.f6594x1 > eVar6.f6594x1) {
            do {
                eVar3 = eVar5;
                eVar5 = eVar5.f6591m;
            } while (eVar5 != null);
        } else {
            do {
                eVar2 = eVar6;
                eVar6 = eVar6.f6590e;
            } while (eVar6 != null);
            eVar3 = eVar2;
        }
        m3708d(eVar3, false);
        e<K, V> eVar8 = eVar.f6590e;
        if (eVar8 != null) {
            i7 = eVar8.f6594x1;
            eVar3.f6590e = eVar8;
            eVar8.f6589c = eVar3;
            eVar.f6590e = null;
        } else {
            i7 = 0;
        }
        e<K, V> eVar9 = eVar.f6591m;
        if (eVar9 != null) {
            i8 = eVar9.f6594x1;
            eVar3.f6591m = eVar9;
            eVar9.f6589c = eVar3;
            eVar.f6591m = null;
        }
        eVar3.f6594x1 = Math.max(i7, i8) + 1;
        m3709e(eVar, eVar3);
    }

    /* renamed from: e */
    public final void m3709e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f6589c;
        eVar.f6589c = null;
        if (eVar2 != null) {
            eVar2.f6589c = eVar3;
        }
        if (eVar3 == null) {
            this.f6577m = eVar2;
        } else if (eVar3.f6590e == eVar) {
            eVar3.f6590e = eVar2;
        } else {
            eVar3.f6591m = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C1348n<K, V>.b bVar = this.f6574Z;
        if (bVar != null) {
            return bVar;
        }
        C1348n<K, V>.b bVar2 = new b();
        this.f6574Z = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    public final void m3710f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f6590e;
        e<K, V> eVar3 = eVar.f6591m;
        e<K, V> eVar4 = eVar3.f6590e;
        e<K, V> eVar5 = eVar3.f6591m;
        eVar.f6591m = eVar4;
        if (eVar4 != null) {
            eVar4.f6589c = eVar;
        }
        m3709e(eVar, eVar3);
        eVar3.f6590e = eVar;
        eVar.f6589c = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f6594x1 : 0, eVar4 != null ? eVar4.f6594x1 : 0) + 1;
        eVar.f6594x1 = max;
        eVar3.f6594x1 = Math.max(max, eVar5 != null ? eVar5.f6594x1 : 0) + 1;
    }

    /* renamed from: g */
    public final void m3711g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f6590e;
        e<K, V> eVar3 = eVar.f6591m;
        e<K, V> eVar4 = eVar2.f6590e;
        e<K, V> eVar5 = eVar2.f6591m;
        eVar.f6590e = eVar5;
        if (eVar5 != null) {
            eVar5.f6589c = eVar;
        }
        m3709e(eVar, eVar2);
        eVar2.f6591m = eVar;
        eVar.f6589c = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f6594x1 : 0, eVar5 != null ? eVar5.f6594x1 : 0) + 1;
        eVar.f6594x1 = max;
        eVar2.f6594x1 = Math.max(max, eVar4 != null ? eVar4.f6594x1 : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            i4.n$e r3 = r2.m3705a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            V r0 = r3.f6593w1
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p070i4.C1348n.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        C1348n<K, V>.c cVar = this.f6579w1;
        if (cVar != null) {
            return cVar;
        }
        C1348n<K, V>.c cVar2 = new c();
        this.f6579w1 = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k7, V v5) {
        if (k7 == null) {
            throw new NullPointerException("key == null");
        }
        if (v5 == null && !this.f6576e) {
            throw new NullPointerException("value == null");
        }
        e<K, V> m3705a = m3705a(k7, true);
        V v7 = m3705a.f6593w1;
        m3705a.f6593w1 = v5;
        return v7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            r1 = 0
            i4.n$e r3 = r2.m3705a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto Lb
        L9:
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto L11
            r1 = 1
            r2.m3708d(r3, r1)
        L11:
            if (r3 == 0) goto L15
            V r0 = r3.f6593w1
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p070i4.C1348n.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6578s;
    }
}
