package p054g4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p070i4.C1338d;
import p070i4.C1345k;
import p070i4.C1347m;
import p078j4.AbstractC1424m;
import p078j4.C1412a;
import p078j4.C1413b;
import p078j4.C1414c;
import p078j4.C1415d;
import p078j4.C1417f;
import p078j4.C1419h;
import p078j4.C1421j;
import p078j4.C1423l;
import p078j4.C1427p;
import p078j4.C1428q;
import p078j4.C1429r;
import p102m4.C1554d;
import p110n4.C1644a;
import p117o4.C1667a;

/* renamed from: g4.h */
/* loaded from: classes.dex */
public final class C1226h {

    /* renamed from: a */
    public final ThreadLocal<Map<C1644a<?>, AbstractC1242x<?>>> f5970a;

    /* renamed from: b */
    public final ConcurrentHashMap f5971b;

    /* renamed from: c */
    public final C1338d f5972c;

    /* renamed from: d */
    public final C1415d f5973d;

    /* renamed from: e */
    public final List<InterfaceC1243y> f5974e;

    /* renamed from: g4.h$a */
    public static class a<T> extends AbstractC1424m<T> {

        /* renamed from: a */
        public AbstractC1242x<T> f5975a = null;

        @Override // p054g4.AbstractC1242x
        /* renamed from: a */
        public final T mo3442a(C1667a c1667a) {
            AbstractC1242x<T> abstractC1242x = this.f5975a;
            if (abstractC1242x != null) {
                return abstractC1242x.mo3442a(c1667a);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    public C1226h() {
        C1345k c1345k = C1345k.f6558Y;
        Map emptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.f5970a = new ThreadLocal<>();
        this.f5971b = new ConcurrentHashMap();
        C1338d c1338d = new C1338d(emptyMap, emptyList2);
        this.f5972c = c1338d;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1427p.f6827A);
        arrayList.add(C1421j.f6798b);
        arrayList.add(c1345k);
        arrayList.addAll(emptyList);
        arrayList.add(C1427p.f6844p);
        arrayList.add(C1427p.f6835g);
        arrayList.add(C1427p.f6832d);
        arrayList.add(C1427p.f6833e);
        arrayList.add(C1427p.f6834f);
        C1427p.b bVar = C1427p.f6839k;
        arrayList.add(new C1429r(Long.TYPE, Long.class, bVar));
        arrayList.add(new C1429r(Double.TYPE, Double.class, new C1222d()));
        arrayList.add(new C1429r(Float.TYPE, Float.class, new C1223e()));
        arrayList.add(C1419h.f6795b);
        arrayList.add(C1427p.f6836h);
        arrayList.add(C1427p.f6837i);
        arrayList.add(new C1428q(AtomicLong.class, new C1241w(new C1224f(bVar))));
        arrayList.add(new C1428q(AtomicLongArray.class, new C1241w(new C1225g(bVar))));
        arrayList.add(C1427p.f6838j);
        arrayList.add(C1427p.f6840l);
        arrayList.add(C1427p.f6845q);
        arrayList.add(C1427p.f6846r);
        arrayList.add(new C1428q(BigDecimal.class, C1427p.f6841m));
        arrayList.add(new C1428q(BigInteger.class, C1427p.f6842n));
        arrayList.add(new C1428q(C1347m.class, C1427p.f6843o));
        arrayList.add(C1427p.f6847s);
        arrayList.add(C1427p.f6848t);
        arrayList.add(C1427p.f6850v);
        arrayList.add(C1427p.f6851w);
        arrayList.add(C1427p.f6853y);
        arrayList.add(C1427p.f6849u);
        arrayList.add(C1427p.f6830b);
        arrayList.add(C1414c.f6782b);
        arrayList.add(C1427p.f6852x);
        if (C1554d.f7221a) {
            arrayList.add(C1554d.f7223c);
            arrayList.add(C1554d.f7222b);
            arrayList.add(C1554d.f7224d);
        }
        arrayList.add(C1412a.f6776c);
        arrayList.add(C1427p.f6829a);
        arrayList.add(new C1413b(c1338d));
        arrayList.add(new C1417f(c1338d));
        C1415d c1415d = new C1415d(c1338d);
        this.f5973d = c1415d;
        arrayList.add(c1415d);
        arrayList.add(C1427p.f6828B);
        arrayList.add(new C1423l(c1338d, c1345k, c1415d, emptyList2));
        this.f5974e = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T m3443a(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p054g4.C1226h.m3443a(java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* renamed from: b */
    public final <T> AbstractC1242x<T> m3444b(C1644a<T> c1644a) {
        boolean z6;
        ConcurrentHashMap concurrentHashMap = this.f5971b;
        AbstractC1242x<T> abstractC1242x = (AbstractC1242x) concurrentHashMap.get(c1644a);
        if (abstractC1242x != null) {
            return abstractC1242x;
        }
        ThreadLocal<Map<C1644a<?>, AbstractC1242x<?>>> threadLocal = this.f5970a;
        Map<C1644a<?>, AbstractC1242x<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z6 = true;
        } else {
            AbstractC1242x<T> abstractC1242x2 = (AbstractC1242x) map.get(c1644a);
            if (abstractC1242x2 != null) {
                return abstractC1242x2;
            }
            z6 = false;
        }
        try {
            a aVar = new a();
            map.put(c1644a, aVar);
            Iterator<InterfaceC1243y> it = this.f5974e.iterator();
            AbstractC1242x<T> abstractC1242x3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC1242x3 = it.next().mo3457a(this, c1644a);
                if (abstractC1242x3 != null) {
                    if (aVar.f5975a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    aVar.f5975a = abstractC1242x3;
                    map.put(c1644a, abstractC1242x3);
                }
            }
            if (abstractC1242x3 != null) {
                if (z6) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC1242x3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c1644a);
        } finally {
            if (z6) {
                threadLocal.remove();
            }
        }
    }

    /* renamed from: c */
    public final <T> AbstractC1242x<T> m3445c(InterfaceC1243y interfaceC1243y, C1644a<T> c1644a) {
        List<InterfaceC1243y> list = this.f5974e;
        if (!list.contains(interfaceC1243y)) {
            interfaceC1243y = this.f5973d;
        }
        boolean z6 = false;
        for (InterfaceC1243y interfaceC1243y2 : list) {
            if (z6) {
                AbstractC1242x<T> mo3457a = interfaceC1243y2.mo3457a(this, c1644a);
                if (mo3457a != null) {
                    return mo3457a;
                }
            } else if (interfaceC1243y2 == interfaceC1243y) {
                z6 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c1644a);
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f5974e + ",instanceCreators:" + this.f5972c + "}";
    }
}
