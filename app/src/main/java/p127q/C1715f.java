package p127q;

import java.util.ArrayList;
import p120p.C1683d;

/* renamed from: q.f */
/* loaded from: classes.dex */
public final class C1715f extends C1719j {

    /* renamed from: O0 */
    public C1713d[] f7834O0;

    /* renamed from: r0 */
    public int f7836r0 = -1;

    /* renamed from: s0 */
    public int f7837s0 = -1;

    /* renamed from: t0 */
    public int f7838t0 = -1;

    /* renamed from: u0 */
    public int f7839u0 = -1;

    /* renamed from: v0 */
    public int f7840v0 = -1;

    /* renamed from: w0 */
    public int f7841w0 = -1;

    /* renamed from: x0 */
    public float f7842x0 = 0.5f;

    /* renamed from: y0 */
    public float f7843y0 = 0.5f;

    /* renamed from: z0 */
    public float f7844z0 = 0.5f;

    /* renamed from: A0 */
    public float f7820A0 = 0.5f;

    /* renamed from: B0 */
    public float f7821B0 = 0.5f;

    /* renamed from: C0 */
    public float f7822C0 = 0.5f;

    /* renamed from: D0 */
    public int f7823D0 = 0;

    /* renamed from: E0 */
    public int f7824E0 = 0;

    /* renamed from: F0 */
    public int f7825F0 = 2;

    /* renamed from: G0 */
    public int f7826G0 = 2;

    /* renamed from: H0 */
    public int f7827H0 = 0;

    /* renamed from: I0 */
    public int f7828I0 = -1;

    /* renamed from: J0 */
    public int f7829J0 = 0;

    /* renamed from: K0 */
    public final ArrayList<a> f7830K0 = new ArrayList<>();

    /* renamed from: L0 */
    public C1713d[] f7831L0 = null;

    /* renamed from: M0 */
    public C1713d[] f7832M0 = null;

    /* renamed from: N0 */
    public int[] f7833N0 = null;

    /* renamed from: P0 */
    public int f7835P0 = 0;

    /* renamed from: q.f$a */
    public class a {

        /* renamed from: a */
        public int f7845a;

        /* renamed from: d */
        public C1712c f7848d;

        /* renamed from: e */
        public C1712c f7849e;

        /* renamed from: f */
        public C1712c f7850f;

        /* renamed from: g */
        public C1712c f7851g;

        /* renamed from: h */
        public int f7852h;

        /* renamed from: i */
        public int f7853i;

        /* renamed from: j */
        public int f7854j;

        /* renamed from: k */
        public int f7855k;

        /* renamed from: q */
        public int f7861q;

        /* renamed from: b */
        public C1713d f7846b = null;

        /* renamed from: c */
        public int f7847c = 0;

        /* renamed from: l */
        public int f7856l = 0;

        /* renamed from: m */
        public int f7857m = 0;

        /* renamed from: n */
        public int f7858n = 0;

        /* renamed from: o */
        public int f7859o = 0;

        /* renamed from: p */
        public int f7860p = 0;

        public a(int i7, C1712c c1712c, C1712c c1712c2, C1712c c1712c3, C1712c c1712c4, int i8) {
            this.f7852h = 0;
            this.f7853i = 0;
            this.f7854j = 0;
            this.f7855k = 0;
            this.f7861q = 0;
            this.f7845a = i7;
            this.f7848d = c1712c;
            this.f7849e = c1712c2;
            this.f7850f = c1712c3;
            this.f7851g = c1712c4;
            this.f7852h = C1715f.this.f7874k0;
            this.f7853i = C1715f.this.f7870g0;
            this.f7854j = C1715f.this.f7875l0;
            this.f7855k = C1715f.this.f7871h0;
            this.f7861q = i8;
        }

