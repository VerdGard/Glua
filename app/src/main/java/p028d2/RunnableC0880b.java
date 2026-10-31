package p028d2;

import p036e2.C1021j1;

/* renamed from: d2.b */
/* loaded from: classes.dex */
public final class RunnableC0880b implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ C1021j1.a f4655c;

    /* renamed from: e */
    public final /* synthetic */ C0881c f4656e;

    public RunnableC0880b(C0881c c0881c, C1021j1.a aVar) {
        this.f4656e = c0881c;
        this.f4655c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0881c c0881c = this.f4656e;
        try {
            C0881c.m2569d(c0881c, this.f4655c);
        } finally {
            c0881c.f4660b.m3055e();
        }
    }
}
