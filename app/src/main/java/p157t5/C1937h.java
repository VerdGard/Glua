package p157t5;

import java.io.PrintStream;
import java.util.function.Consumer;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1841c;
import p141r5.AbstractC1843e;
import p141r5.C1839a;

/* renamed from: t5.h */
/* loaded from: classes.dex */
public final class C1937h extends AbstractC1843e {

    /* renamed from: e */
    public String f8733e;

    /* renamed from: f */
    public AbstractC1840b f8734f;

    /* renamed from: g */
    public AbstractC1840b f8735g;

    /* renamed from: h */
    public AbstractC1840b f8736h;

    /* renamed from: i */
    public C1839a f8737i;

    /* renamed from: t5.h$a */
    public class a implements Consumer<PrintStream> {
        public a() {
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1937h.this.f8737i.mo4330b(printStream);
        }
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print("for " + this.f8733e);
        printStream.print(" = ");
        this.f8734f.mo4330b(printStream);
        printStream.print(", ");
        this.f8735g.mo4330b(printStream);
        if (this.f8736h != null) {
            printStream.print(", ");
            this.f8736h.mo4330b(printStream);
        }
        a aVar = new a();
        printStream.print(" do");
        AbstractC1841c.m4332c(printStream, aVar);
        printStream.print("end");
    }
}
