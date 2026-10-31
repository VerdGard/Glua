package p157t5;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1843e;
import p149s5.C1893g;

/* renamed from: t5.n */
/* loaded from: classes.dex */
public final class C1943n extends AbstractC1843e {

    /* renamed from: e */
    public final List<String> f8753e;

    /* renamed from: f */
    public final List<AbstractC1840b> f8754f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public C1943n(int i7, ArrayList arrayList, ArrayList arrayList2) {
        this.f8315b = i7;
        this.f8753e = arrayList;
        this.f8754f = arrayList2 == null ? Collections.emptyList() : arrayList2;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print("local ");
        int i7 = 0;
        while (true) {
            List<String> list = this.f8753e;
            if (i7 >= list.size()) {
                break;
            }
            printStream.print(list.get(i7));
            if (i7 < list.size() - 1) {
                printStream.print(", ");
            }
            i7++;
        }
        List<AbstractC1840b> list2 = this.f8754f;
        if (list2 != null && list2.size() > 0) {
            printStream.print(" = ");
        }
        for (int i8 = 0; i8 < list2.size(); i8++) {
            AbstractC1840b abstractC1840b = list2.get(i8);
            if (abstractC1840b instanceof C1893g) {
                printStream.print("function");
            }
            abstractC1840b.mo4330b(printStream);
            if (i8 < list2.size() - 1) {
                printStream.print(", ");
            }
        }
    }
}
