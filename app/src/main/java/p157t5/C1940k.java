package p157t5;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1841c;
import p141r5.AbstractC1843e;
import p141r5.C1839a;

/* renamed from: t5.k */
/* loaded from: classes.dex */
public final class C1940k extends AbstractC1843e {

    /* renamed from: e */
    public final AbstractC1840b f8741e;

    /* renamed from: f */
    public final C1839a f8742f;

    /* renamed from: g */
    public final List<AbstractC1840b> f8743g;

    /* renamed from: h */
    public final List<C1839a> f8744h;

    /* renamed from: i */
    public final C1839a f8745i;

    /* renamed from: t5.k$a */
    public class a implements Consumer<PrintStream> {
        public a() {
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1940k.this.f8742f.mo4330b(printStream);
        }
    }

    /* renamed from: t5.k$b */
    public class b implements Consumer<PrintStream> {

        /* renamed from: a */
        public final /* synthetic */ int f8747a;

        public b(int i7) {
            this.f8747a = i7;
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1940k.this.f8744h.get(this.f8747a).mo4330b(printStream);
        }
    }

    /* renamed from: t5.k$c */
    public class c implements Consumer<PrintStream> {
        public c() {
        }

        @Override // java.util.function.Consumer
        public final void accept(PrintStream printStream) {
            C1940k.this.f8745i.mo4330b(printStream);
        }
    }

    public C1940k(AbstractC1840b abstractC1840b, C1839a c1839a, ArrayList arrayList, ArrayList arrayList2, C1839a c1839a2) {
        this.f8741e = abstractC1840b;
        this.f8742f = c1839a;
        this.f8743g = arrayList;
        this.f8744h = arrayList2;
        this.f8745i = c1839a2;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print("if ");
        this.f8741e.mo4330b(printStream);
        printStream.print(" then");
        AbstractC1841c.m4332c(printStream, new a());
        if (this.f8744h != null) {
            int i7 = 0;
            while (true) {
                List<AbstractC1840b> list = this.f8743g;
                if (i7 >= list.size()) {
                    break;
                }
                printStream.print("elseif ");
                list.get(i7).mo4330b(printStream);
                printStream.print(" then");
                AbstractC1841c.m4332c(printStream, new b(i7));
                i7++;
            }
        }
        if (this.f8745i != null) {
            printStream.print("else");
            AbstractC1841c.m4332c(printStream, new c());
        }
        printStream.print("end");
    }
}
