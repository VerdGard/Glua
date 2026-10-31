package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC0471e implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f2374c;

    /* renamed from: e */
    public final /* synthetic */ C0477k f2375e;

    public RunnableC0471e(C0477k c0477k, ArrayList arrayList) {
        this.f2375e = c0477k;
        this.f2374c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2374c;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C0477k c0477k = this.f2375e;
            if (!hasNext) {
                arrayList.clear();
                c0477k.f2403l.remove(arrayList);
                return;
            }
            RecyclerView.AbstractC0432a0 abstractC0432a0 = (RecyclerView.AbstractC0432a0) it.next();
            c0477k.getClass();
            View view = abstractC0432a0.f2177a;
            ViewPropertyAnimator animate = view.animate();
            c0477k.f2406o.add(abstractC0432a0);
            animate.alpha(1.0f).setDuration(c0477k.f2201c).setListener(new C0473g(view, animate, c0477k, abstractC0432a0)).start();
        }
    }
}
