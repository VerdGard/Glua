package p149s5;

import java.io.PrintStream;
import java.util.List;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1842d;

/* renamed from: s5.f */
/* loaded from: classes.dex */
public final class C1892f extends AbstractC1842d {

    /* renamed from: f */
    public AbstractC1840b f8441f;

    /* renamed from: g */
    public C1899m f8442g;

    /* renamed from: h */
    public List<AbstractC1840b> f8443h;

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        AbstractC1840b abstractC1840b = this.f8441f;
        if (abstractC1840b != null) {
            abstractC1840b.mo4330b(printStream);
        }
        C1899m c1899m = this.f8442g;
        if (c1899m != null) {
            c1899m.mo4330b(printStream);
        }
        printStream.print("(");
        if (this.f8443h != null) {
            for (int i7 = 0; i7 < this.f8443h.size(); i7++) {
                if (this.f8443h.get(i7) != null) {
                    AbstractC1840b abstractC1840b2 = this.f8443h.get(i7);
                    if (abstractC1840b2 instanceof C1893g) {
                        ((C1893g) abstractC1840b2).f8447i = true;
                    }
                    this.f8443h.get(i7).mo4330b(printStream);
                    if (i7 < this.f8443h.size() - 1) {
                        printStream.print(", ");
                    }
                }
            }
        }
        printStream.print(")");
    }
}
