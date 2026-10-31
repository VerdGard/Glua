package p132q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p147s3.C1882d;

/* renamed from: q4.p */
/* loaded from: classes.dex */
public final class C1787p {

    /* renamed from: a */
    public final HashMap f8147a;

    /* renamed from: b */
    public final ReentrantReadWriteLock f8148b;

    /* renamed from: c */
    public final C1787p f8149c;

    /* renamed from: d */
    public final Vector f8150d;

    /* renamed from: e */
    public final InterfaceC1788q<?>[][] f8151e;

    /* renamed from: f */
    public boolean f8152f;

    /* renamed from: q4.p$a */
    public interface a<T extends AbstractC1786o> {
        /* renamed from: c */
        void mo3554c(T t7);
    }

    /* renamed from: q4.p$b */
    public static class b<T extends AbstractC1786o> {

        /* renamed from: a */
        public final ReentrantReadWriteLock f8153a = new ReentrantReadWriteLock();

        /* renamed from: b */
        public final ArrayList f8154b = new ArrayList();
    }

    public C1787p() {
        this(null);
    }

    public C1787p(C1787p c1787p) {
        this.f8151e = new InterfaceC1788q[5][];
        this.f8152f = true;
        this.f8147a = new HashMap();
        this.f8149c = c1787p;
        this.f8148b = new ReentrantReadWriteLock();
        this.f8150d = new Vector();
        if (c1787p != null) {
            c1787p.f8150d.add(this);
        }
    }

    /* renamed from: a */
    public final <T extends AbstractC1786o> int m4244a(T t7) {
        int i7;
        LinkedList linkedList;
        InterfaceC1788q<?>[] interfaceC1788qArr;
        C1787p c1787p;
        if (!this.f8152f) {
            return t7.f8146b;
        }
        b<T> m4245b = m4245b(t7.getClass());
        m4245b.f8153a.readLock().lock();
        try {
            int size = m4245b.f8154b.size();
            synchronized (this) {
                int i8 = 0;
                while (true) {
                    InterfaceC1788q<?>[][] interfaceC1788qArr2 = this.f8151e;
                    linkedList = null;
                    if (i8 >= interfaceC1788qArr2.length) {
                        interfaceC1788qArr = null;
                        break;
                    }
                    interfaceC1788qArr = interfaceC1788qArr2[i8];
                    if (interfaceC1788qArr != null && interfaceC1788qArr.length >= size) {
                        interfaceC1788qArr2[i8] = null;
                        break;
                    }
                    i8++;
                }
            }
            if (interfaceC1788qArr == null) {
                interfaceC1788qArr = new InterfaceC1788q[size];
            }
            m4245b.f8154b.toArray(interfaceC1788qArr);
            try {
                C1773b0 c1773b0 = new C1773b0();
                LinkedList linkedList2 = null;
                for (int i9 = 0; i9 < size; i9++) {
                    try {
                        if ((t7.f8146b & 1) != 0) {
                            break;
                        }
                        InterfaceC1788q<?> interfaceC1788q = interfaceC1788qArr[i9];
                        interfaceC1788q.mo2065d(t7, c1773b0);
                        if (c1773b0.f8130a) {
                            if (linkedList2 == null) {
                                linkedList2 = new LinkedList();
                            }
                            linkedList2.add(interfaceC1788q);
                        }
                        c1773b0.f8130a = false;
                    } catch (Throwable th) {
                        th = th;
                        linkedList = linkedList2;
                        if (linkedList != null) {
                            m4245b.f8153a.writeLock().lock();
                            try {
                                m4245b.f8154b.removeAll(linkedList);
                            } finally {
                            }
                        }
                        m4246c(interfaceC1788qArr);
                        throw th;
                    }
                }
                if (linkedList2 != null) {
                    m4245b.f8153a.writeLock().lock();
                    try {
                        m4245b.f8154b.removeAll(linkedList2);
                    } finally {
                    }
                }
                m4246c(interfaceC1788qArr);
                for (i7 = 0; i7 < this.f8150d.size() && (t7.f8146b & 1) == 0; i7++) {
                    try {
                        c1787p = (C1787p) this.f8150d.get(i7);
                    } catch (IndexOutOfBoundsException unused) {
                        c1787p = null;
                    }
                    if (c1787p != null) {
                        c1787p.m4244a(t7);
                    }
                }
                return t7.f8146b;
            } catch (Throwable th2) {
                th = th2;
            }
        } finally {
            m4245b.f8153a.readLock().unlock();
        }
    }

    /* renamed from: b */
    public final <T extends AbstractC1786o> b<T> m4245b(Class<T> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f8148b;
        reentrantReadWriteLock.readLock().lock();
        HashMap hashMap = this.f8147a;
        try {
            b<T> bVar = (b) hashMap.get(cls);
            if (bVar == null) {
                reentrantReadWriteLock.writeLock().lock();
                try {
                    bVar = (b) hashMap.get(cls);
                    if (bVar == null) {
                        bVar = new b<>();
                        hashMap.put(cls, bVar);
                    }
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            return bVar;
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000b, code lost:
    
        java.util.Arrays.fill(r4, (java.lang.Object) null);
        r3.f8151e[r0] = r4;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m4246c(p132q4.InterfaceC1788q<?>[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
        L2:
            q4.q<?>[][] r1 = r3.f8151e     // Catch: java.lang.Throwable -> L19
            int r2 = r1.length     // Catch: java.lang.Throwable -> L19
            if (r0 >= r2) goto L17
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L14
            r1 = 0
            java.util.Arrays.fill(r4, r1)     // Catch: java.lang.Throwable -> L19
            q4.q<?>[][] r1 = r3.f8151e     // Catch: java.lang.Throwable -> L19
            r1[r0] = r4     // Catch: java.lang.Throwable -> L19
            goto L17
        L14:
            int r0 = r0 + 1
            goto L2
        L17:
            monitor-exit(r3)
            return
        L19:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p132q4.C1787p.m4246c(q4.q[]):void");
    }

    /* renamed from: d */
    public final void m4247d(boolean z6) {
        if (this.f8149c == null && !z6) {
            throw new IllegalStateException("The event manager is set to be root, and can not be disabled");
        }
        this.f8152f = z6;
    }

    /* renamed from: e */
    public final void m4248e(Class cls, a aVar) {
        m4249f(cls, new C1882d(1, aVar));
    }

    /* renamed from: f */
    public final <T extends AbstractC1786o> C1771a0<T> m4249f(Class<T> cls, InterfaceC1788q<T> interfaceC1788q) {
        b<T> m4245b = m4245b(cls);
        ReentrantReadWriteLock reentrantReadWriteLock = m4245b.f8153a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            ArrayList arrayList = m4245b.f8154b;
            if (arrayList.contains(interfaceC1788q)) {
                return new C1771a0<>(interfaceC1788q);
            }
            arrayList.add(interfaceC1788q);
            reentrantReadWriteLock.writeLock().unlock();
            return new C1771a0<>(interfaceC1788q);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
