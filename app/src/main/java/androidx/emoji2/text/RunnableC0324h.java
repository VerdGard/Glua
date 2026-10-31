package androidx.emoji2.text;

import androidx.emoji2.text.C0323g;
import androidx.emoji2.text.C0329m;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p055g5.C1245b;
import p079j5.C1440i;

/* renamed from: androidx.emoji2.text.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0324h implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f1574c;

    /* renamed from: e */
    public final /* synthetic */ Object f1575e;

    /* renamed from: m */
    public final /* synthetic */ Object f1576m;

    /* renamed from: s */
    public final /* synthetic */ Object f1577s;

    public /* synthetic */ RunnableC0324h(Object obj, Object obj2, Object obj3, int i7) {
        this.f1574c = i7;
        this.f1575e = obj;
        this.f1576m = obj2;
        this.f1577s = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1574c) {
            case 0:
                EmojiCompatInitializer.C0315b c0315b = (EmojiCompatInitializer.C0315b) this.f1575e;
                C0323g.h hVar = (C0323g.h) this.f1576m;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1577s;
                c0315b.getClass();
                try {
                    C0329m m1098a = C0320d.m1098a(c0315b.f1551a);
                    if (m1098a == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0329m.b bVar = (C0329m.b) m1098a.f1569a;
                    synchronized (bVar.f1602d) {
                        bVar.f1604f = threadPoolExecutor;
                    }
                    m1098a.f1569a.mo1080a(new C0325i(hVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    hVar.mo1100a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                C1440i c1440i = (C1440i) this.f1575e;
                C1245b c1245b = (C1245b) this.f1576m;
                List list = (List) this.f1577s;
                int i7 = C1440i.f6911Z;
                if (c1440i.f6872c != c1245b) {
                    return;
                }
                List<C1440i.a> list2 = c1440i.f6913Y;
                if (list2 != null) {
                    list2.clear();
                } else {
                    c1440i.f6913Y = new ArrayList();
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c1440i.f6913Y.addAll(((C1440i.d) it.next()).f6928e);
                }
                c1245b.setLayoutBusy(false);
                c1245b.getEventHandler().m3568g(0.0f, 0.0f, false);
                return;
        }
    }
}
