package p165u6;

import p047f5.C1175f;
import p180w6.C2135d;

/* renamed from: u6.g */
/* loaded from: classes.dex */
public final class C1989g extends AbstractC1992j {

    /* renamed from: h2 */
    public static final C1175f[] f9007h2 = new C1175f[0];

    /* renamed from: e2 */
    public final C2008z f9008e2;

    /* renamed from: f2 */
    public final C1175f[] f9009f2;

    /* renamed from: g2 */
    public final C1981b f9010g2;

    public C1989g(C2008z c2008z, C1981b c1981b, AbstractC2003u abstractC2003u) {
        super(abstractC2003u);
        this.f9008e2 = c2008z;
        C1982b0[] c1982b0Arr = c2008z.f9148f;
        if (c1982b0Arr == null || c1982b0Arr.length == 0) {
            this.f9009f2 = f9007h2;
        } else {
            C1175f[] c1175fArr = new C1175f[c1982b0Arr.length];
            this.f9009f2 = c1175fArr;
            c1175fArr[0] = new C1175f(new AbstractC2003u[]{abstractC2003u}, 0);
        }
        this.f9010g2 = c1981b;
    }

    /* renamed from: H2 */
    public static C1175f m4684H2(AbstractC2003u[] abstractC2003uArr, short s7, C1175f[] c1175fArr) {
        int length = c1175fArr.length;
        for (C1175f c1175f : c1175fArr) {
            if (c1175f != null && c1175f.f5759b == s7) {
                return c1175f;
            }
        }
        for (int i7 = 0; i7 < length; i7++) {
            if (c1175fArr[i7] == null) {
                C1175f c1175f2 = new C1175f(abstractC2003uArr, s7);
                c1175fArr[i7] = c1175f2;
                return c1175f2;
            }
        }
        AbstractC2003u.m4861I0("No space for upvalue");
        throw null;
    }

