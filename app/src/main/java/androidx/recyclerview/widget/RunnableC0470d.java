package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0477k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
public final class RunnableC0470d implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f2372c;

    /* renamed from: e */
    public final /* synthetic */ C0477k f2373e;

    public RunnableC0470d(C0477k c0477k, ArrayList arrayList) {
        this.f2373e = c0477k;
        this.f2372c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2372c;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C0477k c0477k = this.f2373e;
            if (!hasNext) {
                arrayList.clear();
                c0477k.f2405n.remove(arrayList);
                return;
            }
            C0477k.a aVar = (C0477k.a) it.next();
            c0477k.getClass();
            RecyclerView.AbstractC0432a0 abstractC0432a0 = aVar.f2410a;
            View view = abstractC0432a0 == null ? null : abstractC0432a0.f2177a;
            RecyclerView.AbstractC0432a0 abstractC0432a02 = aVar.f2411b;
            View view2 = abstractC0432a02 != null ? abstractC0432a02.f2177a : null;
            ArrayList<RecyclerView.AbstractC0432a0> arrayList2 = c0477k.f2409r;
            long j7 = c0477k.f2204f;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(j7);
                arrayList2.add(aVar.f2410a);
                duration.translationX(aVar.f2414e - aVar.f2412c);
                duration.translationY(aVar.f2415f - aVar.f2413d);
                duration.alpha(0.0f).setListener(new C0475i(c0477k, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(aVar.f2411b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(j7).alpha(1.0f).setListener(new C0476j(c0477k, aVar, animate, view2)).start();
            }
        }
    }
}
