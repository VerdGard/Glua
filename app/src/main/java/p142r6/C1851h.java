package p142r6;

import androidx.activity.C0143v;
import p134q6.C1806b;
import p142r6.C1850g;

/* renamed from: r6.h */
/* loaded from: classes.dex */
public final class C1851h extends AbstractC1855l {
    public C1851h(String str, String str2, String str3) {
        C0143v.m423U(str);
        C0143v.m423U(str2);
        C0143v.m423U(str3);
        mo4382d("name", str);
        mo4382d("publicId", str2);
        if (m4355x("publicId")) {
            mo4382d("pubSysKey", "PUBLIC");
        }
        mo4382d("systemId", str3);
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: p */
    public final String mo4344p() {
        return "#doctype";
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: r */
    public final void mo4345r(Appendable appendable, int i7, C1850g.a aVar) {
        appendable.append((aVar.f8331Z != 1 || m4355x("publicId") || m4355x("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (m4355x("name")) {
            appendable.append(" ").append(mo4381c("name"));
        }
        if (m4355x("pubSysKey")) {
            appendable.append(" ").append(mo4381c("pubSysKey"));
        }
        if (m4355x("publicId")) {
            appendable.append(" \"").append(mo4381c("publicId")).append('\"');
        }
        if (m4355x("systemId")) {
            appendable.append(" \"").append(mo4381c("systemId")).append('\"');
        }
        appendable.append('>');
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: s */
    public final void mo4346s(Appendable appendable, int i7, C1850g.a aVar) {
    }

    /* renamed from: x */
    public final boolean m4355x(String str) {
        return !C1806b.m4260d(mo4381c(str));
    }
}
