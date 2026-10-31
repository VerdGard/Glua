package p089l;

import androidx.activity.C0143v;
import p032d6.C0898f;
import p097m.C1541a;

/* renamed from: l.i */
/* loaded from: classes.dex */
public class C1475i<K, V> {

    /* renamed from: a */
    public final int f7034a;

    /* renamed from: b */
    public final C1541a<K, V> f7035b;

    /* renamed from: c */
    public final C0143v f7036c;

    /* renamed from: d */
    public int f7037d;

    /* renamed from: e */
    public int f7038e;

    /* renamed from: f */
    public int f7039f;

    public C1475i(int i7) {
        this.f7034a = i7;
        int i8 = 0;
        if (!(i7 > 0)) {
            C0143v.m476z0("maxSize <= 0");
            throw null;
        }
        this.f7035b = new C1541a<>();
        this.f7036c = new C0143v(i8);
    }

    /* renamed from: a */
    public final V m3862a(K k7) {
        C0898f.m2606e(k7, "key");
        synchronized (this.f7036c) {
            C1541a<K, V> c1541a = this.f7035b;
            c1541a.getClass();
            V v5 = c1541a.f7203a.get(k7);
            if (v5 != null) {
                this.f7038e++;
                return v5;
            }
            this.f7039f++;
            return null;
        }
    }

    /* renamed from: b */
    public final V m3863b(K k7, V v5) {
        V put;
        C0898f.m2606e(k7, "key");
        synchronized (this.f7036c) {
            this.f7037d++;
            C1541a<K, V> c1541a = this.f7035b;
            c1541a.getClass();
            put = c1541a.f7203a.put(k7, v5);
            if (put != null) {
                this.f7037d--;
            }
        }
        m3864c(this.f7034a);
        return put;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0013, B:12:0x001c, B:14:0x0020, B:16:0x002b, B:18:0x003c, B:22:0x005a, B:24:0x0060, B:30:0x0045, B:31:0x004a, B:33:0x0056, B:40:0x0086, B:41:0x008d), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3864c(int r7) {
        /*
            r6 = this;
        L0:
            androidx.activity.v r0 = r6.f7036c
            monitor-enter(r0)
            int r1 = r6.f7037d     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            r3 = 0
            if (r1 < 0) goto L19
            m.a<K, V> r1 = r6.f7035b     // Catch: java.lang.Throwable -> L8e
            java.util.LinkedHashMap<K, V> r1 = r1.f7203a     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L17
            int r1 = r6.f7037d     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L19
        L17:
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L86
            int r1 = r6.f7037d     // Catch: java.lang.Throwable -> L8e
            if (r1 <= r7) goto L84
            m.a<K, V> r1 = r6.f7035b     // Catch: java.lang.Throwable -> L8e
            java.util.LinkedHashMap<K, V> r1 = r1.f7203a     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L2b
            goto L84
        L2b:
            m.a<K, V> r1 = r6.f7035b     // Catch: java.lang.Throwable -> L8e
            java.util.LinkedHashMap<K, V> r1 = r1.f7203a     // Catch: java.lang.Throwable -> L8e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "map.entries"
            p032d6.C0898f.m2605d(r1, r4)     // Catch: java.lang.Throwable -> L8e
            boolean r4 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L4a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L8e
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L45
            goto L54
        L45:
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L8e
            goto L5a
        L4a:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8e
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r3 != 0) goto L56
        L54:
            r1 = 0
            goto L5a
        L56:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L8e
        L5a:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L60
            monitor-exit(r0)
            return
        L60:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L8e
            m.a<K, V> r4 = r6.f7035b     // Catch: java.lang.Throwable -> L8e
            r4.getClass()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "key"
            p032d6.C0898f.m2606e(r3, r5)     // Catch: java.lang.Throwable -> L8e
            java.util.LinkedHashMap<K, V> r4 = r4.f7203a     // Catch: java.lang.Throwable -> L8e
            r4.remove(r3)     // Catch: java.lang.Throwable -> L8e
            int r3 = r6.f7037d     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "value"
            p032d6.C0898f.m2606e(r1, r4)     // Catch: java.lang.Throwable -> L8e
            int r3 = r3 - r2
            r6.f7037d = r3     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)
            goto L0
        L84:
            monitor-exit(r0)
            return
        L86:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p089l.C1475i.m3864c(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.f7036c) {
            int i7 = this.f7038e;
            int i8 = this.f7039f + i7;
            str = "LruCache[maxSize=" + this.f7034a + ",hits=" + this.f7038e + ",misses=" + this.f7039f + ",hitRate=" + (i8 != 0 ? (i7 * 100) / i8 : 0) + "%]";
        }
        return str;
    }
}
