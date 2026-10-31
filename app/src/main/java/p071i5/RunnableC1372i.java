package p071i5;

import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p171v4.AbstractC2020d;

/* renamed from: i5.i */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1372i implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f6668c;

    /* renamed from: e */
    public final /* synthetic */ C1374k f6669e;

    public /* synthetic */ RunnableC1372i(C1374k c1374k, int i7) {
        this.f6668c = i7;
        this.f6669e = c1374k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f6668c;
        C1374k c1374k = this.f6669e;
        switch (i7) {
            case 0:
                ArrayList arrayList = c1374k.f6677G1.f9192a;
                WeakReference<List<AbstractC2020d>> weakReference = c1374k.f6678H1;
                C1358b c1358b = c1374k.f6680J1;
                if (weakReference == null || weakReference.get() != arrayList) {
                    c1358b.f6695c = c1374k;
                    c1358b.f6696e = arrayList;
                    c1358b.notifyDataSetInvalidated();
                    c1374k.f6678H1 = new WeakReference<>(arrayList);
                } else {
                    c1358b.notifyDataSetChanged();
                }
                float count = c1358b.getCount() * ((int) TypedValue.applyDimension(1, 45.0f, c1358b.f6695c.f6672B1.getContext().getResources().getDisplayMetrics()));
                if (count == 0.0f) {
                    c1374k.m3733h();
                }
                c1374k.m3738m(true);
                int i8 = c1374k.f6471z1;
                int min = (int) Math.min(count, c1374k.f6675E1);
                c1374k.f6471z1 = i8;
                c1374k.f6460A1 = min;
                c1374k.m3614a(false);
                if (!c1374k.m3617d()) {
                    c1374k.m3736k();
                    break;
                }
                break;
            default:
                c1374k.m3733h();
                break;
        }
    }
}
