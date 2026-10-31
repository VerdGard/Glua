package p165u6;

import java.io.PrintStream;
import p002a1.C0017d;

/* renamed from: u6.y */
/* loaded from: classes.dex */
public final class C2007y extends C1987e {

    /* renamed from: c */
    public static PrintStream f9140c = System.out;

    /* renamed from: b */
    public static final String[] f9139b = {"MOVE", "LOADK", "LOADKX", "LOADBOOL", "LOADNIL", "GETUPVAL", "GETTABUP", "GETTABLE", "SETTABUP", "SETUPVAL", "SETTABLE", "NEWTABLE", "SELF", "ADD", "SUB", "MUL", "DIV", "MOD", "POW", "UNM", "NOT", "LEN", "CONCAT", "JMP", "EQ", "LT", "LE", "TEST", "TESTSET", "CALL", "TAILCALL", "RETURN", "FORLOOP", "FORPREP", "TFORCALL", "TFORLOOP", "SETLIST", "CLOSURE", "VARARG", "EXTRAARG", "IDIV", "BNOT", "BAND", "BOR", "BXOR", "SHL", "SHR", null};

    /* renamed from: d */
    public static StringBuilder m4887d(StringBuilder sb, String str) {
        if (sb == null) {
            sb = new StringBuilder(str.length() + 2);
        }
        sb.append("; ");
        sb.append(str);
        return sb;
    }

    /* renamed from: e */
    public static StringBuilder m4888e(StringBuilder sb, int i7, int i8) {
        if (i8 < i7) {
            return sb;
        }
        return m4887d(sb, "upvalue u" + i8 + " out of upvalues list (" + i7 + " upvalues for this func)");
    }

    /* renamed from: f */
    public static StringBuilder m4889f(StringBuilder sb, int i7, int i8) {
        String str;
        if (i8 < 0) {
            str = "impossible (negative) variable v" + i8;
        } else {
            if (i8 < i7) {
                return sb;
            }
            str = "variable v" + i8 + " out of stack (.maxstacksize = " + i7 + " for this func)";
        }
        return m4887d(sb, str);
    }

