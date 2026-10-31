package p092l2;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: l2.a */
/* loaded from: classes.dex */
public final class C1506a extends ThreadPoolExecutor {

    /* renamed from: c */
    public final AtomicInteger f7117c;

    /* renamed from: e */
    public final c f7118e;

    /* renamed from: l2.a$a */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public int f7119a = 0;

        /* renamed from: l2.a$a$a, reason: collision with other inner class name */
        public class C2300a extends Thread {
            public C2300a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            C2300a c2300a = new C2300a(runnable, "fifo-pool-thread-" + this.f7119a);
            this.f7119a = this.f7119a + 1;
            return c2300a;
        }
    }

    /* renamed from: l2.a$b */
    public static class b<T> extends FutureTask<T> implements Comparable<b<?>> {

        /* renamed from: c */
        public final int f7120c;

        /* renamed from: e */
        public final int f7121e;

        public b(Runnable runnable, T t7, int i7) {
            super(runnable, t7);
            if (!(runnable instanceof InterfaceC1507b)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.f7120c = ((InterfaceC1507b) runnable).m3915a();
            this.f7121e = i7;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b<?> bVar) {
            b<?> bVar2 = bVar;
            int i7 = this.f7120c - bVar2.f7120c;
            return i7 == 0 ? this.f7121e - bVar2.f7121e : i7;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7121e == bVar.f7121e && this.f7120c == bVar.f7120c;
        }

        public final int hashCode() {
            return (this.f7120c * 31) + this.f7121e;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l2.a$c */
    public static class c {

        /* renamed from: c */
        public static final a f7122c;

        /* renamed from: e */
        public static final /* synthetic */ c[] f7123e;

        /* JADX INFO: Fake field, exist only in values array */
        c EF0;

        /* renamed from: l2.a$c$a */
        public enum a extends c {
            public a() {
                super("LOG", 1);
            }

            @Override // p092l2.C1506a.c
            /* renamed from: a */
            public final void mo3914a(Exception exc) {
                if (Log.isLoggable("PriorityExecutor", 6)) {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", exc);
                }
            }
        }

        /* renamed from: l2.a$c$b */
        public enum b extends c {
            public b() {
                super("THROW", 2);
            }

            @Override // p092l2.C1506a.c
            /* renamed from: a */
            public final void mo3914a(Exception exc) {
                throw new RuntimeException(exc);
            }
        }

        static {
            c cVar = new c();
            a aVar = new a();
            f7122c = aVar;
            f7123e = new c[]{cVar, aVar, new b()};
        }

        public c() {
        }

        public c(String str, int i7) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f7123e.clone();
        }

        /* renamed from: a */
        public void mo3914a(Exception exc) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1506a(int i7) {
        super(i7, i7, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a());
        c.a aVar = c.f7122c;
        this.f7117c = new AtomicInteger();
        this.f7118e = aVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (!future.isDone() || future.isCancelled()) {
                return;
            }
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e7) {
                this.f7118e.mo3914a(e7);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t7) {
        return new b(runnable, t7, this.f7117c.getAndIncrement());
    }
}
