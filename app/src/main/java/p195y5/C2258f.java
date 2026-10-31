package p195y5;

import androidx.activity.C0143v;
import java.util.ArrayList;
import p032d6.C0898f;
import p056g6.C1265b;
import p056g6.C1266c;
import p087k5.C1462b;

/* renamed from: y5.f */
/* loaded from: classes.dex */
public class C2258f extends C2257e {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F0 */
    public static final void m5467F0(ArrayList arrayList, C1462b c1462b) {
        int m406E;
        C0898f.m2606e(arrayList, "<this>");
        int i7 = 0;
        C1266c c1266c = new C1266c(0, C0143v.m406E(arrayList));
        C1265b c1265b = new C1265b(0, c1266c.f6306e, c1266c.f6307m);
        while (c1265b.f6310m) {
            int nextInt = c1265b.nextInt();
            Object obj = arrayList.get(nextInt);
            if (!((Boolean) c1462b.mo216c(obj)).booleanValue()) {
                if (i7 != nextInt) {
                    arrayList.set(i7, obj);
                }
                i7++;
            }
        }
        if (i7 >= arrayList.size() || i7 > (m406E = C0143v.m406E(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(m406E);
            if (m406E == i7) {
                return;
            } else {
                m406E--;
            }
        }
    }
}
