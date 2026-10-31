package p065i;

import android.os.Looper;
import androidx.activity.result.AbstractC0136c;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i.b */
/* loaded from: classes.dex */
public final class C1306b extends AbstractC0136c {

    /* renamed from: e */
    public final Object f6474e = new Object();

    /* renamed from: i.b$a */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f6475a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f6475a.getAndIncrement());
            return thread;
        }
    }

    public C1306b() {
        Executors.newFixedThreadPool(4, new a());
    }

    /* renamed from: y */
    public final boolean m3620y() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
