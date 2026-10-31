package p149s5;

import java.io.PrintStream;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1842d;
import p164u5.EnumC1978c;

/* renamed from: s5.n */
/* loaded from: classes.dex */
public final class C1900n extends AbstractC1842d {

    /* renamed from: f */
    public final AbstractC1840b f8457f;

    /* renamed from: g */
    public final AbstractC1840b f8458g;

    /* renamed from: h */
    public final EnumC1978c f8459h;

    public C1900n(int i7, AbstractC1840b abstractC1840b, AbstractC1840b abstractC1840b2) {
        this.f8459h = EnumC1978c.f8927u2;
        this.f8315b = i7;
        this.f8457f = abstractC1840b;
        this.f8458g = abstractC1840b2;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        this.f8457f.mo4330b(printStream);
        EnumC1978c enumC1978c = EnumC1978c.f8897X;
        AbstractC1840b abstractC1840b = this.f8458g;
        if (this.f8459h == enumC1978c) {
            printStream.print(".");
            abstractC1840b.mo4330b(printStream);
        } else {
            printStream.print("[");
            abstractC1840b.mo4330b(printStream);
            printStream.print("]");
        }
    }

    public C1900n(int i7, AbstractC1840b abstractC1840b, C1899m c1899m) {
        EnumC1978c enumC1978c = EnumC1978c.f8897X;
        this.f8459h = EnumC1978c.f8927u2;
        this.f8315b = i7;
        this.f8457f = abstractC1840b;
        this.f8458g = c1899m;
        this.f8459h = enumC1978c;
    }
}
