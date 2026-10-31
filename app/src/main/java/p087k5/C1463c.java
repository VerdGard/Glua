package p087k5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import p089l.C1476j;

/* renamed from: k5.c */
/* loaded from: classes.dex */
public final class C1463c {

    /* renamed from: a */
    public final ReentrantLock f6981a = new ReentrantLock();

    /* renamed from: b */
    public final C1476j f6982b = new C1476j();

    /* renamed from: c */
    public final ArrayList f6983c = new ArrayList();

    /* renamed from: d */
    public final int f6984d = 75;

    /* renamed from: a */
    public final C1461a m3843a(int i7) {
        C1461a m3844b = m3844b(i7);
        if (m3844b != null) {
            return m3844b;
        }
        ReentrantLock reentrantLock = this.f6981a;
        reentrantLock.lock();
        try {
            C1461a c1461a = new C1461a(i7);
            ArrayList arrayList = this.f6983c;
            arrayList.add(c1461a);
            while (arrayList.size() > this.f6984d && (!arrayList.isEmpty())) {
                arrayList.remove(0);
            }
            return c1461a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final C1461a m3844b(int i7) {
        Object obj;
        ReentrantLock reentrantLock = this.f6981a;
        reentrantLock.lock();
        ArrayList arrayList = this.f6983c;
        try {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C1461a) obj).f6976a == i7) {
                    break;
                }
            }
            C1461a c1461a = (C1461a) obj;
            if (c1461a != null) {
                arrayList.remove(c1461a);
                arrayList.add(c1461a);
            }
            return (C1461a) obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
