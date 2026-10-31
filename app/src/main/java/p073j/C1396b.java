package p073j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: j.b */
/* loaded from: classes.dex */
public class C1396b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: c */
    public c<K, V> f6721c;

    /* renamed from: e */
    public c<K, V> f6722e;

    /* renamed from: m */
    public final WeakHashMap<f<K, V>, Boolean> f6723m = new WeakHashMap<>();

    /* renamed from: s */
    public int f6724s = 0;

    /* renamed from: j.b$a */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p073j.C1396b.e
        /* renamed from: b */
        public final c<K, V> mo3746b(c<K, V> cVar) {
            return cVar.f6728s;
        }

        @Override // p073j.C1396b.e
        /* renamed from: c */
        public final c<K, V> mo3747c(c<K, V> cVar) {
            return cVar.f6727m;
        }
    }

    /* renamed from: j.b$b */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p073j.C1396b.e
        /* renamed from: b */
        public final c<K, V> mo3746b(c<K, V> cVar) {
            return cVar.f6727m;
        }

        @Override // p073j.C1396b.e
        /* renamed from: c */
        public final c<K, V> mo3747c(c<K, V> cVar) {
            return cVar.f6728s;
        }
    }

    /* renamed from: j.b$c */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: c */
        public final K f6725c;

        /* renamed from: e */
        public final V f6726e;

        /* renamed from: m */
        public c<K, V> f6727m;

        /* renamed from: s */
        public c<K, V> f6728s;

        public c(K k7, V v5) {
            this.f6725c = k7;
            this.f6726e = v5;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f6725c.equals(cVar.f6725c) && this.f6726e.equals(cVar.f6726e);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f6725c;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f6726e;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f6725c.hashCode() ^ this.f6726e.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v5) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f6725c + "=" + this.f6726e;
        }
    }

    /* renamed from: j.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: c */
        public c<K, V> f6729c;

        /* renamed from: e */
        public boolean f6730e = true;

        public d() {
        }

        @Override // p073j.C1396b.f
        /* renamed from: a */
        public final void mo3748a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f6729c;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f6728s;
                this.f6729c = cVar3;
                this.f6730e = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f6730e) {
                return C1396b.this.f6721c != null;
            }
            c<K, V> cVar = this.f6729c;
            return (cVar == null || cVar.f6727m == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f6730e) {
                this.f6730e = false;
                cVar = C1396b.this.f6721c;
            } else {
                c<K, V> cVar2 = this.f6729c;
                cVar = cVar2 != null ? cVar2.f6727m : null;
            }
            this.f6729c = cVar;
            return cVar;
        }
    }

    /* renamed from: j.b$e */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: c */
        public c<K, V> f6732c;

        /* renamed from: e */
        public c<K, V> f6733e;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f6732c = cVar2;
            this.f6733e = cVar;
        }

        @Override // p073j.C1396b.f
        /* renamed from: a */
        public final void mo3748a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f6732c == cVar && cVar == this.f6733e) {
                this.f6733e = null;
                this.f6732c = null;
            }
            c<K, V> cVar3 = this.f6732c;
            if (cVar3 == cVar) {
                this.f6732c = mo3746b(cVar3);
            }
            c<K, V> cVar4 = this.f6733e;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f6732c;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = mo3747c(cVar4);
                }
                this.f6733e = cVar2;
            }
        }

        /* renamed from: b */
        public abstract c<K, V> mo3746b(c<K, V> cVar);

        /* renamed from: c */
        public abstract c<K, V> mo3747c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f6733e != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar = this.f6733e;
            c<K, V> cVar2 = this.f6732c;
            this.f6733e = (cVar == cVar2 || cVar2 == null) ? null : mo3747c(cVar);
            return cVar;
        }
    }

    /* renamed from: j.b$f */
    public static abstract class f<K, V> {
        /* renamed from: a */
        public abstract void mo3748a(c<K, V> cVar);
    }

    /* renamed from: a */
    public c<K, V> mo3743a(K k7) {
        c<K, V> cVar = this.f6721c;
        while (cVar != null && !cVar.f6725c.equals(k7)) {
            cVar = cVar.f6727m;
        }
        return cVar;
    }

    /* renamed from: b */
    public V mo3744b(K k7) {
        c<K, V> mo3743a = mo3743a(k7);
        if (mo3743a == null) {
            return null;
        }
        this.f6724s--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f6723m;
        if (!weakHashMap.isEmpty()) {
            Iterator<f<K, V>> it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo3748a(mo3743a);
            }
        }
        c<K, V> cVar = mo3743a.f6728s;
        c<K, V> cVar2 = mo3743a.f6727m;
        if (cVar != null) {
            cVar.f6727m = cVar2;
        } else {
            this.f6721c = cVar2;
        }
        c<K, V> cVar3 = mo3743a.f6727m;
        if (cVar3 != null) {
            cVar3.f6728s = cVar;
        } else {
            this.f6722e = cVar;
        }
        mo3743a.f6727m = null;
        mo3743a.f6728s = null;
        return mo3743a.f6726e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p073j.C1396b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p073j.C1396b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j.b r7 = (p073j.C1396b) r7
            int r1 = r6.f6724s
            int r3 = r7.f6724s
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            j.b$e r3 = (p073j.C1396b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            j.b$e r4 = (p073j.C1396b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            j.b$e r7 = (p073j.C1396b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j.C1396b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i7 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i7;
            }
            i7 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f6721c, this.f6722e);
        this.f6723m.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
