package p120p;

import java.util.Arrays;
import p120p.C1681b;
import p127q.C1712c;

/* renamed from: p.d */
/* loaded from: classes.dex */
public final class C1683d {

    /* renamed from: o */
    public static int f7571o = 1000;

    /* renamed from: p */
    public static boolean f7572p = true;

    /* renamed from: b */
    public final C1685f f7574b;

    /* renamed from: e */
    public C1681b[] f7577e;

    /* renamed from: k */
    public final C1682c f7583k;

    /* renamed from: n */
    public C1681b f7586n;

    /* renamed from: a */
    public int f7573a = 0;

    /* renamed from: c */
    public int f7575c = 32;

    /* renamed from: d */
    public int f7576d = 32;

    /* renamed from: f */
    public boolean f7578f = false;

    /* renamed from: g */
    public boolean[] f7579g = new boolean[32];

    /* renamed from: h */
    public int f7580h = 1;

    /* renamed from: i */
    public int f7581i = 0;

    /* renamed from: j */
    public int f7582j = 32;

    /* renamed from: l */
    public C1687h[] f7584l = new C1687h[f7571o];

    /* renamed from: m */
    public int f7585m = 0;

    /* renamed from: p.d$a */
    public interface a {
        /* renamed from: a */
        C1687h mo4076a(boolean[] zArr);
    }

    /* renamed from: p.d$b */
    public class b extends C1681b {
        public b(C1682c c1682c) {
            this.f7565d = new C1688i(this, c1682c);
        }
    }

    public C1683d() {
        this.f7577e = null;
        this.f7577e = new C1681b[32];
        m4102q();
        C1682c c1682c = new C1682c(0);
        this.f7583k = c1682c;
        this.f7574b = new C1685f(c1682c);
        this.f7586n = f7572p ? new b(c1682c) : new C1681b(c1682c);
    }

    /* renamed from: n */
    public static int m4086n(C1712c c1712c) {
        C1687h c1687h = c1712c.f7740g;
        if (c1687h != null) {
            return (int) (c1687h.f7601e + 0.5f);
        }
        return 0;
    }

