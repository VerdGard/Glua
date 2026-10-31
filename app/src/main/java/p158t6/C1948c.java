package p158t6;

import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p036e2.C1109v5;
import p134q6.C1806b;
import p142r6.C1852i;

/* renamed from: t6.c */
/* loaded from: classes.dex */
public final class C1948c extends ArrayList<C1852i> {
    public C1948c() {
    }

    public C1948c(int i7) {
        super(i7);
    }

    public C1948c(List<C1852i> list) {
        super(list);
    }

    /* renamed from: a */
    public final void m4547a() {
        C0143v.m421S("dd");
        AbstractC1949d m4551h = C1951f.m4551h("dd");
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<C1852i> it = iterator();
        while (it.hasNext()) {
            C1852i next = it.next();
            C0143v.m423U(m4551h);
            C0143v.m423U(next);
            C1948c c1948c = new C1948c();
            C1109v5.m3257u(new C1946a(next, c1948c, m4551h), next);
            Iterator<C1852i> it2 = c1948c.iterator();
            while (it2.hasNext()) {
                C1852i next2 = it2.next();
                if (!identityHashMap.containsKey(next2)) {
                    arrayList.add(next2);
                    identityHashMap.put(next2, Boolean.TRUE);
                }
            }
        }
        new C1948c(arrayList);
    }

    /* renamed from: b */
    public final String m4548b() {
        StringBuilder m4257a = C1806b.m4257a();
        Iterator<C1852i> it = iterator();
        while (it.hasNext()) {
            C1852i next = it.next();
            if (m4257a.length() != 0) {
                m4257a.append(" ");
            }
            m4257a.append(next.m4364H());
        }
        return C1806b.m4263g(m4257a);
    }

    @Override // java.util.ArrayList
    public final Object clone() {
        C1948c c1948c = new C1948c(size());
        Iterator<C1852i> it = iterator();
        while (it.hasNext()) {
            c1948c.add(it.next().clone());
        }
        return c1948c;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder m4257a = C1806b.m4257a();
        Iterator<C1852i> it = iterator();
        while (it.hasNext()) {
            C1852i next = it.next();
            if (m4257a.length() != 0) {
                m4257a.append("\n");
            }
            m4257a.append(next.mo4351q());
        }
        return C1806b.m4263g(m4257a);
    }
}
