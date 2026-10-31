package p135r;

import java.util.Iterator;

/* renamed from: r.g */
/* loaded from: classes.dex */
public class C1813g extends C1812f {

    /* renamed from: m */
    public int f8229m;

    public C1813g(AbstractC1819m abstractC1819m) {
        super(abstractC1819m);
        this.f8221e = abstractC1819m instanceof C1816j ? 2 : 3;
    }

    @Override // p135r.C1812f
    /* renamed from: d */
    public final void mo4284d(int i7) {
        if (this.f8226j) {
            return;
        }
        this.f8226j = true;
        this.f8223g = i7;
        Iterator it = this.f8227k.iterator();
        while (it.hasNext()) {
            InterfaceC1810d interfaceC1810d = (InterfaceC1810d) it.next();
            interfaceC1810d.mo4267a(interfaceC1810d);
        }
    }
}
