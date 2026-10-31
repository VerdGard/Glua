package p055g5;

import android.os.Looper;
import java.lang.ref.WeakReference;
import p006a5.C0056f;
import p021c4.C0623k;
import p034e0.C0936o;
import p036e2.C1118x0;
import p132q4.C1796y;
import p156t4.InterfaceC1926a;
import p156t4.InterfaceC1929d;

/* renamed from: g5.o */
/* loaded from: classes.dex */
public final class C1258o implements InterfaceC1929d {

    /* renamed from: a */
    public final WeakReference<C1245b> f6211a;

    /* renamed from: b */
    public C0936o f6212b;

    /* renamed from: c */
    public C1118x0 f6213c;

    public C1258o(C1245b c1245b) {
        this.f6211a = new WeakReference<>(c1245b);
        c1245b.m3508q0(C1796y.class, new C0623k(3, this));
    }

    /* renamed from: a */
    public final void m3560a(Runnable runnable) {
        C1245b c1245b = this.f6211a.get();
        if (c1245b == null) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            c1245b.m3489e0(runnable);
        }
    }

    /* renamed from: b */
    public final void m3561b(InterfaceC1926a interfaceC1926a, C0056f c0056f) {
        C1245b c1245b = this.f6211a.get();
        if (c1245b == null || interfaceC1926a != c1245b.getEditorLanguage().mo4416a()) {
            return;
        }
        m3560a(new RunnableC1255l(null, c1245b, c0056f, 1));
    }
}
