package p105n;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: n.a */
/* loaded from: classes.dex */
public abstract class AbstractFutureC1631a<V> implements Future {

    /* renamed from: Y */
    public static final a f7439Y;

    /* renamed from: Z */
    public static final Object f7440Z;

    /* renamed from: c */
    public volatile Object f7442c;

    /* renamed from: e */
    public volatile d f7443e;

    /* renamed from: m */
    public volatile h f7444m;

    /* renamed from: s */
    public static final boolean f7441s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: X */
    public static final Logger f7438X = Logger.getLogger(AbstractFutureC1631a.class.getName());

    /* renamed from: n.a$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract boolean mo4000a(AbstractFutureC1631a abstractFutureC1631a, d dVar);

        /* renamed from: b */
        public abstract boolean mo4001b(AbstractFutureC1631a<?> abstractFutureC1631a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo4002c(AbstractFutureC1631a<?> abstractFutureC1631a, h hVar, h hVar2);

        /* renamed from: d */
        public abstract void mo4003d(h hVar, h hVar2);

        /* renamed from: e */
        public abstract void mo4004e(h hVar, Thread thread);
    }

    /* renamed from: n.a$b */
    public static final class b {

        /* renamed from: b */
        public static final b f7445b;

        /* renamed from: c */
        public static final b f7446c;

        /* renamed from: a */
        public final Throwable f7447a;

        static {
            if (AbstractFutureC1631a.f7441s) {
                f7446c = null;
                f7445b = null;
            } else {
                f7446c = new b(false, null);
                f7445b = new b(true, null);
            }
        }

        public b(boolean z6, Throwable th) {
            this.f7447a = th;
        }
    }

    /* renamed from: n.a$c */
    public static final class c {

        /* renamed from: a */
        public final Throwable f7448a;

        /* renamed from: n.a$c$a */
        public class a extends Throwable {
            public a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a());
        }

