package p142r6;

import java.io.StringReader;
import p142r6.C1850g;
import p150s6.C1910f;
import p150s6.C1916l;

/* renamed from: r6.e */
/* loaded from: classes.dex */
public final class C1848e extends AbstractC1855l {
    public C1848e(String str) {
        this.f8356m = str;
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: p */
    public final String mo4344p() {
        return "#comment";
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: r */
    public final void mo4345r(Appendable appendable, int i7, C1850g.a aVar) {
        if (aVar.f8329X) {
            AbstractC1856m.m4386n(appendable, i7, aVar);
        }
        appendable.append("<!--").append(m4384v()).append("-->");
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: s */
    public final void mo4346s(Appendable appendable, int i7, C1850g.a aVar) {
    }

    @Override // p142r6.AbstractC1856m
    public final String toString() {
        return mo4351q();
    }

    /* renamed from: x */
    public final C1860q m4347x() {
        String m4384v = m4384v();
        String str = "<" + m4384v.substring(1, m4384v.length() - 1) + ">";
        String mo4366f = mo4366f();
        C1916l c1916l = new C1916l();
        C1850g m4528d = c1916l.m4528d(new StringReader(str), mo4366f, new C1910f(c1916l));
        if (m4528d.m4374y().size() <= 0) {
            return null;
        }
        C1852i c1852i = m4528d.m4373x().get(0);
        C1860q c1860q = new C1860q(C1857n.m4390a(m4528d).f8542c.m4490a(c1852i.f8340m.f8550a), m4384v.startsWith("!"));
        c1860q.mo4365e().m4335a(c1852i.mo4365e());
        return c1860q;
    }

    /* renamed from: y */
    public final boolean m4348y() {
        String m4384v = m4384v();
        return m4384v.length() > 1 && (m4384v.startsWith("!") || m4384v.startsWith("?"));
    }
}
