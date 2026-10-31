package p157t5;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import p141r5.AbstractC1840b;
import p141r5.AbstractC1843e;
import p149s5.C1893g;

/* renamed from: t5.a */
/* loaded from: classes.dex */
public final class C1930a extends AbstractC1843e {

    /* renamed from: e */
    public final List<AbstractC1840b> f8721e;

    /* renamed from: f */
    public final List<AbstractC1840b> f8722f;

    /* renamed from: g */
    public final boolean f8723g;

    public C1930a(int i7, ArrayList arrayList, ArrayList arrayList2) {
        this.f8723g = false;
        this.f8315b = i7;
        this.f8721e = arrayList;
        this.f8722f = arrayList2;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        boolean z6 = this.f8723g;
        List<AbstractC1840b> list = this.f8721e;
        List<AbstractC1840b> list2 = this.f8722f;
        if (z6) {
            for (int i7 = 0; i7 < list2.size(); i7++) {
                printStream.print("function ");
                for (int i8 = 0; i8 < list.size(); i8++) {
                    list.get(i7).mo4330b(printStream);
                }
                list2.get(i7).mo4330b(printStream);
                if (i7 < list2.size() - 1) {
                    printStream.print(", ");
                }
            }
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            list.get(i9).mo4330b(printStream);
            if (i9 < list.size() - 1) {
                printStream.print(", ");
            }
        }
        printStream.print(" = ");
        for (int i10 = 0; i10 < list2.size(); i10++) {
            AbstractC1840b abstractC1840b = list2.get(i10);
            if (abstractC1840b instanceof C1893g) {
                ((C1893g) abstractC1840b).f8447i = true;
            }
            abstractC1840b.mo4330b(printStream);
            if (i10 < list2.size() - 1) {
                printStream.print(", ");
            }
        }
    }

    public C1930a(int i7, List list, List list2) {
        this.f8723g = false;
        this.f8315b = i7;
        this.f8721e = list;
        this.f8722f = list2;
        this.f8723g = true;
    }
}
