package p036e2;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: e2.k2 */
/* loaded from: classes.dex */
public final class RunnableC1029k2 implements Runnable {

    /* renamed from: X */
    public final /* synthetic */ C1085s2 f5207X;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f5208c;

    /* renamed from: e */
    public final /* synthetic */ long f5209e;

    /* renamed from: m */
    public final /* synthetic */ ArrayList f5210m;

    /* renamed from: s */
    public final /* synthetic */ Activity f5211s;

    /* renamed from: e2.k2$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 471
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p036e2.RunnableC1029k2.a.run():void");
        }
    }

    public RunnableC1029k2(C1085s2 c1085s2, ArrayList arrayList, long j7, ArrayList arrayList2, Activity activity) {
        this.f5207X = c1085s2;
        this.f5208c = arrayList;
        this.f5209e = j7;
        this.f5210m = arrayList2;
        this.f5211s = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewTreeObserver viewTreeObserver;
        WeakReference<View> weakReference;
        Iterator it = this.f5208c.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C1085s2 c1085s2 = this.f5207X;
            if (!hasNext) {
                c1085s2.f5410c.post(new a());
                return;
            }
            View view = (View) it.next();
            if (c1085s2.f5426s == null) {
                c1085s2.f5426s = new ViewTreeObserverOnScrollChangedListenerC1008h2(c1085s2);
            }
            ViewTreeObserverOnScrollChangedListenerC1008h2 viewTreeObserverOnScrollChangedListenerC1008h2 = c1085s2.f5426s;
            if (view != null) {
                boolean z6 = false;
                List<WeakReference<View>> list = c1085s2.f5412e;
                if (list != null && list.size() > 0) {
                    int size = list.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        }
                        try {
                            weakReference = list.get(i7);
                        } catch (Exception unused) {
                            weakReference = null;
                        }
                        if (weakReference != null && view == weakReference.get()) {
                            z6 = true;
                            break;
                        }
                        i7++;
                    }
                }
                if (!z6 && !c1085s2.m3181c(view) && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive() && viewTreeObserverOnScrollChangedListenerC1008h2 != null && list != null) {
                    try {
                        viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1008h2);
                        list.add(new WeakReference<>(view));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }
}
