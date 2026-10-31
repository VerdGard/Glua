package p149s5;

import java.io.PrintStream;
import p141r5.AbstractC1840b;
import p164u5.C1977b;
import p164u5.EnumC1978c;

/* renamed from: s5.a */
/* loaded from: classes.dex */
public final class C1887a extends AbstractC1840b {

    /* renamed from: f */
    public final EnumC1978c f8434f;

    /* renamed from: g */
    public final AbstractC1840b f8435g;

    /* renamed from: h */
    public AbstractC1840b f8436h;

    public C1887a(C1977b c1977b, AbstractC1840b abstractC1840b, AbstractC1840b abstractC1840b2) {
        this.f8314a = c1977b.f8862a;
        this.f8435g = abstractC1840b;
        this.f8436h = abstractC1840b2;
        EnumC1978c enumC1978c = c1977b.f8863b;
        if (enumC1978c == EnumC1978c.f8876D1) {
            enumC1978c = EnumC1978c.f8934y2;
        } else if (enumC1978c == EnumC1978c.f8878E1) {
            enumC1978c = EnumC1978c.f8871A2;
        }
        this.f8434f = enumC1978c;
    }

    /* renamed from: e */
    public static String m4429e(EnumC1978c enumC1978c) {
        if (enumC1978c == EnumC1978c.f8879F1) {
            return "+";
        }
        if (enumC1978c == EnumC1978c.f8934y2) {
            return "-";
        }
        if (enumC1978c == EnumC1978c.f8880G1) {
            return "*";
        }
        if (enumC1978c == EnumC1978c.f8881H1) {
            return "/";
        }
        if (enumC1978c == EnumC1978c.f8884K1) {
            return "%";
        }
        if (enumC1978c == EnumC1978c.f8883J1) {
            return "^";
        }
        if (enumC1978c == EnumC1978c.f8932x2) {
            return "-";
        }
        if (enumC1978c == EnumC1978c.f8896W1) {
            return "#";
        }
        if (enumC1978c == EnumC1978c.f8871A2) {
            return "~";
        }
        if (enumC1978c == EnumC1978c.f8882I1) {
            return "//";
        }
        if (enumC1978c == EnumC1978c.f8885L1) {
            return "&";
        }
        if (enumC1978c == EnumC1978c.f8886M1) {
            return "|";
        }
        if (enumC1978c == EnumC1978c.f8888O1) {
            return "<<";
        }
        if (enumC1978c == EnumC1978c.f8887N1) {
            return ">>";
        }
        if (enumC1978c == EnumC1978c.f8936z2) {
            return "~";
        }
        if (enumC1978c == EnumC1978c.f8892S1) {
            return ">";
        }
        if (enumC1978c == EnumC1978c.f8893T1) {
            return ">=";
        }
        if (enumC1978c == EnumC1978c.f8900Y1) {
            return "or";
        }
        if (enumC1978c == EnumC1978c.f8898X1) {
            return "and";
        }
        if (enumC1978c == EnumC1978c.f8902Z1) {
            return "not";
        }
        if (enumC1978c == EnumC1978c.f8895V1) {
            return "~=";
        }
        if (enumC1978c == EnumC1978c.f8890Q1) {
            return "<";
        }
        if (enumC1978c == EnumC1978c.f8891R1) {
            return "<=";
        }
        if (enumC1978c == EnumC1978c.f8894U1) {
            return "==";
        }
        return "无法解析[" + enumC1978c + "]";
    }

    @Override // p141r5.AbstractC1841c
    /* renamed from: b */
    public final void mo4330b(PrintStream printStream) {
        String m4429e;
        EnumC1978c enumC1978c = EnumC1978c.f8896W1;
        AbstractC1840b abstractC1840b = this.f8435g;
        EnumC1978c enumC1978c2 = this.f8434f;
        if (enumC1978c2 == enumC1978c || enumC1978c2 == EnumC1978c.f8932x2 || enumC1978c2 == EnumC1978c.f8936z2) {
            abstractC1840b.mo4330b(printStream);
            m4429e = m4429e(enumC1978c2);
        } else {
            EnumC1978c enumC1978c3 = EnumC1978c.f8902Z1;
            abstractC1840b.mo4330b(printStream);
            StringBuilder sb = enumC1978c2 == enumC1978c3 ? new StringBuilder() : new StringBuilder(" ");
            sb.append(m4429e(enumC1978c2));
            sb.append(" ");
            m4429e = sb.toString();
        }
        printStream.print(m4429e);
        this.f8436h.mo4330b(printStream);
    }
}
