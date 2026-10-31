package p165u6;

import android.ext.Tools;
import p180w6.C2140i;

/* renamed from: u6.p */
/* loaded from: classes.dex */
public final class C1998p extends AbstractC2003u {

    /* renamed from: h2 */
    public static C1999q f9038h2;

    /* renamed from: c2 */
    public final byte[] f9039c2;

    /* renamed from: d2 */
    public final int f9040d2;

    /* renamed from: e2 */
    public final int f9041e2;

    /* renamed from: f2 */
    public final int f9042f2;

    /* renamed from: g2 */
    public String f9043g2;

    /* renamed from: u6.p$a */
    public static final class a {

        /* renamed from: a */
        public static final C1998p[] f9044a = new C1998p[Tools.Semaphore.f159S7];
    }

    public C1998p(byte[] bArr, int i7, int i8) {
        this.f9039c2 = bArr;
        this.f9040d2 = i7;
        this.f9041e2 = i8;
        this.f9042f2 = m4814F2(bArr, i7, i8);
    }

    /* renamed from: D2 */
    public static void m4812D2(char[] cArr, int i7, byte[] bArr, int i8) {
        for (int i9 = 0; i9 < i7; i9++) {
            char c7 = cArr[i9];
            if (c7 < 128) {
                bArr[i8] = (byte) c7;
                i8++;
            } else if (c7 < 2048) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) (((c7 >> 6) & 31) | 192);
                i8 = i10 + 1;
                bArr[i10] = (byte) ((c7 & '?') | Tools.Semaphore.f159S7);
            } else {
                int i11 = i8 + 1;
                bArr[i8] = (byte) (((c7 >> '\f') & 15) | 224);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((c7 >> 6) & 63) | Tools.Semaphore.f159S7);
                bArr[i12] = (byte) ((c7 & '?') | Tools.Semaphore.f159S7);
                i8 = i12 + 1;
            }
        }
    }

    /* renamed from: E2 */
    public static boolean m4813E2(byte[] bArr, int i7, int i8, byte[] bArr2, int i9) {
        if (bArr.length < i7 + i9 || bArr2.length < i8 + i9) {
            return false;
        }
        while (true) {
            i9--;
            if (i9 < 0) {
                return true;
            }
            int i10 = i7 + 1;
            int i11 = i8 + 1;
            if (bArr[i7] != bArr2[i8]) {
                return false;
            }
            i7 = i10;
            i8 = i11;
        }
    }

    /* renamed from: F2 */
    public static int m4814F2(byte[] bArr, int i7, int i8) {
        int i9 = (i8 >> 5) + 1;
        int i10 = i8;
        while (i8 >= i9) {
            i10 ^= ((i10 << 5) + (i10 >> 2)) + (bArr[(i7 + i8) - 1] & 255);
            i8 -= i9;
        }
        return i10;
    }

    /* renamed from: M2 */
    public static C1998p m4815M2(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i7 = length;
        while (true) {
            length--;
            if (length < 0) {
                byte[] bArr = new byte[i7];
                m4812D2(charArray, charArray.length, bArr, 0);
                return m4817O2(bArr, 0, i7);
            }
            char c7 = charArray[length];
            if (c7 >= 128) {
                i7 += c7 >= 2048 ? 2 : 1;
            }
        }
    }

    /* renamed from: N2 */
    public static C1998p m4816N2(byte[] bArr, int i7, int i8) {
        if (i8 > 32) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            return new C1998p(bArr2, 0, i8);
        }
        int m4814F2 = m4814F2(bArr, i7, i8);
        int i9 = m4814F2 & 127;
        C1998p[] c1998pArr = a.f9044a;
        C1998p c1998p = c1998pArr[i9];
        if (c1998p != null && c1998p.f9042f2 == m4814F2) {
            if (c1998p.f9041e2 == i8 && m4813E2(c1998p.f9039c2, c1998p.f9040d2, i7, bArr, i8)) {
                return c1998p;
            }
        }
        byte[] bArr3 = new byte[i8];
        System.arraycopy(bArr, i7, bArr3, 0, i8);
        C1998p c1998p2 = new C1998p(bArr3, 0, i8);
        c1998pArr[i9] = c1998p2;
        return c1998p2;
    }

    /* renamed from: O2 */
    public static C1998p m4817O2(byte[] bArr, int i7, int i8) {
        if (bArr.length > 32) {
            return new C1998p(bArr, i7, i8);
        }
        int m4814F2 = m4814F2(bArr, i7, i8);
        int i9 = m4814F2 & 127;
        C1998p[] c1998pArr = a.f9044a;
        C1998p c1998p = c1998pArr[i9];
        if (c1998p != null && c1998p.f9042f2 == m4814F2) {
            if (c1998p.f9041e2 == i8 && m4813E2(c1998p.f9039c2, c1998p.f9040d2, i7, bArr, i8)) {
                return c1998p;
            }
        }
        C1998p c1998p2 = new C1998p(bArr, i7, i8);
        c1998pArr[i9] = c1998p2;
        return c1998p2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: A0 */
    public final AbstractC2003u mo4805A0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4807C0(this);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: B0 */
    public final AbstractC2003u mo4806B0(AbstractC1997o abstractC1997o) {
        return mo4807C0(abstractC1997o.mo4735i2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: C0 */
    public final AbstractC2003u mo4807C0(C1998p c1998p) {
        int i7 = c1998p.f9041e2;
        int i8 = this.f9041e2;
        int i9 = i7 + i8;
        byte[] bArr = new byte[i9];
        System.arraycopy(c1998p.f9039c2, c1998p.f9040d2, bArr, 0, i7);
        System.arraycopy(this.f9039c2, this.f9040d2, bArr, c1998p.f9041e2, i8);
        return m4817O2(bArr, 0, i9);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: C1 */
    public final int mo4699C1(int i7) {
        return mo4740m0();
    }

    /* renamed from: C2 */
    public final double m4818C2() {
        double m4822J2 = m4822J2();
        if (Double.isNaN(m4822J2)) {
            throw new C1991i("attempt to perform arithmetic on string");
        }
        return m4822J2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: D1 */
    public final String mo4700D1(String str) {
        return mo4645M();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: E0 */
    public final AbstractC2003u mo4701E0(AbstractC2003u abstractC2003u) {
        double m4822J2 = m4822J2();
        return Double.isNaN(m4822J2) ? m4872T(AbstractC2003u.f9105G1, abstractC2003u) : abstractC2003u.mo4703F0(m4822J2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: E1 */
    public final C1998p mo4702E1() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: F0 */
    public final AbstractC2003u mo4703F0(double d7) {
        return C1990h.m4696C2(d7, m4818C2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: G0 */
    public final boolean mo4704G0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4825O1(this);
    }

    /* renamed from: G2 */
    public final boolean m4819G2() {
        int i7;
        int i8 = this.f9041e2;
        int i9 = this.f9040d2;
        int i10 = i8 + i9;
        while (i9 < i10) {
            int i11 = i9 + 1;
            byte[] bArr = this.f9039c2;
            byte b7 = bArr[i9];
            if (b7 < 0) {
                if ((b7 & 224) == 192 && i11 < i10) {
                    int i12 = i11 + 1;
                    if ((bArr[i11] & 192) == 128) {
                        i9 = i12;
                    } else {
                        i11 = i12;
                    }
                }
                if ((b7 & 240) != 224 || (i7 = i11 + 1) >= i10 || (bArr[i11] & 192) != 128) {
                    return false;
                }
                i11 = i7 + 1;
                if ((bArr[i7] & 192) != 128) {
                    return false;
                }
            }
            i9 = i11;
        }
        return true;
    }

    /* renamed from: H2 */
    public final int m4820H2(int i7) {
        return this.f9039c2[this.f9040d2 + i7] & 255;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: I1 */
    public final AbstractC2003u mo4705I1(AbstractC2003u abstractC2003u) {
        double m4822J2 = m4822J2();
        return Double.isNaN(m4822J2) ? m4872T(AbstractC2003u.f9107I1, abstractC2003u) : abstractC2003u.mo4706J1(m4822J2);
    }

    /* renamed from: I2 */
    public final double m4821I2(int i7, int i8, int i9) {
        byte[] bArr = this.f9039c2;
        boolean z6 = bArr[i8] == 45;
        if (z6) {
            i8++;
        }
        long j7 = 0;
        while (i8 < i9) {
            byte b7 = bArr[i8];
            byte b8 = 48;
            if (i7 > 10 && (b7 < 48 || b7 > 57)) {
                b8 = (b7 < 65 || b7 > 90) ? (byte) 87 : (byte) 55;
            }
            int i10 = b7 - b8;
            if (i10 < 0 || i10 >= i7) {
                return Double.NaN;
            }
            j7 = (j7 * i7) + i10;
            if (j7 < 0) {
                return Double.NaN;
            }
            i8++;
        }
        return z6 ? -j7 : j7;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: J1 */
    public final AbstractC2003u mo4706J1(double d7) {
        return C2140i.m5234I2(d7, m4818C2());
    }

    /* renamed from: J2 */
    public final double m4822J2() {
        byte[] bArr;
        int i7;
        byte b7;
        int i8 = this.f9041e2;
        int i9 = this.f9040d2;
        int i10 = i8 + i9;
        while (true) {
            bArr = this.f9039c2;
            if (i9 >= i10 || bArr[i9] != 32) {
                break;
            }
            i9++;
        }
        while (i9 < i10 && bArr[i10 - 1] == 32) {
            i10--;
        }
        double d7 = Double.NaN;
        if (i9 >= i10) {
            return Double.NaN;
        }
        if (bArr[i9] == 48 && (i7 = i9 + 1) < i10 && ((b7 = bArr[i7]) == 120 || b7 == 88)) {
            return m4821I2(16, i9 + 2, i10);
        }
        double m4821I2 = m4821I2(10, i9, i10);
        if (!Double.isNaN(m4821I2)) {
            return m4821I2;
        }
        int i11 = i9 + 64;
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = i9;
        while (true) {
            if (i12 >= i10) {
                char[] cArr = new char[i10 - i9];
                for (int i13 = i9; i13 < i10; i13++) {
                    cArr[i13 - i9] = (char) bArr[i13];
                }
                try {
                    d7 = Double.parseDouble(new String(cArr));
                } catch (Exception unused) {
                }
            } else {
                byte b8 = bArr[i12];
                if (b8 != 43 && b8 != 69 && b8 != 101 && b8 != 45 && b8 != 46) {
                    switch (b8) {
                    }
                }
                i12++;
            }
        }
        return d7;
    }

    /* renamed from: K2 */
    public final C1998p m4823K2(int i7, int i8) {
        int i9 = this.f9040d2 + i7;
        int i10 = i8 - i7;
        int i11 = this.f9041e2 / 2;
        byte[] bArr = this.f9039c2;
        return i10 >= i11 ? m4817O2(bArr, i9, i10) : m4816N2(bArr, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* renamed from: L2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p165u6.AbstractC2003u m4824L2(int r7) {
        /*
            r6 = this;
            r0 = 2
            if (r7 < r0) goto L2c
            r0 = 36
            if (r7 <= r0) goto L8
            goto L2c
        L8:
            int r0 = r6.f9041e2
            int r1 = r6.f9040d2
            int r0 = r0 + r1
        Ld:
            r2 = 32
            byte[] r3 = r6.f9039c2
            if (r1 >= r0) goto L1a
            r4 = r3[r1]
            if (r4 != r2) goto L1a
            int r1 = r1 + 1
            goto Ld
        L1a:
            if (r1 >= r0) goto L24
            int r4 = r0 + (-1)
            r5 = r3[r4]
            if (r5 != r2) goto L24
            r0 = r4
            goto L1a
        L24:
            if (r1 < r0) goto L27
            goto L2c
        L27:
            double r0 = r6.m4821I2(r7, r1, r0)
            goto L2e
        L2c:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L2e:
            boolean r7 = java.lang.Double.isNaN(r0)
            if (r7 == 0) goto L37
            u6.n r7 = p165u6.AbstractC2003u.f9130m
            goto L3b
        L37:
            u6.o r7 = p165u6.C1990h.m4698E2(r0)
        L3b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p165u6.C1998p.m4824L2(int):u6.u");
    }

    @Override // p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        byte[] bArr;
        int i7;
        if (this.f9043g2 == null) {
            int i8 = this.f9041e2;
            int i9 = this.f9040d2;
            int i10 = i8 + i9;
            int i11 = 0;
            int i12 = i9;
            int i13 = 0;
            while (true) {
                bArr = this.f9039c2;
                if (i12 >= i10) {
                    break;
                }
                int i14 = i12 + 1;
                int i15 = bArr[i12] & 224;
                if (i15 != 192) {
                    if (i15 != 224) {
                        i12 = i14;
                        i13++;
                    } else {
                        i14++;
                    }
                }
                i14++;
                i12 = i14;
                i13++;
            }
            char[] cArr = new char[i13];
            while (i9 < i10) {
                int i16 = i11 + 1;
                int i17 = i9 + 1;
                int i18 = bArr[i9];
                if (i18 < 0 && i17 < i10) {
                    if (i18 < -32 || (i7 = i17 + 1) >= i10) {
                        i18 = ((i18 & 63) << 6) | (bArr[i17] & '?');
                        i17++;
                    } else {
                        int i19 = ((i18 & 15) << 12) | ((bArr[i17] & '?') << 6);
                        i17 = i7 + 1;
                        i18 = i19 | (bArr[i7] & '?');
                    }
                }
                cArr[i11] = (char) i18;
                i11 = i16;
                i9 = i17;
            }
            this.f9043g2 = new String(cArr);
        }
        return this.f9043g2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: M0 */
    public final AbstractC2003u mo4681M0() {
        return f9038h2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: O */
    public final AbstractC2003u mo4710O(double d7) {
        return C1990h.m4698E2(m4818C2() + d7);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: O0 */
    public final boolean mo4711O0(double d7) {
        m4883v2("attempt to compare string with number");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: O1 */
    public final boolean mo4825O1(C1998p c1998p) {
        if (this == c1998p) {
            return true;
        }
        int i7 = c1998p.f9041e2;
        int i8 = this.f9041e2;
        if (i7 != i8) {
            return false;
        }
        int i9 = this.f9040d2;
        byte[] bArr = this.f9039c2;
        int i10 = c1998p.f9040d2;
        byte[] bArr2 = c1998p.f9039c2;
        if (bArr2 == bArr && i10 == i9) {
            return true;
        }
        if (c1998p.f9042f2 != this.f9042f2) {
            return false;
        }
        for (int i11 = 0; i11 < i8; i11++) {
            if (bArr2[i10 + i11] != bArr[i9 + i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q */
    public final AbstractC2003u mo4713Q(AbstractC2003u abstractC2003u) {
        double m4822J2 = m4822J2();
        return Double.isNaN(m4822J2) ? m4872T(AbstractC2003u.f9103E1, abstractC2003u) : abstractC2003u.mo4710O(m4822J2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q0 */
    public final boolean mo4714Q0(double d7) {
        m4883v2("attempt to compare string with number");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Q1 */
    public final boolean mo4674Q1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4825O1(this);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: S0 */
    public final boolean mo4716S0(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4809f1() ? abstractC2003u.mo4733f2(this) <= 0 : super.mo4716S0(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: S1 */
    public final int mo4784S1() {
        return this.f9041e2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: Z0 */
    public final boolean mo4724Z0() {
        double m4822J2 = m4822J2();
        return !Double.isNaN(m4822J2) && ((double) ((int) m4822J2)) == m4822J2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: c1 */
    public final boolean mo4729c1() {
        double m4822J2 = m4822J2();
        return !Double.isNaN(m4822J2) && ((double) ((long) m4822J2)) == m4822J2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: e1 */
    public final boolean mo4808e1() {
        return !Double.isNaN(m4822J2());
    }

    @Override // p165u6.AbstractC2003u
    public final boolean equals(Object obj) {
        if (obj instanceof C1998p) {
            return mo4825O1((C1998p) obj);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        return r2 - r9.f9041e2;
     */
    @Override // p165u6.AbstractC2003u
    /* renamed from: f2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4733f2(p165u6.C1998p r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.f9041e2
            if (r0 >= r2) goto L29
            int r3 = r9.f9041e2
            if (r1 >= r3) goto L29
            int r2 = r8.f9040d2
            int r3 = r2 + r0
            byte[] r4 = r8.f9039c2
            r3 = r4[r3]
            int r5 = r9.f9040d2
            int r6 = r5 + r1
            byte[] r7 = r9.f9039c2
            r6 = r7[r6]
            if (r3 == r6) goto L24
            int r2 = r2 + r0
            r9 = r4[r2]
            int r5 = r5 + r1
            r0 = r7[r5]
            int r9 = r9 - r0
            return r9
        L24:
            int r0 = r0 + 1
            int r1 = r1 + 1
            goto L2
        L29:
            int r9 = r9.f9041e2
            int r2 = r2 - r9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p165u6.C1998p.mo4733f2(u6.p):int");
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: g2 */
    public final int mo4826g2(AbstractC2003u abstractC2003u) {
        return -abstractC2003u.mo4733f2(this);
    }

    public final int hashCode() {
        return this.f9042f2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: i2 */
    public final C1998p mo4735i2() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j0 */
    public final double mo4736j0() {
        double m4822J2 = m4822J2();
        if (!Double.isNaN(m4822J2)) {
            return m4822J2;
        }
        m4871S("number");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j1 */
    public final AbstractC2003u mo4793j1() {
        return C1993k.m4765C2(this.f9041e2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: j2 */
    public final AbstractC2003u mo4737j2(AbstractC2003u abstractC2003u) {
        double m4822J2 = m4822J2();
        return Double.isNaN(m4822J2) ? m4872T(AbstractC2003u.f9104F1, abstractC2003u) : abstractC2003u.mo4738k2(m4822J2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: k1 */
    public final int mo4794k1() {
        return this.f9041e2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: k2 */
    public final AbstractC2003u mo4738k2(double d7) {
        return C1990h.m4698E2(d7 - m4818C2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: l1 */
    public final boolean mo4739l1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4809f1() ? abstractC2003u.mo4733f2(this) > 0 : super.mo4739l1(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: m0 */
    public final int mo4740m0() {
        return (int) mo4736j0();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: m1 */
    public final boolean mo4741m1(double d7) {
        m4883v2("attempt to compare string with number");
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n0 */
    public final String mo4742n0() {
        return mo4645M();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: n2 */
    public final double mo4744n2() {
        double m4822J2 = m4822J2();
        if (Double.isNaN(m4822J2)) {
            return 0.0d;
        }
        return m4822J2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o0 */
    public final long mo4745o0() {
        return (long) mo4736j0();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o1 */
    public final boolean mo4746o1(AbstractC2003u abstractC2003u) {
        return abstractC2003u.mo4809f1() ? abstractC2003u.mo4733f2(this) >= 0 : super.mo4746o1(abstractC2003u);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: o2 */
    public final int mo4747o2() {
        return (int) mo4744n2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: p2 */
    public final long mo4748p2() {
        return (long) mo4744n2();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: q0 */
    public final AbstractC1997o mo4749q0() {
        return C1990h.m4698E2(mo4736j0());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: q2 */
    public final AbstractC2003u mo4750q2() {
        double m4822J2 = m4822J2();
        return Double.isNaN(m4822J2) ? AbstractC2003u.f9130m : C1990h.m4698E2(m4822J2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r0 */
    public final AbstractC1997o mo4810r0(String str) {
        double m4822J2 = m4822J2();
        if (!Double.isNaN(m4822J2)) {
            return C1990h.m4698E2(m4822J2);
        }
        AbstractC2003u.m4861I0(str);
        throw null;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r1 */
    public final AbstractC2003u mo4751r1(AbstractC2003u abstractC2003u) {
        double m4822J2 = m4822J2();
        return Double.isNaN(m4822J2) ? m4872T(AbstractC2003u.f9108J1, abstractC2003u) : abstractC2003u.mo4754s1(m4822J2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: r2 */
    public final AbstractC2003u mo4752r2() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: s0 */
    public final C1998p mo4753s0() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: s1 */
    public final AbstractC2003u mo4754s1(double d7) {
        return C1990h.m4697D2(d7, m4818C2());
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t1 */
    public final AbstractC2003u mo4755t1(double d7) {
        return C1990h.m4698E2(m4818C2() * d7);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: t2 */
    public final int mo4675t2() {
        return 4;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: u2 */
    public final String mo4676u2() {
        return "string";
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: v1 */
    public final AbstractC2003u mo4757v1(AbstractC2003u abstractC2003u) {
        double m4822J2 = m4822J2();
        return Double.isNaN(m4822J2) ? m4872T(AbstractC2003u.f9106H1, abstractC2003u) : abstractC2003u.mo4755t1(m4822J2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: w1 */
    public final AbstractC2003u mo4758w1() {
        double m4822J2 = m4822J2();
        return Double.isNaN(m4822J2) ? super.mo4758w1() : C1990h.m4698E2(-m4822J2);
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: z0 */
    public final C1979a mo4811z0(C1979a c1979a) {
        AbstractC2003u abstractC2003u = c1979a.f8941d;
        if (abstractC2003u == null || abstractC2003u.mo4809f1()) {
            c1979a.m4618e(this);
        } else {
            AbstractC2003u mo4807C0 = c1979a.f8941d.mo4807C0(this);
            c1979a.f8938a = C1979a.f8937e;
            c1979a.f8939b = 0;
            c1979a.f8940c = 0;
            c1979a.f8941d = mo4807C0;
        }
        return c1979a;
    }
}
