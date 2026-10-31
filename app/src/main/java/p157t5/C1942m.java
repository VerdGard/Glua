package p157t5;

import java.io.PrintStream;
import p141r5.AbstractC1843e;
import p149s5.C1893g;

/* renamed from: t5.m */
/* loaded from: classes.dex */
public final class C1942m extends AbstractC1843e {

    /* renamed from: e */
    public final String f8751e;

    /* renamed from: f */
    public final C1893g f8752f;

    public C1942m(String str, C1893g c1893g) {
        this.f8751e = str;
        this.f8752f = c1893g;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print("local function " + this.f8751e);
        this.f8752f.mo4330b(printStream);
    }
}
