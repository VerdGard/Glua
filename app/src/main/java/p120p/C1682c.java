package p120p;

import android.ext.Tools;
import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.HashSet;
import p002a1.C0017d;
import p035e1.C0955g;
import p089l.C1481o;
import p130q2.C1742c;
import p184x2.InterfaceC2189a;

/* renamed from: p.c */
/* loaded from: classes.dex */
public final class C1682c implements InterfaceC2189a {

    /* renamed from: a */
    public final Object f7567a;

    /* renamed from: b */
    public final Object f7568b;

    /* renamed from: c */
    public final Object f7569c;

    /* renamed from: d */
    public Object f7570d;

    public C1682c(int i7) {
        if (i7 != 1) {
            this.f7567a = new C1684e(Tools.Semaphore.f160S8, 0);
            this.f7568b = new C1684e(Tools.Semaphore.f160S8, 0);
            this.f7569c = new C1684e(Tools.Semaphore.f160S8, 0);
            this.f7570d = new C1687h[32];
            return;
        }
        this.f7567a = new C1684e(10, 1);
        this.f7568b = new C1481o();
        this.f7569c = new ArrayList();
        this.f7570d = new HashSet();
    }

    public /* synthetic */ C1682c(C1742c c1742c, C1742c c1742c2) {
        C0017d c0017d = new C0017d();
        this.f7567a = new C0143v();
        this.f7568b = c0017d;
        this.f7569c = new C0955g(c1742c.m4208a(), 4, c1742c2.m4208a());
        this.f7570d = c1742c.m4210c();
    }

    /* renamed from: a */
    public final void m4085a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1481o) this.f7568b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                m4085a(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
