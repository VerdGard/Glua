package p157t5;

import java.io.PrintStream;
import java.util.function.Consumer;
import p141r5.AbstractC1841c;
import p141r5.AbstractC1843e;
import p141r5.C1839a;

/* renamed from: t5.e */
/* loaded from: classes.dex */
public final class C1934e extends AbstractC1843e {

    /* renamed from: e */
    public final C1839a f8726e;

    /* renamed from: t5.e$a */
    public class a implements Consumer<PrintStream> {
        public a() {
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1934e.this.f8726e.mo4330b(printStream);
        }
    }

    public C1934e(C1839a c1839a) {
        this.f8726e = c1839a;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        a aVar = new a();
        printStream.print(" do");
        AbstractC1841c.m4332c(printStream, aVar);
        printStream.print("end");
    }
}
