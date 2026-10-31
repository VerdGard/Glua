package p135r;

import android.ext.C0090b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: r.f */
/* loaded from: classes.dex */
public class C1812f implements InterfaceC1810d {

    /* renamed from: d */
    public final AbstractC1819m f8220d;

    /* renamed from: f */
    public int f8222f;

    /* renamed from: g */
    public int f8223g;

    /* renamed from: a */
    public AbstractC1819m f8217a = null;

    /* renamed from: b */
    public boolean f8218b = false;

    /* renamed from: c */
    public boolean f8219c = false;

    /* renamed from: e */
    public int f8221e = 1;

    /* renamed from: h */
    public int f8224h = 1;

    /* renamed from: i */
    public C1813g f8225i = null;

    /* renamed from: j */
    public boolean f8226j = false;

    /* renamed from: k */
    public final ArrayList f8227k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f8228l = new ArrayList();

    public C1812f(AbstractC1819m abstractC1819m) {
        this.f8220d = abstractC1819m;
    }

    @Override // p135r.InterfaceC1810d
    /* renamed from: a */
    public final void mo4267a(InterfaceC1810d interfaceC1810d) {
        ArrayList arrayList = this.f8228l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1812f) it.next()).f8226j) {
                return;
            }
        }
        this.f8219c = true;
        AbstractC1819m abstractC1819m = this.f8217a;
        if (abstractC1819m != null) {
            abstractC1819m.mo4267a(this);
        }
        if (this.f8218b) {
            this.f8220d.mo4267a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C1812f c1812f = null;
        int i7 = 0;
        while (it2.hasNext()) {
            C1812f c1812f2 = (C1812f) it2.next();
            if (!(c1812f2 instanceof C1813g)) {
                i7++;
                c1812f = c1812f2;
            }
        }
        if (c1812f != null && i7 == 1 && c1812f.f8226j) {
            C1813g c1813g = this.f8225i;
            if (c1813g != null) {
                if (!c1813g.f8226j) {
                    return;
                } else {
                    this.f8222f = this.f8224h * c1813g.f8223g;
                }
            }
            mo4284d(c1812f.f8223g + this.f8222f);
        }
        AbstractC1819m abstractC1819m2 = this.f8217a;
        if (abstractC1819m2 != null) {
            abstractC1819m2.mo4267a(this);
        }
    }

    /* renamed from: b */
    public final void m4282b(InterfaceC1810d interfaceC1810d) {
        this.f8227k.add(interfaceC1810d);
        if (this.f8226j) {
            interfaceC1810d.mo4267a(interfaceC1810d);
        }
    }

    /* renamed from: c */
    public final void m4283c() {
        this.f8228l.clear();
        this.f8227k.clear();
        this.f8226j = false;
        this.f8223g = 0;
        this.f8219c = false;
        this.f8218b = false;
    }

    /* renamed from: d */
    public void mo4284d(int i7) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8220d.f8236b.f7774Y);
        sb.append(":");
        sb.append(C0090b.m225k(this.f8221e));
        sb.append("(");
        sb.append(this.f8226j ? Integer.valueOf(this.f8223g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f8228l.size());
        sb.append(":d=");
        sb.append(this.f8227k.size());
        sb.append(">");
        return sb.toString();
    }
}
