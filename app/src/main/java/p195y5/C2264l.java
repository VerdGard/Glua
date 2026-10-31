package p195y5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p002a1.C0017d;
import p032d6.C0898f;
import p187x5.C2197a;

/* renamed from: y5.l */
/* loaded from: classes.dex */
public class C2264l extends C0017d {
    /* renamed from: W */
    public static final Map m5468W(ArrayList arrayList) {
        C2261i c2261i = C2261i.f10277c;
        int size = arrayList.size();
        if (size == 0) {
            return c2261i;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C0017d.m67F(arrayList.size()));
            m5469X(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        C2197a c2197a = (C2197a) arrayList.get(0);
        C0898f.m2606e(c2197a, "pair");
        Map singletonMap = Collections.singletonMap(c2197a.f9967c, c2197a.f9968e);
        C0898f.m2605d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: X */
    public static final void m5469X(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2197a c2197a = (C2197a) it.next();
            linkedHashMap.put(c2197a.f9967c, c2197a.f9968e);
        }
    }
}
