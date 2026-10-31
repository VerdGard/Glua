package p156t4;

import android.ext.Tools;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import androidx.activity.C0143v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p002a1.C0017d;
import p006a5.C0056f;
import p006a5.InterfaceC0053c;
import p006a5.InterfaceC0055e;
import p022c5.C0638b;
import p022c5.C0641e;
import p022c5.C0642f;
import p022c5.C0644h;
import p032d6.C0898f;
import p034e0.C0936o;
import p055g5.C1245b;
import p055g5.C1258o;
import p057h.AbstractC1268b;
import p087k5.C1464d;
import p087k5.C1465e;
import p191y1.C2224c;
import p191y1.C2230i;

/* renamed from: t4.b */
/* loaded from: classes.dex */
public abstract class AbstractC1927b<S, T> extends AbstractC1268b {

    /* renamed from: f */
    public static int f8694f;

    /* renamed from: d */
    public AbstractC1927b<S, T>.c f8695d;

    /* renamed from: e */
    public volatile long f8696e;

    /* renamed from: t4.b$a */
    public class a {

        /* renamed from: a */
        public final AbstractC1927b<S, T>.c f8697a;

        /* renamed from: b */
        public int f8698b;

        public a(AbstractC1927b<S, T>.c cVar) {
            this.f8697a = cVar;
        }

        /* renamed from: a */
        public final boolean m4539a() {
            return !(this.f8697a.f8713s != AbstractC1927b.this.f8696e || this.f8697a.f8711e || this.f8697a.isInterrupted());
        }
    }

    /* renamed from: t4.b$b */
    public static class b implements InterfaceC0055e {

        /* renamed from: b */
        public final ArrayList f8701b = new ArrayList(Tools.Semaphore.f159S7);

        /* renamed from: a */
        public final ReentrantLock f8700a = new ReentrantLock();

        /* renamed from: t4.b$b$a */
        public static class a {

            /* renamed from: a */
            public final ReentrantLock f8702a = new ReentrantLock();

            /* renamed from: b */
            public List<InterfaceC0053c> f8703b;

            public a(ArrayList arrayList) {
                this.f8703b = arrayList;
            }
        }

        /* renamed from: t4.b$b$b, reason: collision with other inner class name */
        public class C2302b {
            public C2302b() {
            }

            /* renamed from: a */
            public final void m4540a(int i7, ArrayList arrayList) {
                b bVar = b.this;
                ReentrantLock reentrantLock = bVar.f8700a;
                ReentrantLock reentrantLock2 = bVar.f8700a;
                reentrantLock.lock();
                try {
                    bVar.f8701b.add(i7, new a(arrayList));
                } finally {
                    reentrantLock2.unlock();
                }
            }

