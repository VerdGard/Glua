package p149s5;

import java.io.PrintStream;
import p141r5.AbstractC1841c;
import p141r5.AbstractC1842d;

/* renamed from: s5.i */
/* loaded from: classes.dex */
public final class C1895i extends AbstractC1842d {

    /* renamed from: f */
    public final String f8452f;

    public C1895i(int i7, String str) {
        this.f8314a = i7;
        this.f8452f = str;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print(this.f8452f);
        String str = this.f8311e;
        if (!AbstractC1841c.f8313d || str == null) {
            return;
        }
        printStream.print("--".concat(str));
        printStream.println();
    }
}
