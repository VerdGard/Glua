package p180w6;

import p165u6.AbstractC1984c0;
import p165u6.AbstractC1997o;
import p165u6.AbstractC2003u;
import p165u6.C1990h;
import p165u6.C1993k;
import p165u6.C1998p;
import p165u6.C1999q;

/* renamed from: w6.b */
/* loaded from: classes.dex */
public final class C2133b extends AbstractC2149r {

    /* renamed from: w6.b$a */
    public static final class a extends AbstractC2149r {
        @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: g0 */
        public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
            int i7 = this.f9700e2;
            if (i7 == 0) {
                int mo4740m0 = abstractC2003u.mo4740m0();
                int mo4740m02 = abstractC2003u2.mo4740m0();
                return C2133b.m5173I2(mo4740m02 >= 0 ? mo4740m0 >> mo4740m02 : mo4740m0 << (-mo4740m02));
            }
            if (i7 == 1) {
                return C2133b.m5174J2(abstractC2003u.mo4740m0(), abstractC2003u2.mo4740m0());
            }
            C1993k c1993k = AbstractC2003u.f9126Z;
            if (i7 == 2) {
                int mo4740m03 = abstractC2003u.mo4740m0();
                int mo4740m04 = abstractC2003u2.mo4740m0();
                if (mo4740m04 >= 32 || mo4740m04 <= -32) {
                    return c1993k;
                }
                return C2133b.m5173I2(mo4740m04 >= 0 ? mo4740m03 << mo4740m04 : mo4740m03 >>> (-mo4740m04));
            }
            if (i7 == 3) {
                int mo4740m05 = abstractC2003u.mo4740m0();
                int mo4740m06 = abstractC2003u2.mo4740m0();
                if (mo4740m06 < 0) {
                    return C2133b.m5174J2(mo4740m05, -mo4740m06);
                }
                int i8 = mo4740m06 & 31;
                return C2133b.m5173I2((mo4740m05 << (32 - i8)) | (mo4740m05 >>> i8));
            }
            if (i7 != 4) {
                return AbstractC2003u.f9130m;
            }
            int mo4740m07 = abstractC2003u.mo4740m0();
            int mo4740m08 = abstractC2003u2.mo4740m0();
            if (mo4740m08 >= 32 || mo4740m08 <= -32) {
                return c1993k;
            }
            return C2133b.m5173I2(mo4740m08 >= 0 ? mo4740m07 >>> mo4740m08 : mo4740m07 << (-mo4740m08));
        }
    }

    /* renamed from: w6.b$b */
    public static final class b extends AbstractC2150s {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // p180w6.AbstractC2150s, p180w6.AbstractC2139h, p165u6.AbstractC2003u
        /* renamed from: W0 */
        public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
            int i7 = -1;
            int i8 = 1;
            switch (this.f9700e2) {
                case 0:
                    while (i8 <= abstractC1984c0.mo4621I()) {
                        i7 &= abstractC1984c0.m4648w(i8);
                        i8++;
                    }
                    return C2133b.m5173I2(i7);
                case 1:
                    return C2133b.m5173I2(~abstractC1984c0.m4648w(1));
                case 2:
                    while (i8 <= abstractC1984c0.mo4621I()) {
                        r7 |= abstractC1984c0.m4648w(i8);
                        i8++;
                    }
                    return C2133b.m5173I2(r7);
                case 3:
                    for (int i9 = 1; i9 <= abstractC1984c0.mo4621I(); i9++) {
                        i7 &= abstractC1984c0.m4648w(i9);
                    }
                    return (i7 != 0 ? 1 : 0) != 0 ? AbstractC2003u.f9131s : AbstractC2003u.f9122X;
                case 4:
                    while (i8 <= abstractC1984c0.mo4621I()) {
                        r7 ^= abstractC1984c0.m4648w(i8);
                        i8++;
                    }
                    return C2133b.m5173I2(r7);
                case 5:
                    int m4648w = abstractC1984c0.m4648w(1);
                    int m4648w2 = abstractC1984c0.m4648w(2);
                    int m4643J = abstractC1984c0.m4643J(3, 1);
                    if (m4648w2 < 0) {
                        AbstractC2003u.m4863R(2, "field cannot be negative");
                        throw null;
                    }
                    if (m4643J < 0) {
                        AbstractC2003u.m4863R(3, "width must be postive");
                        throw null;
                    }
                    if (m4648w2 + m4643J <= 32) {
                        return C2133b.m5173I2(((-1) >>> (32 - m4643J)) & (m4648w >>> m4648w2));
                    }
                    AbstractC2003u.m4861I0("trying to access non-existent bits");
                    throw null;
                case 6:
                    int m4648w3 = abstractC1984c0.m4648w(1);
                    int m4648w4 = abstractC1984c0.m4648w(2);
                    int m4648w5 = abstractC1984c0.m4648w(3);
                    int m4643J2 = abstractC1984c0.m4643J(4, 1);
                    if (m4648w5 < 0) {
                        AbstractC2003u.m4863R(3, "field cannot be negative");
                        throw null;
                    }
                    if (m4643J2 < 0) {
                        AbstractC2003u.m4863R(4, "width must be postive");
                        throw null;
                    }
                    if (m4648w5 + m4643J2 <= 32) {
                        int i10 = ((-1) >>> (32 - m4643J2)) << m4648w5;
                        return C2133b.m5173I2((i10 & (m4648w4 << m4648w5)) | (m4648w3 & (~i10)));
                    }
                    AbstractC2003u.m4861I0("trying to access non-existent bits");
                    throw null;
                default:
                    return AbstractC2003u.f9130m;
            }
        }
    }

    /* renamed from: I2 */
    public static AbstractC1997o m5173I2(int i7) {
        return i7 < 0 ? C1990h.m4698E2(i7 & 4294967295L) : C1993k.m4765C2(i7);
    }

    /* renamed from: J2 */
    public static AbstractC2003u m5174J2(int i7, int i8) {
        if (i8 >= 0) {
            int i9 = i8 & 31;
            return m5173I2((i7 >>> (32 - i9)) | (i7 << i9));
        }
        int i10 = -i8;
        if (i10 < 0) {
            return m5174J2(i7, -i10);
        }
        int i11 = i10 & 31;
        return m5173I2((i7 << (32 - i11)) | (i7 >>> i11));
    }

    @Override // p180w6.AbstractC2149r, p180w6.AbstractC2139h, p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        C1999q c1999q = new C1999q();
        AbstractC2139h.m5232G2(c1999q, b.class, new String[]{"band", "bnot", "bor", "btest", "bxor", "extract", "replace"}, 0);
        AbstractC2139h.m5232G2(c1999q, a.class, new String[]{"arshift", "lrotate", "lshift", "rrotate", "rshift"}, 0);
        abstractC2003u2.getClass();
        abstractC2003u2.mo4790Y1(C1998p.m4815M2("bit32"), c1999q);
        if (!abstractC2003u2.mo4777L0(C1998p.m4815M2("package")).mo4804d1()) {
            AbstractC2003u mo4777L0 = abstractC2003u2.mo4777L0(C1998p.m4815M2("package"));
            mo4777L0.getClass();
            AbstractC2003u mo4777L02 = mo4777L0.mo4777L0(C1998p.m4815M2("loaded"));
            mo4777L02.getClass();
            mo4777L02.mo4790Y1(C1998p.m4815M2("bit32"), c1999q);
        }
        return c1999q;
    }
}
