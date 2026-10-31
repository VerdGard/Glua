package p150s6;

import android.ext.C0089a;
import androidx.activity.C0143v;
import java.io.Reader;
import p120p.C1686g;
import p142r6.C1845b;
import p142r6.C1847d;
import p142r6.C1848e;
import p142r6.C1851h;
import p142r6.C1852i;
import p142r6.C1859p;
import p142r6.C1860q;
import p150s6.AbstractC1912h;

/* renamed from: s6.l */
/* loaded from: classes.dex */
public final class C1916l extends AbstractC1915k {
    @Override // p150s6.AbstractC1915k
    /* renamed from: b */
    public final C1909e mo4458b() {
        return C1909e.f8537d;
    }

    @Override // p150s6.AbstractC1915k
    /* renamed from: c */
    public final void mo4459c(Reader reader, String str, C1910f c1910f) {
        super.mo4459c(reader, str, c1910f);
        this.f8674e.add(this.f8673d);
        this.f8673d.f8326x1.f8331Z = 2;
    }

    @Override // p150s6.AbstractC1915k
    /* renamed from: e */
    public final boolean mo4460e(AbstractC1912h abstractC1912h) {
        C1852i c1852i;
        C1852i c1852i2;
        C1860q m4347x;
        int m4108c = C1686g.m4108c(abstractC1912h.f8560a);
        if (m4108c == 0) {
            AbstractC1912h.d dVar = (AbstractC1912h.d) abstractC1912h;
            C1851h c1851h = new C1851h(this.f8677h.m4490a(dVar.f8564b.toString()), dVar.f8566d.toString(), dVar.f8567e.toString());
            String str = dVar.f8565c;
            if (str != null) {
                c1851h.mo4382d("pubSysKey", str);
            }
            m4527a().m4372v(c1851h);
        } else if (m4108c == 1) {
            AbstractC1912h.g gVar = (AbstractC1912h.g) abstractC1912h;
            C1911g m4491a = C1911g.m4491a(gVar.m4505m(), this.f8677h);
            String str2 = this.f8675f;
            C1909e c1909e = this.f8677h;
            C1845b c1845b = gVar.f8577j;
            if (!c1909e.f8539b) {
                for (int i7 = 0; i7 < c1845b.f8321c; i7++) {
                    String[] strArr = c1845b.f8322e;
                    strArr[i7] = C0143v.m418P(strArr[i7]);
                }
            }
            C1852i c1852i3 = new C1852i(m4491a, str2, c1845b);
            m4527a().m4372v(c1852i3);
            if (!gVar.f8576i) {
                this.f8674e.add(c1852i3);
            } else if (!C1911g.f8543k.containsKey(m4491a.f8550a)) {
                m4491a.f8556g = true;
            }
        } else if (m4108c == 2) {
            String m4490a = this.f8677h.m4490a(((AbstractC1912h.f) abstractC1912h).f8569b);
            int size = this.f8674e.size();
            while (true) {
                size--;
                if (size < 0) {
                    c1852i = null;
                    break;
                }
                c1852i = this.f8674e.get(size);
                if (c1852i.mo4344p().equals(m4490a)) {
                    break;
                }
            }
            if (c1852i != null) {
                int size2 = this.f8674e.size();
                do {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    c1852i2 = this.f8674e.get(size2);
                    this.f8674e.remove(size2);
                } while (c1852i2 != c1852i);
            }
        } else if (m4108c == 3) {
            AbstractC1912h.c cVar = (AbstractC1912h.c) abstractC1912h;
            C1848e c1848e = new C1848e(cVar.f8562b.toString());
            if (cVar.f8563c && c1848e.m4348y() && (m4347x = c1848e.m4347x()) != null) {
                c1848e = m4347x;
            }
            m4527a().m4372v(c1848e);
        } else if (m4108c == 4) {
            AbstractC1912h.b bVar = (AbstractC1912h.b) abstractC1912h;
            String str3 = bVar.f8561b;
            m4527a().m4372v(bVar instanceof AbstractC1912h.a ? new C1847d(str3) : new C1859p(str3));
        } else if (m4108c != 5) {
            throw new IllegalArgumentException("Unexpected token type: ".concat(C0089a.m214l(abstractC1912h.f8560a)));
        }
        return true;
    }
}
