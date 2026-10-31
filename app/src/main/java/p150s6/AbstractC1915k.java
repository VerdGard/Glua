package p150s6;

import androidx.activity.C0143v;
import java.io.Reader;
import java.util.ArrayList;
import p142r6.C1850g;
import p142r6.C1852i;
import p150s6.AbstractC1912h;

/* renamed from: s6.k */
/* loaded from: classes.dex */
public abstract class AbstractC1915k {

    /* renamed from: a */
    public C1910f f8670a;

    /* renamed from: b */
    public C1905a f8671b;

    /* renamed from: c */
    public C1913i f8672c;

    /* renamed from: d */
    public C1850g f8673d;

    /* renamed from: e */
    public ArrayList<C1852i> f8674e;

    /* renamed from: f */
    public String f8675f;

    /* renamed from: g */
    public AbstractC1912h f8676g;

    /* renamed from: h */
    public C1909e f8677h;

    /* renamed from: i */
    public final AbstractC1912h.g f8678i = new AbstractC1912h.g();

    /* renamed from: j */
    public final AbstractC1912h.f f8679j = new AbstractC1912h.f();

    /* renamed from: a */
    public final C1852i m4527a() {
        int size = this.f8674e.size();
        if (size > 0) {
            return this.f8674e.get(size - 1);
        }
        return null;
    }

    /* renamed from: b */
    public abstract C1909e mo4458b();

    /* renamed from: c */
    public void mo4459c(Reader reader, String str, C1910f c1910f) {
        C0143v.m424V(str, "BaseURI must not be null");
        C1850g c1850g = new C1850g(str);
        this.f8673d = c1850g;
        c1850g.f8327y1 = c1910f;
        this.f8670a = c1910f;
        this.f8677h = c1910f.f8542c;
        this.f8671b = new C1905a(reader, 32768);
        this.f8676g = null;
        this.f8672c = new C1913i(this.f8671b, c1910f.f8541b);
        this.f8674e = new ArrayList<>(32);
        this.f8675f = str;
    }

    /* renamed from: d */
    public final C1850g m4528d(Reader reader, String str, C1910f c1910f) {
        AbstractC1912h abstractC1912h;
        mo4459c(reader, str, c1910f);
        do {
            C1913i c1913i = this.f8672c;
            while (!c1913i.f8584e) {
                c1913i.f8582c.mo4525d(c1913i, c1913i.f8580a);
            }
            StringBuilder sb = c1913i.f8586g;
            int length = sb.length();
            AbstractC1912h.b bVar = c1913i.f8591l;
            if (length > 0) {
                String sb2 = sb.toString();
                sb.delete(0, sb.length());
                c1913i.f8585f = null;
                bVar.f8561b = sb2;
                abstractC1912h = bVar;
            } else {
                String str2 = c1913i.f8585f;
                if (str2 != null) {
                    bVar.f8561b = str2;
                    c1913i.f8585f = null;
                    abstractC1912h = bVar;
                } else {
                    c1913i.f8584e = false;
                    abstractC1912h = c1913i.f8583d;
                }
            }
            mo4460e(abstractC1912h);
            abstractC1912h.mo4498f();
        } while (abstractC1912h.f8560a != 6);
        return this.f8673d;
    }

    /* renamed from: e */
    public abstract boolean mo4460e(AbstractC1912h abstractC1912h);

    /* renamed from: f */
    public final boolean m4529f(String str) {
        AbstractC1912h abstractC1912h = this.f8676g;
        AbstractC1912h.f fVar = this.f8679j;
        if (abstractC1912h == fVar) {
            AbstractC1912h.f fVar2 = new AbstractC1912h.f();
            fVar2.m4506n(str);
            return mo4460e(fVar2);
        }
        fVar.mo4498f();
        fVar.m4506n(str);
        return mo4460e(fVar);
    }

    /* renamed from: g */
    public final void m4530g(String str) {
        AbstractC1912h abstractC1912h = this.f8676g;
        AbstractC1912h.g gVar = this.f8678i;
        if (abstractC1912h == gVar) {
            AbstractC1912h.g gVar2 = new AbstractC1912h.g();
            gVar2.m4506n(str);
            mo4460e(gVar2);
        } else {
            gVar.mo4498f();
            gVar.m4506n(str);
            mo4460e(gVar);
        }
    }
}
