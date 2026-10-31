package p009b0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: b0.n */
/* loaded from: classes.dex */
public final class ThreadFactoryC0510n implements ThreadFactory {

    /* renamed from: a */
    public final String f2544a = "fonts-androidx";

    /* renamed from: b */
    public final int f2545b = 10;

    /* renamed from: b0.n$a */
    public static class a extends Thread {

        /* renamed from: c */
        public final int f2546c;

        public a(Runnable runnable, String str, int i7) {
            super(runnable, str);
            this.f2546c = i7;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f2546c);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f2544a, this.f2545b);
    }
}