        public c(Throwable th) {
            boolean z6 = AbstractFutureC1631a.f7441s;
            th.getClass();
            this.f7448a = th;
        }
    }

    /* renamed from: n.a$d */
    public static final class d {

        /* renamed from: d */
        public static final d f7449d = new d();

        /* renamed from: a */
        public final Runnable f7450a = null;

        /* renamed from: b */
        public final Executor f7451b = null;

        /* renamed from: c */
        public d f7452c;
    }

    /* renamed from: n.a$e */
    public static final class e extends a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<h, Thread> f7453a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<h, h> f7454b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFutureC1631a, h> f7455c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFutureC1631a, d> f7456d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFutureC1631a, Object> f7457e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFutureC1631a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFutureC1631a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFutureC1631a, Object> atomicReferenceFieldUpdater5) {
            this.f7453a = atomicReferenceFieldUpdater;
            this.f7454b = atomicReferenceFieldUpdater2;
            this.f7455c = atomicReferenceFieldUpdater3;
            this.f7456d = atomicReferenceFieldUpdater4;
            this.f7457e = atomicReferenceFieldUpdater5;
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: a */
        public final boolean mo4000a(AbstractFutureC1631a abstractFutureC1631a, d dVar) {
            AtomicReferenceFieldUpdater<AbstractFutureC1631a, d> atomicReferenceFieldUpdater;
            d dVar2 = d.f7449d;
            do {
                atomicReferenceFieldUpdater = this.f7456d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1631a, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFutureC1631a) == dVar);
            return false;
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: b */
        public final boolean mo4001b(AbstractFutureC1631a<?> abstractFutureC1631a, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFutureC1631a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f7457e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1631a, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFutureC1631a) == obj);
            return false;
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: c */
        public final boolean mo4002c(AbstractFutureC1631a<?> abstractFutureC1631a, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<AbstractFutureC1631a, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f7455c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC1631a, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFutureC1631a) == hVar);
            return false;
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: d */
        public final void mo4003d(h hVar, h hVar2) {
            this.f7454b.lazySet(hVar, hVar2);
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: e */
        public final void mo4004e(h hVar, Thread thread) {
            this.f7453a.lazySet(hVar, thread);
        }
    }

    /* renamed from: n.a$f */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: n.a$g */
    public static final class g extends a {
        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: a */
        public final boolean mo4000a(AbstractFutureC1631a abstractFutureC1631a, d dVar) {
            d dVar2 = d.f7449d;
            synchronized (abstractFutureC1631a) {
                if (abstractFutureC1631a.f7443e != dVar) {
                    return false;
                }
                abstractFutureC1631a.f7443e = dVar2;
                return true;
            }
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: b */
        public final boolean mo4001b(AbstractFutureC1631a<?> abstractFutureC1631a, Object obj, Object obj2) {
            synchronized (abstractFutureC1631a) {
                if (abstractFutureC1631a.f7442c != obj) {
                    return false;
                }
                abstractFutureC1631a.f7442c = obj2;
                return true;
            }
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: c */
        public final boolean mo4002c(AbstractFutureC1631a<?> abstractFutureC1631a, h hVar, h hVar2) {
            synchronized (abstractFutureC1631a) {
                if (abstractFutureC1631a.f7444m != hVar) {
                    return false;
                }
                abstractFutureC1631a.f7444m = hVar2;
                return true;
            }
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: d */
        public final void mo4003d(h hVar, h hVar2) {
            hVar.f7460b = hVar2;
        }

        @Override // p105n.AbstractFutureC1631a.a
        /* renamed from: e */
        public final void mo4004e(h hVar, Thread thread) {
            hVar.f7459a = thread;
        }
    }

    /* renamed from: n.a$h */
    public static final class h {

        /* renamed from: c */
        public static final h f7458c = new h(0);

        /* renamed from: a */
        public volatile Thread f7459a;

        /* renamed from: b */
        public volatile h f7460b;

        public h() {
            AbstractFutureC1631a.f7439Y.mo4004e(this, Thread.currentThread());
        }

        public h(int i7) {
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1631a.class, h.class, "m"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1631a.class, d.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1631a.class, Object.class, "c"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f7439Y = gVar;
        if (th != null) {
            f7438X.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f7440Z = new Object();
    }

    /* renamed from: b */
    public static void m3995b(AbstractFutureC1631a<?> abstractFutureC1631a) {
        h hVar;
        d dVar;
        do {
            hVar = abstractFutureC1631a.f7444m;
        } while (!f7439Y.mo4002c(abstractFutureC1631a, hVar, h.f7458c));
        while (hVar != null) {
            Thread thread = hVar.f7459a;
            if (thread != null) {
                hVar.f7459a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f7460b;
        }
        do {
            dVar = abstractFutureC1631a.f7443e;
        } while (!f7439Y.mo4000a(abstractFutureC1631a, dVar));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f7452c;
            dVar.f7452c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f7452c;
            Runnable runnable = dVar2.f7450a;
            if (runnable instanceof f) {
                ((f) runnable).getClass();
                throw null;
            }
            Executor executor = dVar2.f7451b;
            try {
                executor.execute(runnable);
            } catch (RuntimeException e7) {
                f7438X.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e7);
            }
            dVar2 = dVar4;
        }
    }

    /* renamed from: c */
    public static Object m3996c(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f7447a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f7448a);
        }
        if (obj == f7440Z) {
            return null;
        }
        return obj;
    }

    /* renamed from: a */
    public final void m3997a(StringBuilder sb) {
        V v5;
        String str = "]";
        boolean z6 = false;
        while (true) {
            try {
                try {
                    v5 = get();
                    break;
                } catch (InterruptedException unused) {
                    z6 = true;
                } catch (Throwable th) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (RuntimeException e7) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e7.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (ExecutionException e8) {
                sb.append("FAILURE, cause=[");
                sb.append(e8.getCause());
                sb.append(str);
                return;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(v5 == this ? "this future" : String.valueOf(v5));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f7442c;
        if ((obj == null) | (obj instanceof f)) {
            b bVar = f7441s ? new b(z6, new CancellationException("Future.cancel() was called.")) : z6 ? b.f7445b : b.f7446c;
            while (!f7439Y.mo4001b(this, obj, bVar)) {
                obj = this.f7442c;
                if (!(obj instanceof f)) {
                }
            }
            m3995b(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final String m3998d() {
        Object obj = this.f7442c;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: e */
    public final void m3999e(h hVar) {
        hVar.f7459a = null;
        while (true) {
            h hVar2 = this.f7444m;
            if (hVar2 == h.f7458c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f7460b;
                if (hVar2.f7459a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f7460b = hVar4;
                    if (hVar3.f7459a == null) {
                        break;
                    }
                } else if (!f7439Y.mo4002c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f7442c;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return (V) m3996c(obj2);
        }
        h hVar = this.f7444m;
        h hVar2 = h.f7458c;
        if (hVar != hVar2) {
            h hVar3 = new h();
            do {
                a aVar = f7439Y;
                aVar.mo4003d(hVar3, hVar);
                if (aVar.mo4002c(this, hVar, hVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m3999e(hVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f7442c;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return (V) m3996c(obj);
                }
                hVar = this.f7444m;
            } while (hVar != hVar2);
        }
        return (V) m3996c(this.f7442c);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7442c instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f7442c != null);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.f7442c instanceof b)) {
            if (!isDone()) {
                try {
                    str = m3998d();
                } catch (RuntimeException e7) {
                    str = "Exception thrown from implementation: " + e7.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "CANCELLED" : "PENDING";
            }
            m3997a(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:33:0x00b3). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p105n.AbstractFutureC1631a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