        /* renamed from: a */
        public final void m4187a(C1713d c1713d) {
            int i7 = this.f7845a;
            C1715f c1715f = C1715f.this;
            if (i7 == 0) {
                int m4186E = c1715f.m4186E(c1713d, this.f7861q);
                if (c1713d.f7759J[0] == 3) {
                    this.f7860p++;
                    m4186E = 0;
                }
                this.f7856l = m4186E + (c1713d.f7773X != 8 ? c1715f.f7823D0 : 0) + this.f7856l;
                int m4185D = c1715f.m4185D(c1713d, this.f7861q);
                if (this.f7846b == null || this.f7847c < m4185D) {
                    this.f7846b = c1713d;
                    this.f7847c = m4185D;
                    this.f7857m = m4185D;
                }
            } else {
                int m4186E2 = c1715f.m4186E(c1713d, this.f7861q);
                int m4185D2 = c1715f.m4185D(c1713d, this.f7861q);
                if (c1713d.f7759J[1] == 3) {
                    this.f7860p++;
                    m4185D2 = 0;
                }
                this.f7857m = m4185D2 + (c1713d.f7773X != 8 ? c1715f.f7824E0 : 0) + this.f7857m;
                if (this.f7846b == null || this.f7847c < m4186E2) {
                    this.f7846b = c1713d;
                    this.f7847c = m4186E2;
                    this.f7856l = m4186E2;
                }
            }
            this.f7859o++;
        }

