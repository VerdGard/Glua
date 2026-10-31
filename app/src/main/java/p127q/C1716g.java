package p127q;

import java.util.ArrayList;
import p120p.C1681b;
import p120p.C1683d;
import p120p.C1687h;
import p127q.C1712c;

/* renamed from: q.g */
/* loaded from: classes.dex */
public final class C1716g extends C1713d {

    /* renamed from: e0 */
    public float f7863e0 = -1.0f;

    /* renamed from: f0 */
    public int f7864f0 = -1;

    /* renamed from: g0 */
    public int f7865g0 = -1;

    /* renamed from: h0 */
    public C1712c f7866h0 = this.f7805z;

    /* renamed from: i0 */
    public int f7867i0 = 0;

    public C1716g() {
        this.f7757H.clear();
        this.f7757H.add(this.f7866h0);
        int length = this.f7756G.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f7756G[i7] = this.f7866h0;
        }
    }

    @Override // p127q.C1713d
    /* renamed from: A */
    public final void mo4156A(C1683d c1683d) {
        if (this.f7760K == null) {
            return;
        }
        C1712c c1712c = this.f7866h0;
        c1683d.getClass();
        int m4086n = C1683d.m4086n(c1712c);
        if (this.f7867i0 == 1) {
            this.f7765P = m4086n;
            this.f7766Q = 0;
            m4175v(this.f7760K.m4163j());
            m4178y(0);
            return;
        }
        this.f7765P = 0;
        this.f7766Q = m4086n;
        m4178y(this.f7760K.m4165l());
        m4175v(0);
    }

    /* renamed from: B */
    public final void m4192B(int i7) {
        if (this.f7867i0 == i7) {
            return;
        }
        this.f7867i0 = i7;
        ArrayList<C1712c> arrayList = this.f7757H;
        arrayList.clear();
        this.f7866h0 = this.f7867i0 == 1 ? this.f7804y : this.f7805z;
        arrayList.add(this.f7866h0);
        C1712c[] c1712cArr = this.f7756G;
        int length = c1712cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            c1712cArr[i8] = this.f7866h0;
        }
    }

    @Override // p127q.C1713d
    /* renamed from: b */
    public final void mo4145b(C1683d c1683d) {
        C1714e c1714e = (C1714e) this.f7760K;
        if (c1714e == null) {
            return;
        }
        C1712c mo4161h = c1714e.mo4161h(C1712c.a.f7744c);
        C1712c mo4161h2 = c1714e.mo4161h(C1712c.a.f7746m);
        C1713d c1713d = this.f7760K;
        boolean z6 = c1713d != null && c1713d.f7759J[0] == 2;
        if (this.f7867i0 == 0) {
            mo4161h = c1714e.mo4161h(C1712c.a.f7745e);
            mo4161h2 = c1714e.mo4161h(C1712c.a.f7747s);
            C1713d c1713d2 = this.f7760K;
            z6 = c1713d2 != null && c1713d2.f7759J[1] == 2;
        }
        if (this.f7864f0 != -1) {
            C1687h m4097k = c1683d.m4097k(this.f7866h0);
            c1683d.m4091e(m4097k, c1683d.m4097k(mo4161h), this.f7864f0, 8);
            if (z6) {
                c1683d.m4092f(c1683d.m4097k(mo4161h2), m4097k, 0, 5);
                return;
            }
            return;
        }
        if (this.f7865g0 != -1) {
            C1687h m4097k2 = c1683d.m4097k(this.f7866h0);
            C1687h m4097k3 = c1683d.m4097k(mo4161h2);
            c1683d.m4091e(m4097k2, m4097k3, -this.f7865g0, 8);
            if (z6) {
                c1683d.m4092f(m4097k2, c1683d.m4097k(mo4161h), 0, 5);
                c1683d.m4092f(m4097k3, m4097k2, 0, 5);
                return;
            }
            return;
        }
        if (this.f7863e0 != -1.0f) {
            C1687h m4097k4 = c1683d.m4097k(this.f7866h0);
            C1687h m4097k5 = c1683d.m4097k(mo4161h2);
            float f7 = this.f7863e0;
            C1681b m4098l = c1683d.m4098l();
            m4098l.f7565d.mo4068d(m4097k4, -1.0f);
            m4098l.f7565d.mo4068d(m4097k5, f7);
            c1683d.m4089c(m4098l);
        }
    }

    @Override // p127q.C1713d
    /* renamed from: c */
    public final boolean mo4146c() {
        return true;
    }

    @Override // p127q.C1713d
    /* renamed from: h */
    public final C1712c mo4161h(C1712c.a aVar) {
        switch (aVar) {
            case EF0:
            case f7741X:
            case f7742Y:
            case f7743Z:
            case f7748w1:
                return null;
            case f7744c:
            case f7746m:
                if (this.f7867i0 == 1) {
                    return this.f7866h0;
                }
                break;
            case f7745e:
            case f7747s:
                if (this.f7867i0 == 0) {
                    return this.f7866h0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }
}
