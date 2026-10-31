package p135r;

import java.util.ArrayList;

/* renamed from: r.k */
/* loaded from: classes.dex */
public final class C1817k {

    /* renamed from: a */
    public final AbstractC1819m f8231a;

    /* renamed from: b */
    public final ArrayList<AbstractC1819m> f8232b = new ArrayList<>();

    public C1817k(AbstractC1819m abstractC1819m) {
        this.f8231a = null;
        this.f8231a = abstractC1819m;
    }

    /* renamed from: a */
    public static long m4289a(C1812f c1812f, long j7) {
        AbstractC1819m abstractC1819m = c1812f.f8220d;
        if (abstractC1819m instanceof C1815i) {
            return j7;
        }
        ArrayList arrayList = c1812f.f8227k;
        int size = arrayList.size();
        long j8 = j7;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC1810d interfaceC1810d = (InterfaceC1810d) arrayList.get(i7);
            if (interfaceC1810d instanceof C1812f) {
                C1812f c1812f2 = (C1812f) interfaceC1810d;
                if (c1812f2.f8220d != abstractC1819m) {
                    j8 = Math.min(j8, m4289a(c1812f2, c1812f2.f8222f + j7));
                }
            }
        }
        if (c1812f != abstractC1819m.f8243i) {
            return j8;
        }
        long mo4271j = abstractC1819m.mo4271j();
        long j9 = j7 - mo4271j;
        return Math.min(Math.min(j8, m4289a(abstractC1819m.f8242h, j9)), j9 - r9.f8222f);
    }

    /* renamed from: b */
    public static long m4290b(C1812f c1812f, long j7) {
        AbstractC1819m abstractC1819m = c1812f.f8220d;
        if (abstractC1819m instanceof C1815i) {
            return j7;
        }
        ArrayList arrayList = c1812f.f8227k;
        int size = arrayList.size();
        long j8 = j7;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC1810d interfaceC1810d = (InterfaceC1810d) arrayList.get(i7);
            if (interfaceC1810d instanceof C1812f) {
                C1812f c1812f2 = (C1812f) interfaceC1810d;
                if (c1812f2.f8220d != abstractC1819m) {
                    j8 = Math.max(j8, m4290b(c1812f2, c1812f2.f8222f + j7));
                }
            }
        }
        if (c1812f != abstractC1819m.f8242h) {
            return j8;
        }
        long mo4271j = abstractC1819m.mo4271j();
        long j9 = j7 + mo4271j;
        return Math.max(Math.max(j8, m4290b(abstractC1819m.f8243i, j9)), j9 - r9.f8222f);
    }
}