        /* renamed from: b */
        public final void m4188b(int i7, boolean z6, boolean z7) {
            C1715f c1715f;
            int i8;
            int i9;
            int i10;
            int i11;
            C1713d c1713d;
            int i12;
            C1712c c1712c;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18 = this.f7859o;
            int i19 = 0;
            while (true) {
                c1715f = C1715f.this;
                if (i19 >= i18 || (i17 = this.f7858n + i19) >= c1715f.f7835P0) {
                    break;
                }
                C1713d c1713d2 = c1715f.f7834O0[i17];
                if (c1713d2 != null) {
                    c1713d2.m4173t();
                }
                i19++;
            }
            if (i18 == 0 || this.f7846b == null) {
                return;
            }
            boolean z8 = z7 && i7 == 0;
            int i20 = -1;
            int i21 = -1;
            for (int i22 = 0; i22 < i18; i22++) {
                int i23 = this.f7858n + (z6 ? (i18 - 1) - i22 : i22);
                if (i23 >= c1715f.f7835P0) {
                    break;
                }
                if (c1715f.f7834O0[i23].f7773X == 0) {
                    if (i20 == -1) {
                        i20 = i22;
                    }
                    i21 = i22;
                }
            }
            if (this.f7845a != 0) {
                C1713d c1713d3 = this.f7846b;
                c1713d3.f7775Z = c1715f.f7836r0;
                int i24 = this.f7852h;
                if (i7 > 0) {
                    i24 += c1715f.f7823D0;
                }
                C1712c c1712c2 = c1713d3.f7750A;
                C1712c c1712c3 = c1713d3.f7804y;
                if (z6) {
                    c1712c2.m4147a(this.f7850f, i24);
                    if (z7) {
                        c1712c3.m4147a(this.f7848d, this.f7854j);
                    }
                    if (i7 > 0) {
                        this.f7850f.f7735b.f7804y.m4147a(c1712c2, 0);
                    }
                } else {
                    c1712c3.m4147a(this.f7848d, i24);
                    if (z7) {
                        c1712c2.m4147a(this.f7850f, this.f7854j);
                    }
                    if (i7 > 0) {
                        this.f7848d.f7735b.f7750A.m4147a(c1712c3, 0);
                    }
                }
                int i25 = 0;
                C1713d c1713d4 = null;
                while (i25 < i18) {
                    int i26 = this.f7858n + i25;
                    if (i26 >= c1715f.f7835P0) {
                        return;
                    }
                    C1713d c1713d5 = c1715f.f7834O0[i26];
                    if (i25 == 0) {
                        c1713d5.m4159f(c1713d5.f7805z, this.f7849e, this.f7853i);
                        int i27 = c1715f.f7837s0;
                        float f7 = c1715f.f7843y0;
                        if (this.f7858n == 0) {
                            i11 = c1715f.f7839u0;
                            i10 = -1;
                            if (i11 != -1) {
                                f7 = c1715f.f7820A0;
                                i27 = i11;
                                c1713d5.f7777a0 = i27;
                                c1713d5.f7771V = f7;
                            }
                        } else {
                            i10 = -1;
                        }
                        if (z7 && (i11 = c1715f.f7841w0) != i10) {
                            f7 = c1715f.f7822C0;
                            i27 = i11;
                        }
                        c1713d5.f7777a0 = i27;
                        c1713d5.f7771V = f7;
                    }
                    if (i25 == i18 - 1) {
                        c1713d5.m4159f(c1713d5.f7751B, this.f7851g, this.f7855k);
                    }
                    if (c1713d4 != null) {
                        C1712c c1712c4 = c1713d5.f7805z;
                        int i28 = c1715f.f7824E0;
                        C1712c c1712c5 = c1713d4.f7751B;
                        c1712c4.m4147a(c1712c5, i28);
                        C1712c c1712c6 = c1713d5.f7805z;
                        if (i25 == i20) {
                            int i29 = this.f7853i;
                            if (c1712c6.m4152f()) {
                                c1712c6.f7739f = i29;
                            }
                        }
                        c1712c5.m4147a(c1712c6, 0);
                        if (i25 == i21 + 1) {
                            int i30 = this.f7855k;
                            if (c1712c5.m4152f()) {
                                c1712c5.f7739f = i30;
                            }
                        }
                    }
                    if (c1713d5 != c1713d3) {
                        if (z6) {
                            int i31 = c1715f.f7825F0;
                            if (i31 == 0) {
                                i9 = 0;
                            } else if (i31 == 1) {
                                c1713d5.f7804y.m4147a(c1712c3, 0);
                                i25++;
                                c1713d4 = c1713d5;
                            } else if (i31 == 2) {
                                i9 = 0;
                                c1713d5.f7804y.m4147a(c1712c3, 0);
                            }
                            c1713d5.f7750A.m4147a(c1712c2, i9);
                            i25++;
                            c1713d4 = c1713d5;
                        } else {
                            int i32 = c1715f.f7825F0;
                            if (i32 != 0) {
                                if (i32 == 1) {
                                    i8 = 0;
                                } else if (i32 == 2) {
                                    C1712c c1712c7 = c1713d5.f7804y;
                                    if (z8) {
                                        c1712c7.m4147a(this.f7848d, this.f7852h);
                                        c1713d5.f7750A.m4147a(this.f7850f, this.f7854j);
                                    } else {
                                        i8 = 0;
                                        c1712c7.m4147a(c1712c3, 0);
                                    }
                                }
                                c1713d5.f7750A.m4147a(c1712c2, i8);
                            } else {
                                c1713d5.f7804y.m4147a(c1712c3, 0);
                            }
                            i25++;
                            c1713d4 = c1713d5;
                        }
                    }
                    i25++;
                    c1713d4 = c1713d5;
                }
                return;
            }
            C1713d c1713d6 = this.f7846b;
            c1713d6.f7777a0 = c1715f.f7837s0;
            int i33 = this.f7853i;
            if (i7 > 0) {
                i33 += c1715f.f7824E0;
            }
            C1712c c1712c8 = this.f7849e;
            C1712c c1712c9 = c1713d6.f7805z;
            c1712c9.m4147a(c1712c8, i33);
            C1712c c1712c10 = c1713d6.f7751B;
            if (z7) {
                c1712c10.m4147a(this.f7851g, this.f7855k);
            }
            if (i7 > 0) {
                this.f7849e.f7735b.f7751B.m4147a(c1712c9, 0);
            }
            if (c1715f.f7826G0 == 3 && !c1713d6.f7802w) {
                for (int i34 = 0; i34 < i18; i34++) {
                    int i35 = this.f7858n + (z6 ? (i18 - 1) - i34 : i34);
                    if (i35 >= c1715f.f7835P0) {
                        break;
                    }
                    c1713d = c1715f.f7834O0[i35];
                    if (c1713d.f7802w) {
                        break;
                    }
                }
            }
            c1713d = c1713d6;
            C1713d c1713d7 = null;
            int i36 = 0;
            while (i36 < i18) {
                int i37 = z6 ? (i18 - 1) - i36 : i36;
                int i38 = this.f7858n + i37;
                if (i38 >= c1715f.f7835P0) {
                    return;
                }
                C1713d c1713d8 = c1715f.f7834O0[i38];
                if (i36 == 0) {
                    c1713d8.m4159f(c1713d8.f7804y, this.f7848d, this.f7852h);
                }
                if (i37 == 0) {
                    int i39 = c1715f.f7836r0;
                    float f8 = c1715f.f7842x0;
                    if (this.f7858n == 0) {
                        i16 = c1715f.f7838t0;
                        i13 = i39;
                        i14 = -1;
                        if (i16 != -1) {
                            f8 = c1715f.f7844z0;
                            i15 = i16;
                            c1713d8.f7775Z = i15;
                            c1713d8.f7770U = f8;
                        }
                    } else {
                        i13 = i39;
                        i14 = -1;
                    }
                    if (!z7 || (i16 = c1715f.f7840v0) == i14) {
                        i15 = i13;
                        c1713d8.f7775Z = i15;
                        c1713d8.f7770U = f8;
                    } else {
                        f8 = c1715f.f7821B0;
                        i15 = i16;
                        c1713d8.f7775Z = i15;
                        c1713d8.f7770U = f8;
                    }
                }
                if (i36 == i18 - 1) {
                    c1713d8.m4159f(c1713d8.f7750A, this.f7850f, this.f7854j);
                }
                if (c1713d7 != null) {
                    C1712c c1712c11 = c1713d8.f7804y;
                    int i40 = c1715f.f7823D0;
                    C1712c c1712c12 = c1713d7.f7750A;
                    c1712c11.m4147a(c1712c12, i40);
                    C1712c c1712c13 = c1713d8.f7804y;
                    if (i36 == i20) {
                        int i41 = this.f7852h;
                        if (c1712c13.m4152f()) {
                            c1712c13.f7739f = i41;
                        }
                    }
                    c1712c12.m4147a(c1712c13, 0);
                    if (i36 == i21 + 1) {
                        int i42 = this.f7854j;
                        if (c1712c12.m4152f()) {
                            c1712c12.f7739f = i42;
                        }
                    }
                }
                if (c1713d8 != c1713d6) {
                    int i43 = c1715f.f7826G0;
                    if (i43 == 3 && c1713d.f7802w && c1713d8 != c1713d && c1713d8.f7802w) {
                        c1713d8.f7752C.m4147a(c1713d.f7752C, 0);
                    } else if (i43 != 0) {
                        if (i43 != 1) {
                            C1712c c1712c14 = c1713d8.f7805z;
                            c1712c = c1713d8.f7751B;
                            if (z8) {
                                c1712c14.m4147a(this.f7849e, this.f7853i);
                                c1712c.m4147a(this.f7851g, this.f7855k);
                            } else {
                                i12 = 0;
                                c1712c14.m4147a(c1712c9, 0);
                            }
                        } else {
                            i12 = 0;
                            c1712c = c1713d8.f7751B;
                        }
                        c1712c.m4147a(c1712c10, i12);
                    } else {
                        c1713d8.f7805z.m4147a(c1712c9, 0);
                    }
                }
                i36++;
                c1713d7 = c1713d8;
            }
        }

