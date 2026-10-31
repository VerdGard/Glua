package p036e2;

import java.util.Comparator;
import java.util.Map;
import p036e2.C1027k0;

/* renamed from: e2.l0 */
/* loaded from: classes.dex */
public final class C1034l0 implements Comparator<Map.Entry<C1027k0.a, Integer>> {
    @Override // java.util.Comparator
    public final int compare(Map.Entry<C1027k0.a, Integer> entry, Map.Entry<C1027k0.a, Integer> entry2) {
        Map.Entry<C1027k0.a, Integer> entry3 = entry;
        Map.Entry<C1027k0.a, Integer> entry4 = entry2;
        int intValue = entry4.getValue().intValue() - entry3.getValue().intValue();
        if (intValue != 0) {
            return intValue;
        }
        return entry3.getKey().f5193c - entry4.getKey().f5193c;
    }
}
