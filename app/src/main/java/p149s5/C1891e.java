package p149s5;

import java.io.PrintStream;
import p133q5.AbstractC1802e;
import p133q5.C1798a;
import p133q5.C1800c;
import p141r5.AbstractC1840b;

/* renamed from: s5.e */
/* loaded from: classes.dex */
public final class C1891e extends AbstractC1840b {

    /* renamed from: f */
    public AbstractC1802e f8440f;

    public C1891e(int i7, Double d7) {
        AbstractC1802e c1798a;
        this.f8314a = i7;
        double doubleValue = d7.doubleValue();
        int i8 = (int) doubleValue;
        if (doubleValue == i8) {
            int i9 = C1798a.f8169X;
            c1798a = C1800c.m4254B(i8);
        } else {
            c1798a = new C1798a(doubleValue);
        }
        this.f8440f = c1798a;
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        printStream.print(this.f8440f.mo4252y());
    }
}
