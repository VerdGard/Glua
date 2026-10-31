package p171v4;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.locks.ReentrantLock;
import p071i5.RunnableC1372i;

/* renamed from: v4.h */
/* loaded from: classes.dex */
public final class C2024h {

    /* renamed from: d */
    public final Handler f9195d;

    /* renamed from: e */
    public final Runnable f9196e;

    /* renamed from: f */
    public final int f9197f;

    /* renamed from: g */
    public Comparator<AbstractC2020d> f9198g;

    /* renamed from: i */
    public boolean f9200i = false;

    /* renamed from: a */
    public final ArrayList f9192a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f9193b = new ArrayList();

    /* renamed from: c */
    public final ReentrantLock f9194c = new ReentrantLock(true);

    /* renamed from: h */
    public final int f9199h = 5;

    public C2024h(Handler handler, RunnableC1372i runnableC1372i, int i7) {
        this.f9195d = handler;
        this.f9196e = runnableC1372i;
        this.f9197f = i7;
    }

    /* renamed from: a */
    public final void m4915a(C2031o c2031o) {
        m4916b();
        if (this.f9200i) {
            return;
        }
        ReentrantLock reentrantLock = this.f9194c;
        reentrantLock.lock();
        ArrayList arrayList = this.f9193b;
        try {
            arrayList.add(c2031o);
            reentrantLock.unlock();
            if (arrayList.size() >= this.f9199h) {
                m4917c(false);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m4916b() {
        if (Thread.interrupted() || this.f9200i) {
            this.f9200i = true;
            if (this.f9197f <= 1) {
                throw new C2019c();
            }
        }
    }

    /* renamed from: c */
    public final void m4917c(final boolean z6) {
        if (this.f9200i) {
            return;
        }
        this.f9195d.post(new Runnable() { // from class: v4.f
            @Override // java.lang.Runnable
            public final void run() {
                boolean tryLock;
                C2024h c2024h = C2024h.this;
                boolean z7 = c2024h.f9200i;
                Runnable runnable = c2024h.f9196e;
                if (z7) {
                    runnable.run();
                    return;
                }
                ReentrantLock reentrantLock = c2024h.f9194c;
                if (z6) {
                    reentrantLock.lock();
                    tryLock = true;
                } else {
                    tryLock = reentrantLock.tryLock();
                }
                if (tryLock) {
                    ArrayList arrayList = c2024h.f9193b;
                    try {
                        if (!arrayList.isEmpty()) {
                            Comparator<AbstractC2020d> comparator = c2024h.f9198g;
                            ArrayList arrayList2 = c2024h.f9192a;
                            if (comparator != null) {
                                while (!arrayList.isEmpty()) {
                                    AbstractC2020d abstractC2020d = (AbstractC2020d) arrayList.remove(0);
                                    int size = arrayList2.size();
                                    int i7 = size;
                                    int i8 = 0;
                                    while (i8 <= i7) {
                                        int i9 = (i8 + i7) / 2;
                                        if (i9 >= 0 && i9 < size) {
                                            int compare = comparator.compare((AbstractC2020d) arrayList2.get(i9), abstractC2020d);
                                            if (compare < 0) {
                                                i8 = i9 + 1;
                                            } else if (compare > 0) {
                                                i7 = i9 - 1;
                                            }
                                        }
                                        i8 = i9;
                                        break;
                                    }
                                    arrayList2.add(Math.max(0, Math.min(size, i8)), abstractC2020d);
                                }
                            } else {
                                arrayList2.addAll(arrayList);
                                arrayList.clear();
                            }
                        }
                        runnable.run();
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            }
        });
    }
}
