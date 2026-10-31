package p009b0;

import android.os.Handler;
import java.util.concurrent.Callable;
import p026d0.InterfaceC0873a;

/* renamed from: b0.o */
/* loaded from: classes.dex */
public final class RunnableC0511o<T> implements Runnable {

    /* renamed from: c */
    public final Callable<T> f2547c;

    /* renamed from: e */
    public final InterfaceC0873a<T> f2548e;

    /* renamed from: m */
    public final Handler f2549m;

    /* renamed from: b0.o$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC0873a f2550c;

        /* renamed from: e */
        public final /* synthetic */ Object f2551e;

        public a(InterfaceC0873a interfaceC0873a, Object obj) {
            this.f2550c = interfaceC0873a;
            this.f2551e = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f2550c.accept(this.f2551e);
        }
    }

    public RunnableC0511o(Handler handler, CallableC0505i callableC0505i, C0506j c0506j) {
        this.f2547c = callableC0505i;
        this.f2548e = c0506j;
        this.f2549m = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t7;
        try {
            t7 = this.f2547c.call();
        } catch (Exception unused) {
            t7 = null;
        }
        this.f2549m.post(new a(this.f2548e, t7));
    }
}
