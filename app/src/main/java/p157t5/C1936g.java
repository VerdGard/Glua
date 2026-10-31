package p157t5;

import java.io.PrintStream;
import java.util.List;
import java.util.function.Consumer;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1841c;
import p141r5.AbstractC1843e;
import p141r5.C1839a;

/* renamed from: t5.g */
/* loaded from: classes.dex */
public final class C1936g extends AbstractC1843e {

    /* renamed from: e */
    public List<String> f8729e;

    /* renamed from: f */
    public List<AbstractC1840b> f8730f;

    /* renamed from: g */
    public C1839a f8731g;

    /* renamed from: t5.g$a */
    public class a implements Consumer<PrintStream> {
        public a() {
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1936g.this.f8731g.mo4330b(printStream);
        }
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print("for ");
        for (int i7 = 0; i7 < this.f8729e.size(); i7++) {
            printStream.print(this.f8729e.get(i7));
            if (i7 < this.f8729e.size() - 1) {
                printStream.print(", ");
            }
        }
        printStream.print(" in ");
        for (int i8 = 0; i8 < this.f8730f.size(); i8++) {
            this.f8730f.get(i8).mo4330b(printStream);
            if (i8 < this.f8730f.size() - 1) {
                printStream.print(", ");
            }
        }
        printStream.print(" do");
        AbstractC1841c.m4332c(printStream, new a());
        printStream.print("end");
    }
}
