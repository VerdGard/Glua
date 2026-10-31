package p010b1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0020g;
import p018c1.AbstractC0580a;
import p051g1.C1205n;
import p059h1.AbstractC1284b;
import p075j1.C1403d;

/* renamed from: b1.p */
/* loaded from: classes.dex */
public final class C0527p implements InterfaceC0523l, AbstractC0580a.a {

    /* renamed from: a */
    public final Path f2652a = new Path();

    /* renamed from: b */
    public final C0020g f2653b;

    /* renamed from: c */
    public final AbstractC0580a<?, Path> f2654c;

    /* renamed from: d */
    public boolean f2655d;

    /* renamed from: e */
    public C0529r f2656e;

    public C0527p(C0020g c0020g, AbstractC1284b abstractC1284b, C1205n c1205n) {
        c1205n.getClass();
        this.f2653b = c0020g;
        AbstractC0580a<?, Path> mo1994a = c1205n.f5909c.mo1994a();
        this.f2654c = mo1994a;
        abstractC1284b.m3597d(mo1994a);
        mo1994a.m2026a(this);
    }

    @Override // p018c1.AbstractC0580a.a
    /* renamed from: a */
    public final void mo1826a() {
        this.f2655d = false;
        this.f2653b.invalidateSelf();
    }

    @Override // p010b1.InterfaceC0513b
    /* renamed from: c */
    public final void mo1828c(List<InterfaceC0513b> list, List<InterfaceC0513b> list2) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i7 >= arrayList.size()) {
                return;
            }
            InterfaceC0513b interfaceC0513b = (InterfaceC0513b) arrayList.get(i7);
            if (interfaceC0513b instanceof C0529r) {
                C0529r c0529r = (C0529r) interfaceC0513b;
                if (c0529r.f2660b == 1) {
                    this.f2656e = c0529r;
                    c0529r.m1838b(this);
                }
            }
            i7++;
        }
    }

    @Override // p010b1.InterfaceC0523l
    /* renamed from: f */
    public final Path mo1833f() {
        boolean z6 = this.f2655d;
        Path path = this.f2652a;
        if (z6) {
            return path;
        }
        path.reset();
        path.set(this.f2654c.mo2030e());
        path.setFillType(Path.FillType.EVEN_ODD);
        C1403d.m3755b(path, this.f2656e);
        this.f2655d = true;
        return path;
    }
}