    /* renamed from: g */
    public static void m4890g(StringBuilder sb, C2008z c2008z, int i7) {
        int i8;
        int i9;
        String str;
        String mo4645M;
        AbstractC2003u[] abstractC2003uArr = c2008z.f9143a;
        if (i7 >= abstractC2003uArr.length) {
            sb.append("CONST[");
            sb.append(i7);
            sb.append("]");
            return;
        }
        AbstractC2003u abstractC2003u = abstractC2003uArr[i7];
        if (abstractC2003u == null) {
            mo4645M = "null";
        } else {
            if (abstractC2003u instanceof C1995m) {
                sb.append(abstractC2003u.mo4745o0());
                return;
            }
            if (abstractC2003u instanceof C1990h) {
                String d7 = Double.toString(abstractC2003u.mo4736j0());
                sb.append(d7);
                if (d7.indexOf(46) >= 0) {
                    return;
                } else {
                    mo4645M = ".0";
                }
            } else {
                if (abstractC2003u.mo4675t2() == 4) {
                    C1998p c1998p = (C1998p) abstractC2003u;
                    sb.append('\"');
                    char[] cArr = C0017d.f34v;
                    boolean m4819G2 = c1998p.m4819G2();
                    byte[] bArr = null;
                    if (m4819G2) {
                        String mo4645M2 = c1998p.mo4645M();
                        i8 = mo4645M2.length();
                        str = mo4645M2;
                        i9 = 0;
                    } else {
                        byte[] bArr2 = c1998p.f9039c2;
                        i8 = c1998p.f9041e2;
                        i9 = c1998p.f9040d2;
                        str = null;
                        bArr = bArr2;
                    }
                    for (int i10 = 0; i10 < i8; i10++) {
                        char charAt = m4819G2 ? str.charAt(i10) : (char) bArr[i9 + i10];
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\\') {
                            if (charAt != '\"' && charAt != '\\') {
                                switch (charAt) {
                                    case 7:
                                        sb.append('\\');
                                        charAt = 'a';
                                        break;
                                    case '\b':
                                        sb.append('\\');
                                        charAt = 'b';
                                        break;
                                    case '\t':
                                        sb.append('\\');
                                        charAt = 't';
                                        break;
                                    case '\n':
                                        sb.append('\\');
                                        charAt = 'n';
                                        break;
                                    case 11:
                                        sb.append('\\');
                                        charAt = 'v';
                                        break;
                                    case '\f':
                                        sb.append('\\');
                                        charAt = 'f';
                                        break;
                                    case '\r':
                                        sb.append('\\');
                                        charAt = 'r';
                                        break;
                                    default:
                                        if (!m4819G2 || charAt < ' ') {
                                            sb.append("\\x");
                                            sb.append(cArr[(charAt & 240) >> 4]);
                                            charAt = cArr[charAt & 15];
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            } else {
                                sb.append('\\');
                            }
                        }
                        sb.append(charAt);
                    }
                    sb.append('\"');
                    return;
                }
                mo4645M = abstractC2003u.mo4645M();
            }
        }
        sb.append(mo4645M);
    }

    /* renamed from: h */
    public static void m4891h(C2008z c2008z, int i7) {
        StringBuilder sb;
        int i8;
        int i9;
        int i10;
        int i11;
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        int i12 = c2008z.f9154l;
        int length = c2008z.f9148f.length;
        int[] iArr = c2008z.f9144b;
        int i13 = iArr[i7];
        int i14 = (i13 >> 0) & 63;
        if (i14 >= 47 || i14 == 39) {
            sb2.append("OP[");
            sb2.append(i14);
            sb2.append("] 0x");
            sb2.append(Integer.toHexString(i13));
            sb = null;
        } else {
            int i15 = (i13 >> 6) & 255;
            int i16 = (i13 >> 23) & 511;
            int i17 = (i13 >> 14) & 511;
            int m4677a = C1987e.m4677a(i13);
            int m4678b = C1987e.m4678b(i13);
            if (i14 == 2) {
                i9 = i7 + 1;
                if (i9 >= iArr.length) {
                    i9 = i7;
                    i8 = 1;
                    m4677a = Integer.MAX_VALUE;
                } else {
                    int i18 = iArr[i9];
                    if (((i18 >> 0) & 63) != 39) {
                        i9 = i7;
                        i8 = 1;
                        m4677a = 2147483646;
                    } else {
                        m4677a = 67108863 & (i18 >> 6);
                        i8 = 1;
                    }
                }
            } else {
                i8 = i14;
                i9 = i7;
            }
            if (i8 == 33) {
                StringBuilder sb3 = null;
                for (int i19 = 1; i19 <= 3; i19++) {
                    sb3 = m4889f(sb3, i12, i15 + i19);
                }
                sb = sb3;
            } else {
                sb = null;
            }
            sb2.append(f9139b[i8]);
            sb2.append(' ');
            int[] iArr2 = C1987e.f9002a;
            int i20 = iArr2[i8] & 3;
            if (i20 != 0) {
                if (i20 == 1) {
                    sb2.append('v');
                    sb = m4889f(sb, i12, i15);
                    sb2.append(i15);
                    if (((iArr2[i8] >> 4) & 3) == 3) {
                        sb2.append(' ');
                        if (m4677a != Integer.MAX_VALUE) {
                            str2 = m4677a == 2147483646 ? "Next OP after LOADKX not EXTRAARG" : "No OP after LOADKX";
                            m4890g(sb2, c2008z, m4677a);
                        }
                        m4677a = 262143;
                        sb = m4887d(sb, str2);
                        m4890g(sb2, c2008z, m4677a);
                    } else {
                        sb2.append(' ');
                        sb2.append(m4677a);
                    }
                } else if (i20 == 2) {
                    if (i8 != 23 || i15 != 0) {
                        sb2.append('v');
                        int i21 = i8 == 23 ? i15 - 1 : i15;
                        sb2.append(i21);
                        sb = m4889f(sb, i12, i21);
                        sb2.append(' ');
                    }
                    int i22 = i9 + m4678b + 1;
                    if (i22 < 0 || i22 > iArr.length) {
                        sb2.append("GOTO[");
                        sb2.append(m4678b);
                        sb2.append("]");
                    } else {
                        sb2.append(":goto_");
                        sb2.append(i22);
                    }
                    sb2.append("  ; ");
                    if (m4678b >= 0) {
                        sb2.append('+');
                    }
                    sb2.append(m4678b);
                    sb2.append(' ');
                    sb2.append(m4678b >= 0 ? (char) 8595 : (char) 8593);
                }
            } else if (i8 == 31 && i16 == 1) {
                sb = m4889f(sb, i12, i15);
            } else {
                if (i8 != 24 && i8 != 25 && i8 != 26) {
                    if (i8 == 8) {
                        sb2.append('u');
                        sb = m4888e(sb, length, i15);
                    } else {
                        sb2.append('v');
                        sb = m4889f(sb, i12, i15);
                    }
                }
                sb2.append(i15);
                if (i8 != 4) {
                    if (i8 == 34) {
                        sb2.append("..v");
                        i11 = i17 + i15 + 2;
                    } else if (i8 != 36) {
                        if (i8 != 38) {
                            switch (i8) {
                                case 29:
                                case 30:
                                    break;
                                case 31:
                                    if (i16 >= 2) {
                                        sb2.append("..v");
                                        i10 = (i16 + i15) - 2;
                                        break;
                                    }
                                    break;
                                default:
                                    int i23 = (iArr2[i8] >> 4) & 3;
                                    if (i23 != 0) {
                                        sb2.append(' ');
                                        if (i23 == 3 && C1987e.m4679c(i16)) {
                                            m4890g(sb2, c2008z, i16 & (-257));
                                        } else {
                                            if (i8 != 3 && i8 != 11) {
                                                if (i23 == 1) {
                                                    sb2.append('u');
                                                    sb = m4888e(sb, length, i16);
                                                } else {
                                                    sb2.append('v');
                                                    sb = m4889f(sb, i12, i16);
                                                }
                                            }
                                            sb2.append(i16);
                                        }
                                    }
                                    if (i8 == 3) {
                                        if (i17 != 0) {
                                            str = " SKIP_NEXT";
                                            sb2.append(str);
                                            break;
                                        }
                                    } else {
                                        int i24 = (iArr2[i8] >> 2) & 3;
                                        if (i24 != 0) {
                                            sb2.append(i8 == 22 ? ".." : " ");
                                            if (i24 == 3 && C1987e.m4679c(i17)) {
                                                m4890g(sb2, c2008z, i17 & (-257));
                                            } else {
                                                if (i24 != 1) {
                                                    sb2.append('v');
                                                    sb = m4889f(sb, i12, i17);
                                                }
                                                sb2.append(i17);
                                            }
                                        }
                                        if (i8 == 38 && c2008z.f9153k == 0) {
                                            sb = m4887d(sb, "func not vararg");
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                        if (i16 != 0) {
                            sb2.append("..v");
                            int i25 = (i16 + i15) - 1;
                            sb2.append(i25);
                            sb = m4889f(sb, i12, i25);
                        }
                        if (i8 == 29) {
                            if (i17 == 0) {
                                str = " SET_TOP";
                                sb2.append(str);
                            } else if (i17 > 1) {
                                sb2.append(" v");
                                sb2.append(i15);
                                sb2.append("..v");
                                i11 = (i17 + i15) - 2;
                            }
                        }
                    } else {
                        if (i16 != 0) {
                            sb2.append("..v");
                            int i26 = i16 + i15;
                            sb2.append(i26);
                            sb = m4889f(sb, i12, i26);
                        }
                        sb2.append(' ');
                        if (i17 == 0) {
                            if (i9 >= iArr.length) {
                                sb = m4887d(sb, "no OP after SETLIST with c = 0");
                            } else {
                                int i27 = iArr[i9 + 1];
                                StringBuilder m4887d = m4887d(sb, "c stored in next OP (as " + i27 + ")");
                                if (i27 > 0) {
                                    i17 = i27;
                                }
                                sb = m4887d;
                            }
                        }
                        sb2.append(i17);
                    }
                    sb2.append(i11);
                    sb = m4889f(sb, i12, i11);
                } else {
                    sb2.append("..v");
                    i10 = i16 + i15;
                }
                sb2.append(i10);
                sb = m4889f(sb, i12, i10);
            }
            if (i8 == 32) {
                for (int i28 = 1; i28 <= 3; i28++) {
                    sb = m4889f(sb, i12, i15 + i28);
                }
            }
            if (i8 == 35) {
                for (int i29 = -2; i29 <= 1; i29++) {
                    if (i29 != 0) {
                        sb = m4889f(sb, i12, i15 + i29);
                    }
                }
            }
        }
        if (sb != null) {
            sb2.append("  ");
            sb2.append((CharSequence) sb);
        }
        f9140c.print(sb2.toString());
    }
}
