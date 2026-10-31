package p130q2;

import androidx.activity.C0143v;
import androidx.fragment.app.C0344e0;
import p002a1.C0017d;
import p035e1.C0955g;
import p043f1.C1160e;
import p060h2.EnumC1292a;
import p060h2.InterfaceC1293b;
import p060h2.InterfaceC1295d;
import p060h2.InterfaceC1296e;
import p076j2.InterfaceC1404a;
import p083k1.C1449c;
import p130q2.AbstractC1741b;
import p154t2.C1924b;
import p184x2.InterfaceC2189a;

/* renamed from: q2.c */
/* loaded from: classes.dex */
public final class C1742c implements InterfaceC2189a {

    /* renamed from: a */
    public final /* synthetic */ int f7951a;

    /* renamed from: b */
    public final InterfaceC1295d f7952b;

    /* renamed from: c */
    public final Object f7953c;

    /* renamed from: d */
    public final InterfaceC1293b f7954d;

    /* renamed from: e */
    public final Object f7955e;

    public C1742c() {
        this.f7951a = 2;
        this.f7952b = new C1924b();
        this.f7955e = new C0143v();
        this.f7953c = new C0017d();
        this.f7954d = new C0143v(0);
    }

    /* renamed from: a */
    public final InterfaceC1296e m4208a() {
        int i7 = this.f7951a;
        InterfaceC1293b interfaceC1293b = this.f7954d;
        switch (i7) {
            case 0:
                return (C1740a) interfaceC1293b;
            case 1:
                return (InterfaceC1296e) interfaceC1293b;
            default:
                return (C0017d) this.f7953c;
        }
    }

    /* renamed from: b */
    public final InterfaceC1295d m4209b() {
        int i7 = this.f7951a;
        Object obj = this.f7953c;
        switch (i7) {
            case 0:
                return (C1449c) obj;
            case 1:
                return (C0955g) obj;
            default:
                return (C1924b) this.f7952b;
        }
    }

    /* renamed from: c */
    public final InterfaceC1293b m4210c() {
        int i7 = this.f7951a;
        Object obj = this.f7955e;
        switch (i7) {
            case 0:
                return (InterfaceC1293b) obj;
            case 1:
                return (C0955g) obj;
            default:
                return (C0143v) this.f7954d;
        }
    }

    public C1742c(C1160e c1160e, C1742c c1742c) {
        this.f7951a = 1;
        this.f7954d = (C1740a) c1160e.f5709b;
        this.f7955e = new C0955g((C0143v) c1160e.f5710c, 2, c1742c.m4210c());
        this.f7952b = (C0143v) c1160e.f5711d;
        this.f7953c = new C0955g((C0344e0) c1160e.f5708a, 3, c1742c.m4209b());
    }

    public C1742c(InterfaceC1404a interfaceC1404a, EnumC1292a enumC1292a) {
        this.f7951a = 0;
        AbstractC1741b.a aVar = AbstractC1741b.f7950a;
        this.f7952b = new C0143v();
        this.f7953c = new C1449c(interfaceC1404a, enumC1292a);
        this.f7954d = new C1740a();
        this.f7955e = C0143v.f266e;
    }
}
