package p141r5;

import java.io.PrintStream;
import java.util.List;
import p149s5.C1893g;
import p157t5.C1935f;

/* renamed from: r5.a */
/* loaded from: classes.dex */
public final class C1839a extends AbstractC1841c {

    /* renamed from: e */
    public List<AbstractC1843e> f8309e;

    /* renamed from: f */
    public List<AbstractC1840b> f8310f;

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        int i7 = 0;
        while (i7 < this.f8309e.size() - 1) {
            this.f8309e.get(i7).mo4330b(printStream);
            i7++;
            if (!(this.f8309e.get(i7) instanceof C1935f)) {
                AbstractC1841c.m4333d(printStream);
            }
        }
        int size = this.f8309e.size() - 1;
        if (size >= 0) {
            this.f8309e.get(size).mo4330b(printStream);
        }
        if (this.f8310f != null) {
            AbstractC1841c.m4333d(printStream);
            printStream.print("return ");
            for (int i8 = 0; i8 < this.f8310f.size(); i8++) {
                AbstractC1840b abstractC1840b = this.f8310f.get(i8);
                if (abstractC1840b instanceof C1893g) {
                    ((C1893g) abstractC1840b).f8447i = true;
                }
                abstractC1840b.mo4330b(printStream);
                if (i8 < this.f8310f.size() - 1) {
                    printStream.print(", ");
                }
            }
        }
    }
}
