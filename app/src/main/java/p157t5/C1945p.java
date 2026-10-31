package p157t5;

import java.io.PrintStream;
import java.util.function.Consumer;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1841c;
import p141r5.AbstractC1843e;
import p141r5.C1839a;

/* renamed from: t5.p */
/* loaded from: classes.dex */
public final class C1945p extends AbstractC1843e {

    /* renamed from: e */
    public final AbstractC1840b f8758e;

    /* renamed from: f */
    public final C1839a f8759f;

    /* renamed from: t5.p$a */
    public class a implements Consumer<PrintStream> {
        public a() {
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1945p.this.f8759f.mo4330b(printStream);
        }
    }

    public C1945p(C1839a c1839a, AbstractC1840b abstractC1840b) {
        this.f8758e = abstractC1840b;
        this.f8759f = c1839a;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print("while ");
        this.f8758e.mo4330b(printStream);
        a aVar = new a();
        printStream.print(" do");
        AbstractC1841c.m4332c(printStream, aVar);
        printStream.print("end");
    }
}