        /* renamed from: c */
        public final int m4189c() {
            return this.f7845a == 1 ? this.f7857m - C1715f.this.f7824E0 : this.f7857m;
        }

        /* renamed from: d */
        public final int m4190d() {
            return this.f7845a == 0 ? this.f7856l - C1715f.this.f7823D0 : this.f7856l;
        }

        /* renamed from: e */
        public final void m4191e(int i7, C1712c c1712c, C1712c c1712c2, C1712c c1712c3, C1712c c1712c4, int i8, int i9, int i10, int i11, int i12) {
            this.f7845a = i7;
            this.f7848d = c1712c;
            this.f7849e = c1712c2;
            this.f7850f = c1712c3;
            this.f7851g = c1712c4;
            this.f7852h = i8;
            this.f7853i = i9;
            this.f7854j = i10;
            this.f7855k = i11;
            this.f7861q = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:422:0x00b0, code lost:
    
        r37.f7837s0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x00ae, code lost:
    
        if (r37.f7837s0 == (-1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
    
        if (r37.f7837s0 == (-1)) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x028c -> B:114:0x0170). Please report as a decompilation issue!!! */
    @Override // p127q.C1719j
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4184B(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p127q.C1715f.mo4184B(int, int, int, int):void");
    }

    /* renamed from: D */
    public final int m4185D(C1713d c1713d, int i7) {
        if (c1713d == null) {
            return 0;
        }
        int[] iArr = c1713d.f7759J;
        if (iArr[1] == 3) {
            int i8 = c1713d.f7790k;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (c1713d.f7797r * i7);
                if (i9 != c1713d.m4163j()) {
                    m4194C(c1713d, iArr[0], c1713d.m4165l(), 1, i9);
                }
                return i9;
            }
            if (i8 == 1) {
                return c1713d.m4163j();
            }
            if (i8 == 3) {
                return (int) ((c1713d.m4165l() * c1713d.f7763N) + 0.5f);
            }
        }
        return c1713d.m4163j();
    }

    /* renamed from: E */
    public final int m4186E(C1713d c1713d, int i7) {
        if (c1713d == null) {
            return 0;
        }
        int[] iArr = c1713d.f7759J;
        if (iArr[0] == 3) {
            int i8 = c1713d.f7789j;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (c1713d.f7794o * i7);
                if (i9 != c1713d.m4165l()) {
                    m4194C(c1713d, 1, i9, iArr[1], c1713d.m4163j());
                }
                return i9;
            }
            if (i8 == 1) {
                return c1713d.m4165l();
            }
            if (i8 == 3) {
                return (int) ((c1713d.m4163j() * c1713d.f7763N) + 0.5f);
            }
        }
        return c1713d.m4165l();
    }