            /* renamed from: b */
            public final void m4541b(int i7) {
                b bVar = b.this;
                ReentrantLock reentrantLock = bVar.f8700a;
                ReentrantLock reentrantLock2 = bVar.f8700a;
                reentrantLock.lock();
                ArrayList arrayList = bVar.f8701b;
                try {
                    ReentrantLock reentrantLock3 = ((a) arrayList.get(i7)).f8702a;
                    reentrantLock3.lock();
                    try {
                        arrayList.remove(i7);
                    } finally {
                        reentrantLock3.unlock();
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }

            /* renamed from: c */
            public final void m4542c(int i7, ArrayList arrayList) {
                b bVar = b.this;
                ReentrantLock reentrantLock = bVar.f8700a;
                ReentrantLock reentrantLock2 = bVar.f8700a;
                reentrantLock.lock();
                while (true) {
                    ArrayList arrayList2 = bVar.f8701b;
                    try {
                        if (arrayList2.size() > i7) {
                            a aVar = (a) arrayList2.get(i7);
                            ReentrantLock reentrantLock3 = aVar.f8702a;
                            reentrantLock3.lock();
                            try {
                                aVar.f8703b = arrayList;
                                reentrantLock2.unlock();
                                return;
                            } finally {
                                reentrantLock3.unlock();
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(C0143v.m425W(5L, 0));
                        arrayList2.add(new a(arrayList3));
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
            }
        }

        /* renamed from: t4.b$b$c */
        public class c implements InterfaceC0055e.a {

            /* renamed from: a */
            public a f8705a;

            public c() {
            }

            @Override // p006a5.InterfaceC0055e.a
            /* renamed from: a */
            public final void mo155a(int i7) {
                boolean z6;
                if (i7 >= 0) {
                    b bVar = b.this;
                    ArrayList arrayList = bVar.f8701b;
                    ReentrantLock reentrantLock = bVar.f8700a;
                    if (i7 < arrayList.size()) {
                        a aVar = this.f8705a;
                        if (aVar != null) {
                            aVar.f8702a.unlock();
                        }
                        try {
                            z6 = reentrantLock.tryLock(100L, TimeUnit.MICROSECONDS);
                        } catch (InterruptedException e7) {
                            Log.w("LockedSpans", "failed to acquire the lock", e7);
                            Thread.currentThread().interrupt();
                            z6 = false;
                        }
                        if (z6) {
                            try {
                                a aVar2 = (a) bVar.f8701b.get(i7);
                                if (aVar2.f8702a.tryLock()) {
                                    this.f8705a = aVar2;
                                } else {
                                    this.f8705a = null;
                                }
                                return;
                            } finally {
                                reentrantLock.unlock();
                            }
                        }
                        this.f8705a = null;
                    }
                }
                a aVar3 = this.f8705a;
                if (aVar3 != null) {
                    aVar3.f8702a.unlock();
                }
                this.f8705a = null;
            }

            @Override // p006a5.InterfaceC0055e.a
            /* renamed from: b */
            public final InterfaceC0053c mo156b(int i7) {
                a aVar = this.f8705a;
                return aVar == null ? C0143v.m425W(5L, 0) : aVar.f8703b.get(i7);
            }

            @Override // p006a5.InterfaceC0055e.a
            /* renamed from: c */
            public final int mo157c() {
                a aVar = this.f8705a;
                if (aVar == null) {
                    return 1;
                }
                return aVar.f8703b.size();
            }

            /* renamed from: d */
            public final List<InterfaceC0053c> m4543d(int i7) {
                boolean z6;
                b bVar = b.this;
                ArrayList arrayList = new ArrayList();
                try {
                    z6 = bVar.f8700a.tryLock(1L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e7) {
                    Log.w("LockedSpans", "failed to acquire the lock", e7);
                    z6 = false;
                }
                if (z6) {
                    try {
                        a aVar = i7 < bVar.f8701b.size() ? (a) bVar.f8701b.get(i7) : null;
                        if (aVar != null) {
                            ReentrantLock reentrantLock = aVar.f8702a;
                            if (reentrantLock.tryLock()) {
                                try {
                                    return Collections.unmodifiableList(aVar.f8703b);
                                } finally {
                                    reentrantLock.unlock();
                                }
                            }
                        }
                    } finally {
                        bVar.f8700a.unlock();
                    }
                }
                arrayList.add(mo156b(0));
                return arrayList;
            }
        }
    }

    /* renamed from: t4.b$c */
    public final class c extends Thread {

        /* renamed from: Y */
        public C0056f f8708Y;

        /* renamed from: Z */
        public b f8709Z;

        /* renamed from: e */
        public volatile boolean f8711e;

        /* renamed from: m */
        public C0641e f8712m;

        /* renamed from: s */
        public long f8713s;

        /* renamed from: w1 */
        public final AbstractC1927b<S, T>.a f8714w1;

        /* renamed from: c */
        public final LinkedBlockingQueue f8710c = new LinkedBlockingQueue();

        /* renamed from: X */
        public final ArrayList f8707X = new ArrayList();

        public c() {
            this.f8714w1 = new a(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final boolean m4544a(Message message) {
            int i7;
            int i8;
            Object obj;
            Object obj2;
            try {
                this.f8713s = AbstractC1927b.this.f8696e;
                this.f8714w1.f8698b = Integer.MAX_VALUE;
                switch (message.what) {
                    case 11451401:
                        this.f8712m = (C0641e) message.obj;
                        if (!this.f8711e && !isInterrupted()) {
                            m4545b();
                        }
                        return true;
                    case 11451402:
                        if (this.f8711e || isInterrupted()) {
                            i7 = 0;
                            i8 = 0;
                        } else {
                            d dVar = (d) message.obj;
                            long j7 = dVar.f8716a;
                            i8 = (int) (j7 >> 32);
                            int i9 = (int) (dVar.f8717b >> 32);
                            if (dVar.f8718c == null) {
                                C0641e c0641e = this.f8712m;
                                int m62A = C0017d.m62A(j7);
                                long j8 = dVar.f8717b;
                                c0641e.m2136h(i8, m62A, (int) (j8 >> 32), C0017d.m62A(j8));
                                if (i8 == 0) {
                                    ((C2224c) AbstractC1927b.this).getClass();
                                    obj2 = new C2230i();
                                } else {
                                    obj2 = ((C1928c) this.f8707X.get(i8 - 1)).f8719a;
                                }
                                int i10 = i8 + 1;
                                if (i9 >= i10) {
                                    List subList = this.f8707X.subList(i10, i9 + 1);
                                    Iterator it = subList.iterator();
                                    while (it.hasNext()) {
                                        AbstractC1927b.this.mo4537k(((C1928c) it.next()).f8719a);
                                    }
                                    subList.clear();
                                }
                                b bVar = this.f8709Z;
                                bVar.getClass();
                                b.C2302b c2302b = bVar.new C2302b();
                                for (int i11 = i10; i11 <= i9; i11++) {
                                    c2302b.m4541b(i10);
                                }
                                i7 = i8;
                                while (i7 < this.f8712m.m2147s()) {
                                    C1928c m5404o = ((C2224c) AbstractC1927b.this).m5404o(this.f8712m.m2146r(i7), obj2);
                                    c2302b.m4542c(i7, ((C2224c) AbstractC1927b.this).m5403m(m5404o));
                                    C1928c c1928c = (C1928c) this.f8707X.set(i7, m5404o);
                                    if (c1928c != null) {
                                        AbstractC1927b.this.mo4537k(c1928c.f8719a);
                                    }
                                    AbstractC1927b.this.mo4538l(m5404o.f8719a);
                                    AbstractC1927b abstractC1927b = AbstractC1927b.this;
                                    Object obj3 = c1928c == null ? null : c1928c.f8719a;
                                    Object obj4 = m5404o.f8719a;
                                    ((C2224c) abstractC1927b).getClass();
                                    if (!((C2230i) obj3).equals((C2230i) obj4)) {
                                        obj2 = m5404o.f8719a;
                                        i7++;
                                    }
                                }
                            } else {
                                this.f8712m.m2151w(i8, C0017d.m62A(j7), dVar.f8718c);
                                if (i8 == 0) {
                                    ((C2224c) AbstractC1927b.this).getClass();
                                    obj = new C2230i();
                                } else {
                                    obj = ((C1928c) this.f8707X.get(i8 - 1)).f8719a;
                                }
                                b bVar2 = (b) this.f8708Y.f144a;
                                bVar2.getClass();
                                b.C2302b c2302b2 = bVar2.new C2302b();
                                i7 = i8;
                                while (i7 <= i9) {
                                    C1928c m5404o2 = ((C2224c) AbstractC1927b.this).m5404o(this.f8712m.m2146r(i7), obj);
                                    if (i7 == i8) {
                                        c2302b2.m4542c(i7, ((C2224c) AbstractC1927b.this).m5403m(m5404o2));
                                        C1928c c1928c2 = (C1928c) this.f8707X.set(i7, m5404o2);
                                        if (c1928c2 != null) {
                                            AbstractC1927b.this.mo4537k(c1928c2.f8719a);
                                        }
                                    } else {
                                        c2302b2.m4540a(i7, ((C2224c) AbstractC1927b.this).m5403m(m5404o2));
                                        this.f8707X.add(i7, m5404o2);
                                    }
                                    AbstractC1927b.this.mo4538l(m5404o2.f8719a);
                                    obj = m5404o2.f8719a;
                                    i7++;
                                }
                                boolean z6 = true;
                                while (i7 < this.f8712m.m2147s() && z6) {
                                    C1928c m5404o3 = ((C2224c) AbstractC1927b.this).m5404o(this.f8712m.m2146r(i7), obj);
                                    AbstractC1927b abstractC1927b2 = AbstractC1927b.this;
                                    S_ s_ = m5404o3.f8719a;
                                    Object obj5 = ((C1928c) this.f8707X.get(i7)).f8719a;
                                    ((C2224c) abstractC1927b2).getClass();
                                    if (((C2230i) s_).equals((C2230i) obj5)) {
                                        z6 = false;
                                    }
                                    c2302b2.m4542c(i7, ((C2224c) AbstractC1927b.this).m5403m(m5404o3));
                                    C1928c c1928c3 = (C1928c) this.f8707X.set(i7, m5404o3);
                                    if (c1928c3 != null) {
                                        AbstractC1927b.this.mo4537k(c1928c3.f8719a);
                                    }
                                    AbstractC1927b.this.mo4538l(m5404o3.f8719a);
                                    obj = m5404o3.f8719a;
                                    i7++;
                                }
                            }
                        }
                        ArrayList mo4535i = AbstractC1927b.this.mo4535i(this.f8712m, this.f8714w1);
                        if (this.f8714w1.m4539a()) {
                            C0056f c0056f = this.f8708Y;
                            c0056f.f145b = mo4535i;
                            c0056f.m167a();
                            this.f8708Y.f146c = this.f8714w1.f8698b;
                        }
                        if (!this.f8711e) {
                            AbstractC1927b abstractC1927b3 = AbstractC1927b.this;
                            final C0056f c0056f2 = this.f8708Y;
                            InterfaceC1929d interfaceC1929d = (InterfaceC1929d) abstractC1927b3.f6333a;
                            if (interfaceC1929d != null) {
                                final C0936o c0936o = new C0936o(i8, i7);
                                C1258o c1258o = (C1258o) interfaceC1929d;
                                final C1245b c1245b = c1258o.f6211a.get();
                                if (c1245b != null && abstractC1927b3 == c1245b.getEditorLanguage().mo4416a()) {
                                    c1258o.m3560a(new Runnable() { // from class: g5.n
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C0936o c0936o2;
                                            C1465e c1465e;
                                            C1245b c1245b2 = C1245b.this;
                                            C0056f c0056f3 = c1245b2.f6044c3;
                                            C0056f c0056f4 = c0056f2;
                                            if (c0056f3 != c0056f4 || (c0936o2 = c0936o) == null) {
                                                c1245b2.setStyles(c0056f4);
                                                return;
                                            }
                                            if (c1245b2.f6060k2) {
                                                c1245b2.f5994E1 = c1245b2.m3467J();
                                            }
                                            C1464d c1464d = c1245b2.f6049e3;
                                            c1464d.getClass();
                                            if (Build.VERSION.SDK_INT >= 29 && (c1465e = c1464d.f6986b) != null) {
                                                Iterator<C1465e.a> it2 = c1465e.f6989b.iterator();
                                                C0898f.m2605d(it2, "cache.iterator()");
                                                while (it2.hasNext()) {
                                                    C1465e.a next = it2.next();
                                                    int i12 = next.f6991a;
                                                    if (i12 <= c0936o2.f4867b && c0936o2.f4866a <= i12) {
                                                        it2.remove();
                                                        next.f6992b.discardDisplayList();
                                                        c1465e.f6990c.push(next);
                                                    }
                                                }
                                            }
                                            c1245b2.f6051f3.m3520A();
                                            c1245b2.invalidate();
                                        }
                                    });
                                }
                            }
                        }
                        return true;
                    default:
                        return true;
                }
            } catch (Exception e7) {
                Log.w("AsyncAnalysis", "Thread " + Thread.currentThread().getName() + " failed", e7);
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [t4.b] */
        /* renamed from: b */
        public final void m4545b() {
            b bVar = new b();
            this.f8709Z = bVar;
            this.f8708Y = new C0056f(bVar);
            ((C2224c) AbstractC1927b.this).getClass();
            Object c2230i = new C2230i();
            b bVar2 = this.f8709Z;
            bVar2.getClass();
            int i7 = 0;
            while (i7 < this.f8712m.m2147s() && !this.f8711e && !isInterrupted()) {
                C1928c m5404o = ((C2224c) AbstractC1927b.this).m5404o(this.f8712m.m2146r(i7), c2230i);
                Object obj = m5404o.f8719a;
                ArrayList m5403m = ((C2224c) AbstractC1927b.this).m5403m(m5404o);
                this.f8707X.add(m5404o);
                AbstractC1927b.this.mo4538l(m5404o.f8719a);
                ReentrantLock reentrantLock = bVar2.f8700a;
                ReentrantLock reentrantLock2 = bVar2.f8700a;
                reentrantLock.lock();
                try {
                    bVar2.f8701b.add(i7, new b.a(m5403m));
                    reentrantLock2.unlock();
                    i7++;
                    c2230i = obj;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            this.f8708Y.f145b = AbstractC1927b.this.mo4535i(this.f8712m, this.f8714w1);
            C0056f c0056f = this.f8708Y;
            c0056f.f146c = this.f8714w1.f8698b;
            c0056f.m167a();
            if (this.f8711e) {
                return;
            }
            AbstractC1927b abstractC1927b = AbstractC1927b.this;
            C0056f c0056f2 = this.f8708Y;
            InterfaceC1929d interfaceC1929d = (InterfaceC1929d) abstractC1927b.f6333a;
            if (interfaceC1929d != null) {
                ((C1258o) interfaceC1929d).m3561b(abstractC1927b, c0056f2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (!this.f8711e && !isInterrupted()) {
                try {
                    Message message = (Message) this.f8710c.take();
                    if (!m4544a(message)) {
                        return;
                    } else {
                        message.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: t4.b$d */
    public static class d {

        /* renamed from: a */
        public final long f8716a;

        /* renamed from: b */
        public final long f8717b;

        /* renamed from: c */
        public final CharSequence f8718c;

        public d(long j7, long j8, CharSequence charSequence) {
            this.f8716a = j7;
            this.f8717b = j8;
            this.f8718c = charSequence;
        }
    }

    @Override // p156t4.InterfaceC1926a
    /* renamed from: d */
    public final void mo4426d() {
        int i7;
        AbstractC1927b<S, T>.c cVar = this.f8695d;
        if (cVar != null) {
            if (cVar.isAlive()) {
                this.f8695d.interrupt();
                this.f8695d.f8711e = true;
            }
            this.f8695d = null;
        }
        C0644h c0644h = (C0644h) this.f6334b;
        if (c0644h != null) {
            C0641e c0641e = (C0641e) c0644h.f3188c;
            c0641e.m2154z(false);
            try {
                C0641e c0641e2 = new C0641e(null, false);
                ArrayList arrayList = c0641e2.f3151c;
                arrayList.remove(0);
                arrayList.ensureCapacity(c0641e.m2147s());
                Iterator it = c0641e.f3151c.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0642f((C0642f) it.next()));
                }
                c0641e2.f3154s = c0641e.f3154s;
                c0641e.m2128L(false);
                c0641e2.m2122F(false);
                AbstractC1927b<S, T>.c cVar2 = new c();
                this.f8695d = cVar2;
                StringBuilder sb = new StringBuilder("AsyncAnalyzer-");
                synchronized (AbstractC1927b.class) {
                    i7 = f8694f + 1;
                    f8694f = i7;
                }
                sb.append(i7);
                cVar2.setName(sb.toString());
                AbstractC1927b<S, T>.c cVar3 = this.f8695d;
                cVar3.getClass();
                Message obtain = Message.obtain();
                obtain.what = 11451401;
                obtain.obj = c0641e2;
                cVar3.f8710c.offer(obtain);
                m4536j();
                InterfaceC1929d interfaceC1929d = (InterfaceC1929d) this.f6333a;
                if (interfaceC1929d != null) {
                    ((C1258o) interfaceC1929d).m3561b(this, null);
                }
                this.f8695d.start();
            } catch (Throwable th) {
                c0641e.m2128L(false);
                throw th;
            }
        }
    }

    @Override // p057h.AbstractC1268b, p156t4.InterfaceC1926a
    public final void destroy() {
        AbstractC1927b<S, T>.c cVar = this.f8695d;
        if (cVar != null) {
            if (cVar.isAlive()) {
                this.f8695d.interrupt();
            }
            this.f8695d.f8711e = true;
        }
        this.f8695d = null;
        super.destroy();
    }

    @Override // p156t4.InterfaceC1926a
    /* renamed from: e */
    public final void mo4427e(C0638b c0638b, C0638b c0638b2) {
        if (this.f8695d != null) {
            m4536j();
            AbstractC1927b<S, T>.c cVar = this.f8695d;
            d dVar = new d(C0017d.m68G(c0638b.f3141b, c0638b.f3142c), C0017d.m68G(c0638b2.f3141b, c0638b2.f3142c), null);
            cVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 11451402;
            obtain.obj = dVar;
            cVar.f8710c.offer(obtain);
        }
    }

    @Override // p156t4.InterfaceC1926a
    /* renamed from: f */
    public final void mo4428f(C0638b c0638b, C0638b c0638b2, CharSequence charSequence) {
        if (this.f8695d != null) {
            m4536j();
            AbstractC1927b<S, T>.c cVar = this.f8695d;
            d dVar = new d(C0017d.m68G(c0638b.f3141b, c0638b.f3142c), C0017d.m68G(c0638b2.f3141b, c0638b2.f3142c), charSequence);
            cVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 11451402;
            obtain.obj = dVar;
            cVar.f8710c.offer(obtain);
        }
    }

    /* renamed from: i */
    public abstract ArrayList mo4535i(C0641e c0641e, a aVar);

    /* renamed from: j */
    public final synchronized void m4536j() {
        this.f8696e++;
    }

    /* renamed from: k */
    public abstract void mo4537k(S s7);

    /* renamed from: l */
    public abstract void mo4538l(S s7);
}
