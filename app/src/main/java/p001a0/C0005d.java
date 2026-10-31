package p001a0;

/* renamed from: a0.d */
/* loaded from: classes.dex */
public final class C0005d {

    /* renamed from: a */
    public boolean f2a;

    /* renamed from: b */
    public a f3b;

    /* renamed from: c */
    public boolean f4c;

    /* renamed from: a0.d$a */
    public interface a {
        void onCancel();
    }

    /* renamed from: a */
    public final void m5a() {
        synchronized (this) {
            if (this.f2a) {
                return;
            }
            this.f2a = true;
            this.f4c = true;
            a aVar = this.f3b;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f4c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f4c = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public final void m6b(a aVar) {
        synchronized (this) {
            while (this.f4c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f3b == aVar) {
                return;
            }
            this.f3b = aVar;
            if (this.f2a) {
                aVar.onCancel();
            }
        }
    }
}
