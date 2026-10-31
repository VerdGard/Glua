package p165u6;

import java.lang.ref.WeakReference;
import p165u6.AbstractC2003u;
import p180w6.C2135d;

/* renamed from: u6.r */
/* loaded from: classes.dex */
public final class C2000r extends AbstractC2003u {

    /* renamed from: g2 */
    public static C1999q f9069g2;

    /* renamed from: h2 */
    public static int f9070h2;

    /* renamed from: i2 */
    public static final String[] f9071i2 = {"suspended", "suspended", "running", "normal", "dead"};

    /* renamed from: c2 */
    public final a f9072c2;

    /* renamed from: d2 */
    public C2135d.b f9073d2;

    /* renamed from: e2 */
    public final C1999q f9074e2;

    /* renamed from: f2 */
    public AbstractC2003u f9075f2;

    /* renamed from: u6.r$a */
    public static class a implements Runnable {

        /* renamed from: A1 */
        public boolean f9076A1;

        /* renamed from: B1 */
        public int f9077B1;

        /* renamed from: C1 */
        public int f9078C1;

        /* renamed from: D1 */
        public int f9079D1;

        /* renamed from: X */
        public AbstractC1984c0 f9080X;

        /* renamed from: Y */
        public String f9081Y;

        /* renamed from: Z */
        public AbstractC1992j f9082Z;

        /* renamed from: c */
        public final C1981b f9083c;

        /* renamed from: e */
        public final WeakReference f9084e;

        /* renamed from: m */
        public final AbstractC2003u f9085m;

        /* renamed from: s */
        public AbstractC1984c0 f9086s;

        /* renamed from: w1 */
        public boolean f9087w1;

        /* renamed from: x1 */
        public boolean f9088x1;

        /* renamed from: y1 */
        public boolean f9089y1;

        /* renamed from: z1 */
        public int f9090z1;

        public a(C1981b c1981b, C2000r c2000r, AbstractC1992j abstractC1992j) {
            AbstractC2003u.a aVar = AbstractC2003u.f9124Y;
            this.f9086s = aVar;
            this.f9080X = aVar;
            this.f9081Y = null;
            this.f9079D1 = 0;
            this.f9083c = c1981b;
            this.f9084e = new WeakReference(c2000r);
            this.f9085m = abstractC1992j;
        }

        @Override // java.lang.Runnable
        public final synchronized void run() {
            try {
                AbstractC1984c0 abstractC1984c0 = this.f9086s;
                this.f9086s = AbstractC2003u.f9124Y;
                this.f9080X = this.f9085m.mo4689W0(abstractC1984c0);
            } finally {
                try {
                    this.f9079D1 = 4;
                    notify();
                } catch (Throwable th) {
                }
            }
            this.f9079D1 = 4;
            notify();
        }
    }

    public C2000r(C1981b c1981b) {
        C1999q c1999q = new C1999q();
        this.f9074e2 = c1999q;
        a aVar = new a(c1981b, this, null);
        this.f9072c2 = aVar;
        aVar.f9079D1 = 2;
        c1999q.mo4788W1(1, this);
        c1999q.mo4788W1(2, c1981b);
    }

    public C2000r(C1981b c1981b, AbstractC1992j abstractC1992j) {
        C1999q c1999q = new C1999q();
        this.f9074e2 = c1999q;
        if (!(abstractC1992j != null)) {
            throw new C1991i("function cannot be null");
        }
        this.f9072c2 = new a(c1981b, this, abstractC1992j);
        c1999q.mo4788W1(1, this);
        c1999q.mo4788W1(2, c1981b);
    }

    /* renamed from: C2 */
    public final AbstractC1984c0 m4847C2(AbstractC1984c0 abstractC1984c0) {
        AbstractC1984c0 m4867y2;
        a aVar = this.f9072c2;
        if (aVar.f9079D1 > 1) {
            C1988f c1988f = AbstractC2003u.f9122X;
            StringBuilder sb = new StringBuilder("cannot resume ");
            sb.append(aVar.f9079D1 == 4 ? "dead" : "non-suspended");
            sb.append(" coroutine");
            return AbstractC2003u.m4867y2(c1988f, C1998p.m4815M2(sb.toString()));
        }
        synchronized (aVar) {
            C1981b c1981b = aVar.f9083c;
            C2000r c2000r = c1981b.f8948o2;
            try {
                try {
                    c1981b.f8948o2 = this;
                    aVar.f9086s = abstractC1984c0;
                    if (aVar.f9079D1 == 0) {
                        aVar.f9079D1 = 2;
                        StringBuilder sb2 = new StringBuilder("Coroutine-");
                        int i7 = f9070h2 + 1;
                        f9070h2 = i7;
                        sb2.append(i7);
                        new Thread(aVar, sb2.toString()).start();
                    } else {
                        aVar.notify();
                    }
                    if (c2000r != null) {
                        c2000r.f9072c2.f9079D1 = 3;
                    }
                    aVar.f9079D1 = 2;
                    aVar.wait();
                    String str = aVar.f9081Y;
                    m4867y2 = str != null ? AbstractC2003u.m4867y2(AbstractC2003u.f9122X, C1998p.m4815M2(str)) : AbstractC2003u.m4867y2(AbstractC2003u.f9131s, aVar.f9080X);
                } catch (InterruptedException unused) {
                    throw new C2006x();
                }
            } finally {
                AbstractC2003u.a aVar2 = AbstractC2003u.f9124Y;
                aVar.f9086s = aVar2;
                aVar.f9080X = aVar2;
                aVar.f9081Y = null;
                aVar.f9083c.f8948o2 = c2000r;
                if (c2000r != null) {
                    c2000r.f9072c2.f9079D1 = 2;
                }
            }
        }
        return m4867y2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M0 */
    public final AbstractC2003u mo4681M0() {
        return f9069g2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t2 */
    public final int mo4675t2() {
        return 8;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u0 */
    public final C2000r mo4848u0() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u2 */
    public final String mo4676u2() {
        return "thread";
    }
}
