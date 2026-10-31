package p142r6;

import java.io.IOException;
import p119o6.C1678e;
import p142r6.C1850g;

/* renamed from: r6.d */
/* loaded from: classes.dex */
public final class C1847d extends C1859p {
    public C1847d(String str) {
        super(str);
    }

    @Override // p142r6.C1859p, p142r6.AbstractC1856m
    /* renamed from: p */
    public final String mo4344p() {
        return "#cdata";
    }

    @Override // p142r6.C1859p, p142r6.AbstractC1856m
    /* renamed from: r */
    public final void mo4345r(Appendable appendable, int i7, C1850g.a aVar) {
        appendable.append("<![CDATA[").append(m4384v());
    }

    @Override // p142r6.C1859p, p142r6.AbstractC1856m
    /* renamed from: s */
    public final void mo4346s(Appendable appendable, int i7, C1850g.a aVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e7) {
            throw new C1678e(e7);
        }
    }
}
