package p157t5;

import java.io.PrintStream;
import java.util.function.Consumer;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1841c;
import p141r5.AbstractC1843e;
import p141r5.C1839a;

/* renamed from: t5.o */
/* loaded from: classes.dex */
public final class C1944o extends AbstractC1843e {

    /* renamed from: e */
    public final C1839a f8755e;

    /* renamed from: f */
    public final AbstractC1840b f8756f;

    /* renamed from: t5.o$a */
    public class a implements Consumer<PrintStream> {
        public a() {
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1944o.this.f8755e.mo4330b(printStream);
        }
    }

    public C1944o(C1839a c1839a, AbstractC1840b abstractC1840b) {
        this.f8755e = c1839a;
        this.f8756f = abstractC1840b;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print("repeat");
        AbstractC1841c.m4332c(printStream, new a());
        printStream.print("until ");
        this.f8756f.mo4330b(printStream);
    }
}
