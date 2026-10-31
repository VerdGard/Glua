package p144s0;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p016c.RunnableC0558l;
import p034e0.C0936o;
import p036e2.C1118x0;
import p055g5.C1245b;
import p055g5.C1258o;
import p071i5.ViewOnClickListenerC1367f0;

/* renamed from: s0.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1869e implements Runnable {

    /* renamed from: c */
    public final /* synthetic */ int f8397c;

    /* renamed from: e */
    public final /* synthetic */ Object f8398e;

    public /* synthetic */ RunnableC1869e(int i7, Object obj) {
        this.f8397c = i7;
        this.f8398e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f8397c;
        Object obj = this.f8398e;
        switch (i7) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0558l(1, (Context) obj));
                break;
            case 1:
            default:
                ((ViewOnClickListenerC1367f0) obj).m3724e();
                break;
            case 2:
                ((C1245b) obj).m3493g0();
                break;
            case 3:
                C1258o c1258o = (C1258o) obj;
                C1118x0 c1118x0 = c1258o.f6213c;
                C1245b c1245b = c1258o.f6211a.get();
                if (c1118x0 != null && c1245b != null && !c1245b.getCursor().m2163a() && c1245b.f6074t2) {
                    c1245b.getText();
                    int i8 = c1245b.getCursor().f3166c.f3140a;
                    int i9 = i8 - 1;
                    C0936o m3281c = i9 >= 0 ? c1118x0.m3281c(i9) : null;
                    if (m3281c == null) {
                        m3281c = c1118x0.m3281c(i8);
                    }
                    c1258o.f6212b = m3281c;
                    c1245b.invalidate();
                    break;
                }
                break;
        }
    }
}