    /* renamed from: a */
    public final C1687h m4087a(int i7) {
        C1687h c1687h = (C1687h) ((C1684e) this.f7583k.f7569c).mo2564a();
        if (c1687h == null) {
            c1687h = new C1687h(i7);
        } else {
            c1687h.m4112c();
        }
        c1687h.f7605i = i7;
        int i8 = this.f7585m;
        int i9 = f7571o;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            f7571o = i10;
            this.f7584l = (C1687h[]) Arrays.copyOf(this.f7584l, i10);
        }
        C1687h[] c1687hArr = this.f7584l;
        int i11 = this.f7585m;
        this.f7585m = i11 + 1;
        c1687hArr[i11] = c1687h;
        return c1687h;
    }

    /* renamed from: b */
    public final void m4088b(C1687h c1687h, C1687h c1687h2, int i7, float f7, C1687h c1687h3, C1687h c1687h4, int i8, int i9) {
        int i10;
        float f8;
        C1681b m4098l = m4098l();
        if (c1687h2 == c1687h3) {
            m4098l.f7565d.mo4068d(c1687h, 1.0f);
            m4098l.f7565d.mo4068d(c1687h4, 1.0f);
            m4098l.f7565d.mo4068d(c1687h2, -2.0f);
        } else {
            if (f7 == 0.5f) {
                m4098l.f7565d.mo4068d(c1687h, 1.0f);
                m4098l.f7565d.mo4068d(c1687h2, -1.0f);
                m4098l.f7565d.mo4068d(c1687h3, -1.0f);
                m4098l.f7565d.mo4068d(c1687h4, 1.0f);
                if (i7 > 0 || i8 > 0) {
                    i10 = (-i7) + i8;
                    f8 = i10;
                }
            } else if (f7 <= 0.0f) {
                m4098l.f7565d.mo4068d(c1687h, -1.0f);
                m4098l.f7565d.mo4068d(c1687h2, 1.0f);
                f8 = i7;
            } else if (f7 >= 1.0f) {
                m4098l.f7565d.mo4068d(c1687h4, -1.0f);
                m4098l.f7565d.mo4068d(c1687h3, 1.0f);
                i10 = -i8;
                f8 = i10;
            } else {
                float f9 = 1.0f - f7;
                m4098l.f7565d.mo4068d(c1687h, f9 * 1.0f);
                m4098l.f7565d.mo4068d(c1687h2, f9 * (-1.0f));
                m4098l.f7565d.mo4068d(c1687h3, (-1.0f) * f7);
                m4098l.f7565d.mo4068d(c1687h4, 1.0f * f7);
                if (i7 > 0 || i8 > 0) {
                    m4098l.f7563b = (i8 * f7) + ((-i7) * f9);
                }
            }
            m4098l.f7563b = f8;
        }
        if (i9 != 8) {
            m4098l.m4077b(this, i9);
        }
        m4089c(m4098l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bf, code lost:
    
        if (r4.f7608l <= 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ca, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c8, code lost:
    
        if (r4.f7608l <= 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e9, code lost:
    
        if (r4.f7608l <= 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f6, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f4, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f2, code lost:
    
        if (r4.f7608l <= 1) goto L80;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4089c(p120p.C1681b r17) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p120p.C1683d.m4089c(p.b):void");
    }

    /* renamed from: d */
    public final void m4090d(C1687h c1687h, int i7) {
        C1681b m4098l;
        C1681b.a aVar;
        float f7;
        int i8 = c1687h.f7599c;
        if (i8 == -1) {
            c1687h.f7601e = i7;
            c1687h.f7602f = true;
            int i9 = c1687h.f7607k;
            for (int i10 = 0; i10 < i9; i10++) {
                c1687h.f7606j[i10].m4083h(c1687h, false);
            }
            c1687h.f7607k = 0;
            return;
        }
        if (i8 != -1) {
            C1681b c1681b = this.f7577e[i8];
            if (!c1681b.f7566e) {
                if (c1681b.f7565d.mo4071g() == 0) {
                    c1681b.f7566e = true;
                } else {
                    m4098l = m4098l();
                    if (i7 < 0) {
                        m4098l.f7563b = i7 * (-1);
                        aVar = m4098l.f7565d;
                        f7 = 1.0f;
                    } else {
                        m4098l.f7563b = i7;
                        aVar = m4098l.f7565d;
                        f7 = -1.0f;
                    }
                    aVar.mo4068d(c1687h, f7);
                }
            }
            c1681b.f7563b = i7;
            return;
        }
        m4098l = m4098l();
        m4098l.f7562a = c1687h;
        float f8 = i7;
        c1687h.f7601e = f8;
        m4098l.f7563b = f8;
        m4098l.f7566e = true;
        m4089c(m4098l);
    }

    /* renamed from: e */
    public final void m4091e(C1687h c1687h, C1687h c1687h2, int i7, int i8) {
        boolean z6 = true;
        boolean z7 = false;
        if (i8 == 8 && c1687h2.f7602f && c1687h.f7599c == -1) {
            c1687h.f7601e = c1687h2.f7601e + i7;
            c1687h.f7602f = true;
            int i9 = c1687h.f7607k;
            for (int i10 = 0; i10 < i9; i10++) {
                c1687h.f7606j[i10].m4083h(c1687h, false);
            }
            c1687h.f7607k = 0;
            return;
        }
        C1681b m4098l = m4098l();
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
            } else {
                z6 = false;
            }
            m4098l.f7563b = i7;
            z7 = z6;
        }
        if (z7) {
            m4098l.f7565d.mo4068d(c1687h, 1.0f);
            m4098l.f7565d.mo4068d(c1687h2, -1.0f);
        } else {
            m4098l.f7565d.mo4068d(c1687h, -1.0f);
            m4098l.f7565d.mo4068d(c1687h2, 1.0f);
        }
        if (i8 != 8) {
            m4098l.m4077b(this, i8);
        }
        m4089c(m4098l);
    }

    /* renamed from: f */
    public final void m4092f(C1687h c1687h, C1687h c1687h2, int i7, int i8) {
        C1681b m4098l = m4098l();
        C1687h m4099m = m4099m();
        m4099m.f7600d = 0;
        m4098l.m4078c(c1687h, c1687h2, m4099m, i7);
        if (i8 != 8) {
            m4098l.f7565d.mo4068d(m4096j(i8), (int) (m4098l.f7565d.mo4073i(m4099m) * (-1.0f)));
        }
        m4089c(m4098l);
    }

    /* renamed from: g */
    public final void m4093g(C1687h c1687h, C1687h c1687h2, int i7, int i8) {
        C1681b m4098l = m4098l();
        C1687h m4099m = m4099m();
        m4099m.f7600d = 0;
        m4098l.m4079d(c1687h, c1687h2, m4099m, i7);
        if (i8 != 8) {
            m4098l.f7565d.mo4068d(m4096j(i8), (int) (m4098l.f7565d.mo4073i(m4099m) * (-1.0f)));
        }
        m4089c(m4098l);
    }

    /* renamed from: h */
    public final void m4094h(C1687h c1687h, C1687h c1687h2, C1687h c1687h3, C1687h c1687h4, float f7) {
        C1681b m4098l = m4098l();
        m4098l.f7565d.mo4068d(c1687h, -1.0f);
        m4098l.f7565d.mo4068d(c1687h2, 1.0f);
        m4098l.f7565d.mo4068d(c1687h3, f7);
        m4098l.f7565d.mo4068d(c1687h4, -f7);
        m4089c(m4098l);
    }

    /* renamed from: i */
    public final void m4095i(C1681b c1681b) {
        C1681b c1681b2;
        Object obj;
        boolean z6 = f7572p;
        C1682c c1682c = this.f7583k;
        if (z6) {
            c1681b2 = this.f7577e[this.f7581i];
            if (c1681b2 != null) {
                obj = c1682c.f7567a;
                ((C1684e) obj).mo2565b(c1681b2);
            }
        } else {
            c1681b2 = this.f7577e[this.f7581i];
            if (c1681b2 != null) {
                obj = c1682c.f7568b;
                ((C1684e) obj).mo2565b(c1681b2);
            }
        }
        C1681b[] c1681bArr = this.f7577e;
        int i7 = this.f7581i;
        c1681bArr[i7] = c1681b;
        C1687h c1687h = c1681b.f7562a;
        c1687h.f7599c = i7;
        this.f7581i = i7 + 1;
        c1687h.m4113d(c1681b);
    }

    /* renamed from: j */
    public final C1687h m4096j(int i7) {
        if (this.f7580h + 1 >= this.f7576d) {
            m4100o();
        }
        C1687h m4087a = m4087a(4);
        int i8 = this.f7573a + 1;
        this.f7573a = i8;
        this.f7580h++;
        m4087a.f7598b = i8;
        m4087a.f7600d = i7;
        ((C1687h[]) this.f7583k.f7570d)[i8] = m4087a;
        C1685f c1685f = this.f7574b;
        c1685f.f7593i.f7594c = m4087a;
        float[] fArr = m4087a.f7604h;
        Arrays.fill(fArr, 0.0f);
        fArr[m4087a.f7600d] = 1.0f;
        c1685f.m4104j(m4087a);
        return m4087a;
    }

    /* renamed from: k */
    public final C1687h m4097k(Object obj) {
        C1687h c1687h = null;
        if (obj == null) {
            return null;
        }
        if (this.f7580h + 1 >= this.f7576d) {
            m4100o();
        }
        if (obj instanceof C1712c) {
            C1712c c1712c = (C1712c) obj;
            c1687h = c1712c.f7740g;
            if (c1687h == null) {
                c1712c.m4155i();
                c1687h = c1712c.f7740g;
            }
            int i7 = c1687h.f7598b;
            C1682c c1682c = this.f7583k;
            if (i7 == -1 || i7 > this.f7573a || ((C1687h[]) c1682c.f7570d)[i7] == null) {
                if (i7 != -1) {
                    c1687h.m4112c();
                }
                int i8 = this.f7573a + 1;
                this.f7573a = i8;
                this.f7580h++;
                c1687h.f7598b = i8;
                c1687h.f7605i = 1;
                ((C1687h[]) c1682c.f7570d)[i8] = c1687h;
            }
        }
        return c1687h;
    }

    /* renamed from: l */
    public final C1681b m4098l() {
        C1681b c1681b;
        boolean z6 = f7572p;
        C1682c c1682c = this.f7583k;
        if (z6) {
            c1681b = (C1681b) ((C1684e) c1682c.f7567a).mo2564a();
            if (c1681b == null) {
                return new b(c1682c);
            }
        } else {
            c1681b = (C1681b) ((C1684e) c1682c.f7568b).mo2564a();
            if (c1681b == null) {
                return new C1681b(c1682c);
            }
        }
        c1681b.m4082g();
        return c1681b;
    }

    /* renamed from: m */
    public final C1687h m4099m() {
        if (this.f7580h + 1 >= this.f7576d) {
            m4100o();
        }
        C1687h m4087a = m4087a(3);
        int i7 = this.f7573a + 1;
        this.f7573a = i7;
        this.f7580h++;
        m4087a.f7598b = i7;
        ((C1687h[]) this.f7583k.f7570d)[i7] = m4087a;
        return m4087a;
    }

    /* renamed from: o */
    public final void m4100o() {
        int i7 = this.f7575c * 2;
        this.f7575c = i7;
        this.f7577e = (C1681b[]) Arrays.copyOf(this.f7577e, i7);
        C1682c c1682c = this.f7583k;
        c1682c.f7570d = (C1687h[]) Arrays.copyOf((C1687h[]) c1682c.f7570d, this.f7575c);
        int i8 = this.f7575c;
        this.f7579g = new boolean[i8];
        this.f7576d = i8;
        this.f7582j = i8;
    }

    /* renamed from: p */
    public final void m4101p(C1681b c1681b) {
        for (int i7 = 0; i7 < this.f7580h; i7++) {
            this.f7579g[i7] = false;
        }
        boolean z6 = false;
        int i8 = 0;
        while (!z6) {
            i8++;
            if (i8 >= this.f7580h * 2) {
                return;
            }
            C1687h c1687h = c1681b.f7562a;
            if (c1687h != null) {
                this.f7579g[c1687h.f7598b] = true;
            }
            C1687h mo4076a = c1681b.mo4076a(this.f7579g);
            if (mo4076a != null) {
                boolean[] zArr = this.f7579g;
                int i9 = mo4076a.f7598b;
                if (zArr[i9]) {
                    return;
                } else {
                    zArr[i9] = true;
                }
            }
            if (mo4076a != null) {
                float f7 = Float.MAX_VALUE;
                int i10 = -1;
                for (int i11 = 0; i11 < this.f7581i; i11++) {
                    C1681b c1681b2 = this.f7577e[i11];
                    if (c1681b2.f7562a.f7605i != 1 && !c1681b2.f7566e && c1681b2.f7565d.mo4069e(mo4076a)) {
                        float mo4073i = c1681b2.f7565d.mo4073i(mo4076a);
                        if (mo4073i < 0.0f) {
                            float f8 = (-c1681b2.f7563b) / mo4073i;
                            if (f8 < f7) {
                                i10 = i11;
                                f7 = f8;
                            }
                        }
                    }
                }
                if (i10 > -1) {
                    C1681b c1681b3 = this.f7577e[i10];
                    c1681b3.f7562a.f7599c = -1;
                    c1681b3.m4081f(mo4076a);
                    C1687h c1687h2 = c1681b3.f7562a;
                    c1687h2.f7599c = i10;
                    c1687h2.m4113d(c1681b3);
                }
            } else {
                z6 = true;
            }
        }
    }

    /* renamed from: q */
    public final void m4102q() {
        boolean z6 = f7572p;
        C1682c c1682c = this.f7583k;
        int i7 = 0;
        if (z6) {
            while (true) {
                C1681b[] c1681bArr = this.f7577e;
                if (i7 >= c1681bArr.length) {
                    return;
                }
                C1681b c1681b = c1681bArr[i7];
                if (c1681b != null) {
                    ((C1684e) c1682c.f7567a).mo2565b(c1681b);
                }
                this.f7577e[i7] = null;
                i7++;
            }
        } else {
            while (true) {
                C1681b[] c1681bArr2 = this.f7577e;
                if (i7 >= c1681bArr2.length) {
                    return;
                }
                C1681b c1681b2 = c1681bArr2[i7];
                if (c1681b2 != null) {
                    ((C1684e) c1682c.f7568b).mo2565b(c1681b2);
                }
                this.f7577e[i7] = null;
                i7++;
            }
        }
    }

    /* renamed from: r */
    public final void m4103r() {
        C1682c c1682c;
        int i7 = 0;
        while (true) {
            c1682c = this.f7583k;
            C1687h[] c1687hArr = (C1687h[]) c1682c.f7570d;
            if (i7 >= c1687hArr.length) {
                break;
            }
            C1687h c1687h = c1687hArr[i7];
            if (c1687h != null) {
                c1687h.m4112c();
            }
            i7++;
        }
        C1684e c1684e = (C1684e) c1682c.f7569c;
        C1687h[] c1687hArr2 = this.f7584l;
        int i8 = this.f7585m;
        c1684e.getClass();
        if (i8 > c1687hArr2.length) {
            i8 = c1687hArr2.length;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            C1687h c1687h2 = c1687hArr2[i9];
            int i10 = c1684e.f7589c;
            Object[] objArr = c1684e.f7588b;
            if (i10 < objArr.length) {
                objArr[i10] = c1687h2;
                c1684e.f7589c = i10 + 1;
            }
        }
        this.f7585m = 0;
        Arrays.fill((C1687h[]) c1682c.f7570d, (Object) null);
        this.f7573a = 0;
        C1685f c1685f = this.f7574b;
        c1685f.f7592h = 0;
        c1685f.f7563b = 0.0f;
        this.f7580h = 1;
        for (int i11 = 0; i11 < this.f7581i; i11++) {
            this.f7577e[i11].getClass();
        }
        m4102q();
        this.f7581i = 0;
        this.f7586n = f7572p ? new b(c1682c) : new C1681b(c1682c);
    }
}