    /* renamed from: I2 */
    public static String m4685I2(C2008z c2008z, int i7) {
        if (i7 < 0) {
            return "'?'";
        }
        int i8 = c2008z.f9144b[i7];
        int i9 = (i8 >> 6) & 255;
        int i10 = i8 >>> 23;
        int i11 = (i8 >> 14) & 511;
        int i12 = i8 & 63;
        if (i12 != 18 && i12 != 22 && i12 != 25 && i12 != 26) {
            switch (i12) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    switch (i12) {
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                            break;
                        default:
                            return C2135d.m5179N2(c2008z, i7, i9).toString();
                    }
            }
        }
        return C2135d.m5179N2(c2008z, i7, i10).toString() + "," + C2135d.m5179N2(c2008z, i7, i11).toString();
    }

    @Override // p165u6.AbstractC1992j
    /* renamed from: E2 */
    public final String mo4686E2() {
        StringBuilder sb = new StringBuilder("<");
        C2008z c2008z = this.f9008e2;
        sb.append(c2008z.m4893b());
        sb.append(":");
        sb.append(c2008z.f9150h);
        sb.append(">");
        return sb.toString();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: G2 */
    public final p165u6.AbstractC1984c0 m4687G2(p165u6.AbstractC2003u[] r25, p165u6.AbstractC1984c0 r26) {
        /*
            Method dump skipped, instructions count: 3114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p165u6.C1989g.m4687G2(u6.u[], u6.c0):u6.c0");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* renamed from: J2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4688J2(p165u6.C1991i r9, p165u6.C2008z r10, int r11) {
        /*
            r8 = this;
            int r0 = r9.f9017c
            java.lang.String r1 = "?"
            r2 = -1
            r3 = 0
            u6.b r4 = r8.f9010g2
            if (r4 == 0) goto L39
            w6.d r5 = r4.f8950q2
            if (r5 == 0) goto L39
            w6.d$b r5 = r5.m5181J2()
            w6.d$a r5 = r5.m5194d(r0)
            if (r5 == 0) goto L3a
            u6.j r6 = r5.f9647a
            r6.getClass()
            boolean r6 = r6 instanceof p165u6.C1989g
            if (r6 == 0) goto L2e
            u6.j r6 = r5.f9647a
            u6.g r6 = r6.mo4694i0()
            u6.z r6 = r6.f9008e2
            java.lang.String r6 = r6.m4893b()
            goto L30
        L2e:
            java.lang.String r6 = "[Java]"
        L30:
            if (r6 == 0) goto L33
            goto L34
        L33:
            r6 = r1
        L34:
            int r7 = r5.m5186a()
            goto L3c
        L39:
            r5 = r3
        L3a:
            r6 = r1
            r7 = -1
        L3c:
            if (r5 != 0) goto L53
            u6.p r5 = r10.f9149g
            if (r5 == 0) goto L46
            java.lang.String r1 = r5.mo4645M()
        L46:
            int[] r10 = r10.f9146d
            if (r10 == 0) goto L51
            if (r11 < 0) goto L51
            int r5 = r10.length
            if (r11 >= r5) goto L51
            r2 = r10[r11]
        L51:
            r6 = r1
            r7 = r2
        L53:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r11 = ":"
            r10.append(r11)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            r9.f9018e = r10
            java.lang.String r10 = r9.getMessage()
            if (r4 != 0) goto L70
            goto Lae
        L70:
            u6.r r11 = r4.f8948o2
            u6.u r1 = r11.f9075f2
            if (r1 != 0) goto L9b
            w6.d r11 = r4.f8950q2
            if (r11 == 0) goto Lae
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = "\n"
            r11.append(r10)
            w6.d r10 = r4.f8950q2
            w6.d$b r1 = r10.m5181J2()
            u6.b r10 = r10.f9646g2
            java.lang.String r10 = r1.m5196g(r10, r0)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            goto Lae
        L9b:
            r11.f9075f2 = r3
            u6.p r10 = p165u6.C1998p.m4815M2(r10)     // Catch: java.lang.Throwable -> Laa
            u6.u r10 = r1.mo4691f0(r10)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r10 = r10.mo4645M()     // Catch: java.lang.Throwable -> Laa
            goto Lac
        Laa:
            java.lang.String r10 = "error in error handling"
        Lac:
            r11.f9075f2 = r1
        Lae:
            r9.f9020s = r10
            return
        Lb1:
            r9 = move-exception
            r11.f9075f2 = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p165u6.C1989g.m4688J2(u6.i, u6.z, int):void");
    }

    @Override // p165u6.AbstractC1992j, p165u6.AbstractC2003u, p165u6.AbstractC1984c0
    /* renamed from: M */
    public final String mo4645M() {
        return "function: " + this.f9008e2.toString();
    }

    @Override // p165u6.AbstractC1992j, p165u6.AbstractC2003u
    /* renamed from: M0 */
    public final AbstractC2003u mo4681M0() {
        return AbstractC1992j.f9021d2;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: W0 */
    public final AbstractC1984c0 mo4689W0(AbstractC1984c0 abstractC1984c0) {
        return mo4695z1(abstractC1984c0).mo4620F();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: d0 */
    public final AbstractC2003u mo4690d0() {
        C2008z c2008z = this.f9008e2;
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[c2008z.f9154l];
        for (int i7 = 0; i7 < c2008z.f9152j; i7++) {
            abstractC2003uArr[i7] = AbstractC2003u.f9130m;
        }
        return m4687G2(abstractC2003uArr, AbstractC2003u.f9124Y).mo4624u();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: f0 */
    public final AbstractC2003u mo4691f0(AbstractC2003u abstractC2003u) {
        int i7;
        C2008z c2008z = this.f9008e2;
        int i8 = c2008z.f9154l;
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[i8];
        System.arraycopy(AbstractC2003u.f9118T1, 0, abstractC2003uArr, 0, i8);
        int i9 = 1;
        while (true) {
            i7 = c2008z.f9152j;
            if (i9 >= i7) {
                break;
            }
            abstractC2003uArr[i9] = AbstractC2003u.f9130m;
            i9++;
        }
        if (i7 != 0) {
            abstractC2003uArr[0] = abstractC2003u;
            abstractC2003u = AbstractC2003u.f9124Y;
        }
        return m4687G2(abstractC2003uArr, abstractC2003u).mo4624u();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: g0 */
    public final AbstractC2003u mo4692g0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2) {
        int i7;
        AbstractC1984c0 m4867y2;
        AbstractC1984c0 abstractC1984c0;
        C2008z c2008z = this.f9008e2;
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[c2008z.f9154l];
        int i8 = 2;
        while (true) {
            i7 = c2008z.f9152j;
            if (i8 >= i7) {
                break;
            }
            abstractC2003uArr[i8] = AbstractC2003u.f9130m;
            i8++;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                abstractC2003uArr[0] = abstractC2003u;
                abstractC1984c0 = m4687G2(abstractC2003uArr, abstractC2003u2);
                return abstractC1984c0.mo4624u();
            }
            abstractC2003uArr[0] = abstractC2003u;
            abstractC2003uArr[1] = abstractC2003u2;
        } else if (c2008z.f9153k != 0) {
            m4867y2 = AbstractC2003u.m4867y2(abstractC2003u, abstractC2003u2);
            abstractC1984c0 = m4687G2(abstractC2003uArr, m4867y2);
            return abstractC1984c0.mo4624u();
        }
        m4867y2 = AbstractC2003u.f9124Y;
        abstractC1984c0 = m4687G2(abstractC2003uArr, m4867y2);
        return abstractC1984c0.mo4624u();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: h0 */
    public final AbstractC2003u mo4693h0(AbstractC2003u abstractC2003u, AbstractC2003u abstractC2003u2, AbstractC2003u abstractC2003u3) {
        int i7;
        AbstractC1984c0 m4866x2;
        AbstractC1984c0 abstractC1984c0;
        C2008z c2008z = this.f9008e2;
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[c2008z.f9154l];
        int i8 = 3;
        while (true) {
            i7 = c2008z.f9152j;
            if (i8 >= i7) {
                break;
            }
            abstractC2003uArr[i8] = AbstractC2003u.f9130m;
            i8++;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                abstractC2003uArr[0] = abstractC2003u;
                if (c2008z.f9153k != 0) {
                    m4866x2 = AbstractC2003u.m4867y2(abstractC2003u2, abstractC2003u3);
                    abstractC1984c0 = m4687G2(abstractC2003uArr, m4866x2);
                }
            } else if (i7 != 2) {
                abstractC2003uArr[0] = abstractC2003u;
                abstractC2003uArr[1] = abstractC2003u2;
                abstractC2003uArr[2] = abstractC2003u3;
            } else {
                abstractC2003uArr[0] = abstractC2003u;
                abstractC2003uArr[1] = abstractC2003u2;
                abstractC1984c0 = m4687G2(abstractC2003uArr, abstractC2003u3);
            }
            m4866x2 = AbstractC2003u.f9124Y;
            abstractC1984c0 = m4687G2(abstractC2003uArr, m4866x2);
        } else {
            if (c2008z.f9153k != 0) {
                m4866x2 = AbstractC2003u.m4866x2(abstractC2003u, abstractC2003u2, abstractC2003u3);
                abstractC1984c0 = m4687G2(abstractC2003uArr, m4866x2);
            }
            m4866x2 = AbstractC2003u.f9124Y;
            abstractC1984c0 = m4687G2(abstractC2003uArr, m4866x2);
        }
        return abstractC1984c0.mo4624u();
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: i0 */
    public final C1989g mo4694i0() {
        return this;
    }

    @Override // p165u6.AbstractC2003u
    /* renamed from: z1 */
    public final AbstractC1984c0 mo4695z1(AbstractC1984c0 abstractC1984c0) {
        int i7;
        C2008z c2008z = this.f9008e2;
        AbstractC2003u[] abstractC2003uArr = new AbstractC2003u[c2008z.f9154l];
        int i8 = 0;
        while (true) {
            i7 = c2008z.f9152j;
            if (i8 >= i7) {
                break;
            }
            int i9 = i8 + 1;
            abstractC2003uArr[i8] = abstractC1984c0.mo4623t(i9);
            i8 = i9;
        }
        return m4687G2(abstractC2003uArr, c2008z.f9153k != 0 ? abstractC1984c0.mo4622L(i7 + 1) : AbstractC2003u.f9124Y);
    }
}