    @Override // p127q.C1713d
    /* renamed from: b */
    public final void mo4145b(C1683d c1683d) {
        C1713d c1713d;
        super.mo4145b(c1683d);
        C1713d c1713d2 = this.f7760K;
        boolean z6 = c1713d2 != null ? ((C1714e) c1713d2).f7809i0 : false;
        int i7 = this.f7827H0;
        ArrayList<a> arrayList = this.f7830K0;
        if (i7 != 0) {
            if (i7 == 1) {
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    arrayList.get(i8).m4188b(i8, z6, i8 == size + (-1));
                    i8++;
                }
            } else if (i7 == 2 && this.f7833N0 != null && this.f7832M0 != null && this.f7831L0 != null) {
                for (int i9 = 0; i9 < this.f7835P0; i9++) {
                    this.f7834O0[i9].m4173t();
                }
                int[] iArr = this.f7833N0;
                int i10 = iArr[0];
                int i11 = iArr[1];
                C1713d c1713d3 = null;
                for (int i12 = 0; i12 < i10; i12++) {
                    C1713d c1713d4 = this.f7832M0[z6 ? (i10 - i12) - 1 : i12];
                    if (c1713d4 != null && c1713d4.f7773X != 8) {
                        C1712c c1712c = c1713d4.f7804y;
                        if (i12 == 0) {
                            c1713d4.m4159f(c1712c, this.f7804y, this.f7874k0);
                            c1713d4.f7775Z = this.f7836r0;
                            c1713d4.f7770U = this.f7842x0;
                        }
                        if (i12 == i10 - 1) {
                            c1713d4.m4159f(c1713d4.f7750A, this.f7750A, this.f7875l0);
                        }
                        if (i12 > 0) {
                            c1713d4.m4159f(c1712c, c1713d3.f7750A, this.f7823D0);
                            c1713d3.m4159f(c1713d3.f7750A, c1712c, 0);
                        }
                        c1713d3 = c1713d4;
                    }
                }
                for (int i13 = 0; i13 < i11; i13++) {
                    C1713d c1713d5 = this.f7831L0[i13];
                    if (c1713d5 != null && c1713d5.f7773X != 8) {
                        C1712c c1712c2 = c1713d5.f7805z;
                        if (i13 == 0) {
                            c1713d5.m4159f(c1712c2, this.f7805z, this.f7870g0);
                            c1713d5.f7777a0 = this.f7837s0;
                            c1713d5.f7771V = this.f7843y0;
                        }
                        if (i13 == i11 - 1) {
                            c1713d5.m4159f(c1713d5.f7751B, this.f7751B, this.f7871h0);
                        }
                        if (i13 > 0) {
                            c1713d5.m4159f(c1712c2, c1713d3.f7751B, this.f7824E0);
                            c1713d3.m4159f(c1713d3.f7751B, c1712c2, 0);
                        }
                        c1713d3 = c1713d5;
                    }
                }
                for (int i14 = 0; i14 < i10; i14++) {
                    for (int i15 = 0; i15 < i11; i15++) {
                        int i16 = (i15 * i10) + i14;
                        if (this.f7829J0 == 1) {
                            i16 = (i14 * i11) + i15;
                        }
                        C1713d[] c1713dArr = this.f7834O0;
                        if (i16 < c1713dArr.length && (c1713d = c1713dArr[i16]) != null && c1713d.f7773X != 8) {
                            C1713d c1713d6 = this.f7832M0[i14];
                            C1713d c1713d7 = this.f7831L0[i15];
                            if (c1713d != c1713d6) {
                                c1713d.m4159f(c1713d.f7804y, c1713d6.f7804y, 0);
                                c1713d.m4159f(c1713d.f7750A, c1713d6.f7750A, 0);
                            }
                            if (c1713d != c1713d7) {
                                c1713d.m4159f(c1713d.f7805z, c1713d7.f7805z, 0);
                                c1713d.m4159f(c1713d.f7751B, c1713d7.f7751B, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).m4188b(0, z6, true);
        }
        this.f7876m0 = false;
    }
}
