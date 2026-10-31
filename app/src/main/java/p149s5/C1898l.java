package p149s5;

import java.io.PrintStream;
import p141r5.AbstractC1840b;

/* renamed from: s5.l */
/* loaded from: classes.dex */
public final class C1898l extends AbstractC1840b {

    /* renamed from: f */
    public final AbstractC1840b f8454f;

    public C1898l(AbstractC1840b abstractC1840b) {
        this.f8454f = abstractC1840b;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        AbstractC1840b abstractC1840b = this.f8454f;
        if (abstractC1840b != null) {
            printStream.print("(");
            abstractC1840b.mo4330b(printStream);
            printStream.print(")");
        }
    }
}
