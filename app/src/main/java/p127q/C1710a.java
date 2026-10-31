package p127q;

import android.ext.C0089a;
import android.ext.C0090b;
import p120p.C1681b;
import p120p.C1683d;
import p120p.C1686g;
import p120p.C1687h;

/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C1710a extends C1718i {

    /* renamed from: g0 */
    public int f7714g0 = 0;

    /* renamed from: h0 */
    public boolean f7715h0 = true;

    /* renamed from: i0 */
    public int f7716i0 = 0;

    @Override // p127q.C1713d
    /* renamed from: b */
    public final void mo4145b(C1683d c1683d) {
        boolean z6;
        C1687h c1687h;
        C1712c c1712c;
        int i7;
        int i8;
        C1712c[] c1712cArr = this.f7756G;
        C1712c c1712c2 = this.f7804y;
        c1712cArr[0] = c1712c2;
        int i9 = 2;
        C1712c c1712c3 = this.f7805z;
        c1712cArr[2] = c1712c3;
        C1712c c1712c4 = this.f7750A;
        c1712cArr[1] = c1712c4;
        C1712c c1712c5 = this.f7751B;
        c1712cArr[3] = c1712c5;
        for (C1712c c1712c6 : c1712cArr) {
            c1712c6.f7740g = c1683d.m4097k(c1712c6);
        }
        int i10 = this.f7714g0;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        C1712c c1712c7 = c1712cArr[i10];
        for (int i11 = 0; i11 < this.f7869f0; i11++) {
            C1713d c1713d = this.f7868e0[i11];
            if ((this.f7715h0 || c1713d.mo4146c()) && ((((i8 = this.f7714g0) == 0 || i8 == 1) && c1713d.f7759J[0] == 3 && c1713d.f7804y.f7737d != null && c1713d.f7750A.f7737d != null) || ((i8 == 2 || i8 == 3) && c1713d.f7759J[1] == 3 && c1713d.f7805z.f7737d != null && c1713d.f7751B.f7737d != null))) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        boolean z7 = c1712c2.m4151e() || c1712c4.m4151e();
        boolean z8 = c1712c3.m4151e() || c1712c5.m4151e();
        int i12 = !(!z6 && (((i7 = this.f7714g0) == 0 && z7) || ((i7 == 2 && z8) || ((i7 == 1 && z7) || (i7 == 3 && z8))))) ? 4 : 5;
        int i13 = 0;
        while (i13 < this.f7869f0) {
            C1713d c1713d2 = this.f7868e0[i13];
            if (this.f7715h0 || c1713d2.mo4146c()) {
                C1687h m4097k = c1683d.m4097k(c1713d2.f7756G[this.f7714g0]);
                int i14 = this.f7714g0;
                C1712c c1712c8 = c1713d2.f7756G[i14];
                c1712c8.f7740g = m4097k;
                C1712c c1712c9 = c1712c8.f7737d;
                int i15 = (c1712c9 == null || c1712c9.f7735b != this) ? 0 : c1712c8.f7738e + 0;
                if (i14 == 0 || i14 == i9) {
                    C1687h c1687h2 = c1712c7.f7740g;
                    int i16 = this.f7716i0 - i15;
                    C1681b m4098l = c1683d.m4098l();
                    C1687h m4099m = c1683d.m4099m();
                    m4099m.f7600d = 0;
                    m4098l.m4079d(c1687h2, m4097k, m4099m, i16);
                    c1683d.m4089c(m4098l);
                } else {
                    C1687h c1687h3 = c1712c7.f7740g;
                    int i17 = this.f7716i0 + i15;
                    C1681b m4098l2 = c1683d.m4098l();
                    C1687h m4099m2 = c1683d.m4099m();
                    m4099m2.f7600d = 0;
                    m4098l2.m4078c(c1687h3, m4097k, m4099m2, i17);
                    c1683d.m4089c(m4098l2);
                }
                c1683d.m4091e(c1712c7.f7740g, m4097k, this.f7716i0 + i15, i12);
            }
            i13++;
            i9 = 2;
        }
        int i18 = this.f7714g0;
        if (i18 == 0) {
            c1683d.m4091e(c1712c4.f7740g, c1712c2.f7740g, 0, 8);
            c1683d.m4091e(c1712c2.f7740g, this.f7760K.f7750A.f7740g, 0, 4);
            c1687h = c1712c2.f7740g;
            c1712c = this.f7760K.f7804y;
        } else if (i18 == 1) {
            c1683d.m4091e(c1712c2.f7740g, c1712c4.f7740g, 0, 8);
            c1683d.m4091e(c1712c2.f7740g, this.f7760K.f7804y.f7740g, 0, 4);
            c1687h = c1712c2.f7740g;
            c1712c = this.f7760K.f7750A;
        } else if (i18 == 2) {
            c1683d.m4091e(c1712c5.f7740g, c1712c3.f7740g, 0, 8);
            c1683d.m4091e(c1712c3.f7740g, this.f7760K.f7751B.f7740g, 0, 4);
            c1687h = c1712c3.f7740g;
            c1712c = this.f7760K.f7805z;
        } else {
            if (i18 != 3) {
                return;
            }
            c1683d.m4091e(c1712c3.f7740g, c1712c5.f7740g, 0, 8);
            c1683d.m4091e(c1712c3.f7740g, this.f7760K.f7805z.f7740g, 0, 4);
            c1687h = c1712c3.f7740g;
            c1712c = this.f7760K.f7751B;
        }
        c1683d.m4091e(c1687h, c1712c.f7740g, 0, 0);
    }

    @Override // p127q.C1713d
    /* renamed from: c */
    public final boolean mo4146c() {
        return true;
    }

    @Override // p127q.C1713d
    public final String toString() {
        String m220f = C0090b.m220f(new StringBuilder("[Barrier] "), this.f7774Y, " {");
        for (int i7 = 0; i7 < this.f7869f0; i7++) {
            C1713d c1713d = this.f7868e0[i7];
            if (i7 > 0) {
                m220f = C0089a.m210h(m220f, ", ");
            }
            StringBuilder m4107b = C1686g.m4107b(m220f);
            m4107b.append(c1713d.f7774Y);
            m220f = m4107b.toString();
        }
        return C0089a.m210h(m220f, "}");
    }
}
