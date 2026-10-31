package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0477k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public final class RunnableC0468c implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f2364c;

    /* renamed from: e */
    public final /* synthetic */ C0477k f2365e;

    public RunnableC0468c(C0477k c0477k, ArrayList arrayList) {
        this.f2365e = c0477k;
        this.f2364c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2364c;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C0477k c0477k = this.f2365e;
            if (!hasNext) {
                arrayList.clear();
                c0477k.f2404m.remove(arrayList);
                return;
            }
            C0477k.b bVar = (C0477k.b) it.next();
            RecyclerView.AbstractC0432a0 abstractC0432a0 = bVar.f2416a;
            c0477k.getClass();
            View view = abstractC0432a0.f2177a;
            int i7 = bVar.f2419d - bVar.f2417b;
            int i8 = bVar.f2420e - bVar.f2418c;
            if (i7 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i8 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            c0477k.f2407p.add(abstractC0432a0);
            animate.setDuration(c0477k.f2203e).setListener(new C0474h(c0477k, abstractC0432a0, i7, view, i8, animate)).start();
        }
    }
}
