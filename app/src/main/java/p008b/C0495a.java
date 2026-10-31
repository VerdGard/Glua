package p008b;

import android.content.Intent;
import androidx.activity.result.AbstractC0136c;
import java.util.ArrayList;
import java.util.Iterator;
import p187x5.C2197a;
import p195y5.C2261i;
import p195y5.C2264l;

/* renamed from: b.a */
/* loaded from: classes.dex */
public final class C0495a extends AbstractC0136c {
    @Override // androidx.activity.result.AbstractC0136c
    /* renamed from: x */
    public final Object mo395x(Intent intent, int i7) {
        C2261i c2261i = C2261i.f10277c;
        if (i7 != -1 || intent == null) {
            return c2261i;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return c2261i;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i8 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i8 == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it = arrayList2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new C2197a(it.next(), it2.next()));
        }
        return C2264l.m5468W(arrayList3);
    }
}
