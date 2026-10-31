package p142r6;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import p142r6.C1853j;
import p150s6.C1910f;

/* renamed from: r6.g */
/* loaded from: classes.dex */
public final class C1850g extends C1852i {

    /* renamed from: x1 */
    public a f8326x1;

    /* renamed from: y1 */
    public C1910f f8327y1;

    /* renamed from: z1 */
    public int f8328z1;

    /* renamed from: r6.g$a */
    public static class a implements Cloneable {

        /* renamed from: s */
        public int f8335s;

        /* renamed from: c */
        public C1853j.a f8332c = C1853j.a.base;

        /* renamed from: m */
        public final ThreadLocal<CharsetEncoder> f8334m = new ThreadLocal<>();

        /* renamed from: X */
        public final boolean f8329X = true;

        /* renamed from: Y */
        public final int f8330Y = 1;

        /* renamed from: Z */
        public int f8331Z = 1;

        /* renamed from: e */
        public Charset f8333e = Charset.forName("UTF8");

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            try {
                a aVar = (a) super.clone();
                String name = this.f8333e.name();
                aVar.getClass();
                aVar.f8333e = Charset.forName(name);
                aVar.f8332c = C1853j.a.valueOf(this.f8332c.name());
                return aVar;
            } catch (CloneNotSupportedException e7) {
                throw new RuntimeException(e7);
            }
        }

        /* renamed from: b */
        public final CharsetEncoder m4354b() {
            CharsetEncoder newEncoder = this.f8333e.newEncoder();
            this.f8334m.set(newEncoder);
            String name = newEncoder.charset().name();
            this.f8335s = name.equals("US-ASCII") ? 1 : name.startsWith("UTF-") ? 2 : 3;
            return newEncoder;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1850g(java.lang.String r4) {
        /*
            r3 = this;
            java.util.HashMap r0 = p150s6.C1911g.f8543k
            java.lang.String r1 = "#root"
            java.lang.Object r2 = r0.get(r1)
            s6.g r2 = (p150s6.C1911g) r2
            if (r2 != 0) goto L24
            java.lang.String r1 = androidx.activity.C0143v.m418P(r1)
            androidx.activity.C0143v.m421S(r1)
            java.lang.Object r0 = r0.get(r1)
            s6.g r0 = (p150s6.C1911g) r0
            if (r0 != 0) goto L23
            s6.g r0 = new s6.g
            r0.<init>(r1)
            r1 = 0
            r0.f8552c = r1
        L23:
            r2 = r0
        L24:
            r0 = 0
            r3.<init>(r2, r4, r0)
            r6.g$a r4 = new r6.g$a
            r4.<init>()
            r3.f8326x1 = r4
            r4 = 1
            r3.f8328z1 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p142r6.C1850g.<init>(java.lang.String):void");
    }

    /* renamed from: I */
    public static C1852i m4349I(AbstractC1856m abstractC1856m) {
        if (abstractC1856m.mo4344p().equals("head")) {
            return (C1852i) abstractC1856m;
        }
        int mo4367g = abstractC1856m.mo4367g();
        for (int i7 = 0; i7 < mo4367g; i7++) {
            C1852i m4349I = m4349I(abstractC1856m.mo4370k().get(i7));
            if (m4349I != null) {
                return m4349I;
            }
        }
        return null;
    }

    @Override // p142r6.C1852i, p142r6.AbstractC1856m
    public final Object clone() {
        C1850g c1850g = (C1850g) super.clone();
        c1850g.f8326x1 = this.f8326x1.clone();
        return c1850g;
    }

    @Override // p142r6.C1852i, p142r6.AbstractC1856m
    /* renamed from: h */
    public final AbstractC1856m clone() {
        C1850g c1850g = (C1850g) super.clone();
        c1850g.f8326x1 = this.f8326x1.clone();
        return c1850g;
    }

    @Override // p142r6.C1852i, p142r6.AbstractC1856m
    /* renamed from: p */
    public final String mo4344p() {
        return "#document";
    }

    @Override // p142r6.AbstractC1856m
    /* renamed from: q */
    public final String mo4351q() {
        return m4360D();
    }

    @Override // p142r6.C1852i
    /* renamed from: z */
    public final C1852i clone() {
        C1850g c1850g = (C1850g) super.clone();
        c1850g.f8326x1 = this.f8326x1.clone();
        return c1850g;
    }
}
