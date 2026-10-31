package p036e2;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e2.d2 */
/* loaded from: classes.dex */
public final class RunnableC0980d2 implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ WeakReference f5004c;

    /* renamed from: e */
    public final /* synthetic */ long f5005e;

    /* renamed from: m */
    public final /* synthetic */ C1085s2 f5006m;

    public RunnableC0980d2(C1085s2 c1085s2, WeakReference weakReference, long j7) {
        this.f5006m = c1085s2;
        this.f5004c = weakReference;
        this.f5005e = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = (Activity) this.f5004c.get();
        if (activity == null) {
            return;
        }
        long j7 = this.f5005e;
        C1085s2 c1085s2 = this.f5006m;
        c1085s2.getClass();
        HashMap<View, Integer> hashMap = new HashMap<>();
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        View m3190a = C1086s3.m3190a(activity);
        c1085s2.m3180b(activity, m3190a, hashMap, arrayList, arrayList2);
        if (c1085s2.f5421n && !c1085s2.f5422o) {
            long j8 = j7 - c1085s2.f5414g;
            if (j8 > 0 && j8 > 50) {
                ArrayList arrayList3 = new ArrayList(hashMap.entrySet());
                Collections.sort(arrayList3, new C1036l2());
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new WeakReference(((Map.Entry) it.next()).getKey()));
                }
                arrayList4.add(new WeakReference(m3190a));
                c1085s2.f5423p = arrayList4;
                c1085s2.f5422o = true;
            }
        }
        activity.runOnUiThread(new RunnableC1029k2(c1085s2, arrayList2, j7, arrayList, activity));
    }
}
