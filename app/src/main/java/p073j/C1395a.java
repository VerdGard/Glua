package p073j;

import java.util.HashMap;
import p073j.C1396b;

/* renamed from: j.a */
/* loaded from: classes.dex */
public final class C1395a<K, V> extends C1396b<K, V> {

    /* renamed from: X */
    public final HashMap<K, C1396b.c<K, V>> f6720X = new HashMap<>();

    @Override // p073j.C1396b
    /* renamed from: a */
    public final C1396b.c<K, V> mo3743a(K k7) {
        return this.f6720X.get(k7);
    }

    @Override // p073j.C1396b
    /* renamed from: b */
    public final V mo3744b(K k7) {
        V v5 = (V) super.mo3744b(k7);
        this.f6720X.remove(k7);
        return v5;
    }

    /* renamed from: c */
    public final V m3745c(K k7, V v5) {
        C1396b.c<K, V> mo3743a = mo3743a(k7);
        if (mo3743a != null) {
            return mo3743a.f6726e;
        }
        HashMap<K, C1396b.c<K, V>> hashMap = this.f6720X;
        C1396b.c<K, V> cVar = new C1396b.c<>(k7, v5);
        this.f6724s++;
        C1396b.c<K, V> cVar2 = this.f6722e;
        if (cVar2 == null) {
            this.f6721c = cVar;
        } else {
            cVar2.f6727m = cVar;
            cVar.f6728s = cVar2;
        }
        this.f6722e = cVar;
        hashMap.put(k7, cVar);
        return null;
    }
}
