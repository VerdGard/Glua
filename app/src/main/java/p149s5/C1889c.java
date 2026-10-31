package p149s5;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import p141r5.AbstractC1840b;

/* renamed from: s5.c */
/* loaded from: classes.dex */
public final class C1889c extends AbstractC1840b {

    /* renamed from: f */
    public final List<AbstractC1840b> f8439f;

    public C1889c(int i7, ArrayList arrayList) {
        this.f8314a = i7;
        this.f8439f = arrayList;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        List<AbstractC1840b> list = this.f8439f;
        if (list.isEmpty()) {
            return;
        }
        list.get(0).mo4330b(printStream);
        for (int i7 = 1; i7 < list.size(); i7++) {
            printStream.print(" .. ");
            list.get(i7).mo4330b(printStream);
        }
    }
}
