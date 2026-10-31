package p084k2;

import android.os.Looper;
import p060h2.InterfaceC1294c;
import p068i2.C1329a;
import p068i2.C1331c;
import p068i2.InterfaceC1330b;
import p084k2.InterfaceC1457g;
import p200z2.C2277a;
import p200z2.C2279c;

/* renamed from: k2.f */
/* loaded from: classes.dex */
public final class C1456f extends C2277a<InterfaceC1294c, InterfaceC1330b<?>> implements InterfaceC1457g {

    /* renamed from: c */
    public InterfaceC1457g.a f6972c;

    public C1456f(int i7) {
    }

    @Override // p200z2.C2277a
    /* renamed from: a */
    public final int mo3838a(InterfaceC1330b<?> interfaceC1330b) {
        return interfaceC1330b.m3688a();
    }

    @Override // p200z2.C2277a
    /* renamed from: b */
    public final void mo3839b(InterfaceC1294c interfaceC1294c, InterfaceC1330b<?> interfaceC1330b) {
        InterfaceC1330b<?> interfaceC1330b2 = interfaceC1330b;
        InterfaceC1457g.a aVar = this.f6972c;
        if (aVar != null) {
            C1329a c1329a = (C1329a) aVar;
            int i7 = C2279c.f10445a;
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                throw new IllegalArgumentException("You must call this method on the main thread");
            }
            C1331c c1331c = c1329a.f6527a;
            c1331c.getClass();
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                throw new IllegalArgumentException("You must call this method on the main thread");
            }
            if (c1331c.f6531a) {
                c1331c.f6532b.obtainMessage(1, interfaceC1330b2).sendToTarget();
                return;
            }
            c1331c.f6531a = true;
            interfaceC1330b2.m3689b();
            c1331c.f6531a = false;
        }
    }
}
