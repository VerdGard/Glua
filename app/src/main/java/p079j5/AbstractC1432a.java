package p079j5;

import android.ext.Tools;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p022c5.C0641e;
import p055g5.C1245b;

/* renamed from: j5.a */
/* loaded from: classes.dex */
public abstract class AbstractC1432a implements InterfaceC1433b {

    /* renamed from: m */
    public static final ThreadPoolExecutor f6871m = new ThreadPoolExecutor(2, Math.max(2, Runtime.getRuntime().availableProcessors()), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(Tools.Semaphore.f159S7));

    /* renamed from: c */
    public C1245b f6872c;

    /* renamed from: e */
    public C0641e f6873e;

    /* renamed from: j5.a$a */
    public abstract class a<T> implements Runnable {

        /* renamed from: c */
        public final b f6874c;

        public a(b bVar) {
            this.f6874c = bVar;
        }

        /* renamed from: a */
        public abstract T mo3802a();

        /* renamed from: b */
        public boolean mo3803b() {
            return AbstractC1432a.this.f6872c != null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (mo3803b()) {
                this.f6874c.m3804a(mo3802a());
            } else {
                b bVar = this.f6874c;
                synchronized (bVar) {
                    bVar.f6880e++;
                    bVar.m3804a(null);
                }
            }
        }
    }

    /* renamed from: j5.a$b */
    public static class b {

        /* renamed from: a */
        public final int f6876a;

        /* renamed from: b */
        public final Object[] f6877b;

        /* renamed from: c */
        public final a f6878c;

        /* renamed from: d */
        public int f6879d = 0;

        /* renamed from: e */
        public int f6880e = 0;

        /* renamed from: j5.a$b$a */
        public interface a {
            /* renamed from: b */
            void mo3553b(int i7, Object[] objArr);
        }

        public b(int i7, a aVar) {
            this.f6876a = i7;
            this.f6877b = new Object[i7];
            this.f6878c = aVar;
        }

        /* renamed from: a */
        public final synchronized void m3804a(Object obj) {
            Object[] objArr = this.f6877b;
            int i7 = this.f6879d;
            int i8 = i7 + 1;
            this.f6879d = i8;
            objArr[i7] = obj;
            if (i8 == this.f6876a) {
                this.f6878c.mo3553b(this.f6880e, objArr);
            }
        }
    }

    public AbstractC1432a(C1245b c1245b, C0641e c0641e) {
        this.f6872c = c1245b;
        this.f6873e = c0641e;
    }

    /* renamed from: b */
    public final float[] m3801b(int i7, int i8) {
        return mo3811p(i7, i8, new float[2]);
    }

    @Override // p022c5.InterfaceC0643g
    /* renamed from: z */
    public final /* synthetic */ void mo2114z(C0641e c0641e) {
    }
}
