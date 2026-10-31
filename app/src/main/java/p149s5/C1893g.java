package p149s5;

import java.io.PrintStream;
import java.util.List;
import java.util.function.Consumer;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1841c;
import p141r5.C1839a;

/* renamed from: s5.g */
/* loaded from: classes.dex */
public final class C1893g extends AbstractC1840b {

    /* renamed from: f */
    public List<String> f8444f;

    /* renamed from: g */
    public boolean f8445g;

    /* renamed from: h */
    public C1839a f8446h;

    /* renamed from: i */
    public boolean f8447i = false;

    /* renamed from: j */
    public int f8448j = -1;

    /* renamed from: k */
    public int f8449k = 0;

    /* renamed from: s5.g$a */
    public class a implements Consumer<PrintStream> {
        public a() {
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1893g.this.f8446h.mo4330b(printStream);
        }
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print(this.f8447i ? "function(" : "(");
        if (this.f8444f != null) {
            for (int i7 = 0; i7 < this.f8444f.size(); i7++) {
                printStream.print(this.f8444f.get(i7));
                if (i7 < this.f8444f.size() - 1) {
                    printStream.print(", ");
                }
            }
        }
        if (this.f8445g) {
            List<String> list = this.f8444f;
            if (list != null && !list.isEmpty()) {
                printStream.print(", ");
            }
            printStream.print("...");
        }
        printStream.print(")");
        this.f8449k = AbstractC1841c.f8312c;
        int i8 = this.f8448j;
        if (i8 != -1) {
            AbstractC1841c.f8312c = i8;
        }
        AbstractC1841c.m4332c(printStream, new a());
        printStream.print("end");
        if (this.f8448j == -1 && AbstractC1841c.f8313d) {
            printStream.println();
        }
        if (this.f8448j != -1) {
            AbstractC1841c.f8312c = this.f8449k;
        }
    }
}
