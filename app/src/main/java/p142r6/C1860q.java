package p142r6;

import androidx.activity.C0143v;
import p142r6.C1850g;

/* renamed from: r6.q */
/* loaded from: classes.dex */
public final class C1860q extends AbstractC1855l {

    /* renamed from: X */
    public final boolean f8361X;

    public C1860q(String str, boolean z6) {
        C0143v.m423U(str);
        this.f8356m = str;
        this.f8361X = z6;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: p */
    public final String mo4344p() {
        return "#declaration";
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: r */
    public final void mo4345r(Appendable appendable, int i7, C1850g.a aVar) {
        Appendable append = appendable.append("<");
        boolean z6 = this.f8361X;
        append.append(z6 ? "!" : "?").append(m4384v());
        C1845b mo4365e = mo4365e();
        mo4365e.getClass();
        int i8 = 0;
        while (true) {
            if (!(i8 < mo4365e.f8321c)) {
                break;
            }
            String str = mo4365e.f8322e[i8];
            String str2 = mo4365e.f8323m[i8];
            C0143v.m423U(str);
            String trim = str.trim();
            C0143v.m421S(trim);
            i8++;
            if (!trim.equals("#declaration")) {
                appendable.append(' ');
                appendable.append(trim);
                if (!C1844a.m4334a(trim, str2, aVar)) {
                    appendable.append("=\"");
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1853j.m4378b(appendable, str2, aVar, true, false);
                    appendable.append('\"');
                }
            }
        }
        appendable.append(z6 ? "!" : "?").append(">");
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: s */
    public final void mo4346s(Appendable appendable, int i7, C1850g.a aVar) {
    }

    @Override // p142r6.AbstractC1856m
    public final String toString() {
        return mo4351q();
    }
}
