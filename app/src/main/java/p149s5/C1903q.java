package p149s5;

import java.io.PrintStream;
import p141r5.AbstractC1840b;
import p164u5.C1977b;
import p164u5.EnumC1978c;

/* renamed from: s5.q */
/* loaded from: classes.dex */
public final class C1903q extends AbstractC1840b {

    /* renamed from: f */
    public final EnumC1978c f8462f;

    /* renamed from: g */
    public final AbstractC1840b f8463g;

    public C1903q(C1977b c1977b, AbstractC1840b abstractC1840b) {
        this.f8314a = c1977b.f8862a;
        this.f8463g = abstractC1840b;
        EnumC1978c enumC1978c = c1977b.f8863b;
        if (enumC1978c == EnumC1978c.f8876D1) {
            enumC1978c = EnumC1978c.f8932x2;
        } else if (enumC1978c == EnumC1978c.f8878E1) {
            enumC1978c = EnumC1978c.f8936z2;
        }
        this.f8462f = enumC1978c;
    }

    /* renamed from: e */
    public static String m4431e(EnumC1978c enumC1978c) {
        EnumC1978c enumC1978c2 = EnumC1978c.f8896W1;
        if (enumC1978c == enumC1978c2) {
            return "#";
        }
        EnumC1978c enumC1978c3 = EnumC1978c.f8902Z1;
        if (enumC1978c == enumC1978c3) {
            return "not";
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
        if (enumC1978c == EnumC1978c.f8932x2) {
            return "-";
        }
        if (enumC1978c == enumC1978c2) {
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
        if (enumC1978c == enumC1978c3) {
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
        String m4431e;
        EnumC1978c enumC1978c = EnumC1978c.f8896W1;
        EnumC1978c enumC1978c2 = this.f8462f;
        if (enumC1978c2 == enumC1978c || enumC1978c2 == EnumC1978c.f8932x2 || enumC1978c2 == EnumC1978c.f8936z2) {
            m4431e = m4431e(enumC1978c2);
        } else {
            StringBuilder sb = enumC1978c2 == EnumC1978c.f8902Z1 ? new StringBuilder() : new StringBuilder(" ");
            sb.append(m4431e(enumC1978c2));
            sb.append(" ");
            m4431e = sb.toString();
        }
        printStream.print(m4431e);
        this.f8463g.mo4330b(printStream);
    }
}
